package com.appodeal.ads;

import com.appodeal.ads.C9378o1;
import com.appodeal.ads.C9685w2;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.q1 */
public final class C9403q1 {

    /* renamed from: f */
    public static volatile C9403q1 f23825f;

    /* renamed from: a */
    public InterstitialCallbacks f23826a;

    /* renamed from: b */
    public boolean f23827b = false;

    /* renamed from: c */
    public boolean f23828c = true;

    /* renamed from: d */
    public final C9404a f23829d;

    /* renamed from: e */
    public final C9405b f23830e;

    /* renamed from: com.appodeal.ads.q1$a */
    public class C9404a extends C9406c<C9425r1, C9394p1, C9378o1.C9381c> {
        public C9404a(C9403q1 q1Var) {
            super();
        }

        /* renamed from: a */
        public final C9577u<C9394p1, C9425r1, C9378o1.C9381c> mo60589a() {
            return C9378o1.m27718a();
        }
    }

    /* renamed from: com.appodeal.ads.q1$b */
    public class C9405b extends C9406c<C9419q5, C9388o5, C9685w2.C9686a> {
        public C9405b(C9403q1 q1Var) {
            super();
        }

        /* renamed from: a */
        public final C9577u<C9388o5, C9419q5, C9685w2.C9686a> mo60589a() {
            return C9685w2.m28463a();
        }
    }

    /* renamed from: com.appodeal.ads.q1$c */
    public abstract class C9406c<AdRequestType extends C9420r<AdObjectType>, AdObjectType extends C9258l, RequestParamsType extends C9464s> extends C9192g<AdRequestType, AdObjectType, Object> {

        /* renamed from: a */
        public C9406c f23831a;

        /* renamed from: b */
        public boolean f23832b = false;

        /* renamed from: c */
        public boolean f23833c = true;

        /* renamed from: d */
        public boolean f23834d = false;

        public C9406c() {
        }

        /* renamed from: a */
        public abstract C9577u<AdObjectType, AdRequestType, RequestParamsType> mo60589a();

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (r0.f24292j == false) goto L_0x0053;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60590a(android.content.Context r6, RequestParamsType r7) {
            /*
                r5 = this;
                com.appodeal.ads.u r0 = r5.mo60589a()
                boolean r1 = r7.f24026a
                if (r1 == 0) goto L_0x000c
                r0.mo60839b((android.content.Context) r6, r7)
                return
            L_0x000c:
                boolean r1 = r0.f24291i
                if (r1 != 0) goto L_0x001a
                java.lang.String r6 = "Interstitial"
                java.lang.String r7 = "Request Failed"
                java.lang.String r0 = "isn't initialized"
                com.appodeal.ads.utils.Log.log((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r0)
                return
            L_0x001a:
                boolean r1 = r5.f23833c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0053
                r5.f23833c = r3
                r5.f23832b = r2
                r5.f23834d = r3
                com.appodeal.ads.r r1 = r0.mo60846f()
                if (r1 == 0) goto L_0x0046
                boolean r4 = r1.f23906u
                if (r4 == 0) goto L_0x0046
                boolean r4 = r0.f24292j
                if (r4 != 0) goto L_0x0046
                AdObjectType r1 = r1.f23904s
                if (r1 == 0) goto L_0x0041
                com.appodeal.ads.f5 r1 = r1.f23269c
                boolean r1 = r1.isPrecache()
                if (r1 == 0) goto L_0x0041
                goto L_0x0042
            L_0x0041:
                r2 = 0
            L_0x0042:
                r5.mo60591a(r2)
                goto L_0x0053
            L_0x0046:
                if (r1 == 0) goto L_0x0054
                boolean r1 = r1.mo60610b()
                if (r1 != 0) goto L_0x0054
                boolean r1 = r0.f24292j
                if (r1 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r2 = 0
            L_0x0054:
                if (r2 == 0) goto L_0x0059
                r0.mo60839b((android.content.Context) r6, r7)
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9403q1.C9406c.mo60590a(android.content.Context, com.appodeal.ads.s):void");
        }

        /* renamed from: a */
        public final void mo59943a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_CLOSED, Log.LogLevel.verbose);
            if (C9403q1.this.f23826a != null) {
                C9403q1.this.f23826a.onInterstitialClosed();
            }
        }

        /* renamed from: a */
        public final void mo59944a(AdRequestType adrequesttype, AdObjectType adobjecttype, Object obj) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
            if (C9403q1.this.f23826a != null) {
                C9403q1.this.f23826a.onInterstitialClicked();
            }
        }

        /* renamed from: a */
        public final void mo60591a(boolean z) {
            this.f23834d = false;
            if (!C9403q1.this.f23827b) {
                C9403q1.this.f23827b = true;
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(z)}), Log.LogLevel.verbose);
                if (C9403q1.this.f23826a != null) {
                    C9403q1.this.f23826a.onInterstitialLoaded(z);
                }
            }
        }

        /* renamed from: b */
        public final void mo59945b(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            if (mo60589a().mo60582k()) {
                this.f23833c = true;
                mo60589a().mo60842c(C9148b.f22956b.getApplicationContext());
            }
            C9420r f = this.f23831a.mo60589a().mo60846f();
            if (f == null || !f.mo60625p() || this.f23831a.mo60589a().mo60854p()) {
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
                if (C9403q1.this.f23826a != null) {
                    C9403q1.this.f23826a.onInterstitialExpired();
                }
                if (C9403q1.this.f23828c) {
                    C9403q1.this.f23827b = false;
                }
            }
        }

        /* renamed from: b */
        public final void mo59946b(C9420r rVar, C9258l lVar, Object obj) {
            this.f23834d = true;
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
            if (C9403q1.this.f23826a != null) {
                C9403q1.this.f23826a.onInterstitialShowFailed();
            }
            C9406c cVar = this.f23831a;
            if (!cVar.f23832b || cVar.f23834d || cVar.mo60589a().mo60851m()) {
                this.f23833c = true;
                C9406c cVar2 = this.f23831a;
                if (cVar2.f23832b && cVar2.f23834d) {
                    cVar2.f23833c = true;
                }
            }
        }

        /* renamed from: c */
        public final void mo59948c(AdRequestType adrequesttype, AdObjectType adobjecttype, Object obj) {
            Log.log("Interstitial", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
            if (C9403q1.this.f23826a != null) {
                C9403q1.this.f23826a.onInterstitialShown();
            }
            C9403q1.this.f23827b = false;
            this.f23832b = false;
            this.f23834d = false;
            this.f23833c = true;
            C9406c cVar = this.f23831a;
            if (cVar.f23832b && cVar.f23834d) {
                cVar.f23833c = true;
            } else if (C9409q4.m27865e(cVar.mo60589a().mo60843d().getCode())) {
                C9406c cVar2 = this.f23831a;
                cVar2.mo60591a(C9409q4.m27868f(cVar2.mo60589a().mo60843d().getCode()));
            }
            if (adrequesttype != null && !adrequesttype.mo60626q() && C9403q1.m27787a().mo60587b()) {
                C9420r f = mo60589a().mo60846f();
                if (f == null || f.mo60610b()) {
                    mo60589a().mo60842c(C9148b.f22956b.getApplicationContext());
                }
            }
        }

        /* renamed from: d */
        public final void mo59949d(C9420r rVar, C9258l lVar) {
            this.f23834d = true;
            C9406c cVar = this.f23831a;
            if (!cVar.f23832b || cVar.f23834d || cVar.mo60589a().mo60851m()) {
                this.f23833c = true;
                Log.log("Interstitial", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
                if (C9403q1.this.f23826a != null) {
                    C9403q1.this.f23826a.onInterstitialFailedToLoad();
                }
                C9406c cVar2 = this.f23831a;
                if (cVar2.f23832b && cVar2.f23834d) {
                    cVar2.f23833c = true;
                }
            }
        }

        /* renamed from: e */
        public final void mo59950e(AdRequestType adrequesttype, AdObjectType adobjecttype) {
            mo60591a(adobjecttype != null && adobjecttype.f23269c.isPrecache());
        }
    }

    public C9403q1() {
        C9404a aVar = new C9404a(this);
        this.f23829d = aVar;
        C9405b bVar = new C9405b(this);
        this.f23830e = bVar;
        aVar.f23831a = bVar;
        bVar.f23831a = aVar;
    }

    /* renamed from: a */
    public static C9403q1 m27787a() {
        if (f23825f == null) {
            synchronized (C9403q1.class) {
                if (f23825f == null) {
                    f23825f = new C9403q1();
                }
            }
        }
        return f23825f;
    }

    /* renamed from: b */
    public final boolean mo60587b() {
        return this.f23828c;
    }

    /* renamed from: c */
    public final void mo60588c() {
        this.f23827b = false;
        this.f23829d.f23833c = true;
        this.f23830e.f23833c = true;
    }
}
