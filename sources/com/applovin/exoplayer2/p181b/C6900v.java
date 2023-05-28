package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p221l.C7717a;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.b.v */
final class C6900v {

    /* renamed from: a */
    private final int f15209a;

    /* renamed from: b */
    private final int f15210b;

    /* renamed from: c */
    private final float f15211c;

    /* renamed from: d */
    private final float f15212d;

    /* renamed from: e */
    private final float f15213e;

    /* renamed from: f */
    private final int f15214f;

    /* renamed from: g */
    private final int f15215g;

    /* renamed from: h */
    private final int f15216h;

    /* renamed from: i */
    private final short[] f15217i;

    /* renamed from: j */
    private short[] f15218j;

    /* renamed from: k */
    private int f15219k;

    /* renamed from: l */
    private short[] f15220l;

    /* renamed from: m */
    private int f15221m;

    /* renamed from: n */
    private short[] f15222n;

    /* renamed from: o */
    private int f15223o;

    /* renamed from: p */
    private int f15224p;

    /* renamed from: q */
    private int f15225q;

    /* renamed from: r */
    private int f15226r;

    /* renamed from: s */
    private int f15227s;

    /* renamed from: t */
    private int f15228t;

    /* renamed from: u */
    private int f15229u;

    /* renamed from: v */
    private int f15230v;

    public C6900v(int i, int i2, float f, float f2, int i3) {
        this.f15209a = i;
        this.f15210b = i2;
        this.f15211c = f;
        this.f15212d = f2;
        this.f15213e = ((float) i) / ((float) i3);
        this.f15214f = i / 400;
        int i4 = i / 65;
        this.f15215g = i4;
        int i5 = i4 * 2;
        this.f15216h = i5;
        this.f15217i = new short[i5];
        this.f15218j = new short[(i5 * i2)];
        this.f15220l = new short[(i5 * i2)];
        this.f15222n = new short[(i5 * i2)];
    }

    /* renamed from: a */
    private int m18289a(short[] sArr, int i) {
        int i2;
        int i3 = this.f15209a;
        int i4 = i3 > 4000 ? i3 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
        if (this.f15210b == 1 && i4 == 1) {
            i2 = m18291a(sArr, i, this.f15214f, this.f15215g);
        } else {
            m18303c(sArr, i, i4);
            int a = m18291a(this.f15217i, 0, this.f15214f / i4, this.f15215g / i4);
            if (i4 != 1) {
                int i5 = a * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f15214f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f15215g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f15210b == 1) {
                    i2 = m18291a(sArr, i, i7, i8);
                } else {
                    m18303c(sArr, i, 1);
                    i2 = m18291a(this.f15217i, 0, i7, i8);
                }
            } else {
                i2 = a;
            }
        }
        int i11 = m18296a(this.f15229u, this.f15230v) ? this.f15227s : i2;
        this.f15228t = this.f15229u;
        this.f15227s = i2;
        return i11;
    }

    /* renamed from: a */
    private int m18290a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f15226r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] a = m18297a(this.f15220l, this.f15221m, i3);
        this.f15220l = a;
        m18295a(i3, this.f15210b, a, this.f15221m, sArr, i, sArr, i + i2);
        this.f15221m += i3;
        return i3;
    }

    /* renamed from: a */
    private int m18291a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f15210b;
        int i5 = 1;
        int i6 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f15229u = i5 / i7;
        this.f15230v = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    private void m18292a(float f) {
        int a;
        int i = this.f15219k;
        if (i >= this.f15216h) {
            int i2 = 0;
            do {
                if (this.f15226r > 0) {
                    a = m18298b(i2);
                } else {
                    int a2 = m18289a(this.f15218j, i2);
                    int i3 = (((double) f) > 1.0d ? 1 : (((double) f) == 1.0d ? 0 : -1));
                    short[] sArr = this.f15218j;
                    a = i3 > 0 ? a2 + m18290a(sArr, i2, f, a2) : m18299b(sArr, i2, f, a2);
                }
                i2 += a;
            } while (this.f15216h + i2 <= i);
            m18294a(i2);
        }
    }

    /* renamed from: a */
    private void m18293a(float f, int i) {
        int i2;
        int i3;
        if (this.f15221m != i) {
            int i4 = this.f15209a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m18302c(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f15223o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f15224p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f15225q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f15220l = m18297a(this.f15220l, this.f15221m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f15210b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f15220l[(this.f15221m * i10) + i9] = m18300b(this.f15222n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f15225q++;
                        this.f15221m++;
                    }
                    int i11 = i2 + 1;
                    this.f15224p = i11;
                    if (i11 == i4) {
                        this.f15224p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C7717a.m22121b(z);
                        this.f15225q = 0;
                    }
                    i6++;
                } else {
                    m18304d(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m18294a(int i) {
        int i2 = this.f15219k - i;
        short[] sArr = this.f15218j;
        int i3 = this.f15210b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f15219k = i2;
    }

    /* renamed from: a */
    private static void m18295a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    private boolean m18296a(int i, int i2) {
        return i != 0 && this.f15227s != 0 && i2 <= i * 3 && i * 2 > this.f15228t * 3;
    }

    /* renamed from: a */
    private short[] m18297a(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f15210b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: b */
    private int m18298b(int i) {
        int min = Math.min(this.f15216h, this.f15226r);
        m18301b(this.f15218j, i, min);
        this.f15226r -= min;
        return min;
    }

    /* renamed from: b */
    private int m18299b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f15226r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] a = m18297a(this.f15220l, this.f15221m, i4);
        this.f15220l = a;
        int i5 = this.f15210b;
        System.arraycopy(sArr, i * i5, a, this.f15221m * i5, i5 * i2);
        m18295a(i3, this.f15210b, this.f15220l, this.f15221m + i2, sArr, i + i2, sArr, i);
        this.f15221m += i4;
        return i3;
    }

    /* renamed from: b */
    private short m18300b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f15210b];
        int i4 = this.f15225q * i2;
        int i5 = this.f15224p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: b */
    private void m18301b(short[] sArr, int i, int i2) {
        short[] a = m18297a(this.f15220l, this.f15221m, i2);
        this.f15220l = a;
        int i3 = this.f15210b;
        System.arraycopy(sArr, i * i3, a, this.f15221m * i3, i3 * i2);
        this.f15221m += i2;
    }

    /* renamed from: c */
    private void m18302c(int i) {
        int i2 = this.f15221m - i;
        short[] a = m18297a(this.f15222n, this.f15223o, i2);
        this.f15222n = a;
        short[] sArr = this.f15220l;
        int i3 = this.f15210b;
        System.arraycopy(sArr, i * i3, a, this.f15223o * i3, i3 * i2);
        this.f15221m = i;
        this.f15223o += i2;
    }

    /* renamed from: c */
    private void m18303c(short[] sArr, int i, int i2) {
        int i3 = this.f15216h / i2;
        int i4 = this.f15210b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f15217i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: d */
    private void m18304d(int i) {
        if (i != 0) {
            short[] sArr = this.f15222n;
            int i2 = this.f15210b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f15223o - i) * i2);
            this.f15223o -= i;
        }
    }

    /* renamed from: e */
    private void m18305e() {
        int i = this.f15221m;
        float f = this.f15211c;
        float f2 = this.f15212d;
        float f3 = f / f2;
        float f4 = this.f15213e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            m18292a(f3);
        } else {
            m18301b(this.f15218j, 0, this.f15219k);
            this.f15219k = 0;
        }
        if (f4 != 1.0f) {
            m18293a(f4, i);
        }
    }

    /* renamed from: a */
    public int mo53063a() {
        return this.f15219k * this.f15210b * 2;
    }

    /* renamed from: a */
    public void mo53064a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f15210b;
        int i2 = remaining / i;
        short[] a = m18297a(this.f15218j, this.f15219k, i2);
        this.f15218j = a;
        shortBuffer.get(a, this.f15219k * this.f15210b, ((i * i2) * 2) / 2);
        this.f15219k += i2;
        m18305e();
    }

    /* renamed from: b */
    public void mo53065b() {
        int i;
        int i2 = this.f15219k;
        float f = this.f15211c;
        float f2 = this.f15212d;
        int i3 = this.f15221m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f15223o)) / (this.f15213e * f2)) + 0.5f));
        this.f15218j = m18297a(this.f15218j, i2, (this.f15216h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f15216h;
            int i5 = this.f15210b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f15218j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f15219k += i * 2;
        m18305e();
        if (this.f15221m > i3) {
            this.f15221m = i3;
        }
        this.f15219k = 0;
        this.f15226r = 0;
        this.f15223o = 0;
    }

    /* renamed from: b */
    public void mo53066b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f15210b, this.f15221m);
        shortBuffer.put(this.f15220l, 0, this.f15210b * min);
        int i = this.f15221m - min;
        this.f15221m = i;
        short[] sArr = this.f15220l;
        int i2 = this.f15210b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public void mo53067c() {
        this.f15219k = 0;
        this.f15221m = 0;
        this.f15223o = 0;
        this.f15224p = 0;
        this.f15225q = 0;
        this.f15226r = 0;
        this.f15227s = 0;
        this.f15228t = 0;
        this.f15229u = 0;
        this.f15230v = 0;
    }

    /* renamed from: d */
    public int mo53068d() {
        return this.f15221m * this.f15210b * 2;
    }
}
