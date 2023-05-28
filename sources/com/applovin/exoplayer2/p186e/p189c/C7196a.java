package com.applovin.exoplayer2.p186e.p189c;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6847a;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p189c.C7199d;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.c.a */
final class C7196a extends C7199d {

    /* renamed from: b */
    private static final int[] f15843b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f15844c;

    /* renamed from: d */
    private boolean f15845d;

    /* renamed from: e */
    private int f15846e;

    public C7196a(C7357x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53883a(C7772y yVar) throws C7199d.C7200a {
        C7864v.C7866a l;
        if (!this.f15844c) {
            int h = yVar.mo55084h();
            int i = (h >> 4) & 15;
            this.f15846e = i;
            if (i == 2) {
                l = new C7864v.C7866a().mo55435f("audio/mpeg").mo55440k(1).mo55441l(f15843b[(h >> 2) & 3]);
            } else if (i == 7 || i == 8) {
                l = new C7864v.C7866a().mo55435f(this.f15846e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").mo55440k(1).mo55441l(8000);
            } else {
                if (i != 10) {
                    throw new C7199d.C7200a("Audio format not supported: " + this.f15846e);
                }
                this.f15844c = true;
            }
            this.f15867a.mo53953a(l.mo55424a());
            this.f15845d = true;
            this.f15844c = true;
        } else {
            yVar.mo55079e(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53884a(C7772y yVar, long j) throws C6809ai {
        if (this.f15846e == 2) {
            int a = yVar.mo55064a();
            this.f15867a.mo53951a(yVar, a);
            this.f15867a.mo53950a(j, 1, a, 0, (C7357x.C7358a) null);
            return true;
        }
        int h = yVar.mo55084h();
        if (h == 0 && !this.f15845d) {
            int a2 = yVar.mo55064a();
            byte[] bArr = new byte[a2];
            yVar.mo55071a(bArr, 0, a2);
            C6847a.C6849a a3 = C6847a.m17929a(bArr);
            this.f15867a.mo53953a(new C7864v.C7866a().mo55435f("audio/mp4a-latm").mo55431d(a3.f14980c).mo55440k(a3.f14979b).mo55441l(a3.f14978a).mo55422a((List<byte[]>) Collections.singletonList(bArr)).mo55424a());
            this.f15845d = true;
            return false;
        } else if (this.f15846e == 10 && h != 1) {
            return false;
        } else {
            int a4 = yVar.mo55064a();
            this.f15867a.mo53951a(yVar, a4);
            this.f15867a.mo53950a(j, 1, a4, 0, (C7357x.C7358a) null);
            return true;
        }
    }
}
