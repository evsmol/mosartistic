package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.Scopes;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateSynchronizer;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class UserStatePushSynchronizer extends UserStateSynchronizer {
    /* access modifiers changed from: private */
    public static boolean serverSuccess;

    /* access modifiers changed from: protected */
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    public void onSuccessfulSync(JSONObject jSONObject) {
    }

    UserStatePushSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.PUSH);
    }

    /* access modifiers changed from: protected */
    public UserState newUserState(String str, boolean z) {
        return new UserStatePush(str, z);
    }

    /* access modifiers changed from: protected */
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.ERROR;
    }

    /* access modifiers changed from: package-private */
    public void saveChannelId(String str) {
        OneSignal.saveUserId(str);
    }

    /* access modifiers changed from: package-private */
    public UserStateSynchronizer.GetTagsResult getTags(boolean z) {
        UserStateSynchronizer.GetTagsResult getTagsResult;
        if (z) {
            String userId = OneSignal.getUserId();
            String savedAppId = OneSignal.getSavedAppId();
            OneSignalRestClient.getSync("players/" + userId + "?app_id=" + savedAppId, new OneSignalRestClient.ResponseHandler() {
                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    boolean unused = UserStatePushSynchronizer.serverSuccess = true;
                    if (str == null || str.isEmpty()) {
                        str = JsonUtils.EMPTY_JSON;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("tags")) {
                            synchronized (UserStatePushSynchronizer.this.LOCK) {
                                JSONObject generateJsonDiff = UserStatePushSynchronizer.this.generateJsonDiff(UserStatePushSynchronizer.this.getCurrentUserState().getSyncValues().optJSONObject("tags"), UserStatePushSynchronizer.this.getToSyncUserState().getSyncValues().optJSONObject("tags"), (JSONObject) null, (Set<String>) null);
                                UserStatePushSynchronizer.this.getCurrentUserState().putOnSyncValues("tags", jSONObject.optJSONObject("tags"));
                                UserStatePushSynchronizer.this.getCurrentUserState().persistState();
                                UserStatePushSynchronizer.this.getToSyncUserState().mergeTags(jSONObject, generateJsonDiff);
                                UserStatePushSynchronizer.this.getToSyncUserState().persistState();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.LOCK) {
            getTagsResult = new UserStateSynchronizer.GetTagsResult(serverSuccess, JSONUtils.getJSONObjectWithoutBlankValues(getToSyncUserState().getSyncValues(), "tags"));
        }
        return getTagsResult;
    }

    /* access modifiers changed from: protected */
    public void scheduleSyncToServer() {
        getNetworkHandlerThread(0).runNewJobDelayed();
    }

    /* access modifiers changed from: package-private */
    public void updateState(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject2, (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            getUserStateForModification().generateJsonDiffFromIntoDependValues(jSONObject3, (Set<String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public boolean getUserSubscribePreference() {
        return getToSyncUserState().getDependValues().optBoolean("userSubscribePref", true);
    }

    public String getLanguage() {
        return getToSyncUserState().getDependValues().optString("language", (String) null);
    }

    public void setPermission(boolean z) {
        try {
            getUserStateForModification().putOnDependValues("androidPermission", Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public String getId() {
        return OneSignal.getUserId();
    }

    /* access modifiers changed from: package-private */
    public void updateIdDependents(String str) {
        OneSignal.updateUserIdDependents(str);
    }

    /* access modifiers changed from: protected */
    public void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has(Scopes.EMAIL)) {
            OneSignal.fireEmailUpdateFailure();
        }
        if (jSONObject.has("sms_number")) {
            OneSignal.fireSMSUpdateFailure();
        }
    }
}
