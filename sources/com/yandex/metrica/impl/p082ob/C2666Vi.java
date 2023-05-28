package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Vi */
public final class C2666Vi {

    /* renamed from: a */
    private final C2738Y9 f7058a;

    public C2666Vi(C2738Y9 y9) {
        this.f7058a = y9;
    }

    /* renamed from: a */
    public final void mo16980a(C2638Ui ui, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("startup_update");
        C2121If.C2148r rVar = new C2121If.C2148r();
        Integer a = C2572Tl.m8509a(optJSONObject, "interval_seconds", (Integer) null);
        if (a != null) {
            Intrinsics.checkNotNullExpressionValue(a, "it");
            rVar.f5722a = a.intValue();
        }
        ui.mo16878a(this.f7058a.toModel(rVar));
    }

    public C2666Vi() {
        this(new C2738Y9());
    }
}
