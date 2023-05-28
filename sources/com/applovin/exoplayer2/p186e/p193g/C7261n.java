package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.g.n */
final class C7261n {

    /* renamed from: a */
    public final C7258k f16267a;

    /* renamed from: b */
    public final int f16268b;

    /* renamed from: c */
    public final long[] f16269c;

    /* renamed from: d */
    public final int[] f16270d;

    /* renamed from: e */
    public final int f16271e;

    /* renamed from: f */
    public final long[] f16272f;

    /* renamed from: g */
    public final int[] f16273g;

    /* renamed from: h */
    public final long f16274h;

    public C7261n(C7258k kVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C7717a.m22118a(iArr.length == jArr2.length);
        C7717a.m22118a(jArr.length == jArr2.length);
        C7717a.m22118a(iArr2.length == jArr2.length ? true : z);
        this.f16267a = kVar;
        this.f16269c = jArr;
        this.f16270d = iArr;
        this.f16271e = i;
        this.f16272f = jArr2;
        this.f16273g = iArr2;
        this.f16274h = j;
        this.f16268b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo53986a(long j) {
        for (int a = C7728ai.m22189a(this.f16272f, j, true, false); a >= 0; a--) {
            if ((this.f16273g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo53987b(long j) {
        for (int b = C7728ai.m22228b(this.f16272f, j, true, false); b < this.f16272f.length; b++) {
            if ((this.f16273g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
