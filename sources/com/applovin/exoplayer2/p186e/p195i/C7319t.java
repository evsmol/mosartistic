package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.t */
public final class C7319t implements C7287ad {

    /* renamed from: a */
    private final C7302j f16653a;

    /* renamed from: b */
    private final C7771x f16654b = new C7771x(new byte[10]);

    /* renamed from: c */
    private int f16655c = 0;

    /* renamed from: d */
    private int f16656d;

    /* renamed from: e */
    private C7726ag f16657e;

    /* renamed from: f */
    private boolean f16658f;

    /* renamed from: g */
    private boolean f16659g;

    /* renamed from: h */
    private boolean f16660h;

    /* renamed from: i */
    private int f16661i;

    /* renamed from: j */
    private int f16662j;

    /* renamed from: k */
    private boolean f16663k;

    /* renamed from: l */
    private long f16664l;

    public C7319t(C7302j jVar) {
        this.f16653a = jVar;
    }

    /* renamed from: a */
    private void m20139a(int i) {
        this.f16655c = i;
        this.f16656d = 0;
    }

    /* renamed from: a */
    private boolean m20140a(C7772y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.mo55064a(), i - this.f16656d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.mo55079e(min);
        } else {
            yVar.mo55071a(bArr, this.f16656d, min);
        }
        int i2 = this.f16656d + min;
        this.f16656d = i2;
        return i2 == i;
    }

    /* renamed from: b */
    private boolean m20141b() {
        this.f16654b.mo55044a(0);
        int c = this.f16654b.mo55054c(24);
        if (c != 1) {
            C7755q.m22361c("PesReader", "Unexpected start code prefix: " + c);
            this.f16662j = -1;
            return false;
        }
        this.f16654b.mo55051b(8);
        int c2 = this.f16654b.mo55054c(16);
        this.f16654b.mo55051b(5);
        this.f16663k = this.f16654b.mo55058e();
        this.f16654b.mo55051b(2);
        this.f16658f = this.f16654b.mo55058e();
        this.f16659g = this.f16654b.mo55058e();
        this.f16654b.mo55051b(6);
        int c3 = this.f16654b.mo55054c(8);
        this.f16661i = c3;
        if (c2 != 0) {
            int i = ((c2 + 6) - 9) - c3;
            this.f16662j = i;
            if (i < 0) {
                C7755q.m22361c("PesReader", "Found negative packet payload size: " + this.f16662j);
            }
            return true;
        }
        this.f16662j = -1;
        return true;
    }

    /* renamed from: c */
    private void m20142c() {
        this.f16654b.mo55044a(0);
        this.f16664l = -9223372036854775807L;
        if (this.f16658f) {
            this.f16654b.mo55051b(4);
            this.f16654b.mo55051b(1);
            this.f16654b.mo55051b(1);
            long c = (((long) this.f16654b.mo55054c(3)) << 30) | ((long) (this.f16654b.mo55054c(15) << 15)) | ((long) this.f16654b.mo55054c(15));
            this.f16654b.mo55051b(1);
            if (!this.f16660h && this.f16659g) {
                this.f16654b.mo55051b(4);
                this.f16654b.mo55051b(1);
                this.f16654b.mo55051b(1);
                this.f16654b.mo55051b(1);
                this.f16657e.mo54989b((((long) this.f16654b.mo55054c(3)) << 30) | ((long) (this.f16654b.mo55054c(15) << 15)) | ((long) this.f16654b.mo55054c(15)));
                this.f16660h = true;
            }
            this.f16664l = this.f16657e.mo54989b(c);
        }
    }

    /* renamed from: a */
    public final void mo54019a() {
        this.f16655c = 0;
        this.f16656d = 0;
        this.f16660h = false;
        this.f16653a.mo54029a();
    }

    /* renamed from: a */
    public void mo54020a(C7726ag agVar, C7329j jVar, C7287ad.C7291d dVar) {
        this.f16657e = agVar;
        this.f16653a.mo54031a(jVar, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo54021a(com.applovin.exoplayer2.p221l.C7772y r8, int r9) throws com.applovin.exoplayer2.C6809ai {
        /*
            r7 = this;
            com.applovin.exoplayer2.l.ag r0 = r7.f16657e
            com.applovin.exoplayer2.p221l.C7717a.m22115a(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0047
            int r0 = r7.f16655c
            if (r0 == 0) goto L_0x0044
            if (r0 == r4) goto L_0x0044
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L_0x003f
            if (r0 != r2) goto L_0x0039
            int r0 = r7.f16662j
            if (r0 == r1) goto L_0x007c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f16662j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r0)
            goto L_0x007c
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x003f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r0)
        L_0x0044:
            r7.m20139a(r4)
        L_0x0047:
            int r0 = r8.mo55064a()
            if (r0 <= 0) goto L_0x00d8
            int r0 = r7.f16655c
            if (r0 == 0) goto L_0x00cf
            r5 = 0
            if (r0 == r4) goto L_0x00b7
            if (r0 == r3) goto L_0x0088
            if (r0 != r2) goto L_0x0082
            int r0 = r8.mo55064a()
            int r6 = r7.f16662j
            if (r6 != r1) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            int r5 = r0 - r6
        L_0x0063:
            if (r5 <= 0) goto L_0x006e
            int r0 = r0 - r5
            int r5 = r8.mo55074c()
            int r5 = r5 + r0
            r8.mo55075c(r5)
        L_0x006e:
            com.applovin.exoplayer2.e.i.j r5 = r7.f16653a
            r5.mo54032a(r8)
            int r5 = r7.f16662j
            if (r5 == r1) goto L_0x0047
            int r5 = r5 - r0
            r7.f16662j = r5
            if (r5 != 0) goto L_0x0047
        L_0x007c:
            com.applovin.exoplayer2.e.i.j r0 = r7.f16653a
            r0.mo54033b()
            goto L_0x0044
        L_0x0082:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0088:
            r0 = 10
            int r6 = r7.f16661i
            int r0 = java.lang.Math.min(r0, r6)
            com.applovin.exoplayer2.l.x r6 = r7.f16654b
            byte[] r6 = r6.f18340a
            boolean r0 = r7.m20140a((com.applovin.exoplayer2.p221l.C7772y) r8, (byte[]) r6, (int) r0)
            if (r0 == 0) goto L_0x0047
            r0 = 0
            int r6 = r7.f16661i
            boolean r0 = r7.m20140a((com.applovin.exoplayer2.p221l.C7772y) r8, (byte[]) r0, (int) r6)
            if (r0 == 0) goto L_0x0047
            r7.m20142c()
            boolean r0 = r7.f16663k
            if (r0 == 0) goto L_0x00ab
            r5 = 4
        L_0x00ab:
            r9 = r9 | r5
            com.applovin.exoplayer2.e.i.j r0 = r7.f16653a
            long r5 = r7.f16664l
            r0.mo54030a((long) r5, (int) r9)
            r7.m20139a(r2)
            goto L_0x0047
        L_0x00b7:
            com.applovin.exoplayer2.l.x r0 = r7.f16654b
            byte[] r0 = r0.f18340a
            r6 = 9
            boolean r0 = r7.m20140a((com.applovin.exoplayer2.p221l.C7772y) r8, (byte[]) r0, (int) r6)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r7.m20141b()
            if (r0 == 0) goto L_0x00ca
            r5 = 2
        L_0x00ca:
            r7.m20139a(r5)
            goto L_0x0047
        L_0x00cf:
            int r0 = r8.mo55064a()
            r8.mo55079e(r0)
            goto L_0x0047
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7319t.mo54021a(com.applovin.exoplayer2.l.y, int):void");
    }
}
