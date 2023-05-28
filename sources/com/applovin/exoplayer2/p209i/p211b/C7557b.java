package com.applovin.exoplayer2.p209i.p211b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7771x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.i.b.b */
final class C7557b {

    /* renamed from: a */
    private static final byte[] f17533a = {0, 7, 8, Ascii.f15551SI};

    /* renamed from: b */
    private static final byte[] f17534b = {0, 119, -120, -1};

    /* renamed from: c */
    private static final byte[] f17535c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d */
    private final Paint f17536d;

    /* renamed from: e */
    private final Paint f17537e;

    /* renamed from: f */
    private final Canvas f17538f = new Canvas();

    /* renamed from: g */
    private final C7559b f17539g = new C7559b(719, 575, 0, 719, 0, 575);

    /* renamed from: h */
    private final C7558a f17540h = new C7558a(0, m21402b(), m21405c(), m21406d());

    /* renamed from: i */
    private final C7565h f17541i;

    /* renamed from: j */
    private Bitmap f17542j;

    /* renamed from: com.applovin.exoplayer2.i.b.b$a */
    private static final class C7558a {

        /* renamed from: a */
        public final int f17543a;

        /* renamed from: b */
        public final int[] f17544b;

        /* renamed from: c */
        public final int[] f17545c;

        /* renamed from: d */
        public final int[] f17546d;

        public C7558a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f17543a = i;
            this.f17544b = iArr;
            this.f17545c = iArr2;
            this.f17546d = iArr3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$b */
    private static final class C7559b {

        /* renamed from: a */
        public final int f17547a;

        /* renamed from: b */
        public final int f17548b;

        /* renamed from: c */
        public final int f17549c;

        /* renamed from: d */
        public final int f17550d;

        /* renamed from: e */
        public final int f17551e;

        /* renamed from: f */
        public final int f17552f;

        public C7559b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f17547a = i;
            this.f17548b = i2;
            this.f17549c = i3;
            this.f17550d = i4;
            this.f17551e = i5;
            this.f17552f = i6;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$c */
    private static final class C7560c {

        /* renamed from: a */
        public final int f17553a;

        /* renamed from: b */
        public final boolean f17554b;

        /* renamed from: c */
        public final byte[] f17555c;

        /* renamed from: d */
        public final byte[] f17556d;

        public C7560c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f17553a = i;
            this.f17554b = z;
            this.f17555c = bArr;
            this.f17556d = bArr2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$d */
    private static final class C7561d {

        /* renamed from: a */
        public final int f17557a;

        /* renamed from: b */
        public final int f17558b;

        /* renamed from: c */
        public final int f17559c;

        /* renamed from: d */
        public final SparseArray<C7562e> f17560d;

        public C7561d(int i, int i2, int i3, SparseArray<C7562e> sparseArray) {
            this.f17557a = i;
            this.f17558b = i2;
            this.f17559c = i3;
            this.f17560d = sparseArray;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$e */
    private static final class C7562e {

        /* renamed from: a */
        public final int f17561a;

        /* renamed from: b */
        public final int f17562b;

        public C7562e(int i, int i2) {
            this.f17561a = i;
            this.f17562b = i2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$f */
    private static final class C7563f {

        /* renamed from: a */
        public final int f17563a;

        /* renamed from: b */
        public final boolean f17564b;

        /* renamed from: c */
        public final int f17565c;

        /* renamed from: d */
        public final int f17566d;

        /* renamed from: e */
        public final int f17567e;

        /* renamed from: f */
        public final int f17568f;

        /* renamed from: g */
        public final int f17569g;

        /* renamed from: h */
        public final int f17570h;

        /* renamed from: i */
        public final int f17571i;

        /* renamed from: j */
        public final int f17572j;

        /* renamed from: k */
        public final SparseArray<C7564g> f17573k;

        public C7563f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C7564g> sparseArray) {
            this.f17563a = i;
            this.f17564b = z;
            this.f17565c = i2;
            this.f17566d = i3;
            this.f17567e = i4;
            this.f17568f = i5;
            this.f17569g = i6;
            this.f17570h = i7;
            this.f17571i = i8;
            this.f17572j = i9;
            this.f17573k = sparseArray;
        }

        /* renamed from: a */
        public void mo54702a(C7563f fVar) {
            SparseArray<C7564g> sparseArray = fVar.f17573k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f17573k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$g */
    private static final class C7564g {

        /* renamed from: a */
        public final int f17574a;

        /* renamed from: b */
        public final int f17575b;

        /* renamed from: c */
        public final int f17576c;

        /* renamed from: d */
        public final int f17577d;

        /* renamed from: e */
        public final int f17578e;

        /* renamed from: f */
        public final int f17579f;

        public C7564g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f17574a = i;
            this.f17575b = i2;
            this.f17576c = i3;
            this.f17577d = i4;
            this.f17578e = i5;
            this.f17579f = i6;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$h */
    private static final class C7565h {

        /* renamed from: a */
        public final int f17580a;

        /* renamed from: b */
        public final int f17581b;

        /* renamed from: c */
        public final SparseArray<C7563f> f17582c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C7558a> f17583d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C7560c> f17584e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C7558a> f17585f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C7560c> f17586g = new SparseArray<>();

        /* renamed from: h */
        public C7559b f17587h;

        /* renamed from: i */
        public C7561d f17588i;

        public C7565h(int i, int i2) {
            this.f17580a = i;
            this.f17581b = i2;
        }

        /* renamed from: a */
        public void mo54703a() {
            this.f17582c.clear();
            this.f17583d.clear();
            this.f17584e.clear();
            this.f17585f.clear();
            this.f17586g.clear();
            this.f17587h = null;
            this.f17588i = null;
        }
    }

    public C7557b(int i, int i2) {
        Paint paint = new Paint();
        this.f17536d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17536d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f17536d.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f17537e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f17537e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f17537e.setPathEffect((PathEffect) null);
        this.f17541i = new C7565h(i, i2);
    }

    /* renamed from: a */
    private static int m21391a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:1:0x0009->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21392a(com.applovin.exoplayer2.p221l.C7771x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo55054c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0059
        L_0x0014:
            boolean r4 = r13.mo55058e()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo55054c(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.mo55054c(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0059
        L_0x0028:
            boolean r4 = r13.mo55058e()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.mo55054c(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0052
            if (r4 == r3) goto L_0x004a
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0059
        L_0x0041:
            r4 = 8
            int r4 = r13.mo55054c(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004a:
            r4 = 4
            int r4 = r13.mo55054c(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0052:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0059
        L_0x0056:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0059:
            if (r12 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            if (r15 == 0) goto L_0x0061
            byte r4 = r15[r4]
        L_0x0061:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0077:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007b
            return r10
        L_0x007b:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p211b.C7557b.m21392a(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: a */
    private static C7559b m21393a(C7771x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        xVar.mo55051b(4);
        boolean e = xVar.mo55058e();
        xVar.mo55051b(3);
        int c = xVar.mo55054c(16);
        int c2 = xVar.mo55054c(16);
        if (e) {
            int c3 = xVar.mo55054c(16);
            int c4 = xVar.mo55054c(16);
            int c5 = xVar.mo55054c(16);
            i = xVar.mo55054c(16);
            i3 = c4;
            i2 = c5;
            i4 = c3;
        } else {
            i3 = c;
            i = c2;
            i4 = 0;
            i2 = 0;
        }
        return new C7559b(c, c2, i4, i3, i2, i);
    }

    /* renamed from: a */
    private static C7561d m21394a(C7771x xVar, int i) {
        int c = xVar.mo55054c(8);
        int c2 = xVar.mo55054c(4);
        int c3 = xVar.mo55054c(2);
        xVar.mo55051b(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int c4 = xVar.mo55054c(8);
            xVar.mo55051b(8);
            i2 -= 6;
            sparseArray.put(c4, new C7562e(xVar.mo55054c(16), xVar.mo55054c(16)));
        }
        return new C7561d(c, c2, c3, sparseArray);
    }

    /* renamed from: a */
    private static void m21395a(C7560c cVar, C7558a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? aVar.f17546d : i == 2 ? aVar.f17545c : aVar.f17544b;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m21397a(cVar.f17555c, iArr, i4, i5, i3, paint2, canvas2);
        m21397a(cVar.f17556d, iArr, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21396a(com.applovin.exoplayer2.p221l.C7771x r6, com.applovin.exoplayer2.p209i.p211b.C7557b.C7565h r7) {
        /*
            r0 = 8
            int r0 = r6.mo55054c(r0)
            r1 = 16
            int r2 = r6.mo55054c(r1)
            int r1 = r6.mo55054c(r1)
            int r3 = r6.mo55053c()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.mo55042a()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r7, r0)
            int r7 = r6.mo55042a()
            r6.mo55051b(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0097;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00c1
        L_0x0031:
            int r0 = r7.f17580a
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$b r0 = m21393a(r6)
            r7.f17587h = r0
            goto L_0x00c1
        L_0x003d:
            int r0 = r7.f17580a
            if (r2 != r0) goto L_0x004a
            com.applovin.exoplayer2.i.b.b$c r0 = m21400b(r6)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f17584e
        L_0x0047:
            int r1 = r0.f17553a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f17581b
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$c r0 = m21400b(r6)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f17586g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f17580a
            if (r2 != r0) goto L_0x0065
            com.applovin.exoplayer2.i.b.b$a r0 = m21404c(r6, r1)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r7 = r7.f17583d
        L_0x005f:
            int r1 = r0.f17543a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00c1
        L_0x0065:
            int r0 = r7.f17581b
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$a r0 = m21404c(r6, r1)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r7 = r7.f17585f
            goto L_0x005f
        L_0x0070:
            com.applovin.exoplayer2.i.b.b$d r0 = r7.f17588i
            int r4 = r7.f17580a
            if (r2 != r4) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$f r1 = m21401b(r6, r1)
            int r0 = r0.f17559c
            if (r0 != 0) goto L_0x008f
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r0 = r7.f17582c
            int r2 = r1.f17563a
            java.lang.Object r0 = r0.get(r2)
            com.applovin.exoplayer2.i.b.b$f r0 = (com.applovin.exoplayer2.p209i.p211b.C7557b.C7563f) r0
            if (r0 == 0) goto L_0x008f
            r1.mo54702a(r0)
        L_0x008f:
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r7 = r7.f17582c
            int r0 = r1.f17563a
            r7.put(r0, r1)
            goto L_0x00c1
        L_0x0097:
            int r0 = r7.f17580a
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$d r0 = r7.f17588i
            com.applovin.exoplayer2.i.b.b$d r1 = m21394a((com.applovin.exoplayer2.p221l.C7771x) r6, (int) r1)
            int r2 = r1.f17559c
            if (r2 == 0) goto L_0x00b7
            r7.f17588i = r1
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r0 = r7.f17582c
            r0.clear()
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r0 = r7.f17583d
            r0.clear()
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f17584e
            r7.clear()
            goto L_0x00c1
        L_0x00b7:
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.f17558b
            int r2 = r1.f17558b
            if (r0 == r2) goto L_0x00c1
            r7.f17588i = r1
        L_0x00c1:
            int r7 = r6.mo55053c()
            int r3 = r3 - r7
            r6.mo55057e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p211b.C7557b.m21396a(com.applovin.exoplayer2.l.x, com.applovin.exoplayer2.i.b.b$h):void");
    }

    /* renamed from: a */
    private static void m21397a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = i;
        byte[] bArr5 = bArr;
        C7771x xVar = new C7771x(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (xVar.mo55042a() != 0) {
            int c = xVar.mo55054c(8);
            if (c != 240) {
                switch (c) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m21392a(xVar, iArr, bArr2, i5, i6, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f17533a : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f17534b : bArr6;
                        }
                        bArr2 = bArr3;
                        i5 = m21392a(xVar, iArr, bArr2, i5, i6, paint, canvas);
                    case 17:
                        if (i4 == 3) {
                            bArr4 = bArr7 == null ? f17535c : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i5 = m21399b(xVar, iArr, bArr4, i5, i6, paint, canvas);
                        break;
                    case 18:
                        i5 = m21403c(xVar, iArr, (byte[]) null, i5, i6, paint, canvas);
                        continue;
                    default:
                        switch (c) {
                            case 32:
                                bArr8 = m21398a(4, 4, xVar);
                                break;
                            case 33:
                                bArr6 = m21398a(4, 8, xVar);
                                break;
                            case 34:
                                bArr7 = m21398a(16, 8, xVar);
                                break;
                            default:
                                continue;
                        }
                }
                xVar.mo55059f();
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m21398a(int i, int i2, C7771x xVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) xVar.mo55054c(i2);
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[LOOP:0: B:1:0x0009->B:34:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21399b(com.applovin.exoplayer2.p221l.C7771x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo55054c(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x0065
        L_0x0015:
            boolean r4 = r13.mo55058e()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo55054c(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x0065
        L_0x0028:
            r4 = 0
            r11 = 1
            goto L_0x004c
        L_0x002b:
            boolean r4 = r13.mo55058e()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.mo55054c(r5)
            int r5 = r4 + 4
        L_0x0037:
            int r4 = r13.mo55054c(r3)
            r11 = r2
            r12 = r5
            goto L_0x0065
        L_0x003e:
            int r4 = r13.mo55054c(r5)
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x0057
            if (r4 == r7) goto L_0x004e
            r11 = r2
            r4 = 0
        L_0x004c:
            r12 = 0
            goto L_0x0065
        L_0x004e:
            r4 = 8
            int r4 = r13.mo55054c(r4)
            int r5 = r4 + 25
            goto L_0x0037
        L_0x0057:
            int r4 = r13.mo55054c(r3)
            int r5 = r4 + 9
            goto L_0x0037
        L_0x005e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0065
        L_0x0062:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x0065:
            if (r12 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x006d
            byte r4 = r15[r4]
        L_0x006d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0081:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p211b.C7557b.m21399b(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: b */
    private static C7560c m21400b(C7771x xVar) {
        int c = xVar.mo55054c(16);
        xVar.mo55051b(4);
        int c2 = xVar.mo55054c(2);
        boolean e = xVar.mo55058e();
        xVar.mo55051b(1);
        byte[] bArr = C7728ai.f18254f;
        byte[] bArr2 = C7728ai.f18254f;
        if (c2 == 1) {
            xVar.mo55051b(xVar.mo55054c(8) * 16);
        } else if (c2 == 0) {
            int c3 = xVar.mo55054c(16);
            int c4 = xVar.mo55054c(16);
            if (c3 > 0) {
                bArr = new byte[c3];
                xVar.mo55052b(bArr, 0, c3);
            }
            if (c4 > 0) {
                bArr2 = new byte[c4];
                xVar.mo55052b(bArr2, 0, c4);
            } else {
                bArr2 = bArr;
            }
        }
        return new C7560c(c, e, bArr, bArr2);
    }

    /* renamed from: b */
    private static C7563f m21401b(C7771x xVar, int i) {
        int i2;
        int i3;
        C7771x xVar2 = xVar;
        int c = xVar2.mo55054c(8);
        xVar2.mo55051b(4);
        boolean e = xVar.mo55058e();
        xVar2.mo55051b(3);
        int i4 = 16;
        int c2 = xVar2.mo55054c(16);
        int c3 = xVar2.mo55054c(16);
        int c4 = xVar2.mo55054c(3);
        int c5 = xVar2.mo55054c(3);
        int i5 = 2;
        xVar2.mo55051b(2);
        int c6 = xVar2.mo55054c(8);
        int c7 = xVar2.mo55054c(8);
        int c8 = xVar2.mo55054c(4);
        int c9 = xVar2.mo55054c(2);
        xVar2.mo55051b(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int c10 = xVar2.mo55054c(i4);
            int c11 = xVar2.mo55054c(i5);
            int c12 = xVar2.mo55054c(i5);
            int c13 = xVar2.mo55054c(12);
            int i7 = c9;
            xVar2.mo55051b(4);
            int c14 = xVar2.mo55054c(12);
            i6 -= 6;
            if (c11 == 1 || c11 == 2) {
                i6 -= 2;
                i3 = xVar2.mo55054c(8);
                i2 = xVar2.mo55054c(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(c10, new C7564g(c11, c12, c13, c14, i3, i2));
            c9 = i7;
            i5 = 2;
            i4 = 16;
        }
        return new C7563f(c, e, c2, c3, c4, c5, c6, c7, c8, c9, sparseArray);
    }

    /* renamed from: b */
    private static int[] m21402b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21403c(com.applovin.exoplayer2.p221l.C7771x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo55054c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo55058e()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo55054c(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo55054c(r6)
            int r3 = r13.mo55054c(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p209i.p211b.C7557b.m21403c(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: c */
    private static C7558a m21404c(C7771x xVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C7771x xVar2 = xVar;
        int i7 = 8;
        int c = xVar2.mo55054c(8);
        xVar2.mo55051b(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] b = m21402b();
        int[] c2 = m21405c();
        int[] d = m21406d();
        while (i9 > 0) {
            int c3 = xVar2.mo55054c(i7);
            int c4 = xVar2.mo55054c(i7);
            int i10 = i9 - 2;
            int[] iArr = (c4 & 128) != 0 ? b : (c4 & 64) != 0 ? c2 : d;
            if ((c4 & 1) != 0) {
                i5 = xVar2.mo55054c(i7);
                i4 = xVar2.mo55054c(i7);
                i3 = xVar2.mo55054c(i7);
                i2 = xVar2.mo55054c(i7);
                i6 = i10 - 4;
            } else {
                i3 = xVar2.mo55054c(4) << 4;
                i6 = i10 - 2;
                int c5 = xVar2.mo55054c(4) << 4;
                i2 = xVar2.mo55054c(i8) << 6;
                i5 = xVar2.mo55054c(6) << i8;
                i4 = c5;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            double d2 = (double) i5;
            double d3 = (double) (i4 - 128);
            double d4 = (double) (i3 - 128);
            iArr[c3] = m21391a((byte) (255 - (i2 & KotlinVersion.MAX_COMPONENT_VALUE)), C7728ai.m22180a((int) (d2 + (1.402d * d3)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE), C7728ai.m22180a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE), C7728ai.m22180a((int) (d2 + (d4 * 1.772d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE));
            i9 = i6;
            c = c;
            i7 = 8;
            i8 = 2;
        }
        return new C7558a(c, b, c2, d);
    }

    /* renamed from: c */
    private static int[] m21405c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m21391a(KotlinVersion.MAX_COMPONENT_VALUE, (i & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i & 4) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m21391a(KotlinVersion.MAX_COMPONENT_VALUE, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m21406d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                int i4 = (i & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m21391a(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m21391a(KotlinVersion.MAX_COMPONENT_VALUE, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m21391a(KotlinVersion.MAX_COMPONENT_VALUE, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m21391a(KotlinVersion.MAX_COMPONENT_VALUE, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m21391a(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public List<C7540a> mo54700a(byte[] bArr, int i) {
        int i2;
        SparseArray<C7564g> sparseArray;
        C7771x xVar = new C7771x(bArr, i);
        while (xVar.mo55042a() >= 48 && xVar.mo55054c(8) == 15) {
            m21396a(xVar, this.f17541i);
        }
        C7561d dVar = this.f17541i.f17588i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C7559b bVar = this.f17541i.f17587h != null ? this.f17541i.f17587h : this.f17539g;
        if (!(this.f17542j != null && bVar.f17547a + 1 == this.f17542j.getWidth() && bVar.f17548b + 1 == this.f17542j.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f17547a + 1, bVar.f17548b + 1, Bitmap.Config.ARGB_8888);
            this.f17542j = createBitmap;
            this.f17538f.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C7562e> sparseArray2 = dVar.f17560d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            this.f17538f.save();
            C7562e valueAt = sparseArray2.valueAt(i3);
            C7563f fVar = this.f17541i.f17582c.get(sparseArray2.keyAt(i3));
            int i4 = valueAt.f17561a + bVar.f17549c;
            int i5 = valueAt.f17562b + bVar.f17551e;
            this.f17538f.clipRect(i4, i5, Math.min(fVar.f17565c + i4, bVar.f17550d), Math.min(fVar.f17566d + i5, bVar.f17552f));
            C7558a aVar = this.f17541i.f17583d.get(fVar.f17569g);
            if (aVar == null && (aVar = this.f17541i.f17585f.get(fVar.f17569g)) == null) {
                aVar = this.f17540h;
            }
            SparseArray<C7564g> sparseArray3 = fVar.f17573k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                C7564g valueAt2 = sparseArray3.valueAt(i6);
                C7560c cVar = this.f17541i.f17584e.get(keyAt);
                C7560c cVar2 = cVar == null ? this.f17541i.f17586g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    m21395a(cVar2, aVar, fVar.f17568f, valueAt2.f17576c + i4, i5 + valueAt2.f17577d, cVar2.f17554b ? null : this.f17536d, this.f17538f);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f17564b) {
                this.f17537e.setColor(fVar.f17568f == 3 ? aVar.f17546d[fVar.f17570h] : fVar.f17568f == 2 ? aVar.f17545c[fVar.f17571i] : aVar.f17544b[fVar.f17572j]);
                this.f17538f.drawRect((float) i4, (float) i5, (float) (fVar.f17565c + i4), (float) (fVar.f17566d + i5), this.f17537e);
            }
            arrayList.add(new C7540a.C7542a().mo54641a(Bitmap.createBitmap(this.f17542j, i4, i5, fVar.f17565c, fVar.f17566d)).mo54638a(((float) i4) / ((float) bVar.f17547a)).mo54648b(0).mo54639a(((float) i5) / ((float) bVar.f17548b), 0).mo54640a(0).mo54646b(((float) fVar.f17565c) / ((float) bVar.f17547a)).mo54651c(((float) fVar.f17566d) / ((float) bVar.f17548b)).mo54656e());
            this.f17538f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f17538f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public void mo54701a() {
        this.f17541i.mo54703a();
    }
}
