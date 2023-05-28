package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.E2 */
class C1974E2 implements C3240mm<C2875cm> {

    /* renamed from: a */
    final /* synthetic */ Throwable f5270a;

    /* renamed from: b */
    final /* synthetic */ String f5271b;

    C1974E2(C1939D2 d2, Throwable th, String str) {
        this.f5270a = th;
        this.f5271b = str;
    }

    /* renamed from: b */
    public void mo15447b(Object obj) {
        C2875cm cmVar = (C2875cm) obj;
        if (cmVar.isEnabled()) {
            cmVar.mo15261e(this.f5270a, this.f5271b);
        }
    }
}
