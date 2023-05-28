package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3664xf;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.Y2 */
public class C2731Y2 implements ProtobufConverter<C2700X2, C3664xf> {

    /* renamed from: a */
    private final C2790a3 f7218a;

    public C2731Y2() {
        this(new C2790a3());
    }

    public Object fromModel(Object obj) {
        C2700X2 x2 = (C2700X2) obj;
        C3664xf xfVar = new C3664xf();
        xfVar.f9459a = new C3664xf.C3665a[x2.f7110a.size()];
        int i = 0;
        for (C1798a a : x2.f7110a) {
            xfVar.f9459a[i] = this.f7218a.fromModel(a);
            i++;
        }
        xfVar.f9460b = x2.f7111b;
        return xfVar;
    }

    public Object toModel(Object obj) {
        C3664xf xfVar = (C3664xf) obj;
        ArrayList arrayList = new ArrayList(xfVar.f9459a.length);
        for (C3664xf.C3665a a : xfVar.f9459a) {
            arrayList.add(this.f7218a.toModel(a));
        }
        return new C2700X2(arrayList, xfVar.f9460b);
    }

    C2731Y2(C2790a3 a3Var) {
        this.f7218a = a3Var;
    }
}
