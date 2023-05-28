package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6890o;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.i.h */
public final class C7300h implements C7302j {

    /* renamed from: a */
    private final C7772y f16465a = new C7772y(new byte[18]);

    /* renamed from: b */
    private final String f16466b;

    /* renamed from: c */
    private String f16467c;

    /* renamed from: d */
    private C7357x f16468d;

    /* renamed from: e */
    private int f16469e = 0;

    /* renamed from: f */
    private int f16470f;

    /* renamed from: g */
    private int f16471g;

    /* renamed from: h */
    private long f16472h;

    /* renamed from: i */
    private C7864v f16473i;

    /* renamed from: j */
    private int f16474j;

    /* renamed from: k */
    private long f16475k = -9223372036854775807L;

    public C7300h(String str) {
        this.f16466b = str;
    }

    /* renamed from: a */
    private boolean m20022a(C7772y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.mo55064a(), i - this.f16470f);
        yVar.mo55071a(bArr, this.f16470f, min);
        int i2 = this.f16470f + min;
        this.f16470f = i2;
        return i2 == i;
    }

    /* renamed from: b */
    private boolean m20023b(C7772y yVar) {
        while (yVar.mo55064a() > 0) {
            int i = this.f16471g << 8;
            this.f16471g = i;
            int h = i | yVar.mo55084h();
            this.f16471g = h;
            if (C6890o.m18199a(h)) {
                byte[] d = this.f16465a.mo55077d();
                int i2 = this.f16471g;
                d[0] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[1] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f16470f = 4;
                this.f16471g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m20024c() {
        byte[] d = this.f16465a.mo55077d();
        if (this.f16473i == null) {
            C7864v a = C6890o.m18198a(d, this.f16467c, this.f16466b, (C7148e) null);
            this.f16473i = a;
            this.f16468d.mo53953a(a);
        }
        this.f16474j = C6890o.m18200b(d);
        this.f16472h = (long) ((int) ((((long) C6890o.m18197a(d)) * 1000000) / ((long) this.f16473i.f18935z)));
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16469e = 0;
        this.f16470f = 0;
        this.f16471g = 0;
        this.f16475k = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16475k = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16467c = dVar.mo54026c();
        this.f16468d = jVar.mo53894a(dVar.mo54025b(), 1);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16468d);
        while (yVar.mo55064a() > 0) {
            int i = this.f16469e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yVar.mo55064a(), this.f16474j - this.f16470f);
                        this.f16468d.mo53951a(yVar, min);
                        int i2 = this.f16470f + min;
                        this.f16470f = i2;
                        int i3 = this.f16474j;
                        if (i2 == i3) {
                            long j = this.f16475k;
                            if (j != -9223372036854775807L) {
                                this.f16468d.mo53950a(j, 1, i3, 0, (C7357x.C7358a) null);
                                this.f16475k += this.f16472h;
                            }
                            this.f16469e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m20022a(yVar, this.f16465a.mo55077d(), 18)) {
                    m20024c();
                    this.f16465a.mo55076d(0);
                    this.f16468d.mo53951a(this.f16465a, 18);
                    this.f16469e = 2;
                }
            } else if (m20023b(yVar)) {
                this.f16469e = 1;
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
