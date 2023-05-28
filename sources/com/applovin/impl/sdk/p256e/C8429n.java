package com.applovin.impl.sdk.p256e;

import android.app.Activity;
import com.applovin.impl.sdk.C8397e;
import com.applovin.impl.sdk.C8475k;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.C8612l;
import com.applovin.impl.sdk.utils.C8618q;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.n */
public class C8429n extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f21161a;

    public C8429n(C8490n nVar) {
        super("TaskInitializeSdk", nVar);
        this.f21161a = nVar;
    }

    /* renamed from: a */
    private void m25412a() {
        if (!this.f21161a.mo57323G().mo56538a()) {
            Activity ar = this.f21161a.mo57377ar();
            if (ar != null) {
                this.f21161a.mo57323G().mo56533a(ar);
            } else {
                this.f21161a.mo57337V().mo57229a((C8401a) new C8458z(this.f21161a, true, new Runnable() {
                    public void run() {
                        C8429n.this.f21161a.mo57323G().mo56533a(C8429n.this.f21161a.mo57368ai().mo56831a());
                    }
                }), C8432o.C8434a.MAIN, TimeUnit.SECONDS.toMillis(1));
            }
        }
    }

    /* renamed from: b */
    private void m25413b() {
        String str;
        if (!this.f21161a.mo57388e()) {
            boolean d = this.f21161a.mo57331O().mo57097d();
            if (d) {
                str = this.f21161a.mo57340Y().mo57636k().f21575b + " (use this for test devices)";
            } else {
                str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            }
            Map<String, Object> d2 = this.f21161a.mo57340Y().mo57629d();
            Map<String, Object> c = this.f21161a.mo57340Y().mo57628c();
            C8612l lVar = new C8612l();
            lVar.mo57741a().mo57747a("=====AppLovin SDK=====");
            lVar.mo57747a("===SDK Versions===").mo57748a("Version", AppLovinSdk.VERSION).mo57748a("Plugin Version", this.f21161a.mo57342a(C8380b.f20864dI)).mo57748a("Ad Review Version", C8397e.m25291a()).mo57748a("OM SDK Version", this.f21161a.mo57374ao().mo56872c());
            lVar.mo57747a("===Device Info===").mo57748a("OS", Utils.getAndroidOSInfo()).mo57748a(IronSourceConstants.TYPE_GAID, str).mo57748a("Model", d2.get("model")).mo57748a("Locale", d2.get("locale")).mo57748a("Emulator", d2.get("sim")).mo57748a("Tablet", d2.get("is_tablet"));
            lVar.mo57747a("===App Info===").mo57748a("Application ID", c.get("package_name")).mo57748a("Target SDK", c.get("target_sdk")).mo57748a("ExoPlayer Version", Integer.valueOf(Utils.getExoPlayerVersionCode()));
            lVar.mo57747a("===SDK Settings===").mo57748a("SDK Key", this.f21161a.mo57319C()).mo57748a("Mediation Provider", this.f21161a.mo57405u()).mo57748a("TG", C8618q.m26216a(this.f21161a)).mo57748a("AEI", this.f21161a.mo57342a(C8380b.f20745au)).mo57748a("MEI", this.f21161a.mo57342a(C8380b.f20746av)).mo57748a("Test Mode On", Boolean.valueOf(this.f21161a.mo57330N().mo56529a())).mo57748a("Verbose Logging On", Boolean.valueOf(d));
            lVar.mo57747a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").mo57747a(C8475k.m25552a(mo57169f()));
            lVar.mo57741a();
            C8626v.m26255f("AppLovinSdk", lVar.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0180, code lost:
        if (r12.f21161a.mo57387d() != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01df, code lost:
        if (r12.f21161a.mo57387d() != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e2, code lost:
        r2 = "failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01e3, code lost:
        r10.append(r2);
        r10.append(" in ");
        r10.append(java.lang.System.currentTimeMillis() - r6);
        r10.append("ms");
        r8.mo57818b(r9, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = " in "
            java.lang.String r2 = "succeeded"
            java.lang.String r3 = "failed"
            java.lang.String r4 = " initialization "
            java.lang.String r5 = "AppLovin SDK "
            long r6 = java.lang.System.currentTimeMillis()
            com.applovin.impl.sdk.v r8 = r12.f21120d
            boolean r8 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r8 == 0) goto L_0x0037
            com.applovin.impl.sdk.v r8 = r12.f21120d
            java.lang.String r9 = r12.f21119c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Initializing AppLovin SDK v"
            r10.append(r11)
            java.lang.String r11 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r11)
            java.lang.String r11 = "..."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.mo57818b(r9, r10)
        L_0x0037:
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.mo57338W()     // Catch:{ all -> 0x0183 }
            r8.mo57159d()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.mo57338W()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.p255d.C8394f.f21086e     // Catch:{ all -> 0x0183 }
            r8.mo57158c(r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.g r8 = r8.mo57338W()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.d.f r9 = com.applovin.impl.sdk.p255d.C8394f.f21087f     // Catch:{ all -> 0x0183 }
            r8.mo57158c(r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.r r8 = r8.mo57364ae()     // Catch:{ all -> 0x0183 }
            android.content.Context r9 = r12.mo57169f()     // Catch:{ all -> 0x0183 }
            r8.mo57657a((android.content.Context) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.r r8 = r8.mo57364ae()     // Catch:{ all -> 0x0183 }
            android.content.Context r9 = r12.mo57169f()     // Catch:{ all -> 0x0183 }
            r8.mo57660b((android.content.Context) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.o r8 = r8.mo57337V()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.b r9 = new com.applovin.impl.sdk.e.b     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r10 = r12.f21161a     // Catch:{ all -> 0x0183 }
            r9.<init>(r10)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.e.o$a r10 = com.applovin.impl.sdk.p256e.C8432o.C8434a.MAIN     // Catch:{ all -> 0x0183 }
            r8.mo57228a((com.applovin.impl.sdk.p256e.C8401a) r9, (com.applovin.impl.sdk.p256e.C8432o.C8434a) r10)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.o r8 = r8.mo57340Y()     // Catch:{ all -> 0x0183 }
            r8.mo57630e()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.utils.o r8 = r8.mo57370ak()     // Catch:{ all -> 0x0183 }
            r8.mo57774a()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.a.a.a r8 = r8.mo57373an()     // Catch:{ all -> 0x0183 }
            r8.mo55451a()     // Catch:{ all -> 0x0183 }
            android.content.Context r8 = r12.mo57169f()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r9 = r12.f21161a     // Catch:{ all -> 0x0183 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00ae
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            r8.mo57391h()     // Catch:{ all -> 0x0183 }
        L_0x00ae:
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.array.ArrayService r8 = r8.mo57376aq()     // Catch:{ all -> 0x0183 }
            r8.collectAppHubData()     // Catch:{ all -> 0x0183 }
            r12.m25413b()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p254c.C8380b.f20936ec     // Catch:{ all -> 0x0183 }
            java.lang.Object r8 = r8.mo57342a(r9)     // Catch:{ all -> 0x0183 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x00d2
            com.applovin.impl.sdk.e.n$1 r8 = new com.applovin.impl.sdk.e.n$1     // Catch:{ all -> 0x0183 }
            r8.<init>()     // Catch:{ all -> 0x0183 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r8)     // Catch:{ all -> 0x0183 }
        L_0x00d2:
            r12.m25412a()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            r9 = 1
            r8.mo57357a((boolean) r9)     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.network.f r8 = r8.mo57339X()     // Catch:{ all -> 0x0183 }
            r8.mo57572c()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.sdk.AppLovinEventService r8 = r8.mo57408x()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.EventServiceImpl r8 = (com.applovin.impl.sdk.EventServiceImpl) r8     // Catch:{ all -> 0x0183 }
            r8.maybeTrackAppOpenEvent()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.mediation.debugger.b r8 = r8.mo57327K()     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.mo56317b()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0103
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.mo57388e()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0129
        L_0x0103:
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p254c.C8379a.f20678h     // Catch:{ all -> 0x0183 }
            java.lang.Object r8 = r8.mo57342a(r9)     // Catch:{ all -> 0x0183 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            android.content.Context r8 = r8.mo57332P()     // Catch:{ all -> 0x0183 }
            com.applovin.impl.sdk.n r9 = r12.f21161a     // Catch:{ all -> 0x0183 }
            boolean r8 = com.applovin.impl.sdk.utils.Utils.isPubInDebugMode(r8, r9)     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            boolean r8 = r8.mo57389f()     // Catch:{ all -> 0x0183 }
            if (r8 == 0) goto L_0x0132
        L_0x0129:
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x0183 }
            com.applovin.impl.mediation.debugger.b r8 = r8.mo57327K()     // Catch:{ all -> 0x0183 }
            r8.mo56312a()     // Catch:{ all -> 0x0183 }
        L_0x0132:
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.a.f r8 = r8.mo57374ao()
            r8.mo56870a()
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p254c.C8380b.f20707aI
            java.lang.Object r8 = r8.mo57342a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x015e
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p254c.C8380b.f20708aJ
            java.lang.Object r8 = r8.mo57342a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.n r10 = r12.f21161a
            r10.mo57346a((long) r8)
        L_0x015e:
            com.applovin.impl.sdk.v r8 = r12.f21120d
            boolean r8 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r8 == 0) goto L_0x01fb
            com.applovin.impl.sdk.v r8 = r12.f21120d
            java.lang.String r9 = r12.f21119c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f21161a
            boolean r4 = r4.mo57387d()
            if (r4 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x0183:
            r8 = move-exception
            java.lang.String r9 = "AppLovinSdk"
            java.lang.String r10 = "Failed to initialize SDK!"
            com.applovin.impl.sdk.C8626v.m26254c(r9, r10, r8)     // Catch:{ all -> 0x01fc }
            com.applovin.impl.sdk.n r8 = r12.f21161a     // Catch:{ all -> 0x01fc }
            r9 = 0
            r8.mo57357a((boolean) r9)     // Catch:{ all -> 0x01fc }
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.a.f r8 = r8.mo57374ao()
            r8.mo56870a()
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p254c.C8380b.f20707aI
            java.lang.Object r8 = r8.mo57342a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01bd
            com.applovin.impl.sdk.n r8 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Long> r9 = com.applovin.impl.sdk.p254c.C8380b.f20708aJ
            java.lang.Object r8 = r8.mo57342a(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            com.applovin.impl.sdk.n r10 = r12.f21161a
            r10.mo57346a((long) r8)
        L_0x01bd:
            com.applovin.impl.sdk.v r8 = r12.f21120d
            boolean r8 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r8 == 0) goto L_0x01fb
            com.applovin.impl.sdk.v r8 = r12.f21120d
            java.lang.String r9 = r12.f21119c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r10.append(r5)
            r10.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f21161a
            boolean r4 = r4.mo57387d()
            if (r4 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r2 = r3
        L_0x01e3:
            r10.append(r2)
            r10.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r8.mo57818b(r9, r0)
        L_0x01fb:
            return
        L_0x01fc:
            r8 = move-exception
            com.applovin.impl.sdk.n r9 = r12.f21161a
            com.applovin.impl.sdk.a.f r9 = r9.mo57374ao()
            r9.mo56870a()
            com.applovin.impl.sdk.n r9 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r10 = com.applovin.impl.sdk.p254c.C8380b.f20707aI
            java.lang.Object r9 = r9.mo57342a(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0229
            com.applovin.impl.sdk.n r9 = r12.f21161a
            com.applovin.impl.sdk.c.b<java.lang.Long> r10 = com.applovin.impl.sdk.p254c.C8380b.f20708aJ
            java.lang.Object r9 = r9.mo57342a(r10)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            com.applovin.impl.sdk.n r11 = r12.f21161a
            r11.mo57346a((long) r9)
        L_0x0229:
            com.applovin.impl.sdk.v r9 = r12.f21120d
            boolean r9 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r9 == 0) goto L_0x0267
            com.applovin.impl.sdk.v r9 = r12.f21120d
            java.lang.String r10 = r12.f21119c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = com.applovin.sdk.AppLovinSdk.VERSION
            r11.append(r5)
            r11.append(r4)
            com.applovin.impl.sdk.n r4 = r12.f21161a
            boolean r4 = r4.mo57387d()
            if (r4 == 0) goto L_0x024e
            goto L_0x024f
        L_0x024e:
            r2 = r3
        L_0x024f:
            r11.append(r2)
            r11.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r9.mo57818b(r10, r0)
        L_0x0267:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p256e.C8429n.run():void");
    }
}
