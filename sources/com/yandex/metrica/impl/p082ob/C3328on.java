package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.on */
public class C3328on extends C3519tn<C3555uj> {

    /* renamed from: com.yandex.metrica.impl.ob.on$a */
    public static class C3329a implements C3561un<C3555uj> {
        /* renamed from: a */
        public C3519tn mo15574a(Object obj) {
            return new C3328on((C3555uj) obj);
        }
    }

    public C3328on(C3555uj ujVar) {
        super(ujVar);
    }

    /* renamed from: a */
    public boolean mo15475a(C3519tn<C3555uj> tnVar) {
        T t = (C3555uj) tnVar.f9176a;
        T t2 = this.f9176a;
        if (t2 == t) {
            return true;
        }
        if (((C3555uj) t2).mo18277c() != t.mo18277c()) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18285k() == null ? t.mo18285k() != null : !((C3555uj) this.f9176a).mo18285k().equals(t.mo18285k())) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18286l() == null ? t.mo18286l() != null : !((C3555uj) this.f9176a).mo18286l().equals(t.mo18286l())) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18279e() == null ? t.mo18279e() != null : !((C3555uj) this.f9176a).mo18279e().equals(t.mo18279e())) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18276b() == null ? t.mo18276b() != null : !((C3555uj) this.f9176a).mo18276b().equals(t.mo18276b())) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18287m() == null ? t.mo18287m() != null : !((C3555uj) this.f9176a).mo18287m().equals(t.mo18287m())) {
            return false;
        }
        if (((C3555uj) this.f9176a).mo18289o() != null) {
            return ((C3555uj) this.f9176a).mo18289o().equals(t.mo18289o());
        }
        if (t.mo18289o() == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((C3555uj) this.f9176a).mo18285k() != null ? ((C3555uj) this.f9176a).mo18285k().hashCode() : 0) * 31) + (((C3555uj) this.f9176a).mo18286l() != null ? ((C3555uj) this.f9176a).mo18286l().hashCode() : 0)) * 31) + (((C3555uj) this.f9176a).mo18279e() != null ? ((C3555uj) this.f9176a).mo18279e().hashCode() : 0)) * 31) + (((C3555uj) this.f9176a).mo18276b() != null ? ((C3555uj) this.f9176a).mo18276b().hashCode() : 0)) * 31) + (((C3555uj) this.f9176a).mo18287m() != null ? ((C3555uj) this.f9176a).mo18287m().hashCode() : 0)) * 31) + ((C3555uj) this.f9176a).mo18277c()) * 31;
        if (((C3555uj) this.f9176a).mo18289o() != null) {
            i = ((C3555uj) this.f9176a).mo18289o().hashCode();
        }
        return hashCode + i;
    }
}
