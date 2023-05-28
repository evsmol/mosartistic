package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.h5 */
public class C3019h5 extends C2702X4 {

    /* renamed from: b */
    private final C2106I1 f7947b;

    /* renamed from: c */
    private final C2827b8 f7948c;

    /* renamed from: d */
    private final C3241mn f7949d;

    public C3019h5(C2259L3 l3) {
        this(l3, l3.mo16145x(), C2007F0.m7154g().mo15748k(), new C3241mn());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|(5:23|24|25|26|(3:28|29|30))|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16069a(com.yandex.metrica.impl.p082ob.C2851c0 r8) {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.L3 r0 = r7.mo17012a()
            com.yandex.metrica.impl.ob.b8 r1 = r7.f7948c
            boolean r1 = r1.mo17237l()
            if (r1 != 0) goto L_0x0097
            com.yandex.metrica.impl.ob.Lg r1 = r0.mo16135m()
            boolean r1 = r1.mo16199P()
            if (r1 == 0) goto L_0x001b
            com.yandex.metrica.impl.ob.c0 r8 = com.yandex.metrica.impl.p082ob.C2851c0.m9227e((com.yandex.metrica.impl.p082ob.C2851c0) r8)
            goto L_0x001f
        L_0x001b:
            com.yandex.metrica.impl.ob.c0 r8 = com.yandex.metrica.impl.p082ob.C2851c0.m9225c((com.yandex.metrica.impl.p082ob.C2851c0) r8)
        L_0x001f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.yandex.metrica.impl.ob.mn r2 = r7.f7949d
            android.content.Context r3 = r0.mo16129g()
            com.yandex.metrica.impl.ob.I3 r4 = r0.mo16127e()
            java.lang.String r4 = r4.mo15879b()
            r2.getClass()
            r2 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ all -> 0x004c }
            r5 = 30
            boolean r5 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r5)     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0047
            java.lang.String r3 = com.yandex.metrica.impl.p082ob.C3294nn.m10192a(r3, r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x0047:
            java.lang.String r3 = r3.getInstallerPackageName(r4)     // Catch:{ all -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = ""
        L_0x0051:
            java.lang.String r4 = "appInstaller"
            r1.put(r4, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "preloadInfo"
            com.yandex.metrica.impl.ob.I1 r4 = r7.f7947b     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.v0 r4 = r4.mo18144b()     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.ee r4 = (com.yandex.metrica.impl.p082ob.C2923ee) r4     // Catch:{ all -> 0x0082 }
            boolean r5 = r4.f7753c     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x007f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0082 }
            r2.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "trackingId"
            java.lang.String r6 = r4.f7751a     // Catch:{ all -> 0x007f }
            r2.put(r5, r6)     // Catch:{ all -> 0x007f }
            org.json.JSONObject r5 = r4.f7752b     // Catch:{ all -> 0x007f }
            int r5 = r5.length()     // Catch:{ all -> 0x007f }
            if (r5 <= 0) goto L_0x007f
            java.lang.String r5 = "additionalParams"
            org.json.JSONObject r4 = r4.f7752b     // Catch:{ all -> 0x007f }
            r2.put(r5, r4)     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1.put(r3, r2)     // Catch:{ all -> 0x0082 }
        L_0x0082:
            com.yandex.metrica.impl.ob.a4 r0 = r0.mo16140r()
            java.lang.String r1 = r1.toString()
            com.yandex.metrica.impl.ob.c0 r8 = r8.mo15971f(r1)
            r0.mo17146b(r8)
            com.yandex.metrica.impl.ob.b8 r8 = r7.f7948c
            r0 = 1
            r8.mo17225b((boolean) r0)
        L_0x0097:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3019h5.mo16069a(com.yandex.metrica.impl.ob.c0):boolean");
    }

    C3019h5(C2259L3 l3, C2827b8 b8Var, C2106I1 i1, C3241mn mnVar) {
        super(l3);
        this.f7948c = b8Var;
        this.f7947b = i1;
        this.f7949d = mnVar;
    }
}
