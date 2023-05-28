package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSEmailSubscriptionStateChanges {
    private OSEmailSubscriptionState from;

    /* renamed from: to */
    private OSEmailSubscriptionState f12766to;

    public OSEmailSubscriptionStateChanges(OSEmailSubscriptionState oSEmailSubscriptionState, OSEmailSubscriptionState oSEmailSubscriptionState2) {
        this.from = oSEmailSubscriptionState;
        this.f12766to = oSEmailSubscriptionState2;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.from.toJSONObject());
            jSONObject.put("to", this.f12766to.toJSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
