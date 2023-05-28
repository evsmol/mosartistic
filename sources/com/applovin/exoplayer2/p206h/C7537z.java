package com.applovin.exoplayer2.p206h;

import java.util.Arrays;
import java.util.Random;

/* renamed from: com.applovin.exoplayer2.h.z */
public interface C7537z {

    /* renamed from: com.applovin.exoplayer2.h.z$a */
    public static class C7538a implements C7537z {

        /* renamed from: a */
        private final Random f17396a;

        /* renamed from: b */
        private final int[] f17397b;

        /* renamed from: c */
        private final int[] f17398c;

        public C7538a(int i) {
            this(i, new Random());
        }

        private C7538a(int i, Random random) {
            this(m21224a(i, random), random);
        }

        private C7538a(int[] iArr, Random random) {
            this.f17397b = iArr;
            this.f17396a = random;
            this.f17398c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f17398c[iArr[i]] = i;
            }
        }

        /* renamed from: a */
        private static int[] m21224a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        /* renamed from: a */
        public int mo54616a() {
            return this.f17397b.length;
        }

        /* renamed from: a */
        public int mo54617a(int i) {
            int i2 = this.f17398c[i] + 1;
            int[] iArr = this.f17397b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: a */
        public C7537z mo54618a(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                iArr[i3] = this.f17396a.nextInt(this.f17397b.length + 1);
                int i4 = i3 + 1;
                int nextInt = this.f17396a.nextInt(i4);
                iArr2[i3] = iArr2[nextInt];
                iArr2[nextInt] = i3 + i;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f17397b.length + i2)];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f17397b.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr[i5]) {
                    int i8 = i6 + 1;
                    iArr3[i7] = this.f17397b[i6];
                    if (iArr3[i7] >= i) {
                        iArr3[i7] = iArr3[i7] + i2;
                    }
                    i6 = i8;
                } else {
                    iArr3[i7] = iArr2[i5];
                    i5++;
                }
            }
            return new C7538a(iArr3, new Random(this.f17396a.nextLong()));
        }

        /* renamed from: b */
        public int mo54619b() {
            int[] iArr = this.f17397b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: b */
        public int mo54620b(int i) {
            int i2 = this.f17398c[i] - 1;
            if (i2 >= 0) {
                return this.f17397b[i2];
            }
            return -1;
        }

        /* renamed from: b */
        public C7537z mo54621b(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[(this.f17397b.length - i3)];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f17397b;
                if (i4 >= iArr2.length) {
                    return new C7538a(iArr, new Random(this.f17396a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    int i6 = i4 - i5;
                    int[] iArr3 = this.f17397b;
                    iArr[i6] = iArr3[i4] >= i ? iArr3[i4] - i3 : iArr3[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        /* renamed from: c */
        public int mo54622c() {
            int[] iArr = this.f17397b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: d */
        public C7537z mo54623d() {
            return new C7538a(0, new Random(this.f17396a.nextLong()));
        }
    }

    /* renamed from: a */
    int mo54616a();

    /* renamed from: a */
    int mo54617a(int i);

    /* renamed from: a */
    C7537z mo54618a(int i, int i2);

    /* renamed from: b */
    int mo54619b();

    /* renamed from: b */
    int mo54620b(int i);

    /* renamed from: b */
    C7537z mo54621b(int i, int i2);

    /* renamed from: c */
    int mo54622c();

    /* renamed from: d */
    C7537z mo54623d();
}
