package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ci */
class C1929Ci {

    /* renamed from: a */
    private final C3502t9 f5187a;

    public C1929Ci() {
        this(new C3502t9());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15593a(C2638Ui ui, JSONObject jSONObject) {
        C3502t9 t9Var = this.f5187a;
        C2121If.C2125b bVar = new C2121If.C2125b();
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject != null) {
            bVar.f5612a = optJSONObject.optInt("send_frequency_seconds", bVar.f5612a);
            bVar.f5613b = optJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f5613b);
        }
        ui.mo16876a(t9Var.toModel(bVar));
    }

    C1929Ci(C3502t9 t9Var) {
        this.f5187a = t9Var;
    }
}
