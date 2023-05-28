package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C3740zl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ba */
class C2831ba implements ListConverter<C3740zl, C2121If.C2155y> {
    C2831ba() {
    }

    /* renamed from: a */
    public C2121If.C2155y[] fromModel(List<C3740zl> list) {
        C2121If.C2155y[] yVarArr = new C2121If.C2155y[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C3740zl zlVar = list.get(i);
            C2121If.C2155y yVar = new C2121If.C2155y();
            yVar.f5755a = zlVar.f9597a.f9604a;
            yVar.f5756b = zlVar.f9598b;
            yVarArr[i] = yVar;
        }
        return yVarArr;
    }

    /* renamed from: a */
    public List<C3740zl> toModel(C2121If.C2155y[] yVarArr) {
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (C2121If.C2155y yVar : yVarArr) {
            arrayList.add(new C3740zl(C3740zl.C3742b.m11152a(yVar.f5755a), yVar.f5756b));
        }
        return arrayList;
    }
}
