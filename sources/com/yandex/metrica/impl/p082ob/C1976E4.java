package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.E4 */
public class C1976E4 {

    /* renamed from: a */
    private Long f5272a;

    /* renamed from: b */
    private int f5273b;

    /* renamed from: c */
    private TimeProvider f5274c;

    /* renamed from: com.yandex.metrica.impl.ob.E4$a */
    public static class C1977a {

        /* renamed from: a */
        public final long f5275a;

        /* renamed from: b */
        public final long f5276b;

        /* renamed from: c */
        public final int f5277c;

        public C1977a(long j, long j2, int i) {
            this.f5275a = j;
            this.f5277c = i;
            this.f5276b = j2;
        }
    }

    public C1976E4() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public C1977a mo15647a() {
        if (this.f5272a == null) {
            this.f5272a = Long.valueOf(this.f5274c.currentTimeSeconds());
        }
        long longValue = this.f5272a.longValue();
        long longValue2 = this.f5272a.longValue();
        int i = this.f5273b;
        C1977a aVar = new C1977a(longValue, longValue2, i);
        this.f5273b = i + 1;
        return aVar;
    }

    public C1976E4(TimeProvider timeProvider) {
        this.f5274c = timeProvider;
    }
}
