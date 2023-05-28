package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1989Ef;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.T9 */
public class C2557T9 implements ProtobufConverter<C2755Z1, C1989Ef> {
    public Object fromModel(Object obj) {
        C1989Ef.C1990a aVar;
        C2755Z1 z1 = (C2755Z1) obj;
        C1989Ef ef = new C1989Ef();
        Map<String, String> map = z1.f7248a;
        if (map == null) {
            aVar = null;
        } else {
            C1989Ef.C1990a aVar2 = new C1989Ef.C1990a();
            aVar2.f5320a = new C1989Ef.C1990a.C1991a[map.size()];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                C1989Ef.C1990a.C1991a aVar3 = new C1989Ef.C1990a.C1991a();
                aVar3.f5322a = (String) next.getKey();
                aVar3.f5323b = (String) next.getValue();
                aVar2.f5320a[i] = aVar3;
                i++;
            }
            aVar = aVar2;
        }
        ef.f5318a = aVar;
        ef.f5319b = z1.f7249b;
        return ef;
    }

    public Object toModel(Object obj) {
        HashMap hashMap;
        C1989Ef ef = (C1989Ef) obj;
        C1989Ef.C1990a aVar = ef.f5318a;
        if (aVar == null) {
            hashMap = null;
        } else {
            HashMap hashMap2 = new HashMap();
            for (C1989Ef.C1990a.C1991a aVar2 : aVar.f5320a) {
                hashMap2.put(aVar2.f5322a, aVar2.f5323b);
            }
            hashMap = hashMap2;
        }
        return new C2755Z1(hashMap, ef.f5319b);
    }
}
