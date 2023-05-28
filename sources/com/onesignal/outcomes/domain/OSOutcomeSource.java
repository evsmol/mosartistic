package com.onesignal.outcomes.domain;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0010"}, mo38199d2 = {"Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "", "directBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "indirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getDirectBody", "()Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "setDirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getIndirectBody", "setIndirectBody", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: OSOutcomeSource.kt */
public final class OSOutcomeSource {
    private OSOutcomeSourceBody directBody;
    private OSOutcomeSourceBody indirectBody;

    public OSOutcomeSource(OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2) {
        this.directBody = oSOutcomeSourceBody;
        this.indirectBody = oSOutcomeSourceBody2;
    }

    public final OSOutcomeSourceBody getDirectBody() {
        return this.directBody;
    }

    public final OSOutcomeSourceBody getIndirectBody() {
        return this.indirectBody;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        OSOutcomeSourceBody oSOutcomeSourceBody = this.directBody;
        if (oSOutcomeSourceBody != null) {
            jSONObject.put("direct", oSOutcomeSourceBody.toJSONObject());
        }
        OSOutcomeSourceBody oSOutcomeSourceBody2 = this.indirectBody;
        if (oSOutcomeSourceBody2 != null) {
            jSONObject.put("indirect", oSOutcomeSourceBody2.toJSONObject());
        }
        return jSONObject;
    }

    public final OSOutcomeSource setDirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        OSOutcomeSource oSOutcomeSource = this;
        oSOutcomeSource.directBody = oSOutcomeSourceBody;
        return oSOutcomeSource;
    }

    public final OSOutcomeSource setIndirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        OSOutcomeSource oSOutcomeSource = this;
        oSOutcomeSource.indirectBody = oSOutcomeSourceBody;
        return oSOutcomeSource;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }
}
