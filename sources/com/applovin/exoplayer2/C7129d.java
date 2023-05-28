package com.applovin.exoplayer2;

import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6904ba;

/* renamed from: com.applovin.exoplayer2.d */
public abstract class C7129d implements C6814an {

    /* renamed from: a */
    protected final C6904ba.C6908c f15644a = new C6904ba.C6908c();

    protected C7129d() {
    }

    /* renamed from: b */
    private void mo55244b(long j) {
        long I = mo52752I() + j;
        long H = mo52751H();
        if (H != -9223372036854775807L) {
            I = Math.min(I, H);
        }
        mo52766a(Math.max(I, 0));
    }

    /* renamed from: q */
    private int mo52868q() {
        int y = mo52790y();
        if (y == 1) {
            return 0;
        }
        return y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6814an.C6816a mo53731a(C6814an.C6816a aVar) {
        boolean z = true;
        C6814an.C6816a.C6817a a = new C6814an.C6816a.C6817a().mo52797a(aVar).mo52796a(3, !mo52754K()).mo52796a(4, mo52783o() && !mo52754K()).mo52796a(5, mo53732a_() && !mo52754K()).mo52796a(6, !mo52762S().mo53081d() && (mo53732a_() || !mo53741n() || mo52783o()) && !mo52754K()).mo52796a(7, mo53736h() && !mo52754K()).mo52796a(8, !mo52762S().mo53081d() && (mo53736h() || (mo53741n() && mo53740m())) && !mo52754K()).mo52796a(9, !mo52754K()).mo52796a(10, mo52783o() && !mo52754K());
        if (!mo52783o() || mo52754K()) {
            z = false;
        }
        return a.mo52796a(11, z).mo52799a();
    }

    /* renamed from: a */
    public final void mo52766a(long j) {
        mo52765a(mo52750G(), j);
    }

    /* renamed from: a */
    public final boolean mo52771a() {
        return mo52786t() == 3 && mo52789x() && mo52787u() == 0;
    }

    /* renamed from: a */
    public final boolean mo52772a(int i) {
        return mo52785s().mo52792a(i);
    }

    /* renamed from: a_ */
    public final boolean mo53732a_() {
        return mo53739l() != -1;
    }

    /* renamed from: b */
    public final void mo53733b(int i) {
        mo52765a(i, -9223372036854775807L);
    }

    /* renamed from: b_ */
    public final void mo53734b_() {
        mo53733b(mo52750G());
    }

    /* renamed from: c */
    public final void mo52777c() {
        mo55244b(-mo52745A());
    }

    /* renamed from: d */
    public final void mo52779d() {
        mo55244b(mo52746B());
    }

    /* renamed from: f */
    public final void mo53735f() {
        int l = mo53739l();
        if (l != -1) {
            mo53733b(l);
        }
    }

    /* renamed from: g */
    public final void mo52781g() {
        if (!mo52762S().mo53081d() && !mo52754K()) {
            boolean a_ = mo53732a_();
            if (!mo53741n() || mo52783o()) {
                if (!a_ || mo52752I() > mo52747C()) {
                    mo52766a(0);
                    return;
                }
            } else if (!a_) {
                return;
            }
            mo53735f();
        }
    }

    /* renamed from: h */
    public final boolean mo53736h() {
        return mo53738k() != -1;
    }

    /* renamed from: i */
    public final void mo53737i() {
        int k = mo53738k();
        if (k != -1) {
            mo53733b(k);
        }
    }

    /* renamed from: j */
    public final void mo52782j() {
        if (!mo52762S().mo53081d() && !mo52754K()) {
            if (mo53736h()) {
                mo53737i();
            } else if (mo53741n() && mo53740m()) {
                mo53734b_();
            }
        }
    }

    /* renamed from: k */
    public final int mo53738k() {
        C6904ba S = mo52762S();
        if (S.mo53081d()) {
            return -1;
        }
        return S.mo52438a(mo52750G(), mo52868q(), mo52791z());
    }

    /* renamed from: l */
    public final int mo53739l() {
        C6904ba S = mo52762S();
        if (S.mo53081d()) {
            return -1;
        }
        return S.mo52445b(mo52750G(), mo52868q(), mo52791z());
    }

    /* renamed from: m */
    public final boolean mo53740m() {
        C6904ba S = mo52762S();
        return !S.mo53081d() && S.mo53079a(mo52750G(), this.f15644a).f15279j;
    }

    /* renamed from: n */
    public final boolean mo53741n() {
        C6904ba S = mo52762S();
        return !S.mo53081d() && S.mo53079a(mo52750G(), this.f15644a).mo53109e();
    }

    /* renamed from: o */
    public final boolean mo52783o() {
        C6904ba S = mo52762S();
        return !S.mo53081d() && S.mo53079a(mo52750G(), this.f15644a).f15278i;
    }

    /* renamed from: p */
    public final long mo53742p() {
        C6904ba S = mo52762S();
        if (S.mo53081d()) {
            return -9223372036854775807L;
        }
        return S.mo53079a(mo52750G(), this.f15644a).mo53107c();
    }
}
