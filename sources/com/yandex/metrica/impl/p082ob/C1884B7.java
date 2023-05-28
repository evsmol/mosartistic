package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.B7 */
public class C1884B7 {

    /* renamed from: c */
    private static final C1884B7 f5091c = new C1884B7(new C2826b7());

    /* renamed from: a */
    private final C2826b7 f5092a;

    /* renamed from: b */
    private C1885a f5093b = C1885a.BLANK;

    /* renamed from: com.yandex.metrica.impl.ob.B7$a */
    private enum C1885a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    C1884B7(C2826b7 b7Var) {
        this.f5092a = b7Var;
    }

    /* renamed from: a */
    public static C1884B7 m6911a() {
        return f5091c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.f5093b = com.yandex.metrica.impl.p082ob.C1884B7.C1885a.f5095b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0024, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x001f */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo15549b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.B7$a r0 = r5.f5093b     // Catch:{ all -> 0x0025 }
            com.yandex.metrica.impl.ob.B7$a r1 = com.yandex.metrica.impl.p082ob.C1884B7.C1885a.LOADED     // Catch:{ all -> 0x0025 }
            r2 = 1
            if (r0 != r1) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            com.yandex.metrica.impl.ob.B7$a r3 = com.yandex.metrica.impl.p082ob.C1884B7.C1885a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r4 = 0
            if (r0 != r3) goto L_0x0011
            monitor-exit(r5)
            return r4
        L_0x0011:
            com.yandex.metrica.impl.ob.b7 r0 = r5.f5092a     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "appmetrica-service-native"
            r0.getClass()     // Catch:{ all -> 0x001f }
            java.lang.System.loadLibrary(r3)     // Catch:{ all -> 0x001f }
            r5.f5093b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r2
        L_0x001f:
            com.yandex.metrica.impl.ob.B7$a r0 = com.yandex.metrica.impl.p082ob.C1884B7.C1885a.LOADING_ERROR     // Catch:{ all -> 0x0025 }
            r5.f5093b = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r5)
            return r4
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1884B7.mo15549b():boolean");
    }
}
