package com.applovin.exoplayer2.p219j;

import android.util.Pair;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.C6830at;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7819p;
import com.applovin.exoplayer2.p206h.C7482ac;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7759u;

/* renamed from: com.applovin.exoplayer2.j.f */
public abstract class C7641f extends C7647j {

    /* renamed from: a */
    private C7642a f17923a;

    /* renamed from: com.applovin.exoplayer2.j.f$a */
    public static final class C7642a {

        /* renamed from: a */
        private final int f17924a;

        /* renamed from: b */
        private final String[] f17925b;

        /* renamed from: c */
        private final int[] f17926c;

        /* renamed from: d */
        private final C7483ad[] f17927d;

        /* renamed from: e */
        private final int[] f17928e;

        /* renamed from: f */
        private final int[][][] f17929f;

        /* renamed from: g */
        private final C7483ad f17930g;

        C7642a(String[] strArr, int[] iArr, C7483ad[] adVarArr, int[] iArr2, int[][][] iArr3, C7483ad adVar) {
            this.f17925b = strArr;
            this.f17926c = iArr;
            this.f17927d = adVarArr;
            this.f17929f = iArr3;
            this.f17928e = iArr2;
            this.f17930g = adVar;
            this.f17924a = iArr.length;
        }

        /* renamed from: a */
        public int mo54860a() {
            return this.f17924a;
        }

        /* renamed from: a */
        public int mo54861a(int i) {
            return this.f17926c[i];
        }

        /* renamed from: b */
        public C7483ad mo54862b(int i) {
            return this.f17927d[i];
        }
    }

    /* renamed from: a */
    private static int m21841a(C6829as[] asVarArr, C7482ac acVar, int[] iArr, boolean z) throws C7819p {
        int length = asVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < asVarArr.length; i2++) {
            C6829as asVar = asVarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < acVar.f17169a; i4++) {
                i3 = Math.max(i3, C6829as.CC.m17729c(asVar.mo52851a(acVar.mo54479a(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: a */
    private static int[] m21842a(C6829as asVar, C7482ac acVar) throws C7819p {
        int[] iArr = new int[acVar.f17169a];
        for (int i = 0; i < acVar.f17169a; i++) {
            iArr[i] = asVar.mo52851a(acVar.mo54479a(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m21843a(C6829as[] asVarArr) throws C7819p {
        int length = asVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = asVarArr[i].mo52852o();
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Pair<C6830at[], C7637d[]> mo54817a(C7642a aVar, int[][][] iArr, int[] iArr2, C7509p.C7510a aVar2, C6904ba baVar) throws C7819p;

    /* renamed from: a */
    public final C7649k mo54858a(C6829as[] asVarArr, C7483ad adVar, C7509p.C7510a aVar, C6904ba baVar) throws C7819p {
        C6829as[] asVarArr2 = asVarArr;
        C7483ad adVar2 = adVar;
        int[] iArr = new int[(asVarArr2.length + 1)];
        int length = asVarArr2.length + 1;
        C7482ac[][] acVarArr = new C7482ac[length][];
        int[][][] iArr2 = new int[(asVarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            acVarArr[i] = new C7482ac[adVar2.f17174b];
            iArr2[i] = new int[adVar2.f17174b][];
        }
        int[] a = m21843a(asVarArr);
        for (int i2 = 0; i2 < adVar2.f17174b; i2++) {
            C7482ac a2 = adVar2.mo54483a(i2);
            int a3 = m21841a(asVarArr, a2, iArr, C7759u.m22383e(a2.mo54479a(0).f18921l) == 5);
            int[] a4 = a3 == asVarArr2.length ? new int[a2.f17169a] : m21842a(asVarArr2[a3], a2);
            int i3 = iArr[a3];
            acVarArr[a3][i3] = a2;
            iArr2[a3][i3] = a4;
            iArr[a3] = iArr[a3] + 1;
        }
        C7483ad[] adVarArr = new C7483ad[asVarArr2.length];
        String[] strArr = new String[asVarArr2.length];
        int[] iArr3 = new int[asVarArr2.length];
        for (int i4 = 0; i4 < asVarArr2.length; i4++) {
            int i5 = iArr[i4];
            adVarArr[i4] = new C7483ad((C7482ac[]) C7728ai.m22221a((T[]) acVarArr[i4], i5));
            iArr2[i4] = (int[][]) C7728ai.m22221a((T[]) iArr2[i4], i5);
            strArr[i4] = asVarArr2[i4].mo52853y();
            iArr3[i4] = asVarArr2[i4].mo52850a();
        }
        C7642a aVar2 = new C7642a(strArr, iArr3, adVarArr, a, iArr2, new C7483ad((C7482ac[]) C7728ai.m22221a((T[]) acVarArr[asVarArr2.length], iArr[asVarArr2.length])));
        Pair<C6830at[], C7637d[]> a5 = mo54817a(aVar2, iArr2, a, aVar, baVar);
        return new C7649k((C6830at[]) a5.first, (C7637d[]) a5.second, aVar2);
    }

    /* renamed from: a */
    public final void mo54859a(Object obj) {
        this.f17923a = (C7642a) obj;
    }
}
