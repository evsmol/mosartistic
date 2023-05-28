package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p203e.C7435g;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.s */
public final class C7350s {

    /* renamed from: a */
    private final C7772y f16769a = new C7772y(10);

    /* renamed from: a */
    public C7399a mo54087a(C7279i iVar, C7435g.C7436a aVar) throws IOException {
        C7399a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                iVar.mo53908d(this.f16769a.mo55077d(), 0, 10);
                this.f16769a.mo55076d(0);
                if (this.f16769a.mo55089m() != 4801587) {
                    break;
                }
                this.f16769a.mo55079e(3);
                int v = this.f16769a.mo55098v();
                int i2 = v + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f16769a.mo55077d(), 0, bArr, 0, 10);
                    iVar.mo53908d(bArr, 10, v);
                    aVar2 = new C7435g(aVar).mo54318a(bArr, i2);
                } else {
                    iVar.mo53907c(v);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iVar.mo53899a();
        iVar.mo53907c(i);
        return aVar2;
    }
}
