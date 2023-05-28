package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.i */
public final class C7301i implements C7302j {

    /* renamed from: a */
    private final List<C7287ad.C7288a> f16476a;

    /* renamed from: b */
    private final C7357x[] f16477b;

    /* renamed from: c */
    private boolean f16478c;

    /* renamed from: d */
    private int f16479d;

    /* renamed from: e */
    private int f16480e;

    /* renamed from: f */
    private long f16481f = -9223372036854775807L;

    public C7301i(List<C7287ad.C7288a> list) {
        this.f16476a = list;
        this.f16477b = new C7357x[list.size()];
    }

    /* renamed from: a */
    private boolean m20030a(C7772y yVar, int i) {
        if (yVar.mo55064a() == 0) {
            return false;
        }
        if (yVar.mo55084h() != i) {
            this.f16478c = false;
        }
        this.f16479d--;
        return this.f16478c;
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16478c = false;
        this.f16481f = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if ((i & 4) != 0) {
            this.f16478c = true;
            if (j != -9223372036854775807L) {
                this.f16481f = j;
            }
            this.f16480e = 0;
            this.f16479d = 2;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        for (int i = 0; i < this.f16477b.length; i++) {
            C7287ad.C7288a aVar = this.f16476a.get(i);
            dVar.mo54024a();
            C7357x a = jVar.mo53894a(dVar.mo54025b(), 3);
            a.mo53953a(new C7864v.C7866a().mo55421a(dVar.mo54026c()).mo55435f("application/dvbsubs").mo55422a((List<byte[]>) Collections.singletonList(aVar.f16387c)).mo55429c(aVar.f16385a).mo55424a());
            this.f16477b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        if (!this.f16478c) {
            return;
        }
        if (this.f16479d != 2 || m20030a(yVar, 32)) {
            if (this.f16479d != 1 || m20030a(yVar, 0)) {
                int c = yVar.mo55074c();
                int a = yVar.mo55064a();
                for (C7357x a2 : this.f16477b) {
                    yVar.mo55076d(c);
                    a2.mo53951a(yVar, a);
                }
                this.f16480e += a;
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
        if (this.f16478c) {
            if (this.f16481f != -9223372036854775807L) {
                for (C7357x a : this.f16477b) {
                    a.mo53950a(this.f16481f, 1, this.f16480e, 0, (C7357x.C7358a) null);
                }
            }
            this.f16478c = false;
        }
    }
}
