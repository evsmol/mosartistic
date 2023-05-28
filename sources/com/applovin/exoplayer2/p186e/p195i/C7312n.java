package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p221l.C7773z;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.n */
public final class C7312n implements C7302j {

    /* renamed from: a */
    private final C7328z f16579a;

    /* renamed from: b */
    private String f16580b;

    /* renamed from: c */
    private C7357x f16581c;

    /* renamed from: d */
    private C7313a f16582d;

    /* renamed from: e */
    private boolean f16583e;

    /* renamed from: f */
    private final boolean[] f16584f = new boolean[3];

    /* renamed from: g */
    private final C7317r f16585g = new C7317r(32, 128);

    /* renamed from: h */
    private final C7317r f16586h = new C7317r(33, 128);

    /* renamed from: i */
    private final C7317r f16587i = new C7317r(34, 128);

    /* renamed from: j */
    private final C7317r f16588j = new C7317r(39, 128);

    /* renamed from: k */
    private final C7317r f16589k = new C7317r(40, 128);

    /* renamed from: l */
    private long f16590l;

    /* renamed from: m */
    private long f16591m = -9223372036854775807L;

    /* renamed from: n */
    private final C7772y f16592n = new C7772y();

    /* renamed from: com.applovin.exoplayer2.e.i.n$a */
    private static final class C7313a {

        /* renamed from: a */
        private final C7357x f16593a;

        /* renamed from: b */
        private long f16594b;

        /* renamed from: c */
        private boolean f16595c;

        /* renamed from: d */
        private int f16596d;

        /* renamed from: e */
        private long f16597e;

        /* renamed from: f */
        private boolean f16598f;

        /* renamed from: g */
        private boolean f16599g;

        /* renamed from: h */
        private boolean f16600h;

        /* renamed from: i */
        private boolean f16601i;

        /* renamed from: j */
        private boolean f16602j;

        /* renamed from: k */
        private long f16603k;

        /* renamed from: l */
        private long f16604l;

        /* renamed from: m */
        private boolean f16605m;

        public C7313a(C7357x xVar) {
            this.f16593a = xVar;
        }

        /* renamed from: a */
        private void m20098a(int i) {
            long j = this.f16604l;
            if (j != -9223372036854775807L) {
                boolean z = this.f16605m;
                this.f16593a.mo53950a(j, z ? 1 : 0, (int) (this.f16594b - this.f16603k), i, (C7357x.C7358a) null);
            }
        }

        /* renamed from: b */
        private static boolean m20099b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        private static boolean m20100c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: a */
        public void mo54056a() {
            this.f16598f = false;
            this.f16599g = false;
            this.f16600h = false;
            this.f16601i = false;
            this.f16602j = false;
        }

        /* renamed from: a */
        public void mo54057a(long j, int i, int i2, long j2, boolean z) {
            boolean z2 = false;
            this.f16599g = false;
            this.f16600h = false;
            this.f16597e = j2;
            this.f16596d = 0;
            this.f16594b = j;
            if (!m20100c(i2)) {
                if (this.f16601i && !this.f16602j) {
                    if (z) {
                        m20098a(i);
                    }
                    this.f16601i = false;
                }
                if (m20099b(i2)) {
                    this.f16600h = !this.f16602j;
                    this.f16602j = true;
                }
            }
            boolean z3 = i2 >= 16 && i2 <= 21;
            this.f16595c = z3;
            if (z3 || i2 <= 9) {
                z2 = true;
            }
            this.f16598f = z2;
        }

        /* renamed from: a */
        public void mo54058a(long j, int i, boolean z) {
            if (this.f16602j && this.f16599g) {
                this.f16605m = this.f16595c;
                this.f16602j = false;
            } else if (this.f16600h || this.f16599g) {
                if (z && this.f16601i) {
                    m20098a(i + ((int) (j - this.f16594b)));
                }
                this.f16603k = this.f16594b;
                this.f16604l = this.f16597e;
                this.f16605m = this.f16595c;
                this.f16601i = true;
            }
        }

        /* renamed from: a */
        public void mo54059a(byte[] bArr, int i, int i2) {
            if (this.f16598f) {
                int i3 = this.f16596d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f16599g = (bArr[i4] & 128) != 0;
                    this.f16598f = false;
                    return;
                }
                this.f16596d = i3 + (i2 - i);
            }
        }
    }

    public C7312n(C7328z zVar) {
        this.f16579a = zVar;
    }

    /* renamed from: a */
    private static C7864v m20086a(String str, C7317r rVar, C7317r rVar2, C7317r rVar3) {
        C7317r rVar4 = rVar;
        C7317r rVar5 = rVar2;
        C7317r rVar6 = rVar3;
        byte[] bArr = new byte[(rVar4.f16646b + rVar5.f16646b + rVar6.f16646b)];
        System.arraycopy(rVar4.f16645a, 0, bArr, 0, rVar4.f16646b);
        System.arraycopy(rVar5.f16645a, 0, bArr, rVar4.f16646b, rVar5.f16646b);
        System.arraycopy(rVar6.f16645a, 0, bArr, rVar4.f16646b + rVar5.f16646b, rVar6.f16646b);
        C7773z zVar = new C7773z(rVar5.f16645a, 0, rVar5.f16646b);
        zVar.mo55104a(44);
        int c = zVar.mo55108c(3);
        zVar.mo55103a();
        zVar.mo55104a(88);
        zVar.mo55104a(8);
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (zVar.mo55106b()) {
                i += 89;
            }
            if (zVar.mo55106b()) {
                i += 8;
            }
        }
        zVar.mo55104a(i);
        if (c > 0) {
            zVar.mo55104a((8 - c) * 2);
        }
        zVar.mo55110d();
        int d = zVar.mo55110d();
        if (d == 3) {
            zVar.mo55103a();
        }
        int d2 = zVar.mo55110d();
        int d3 = zVar.mo55110d();
        if (zVar.mo55106b()) {
            int d4 = zVar.mo55110d();
            int d5 = zVar.mo55110d();
            int d6 = zVar.mo55110d();
            int d7 = zVar.mo55110d();
            d2 -= ((d == 1 || d == 2) ? 2 : 1) * (d4 + d5);
            d3 -= (d == 1 ? 2 : 1) * (d6 + d7);
        }
        zVar.mo55110d();
        zVar.mo55110d();
        int d8 = zVar.mo55110d();
        int i3 = zVar.mo55106b() ? 0 : c;
        while (true) {
            zVar.mo55110d();
            zVar.mo55110d();
            zVar.mo55110d();
            if (i3 > c) {
                break;
            }
            i3++;
        }
        zVar.mo55110d();
        zVar.mo55110d();
        zVar.mo55110d();
        if (zVar.mo55106b() && zVar.mo55106b()) {
            m20088a(zVar);
        }
        zVar.mo55104a(2);
        if (zVar.mo55106b()) {
            zVar.mo55104a(8);
            zVar.mo55110d();
            zVar.mo55110d();
            zVar.mo55103a();
        }
        m20091b(zVar);
        if (zVar.mo55106b()) {
            for (int i4 = 0; i4 < zVar.mo55110d(); i4++) {
                zVar.mo55104a(d8 + 4 + 1);
            }
        }
        zVar.mo55104a(2);
        float f = 1.0f;
        if (zVar.mo55106b()) {
            if (zVar.mo55106b()) {
                int c2 = zVar.mo55108c(8);
                if (c2 == 255) {
                    int c3 = zVar.mo55108c(16);
                    int c4 = zVar.mo55108c(16);
                    if (!(c3 == 0 || c4 == 0)) {
                        f = ((float) c3) / ((float) c4);
                    }
                } else if (c2 < C7762v.f18313b.length) {
                    f = C7762v.f18313b[c2];
                } else {
                    C7755q.m22361c("H265Reader", "Unexpected aspect_ratio_idc value: " + c2);
                }
            }
            if (zVar.mo55106b()) {
                zVar.mo55103a();
            }
            if (zVar.mo55106b()) {
                zVar.mo55104a(4);
                if (zVar.mo55106b()) {
                    zVar.mo55104a(24);
                }
            }
            if (zVar.mo55106b()) {
                zVar.mo55110d();
                zVar.mo55110d();
            }
            zVar.mo55103a();
            if (zVar.mo55106b()) {
                d3 *= 2;
            }
        }
        zVar.mo55105a(rVar5.f16645a, 0, rVar5.f16646b);
        zVar.mo55104a(24);
        return new C7864v.C7866a().mo55421a(str).mo55435f("video/hevc").mo55431d(C7733e.m22283a(zVar)).mo55436g(d2).mo55437h(d3).mo55425b(f).mo55422a((List<byte[]>) Collections.singletonList(bArr)).mo55424a();
    }

    /* renamed from: a */
    private void m20087a(long j, int i, int i2, long j2) {
        this.f16582d.mo54057a(j, i, i2, j2, this.f16583e);
        if (!this.f16583e) {
            this.f16585g.mo54061a(i2);
            this.f16586h.mo54061a(i2);
            this.f16587i.mo54061a(i2);
        }
        this.f16588j.mo54061a(i2);
        this.f16589k.mo54061a(i2);
    }

    /* renamed from: a */
    private static void m20088a(C7773z zVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!zVar.mo55106b()) {
                    zVar.mo55110d();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        zVar.mo55111e();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        zVar.mo55111e();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: a */
    private void m20089a(byte[] bArr, int i, int i2) {
        this.f16582d.mo54059a(bArr, i, i2);
        if (!this.f16583e) {
            this.f16585g.mo54062a(bArr, i, i2);
            this.f16586h.mo54062a(bArr, i, i2);
            this.f16587i.mo54062a(bArr, i, i2);
        }
        this.f16588j.mo54062a(bArr, i, i2);
        this.f16589k.mo54062a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m20090b(long j, int i, int i2, long j2) {
        this.f16582d.mo54058a(j, i, this.f16583e);
        if (!this.f16583e) {
            this.f16585g.mo54064b(i2);
            this.f16586h.mo54064b(i2);
            this.f16587i.mo54064b(i2);
            if (this.f16585g.mo54063b() && this.f16586h.mo54063b() && this.f16587i.mo54063b()) {
                this.f16581c.mo53953a(m20086a(this.f16580b, this.f16585g, this.f16586h, this.f16587i));
                this.f16583e = true;
            }
        }
        if (this.f16588j.mo54064b(i2)) {
            this.f16592n.mo55070a(this.f16588j.f16645a, C7762v.m22390a(this.f16588j.f16645a, this.f16588j.f16646b));
            this.f16592n.mo55079e(5);
            this.f16579a.mo54071a(j2, this.f16592n);
        }
        if (this.f16589k.mo54064b(i2)) {
            this.f16592n.mo55070a(this.f16589k.f16645a, C7762v.m22390a(this.f16589k.f16645a, this.f16589k.f16646b));
            this.f16592n.mo55079e(5);
            this.f16579a.mo54071a(j2, this.f16592n);
        }
    }

    /* renamed from: b */
    private static void m20091b(C7773z zVar) {
        int d = zVar.mo55110d();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            if (i2 != 0) {
                z = zVar.mo55106b();
            }
            if (z) {
                zVar.mo55103a();
                zVar.mo55110d();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (zVar.mo55106b()) {
                        zVar.mo55103a();
                    }
                }
            } else {
                int d2 = zVar.mo55110d();
                int d3 = zVar.mo55110d();
                int i4 = d2 + d3;
                for (int i5 = 0; i5 < d2; i5++) {
                    zVar.mo55110d();
                    zVar.mo55103a();
                }
                for (int i6 = 0; i6 < d3; i6++) {
                    zVar.mo55110d();
                    zVar.mo55103a();
                }
                i = i4;
            }
        }
    }

    /* renamed from: c */
    private void m20092c() {
        C7717a.m22115a(this.f16581c);
        C7728ai.m22198a(this.f16582d);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16590l = 0;
        this.f16591m = -9223372036854775807L;
        C7762v.m22395a(this.f16584f);
        this.f16585g.mo54060a();
        this.f16586h.mo54060a();
        this.f16587i.mo54060a();
        this.f16588j.mo54060a();
        this.f16589k.mo54060a();
        C7313a aVar = this.f16582d;
        if (aVar != null) {
            aVar.mo54056a();
        }
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16591m = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16580b = dVar.mo54026c();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 2);
        this.f16581c = a;
        this.f16582d = new C7313a(a);
        this.f16579a.mo54072a(jVar, dVar);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        m20092c();
        while (yVar.mo55064a() > 0) {
            int c = yVar.mo55074c();
            int b = yVar.mo55072b();
            byte[] d = yVar.mo55077d();
            this.f16590l += (long) yVar.mo55064a();
            this.f16581c.mo53951a(yVar, yVar.mo55064a());
            while (true) {
                if (c < b) {
                    int a = C7762v.m22391a(d, c, b, this.f16584f);
                    if (a == b) {
                        m20089a(d, c, b);
                        return;
                    }
                    int c2 = C7762v.m22399c(d, a);
                    int i = a - c;
                    if (i > 0) {
                        m20089a(d, c, a);
                    }
                    int i2 = b - a;
                    long j = this.f16590l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m20090b(j2, i4, i3, this.f16591m);
                    m20087a(j2, i4, c2, this.f16591m);
                    c = a + 3;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
