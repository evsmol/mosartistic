package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ji */
public class C2207Ji {

    /* renamed from: a */
    private final C2182J9 f5919a;

    C2207Ji() {
        this(new C2182J9());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16047a(C2638Ui ui, C2572Tl.C2573a aVar) {
        if (ui.mo16902e().f6667f) {
            C2121If.C2133j jVar = new C2121If.C2133j();
            JSONObject optJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (optJSONObject != null) {
                jVar.f5656a = optJSONObject.optLong("min_interval_seconds", jVar.f5656a);
            }
            ui.mo16871a(this.f5919a.toModel(jVar));
        }
    }

    C2207Ji(C2182J9 j9) {
        this.f5919a = j9;
    }
}
