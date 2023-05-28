package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6897s;
import com.applovin.exoplayer2.p186e.p194h.C7273h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.h.g */
final class C7272g extends C7273h {

    /* renamed from: a */
    private static final byte[] f16314a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: b */
    private boolean f16315b;

    C7272g() {
    }

    /* renamed from: a */
    private long m19847a(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return ((long) b3) * ((long) (i >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    /* renamed from: a */
    public static boolean m19848a(C7772y yVar) {
        int a = yVar.mo55064a();
        byte[] bArr = f16314a;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.mo55071a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f16314a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53993a(boolean z) {
        super.mo53993a(z);
        if (z) {
            this.f16315b = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53994a(C7772y yVar, long j, C7273h.C7275a aVar) {
        boolean z = true;
        if (!this.f16315b) {
            byte[] copyOf = Arrays.copyOf(yVar.mo55077d(), yVar.mo55072b());
            int a = C6897s.m18265a(copyOf);
            aVar.f16329a = new C7864v.C7866a().mo55435f("audio/opus").mo55440k(a).mo55441l(48000).mo55422a(C6897s.m18268b(copyOf)).mo55424a();
            this.f16315b = true;
            return true;
        }
        C7717a.m22120b(aVar.f16329a);
        if (yVar.mo55093q() != 1332770163) {
            z = false;
        }
        yVar.mo55076d(0);
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo53995b(C7772y yVar) {
        return mo54010b(m19847a(yVar.mo55077d()));
    }
}
