package com.onesignal;

import org.json.JSONObject;

public class OSSubscriptionStateChanges {
    private OSSubscriptionState from;

    /* renamed from: to */
    private OSSubscriptionState f12770to;

    public OSSubscriptionStateChanges(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.from = oSSubscriptionState;
        this.f12770to = oSSubscriptionState2;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.from.toJSONObject());
            jSONObject.put("to", this.f12770to.toJSONObject());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
