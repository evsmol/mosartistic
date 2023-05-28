package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ListConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.O9 */
public class C2370O9 implements ListConverter<C1892Bd, C2121If.C2142m> {
    /* renamed from: a */
    public C2121If.C2142m[] fromModel(List<C1892Bd> list) {
        C2121If.C2142m[] mVarArr = new C2121If.C2142m[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C1892Bd bd = list.get(i);
            C2121If.C2142m mVar = new C2121If.C2142m();
            mVar.f5694a = bd.f5115a;
            mVar.f5695b = bd.f5116b;
            mVarArr[i] = mVar;
        }
        return mVarArr;
    }

    /* renamed from: a */
    public List<C1892Bd> toModel(C2121If.C2142m[] mVarArr) {
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (C2121If.C2142m mVar : mVarArr) {
            arrayList.add(new C1892Bd(mVar.f5694a, mVar.f5695b));
        }
        return arrayList;
    }
}
