package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Ih */
public class C2157Ih {

    /* renamed from: a */
    private long f5773a;

    /* renamed from: b */
    private long f5774b;

    /* renamed from: c */
    private final TimeProvider f5775c;

    /* renamed from: d */
    private final C3010gm f5776d;

    C2157Ih() {
        this(new SystemTimeProvider(), new C3010gm());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized double mo15934a() {
        return (double) this.f5776d.mo17643b(this.f5774b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized double mo15935b() {
        return (double) this.f5776d.mo17643b(this.f5773a, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo15936c() {
        this.f5774b = this.f5775c.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo15937d() {
        this.f5773a = this.f5775c.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo15938e() {
        this.f5774b = 0;
    }

    C2157Ih(TimeProvider timeProvider, C3010gm gmVar) {
        this.f5775c = timeProvider;
        this.f5776d = gmVar;
    }
}
