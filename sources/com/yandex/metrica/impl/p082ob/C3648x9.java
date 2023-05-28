package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3566v3;
import com.yandex.metrica.impl.p082ob.C3699yf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.x9 */
public final class C3648x9 implements ProtobufConverter<C3566v3, C3699yf> {
    /* renamed from: a */
    private final C3699yf.C3700a m10996a(C3566v3.C3567a aVar) {
        C3699yf.C3701b bVar;
        C3699yf.C3700a aVar2 = new C3699yf.C3700a();
        Map<String, String> b = aVar.mo18318b();
        int i = 0;
        if (b != null) {
            bVar = new C3699yf.C3701b();
            int size = b.size();
            C3699yf.C3701b.C3702a[] aVarArr = new C3699yf.C3701b.C3702a[size];
            for (int i2 = 0; i2 < size; i2++) {
                aVarArr[i2] = new C3699yf.C3701b.C3702a();
            }
            bVar.f9520a = aVarArr;
            int i3 = 0;
            for (Map.Entry next : b.entrySet()) {
                C3699yf.C3701b.C3702a[] aVarArr2 = bVar.f9520a;
                aVarArr2[i3].f9522a = (String) next.getKey();
                aVarArr2[i3].f9523b = (String) next.getValue();
                i3++;
            }
        } else {
            bVar = null;
        }
        aVar2.f9518a = bVar;
        int ordinal = aVar.mo17550a().ordinal();
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        }
        aVar2.f9519b = i;
        return aVar2;
    }

    public Object fromModel(Object obj) {
        C3566v3 v3Var = (C3566v3) obj;
        C3699yf yfVar = new C3699yf();
        yfVar.f9515a = m10996a(v3Var.mo18314c());
        int size = v3Var.mo16767a().size();
        C3699yf.C3700a[] aVarArr = new C3699yf.C3700a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = m10996a(v3Var.mo16767a().get(i));
        }
        yfVar.f9516b = aVarArr;
        return yfVar;
    }

    public Object toModel(Object obj) {
        C3699yf yfVar = (C3699yf) obj;
        C3699yf.C3700a aVar = yfVar.f9515a;
        if (aVar == null) {
            aVar = new C3699yf.C3700a();
        }
        C3566v3.C3567a a = m10995a(aVar);
        C3699yf.C3700a[] aVarArr = yfVar.f9516b;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3699yf.C3700a aVar2 : aVarArr) {
            Intrinsics.checkNotNullExpressionValue(aVar2, "it");
            arrayList.add(m10995a(aVar2));
        }
        return new C3566v3(a, arrayList);
    }

    /* renamed from: a */
    private final C3566v3.C3567a m10995a(C3699yf.C3700a aVar) {
        C3522u0 u0Var;
        C3699yf.C3701b bVar = aVar.f9518a;
        Map<String, String> a = bVar != null ? m10997a(bVar) : null;
        int i = aVar.f9519b;
        if (i == 0) {
            u0Var = C3522u0.UNDEFINED;
        } else if (i == 1) {
            u0Var = C3522u0.APP;
        } else if (i == 2) {
            u0Var = C3522u0.SATELLITE;
        } else if (i != 3) {
            u0Var = C3522u0.UNDEFINED;
        } else {
            u0Var = C3522u0.RETAIL;
        }
        return new C3566v3.C3567a(a, u0Var);
    }

    /* renamed from: a */
    private final Map<String, String> m10997a(C3699yf.C3701b bVar) {
        C3699yf.C3701b.C3702a[] aVarArr = bVar.f9520a;
        Intrinsics.checkNotNullExpressionValue(aVarArr, "proto.pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(aVarArr.length), 16));
        for (C3699yf.C3701b.C3702a aVar : aVarArr) {
            Pair pair = TuplesKt.m14544to(aVar.f9522a, aVar.f9523b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
