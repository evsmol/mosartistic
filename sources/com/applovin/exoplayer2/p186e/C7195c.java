package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.c */
public final class C7195c implements C7353v {

    /* renamed from: a */
    public final int f15837a;

    /* renamed from: b */
    public final int[] f15838b;

    /* renamed from: c */
    public final long[] f15839c;

    /* renamed from: d */
    public final long[] f15840d;

    /* renamed from: e */
    public final long[] f15841e;

    /* renamed from: f */
    private final long f15842f;

    public C7195c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f15838b = iArr;
        this.f15839c = jArr;
        this.f15840d = jArr2;
        this.f15841e = jArr3;
        int length = iArr.length;
        this.f15837a = length;
        if (length > 0) {
            this.f15842f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f15842f = 0;
        }
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        int b = mo53881b(j);
        C7356w wVar = new C7356w(this.f15841e[b], this.f15839c[b]);
        if (wVar.f16780b >= j || b == this.f15837a - 1) {
            return new C7353v.C7354a(wVar);
        }
        int i = b + 1;
        return new C7353v.C7354a(wVar, new C7356w(this.f15841e[i], this.f15839c[i]));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public int mo53881b(long j) {
        return C7728ai.m22189a(this.f15841e, j, true, true);
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f15842f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f15837a + ", sizes=" + Arrays.toString(this.f15838b) + ", offsets=" + Arrays.toString(this.f15839c) + ", timeUs=" + Arrays.toString(this.f15841e) + ", durationsUs=" + Arrays.toString(this.f15840d) + ")";
    }
}
