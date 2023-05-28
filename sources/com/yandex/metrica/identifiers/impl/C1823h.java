package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.h */
public final class C1823h {

    /* renamed from: a */
    private final Map f4998a;

    public C1823h(Map map) {
        Intrinsics.checkNotNullParameter(map, "providers");
        this.f4998a = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1823h(java.util.Map r3, int r4) {
        /*
            r2 = this;
            r3 = 1
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0035
            r4 = 3
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            com.yandex.metrica.identifiers.impl.k r0 = new com.yandex.metrica.identifiers.impl.k
            r0.<init>()
            java.lang.String r1 = "google"
            kotlin.Pair r0 = kotlin.TuplesKt.m14544to(r1, r0)
            r1 = 0
            r4[r1] = r0
            com.yandex.metrica.identifiers.impl.r r0 = new com.yandex.metrica.identifiers.impl.r
            r0.<init>()
            java.lang.String r1 = "huawei"
            kotlin.Pair r0 = kotlin.TuplesKt.m14544to(r1, r0)
            r4[r3] = r0
            com.yandex.metrica.identifiers.impl.o r3 = new com.yandex.metrica.identifiers.impl.o
            r3.<init>()
            java.lang.String r0 = "yandex"
            kotlin.Pair r3 = kotlin.TuplesKt.m14544to(r0, r3)
            r0 = 2
            r4[r0] = r3
            java.util.Map r3 = kotlin.collections.MapsKt.mapOf(r4)
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.C1823h.<init>(java.util.Map, int):void");
    }

    /* renamed from: a */
    public final Bundle mo15399a(Context context, String str) {
        C1822g a;
        Intrinsics.checkNotNullParameter(context, "context");
        C1824i iVar = (C1824i) this.f4998a.get(str);
        if (iVar == null || (a = iVar.mo15400a(context)) == null) {
            return null;
        }
        return a.mo15395a();
    }
}
