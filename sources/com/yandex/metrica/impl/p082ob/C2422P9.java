package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1894Bf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.P9 */
public class C2422P9 implements ProtobufConverter<List<C1892Bd>, C1894Bf> {
    public Object fromModel(Object obj) {
        List list = (List) obj;
        C1894Bf bf = new C1894Bf();
        bf.f5117a = new C1894Bf.C1895a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C1894Bf.C1895a[] aVarArr = bf.f5117a;
            C1892Bd bd = (C1892Bd) list.get(i);
            C1894Bf.C1895a aVar = new C1894Bf.C1895a();
            aVar.f5119a = bd.f5115a;
            aVar.f5120b = bd.f5116b;
            aVarArr[i] = aVar;
        }
        return bf;
    }

    public Object toModel(Object obj) {
        C1894Bf bf = (C1894Bf) obj;
        ArrayList arrayList = new ArrayList(bf.f5117a.length);
        int i = 0;
        while (true) {
            C1894Bf.C1895a[] aVarArr = bf.f5117a;
            if (i >= aVarArr.length) {
                return arrayList;
            }
            C1894Bf.C1895a aVar = aVarArr[i];
            arrayList.add(new C1892Bd(aVar.f5119a, aVar.f5120b));
            i++;
        }
    }
}
