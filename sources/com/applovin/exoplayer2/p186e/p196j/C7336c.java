package com.applovin.exoplayer2.p186e.p196j;

import android.util.Pair;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.j.c */
final class C7336c {

    /* renamed from: com.applovin.exoplayer2.e.j.c$a */
    private static final class C7337a {

        /* renamed from: a */
        public final int f16739a;

        /* renamed from: b */
        public final long f16740b;

        private C7337a(int i, long j) {
            this.f16739a = i;
            this.f16740b = j;
        }

        /* renamed from: a */
        public static C7337a m20214a(C7279i iVar, C7772y yVar) throws IOException {
            iVar.mo53908d(yVar.mo55077d(), 0, 8);
            yVar.mo55076d(0);
            return new C7337a(yVar.mo55093q(), yVar.mo55092p());
        }
    }

    /* renamed from: a */
    public static C7335b m20212a(C7279i iVar) throws IOException {
        C7337a a;
        byte[] bArr;
        C7717a.m22120b(iVar);
        C7772y yVar = new C7772y(16);
        if (C7337a.m20214a(iVar, yVar).f16739a != 1380533830) {
            return null;
        }
        iVar.mo53908d(yVar.mo55077d(), 0, 4);
        yVar.mo55076d(0);
        int q = yVar.mo55093q();
        if (q != 1463899717) {
            C7755q.m22363d("WavHeaderReader", "Unsupported RIFF format: " + q);
            return null;
        }
        while (true) {
            a = C7337a.m20214a(iVar, yVar);
            if (a.f16739a == 1718449184) {
                break;
            }
            iVar.mo53907c((int) a.f16740b);
        }
        C7717a.m22121b(a.f16740b >= 16);
        iVar.mo53908d(yVar.mo55077d(), 0, 16);
        yVar.mo55076d(0);
        int j = yVar.mo55086j();
        int j2 = yVar.mo55086j();
        int x = yVar.mo55100x();
        int x2 = yVar.mo55100x();
        int j3 = yVar.mo55086j();
        int j4 = yVar.mo55086j();
        int i = ((int) a.f16740b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            iVar.mo53908d(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = C7728ai.f18254f;
        }
        return new C7335b(j, j2, x, x2, j3, j4, bArr);
    }

    /* renamed from: b */
    public static Pair<Long, Long> m20213b(C7279i iVar) throws IOException {
        C7717a.m22120b(iVar);
        iVar.mo53899a();
        C7772y yVar = new C7772y(8);
        while (true) {
            C7337a a = C7337a.m20214a(iVar, yVar);
            if (a.f16739a != 1684108385) {
                if (!(a.f16739a == 1380533830 || a.f16739a == 1718449184)) {
                    C7755q.m22361c("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f16739a);
                }
                long j = a.f16740b + 8;
                if (a.f16739a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    iVar.mo53902b((int) j);
                } else {
                    throw C6809ai.m17538a("Chunk is too large (~2GB+) to skip; id: " + a.f16739a);
                }
            } else {
                iVar.mo53902b(8);
                long c = iVar.mo53892c();
                long j2 = a.f16740b + c;
                long d = iVar.mo53893d();
                if (d != -1 && j2 > d) {
                    C7755q.m22361c("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + d);
                    j2 = d;
                }
                return Pair.create(Long.valueOf(c), Long.valueOf(j2));
            }
        }
    }
}
