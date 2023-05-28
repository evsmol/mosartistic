package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Hh */
class C2097Hh {

    /* renamed from: a */
    private final C3010gm f5538a;

    /* renamed from: b */
    private final long f5539b;

    /* renamed from: c */
    private long f5540c;

    /* renamed from: d */
    private long f5541d;

    /* renamed from: e */
    private long f5542e;

    C2097Hh(TimeProvider timeProvider, C3010gm gmVar) {
        this.f5539b = timeProvider.currentTimeMillis();
        this.f5538a = gmVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15870a() {
        this.f5540c = this.f5538a.mo17643b(this.f5539b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15871b() {
        this.f5541d = this.f5538a.mo17643b(this.f5539b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15872c() {
        this.f5542e = this.f5538a.mo17643b(this.f5539b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo15873d() {
        return this.f5540c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo15874e() {
        return this.f5541d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo15875f() {
        return this.f5542e;
    }
}
