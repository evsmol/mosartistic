package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import com.yandex.metrica.impl.p082ob.C3552ui;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Wi */
public class C2692Wi {

    /* renamed from: a */
    private static final C2121If.C2151u f7091a = new C2121If.C2151u();

    /* renamed from: a */
    public C3552ui mo17004a(C2572Tl.C2573a aVar, String str) {
        C3552ui.C3553a aVar2;
        JSONObject optJSONObject = aVar.optJSONObject(str);
        C3552ui.C3553a aVar3 = null;
        if (optJSONObject == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cell");
        if (optJSONObject2 != null) {
            C2121If.C2151u uVar = f7091a;
            aVar2 = new C3552ui.C3553a(optJSONObject2.optInt("refresh_event_count", uVar.f5726a), optJSONObject2.optLong("refresh_period_seconds", uVar.f5727b));
        } else {
            aVar2 = null;
        }
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("wifi");
        if (optJSONObject3 != null) {
            C2121If.C2151u uVar2 = f7091a;
            aVar3 = new C3552ui.C3553a(optJSONObject3.optInt("refresh_event_count", uVar2.f5726a), optJSONObject3.optLong("refresh_period_seconds", uVar2.f5727b));
        }
        return new C3552ui(aVar2, aVar3);
    }
}
