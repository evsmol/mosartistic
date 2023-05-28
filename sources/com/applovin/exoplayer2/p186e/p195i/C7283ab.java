package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.ab */
final class C7283ab {

    /* renamed from: a */
    private final int f16349a;

    /* renamed from: b */
    private final C7726ag f16350b = new C7726ag(0);

    /* renamed from: c */
    private final C7772y f16351c = new C7772y();

    /* renamed from: d */
    private boolean f16352d;

    /* renamed from: e */
    private boolean f16353e;

    /* renamed from: f */
    private boolean f16354f;

    /* renamed from: g */
    private long f16355g = -9223372036854775807L;

    /* renamed from: h */
    private long f16356h = -9223372036854775807L;

    /* renamed from: i */
    private long f16357i = -9223372036854775807L;

    C7283ab(int i) {
        this.f16349a = i;
    }

    /* renamed from: a */
    private int m19905a(C7279i iVar) {
        this.f16351c.mo55069a(C7728ai.f18254f);
        this.f16352d = true;
        iVar.mo53899a();
        return 0;
    }

    /* renamed from: a */
    private long m19906a(C7772y yVar, int i) {
        int b = yVar.mo55072b();
        for (int c = yVar.mo55074c(); c < b; c++) {
            if (yVar.mo55077d()[c] == 71) {
                long a = C7292ae.m19955a(yVar, c, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    private int m19907b(C7279i iVar, C7352u uVar, int i) throws IOException {
        int min = (int) Math.min((long) this.f16349a, iVar.mo53893d());
        long j = (long) 0;
        if (iVar.mo53892c() != j) {
            uVar.f16774a = j;
            return 1;
        }
        this.f16351c.mo55067a(min);
        iVar.mo53899a();
        iVar.mo53908d(this.f16351c.mo55077d(), 0, min);
        this.f16355g = m19906a(this.f16351c, i);
        this.f16353e = true;
        return 0;
    }

    /* renamed from: b */
    private long m19908b(C7772y yVar, int i) {
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        for (int i2 = b - 188; i2 >= c; i2--) {
            if (C7292ae.m19957a(yVar.mo55077d(), c, b, i2)) {
                long a = C7292ae.m19955a(yVar, i2, i);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    private int m19909c(C7279i iVar, C7352u uVar, int i) throws IOException {
        long d = iVar.mo53893d();
        int min = (int) Math.min((long) this.f16349a, d);
        long j = d - ((long) min);
        if (iVar.mo53892c() != j) {
            uVar.f16774a = j;
            return 1;
        }
        this.f16351c.mo55067a(min);
        iVar.mo53899a();
        iVar.mo53908d(this.f16351c.mo55077d(), 0, min);
        this.f16356h = m19908b(this.f16351c, i);
        this.f16354f = true;
        return 0;
    }

    /* renamed from: a */
    public int mo54013a(C7279i iVar, C7352u uVar, int i) throws IOException {
        if (i <= 0) {
            return m19905a(iVar);
        }
        if (!this.f16354f) {
            return m19909c(iVar, uVar, i);
        }
        if (this.f16356h == -9223372036854775807L) {
            return m19905a(iVar);
        }
        if (!this.f16353e) {
            return m19907b(iVar, uVar, i);
        }
        long j = this.f16355g;
        if (j == -9223372036854775807L) {
            return m19905a(iVar);
        }
        long b = this.f16350b.mo54989b(this.f16356h) - this.f16350b.mo54989b(j);
        this.f16357i = b;
        if (b < 0) {
            C7755q.m22361c("TsDurationReader", "Invalid duration: " + this.f16357i + ". Using TIME_UNSET instead.");
            this.f16357i = -9223372036854775807L;
        }
        return m19905a(iVar);
    }

    /* renamed from: a */
    public boolean mo54014a() {
        return this.f16352d;
    }

    /* renamed from: b */
    public long mo54015b() {
        return this.f16357i;
    }

    /* renamed from: c */
    public C7726ag mo54016c() {
        return this.f16350b;
    }
}
