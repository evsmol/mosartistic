package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.An */
class C1873An extends C3519tn<C2010F2> {
    C1873An(C1905Bn bn, C2010F2 f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15475a(C3519tn<C2010F2> tnVar) {
        C2010F2 f2 = (C2010F2) this.f9176a;
        if (f2.f5384a == null ? ((C2010F2) tnVar.f9176a).f5384a != null : !f2.f5384a.equals(((C2010F2) tnVar.f9176a).f5384a)) {
            return false;
        }
        C2010F2 f22 = (C2010F2) this.f9176a;
        if (f22.f5385b != null) {
            return f22.f5385b.equals(((C2010F2) tnVar.f9176a).f5385b);
        }
        if (((C2010F2) tnVar.f9176a).f5385b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C2010F2 f2 = (C2010F2) this.f9176a;
        int i = 0;
        int hashCode = (f2.f5384a != null ? f2.f5384a.hashCode() : 0) * 31;
        C2010F2 f22 = (C2010F2) this.f9176a;
        if (f22.f5385b != null) {
            i = f22.f5385b.hashCode();
        }
        return hashCode + i;
    }
}
