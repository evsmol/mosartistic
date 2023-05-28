package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1805g;

/* renamed from: com.yandex.metrica.impl.ob.d */
public class C2877d implements C3295o {

    /* renamed from: a */
    private final C1805g f7622a;

    public C2877d() {
        this(new C1805g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        r6 = r12.mo17316a(r3.f4910b);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.yandex.metrica.billing_interface.C1798a> mo17427a(com.yandex.metrica.impl.p082ob.C3044i r10, java.util.Map<java.lang.String, com.yandex.metrica.billing_interface.C1798a> r11, com.yandex.metrica.impl.p082ob.C3137l r12) {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0078
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.yandex.metrica.billing_interface.a r3 = (com.yandex.metrica.billing_interface.C1798a) r3
            com.yandex.metrica.billing_interface.g r4 = r9.f7622a
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            com.yandex.metrica.billing_interface.e r6 = r3.f4909a
            com.yandex.metrica.billing_interface.e r7 = com.yandex.metrica.billing_interface.C1803e.INAPP
            if (r6 != r7) goto L_0x0045
            boolean r6 = r12.mo17318a()
            if (r6 != 0) goto L_0x0045
            long r6 = r3.f4912d
            long r4 = r4 - r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            int r7 = r10.f8021b
            long r7 = (long) r7
            long r6 = r6.toMillis(r7)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0071
            goto L_0x006f
        L_0x0045:
            java.lang.String r6 = r3.f4910b
            com.yandex.metrica.billing_interface.a r6 = r12.mo17316a((java.lang.String) r6)
            if (r6 != 0) goto L_0x004e
            goto L_0x006f
        L_0x004e:
            java.lang.String r7 = r6.f4911c
            java.lang.String r8 = r3.f4911c
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0059
            goto L_0x006f
        L_0x0059:
            com.yandex.metrica.billing_interface.e r7 = r3.f4909a
            com.yandex.metrica.billing_interface.e r8 = com.yandex.metrica.billing_interface.C1803e.SUBS
            if (r7 != r8) goto L_0x0071
            long r6 = r6.f4913e
            long r4 = r4 - r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            int r7 = r10.f8020a
            long r7 = (long) r7
            long r6 = r6.toMillis(r7)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0071
        L_0x006f:
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r4 == 0) goto L_0x000d
            r0.put(r2, r3)
            goto L_0x000d
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2877d.mo17427a(com.yandex.metrica.impl.ob.i, java.util.Map, com.yandex.metrica.impl.ob.l):java.util.Map");
    }

    C2877d(C1805g gVar) {
        this.f7622a = gVar;
    }
}
