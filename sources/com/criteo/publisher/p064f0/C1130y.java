package com.criteo.publisher.p064f0;

import com.criteo.publisher.C1330x;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p074n0.C1300g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.f0.y */
/* compiled from: MetricSendingTask.kt */
public final class C1130y extends C1330x {

    /* renamed from: c */
    private final C1124u f3615c;

    /* renamed from: d */
    private final C1166g f3616d;

    /* renamed from: e */
    private final C1300g f3617e;

    public C1130y(C1124u uVar, C1166g gVar, C1300g gVar2) {
        Intrinsics.checkParameterIsNotNull(uVar, "queue");
        Intrinsics.checkParameterIsNotNull(gVar, "api");
        Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
        this.f3615c = uVar;
        this.f3616d = gVar;
        this.f3617e = gVar2;
    }

    /* renamed from: a */
    public void mo3040a() {
        List a = this.f3615c.mo3194a(this.f3617e.mo3632d());
        if (!a.isEmpty()) {
            List mutableList = CollectionsKt.toMutableList(a);
            try {
                for (Map.Entry next : m5215a(a).entrySet()) {
                    this.f3616d.mo3268a((C1121t) next.getKey());
                    mutableList.removeAll((Collection) next.getValue());
                }
            } finally {
                if (!mutableList.isEmpty()) {
                    m5216b(mutableList);
                }
            }
        }
    }

    /* renamed from: a */
    private final Map<C1121t, Collection<C1112n>> m5215a(Collection<? extends C1112n> collection) {
        String q = this.f3617e.mo3645q();
        Intrinsics.checkExpressionValueIsNotNull(q, "buildConfigWrapper.sdkVersion");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : collection) {
            Integer f = ((C1112n) next).mo3136f();
            if (f == null) {
                f = Integer.valueOf(C1147a.FALLBACK.mo3243a());
            }
            Object obj = linkedHashMap.get(f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(f, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
            linkedHashMap2.put(C1121t.m5183a((Collection) entry.getValue(), q, ((Number) key).intValue()), entry.getValue());
        }
        return linkedHashMap2;
    }

    /* renamed from: b */
    private final void m5216b(Collection<? extends C1112n> collection) {
        for (C1112n a : collection) {
            this.f3615c.mo3195a(a);
        }
    }
}
