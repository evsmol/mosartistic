package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.impl.p082ob.C3460s;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Md */
public class C2307Md extends C2241Kd {

    /* renamed from: A */
    private static final C2484Rd f6165A = new C2484Rd("BG_SESSION_ID_", (String) null);

    /* renamed from: B */
    private static final C2484Rd f6166B = new C2484Rd("BG_SESSION_SLEEP_START_", (String) null);

    /* renamed from: C */
    private static final C2484Rd f6167C = new C2484Rd("BG_SESSION_COUNTER_ID_", (String) null);

    /* renamed from: D */
    private static final C2484Rd f6168D = new C2484Rd("BG_SESSION_INIT_TIME_", (String) null);

    /* renamed from: E */
    private static final C2484Rd f6169E = new C2484Rd("IDENTITY_SEND_TIME_", (String) null);

    /* renamed from: F */
    private static final C2484Rd f6170F = new C2484Rd("USER_INFO_", (String) null);

    /* renamed from: G */
    private static final C2484Rd f6171G = new C2484Rd("REFERRER_", (String) null);
    @Deprecated

    /* renamed from: H */
    public static final C2484Rd f6172H = new C2484Rd("APP_ENVIRONMENT", (String) null);
    @Deprecated

    /* renamed from: I */
    public static final C2484Rd f6173I = new C2484Rd("APP_ENVIRONMENT_REVISION", (String) null);

    /* renamed from: J */
    private static final C2484Rd f6174J = new C2484Rd("APP_ENVIRONMENT_", (String) null);

    /* renamed from: K */
    private static final C2484Rd f6175K = new C2484Rd("APP_ENVIRONMENT_REVISION_", (String) null);

    /* renamed from: u */
    private static final C2484Rd f6176u = new C2484Rd("SESSION_SLEEP_START_", (String) null);

    /* renamed from: v */
    private static final C2484Rd f6177v = new C2484Rd("SESSION_ID_", (String) null);

    /* renamed from: w */
    private static final C2484Rd f6178w = new C2484Rd("SESSION_COUNTER_ID_", (String) null);

    /* renamed from: x */
    private static final C2484Rd f6179x = new C2484Rd("SESSION_INIT_TIME_", (String) null);

    /* renamed from: y */
    private static final C2484Rd f6180y = new C2484Rd("SESSION_ALIVE_TIME_", (String) null);

    /* renamed from: z */
    private static final C2484Rd f6181z = new C2484Rd("SESSION_IS_ALIVE_REPORT_NEEDED_", (String) null);

    /* renamed from: f */
    private C2484Rd f6182f = new C2484Rd(f6176u.mo16560b(), mo16080c());

    /* renamed from: g */
    private C2484Rd f6183g = new C2484Rd(f6177v.mo16560b(), mo16080c());

    /* renamed from: h */
    private C2484Rd f6184h = new C2484Rd(f6178w.mo16560b(), mo16080c());

    /* renamed from: i */
    private C2484Rd f6185i = new C2484Rd(f6179x.mo16560b(), mo16080c());

    /* renamed from: j */
    private C2484Rd f6186j = new C2484Rd(f6180y.mo16560b(), mo16080c());

    /* renamed from: k */
    private C2484Rd f6187k = new C2484Rd(f6181z.mo16560b(), mo16080c());

    /* renamed from: l */
    private C2484Rd f6188l = new C2484Rd(f6165A.mo16560b(), mo16080c());

    /* renamed from: m */
    private C2484Rd f6189m = new C2484Rd(f6166B.mo16560b(), mo16080c());

    /* renamed from: n */
    private C2484Rd f6190n = new C2484Rd(f6167C.mo16560b(), mo16080c());

    /* renamed from: o */
    private C2484Rd f6191o = new C2484Rd(f6168D.mo16560b(), mo16080c());

    /* renamed from: p */
    private C2484Rd f6192p = new C2484Rd(f6169E.mo16560b(), mo16080c());

    /* renamed from: q */
    private C2484Rd f6193q = new C2484Rd(f6170F.mo16560b(), mo16080c());

    /* renamed from: r */
    private C2484Rd f6194r = new C2484Rd(f6171G.mo16560b(), mo16080c());

    /* renamed from: s */
    private C2484Rd f6195s = new C2484Rd(f6174J.mo16560b(), mo16080c());

    /* renamed from: t */
    private C2484Rd f6196t = new C2484Rd(f6175K.mo16560b(), mo16080c());

    public C2307Md(Context context, String str) {
        super(context, str);
        m7921a(-1);
        m7923c(0);
        m7922b(0);
    }

    /* renamed from: a */
    public long mo16281a(long j) {
        return this.f5974b.getLong(this.f6191o.mo16558a(), j);
    }

    /* renamed from: b */
    public long mo16284b(long j) {
        return this.f5974b.getLong(this.f6190n.mo16558a(), j);
    }

    /* renamed from: c */
    public long mo16286c(long j) {
        return this.f5974b.getLong(this.f6188l.mo16558a(), j);
    }

    /* renamed from: d */
    public long mo16287d(long j) {
        return this.f5974b.getLong(this.f6189m.mo16558a(), j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_boundentrypreferences";
    }

    /* renamed from: e */
    public long mo16288e(long j) {
        return this.f5974b.getLong(this.f6185i.mo16558a(), j);
    }

    /* renamed from: f */
    public long mo16289f(long j) {
        return this.f5974b.getLong(this.f6184h.mo16558a(), j);
    }

    /* renamed from: g */
    public long mo16291g(long j) {
        return this.f5974b.getLong(this.f6183g.mo16558a(), j);
    }

    /* renamed from: h */
    public long mo16293h(long j) {
        return this.f5974b.getLong(this.f6182f.mo16558a(), j);
    }

    /* renamed from: i */
    public long mo16295i(long j) {
        return this.f5974b.getLong(this.f6192p.mo16558a(), j);
    }

    /* renamed from: c */
    private void m7923c(int i) {
        C2814b.m9065a(this.f5974b, this.f6182f.mo16558a(), i);
    }

    /* renamed from: a */
    public Boolean mo16283a(boolean z) {
        return Boolean.valueOf(this.f5974b.getBoolean(this.f6187k.mo16558a(), z));
    }

    /* renamed from: b */
    public String mo16285b(String str) {
        return this.f5974b.getString(this.f6193q.mo16558a(), (String) null);
    }

    /* renamed from: f */
    public C3460s.C3461a mo16290f() {
        synchronized (this) {
            if (!this.f5974b.contains(this.f6195s.mo16558a()) || !this.f5974b.contains(this.f6196t.mo16558a())) {
                return null;
            }
            C3460s.C3461a aVar = new C3460s.C3461a(this.f5974b.getString(this.f6195s.mo16558a(), JsonUtils.EMPTY_JSON), this.f5974b.getLong(this.f6196t.mo16558a(), 0));
            return aVar;
        }
    }

    /* renamed from: g */
    public boolean mo16292g() {
        return this.f5974b.contains(this.f6185i.mo16558a()) || this.f5974b.contains(this.f6186j.mo16558a()) || this.f5974b.contains(this.f6187k.mo16558a()) || this.f5974b.contains(this.f6182f.mo16558a()) || this.f5974b.contains(this.f6183g.mo16558a()) || this.f5974b.contains(this.f6184h.mo16558a()) || this.f5974b.contains(this.f6191o.mo16558a()) || this.f5974b.contains(this.f6189m.mo16558a()) || this.f5974b.contains(this.f6188l.mo16558a()) || this.f5974b.contains(this.f6190n.mo16558a()) || this.f5974b.contains(this.f6195s.mo16558a()) || this.f5974b.contains(this.f6193q.mo16558a()) || this.f5974b.contains(this.f6194r.mo16558a()) || this.f5974b.contains(this.f6192p.mo16558a());
    }

    /* renamed from: h */
    public void mo16294h() {
        this.f5974b.edit().remove(this.f6191o.mo16558a()).remove(this.f6190n.mo16558a()).remove(this.f6188l.mo16558a()).remove(this.f6189m.mo16558a()).remove(this.f6185i.mo16558a()).remove(this.f6184h.mo16558a()).remove(this.f6183g.mo16558a()).remove(this.f6182f.mo16558a()).remove(this.f6187k.mo16558a()).remove(this.f6186j.mo16558a()).remove(this.f6193q.mo16558a()).remove(this.f6195s.mo16558a()).remove(this.f6196t.mo16558a()).remove(this.f6194r.mo16558a()).remove(this.f6192p.mo16558a()).apply();
    }

    /* renamed from: i */
    public C2307Md mo16296i() {
        return (C2307Md) mo16077a(this.f6194r.mo16558a());
    }

    /* renamed from: b */
    private void m7922b(int i) {
        C2814b.m9065a(this.f5974b, this.f6184h.mo16558a(), i);
    }

    /* renamed from: a */
    public C2307Md mo16282a(C3460s.C3461a aVar) {
        synchronized (this) {
            mo16078a(this.f6195s.mo16558a(), aVar.f9083a);
            mo16078a(this.f6196t.mo16558a(), Long.valueOf(aVar.f9084b));
        }
        return this;
    }

    /* renamed from: a */
    private void m7921a(int i) {
        C2814b.m9065a(this.f5974b, this.f6186j.mo16558a(), i);
    }
}
