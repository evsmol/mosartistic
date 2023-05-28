package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Hb */
public class C2090Hb implements C2057Gb {

    /* renamed from: a */
    private final int f5521a;

    /* renamed from: b */
    private final int f5522b;

    /* renamed from: c */
    private int f5523c = 0;

    public C2090Hb(int i, int i2) {
        this.f5521a = i;
        this.f5522b = i2;
    }

    /* renamed from: a */
    public int mo15819a() {
        return this.f5522b;
    }

    /* renamed from: b */
    public boolean mo15820b() {
        int i = this.f5523c;
        this.f5523c = i + 1;
        return i < this.f5521a;
    }

    /* renamed from: c */
    public void mo15821c() {
        this.f5523c = 0;
    }
}
