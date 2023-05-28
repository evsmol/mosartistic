package com.ironsource.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.sdk.p147j.C4953a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c */
public final class C4758c {

    /* renamed from: a */
    public boolean f12084a = false;

    /* renamed from: b */
    public boolean f12085b = false;

    /* renamed from: c */
    public C4742a f12086c = null;

    /* renamed from: d */
    public Map<String, String> f12087d;

    /* renamed from: e */
    private String f12088e;

    /* renamed from: f */
    private final C4953a f12089f;

    public C4758c(String str, C4953a aVar) {
        this.f12088e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f12089f = (C4953a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    /* renamed from: a */
    public final C4751b mo34256a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f12088e);
            jSONObject.put("rewarded", this.f12084a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C4751b(this.f12085b ? C4906d.m14289a() : C4906d.m14291a(jSONObject), this.f12088e, this.f12084a, this.f12085b, this.f12087d, this.f12089f, this.f12086c);
    }
}
