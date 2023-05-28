package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C3351pf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ed */
public class C2922ed {

    /* renamed from: a */
    private final C2594U7 f7747a;

    /* renamed from: b */
    private final C2555T7 f7748b;

    /* renamed from: c */
    private final C2834bd f7749c;

    /* renamed from: d */
    private final C2768Zc f7750d;

    public C2922ed(Context context) {
        this(C3093ja.m9805a(context).mo17744f(), C3093ja.m9805a(context).mo17743e(), new C2659Vb(context), new C2802ad(), new C2741Yc());
    }

    /* renamed from: a */
    public C2892dd mo17548a(int i) {
        Map<Long, String> a = this.f7747a.mo15982a(i);
        Map<Long, String> a2 = this.f7748b.mo15982a(i);
        C3351pf pfVar = new C3351pf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C3351pf.C3353b a3 = this.f7749c.mo17302a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        pfVar.f8565a = (C3351pf.C3353b[]) arrayList.toArray(new C3351pf.C3353b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C3351pf.C3352a a4 = this.f7750d.mo17110a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (a4 != null) {
                arrayList2.add(a4);
            }
        }
        pfVar.f8566b = (C3351pf.C3352a[]) arrayList2.toArray(new C3351pf.C3352a[arrayList2.size()]);
        long j = -1;
        long longValue = a.isEmpty() ? -1 : ((Long) Collections.max(linkedHashMap.keySet())).longValue();
        if (!a2.isEmpty()) {
            j = ((Long) Collections.max(linkedHashMap2.keySet())).longValue();
        }
        return new C2892dd(longValue, j, pfVar);
    }

    C2922ed(C2594U7 u7, C2555T7 t7, C2659Vb vb, C2802ad adVar, C2741Yc yc) {
        this(u7, t7, new C2834bd(vb, adVar), new C2768Zc(vb, yc));
    }

    C2922ed(C2594U7 u7, C2555T7 t7, C2834bd bdVar, C2768Zc zc) {
        this.f7747a = u7;
        this.f7748b = t7;
        this.f7749c = bdVar;
        this.f7750d = zc;
    }

    /* renamed from: a */
    public void mo17549a(C2892dd ddVar) {
        long j = ddVar.f7639a;
        if (j >= 0) {
            this.f7747a.mo15987c(j);
        }
        long j2 = ddVar.f7640b;
        if (j2 >= 0) {
            this.f7748b.mo15987c(j2);
        }
    }
}
