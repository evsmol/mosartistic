package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

public class CommandHandler implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("CommandHandler");
    private final Context mContext;
    private final Object mLock = new Object();
    private final Map<String, ExecutionListener> mPendingDelayMet = new HashMap();

    static Intent createScheduleWorkIntent(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent createDelayMetIntent(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent createStopWorkIntent(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent createConstraintsChangedIntent(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent createRescheduleIntent(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent createExecutionCompletedIntent(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    CommandHandler(Context context) {
        this.mContext = context;
    }

    public void onExecuted(String str, boolean z) {
        synchronized (this.mLock) {
            ExecutionListener remove = this.mPendingDelayMet.remove(str);
            if (remove != null) {
                remove.onExecuted(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasPendingCommands() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mPendingDelayMet.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void onHandleIntent(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            handleConstraintsChanged(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            handleReschedule(intent, i, systemAlarmDispatcher);
        } else if (!hasKeys(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            Logger.get().error(TAG, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            handleScheduleWorkIntent(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            handleDelayMet(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            handleStopWork(intent, systemAlarmDispatcher);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            handleExecutionCompleted(intent, i);
        } else {
            Logger.get().warning(TAG, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }

    private void handleScheduleWorkIntent(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger.get().debug(TAG, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase workDatabase = systemAlarmDispatcher.getWorkManager().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(string);
            if (workSpec == null) {
                Logger logger = Logger.get();
                String str = TAG;
                logger.warning(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (workSpec.state.isFinished()) {
                Logger logger2 = Logger.get();
                String str2 = TAG;
                logger2.warning(str2, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                workDatabase.endTransaction();
            } else {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                if (!workSpec.hasConstraints()) {
                    Logger.get().debug(TAG, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(calculateNextRunTime)}), new Throwable[0]);
                    Alarms.setAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string, calculateNextRunTime);
                } else {
                    Logger.get().debug(TAG, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(calculateNextRunTime)}), new Throwable[0]);
                    Alarms.setAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string, calculateNextRunTime);
                    systemAlarmDispatcher.postOnMainThread(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, createConstraintsChangedIntent(this.mContext), i));
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    private void handleDelayMet(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.mLock) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            Logger.get().debug(TAG, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.mPendingDelayMet.containsKey(string)) {
                DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.mContext, i, string, systemAlarmDispatcher);
                this.mPendingDelayMet.put(string, delayMetCommandHandler);
                delayMetCommandHandler.handleProcessWork();
            } else {
                Logger.get().debug(TAG, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void handleStopWork(Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger.get().debug(TAG, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        systemAlarmDispatcher.getWorkManager().stopWork(string);
        Alarms.cancelAlarm(this.mContext, systemAlarmDispatcher.getWorkManager(), string);
        systemAlarmDispatcher.onExecuted(string, false);
    }

    private void handleConstraintsChanged(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.get().debug(TAG, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new ConstraintsCommandHandler(this.mContext, i, systemAlarmDispatcher).handleConstraintsChanged();
    }

    private void handleReschedule(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.get().debug(TAG, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        systemAlarmDispatcher.getWorkManager().rescheduleEligibleWork();
    }

    private void handleExecutionCompleted(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        Logger.get().debug(TAG, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        onExecuted(string, z);
    }

    private static boolean hasKeys(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
