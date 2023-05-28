package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9492h;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.o4 */
public final class C9384o4 {

    /* renamed from: a */
    public static final C9399p4 f23805a = new C9399p4();

    /* renamed from: b */
    public static int f23806b = 90000;

    /* renamed from: c */
    public static C9387c f23807c;

    /* renamed from: d */
    public static C9386b f23808d;

    /* renamed from: e */
    public static C9400p5<C9325n4, C9277m4> f23809e;

    /* renamed from: com.appodeal.ads.o4$a */
    public static class C9385a extends C9464s<C9385a> {
        public C9385a() {
            super("rewarded_video", Constants.DEBUG_REWARDED_VIDEO);
        }
    }

    /* renamed from: com.appodeal.ads.o4$b */
    public static class C9386b extends C9577u<C9277m4, C9325n4, C9385a> {
        public C9386b(C9387c cVar) {
            super(cVar, AdType.Rewarded, C9492h.m28089b());
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9277m4((C9325n4) rVar, adNetwork, d0Var);
        }

        /* renamed from: a */
        public final void mo59242a(JSONObject jSONObject) {
            if (jSONObject.has("max_duration")) {
                C9384o4.f23806b = jSONObject.optInt("max_duration", 0);
            }
        }

        /* renamed from: b */
        public final void mo59246b(Context context) {
            mo60839b(context, new C9385a());
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "rewarded_video_disabled";
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9325n4((C9385a) sVar);
        }

        /* renamed from: a */
        public final boolean mo60581a(C9420r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b;
            C9325n4 n4Var = (C9325n4) rVar;
            if (n4Var.f23886a.size() == 1 && (jSONObject = n4Var.f23883G) != null && jSONObject == n4Var.mo60594a(i)) {
                String optString = n4Var.f23883G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b = this.f24287e.mo59980b(optString)) != null && b.isRewardedShowing()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo60580a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isRewardedShowing() && this.f24289g.size() > 1) {
                AdRequestType adrequesttype = this.f24306x;
                C9325n4 n4Var = (C9325n4) adrequesttype;
                int indexOf = this.f24289g.indexOf(adrequesttype);
                C9325n4 n4Var2 = (C9325n4) (indexOf > 0 ? (C9420r) this.f24289g.get(indexOf - 1) : null);
                if (!(n4Var == null || n4Var2 == null || (adobjecttype = n4Var2.f23904s) == null)) {
                    if (str.equals(((C9277m4) adobjecttype).f23269c.getId())) {
                        n4Var.mo60604a(jSONObject);
                    }
                    C9384o4.m27742a().mo60832a(n4Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.appodeal.ads.o4$c */
    public static class C9387c extends C9678v2<C9277m4, C9325n4> {
        public C9387c() {
            super(C9384o4.f23805a);
        }

        /* renamed from: a */
        public final void mo59834a(C9420r rVar, C9229j1 j1Var) {
            C9325n4 n4Var = (C9325n4) rVar;
            C9277m4 m4Var = (C9277m4) j1Var;
            if (C9384o4.f23809e == null) {
                C9384o4.f23809e = new C9400p5<>();
            }
            C9384o4.f23809e.getClass();
            C9251k1.m27409b();
            C9251k1.m27408a();
            this.f22929a.f24307y = null;
            m4Var.f23268b.setRewardedShowing(false);
            mo59847c(n4Var);
        }

        /* renamed from: b */
        public final boolean mo59846b() {
            return true;
        }

        /* renamed from: d */
        public final boolean mo59849d(C9420r rVar) {
            return ((C9325n4) rVar).f23883G == null;
        }

        /* renamed from: h */
        public final void mo59259h(C9420r rVar, C9258l lVar) {
            C9325n4 n4Var = (C9325n4) rVar;
            C9277m4 m4Var = (C9277m4) lVar;
            if (this.f22929a.mo60582k()) {
                this.f22929a.mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
            }
        }

        /* renamed from: j */
        public final void mo59854j(C9420r rVar, C9258l lVar) {
            C9325n4 n4Var = (C9325n4) rVar;
            C9277m4 m4Var = (C9277m4) lVar;
            C9251k1.m27408a();
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9325n4 n4Var = (C9325n4) rVar;
            C9277m4 m4Var = (C9277m4) lVar;
            return false;
        }

        /* renamed from: l */
        public final void mo59262l(C9420r rVar, C9258l lVar) {
            C9325n4 n4Var = (C9325n4) rVar;
            C9277m4 m4Var = (C9277m4) lVar;
            n4Var.f23905t = m4Var.f23269c.getEcpm();
            if (n4Var.f23883G == m4Var.f23269c.getJsonData()) {
                n4Var.mo60604a((JSONObject) null);
            }
        }

        /* renamed from: p */
        public final boolean mo59264p(C9420r rVar, C9258l lVar) {
            C9325n4 n4Var = (C9325n4) rVar;
            if (super.mo59264p(n4Var, (C9277m4) lVar) || n4Var.mo60594a(0) == n4Var.f23883G) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public final boolean mo59860q(C9420r rVar, C9258l lVar) {
            C9277m4 m4Var = (C9277m4) lVar;
            JSONObject jSONObject = ((C9325n4) rVar).f23883G;
            return jSONObject == null || (m4Var != null && jSONObject.optString("id").equals(m4Var.f23269c.getId()));
        }

        /* renamed from: r */
        public final void mo59872r(C9420r rVar, C9258l lVar) {
            ((C9277m4) lVar).f23268b.setRewardedShowing(true);
            if (!((C9325n4) rVar).f23893h && this.f22929a.mo60582k()) {
                C9325n4 n4Var = (C9325n4) this.f22929a.mo60846f();
                if (n4Var == null || n4Var.mo60610b()) {
                    this.f22929a.mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: a */
    public static C9386b m27742a() {
        C9386b bVar = f23808d;
        if (bVar == null) {
            synchronized (C9577u.class) {
                bVar = f23808d;
                if (bVar == null) {
                    bVar = new C9386b(m27744b());
                    f23808d = bVar;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static boolean m27743a(Activity activity, C9401q qVar) {
        if (f23809e == null) {
            f23809e = new C9400p5<>();
        }
        return f23809e.mo60090b(activity, qVar, m27742a());
    }

    /* renamed from: b */
    public static C9387c m27744b() {
        if (f23807c == null) {
            f23807c = new C9387c();
        }
        return f23807c;
    }

    /* renamed from: c */
    public static double m27745c() {
        return m27742a().mo60845e().mo60741c();
    }

    /* renamed from: d */
    public static String m27746d() {
        return m27742a().mo60845e().mo60742d();
    }
}
