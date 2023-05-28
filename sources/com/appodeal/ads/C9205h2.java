package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.appodeal.ads.C9710x5;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* renamed from: com.appodeal.ads.h2 */
public final class C9205h2 {

    /* renamed from: a */
    public static final C9219i2 f23146a = new C9219i2();

    /* renamed from: b */
    public static C9208c f23147b;

    /* renamed from: c */
    public static C9207b f23148c;

    /* renamed from: d */
    public static C9206a f23149d;

    /* renamed from: com.appodeal.ads.h2$a */
    public static class C9206a extends C9710x5<C9253k2, C9230j2> {
        public C9206a() {
            super(C8998a.VIEW);
        }

        /* renamed from: a */
        public final boolean mo59973a(View view) {
            return view instanceof MrecView;
        }

        /* renamed from: c */
        public final void mo59974c(Activity activity) {
            C9205h2.m27336a().mo60839b((Context) activity, new C9209d());
        }
    }

    /* renamed from: com.appodeal.ads.h2$b */
    public static class C9207b extends C9008a6<C9230j2, C9253k2, C9209d> {
        public C9207b(C9208c cVar) {
            super(cVar, AdType.Mrec);
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9230j2((C9253k2) rVar, adNetwork, d0Var);
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "mrec_disabled";
        }

        /* renamed from: w */
        public final C9464s mo59380w() {
            return new C9209d();
        }

        /* renamed from: x */
        public final C9710x5<C9253k2, C9230j2> mo59381x() {
            return C9205h2.m27340c();
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9253k2((C9209d) sVar);
        }
    }

    /* renamed from: com.appodeal.ads.h2$c */
    public static class C9208c extends C9136b6<C9230j2, C9253k2> {
        public C9208c() {
            super(C9205h2.f23146a);
        }

        /* renamed from: c */
        public final C9710x5<C9253k2, C9230j2> mo59871c() {
            return C9205h2.m27340c();
        }
    }

    /* renamed from: com.appodeal.ads.h2$d */
    public static class C9209d extends C9464s<C9209d> {
        public C9209d() {
            super(Constants.MREC, Constants.DEBUG_MREC);
        }
    }

    /* renamed from: a */
    public static C9207b m27336a() {
        C9207b bVar = f23148c;
        if (bVar == null) {
            synchronized (C9577u.class) {
                bVar = f23148c;
                if (bVar == null) {
                    bVar = new C9207b(m27339b());
                    f23148c = bVar;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m27337a(Activity activity) {
        C9206a c = m27340c();
        C9207b a = m27336a();
        C9710x5.C9714d a2 = c.mo61224a(activity);
        a2.f24599a = null;
        a2.f24600b = C9181f0.HIDDEN;
        if (c.f24585c != null) {
            C9212h5.f23153a.post(new C9681v5(c, a));
        }
    }

    /* renamed from: a */
    public static boolean m27338a(Activity activity, C9726y5 y5Var) {
        return m27340c().mo61231a(activity, y5Var, m27336a());
    }

    /* renamed from: b */
    public static C9208c m27339b() {
        if (f23147b == null) {
            f23147b = new C9208c();
        }
        return f23147b;
    }

    /* renamed from: c */
    public static C9206a m27340c() {
        if (f23149d == null) {
            f23149d = new C9206a();
        }
        return f23149d;
    }
}
