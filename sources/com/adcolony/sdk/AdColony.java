package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import com.adcolony.adcolonysdk.BuildConfig;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6390o;
import com.adcolony.sdk.C6509z0;
import com.applovin.sdk.AppLovinEventParameters;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

public class AdColony {

    /* renamed from: a */
    private static ExecutorService f13112a = C6509z0.m15970h();

    /* renamed from: com.adcolony.sdk.AdColony$a */
    class C6163a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6328k f13113a;

        /* renamed from: b */
        final /* synthetic */ C6431t0 f13114b;

        /* renamed from: c */
        final /* synthetic */ AdColonySignalsListener f13115c;

        /* renamed from: com.adcolony.sdk.AdColony$a$a */
        class C6164a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f13116a;

            C6164a(String str) {
                this.f13116a = str;
            }

            public void run() {
                if (!this.f13116a.isEmpty()) {
                    C6163a.this.f13115c.onSuccess(this.f13116a);
                } else {
                    C6163a.this.f13115c.onFailure();
                }
            }
        }

        C6163a(C6328k kVar, C6431t0 t0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f13113a = kVar;
            this.f13114b = t0Var;
            this.f13115c = adColonySignalsListener;
        }

        public void run() {
            C6328k kVar = this.f13113a;
            C6509z0.m15953b((Runnable) new C6164a(AdColony.m14788b(kVar, this.f13114b, kVar.mo50814y())));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$b */
    class C6165b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAdViewListener f13118a;

        /* renamed from: b */
        final /* synthetic */ String f13119b;

        C6165b(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f13118a = adColonyAdViewListener;
            this.f13119b = str;
        }

        public void run() {
            this.f13118a.onRequestNotFilled(AdColony.m14776a(this.f13119b));
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$c */
    class C6166c implements Callable<C6294f1> {

        /* renamed from: a */
        final /* synthetic */ long f13120a;

        C6166c(long j) {
            this.f13120a = j;
        }

        /* renamed from: b */
        public C6294f1 call() {
            return AdColony.m14787b(this.f13120a);
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$d */
    class C6167d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ double f13121a;

        /* renamed from: b */
        final /* synthetic */ String f13122b;

        /* renamed from: c */
        final /* synthetic */ String f13123c;

        /* renamed from: d */
        final /* synthetic */ String f13124d;

        C6167d(double d, String str, String str2, String str3) {
            this.f13121a = d;
            this.f13122b = str;
            this.f13123c = str2;
            this.f13124d = str3;
        }

        public void run() {
            AdColony.m14789b();
            C6294f1 b = C6235c0.m15073b();
            double d = this.f13121a;
            if (d >= 0.0d) {
                C6235c0.m15067a(b, "price", d);
            }
            String str = this.f13122b;
            if (str != null && str.length() <= 3) {
                C6235c0.m15070a(b, "currency_code", this.f13122b);
            }
            C6235c0.m15070a(b, "product_id", this.f13123c);
            C6235c0.m15070a(b, AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, this.f13124d);
            new C6312h0("AdColony.on_iap_report", 1, b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$e */
    class C6168e implements C6509z0.C6511b {

        /* renamed from: a */
        private boolean f13125a;

        /* renamed from: b */
        final /* synthetic */ AdColonyAdViewListener f13126b;

        /* renamed from: c */
        final /* synthetic */ String f13127c;

        /* renamed from: d */
        final /* synthetic */ C6509z0.C6512c f13128d;

        C6168e(AdColonyAdViewListener adColonyAdViewListener, String str, C6509z0.C6512c cVar) {
            this.f13126b = adColonyAdViewListener;
            this.f13127c = str;
            this.f13128d = cVar;
        }

        /* renamed from: a */
        public boolean mo50220a() {
            return this.f13125a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C6288e0.C6289a().mo50644a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo50644a("Timeout set to: " + r6.f13128d.mo51115b() + " ms. ");
            r0.mo50644a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f13128d.mo51116c()) + " ms. ").mo50644a("AdView request not yet started.").mo50645a(com.adcolony.sdk.C6288e0.f13498i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m14783a(r6.f13126b, r6.f13127c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f13128d.mo51114a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f13125a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f13125a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyAdViewListener r0 = r6.f13126b
                java.lang.String r1 = r6.f13127c
                com.adcolony.sdk.AdColony.m14783a((com.adcolony.sdk.AdColonyAdViewListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f13128d
                boolean r0 = r0.mo51114a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f13128d
                long r2 = r2.mo51115b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f13128d
                long r4 = r4.mo51116c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.String r1 = "AdView request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13498i
                r0.mo50645a((com.adcolony.sdk.C6288e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C6168e.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$f */
    class C6169f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6509z0.C6511b f13129a;

        /* renamed from: b */
        final /* synthetic */ String f13130b;

        /* renamed from: c */
        final /* synthetic */ AdColonyAdViewListener f13131c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdSize f13132d;

        /* renamed from: e */
        final /* synthetic */ AdColonyAdOptions f13133e;

        /* renamed from: f */
        final /* synthetic */ C6509z0.C6512c f13134f;

        C6169f(C6509z0.C6511b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, C6509z0.C6512c cVar) {
            this.f13129a = bVar;
            this.f13130b = str;
            this.f13131c = adColonyAdViewListener;
            this.f13132d = adColonyAdSize;
            this.f13133e = adColonyAdOptions;
            this.f13134f = cVar;
        }

        public void run() {
            C6328k b = C6185a.m14887b();
            if (b.mo50765E() || b.mo50766F()) {
                AdColony.m14793f();
                C6509z0.m15936a(this.f13129a);
            } else if (AdColony.m14789b() || !C6185a.m14889c()) {
                C6509z0.m15957c((Runnable) this.f13129a);
                if (!this.f13129a.mo50220a()) {
                    b.mo50787c().mo50610a(this.f13130b, this.f13131c, this.f13132d, this.f13133e, this.f13134f.mo51117d());
                }
            } else {
                C6509z0.m15936a(this.f13129a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$g */
    class C6170g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyAppOptions f13135a;

        C6170g(AdColonyAppOptions adColonyAppOptions) {
            this.f13135a = adColonyAppOptions;
        }

        public void run() {
            AdColony.m14789b();
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15069a(b, "options", this.f13135a.mo50290b());
            new C6312h0("Options.set_options", 1, b).mo50736c();
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$h */
    class C6171h implements C6509z0.C6511b {

        /* renamed from: a */
        private boolean f13136a;

        /* renamed from: b */
        final /* synthetic */ AdColonyInterstitialListener f13137b;

        /* renamed from: c */
        final /* synthetic */ String f13138c;

        /* renamed from: d */
        final /* synthetic */ C6509z0.C6512c f13139d;

        C6171h(AdColonyInterstitialListener adColonyInterstitialListener, String str, C6509z0.C6512c cVar) {
            this.f13137b = adColonyInterstitialListener;
            this.f13138c = str;
            this.f13139d = cVar;
        }

        /* renamed from: a */
        public boolean mo50220a() {
            return this.f13136a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            r0 = new com.adcolony.sdk.C6288e0.C6289a().mo50644a("RequestNotFilled called due to a native timeout. ");
            r0 = r0.mo50644a("Timeout set to: " + r6.f13139d.mo51115b() + " ms. ");
            r0.mo50644a("Execution took: " + (java.lang.System.currentTimeMillis() - r6.f13139d.mo51116c()) + " ms. ").mo50644a("Interstitial request not yet started.").mo50645a(com.adcolony.sdk.C6288e0.f13498i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
            com.adcolony.sdk.AdColony.m14784a(r6.f13137b, r6.f13138c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r6.f13139d.mo51114a() == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f13136a     // Catch:{ all -> 0x0076 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                return
            L_0x0007:
                r0 = 1
                r6.f13136a = r0     // Catch:{ all -> 0x0076 }
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                com.adcolony.sdk.AdColonyInterstitialListener r0 = r6.f13137b
                java.lang.String r1 = r6.f13138c
                com.adcolony.sdk.AdColony.m14784a((com.adcolony.sdk.AdColonyInterstitialListener) r0, (java.lang.String) r1)
                com.adcolony.sdk.z0$c r0 = r6.f13139d
                boolean r0 = r0.mo51114a()
                if (r0 == 0) goto L_0x0075
                com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
                r0.<init>()
                java.lang.String r1 = "RequestNotFilled called due to a native timeout. "
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Timeout set to: "
                r1.append(r2)
                com.adcolony.sdk.z0$c r2 = r6.f13139d
                long r2 = r2.mo51115b()
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Execution took: "
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                com.adcolony.sdk.z0$c r4 = r6.f13139d
                long r4 = r4.mo51116c()
                long r2 = r2 - r4
                r1.append(r2)
                java.lang.String r2 = " ms. "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                java.lang.String r1 = "Interstitial request not yet started."
                com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
                com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13498i
                r0.mo50645a((com.adcolony.sdk.C6288e0) r1)
            L_0x0075:
                return
            L_0x0076:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0076 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.AdColony.C6171h.run():void");
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$i */
    class C6172i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6509z0.C6511b f13140a;

        /* renamed from: b */
        final /* synthetic */ String f13141b;

        /* renamed from: c */
        final /* synthetic */ AdColonyInterstitialListener f13142c;

        /* renamed from: d */
        final /* synthetic */ AdColonyAdOptions f13143d;

        /* renamed from: e */
        final /* synthetic */ C6509z0.C6512c f13144e;

        C6172i(C6509z0.C6511b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, C6509z0.C6512c cVar) {
            this.f13140a = bVar;
            this.f13141b = str;
            this.f13142c = adColonyInterstitialListener;
            this.f13143d = adColonyAdOptions;
            this.f13144e = cVar;
        }

        public void run() {
            C6328k b = C6185a.m14887b();
            if (b.mo50765E() || b.mo50766F()) {
                AdColony.m14793f();
                C6509z0.m15936a(this.f13140a);
            } else if (AdColony.m14789b() || !C6185a.m14889c()) {
                AdColonyZone adColonyZone = b.mo50763C().get(this.f13141b);
                if (adColonyZone == null) {
                    adColonyZone = new AdColonyZone(this.f13141b);
                }
                if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                    C6509z0.m15936a(this.f13140a);
                    return;
                }
                C6509z0.m15957c((Runnable) this.f13140a);
                if (!this.f13140a.mo50220a()) {
                    b.mo50787c().mo50611a(this.f13141b, this.f13142c, this.f13143d, this.f13144e.mo51117d());
                }
            } else {
                C6509z0.m15936a(this.f13140a);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.AdColony$j */
    class C6173j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdColonyInterstitialListener f13145a;

        /* renamed from: b */
        final /* synthetic */ String f13146b;

        C6173j(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f13145a = adColonyInterstitialListener;
            this.f13146b = str;
        }

        public void run() {
            this.f13145a.onRequestNotFilled(AdColony.m14776a(this.f13146b));
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").mo50644a("has not yet been configured.").mo50645a(C6288e0.f13495f);
            return false;
        } else if (!C6509z0.m15964e(str)) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.addCustomMessageListener.").mo50645a(C6288e0.f13495f);
            return false;
        } else {
            C6185a.m14887b().mo50802m().put(str, adColonyCustomMessageListener);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m14788b(C6328k kVar, C6431t0 t0Var, long j) {
        C6405q n = kVar.mo50803n();
        ArrayList arrayList = new ArrayList(Arrays.asList(new C6294f1[]{C6509z0.m15955c(kVar.mo50810u().mo50290b()), C6509z0.m15928a(n.mo50941d())}));
        if (j > 0) {
            C6413q0 q0Var = new C6413q0();
            if (n.mo50921N()) {
                arrayList.add(n.mo50931b());
            } else {
                q0Var.mo50973a(n.mo50925a(j));
            }
            if (n.mo50922O()) {
                arrayList.add(n.mo50937c());
            } else {
                q0Var.mo50973a(n.mo50932b(j));
            }
            if (kVar.mo50767G()) {
                q0Var.mo50973a(new C6166c(j));
            } else {
                arrayList.add(m14791d());
            }
            if (!q0Var.mo50974b()) {
                arrayList.addAll(q0Var.mo50971a());
            }
        } else {
            arrayList.add(n.mo50931b());
            arrayList.add(n.mo50937c());
            arrayList.add(m14791d());
        }
        arrayList.add(kVar.mo50792e());
        C6294f1 a = C6235c0.m15064a((C6294f1[]) arrayList.toArray(new C6294f1[0]));
        t0Var.mo51010c();
        C6235c0.m15077b(a, "signals_count", t0Var.mo51008b());
        C6235c0.m15079b(a, "device_audio", m14792e());
        a.mo50695e();
        byte[] bytes = a.toString().getBytes(C6311h.f13542a);
        if (kVar.mo50768H()) {
            return m14780a(bytes);
        }
        return Base64.encodeToString(bytes, 0);
    }

    /* renamed from: c */
    static void m14790c() {
        if (f13112a.isShutdown()) {
            f13112a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean clearCustomMessageListeners() {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").mo50644a(" has not yet been configured.").mo50645a(C6288e0.f13495f);
            return false;
        }
        C6185a.m14887b().mo50802m().clear();
        return true;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo50645a(C6288e0.f13495f);
            adColonySignalsListener.onFailure();
            return;
        }
        C6328k b = C6185a.m14887b();
        if (!m14786a((Runnable) new C6163a(b, b.mo50813x(), adColonySignalsListener))) {
            adColonySignalsListener.onFailure();
        }
    }

    @Deprecated
    public static boolean configure(Activity activity, String str, String... strArr) {
        return m14785a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: d */
    private static C6294f1 m14791d() {
        return m14787b(-1);
    }

    public static boolean disable() {
        if (!C6185a.m14891e()) {
            return false;
        }
        Context a = C6185a.m14880a();
        if (a != null && (a instanceof C6201b)) {
            ((Activity) a).finish();
        }
        C6328k b = C6185a.m14887b();
        b.mo50787c().mo50614b();
        b.mo50773R();
        b.mo50774T();
        b.mo50786b(true);
        return true;
    }

    /* renamed from: e */
    private static boolean m14792e() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        return C6509z0.m15952b(C6509z0.m15926a(a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m14793f() {
        new C6288e0.C6289a().mo50644a("The AdColony API is not available while AdColony is disabled.").mo50645a(C6288e0.f13497h);
    }

    /* renamed from: g */
    static void m14794g() {
        f13112a.shutdown();
    }

    public static AdColonyAppOptions getAppOptions() {
        if (!C6185a.m14891e()) {
            return null;
        }
        return C6185a.m14887b().mo50810u();
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (!C6185a.m14891e()) {
            return null;
        }
        return C6185a.m14887b().mo50802m().get(str);
    }

    public static AdColonyRewardListener getRewardListener() {
        if (!C6185a.m14891e()) {
            return null;
        }
        return C6185a.m14887b().mo50812w();
    }

    public static String getSDKVersion() {
        if (!C6185a.m14891e()) {
            return "";
        }
        return C6185a.m14887b().mo50803n().mo50916I();
    }

    public static AdColonyZone getZone(String str) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").mo50644a("configured.").mo50645a(C6288e0.f13495f);
            return null;
        }
        HashMap<String, AdColonyZone> C = C6185a.m14887b().mo50763C();
        if (C.containsKey(str)) {
            return C.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        C6185a.m14887b().mo50763C().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, (String) null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").mo50644a(" has not yet been configured.").mo50645a(C6288e0.f13495f);
            return false;
        }
        C6185a.m14887b().mo50802m().remove(str);
        return true;
    }

    public static boolean removeRewardListener() {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").mo50644a("not yet been configured.").mo50645a(C6288e0.f13495f);
            return false;
        }
        C6185a.m14887b().mo50781a((AdColonyRewardListener) null);
        return true;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, (AdColonyAdOptions) null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, (AdColonyAdOptions) null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").mo50644a(" been configured.").mo50645a(C6288e0.f13495f);
            return false;
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        C6185a.m14884a(adColonyAppOptions);
        if (C6185a.m14890d()) {
            C6328k b = C6185a.m14887b();
            if (b.mo50764D()) {
                adColonyAppOptions.mo50288a(b.mo50810u().mo50289a());
            }
        }
        C6185a.m14887b().mo50785b(adColonyAppOptions);
        Context a = C6185a.m14880a();
        if (a != null) {
            adColonyAppOptions.mo50291b(a);
        }
        return m14786a((Runnable) new C6170g(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.setRewardListener() as AdColony has not").mo50644a(" yet been configured.").mo50645a(C6288e0.f13495f);
            return false;
        }
        C6185a.m14887b().mo50781a(adColonyRewardListener);
        return true;
    }

    @Deprecated
    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m14785a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d) {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").mo50644a("configured.").mo50645a(C6288e0.f13495f);
            return false;
        } else if (!C6509z0.m15964e(str) || !C6509z0.m15964e(str2)) {
            new C6288e0.C6289a().mo50644a("Ignoring call to notifyIAPComplete as one of the passed Strings ").mo50644a("is greater than ").mo50642a(128).mo50644a(" characters.").mo50645a(C6288e0.f13495f);
            return false;
        } else {
            if (str3 != null && str3.length() > 3) {
                new C6288e0.C6289a().mo50644a("You are trying to report an IAP event with a currency String ").mo50644a("containing more than 3 characters.").mo50645a(C6288e0.f13495f);
            }
            if (m14786a((Runnable) new C6167d(d, str3, str, str2))) {
                return true;
            }
            new C6288e0.C6289a().mo50644a("Executing AdColony.notifyIAPComplete failed").mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new C6288e0.C6289a().mo50644a("AdColonyAdViewListener is set to null. ").mo50644a("It is required to be non null.").mo50645a(C6288e0.f13495f);
        }
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to requestAdView as AdColony has not yet been").mo50644a(" configured.").mo50645a(C6288e0.f13495f);
            m14783a(adColonyAdViewListener, str);
            return false;
        } else if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new C6288e0.C6289a().mo50644a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").mo50644a(" object with an invalid width or height.").mo50645a(C6288e0.f13495f);
            m14783a(adColonyAdViewListener, str);
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C6421r0.m15698a(1, bundle)) {
                m14783a(adColonyAdViewListener, str);
                return false;
            }
            C6509z0.C6512c cVar = new C6509z0.C6512c(C6185a.m14887b().mo50789d());
            C6168e eVar = new C6168e(adColonyAdViewListener, str, cVar);
            C6509z0.m15938a((Runnable) eVar, cVar.mo51117d());
            if (m14786a((Runnable) new C6169f(eVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
                return true;
            }
            C6509z0.m15936a((C6509z0.C6511b) eVar);
            return false;
        }
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new C6288e0.C6289a().mo50644a("AdColonyInterstitialListener is set to null. ").mo50644a("It is required to be non null.").mo50645a(C6288e0.f13495f);
        }
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.requestInterstitial as AdColony has not").mo50644a(" yet been configured.").mo50645a(C6288e0.f13495f);
            m14784a(adColonyInterstitialListener, str);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C6421r0.m15698a(1, bundle)) {
            m14784a(adColonyInterstitialListener, str);
            return false;
        }
        C6509z0.C6512c cVar = new C6509z0.C6512c(C6185a.m14887b().mo50789d());
        C6171h hVar = new C6171h(adColonyInterstitialListener, str, cVar);
        C6509z0.m15938a((Runnable) hVar, cVar.mo51117d());
        if (m14786a((Runnable) new C6172i(hVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        C6509z0.m15936a((C6509z0.C6511b) hVar);
        return false;
    }

    @Deprecated
    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static boolean m14786a(Runnable runnable) {
        return C6509z0.m15941a(f13112a, runnable);
    }

    @Deprecated
    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return m14785a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static String m14778a(C6328k kVar, C6431t0 t0Var) {
        return m14788b(kVar, t0Var, -1);
    }

    public static boolean configure(Activity activity, String str) {
        return m14785a((Context) activity, (AdColonyAppOptions) null, str);
    }

    /* renamed from: a */
    static String m14780a(byte[] bArr) {
        C6295g gVar = new C6295g(BuildConfig.COLLECT_SIGNALS_DICT_ID, "", BuildConfig.COLLECT_SIGNALS_DICT, "");
        try {
            byte[] a = gVar.mo50712a(bArr);
            C6294f1 b = C6235c0.m15073b();
            b.mo50677a("a", gVar.mo50713b());
            b.mo50677a("b", Base64.encodeToString(a, 0));
            return b.toString();
        } catch (UnsupportedEncodingException | JSONException unused) {
            return Base64.encodeToString(bArr, 0);
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str) {
        return m14785a((Context) activity, adColonyAppOptions, str);
    }

    public static boolean configure(Application application, String str) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str) {
        return m14785a((Context) application, adColonyAppOptions, str);
    }

    /* renamed from: a */
    private static boolean m14785a(Context context, AdColonyAppOptions adColonyAppOptions, String str) {
        if (C6421r0.m15698a(0, (Bundle) null)) {
            new C6288e0.C6289a().mo50644a("Cannot configure AdColony; configuration mechanism requires 5 ").mo50644a("seconds between attempts.").mo50645a(C6288e0.f13495f);
            return false;
        }
        if (context == null) {
            context = C6185a.m14880a();
        }
        if (context == null) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.configure() as the provided Activity or ").mo50644a("Application context is null and we do not currently hold a ").mo50644a("reference to either for our use.").mo50645a(C6288e0.f13495f);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (C6185a.m14890d() && !C6235c0.m15076b(C6185a.m14887b().mo50810u().mo50290b(), "reconfigurable") && !C6185a.m14887b().mo50810u().mo50289a().equals(str)) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.configure() as the app id does not ").mo50644a("match what was used during the initial configuration.").mo50645a(C6288e0.f13495f);
            return false;
        } else if (str.equals("")) {
            new C6288e0.C6289a().mo50644a("AdColony.configure() called with an empty app id String.").mo50645a(C6288e0.f13497h);
            return false;
        } else {
            C6185a.f13242c = true;
            adColonyAppOptions.mo50288a(str);
            if (Build.VERSION.SDK_INT < 21) {
                new C6288e0.C6289a().mo50644a("The minimum API level for the AdColony SDK is ").mo50642a(21).mo50644a(".").mo50645a(C6288e0.f13495f);
                C6185a.m14883a(context, adColonyAppOptions, true);
            } else {
                C6185a.m14883a(context, adColonyAppOptions, false);
            }
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "appId", str);
            C6235c0.m15089j(b, C6185a.m14887b().mo50815z().mo51057f() + "/adc3/AppInfo");
            return true;
        }
    }

    @Deprecated
    public static String collectSignals() {
        if (!C6185a.m14891e()) {
            new C6288e0.C6289a().mo50644a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").mo50645a(C6288e0.f13495f);
            return "";
        }
        C6328k b = C6185a.m14887b();
        return m14778a(b, b.mo50813x());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6294f1 m14787b(long j) {
        C6390o.C6392b bVar;
        C6294f1 b = C6235c0.m15073b();
        if (j > 0) {
            bVar = C6396o0.m15589c().mo50885a(j);
        } else {
            bVar = C6396o0.m15589c().mo50892b();
        }
        if (bVar != null) {
            C6235c0.m15069a(b, "odt_payload", bVar.mo50874b());
        }
        return b;
    }

    /* renamed from: b */
    static boolean m14789b() {
        C6328k b = C6185a.m14887b();
        b.mo50776a(15000);
        return b.mo50769I();
    }

    /* renamed from: a */
    static AdColonyZone m14776a(String str) {
        AdColonyZone adColonyZone;
        if (C6185a.m14889c()) {
            adColonyZone = C6185a.m14887b().mo50763C().get(str);
        } else {
            adColonyZone = C6185a.m14890d() ? C6185a.m14887b().mo50763C().get(str) : null;
        }
        if (adColonyZone != null) {
            return adColonyZone;
        }
        AdColonyZone adColonyZone2 = new AdColonyZone(str);
        adColonyZone2.mo50418c(6);
        return adColonyZone2;
    }

    /* renamed from: a */
    static void m14784a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            C6509z0.m15953b((Runnable) new C6173j(adColonyInterstitialListener, str));
        }
    }

    /* renamed from: a */
    static void m14783a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            C6509z0.m15953b((Runnable) new C6165b(adColonyAdViewListener, str));
        }
    }

    /* renamed from: a */
    static void m14782a(Context context, AdColonyAppOptions adColonyAppOptions) {
        C6328k b = C6185a.m14887b();
        C6405q n = b.mo50803n();
        if (adColonyAppOptions != null && context != null) {
            String d = C6509z0.m15961d(context);
            String c = C6509z0.m15956c();
            int d2 = C6509z0.m15959d();
            String m = n.mo50950m();
            String e = b.mo50808s().mo50844e();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            hashMap.put("countryLocaleShort", C6185a.m14887b().mo50803n().mo50953p());
            hashMap.put("manufacturer", C6185a.m14887b().mo50803n().mo50910C());
            hashMap.put("model", C6185a.m14887b().mo50803n().mo50913F());
            hashMap.put("osVersion", C6185a.m14887b().mo50803n().mo50915H());
            hashMap.put("carrierName", m);
            hashMap.put("networkType", e);
            hashMap.put("platform", "android");
            hashMap.put("appName", d);
            hashMap.put("appVersion", c);
            hashMap.put("appBuildNumber", Integer.valueOf(d2));
            hashMap.put("appId", "" + adColonyAppOptions.mo50289a());
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("sdkVersion", C6185a.m14887b().mo50803n().mo50916I());
            hashMap.put("controllerVersion", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            C6294f1 f1Var = new C6294f1(adColonyAppOptions.getMediationInfo());
            C6294f1 f1Var2 = new C6294f1(adColonyAppOptions.getPluginInfo());
            if (!C6235c0.m15087h(f1Var, "mediation_network").equals("")) {
                hashMap.put("mediationNetwork", C6235c0.m15087h(f1Var, "mediation_network"));
                hashMap.put("mediationNetworkVersion", C6235c0.m15087h(f1Var, "mediation_network_version"));
            }
            if (!C6235c0.m15087h(f1Var2, "plugin").equals("")) {
                hashMap.put("plugin", C6235c0.m15087h(f1Var2, "plugin"));
                hashMap.put("pluginVersion", C6235c0.m15087h(f1Var2, "plugin_version"));
            }
            b.mo50806q().mo50722a((HashMap<String, Object>) hashMap);
        }
    }
}
