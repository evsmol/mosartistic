package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p186e.C7182a;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.u */
final class C7320u extends C7182a {

    /* renamed from: com.applovin.exoplayer2.e.i.u$a */
    private static final class C7322a implements C7182a.C7188f {

        /* renamed from: a */
        private final C7726ag f16665a;

        /* renamed from: b */
        private final C7772y f16666b;

        private C7322a(C7726ag agVar) {
            this.f16665a = agVar;
            this.f16666b = new C7772y();
        }

        /* renamed from: a */
        private C7182a.C7187e m20148a(C7772y yVar, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (yVar.mo55064a() >= 4) {
                if (C7320u.m20147b(yVar.mo55077d(), yVar.mo55074c()) != 442) {
                    yVar.mo55079e(1);
                } else {
                    yVar.mo55079e(4);
                    long a = C7323v.m20154a(yVar);
                    if (a != -9223372036854775807L) {
                        long b = this.f16665a.mo54989b(a);
                        if (b > j) {
                            return j3 == -9223372036854775807L ? C7182a.C7187e.m19315a(b, j2) : C7182a.C7187e.m19314a(j2 + ((long) i2));
                        }
                        if (100000 + b > j) {
                            return C7182a.C7187e.m19314a(j2 + ((long) yVar.mo55074c()));
                        }
                        i2 = yVar.mo55074c();
                        j3 = b;
                    }
                    m20149a(yVar);
                    i = yVar.mo55074c();
                }
            }
            return j3 != -9223372036854775807L ? C7182a.C7187e.m19317b(j3, j2 + ((long) i)) : C7182a.C7187e.f15794a;
        }

        /* renamed from: a */
        private static void m20149a(C7772y yVar) {
            int b = yVar.mo55072b();
            if (yVar.mo55064a() < 10) {
                yVar.mo55076d(b);
                return;
            }
            yVar.mo55079e(9);
            int h = yVar.mo55084h() & 7;
            if (yVar.mo55064a() < h) {
                yVar.mo55076d(b);
                return;
            }
            yVar.mo55079e(h);
            if (yVar.mo55064a() < 4) {
                yVar.mo55076d(b);
                return;
            }
            if (C7320u.m20147b(yVar.mo55077d(), yVar.mo55074c()) == 443) {
                yVar.mo55079e(4);
                int i = yVar.mo55085i();
                if (yVar.mo55064a() < i) {
                    yVar.mo55076d(b);
                    return;
                }
                yVar.mo55079e(i);
            }
            while (yVar.mo55064a() >= 4 && (r1 = C7320u.m20147b(yVar.mo55077d(), yVar.mo55074c())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                yVar.mo55079e(4);
                if (yVar.mo55064a() < 2) {
                    yVar.mo55076d(b);
                    return;
                } else {
                    yVar.mo55076d(Math.min(yVar.mo55072b(), yVar.mo55074c() + yVar.mo55085i()));
                }
            }
        }

        /* renamed from: a */
        public C7182a.C7187e mo53874a(C7279i iVar, long j) throws IOException {
            long c = iVar.mo53892c();
            int min = (int) Math.min(20000, iVar.mo53893d() - c);
            this.f16666b.mo55067a(min);
            iVar.mo53908d(this.f16666b.mo55077d(), 0, min);
            return m20148a(this.f16666b, j, c);
        }

        /* renamed from: a */
        public void mo53875a() {
            this.f16666b.mo55069a(C7728ai.f18254f);
        }
    }

    public C7320u(C7726ag agVar, long j, long j2) {
        super(new C7182a.C7184b(), new C7322a(agVar), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m20147b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
