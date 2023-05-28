package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2531Sh;
import com.yandex.metrica.impl.p082ob.C3416qi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.f9 */
public class C2946f9 extends C2888d9 {
    @Deprecated

    /* renamed from: A */
    private static final C2484Rd f7805A = new C2484Rd("PREF_KEY_REPORT_URL_", (String) null);

    /* renamed from: B */
    private static final C2484Rd f7806B = new C2484Rd("PREF_KEY_REPORT_URLS_", (String) null);
    @Deprecated

    /* renamed from: C */
    private static final C2484Rd f7807C = new C2484Rd("PREF_L_URL", (String) null);

    /* renamed from: D */
    private static final C2484Rd f7808D = new C2484Rd("PREF_L_URLS", (String) null);

    /* renamed from: E */
    private static final C2484Rd f7809E = new C2484Rd("PREF_KEY_GET_AD_URL", (String) null);

    /* renamed from: F */
    private static final C2484Rd f7810F = new C2484Rd("PREF_KEY_REPORT_AD_URL", (String) null);

    /* renamed from: G */
    private static final C2484Rd f7811G = new C2484Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);

    /* renamed from: H */
    private static final C2484Rd f7812H = new C2484Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);

    /* renamed from: I */
    static final C2484Rd f7813I = new C2484Rd("PREF_KEY_DEVICE_ID_", (String) null);

    /* renamed from: J */
    private static final C2484Rd f7814J = new C2484Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);
    @Deprecated

    /* renamed from: K */
    private static final C2484Rd f7815K = new C2484Rd("PREF_KEY_PINNING_UPDATE_URL", (String) null);

    /* renamed from: L */
    private static final C2484Rd f7816L = new C2484Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);

    /* renamed from: M */
    private static final C2484Rd f7817M = new C2484Rd("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", (String) null);

    /* renamed from: N */
    private static final C2484Rd f7818N = new C2484Rd("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", (String) null);

    /* renamed from: O */
    private static final C2484Rd f7819O = new C2484Rd("PREF_KEY_FEATURES_COLLECTING_ENABLED_", (String) null);

    /* renamed from: P */
    private static final C2484Rd f7820P = new C2484Rd("SOCKET_CONFIG_", (String) null);

    /* renamed from: Q */
    private static final C2484Rd f7821Q = new C2484Rd("LAST_STARTUP_REQUEST_CLIDS", (String) null);

    /* renamed from: w */
    static final C2484Rd f7822w = new C2484Rd("PREF_KEY_UID_", (String) null);

    /* renamed from: x */
    private static final C2484Rd f7823x = new C2484Rd("PREF_KEY_HOST_URL_", (String) null);

    /* renamed from: y */
    private static final C2484Rd f7824y = new C2484Rd("PREF_KEY_HOST_URLS_FROM_STARTUP", (String) null);

    /* renamed from: z */
    private static final C2484Rd f7825z = new C2484Rd("PREF_KEY_HOST_URLS_FROM_CLIENT", (String) null);

    /* renamed from: c */
    private C2484Rd f7826c = new C2484Rd(f7813I.mo16560b());

    /* renamed from: d */
    private C2484Rd f7827d = mo17447d(f7822w.mo16560b());

    /* renamed from: e */
    private C2484Rd f7828e = mo17447d(f7823x.mo16560b());

    /* renamed from: f */
    private C2484Rd f7829f = mo17447d(f7824y.mo16560b());

    /* renamed from: g */
    private C2484Rd f7830g = mo17447d(f7825z.mo16560b());
    @Deprecated

    /* renamed from: h */
    private C2484Rd f7831h = mo17447d(f7805A.mo16560b());

    /* renamed from: i */
    private C2484Rd f7832i = mo17447d(f7806B.mo16560b());
    @Deprecated

    /* renamed from: j */
    private C2484Rd f7833j = mo17447d(f7807C.mo16560b());

    /* renamed from: k */
    private C2484Rd f7834k = mo17447d(f7808D.mo16560b());

    /* renamed from: l */
    private C2484Rd f7835l = mo17447d(f7809E.mo16560b());

    /* renamed from: m */
    private C2484Rd f7836m = mo17447d(f7810F.mo16560b());

    /* renamed from: n */
    private C2484Rd f7837n = mo17447d(f7811G.mo16560b());

    /* renamed from: o */
    private C2484Rd f7838o = mo17447d(f7812H.mo16560b());

    /* renamed from: p */
    private C2484Rd f7839p = mo17447d(f7814J.mo16560b());

    /* renamed from: q */
    private C2484Rd f7840q = mo17447d(f7816L.mo16560b());

    /* renamed from: r */
    private C2484Rd f7841r = mo17447d(f7817M.mo16560b());

    /* renamed from: s */
    private C2484Rd f7842s = mo17447d(f7818N.mo16560b());

    /* renamed from: t */
    private C2484Rd f7843t = mo17447d(f7819O.mo16560b());

    /* renamed from: u */
    private C2484Rd f7844u = mo17447d(f7820P.mo16560b());

    /* renamed from: v */
    private C2484Rd f7845v = mo17447d(f7821Q.mo16560b());

    public C2946f9(C2511S7 s7, String str) {
        super(s7, str);
    }

    /* renamed from: a */
    public C2946f9 mo17577a(List<String> list) {
        return (C2946f9) mo17443b(this.f7834k.mo16558a(), C2572Tl.m8537c(list));
    }

    /* renamed from: b */
    public C2946f9 mo17580b(List<String> list) {
        return (C2946f9) mo17443b(this.f7832i.mo16558a(), C2572Tl.m8537c(list));
    }

    /* renamed from: f */
    public void mo17581f() {
        mo17451f(f7815K.mo16558a());
        mo17451f(this.f7826c.mo16558a());
        mo17451f(this.f7835l.mo16558a());
        mo17451f(this.f7841r.mo16558a());
        mo17451f(this.f7840q.mo16558a());
        mo17451f(this.f7838o.mo16558a());
        mo17451f(this.f7843t.mo16558a());
        mo17451f(this.f7828e.mo16558a());
        mo17451f(this.f7830g.mo16558a());
        mo17451f(this.f7829f.mo16558a());
        mo17451f(this.f7845v.mo16558a());
        mo17451f(this.f7833j.mo16558a());
        mo17451f(this.f7834k.mo16558a());
        mo17451f(this.f7837n.mo16558a());
        mo17451f(this.f7842s.mo16558a());
        mo17451f(this.f7836m.mo16558a());
        mo17451f(this.f7831h.mo16558a());
        mo17451f(this.f7832i.mo16558a());
        mo17451f(this.f7844u.mo16558a());
        mo17451f(this.f7839p.mo16558a());
        mo17451f(this.f7827d.mo16558a());
        mo17451f(mo17447d(new C2484Rd("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null).mo16560b()).mo16558a());
        mo17448d();
    }

    @Deprecated
    /* renamed from: g */
    public C3416qi mo17582g() {
        C2900di diVar;
        C3416qi.C3418b bVar;
        C3416qi.C3418b bVar2;
        C3416qi.C3418b i = new C3416qi.C3418b(new C2531Sh(new C2531Sh.C2532a().mo16626d(mo17440a(this.f7840q.mo16558a(), C2531Sh.C2533b.f6711b)).mo16635m(mo17440a(this.f7841r.mo16558a(), C2531Sh.C2533b.f6712c)).mo16636n(mo17440a(this.f7842s.mo16558a(), C2531Sh.C2533b.f6713d)).mo16628f(mo17440a(this.f7843t.mo16558a(), C2531Sh.C2533b.f6714e)))).mo18138k(mo17449e(this.f7827d.mo16558a())).mo18122c(C2572Tl.m8539c(mo17449e(this.f7829f.mo16558a()))).mo18116b(C2572Tl.m8539c(mo17449e(this.f7830g.mo16558a()))).mo18126e(mo17449e(this.f7838o.mo16558a())).mo18135i(C2572Tl.m8539c(mo17449e(this.f7832i.mo16558a()))).mo18127e(C2572Tl.m8539c(mo17449e(this.f7834k.mo16558a()))).mo18128f(mo17449e(this.f7835l.mo16558a())).mo18134i(mo17449e(this.f7836m.mo16558a()));
        String e = mo17449e(this.f7844u.mo16558a());
        try {
            if (TextUtils.isEmpty(e)) {
                bVar = i;
                diVar = null;
                return bVar.mo18098a(diVar).mo18132h(mo17449e(this.f7845v.mo16558a())).mo18123c(mo17440a(this.f7839p.mo16558a(), true)).mo18119c(mo17437a(this.f7837n.mo16558a(), -1)).mo18112a();
            }
            JSONObject jSONObject = new JSONObject(e);
            C2121If.C2147q qVar = new C2121If.C2147q();
            long j = jSONObject.getLong("seconds_to_live");
            String string = jSONObject.getString("token");
            JSONArray jSONArray = jSONObject.getJSONArray("ports");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
            }
            bVar2 = i;
            try {
                diVar = new C2900di(j, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", qVar.f5718g), qVar.f5719h, qVar.f5720i, qVar.f5721j);
                bVar = bVar2;
            } catch (Throwable unused) {
                bVar = bVar2;
                diVar = null;
                return bVar.mo18098a(diVar).mo18132h(mo17449e(this.f7845v.mo16558a())).mo18123c(mo17440a(this.f7839p.mo16558a(), true)).mo18119c(mo17437a(this.f7837n.mo16558a(), -1)).mo18112a();
            }
            return bVar.mo18098a(diVar).mo18132h(mo17449e(this.f7845v.mo16558a())).mo18123c(mo17440a(this.f7839p.mo16558a(), true)).mo18119c(mo17437a(this.f7837n.mo16558a(), -1)).mo18112a();
        } catch (Throwable unused2) {
            bVar2 = i;
            bVar = bVar2;
            diVar = null;
            return bVar.mo18098a(diVar).mo18132h(mo17449e(this.f7845v.mo16558a())).mo18123c(mo17440a(this.f7839p.mo16558a(), true)).mo18119c(mo17437a(this.f7837n.mo16558a(), -1)).mo18112a();
        }
    }

    @Deprecated
    /* renamed from: h */
    public String mo17584h(String str) {
        return mo17438a(this.f7831h.mo16558a(), (String) null);
    }

    @Deprecated
    /* renamed from: i */
    public C2946f9 mo17585i(String str) {
        return (C2946f9) mo17443b(this.f7826c.mo16558a(), str);
    }

    /* renamed from: j */
    public C2946f9 mo17586j(String str) {
        return (C2946f9) mo17443b(this.f7838o.mo16558a(), str);
    }

    /* renamed from: k */
    public C2946f9 mo17587k(String str) {
        return (C2946f9) mo17443b(this.f7835l.mo16558a(), str);
    }

    /* renamed from: l */
    public C2946f9 mo17588l(String str) {
        return (C2946f9) mo17443b(this.f7828e.mo16558a(), str);
    }

    /* renamed from: m */
    public C2946f9 mo17589m(String str) {
        return (C2946f9) mo17443b(this.f7836m.mo16558a(), str);
    }

    @Deprecated
    /* renamed from: n */
    public C2946f9 mo17590n(String str) {
        return (C2946f9) mo17443b(this.f7831h.mo16558a(), str);
    }

    /* renamed from: o */
    public C2946f9 mo17591o(String str) {
        return (C2946f9) mo17443b(this.f7827d.mo16558a(), str);
    }

    /* renamed from: a */
    public C2946f9 mo17578a(boolean z) {
        return (C2946f9) mo17445b(this.f7839p.mo16558a(), z);
    }

    /* renamed from: b */
    public C2946f9 mo17579b(long j) {
        return (C2946f9) mo17442b(this.f7837n.mo16558a(), j);
    }

    @Deprecated
    /* renamed from: g */
    public String mo17583g(String str) {
        return mo17438a(this.f7833j.mo16558a(), (String) null);
    }
}
