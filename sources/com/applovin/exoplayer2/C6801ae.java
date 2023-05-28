package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.ae */
final class C6801ae {

    /* renamed from: a */
    public final C7509p.C7510a f14758a;

    /* renamed from: b */
    public final long f14759b;

    /* renamed from: c */
    public final long f14760c;

    /* renamed from: d */
    public final long f14761d;

    /* renamed from: e */
    public final long f14762e;

    /* renamed from: f */
    public final boolean f14763f;

    /* renamed from: g */
    public final boolean f14764g;

    /* renamed from: h */
    public final boolean f14765h;

    /* renamed from: i */
    public final boolean f14766i;

    C6801ae(C7509p.C7510a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = false;
        C7717a.m22118a(!z8 || z6);
        C7717a.m22118a(!z7 || z6);
        if (!z5 || (!z6 && !z7 && !z8)) {
            z9 = true;
        }
        C7717a.m22118a(z9);
        this.f14758a = aVar;
        this.f14759b = j;
        this.f14760c = j2;
        this.f14761d = j3;
        this.f14762e = j4;
        this.f14763f = z5;
        this.f14764g = z6;
        this.f14765h = z7;
        this.f14766i = z8;
    }

    /* renamed from: a */
    public C6801ae mo52691a(long j) {
        if (j == this.f14759b) {
            return this;
        }
        return new C6801ae(this.f14758a, j, this.f14760c, this.f14761d, this.f14762e, this.f14763f, this.f14764g, this.f14765h, this.f14766i);
    }

    /* renamed from: b */
    public C6801ae mo52692b(long j) {
        if (j == this.f14760c) {
            return this;
        }
        return new C6801ae(this.f14758a, this.f14759b, j, this.f14761d, this.f14762e, this.f14763f, this.f14764g, this.f14765h, this.f14766i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6801ae aeVar = (C6801ae) obj;
        return this.f14759b == aeVar.f14759b && this.f14760c == aeVar.f14760c && this.f14761d == aeVar.f14761d && this.f14762e == aeVar.f14762e && this.f14763f == aeVar.f14763f && this.f14764g == aeVar.f14764g && this.f14765h == aeVar.f14765h && this.f14766i == aeVar.f14766i && C7728ai.m22218a((Object) this.f14758a, (Object) aeVar.f14758a);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f14758a.hashCode()) * 31) + ((int) this.f14759b)) * 31) + ((int) this.f14760c)) * 31) + ((int) this.f14761d)) * 31) + ((int) this.f14762e)) * 31) + (this.f14763f ? 1 : 0)) * 31) + (this.f14764g ? 1 : 0)) * 31) + (this.f14765h ? 1 : 0)) * 31) + (this.f14766i ? 1 : 0);
    }
}
