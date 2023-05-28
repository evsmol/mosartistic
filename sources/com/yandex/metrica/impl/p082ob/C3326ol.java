package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3454rl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ol */
public class C3326ol implements C2164Ik {

    /* renamed from: a */
    private final List<C3454rl> f8539a;

    public C3326ol(List<C3454rl> list) {
        this.f8539a = list;
    }

    /* renamed from: a */
    public Object mo15956a(C2903dl dlVar, C3040hl hlVar, C1870Ak ak, int i) {
        JSONArray jSONArray = new JSONArray();
        if (this.f8539a.isEmpty()) {
            return jSONArray;
        }
        for (C3454rl next : this.f8539a) {
            C3454rl.C3456b a = next.mo17313a(ak);
            int i2 = 0;
            if ((hlVar.f8008f || next.mo15958a()) && (a == null || !hlVar.f8011i)) {
                JSONObject a2 = next.mo18179a(hlVar, a);
                int length = a2.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i + length <= hlVar.f8016n && length2 < hlVar.f8015m) {
                    jSONArray.put(a2);
                    i2 = length;
                }
            }
            i += i2;
        }
        return jSONArray;
    }
}
