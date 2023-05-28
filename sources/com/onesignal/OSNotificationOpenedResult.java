package com.onesignal;

import com.onesignal.OneSignal;

public class OSNotificationOpenedResult implements OneSignal.EntryStateListener {
    private OSNotificationAction action;
    private boolean isComplete = false;
    private OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    public OSNotificationOpenedResult(OSNotification oSNotification, OSNotificationAction oSNotificationAction) {
        this.notification = oSNotification;
        this.action = oSNotificationAction;
        this.timeoutHandler = OSTimeoutHandler.getTimeoutHandler();
        C50451 r3 = new Runnable() {
            public void run() {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
                OSNotificationOpenedResult.this.complete(false);
            }
        };
        this.timeoutRunnable = r3;
        this.timeoutHandler.startTimeout(5000, r3);
    }

    /* access modifiers changed from: private */
    public void complete(boolean z) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "OSNotificationOpenedResult complete called with opened: " + z);
        this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
        if (this.isComplete) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationOpenedResult already completed");
            return;
        }
        this.isComplete = true;
        if (z) {
            OneSignal.applicationOpenedByNotification(this.notification.getNotificationId());
        }
        OneSignal.removeEntryStateListener(this);
    }

    public void onEntryStateChange(OneSignal.AppEntryAction appEntryAction) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + appEntryAction);
        complete(OneSignal.AppEntryAction.APP_CLOSE.equals(appEntryAction));
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.notification + ", action=" + this.action + ", isComplete=" + this.isComplete + '}';
    }
}
