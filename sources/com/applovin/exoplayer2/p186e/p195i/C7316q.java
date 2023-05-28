package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6895r;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.q */
public final class C7316q implements C7302j {

    /* renamed from: a */
    private final C7772y f16633a;

    /* renamed from: b */
    private final C6895r.C6896a f16634b;

    /* renamed from: c */
    private final String f16635c;

    /* renamed from: d */
    private C7357x f16636d;

    /* renamed from: e */
    private String f16637e;

    /* renamed from: f */
    private int f16638f;

    /* renamed from: g */
    private int f16639g;

    /* renamed from: h */
    private boolean f16640h;

    /* renamed from: i */
    private boolean f16641i;

    /* renamed from: j */
    private long f16642j;

    /* renamed from: k */
    private int f16643k;

    /* renamed from: l */
    private long f16644l;

    public C7316q() {
        this((String) null);
    }

    public C7316q(String str) {
        this.f16638f = 0;
        C7772y yVar = new C7772y(4);
        this.f16633a = yVar;
        yVar.mo55077d()[0] = -1;
        this.f16634b = new C6895r.C6896a();
        this.f16644l = -9223372036854775807L;
        this.f16635c = str;
    }

    /* renamed from: b */
    private void m20123b(C7772y yVar) {
        byte[] d = yVar.mo55077d();
        int b = yVar.mo55072b();
        for (int c = yVar.mo55074c(); c < b; c++) {
            boolean z = (d[c] & 255) == 255;
            boolean z2 = this.f16641i && (d[c] & 224) == 224;
            this.f16641i = z;
            if (z2) {
                yVar.mo55076d(c + 1);
                this.f16641i = false;
                this.f16633a.mo55077d()[1] = d[c];
                this.f16639g = 2;
                this.f16638f = 1;
                return;
            }
        }
        yVar.mo55076d(b);
    }

    /* renamed from: c */
    private void m20124c(C7772y yVar) {
        int min = Math.min(yVar.mo55064a(), 4 - this.f16639g);
        yVar.mo55071a(this.f16633a.mo55077d(), this.f16639g, min);
        int i = this.f16639g + min;
        this.f16639g = i;
        if (i >= 4) {
            this.f16633a.mo55076d(0);
            if (!this.f16634b.mo53060a(this.f16633a.mo55093q())) {
                this.f16639g = 0;
                this.f16638f = 1;
                return;
            }
            this.f16643k = this.f16634b.f15192c;
            if (!this.f16640h) {
                this.f16642j = (((long) this.f16634b.f15196g) * 1000000) / ((long) this.f16634b.f15193d);
                this.f16636d.mo53953a(new C7864v.C7866a().mo55421a(this.f16637e).mo55435f(this.f16634b.f15191b).mo55434f(4096).mo55440k(this.f16634b.f15194e).mo55441l(this.f16634b.f15193d).mo55429c(this.f16635c).mo55424a());
                this.f16640h = true;
            }
            this.f16633a.mo55076d(0);
            this.f16636d.mo53951a(this.f16633a, 4);
            this.f16638f = 2;
        }
    }

    /* renamed from: d */
    private void m20125d(C7772y yVar) {
        int min = Math.min(yVar.mo55064a(), this.f16643k - this.f16639g);
        this.f16636d.mo53951a(yVar, min);
        int i = this.f16639g + min;
        this.f16639g = i;
        int i2 = this.f16643k;
        if (i >= i2) {
            long j = this.f16644l;
            if (j != -9223372036854775807L) {
                this.f16636d.mo53950a(j, 1, i2, 0, (C7357x.C7358a) null);
                this.f16644l += this.f16642j;
            }
            this.f16639g = 0;
            this.f16638f = 0;
        }
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16638f = 0;
        this.f16639g = 0;
        this.f16641i = false;
        this.f16644l = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16644l = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16637e = dVar.mo54026c();
        this.f16636d = jVar.mo53894a(dVar.mo54025b(), 1);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16636d);
        while (yVar.mo55064a() > 0) {
            int i = this.f16638f;
            if (i == 0) {
                m20123b(yVar);
            } else if (i == 1) {
                m20124c(yVar);
            } else if (i == 2) {
                m20125d(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
