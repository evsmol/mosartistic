package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.M5 */
public class C2299M5 {

    /* renamed from: a */
    private final int f6150a;

    /* renamed from: b */
    private final C2449Q5 f6151b;

    /* renamed from: c */
    private C2331N5 f6152c;

    public C2299M5(Context context, C2108I3 i3, int i) {
        this(new C2449Q5(context, i3), i);
    }

    /* renamed from: b */
    private void m7898b() {
        this.f6151b.mo16511a(this.f6152c);
    }

    /* renamed from: a */
    public C1936D0 mo16262a(String str) {
        C1936D0 d0;
        if (this.f6152c == null) {
            C2331N5 a = this.f6151b.mo16510a();
            this.f6152c = a;
            int d = a.mo16338d();
            int i = this.f6150a;
            if (d != i) {
                this.f6152c.mo16336b(i);
                m7898b();
            }
        }
        int hashCode = str.hashCode();
        if (this.f6152c.mo16335b().contains(Integer.valueOf(hashCode))) {
            return C1936D0.NON_FIRST_OCCURENCE;
        }
        if (this.f6152c.mo16339e()) {
            d0 = C1936D0.FIRST_OCCURRENCE;
        } else {
            d0 = C1936D0.UNKNOWN;
        }
        if (this.f6152c.mo16337c() < 1000) {
            this.f6152c.mo16333a(hashCode);
        } else {
            this.f6152c.mo16334a(false);
        }
        m7898b();
        return d0;
    }

    C2299M5(C2449Q5 q5, int i) {
        this.f6150a = i;
        this.f6151b = q5;
    }

    /* renamed from: a */
    public void mo16263a() {
        if (this.f6152c == null) {
            C2331N5 a = this.f6151b.mo16510a();
            this.f6152c = a;
            int d = a.mo16338d();
            int i = this.f6150a;
            if (d != i) {
                this.f6152c.mo16336b(i);
                m7898b();
            }
        }
        this.f6152c.mo16332a();
        this.f6152c.mo16334a(true);
        m7898b();
    }
}
