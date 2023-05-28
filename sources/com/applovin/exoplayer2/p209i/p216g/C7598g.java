package com.applovin.exoplayer2.p209i.p216g;

import android.text.Layout;

/* renamed from: com.applovin.exoplayer2.i.g.g */
final class C7598g {

    /* renamed from: a */
    private String f17708a;

    /* renamed from: b */
    private int f17709b;

    /* renamed from: c */
    private boolean f17710c;

    /* renamed from: d */
    private int f17711d;

    /* renamed from: e */
    private boolean f17712e;

    /* renamed from: f */
    private int f17713f = -1;

    /* renamed from: g */
    private int f17714g = -1;

    /* renamed from: h */
    private int f17715h = -1;

    /* renamed from: i */
    private int f17716i = -1;

    /* renamed from: j */
    private int f17717j = -1;

    /* renamed from: k */
    private float f17718k;

    /* renamed from: l */
    private String f17719l;

    /* renamed from: m */
    private int f17720m = -1;

    /* renamed from: n */
    private int f17721n = -1;

    /* renamed from: o */
    private Layout.Alignment f17722o;

    /* renamed from: p */
    private Layout.Alignment f17723p;

    /* renamed from: q */
    private int f17724q = -1;

    /* renamed from: r */
    private C7590b f17725r;

    /* renamed from: s */
    private float f17726s = Float.MAX_VALUE;

    /* renamed from: a */
    private C7598g m21540a(C7598g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f17710c && gVar.f17710c) {
                mo54722a(gVar.f17709b);
            }
            if (this.f17715h == -1) {
                this.f17715h = gVar.f17715h;
            }
            if (this.f17716i == -1) {
                this.f17716i = gVar.f17716i;
            }
            if (this.f17708a == null && (str = gVar.f17708a) != null) {
                this.f17708a = str;
            }
            if (this.f17713f == -1) {
                this.f17713f = gVar.f17713f;
            }
            if (this.f17714g == -1) {
                this.f17714g = gVar.f17714g;
            }
            if (this.f17721n == -1) {
                this.f17721n = gVar.f17721n;
            }
            if (this.f17722o == null && (alignment2 = gVar.f17722o) != null) {
                this.f17722o = alignment2;
            }
            if (this.f17723p == null && (alignment = gVar.f17723p) != null) {
                this.f17723p = alignment;
            }
            if (this.f17724q == -1) {
                this.f17724q = gVar.f17724q;
            }
            if (this.f17717j == -1) {
                this.f17717j = gVar.f17717j;
                this.f17718k = gVar.f17718k;
            }
            if (this.f17725r == null) {
                this.f17725r = gVar.f17725r;
            }
            if (this.f17726s == Float.MAX_VALUE) {
                this.f17726s = gVar.f17726s;
            }
            if (z && !this.f17712e && gVar.f17712e) {
                mo54729b(gVar.f17711d);
            }
            if (z && this.f17720m == -1 && (i = gVar.f17720m) != -1) {
                this.f17720m = i;
            }
        }
        return this;
    }

    /* renamed from: a */
    public int mo54720a() {
        if (this.f17715h == -1 && this.f17716i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f17715h == 1 ? 1 : 0;
        if (this.f17716i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: a */
    public C7598g mo54721a(float f) {
        this.f17726s = f;
        return this;
    }

    /* renamed from: a */
    public C7598g mo54722a(int i) {
        this.f17709b = i;
        this.f17710c = true;
        return this;
    }

    /* renamed from: a */
    public C7598g mo54723a(Layout.Alignment alignment) {
        this.f17722o = alignment;
        return this;
    }

    /* renamed from: a */
    public C7598g mo54724a(C7590b bVar) {
        this.f17725r = bVar;
        return this;
    }

    /* renamed from: a */
    public C7598g mo54725a(C7598g gVar) {
        return m21540a(gVar, true);
    }

    /* renamed from: a */
    public C7598g mo54726a(String str) {
        this.f17708a = str;
        return this;
    }

    /* renamed from: a */
    public C7598g mo54727a(boolean z) {
        this.f17713f = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public C7598g mo54728b(float f) {
        this.f17718k = f;
        return this;
    }

    /* renamed from: b */
    public C7598g mo54729b(int i) {
        this.f17711d = i;
        this.f17712e = true;
        return this;
    }

    /* renamed from: b */
    public C7598g mo54730b(Layout.Alignment alignment) {
        this.f17723p = alignment;
        return this;
    }

    /* renamed from: b */
    public C7598g mo54731b(String str) {
        this.f17719l = str;
        return this;
    }

    /* renamed from: b */
    public C7598g mo54732b(boolean z) {
        this.f17714g = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public boolean mo54733b() {
        return this.f17713f == 1;
    }

    /* renamed from: c */
    public C7598g mo54734c(int i) {
        this.f17720m = i;
        return this;
    }

    /* renamed from: c */
    public C7598g mo54735c(boolean z) {
        this.f17715h = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public boolean mo54736c() {
        return this.f17714g == 1;
    }

    /* renamed from: d */
    public C7598g mo54737d(int i) {
        this.f17721n = i;
        return this;
    }

    /* renamed from: d */
    public C7598g mo54738d(boolean z) {
        this.f17716i = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public String mo54739d() {
        return this.f17708a;
    }

    /* renamed from: e */
    public int mo54740e() {
        if (this.f17710c) {
            return this.f17709b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: e */
    public C7598g mo54741e(int i) {
        this.f17717j = i;
        return this;
    }

    /* renamed from: e */
    public C7598g mo54742e(boolean z) {
        this.f17724q = z ? 1 : 0;
        return this;
    }

    /* renamed from: f */
    public boolean mo54743f() {
        return this.f17710c;
    }

    /* renamed from: g */
    public int mo54744g() {
        if (this.f17712e) {
            return this.f17711d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: h */
    public boolean mo54745h() {
        return this.f17712e;
    }

    /* renamed from: i */
    public float mo54746i() {
        return this.f17726s;
    }

    /* renamed from: j */
    public String mo54747j() {
        return this.f17719l;
    }

    /* renamed from: k */
    public int mo54748k() {
        return this.f17720m;
    }

    /* renamed from: l */
    public int mo54749l() {
        return this.f17721n;
    }

    /* renamed from: m */
    public Layout.Alignment mo54750m() {
        return this.f17722o;
    }

    /* renamed from: n */
    public Layout.Alignment mo54751n() {
        return this.f17723p;
    }

    /* renamed from: o */
    public boolean mo54752o() {
        return this.f17724q == 1;
    }

    /* renamed from: p */
    public C7590b mo54753p() {
        return this.f17725r;
    }

    /* renamed from: q */
    public int mo54754q() {
        return this.f17717j;
    }

    /* renamed from: r */
    public float mo54755r() {
        return this.f17718k;
    }
}
