package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Z8 */
public class C2764Z8 extends C2888d9 {

    /* renamed from: c */
    private static final C2484Rd f7266c = new C2484Rd("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", (String) null);

    /* renamed from: d */
    private static final C2484Rd f7267d = new C2484Rd("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", (String) null);

    public C2764Z8(C2511S7 s7) {
        super(s7);
    }

    /* renamed from: b */
    public long mo17105b(long j) {
        return mo17437a(f7266c.mo16558a(), j);
    }

    /* renamed from: c */
    public long mo17106c(long j) {
        return mo17437a(f7267d.mo16558a(), j);
    }

    /* renamed from: d */
    public C2764Z8 mo17107d(long j) {
        return (C2764Z8) mo17442b(f7266c.mo16558a(), j);
    }

    /* renamed from: e */
    public C2764Z8 mo17108e(long j) {
        return (C2764Z8) mo17442b(f7267d.mo16558a(), j);
    }
}
