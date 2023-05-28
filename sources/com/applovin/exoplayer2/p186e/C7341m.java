package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.m */
public final class C7341m {

    /* renamed from: com.applovin.exoplayer2.e.m$a */
    public static final class C7342a {

        /* renamed from: a */
        public long f16747a;
    }

    /* renamed from: a */
    public static int m20226a(C7772y yVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yVar.mo55084h() + 1;
            case 7:
                return yVar.mo55085i() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static long m20227a(C7279i iVar, C7346p pVar) throws IOException {
        iVar.mo53899a();
        boolean z = true;
        iVar.mo53907c(1);
        byte[] bArr = new byte[1];
        iVar.mo53908d(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        iVar.mo53907c(2);
        int i = z ? 7 : 6;
        C7772y yVar = new C7772y(i);
        yVar.mo55075c(C7339k.m20219a(iVar, yVar.mo55077d(), 0, i));
        iVar.mo53899a();
        C7342a aVar = new C7342a();
        if (m20232a(yVar, pVar, z, aVar)) {
            return aVar.f16747a;
        }
        throw C6809ai.m17540b((String) null, (Throwable) null);
    }

    /* renamed from: a */
    private static boolean m20228a(int i, C7346p pVar) {
        return i <= 7 ? i == pVar.f16757g - 1 : i <= 10 && pVar.f16757g == 2;
    }

    /* renamed from: a */
    public static boolean m20229a(C7279i iVar, C7346p pVar, int i, C7342a aVar) throws IOException {
        long b = iVar.mo53891b();
        byte[] bArr = new byte[2];
        iVar.mo53908d(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            iVar.mo53899a();
            iVar.mo53907c((int) (b - iVar.mo53892c()));
            return false;
        }
        C7772y yVar = new C7772y(16);
        System.arraycopy(bArr, 0, yVar.mo55077d(), 0, 2);
        yVar.mo55075c(C7339k.m20219a(iVar, yVar.mo55077d(), 2, 14));
        iVar.mo53899a();
        iVar.mo53907c((int) (b - iVar.mo53892c()));
        return m20231a(yVar, pVar, i, aVar);
    }

    /* renamed from: a */
    private static boolean m20230a(C7772y yVar, C7346p pVar, int i) {
        int a = m20226a(yVar, i);
        return a != -1 && a <= pVar.f16752b;
    }

    /* renamed from: a */
    public static boolean m20231a(C7772y yVar, C7346p pVar, int i, C7342a aVar) {
        C7772y yVar2 = yVar;
        C7346p pVar2 = pVar;
        int c = yVar.mo55074c();
        long o = yVar.mo55091o();
        long j = o >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        return m20228a((int) (15 & (o >> 4)), pVar2) && m20233b((int) ((o >> 1) & 7), pVar2) && !(((o & 1) > 1 ? 1 : ((o & 1) == 1 ? 0 : -1)) == 0) && m20232a(yVar2, pVar2, ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1)) == 0, aVar) && m20230a(yVar2, pVar2, (int) ((o >> 12) & 15)) && m20235b(yVar2, pVar2, (int) ((o >> 8) & 15)) && m20234b(yVar2, c);
    }

    /* renamed from: a */
    private static boolean m20232a(C7772y yVar, C7346p pVar, boolean z, C7342a aVar) {
        try {
            long D = yVar.mo55063D();
            if (!z) {
                D *= (long) pVar.f16752b;
            }
            aVar.f16747a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m20233b(int i, C7346p pVar) {
        return i == 0 || i == pVar.f16759i;
    }

    /* renamed from: b */
    private static boolean m20234b(C7772y yVar, int i) {
        return yVar.mo55084h() == C7728ai.m22227b(yVar.mo55077d(), i, yVar.mo55074c() - 1, 0);
    }

    /* renamed from: b */
    private static boolean m20235b(C7772y yVar, C7346p pVar, int i) {
        int i2 = pVar.f16755e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == pVar.f16756f;
        }
        if (i == 12) {
            return yVar.mo55084h() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int i3 = yVar.mo55085i();
        if (i == 14) {
            i3 *= 10;
        }
        return i3 == i2;
    }
}
