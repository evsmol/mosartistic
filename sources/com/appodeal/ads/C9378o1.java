package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9492h;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.o1 */
public final class C9378o1 {

    /* renamed from: a */
    public static C9380b f23799a;

    /* renamed from: b */
    public static C9379a f23800b;

    /* renamed from: c */
    public static C9251k1<C9425r1, C9394p1> f23801c;

    /* renamed from: com.appodeal.ads.o1$a */
    public static class C9379a extends C9577u<C9394p1, C9425r1, C9381c> {
        public C9379a(C9380b bVar) {
            super(bVar, AdType.Interstitial, C9492h.m28089b());
            this.f24308z = 1.1f;
            this.f24279A = 1.4f;
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9394p1((C9425r1) rVar, adNetwork, d0Var);
        }

        /* renamed from: a */
        public final void mo59242a(JSONObject jSONObject) {
        }

        /* renamed from: b */
        public final void mo59246b(Context context) {
            C9403q1.m27787a().f23829d.mo60590a(context, new C9381c());
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "interstitials_disabled";
        }

        /* renamed from: k */
        public final boolean mo60582k() {
            return C9403q1.m27787a().f23828c;
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9425r1((C9381c) sVar);
        }

        /* renamed from: a */
        public final boolean mo60581a(C9420r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b;
            C9425r1 r1Var = (C9425r1) rVar;
            if (r1Var.f23886a.size() == 1 && (jSONObject = r1Var.f23883G) != null && jSONObject == r1Var.mo60594a(i)) {
                String optString = r1Var.f23883G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b = this.f24287e.mo59980b(optString)) != null && b.isInterstitialShowing()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo60580a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isInterstitialShowing() && this.f24289g.size() > 1) {
                AdRequestType adrequesttype = this.f24306x;
                C9425r1 r1Var = (C9425r1) adrequesttype;
                int indexOf = this.f24289g.indexOf(adrequesttype);
                C9425r1 r1Var2 = (C9425r1) (indexOf > 0 ? (C9420r) this.f24289g.get(indexOf - 1) : null);
                if (!(r1Var == null || r1Var2 == null || (adobjecttype = r1Var2.f23904s) == null)) {
                    if (str.equals(((C9394p1) adobjecttype).f23269c.getId())) {
                        r1Var.mo60604a(jSONObject);
                    }
                    C9378o1.m27718a().mo60832a(r1Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo60579a(Context context, C9464s sVar) {
            C9381c cVar = (C9381c) sVar;
            C9409q4.f23839a.getClass();
            if (C9409q4.m27880p()) {
                C9212h5.f23153a.post(new C9322n1());
                return;
            }
            super.mo60579a(context, cVar);
        }
    }

    /* renamed from: com.appodeal.ads.o1$b */
    public static class C9380b extends C9678v2<C9394p1, C9425r1> {
        public C9380b() {
            super(C9403q1.m27787a().f23829d);
        }

        /* renamed from: a */
        public final void mo59834a(C9420r rVar, C9229j1 j1Var) {
            C9425r1 r1Var = (C9425r1) rVar;
            C9394p1 p1Var = (C9394p1) j1Var;
            if (C9378o1.f23801c == null) {
                C9378o1.f23801c = new C9251k1<>();
            }
            C9378o1.f23801c.getClass();
            C9251k1.m27409b();
            C9251k1.m27408a();
            this.f22929a.f24307y = null;
            p1Var.f23268b.setInterstitialShowing(false);
            if (!r1Var.f23911z && this.f22929a.f24299q > 0 && r1Var.f23898m > 0 && System.currentTimeMillis() - r1Var.f23898m >= ((long) this.f22929a.f24299q)) {
                mo59853i(r1Var, p1Var, (C9263l2) null);
            }
            mo59847c(r1Var);
        }

        /* renamed from: d */
        public final boolean mo59849d(C9420r rVar) {
            return ((C9425r1) rVar).f23883G == null;
        }

        /* renamed from: i */
        public final void mo59852i(C9420r rVar, C9258l lVar) {
            C9425r1 r1Var = (C9425r1) rVar;
            C9394p1 p1Var = (C9394p1) lVar;
            C9403q1.m27787a().f23829d.f23833c = true;
        }

        /* renamed from: j */
        public final void mo59854j(C9420r rVar, C9258l lVar) {
            C9425r1 r1Var = (C9425r1) rVar;
            C9394p1 p1Var = (C9394p1) lVar;
            C9251k1.m27408a();
            if (r1Var != null && !this.f22929a.f24289g.isEmpty()) {
                C9403q1.m27787a().f23829d.f23833c = true;
            }
        }

        /* renamed from: k */
        public final boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9394p1 p1Var = (C9394p1) lVar;
            if (!(!((C9425r1) rVar).f23911z) || this.f22929a.f24299q <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public final void mo59262l(C9420r rVar, C9258l lVar) {
            C9425r1 r1Var = (C9425r1) rVar;
            C9394p1 p1Var = (C9394p1) lVar;
            r1Var.f23905t = p1Var.f23269c.getEcpm();
            if (r1Var.f23883G == p1Var.f23269c.getJsonData()) {
                r1Var.mo60604a((JSONObject) null);
            }
        }

        /* renamed from: p */
        public final boolean mo59264p(C9420r rVar, C9258l lVar) {
            C9425r1 r1Var = (C9425r1) rVar;
            if (super.mo59264p(r1Var, (C9394p1) lVar) || r1Var.mo60594a(0) == r1Var.f23883G) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public final boolean mo59860q(C9420r rVar, C9258l lVar) {
            C9394p1 p1Var = (C9394p1) lVar;
            JSONObject jSONObject = ((C9425r1) rVar).f23883G;
            return jSONObject == null || (p1Var != null && jSONObject.optString("id").equals(p1Var.f23269c.getId()));
        }

        /* renamed from: r */
        public final void mo59872r(C9420r rVar, C9258l lVar) {
            C9425r1 r1Var = (C9425r1) rVar;
            ((C9394p1) lVar).f23268b.setInterstitialShowing(true);
        }
    }

    /* renamed from: com.appodeal.ads.o1$c */
    public static class C9381c extends C9464s<C9381c> {
        public C9381c() {
            super("banner", Constants.DEBUG_INTERSTITIAL);
        }
    }

    /* renamed from: a */
    public static C9379a m27718a() {
        C9379a aVar = f23800b;
        if (aVar == null) {
            synchronized (C9577u.class) {
                aVar = f23800b;
                if (aVar == null) {
                    aVar = new C9379a(m27720b());
                    f23800b = aVar;
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static boolean m27719a(Activity activity, C9401q qVar) {
        if (f23801c == null) {
            f23801c = new C9251k1<>();
        }
        return f23801c.mo60090b(activity, qVar, m27718a());
    }

    /* renamed from: b */
    public static C9380b m27720b() {
        if (f23799a == null) {
            f23799a = new C9380b();
        }
        return f23799a;
    }
}
