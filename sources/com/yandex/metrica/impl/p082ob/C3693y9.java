package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.yandex.metrica.impl.ob.y9 */
public final class C3693y9 implements Converter<Map<String, ? extends List<? extends String>>, C2121If.C2127d[]> {
    /* renamed from: a */
    public C2121If.C2127d[] fromModel(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C2121If.C2127d[] dVarArr = new C2121If.C2127d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new C2121If.C2127d();
        }
        int i2 = 0;
        for (T next : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            dVarArr[i2].f5619a = (String) entry.getKey();
            C2121If.C2127d dVar = dVarArr[i2];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array != null) {
                dVar.f5620b = (String[]) array;
                i2 = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return dVarArr;
    }

    /* renamed from: a */
    public Map<String, List<String>> toModel(C2121If.C2127d[] dVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(dVarArr.length), 16));
        for (C2121If.C2127d dVar : dVarArr) {
            String str = dVar.f5619a;
            String[] strArr = dVar.f5620b;
            Intrinsics.checkNotNullExpressionValue(strArr, "it.hosts");
            Pair pair = TuplesKt.m14544to(str, ArraysKt.toList((T[]) strArr));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
