package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3744zn;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qn */
public class C3423qn<T, R> implements C3597vn<T, R> {

    /* renamed from: a */
    private final Map<T, C3637wn<R>> f8953a;

    public C3423qn(Map<T, C3637wn<R>> map) {
        this.f8953a = C1848A2.m6818d(map);
    }

    /* renamed from: a */
    public C3744zn<Map<T, R>> get(Map<T, R> map) {
        C3744zn.C3745a.values();
        int[] iArr = new int[3];
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            C3637wn wnVar = this.f8953a.get(next.getKey());
            if (wnVar != null) {
                C3744zn znVar = wnVar.get(next.getValue());
                int ordinal = znVar.f9606a.ordinal();
                iArr[ordinal] = iArr[ordinal] + 1;
                hashMap.put(next.getKey(), znVar.f9607b);
            }
        }
        C3744zn.C3745a aVar = C3744zn.C3745a.NEW;
        if (iArr[0] > 0) {
            return new C3744zn<>(aVar, hashMap);
        }
        C3744zn.C3745a aVar2 = C3744zn.C3745a.REFRESH;
        if (iArr[2] > 0) {
            return new C3744zn<>(aVar2, hashMap);
        }
        return new C3744zn<>(C3744zn.C3745a.NOT_CHANGED, hashMap);
    }
}
