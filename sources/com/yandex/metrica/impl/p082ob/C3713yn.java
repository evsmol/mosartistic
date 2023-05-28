package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.yn */
public class C3713yn<D> implements C3637wn<D> {

    /* renamed from: a */
    private final Comparator<D> f9540a;

    /* renamed from: b */
    private final int f9541b;

    /* renamed from: c */
    private final TimeProvider f9542c;

    /* renamed from: d */
    final long f9543d;

    /* renamed from: e */
    private D f9544e;

    /* renamed from: f */
    private int f9545f;

    /* renamed from: g */
    private long f9546g;

    public C3713yn(Comparator<D> comparator, TimeProvider timeProvider, int i, long j) {
        this.f9540a = comparator;
        this.f9541b = i;
        this.f9542c = timeProvider;
        this.f9543d = TimeUnit.SECONDS.toMillis(j);
    }

    /* renamed from: a */
    private void m11102a() {
        this.f9545f = 0;
        this.f9546g = this.f9542c.elapsedRealtime();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p082ob.C3744zn<D> get(D r8) {
        /*
            r7 = this;
            D r0 = r7.f9544e
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0008
        L_0x0006:
            r8 = 0
            goto L_0x0016
        L_0x0008:
            java.util.Comparator<D> r3 = r7.f9540a
            int r0 = r3.compare(r0, r8)
            if (r0 != 0) goto L_0x0013
            r7.f9544e = r8
            goto L_0x0006
        L_0x0013:
            r7.f9544e = r8
            r8 = 1
        L_0x0016:
            if (r8 == 0) goto L_0x0025
            r7.m11102a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.NEW
            D r1 = r7.f9544e
            r8.<init>(r0, r1)
            return r8
        L_0x0025:
            int r8 = r7.f9545f
            int r8 = r8 + r1
            r7.f9545f = r8
            int r0 = r7.f9541b
            int r8 = r8 % r0
            r7.f9545f = r8
            com.yandex.metrica.coreutils.services.TimeProvider r8 = r7.f9542c
            long r3 = r8.elapsedRealtime()
            long r5 = r7.f9546g
            long r3 = r3 - r5
            long r5 = r7.f9543d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x004f
            r7.m11102a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.REFRESH
            D r1 = r7.f9544e
            r8.<init>(r0, r1)
            return r8
        L_0x004f:
            int r8 = r7.f9545f
            if (r8 != 0) goto L_0x0060
            r7.m11102a()
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.REFRESH
            D r1 = r7.f9544e
            r8.<init>(r0, r1)
            return r8
        L_0x0060:
            com.yandex.metrica.impl.ob.zn r8 = new com.yandex.metrica.impl.ob.zn
            com.yandex.metrica.impl.ob.zn$a r0 = com.yandex.metrica.impl.p082ob.C3744zn.C3745a.NOT_CHANGED
            D r1 = r7.f9544e
            r8.<init>(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3713yn.get(java.lang.Object):com.yandex.metrica.impl.ob.zn");
    }
}
