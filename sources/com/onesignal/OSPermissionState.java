package com.onesignal;

import org.json.JSONObject;

public class OSPermissionState implements Cloneable {
    private boolean notificationsEnabled;
    private OSObservable<Object, OSPermissionState> observable = new OSObservable<>("changed", false);

    OSPermissionState(boolean z) {
        if (z) {
            this.notificationsEnabled = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            refreshAsTo();
        }
    }

    /* access modifiers changed from: package-private */
    public void refreshAsTo() {
        setNotificationsEnabled(OSUtils.areNotificationsEnabled(OneSignal.appContext));
    }

    public boolean areNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    private void setNotificationsEnabled(boolean z) {
        boolean z2 = this.notificationsEnabled != z;
        this.notificationsEnabled = z;
        if (z2) {
            this.observable.notifyChange(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.notificationsEnabled);
    }

    public OSObservable<Object, OSPermissionState> getObservable() {
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
            jSONObject.put("areNotificationsEnabled", this.notificationsEnabled);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
