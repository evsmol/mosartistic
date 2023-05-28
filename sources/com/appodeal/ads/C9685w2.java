package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.C9492h;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.w2 */
public final class C9685w2 {

    /* renamed from: a */
    public static C9688c f24513a;

    /* renamed from: b */
    public static C9687b f24514b;

    /* renamed from: c */
    public static C9400p5<C9419q5, C9388o5> f24515c;

    /* renamed from: com.appodeal.ads.w2$a */
    public static class C9686a extends C9464s<C9686a> {
        public C9686a() {
            super("video", Constants.DEBUG_NON_REWARDED_VIDEO);
        }
    }

    /* renamed from: com.appodeal.ads.w2$b */
    public static class C9687b extends C9577u<C9388o5, C9419q5, C9686a> {
        public C9687b(C9688c cVar) {
            super(cVar, AdType.Video, C9492h.m28089b());
            this.f24308z = 1.1f;
            this.f24279A = 1.4f;
        }

        /* renamed from: a */
        public final C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
            return new C9388o5((C9419q5) rVar, adNetwork, d0Var);
        }

        /* renamed from: a */
        public final void mo59242a(JSONObject jSONObject) {
        }

        /* renamed from: b */
        public final void mo59246b(Context context) {
            C9403q1.m27787a().f23830e.mo60590a(context, new C9686a());
        }

        /* renamed from: i */
        public final String mo59247i() {
            return "video_disabled";
        }

        /* renamed from: k */
        public final boolean mo60582k() {
            return C9403q1.m27787a().f23828c;
        }

        /* renamed from: a */
        public final C9420r mo59241a(C9464s sVar) {
            return new C9419q5((C9686a) sVar);
        }

        /* renamed from: a */
        public final boolean mo60581a(C9420r rVar, int i) {
            JSONObject jSONObject;
            AdNetwork b;
            C9419q5 q5Var = (C9419q5) rVar;
            if (q5Var.f23886a.size() == 1 && (jSONObject = q5Var.f23883G) != null && jSONObject == q5Var.mo60594a(i)) {
                String optString = q5Var.f23883G.optString("status");
                if (!TextUtils.isEmpty(optString) && (b = this.f24287e.mo59980b(optString)) != null && b.isVideoShowing()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo60580a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
            AdObjectType adobjecttype;
            if (!z && adNetwork != null && adNetwork.isVideoShowing() && this.f24289g.size() > 1) {
                AdRequestType adrequesttype = this.f24306x;
                C9419q5 q5Var = (C9419q5) adrequesttype;
                int indexOf = this.f24289g.indexOf(adrequesttype);
                C9419q5 q5Var2 = (C9419q5) (indexOf > 0 ? (C9420r) this.f24289g.get(indexOf - 1) : null);
                if (!(q5Var == null || q5Var2 == null || (adobjecttype = q5Var2.f23904s) == null)) {
                    if (str.equals(((C9388o5) adobjecttype).f23269c.getId())) {
                        q5Var.mo60604a(jSONObject);
                    }
                    C9685w2.m28463a().mo60832a(q5Var, 0, false, false);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo60579a(Context context, C9686a aVar) {
            C9409q4.f23839a.getClass();
            if (C9409q4.m27880p()) {
                C9212h5.f23153a.post($$Lambda$t7wn7tiegreeNiUeBj9sJSbvJDM.INSTANCE);
                return;
            }
            super.mo60579a(context, aVar);
        }
    }

    /* renamed from: com.appodeal.ads.w2$c */
    public static class C9688c extends C9678v2<C9388o5, C9419q5> {
        public C9688c() {
            super(C9403q1.m27787a().f23830e);
        }

        /* renamed from: a */
        public final void mo59834a(C9420r rVar, C9229j1 j1Var) {
            C9419q5 q5Var = (C9419q5) rVar;
            C9388o5 o5Var = (C9388o5) j1Var;
            if (C9685w2.f24515c == null) {
                C9685w2.f24515c = new C9400p5<>();
            }
            C9685w2.f24515c.getClass();
            C9251k1.m27409b();
            C9251k1.m27408a();
            this.f22929a.f24307y = null;
            o5Var.f23268b.setVideoShowing(false);
            mo59847c(q5Var);
        }

        /* renamed from: b */
        public final boolean mo59846b() {
            return true;
        }

        /* renamed from: d */
        public final boolean mo59849d(C9420r rVar) {
            return ((C9419q5) rVar).f23883G == null;
        }

        /* renamed from: i */
        public final void mo59852i(C9420r rVar, C9258l lVar) {
            C9419q5 q5Var = (C9419q5) rVar;
            C9388o5 o5Var = (C9388o5) lVar;
            C9403q1.m27787a().f23830e.f23833c = true;
        }

        /* renamed from: j */
        public final void mo59854j(C9420r rVar, C9258l lVar) {
            C9419q5 q5Var = (C9419q5) rVar;
            C9388o5 o5Var = (C9388o5) lVar;
            C9251k1.m27408a();
            if (q5Var != null && !this.f22929a.f24289g.isEmpty()) {
                C9403q1.m27787a().f23830e.f23833c = true;
            }
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ boolean mo59261k(C9420r rVar, C9258l lVar, C9263l2 l2Var) {
            C9419q5 q5Var = (C9419q5) rVar;
            C9388o5 o5Var = (C9388o5) lVar;
            return false;
        }

        /* renamed from: l */
        public final void mo59262l(C9420r rVar, C9258l lVar) {
            C9419q5 q5Var = (C9419q5) rVar;
            C9388o5 o5Var = (C9388o5) lVar;
            q5Var.f23905t = o5Var.f23269c.getEcpm();
            if (q5Var.f23883G == o5Var.f23269c.getJsonData()) {
                q5Var.mo60604a((JSONObject) null);
            }
        }

        /* renamed from: p */
        public final boolean mo59264p(C9420r rVar, C9258l lVar) {
            C9419q5 q5Var = (C9419q5) rVar;
            if (super.mo59264p(q5Var, (C9388o5) lVar) || q5Var.mo60594a(0) == q5Var.f23883G) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public final boolean mo59860q(C9420r rVar, C9258l lVar) {
            C9388o5 o5Var = (C9388o5) lVar;
            JSONObject jSONObject = ((C9419q5) rVar).f23883G;
            return jSONObject == null || (o5Var != null && jSONObject.optString("id").equals(o5Var.f23269c.getId()));
        }

        /* renamed from: r */
        public final void mo59872r(C9420r rVar, C9258l lVar) {
            C9419q5 q5Var = (C9419q5) rVar;
            ((C9388o5) lVar).f23268b.setVideoShowing(true);
        }
    }

    /* renamed from: a */
    public static C9687b m28463a() {
        C9687b bVar = f24514b;
        if (bVar == null) {
            synchronized (C9577u.class) {
                bVar = f24514b;
                if (bVar == null) {
                    bVar = new C9687b(m28465b());
                    f24514b = bVar;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static boolean m28464a(Activity activity, C9401q qVar) {
        if (f24515c == null) {
            f24515c = new C9400p5<>();
        }
        return f24515c.mo60090b(activity, qVar, m28463a());
    }

    /* renamed from: b */
    public static C9688c m28465b() {
        if (f24513a == null) {
            f24513a = new C9688c();
        }
        return f24513a;
    }
}
