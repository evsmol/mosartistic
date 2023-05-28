package com.applovin.exoplayer2.p186e.p190d;

import com.applovin.exoplayer2.p198g.p204f.C7452b;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.d.b */
final class C7204b {

    /* renamed from: a */
    public final long f15891a;

    /* renamed from: b */
    public final List<C7205a> f15892b;

    /* renamed from: com.applovin.exoplayer2.e.d.b$a */
    public static final class C7205a {

        /* renamed from: a */
        public final String f15893a;

        /* renamed from: b */
        public final String f15894b;

        /* renamed from: c */
        public final long f15895c;

        /* renamed from: d */
        public final long f15896d;

        public C7205a(String str, String str2, long j, long j2) {
            this.f15893a = str;
            this.f15894b = str2;
            this.f15895c = j;
            this.f15896d = j2;
        }
    }

    public C7204b(long j, List<C7205a> list) {
        this.f15891a = j;
        this.f15892b = list;
    }

    /* renamed from: a */
    public C7452b mo53890a(long j) {
        long j2;
        if (this.f15892b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f15892b.size() - 1; size >= 0; size--) {
            C7205a aVar = this.f15892b.get(size);
            boolean equals = "video/mp4".equals(aVar.f15893a) | z;
            if (size == 0) {
                j2 = j3 - aVar.f15896d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.f15895c;
                j2 = j8;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C7452b(j4, j5, this.f15891a, j6, j7);
    }
}
