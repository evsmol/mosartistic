package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b9 */
public class C2830b9 extends C2888d9 {

    /* renamed from: A */
    static final C2484Rd f7435A = new C2484Rd(IronSourceConstants.TYPE_GAID, (String) null);

    /* renamed from: B */
    static final C2484Rd f7436B = new C2484Rd("HOAID", (String) null);

    /* renamed from: C */
    static final C2484Rd f7437C = new C2484Rd("YANDEX_ADV_ID", (String) null);

    /* renamed from: D */
    static final C2484Rd f7438D = new C2484Rd("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", (String) null);

    /* renamed from: E */
    static final C2484Rd f7439E = new C2484Rd("SCREEN_INFO", (String) null);

    /* renamed from: F */
    static final C2484Rd f7440F = new C2484Rd("SCREEN_SIZE_CHECKED_BY_DEPRECATED", (String) null);

    /* renamed from: G */
    static final C2484Rd f7441G = new C2484Rd("FEATURES", (String) null);
    @Deprecated

    /* renamed from: c */
    static final C2484Rd f7442c = new C2484Rd(IronSourceConstants.TYPE_UUID, (String) null);

    /* renamed from: d */
    static final C2484Rd f7443d = new C2484Rd("UUID_RESULT", (String) null);
    @Deprecated

    /* renamed from: e */
    static final C2484Rd f7444e = new C2484Rd("DEVICE_ID", (String) null);

    /* renamed from: f */
    static final C2484Rd f7445f = new C2484Rd("DEVICE_ID_RESULT", (String) null);
    @Deprecated

    /* renamed from: g */
    static final C2484Rd f7446g = new C2484Rd("DEVICE_ID_HASH", (String) null);

    /* renamed from: h */
    static final C2484Rd f7447h = new C2484Rd("DEVICE_ID_HASH_RESULT", (String) null);
    @Deprecated

    /* renamed from: i */
    static final C2484Rd f7448i = new C2484Rd("AD_URL_GET", (String) null);

    /* renamed from: j */
    static final C2484Rd f7449j = new C2484Rd("AD_URL_GET_RESULT", (String) null);
    @Deprecated

    /* renamed from: k */
    static final C2484Rd f7450k = new C2484Rd("AD_URL_REPORT", (String) null);

    /* renamed from: l */
    static final C2484Rd f7451l = new C2484Rd("AD_URL_REPORT_RESULT", (String) null);

    /* renamed from: m */
    static final C2484Rd f7452m = new C2484Rd("CUSTOM_HOSTS", (String) null);

    /* renamed from: n */
    static final C2484Rd f7453n = new C2484Rd("SERVER_TIME_OFFSET", (String) null);
    @Deprecated

    /* renamed from: o */
    static final C2484Rd f7454o = new C2484Rd("CLIDS", (String) null);

    /* renamed from: p */
    static final C2484Rd f7455p = new C2484Rd("RESPONSE_CLIDS_RESULT", (String) null);

    /* renamed from: q */
    static final C2484Rd f7456q = new C2484Rd("CUSTOM_SDK_HOSTS", (String) null);

    /* renamed from: r */
    static final C2484Rd f7457r = new C2484Rd("CLIENT_CLIDS", (String) null);

    /* renamed from: s */
    static final C2484Rd f7458s = new C2484Rd("DEFERRED_DEEP_LINK_WAS_CHECKED", (String) null);

    /* renamed from: t */
    static final C2484Rd f7459t = new C2484Rd("API_LEVEL", (String) null);

    /* renamed from: u */
    static final C2484Rd f7460u = new C2484Rd("ADS_REQUESTED_CONTEXT", (String) null);

    /* renamed from: v */
    static final C2484Rd f7461v = new C2484Rd("CONTEXT_HISTORY", (String) null);

    /* renamed from: w */
    static final C2484Rd f7462w = new C2484Rd("ACCESS_CONFIG", (String) null);

    /* renamed from: x */
    static final C2484Rd f7463x = new C2484Rd("DIAGNOSTICS_CONFIGS_HOLDER", (String) null);

    /* renamed from: y */
    static final C2484Rd f7464y = new C2484Rd("NEXT_STARTUP_TIME", (String) null);

    /* renamed from: z */
    static final C2484Rd f7465z = new C2484Rd("LAST_UI_CONTEXT_ID", (String) null);

    static {
        new C2484Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);
    }

    public C2830b9(C2511S7 s7) {
        super(s7);
    }

    /* renamed from: a */
    public C2830b9 mo17238a(C2673W0 w0) {
        return m9121a(f7449j.mo16558a(), w0);
    }

    /* renamed from: b */
    public boolean mo17248b(boolean z) {
        return mo17440a(f7438D.mo16558a(), z);
    }

    /* renamed from: c */
    public C2830b9 mo17250c(C2673W0 w0) {
        return m9121a(f7456q.mo16558a(), w0);
    }

    /* renamed from: d */
    public long mo17252d(long j) {
        return mo17437a(f7453n.mo16560b(), j);
    }

    /* renamed from: e */
    public C2830b9 mo17256e(C2673W0 w0) {
        return m9121a(f7445f.mo16558a(), w0);
    }

    /* renamed from: f */
    public C2673W0 mo17257f() {
        return m9122i(f7449j.mo16558a());
    }

    /* renamed from: g */
    public C2673W0 mo17260g() {
        return m9122i(f7451l.mo16558a());
    }

    @Deprecated
    /* renamed from: h */
    public String mo17266h(String str) {
        return mo17438a(f7450k.mo16558a(), (String) null);
    }

    /* renamed from: i */
    public List<String> mo17269i() {
        String a = mo17438a(f7452m.mo16558a(), (String) null);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return C2572Tl.m8539c(a);
    }

    /* renamed from: j */
    public C2673W0 mo17270j() {
        return m9122i(f7456q.mo16558a());
    }

    /* renamed from: k */
    public C2673W0 mo17273k() {
        return m9122i(f7447h.mo16558a());
    }

    /* renamed from: l */
    public C2673W0 mo17275l() {
        return m9122i(f7445f.mo16558a());
    }

    @Deprecated
    /* renamed from: m */
    public String mo17278m(String str) {
        return mo17438a(f7446g.mo16558a(), (String) null);
    }

    /* renamed from: n */
    public C2720Xh mo17279n() {
        String a = mo17438a(f7441G.mo16558a(), (String) null);
        try {
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject = new JSONObject(a);
                return new C2720Xh(C2572Tl.m8508a(jSONObject, "libSslEnabled", (Boolean) null), C2577U0.m8555a(C2572Tl.m8530b(jSONObject, "STATUS")), C2572Tl.m8530b(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C2720Xh((Boolean) null, C2577U0.UNKNOWN, (String) null);
    }

    /* renamed from: o */
    public C2673W0 mo17281o() {
        return m9122i(f7435A.mo16558a());
    }

    /* renamed from: p */
    public C2673W0 mo17283p() {
        return m9122i(f7436B.mo16558a());
    }

    @Deprecated
    /* renamed from: q */
    public C2830b9 mo17286q(String str) {
        return (C2830b9) mo17443b(f7454o.mo16558a(), str);
    }

    /* renamed from: r */
    public C2673W0 mo17287r() {
        return m9122i(f7455p.mo16558a());
    }

    @Deprecated
    /* renamed from: s */
    public C2830b9 mo17289s(String str) {
        return (C2830b9) mo17443b(f7444e.mo16558a(), str);
    }

    @Deprecated
    /* renamed from: t */
    public C2830b9 mo17291t(String str) {
        return (C2830b9) mo17443b(f7442c.mo16558a(), str);
    }

    /* renamed from: u */
    public C2673W0 mo17293u() {
        return m9122i(f7443d.mo16558a());
    }

    /* renamed from: v */
    public C2673W0 mo17294v() {
        return m9122i(f7437C.mo16558a());
    }

    /* renamed from: w */
    public boolean mo17295w() {
        return mo17440a(f7458s.mo16558a(), false);
    }

    /* renamed from: x */
    public boolean mo17296x() {
        return mo17440a(f7440F.mo16558a(), false);
    }

    /* renamed from: y */
    public C2830b9 mo17297y() {
        return (C2830b9) mo17445b(f7458s.mo16558a(), true);
    }

    /* renamed from: z */
    public void mo17298z() {
        mo17445b(f7440F.mo16558a(), true);
    }

    /* renamed from: a */
    public C2830b9 mo17239a(C2720Xh xh) {
        String a = f7441G.mo16558a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", xh.mo17057b()).put("STATUS", xh.mo17058c().mo16730a()).putOpt("ERROR_EXPLANATION", xh.mo17056a());
        } catch (Throwable unused) {
        }
        return (C2830b9) mo17443b(a, jSONObject.toString());
    }

    /* renamed from: b */
    public long mo17245b(long j) {
        return mo17437a(f7459t.mo16558a(), j);
    }

    /* renamed from: c */
    public C2830b9 mo17251c(boolean z) {
        return (C2830b9) mo17445b(f7460u.mo16558a(), z);
    }

    /* renamed from: d */
    public C2830b9 mo17253d(C2673W0 w0) {
        return m9121a(f7447h.mo16558a(), w0);
    }

    /* renamed from: e */
    public C2830b9 mo17255e(long j) {
        return (C2830b9) mo17442b(f7459t.mo16558a(), j);
    }

    /* renamed from: f */
    public C2830b9 mo17259f(C2673W0 w0) {
        return m9121a(f7435A.mo16558a(), w0);
    }

    @Deprecated
    /* renamed from: g */
    public String mo17263g(String str) {
        return mo17438a(f7448i.mo16558a(), (String) null);
    }

    /* renamed from: h */
    public C2830b9 mo17265h(C2673W0 w0) {
        return m9121a(f7455p.mo16558a(), w0);
    }

    @Deprecated
    /* renamed from: j */
    public String mo17272j(String str) {
        return mo17438a(f7454o.mo16558a(), (String) null);
    }

    /* renamed from: k */
    public String mo17274k(String str) {
        return mo17438a(f7457r.mo16558a(), (String) null);
    }

    @Deprecated
    /* renamed from: l */
    public String mo17276l(String str) {
        return mo17438a(f7444e.mo16558a(), (String) null);
    }

    /* renamed from: m */
    public C3437ra mo17277m() {
        C3437ra raVar = null;
        try {
            String a = mo17438a(f7463x.mo16558a(), (String) null);
            if (a != null) {
                raVar = C2572Tl.m8507a(new JSONObject(a));
            }
        } catch (Throwable unused) {
        }
        return raVar == null ? new C3437ra() : raVar;
    }

    @Deprecated
    /* renamed from: o */
    public C2830b9 mo17282o(String str) {
        return (C2830b9) mo17443b(f7448i.mo16558a(), str);
    }

    @Deprecated
    /* renamed from: p */
    public C2830b9 mo17284p(String str) {
        return (C2830b9) mo17443b(f7450k.mo16558a(), str);
    }

    /* renamed from: q */
    public long mo17285q() {
        return mo17437a(f7464y.mo16558a(), 0);
    }

    /* renamed from: r */
    public C2830b9 mo17288r(String str) {
        return (C2830b9) mo17443b(f7457r.mo16558a(), str);
    }

    /* renamed from: s */
    public C2854c2 mo17290s() {
        return C2572Tl.m8544f(mo17449e(f7439E.mo16558a()));
    }

    /* renamed from: t */
    public C2972fl mo17292t() {
        try {
            String a = mo17438a(f7462w.mo16558a(), (String) null);
            if (a != null) {
                return C2572Tl.m8536c(new JSONObject(a));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C2830b9 mo17246b(C2673W0 w0) {
        return m9121a(f7451l.mo16558a(), w0);
    }

    /* renamed from: c */
    public long mo17249c(long j) {
        return mo17437a(f7465z.mo16558a(), j);
    }

    /* renamed from: d */
    public C2830b9 mo17254d(boolean z) {
        return (C2830b9) mo17445b(f7438D.mo16558a(), z);
    }

    /* renamed from: f */
    public C2830b9 mo17258f(long j) {
        return (C2830b9) mo17442b(f7465z.mo16558a(), j);
    }

    /* renamed from: g */
    public C2830b9 mo17262g(C2673W0 w0) {
        return m9121a(f7436B.mo16558a(), w0);
    }

    /* renamed from: h */
    public C2830b9 mo17264h(long j) {
        return (C2830b9) mo17442b(f7453n.mo16558a(), j);
    }

    /* renamed from: i */
    public C2830b9 mo17268i(C2673W0 w0) {
        return m9121a(f7443d.mo16558a(), w0);
    }

    /* renamed from: j */
    public C2830b9 mo17271j(C2673W0 w0) {
        return m9121a(f7437C.mo16558a(), w0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p082ob.C2673W0 m9122i(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r5.mo17438a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0028 }
            if (r6 == 0) goto L_0x0028
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            r1.<init>(r6)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.W0 r6 = new com.yandex.metrica.impl.ob.W0     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "ID"
            java.lang.String r2 = com.yandex.metrica.impl.p082ob.C2572Tl.m8530b((org.json.JSONObject) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = com.yandex.metrica.impl.p082ob.C2572Tl.m8530b((org.json.JSONObject) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0028 }
            com.yandex.metrica.impl.ob.U0 r3 = com.yandex.metrica.impl.p082ob.C2577U0.m8555a(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = com.yandex.metrica.impl.p082ob.C2572Tl.m8530b((org.json.JSONObject) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0028 }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            if (r6 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.W0 r6 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.U0 r1 = com.yandex.metrica.impl.p082ob.C2577U0.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L_0x0034:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2830b9.m9122i(java.lang.String):com.yandex.metrica.impl.ob.W0");
    }

    /* renamed from: b */
    public C2830b9 mo17247b(List<String> list) {
        return (C2830b9) mo17443b(f7452m.mo16558a(), C2572Tl.m8537c(list));
    }

    /* renamed from: g */
    public C2830b9 mo17261g(long j) {
        return (C2830b9) mo17442b(f7464y.mo16558a(), j);
    }

    /* renamed from: h */
    public List<String> mo17267h() {
        LinkedList linkedList = new LinkedList();
        List<String> a = mo17439a(f7461v.mo16558a(), (List<String>) linkedList);
        return a == null ? linkedList : a;
    }

    @Deprecated
    /* renamed from: n */
    public String mo17280n(String str) {
        return mo17438a(f7442c.mo16558a(), (String) null);
    }

    /* renamed from: a */
    public boolean mo17244a(boolean z) {
        return mo17440a(f7460u.mo16558a(), z);
    }

    /* renamed from: a */
    public C2830b9 mo17242a(List<String> list) {
        return (C2830b9) mo17444b(f7461v.mo16558a(), list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p082ob.C2830b9 mo17240a(com.yandex.metrica.impl.p082ob.C2972fl r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            org.json.JSONObject r2 = com.yandex.metrica.impl.p082ob.C2572Tl.m8521a((com.yandex.metrica.impl.p082ob.C2972fl) r2)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.Rd r0 = f7462w
            java.lang.String r0 = r0.mo16558a()
            r1.mo17443b((java.lang.String) r0, (java.lang.String) r2)
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2830b9.mo17240a(com.yandex.metrica.impl.ob.fl):com.yandex.metrica.impl.ob.b9");
    }

    /* renamed from: a */
    public C2830b9 mo17241a(C3437ra raVar) {
        return (C2830b9) mo17443b(f7463x.mo16558a(), C2572Tl.m8524a(raVar).toString());
    }

    /* renamed from: a */
    public void mo17243a(C2854c2 c2Var) {
        mo17443b(f7439E.mo16558a(), C2572Tl.m8514a(c2Var));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:1|2|3|4|5|6|7|8|9|10|11|12|13|(1:17)|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p082ob.C2830b9 m9121a(java.lang.String r5, com.yandex.metrica.impl.p082ob.C2673W0 r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0027
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0027 }
            r0.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f7065a     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "STATUS"
            com.yandex.metrica.impl.ob.U0 r3 = r6.f7066b     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = r3.mo16730a()     // Catch:{ all -> 0x0022 }
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.f7067c     // Catch:{ all -> 0x0022 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0022 }
        L_0x0022:
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r6 == 0) goto L_0x002d
            r4.mo17443b((java.lang.String) r5, (java.lang.String) r6)
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2830b9.m9121a(java.lang.String, com.yandex.metrica.impl.ob.W0):com.yandex.metrica.impl.ob.b9");
    }
}
