package com.applovin.exoplayer2.p186e.p195i;

import android.util.SparseArray;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.w */
public final class C7324w implements C7262h {

    /* renamed from: a */
    public static final C7340l f16675a = $$Lambda$w$5Weks6gnHQS7C0GU3KjY2qoJIzk.INSTANCE;

    /* renamed from: b */
    private final C7726ag f16676b;

    /* renamed from: c */
    private final SparseArray<C7325a> f16677c;

    /* renamed from: d */
    private final C7772y f16678d;

    /* renamed from: e */
    private final C7323v f16679e;

    /* renamed from: f */
    private boolean f16680f;

    /* renamed from: g */
    private boolean f16681g;

    /* renamed from: h */
    private boolean f16682h;

    /* renamed from: i */
    private long f16683i;

    /* renamed from: j */
    private C7320u f16684j;

    /* renamed from: k */
    private C7329j f16685k;

    /* renamed from: l */
    private boolean f16686l;

    /* renamed from: com.applovin.exoplayer2.e.i.w$a */
    private static final class C7325a {

        /* renamed from: a */
        private final C7302j f16687a;

        /* renamed from: b */
        private final C7726ag f16688b;

        /* renamed from: c */
        private final C7771x f16689c = new C7771x(new byte[64]);

        /* renamed from: d */
        private boolean f16690d;

        /* renamed from: e */
        private boolean f16691e;

        /* renamed from: f */
        private boolean f16692f;

        /* renamed from: g */
        private int f16693g;

        /* renamed from: h */
        private long f16694h;

        public C7325a(C7302j jVar, C7726ag agVar) {
            this.f16687a = jVar;
            this.f16688b = agVar;
        }

        /* renamed from: b */
        private void m20172b() {
            this.f16689c.mo55051b(8);
            this.f16690d = this.f16689c.mo55058e();
            this.f16691e = this.f16689c.mo55058e();
            this.f16689c.mo55051b(6);
            this.f16693g = this.f16689c.mo55054c(8);
        }

        /* renamed from: c */
        private void m20173c() {
            this.f16694h = 0;
            if (this.f16690d) {
                this.f16689c.mo55051b(4);
                this.f16689c.mo55051b(1);
                this.f16689c.mo55051b(1);
                long c = (((long) this.f16689c.mo55054c(3)) << 30) | ((long) (this.f16689c.mo55054c(15) << 15)) | ((long) this.f16689c.mo55054c(15));
                this.f16689c.mo55051b(1);
                if (!this.f16692f && this.f16691e) {
                    this.f16689c.mo55051b(4);
                    this.f16689c.mo55051b(1);
                    this.f16689c.mo55051b(1);
                    this.f16689c.mo55051b(1);
                    this.f16688b.mo54989b((((long) this.f16689c.mo55054c(3)) << 30) | ((long) (this.f16689c.mo55054c(15) << 15)) | ((long) this.f16689c.mo55054c(15)));
                    this.f16692f = true;
                }
                this.f16694h = this.f16688b.mo54989b(c);
            }
        }

        /* renamed from: a */
        public void mo54069a() {
            this.f16692f = false;
            this.f16687a.mo54029a();
        }

        /* renamed from: a */
        public void mo54070a(C7772y yVar) throws C6809ai {
            yVar.mo55071a(this.f16689c.f18340a, 0, 3);
            this.f16689c.mo55044a(0);
            m20172b();
            yVar.mo55071a(this.f16689c.f18340a, 0, this.f16693g);
            this.f16689c.mo55044a(0);
            m20173c();
            this.f16687a.mo54030a(this.f16694h, 4);
            this.f16687a.mo54032a(yVar);
            this.f16687a.mo54033b();
        }
    }

    public C7324w() {
        this(new C7726ag(0));
    }

    public C7324w(C7726ag agVar) {
        this.f16676b = agVar;
        this.f16678d = new C7772y(4096);
        this.f16677c = new SparseArray<>();
        this.f16679e = new C7323v();
    }

    /* renamed from: a */
    private void m20165a(long j) {
        C7353v vVar;
        C7329j jVar;
        if (!this.f16686l) {
            this.f16686l = true;
            if (this.f16679e.mo54068c() != -9223372036854775807L) {
                C7320u uVar = new C7320u(this.f16679e.mo54067b(), this.f16679e.mo54068c(), j);
                this.f16684j = uVar;
                jVar = this.f16685k;
                vVar = uVar.mo53862a();
            } else {
                jVar = this.f16685k;
                vVar = new C7353v.C7355b(this.f16679e.mo54068c());
            }
            jVar.mo53896a(vVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7262h[] m20166a() {
        return new C7262h[]{new C7324w()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo53876a(com.applovin.exoplayer2.p186e.C7279i r11, com.applovin.exoplayer2.p186e.C7352u r12) throws java.io.IOException {
        /*
            r10 = this;
            com.applovin.exoplayer2.e.j r0 = r10.f16685k
            com.applovin.exoplayer2.p221l.C7717a.m22115a(r0)
            long r0 = r11.mo53893d()
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0013
            r7 = 1
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            if (r7 == 0) goto L_0x0025
            com.applovin.exoplayer2.e.i.v r7 = r10.f16679e
            boolean r7 = r7.mo54066a()
            if (r7 != 0) goto L_0x0025
            com.applovin.exoplayer2.e.i.v r0 = r10.f16679e
            int r11 = r0.mo54065a((com.applovin.exoplayer2.p186e.C7279i) r11, (com.applovin.exoplayer2.p186e.C7352u) r12)
            return r11
        L_0x0025:
            r10.m20165a((long) r0)
            com.applovin.exoplayer2.e.i.u r7 = r10.f16684j
            if (r7 == 0) goto L_0x0039
            boolean r7 = r7.mo53868b()
            if (r7 == 0) goto L_0x0039
            com.applovin.exoplayer2.e.i.u r0 = r10.f16684j
            int r11 = r0.mo53861a((com.applovin.exoplayer2.p186e.C7279i) r11, (com.applovin.exoplayer2.p186e.C7352u) r12)
            return r11
        L_0x0039:
            r11.mo53899a()
            if (r6 == 0) goto L_0x0044
            long r6 = r11.mo53891b()
            long r0 = r0 - r6
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            r12 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0051
            r2 = 4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0051
            return r12
        L_0x0051:
            com.applovin.exoplayer2.l.y r0 = r10.f16678d
            byte[] r0 = r0.mo55077d()
            r1 = 4
            boolean r0 = r11.mo53905b(r0, r5, r1, r4)
            if (r0 != 0) goto L_0x005f
            return r12
        L_0x005f:
            com.applovin.exoplayer2.l.y r0 = r10.f16678d
            r0.mo55076d(r5)
            com.applovin.exoplayer2.l.y r0 = r10.f16678d
            int r0 = r0.mo55093q()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L_0x006f
            return r12
        L_0x006f:
            r12 = 442(0x1ba, float:6.2E-43)
            if (r0 != r12) goto L_0x0093
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            byte[] r12 = r12.mo55077d()
            r0 = 10
            r11.mo53908d(r12, r5, r0)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            r0 = 9
            r12.mo55076d(r0)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            int r12 = r12.mo55084h()
            r12 = r12 & 7
            int r12 = r12 + 14
        L_0x008f:
            r11.mo53902b(r12)
            return r5
        L_0x0093:
            r12 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r2 = 6
            if (r0 != r12) goto L_0x00af
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            byte[] r12 = r12.mo55077d()
            r11.mo53908d(r12, r5, r1)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            r12.mo55076d(r5)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            int r12 = r12.mo55085i()
            int r12 = r12 + r2
            goto L_0x008f
        L_0x00af:
            r12 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r12 = r12 >> 8
            if (r12 == r4) goto L_0x00b9
            r11.mo53902b(r4)
            return r5
        L_0x00b9:
            r12 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.applovin.exoplayer2.e.i.w$a> r0 = r10.f16677c
            java.lang.Object r0 = r0.get(r12)
            com.applovin.exoplayer2.e.i.w$a r0 = (com.applovin.exoplayer2.p186e.p195i.C7324w.C7325a) r0
            boolean r3 = r10.f16680f
            if (r3 != 0) goto L_0x0130
            if (r0 != 0) goto L_0x0110
            r3 = 0
            r6 = 189(0xbd, float:2.65E-43)
            if (r12 != r6) goto L_0x00dc
            com.applovin.exoplayer2.e.i.b r3 = new com.applovin.exoplayer2.e.i.b
            r3.<init>()
        L_0x00d3:
            r10.f16681g = r4
        L_0x00d5:
            long r6 = r11.mo53892c()
            r10.f16683i = r6
            goto L_0x00f6
        L_0x00dc:
            r6 = r12 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x00e8
            com.applovin.exoplayer2.e.i.q r3 = new com.applovin.exoplayer2.e.i.q
            r3.<init>()
            goto L_0x00d3
        L_0x00e8:
            r6 = r12 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00f6
            com.applovin.exoplayer2.e.i.k r3 = new com.applovin.exoplayer2.e.i.k
            r3.<init>()
            r10.f16682h = r4
            goto L_0x00d5
        L_0x00f6:
            if (r3 == 0) goto L_0x0110
            com.applovin.exoplayer2.e.i.ad$d r0 = new com.applovin.exoplayer2.e.i.ad$d
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r12, r6)
            com.applovin.exoplayer2.e.j r6 = r10.f16685k
            r3.mo54031a((com.applovin.exoplayer2.p186e.C7329j) r6, (com.applovin.exoplayer2.p186e.p195i.C7287ad.C7291d) r0)
            com.applovin.exoplayer2.e.i.w$a r0 = new com.applovin.exoplayer2.e.i.w$a
            com.applovin.exoplayer2.l.ag r6 = r10.f16676b
            r0.<init>(r3, r6)
            android.util.SparseArray<com.applovin.exoplayer2.e.i.w$a> r3 = r10.f16677c
            r3.put(r12, r0)
        L_0x0110:
            boolean r12 = r10.f16681g
            if (r12 == 0) goto L_0x011e
            boolean r12 = r10.f16682h
            if (r12 == 0) goto L_0x011e
            long r6 = r10.f16683i
            r8 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r8
            goto L_0x0121
        L_0x011e:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L_0x0121:
            long r8 = r11.mo53892c()
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0130
            r10.f16680f = r4
            com.applovin.exoplayer2.e.j r12 = r10.f16685k
            r12.mo53895a()
        L_0x0130:
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            byte[] r12 = r12.mo55077d()
            r11.mo53908d(r12, r5, r1)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            r12.mo55076d(r5)
            com.applovin.exoplayer2.l.y r12 = r10.f16678d
            int r12 = r12.mo55085i()
            int r12 = r12 + r2
            if (r0 != 0) goto L_0x014b
            r11.mo53902b(r12)
            goto L_0x016c
        L_0x014b:
            com.applovin.exoplayer2.l.y r1 = r10.f16678d
            r1.mo55067a((int) r12)
            com.applovin.exoplayer2.l.y r1 = r10.f16678d
            byte[] r1 = r1.mo55077d()
            r11.mo53903b(r1, r5, r12)
            com.applovin.exoplayer2.l.y r11 = r10.f16678d
            r11.mo55076d(r2)
            com.applovin.exoplayer2.l.y r11 = r10.f16678d
            r0.mo54070a(r11)
            com.applovin.exoplayer2.l.y r11 = r10.f16678d
            int r12 = r11.mo55078e()
            r11.mo55075c(r12)
        L_0x016c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7324w.mo53876a(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):int");
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        boolean z = true;
        boolean z2 = this.f16676b.mo54990c() == -9223372036854775807L;
        if (!z2) {
            long a = this.f16676b.mo54986a();
            if (a == -9223372036854775807L || a == 0 || a == j2) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.f16676b.mo54987a(j2);
        }
        C7320u uVar = this.f16684j;
        if (uVar != null) {
            uVar.mo53863a(j2);
        }
        for (int i = 0; i < this.f16677c.size(); i++) {
            this.f16677c.valueAt(i).mo54069a();
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16685k = jVar;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.mo53908d(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.mo53907c(bArr[13] & 7);
        iVar.mo53908d(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
