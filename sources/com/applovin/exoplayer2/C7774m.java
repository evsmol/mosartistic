package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7720ac;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7757s;

/* renamed from: com.applovin.exoplayer2.m */
final class C7774m implements C7757s {

    /* renamed from: a */
    private final C7720ac f18351a;

    /* renamed from: b */
    private final C7775a f18352b;

    /* renamed from: c */
    private C6827ar f18353c;

    /* renamed from: d */
    private C7757s f18354d;

    /* renamed from: e */
    private boolean f18355e = true;

    /* renamed from: f */
    private boolean f18356f;

    /* renamed from: com.applovin.exoplayer2.m$a */
    public interface C7775a {
        /* renamed from: a */
        void mo55118a(C6813am amVar);
    }

    public C7774m(C7775a aVar, C7732d dVar) {
        this.f18352b = aVar;
        this.f18351a = new C7720ac(dVar);
    }

    /* renamed from: b */
    private void m22486b(boolean z) {
        if (m22487c(z)) {
            this.f18355e = true;
            if (this.f18356f) {
                this.f18351a.mo54960a();
                return;
            }
            return;
        }
        C7757s sVar = (C7757s) C7717a.m22120b(this.f18354d);
        long c_ = sVar.mo53054c_();
        if (this.f18355e) {
            if (c_ < this.f18351a.mo53054c_()) {
                this.f18351a.mo54962b();
                return;
            }
            this.f18355e = false;
            if (this.f18356f) {
                this.f18351a.mo54960a();
            }
        }
        this.f18351a.mo54961a(c_);
        C6813am d = sVar.mo53055d();
        if (!d.equals(this.f18351a.mo53055d())) {
            this.f18351a.mo53045a(d);
            this.f18352b.mo55118a(d);
        }
    }

    /* renamed from: c */
    private boolean m22487c(boolean z) {
        C6827ar arVar = this.f18353c;
        return arVar == null || arVar.mo52825A() || (!this.f18353c.mo52847z() && (z || this.f18353c.mo52838g()));
    }

    /* renamed from: a */
    public long mo55112a(boolean z) {
        m22486b(z);
        return mo53054c_();
    }

    /* renamed from: a */
    public void mo55113a() {
        this.f18356f = true;
        this.f18351a.mo54960a();
    }

    /* renamed from: a */
    public void mo55114a(long j) {
        this.f18351a.mo54961a(j);
    }

    /* renamed from: a */
    public void mo53045a(C6813am amVar) {
        C7757s sVar = this.f18354d;
        if (sVar != null) {
            sVar.mo53045a(amVar);
            amVar = this.f18354d.mo53055d();
        }
        this.f18351a.mo53045a(amVar);
    }

    /* renamed from: a */
    public void mo55115a(C6827ar arVar) throws C7819p {
        C7757s sVar;
        C7757s c = arVar.mo52834c();
        if (c != null && c != (sVar = this.f18354d)) {
            if (sVar == null) {
                this.f18354d = c;
                this.f18353c = arVar;
                c.mo53045a(this.f18351a.mo53055d());
                return;
            }
            throw C7819p.m22726a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: b */
    public void mo55116b() {
        this.f18356f = false;
        this.f18351a.mo54962b();
    }

    /* renamed from: b */
    public void mo55117b(C6827ar arVar) {
        if (arVar == this.f18353c) {
            this.f18354d = null;
            this.f18353c = null;
            this.f18355e = true;
        }
    }

    /* renamed from: c_ */
    public long mo53054c_() {
        return this.f18355e ? this.f18351a.mo53054c_() : ((C7757s) C7717a.m22120b(this.f18354d)).mo53054c_();
    }

    /* renamed from: d */
    public C6813am mo53055d() {
        C7757s sVar = this.f18354d;
        return sVar != null ? sVar.mo53055d() : this.f18351a.mo53055d();
    }
}
