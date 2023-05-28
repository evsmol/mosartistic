package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.g */
public final class C7232g implements C7357x {

    /* renamed from: a */
    private final byte[] f16098a = new byte[4096];

    /* renamed from: a */
    public /* synthetic */ int mo53948a(C7668g gVar, int i, boolean z) throws IOException {
        return C7357x.CC.$default$a(this, gVar, i, z);
    }

    /* renamed from: a */
    public int mo53949a(C7668g gVar, int i, boolean z, int i2) throws IOException {
        int a = gVar.mo53898a(this.f16098a, 0, Math.min(this.f16098a.length, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo53950a(long j, int i, int i2, int i3, C7357x.C7358a aVar) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo53951a(C7772y yVar, int i) {
        C7357x.CC.$default$a(this, yVar, i);
    }

    /* renamed from: a */
    public void mo53952a(C7772y yVar, int i, int i2) {
        yVar.mo55079e(i);
    }

    /* renamed from: a */
    public void mo53953a(C7864v vVar) {
    }
}
