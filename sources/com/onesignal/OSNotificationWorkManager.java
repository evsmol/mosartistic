package com.onesignal;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationWorkManager {
    private static Set<String> notificationIds = OSUtils.newConcurrentSet();

    static boolean addNotificationIdProcessed(String str) {
        if (!OSUtils.isStringNotEmpty(str)) {
            return true;
        }
        if (notificationIds.contains(str)) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
            return false;
        }
        notificationIds.add(str);
        return true;
    }

    static void removeNotificationIdProcessed(String str) {
        if (OSUtils.isStringNotEmpty(str)) {
            notificationIds.remove(str);
        }
    }

    static void beginEnqueueingWork(Context context, String str, int i, String str2, long j, boolean z, boolean z2) {
        Data build = new Data.Builder().putInt("android_notif_id", i).putString("json_payload", str2).putLong("timestamp", j).putBoolean("is_restoring", z).build();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(NotificationWorker.class).setInputData(build)).build());
    }

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public ListenableWorker.Result doWork() {
            Data inputData = getInputData();
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.onesignalLog(log_level, "NotificationWorker running doWork with data: " + inputData);
                int i = inputData.getInt("android_notif_id", 0);
                JSONObject jSONObject = new JSONObject(inputData.getString("json_payload"));
                long j = inputData.getLong("timestamp", System.currentTimeMillis() / 1000);
                boolean z = inputData.getBoolean("is_restoring", false);
                processNotificationData(getApplicationContext(), i, jSONObject, z, Long.valueOf(j));
                return ListenableWorker.Result.success();
            } catch (JSONException e) {
                OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.onesignalLog(log_level2, "Error occurred doing work for job with id: " + getId().toString());
                e.printStackTrace();
                return ListenableWorker.Result.failure();
            }
        }

        private void processNotificationData(Context context, int i, JSONObject jSONObject, boolean z, Long l) {
            OSNotification oSNotification = new OSNotification((List<OSNotification>) null, jSONObject, i);
            OSNotificationReceivedEvent oSNotificationReceivedEvent = new OSNotificationReceivedEvent(new OSNotificationController(context, oSNotification, jSONObject, z, true, l), oSNotification);
            if (OneSignal.remoteNotificationReceivedHandler != null) {
                try {
                    OneSignal.remoteNotificationReceivedHandler.remoteNotificationReceived(context, oSNotificationReceivedEvent);
                } catch (Throwable th) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    oSNotificationReceivedEvent.complete(oSNotification);
                    throw th;
                }
            } else {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
                oSNotificationReceivedEvent.complete(oSNotification);
            }
        }
    }
}
