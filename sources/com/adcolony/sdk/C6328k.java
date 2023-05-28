package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6390o;
import com.adcolony.sdk.C6422s;
import com.adcolony.sdk.C6450v;
import com.applovin.sdk.AppLovinEventTypes;
import com.appnext.base.p264b.C8849c;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p150io.bidmachine.ads.networks.adcolony.BuildConfig;

/* renamed from: com.adcolony.sdk.k */
class C6328k {

    /* renamed from: Z */
    static String f13570Z = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: a0 */
    private static volatile String f13571a0 = "";

    /* renamed from: A */
    private boolean f13572A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f13573B;

    /* renamed from: C */
    private boolean f13574C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C6291f f13575D = new C6291f();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f13576E;

    /* renamed from: F */
    private boolean f13577F;

    /* renamed from: G */
    private boolean f13578G;

    /* renamed from: H */
    private boolean f13579H;

    /* renamed from: I */
    private boolean f13580I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f13581J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f13582K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f13583L;

    /* renamed from: M */
    private int f13584M;

    /* renamed from: N */
    private int f13585N = 1;

    /* renamed from: O */
    private Application.ActivityLifecycleCallbacks f13586O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public Partner f13587P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C6294f1 f13588Q = new C6294f1();

    /* renamed from: R */
    private long f13589R = 500;

    /* renamed from: S */
    private long f13590S = 500;

    /* renamed from: T */
    private boolean f13591T;

    /* renamed from: U */
    private long f13592U = 20000;

    /* renamed from: V */
    private long f13593V = 300000;

    /* renamed from: W */
    private long f13594W = 15000;

    /* renamed from: X */
    private int f13595X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f13596Y = false;

    /* renamed from: a */
    private C6314i0 f13597a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6427t f13598b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6431t0 f13599c;

    /* renamed from: d */
    private C6252d f13600d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6415r f13601e;

    /* renamed from: f */
    private C6455w f13602f;

    /* renamed from: g */
    private C6476x0 f13603g;

    /* renamed from: h */
    private C6454v0 f13604h;

    /* renamed from: i */
    private C6297g0 f13605i;

    /* renamed from: j */
    private C6405q f13606j;

    /* renamed from: k */
    private C6379m0 f13607k;

    /* renamed from: l */
    private C6223c f13608l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6505z f13609m;

    /* renamed from: n */
    private AdColonyAdView f13610n;

    /* renamed from: o */
    private AdColonyInterstitial f13611o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdColonyRewardListener f13612p;

    /* renamed from: q */
    private HashMap<String, AdColonyCustomMessageListener> f13613q = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AdColonyAppOptions f13614r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6312h0 f13615s;

    /* renamed from: t */
    private C6294f1 f13616t;

    /* renamed from: u */
    private HashMap<String, AdColonyZone> f13617u = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public HashMap<Integer, C6236c1> f13618v = new HashMap<>();

    /* renamed from: w */
    private String f13619w;

    /* renamed from: x */
    private String f13620x;

    /* renamed from: y */
    private String f13621y;

    /* renamed from: z */
    private String f13622z = "";

    /* renamed from: com.adcolony.sdk.k$a */
    class C6329a implements C6327j0 {
        C6329a(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15077b(b, "crc32", C6509z0.m15925a(C6235c0.m15087h(h0Var.mo50732a(), C8849c.DATA)));
            h0Var.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$a0 */
    class C6330a0 implements C6327j0 {
        C6330a0() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6328k.this.m15375a(true, true);
        }
    }

    /* renamed from: com.adcolony.sdk.k$b */
    class C6331b implements C6327j0 {
        C6331b(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            int d = C6235c0.m15083d(h0Var.mo50732a(), "number");
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15068a(b, "uuids", C6509z0.m15927a(d));
            h0Var.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$b0 */
    class C6332b0 implements C6327j0 {
        C6332b0(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "sha1", C6509z0.m15950b(C6235c0.m15087h(h0Var.mo50732a(), C8849c.DATA)));
            h0Var.mo50733a(b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$c */
    class C6333c implements C6327j0 {

        /* renamed from: com.adcolony.sdk.k$c$a */
        class C6334a implements C6493y<String> {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13625a;

            C6334a(C6312h0 h0Var) {
                this.f13625a = h0Var;
            }

            /* renamed from: a */
            public void mo50816a(String str) {
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15070a(b, "advertiser_id", C6328k.this.mo50803n().mo50943f());
                C6235c0.m15079b(b, "limit_ad_tracking", C6328k.this.mo50803n().mo50908A());
                this.f13625a.mo50733a(b).mo50736c();
            }

            /* renamed from: a */
            public void mo50818a(Throwable th) {
                new C6288e0.C6289a().mo50644a("Device.query_advertiser_info").mo50644a(" failed with error: ").mo50644a(Log.getStackTraceString(th)).mo50645a(C6288e0.f13496g);
            }
        }

        C6333c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.mo50803n().mo50927a(C6185a.m14880a(), new C6334a(h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.k$d */
    class C6335d implements C6327j0 {
        C6335d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6424s0 a = C6328k.this.mo50806q().mo50720a();
            C6328k.this.mo50803n().mo50939c(C6235c0.m15087h(h0Var.mo50732a(), "version"));
            if (a != null) {
                a.mo50995e(C6328k.this.mo50803n().mo50952o());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$e */
    class C6336e implements C6327j0 {
        C6336e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6294f1 unused = C6328k.this.f13588Q = C6235c0.m15085f(h0Var.mo50732a(), "signals");
        }
    }

    /* renamed from: com.adcolony.sdk.k$f */
    class C6337f implements C6327j0 {

        /* renamed from: com.adcolony.sdk.k$f$a */
        class C6338a implements C6475x<C6390o.C6392b> {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13630a;

            C6338a(C6337f fVar, C6312h0 h0Var) {
                this.f13630a = h0Var;
            }

            /* renamed from: a */
            public void mo50820a(C6390o.C6392b bVar) {
                C6294f1 b = C6235c0.m15073b();
                if (bVar != null) {
                    C6235c0.m15069a(b, "odt", bVar.mo50874b());
                }
                this.f13630a.mo50733a(b).mo50736c();
            }
        }

        C6337f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6328k.this.mo50767G()) {
                C6396o0.m15589c().mo50891a((C6475x<C6390o.C6392b>) new C6338a(this, h0Var), C6328k.this.mo50796g());
                return;
            }
            C6390o.C6392b b = C6396o0.m15589c().mo50892b();
            C6294f1 b2 = C6235c0.m15073b();
            if (b != null) {
                C6235c0.m15069a(b2, "odt", b.mo50874b());
            }
            h0Var.mo50733a(b2).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.k$g */
    class C6339g implements C6327j0 {
        C6339g(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6396o0.m15589c().mo50886a();
        }
    }

    /* renamed from: com.adcolony.sdk.k$h */
    class C6340h implements C6327j0 {
        C6340h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.f13609m.mo51107a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$i */
    class C6341i implements Runnable {
        C6341i() {
        }

        public void run() {
            Context a = C6185a.m14880a();
            if (!C6328k.this.f13583L && a != null) {
                try {
                    Omid.activate(a.getApplicationContext());
                    boolean unused = C6328k.this.f13583L = true;
                } catch (IllegalArgumentException unused2) {
                    new C6288e0.C6289a().mo50644a("IllegalArgumentException when activating Omid").mo50645a(C6288e0.f13498i);
                    boolean unused3 = C6328k.this.f13583L = false;
                }
            }
            if (C6328k.this.f13583L && C6328k.this.f13587P == null) {
                try {
                    Partner unused4 = C6328k.this.f13587P = Partner.createPartner("AdColony", BuildConfig.ADAPTER_SDK_VERSION_NAME);
                } catch (IllegalArgumentException unused5) {
                    new C6288e0.C6289a().mo50644a("IllegalArgumentException when creating Omid Partner").mo50645a(C6288e0.f13498i);
                    boolean unused6 = C6328k.this.f13583L = false;
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$j */
    class C6342j implements Runnable {

        /* renamed from: com.adcolony.sdk.k$j$a */
        class C6343a implements C6422s.C6423a {
            C6343a() {
            }

            /* renamed from: a */
            public void mo50823a(C6422s sVar, C6312h0 h0Var, Map<String, List<String>> map) {
                C6328k.this.m15367a(sVar);
            }
        }

        C6342j() {
        }

        public void run() {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "url", C6328k.f13570Z);
            C6235c0.m15070a(b, "content_type", "application/json");
            C6235c0.m15070a(b, AppLovinEventTypes.USER_VIEWED_CONTENT, C6328k.this.mo50803n().mo50957t().toString());
            C6235c0.m15070a(b, "url", C6328k.f13570Z);
            if (C6328k.this.f13596Y) {
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15070a(b2, "request", com.adcolony.adcolonysdk.BuildConfig.LAUNCH_REQ_DICT_ID);
                C6235c0.m15070a(b2, "response", com.adcolony.adcolonysdk.BuildConfig.LAUNCH_RESP_DICT_ID);
                C6235c0.m15069a(b, "dictionaries_mapping", b2);
            }
            C6328k.this.f13598b.mo51002a(new C6422s(new C6312h0("WebServices.post", 0, b), new C6343a()));
        }
    }

    /* renamed from: com.adcolony.sdk.k$k */
    class C6344k implements C6450v.C6453c {
        C6344k(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50824a() {
            C6396o0.m15589c().mo50893d();
        }
    }

    /* renamed from: com.adcolony.sdk.k$l */
    class C6345l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13635a;

        /* renamed from: b */
        final /* synthetic */ C6312h0 f13636b;

        C6345l(Context context, C6312h0 h0Var) {
            this.f13635a = context;
            this.f13636b = h0Var;
        }

        public void run() {
            C6319j a = C6319j.m15352a(this.f13635a.getApplicationContext(), this.f13636b);
            C6328k.this.f13618v.put(Integer.valueOf(a.getAdc3ModuleId()), a);
        }
    }

    /* renamed from: com.adcolony.sdk.k$m */
    class C6346m implements Runnable {
        C6346m() {
        }

        public void run() {
            if (C6185a.m14887b().mo50813x().mo51017f()) {
                C6328k.this.m15357K();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$n */
    class C6347n implements C6422s.C6423a {
        C6347n() {
        }

        /* renamed from: a */
        public void mo50823a(C6422s sVar, C6312h0 h0Var, Map<String, List<String>> map) {
            C6328k.this.m15360N();
        }
    }

    /* renamed from: com.adcolony.sdk.k$o */
    class C6348o implements Runnable {
        C6348o() {
        }

        public void run() {
            boolean unused = C6328k.this.m15358L();
        }
    }

    /* renamed from: com.adcolony.sdk.k$p */
    class C6349p implements AdColonyInterstitial.C6183f {
        C6349p() {
        }

        /* renamed from: a */
        public void mo50383a() {
            C6328k.this.m15377b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$q */
    class C6350q implements AdColonyAdView.C6176c {
        C6350q() {
        }

        /* renamed from: a */
        public void mo50265a() {
            C6328k.this.m15377b();
        }
    }

    /* renamed from: com.adcolony.sdk.k$r */
    class C6351r implements C6475x<C6385n0> {
        C6351r(C6328k kVar) {
        }

        /* renamed from: a */
        public void mo50820a(C6385n0 n0Var) {
            C6396o0.m15589c().mo50888a(n0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$s */
    class C6352s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6312h0 f13643a;

        C6352s(C6312h0 h0Var) {
            this.f13643a = h0Var;
        }

        public void run() {
            C6328k.this.f13612p.onReward(new AdColonyReward(this.f13643a));
        }
    }

    /* renamed from: com.adcolony.sdk.k$t */
    class C6353t implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final Set<Integer> f13645a = new HashSet();

        C6353t() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!C6328k.this.f13599c.mo51017f()) {
                C6328k.this.f13599c.mo51011c(true);
            }
            C6185a.m14882a((Context) activity);
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            C6185a.f13243d = false;
            C6328k.this.f13599c.mo51013d(false);
        }

        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f13645a.add(Integer.valueOf(activity.hashCode()));
            C6185a.f13243d = true;
            C6185a.m14882a((Context) activity);
            C6424s0 a = C6328k.this.mo50806q().mo50720a();
            Context a2 = C6185a.m14880a();
            if (a2 == null || !C6328k.this.f13599c.mo51015e() || !(a2 instanceof C6201b) || ((C6201b) a2).f13318d) {
                C6185a.m14882a((Context) activity);
                if (C6328k.this.f13615s != null) {
                    if (!Objects.equals(C6235c0.m15087h(C6328k.this.f13615s.mo50732a(), "m_origin"), "")) {
                        C6328k.this.f13615s.mo50733a(C6328k.this.f13615s.mo50732a()).mo50736c();
                    }
                    C6312h0 unused = C6328k.this.f13615s = null;
                }
                boolean unused2 = C6328k.this.f13573B = false;
                C6328k.this.f13599c.mo51018g(false);
                if (C6328k.this.f13576E && !C6328k.this.f13599c.mo51017f()) {
                    C6328k.this.f13599c.mo51011c(true);
                }
                C6328k.this.f13599c.mo51013d(true);
                C6328k.this.f13601e.mo50979c();
                if (a == null || (scheduledExecutorService = a.f13805b) == null || scheduledExecutorService.isShutdown() || a.f13805b.isTerminated()) {
                    AdColony.m14782a((Context) activity, C6185a.m14887b().f13614r);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C6328k.this.f13599c.mo51014e(true);
        }

        public void onActivityStopped(Activity activity) {
            this.f13645a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f13645a.isEmpty()) {
                C6328k.this.f13599c.mo51014e(false);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.k$u */
    class C6354u implements C6327j0 {
        C6354u() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            boolean unused = C6328k.this.m15384c(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$v */
    class C6355v implements C6327j0 {
        C6355v() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.m15365a(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$w */
    class C6356w implements C6327j0 {
        C6356w() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6424s0 a = C6328k.this.mo50806q().mo50720a();
            C6328k.this.f13575D.mo50661a(true);
            if (C6328k.this.f13581J) {
                C6294f1 b = C6235c0.m15073b();
                C6294f1 b2 = C6235c0.m15073b();
                C6235c0.m15070a(b2, "app_version", C6509z0.m15956c());
                C6235c0.m15069a(b, "app_bundle_info", b2);
                new C6312h0("AdColony.on_update", 1, b).mo50736c();
                boolean unused = C6328k.this.f13581J = false;
            }
            if (C6328k.this.f13582K) {
                new C6312h0("AdColony.on_install", 1).mo50736c();
            }
            C6294f1 a2 = h0Var.mo50732a();
            if (a != null) {
                a.mo50996f(C6235c0.m15087h(a2, "app_session_id"));
            }
            if (AdColonyEventTracker.m14823a()) {
                AdColonyEventTracker.m14825b();
            }
            Integer i = a2.mo50700i("base_download_threads");
            if (i != null) {
                C6328k.this.f13598b.mo51001a(i.intValue());
            }
            Integer i2 = a2.mo50700i("concurrent_requests");
            if (i2 != null) {
                C6328k.this.f13598b.mo51003b(i2.intValue());
            }
            Integer i3 = a2.mo50700i("threads_keep_alive_time");
            if (i3 != null) {
                C6328k.this.f13598b.mo51004c(i3.intValue());
            }
            double h = a2.mo50699h("thread_pool_scaling_factor");
            if (!Double.isNaN(h)) {
                C6328k.this.f13598b.mo51000a(h);
            }
            C6328k.this.f13609m.mo51108b();
            C6328k.this.m15359M();
        }
    }

    /* renamed from: com.adcolony.sdk.k$x */
    class C6357x implements C6327j0 {
        C6357x() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.m15379b(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$y */
    class C6358y implements C6327j0 {
        C6358y() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.mo50794e(h0Var);
        }
    }

    /* renamed from: com.adcolony.sdk.k$z */
    class C6359z implements C6327j0 {
        C6359z() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6328k.this.m15391f(h0Var);
        }
    }

    C6328k() {
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m15357K() {
        new Thread(new C6342j()).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public boolean m15358L() {
        this.f13597a.mo50742a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m15359M() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "type", "AdColony.on_configuration_completed");
        C6290e1 e1Var = new C6290e1();
        for (String b2 : mo50763C().keySet()) {
            e1Var.mo50652b(b2);
        }
        C6294f1 b3 = C6235c0.m15073b();
        C6235c0.m15068a(b3, "zone_ids", e1Var);
        C6235c0.m15069a(b, "message", b3);
        new C6312h0("CustomMessage.controller_send", 0, b).mo50736c();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m15360N() {
        if (m15373a(this.f13620x) || C6361l.f13654H) {
            if (!this.f13577F && !this.f13580I) {
                C6509z0.m15953b((Runnable) new C6348o());
            }
            if (this.f13577F && this.f13580I) {
                mo50772Q();
                return;
            }
            return;
        }
        new C6288e0.C6289a().mo50644a("Downloaded controller sha1 does not match, retrying.").mo50645a(C6288e0.f13495f);
        m15362S();
    }

    /* renamed from: O */
    private void m15361O() {
        Application application;
        Context a = C6185a.m14880a();
        if (a != null && this.f13586O == null && Build.VERSION.SDK_INT > 14) {
            this.f13586O = new C6353t();
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.registerActivityLifecycleCallbacks(this.f13586O);
        }
    }

    /* renamed from: S */
    private void m15362S() {
        if (C6185a.m14887b().mo50813x().mo51017f()) {
            int i = this.f13584M + 1;
            this.f13584M = i;
            this.f13585N = Math.min(this.f13585N * i, 120);
            C6509z0.m15938a((Runnable) new C6346m(), ((long) this.f13585N) * 1000);
            return;
        }
        new C6288e0.C6289a().mo50644a("Max launch server download attempts hit, or AdColony is no longer").mo50644a(" active.").mo50645a(C6288e0.f13496g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C6476x0 mo50761A() {
        if (this.f13603g == null) {
            C6476x0 x0Var = new C6476x0();
            this.f13603g = x0Var;
            x0Var.mo51079a();
        }
        return this.f13603g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public HashMap<Integer, C6236c1> mo50762B() {
        return this.f13618v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public HashMap<String, AdColonyZone> mo50763C() {
        return this.f13617u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo50764D() {
        return this.f13614r != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo50765E() {
        return this.f13573B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo50766F() {
        return this.f13574C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo50767G() {
        return this.f13591T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo50768H() {
        return this.f13596Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo50769I() {
        return this.f13575D.mo50662a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo50770J() {
        return this.f13572A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo50771P() {
        this.f13575D.mo50661a(false);
        this.f13600d.mo50614b();
        Object option = this.f13614r.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            mo50773R();
        }
        AdColony.m14782a(C6185a.m14880a(), this.f13614r);
        mo50774T();
        this.f13617u.clear();
        this.f13597a.mo50742a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo50772Q() {
        this.f13595X = 0;
        for (AdColonyInterstitial next : this.f13600d.mo50621f().values()) {
            if (next.mo50365m()) {
                this.f13595X++;
                next.mo50338a((AdColonyInterstitial.C6183f) new C6349p());
            }
        }
        for (AdColonyAdView onDestroyListenerOrCall : this.f13600d.mo50618d().values()) {
            this.f13595X++;
            onDestroyListenerOrCall.setOnDestroyListenerOrCall(new C6350q());
        }
        if (this.f13595X == 0) {
            mo50771P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo50773R() {
        synchronized (this.f13600d.mo50621f()) {
            for (AdColonyInterstitial p : this.f13600d.mo50621f().values()) {
                p.mo50368p();
            }
            this.f13600d.mo50621f().clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo50774T() {
        mo50783a(1);
        for (C6236c1 b : this.f13618v.values()) {
            this.f13597a.mo50746b((C6360k0) b);
        }
        this.f13618v.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public AdColonyAppOptions mo50810u() {
        if (this.f13614r == null) {
            this.f13614r = new AdColonyAppOptions();
        }
        return this.f13614r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public String mo50811v() {
        return f13571a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public AdColonyRewardListener mo50812w() {
        return this.f13612p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C6431t0 mo50813x() {
        if (this.f13599c == null) {
            C6431t0 t0Var = new C6431t0();
            this.f13599c = t0Var;
            t0Var.mo51012d();
        }
        return this.f13599c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public long mo50814y() {
        return this.f13589R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C6454v0 mo50815z() {
        if (this.f13604h == null) {
            C6454v0 v0Var = new C6454v0();
            this.f13604h = v0Var;
            v0Var.mo51056e();
        }
        return this.f13604h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo50795f() {
        return this.f13622z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo50796g() {
        return this.f13590S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo50797h() {
        return this.f13593V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public long mo50798i() {
        return this.f13594W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public AdColonyInterstitial mo50799j() {
        return this.f13611o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public AdColonyAdView mo50800k() {
        return this.f13610n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C6223c mo50801l() {
        return this.f13608l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<String, AdColonyCustomMessageListener> mo50802m() {
        return this.f13613q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C6405q mo50803n() {
        if (this.f13606j == null) {
            C6405q qVar = new C6405q();
            this.f13606j = qVar;
            qVar.mo50920M();
        }
        return this.f13606j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C6415r mo50804o() {
        if (this.f13601e == null) {
            this.f13601e = new C6415r();
        }
        return this.f13601e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C6455w mo50805p() {
        if (this.f13602f == null) {
            C6455w wVar = new C6455w();
            this.f13602f = wVar;
            wVar.mo51063b();
        }
        return this.f13602f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C6297g0 mo50806q() {
        if (this.f13605i == null) {
            C6297g0 g0Var = new C6297g0();
            this.f13605i = g0Var;
            g0Var.mo50728c();
        }
        return this.f13605i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C6314i0 mo50807r() {
        if (this.f13597a == null) {
            C6314i0 i0Var = new C6314i0();
            this.f13597a = i0Var;
            i0Var.mo50742a();
        }
        return this.f13597a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C6379m0 mo50808s() {
        if (this.f13607k == null) {
            this.f13607k = new C6379m0();
        }
        return this.f13607k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Partner mo50809t() {
        return this.f13587P;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15391f(C6312h0 h0Var) {
        AdColonyZone adColonyZone;
        if (!this.f13574C) {
            String h = C6235c0.m15087h(h0Var.mo50732a(), "zone_id");
            if (this.f13617u.containsKey(h)) {
                adColonyZone = this.f13617u.get(h);
            } else {
                AdColonyZone adColonyZone2 = new AdColonyZone(h);
                this.f13617u.put(h, adColonyZone2);
                adColonyZone = adColonyZone2;
            }
            adColonyZone.mo50416a(h0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50790d(C6312h0 h0Var) {
        this.f13615s = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo50794e(C6312h0 h0Var) {
        if (this.f13612p == null) {
            return false;
        }
        C6509z0.m15953b((Runnable) new C6352s(h0Var));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m15384c(C6312h0 h0Var) {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        try {
            int j = h0Var.mo50732a().mo50701j("id");
            if (j > 0) {
                mo50783a(j);
            }
            C6509z0.m15953b((Runnable) new C6345l(a, h0Var));
            return true;
        } catch (RuntimeException e) {
            C6288e0.C6289a aVar = new C6288e0.C6289a();
            aVar.mo50644a(e.toString() + ": during WebView initialization.").mo50644a(" Disabling AdColony.").mo50645a(C6288e0.f13497h);
            AdColony.disable();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50786b(boolean z) {
        this.f13575D.mo50661a(false);
        this.f13574C = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50791d(boolean z) {
        this.f13576E = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo50789d() {
        return this.f13592U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50793e(boolean z) {
        this.f13572A = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6294f1 mo50792e() {
        return this.f13588Q;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15379b(C6312h0 h0Var) {
        C6294f1 b = this.f13614r.mo50290b();
        C6235c0.m15070a(b, "app_id", this.f13614r.mo50289a());
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15069a(b2, "options", b);
        h0Var.mo50733a(b2).mo50736c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50779a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            r4 = this;
            r4.f13574C = r6
            r4.f13614r = r5
            com.adcolony.sdk.i0 r0 = new com.adcolony.sdk.i0
            r0.<init>()
            r4.f13597a = r0
            com.adcolony.sdk.m r0 = new com.adcolony.sdk.m
            r0.<init>()
            com.adcolony.sdk.q r0 = new com.adcolony.sdk.q
            r0.<init>()
            r4.f13606j = r0
            r0.mo50920M()
            com.adcolony.sdk.t r0 = new com.adcolony.sdk.t
            r0.<init>()
            r4.f13598b = r0
            r0.mo50999a()
            com.adcolony.sdk.t0 r0 = new com.adcolony.sdk.t0
            r0.<init>()
            r4.f13599c = r0
            r0.mo51012d()
            com.adcolony.sdk.d r0 = new com.adcolony.sdk.d
            r0.<init>()
            r4.f13600d = r0
            r0.mo50623h()
            com.adcolony.sdk.r r0 = new com.adcolony.sdk.r
            r0.<init>()
            r4.f13601e = r0
            com.adcolony.sdk.w r0 = new com.adcolony.sdk.w
            r0.<init>()
            r4.f13602f = r0
            r0.mo51063b()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r4.f13605i = r0
            r0.mo50728c()
            com.adcolony.sdk.v0 r0 = new com.adcolony.sdk.v0
            r0.<init>()
            r4.f13604h = r0
            r0.mo51056e()
            com.adcolony.sdk.x0 r0 = new com.adcolony.sdk.x0
            r0.<init>()
            r4.f13603g = r0
            r0.mo51079a()
            com.adcolony.sdk.m0 r0 = new com.adcolony.sdk.m0
            r0.<init>()
            r4.f13607k = r0
            com.adcolony.sdk.z r0 = new com.adcolony.sdk.z
            r0.<init>()
            r4.f13609m = r0
            com.adcolony.sdk.m0 r0 = r4.f13607k
            r0.mo50843b()
            android.content.Context r0 = com.adcolony.sdk.C6185a.m14880a()
            com.adcolony.sdk.AdColony.m14782a((android.content.Context) r0, (com.adcolony.sdk.AdColonyAppOptions) r5)
            r5 = 0
            r0 = 1
            if (r6 != 0) goto L_0x0135
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r2 = r4.f13604h
            java.lang.String r2 = r2.mo51051a()
            r1.append(r2)
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f13578G = r6
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.v0 r3 = r4.f13604h
            java.lang.String r3 = r3.mo51051a()
            r1.append(r3)
            java.lang.String r3 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.<init>(r1)
            boolean r6 = r6.exists()
            r4.f13579H = r6
            boolean r1 = r4.f13578G
            if (r1 == 0) goto L_0x00fc
            if (r6 == 0) goto L_0x00fc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f13604h
            java.lang.String r1 = r1.mo51051a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C6235c0.m15082c(r6)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r6 = com.adcolony.sdk.C6235c0.m15087h(r6, r1)
            com.adcolony.sdk.q r1 = r4.f13606j
            java.lang.String r1 = r1.mo50916I()
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x00fc
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r4.f13577F = r6
            com.adcolony.sdk.v r6 = com.adcolony.sdk.C6450v.m15783a()
            com.adcolony.sdk.k$k r1 = new com.adcolony.sdk.k$k
            r1.<init>(r4)
            r6.mo51045a((com.adcolony.sdk.C6450v.C6453c) r1)
            boolean r6 = r4.f13578G
            if (r6 == 0) goto L_0x012d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.adcolony.sdk.v0 r1 = r4.f13604h
            java.lang.String r1 = r1.mo51051a()
            r6.append(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.adcolony.sdk.f1 r6 = com.adcolony.sdk.C6235c0.m15082c(r6)
            r4.f13616t = r6
            r4.m15378b((com.adcolony.sdk.C6294f1) r6)
        L_0x012d:
            boolean r6 = r4.f13577F
            r4.m15374a((boolean) r6)
            r4.m15361O()
        L_0x0135:
            com.adcolony.sdk.k$u r6 = new com.adcolony.sdk.k$u
            r6.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$v r6 = new com.adcolony.sdk.k$v
            r6.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$w r6 = new com.adcolony.sdk.k$w
            r6.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$x r6 = new com.adcolony.sdk.k$x
            r6.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$y r6 = new com.adcolony.sdk.k$y
            r6.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$z r6 = new com.adcolony.sdk.k$z
            r6.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$a0 r6 = new com.adcolony.sdk.k$a0
            r6.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$b0 r6 = new com.adcolony.sdk.k$b0
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$a r6 = new com.adcolony.sdk.k$a
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$b r6 = new com.adcolony.sdk.k$b
            r6.<init>(r4)
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$c r6 = new com.adcolony.sdk.k$c
            r6.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$d r6 = new com.adcolony.sdk.k$d
            r6.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$e r6 = new com.adcolony.sdk.k$e
            r6.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$f r6 = new com.adcolony.sdk.k$f
            r6.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$g r6 = new com.adcolony.sdk.k$g
            r6.<init>(r4)
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.k$h r6 = new com.adcolony.sdk.k$h
            r6.<init>()
            java.lang.String r1 = "AdColony.heartbeat"
            com.adcolony.sdk.C6185a.m14886a((java.lang.String) r1, (com.adcolony.sdk.C6327j0) r6)
            com.adcolony.sdk.v0 r6 = r4.f13604h
            int r6 = com.adcolony.sdk.C6509z0.m15944b((com.adcolony.sdk.C6454v0) r6)
            if (r6 != r0) goto L_0x01df
            r1 = 1
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            r4.f13581J = r1
            r1 = 2
            if (r6 != r1) goto L_0x01e6
            r5 = 1
        L_0x01e6:
            r4.f13582K = r5
            com.adcolony.sdk.k$i r5 = new com.adcolony.sdk.k$i
            r5.<init>()
            com.adcolony.sdk.C6509z0.m15953b((java.lang.Runnable) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6328k.mo50779a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15377b() {
        int i = this.f13595X - 1;
        this.f13595X = i;
        if (i == 0) {
            mo50771P();
        }
    }

    /* renamed from: b */
    private void m15378b(C6294f1 f1Var) {
        if (!C6361l.f13654H) {
            C6294f1 f = C6235c0.m15085f(f1Var, "logging");
            C6297g0.f13519h = C6235c0.m15057a(f, "send_level", 1);
            C6297g0.f13517f = C6235c0.m15076b(f, "log_private");
            C6297g0.f13518g = C6235c0.m15057a(f, "print_level", 3);
            this.f13605i.mo50727b(C6235c0.m15060a(f, "modules"));
            this.f13605i.mo50729c(C6235c0.m15084e(f, "included_fields"));
        }
        C6294f1 f2 = C6235c0.m15085f(f1Var, "metadata");
        mo50803n().mo50928a(f2);
        mo50813x().mo51006a(C6235c0.m15083d(f2, "session_timeout"));
        f13571a0 = C6235c0.m15087h(f1Var, "pie");
        this.f13622z = C6235c0.m15087h(C6235c0.m15085f(f1Var, "controller"), "version");
        this.f13589R = C6235c0.m15058a(f2, "signals_timeout", this.f13589R);
        this.f13590S = C6235c0.m15058a(f2, "calculate_odt_timeout", this.f13590S);
        this.f13591T = C6235c0.m15071a(f2, "async_odt_query", this.f13591T);
        this.f13592U = C6235c0.m15058a(f2, "ad_request_timeout", this.f13592U);
        this.f13593V = C6235c0.m15058a(f2, "controller_heartbeat_interval", this.f13593V);
        this.f13594W = C6235c0.m15058a(f2, "controller_heartbeat_timeout", this.f13594W);
        this.f13596Y = C6235c0.m15071a(f2, "enable_compression", false);
        C6450v.m15783a().mo51043a(f2.mo50705n("odt_config"), (C6475x<C6385n0>) new C6351r(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        new java.io.File(r3.f13604h.mo51051a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15383c(com.adcolony.sdk.C6294f1 r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "controller"
            com.adcolony.sdk.f1 r1 = com.adcolony.sdk.C6235c0.m15085f(r4, r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "url"
            java.lang.String r2 = com.adcolony.sdk.C6235c0.m15087h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f13619w = r2     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "sha1"
            java.lang.String r1 = com.adcolony.sdk.C6235c0.m15087h(r1, r2)     // Catch:{ Exception -> 0x002f }
            r3.f13620x = r1     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "status"
            java.lang.String r1 = com.adcolony.sdk.C6235c0.m15087h(r4, r1)     // Catch:{ Exception -> 0x002f }
            r3.f13621y = r1     // Catch:{ Exception -> 0x002f }
            r3.m15378b((com.adcolony.sdk.C6294f1) r4)     // Catch:{ Exception -> 0x002f }
            boolean r4 = com.adcolony.sdk.AdColonyEventTracker.m14823a()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x0050
            com.adcolony.sdk.AdColonyEventTracker.m14825b()     // Catch:{ Exception -> 0x002f }
            goto L_0x0050
        L_0x002f:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r1.<init>()     // Catch:{ Exception -> 0x004f }
            com.adcolony.sdk.v0 r2 = r3.f13604h     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = r2.mo51051a()     // Catch:{ Exception -> 0x004f }
            r1.append(r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x004f }
            r4.delete()     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            java.lang.String r4 = r3.f13621y
            java.lang.String r1 = "disable"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0097
            boolean r4 = com.adcolony.sdk.C6361l.f13654H
            if (r4 != 0) goto L_0x0097
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r1.<init>()     // Catch:{ Exception -> 0x007d }
            com.adcolony.sdk.v0 r2 = r3.f13604h     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo51051a()     // Catch:{ Exception -> 0x007d }
            r1.append(r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            r1.append(r2)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x007d }
            r4.delete()     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Launch server response with disabled status. Disabling AdColony "
            com.adcolony.sdk.e0$a r4 = r4.mo50644a((java.lang.String) r1)
            java.lang.String r1 = "until next launch."
            com.adcolony.sdk.e0$a r4 = r4.mo50644a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13496g
            r4.mo50645a((com.adcolony.sdk.C6288e0) r1)
            com.adcolony.sdk.AdColony.disable()
            return r0
        L_0x0097:
            java.lang.String r4 = r3.f13619w
            java.lang.String r1 = ""
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00a9
            java.lang.String r4 = r3.f13621y
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00c4
        L_0x00a9:
            boolean r4 = com.adcolony.sdk.C6361l.f13654H
            if (r4 != 0) goto L_0x00c4
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next "
            com.adcolony.sdk.e0$a r4 = r4.mo50644a((java.lang.String) r1)
            java.lang.String r1 = "launch."
            com.adcolony.sdk.e0$a r4 = r4.mo50644a((java.lang.String) r1)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13498i
            r4.mo50645a((com.adcolony.sdk.C6288e0) r1)
            return r0
        L_0x00c4:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6328k.m15383c(com.adcolony.sdk.f1):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50785b(AdColonyAppOptions adColonyAppOptions) {
        this.f13614r = adColonyAppOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50788c(boolean z) {
        this.f13573B = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6252d mo50787c() {
        if (this.f13600d == null) {
            C6252d dVar = new C6252d();
            this.f13600d = dVar;
            dVar.mo50623h();
        }
        return this.f13600d;
    }

    /* renamed from: a */
    private boolean m15374a(boolean z) {
        return m15375a(z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15375a(boolean z, boolean z2) {
        if (!C6185a.m14889c()) {
            return false;
        }
        this.f13580I = z2;
        this.f13577F = z;
        if (z && !z2) {
            if (!m15358L()) {
                return false;
            }
            this.f13580I = true;
        }
        m15357K();
        return true;
    }

    /* renamed from: a */
    private boolean m15368a(C6294f1 f1Var) {
        if (!this.f13577F) {
            return true;
        }
        C6294f1 f1Var2 = this.f13616t;
        if (f1Var2 != null && C6235c0.m15087h(C6235c0.m15085f(f1Var2, "controller"), "sha1").equals(C6235c0.m15087h(C6235c0.m15085f(f1Var, "controller"), "sha1"))) {
            return false;
        }
        new C6288e0.C6289a().mo50644a("Controller sha1 does not match, downloading new controller.").mo50645a(C6288e0.f13496g);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15365a(C6312h0 h0Var) {
        mo50783a(C6235c0.m15083d(h0Var.mo50732a(), "id"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15367a(C6422s sVar) {
        if (sVar.f13801n) {
            C6294f1 a = C6235c0.m15063a(sVar.f13800m, "Parsing launch response");
            C6235c0.m15070a(a, "sdkVersion", mo50803n().mo50916I());
            C6235c0.m15089j(a, this.f13604h.mo51051a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
            if (m15383c(a)) {
                if (m15368a(a)) {
                    C6294f1 b = C6235c0.m15073b();
                    C6235c0.m15070a(b, "url", this.f13619w);
                    C6235c0.m15070a(b, "filepath", this.f13604h.mo51051a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                    this.f13598b.mo51002a(new C6422s(new C6312h0("WebServices.download", 0, b), new C6347n()));
                }
                this.f13616t = a;
            } else if (!this.f13577F) {
                new C6288e0.C6289a().mo50644a("Incomplete or disabled launch server response. ").mo50644a("Disabling AdColony until next launch.").mo50645a(C6288e0.f13497h);
                mo50786b(true);
            }
        } else {
            m15362S();
        }
    }

    /* renamed from: a */
    private boolean m15373a(String str) {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        File file = new File(a.getFilesDir().getAbsolutePath() + "/adc3/" + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
        if (file.exists()) {
            return C6509z0.m15940a(str, file);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50775a() {
        this.f13600d.mo50606a();
        mo50771P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50778a(AdColonyAppOptions adColonyAppOptions) {
        this.f13575D.mo50661a(false);
        this.f13600d.mo50614b();
        mo50773R();
        AdColony.m14782a(C6185a.m14880a(), adColonyAppOptions);
        mo50774T();
        this.f13617u.clear();
        this.f13614r = adColonyAppOptions;
        this.f13597a.mo50742a();
        m15375a(true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50784a(C6360k0 k0Var) {
        this.f13618v.remove(Integer.valueOf(k0Var.getModuleId()));
        return this.f13597a.mo50746b(k0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50783a(int i) {
        this.f13618v.remove(Integer.valueOf(i));
        return this.f13597a.mo50745b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50781a(AdColonyRewardListener adColonyRewardListener) {
        this.f13612p = adColonyRewardListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50782a(C6223c cVar) {
        this.f13608l = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50777a(AdColonyAdView adColonyAdView) {
        this.f13610n = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50780a(AdColonyInterstitial adColonyInterstitial) {
        this.f13611o = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50776a(long j) {
        this.f13575D.mo50660a(j);
    }
}
