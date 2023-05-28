package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSSMSSubscriptionStateChanges {
    private OSSMSSubscriptionState from;

    /* renamed from: to */
    private OSSMSSubscriptionState f12769to;

    public OSSMSSubscriptionStateChanges(OSSMSSubscriptionState oSSMSSubscriptionState, OSSMSSubscriptionState oSSMSSubscriptionState2) {
        this.from = oSSMSSubscriptionState;
        this.f12769to = oSSMSSubscriptionState2;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.from.toJSONObject());
            jSONObject.put("to", this.f12769to.toJSONObject());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return toJSONObject().toString();
    }
}
