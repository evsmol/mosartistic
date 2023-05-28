package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.g.m */
final class C7260m {

    /* renamed from: a */
    public C7243c f16248a;

    /* renamed from: b */
    public long f16249b;

    /* renamed from: c */
    public long f16250c;

    /* renamed from: d */
    public long f16251d;

    /* renamed from: e */
    public int f16252e;

    /* renamed from: f */
    public int f16253f;

    /* renamed from: g */
    public long[] f16254g = new long[0];

    /* renamed from: h */
    public int[] f16255h = new int[0];

    /* renamed from: i */
    public int[] f16256i = new int[0];

    /* renamed from: j */
    public int[] f16257j = new int[0];

    /* renamed from: k */
    public long[] f16258k = new long[0];

    /* renamed from: l */
    public boolean[] f16259l = new boolean[0];

    /* renamed from: m */
    public boolean f16260m;

    /* renamed from: n */
    public boolean[] f16261n = new boolean[0];

    /* renamed from: o */
    public C7259l f16262o;

    /* renamed from: p */
    public final C7772y f16263p = new C7772y();

    /* renamed from: q */
    public boolean f16264q;

    /* renamed from: r */
    public long f16265r;

    /* renamed from: s */
    public boolean f16266s;

    /* renamed from: a */
    public void mo53979a() {
        this.f16252e = 0;
        this.f16265r = 0;
        this.f16266s = false;
        this.f16260m = false;
        this.f16264q = false;
        this.f16262o = null;
    }

    /* renamed from: a */
    public void mo53980a(int i) {
        this.f16263p.mo55067a(i);
        this.f16260m = true;
        this.f16264q = true;
    }

    /* renamed from: a */
    public void mo53981a(int i, int i2) {
        this.f16252e = i;
        this.f16253f = i2;
        if (this.f16255h.length < i) {
            this.f16254g = new long[i];
            this.f16255h = new int[i];
        }
        if (this.f16256i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f16256i = new int[i3];
            this.f16257j = new int[i3];
            this.f16258k = new long[i3];
            this.f16259l = new boolean[i3];
            this.f16261n = new boolean[i3];
        }
    }

    /* renamed from: a */
    public void mo53982a(C7279i iVar) throws IOException {
        iVar.mo53903b(this.f16263p.mo55077d(), 0, this.f16263p.mo55072b());
        this.f16263p.mo55076d(0);
        this.f16264q = false;
    }

    /* renamed from: a */
    public void mo53983a(C7772y yVar) {
        yVar.mo55071a(this.f16263p.mo55077d(), 0, this.f16263p.mo55072b());
        this.f16263p.mo55076d(0);
        this.f16264q = false;
    }

    /* renamed from: b */
    public long mo53984b(int i) {
        return this.f16258k[i] + ((long) this.f16257j[i]);
    }

    /* renamed from: c */
    public boolean mo53985c(int i) {
        return this.f16260m && this.f16261n[i];
    }
}
