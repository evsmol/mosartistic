package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6509z0;
import com.appnext.banners.BannerAdRequest;

public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdColonyInterstitialListener f13188a;

    /* renamed from: b */
    private C6183f f13189b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6223c f13190c;

    /* renamed from: d */
    private AdColonyAdOptions f13191d;

    /* renamed from: e */
    private C6401p0 f13192e;

    /* renamed from: f */
    private int f13193f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f13194g;

    /* renamed from: h */
    private String f13195h;

    /* renamed from: i */
    private final String f13196i;

    /* renamed from: j */
    private String f13197j;

    /* renamed from: k */
    private String f13198k;

    /* renamed from: l */
    private C6184g f13199l;

    /* renamed from: m */
    private boolean f13200m;

    /* renamed from: n */
    private String f13201n;

    /* renamed from: o */
    final C6509z0.C6511b f13202o = new C6178a();

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$a */
    class C6178a implements C6509z0.C6511b {

        /* renamed from: a */
        private boolean f13203a;

        C6178a() {
        }

        /* renamed from: a */
        public boolean mo50220a() {
            return this.f13203a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            r0 = com.adcolony.sdk.C6185a.m14887b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (r0.mo50769I() == false) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            r0.mo50775a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r0 = new com.adcolony.sdk.C6288e0.C6289a().mo50644a("Ad show failed due to a native timeout (5000 ms). ");
            r0.mo50644a("Interstitial with adSessionId(" + com.adcolony.sdk.AdColonyInterstitial.m14830a(r3.f13204b) + "). ").mo50644a("Reloading controller.").mo50645a(com.adcolony.sdk.C6288e0.f13498i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (com.adcolony.sdk.C6185a.m14890d() != false) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f13203a     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                return
            L_0x0007:
                r0 = 1
                r3.f13203a = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                boolean r0 = com.adcolony.sdk.C6185a.m14890d()
                if (r0 != 0) goto L_0x0012
                return
            L_0x0012:
                com.adcolony.sdk.k r0 = com.adcolony.sdk.C6185a.m14887b()
                boolean r1 = r0.mo50769I()
                if (r1 == 0) goto L_0x001f
                r0.mo50775a()
            L_0x001f:
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "Ad show failed due to a native timeout (5000 ms). "
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Interstitial with adSessionId("
                r1.append(r2)
                com.adcolony.sdk.AdColonyInterstitial r2 = com.adcolony.sdk.AdColonyInterstitial.this
                java.lang.String r2 = r2.f13194g
                r1.append(r2)
                java.lang.String r2 = "). "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.String r1 = "Reloading controller."
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13498i
                r0.mo50645a((com.adcolony.sdk.C6288e0) r1)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColonyInterstitial.C6178a.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$b */
    class C6179b implements Runnable {
        C6179b() {
        }

        public void run() {
            if (!(C6185a.m14880a() instanceof AdColonyInterstitialActivity) && AdColonyInterstitial.this.f13188a != null) {
                AdColonyInterstitial.this.f13188a.onOpened(AdColonyInterstitial.this);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$c */
    class C6180c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6252d f13206a;

        /* renamed from: b */
        final /* synthetic */ String f13207b;

        C6180c(C6252d dVar, String str) {
            this.f13206a = dVar;
            this.f13207b = str;
        }

        public void run() {
            Context a = C6185a.m14880a();
            if (a instanceof C6201b) {
                this.f13206a.mo50607a(a, C6235c0.m15073b(), this.f13207b);
            } else {
                if (AdColonyInterstitial.this.f13188a != null) {
                    AdColonyInterstitial.this.f13188a.onClosed(AdColonyInterstitial.this);
                    AdColonyInterstitial.this.setListener((AdColonyInterstitialListener) null);
                }
                AdColonyInterstitial.this.mo50367o();
                AdColonyInterstitial.this.destroy();
                C6185a.m14887b().mo50793e(false);
            }
            if (AdColonyInterstitial.this.f13190c != null) {
                this.f13206a.mo50609a(AdColonyInterstitial.this.f13190c);
                C6223c unused = AdColonyInterstitial.this.f13190c = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$d */
    class C6181d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f13209a;

        C6181d(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f13209a = adColonyInterstitialListener;
        }

        public void run() {
            this.f13209a.onRequestNotFilled(AdColony.m14776a(AdColonyInterstitial.this.getZoneID()));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$e */
    class C6182e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f13211a;

        C6182e(AdColonyInterstitialListener adColonyInterstitialListener) {
            this.f13211a = adColonyInterstitialListener;
        }

        public void run() {
            this.f13211a.onExpiring(AdColonyInterstitial.this);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$f */
    interface C6183f {
        /* renamed from: a */
        void mo50383a();
    }

    /* renamed from: com.adcolony.sdk.AdColonyInterstitial$g */
    enum C6184g {
        REQUESTED,
        FILLED,
        NOT_FILLED,
        EXPIRED,
        SHOWN,
        CLOSED
    }

    AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.f13188a = adColonyInterstitialListener;
        this.f13196i = str2;
        this.f13194g = str;
        this.f13199l = C6184g.REQUESTED;
    }

    /* renamed from: k */
    private boolean m14833k() {
        String e = C6185a.m14887b().mo50808s().mo50844e();
        String viewNetworkPassFilter = getViewNetworkPassFilter();
        return viewNetworkPassFilter == null || viewNetworkPassFilter.length() == 0 || viewNetworkPassFilter.equals(e) || viewNetworkPassFilter.equals(BannerAdRequest.TYPE_ALL) || (viewNetworkPassFilter.equals("online") && (e.equals("wifi") || e.equals("cell"))) || (viewNetworkPassFilter.equals("offline") && e.equals("none"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50342a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50348c(String str) {
    }

    public boolean cancel() {
        if (this.f13190c == null) {
            return false;
        }
        Context a = C6185a.m14880a();
        if (a != null && !(a instanceof AdColonyInterstitialActivity)) {
            return false;
        }
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "id", this.f13190c.mo50523a());
        new C6312h0("AdSession.on_request_close", this.f13190c.mo50551k(), b).mo50736c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6223c mo50350d() {
        return this.f13190c;
    }

    public boolean destroy() {
        C6185a.m14887b().mo50787c().mo50621f().remove(this.f13194g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50354e(String str) {
        if (C6185a.m14890d()) {
            C6328k b = C6185a.m14887b();
            C6252d c = b.mo50787c();
            C6509z0.m15953b((Runnable) new C6179b());
            AdColonyZone adColonyZone = b.mo50763C().get(this.f13196i);
            if (adColonyZone != null && adColonyZone.isRewarded()) {
                C6294f1 f1Var = new C6294f1();
                C6235c0.m15077b(f1Var, "reward_amount", adColonyZone.getRewardAmount());
                C6235c0.m15070a(f1Var, "reward_name", adColonyZone.getRewardName());
                C6235c0.m15079b(f1Var, "success", true);
                C6235c0.m15070a(f1Var, "zone_id", this.f13196i);
                b.mo50794e(new C6312h0("AdColony.v4vc_reward", 0, f1Var));
            }
            C6509z0.m15953b((Runnable) new C6180c(c, str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo50355f() {
        return this.f13193f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo50356g() {
        return this.f13198k;
    }

    public AdColonyInterstitialListener getListener() {
        return this.f13188a;
    }

    public String getViewNetworkPassFilter() {
        return this.f13201n;
    }

    public String getZoneID() {
        return this.f13196i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo50360h() {
        return this.f13200m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo50361i() {
        return this.f13192e != null;
    }

    public boolean isExpired() {
        C6184g gVar = this.f13199l;
        return gVar == C6184g.EXPIRED || gVar == C6184g.SHOWN || gVar == C6184g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo50363j() {
        return this.f13199l == C6184g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo50364l() {
        return this.f13199l == C6184g.REQUESTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo50365m() {
        return this.f13199l == C6184g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo50366n() {
        C6509z0.m15957c((Runnable) this.f13202o);
        Context a = C6185a.m14880a();
        if (a == null || !C6185a.m14890d() || this.f13202o.mo50220a()) {
            return false;
        }
        C6185a.m14887b().mo50782a(this.f13190c);
        C6185a.m14887b().mo50780a(this);
        C6509z0.m15934a(new Intent(a, AdColonyInterstitialActivity.class));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo50367o() {
        C6183f fVar;
        synchronized (this) {
            mo50370r();
            fVar = this.f13189b;
            if (fVar != null) {
                this.f13189b = null;
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.mo50383a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo50368p() {
        mo50371s();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f13188a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C6509z0.m15953b((Runnable) new C6182e(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo50369q() {
        mo50376u();
        AdColonyInterstitialListener adColonyInterstitialListener = this.f13188a;
        if (adColonyInterstitialListener == null) {
            return false;
        }
        C6509z0.m15953b((Runnable) new C6181d(adColonyInterstitialListener));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo50370r() {
        this.f13199l = C6184g.CLOSED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo50371s() {
        this.f13199l = C6184g.EXPIRED;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.f13188a = adColonyInterstitialListener;
    }

    public void setViewNetworkPassFilter(String str) {
        this.f13201n = str;
    }

    public boolean show() {
        boolean z = false;
        if (!C6185a.m14890d()) {
            return false;
        }
        C6328k b = C6185a.m14887b();
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15070a(b2, "zone_id", this.f13196i);
        C6235c0.m15077b(b2, "type", 0);
        C6235c0.m15070a(b2, "id", this.f13194g);
        if (mo50365m()) {
            C6235c0.m15077b(b2, "request_fail_reason", 24);
            new C6288e0.C6289a().mo50644a("This ad object has already been shown. Please request a new ad ").mo50644a("via AdColony.requestInterstitial.").mo50645a(C6288e0.f13495f);
        } else if (this.f13199l == C6184g.EXPIRED) {
            C6235c0.m15077b(b2, "request_fail_reason", 17);
            new C6288e0.C6289a().mo50644a("This ad object has expired. Please request a new ad via AdColony").mo50644a(".requestInterstitial.").mo50645a(C6288e0.f13495f);
        } else if (b.mo50770J()) {
            C6235c0.m15077b(b2, "request_fail_reason", 23);
            new C6288e0.C6289a().mo50644a("Can not show ad while an interstitial is already active.").mo50645a(C6288e0.f13495f);
        } else if (mo50343a(b.mo50763C().get(this.f13196i))) {
            C6235c0.m15077b(b2, "request_fail_reason", 11);
        } else if (!m14833k()) {
            C6235c0.m15077b(b2, "request_fail_reason", 9);
            new C6288e0.C6289a().mo50644a("Tried to show interstitial ad during unacceptable network conditions.").mo50645a(C6288e0.f13495f);
        } else {
            mo50377v();
            C6185a.m14887b().mo50793e(true);
            C6509z0.m15938a((Runnable) this.f13202o, 5000);
            z = true;
        }
        AdColonyAdOptions adColonyAdOptions = this.f13191d;
        if (adColonyAdOptions != null) {
            C6235c0.m15079b(b2, "pre_popup", adColonyAdOptions.f13147a);
            C6235c0.m15079b(b2, "post_popup", this.f13191d.f13148b);
        }
        AdColonyZone adColonyZone = b.mo50763C().get(this.f13196i);
        if (adColonyZone != null && adColonyZone.isRewarded() && b.mo50812w() == null) {
            new C6288e0.C6289a().mo50644a("Rewarded ad: show() called with no reward listener set.").mo50645a(C6288e0.f13495f);
        }
        new C6312h0("AdSession.launch_ad_unit", 1, b2).mo50736c();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo50375t() {
        this.f13199l = C6184g.FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo50376u() {
        this.f13199l = C6184g.NOT_FILLED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo50377v() {
        this.f13199l = C6184g.SHOWN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo50344b() {
        return this.f13194g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo50347c() {
        return this.f13197j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50351d(String str) {
        this.f13198k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50343a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.mo50415a() == 0) {
                adColonyZone.mo50417b(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.mo50417b(adColonyZone.mo50415a() - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50345b(String str) {
        this.f13197j = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50346b(boolean z) {
        this.f13200m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50338a(C6183f fVar) {
        boolean z;
        synchronized (this) {
            if (this.f13199l == C6184g.CLOSED) {
                z = true;
            } else {
                this.f13189b = fVar;
                z = false;
            }
        }
        if (z) {
            fVar.mo50383a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50340a(C6294f1 f1Var) {
        if (!f1Var.mo50689b()) {
            this.f13192e = new C6401p0(f1Var, this.f13194g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50339a(C6223c cVar) {
        this.f13190c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50337a(AdColonyAdOptions adColonyAdOptions) {
        this.f13191d = adColonyAdOptions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50336a(int i) {
        this.f13193f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo50335a() {
        String str = this.f13195h;
        return str == null ? "" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6401p0 mo50353e() {
        return this.f13192e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50341a(String str) {
        this.f13195h = str;
    }
}
