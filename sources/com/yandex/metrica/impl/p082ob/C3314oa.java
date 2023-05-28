package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.oa */
public class C3314oa implements C3613wa {

    /* renamed from: a */
    private final C2848bm f8505a;

    public C3314oa(C2848bm bmVar) {
        this.f8505a = bmVar;
    }

    /* renamed from: a */
    public long mo17911a(C2764Z8 z8) {
        String b = ((C2726Xl) this.f8505a).mo17070b();
        return z8.mo17437a(new C2484Rd("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b, (String) null).mo16558a(), Long.MAX_VALUE);
    }

    /* renamed from: a */
    public void mo17912a(C2764Z8 z8, long j) {
        String b = ((C2726Xl) this.f8505a).mo17070b();
        C2764Z8 z82 = (C2764Z8) z8.mo17442b(new C2484Rd("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b, (String) null).mo16558a(), j);
    }
}
