package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7182a;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.aa */
final class C7281aa extends C7182a {

    /* renamed from: com.applovin.exoplayer2.e.i.aa$a */
    private static final class C7282a implements C7182a.C7188f {

        /* renamed from: a */
        private final C7726ag f16345a;

        /* renamed from: b */
        private final C7772y f16346b = new C7772y();

        /* renamed from: c */
        private final int f16347c;

        /* renamed from: d */
        private final int f16348d;

        public C7282a(int i, C7726ag agVar, int i2) {
            this.f16347c = i;
            this.f16345a = agVar;
            this.f16348d = i2;
        }

        /* renamed from: a */
        private C7182a.C7187e m19902a(C7772y yVar, long j, long j2) {
            int a;
            int i;
            C7772y yVar2 = yVar;
            long j3 = j2;
            int b = yVar.mo55072b();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (yVar.mo55064a() >= 188 && (i = a + 188) <= b) {
                long a2 = C7292ae.m19955a(yVar2, (a = C7292ae.m19954a(yVar.mo55077d(), yVar.mo55074c(), b)), this.f16347c);
                if (a2 != -9223372036854775807L) {
                    long b2 = this.f16345a.mo54989b(a2);
                    if (b2 > j) {
                        return j6 == -9223372036854775807L ? C7182a.C7187e.m19315a(b2, j3) : C7182a.C7187e.m19314a(j3 + j5);
                    }
                    if (100000 + b2 > j) {
                        return C7182a.C7187e.m19314a(j3 + ((long) a));
                    }
                    j5 = (long) a;
                    j6 = b2;
                }
                yVar2.mo55076d(i);
                j4 = (long) i;
            }
            return j6 != -9223372036854775807L ? C7182a.C7187e.m19317b(j6, j3 + j4) : C7182a.C7187e.f15794a;
        }

        /* renamed from: a */
        public C7182a.C7187e mo53874a(C7279i iVar, long j) throws IOException {
            long c = iVar.mo53892c();
            int min = (int) Math.min((long) this.f16348d, iVar.mo53893d() - c);
            this.f16346b.mo55067a(min);
            iVar.mo53908d(this.f16346b.mo55077d(), 0, min);
            return m19902a(this.f16346b, j, c);
        }

        /* renamed from: a */
        public void mo53875a() {
            this.f16346b.mo55069a(C7728ai.f18254f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7281aa(com.applovin.exoplayer2.p221l.C7726ag r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            com.applovin.exoplayer2.e.a$b r1 = new com.applovin.exoplayer2.e.a$b
            r1.<init>()
            com.applovin.exoplayer2.e.i.aa$a r2 = new com.applovin.exoplayer2.e.i.aa$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7281aa.<init>(com.applovin.exoplayer2.l.ag, long, long, int, int):void");
    }
}
