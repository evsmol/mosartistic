package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ha */
public class C2089Ha implements Converter<Map<String, String>, C2336Na<C3211mf.C3220i, C2671Vm>> {

    /* renamed from: a */
    private final C3168ln f5520a;

    public C2089Ha() {
        this(new C3168ln(20480, 100, 1000));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3220i, C2671Vm> fromModel(Map<String, String> map) {
        C3011gn<Map<String, String>, C2727Xm> a = this.f5520a.mo17691a(map);
        C3211mf.C3220i iVar = new C3211mf.C3220i();
        iVar.f8352b = ((C2727Xm) a.f7939b).f7212b;
        Map map2 = (Map) a.f7938a;
        if (map2 != null) {
            iVar.f8351a = new C3211mf.C3220i.C3221a[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                iVar.f8351a[i] = new C3211mf.C3220i.C3221a();
                iVar.f8351a[i].f8354a = C2814b.m9072b((String) entry.getKey());
                iVar.f8351a[i].f8355b = C2814b.m9072b((String) entry.getValue());
                i++;
            }
        }
        return new C2336Na<>(iVar, a.f7939b);
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    public C2089Ha(C3168ln lnVar) {
        this.f5520a = lnVar;
    }
}
