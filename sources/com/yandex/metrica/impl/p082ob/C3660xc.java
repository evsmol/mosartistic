package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.xc */
class C3660xc extends C3565v2<Location> {

    /* renamed from: d */
    public static final long f9454d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e */
    public static final List<String> f9455e = Arrays.asList(new String[]{"gps", "network"});

    /* renamed from: c */
    private C3661a f9456c;

    /* renamed from: com.yandex.metrica.impl.ob.xc$a */
    public static class C3661a {

        /* renamed from: a */
        public final long f9457a;

        public C3661a(long j, long j2, long j3) {
            this.f9457a = j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3660xc(com.yandex.metrica.impl.p082ob.C2435Ph r9) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.xc$a r7 = new com.yandex.metrica.impl.ob.xc$a
            long r1 = f9454d
            r3 = 200(0xc8, double:9.9E-322)
            r5 = 50
            r0 = r7
            r0.<init>(r1, r3, r5)
            if (r9 == 0) goto L_0x0011
            long r0 = r9.f6485c
            goto L_0x0015
        L_0x0011:
            com.yandex.metrica.impl.ob.If$c r0 = com.yandex.metrica.impl.p082ob.C2036G.f5424e
            long r0 = r0.f5616c
        L_0x0015:
            r2 = r0
            r0 = 2
            if (r9 == 0) goto L_0x001d
            long r4 = r9.f6485c
            goto L_0x0021
        L_0x001d:
            com.yandex.metrica.impl.ob.If$c r9 = com.yandex.metrica.impl.p082ob.C2036G.f5424e
            long r4 = r9.f5616c
        L_0x0021:
            long r4 = r4 * r0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3660xc.<init>(com.yandex.metrica.impl.ob.Ph):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15802a(Object obj) {
        Location location = (Location) obj;
        return f9455e.contains(location.getProvider()) && (this.f5429a.mo15795b() || this.f5429a.mo15797d() || m11022a(location, (Location) this.f5429a.mo15792a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo15803b(C2435Ph ph) {
        return ph.f6485c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo15799a(C2435Ph ph) {
        return ph.f6485c * 2;
    }

    /* renamed from: a */
    private boolean m11022a(Location location, Location location2) {
        boolean z;
        long j = this.f9456c.f9457a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j;
        boolean z3 = time < (-j);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (!z3) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z5 = accuracy > 0;
            boolean z6 = accuracy < 0;
            boolean z7 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                z = provider2 == null;
            } else {
                z = provider.equals(provider2);
            }
            if (z6) {
                return true;
            }
            if (z4 && !z5) {
                return true;
            }
            if (!z4 || z7 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    C3660xc(C3661a aVar, long j, long j2) {
        super(j, j2);
        this.f9456c = aVar;
    }
}
