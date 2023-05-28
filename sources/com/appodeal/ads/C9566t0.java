package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.appodeal.ads.C9710x5;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* renamed from: com.appodeal.ads.t0 */
public final class C9566t0 {

    /* renamed from: a */
    public static final C9586u0 f24257a = new C9586u0();

    /* renamed from: b */
    public static boolean f24258b = true;

    /* renamed from: c */
    public static boolean f24259c = true;

    /* renamed from: d */
    public static C9569c f24260d;

    /* renamed from: e */
    public static C9568b f24261e;

    /* renamed from: f */
    public static C9567a f24262f;

    /* renamed from: com.appodeal.ads.t0$a */
    public static class C9567a extends C9710x5<C9683w0, C9674v0> {
        public C9567a() {
            super(C8998a.BOTTOM);
        }

        /* renamed from: a */
        public final boolean mo59973a(View view) {
            return view instanceof BannerView;
        }

        /* renamed from: c */
        public final void mo59974c(Activity activity) {
            C9566t0.m28247a().mo60839b((Context) activity, new C9570d());
        }
    }

    /* renamed from: com.appodeal.ads.t0$b */
    public static class C9568b extends C9008a6<C9674v0, C9683w0, C9570d> {
        public C9568b(C9569c cVar) {
            super(cVar, AdType.Banner);
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9674v0((C9683w0) rVar, adNetwork, d0Var);
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "banners_disabled";
        }

        /* renamed from: w */
        public final C9464s mo59380w() {
            return new C9570d();
        }

        /* renamed from: x */
        public final C9710x5<C9683w0, C9674v0> mo59381x() {
            return C9566t0.m28252c();
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9683w0((C9570d) sVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
            r0 = r0.f24500u;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60827a(android.content.res.Configuration r3) {
            /*
                r2 = this;
                com.appodeal.ads.r r0 = r2.mo60846f()
                com.appodeal.ads.w0 r0 = (com.appodeal.ads.C9683w0) r0
                if (r0 == 0) goto L_0x0033
                AdObjectType r0 = r0.f23904s
                com.appodeal.ads.v0 r0 = (com.appodeal.ads.C9674v0) r0
                if (r0 == 0) goto L_0x0028
                UnifiedAdType r1 = r0.f23272f
                com.appodeal.ads.unified.UnifiedBanner r1 = (com.appodeal.ads.unified.UnifiedBanner) r1
                if (r1 == 0) goto L_0x0025
                boolean r1 = r1.isRefreshOnRotate()
                if (r1 == 0) goto L_0x0025
                int r0 = r0.f24500u
                r1 = -1
                if (r0 == r1) goto L_0x0025
                int r3 = r3.orientation
                if (r0 == r3) goto L_0x0025
                r3 = 1
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x0033
            L_0x0028:
                com.appodeal.ads.context.b r3 = com.appodeal.ads.context.C9148b.f22956b
                com.appodeal.ads.context.f r3 = r3.f22957a
                android.content.Context r3 = r3.getApplicationContext()
                r2.mo60842c(r3)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9566t0.C9568b.mo60827a(android.content.res.Configuration):void");
        }
    }

    /* renamed from: com.appodeal.ads.t0$c */
    public static class C9569c extends C9136b6<C9674v0, C9683w0> {
        public C9569c() {
            super(C9566t0.f24257a);
        }

        /* renamed from: c */
        public final C9710x5<C9683w0, C9674v0> mo59871c() {
            return C9566t0.m28252c();
        }
    }

    /* renamed from: com.appodeal.ads.t0$d */
    public static class C9570d extends C9464s<C9570d> {
        public C9570d() {
            super(Constants.BANNER, Constants.DEBUG_BANNER);
        }
    }

    /* renamed from: a */
    public static C9568b m28247a() {
        C9568b bVar = f24261e;
        if (bVar == null) {
            synchronized (C9577u.class) {
                bVar = f24261e;
                if (bVar == null) {
                    bVar = new C9568b(m28251b());
                    f24261e = bVar;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m28248a(Activity activity) {
        C9567a c = m28252c();
        C9568b a = m28247a();
        C9710x5.C9714d a2 = c.mo61224a(activity);
        a2.f24599a = null;
        a2.f24600b = C9181f0.HIDDEN;
        if (c.f24585c != null) {
            C9212h5.f23153a.post(new C9681v5(c, a));
        }
    }

    /* renamed from: a */
    public static boolean m28249a(Activity activity, C9726y5 y5Var) {
        return m28252c().mo61231a(activity, y5Var, m28247a());
    }

    /* renamed from: a */
    public static boolean m28250a(Context context) {
        return f24259c && C9182f1.m27298r(context) && C9182f1.m27296p(context) >= 728.0f;
    }

    /* renamed from: b */
    public static C9569c m28251b() {
        if (f24260d == null) {
            f24260d = new C9569c();
        }
        return f24260d;
    }

    /* renamed from: c */
    public static C9567a m28252c() {
        if (f24262f == null) {
            f24262f = new C9567a();
        }
        return f24262f;
    }
}
