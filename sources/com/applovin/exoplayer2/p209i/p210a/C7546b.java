package com.applovin.exoplayer2.p209i.p210a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p209i.C7619j;
import com.applovin.exoplayer2.p209i.C7620k;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.i.a.b */
public final class C7546b extends C7550c {

    /* renamed from: a */
    private final C7772y f17472a = new C7772y();

    /* renamed from: b */
    private final C7771x f17473b = new C7771x();

    /* renamed from: c */
    private int f17474c = -1;

    /* renamed from: d */
    private final boolean f17475d;

    /* renamed from: e */
    private final int f17476e;

    /* renamed from: f */
    private final C7548b[] f17477f;

    /* renamed from: g */
    private C7548b f17478g;

    /* renamed from: h */
    private List<C7540a> f17479h;

    /* renamed from: i */
    private List<C7540a> f17480i;

    /* renamed from: j */
    private C7549c f17481j;

    /* renamed from: k */
    private int f17482k;

    /* renamed from: com.applovin.exoplayer2.i.a.b$a */
    private static final class C7547a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final Comparator<C7547a> f17483c = $$Lambda$b$a$gnxM_pIkMwf_cmWaRwOGTXSQPU.INSTANCE;

        /* renamed from: a */
        public final C7540a f17484a;

        /* renamed from: b */
        public final int f17485b;

        public C7547a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C7540a.C7542a b = new C7540a.C7542a().mo54643a(charSequence).mo54642a(alignment).mo54639a(f, i).mo54640a(i2).mo54638a(f2).mo54648b(i3).mo54646b(f3);
            if (z) {
                b.mo54652c(i4);
            }
            this.f17484a = b.mo54656e();
            this.f17485b = i5;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.a.b$b */
    private static final class C7548b {

        /* renamed from: a */
        public static final int f17486a = m21349a(2, 2, 2, 0);

        /* renamed from: b */
        public static final int f17487b = m21349a(0, 0, 0, 0);

        /* renamed from: c */
        public static final int f17488c;

        /* renamed from: d */
        private static final int[] f17489d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e */
        private static final int[] f17490e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f */
        private static final int[] f17491f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g */
        private static final boolean[] f17492g = {false, false, false, true, true, true, false};

        /* renamed from: h */
        private static final int[] f17493h;

        /* renamed from: i */
        private static final int[] f17494i = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: j */
        private static final int[] f17495j = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: k */
        private static final int[] f17496k;

        /* renamed from: A */
        private int f17497A;

        /* renamed from: B */
        private int f17498B;

        /* renamed from: C */
        private int f17499C;

        /* renamed from: D */
        private int f17500D;

        /* renamed from: E */
        private int f17501E;

        /* renamed from: F */
        private int f17502F;

        /* renamed from: G */
        private int f17503G;

        /* renamed from: l */
        private final List<SpannableString> f17504l = new ArrayList();

        /* renamed from: m */
        private final SpannableStringBuilder f17505m = new SpannableStringBuilder();

        /* renamed from: n */
        private boolean f17506n;

        /* renamed from: o */
        private boolean f17507o;

        /* renamed from: p */
        private int f17508p;

        /* renamed from: q */
        private boolean f17509q;

        /* renamed from: r */
        private int f17510r;

        /* renamed from: s */
        private int f17511s;

        /* renamed from: t */
        private int f17512t;

        /* renamed from: u */
        private int f17513u;

        /* renamed from: v */
        private boolean f17514v;

        /* renamed from: w */
        private int f17515w;

        /* renamed from: x */
        private int f17516x;

        /* renamed from: y */
        private int f17517y;

        /* renamed from: z */
        private int f17518z;

        static {
            int a = m21349a(0, 0, 0, 3);
            f17488c = a;
            int i = f17487b;
            f17493h = new int[]{i, a, i, i, a, i, i};
            f17496k = new int[]{i, i, i, i, i, a, a};
        }

        public C7548b() {
            mo54682b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m21349a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.applovin.exoplayer2.p221l.C7717a.m22114a(r4, r0, r1)
                com.applovin.exoplayer2.p221l.C7717a.m22114a(r5, r0, r1)
                com.applovin.exoplayer2.p221l.C7717a.m22114a(r6, r0, r1)
                com.applovin.exoplayer2.p221l.C7717a.m22114a(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p210a.C7546b.C7548b.m21349a(int, int, int, int):int");
        }

        /* renamed from: b */
        public static int m21350b(int i, int i2, int i3) {
            return m21349a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public void mo54674a(char c) {
            if (c == 10) {
                this.f17504l.add(mo54687g());
                this.f17505m.clear();
                if (this.f17497A != -1) {
                    this.f17497A = 0;
                }
                if (this.f17498B != -1) {
                    this.f17498B = 0;
                }
                if (this.f17499C != -1) {
                    this.f17499C = 0;
                }
                if (this.f17501E != -1) {
                    this.f17501E = 0;
                }
                while (true) {
                    if ((this.f17514v && this.f17504l.size() >= this.f17513u) || this.f17504l.size() >= 15) {
                        this.f17504l.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f17505m.append(c);
            }
        }

        /* renamed from: a */
        public void mo54675a(int i, int i2) {
            if (this.f17503G != i) {
                mo54674a(10);
            }
            this.f17503G = i;
        }

        /* renamed from: a */
        public void mo54676a(int i, int i2, int i3) {
            if (!(this.f17499C == -1 || this.f17500D == i)) {
                this.f17505m.setSpan(new ForegroundColorSpan(this.f17500D), this.f17499C, this.f17505m.length(), 33);
            }
            if (i != f17486a) {
                this.f17499C = this.f17505m.length();
                this.f17500D = i;
            }
            if (!(this.f17501E == -1 || this.f17502F == i2)) {
                this.f17505m.setSpan(new BackgroundColorSpan(this.f17502F), this.f17501E, this.f17505m.length(), 33);
            }
            if (i2 != f17487b) {
                this.f17501E = this.f17505m.length();
                this.f17502F = i2;
            }
        }

        /* renamed from: a */
        public void mo54677a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f17497A != -1) {
                if (!z) {
                    this.f17505m.setSpan(new StyleSpan(2), this.f17497A, this.f17505m.length(), 33);
                    this.f17497A = -1;
                }
            } else if (z) {
                this.f17497A = this.f17505m.length();
            }
            if (this.f17498B != -1) {
                if (!z2) {
                    this.f17505m.setSpan(new UnderlineSpan(), this.f17498B, this.f17505m.length(), 33);
                    this.f17498B = -1;
                }
            } else if (z2) {
                this.f17498B = this.f17505m.length();
            }
        }

        /* renamed from: a */
        public void mo54678a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f17518z = i;
            this.f17515w = i6;
        }

        /* renamed from: a */
        public void mo54679a(boolean z) {
            this.f17507o = z;
        }

        /* renamed from: a */
        public void mo54680a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f17506n = true;
            this.f17507o = z;
            this.f17514v = z5;
            this.f17508p = i;
            this.f17509q = z4;
            this.f17510r = i2;
            this.f17511s = i3;
            this.f17512t = i6;
            int i11 = i4 + 1;
            if (this.f17513u != i11) {
                this.f17513u = i11;
                while (true) {
                    if ((!z5 || this.f17504l.size() < this.f17513u) && this.f17504l.size() < 15) {
                        break;
                    }
                    this.f17504l.remove(0);
                }
            }
            if (!(i9 == 0 || this.f17516x == i9)) {
                this.f17516x = i9;
                int i12 = i9 - 1;
                mo54678a(f17493h[i12], f17488c, f17492g[i12], 0, f17490e[i12], f17491f[i12], f17489d[i12]);
            }
            if (i10 != 0 && this.f17517y != i10) {
                this.f17517y = i10;
                int i13 = i10 - 1;
                mo54677a(0, 1, 1, false, false, f17495j[i13], f17494i[i13]);
                mo54676a(f17486a, f17496k[i13], f17487b);
            }
        }

        /* renamed from: a */
        public boolean mo54681a() {
            return !mo54684d() || (this.f17504l.isEmpty() && this.f17505m.length() == 0);
        }

        /* renamed from: b */
        public void mo54682b() {
            mo54683c();
            this.f17506n = false;
            this.f17507o = false;
            this.f17508p = 4;
            this.f17509q = false;
            this.f17510r = 0;
            this.f17511s = 0;
            this.f17512t = 0;
            this.f17513u = 15;
            this.f17514v = true;
            this.f17515w = 0;
            this.f17516x = 0;
            this.f17517y = 0;
            int i = f17487b;
            this.f17518z = i;
            this.f17500D = f17486a;
            this.f17502F = i;
        }

        /* renamed from: c */
        public void mo54683c() {
            this.f17504l.clear();
            this.f17505m.clear();
            this.f17497A = -1;
            this.f17498B = -1;
            this.f17499C = -1;
            this.f17501E = -1;
            this.f17503G = 0;
        }

        /* renamed from: d */
        public boolean mo54684d() {
            return this.f17506n;
        }

        /* renamed from: e */
        public boolean mo54685e() {
            return this.f17507o;
        }

        /* renamed from: f */
        public void mo54686f() {
            int length = this.f17505m.length();
            if (length > 0) {
                this.f17505m.delete(length - 1, length);
            }
        }

        /* renamed from: g */
        public SpannableString mo54687g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17505m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f17497A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f17497A, length, 33);
                }
                if (this.f17498B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f17498B, length, 33);
                }
                if (this.f17499C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f17500D), this.f17499C, length, 33);
                }
                if (this.f17501E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f17502F), this.f17501E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.p209i.p210a.C7546b.C7547a mo54688h() {
            /*
                r15 = this;
                boolean r0 = r15.mo54681a()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f17504l
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f17504l
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo54687g()
                r2.append(r1)
                int r1 = r15.f17515w
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f17515w
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f17509q
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f17511s
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f17510r
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f17511s
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f17510r
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f17512t
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0099
            L_0x0093:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x0098
                r8 = 1
                goto L_0x0099
            L_0x0098:
                r8 = 2
            L_0x0099:
                int r1 = r15.f17512t
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a1
                r9 = 0
                goto L_0x00a7
            L_0x00a1:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a6
                r9 = 1
                goto L_0x00a7
            L_0x00a6:
                r9 = 2
            L_0x00a7:
                int r1 = r15.f17518z
                int r3 = f17487b
                if (r1 == r3) goto L_0x00ae
                r0 = 1
            L_0x00ae:
                com.applovin.exoplayer2.i.a.b$a r13 = new com.applovin.exoplayer2.i.a.b$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f17518z
                int r14 = r15.f17508p
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p210a.C7546b.C7548b.mo54688h():com.applovin.exoplayer2.i.a.b$a");
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.a.b$c */
    private static final class C7549c {

        /* renamed from: a */
        public final int f17519a;

        /* renamed from: b */
        public final int f17520b;

        /* renamed from: c */
        public final byte[] f17521c;

        /* renamed from: d */
        int f17522d = 0;

        public C7549c(int i, int i2) {
            this.f17519a = i;
            this.f17520b = i2;
            this.f17521c = new byte[((i2 * 2) - 1)];
        }
    }

    public C7546b(int i, List<byte[]> list) {
        boolean z = true;
        this.f17476e = i == -1 ? 1 : i;
        this.f17475d = (list == null || !C7733e.m22285a(list)) ? false : z;
        this.f17477f = new C7548b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f17477f[i2] = new C7548b();
        }
        this.f17478g = this.f17477f[0];
    }

    /* renamed from: a */
    private void m21321a(int i) {
        C7771x xVar;
        if (i == 0) {
            return;
        }
        if (i != 3) {
            int i2 = 8;
            if (i != 8) {
                switch (i) {
                    case 12:
                        m21337r();
                        return;
                    case 13:
                        this.f17478g.mo54674a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i >= 17 && i <= 23) {
                            C7755q.m22361c("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                            xVar = this.f17473b;
                        } else if (i < 24 || i > 31) {
                            C7755q.m22361c("Cea708Decoder", "Invalid C0 command: " + i);
                            return;
                        } else {
                            C7755q.m22361c("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                            xVar = this.f17473b;
                            i2 = 16;
                        }
                        xVar.mo55051b(i2);
                        return;
                }
            } else {
                this.f17478g.mo54686f();
            }
        } else {
            this.f17479h = m21336q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r5 = r4.f17473b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.mo55051b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4.f17473b.mo55058e() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r4.f17477f[8 - r2].mo54682b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r4.f17473b.mo55058e() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r4.f17477f[8 - r2].mo54679a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r4.f17473b.mo55058e() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r4.f17477f[8 - r2].mo54683c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r4.f17478g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21322b(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00f9;
                case 129: goto L_0x00f9;
                case 130: goto L_0x00f9;
                case 131: goto L_0x00f9;
                case 132: goto L_0x00f9;
                case 133: goto L_0x00f9;
                case 134: goto L_0x00f9;
                case 135: goto L_0x00f9;
                case 136: goto L_0x00e3;
                case 137: goto L_0x00cc;
                case 138: goto L_0x00b5;
                case 139: goto L_0x0099;
                case 140: goto L_0x0083;
                case 141: goto L_0x007c;
                case 142: goto L_0x0107;
                case 143: goto L_0x0077;
                case 144: goto L_0x0063;
                case 145: goto L_0x0051;
                case 146: goto L_0x0043;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0031;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r0, r5)
            goto L_0x0107
        L_0x0020:
            int r5 = r5 + -152
            r4.m21330i(r5)
            int r0 = r4.f17482k
            if (r0 == r5) goto L_0x0107
            r4.f17482k = r5
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f17477f
            r5 = r0[r5]
            goto L_0x0105
        L_0x0031:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f17478g
            boolean r5 = r5.mo54684d()
            if (r5 != 0) goto L_0x003e
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            r0 = 32
            goto L_0x006d
        L_0x003e:
            r4.m21335p()
            goto L_0x0107
        L_0x0043:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f17478g
            boolean r5 = r5.mo54684d()
            if (r5 != 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r4.m21334o()
            goto L_0x0107
        L_0x0051:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f17478g
            boolean r5 = r5.mo54684d()
            if (r5 != 0) goto L_0x005e
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            r0 = 24
            goto L_0x006d
        L_0x005e:
            r4.m21333n()
            goto L_0x0107
        L_0x0063:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f17478g
            boolean r5 = r5.mo54684d()
            if (r5 != 0) goto L_0x0072
        L_0x006b:
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
        L_0x006d:
            r5.mo55051b(r0)
            goto L_0x0107
        L_0x0072:
            r4.m21332m()
            goto L_0x0107
        L_0x0077:
            r4.m21337r()
            goto L_0x0107
        L_0x007c:
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            r5.mo55051b(r1)
            goto L_0x0107
        L_0x0083:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            boolean r5 = r5.mo55058e()
            if (r5 == 0) goto L_0x0096
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f17477f
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo54682b()
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r0 = r4.f17473b
            boolean r0 = r0.mo55058e()
            if (r0 == 0) goto L_0x00b2
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f17477f
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo54685e()
            r3 = r3 ^ r2
            r0.mo54679a((boolean) r3)
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00b5:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            boolean r5 = r5.mo55058e()
            if (r5 == 0) goto L_0x00c9
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f17477f
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo54679a((boolean) r0)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00cc:
            r5 = 1
        L_0x00cd:
            if (r5 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r0 = r4.f17473b
            boolean r0 = r0.mo55058e()
            if (r0 == 0) goto L_0x00e0
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f17477f
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo54679a((boolean) r2)
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00e3:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f17473b
            boolean r5 = r5.mo55058e()
            if (r5 == 0) goto L_0x00f6
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f17477f
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo54683c()
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x00f9:
            int r5 = r5 + -128
            int r0 = r4.f17482k
            if (r0 == r5) goto L_0x0107
            r4.f17482k = r5
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f17477f
            r5 = r0[r5]
        L_0x0105:
            r4.f17478g = r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p210a.C7546b.m21322b(int):void");
    }

    /* renamed from: c */
    private void m21323c(int i) {
        C7771x xVar;
        int i2;
        if (i > 7) {
            if (i <= 15) {
                xVar = this.f17473b;
                i2 = 8;
            } else if (i <= 23) {
                xVar = this.f17473b;
                i2 = 16;
            } else if (i <= 31) {
                xVar = this.f17473b;
                i2 = 24;
            } else {
                return;
            }
            xVar.mo55051b(i2);
        }
    }

    /* renamed from: d */
    private void m21324d(int i) {
        C7771x xVar;
        int i2;
        if (i <= 135) {
            xVar = this.f17473b;
            i2 = 32;
        } else if (i <= 143) {
            xVar = this.f17473b;
            i2 = 40;
        } else if (i <= 159) {
            this.f17473b.mo55051b(2);
            this.f17473b.mo55051b(this.f17473b.mo55054c(6) * 8);
            return;
        } else {
            return;
        }
        xVar.mo55051b(i2);
    }

    /* renamed from: e */
    private void m21325e(int i) {
        if (i == 127) {
            this.f17478g.mo54674a(9835);
        } else {
            this.f17478g.mo54674a((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
        }
    }

    /* renamed from: f */
    private void m21326f(int i) {
        this.f17478g.mo54674a((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* renamed from: g */
    private void m21327g(int i) {
        C7548b bVar;
        char c = ' ';
        if (i == 32) {
            bVar = this.f17478g;
        } else if (i == 33) {
            bVar = this.f17478g;
            c = 160;
        } else if (i == 37) {
            bVar = this.f17478g;
            c = 8230;
        } else if (i == 42) {
            bVar = this.f17478g;
            c = 352;
        } else if (i == 44) {
            bVar = this.f17478g;
            c = 338;
        } else if (i == 63) {
            bVar = this.f17478g;
            c = 376;
        } else if (i == 57) {
            bVar = this.f17478g;
            c = 8482;
        } else if (i == 58) {
            bVar = this.f17478g;
            c = 353;
        } else if (i == 60) {
            bVar = this.f17478g;
            c = 339;
        } else if (i != 61) {
            switch (i) {
                case 48:
                    bVar = this.f17478g;
                    c = 9608;
                    break;
                case 49:
                    bVar = this.f17478g;
                    c = 8216;
                    break;
                case 50:
                    bVar = this.f17478g;
                    c = 8217;
                    break;
                case 51:
                    bVar = this.f17478g;
                    c = 8220;
                    break;
                case 52:
                    bVar = this.f17478g;
                    c = 8221;
                    break;
                case 53:
                    bVar = this.f17478g;
                    c = 8226;
                    break;
                default:
                    switch (i) {
                        case 118:
                            bVar = this.f17478g;
                            c = 8539;
                            break;
                        case 119:
                            bVar = this.f17478g;
                            c = 8540;
                            break;
                        case 120:
                            bVar = this.f17478g;
                            c = 8541;
                            break;
                        case 121:
                            bVar = this.f17478g;
                            c = 8542;
                            break;
                        case 122:
                            bVar = this.f17478g;
                            c = 9474;
                            break;
                        case 123:
                            bVar = this.f17478g;
                            c = 9488;
                            break;
                        case 124:
                            bVar = this.f17478g;
                            c = 9492;
                            break;
                        case 125:
                            bVar = this.f17478g;
                            c = 9472;
                            break;
                        case 126:
                            bVar = this.f17478g;
                            c = 9496;
                            break;
                        case 127:
                            bVar = this.f17478g;
                            c = 9484;
                            break;
                        default:
                            C7755q.m22361c("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            bVar = this.f17478g;
            c = 8480;
        }
        bVar.mo54674a(c);
    }

    /* renamed from: h */
    private void m21328h(int i) {
        C7548b bVar;
        char c;
        if (i == 160) {
            bVar = this.f17478g;
            c = 13252;
        } else {
            C7755q.m22361c("Cea708Decoder", "Invalid G3 character: " + i);
            bVar = this.f17478g;
            c = '_';
        }
        bVar.mo54674a(c);
    }

    /* renamed from: i */
    private void m21329i() {
        if (this.f17481j != null) {
            m21331l();
            this.f17481j = null;
        }
    }

    /* renamed from: i */
    private void m21330i(int i) {
        C7548b bVar = this.f17477f[i];
        this.f17473b.mo55051b(2);
        boolean e = this.f17473b.mo55058e();
        boolean e2 = this.f17473b.mo55058e();
        boolean e3 = this.f17473b.mo55058e();
        int c = this.f17473b.mo55054c(3);
        boolean e4 = this.f17473b.mo55058e();
        int c2 = this.f17473b.mo55054c(7);
        int c3 = this.f17473b.mo55054c(8);
        int c4 = this.f17473b.mo55054c(4);
        int c5 = this.f17473b.mo55054c(4);
        this.f17473b.mo55051b(2);
        int c6 = this.f17473b.mo55054c(6);
        this.f17473b.mo55051b(2);
        bVar.mo54680a(e, e2, e3, c, e4, c2, c3, c5, c6, c4, this.f17473b.mo55054c(3), this.f17473b.mo55054c(3));
    }

    /* renamed from: l */
    private void m21331l() {
        String str;
        StringBuilder sb;
        if (this.f17481j.f17522d != (this.f17481j.f17520b * 2) - 1) {
            C7755q.m22356a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f17481j.f17520b * 2) - 1) + ", but current index is " + this.f17481j.f17522d + " (sequence number " + this.f17481j.f17519a + ");");
        }
        this.f17473b.mo55048a(this.f17481j.f17521c, this.f17481j.f17522d);
        int c = this.f17473b.mo55054c(3);
        int c2 = this.f17473b.mo55054c(5);
        if (c == 7) {
            this.f17473b.mo55051b(2);
            c = this.f17473b.mo55054c(6);
            if (c < 7) {
                C7755q.m22361c("Cea708Decoder", "Invalid extended service number: " + c);
            }
        }
        if (c2 == 0) {
            if (c != 0) {
                C7755q.m22361c("Cea708Decoder", "serviceNumber is non-zero (" + c + ") when blockSize is 0");
            }
        } else if (c == this.f17476e) {
            boolean z = false;
            while (this.f17473b.mo55042a() > 0) {
                int c3 = this.f17473b.mo55054c(8);
                if (c3 == 16) {
                    c3 = this.f17473b.mo55054c(8);
                    if (c3 <= 31) {
                        m21323c(c3);
                    } else if (c3 <= 127) {
                        m21327g(c3);
                    } else if (c3 <= 159) {
                        m21324d(c3);
                    } else if (c3 <= 255) {
                        m21328h(c3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(c3);
                        C7755q.m22361c("Cea708Decoder", sb.toString());
                    }
                } else if (c3 <= 31) {
                    m21321a(c3);
                } else if (c3 <= 127) {
                    m21325e(c3);
                } else if (c3 <= 159) {
                    m21322b(c3);
                } else if (c3 <= 255) {
                    m21326f(c3);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(c3);
                    C7755q.m22361c("Cea708Decoder", sb.toString());
                }
                z = true;
            }
            if (z) {
                this.f17479h = m21336q();
            }
        }
    }

    /* renamed from: m */
    private void m21332m() {
        this.f17478g.mo54677a(this.f17473b.mo55054c(4), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55058e(), this.f17473b.mo55058e(), this.f17473b.mo55054c(3), this.f17473b.mo55054c(3));
    }

    /* renamed from: n */
    private void m21333n() {
        int a = C7548b.m21349a(this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2));
        int a2 = C7548b.m21349a(this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2));
        this.f17473b.mo55051b(2);
        this.f17478g.mo54676a(a, a2, C7548b.m21350b(this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2)));
    }

    /* renamed from: o */
    private void m21334o() {
        this.f17473b.mo55051b(4);
        int c = this.f17473b.mo55054c(4);
        this.f17473b.mo55051b(2);
        this.f17478g.mo54675a(c, this.f17473b.mo55054c(6));
    }

    /* renamed from: p */
    private void m21335p() {
        int a = C7548b.m21349a(this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2));
        int c = this.f17473b.mo55054c(2);
        int b = C7548b.m21350b(this.f17473b.mo55054c(2), this.f17473b.mo55054c(2), this.f17473b.mo55054c(2));
        if (this.f17473b.mo55058e()) {
            c |= 4;
        }
        boolean e = this.f17473b.mo55058e();
        int c2 = this.f17473b.mo55054c(2);
        int c3 = this.f17473b.mo55054c(2);
        int c4 = this.f17473b.mo55054c(2);
        this.f17473b.mo55051b(8);
        this.f17478g.mo54678a(a, b, e, c, c2, c3, c4);
    }

    /* renamed from: q */
    private List<C7540a> m21336q() {
        C7547a h;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f17477f[i].mo54681a() && this.f17477f[i].mo54685e() && (h = this.f17477f[i].mo54688h()) != null) {
                arrayList.add(h);
            }
        }
        Collections.sort(arrayList, C7547a.f17483c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C7547a) arrayList.get(i2)).f17484a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: r */
    private void m21337r() {
        for (int i = 0; i < 8; i++) {
            this.f17477f[i].mo54682b();
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo54658a(long j) {
        super.mo54658a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54659a(C7619j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C7717a.m22120b(jVar.f15332b);
        this.f17472a.mo55070a(byteBuffer.array(), byteBuffer.limit());
        while (this.f17472a.mo55064a() >= 3) {
            int h = this.f17472a.mo55084h() & 7;
            int i = h & 3;
            boolean z = false;
            boolean z2 = (h & 4) == 4;
            byte h2 = (byte) this.f17472a.mo55084h();
            byte h3 = (byte) this.f17472a.mo55084h();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m21329i();
                    int i2 = (h2 & 192) >> 6;
                    int i3 = this.f17474c;
                    if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                        m21337r();
                        C7755q.m22361c("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f17474c + " current=" + i2);
                    }
                    this.f17474c = i2;
                    byte b = h2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    C7549c cVar = new C7549c(i2, b);
                    this.f17481j = cVar;
                    byte[] bArr = cVar.f17521c;
                    C7549c cVar2 = this.f17481j;
                    int i4 = cVar2.f17522d;
                    cVar2.f17522d = i4 + 1;
                    bArr[i4] = h3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C7717a.m22118a(z);
                    C7549c cVar3 = this.f17481j;
                    if (cVar3 == null) {
                        C7755q.m22363d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar3.f17521c;
                        C7549c cVar4 = this.f17481j;
                        int i5 = cVar4.f17522d;
                        cVar4.f17522d = i5 + 1;
                        bArr2[i5] = h2;
                        byte[] bArr3 = this.f17481j.f17521c;
                        C7549c cVar5 = this.f17481j;
                        int i6 = cVar5.f17522d;
                        cVar5.f17522d = i6 + 1;
                        bArr3[i6] = h3;
                    }
                }
                if (this.f17481j.f17522d == (this.f17481j.f17520b * 2) - 1) {
                    m21329i();
                }
            }
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo54660b(C7619j jVar) throws C7600h {
        super.mo53134a(jVar);
    }

    /* renamed from: c */
    public void mo53136c() {
        super.mo53136c();
        this.f17479h = null;
        this.f17480i = null;
        this.f17482k = 0;
        this.f17478g = this.f17477f[0];
        m21337r();
        this.f17481j = null;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo53137d() {
        super.mo53137d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C7620k mo54661e() throws C7600h {
        return super.mo53135b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo54662f() {
        return this.f17479h != this.f17480i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C7585f mo54663g() {
        List<C7540a> list = this.f17479h;
        this.f17480i = list;
        return new C7554d((List) C7717a.m22120b(list));
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C7619j mo54664h() throws C7600h {
        return super.mo53133a();
    }
}
