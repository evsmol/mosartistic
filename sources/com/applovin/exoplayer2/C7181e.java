package com.applovin.exoplayer2;

import com.applovin.exoplayer2.C6827ar;
import com.applovin.exoplayer2.C6829as;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p206h.C7534x;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7757s;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e */
public abstract class C7181e implements C6827ar, C6829as {

    /* renamed from: a */
    private final int f15763a;

    /* renamed from: b */
    private final C7867w f15764b = new C7867w();

    /* renamed from: c */
    private C6830at f15765c;

    /* renamed from: d */
    private int f15766d;

    /* renamed from: e */
    private int f15767e;

    /* renamed from: f */
    private C7534x f15768f;

    /* renamed from: g */
    private C7864v[] f15769g;

    /* renamed from: h */
    private long f15770h;

    /* renamed from: i */
    private long f15771i;

    /* renamed from: j */
    private long f15772j = Long.MIN_VALUE;

    /* renamed from: k */
    private boolean f15773k;

    /* renamed from: l */
    private boolean f15774l;

    public C7181e(int i) {
        this.f15763a = i;
    }

    /* renamed from: a */
    public final int mo52826a() {
        return this.f15763a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo53848a(C7867w wVar, C6922g gVar, int i) {
        int a = ((C7534x) C7717a.m22120b(this.f15768f)).mo54512a(wVar, gVar, i);
        if (a == -4) {
            if (gVar.mo53126c()) {
                this.f15772j = Long.MIN_VALUE;
                return this.f15773k ? -4 : -3;
            }
            gVar.f15334d += this.f15770h;
            this.f15772j = Math.max(this.f15772j, gVar.f15334d);
        } else if (a == -5) {
            C7864v vVar = (C7864v) C7717a.m22120b(wVar.f18967b);
            if (vVar.f18925p != Long.MAX_VALUE) {
                wVar.f18967b = vVar.mo55408a().mo55417a(vVar.f18925p + this.f15770h).mo55424a();
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7819p mo53849a(Throwable th, C7864v vVar, int i) {
        return mo53850a(th, vVar, false, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7819p mo53850a(Throwable th, C7864v vVar, boolean z, int i) {
        int i2;
        if (vVar != null && !this.f15774l) {
            this.f15774l = true;
            try {
                int c = C6829as.CC.m17729c(mo52851a(vVar));
                this.f15774l = false;
                i2 = c;
            } catch (C7819p unused) {
                this.f15774l = false;
            } catch (Throwable th2) {
                this.f15774l = false;
                throw th2;
            }
            return C7819p.m22728a(th, mo52846y(), mo53856w(), vVar, i2, z, i);
        }
        i2 = 4;
        return C7819p.m22728a(th, mo52846y(), mo53856w(), vVar, i2, z, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52827a(float f, float f2) throws C7819p {
        C6827ar.CC.$default$a(this, f, f2);
    }

    /* renamed from: a */
    public final void mo52828a(int i) {
        this.f15766d = i;
    }

    /* renamed from: a */
    public void mo52821a(int i, Object obj) throws C7819p {
    }

    /* renamed from: a */
    public final void mo52829a(long j) throws C7819p {
        this.f15773k = false;
        this.f15771i = j;
        this.f15772j = j;
        mo53044a(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53044a(long j, boolean z) throws C7819p {
    }

    /* renamed from: a */
    public final void mo52831a(C6830at atVar, C7864v[] vVarArr, C7534x xVar, long j, boolean z, boolean z2, long j2, long j3) throws C7819p {
        long j4 = j;
        boolean z3 = z;
        C7717a.m22121b(this.f15767e == 0);
        this.f15765c = atVar;
        this.f15767e = 1;
        this.f15771i = j4;
        mo53051a(z3, z2);
        mo52832a(vVarArr, xVar, j2, j3);
        mo53044a(j4, z3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53051a(boolean z, boolean z2) throws C7819p {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53851a(C7864v[] vVarArr, long j, long j2) throws C7819p {
    }

    /* renamed from: a */
    public final void mo52832a(C7864v[] vVarArr, C7534x xVar, long j, long j2) throws C7819p {
        C7717a.m22121b(!this.f15773k);
        this.f15768f = xVar;
        if (this.f15772j == Long.MIN_VALUE) {
            this.f15772j = j;
        }
        this.f15769g = vVarArr;
        this.f15770h = j2;
        mo53851a(vVarArr, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo53852b(long j) {
        return ((C7534x) C7717a.m22120b(this.f15768f)).mo54511a(j - this.f15770h);
    }

    /* renamed from: b */
    public final C6829as mo52833b() {
        return this;
    }

    /* renamed from: c */
    public C7757s mo52834c() {
        return null;
    }

    /* renamed from: d_ */
    public final int mo52835d_() {
        return this.f15767e;
    }

    /* renamed from: e */
    public final void mo52836e() throws C7819p {
        boolean z = true;
        if (this.f15767e != 1) {
            z = false;
        }
        C7717a.m22121b(z);
        this.f15767e = 2;
        mo53056p();
    }

    /* renamed from: f */
    public final C7534x mo52837f() {
        return this.f15768f;
    }

    /* renamed from: g */
    public final boolean mo52838g() {
        return this.f15772j == Long.MIN_VALUE;
    }

    /* renamed from: h */
    public final long mo52839h() {
        return this.f15772j;
    }

    /* renamed from: i */
    public final void mo52840i() {
        this.f15773k = true;
    }

    /* renamed from: j */
    public final boolean mo52841j() {
        return this.f15773k;
    }

    /* renamed from: k */
    public final void mo52842k() throws IOException {
        ((C7534x) C7717a.m22120b(this.f15768f)).mo54515c();
    }

    /* renamed from: l */
    public final void mo52843l() {
        C7717a.m22121b(this.f15767e == 2);
        this.f15767e = 1;
        mo53057q();
    }

    /* renamed from: m */
    public final void mo52844m() {
        boolean z = true;
        if (this.f15767e != 1) {
            z = false;
        }
        C7717a.m22121b(z);
        this.f15764b.mo55447a();
        this.f15767e = 0;
        this.f15768f = null;
        this.f15769g = null;
        this.f15773k = false;
        mo53058r();
    }

    /* renamed from: n */
    public final void mo52845n() {
        C7717a.m22121b(this.f15767e == 0);
        this.f15764b.mo55447a();
        mo53059s();
    }

    /* renamed from: o */
    public int mo52852o() throws C7819p {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo53056p() throws C7819p {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo53057q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo53058r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo53059s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C7867w mo53853t() {
        this.f15764b.mo55447a();
        return this.f15764b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C7864v[] mo53854u() {
        return (C7864v[]) C7717a.m22120b(this.f15769g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C6830at mo53855v() {
        return (C6830at) C7717a.m22120b(this.f15765c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo53856w() {
        return this.f15766d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo53857x() {
        return mo52838g() ? this.f15773k : ((C7534x) C7717a.m22120b(this.f15768f)).mo54514b();
    }
}
