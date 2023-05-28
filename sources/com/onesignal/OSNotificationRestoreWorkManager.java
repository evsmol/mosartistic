package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class OSNotificationRestoreWorkManager {
    static final String[] COLUMNS_FOR_RESTORE = {"notification_id", "android_notification_id", "full_data", "created_time"};
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    public static boolean restored;

    public static void beginEnqueueingWork(Context context, boolean z) {
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay((long) (z ? 15 : 0), TimeUnit.SECONDS)).build());
    }

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public ListenableWorker.Result doWork() {
            Context applicationContext = getApplicationContext();
            if (OneSignal.appContext == null) {
                OneSignal.initWithContext(applicationContext);
            }
            if (!OSUtils.areNotificationsEnabled(applicationContext)) {
                return ListenableWorker.Result.failure();
            }
            if (OSNotificationRestoreWorkManager.restored) {
                return ListenableWorker.Result.failure();
            }
            OSNotificationRestoreWorkManager.restored = true;
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Restoring notifications");
            OneSignalDbHelper instance = OneSignalDbHelper.getInstance(applicationContext);
            StringBuilder recentUninteractedWithNotificationsWhere = OneSignalDbHelper.recentUninteractedWithNotificationsWhere();
            OSNotificationRestoreWorkManager.skipVisibleNotifications(applicationContext, recentUninteractedWithNotificationsWhere);
            OSNotificationRestoreWorkManager.queryAndRestoreNotificationsAndBadgeCount(applicationContext, instance, recentUninteractedWithNotificationsWhere);
            return ListenableWorker.Result.success();
        }
    }

    /* access modifiers changed from: private */
    public static void queryAndRestoreNotificationsAndBadgeCount(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder sb) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursor = null;
        try {
            cursor = oneSignalDbHelper.query("notification", COLUMNS_FOR_RESTORE, sb.toString(), (String[]) null, (String) null, (String) null, "_id DESC", NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
            showNotificationsFromCursor(context, cursor, 200);
            BadgeCountUpdater.update(oneSignalDbHelper, context);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* access modifiers changed from: private */
    public static void skipVisibleNotifications(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] activeNotifications = OneSignalNotificationManager.getActiveNotifications(context);
            if (activeNotifications.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id : activeNotifications) {
                    arrayList.add(Integer.valueOf(id.getId()));
                }
                sb.append(" AND android_notification_id NOT IN (");
                sb.append(TextUtils.join(",", arrayList));
                sb.append(")");
            }
        }
    }

    static void showNotificationsFromCursor(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.beginEnqueueingWork(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i > 0) {
                    OSUtils.sleep(i);
                }
            } while (cursor.moveToNext());
        }
    }
}
