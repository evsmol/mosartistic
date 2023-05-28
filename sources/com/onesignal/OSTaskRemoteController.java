package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

class OSTaskRemoteController extends OSTaskController {
    static final HashSet<String> METHODS_AVAILABLE_FOR_DELAY = new HashSet<>(Arrays.asList(new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));
    private final OSRemoteParamController paramController;

    OSTaskRemoteController(OSRemoteParamController oSRemoteParamController, OSLogger oSLogger) {
        super(oSLogger);
        this.paramController = oSRemoteParamController;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldQueueTaskForInit(String str) {
        return !this.paramController.isRemoteParamsCallDone() && METHODS_AVAILABLE_FOR_DELAY.contains(str);
    }
}
