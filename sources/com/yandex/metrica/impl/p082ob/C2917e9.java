package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.e9 */
public class C2917e9 extends C2888d9 implements C2945f8, C3355ph {

    /* renamed from: c */
    static final C2484Rd f7716c = new C2484Rd("LOCATION_TRACKING_ENABLED", (String) null);

    /* renamed from: d */
    static final C2484Rd f7717d = new C2484Rd("PREF_KEY_OFFSET", (String) null);

    /* renamed from: e */
    static final C2484Rd f7718e = new C2484Rd("UNCHECKED_TIME", (String) null);

    /* renamed from: f */
    static final C2484Rd f7719f = new C2484Rd("STATISTICS_RESTRICTED_IN_MAIN", (String) null);

    /* renamed from: g */
    static final C2484Rd f7720g = new C2484Rd("LAST_IDENTITY_LIGHT_SEND_TIME", (String) null);

    /* renamed from: h */
    static final C2484Rd f7721h = new C2484Rd("NEXT_REPORT_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: i */
    static final C2484Rd f7722i = new C2484Rd("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: j */
    static final C2484Rd f7723j = new C2484Rd("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", (String) null);

    /* renamed from: k */
    static final C2484Rd f7724k = new C2484Rd("LAST_REPORT_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: l */
    static final C2484Rd f7725l = new C2484Rd("LAST_LOCATION_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: m */
    static final C2484Rd f7726m = new C2484Rd("LAST_STARTUP_SEND_ATTEMPT_TIME", (String) null);

    /* renamed from: n */
    private static final C2484Rd f7727n = new C2484Rd("LAST_MIGRATION_VERSION", (String) null);

    /* renamed from: o */
    static final C2484Rd f7728o = new C2484Rd("LAST_WIFI_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: p */
    static final C2484Rd f7729p = new C2484Rd("LAST_LBS_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: q */
    static final C2484Rd f7730q = new C2484Rd("LAST_GPS_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: r */
    static final C2484Rd f7731r = new C2484Rd("LAST_FUSED_SCANNING_ATTEMPT_TIME", (String) null);

    /* renamed from: s */
    static final C2484Rd f7732s = new C2484Rd("SATELLITE_PRELOAD_INFO_CHECKED", (String) null);

    /* renamed from: t */
    static final C2484Rd f7733t = new C2484Rd("SATELLITE_CLIDS_CHECKED", (String) null);

    /* renamed from: u */
    static final C2484Rd f7734u = new C2484Rd("CERTIFICATE_REQUEST_ETAG", (String) null);

    /* renamed from: v */
    static final C2484Rd f7735v = new C2484Rd("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", (String) null);

    /* renamed from: w */
    static final C2484Rd f7736w = new C2484Rd("VITAL_DATA", (String) null);

    static {
        new C2484Rd("SDKFCE", (String) null);
        new C2484Rd("FST", (String) null);
        new C2484Rd("LSST", (String) null);
        new C2484Rd("FSDKFCO", (String) null);
        new C2484Rd("SRSDKFC", (String) null);
        new C2484Rd("LSDKFCAT", (String) null);
    }

    public C2917e9(C2511S7 s7) {
        super(s7);
    }

    @Deprecated
    /* renamed from: a */
    public int mo17502a(int i) {
        return mo17436a(f7727n.mo16558a(), i);
    }

    /* renamed from: b */
    public long mo17509b(int i) {
        return mo17437a(f7717d.mo16558a(), (long) i);
    }

    /* renamed from: c */
    public C2917e9 mo17517c(boolean z) {
        return (C2917e9) mo17445b(f7718e.mo16558a(), z);
    }

    /* renamed from: d */
    public void mo17519d(boolean z) {
        mo17445b(f7716c.mo16558a(), z).mo17448d();
    }

    /* renamed from: e */
    public long mo17520e(long j) {
        return mo17437a(f7729p.mo16558a(), j);
    }

    /* renamed from: f */
    public Boolean mo17522f() {
        C2484Rd rd = f7719f;
        if (mo17446c(rd.mo16558a())) {
            return Boolean.valueOf(mo17440a(rd.mo16558a(), true));
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo17524g() {
        return mo17440a(f7716c.mo16558a(), false);
    }

    /* renamed from: h */
    public C2917e9 mo17526h(long j) {
        return (C2917e9) mo17442b(f7730q.mo16558a(), j);
    }

    /* renamed from: i */
    public C2917e9 mo17528i(long j) {
        return (C2917e9) mo17442b(f7720g.mo16558a(), j);
    }

    /* renamed from: j */
    public C2917e9 mo17530j(long j) {
        return (C2917e9) mo17442b(f7729p.mo16558a(), j);
    }

    /* renamed from: k */
    public C2917e9 mo17531k(long j) {
        return (C2917e9) mo17442b(f7728o.mo16558a(), j);
    }

    /* renamed from: l */
    public C2917e9 mo17533l(long j) {
        return (C2917e9) mo17442b(f7717d.mo16558a(), j);
    }

    /* renamed from: a */
    public boolean mo17508a(boolean z) {
        return mo17440a(f7718e.mo16558a(), z);
    }

    /* renamed from: b */
    public C2917e9 mo17513b(boolean z) {
        return (C2917e9) mo17445b(f7719f.mo16558a(), z);
    }

    /* renamed from: c */
    public long mo17516c(long j) {
        return mo17437a(f7730q.mo16558a(), j);
    }

    /* renamed from: d */
    public long mo17518d(long j) {
        return mo17437a(f7720g.mo16558a(), j);
    }

    /* renamed from: g */
    public C2917e9 mo17523g(long j) {
        return (C2917e9) mo17442b(f7731r.mo16558a(), j);
    }

    /* renamed from: h */
    public C2917e9 mo17525h() {
        return (C2917e9) mo17445b(f7733t.mo16558a(), true);
    }

    /* renamed from: i */
    public C2917e9 mo17527i() {
        return (C2917e9) mo17445b(f7732s.mo16558a(), true);
    }

    @Deprecated
    /* renamed from: j */
    public C2917e9 mo17529j() {
        return (C2917e9) mo17451f(f7727n.mo16558a());
    }

    /* renamed from: k */
    public boolean mo17532k() {
        return mo17440a(f7732s.mo16558a(), false);
    }

    /* renamed from: l */
    public boolean mo17534l() {
        return mo17440a(f7733t.mo16558a(), false);
    }

    /* renamed from: a */
    public int mo17503a(C3396qd qdVar, int i) {
        C2484Rd b = m9424b(qdVar);
        return b == null ? i : mo17436a(b.mo16558a(), i);
    }

    /* renamed from: b */
    public C2917e9 mo17511b(C3396qd qdVar, int i) {
        C2484Rd b = m9424b(qdVar);
        return b != null ? (C2917e9) mo17441b(b.mo16558a(), i) : this;
    }

    /* renamed from: c */
    public String mo16514c() {
        return mo17438a(f7736w.mo16558a(), (String) null);
    }

    /* renamed from: f */
    public long mo17521f(long j) {
        return mo17437a(f7728o.mo16558a(), j);
    }

    /* renamed from: a */
    public long mo17505a(C3396qd qdVar, long j) {
        C2484Rd a = m9423a(qdVar);
        return a == null ? j : mo17437a(a.mo16558a(), j);
    }

    /* renamed from: b */
    public C2917e9 mo17512b(C3396qd qdVar, long j) {
        C2484Rd a = m9423a(qdVar);
        return a != null ? (C2917e9) mo17442b(a.mo16558a(), j) : this;
    }

    /* renamed from: a */
    public C2917e9 mo17506a(String str, String str2, String str3) {
        return (C2917e9) mo17443b(new C2484Rd("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).mo16558a(), str3);
    }

    /* renamed from: b */
    public long mo17510b(long j) {
        return mo17437a(f7731r.mo16558a(), j);
    }

    /* renamed from: b */
    public String mo17515b() {
        return mo17438a(f7734u.mo16558a(), (String) null);
    }

    /* renamed from: a */
    public long mo17504a() {
        return mo17437a(f7735v.mo16558a(), 0);
    }

    /* renamed from: b */
    public C3355ph mo17514b(String str) {
        return (C3355ph) mo17443b(f7734u.mo16558a(), str);
    }

    /* renamed from: b */
    private C2484Rd m9424b(C3396qd qdVar) {
        int ordinal = qdVar.ordinal();
        if (ordinal == 0) {
            return f7721h;
        }
        if (ordinal == 1) {
            return f7722i;
        }
        if (ordinal != 2) {
            return null;
        }
        return f7723j;
    }

    /* renamed from: a */
    public C3355ph mo17507a(long j) {
        return (C3355ph) mo17442b(f7735v.mo16558a(), j);
    }

    /* renamed from: a */
    public void mo16513a(String str) {
        mo17443b(f7736w.mo16558a(), str);
    }

    /* renamed from: a */
    private C2484Rd m9423a(C3396qd qdVar) {
        int ordinal = qdVar.ordinal();
        if (ordinal == 0) {
            return f7724k;
        }
        if (ordinal == 1) {
            return f7725l;
        }
        if (ordinal != 2) {
            return null;
        }
        return f7726m;
    }
}
