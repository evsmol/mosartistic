package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSecondaryChannelSynchronizer extends UserStateSynchronizer {
    /* access modifiers changed from: package-private */
    public abstract void fireUpdateFailure();

    /* access modifiers changed from: package-private */
    public abstract void fireUpdateSuccess(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract String getAuthHashKey();

    /* access modifiers changed from: protected */
    public abstract String getChannelKey();

    /* access modifiers changed from: protected */
    public abstract int getDeviceType();

    /* access modifiers changed from: protected */
    public abstract String getId();

    /* access modifiers changed from: package-private */
    public UserStateSynchronizer.GetTagsResult getTags(boolean z) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract UserState newUserState(String str, boolean z);

    /* access modifiers changed from: package-private */
    public abstract void updateIdDependents(String str);

    /* access modifiers changed from: package-private */
    public void updateState(JSONObject jSONObject) {
    }

    UserStateSecondaryChannelSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    /* access modifiers changed from: protected */
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    /* access modifiers changed from: package-private */
    public void refresh() {
        scheduleSyncToServer();
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncToServer() {
        if (!(getId() == null && getRegistrationId() == null) && OneSignal.getUserId() != null) {
            getNetworkHandlerThread(0).runNewJobDelayed();
        }
    }

    /* access modifiers changed from: protected */
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", getDeviceType());
            jSONObject.putOpt("device_player_id", OneSignal.getUserId());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            fireUpdateFailure();
        }
    }

    /* access modifiers changed from: protected */
    public void onSuccessfulSync(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(getChannelKey(), jSONObject.get("identifier"));
                if (jSONObject.has(getAuthHashKey())) {
                    jSONObject2.put(getAuthHashKey(), jSONObject.get(getAuthHashKey()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            fireUpdateSuccess(jSONObject2);
        }
    }
}
