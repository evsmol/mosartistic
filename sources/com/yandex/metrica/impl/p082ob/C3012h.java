package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1805g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.h */
public final class C3012h implements C3295o {

    /* renamed from: a */
    private final C1805g f7940a;

    public C3012h(C1805g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "systemTimeProvider");
        this.f7940a = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        if ((r3 - r5.f4913e) >= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f8020a)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if ((r3 - r2.f4912d) <= java.util.concurrent.TimeUnit.SECONDS.toMillis((long) r10.f8021b)) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x001c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.yandex.metrica.billing_interface.C1798a> mo17427a(com.yandex.metrica.impl.p082ob.C3044i r10, java.util.Map<java.lang.String, ? extends com.yandex.metrica.billing_interface.C1798a> r11, com.yandex.metrica.impl.p082ob.C3137l r12) {
        /*
            r9 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "history"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x001c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.yandex.metrica.billing_interface.a r2 = (com.yandex.metrica.billing_interface.C1798a) r2
            com.yandex.metrica.billing_interface.g r3 = r9.f7940a
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            com.yandex.metrica.billing_interface.e r5 = r2.f4909a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.C1803e.INAPP
            r7 = 1
            if (r5 != r6) goto L_0x0055
            boolean r5 = r12.mo17318a()
            if (r5 != 0) goto L_0x0055
            long r5 = r2.f4912d
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f8021b
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0085
            goto L_0x0086
        L_0x0055:
            java.lang.String r5 = r2.f4910b
            com.yandex.metrica.billing_interface.a r5 = r12.mo17316a((java.lang.String) r5)
            if (r5 == 0) goto L_0x0086
            java.lang.String r6 = "storage[historyEntry.sku] ?: return true"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = r5.f4911c
            java.lang.String r8 = r2.f4911c
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x006e
            goto L_0x0086
        L_0x006e:
            com.yandex.metrica.billing_interface.e r2 = r2.f4909a
            com.yandex.metrica.billing_interface.e r6 = com.yandex.metrica.billing_interface.C1803e.SUBS
            if (r2 != r6) goto L_0x0085
            long r5 = r5.f4913e
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            int r5 = r10.f8020a
            long r5 = (long) r5
            long r5 = r2.toMillis(r5)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x001c
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x001c
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3012h.mo17427a(com.yandex.metrica.impl.ob.i, java.util.Map, com.yandex.metrica.impl.ob.l):java.util.Map");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3012h(C1805g gVar, int i) {
        this((i & 1) != 0 ? new C1805g() : null);
    }
}
