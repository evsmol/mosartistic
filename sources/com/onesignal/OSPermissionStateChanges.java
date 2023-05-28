package com.onesignal;

import org.json.JSONObject;

public class OSPermissionStateChanges {
    private OSPermissionState from;

    /* renamed from: to */
    private OSPermissionState f12768to;

    public OSPermissionStateChanges(OSPermissionState oSPermissionState, OSPermissionState oSPermissionState2) {
        this.from = oSPermissionState;
        this.f12768to = oSPermissionState2;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.from.toJSONObject());
            jSONObject.put("to", this.f12768to.toJSONObject());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
