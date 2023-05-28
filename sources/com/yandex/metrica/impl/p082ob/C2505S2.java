package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.S2 */
class C2505S2 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2470R2 f6619a;

    /* renamed from: com.yandex.metrica.impl.ob.S2$a */
    class C2506a implements Runnable {
        C2506a() {
        }

        public void run() {
            C3322oh.m10249a(C2505S2.this.f6619a.f6545a);
        }
    }

    C2505S2(C2470R2 r2) {
        this.f6619a = r2;
    }

    public void run() {
        this.f6619a.f6549e.mo15960a().execute(new C2506a());
    }
}
