package com.onesignal;

import org.json.JSONObject;

public class OSSMSSubscriptionState implements Cloneable {
    private OSObservable<Object, OSSMSSubscriptionState> observable = new OSObservable<>("changed", false);
    private String smsNumber;
    private String smsUserId;

    OSSMSSubscriptionState(boolean z) {
        if (z) {
            this.smsUserId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_ID_LAST", (String) null);
            this.smsNumber = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_NUMBER_LAST", (String) null);
            return;
        }
        this.smsUserId = OneSignal.getSMSId();
        this.smsNumber = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId();
    }

    /* access modifiers changed from: package-private */
    public void setSMSUserId(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.smsUserId) : this.smsUserId == null) {
            z = false;
        }
        this.smsUserId = str;
        if (z) {
            this.observable.notifyChange(this);
        }
    }

    public boolean isSubscribed() {
        return (this.smsUserId == null || this.smsNumber == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_ID_LAST", this.smsUserId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_NUMBER_LAST", this.smsNumber);
    }

    public OSObservable<Object, OSSMSSubscriptionState> getObservable() {
        return this.observable;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.smsUserId != null) {
                jSONObject.put("smsUserId", this.smsUserId);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            if (this.smsNumber != null) {
                jSONObject.put("smsNumber", this.smsNumber);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", isSubscribed());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
