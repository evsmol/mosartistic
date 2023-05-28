package com.applovin.exoplayer2.p222m.p223a;

import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p222m.p223a.C7782e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* renamed from: com.applovin.exoplayer2.m.a.f */
final class C7785f {
    /* renamed from: a */
    private static int m22526a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* renamed from: a */
    public static C7782e m22527a(byte[] bArr, int i) {
        ArrayList<C7782e.C7783a> arrayList;
        C7772y yVar = new C7772y(bArr);
        try {
            arrayList = m22528a(yVar) ? m22529b(yVar) : m22530c(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new C7782e(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new C7782e(arrayList.get(0), arrayList.get(1), i);
    }

    /* renamed from: a */
    private static boolean m22528a(C7772y yVar) {
        yVar.mo55079e(4);
        int q = yVar.mo55093q();
        yVar.mo55076d(0);
        return q == 1886547818;
    }

    /* renamed from: b */
    private static ArrayList<C7782e.C7783a> m22529b(C7772y yVar) {
        int q;
        yVar.mo55079e(8);
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        while (c < b && (q = yVar.mo55093q() + c) > c && q <= b) {
            int q2 = yVar.mo55093q();
            if (q2 == 2037673328 || q2 == 1836279920) {
                yVar.mo55075c(q);
                return m22530c(yVar);
            }
            yVar.mo55076d(q);
            c = q;
        }
        return null;
    }

    /* renamed from: c */
    private static ArrayList<C7782e.C7783a> m22530c(C7772y yVar) {
        if (yVar.mo55084h() != 0) {
            return null;
        }
        yVar.mo55079e(7);
        int q = yVar.mo55093q();
        if (q == 1684433976) {
            C7772y yVar2 = new C7772y();
            Inflater inflater = new Inflater(true);
            try {
                if (!C7728ai.m22217a(yVar, yVar2, inflater)) {
                    return null;
                }
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (q != 1918990112) {
            return null;
        }
        return m22531d(yVar);
    }

    /* renamed from: d */
    private static ArrayList<C7782e.C7783a> m22531d(C7772y yVar) {
        ArrayList<C7782e.C7783a> arrayList = new ArrayList<>();
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        while (c < b) {
            int q = yVar.mo55093q() + c;
            if (q <= c || q > b) {
                return null;
            }
            if (yVar.mo55093q() == 1835365224) {
                C7782e.C7783a e = m22532e(yVar);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            yVar.mo55076d(q);
            c = q;
        }
        return arrayList;
    }

    /* renamed from: e */
    private static C7782e.C7783a m22532e(C7772y yVar) {
        int q = yVar.mo55093q();
        if (q > 10000) {
            return null;
        }
        float[] fArr = new float[q];
        for (int i = 0; i < q; i++) {
            fArr[i] = yVar.mo55102z();
        }
        int q2 = yVar.mo55093q();
        if (q2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) q) * 2.0d) / log);
        C7771x xVar = new C7771x(yVar.mo55077d());
        int i2 = 8;
        xVar.mo55044a(yVar.mo55074c() * 8);
        float[] fArr2 = new float[(q2 * 5)];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < q2) {
            int i6 = 0;
            while (i6 < i3) {
                int a = iArr[i6] + m22526a(xVar.mo55054c(ceil));
                if (a >= q || a < 0) {
                    return null;
                }
                fArr2[i5] = fArr[a];
                iArr[i6] = a;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xVar.mo55044a((xVar.mo55050b() + 7) & -8);
        int i7 = 32;
        int c = xVar.mo55054c(32);
        C7782e.C7784b[] bVarArr = new C7782e.C7784b[c];
        int i8 = 0;
        while (i8 < c) {
            int c2 = xVar.mo55054c(i2);
            int c3 = xVar.mo55054c(i2);
            int c4 = xVar.mo55054c(i7);
            if (c4 > 128000) {
                return null;
            }
            int i9 = c2;
            int ceil2 = (int) Math.ceil(Math.log(((double) q2) * d) / log);
            float[] fArr3 = new float[(c4 * 3)];
            float[] fArr4 = new float[(c4 * 2)];
            int i10 = 0;
            for (int i11 = 0; i11 < c4; i11++) {
                i10 += m22526a(xVar.mo55054c(ceil2));
                if (i10 < 0 || i10 >= q2) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = i10 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            bVarArr[i8] = new C7782e.C7784b(i9, fArr3, fArr4, c3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new C7782e.C7783a(bVarArr);
    }
}
