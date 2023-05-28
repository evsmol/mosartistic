package com.applovin.exoplayer2.p197f;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6895r;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7755q;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.f.e */
final class C7374e {

    /* renamed from: a */
    private long f16857a;

    /* renamed from: b */
    private long f16858b;

    /* renamed from: c */
    private boolean f16859c;

    C7374e() {
    }

    /* renamed from: a */
    private long m20388a(long j) {
        return this.f16857a + Math.max(0, ((this.f16858b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public long mo54151a(C7864v vVar) {
        return m20388a((long) vVar.f18935z);
    }

    /* renamed from: a */
    public long mo54152a(C7864v vVar, C6922g gVar) {
        if (this.f16858b == 0) {
            this.f16857a = gVar.f15334d;
        }
        if (this.f16859c) {
            return gVar.f15334d;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C7717a.m22120b(gVar.f15332b);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int b2 = C6895r.m18254b(b);
        if (b2 == -1) {
            this.f16859c = true;
            this.f16858b = 0;
            this.f16857a = gVar.f15334d;
            C7755q.m22361c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f15334d;
        }
        long a = m20388a((long) vVar.f18935z);
        this.f16858b += (long) b2;
        return a;
    }

    /* renamed from: a */
    public void mo54153a() {
        this.f16857a = 0;
        this.f16858b = 0;
        this.f16859c = false;
    }
}
