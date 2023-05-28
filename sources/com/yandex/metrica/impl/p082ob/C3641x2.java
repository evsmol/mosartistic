package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.x2 */
public class C3641x2 {

    /* renamed from: a */
    private final TimeProvider f9429a;

    public C3641x2() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    private boolean m10985a(long j, long j2, long j3) {
        return j < j2 || j - j2 >= j3;
    }

    /* renamed from: a */
    public boolean mo18389a(long j, long j2, String str) {
        return m10985a(this.f9429a.currentTimeMillis(), j, j2);
    }

    /* renamed from: b */
    public boolean mo18390b(long j, long j2, String str) {
        return m10985a(this.f9429a.currentTimeSeconds(), j, j2);
    }

    C3641x2(TimeProvider timeProvider) {
        this.f9429a = timeProvider;
    }
}
