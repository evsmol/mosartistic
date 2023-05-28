package com.applovin.exoplayer2.p186e.p188b;

import com.applovin.exoplayer2.p186e.C7182a;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7341m;
import com.applovin.exoplayer2.p186e.C7346p;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.b.a */
final class C7191a extends C7182a {

    /* renamed from: com.applovin.exoplayer2.e.b.a$a */
    private static final class C7193a implements C7182a.C7188f {

        /* renamed from: a */
        private final C7346p f15819a;

        /* renamed from: b */
        private final int f15820b;

        /* renamed from: c */
        private final C7341m.C7342a f15821c;

        private C7193a(C7346p pVar, int i) {
            this.f15819a = pVar;
            this.f15820b = i;
            this.f15821c = new C7341m.C7342a();
        }

        /* renamed from: a */
        private long m19345a(C7279i iVar) throws IOException {
            while (iVar.mo53891b() < iVar.mo53893d() - 6 && !C7341m.m20229a(iVar, this.f15819a, this.f15820b, this.f15821c)) {
                iVar.mo53907c(1);
            }
            if (iVar.mo53891b() < iVar.mo53893d() - 6) {
                return this.f15821c.f16747a;
            }
            iVar.mo53907c((int) (iVar.mo53893d() - iVar.mo53891b()));
            return this.f15819a.f16760j;
        }

        /* renamed from: a */
        public C7182a.C7187e mo53874a(C7279i iVar, long j) throws IOException {
            long c = iVar.mo53892c();
            long a = m19345a(iVar);
            long b = iVar.mo53891b();
            iVar.mo53907c(Math.max(6, this.f15819a.f16753c));
            long a2 = m19345a(iVar);
            return (a > j || a2 <= j) ? a2 <= j ? C7182a.C7187e.m19317b(a2, iVar.mo53891b()) : C7182a.C7187e.m19315a(a, c) : C7182a.C7187e.m19314a(b);
        }

        /* renamed from: a */
        public /* synthetic */ void mo53875a() {
            C7182a.C7188f.CC.$default$a(this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7191a(com.applovin.exoplayer2.p186e.C7346p r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            com.applovin.exoplayer2.e.b.-$$Lambda$j8d1aKHw5rH2C1JuYHZWhX0kWts r1 = new com.applovin.exoplayer2.e.b.-$$Lambda$j8d1aKHw5rH2C1JuYHZWhX0kWts
            r1.<init>()
            com.applovin.exoplayer2.e.b.a$a r2 = new com.applovin.exoplayer2.e.b.a$a
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.mo54076a()
            long r7 = r0.f16760j
            long r13 = r17.mo54082b()
            int r0 = r0.f16753c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p188b.C7191a.<init>(com.applovin.exoplayer2.e.p, int, long, long):void");
    }
}
