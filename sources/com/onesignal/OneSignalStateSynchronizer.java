package com.onesignal;

import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.UserStateSynchronizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class OneSignalStateSynchronizer {
    private static final Object LOCK = new Object();
    private static HashMap<UserStateSynchronizerType, UserStateSynchronizer> userStateSynchronizers = new HashMap<>();

    interface OSDeviceInfoCompletionHandler {
        void onFailure(OSDeviceInfoError oSDeviceInfoError);

        void onSuccess(String str);
    }

    enum UserStateSynchronizerType {
        PUSH,
        EMAIL,
        SMS
    }

    static class OSDeviceInfoError {
        public int errorCode;
        public String message;

        OSDeviceInfoError(int i, String str) {
            this.errorCode = i;
            this.message = str;
        }
    }

    static UserStatePushSynchronizer getPushStateSynchronizer() {
        if (!userStateSynchronizers.containsKey(UserStateSynchronizerType.PUSH) || userStateSynchronizers.get(UserStateSynchronizerType.PUSH) == null) {
            synchronized (LOCK) {
                if (userStateSynchronizers.get(UserStateSynchronizerType.PUSH) == null) {
                    userStateSynchronizers.put(UserStateSynchronizerType.PUSH, new UserStatePushSynchronizer());
                }
            }
        }
        return (UserStatePushSynchronizer) userStateSynchronizers.get(UserStateSynchronizerType.PUSH);
    }

    static UserStateEmailSynchronizer getEmailStateSynchronizer() {
        if (!userStateSynchronizers.containsKey(UserStateSynchronizerType.EMAIL) || userStateSynchronizers.get(UserStateSynchronizerType.EMAIL) == null) {
            synchronized (LOCK) {
                if (userStateSynchronizers.get(UserStateSynchronizerType.EMAIL) == null) {
                    userStateSynchronizers.put(UserStateSynchronizerType.EMAIL, new UserStateEmailSynchronizer());
                }
            }
        }
        return (UserStateEmailSynchronizer) userStateSynchronizers.get(UserStateSynchronizerType.EMAIL);
    }

    static UserStateSMSSynchronizer getSMSStateSynchronizer() {
        if (!userStateSynchronizers.containsKey(UserStateSynchronizerType.SMS) || userStateSynchronizers.get(UserStateSynchronizerType.SMS) == null) {
            synchronized (LOCK) {
                if (userStateSynchronizers.get(UserStateSynchronizerType.SMS) == null) {
                    userStateSynchronizers.put(UserStateSynchronizerType.SMS, new UserStateSMSSynchronizer());
                }
            }
        }
        return (UserStateSMSSynchronizer) userStateSynchronizers.get(UserStateSynchronizerType.SMS);
    }

    static List<UserStateSynchronizer> getUserStateSynchronizers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getPushStateSynchronizer());
        if (OneSignal.hasEmailId()) {
            arrayList.add(getEmailStateSynchronizer());
        }
        if (OneSignal.hasSMSlId()) {
            arrayList.add(getSMSStateSynchronizer());
        }
        return arrayList;
    }

    static boolean persist() {
        boolean persist = getPushStateSynchronizer().persist();
        boolean persist2 = getEmailStateSynchronizer().persist();
        boolean persist3 = getSMSStateSynchronizer().persist();
        if (persist2) {
            persist2 = getEmailStateSynchronizer().getRegistrationId() != null;
        }
        if (persist3) {
            persist3 = getSMSStateSynchronizer().getRegistrationId() != null;
        }
        if (persist || persist2 || persist3) {
            return true;
        }
        return false;
    }

    static void clearLocation() {
        getPushStateSynchronizer().clearLocation();
        getEmailStateSynchronizer().clearLocation();
        getSMSStateSynchronizer().clearLocation();
    }

    static void initUserState() {
        getPushStateSynchronizer().initUserState();
        getEmailStateSynchronizer().initUserState();
        getSMSStateSynchronizer().initUserState();
    }

    static void syncUserState(boolean z) {
        getPushStateSynchronizer().syncUserState(z);
        getEmailStateSynchronizer().syncUserState(z);
        getSMSStateSynchronizer().syncUserState(z);
    }

    static void sendTags(JSONObject jSONObject, OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            JSONObject put = new JSONObject().put("tags", jSONObject);
            getPushStateSynchronizer().sendTags(put, changeTagsUpdateHandler);
            getEmailStateSynchronizer().sendTags(put, changeTagsUpdateHandler);
            getSMSStateSynchronizer().sendTags(put, changeTagsUpdateHandler);
        } catch (JSONException e) {
            if (changeTagsUpdateHandler != null) {
                changeTagsUpdateHandler.onFailure(new OneSignal.SendTagsError(-1, "Encountered an error attempting to serialize your tags into JSON: " + e.getMessage() + "\n" + e.getStackTrace()));
            }
            e.printStackTrace();
        }
    }

    static boolean getUserSubscribePreference() {
        return getPushStateSynchronizer().getUserSubscribePreference();
    }

    static String getLanguage() {
        return getPushStateSynchronizer().getLanguage();
    }

    static void setPermission(boolean z) {
        getPushStateSynchronizer().setPermission(z);
    }

    static void updateLocation(LocationController.LocationPoint locationPoint) {
        getPushStateSynchronizer().updateLocation(locationPoint);
        getEmailStateSynchronizer().updateLocation(locationPoint);
        getSMSStateSynchronizer().updateLocation(locationPoint);
    }

    static String getRegistrationId() {
        return getPushStateSynchronizer().getRegistrationId();
    }

    static UserStateSynchronizer.GetTagsResult getTags(boolean z) {
        return getPushStateSynchronizer().getTags(z);
    }

    static void resetCurrentState() {
        getPushStateSynchronizer().resetCurrentState();
        getEmailStateSynchronizer().resetCurrentState();
        getSMSStateSynchronizer().resetCurrentState();
        getPushStateSynchronizer().saveChannelId((String) null);
        getEmailStateSynchronizer().saveChannelId((String) null);
        getSMSStateSynchronizer().saveChannelId((String) null);
        OneSignal.setLastSessionTime(-3660);
    }

    static void updateDeviceInfo(JSONObject jSONObject, OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler) {
        getPushStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
        getEmailStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
        getSMSStateSynchronizer().updateDeviceInfo(jSONObject, oSDeviceInfoCompletionHandler);
    }

    static void updatePushState(JSONObject jSONObject) {
        getPushStateSynchronizer().updateState(jSONObject);
    }

    static void refreshSecondaryChannelState() {
        getEmailStateSynchronizer().refresh();
        getSMSStateSynchronizer().refresh();
    }

    static void setNewSession() {
        getPushStateSynchronizer().setNewSession();
        getEmailStateSynchronizer().setNewSession();
        getSMSStateSynchronizer().setNewSession();
    }

    static boolean getSyncAsNewSession() {
        return getPushStateSynchronizer().getSyncAsNewSession() || getEmailStateSynchronizer().getSyncAsNewSession() || getSMSStateSynchronizer().getSyncAsNewSession();
    }

    static void setNewSessionForEmail() {
        getEmailStateSynchronizer().setNewSession();
    }

    static void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        for (UserStateSynchronizer sendPurchases : getUserStateSynchronizers()) {
            sendPurchases.sendPurchases(jSONObject, responseHandler);
        }
    }

    static void readyToUpdate(boolean z) {
        getPushStateSynchronizer().readyToUpdate(z);
        getEmailStateSynchronizer().readyToUpdate(z);
        getSMSStateSynchronizer().readyToUpdate(z);
    }
}
