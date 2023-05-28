package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ka */
public class C2238Ka implements Converter<List<String>, C2336Na<C3211mf.C3224l[], C2671Vm>> {

    /* renamed from: a */
    private final C3107jn f5969a;

    public C2238Ka() {
        this(new C3107jn(20, 100));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3224l[], C2671Vm> fromModel(List<String> list) {
        C3011gn<List<T>, C2727Xm> a = this.f5969a.mo17691a(list);
        List list2 = (List) a.f7938a;
        C3211mf.C3224l[] lVarArr = new C3211mf.C3224l[0];
        if (list2 != null) {
            lVarArr = new C3211mf.C3224l[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                lVarArr[i] = new C3211mf.C3224l();
                lVarArr[i].f8366a = C2814b.m9072b((String) list2.get(i));
            }
        }
        return new C2336Na<>(lVarArr, a.f7939b);
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    public C2238Ka(C3107jn jnVar) {
        this.f5969a = jnVar;
    }
}
