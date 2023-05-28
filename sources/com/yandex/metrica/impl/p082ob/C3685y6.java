package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.C10718c;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.y6 */
public abstract class C3685y6 implements C1854A6 {

    /* renamed from: a */
    private final C3686a f9490a;

    /* renamed from: b */
    private final C10718c f9491b;

    /* renamed from: c */
    private final C1841A0 f9492c;

    /* renamed from: com.yandex.metrica.impl.ob.y6$a */
    public interface C3686a {
        /* renamed from: a */
        boolean mo16238a(Throwable th);
    }

    C3685y6(C3686a aVar, C10718c cVar, C1841A0 a0) {
        this.f9490a = aVar;
        this.f9491b = cVar;
        this.f9492c = a0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo15583a(C2085H6 h6);

    /* renamed from: a */
    public void mo15440a(Throwable th, C3607w6 w6Var) {
        if (this.f9490a.mo16238a(th)) {
            C10718c cVar = this.f9491b;
            if (cVar == null || th == null || (th = cVar.mo64733a(th)) != null) {
                mo15583a(C2111I6.m7361a(th, w6Var, (List<StackTraceElement>) null, this.f9492c.mo15408a(), this.f9492c.mo15409b()));
            }
        }
    }
}
