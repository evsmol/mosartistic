package com.applovin.exoplayer2.p222m.p223a;

import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.m.a.e */
final class C7782e {

    /* renamed from: a */
    public final C7783a f18377a;

    /* renamed from: b */
    public final C7783a f18378b;

    /* renamed from: c */
    public final int f18379c;

    /* renamed from: d */
    public final boolean f18380d;

    /* renamed from: com.applovin.exoplayer2.m.a.e$a */
    public static final class C7783a {

        /* renamed from: a */
        private final C7784b[] f18381a;

        public C7783a(C7784b... bVarArr) {
            this.f18381a = bVarArr;
        }

        /* renamed from: a */
        public int mo55136a() {
            return this.f18381a.length;
        }

        /* renamed from: a */
        public C7784b mo55137a(int i) {
            return this.f18381a[i];
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.a.e$b */
    public static final class C7784b {

        /* renamed from: a */
        public final int f18382a;

        /* renamed from: b */
        public final int f18383b;

        /* renamed from: c */
        public final float[] f18384c;

        /* renamed from: d */
        public final float[] f18385d;

        public C7784b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f18382a = i;
            C7717a.m22118a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f18384c = fArr;
            this.f18385d = fArr2;
            this.f18383b = i2;
        }
    }

    public C7782e(C7783a aVar, int i) {
        this(aVar, aVar, i);
    }

    public C7782e(C7783a aVar, C7783a aVar2, int i) {
        this.f18377a = aVar;
        this.f18378b = aVar2;
        this.f18379c = i;
        this.f18380d = aVar == aVar2;
    }

    /* renamed from: a */
    public static C7782e m22522a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        float[] fArr;
        int i5;
        int i6;
        int i7;
        float f5 = f;
        int i8 = i;
        int i9 = i2;
        float f6 = f2;
        float f7 = f3;
        C7717a.m22118a(f5 > 0.0f);
        C7717a.m22118a(i8 >= 1);
        C7717a.m22118a(i9 >= 1);
        C7717a.m22118a(f6 > 0.0f && f6 <= 180.0f);
        C7717a.m22118a(f7 > 0.0f && f7 <= 360.0f);
        float radians = (float) Math.toRadians((double) f6);
        float radians2 = (float) Math.toRadians((double) f7);
        float f8 = radians / ((float) i8);
        float f9 = radians2 / ((float) i9);
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[(i11 * 3)];
        float[] fArr3 = new float[(i11 * 2)];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f10 = radians / 2.0f;
            float f11 = (((float) i12) * f8) - f10;
            int i15 = i12 + 1;
            float f12 = (((float) i15) * f8) - f10;
            int i16 = 0;
            while (i16 < i10) {
                float f13 = f11;
                int i17 = i15;
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == 0) {
                        f4 = f13;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f12;
                    }
                    float f14 = ((float) i16) * f9;
                    float f15 = f9;
                    int i19 = i13 + 1;
                    int i20 = i16;
                    double d = (double) f5;
                    float f16 = f8;
                    int i21 = i18;
                    double d2 = (double) ((f14 + 3.1415927f) - (radians2 / 2.0f));
                    double d3 = (double) f4;
                    float[] fArr4 = fArr3;
                    float f17 = f12;
                    fArr2[i13] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i22 = i19 + 1;
                    int i23 = i12;
                    fArr2[i19] = (float) (d * Math.sin(d3));
                    int i24 = i22 + 1;
                    fArr2[i22] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i25 = i14 + 1;
                    fArr4[i14] = f14 / radians2;
                    int i26 = i25 + 1;
                    fArr4[i25] = (((float) (i23 + i21)) * f16) / radians;
                    if (i20 == 0 && i21 == 0) {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                    } else {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                        if (!(i6 == i7 && i5 == 1)) {
                            fArr = fArr4;
                            i14 = i26;
                            i13 = i24;
                            i18 = i5 + 1;
                            i9 = i7;
                            i16 = i6;
                            fArr3 = fArr;
                            i12 = i23;
                            i10 = i4;
                            f9 = f15;
                            f8 = f16;
                            f12 = f17;
                        }
                    }
                    System.arraycopy(fArr2, i24 - 3, fArr2, i24, 3);
                    i24 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i26 - 2, fArr, i26, 2);
                    i26 += 2;
                    i14 = i26;
                    i13 = i24;
                    i18 = i5 + 1;
                    i9 = i7;
                    i16 = i6;
                    fArr3 = fArr;
                    i12 = i23;
                    i10 = i4;
                    f9 = f15;
                    f8 = f16;
                    f12 = f17;
                }
                float f18 = f8;
                float f19 = f9;
                float[] fArr5 = fArr3;
                float f20 = f12;
                int i27 = i12;
                int i28 = i16;
                int i29 = i9;
                int i30 = i28 + 1;
                f11 = f13;
                i15 = i17;
                i10 = i10;
                f9 = f19;
                f8 = f18;
                f12 = f20;
                int i31 = i30;
                i9 = i29;
                i16 = i31;
            }
            i8 = i;
            i12 = i15;
        }
        return new C7782e(new C7783a(new C7784b(0, fArr2, fArr3, 1)), i3);
    }

    /* renamed from: a */
    public static C7782e m22523a(int i) {
        return m22522a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
