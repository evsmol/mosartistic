package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

class OSNotificationDataController extends OSBackgroundManager {
    /* access modifiers changed from: private */
    public final OneSignalDbHelper dbHelper;
    /* access modifiers changed from: private */
    public final OSLogger logger;

    interface InvalidOrDuplicateNotificationCallback {
        void onResult(boolean z);
    }

    public OSNotificationDataController(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
    }

    /* access modifiers changed from: package-private */
    public void cleanOldCachedData() {
        cleanNotificationCache();
    }

    private void cleanNotificationCache() {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                OSNotificationDataController.this.dbHelper.delete("notification", "created_time < ?", new String[]{String.valueOf((OneSignal.getTime().getCurrentTimeMillis() / 1000) - 604800)});
            }
        }, "OS_NOTIFICATIONS_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void removeNotification(final int i, final WeakReference<Context> weakReference) {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                Context context = (Context) weakReference.get();
                if (context != null) {
                    String str = "android_notification_id = " + i + " AND " + "opened" + " = 0 AND " + "dismissed" + " = 0";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", 1);
                    if (OSNotificationDataController.this.dbHelper.update("notification", contentValues, str, (String[]) null) > 0) {
                        NotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(context, OSNotificationDataController.this.dbHelper, i);
                    }
                    BadgeCountUpdater.update(OSNotificationDataController.this.dbHelper, context);
                    OneSignalNotificationManager.getNotificationManager(context).cancel(i);
                }
            }
        }, "OS_NOTIFICATIONS_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void notValidOrDuplicated(JSONObject jSONObject, InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        String oSNotificationIdFromJson = OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            this.logger.debug("Notification notValidOrDuplicated with id null");
            invalidOrDuplicateNotificationCallback.onResult(true);
            return;
        }
        isDuplicateNotification(oSNotificationIdFromJson, invalidOrDuplicateNotificationCallback);
    }

    private void isDuplicateNotification(final String str, final InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (str == null || "".equals(str)) {
            invalidOrDuplicateNotificationCallback.onResult(false);
        } else if (!OSNotificationWorkManager.addNotificationIdProcessed(str)) {
            this.logger.debug("Notification notValidOrDuplicated with id duplicated");
            invalidOrDuplicateNotificationCallback.onResult(true);
        } else {
            runRunnableOnThread(new BackgroundRunnable() {
                public void run() {
                    super.run();
                    boolean z = true;
                    String[] strArr = {str};
                    Cursor query = OSNotificationDataController.this.dbHelper.query("notification", new String[]{"notification_id"}, "notification_id = ?", strArr, (String) null, (String) null, (String) null);
                    boolean moveToFirst = query.moveToFirst();
                    query.close();
                    if (moveToFirst) {
                        OSLogger access$100 = OSNotificationDataController.this.logger;
                        access$100.debug("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + str);
                    } else {
                        z = false;
                    }
                    invalidOrDuplicateNotificationCallback.onResult(z);
                }
            }, "OS_NOTIFICATIONS_THREAD");
        }
    }
}
