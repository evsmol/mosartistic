package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.p137a.C4748e;

/* renamed from: com.ironsource.mediationsdk.utils.o */
public final class C4731o {

    /* renamed from: f */
    private static C4731o f11985f;

    /* renamed from: a */
    private int f11986a = 1;

    /* renamed from: b */
    private int f11987b = 1;

    /* renamed from: c */
    private int f11988c = 1;

    /* renamed from: d */
    private int f11989d = 1;

    /* renamed from: e */
    private C4748e f11990e = new C4748e();

    /* renamed from: com.ironsource.mediationsdk.utils.o$1 */
    static /* synthetic */ class C47321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11991a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11991a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11991a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11991a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11991a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4731o.C47321.<clinit>():void");
        }
    }

    private C4731o() {
        m13874d(this.f11986a);
        m13875e(this.f11987b);
        m13876f(this.f11989d);
    }

    /* renamed from: a */
    public static synchronized C4731o m13872a() {
        C4731o oVar;
        synchronized (C4731o.class) {
            if (f11985f == null) {
                f11985f = new C4731o();
            }
            oVar = f11985f;
        }
        return oVar;
    }

    /* renamed from: c */
    private static IronSource.AD_UNIT m13873c(int i) {
        if (i == 0) {
            return IronSource.AD_UNIT.OFFERWALL;
        }
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return IronSource.AD_UNIT.BANNER;
    }

    /* renamed from: d */
    private void m13874d(int i) {
        this.f11986a = i;
        this.f11990e.mo34236b(i);
    }

    /* renamed from: e */
    private void m13875e(int i) {
        this.f11987b = i;
        this.f11990e.mo34235a(i);
    }

    /* renamed from: f */
    private void m13876f(int i) {
        this.f11989d = i;
        this.f11990e.mo34237c(i);
    }

    /* renamed from: a */
    public final synchronized void mo34205a(int i) {
        mo34206a(m13873c(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo34206a(com.ironsource.mediationsdk.IronSource.AD_UNIT r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            int[] r0 = com.ironsource.mediationsdk.utils.C4731o.C47321.f11991a     // Catch:{ all -> 0x0039 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0039 }
            r3 = r0[r3]     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r3 == r0) goto L_0x0032
            r1 = 2
            if (r3 == r1) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r2.f11989d     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m13876f(r3)     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            int r3 = r2.f11987b     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m13875e(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x002a:
            int r3 = r2.f11986a     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m13874d(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0032:
            int r3 = r2.f11988c     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.f11988c = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4731o.mo34206a(com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }

    /* renamed from: b */
    public final synchronized int mo34207b(int i) {
        return mo34208b(m13873c(i));
    }

    /* renamed from: b */
    public final synchronized int mo34208b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = C47321.f11991a[ad_unit.ordinal()];
        if (i == 1) {
            return this.f11988c;
        } else if (i == 2) {
            return this.f11986a;
        } else if (i == 3) {
            return this.f11987b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.f11989d;
        }
    }
}
