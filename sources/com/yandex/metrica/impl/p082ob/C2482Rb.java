package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Rb */
class C2482Rb {

    /* renamed from: a */
    private C3208mc f6562a;

    /* renamed from: b */
    private final C2594U7 f6563b;

    /* renamed from: c */
    private final C2555T7 f6564c;

    public C2482Rb(C3208mc mcVar, C2594U7 u7, C2555T7 t7) {
        this.f6562a = mcVar;
        this.f6563b = u7;
        this.f6564c = t7;
    }

    /* renamed from: a */
    public void mo16555a() {
        C3208mc mcVar = this.f6562a;
        if (mcVar != null) {
            long c = this.f6563b.mo15988c();
            int i = mcVar.f8312f;
            boolean z = true;
            if (c > ((long) i)) {
                this.f6563b.mo15984b((int) (((float) i) * 0.1f));
            }
            C3208mc mcVar2 = this.f6562a;
            long c2 = this.f6564c.mo15988c();
            int i2 = mcVar2.f8312f;
            if (c2 <= ((long) i2)) {
                z = false;
            }
            if (z) {
                this.f6564c.mo15984b((int) (((float) i2) * 0.1f));
            }
        }
    }

    /* renamed from: a */
    public void mo16556a(C3208mc mcVar) {
        this.f6562a = mcVar;
    }
}
