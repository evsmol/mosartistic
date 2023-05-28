package com.onesignal;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {
    private boolean accepted;
    private OSObservable<Object, OSSubscriptionState> observable = new OSObservable<>("changed", false);
    private boolean pushDisabled;
    private String pushToken;
    private String userId;

    OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            this.pushDisabled = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.userId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.pushToken = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.accepted = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.pushDisabled = !OneSignalStateSynchronizer.getUserSubscribePreference();
        this.userId = OneSignal.getUserId();
        this.pushToken = OneSignalStateSynchronizer.getRegistrationId();
        this.accepted = z2;
    }

    /* access modifiers changed from: package-private */
    public void changed(OSPermissionState oSPermissionState) {
        setAccepted(oSPermissionState.areNotificationsEnabled());
    }

    /* access modifiers changed from: package-private */
    public void setUserId(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.userId) : this.userId == null) {
            z = false;
        }
        this.userId = str;
        if (z) {
            this.observable.notifyChange(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void setPushToken(String str) {
        if (str != null) {
            boolean z = !str.equals(this.pushToken);
            this.pushToken = str;
            if (z) {
                this.observable.notifyChange(this);
            }
        }
    }

    public boolean isPushDisabled() {
        return this.pushDisabled;
    }

    private void setAccepted(boolean z) {
        boolean isSubscribed = isSubscribed();
        this.accepted = z;
        if (isSubscribed != isSubscribed()) {
            this.observable.notifyChange(this);
        }
    }

    public boolean isSubscribed() {
        return this.userId != null && this.pushToken != null && !this.pushDisabled && this.accepted;
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_SUBSCRIPTION_LAST", this.pushDisabled);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PLAYER_ID_LAST", this.userId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PUSH_TOKEN_LAST", this.pushToken);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.accepted);
    }

    public OSObservable<Object, OSSubscriptionState> getObservable() {
        return this.observable;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.userId != null) {
                jSONObject.put(DataKeys.USER_ID, this.userId);
            } else {
                jSONObject.put(DataKeys.USER_ID, JSONObject.NULL);
            }
            if (this.pushToken != null) {
                jSONObject.put("pushToken", this.pushToken);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", isPushDisabled());
            jSONObject.put("isSubscribed", isSubscribed());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
