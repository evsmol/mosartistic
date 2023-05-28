package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.y */
public final class C7327y implements C7287ad {

    /* renamed from: a */
    private final C7326x f16695a;

    /* renamed from: b */
    private final C7772y f16696b = new C7772y(32);

    /* renamed from: c */
    private int f16697c;

    /* renamed from: d */
    private int f16698d;

    /* renamed from: e */
    private boolean f16699e;

    /* renamed from: f */
    private boolean f16700f;

    public C7327y(C7326x xVar) {
        this.f16695a = xVar;
    }

    /* renamed from: a */
    public void mo54019a() {
        this.f16700f = true;
    }

    /* renamed from: a */
    public void mo54020a(C7726ag agVar, C7329j jVar, C7287ad.C7291d dVar) {
        this.f16695a.mo54017a(agVar, jVar, dVar);
        this.f16700f = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104 A[SYNTHETIC] */
    /* renamed from: a */
    public void mo54021a(com.applovin.exoplayer2.p221l.C7772y r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            r8 = r8 & r0
            r1 = 0
            if (r8 == 0) goto L_0x0007
            r8 = 1
            goto L_0x0008
        L_0x0007:
            r8 = 0
        L_0x0008:
            r2 = -1
            if (r8 == 0) goto L_0x0015
            int r3 = r7.mo55084h()
            int r4 = r7.mo55074c()
            int r4 = r4 + r3
            goto L_0x0016
        L_0x0015:
            r4 = -1
        L_0x0016:
            boolean r3 = r6.f16700f
            if (r3 == 0) goto L_0x0024
            if (r8 != 0) goto L_0x001d
            return
        L_0x001d:
            r6.f16700f = r1
            r7.mo55076d(r4)
        L_0x0022:
            r6.f16698d = r1
        L_0x0024:
            int r8 = r7.mo55064a()
            if (r8 <= 0) goto L_0x0104
            int r8 = r6.f16698d
            r3 = 3
            if (r8 >= r3) goto L_0x00b1
            if (r8 != 0) goto L_0x0044
            int r8 = r7.mo55084h()
            int r4 = r7.mo55074c()
            int r4 = r4 - r0
            r7.mo55076d(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r8 != r4) goto L_0x0044
            r6.f16700f = r0
            return
        L_0x0044:
            int r8 = r7.mo55064a()
            int r4 = r6.f16698d
            int r4 = 3 - r4
            int r8 = java.lang.Math.min(r8, r4)
            com.applovin.exoplayer2.l.y r4 = r6.f16696b
            byte[] r4 = r4.mo55077d()
            int r5 = r6.f16698d
            r7.mo55071a(r4, r5, r8)
            int r4 = r6.f16698d
            int r4 = r4 + r8
            r6.f16698d = r4
            if (r4 != r3) goto L_0x0024
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            r8.mo55076d(r1)
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            r8.mo55075c(r3)
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            r8.mo55079e(r0)
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            int r8 = r8.mo55084h()
            com.applovin.exoplayer2.l.y r4 = r6.f16696b
            int r4 = r4.mo55084h()
            r5 = r8 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = 0
        L_0x0084:
            r6.f16699e = r5
            r8 = r8 & 15
            int r8 = r8 << 8
            r8 = r8 | r4
            int r8 = r8 + r3
            r6.f16697c = r8
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            int r8 = r8.mo55078e()
            int r3 = r6.f16697c
            if (r8 >= r3) goto L_0x0024
            r8 = 4098(0x1002, float:5.743E-42)
            com.applovin.exoplayer2.l.y r4 = r6.f16696b
            int r4 = r4.mo55078e()
            int r4 = r4 * 2
            int r3 = java.lang.Math.max(r3, r4)
            int r8 = java.lang.Math.min(r8, r3)
            com.applovin.exoplayer2.l.y r3 = r6.f16696b
            r3.mo55073b(r8)
            goto L_0x0024
        L_0x00b1:
            int r8 = r7.mo55064a()
            int r3 = r6.f16697c
            int r4 = r6.f16698d
            int r3 = r3 - r4
            int r8 = java.lang.Math.min(r8, r3)
            com.applovin.exoplayer2.l.y r3 = r6.f16696b
            byte[] r3 = r3.mo55077d()
            int r4 = r6.f16698d
            r7.mo55071a(r3, r4, r8)
            int r3 = r6.f16698d
            int r3 = r3 + r8
            r6.f16698d = r3
            int r8 = r6.f16697c
            if (r3 != r8) goto L_0x0024
            boolean r3 = r6.f16699e
            if (r3 == 0) goto L_0x00f1
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            byte[] r8 = r8.mo55077d()
            int r3 = r6.f16697c
            int r8 = com.applovin.exoplayer2.p221l.C7728ai.m22186a((byte[]) r8, (int) r1, (int) r3, (int) r2)
            if (r8 == 0) goto L_0x00e7
            r6.f16700f = r0
            return
        L_0x00e7:
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            int r3 = r6.f16697c
            int r3 = r3 + -4
            r8.mo55075c(r3)
            goto L_0x00f6
        L_0x00f1:
            com.applovin.exoplayer2.l.y r3 = r6.f16696b
            r3.mo55075c(r8)
        L_0x00f6:
            com.applovin.exoplayer2.l.y r8 = r6.f16696b
            r8.mo55076d(r1)
            com.applovin.exoplayer2.e.i.x r8 = r6.f16695a
            com.applovin.exoplayer2.l.y r3 = r6.f16696b
            r8.mo54018a(r3)
            goto L_0x0022
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7327y.mo54021a(com.applovin.exoplayer2.l.y, int):void");
    }
}
