package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fm */
public class C2974fm implements C2444Q0 {

    /* renamed from: a */
    private volatile long f7875a;

    /* renamed from: b */
    private C2917e9 f7876b;

    /* renamed from: c */
    private TimeProvider f7877c;

    /* renamed from: com.yandex.metrica.impl.ob.fm$b */
    private static class C2976b {

        /* renamed from: a */
        static C2974fm f7878a = new C2974fm();
    }

    /* renamed from: c */
    public static C2974fm m9584c() {
        return C2976b.f7878a;
    }

    /* renamed from: a */
    public synchronized long mo16498a() {
        return this.f7875a;
    }

    /* renamed from: b */
    public synchronized void mo17615b() {
        this.f7876b.mo17517c(false);
        this.f7876b.mo17448d();
    }

    /* renamed from: d */
    public synchronized void mo17616d() {
        C2917e9 s = C2007F0.m7154g().mo15756s();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f7876b = s;
        this.f7875a = s.mo17509b(0);
        this.f7877c = systemTimeProvider;
    }

    /* renamed from: e */
    public synchronized boolean mo17617e() {
        return this.f7876b.mo17508a(true);
    }

    private C2974fm() {
    }

    /* renamed from: a */
    public synchronized void mo17614a(long j, Long l) {
        this.f7875a = (j - this.f7877c.currentTimeMillis()) / 1000;
        boolean z = true;
        if (this.f7876b.mo17508a(true)) {
            if (l != null) {
                long abs = Math.abs(j - this.f7877c.currentTimeMillis());
                C2917e9 e9Var = this.f7876b;
                if (abs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                    z = false;
                }
                e9Var.mo17517c(z);
            } else {
                this.f7876b.mo17517c(false);
            }
        }
        this.f7876b.mo17533l(this.f7875a);
        this.f7876b.mo17448d();
    }
}
