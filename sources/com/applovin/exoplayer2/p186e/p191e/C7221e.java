package com.applovin.exoplayer2.p186e.p191e;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.e.e */
final class C7221e {

    /* renamed from: a */
    private final C7772y f16039a = new C7772y(8);

    /* renamed from: b */
    private int f16040b;

    /* renamed from: b */
    private long m19545b(C7279i iVar) throws IOException {
        int i = 0;
        iVar.mo53908d(this.f16039a.mo55077d(), 0, 1);
        byte b = this.f16039a.mo55077d()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        iVar.mo53908d(this.f16039a.mo55077d(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f16039a.mo55077d()[i] & 255) + (i4 << 8);
        }
        this.f16040b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public boolean mo53937a(C7279i iVar) throws IOException {
        long b;
        int i;
        C7279i iVar2 = iVar;
        long d = iVar.mo53893d();
        long j = 1024;
        int i2 = (d > -1 ? 1 : (d == -1 ? 0 : -1));
        if (i2 != 0 && d <= 1024) {
            j = d;
        }
        int i3 = (int) j;
        iVar2.mo53908d(this.f16039a.mo55077d(), 0, 4);
        this.f16040b = 4;
        for (long o = this.f16039a.mo55091o(); o != 440786851; o = ((o << 8) & -256) | ((long) (this.f16039a.mo55077d()[0] & 255))) {
            int i4 = this.f16040b + 1;
            this.f16040b = i4;
            if (i4 == i3) {
                return false;
            }
            iVar2.mo53908d(this.f16039a.mo55077d(), 0, 1);
        }
        long b2 = m19545b(iVar);
        long j2 = (long) this.f16040b;
        if (b2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + b2 >= d) {
            return false;
        }
        while (true) {
            int i5 = this.f16040b;
            long j3 = j2 + b2;
            if (((long) i5) >= j3) {
                return ((long) i5) == j3;
            }
            if (m19545b(iVar) != Long.MIN_VALUE && b >= 0 && b <= 2147483647L) {
                if (i != 0) {
                    int b3 = (int) (b = m19545b(iVar));
                    iVar2.mo53907c(b3);
                    this.f16040b += b3;
                }
            }
        }
        return false;
    }
}
