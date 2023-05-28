package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.gm */
public class C3010gm {

    /* renamed from: a */
    private final SystemTimeProvider f7937a;

    public C3010gm() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public long mo17642a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(this.f7937a.elapsedRealtime() - timeUnit.toMillis(j));
    }

    /* renamed from: b */
    public long mo17643b(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0;
        }
        return this.f7937a.currentTimeSeconds() - timeUnit.toSeconds(j);
    }

    /* renamed from: c */
    public long mo17644c(long j, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(this.f7937a.systemNanoTime() - timeUnit.toNanos(j));
    }

    public C3010gm(SystemTimeProvider systemTimeProvider) {
        this.f7937a = systemTimeProvider;
    }
}
