package com.yandex.metrica.impl.p082ob;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c8 */
public final class C2860c8 {

    /* renamed from: a */
    private JSONObject f7558a;

    /* renamed from: b */
    private final C2945f8 f7559b;

    /* renamed from: c */
    private final C2945f8 f7560c;

    /* renamed from: d */
    private final String f7561d;

    /* renamed from: e */
    private final C2887d8 f7562e;

    public C2860c8(C2945f8 f8Var, C2945f8 f8Var2, String str, C2887d8 d8Var) {
        this.f7559b = f8Var;
        this.f7560c = f8Var2;
        this.f7561d = str;
        this.f7562e = d8Var;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo17381a() {
        JSONObject jSONObject;
        if (this.f7558a == null) {
            JSONObject a = this.f7562e.mo17171a(m9283a(this.f7559b), m9283a(this.f7560c));
            this.f7558a = a;
            mo17382a(a);
        }
        jSONObject = this.f7558a;
        if (jSONObject == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fileContents");
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m9283a(C2945f8 f8Var) {
        try {
            String c = f8Var.mo16514c();
            return c != null ? new JSONObject(c) : new JSONObject();
        } catch (Throwable th) {
            m9284a(th);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17382a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "contents.toString()");
        try {
            this.f7559b.mo16513a(jSONObject2);
        } catch (Throwable th) {
            m9284a(th);
        }
        try {
            this.f7560c.mo16513a(jSONObject2);
        } catch (Throwable th2) {
            m9284a(th2);
        }
        return;
    }

    /* renamed from: a */
    private final void m9284a(Throwable th) {
        C2291M0 a = C3322oh.m10248a();
        C3264nh nhVar = (C3264nh) a;
        nhVar.reportEvent("vital_data_provider_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.m14544to("tag", this.f7561d), TuplesKt.m14544to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
        C2291M0 a2 = C3322oh.m10248a();
        ((C3264nh) a2).reportError("Error during reading vital data for tag = " + this.f7561d, th);
    }
}
