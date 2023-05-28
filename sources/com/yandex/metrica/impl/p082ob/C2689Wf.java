package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Wf */
public class C2689Wf {
    /* renamed from: a */
    public C10725i mo16998a(C10725i iVar) {
        if (!C1848A2.m6809a((Object) iVar.maxReportsInDatabaseCount)) {
            return iVar;
        }
        C10725i.C10727b a = C10725i.m31591a((YandexMetricaConfig) iVar).mo64756a((List<String>) new ArrayList());
        if (C1848A2.m6809a((Object) iVar.f26869a)) {
            a.mo64762b(iVar.f26869a);
        }
        if (C1848A2.m6809a((Object) iVar.f26870b) && C1848A2.m6809a((Object) iVar.f26877i)) {
            a.mo64757a(iVar.f26870b, iVar.f26877i);
        }
        if (C1848A2.m6809a((Object) iVar.f26873e)) {
            a.mo64750a(iVar.f26873e.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26874f)) {
            a.mo64761b(iVar.f26874f.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26875g)) {
            a.mo64765c(iVar.f26875g.intValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26871c)) {
            a.f26886f = iVar.f26871c;
        }
        if (C1848A2.m6809a((Object) iVar.f26876h)) {
            for (Map.Entry next : iVar.f26876h.entrySet()) {
                a.mo64755a((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C1848A2.m6809a((Object) iVar.f26878j)) {
            a.mo64773g(iVar.f26878j.booleanValue());
        }
        if (C1848A2.m6809a((Object) iVar.f26872d)) {
            a.mo64756a(iVar.f26872d);
        }
        if (C1848A2.m6809a((Object) iVar.f26879k)) {
            a.mo64764b(iVar.f26879k.booleanValue());
        }
        return a.mo64768d(m8811a(iVar.maxReportsInDatabaseCount, iVar.apiKey)).mo64759a();
    }

    /* renamed from: a */
    public C10720e mo16997a(C10720e eVar) {
        return C1848A2.m6809a((Object) eVar.maxReportsInDatabaseCount) ? C10720e.m31574a(eVar).mo64734a(m8811a(eVar.maxReportsInDatabaseCount, eVar.apiKey)).mo64735a() : eVar;
    }

    /* renamed from: a */
    private int m8811a(Integer num, String str) {
        if (num.intValue() < 100) {
            C2642Ul.m8746b(str).mo15270fw("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        } else if (num.intValue() <= 10000) {
            return num.intValue();
        } else {
            C2642Ul.m8746b(str).mo15270fw("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
    }
}
