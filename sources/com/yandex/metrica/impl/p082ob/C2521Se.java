package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3586vf;

/* renamed from: com.yandex.metrica.impl.ob.Se */
public abstract class C2521Se implements C2120Ie, C2836bf {

    /* renamed from: a */
    private final String f6647a;

    /* renamed from: b */
    private final int f6648b;

    /* renamed from: c */
    private final C2252Kn<String> f6649c;

    /* renamed from: d */
    private final C2242Ke f6650d;

    /* renamed from: e */
    private C2875cm f6651e = C2642Ul.m8745a();

    C2521Se(int i, String str, C2252Kn<String> kn, C2242Ke ke) {
        this.f6648b = i;
        this.f6647a = str;
        this.f6649c = kn;
        this.f6650d = ke;
    }

    /* renamed from: a */
    public final C3586vf.C3587a mo16611a() {
        C3586vf.C3587a aVar = new C3586vf.C3587a();
        aVar.f9341b = this.f6648b;
        aVar.f9340a = this.f6647a.getBytes();
        aVar.f9343d = new C3586vf.C3589c();
        aVar.f9342c = new C3586vf.C3588b();
        return aVar;
    }

    /* renamed from: b */
    public C2242Ke mo16613b() {
        return this.f6650d;
    }

    /* renamed from: c */
    public String mo16614c() {
        return this.f6647a;
    }

    /* renamed from: d */
    public int mo16615d() {
        return this.f6648b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo16616e() {
        C2167In a = this.f6649c.mo15517a(this.f6647a);
        if (a.mo15965b()) {
            return true;
        }
        if (!this.f6651e.isEnabled()) {
            return false;
        }
        C2875cm cmVar = this.f6651e;
        cmVar.mo15283w("Attribute " + this.f6647a + " of type " + C2770Ze.m8962a(this.f6648b) + " is skipped because " + a.mo15964a());
        return false;
    }

    /* renamed from: a */
    public void mo16612a(C2875cm cmVar) {
        this.f6651e = cmVar;
    }
}
