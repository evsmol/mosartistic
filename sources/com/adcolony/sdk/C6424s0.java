package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C6292f0;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p150io.bidmachine.ads.networks.adcolony.BuildConfig;

/* renamed from: com.adcolony.sdk.s0 */
class C6424s0 {

    /* renamed from: a */
    C6284d0 f13804a;

    /* renamed from: b */
    ScheduledExecutorService f13805b;

    /* renamed from: c */
    List<C6292f0> f13806c = new ArrayList();

    /* renamed from: d */
    HashMap<String, Object> f13807d;

    /* renamed from: e */
    private C6203b0 f13808e = new C6203b0("adcolony_android", BuildConfig.ADAPTER_SDK_VERSION_NAME, "Production");

    /* renamed from: com.adcolony.sdk.s0$a */
    class C6425a implements Runnable {
        C6425a() {
        }

        public void run() {
            C6424s0.this.mo50987a();
        }
    }

    /* renamed from: com.adcolony.sdk.s0$b */
    class C6426b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6292f0 f13810a;

        C6426b(C6292f0 f0Var) {
            this.f13810a = f0Var;
        }

        public void run() {
            C6424s0.this.f13806c.add(this.f13810a);
        }
    }

    C6424s0(C6284d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f13804a = d0Var;
        this.f13805b = scheduledExecutorService;
        this.f13807d = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo50988a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f13805b.isShutdown() && !this.f13805b.isTerminated()) {
                this.f13805b.scheduleAtFixedRate(new C6425a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f13805b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo50990b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f13805b     // Catch:{ all -> 0x004a }
            r0.shutdown()     // Catch:{ all -> 0x004a }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f13805b     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003c }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.ScheduledExecutorService r0 = r4.f13805b     // Catch:{ InterruptedException -> 0x003c }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f13805b     // Catch:{ InterruptedException -> 0x003c }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003c }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003c }
            java.lang.Class<com.adcolony.sdk.s0> r2 = com.adcolony.sdk.C6424s0.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003c }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003c }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0048
        L_0x003c:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f13805b     // Catch:{ all -> 0x004a }
            r0.shutdownNow()     // Catch:{ all -> 0x004a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r0.interrupt()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6424s0.mo50990b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo50993c(String str) {
        mo50991b(new C6292f0.C6293a().mo50668a(2).mo50669a(this.f13808e).mo50670a(str).mo50671a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo50994d(String str) {
        mo50991b(new C6292f0.C6293a().mo50668a(1).mo50669a(this.f13808e).mo50670a(str).mo50671a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo50995e(String str) {
        this.f13807d.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo50996f(String str) {
        this.f13807d.put("sessionId", str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50987a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f13806c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            if (r0 <= 0) goto L_0x0029
            com.adcolony.sdk.b0 r0 = r2.f13808e     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r1 = r2.f13806c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.lang.String r0 = r2.mo50986a((com.adcolony.sdk.C6203b0) r0, (java.util.List<com.adcolony.sdk.C6292f0>) r1)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            com.adcolony.sdk.d0 r1 = r2.f13804a     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r1.mo50640a(r0)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f13806c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r0.clear()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f13806c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
            goto L_0x0029
        L_0x0024:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f13806c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6424s0.mo50987a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo50992b(String str) {
        mo50991b(new C6292f0.C6293a().mo50668a(0).mo50669a(this.f13808e).mo50670a(str).mo50671a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo50991b(C6292f0 f0Var) {
        try {
            if (!this.f13805b.isShutdown() && !this.f13805b.isTerminated()) {
                this.f13805b.submit(new C6426b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo50989a(String str) {
        mo50991b(new C6292f0.C6293a().mo50668a(3).mo50669a(this.f13808e).mo50670a(str).mo50671a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo50986a(C6203b0 b0Var, List<C6292f0> list) throws JSONException {
        C6294f1 f1Var = new C6294f1();
        f1Var.mo50677a("index", b0Var.mo50460b());
        f1Var.mo50677a("environment", b0Var.mo50459a());
        f1Var.mo50677a("version", b0Var.mo50461c());
        C6290e1 e1Var = new C6290e1();
        for (C6292f0 a : list) {
            e1Var.mo50646a(m15705a(a));
        }
        f1Var.mo50675a("logs", e1Var);
        return f1Var.toString();
    }

    /* renamed from: a */
    private synchronized C6294f1 m15705a(C6292f0 f0Var) throws JSONException {
        C6294f1 f1Var;
        f1Var = new C6294f1((Map<?, ?>) this.f13807d);
        f1Var.mo50677a("environment", f0Var.mo50663a().mo50459a());
        f1Var.mo50677a(AppLovinEventTypes.USER_COMPLETED_LEVEL, f0Var.mo50664b());
        f1Var.mo50677a("message", f0Var.mo50665c());
        f1Var.mo50677a("clientTimestamp", f0Var.mo50666d());
        C6294f1 f1Var2 = new C6294f1(C6185a.m14887b().mo50810u().getMediationInfo());
        C6294f1 f1Var3 = new C6294f1(C6185a.m14887b().mo50810u().getPluginInfo());
        f1Var.mo50677a("mediation_network", C6235c0.m15087h(f1Var2, AppMeasurementSdk.ConditionalUserProperty.NAME));
        f1Var.mo50677a("mediation_network_version", C6235c0.m15087h(f1Var2, "version"));
        f1Var.mo50677a("plugin", C6235c0.m15087h(f1Var3, AppMeasurementSdk.ConditionalUserProperty.NAME));
        f1Var.mo50677a("plugin_version", C6235c0.m15087h(f1Var3, "version"));
        C6290e1 b = C6185a.m14887b().mo50806q().mo50725b();
        if (b == null || b.mo50649a("batteryInfo")) {
            f1Var.mo50685b("batteryInfo", C6185a.m14887b().mo50803n().mo50949l());
        }
        if (b != null) {
            f1Var.mo50679a(b);
        }
        return f1Var;
    }
}
