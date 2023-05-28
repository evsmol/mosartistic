package com.yandex.metrica.impl.p082ob;

import com.appnext.base.p264b.C8850d;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ei */
public class C1998Ei {

    /* renamed from: a */
    private final C3727z9 f5349a;

    public C1998Ei() {
        this(new C3727z9());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15728a(C2638Ui ui, C2572Tl.C2573a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("diagnostics");
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("functionalities")) != null) {
            C3392qa qaVar = null;
            C3392qa qaVar2 = null;
            C3392qa qaVar3 = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String string = jSONObject.getString("tag");
                    C3727z9 z9Var = this.f5349a;
                    C2121If.C2128e eVar = new C2121If.C2128e();
                    eVar.f5621a = jSONObject.getLong("expiration_timestamp");
                    eVar.f5622b = jSONObject.optInt(C8850d.f22434fn, eVar.f5622b);
                    C3392qa a = z9Var.toModel(eVar);
                    if ("activation".equals(string)) {
                        qaVar = a;
                    } else if ("clids_info".equals(string)) {
                        qaVar2 = a;
                    } else if ("preload_info".equals(string)) {
                        qaVar3 = a;
                    }
                } catch (Throwable unused) {
                }
            }
            ui.mo16877a(new C3437ra(qaVar, qaVar2, qaVar3));
        }
    }

    C1998Ei(C3727z9 z9Var) {
        this.f5349a = z9Var;
    }
}
