package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.i.l */
public final class C7305l implements C7302j {

    /* renamed from: a */
    private static final float[] f16504a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: b */
    private final C7293af f16505b;

    /* renamed from: c */
    private final C7772y f16506c;

    /* renamed from: d */
    private final boolean[] f16507d;

    /* renamed from: e */
    private final C7306a f16508e;

    /* renamed from: f */
    private final C7317r f16509f;

    /* renamed from: g */
    private C7307b f16510g;

    /* renamed from: h */
    private long f16511h;

    /* renamed from: i */
    private String f16512i;

    /* renamed from: j */
    private C7357x f16513j;

    /* renamed from: k */
    private boolean f16514k;

    /* renamed from: l */
    private long f16515l;

    /* renamed from: com.applovin.exoplayer2.e.i.l$a */
    private static final class C7306a {

        /* renamed from: d */
        private static final byte[] f16516d = {0, 0, 1};

        /* renamed from: a */
        public int f16517a;

        /* renamed from: b */
        public int f16518b;

        /* renamed from: c */
        public byte[] f16519c;

        /* renamed from: e */
        private boolean f16520e;

        /* renamed from: f */
        private int f16521f;

        public C7306a(int i) {
            this.f16519c = new byte[i];
        }

        /* renamed from: a */
        public void mo54038a() {
            this.f16520e = false;
            this.f16517a = 0;
            this.f16521f = 0;
        }

        /* renamed from: a */
        public void mo54039a(byte[] bArr, int i, int i2) {
            if (this.f16520e) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f16519c;
                int length = bArr2.length;
                int i4 = this.f16517a;
                if (length < i4 + i3) {
                    this.f16519c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f16519c, this.f16517a, i3);
                this.f16517a += i3;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
            if (r9 != 181) goto L_0x0041;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo54040a(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f16521f
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x004b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L_0x003f
                r7 = 3
                if (r0 == r4) goto L_0x0037
                r4 = 4
                if (r0 == r7) goto L_0x002b
                if (r0 != r4) goto L_0x0025
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L_0x001d
                if (r9 != r3) goto L_0x0053
            L_0x001d:
                int r9 = r8.f16517a
                int r9 = r9 - r10
                r8.f16517a = r9
                r8.f16520e = r1
                return r2
            L_0x0025:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L_0x002b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L_0x0032
                goto L_0x0041
            L_0x0032:
                int r9 = r8.f16517a
                r8.f16518b = r9
                goto L_0x0048
            L_0x0037:
                r10 = 31
                if (r9 <= r10) goto L_0x003c
                goto L_0x0041
            L_0x003c:
                r8.f16521f = r7
                goto L_0x0053
            L_0x003f:
                if (r9 == r3) goto L_0x0048
            L_0x0041:
                com.applovin.exoplayer2.p221l.C7755q.m22361c(r6, r5)
                r8.mo54038a()
                goto L_0x0053
            L_0x0048:
                r8.f16521f = r4
                goto L_0x0053
            L_0x004b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L_0x0053
                r8.f16521f = r2
                r8.f16520e = r2
            L_0x0053:
                byte[] r9 = f16516d
                int r10 = r9.length
                r8.mo54039a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7305l.C7306a.mo54040a(int, int):boolean");
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.i.l$b */
    private static final class C7307b {

        /* renamed from: a */
        private final C7357x f16522a;

        /* renamed from: b */
        private boolean f16523b;

        /* renamed from: c */
        private boolean f16524c;

        /* renamed from: d */
        private boolean f16525d;

        /* renamed from: e */
        private int f16526e;

        /* renamed from: f */
        private int f16527f;

        /* renamed from: g */
        private long f16528g;

        /* renamed from: h */
        private long f16529h;

        public C7307b(C7357x xVar) {
            this.f16522a = xVar;
        }

        /* renamed from: a */
        public void mo54041a() {
            this.f16523b = false;
            this.f16524c = false;
            this.f16525d = false;
            this.f16526e = -1;
        }

        /* renamed from: a */
        public void mo54042a(int i, long j) {
            this.f16526e = i;
            this.f16525d = false;
            boolean z = true;
            this.f16523b = i == 182 || i == 179;
            if (i != 182) {
                z = false;
            }
            this.f16524c = z;
            this.f16527f = 0;
            this.f16529h = j;
        }

        /* renamed from: a */
        public void mo54043a(long j, int i, boolean z) {
            if (this.f16526e == 182 && z && this.f16523b) {
                long j2 = this.f16529h;
                if (j2 != -9223372036854775807L) {
                    int i2 = (int) (j - this.f16528g);
                    this.f16522a.mo53950a(j2, this.f16525d ? 1 : 0, i2, i, (C7357x.C7358a) null);
                }
            }
            if (this.f16526e != 179) {
                this.f16528g = j;
            }
        }

        /* renamed from: a */
        public void mo54044a(byte[] bArr, int i, int i2) {
            if (this.f16524c) {
                int i3 = this.f16527f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.f16525d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f16524c = false;
                    return;
                }
                this.f16527f = i3 + (i2 - i);
            }
        }
    }

    public C7305l() {
        this((C7293af) null);
    }

    C7305l(C7293af afVar) {
        C7772y yVar;
        this.f16505b = afVar;
        this.f16507d = new boolean[4];
        this.f16508e = new C7306a(128);
        this.f16515l = -9223372036854775807L;
        if (afVar != null) {
            this.f16509f = new C7317r(178, 128);
            yVar = new C7772y();
        } else {
            yVar = null;
            this.f16509f = null;
        }
        this.f16506c = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.C7864v m20050a(com.applovin.exoplayer2.p186e.p195i.C7305l.C7306a r8, int r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f16519c
            int r8 = r8.f16517a
            byte[] r8 = java.util.Arrays.copyOf(r0, r8)
            com.applovin.exoplayer2.l.x r0 = new com.applovin.exoplayer2.l.x
            r0.<init>(r8)
            r0.mo55057e(r9)
            r9 = 4
            r0.mo55057e(r9)
            r0.mo55056d()
            r1 = 8
            r0.mo55051b(r1)
            boolean r2 = r0.mo55058e()
            r3 = 3
            if (r2 == 0) goto L_0x0029
            r0.mo55051b(r9)
            r0.mo55051b(r3)
        L_0x0029:
            int r9 = r0.mo55054c(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "Invalid aspect ratio"
            java.lang.String r5 = "H263Reader"
            r6 = 15
            if (r9 != r6) goto L_0x0047
            int r9 = r0.mo55054c(r1)
            int r1 = r0.mo55054c(r1)
            if (r1 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            float r9 = (float) r9
            float r1 = (float) r1
            float r9 = r9 / r1
            r2 = r9
            goto L_0x0052
        L_0x0047:
            float[] r1 = f16504a
            int r7 = r1.length
            if (r9 >= r7) goto L_0x004f
            r2 = r1[r9]
            goto L_0x0052
        L_0x004f:
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r4)
        L_0x0052:
            boolean r9 = r0.mo55058e()
            r1 = 2
            if (r9 == 0) goto L_0x0089
            r0.mo55051b(r1)
            r9 = 1
            r0.mo55051b(r9)
            boolean r9 = r0.mo55058e()
            if (r9 == 0) goto L_0x0089
            r0.mo55051b(r6)
            r0.mo55056d()
            r0.mo55051b(r6)
            r0.mo55056d()
            r0.mo55051b(r6)
            r0.mo55056d()
            r0.mo55051b(r3)
            r9 = 11
            r0.mo55051b(r9)
            r0.mo55056d()
            r0.mo55051b(r6)
            r0.mo55056d()
        L_0x0089:
            int r9 = r0.mo55054c(r1)
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = "Unhandled video object layer shape"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r9)
        L_0x0094:
            r0.mo55056d()
            r9 = 16
            int r9 = r0.mo55054c(r9)
            r0.mo55056d()
            boolean r1 = r0.mo55058e()
            if (r1 == 0) goto L_0x00bb
            if (r9 != 0) goto L_0x00ae
            java.lang.String r9 = "Invalid vop_increment_time_resolution"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r9)
            goto L_0x00bb
        L_0x00ae:
            int r9 = r9 + -1
            r1 = 0
        L_0x00b1:
            if (r9 <= 0) goto L_0x00b8
            int r1 = r1 + 1
            int r9 = r9 >> 1
            goto L_0x00b1
        L_0x00b8:
            r0.mo55051b(r1)
        L_0x00bb:
            r0.mo55056d()
            r9 = 13
            int r1 = r0.mo55054c(r9)
            r0.mo55056d()
            int r9 = r0.mo55054c(r9)
            r0.mo55056d()
            r0.mo55056d()
            com.applovin.exoplayer2.v$a r0 = new com.applovin.exoplayer2.v$a
            r0.<init>()
            com.applovin.exoplayer2.v$a r10 = r0.mo55421a((java.lang.String) r10)
            java.lang.String r0 = "video/mp4v-es"
            com.applovin.exoplayer2.v$a r10 = r10.mo55435f((java.lang.String) r0)
            com.applovin.exoplayer2.v$a r10 = r10.mo55436g((int) r1)
            com.applovin.exoplayer2.v$a r9 = r10.mo55437h((int) r9)
            com.applovin.exoplayer2.v$a r9 = r9.mo55425b((float) r2)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            com.applovin.exoplayer2.v$a r8 = r9.mo55422a((java.util.List<byte[]>) r8)
            com.applovin.exoplayer2.v r8 = r8.mo55424a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7305l.m20050a(com.applovin.exoplayer2.e.i.l$a, int, java.lang.String):com.applovin.exoplayer2.v");
    }

    /* renamed from: a */
    public void mo54029a() {
        C7762v.m22395a(this.f16507d);
        this.f16508e.mo54038a();
        C7307b bVar = this.f16510g;
        if (bVar != null) {
            bVar.mo54041a();
        }
        C7317r rVar = this.f16509f;
        if (rVar != null) {
            rVar.mo54060a();
        }
        this.f16511h = 0;
        this.f16515l = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16515l = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16512i = dVar.mo54026c();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 2);
        this.f16513j = a;
        this.f16510g = new C7307b(a);
        C7293af afVar = this.f16505b;
        if (afVar != null) {
            afVar.mo54028a(jVar, dVar);
        }
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16510g);
        C7717a.m22115a(this.f16513j);
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        byte[] d = yVar.mo55077d();
        this.f16511h += (long) yVar.mo55064a();
        this.f16513j.mo53951a(yVar, yVar.mo55064a());
        while (true) {
            int a = C7762v.m22391a(d, c, b, this.f16507d);
            if (a == b) {
                break;
            }
            int i = a + 3;
            byte b2 = yVar.mo55077d()[i] & 255;
            int i2 = a - c;
            int i3 = 0;
            if (!this.f16514k) {
                if (i2 > 0) {
                    this.f16508e.mo54039a(d, c, a);
                }
                if (this.f16508e.mo54040a(b2, i2 < 0 ? -i2 : 0)) {
                    C7357x xVar = this.f16513j;
                    C7306a aVar = this.f16508e;
                    xVar.mo53953a(m20050a(aVar, aVar.f16518b, (String) C7717a.m22120b(this.f16512i)));
                    this.f16514k = true;
                }
            }
            this.f16510g.mo54044a(d, c, a);
            C7317r rVar = this.f16509f;
            if (rVar != null) {
                if (i2 > 0) {
                    rVar.mo54062a(d, c, a);
                } else {
                    i3 = -i2;
                }
                if (this.f16509f.mo54064b(i3)) {
                    ((C7772y) C7728ai.m22198a(this.f16506c)).mo55070a(this.f16509f.f16645a, C7762v.m22390a(this.f16509f.f16645a, this.f16509f.f16646b));
                    ((C7293af) C7728ai.m22198a(this.f16505b)).mo54027a(this.f16515l, this.f16506c);
                }
                if (b2 == 178 && yVar.mo55077d()[a + 2] == 1) {
                    this.f16509f.mo54061a(b2);
                }
            }
            int i4 = b - a;
            this.f16510g.mo54043a(this.f16511h - ((long) i4), i4, this.f16514k);
            this.f16510g.mo54042a(b2, this.f16515l);
            c = i;
        }
        if (!this.f16514k) {
            this.f16508e.mo54039a(d, c, b);
        }
        this.f16510g.mo54044a(d, c, b);
        C7317r rVar2 = this.f16509f;
        if (rVar2 != null) {
            rVar2.mo54062a(d, c, b);
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
