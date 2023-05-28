package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2578U1;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.v6 */
public class C3570v6 {

    /* renamed from: a */
    private final C2332N6 f9304a;

    public C3570v6() {
        this(new C2332N6());
    }

    /* renamed from: a */
    public C2578U1.C2584f mo18322a(C2085H6 h6, C2445Q1 q1) {
        String b;
        C2016F6 f6 = h6.f5512a;
        String str = "";
        if (!(f6 == null || (b = f6.mo15779b()) == null)) {
            str = b;
        }
        byte[] a = this.f9304a.mo16340a(h6);
        C2875cm b2 = C2642Ul.m8746b(q1.mo18444b().mo64607a());
        List<Integer> list = C3716z0.f9563i;
        C2168J j = new C2168J(a, str, C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo17139b(), b2);
        j.mo17332c(q1.mo16503d());
        return new C2578U1.C2584f(j, q1).mo16746a(j.mo15973t()).mo16747a(true);
    }

    C3570v6(C2332N6 n6) {
        this.f9304a = n6;
    }
}
