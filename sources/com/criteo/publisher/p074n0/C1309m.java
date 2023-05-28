package com.criteo.publisher.p074n0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.n0.m */
/* compiled from: MapUtil.kt */
public final class C1309m {
    /* renamed from: a */
    public static final <K, V> V m5776a(ConcurrentMap<K, V> concurrentMap, K k, Function0<? extends V> function0) {
        Intrinsics.checkParameterIsNotNull(concurrentMap, "$this$getOrCompute");
        Intrinsics.checkParameterIsNotNull(function0, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V invoke = function0.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
        return putIfAbsent != null ? putIfAbsent : invoke;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m5777a(Map<K, ? extends V> map) {
        Intrinsics.checkParameterIsNotNull(map, "$this$filterNotNullValues");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }
}
