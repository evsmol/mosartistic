package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gi */
public final class C2064Gi {

    /* renamed from: a */
    private final C1918C9 f5461a;

    public C2064Gi(C1918C9 c9) {
        this.f5461a = c9;
    }

    /* renamed from: a */
    public final void mo15832a(C2638Ui ui, JSONObject jSONObject) {
        C2121If.C2131h hVar = new C2121If.C2131h();
        JSONObject optJSONObject = jSONObject.optJSONObject("egress");
        if (optJSONObject != null) {
            hVar.f5627a = optJSONObject.optString("url", hVar.f5627a);
            hVar.f5628b = optJSONObject.optInt("repeated_delay", hVar.f5628b);
            hVar.f5629c = optJSONObject.optInt("random_delay_window", hVar.f5629c);
            hVar.f5630d = optJSONObject.optBoolean("background_allowed", hVar.f5630d);
            hVar.f5631e = optJSONObject.optBoolean("diagnostic_enabled", hVar.f5631e);
        }
        ui.mo16869a(this.f5461a.toModel(hVar));
    }

    public C2064Gi() {
        this(new C1918C9());
    }
}
