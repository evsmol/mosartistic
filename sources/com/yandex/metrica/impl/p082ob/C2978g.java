package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.billing_interface.C1805g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.g */
public final class C2978g {

    /* renamed from: a */
    public static final C2978g f7879a = new C2978g();

    private C2978g() {
    }

    /* renamed from: a */
    public static void m9591a(C2978g gVar, Map map, Map map2, String str, C3137l lVar, C1805g gVar2, int i) {
        C1805g gVar3 = (i & 16) != 0 ? new C1805g() : null;
        Intrinsics.checkNotNullParameter(map, "history");
        Intrinsics.checkNotNullParameter(map2, "newBillingInfo");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(lVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(gVar3, "systemTimeProvider");
        gVar3.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (C1798a aVar : map.values()) {
            if (map2.containsKey(aVar.f4910b)) {
                aVar.f4913e = currentTimeMillis;
            } else {
                C1798a a = lVar.mo17316a(aVar.f4910b);
                if (a != null) {
                    aVar.f4913e = a.f4913e;
                }
            }
        }
        lVar.mo17317a((Map<String, C1798a>) map);
        if (!lVar.mo17318a() && Intrinsics.areEqual((Object) "inapp", (Object) str)) {
            lVar.mo17319b();
        }
    }
}
