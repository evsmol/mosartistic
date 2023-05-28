package com.yandex.metrica.impl.p082ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Od */
public class C2374Od extends C2241Kd {

    /* renamed from: g */
    private static final C2484Rd f6313g = new C2484Rd("PREF_KEY_OFFSET", (String) null);

    /* renamed from: f */
    private C2484Rd f6314f = new C2484Rd(f6313g.mo16560b(), (String) null);

    public C2374Od(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public long mo16394a(int i) {
        return this.f5974b.getLong(this.f6314f.mo16558a(), (long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_servertimeoffset";
    }

    /* renamed from: f */
    public void mo16395f() {
        mo16077a(this.f6314f.mo16558a()).mo16079b();
    }
}
