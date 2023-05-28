package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.b1 */
class C2817b1 {

    /* renamed from: a */
    private final Handler f7412a;

    /* renamed from: b */
    private final C1874B f7413b;

    /* renamed from: c */
    private final C2853c1 f7414c;

    C2817b1(Handler handler, C1874B b) {
        this.f7412a = handler;
        this.f7413b = b;
        this.f7414c = new C2853c1(handler, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17208a() {
        this.f7412a.removeCallbacks(this.f7414c, this.f7413b.f5063b.mo18444b().mo64607a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17209b() {
        m9079a(this.f7412a, this.f7413b, this.f7414c);
    }

    /* renamed from: a */
    static void m9079a(Handler handler, C1874B b, Runnable runnable) {
        handler.removeCallbacks(runnable, b.f5063b.mo18444b().mo64607a());
        String a = b.f5063b.mo18444b().mo64607a();
        long uptimeMillis = SystemClock.uptimeMillis();
        Integer l = b.f5063b.mo18444b().mo64626l();
        if (l == null) {
            l = 10;
        }
        handler.postAtTime(runnable, a, uptimeMillis + ((long) (l.intValue() * 500)));
    }
}
