package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;

/* renamed from: com.yandex.metrica.impl.ob.ch */
class C2870ch implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a */
    final /* synthetic */ C2926eh f7612a;

    /* renamed from: b */
    final /* synthetic */ C2806ah f7613b;

    /* renamed from: c */
    final /* synthetic */ C2838bh f7614c;

    C2870ch(C2838bh bhVar, C2926eh ehVar, C2806ah ahVar) {
        this.f7614c = bhVar;
        this.f7612a = ehVar;
        this.f7613b = ahVar;
    }

    public String getOldETag() {
        return this.f7612a.f7762b;
    }

    public void onError() {
        this.f7613b.mo17192a();
    }

    public void onNotModified() {
        C2806ah ahVar = this.f7613b;
        C2926eh ehVar = this.f7612a;
        ahVar.mo17193a(new C2926eh(ehVar.f7761a, ehVar.f7762b, this.f7614c.f7483f.currentTimeMillis(), true, false));
    }

    public void onResponse(String str, byte[] bArr) {
        this.f7613b.mo17193a(new C2926eh(this.f7614c.f7480c.mo17311a(this.f7614c.f7481d.mo18325a(bArr, "af9202nao18gswqp")), str, this.f7614c.f7483f.currentTimeMillis(), true, false));
    }
}
