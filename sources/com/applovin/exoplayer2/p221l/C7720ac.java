package com.applovin.exoplayer2.p221l;

import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C7476h;

/* renamed from: com.applovin.exoplayer2.l.ac */
public final class C7720ac implements C7757s {

    /* renamed from: a */
    private final C7732d f18232a;

    /* renamed from: b */
    private boolean f18233b;

    /* renamed from: c */
    private long f18234c;

    /* renamed from: d */
    private long f18235d;

    /* renamed from: e */
    private C6813am f18236e = C6813am.f14830a;

    public C7720ac(C7732d dVar) {
        this.f18232a = dVar;
    }

    /* renamed from: a */
    public void mo54960a() {
        if (!this.f18233b) {
            this.f18235d = this.f18232a.mo54963a();
            this.f18233b = true;
        }
    }

    /* renamed from: a */
    public void mo54961a(long j) {
        this.f18234c = j;
        if (this.f18233b) {
            this.f18235d = this.f18232a.mo54963a();
        }
    }

    /* renamed from: a */
    public void mo53045a(C6813am amVar) {
        if (this.f18233b) {
            mo54961a(mo53054c_());
        }
        this.f18236e = amVar;
    }

    /* renamed from: b */
    public void mo54962b() {
        if (this.f18233b) {
            mo54961a(mo53054c_());
            this.f18233b = false;
        }
    }

    /* renamed from: c_ */
    public long mo53054c_() {
        long j = this.f18234c;
        if (!this.f18233b) {
            return j;
        }
        long a = this.f18232a.mo54963a() - this.f18235d;
        return j + (this.f18236e.f14832b == 1.0f ? C7476h.m20800b(a) : this.f18236e.mo52740a(a));
    }

    /* renamed from: d */
    public C6813am mo53055d() {
        return this.f18236e;
    }
}
