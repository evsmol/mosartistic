package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.b */
public final class C7190b {
    /* renamed from: a */
    private static int m19341a(C7772y yVar) {
        int i = 0;
        while (yVar.mo55064a() != 0) {
            int h = yVar.mo55084h();
            i += h;
            if (h != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m19342a(long j, C7772y yVar, C7357x[] xVarArr) {
        while (true) {
            boolean z = true;
            if (yVar.mo55064a() > 1) {
                int a = m19341a(yVar);
                int a2 = m19341a(yVar);
                int c = yVar.mo55074c() + a2;
                if (a2 == -1 || a2 > yVar.mo55064a()) {
                    C7755q.m22361c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    c = yVar.mo55072b();
                } else if (a == 4 && a2 >= 8) {
                    int h = yVar.mo55084h();
                    int i = yVar.mo55085i();
                    int q = i == 49 ? yVar.mo55093q() : 0;
                    int h2 = yVar.mo55084h();
                    if (i == 47) {
                        yVar.mo55079e(1);
                    }
                    boolean z2 = h == 181 && (i == 49 || i == 47) && h2 == 3;
                    if (i == 49) {
                        if (q != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m19343b(j, yVar, xVarArr);
                    }
                }
                yVar.mo55076d(c);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m19343b(long j, C7772y yVar, C7357x[] xVarArr) {
        int h = yVar.mo55084h();
        if ((h & 64) != 0) {
            yVar.mo55079e(1);
            int i = (h & 31) * 3;
            int c = yVar.mo55074c();
            for (C7357x xVar : xVarArr) {
                yVar.mo55076d(c);
                xVar.mo53951a(yVar, i);
                if (j != -9223372036854775807L) {
                    xVar.mo53950a(j, 1, i, 0, (C7357x.C7358a) null);
                }
            }
        }
    }
}
