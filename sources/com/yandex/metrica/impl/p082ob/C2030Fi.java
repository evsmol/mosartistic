package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Fi */
public final class C2030Fi {

    /* renamed from: a */
    private final C1887B9 f5420a;

    public C2030Fi(C1887B9 b9) {
        this.f5420a = b9;
    }

    /* renamed from: a */
    public final void mo15790a(C2638Ui ui, JSONObject jSONObject) {
        C2121If.C2130g gVar = new C2121If.C2130g();
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (optJSONObject != null) {
            gVar.f5626a = optJSONObject.optLong("first_delay_seconds", gVar.f5626a);
        }
        ui.mo16881a(this.f5420a.toModel(gVar));
    }

    public C2030Fi() {
        this(new C1887B9());
    }
}
