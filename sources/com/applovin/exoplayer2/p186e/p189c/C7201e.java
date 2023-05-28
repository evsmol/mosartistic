package com.applovin.exoplayer2.p186e.p189c;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p189c.C7199d;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p222m.C7776a;

/* renamed from: com.applovin.exoplayer2.e.c.e */
final class C7201e extends C7199d {

    /* renamed from: b */
    private final C7772y f15868b = new C7772y(C7762v.f18312a);

    /* renamed from: c */
    private final C7772y f15869c = new C7772y(4);

    /* renamed from: d */
    private int f15870d;

    /* renamed from: e */
    private boolean f15871e;

    /* renamed from: f */
    private boolean f15872f;

    /* renamed from: g */
    private int f15873g;

    public C7201e(C7357x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53883a(C7772y yVar) throws C7199d.C7200a {
        int h = yVar.mo55084h();
        int i = (h >> 4) & 15;
        int i2 = h & 15;
        if (i2 == 7) {
            this.f15873g = i;
            return i != 5;
        }
        throw new C7199d.C7200a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53884a(C7772y yVar, long j) throws C6809ai {
        int h = yVar.mo55084h();
        long n = j + (((long) yVar.mo55090n()) * 1000);
        if (h == 0 && !this.f15871e) {
            C7772y yVar2 = new C7772y(new byte[yVar.mo55064a()]);
            yVar.mo55071a(yVar2.mo55077d(), 0, yVar.mo55064a());
            C7776a a = C7776a.m22498a(yVar2);
            this.f15870d = a.f18358b;
            this.f15867a.mo53953a(new C7864v.C7866a().mo55435f("video/avc").mo55431d(a.f18362f).mo55436g(a.f18359c).mo55437h(a.f18360d).mo55425b(a.f18361e).mo55422a(a.f18357a).mo55424a());
            this.f15871e = true;
            return false;
        } else if (h != 1 || !this.f15871e) {
            return false;
        } else {
            int i = this.f15873g == 1 ? 1 : 0;
            if (!this.f15872f && i == 0) {
                return false;
            }
            byte[] d = this.f15869c.mo55077d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f15870d;
            int i3 = 0;
            while (yVar.mo55064a() > 0) {
                yVar.mo55071a(this.f15869c.mo55077d(), i2, this.f15870d);
                this.f15869c.mo55076d(0);
                int w = this.f15869c.mo55099w();
                this.f15868b.mo55076d(0);
                this.f15867a.mo53951a(this.f15868b, 4);
                this.f15867a.mo53951a(yVar, w);
                i3 = i3 + 4 + w;
            }
            this.f15867a.mo53950a(n, i, i3, 0, (C7357x.C7358a) null);
            this.f15872f = true;
            return true;
        }
    }
}
