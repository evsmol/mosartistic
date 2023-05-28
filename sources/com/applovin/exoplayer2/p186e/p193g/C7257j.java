package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.g.j */
final class C7257j {

    /* renamed from: a */
    private static final int[] f16231a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m19781a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f16231a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m19782a(C7279i iVar) throws IOException {
        return m19784a(iVar, true, false);
    }

    /* renamed from: a */
    public static boolean m19783a(C7279i iVar, boolean z) throws IOException {
        return m19784a(iVar, false, z);
    }

    /* renamed from: a */
    private static boolean m19784a(C7279i iVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        C7279i iVar2 = iVar;
        long d = iVar.mo53893d();
        long j = 4096;
        long j2 = -1;
        int i = (d > -1 ? 1 : (d == -1 ? 0 : -1));
        if (i != 0 && d <= 4096) {
            j = d;
        }
        int i2 = (int) j;
        C7772y yVar = new C7772y(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            yVar.mo55067a(8);
            if (!iVar2.mo53905b(yVar.mo55077d(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long o = yVar.mo55091o();
            int q = yVar.mo55093q();
            int i4 = 16;
            if (o == 1) {
                iVar2.mo53908d(yVar.mo55077d(), 8, 8);
                yVar.mo55075c(16);
                o = yVar.mo55095s();
            } else {
                if (o == 0) {
                    long d2 = iVar.mo53893d();
                    if (d2 != j2) {
                        o = (d2 - iVar.mo53891b()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            long j3 = (long) i4;
            if (o < j3) {
                return z4;
            }
            i3 += i4;
            if (q == 1836019574) {
                i2 += (int) o;
                if (i != 0 && ((long) i2) > d) {
                    i2 = (int) d;
                }
                j2 = -1;
            } else if (q == 1836019558 || q == 1836475768) {
                z3 = true;
            } else {
                long j4 = d;
                int i5 = i3;
                if ((((long) i3) + o) - j3 >= ((long) i2)) {
                    break;
                }
                int i6 = (int) (o - j3);
                i3 = i5 + i6;
                if (q != 1718909296) {
                    boolean z6 = z2;
                    if (i6 != 0) {
                        iVar2.mo53907c(i6);
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    yVar.mo55067a(i6);
                    iVar2.mo53908d(yVar.mo55077d(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            boolean z7 = z2;
                            break;
                        }
                        if (i8 == 1) {
                            yVar.mo55079e(4);
                            boolean z8 = z2;
                        } else if (m19781a(yVar.mo55093q(), z2)) {
                            z5 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z5) {
                        return false;
                    }
                }
                d = j4;
                j2 = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
