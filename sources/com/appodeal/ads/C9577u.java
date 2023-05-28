package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.C9258l;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.C9464s;
import com.appodeal.ads.Native;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.libs.network.NetworkStateObserver;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.segments.C9492h;
import com.appodeal.ads.segments.C9499k;
import com.appodeal.ads.segments.C9502m;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.utils.C9614c0;
import com.appodeal.ads.utils.C9640o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.app.C9605a;
import com.appodeal.ads.utils.app.C9606b;
import com.appodeal.ads.waterfall_filter.C9692a;
import com.appodeal.ads.waterfall_filter.C9695d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.u */
public abstract class C9577u<AdObjectType extends C9258l, AdRequestType extends C9420r<AdObjectType>, RequestParamsType extends C9464s> {

    /* renamed from: E */
    public static final /* synthetic */ boolean f24278E = (!C9577u.class.desiredAssertionStatus());

    /* renamed from: A */
    public float f24279A;

    /* renamed from: B */
    public int f24280B;

    /* renamed from: C */
    public final C9578a f24281C;

    /* renamed from: D */
    public RequestParamsType f24282D;

    /* renamed from: a */
    public final LinkedBlockingQueue f24283a = new LinkedBlockingQueue();

    /* renamed from: b */
    public ThreadPoolExecutor f24284b;

    /* renamed from: c */
    public final NetworkStatus f24285c;

    /* renamed from: d */
    public final C9128b0<AdObjectType, AdRequestType, ?> f24286d;

    /* renamed from: e */
    public final C9213i f24287e;

    /* renamed from: f */
    public final AdType f24288f;

    /* renamed from: g */
    public final ArrayList f24289g;

    /* renamed from: h */
    public boolean f24290h;

    /* renamed from: i */
    public boolean f24291i;

    /* renamed from: j */
    public boolean f24292j;

    /* renamed from: k */
    public boolean f24293k;

    /* renamed from: l */
    public C9490g f24294l;

    /* renamed from: m */
    public String f24295m;

    /* renamed from: n */
    public C9692a f24296n;

    /* renamed from: o */
    public long f24297o;

    /* renamed from: p */
    public Integer f24298p;

    /* renamed from: q */
    public int f24299q;

    /* renamed from: r */
    public String f24300r;

    /* renamed from: s */
    public boolean f24301s;

    /* renamed from: t */
    public boolean f24302t;

    /* renamed from: u */
    public boolean f24303u;

    /* renamed from: v */
    public boolean f24304v;

    /* renamed from: w */
    public boolean f24305w;

    /* renamed from: x */
    public AdRequestType f24306x;

    /* renamed from: y */
    public AdRequestType f24307y;

    /* renamed from: z */
    public float f24308z;

    /* renamed from: com.appodeal.ads.u$a */
    public class C9578a extends C9614c0 {
        public C9578a() {
        }

        /* renamed from: a */
        public final void mo59983a(Activity activity, AppState appState) {
            C9577u.this.mo59377a(activity, appState);
        }

        /* renamed from: a */
        public final void mo59984a(Configuration configuration) {
            C9577u.this.mo60827a(configuration);
        }
    }

    /* renamed from: com.appodeal.ads.u$b */
    public class C9579b implements C9503n.C9504a {
        public C9579b() {
        }

        /* renamed from: a */
        public final void mo60756a() {
            C9577u.this.f24292j = true;
        }
    }

    /* renamed from: com.appodeal.ads.u$c */
    public class C9580c implements C9492h.C9493a {
        public C9580c() {
        }

        /* renamed from: a */
        public final String mo60745a() {
            return C9577u.this.f24295m;
        }

        /* renamed from: b */
        public final C9490g mo60747b() {
            return C9577u.this.f24294l;
        }

        /* renamed from: a */
        public final void mo60746a(C9490g gVar) {
            C9577u uVar = C9577u.this;
            uVar.f24294l = gVar;
            uVar.f24295m = null;
        }
    }

    /* renamed from: com.appodeal.ads.u$d */
    public class C9581d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9420r f24312a;

        /* renamed from: b */
        public final /* synthetic */ C9258l f24313b;

        public C9581d(C9420r rVar, C9258l lVar) {
            this.f24312a = rVar;
            this.f24313b = lVar;
        }

        public final void run() {
            C9577u.this.f24286d.mo59838a(this.f24312a, this.f24313b, LoadingError.TimeoutError);
        }
    }

    public C9577u(C9128b0<AdObjectType, AdRequestType, ?> b0Var, AdType adType, C9490g gVar) {
        NetworkStatus networkStatus = NetworkStatus.INSTANCE;
        this.f24285c = networkStatus;
        mo60841c();
        this.f24289g = new ArrayList();
        this.f24290h = false;
        this.f24291i = false;
        this.f24292j = false;
        this.f24293k = true;
        this.f24297o = 0;
        this.f24298p = null;
        this.f24299q = 0;
        this.f24301s = false;
        this.f24303u = false;
        this.f24304v = false;
        this.f24305w = false;
        this.f24308z = 1.2f;
        this.f24279A = 2.0f;
        this.f24280B = 5000;
        this.f24281C = new C9578a();
        this.f24282D = null;
        this.f24286d = b0Var;
        this.f24288f = adType;
        this.f24294l = gVar;
        this.f24287e = C9213i.m27351a(adType);
        b0Var.mo59841a((C9577u<AdObjectType, AdRequestType, ?>) this);
        C9503n.m28135a(new C9579b());
        C9492h.m28086a(new C9580c());
        networkStatus.subscribe(new NetworkStateObserver.ConnectionListener() {
            public final void onConnectionUpdated(boolean z) {
                C9577u.this.m28267a(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28267a(boolean z) {
        if (z) {
            mo59378t();
        }
    }

    /* renamed from: a */
    public int mo59239a(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z) {
        return 1;
    }

    /* renamed from: a */
    public abstract C9258l mo59240a(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var);

    /* renamed from: a */
    public abstract AdRequestType mo59241a(RequestParamsType requestparamstype);

    /* renamed from: a */
    public void mo59377a(Activity activity, AppState appState) {
    }

    /* renamed from: a */
    public void mo60827a(Configuration configuration) {
    }

    /* renamed from: a */
    public final void mo60834a(C9490g gVar) {
        this.f24294l = gVar;
    }

    /* renamed from: a */
    public final void mo60835a(String str) {
        this.f24295m = str;
    }

    /* renamed from: a */
    public abstract void mo59242a(JSONObject jSONObject);

    /* renamed from: a */
    public boolean mo60838a() {
        return !(this instanceof Native.C8988a);
    }

    /* renamed from: a */
    public boolean mo60580a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z) {
        return false;
    }

    /* renamed from: a */
    public boolean mo59243a(AdRequestType adrequesttype) {
        return !adrequesttype.f23887b.isEmpty();
    }

    /* renamed from: a */
    public boolean mo60581a(AdRequestType adrequesttype, int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo59244a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.mo60606a(adobjecttype, this.f24294l, this.f24288f);
    }

    /* renamed from: b */
    public void mo59245b() {
        for (int i = 0; i < this.f24289g.size(); i++) {
            AdRequestType adrequesttype = (C9420r) this.f24289g.get(i);
            if (!(adrequesttype == null || adrequesttype.f23881E || adrequesttype == this.f24306x || adrequesttype == this.f24307y)) {
                adrequesttype.mo60611c();
            }
        }
    }

    /* renamed from: b */
    public abstract void mo59246b(Context context);

    /* renamed from: c */
    public final void mo60841c() {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f24284b = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0, TimeUnit.MICROSECONDS, this.f24283a);
    }

    /* renamed from: c */
    public final void mo60842c(Context context) {
        if (C9409q4.f23840b) {
            this.f24303u = true;
        } else {
            mo59246b(context);
        }
    }

    /* renamed from: d */
    public final AdType mo60843d() {
        return this.f24288f;
    }

    /* renamed from: d */
    public final void mo60844d(Context context) {
        C9420r f = mo60846f();
        if (f != null && mo60582k()) {
            return;
        }
        if (f == null || f.mo60610b() || this.f24292j) {
            mo60842c(context);
        } else if (f.f23906u) {
            this.f24286d.mo59851g(f, f.f23904s);
        }
    }

    /* renamed from: e */
    public final C9490g mo60845e() {
        C9490g gVar = this.f24294l;
        return gVar == null ? C9492h.m28084a(RewardedVideo.VIDEO_MODE_DEFAULT) : gVar;
    }

    /* renamed from: f */
    public final AdRequestType mo60846f() {
        AdRequestType adrequesttype;
        if (this.f24289g.isEmpty()) {
            adrequesttype = null;
        } else {
            ArrayList arrayList = this.f24289g;
            adrequesttype = (C9420r) arrayList.get(arrayList.size() - 1);
        }
        while (adrequesttype != null) {
            AdRequestType adrequesttype2 = adrequesttype.f23884H;
            if (adrequesttype2 == null || adrequesttype2.f23905t < adrequesttype.f23905t) {
                break;
            }
            adrequesttype = adrequesttype2;
        }
        return adrequesttype;
    }

    /* renamed from: g */
    public final C9213i mo60847g() {
        return this.f24287e;
    }

    /* renamed from: h */
    public final double mo60848h() {
        C9499k.C9500a aVar = C9503n.m28137c().f24114b;
        AdType adType = this.f24288f;
        JSONObject optJSONObject = aVar.f24118a.optJSONObject("price_floor");
        if (optJSONObject != null) {
            return optJSONObject.optDouble(C9502m.m28129a(adType), -1.0d);
        }
        return -1.0d;
    }

    /* renamed from: i */
    public abstract String mo59247i();

    /* renamed from: j */
    public final void mo60849j() {
        if (this.f24291i && mo60582k()) {
            C9420r f = mo60846f();
            if (f == null || (f.mo60610b() && !f.f23882F)) {
                mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
            }
        }
    }

    /* renamed from: k */
    public boolean mo60582k() {
        return this.f24293k;
    }

    /* renamed from: l */
    public boolean mo60850l() {
        return !(this instanceof Native.C8988a);
    }

    /* renamed from: m */
    public final boolean mo60851m() {
        return this.f24290h;
    }

    /* renamed from: n */
    public final boolean mo60852n() {
        return C9503n.m28137c().f24114b.mo60755a(this.f24288f);
    }

    /* renamed from: o */
    public final boolean mo60853o() {
        return this.f24291i;
    }

    /* renamed from: p */
    public final boolean mo60854p() {
        return this.f24292j;
    }

    /* renamed from: q */
    public final void mo60855q() {
        if (!this.f24291i) {
            return;
        }
        if (mo59379u() || (!this.f24305w && mo60582k())) {
            this.f24305w = true;
            this.f24303u = false;
            mo59248s();
        }
    }

    /* renamed from: r */
    public final Long mo60856r() {
        C9420r f = mo60846f();
        return Long.valueOf(f != null ? f.mo60633x().longValue() : -1);
    }

    /* renamed from: s */
    public void mo59248s() {
        mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
    }

    /* renamed from: t */
    public void mo59378t() {
        if (this.f24304v && mo60582k()) {
            this.f24304v = false;
            mo60842c(C9148b.f22956b.f22957a.getApplicationContext());
        }
    }

    /* renamed from: u */
    public boolean mo59379u() {
        return this.f24303u;
    }

    /* renamed from: v */
    public boolean mo60857v() {
        return !(this instanceof Native.C8988a);
    }

    /* renamed from: com.appodeal.ads.u$e */
    public class C9582e {

        /* renamed from: a */
        public final AdRequestType f24315a;

        /* renamed from: b */
        public final String f24316b;

        /* renamed from: com.appodeal.ads.u$e$a */
        public class C9583a implements Runnable {
            public final void run() {
                TestActivity testActivity = C9409q4.f23842d;
                testActivity.mo59341d();
                testActivity.mo59339b();
            }
        }

        /* renamed from: com.appodeal.ads.u$e$b */
        public class C9584b implements Runnable {
            public C9584b() {
            }

            public final void run() {
                C9409q4.m27875k().mo60324a(C9577u.this.f24288f);
            }
        }

        /* renamed from: com.appodeal.ads.u$e$c */
        public class C9585c implements NetworkInitializationListener {
            public final void onInitializationFailed(LoadingError loadingError) {
            }

            public final void onInitializationFinished(Object obj) {
            }
        }

        public C9582e(AdRequestType adrequesttype, String str) {
            this.f24315a = adrequesttype;
            this.f24316b = str;
        }

        /* renamed from: a */
        public final void mo60859a(LoadingError loadingError) {
            C9577u.this.f24286d.mo59845b(this.f24315a, (C9258l) null, (C9263l2) null, loadingError);
        }

        /* renamed from: a */
        public final void mo60860a(JSONObject jSONObject) {
            if (jSONObject == null) {
                try {
                    mo60859a(LoadingError.RequestError);
                } catch (Exception e) {
                    Log.log(e);
                    C9577u.this.f24286d.mo59845b(this.f24315a, (C9258l) null, (C9263l2) null, LoadingError.InternalError);
                }
            } else {
                if (!C9577u.this.f24290h) {
                    if (!jSONObject.optBoolean(this.f24316b)) {
                        if (!C9503n.m28137c().f24114b.mo60755a(C9577u.this.f24288f)) {
                            if (jSONObject.has("ads")) {
                                if (jSONObject.has("main_id")) {
                                    C9577u.this.f24297o = System.currentTimeMillis();
                                    C9577u.this.f24299q = jSONObject.optInt("afd", 0);
                                    if (jSONObject.has("main_id")) {
                                        C9577u.this.f24300r = jSONObject.getString("main_id");
                                    }
                                    if (jSONObject.has("rri")) {
                                        C9577u.this.f24301s = jSONObject.optBoolean("rri");
                                    }
                                    if (jSONObject.has("waterfall_cache_timeout")) {
                                        C9577u.this.f24298p = Integer.valueOf(jSONObject.getInt("waterfall_cache_timeout"));
                                    }
                                    C9577u.this.mo59242a(jSONObject);
                                    C9422r0.m27934c(jSONObject);
                                    C9577u uVar = C9577u.this;
                                    uVar.f24296n = new C9692a(jSONObject, uVar.f24288f);
                                    C9577u.this.f24296n.mo61214a((C9420r) null);
                                    this.f24315a.mo60602a(C9577u.this.f24296n);
                                    AdRequestType adrequesttype = this.f24315a;
                                    adrequesttype.f23895j = C9577u.this.f24300r;
                                    C9409q4 q4Var = C9409q4.f23839a;
                                    adrequesttype.f23896k = Long.valueOf(C9503n.m28137c().f24113a);
                                    AdRequestType adrequesttype2 = this.f24315a;
                                    if (!adrequesttype2.f23893h) {
                                        C9577u.this.mo60840b(adrequesttype2);
                                        return;
                                    } else if (!adrequesttype2.f23894i || C9409q4.f23842d == null) {
                                        C9212h5.f23153a.post(new C9584b());
                                        AdNetwork b = C9577u.this.f24287e.mo59980b(Constants.DEBUG_INTERSTITIAL);
                                        if (b != null) {
                                            b.initialize(C9148b.f22956b, new C9162d0(), new C9202h(this.f24315a, C9234j4.f23194a), new C9585c());
                                            return;
                                        }
                                        return;
                                    } else {
                                        C9212h5.f23153a.post(new C9583a());
                                        return;
                                    }
                                }
                            }
                            if (jSONObject.has("message")) {
                                C9577u.this.mo60837a(LogConstants.EVENT_REQUEST_FAILED, jSONObject.getString("message"));
                            }
                            C9577u.this.f24286d.mo59845b(this.f24315a, (C9258l) null, (C9263l2) null, LoadingError.RequestError);
                            return;
                        }
                    }
                }
                C9577u uVar2 = C9577u.this;
                uVar2.f24290h = true;
                uVar2.mo60837a(LogConstants.EVENT_REQUEST_FAILED, LogConstants.MSG_AD_TYPE_DISABLED);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r4.f23887b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28268b(com.appodeal.ads.C9420r r4, com.appodeal.ads.C9258l r5) {
        /*
            boolean r0 = r4.mo60631v()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.ArrayList r0 = r4.f23887b
            if (r0 == 0) goto L_0x001a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001a
            java.util.ArrayList r0 = r4.f23887b
            java.lang.Object r0 = r0.get(r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x0030
            java.util.ArrayList r2 = r4.f23886a
            if (r2 == 0) goto L_0x0030
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0030
            java.util.ArrayList r4 = r4.f23886a
            java.lang.Object r4 = r4.get(r1)
            r0 = r4
            org.json.JSONObject r0 = (org.json.JSONObject) r0
        L_0x0030:
            if (r0 == 0) goto L_0x0045
            r2 = 0
            java.lang.String r4 = "ecpm"
            double r2 = r0.optDouble(r4, r2)
            com.appodeal.ads.f5 r4 = r5.f23269c
            double r4 = r4.getEcpm()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            r1 = 1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9577u.m28268b(com.appodeal.ads.r, com.appodeal.ads.l):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo60831a(Context context) {
        if (!this.f24291i) {
            try {
                C9606b.All.mo61051a((C9605a) this.f24281C);
                this.f24287e.mo59976a(context);
                this.f24291i = true;
                Log.log(this.f24288f.getDisplayName(), LogConstants.EVENT_INITIALIZE, "done");
            } catch (Exception e) {
                Log.log(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: a */
    public final void mo60832a(AdRequestType adrequesttype, int i, boolean z, boolean z2) {
        LoadingError loadingError;
        C9128b0<AdObjectType, AdRequestType, ?> b0Var;
        C9258l h;
        AdRequestType adrequesttype2 = adrequesttype;
        boolean z3 = z;
        boolean z4 = z2;
        if (!this.f24285c.isConnected()) {
            this.f24286d.mo59845b(adrequesttype2, (C9258l) null, (C9263l2) null, LoadingError.ConnectionError);
        } else if (adrequesttype2 != null && !mo60581a(adrequesttype, i)) {
            JSONObject a = adrequesttype.mo60595a(i, z, z2);
            if (a == null) {
                this.f24286d.mo59835a(adrequesttype2, null, (C9191f5) null, LoadingError.InternalError);
                return;
            }
            C9162d0 a2 = C9162d0.m27250a(a, z3);
            if (TextUtils.isEmpty(a2.getId())) {
                this.f24286d.mo59838a(adrequesttype2, null, LoadingError.IncorrectAdunit);
                return;
            }
            adrequesttype2.mo60597a(a2);
            try {
                if (!mo60850l() || (h = adrequesttype.mo60618h()) == null || Double.compare(h.getEcpm(), a2.getEcpm()) < 0) {
                    JSONArray optJSONArray = a.optJSONArray("target_placements");
                    boolean z5 = false;
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            if (adrequesttype.mo60619i().containsKey(optJSONArray.optString(i3))) {
                                i2++;
                            }
                        }
                        if (i2 == optJSONArray.length()) {
                            mo60840b(adrequesttype);
                            return;
                        }
                    }
                    AdNetwork b = this.f24287e.mo59980b(a2.getStatus());
                    if (mo60580a(b, a, a2.getId(), z4)) {
                        adrequesttype2.mo60607b(a2);
                        return;
                    }
                    if (b != null) {
                        C9258l a3 = mo59240a((C9420r) adrequesttype2, b, a2);
                        if (a3 != null) {
                            if (mo60838a()) {
                                a3.mo60099a(a);
                            }
                            if (mo59244a(adrequesttype2, a3)) {
                                if (z3) {
                                    adrequesttype2.mo60612c(a3);
                                } else {
                                    adrequesttype2.mo60608b(a3);
                                }
                                b.setLogging(C9409q4.m27873i() == Log.LogLevel.verbose);
                                adrequesttype2.mo60598a(a3);
                                C9673v vVar = new C9673v(this, adrequesttype, a3, mo59239a(adrequesttype2, a3, z3), a3, adrequesttype);
                                if (!z4 && !adrequesttype.mo60629t() && a3.isAsync()) {
                                    z5 = true;
                                }
                                if (z5) {
                                    this.f24284b.submit(vVar);
                                    if (adrequesttype.mo60592a() > 0) {
                                        mo60840b(adrequesttype);
                                    }
                                } else {
                                    C9212h5.f23153a.post(vVar);
                                }
                                C9212h5.m27350a(new C9581d(adrequesttype2, a3), (long) a3.getLoadingTimeout());
                                return;
                            }
                            this.f24286d.mo59835a(adrequesttype2, a3, (C9191f5) a2, LoadingError.NoFill);
                            return;
                        }
                        b0Var = this.f24286d;
                        loadingError = LoadingError.AdTypeNotSupportedInAdapter;
                    } else {
                        b0Var = this.f24286d;
                        loadingError = LoadingError.AdapterNotFound;
                    }
                    b0Var.mo59835a(adrequesttype2, null, (C9191f5) a2, loadingError);
                    return;
                }
                mo60836a(LogConstants.EVENT_LOAD_SKIPPED, (AdUnit) a2, (LoadingError) null);
                adrequesttype2.mo60608b(h);
                adrequesttype2.mo60607b(a2);
                h.mo59876b();
                this.f24286d.mo59858n(adrequesttype2, h);
            } catch (Exception e) {
                Log.log(e);
                this.f24286d.mo59835a(adrequesttype2, null, (C9191f5) a2, LoadingError.InternalError);
            }
        }
    }

    /* renamed from: b */
    public final void mo60840b(AdRequestType adrequesttype) {
        if (mo59243a(adrequesttype)) {
            C9409q4.m27875k().mo60324a(this.f24288f);
            mo60832a(adrequesttype, 0, true, false);
        } else if (!adrequesttype.f23886a.isEmpty()) {
            C9409q4.m27875k().mo60324a(this.f24288f);
            mo60832a(adrequesttype, 0, false, false);
        } else {
            this.f24286d.mo59845b(adrequesttype, (C9258l) null, (C9263l2) null, LoadingError.NoFill);
        }
    }

    /* renamed from: a */
    public final void mo60836a(String str, AdUnit adUnit, LoadingError loadingError) {
        String format;
        C9409q4 q4Var = C9409q4.f23839a;
        if (C9422r0.f23915d != Log.LogLevel.none) {
            if (adUnit != null) {
                String id = adUnit.getId();
                if (!TextUtils.isEmpty(id) && TextUtils.getTrimmedLength(id) > 5) {
                    id = id.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
                }
                if (loadingError == null) {
                    format = String.format(Locale.ENGLISH, "%s - eCPM: %.2f, precache: %s, expTime: %s, id: %s", new Object[]{C9326n5.m27531a(adUnit.getStatus()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id});
                } else {
                    format = String.format(Locale.ENGLISH, "%s - %s (%s) - eCPM: %.2f, precache: %s, expTime: %s, id: %s", new Object[]{C9326n5.m27531a(adUnit.getStatus()), loadingError.toString().toUpperCase(), Integer.valueOf(loadingError.getCode()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id});
                }
            } else if (loadingError == null) {
                format = null;
            } else {
                format = String.format("%s (%s)", new Object[]{loadingError.toString().toUpperCase(), Integer.valueOf(loadingError.getCode())});
            }
            mo60837a(str, format);
        }
    }

    /* renamed from: a */
    public final void mo60837a(String str, String str2) {
        Log.log(this.f24288f.getDisplayName(), str, str2);
    }

    /* renamed from: a */
    public void mo60579a(Context context, RequestParamsType requestparamstype) {
        C9409q4.f23839a.getClass();
        mo60837a(LogConstants.EVENT_REQUEST_FAILED, String.format("paused: %s, disabled: %s, disabled by segment: %s", new Object[]{Boolean.valueOf(C9409q4.m27880p()), Boolean.valueOf(this.f24290h), Boolean.valueOf(C9503n.m28137c().f24114b.mo60755a(this.f24288f))}));
    }

    /* renamed from: b */
    public final void mo60839b(Context context, RequestParamsType requestparamstype) {
        AdRequestType adrequesttype;
        C9420r rVar;
        this.f24282D = requestparamstype;
        try {
            if (!this.f24291i) {
                mo60837a(LogConstants.EVENT_REQUEST_FAILED, LogConstants.MSG_NOT_INITIALIZED);
            } else if (!this.f24285c.isConnected()) {
                this.f24304v = true;
                this.f24286d.mo59845b((C9420r) null, (C9258l) null, (C9263l2) null, LoadingError.ConnectionError);
            } else {
                C9409q4.f23839a.getClass();
                if (!C9409q4.m27880p() && !this.f24290h) {
                    if (!C9503n.m28137c().mo60753c().mo60755a(this.f24288f)) {
                        C9420r f = mo60846f();
                        if (f == null) {
                            Boolean bool = Boolean.FALSE;
                            mo60837a(LogConstants.EVENT_CACHE, String.format("isDebug: %s, isLoaded: %s, isLoading: %s", new Object[]{Boolean.valueOf(requestparamstype.mo60714b()), bool, bool}));
                        } else {
                            mo60837a(LogConstants.EVENT_CACHE, String.format("isDebug: %s, isLoaded: %s, isLoading: %s", new Object[]{Boolean.valueOf(requestparamstype.mo60714b()), Boolean.valueOf(f.mo60625p()), Boolean.valueOf(f.mo60630u())}));
                            if (mo60857v()) {
                                C9640o.m28398b(f.mo60618h());
                                C9640o.m28397a((Collection<? extends C9258l>) f.mo60619i().values());
                            }
                        }
                        adrequesttype = mo59241a(requestparamstype);
                        try {
                            this.f24289g.add(adrequesttype);
                            this.f24306x = adrequesttype;
                            adrequesttype.mo60635z();
                            adrequesttype.mo60609b(this.f24300r);
                            C9503n.m28131a(context);
                            adrequesttype.mo60603a(Long.valueOf(C9409q4.m27876l()));
                            if (!adrequesttype.mo60626q()) {
                                long j = this.f24297o;
                                if (j != 0) {
                                    if (!C9422r0.m27931a(j, this.f24298p.intValue())) {
                                        C9692a aVar = this.f24296n;
                                        if (aVar != null) {
                                            String o = adrequesttype.mo60624o();
                                            if (!TextUtils.isEmpty(o)) {
                                                if (!f24278E) {
                                                    if (o == null) {
                                                        throw new AssertionError();
                                                    }
                                                }
                                                int size = this.f24289g.size() - 1;
                                                while (true) {
                                                    if (size < 0) {
                                                        break;
                                                    }
                                                    rVar = (C9420r) this.f24289g.get(size);
                                                    if (rVar.f23878B && o.equals(rVar.f23895j)) {
                                                        break;
                                                    }
                                                    size--;
                                                }
                                                aVar.mo61214a(rVar);
                                                adrequesttype.mo60602a(this.f24296n);
                                            }
                                            rVar = null;
                                            aVar.mo61214a(rVar);
                                            adrequesttype.mo60602a(this.f24296n);
                                        }
                                        this.f24292j = false;
                                        mo60840b(adrequesttype);
                                        mo59245b();
                                        return;
                                    }
                                }
                            }
                            C9237k0.m27397a(context, (C9577u<?, ?, ?>) this, (C9420r<?>) adrequesttype, (C9464s<?>) requestparamstype, (C9577u<?, ?, ?>.e) new C9582e(adrequesttype, mo59247i()));
                            mo59245b();
                            return;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            Log.log(e);
                            this.f24286d.mo59845b(adrequesttype, (C9258l) null, (C9263l2) null, LoadingError.InternalError);
                        }
                    }
                }
                mo60579a(context, requestparamstype);
            }
        } catch (Exception e2) {
            e = e2;
            adrequesttype = null;
            e.printStackTrace();
            Log.log(e);
            this.f24286d.mo59845b(adrequesttype, (C9258l) null, (C9263l2) null, LoadingError.InternalError);
        }
    }

    /* renamed from: a */
    public final void mo60833a(AdRequestType adrequesttype, JSONObject jSONObject) {
        AdRequestType adrequesttype2;
        AdObjectType adobjecttype;
        if (jSONObject != null) {
            try {
                if (!adrequesttype.f23882F && !adrequesttype.f23879C && (adobjecttype = adrequesttype.f23904s) != null) {
                    AdRequestType adrequesttype3 = adobjecttype.f23267a;
                    if (!adrequesttype3.f23882F && !adrequesttype3.f23879C) {
                        AdRequestType adrequesttype4 = this.f24306x;
                        if (adrequesttype4 != null && adrequesttype4 == adrequesttype) {
                            if (jSONObject.has("ads")) {
                                if (jSONObject.has("main_id")) {
                                    adrequesttype2 = mo59241a(this.f24282D);
                                    try {
                                        adrequesttype2.f23884H = adrequesttype;
                                        this.f24289g.add(adrequesttype2);
                                        this.f24306x = adrequesttype2;
                                        adrequesttype2.mo60605a(true, false);
                                        C9692a aVar = new C9692a(jSONObject, adrequesttype.mo60093n());
                                        aVar.mo61214a(adrequesttype);
                                        C9695d dVar = aVar.f24523e;
                                        adrequesttype2.f23886a = dVar.f24531b;
                                        adrequesttype2.f23887b = dVar.f24530a;
                                        adrequesttype2.f23895j = jSONObject.getString("main_id");
                                        adrequesttype2.f23896k = Long.valueOf(C9503n.m28137c().f24113a);
                                        mo60840b(adrequesttype2);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            }
                            if (jSONObject.has("message")) {
                                mo60837a(LogConstants.EVENT_REQUEST_FAILED, jSONObject.getString("message"));
                            }
                            this.f24286d.mo59249a(adrequesttype);
                            mo60837a(LogConstants.EVENT_REQUEST_FAILED, "skip postbid request");
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                adrequesttype2 = null;
                Log.log(th);
                this.f24286d.mo59845b(adrequesttype2, (C9258l) null, (C9263l2) null, LoadingError.InternalError);
                return;
            }
        }
        this.f24286d.mo59249a(adrequesttype);
        mo60837a(LogConstants.EVENT_REQUEST_FAILED, "skip postbid request");
    }
}
