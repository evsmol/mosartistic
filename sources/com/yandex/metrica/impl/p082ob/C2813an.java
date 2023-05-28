package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.an */
public class C2813an {

    /* renamed from: a */
    private final C2905dn f7405a;

    /* renamed from: b */
    private final C2905dn f7406b;

    /* renamed from: c */
    private final C2696Wm f7407c;

    /* renamed from: d */
    private final C2875cm f7408d;

    /* renamed from: e */
    private final String f7409e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2813an(int r7, int r8, int r9, java.lang.String r10, com.yandex.metrica.impl.p082ob.C2875cm r11) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.Wm r1 = new com.yandex.metrica.impl.ob.Wm
            r1.<init>(r7)
            com.yandex.metrica.impl.ob.dn r2 = new com.yandex.metrica.impl.ob.dn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r0 = "map key"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r2.<init>(r8, r7, r11)
            com.yandex.metrica.impl.ob.dn r3 = new com.yandex.metrica.impl.ob.dn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = "map value"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.<init>(r9, r7, r11)
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>((com.yandex.metrica.impl.p082ob.C2696Wm) r1, (com.yandex.metrica.impl.p082ob.C2905dn) r2, (com.yandex.metrica.impl.p082ob.C2905dn) r3, (java.lang.String) r4, (com.yandex.metrica.impl.p082ob.C2875cm) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2813an.<init>(int, int, int, java.lang.String, com.yandex.metrica.impl.ob.cm):void");
    }

    /* renamed from: a */
    public C2696Wm mo17201a() {
        return this.f7407c;
    }

    /* renamed from: b */
    public C2905dn mo17203b() {
        return this.f7405a;
    }

    /* renamed from: c */
    public C2905dn mo17204c() {
        return this.f7406b;
    }

    C2813an(C2696Wm wm, C2905dn dnVar, C2905dn dnVar2, String str, C2875cm cmVar) {
        this.f7407c = wm;
        this.f7405a = dnVar;
        this.f7406b = dnVar2;
        this.f7409e = str;
        this.f7408d = cmVar;
    }

    /* renamed from: a */
    public void mo17202a(String str) {
        if (this.f7408d.isEnabled()) {
            this.f7408d.mo15270fw("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f7409e, Integer.valueOf(this.f7407c.mo17006a()), str);
        }
    }
}
