package com.yandex.metrica.impl.p082ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Nd */
public class C2339Nd extends C2241Kd {

    /* renamed from: h */
    private static final C2484Rd f6266h = new C2484Rd("SERVICE_API_LEVEL", (String) null);

    /* renamed from: i */
    private static final C2484Rd f6267i = new C2484Rd("CLIENT_API_LEVEL", (String) null);

    /* renamed from: f */
    private C2484Rd f6268f = new C2484Rd(f6266h.mo16560b());

    /* renamed from: g */
    private C2484Rd f6269g = new C2484Rd(f6267i.mo16560b());

    public C2339Nd(Context context) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_migrationpreferences";
    }

    /* renamed from: f */
    public int mo16357f() {
        return this.f5974b.getInt(this.f6268f.mo16558a(), -1);
    }

    /* renamed from: g */
    public C2339Nd mo16358g() {
        mo16077a(this.f6269g.mo16558a());
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public C2339Nd mo16359h() {
        mo16077a(this.f6268f.mo16558a());
        return this;
    }
}
