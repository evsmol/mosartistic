package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.sdk.f */
public class C8459f {

    /* renamed from: a */
    private static final int f21238a = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: m */
    private static final C8459f f21239m = new C8459f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f21240b = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f21241c;

    /* renamed from: d */
    private final HandlerThread f21242d = new HandlerThread("applovin-anr-detector");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f21243e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f21244f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f21245g = new AtomicBoolean();

    /* renamed from: h */
    private C8490n f21246h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Thread f21247i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f21248j = TimeUnit.SECONDS.toMillis(4);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f21249k = TimeUnit.SECONDS.toMillis(3);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f21250l = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: com.applovin.impl.sdk.f$a */
    private class C8461a implements Runnable {
        private C8461a() {
        }

        public void run() {
            if (!C8459f.this.f21244f.get()) {
                long currentTimeMillis = System.currentTimeMillis() - C8459f.this.f21240b.get();
                if (currentTimeMillis < 0 || currentTimeMillis > C8459f.this.f21248j) {
                    C8459f.this.m25497a();
                    C8459f.this.m25500b();
                }
                C8459f.this.f21243e.postDelayed(this, C8459f.this.f21250l);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.f$b */
    private class C8462b implements Runnable {
        private C8462b() {
        }

        public void run() {
            if (!C8459f.this.f21244f.get()) {
                C8459f.this.f21240b.set(System.currentTimeMillis());
                C8459f.this.f21241c.postDelayed(this, C8459f.this.f21249k);
            }
        }
    }

    private C8459f() {
    }

    /* renamed from: a */
    private static String m25494a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25497a() {
        if (this.f21245g.get()) {
            this.f21244f.set(true);
        }
    }

    /* renamed from: a */
    public static void m25498a(C8490n nVar) {
        if (nVar == null) {
            return;
        }
        if (!((Boolean) nVar.mo57342a(C8380b.f20960fa)).booleanValue() || Utils.isPubInDebugMode(nVar.mo57332P(), nVar)) {
            f21239m.m25497a();
        } else {
            f21239m.m25501b(nVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25500b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m25503c().openConnection();
            httpURLConnection.setConnectTimeout(f21238a);
            httpURLConnection.setReadTimeout(f21238a);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    /* renamed from: b */
    private void m25501b(C8490n nVar) {
        if (this.f21245g.compareAndSet(false, true)) {
            this.f21246h = nVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Thread unused = C8459f.this.f21247i = Thread.currentThread();
                }
            });
            this.f21248j = ((Long) nVar.mo57342a(C8380b.f20961fb)).longValue();
            this.f21249k = ((Long) nVar.mo57342a(C8380b.f20962fc)).longValue();
            this.f21250l = ((Long) nVar.mo57342a(C8380b.f20963fd)).longValue();
            this.f21241c = new Handler(nVar.mo57332P().getMainLooper());
            this.f21242d.start();
            this.f21241c.post(new C8462b());
            Handler handler = new Handler(this.f21242d.getLooper());
            this.f21243e = handler;
            handler.postDelayed(new C8461a(), this.f21250l / 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0107 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[Catch:{ MalformedURLException -> 0x0190 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.URL m25503c() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            com.applovin.impl.sdk.n r1 = r11.f21246h
            android.content.Context r1 = r1.mo57332P()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0017 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0019
        L_0x0017:
            r1 = r0
        L_0x0018:
            r4 = r2
        L_0x0019:
            com.applovin.impl.sdk.n r5 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.t r5 = r5.mo57367ah()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r5 = r5.mo57676c()     // Catch:{ MalformedURLException -> 0x0190 }
            boolean r6 = r5 instanceof com.applovin.impl.sdk.p252ad.C8350e     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = "None"
            if (r6 == 0) goto L_0x0036
            com.applovin.impl.sdk.ad.e r5 = (com.applovin.impl.sdk.p252ad.C8350e) r5     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r6 = "AppLovin"
            long r8 = r5.getAdIdNumber()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x0047
        L_0x0036:
            boolean r6 = r5 instanceof com.applovin.impl.mediation.p234a.C8070a     // Catch:{ MalformedURLException -> 0x0190 }
            if (r6 == 0) goto L_0x0045
            com.applovin.impl.mediation.a.a r5 = (com.applovin.impl.mediation.p234a.C8070a) r5     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r6 = r5.getNetworkName()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r5 = r5.getCreativeId()     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x0047
        L_0x0045:
            r5 = r7
            r6 = r5
        L_0x0047:
            java.lang.Thread r8 = r11.f21247i     // Catch:{ MalformedURLException -> 0x0190 }
            if (r8 == 0) goto L_0x0078
            java.lang.Thread r8 = r11.f21247i     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ MalformedURLException -> 0x0190 }
            int r8 = r8.length     // Catch:{ MalformedURLException -> 0x0190 }
            if (r8 <= 0) goto L_0x0078
            java.lang.Thread r7 = r11.f21247i     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()     // Catch:{ MalformedURLException -> 0x0190 }
            r7 = r7[r3]     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0190 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = r7.getClassName()     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = "."
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = r7.getMethodName()     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r7)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r7 = r8.toString()     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0190 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r9 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.String> r10 = com.applovin.impl.sdk.p254c.C8380b.f20786bi     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r9 = r9.mo57342a(r10)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r9 = "?type=anr&platform=android&package_name="
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&applovin_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r1 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = r1.mo57399p()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&compass_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r1 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = r1.mo57398o()     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&model="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&brand="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&brand_name="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&hardware="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&revision="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = m25494a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r1 = "&app_version="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            if (r4 == 0) goto L_0x0109
            java.lang.String r0 = r4.versionName     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0109:
            java.lang.String r0 = m25494a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&app_version_code="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            if (r4 == 0) goto L_0x0119
            int r3 = r4.versionCode     // Catch:{ MalformedURLException -> 0x0190 }
        L_0x0119:
            r8.append(r3)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&os="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = m25494a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&api_level="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&sdk_version="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = m25494a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&fs_ad_network="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = m25494a((java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&fs_ad_creative_id="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = m25494a((java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&top_main_method="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = m25494a((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&aei="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r0 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.p254c.C8380b.f20745au     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r0 = r0.mo57342a(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = "&mei="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.n r0 = r11.f21246h     // Catch:{ MalformedURLException -> 0x0190 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.p254c.C8380b.f20746av     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.Object r0 = r0.mo57342a(r1)     // Catch:{ MalformedURLException -> 0x0190 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            java.lang.String r0 = r8.toString()     // Catch:{ MalformedURLException -> 0x0190 }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0190 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            return r1
        L_0x0190:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8459f.m25503c():java.net.URL");
    }
}
