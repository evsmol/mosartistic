package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2025Ff;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.V9 */
public class C2657V9 implements ProtobufConverter<C2926eh, C2025Ff> {
    public Object fromModel(Object obj) {
        C2926eh ehVar = (C2926eh) obj;
        C2025Ff ff = new C2025Ff();
        ff.f5412a = new C2025Ff.C2026a[ehVar.f7761a.size()];
        for (int i = 0; i < ehVar.f7761a.size(); i++) {
            C2025Ff.C2026a[] aVarArr = ff.f5412a;
            C3034hh hhVar = ehVar.f7761a.get(i);
            C2025Ff.C2026a aVar = new C2025Ff.C2026a();
            aVar.f5418a = hhVar.f7988a;
            List<String> list = hhVar.f7989b;
            aVar.f5419b = new String[list.size()];
            int i2 = 0;
            for (String str : list) {
                aVar.f5419b[i2] = str;
                i2++;
            }
            aVarArr[i] = aVar;
        }
        ff.f5413b = ehVar.f7762b;
        ff.f5414c = ehVar.f7763c;
        ff.f5415d = ehVar.f7764d;
        ff.f5416e = ehVar.f7765e;
        return ff;
    }

    public Object toModel(Object obj) {
        C2025Ff ff = (C2025Ff) obj;
        ArrayList arrayList = new ArrayList(ff.f5412a.length);
        int i = 0;
        while (true) {
            C2025Ff.C2026a[] aVarArr = ff.f5412a;
            if (i >= aVarArr.length) {
                return new C2926eh(arrayList, ff.f5413b, ff.f5414c, ff.f5415d, ff.f5416e);
            }
            C2025Ff.C2026a aVar = aVarArr[i];
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = aVar.f5419b;
            if (strArr != null && strArr.length > 0) {
                arrayList2 = new ArrayList(aVar.f5419b.length);
                int i2 = 0;
                while (true) {
                    String[] strArr2 = aVar.f5419b;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    arrayList2.add(strArr2[i2]);
                    i2++;
                }
            }
            String str = aVar.f5418a;
            if (str == null) {
                str = "";
            }
            arrayList.add(new C3034hh(str, arrayList2));
            i++;
        }
    }
}
