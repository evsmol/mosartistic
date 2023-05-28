package com.appodeal.ads;

import com.appodeal.ads.C9430r5;
import com.appodeal.ads.C9737z5;
import com.appodeal.ads.context.C9148b;

/* renamed from: com.appodeal.ads.b6 */
public abstract class C9136b6<AdObjectType extends C9430r5<AdRequestType, ?, ?, ?>, AdRequestType extends C9737z5<AdObjectType>> extends C9678v2<AdObjectType, AdRequestType> {
    public C9136b6(C9192g<AdRequestType, AdObjectType, Object> gVar) {
        super(gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59839a(com.appodeal.ads.C9420r r7, com.appodeal.ads.C9258l r8, boolean r9) {
        /*
            r6 = this;
            com.appodeal.ads.z5 r7 = (com.appodeal.ads.C9737z5) r7
            com.appodeal.ads.r5 r8 = (com.appodeal.ads.C9430r5) r8
            super.mo59839a(r7, r8, (boolean) r9)
            android.app.Activity r7 = com.appodeal.ads.C9326n5.m27544b()
            if (r7 == 0) goto L_0x006f
            com.appodeal.ads.x5 r9 = r6.mo59871c()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f22929a
            com.appodeal.ads.x5$d r1 = r9.mo61224a((android.app.Activity) r7)
            com.appodeal.ads.f0 r2 = r1.f24600b
            com.appodeal.ads.f0 r3 = com.appodeal.ads.C9181f0.VISIBLE
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0026
            com.appodeal.ads.a r1 = r1.f24599a
            if (r1 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 == 0) goto L_0x004a
            boolean r1 = r0.mo60582k()
            if (r1 == 0) goto L_0x004a
            boolean r8 = r8.mo60103f()
            if (r8 != 0) goto L_0x004a
            AdRequestType r8 = r0.f24307y
            com.appodeal.ads.z5 r8 = (com.appodeal.ads.C9737z5) r8
            long r8 = r9.mo61223a(r0, r8)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0045
            r8 = 1
            goto L_0x0046
        L_0x0045:
            r8 = 0
        L_0x0046:
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x006f
            boolean r8 = com.appodeal.ads.utils.C9609c.m28357a((android.app.Activity) r7)
            if (r8 != 0) goto L_0x006f
            com.appodeal.ads.x5 r8 = r6.mo59871c()
            com.appodeal.ads.a r8 = r8.mo61234b(r7)
            com.appodeal.ads.y5 r9 = new com.appodeal.ads.y5
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f22929a
            com.appodeal.ads.segments.g r0 = r0.mo60845e()
            r9.<init>(r0, r8, r5, r4)
            com.appodeal.ads.x5 r8 = r6.mo59871c()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f22929a
            r8.mo61231a((android.app.Activity) r7, (com.appodeal.ads.C9726y5) r9, r0)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9136b6.mo59839a(com.appodeal.ads.r, com.appodeal.ads.l, boolean):void");
    }

    /* renamed from: c */
    public abstract C9710x5<AdRequestType, AdObjectType> mo59871c();

    /* renamed from: h */
    public final void mo59259h(C9420r rVar, C9258l lVar) {
        C9737z5 z5Var = (C9737z5) rVar;
        C9430r5 r5Var = (C9430r5) lVar;
        if (this.f22929a.mo60582k()) {
            this.f22929a.mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
        }
    }

    /* renamed from: k */
    public final boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
        C9430r5 r5Var = (C9430r5) lVar;
        if (!(!((C9737z5) rVar).f23911z) || this.f22929a.f24299q <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59264p(com.appodeal.ads.C9420r r7, com.appodeal.ads.C9258l r8) {
        /*
            r6 = this;
            com.appodeal.ads.z5 r7 = (com.appodeal.ads.C9737z5) r7
            com.appodeal.ads.r5 r8 = (com.appodeal.ads.C9430r5) r8
            boolean r7 = super.mo59264p(r7, r8)
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x004f
            com.appodeal.ads.x5 r7 = r6.mo59871c()
            android.app.Activity r2 = com.appodeal.ads.C9326n5.m27544b()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r3 = r6.f22929a
            com.appodeal.ads.x5$d r2 = r7.mo61224a((android.app.Activity) r2)
            com.appodeal.ads.f0 r4 = r2.f24600b
            com.appodeal.ads.f0 r5 = com.appodeal.ads.C9181f0.VISIBLE
            if (r4 == r5) goto L_0x0027
            com.appodeal.ads.a r2 = r2.f24599a
            if (r2 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x004b
            boolean r2 = r3.mo60582k()
            if (r2 == 0) goto L_0x004b
            boolean r8 = r8.mo60103f()
            if (r8 != 0) goto L_0x004b
            AdRequestType r8 = r3.f24307y
            com.appodeal.ads.z5 r8 = (com.appodeal.ads.C9737z5) r8
            long r7 = r7.mo61223a(r3, r8)
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            if (r7 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9136b6.mo59264p(com.appodeal.ads.r, com.appodeal.ads.l):boolean");
    }

    /* renamed from: r */
    public final void mo59872r(C9420r rVar, C9258l lVar) {
        C9737z5 z5Var;
        C9737z5 z5Var2 = (C9737z5) rVar;
        C9430r5 r5Var = (C9430r5) lVar;
        if (this.f22929a.mo60582k()) {
            if (!z5Var2.f23893h && ((z5Var = (C9737z5) this.f22929a.mo60846f()) == null || z5Var.mo60610b())) {
                this.f22929a.mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
            }
            mo59871c().mo61226a(C9326n5.m27544b(), this.f22929a, z5Var2);
        }
    }
}
