package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.C10719d;
import com.yandex.metrica.impl.p082ob.C2188Jf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kh */
public class C3130kh {

    /* renamed from: a */
    private final C3160lh f8195a;

    /* renamed from: b */
    private final C10719d f8196b;

    public C3130kh() {
        this(new C3160lh(), C3322oh.m10248a());
    }

    /* renamed from: a */
    public void mo17784a(C2188Jf.C2193e.C2195b bVar) {
        this.f8196b.mo15488b("provided_request_result", this.f8195a.mo17825a(bVar));
    }

    /* renamed from: b */
    public void mo17785b(C2188Jf.C2193e.C2194a aVar) {
        String str;
        C10719d dVar = this.f8196b;
        this.f8195a.getClass();
        try {
            str = new JSONObject().put("id", aVar.f5869a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        dVar.mo15488b("provided_request_send", str);
    }

    C3130kh(C3160lh lhVar, C10719d dVar) {
        this.f8195a = lhVar;
        this.f8196b = dVar;
    }

    /* renamed from: a */
    public void mo17783a(C2188Jf.C2193e.C2194a aVar) {
        String str;
        C10719d dVar = this.f8196b;
        this.f8195a.getClass();
        try {
            str = new JSONObject().put("id", aVar.f5869a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        dVar.mo15488b("provided_request_schedule", str);
    }
}
