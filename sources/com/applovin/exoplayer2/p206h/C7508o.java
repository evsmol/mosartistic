package com.applovin.exoplayer2.p206h;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.h.o */
public class C7508o {

    /* renamed from: a */
    public final Object f17251a;

    /* renamed from: b */
    public final int f17252b;

    /* renamed from: c */
    public final int f17253c;

    /* renamed from: d */
    public final long f17254d;

    /* renamed from: e */
    public final int f17255e;

    protected C7508o(C7508o oVar) {
        this.f17251a = oVar.f17251a;
        this.f17252b = oVar.f17252b;
        this.f17253c = oVar.f17253c;
        this.f17254d = oVar.f17254d;
        this.f17255e = oVar.f17255e;
    }

    public C7508o(Object obj) {
        this(obj, -1);
    }

    public C7508o(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private C7508o(Object obj, int i, int i2, long j, int i3) {
        this.f17251a = obj;
        this.f17252b = i;
        this.f17253c = i2;
        this.f17254d = j;
        this.f17255e = i3;
    }

    public C7508o(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C7508o(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    /* renamed from: a */
    public C7508o mo54545a(Object obj) {
        if (this.f17251a.equals(obj)) {
            return this;
        }
        return new C7508o(obj, this.f17252b, this.f17253c, this.f17254d, this.f17255e);
    }

    /* renamed from: a */
    public boolean mo54546a() {
        return this.f17252b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7508o)) {
            return false;
        }
        C7508o oVar = (C7508o) obj;
        return this.f17251a.equals(oVar.f17251a) && this.f17252b == oVar.f17252b && this.f17253c == oVar.f17253c && this.f17254d == oVar.f17254d && this.f17255e == oVar.f17255e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f17251a.hashCode()) * 31) + this.f17252b) * 31) + this.f17253c) * 31) + ((int) this.f17254d)) * 31) + this.f17255e;
    }
}
