package com.applovin.impl.mediation.debugger.p243ui.p245b;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.C8141a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8152a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8153b;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8154c;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8155d;
import com.applovin.impl.mediation.debugger.p238b.p240b.C8157a;
import com.applovin.impl.mediation.debugger.p238b.p240b.C8158b;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p243ui.p245b.p246a.C8199a;
import com.applovin.impl.mediation.debugger.p243ui.p245b.p246a.C8200b;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8221e;
import com.applovin.impl.sdk.C8397e;
import com.applovin.impl.sdk.C8475k;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.b */
public class C8201b extends C8218d implements AppLovinCommunicatorSubscriber, C8141a.C8142a {

    /* renamed from: a */
    private C8490n f20052a;

    /* renamed from: b */
    private List<C8152a> f20053b;

    /* renamed from: d */
    private List<C8152a> f20054d;

    /* renamed from: e */
    private String f20055e;

    /* renamed from: f */
    private String f20056f;

    /* renamed from: g */
    private String f20057g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8158b f20058h;

    /* renamed from: i */
    private final StringBuilder f20059i = new StringBuilder("");

    /* renamed from: j */
    private final AtomicBoolean f20060j = new AtomicBoolean();

    /* renamed from: k */
    private boolean f20061k = false;

    /* renamed from: l */
    private List<C8160b> f20062l = new ArrayList();

    /* renamed from: m */
    private List<C8160b> f20063m = new ArrayList();

    /* renamed from: n */
    private List<C8160b> f20064n = new ArrayList();

    /* renamed from: o */
    private List<C8155d> f20065o = new ArrayList();

    /* renamed from: p */
    private List<C8155d> f20066p = new ArrayList();

    /* renamed from: q */
    private List<C8160b> f20067q = new ArrayList();

    /* renamed from: r */
    private List<C8214c> f20068r = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<C8214c> f20069s = new ArrayList();

    /* renamed from: t */
    private List<C8214c> f20070t = new ArrayList();

    /* renamed from: u */
    private List<C8214c> f20071u = new ArrayList();

    /* renamed from: v */
    private List<C8214c> f20072v = new ArrayList();

    /* renamed from: w */
    private List<C8214c> f20073w = new ArrayList();

    /* renamed from: x */
    private List<C8214c> f20074x = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$a */
    public enum C8205a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b */
    public enum C8206b {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C8201b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private C8214c m24595a(String str) {
        C8214c.C8216a p = C8214c.m24667p();
        if (!this.f20052a.mo57330N().mo56529a()) {
            p.mo56484a(this.f20157c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        C8214c.C8216a a = p.mo56486a(sb.toString());
        if (this.f20052a.mo57330N().mo56529a()) {
            str = "Enable";
        }
        return a.mo56491b(str).mo56489b(-16776961).mo56495d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").mo56487a(true).mo56488a();
    }

    /* renamed from: a */
    private List<C8214c> m24596a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        C8214c.C8216a p = C8214c.m24667p();
        arrayList.add(p.mo56486a("View Ad Units (" + this.f20053b.size() + ")").mo56484a(this.f20157c).mo56487a(true).mo56488a());
        arrayList.add(m24595a(str));
        arrayList.add(m24600b(str2));
        if (!this.f20054d.isEmpty()) {
            C8214c.C8216a p2 = C8214c.m24667p();
            arrayList.add(p2.mo56486a("Selective Init Ad Units (" + this.f20054d.size() + ")").mo56484a(this.f20157c).mo56487a(true).mo56488a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m24597a(C8214c.C8216a aVar, String str) {
        aVar.mo56494c("MAX Ad Review").mo56495d(str).mo56483a(C8656R.C8659drawable.applovin_ic_x_mark).mo56493c(C8570g.m26080a(C8656R.C8658color.applovin_sdk_xmarkColor, this.f20157c)).mo56487a(true);
    }

    /* renamed from: a */
    private void m24598a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.f20052a.mo57342a(C8380b.f20739ao)).intValue()) {
            C8626v.m26255f("MediationDebuggerListAdapter", sb2);
            this.f20059i.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* renamed from: a */
    private void m24599a(List<C8160b> list) {
        List<C8160b> list2;
        for (C8160b next : list) {
            if (!next.mo56371g()) {
                if (next.mo56364a() == C8160b.C8161a.INCOMPLETE_INTEGRATION || next.mo56364a() == C8160b.C8161a.INVALID_INTEGRATION) {
                    list2 = this.f20062l;
                } else if (next.mo56364a() == C8160b.C8161a.COMPLETE) {
                    list2 = this.f20063m;
                } else if (next.mo56364a() == C8160b.C8161a.MISSING) {
                    list2 = this.f20064n;
                }
                list2.add(next);
            }
        }
    }

    /* renamed from: b */
    private C8214c m24600b(String str) {
        C8214c.C8216a p = C8214c.m24667p();
        if (this.f20052a.mo57330N().mo56529a()) {
            p.mo56484a(this.f20157c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        C8214c.C8216a a = p.mo56486a(sb.toString());
        if (!this.f20052a.mo57330N().mo56529a()) {
            str = "Enable";
        }
        return a.mo56491b(str).mo56489b(-16776961).mo56495d("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").mo56487a(true).mo56488a();
    }

    /* renamed from: b */
    private C8214c m24601b(String str, String str2) {
        C8214c.C8216a a = C8214c.m24667p().mo56486a(str);
        if (StringUtils.isValidString(str2)) {
            a.mo56491b(str2);
        } else {
            a.mo56483a(C8656R.C8659drawable.applovin_ic_x_mark);
            a.mo56493c(C8570g.m26080a(C8656R.C8658color.applovin_sdk_xmarkColor, this.f20157c));
        }
        return a.mo56488a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8214c m24602b(boolean z) {
        return C8214c.m24667p().mo56486a("app-ads.txt").mo56483a(z ? C8656R.C8659drawable.applovin_ic_check_mark_bordered : C8656R.C8659drawable.applovin_ic_x_mark).mo56493c(C8570g.m26080a(z ? C8656R.C8658color.applovin_sdk_checkmarkColor : C8656R.C8658color.applovin_sdk_xmarkColor, this.f20157c)).mo56487a(false).mo56488a();
    }

    /* renamed from: b */
    private void m24604b(List<C8152a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C8152a e : list) {
            C8154c e2 = e.mo56329e();
            for (C8153b a : e2.mo56335a()) {
                hashSet.add(a.mo56331a());
            }
            for (C8153b a2 : e2.mo56336b()) {
                hashSet2.add(a2.mo56331a());
            }
        }
        this.f20065o = new ArrayList(hashSet);
        this.f20066p = new ArrayList(hashSet2);
        Collections.sort(this.f20065o);
        Collections.sort(this.f20066p);
    }

    /* renamed from: c */
    private void m24605c(List<C8160b> list) {
        for (C8160b next : list) {
            if (next.mo56366c() == C8160b.C8162b.READY) {
                this.f20067q.add(next);
            }
        }
    }

    /* renamed from: d */
    private List<C8214c> m24606d(List<C8160b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C8160b aVar : list) {
            arrayList.add(new C8199a(aVar, this.f20157c));
        }
        return arrayList;
    }

    /* renamed from: p */
    private void m24607p() {
        Map<String, String> metaData;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + Utils.isPubInDebugMode(this.f20157c, this.f20052a));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f20052a.mo57330N().mo56529a() ? "enabled" : LogConstants.MSG_AD_TYPE_DISABLED);
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f20052a.mo57340Y().mo57633h().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f20052a.mo57342a(C8380b.f20864dI);
        String a = C8397e.m25291a();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        String str3 = "None";
        if (!StringUtils.isValidString(str2)) {
            str2 = str3;
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(a)) {
            a = "Disabled";
        }
        sb4.append(a);
        sb.append(sb4.toString());
        if (this.f20052a.mo57390g() && (metaData = Utils.getMetaData(this.f20052a.mo57400q())) != null) {
            String str4 = metaData.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            if (StringUtils.isValidString(str4)) {
                str3 = str4;
            }
            sb5.append(str3);
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(C8475k.m25552a(this.f20157c));
        sb.append("\n========== NETWORKS ==========");
        for (C8160b z : this.f20063m) {
            m24598a(sb, z.mo56391z());
        }
        for (C8160b z2 : this.f20062l) {
            m24598a(sb, z2.mo56391z());
        }
        sb.append("\n========== AD UNITS ==========");
        for (C8152a f : this.f20053b) {
            m24598a(sb, f.mo56330f());
        }
        sb.append("\n========== END ==========");
        C8626v.m26255f("MediationDebuggerListAdapter", sb.toString());
        this.f20059i.append(sb.toString());
    }

    /* renamed from: q */
    private List<C8214c> m24608q() {
        String str;
        ArrayList arrayList = new ArrayList(5);
        try {
            str = this.f20157c.getPackageManager().getPackageInfo(this.f20157c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(C8214c.m24667p().mo56486a("Package Name").mo56491b(this.f20157c.getPackageName()).mo56488a());
        C8214c.C8216a a = C8214c.m24667p().mo56486a("App Version");
        String str2 = "None";
        if (!StringUtils.isValidString(str)) {
            str = str2;
        }
        arrayList.add(a.mo56491b(str).mo56488a());
        arrayList.add(C8214c.m24667p().mo56486a("OS").mo56491b(Utils.getAndroidOSInfo()).mo56488a());
        arrayList.add(C8214c.m24667p().mo56486a("Account").mo56491b(StringUtils.isValidString(this.f20057g) ? this.f20057g : str2).mo56488a());
        C8214c.C8216a a2 = C8214c.m24667p().mo56486a("Mediation Provider");
        if (StringUtils.isValidString(this.f20052a.mo57405u())) {
            str2 = this.f20052a.mo57405u();
        }
        arrayList.add(a2.mo56491b(str2).mo56488a());
        arrayList.add(C8214c.m24667p().mo56486a("OM SDK Version").mo56491b(this.f20052a.mo57374ao().mo56872c()).mo56488a());
        if (!C8490n.m25592B()) {
            arrayList.add(m24612u());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c> m24609r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c.m24667p()
            java.lang.String r2 = "SDK Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo56486a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.sdk.AppLovinSdk.VERSION
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo56491b((java.lang.String) r2)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo56488a()
            r0.add(r1)
            com.applovin.impl.sdk.n r1 = r6.f20052a
            com.applovin.impl.sdk.c.b<java.lang.String> r2 = com.applovin.impl.sdk.p254c.C8380b.f20864dI
            java.lang.Object r1 = r1.mo57342a(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c.m24667p()
            java.lang.String r3 = "Plugin Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r2 = r2.mo56486a((java.lang.String) r3)
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            java.lang.String r4 = "None"
            if (r3 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r2.mo56491b((java.lang.String) r1)
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo56488a()
            r0.add(r1)
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c.m24667p()
            java.lang.String r2 = "Ad Review Version"
            com.applovin.impl.mediation.debugger.ui.d.c$a r1 = r1.mo56486a((java.lang.String) r2)
            java.lang.String r2 = com.applovin.impl.sdk.C8397e.m25291a()
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r2)
            if (r3 == 0) goto L_0x0096
            java.lang.String r3 = com.applovin.impl.sdk.C8397e.m25292b()
            boolean r5 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)
            if (r5 == 0) goto L_0x0092
            com.applovin.impl.sdk.n r5 = r6.f20052a
            java.lang.String r5 = r5.mo57319C()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0071
            goto L_0x0092
        L_0x0071:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MAX Ad Review integrated with wrong SDK key. Please check that your "
            r2.<init>(r3)
            com.applovin.impl.sdk.n r3 = r6.f20052a
            boolean r3 = r3.mo57390g()
            if (r3 == 0) goto L_0x0083
            java.lang.String r3 = "SDK key is downloaded"
            goto L_0x0085
        L_0x0083:
            java.lang.String r3 = "Gradle plugin snippet is integrated"
        L_0x0085:
            r2.append(r3)
            java.lang.String r3 = " from the correct account."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0098
        L_0x0092:
            r1.mo56491b((java.lang.String) r2)
            goto L_0x009b
        L_0x0096:
            java.lang.String r2 = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps."
        L_0x0098:
            r6.m24597a((com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c.C8216a) r1, (java.lang.String) r2)
        L_0x009b:
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r1.mo56488a()
            r0.add(r1)
            com.applovin.impl.sdk.n r1 = r6.f20052a
            boolean r1 = r1.mo57390g()
            if (r1 == 0) goto L_0x00ce
            com.applovin.impl.sdk.n r1 = r6.f20052a
            com.applovin.sdk.AppLovinSdkSettings r1 = r1.mo57400q()
            java.util.Map r1 = com.applovin.impl.sdk.utils.Utils.getMetaData(r1)
            if (r1 == 0) goto L_0x00ce
            java.lang.String r2 = "UnityVersion"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r2 == 0) goto L_0x00c5
            r4 = r1
        L_0x00c5:
            java.lang.String r1 = "Unity Version"
            com.applovin.impl.mediation.debugger.ui.d.c r1 = r6.m24601b(r1, r4)
            r0.add(r1)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p243ui.p245b.C8201b.m24609r():java.util.List");
    }

    /* renamed from: s */
    private List<C8214c> m24610s() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C8200b(C8475k.m25551a(), true, this.f20157c));
        arrayList.add(new C8200b(C8475k.m25556b(), false, this.f20157c));
        arrayList.add(new C8200b(C8475k.m25558c(), true, this.f20157c));
        return arrayList;
    }

    /* renamed from: t */
    private List<C8214c> m24611t() {
        return m24596a((String) null, (String) null);
    }

    /* renamed from: u */
    private C8214c m24612u() {
        return C8214c.m24667p().mo56486a("Java 8").mo56483a(C8656R.C8659drawable.applovin_ic_x_mark).mo56493c(C8570g.m26080a(C8656R.C8658color.applovin_sdk_xmarkColor, this.f20157c)).mo56494c("Upgrade to Java 8").mo56495d("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration").mo56487a(true).mo56488a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo55480a(int i) {
        return (i == C8206b.APP_INFO.ordinal() ? this.f20068r : i == C8206b.MAX.ordinal() ? this.f20069s : i == C8206b.PRIVACY.ordinal() ? this.f20070t : i == C8206b.ADS.ordinal() ? this.f20071u : i == C8206b.INCOMPLETE_NETWORKS.ordinal() ? this.f20072v : i == C8206b.COMPLETED_NETWORKS.ordinal() ? this.f20073w : this.f20074x).size();
    }

    /* renamed from: a */
    public void mo56305a() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C8201b.this.f20069s.add(C8201b.this.m24602b(false));
                C8201b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void mo56306a(final C8157a aVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                List list = aVar.mo56348a().get(C8201b.this.f20058h.mo56349a());
                C8201b.this.f20069s.add(C8201b.this.m24602b(list != null ? list.contains(C8201b.this.f20058h) : false));
                C8201b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void mo56447a(List<C8160b> list, List<C8152a> list2, List<C8152a> list3, C8158b bVar, String str, String str2, String str3, C8490n nVar) {
        this.f20052a = nVar;
        this.f20053b = list2;
        this.f20054d = list3;
        this.f20058h = bVar;
        this.f20055e = str;
        this.f20056f = str2;
        this.f20057g = str3;
        if (list != null && this.f20060j.compareAndSet(false, true)) {
            nVar.mo57320D();
            if (C8626v.m26252a()) {
                nVar.mo57320D().mo57818b("MediationDebuggerListAdapter", "Populating networks...");
            }
            m24599a(list);
            m24604b(list2);
            m24605c(this.f20063m);
            this.f20068r.addAll(m24608q());
            this.f20069s.addAll(m24609r());
            this.f20070t.addAll(m24610s());
            this.f20071u.addAll(m24611t());
            this.f20072v = m24606d(this.f20062l);
            this.f20073w = m24606d(this.f20063m);
            this.f20074x = m24606d(this.f20064n);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_network_updated");
            arrayList.add("test_mode_network_updated");
            AppLovinCommunicator.getInstance(this.f20157c).subscribe((AppLovinCommunicatorSubscriber) this, (List<String>) arrayList);
            m24607p();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C8201b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public void mo56448a(boolean z) {
        this.f20061k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8214c mo55483b(int i) {
        return i == C8206b.APP_INFO.ordinal() ? new C8221e("APP INFO") : i == C8206b.MAX.ordinal() ? new C8221e("MAX") : i == C8206b.PRIVACY.ordinal() ? new C8221e("PRIVACY") : i == C8206b.ADS.ordinal() ? new C8221e("ADS") : i == C8206b.INCOMPLETE_NETWORKS.ordinal() ? new C8221e("INCOMPLETE INTEGRATIONS") : i == C8206b.COMPLETED_NETWORKS.ordinal() ? new C8221e("COMPLETED INTEGRATIONS") : new C8221e("MISSING INTEGRATIONS");
    }

    /* renamed from: b */
    public boolean mo56449b() {
        return this.f20060j.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C8214c> mo55486c(int i) {
        return i == C8206b.APP_INFO.ordinal() ? this.f20068r : i == C8206b.MAX.ordinal() ? this.f20069s : i == C8206b.PRIVACY.ordinal() ? this.f20070t : i == C8206b.ADS.ordinal() ? this.f20071u : i == C8206b.INCOMPLETE_NETWORKS.ordinal() ? this.f20072v : i == C8206b.COMPLETED_NETWORKS.ordinal() ? this.f20073w : this.f20074x;
    }

    /* renamed from: c */
    public boolean mo56450c() {
        return this.f20061k;
    }

    /* renamed from: d */
    public C8490n mo56451d() {
        return this.f20052a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo55488e() {
        return C8206b.COUNT.ordinal();
    }

    /* renamed from: f */
    public List<C8152a> mo56452f() {
        return this.f20053b;
    }

    /* renamed from: g */
    public List<C8152a> mo56453g() {
        return this.f20054d;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* renamed from: h */
    public String mo56454h() {
        return this.f20055e;
    }

    /* renamed from: i */
    public String mo56455i() {
        return this.f20056f;
    }

    /* renamed from: j */
    public List<C8155d> mo56456j() {
        return this.f20065o;
    }

    /* renamed from: k */
    public List<C8155d> mo56457k() {
        return this.f20066p;
    }

    /* renamed from: l */
    public List<C8160b> mo56458l() {
        return this.f20067q;
    }

    /* renamed from: m */
    public String mo56459m() {
        return this.f20059i.toString();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        List<C8214c> a;
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f20070t = m24610s();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f20072v = m24606d(this.f20062l);
            this.f20073w = m24606d(this.f20063m);
        } else {
            if ("live_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                a = m24596a(appLovinCommunicatorMessage.getMessageData().getString("live_network", (String) null), (String) null);
            } else if ("test_mode_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                a = m24596a((String) null, appLovinCommunicatorMessage.getMessageData().getString("test_mode_network", (String) null));
            } else {
                return;
            }
            this.f20071u = a;
        }
        mo56508n();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f20060j.get() + "}";
    }
}
