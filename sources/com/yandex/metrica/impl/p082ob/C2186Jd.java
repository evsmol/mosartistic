package com.yandex.metrica.impl.p082ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Jd */
public class C2186Jd extends C2241Kd {

    /* renamed from: j */
    public static final /* synthetic */ int f5847j = 0;

    /* renamed from: f */
    private final C2484Rd f5848f = new C2484Rd("init_event_pref_key", mo16080c());

    /* renamed from: g */
    private final C2484Rd f5849g = new C2484Rd("init_event_pref_key");

    /* renamed from: h */
    private final C2484Rd f5850h = new C2484Rd("first_event_pref_key", mo16080c());

    /* renamed from: i */
    private final C2484Rd f5851i = new C2484Rd("fitst_event_description_key", mo16080c());

    public C2186Jd(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    private void m7514a(C2484Rd rd) {
        this.f5974b.edit().remove(rd.mo16558a()).apply();
    }

    @Deprecated
    /* renamed from: b */
    public String mo15995b(String str) {
        return this.f5974b.getString(this.f5849g.mo16558a(), (String) null);
    }

    /* renamed from: c */
    public String mo15996c(String str) {
        return this.f5974b.getString(this.f5850h.mo16558a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_initpreferences";
    }

    /* renamed from: d */
    public String mo15998d(String str) {
        return this.f5974b.getString(this.f5848f.mo16558a(), (String) null);
    }

    @Deprecated
    /* renamed from: f */
    public void mo15999f() {
        m7514a(this.f5849g);
    }

    /* renamed from: g */
    public void mo16000g() {
        m7514a(this.f5851i);
    }

    /* renamed from: h */
    public void mo16001h() {
        m7514a(this.f5850h);
    }

    /* renamed from: i */
    public void mo16002i() {
        m7514a(this.f5848f);
    }

    /* renamed from: j */
    public void mo16003j() {
        mo16078a(this.f5848f.mo16558a(), "DONE").mo16079b();
    }
}
