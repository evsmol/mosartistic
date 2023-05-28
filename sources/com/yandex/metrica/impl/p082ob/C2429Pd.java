package com.yandex.metrica.impl.p082ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Pd */
public class C2429Pd extends C2241Kd {

    /* renamed from: A */
    private static final C2484Rd f6449A = new C2484Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", (String) null);

    /* renamed from: p */
    static final C2484Rd f6450p = new C2484Rd("PREF_KEY_DEVICE_ID_", (String) null);

    /* renamed from: q */
    static final C2484Rd f6451q = new C2484Rd("PREF_KEY_UID_", (String) null);

    /* renamed from: r */
    private static final C2484Rd f6452r = new C2484Rd("PREF_KEY_HOST_URL_", (String) null);

    /* renamed from: s */
    private static final C2484Rd f6453s = new C2484Rd("PREF_KEY_REPORT_URL_", (String) null);

    /* renamed from: t */
    private static final C2484Rd f6454t = new C2484Rd("PREF_KEY_GET_AD_URL", (String) null);

    /* renamed from: u */
    private static final C2484Rd f6455u = new C2484Rd("PREF_KEY_REPORT_AD_URL", (String) null);

    /* renamed from: v */
    private static final C2484Rd f6456v = new C2484Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", (String) null);

    /* renamed from: w */
    private static final C2484Rd f6457w = new C2484Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", (String) null);

    /* renamed from: x */
    private static final C2484Rd f6458x = new C2484Rd("PREF_KEY_DISTRIBUTION_REFERRER_", (String) null);

    /* renamed from: y */
    static final C2484Rd f6459y = new C2484Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", (String) null);

    /* renamed from: z */
    static final C2484Rd f6460z = new C2484Rd("PREF_KEY_PINNING_UPDATE_URL", (String) null);

    /* renamed from: f */
    private C2484Rd f6461f;

    /* renamed from: g */
    private C2484Rd f6462g;

    /* renamed from: h */
    private C2484Rd f6463h;

    /* renamed from: i */
    private C2484Rd f6464i;

    /* renamed from: j */
    private C2484Rd f6465j;

    /* renamed from: k */
    private C2484Rd f6466k;

    /* renamed from: l */
    private C2484Rd f6467l;

    /* renamed from: m */
    private C2484Rd f6468m;

    /* renamed from: n */
    private C2484Rd f6469n;

    /* renamed from: o */
    private C2484Rd f6470o;

    public C2429Pd(Context context) {
        this(context, (String) null);
    }

    /* renamed from: a */
    public long mo16458a(long j) {
        return this.f5974b.getLong(this.f6467l.mo16558a(), j);
    }

    /* renamed from: b */
    public String mo16459b(String str) {
        return this.f5974b.getString(this.f6461f.mo16558a(), (String) null);
    }

    /* renamed from: c */
    public String mo16460c(String str) {
        return this.f5974b.getString(this.f6468m.mo16558a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_startupserviceinfopreferences";
    }

    /* renamed from: d */
    public String mo16461d(String str) {
        return this.f5974b.getString(this.f6465j.mo16558a(), (String) null);
    }

    /* renamed from: e */
    public String mo16462e(String str) {
        return this.f5974b.getString(this.f6463h.mo16558a(), (String) null);
    }

    /* renamed from: f */
    public String mo16463f(String str) {
        return this.f5974b.getString(this.f6466k.mo16558a(), (String) null);
    }

    /* renamed from: g */
    public String mo16465g(String str) {
        return this.f5974b.getString(this.f6464i.mo16558a(), (String) null);
    }

    /* renamed from: h */
    public String mo16466h(String str) {
        return this.f5974b.getString(this.f6462g.mo16558a(), (String) null);
    }

    /* renamed from: i */
    public C2429Pd mo16467i(String str) {
        return (C2429Pd) mo16078a(this.f6461f.mo16558a(), str);
    }

    /* renamed from: j */
    public C2429Pd mo16468j(String str) {
        return (C2429Pd) mo16078a(this.f6462g.mo16558a(), str);
    }

    public C2429Pd(Context context, String str) {
        super(context, str);
        this.f6461f = new C2484Rd(f6450p.mo16560b());
        this.f6462g = new C2484Rd(f6451q.mo16560b(), mo16080c());
        this.f6463h = new C2484Rd(f6452r.mo16560b(), mo16080c());
        this.f6464i = new C2484Rd(f6453s.mo16560b(), mo16080c());
        this.f6465j = new C2484Rd(f6454t.mo16560b(), mo16080c());
        this.f6466k = new C2484Rd(f6455u.mo16560b(), mo16080c());
        this.f6467l = new C2484Rd(f6456v.mo16560b(), mo16080c());
        this.f6468m = new C2484Rd(f6457w.mo16560b(), mo16080c());
        this.f6469n = new C2484Rd(f6458x.mo16560b(), mo16080c());
        this.f6470o = new C2484Rd(f6449A.mo16560b(), mo16080c());
    }

    /* renamed from: b */
    public static void m8126b(Context context) {
        C2814b.m9059a(context, "_startupserviceinfopreferences").edit().remove(f6450p.mo16560b()).apply();
    }

    /* renamed from: f */
    public void mo16464f() {
        mo16077a(this.f6461f.mo16558a()).mo16077a(this.f6462g.mo16558a()).mo16077a(this.f6463h.mo16558a()).mo16077a(this.f6464i.mo16558a()).mo16077a(this.f6465j.mo16558a()).mo16077a(this.f6466k.mo16558a()).mo16077a(this.f6467l.mo16558a()).mo16077a(this.f6470o.mo16558a()).mo16077a(this.f6468m.mo16558a()).mo16077a(this.f6469n.mo16560b()).mo16077a(f6459y.mo16560b()).mo16077a(f6460z.mo16560b()).mo16079b();
    }
}
