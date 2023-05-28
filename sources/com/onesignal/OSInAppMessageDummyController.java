package com.onesignal;

import com.onesignal.language.LanguageContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageDummyController extends OSInAppMessageController {
    /* access modifiers changed from: package-private */
    public void cleanCachedInAppMessages() {
    }

    /* access modifiers changed from: package-private */
    public void displayPreviewMessage(String str) {
    }

    public void initRedisplayData() {
    }

    /* access modifiers changed from: package-private */
    public void initWithCachedInAppMessages() {
    }

    /* access modifiers changed from: package-private */
    public boolean isInAppMessageShowing() {
        return false;
    }

    public void messageTriggerConditionChanged() {
    }

    public void messageWasDismissed(OSInAppMessageInternal oSInAppMessageInternal) {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnMessage(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnPreview(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public void receivedInAppMessageJson(JSONArray jSONArray) throws JSONException {
    }

    OSInAppMessageDummyController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        super(oneSignalDbHelper, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
    }
}
