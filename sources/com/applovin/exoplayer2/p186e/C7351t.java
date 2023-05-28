package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.t */
public final class C7351t implements C7353v {

    /* renamed from: a */
    private final long[] f16770a;

    /* renamed from: b */
    private final long[] f16771b;

    /* renamed from: c */
    private final long f16772c;

    /* renamed from: d */
    private final boolean f16773d;

    public C7351t(long[] jArr, long[] jArr2, long j) {
        C7717a.m22118a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f16773d = z;
        if (!z || jArr2[0] <= 0) {
            this.f16770a = jArr;
            this.f16771b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f16770a = jArr3;
            this.f16771b = new long[i];
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, this.f16771b, 1, length);
        }
        this.f16772c = j;
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        if (!this.f16773d) {
            return new C7353v.C7354a(C7356w.f16779a);
        }
        int a = C7728ai.m22189a(this.f16771b, j, true, true);
        C7356w wVar = new C7356w(this.f16771b[a], this.f16770a[a]);
        if (wVar.f16780b != j) {
            long[] jArr = this.f16771b;
            if (a != jArr.length - 1) {
                int i = a + 1;
                return new C7353v.C7354a(wVar, new C7356w(jArr[i], this.f16770a[i]));
            }
        }
        return new C7353v.C7354a(wVar);
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return this.f16773d;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16772c;
    }
}
