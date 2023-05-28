package com.yandex.metrica.impl.p082ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Qd */
public class C2457Qd extends C2241Kd {

    /* renamed from: f */
    private C2484Rd f6527f = new C2484Rd("LOCATION_TRACKING_ENABLED");

    public C2457Qd(Context context, String str) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_serviceproviderspreferences";
    }

    /* renamed from: f */
    public boolean mo16518f() {
        return this.f5974b.getBoolean(this.f6527f.mo16558a(), false);
    }

    /* renamed from: g */
    public void mo16519g() {
        mo16077a(this.f6527f.mo16558a()).mo16079b();
    }
}
