package com.applovin.exoplayer2.p219j;

import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.common.p183a.C6942ad;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p183a.C7053z;
import com.applovin.exoplayer2.p206h.C7482ac;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.p208b.C7487b;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p220k.C7660d;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7755q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.j.a */
public class C7624a extends C7627b {

    /* renamed from: d */
    private final C7660d f17819d;

    /* renamed from: e */
    private final long f17820e;

    /* renamed from: f */
    private final long f17821f;

    /* renamed from: g */
    private final long f17822g;

    /* renamed from: h */
    private final float f17823h;

    /* renamed from: i */
    private final float f17824i;

    /* renamed from: j */
    private final C7033s<C7625a> f17825j;

    /* renamed from: k */
    private final C7732d f17826k;

    /* renamed from: l */
    private float f17827l;

    /* renamed from: m */
    private int f17828m;

    /* renamed from: n */
    private int f17829n;

    /* renamed from: o */
    private long f17830o;

    /* renamed from: p */
    private C7487b f17831p;

    /* renamed from: com.applovin.exoplayer2.j.a$a */
    public static final class C7625a {

        /* renamed from: a */
        public final long f17832a;

        /* renamed from: b */
        public final long f17833b;

        public C7625a(long j, long j2) {
            this.f17832a = j;
            this.f17833b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7625a)) {
                return false;
            }
            C7625a aVar = (C7625a) obj;
            return this.f17832a == aVar.f17832a && this.f17833b == aVar.f17833b;
        }

        public int hashCode() {
            return (((int) this.f17832a) * 31) + ((int) this.f17833b);
        }
    }

    /* renamed from: com.applovin.exoplayer2.j.a$b */
    public static class C7626b implements C7637d.C7639b {

        /* renamed from: a */
        private final int f17834a;

        /* renamed from: b */
        private final int f17835b;

        /* renamed from: c */
        private final int f17836c;

        /* renamed from: d */
        private final float f17837d;

        /* renamed from: e */
        private final float f17838e;

        /* renamed from: f */
        private final C7732d f17839f;

        public C7626b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, C7732d.f18265a);
        }

        public C7626b(int i, int i2, int i3, float f, float f2, C7732d dVar) {
            this.f17834a = i;
            this.f17835b = i2;
            this.f17836c = i3;
            this.f17837d = f;
            this.f17838e = f2;
            this.f17839f = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7624a mo54804a(C7482ac acVar, int[] iArr, int i, C7660d dVar, C7033s<C7625a> sVar) {
            return new C7624a(acVar, iArr, i, dVar, (long) this.f17834a, (long) this.f17835b, (long) this.f17836c, this.f17837d, this.f17838e, sVar, this.f17839f);
        }

        /* renamed from: a */
        public final C7637d[] mo54805a(C7637d.C7638a[] aVarArr, C7660d dVar, C7509p.C7510a aVar, C6904ba baVar) {
            C7637d dVar2;
            C7637d.C7638a[] aVarArr2 = aVarArr;
            C7033s a = C7624a.m21733b(aVarArr);
            C7637d[] dVarArr = new C7637d[aVarArr2.length];
            for (int i = 0; i < aVarArr2.length; i++) {
                C7637d.C7638a aVar2 = aVarArr2[i];
                if (!(aVar2 == null || aVar2.f17919b.length == 0)) {
                    if (aVar2.f17919b.length == 1) {
                        dVar2 = new C7640e(aVar2.f17918a, aVar2.f17919b[0], aVar2.f17920c);
                    } else {
                        dVar2 = mo54804a(aVar2.f17918a, aVar2.f17919b, aVar2.f17920c, dVar, (C7033s) a.get(i));
                    }
                    dVarArr[i] = dVar2;
                }
            }
            return dVarArr;
        }
    }

    protected C7624a(C7482ac acVar, int[] iArr, int i, C7660d dVar, long j, long j2, long j3, float f, float f2, List<C7625a> list, C7732d dVar2) {
        super(acVar, iArr, i);
        if (j3 < j) {
            C7755q.m22361c("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f17819d = dVar;
        this.f17820e = j * 1000;
        this.f17821f = j2 * 1000;
        this.f17822g = j3 * 1000;
        this.f17823h = f;
        this.f17824i = f2;
        this.f17825j = C7033s.m18797a(list);
        this.f17826k = dVar2;
        this.f17827l = 1.0f;
        this.f17829n = 0;
        this.f17830o = -9223372036854775807L;
    }

    /* renamed from: a */
    private static C7033s<Integer> m21731a(long[][] jArr) {
        long[][] jArr2 = jArr;
        C7053z<K, V> b = C6942ad.m18519a().mo53213b().mo53211b();
        for (int i = 0; i < jArr2.length; i++) {
            if (jArr2[i].length > 1) {
                int length = jArr2[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double d = 0.0d;
                    if (i2 >= jArr2[i].length) {
                        break;
                    }
                    if (jArr2[i][i2] != -1) {
                        d = Math.log((double) jArr2[i][i2]);
                    }
                    dArr[i2] = d;
                    i2++;
                }
                int i3 = length - 1;
                double d2 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d3 = dArr[i4];
                    i4++;
                    b.mo53201a(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i4]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i));
                }
            }
        }
        return C7033s.m18797a(b.mo53208h());
    }

    /* renamed from: a */
    private static void m21732a(List<C7033s.C7034a<C7625a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C7033s.C7034a aVar = list.get(i);
            if (aVar != null) {
                aVar.mo53515a(new C7625a(j, jArr[i]));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C7033s<C7033s<C7625a>> m21733b(C7637d.C7638a[] aVarArr) {
        C7033s.C7034a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i] == null || aVarArr[i].f17919b.length <= 1) {
                aVar = null;
            } else {
                aVar = C7033s.m18804i();
                aVar.mo53515a(new C7625a(0, 0));
            }
            arrayList.add(aVar);
        }
        long[][] c = m21734c(aVarArr);
        int[] iArr = new int[c.length];
        long[] jArr = new long[c.length];
        for (int i2 = 0; i2 < c.length; i2++) {
            jArr[i2] = c[i2].length == 0 ? 0 : c[i2][0];
        }
        m21732a(arrayList, jArr);
        C7033s<Integer> a = m21731a(c);
        for (int i3 = 0; i3 < a.size(); i3++) {
            int intValue = ((Integer) a.get(i3)).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = c[intValue][i4];
            m21732a(arrayList, jArr);
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        m21732a(arrayList, jArr);
        C7033s.C7034a i6 = C7033s.m18804i();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C7033s.C7034a aVar2 = (C7033s.C7034a) arrayList.get(i7);
            i6.mo53515a(aVar2 == null ? C7033s.m18803g() : aVar2.mo53531a());
        }
        return i6.mo53531a();
    }

    /* renamed from: c */
    private static long[][] m21734c(C7637d.C7638a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            C7637d.C7638a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f17919b.length];
                for (int i2 = 0; i2 < aVar.f17919b.length; i2++) {
                    jArr[i][i2] = (long) aVar.f17918a.mo54479a(aVar.f17919b[i2]).f18917h;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: a */
    public void mo54798a() {
        this.f17830o = -9223372036854775807L;
        this.f17831p = null;
    }

    /* renamed from: a */
    public void mo54799a(float f) {
        this.f17827l = f;
    }

    /* renamed from: b */
    public void mo54800b() {
        this.f17831p = null;
    }

    /* renamed from: c */
    public int mo54801c() {
        return this.f17828m;
    }
}
