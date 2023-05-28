package com.onesignal;

import com.onesignal.OneSignal;

public class OSNotificationReceivedEvent {
    private final OSNotificationController controller;
    private boolean isComplete = false;
    private final OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    OSNotificationReceivedEvent(OSNotificationController oSNotificationController, OSNotification oSNotification) {
        this.notification = oSNotification;
        this.controller = oSNotificationController;
        this.timeoutHandler = OSTimeoutHandler.getTimeoutHandler();
        C50461 r3 = new Runnable() {
            public void run() {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
                OSNotificationReceivedEvent oSNotificationReceivedEvent = OSNotificationReceivedEvent.this;
                oSNotificationReceivedEvent.complete(oSNotificationReceivedEvent.getNotification());
            }
        };
        this.timeoutRunnable = r3;
        this.timeoutHandler.startTimeout(25000, r3);
    }

    public synchronized void complete(final OSNotification oSNotification) {
        this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
        if (this.isComplete) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.isComplete = true;
        if (isRunningOnMainThread()) {
            new Thread(new Runnable() {
                public void run() {
                    OSNotificationReceivedEvent.this.processNotification(oSNotification);
                }
            }, "OS_COMPLETE_NOTIFICATION").start();
        } else {
            processNotification(oSNotification);
        }
    }

    /* access modifiers changed from: private */
    public void processNotification(OSNotification oSNotification) {
        this.controller.processNotification(this.notification.copy(), oSNotification != null ? oSNotification.copy() : null);
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.isComplete + ", notification=" + this.notification + '}';
    }

    static boolean isRunningOnMainThread() {
        return OSUtils.isRunningOnMainThread();
    }
}
