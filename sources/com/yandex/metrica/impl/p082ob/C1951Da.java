package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Da */
public class C1951Da implements Converter<List<String>, C2336Na<C3211mf.C3215d, C2671Vm>> {

    /* renamed from: a */
    private final C3107jn f5231a;

    public C1951Da() {
        this(new C3107jn(20, 100));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3215d, C2671Vm> fromModel(List<String> list) {
        C3011gn<List<T>, C2727Xm> a = this.f5231a.mo17691a(list);
        C3211mf.C3215d dVar = new C3211mf.C3215d();
        List list2 = (List) a.f7938a;
        byte[][] bArr = new byte[0][];
        if (list2 != null) {
            bArr = new byte[list2.size()][];
            for (int i = 0; i < list2.size(); i++) {
                bArr[i] = C2814b.m9072b((String) list2.get(i));
            }
        }
        dVar.f8339a = bArr;
        return new C2336Na<>(dVar, a.f7939b);
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    public C1951Da(C3107jn jnVar) {
        this.f5231a = jnVar;
    }
}
