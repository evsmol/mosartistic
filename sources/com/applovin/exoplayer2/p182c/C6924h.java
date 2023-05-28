package com.applovin.exoplayer2.p182c;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.c.h */
public final class C6924h {

    /* renamed from: a */
    public final String f15340a;

    /* renamed from: b */
    public final C7864v f15341b;

    /* renamed from: c */
    public final C7864v f15342c;

    /* renamed from: d */
    public final int f15343d;

    /* renamed from: e */
    public final int f15344e;

    public C6924h(String str, C7864v vVar, C7864v vVar2, int i, int i2) {
        C7717a.m22118a(i == 0 || i2 == 0);
        this.f15340a = C7717a.m22117a(str);
        this.f15341b = (C7864v) C7717a.m22120b(vVar);
        this.f15342c = (C7864v) C7717a.m22120b(vVar2);
        this.f15343d = i;
        this.f15344e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6924h hVar = (C6924h) obj;
        return this.f15343d == hVar.f15343d && this.f15344e == hVar.f15344e && this.f15340a.equals(hVar.f15340a) && this.f15341b.equals(hVar.f15341b) && this.f15342c.equals(hVar.f15342c);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15343d) * 31) + this.f15344e) * 31) + this.f15340a.hashCode()) * 31) + this.f15341b.hashCode()) * 31) + this.f15342c.hashCode();
    }
}
