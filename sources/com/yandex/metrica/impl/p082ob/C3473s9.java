package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2402Oh;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.s9 */
public class C3473s9 implements ProtobufConverter<C2402Oh, C2121If.C2122a> {
    /* renamed from: a */
    public C2121If.C2122a fromModel(C2402Oh oh) {
        C2121If.C2122a.C2123a aVar;
        C2121If.C2122a aVar2 = new C2121If.C2122a();
        aVar2.f5607a = new C2121If.C2122a.C2124b[oh.f6376a.size()];
        for (int i = 0; i < oh.f6376a.size(); i++) {
            C2121If.C2122a.C2124b bVar = new C2121If.C2122a.C2124b();
            Pair pair = oh.f6376a.get(i);
            bVar.f5610a = (String) pair.first;
            if (pair.second != null) {
                bVar.f5611b = new C2121If.C2122a.C2123a();
                C2402Oh.C2403a aVar3 = (C2402Oh.C2403a) pair.second;
                if (aVar3 == null) {
                    aVar = null;
                } else {
                    C2121If.C2122a.C2123a aVar4 = new C2121If.C2122a.C2123a();
                    aVar4.f5608a = aVar3.f6377a;
                    aVar = aVar4;
                }
                bVar.f5611b = aVar;
            }
            aVar2.f5607a[i] = bVar;
        }
        return aVar2;
    }

    /* renamed from: a */
    public C2402Oh toModel(C2121If.C2122a aVar) {
        C2402Oh.C2403a aVar2;
        ArrayList arrayList = new ArrayList();
        for (C2121If.C2122a.C2124b bVar : aVar.f5607a) {
            String str = bVar.f5610a;
            C2121If.C2122a.C2123a aVar3 = bVar.f5611b;
            if (aVar3 == null) {
                aVar2 = null;
            } else {
                aVar2 = new C2402Oh.C2403a(aVar3.f5608a);
            }
            arrayList.add(new Pair(str, aVar2));
        }
        return new C2402Oh(arrayList);
    }
}
