package com.yandex.metrica.impl.p082ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dl */
class C2903dl {

    /* renamed from: a */
    private C2439Pk f7687a;

    C2903dl() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17471a(C2498Rk rk, View view, C2100Hk hk) {
        C2439Pk b = rk.mo16580b((C3454rl) null, view, 0);
        this.f7687a = b;
        if (b != null) {
            m9380a(rk, b, view, 1, hk);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo17470a(C3040hl hlVar, C1870Ak ak, int i) {
        C2439Pk pk = this.f7687a;
        JSONObject jSONObject = pk != null ? pk.mo16482a(hlVar, ak, i, 0).f6492c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    private void m9380a(C2498Rk rk, C2439Pk pk, View view, int i, C2100Hk hk) {
        ArrayList arrayList = (ArrayList) rk.mo16578a(view, i);
        if (arrayList.size() == 0) {
            hk.mo16529a(pk.mo16483a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C2439Pk b = rk.mo16580b(pk.mo16483a(), view2, i);
            if (b != null) {
                pk.mo16484a(b);
                m9380a(rk, b, view2, i + 1, hk);
            }
        }
    }
}
