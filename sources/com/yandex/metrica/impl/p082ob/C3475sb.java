package com.yandex.metrica.impl.p082ob;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sb */
public final class C3475sb {

    /* renamed from: a */
    private final String f9094a;

    /* renamed from: b */
    private final int f9095b;

    /* renamed from: c */
    private final boolean f9096c;

    public C3475sb(JSONObject jSONObject) throws JSONException {
        this.f9094a = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f9096c = jSONObject.getBoolean("required");
        this.f9095b = jSONObject.optInt("version", -1);
    }

    /* renamed from: a */
    public JSONObject mo18206a() throws JSONException {
        JSONObject put = new JSONObject().put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f9094a).put("required", this.f9096c);
        int i = this.f9095b;
        if (i != -1) {
            put.put("version", i);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3475sb.class != obj.getClass()) {
            return false;
        }
        C3475sb sbVar = (C3475sb) obj;
        if (this.f9095b != sbVar.f9095b || this.f9096c != sbVar.f9096c) {
            return false;
        }
        String str = this.f9094a;
        String str2 = sbVar.f9094a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9094a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f9095b) * 31) + (this.f9096c ? 1 : 0);
    }

    public C3475sb(String str, int i, boolean z) {
        this.f9094a = str;
        this.f9095b = i;
        this.f9096c = z;
    }
}
