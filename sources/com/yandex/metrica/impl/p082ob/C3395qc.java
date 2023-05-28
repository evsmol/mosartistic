package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C3356pi;
import com.yandex.metrica.impl.p082ob.C3598w;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.qc */
public class C3395qc implements C1967E.C1971c, C3598w.C3600b {

    /* renamed from: a */
    private List<C3316oc> f8726a;

    /* renamed from: b */
    private final C1967E f8727b;

    /* renamed from: c */
    private final C3580vc f8728c;

    /* renamed from: d */
    private final C3598w f8729d;

    /* renamed from: e */
    private volatile C3208mc f8730e;

    /* renamed from: f */
    private final Set<C3258nc> f8731f;

    /* renamed from: g */
    private final Object f8732g;

    public C3395qc(Context context) {
        this(C2007F0.m7154g().mo15741c(), C3580vc.m10884a(context), new C3356pi.C3358b(context), C2007F0.m7154g().mo15740b());
    }

    /* renamed from: d */
    private void m10473d() {
        C3208mc a = m10472a();
        if (!C1848A2.m6810a((Object) this.f8730e, (Object) a)) {
            this.f8728c.mo18328a(a);
            this.f8730e = a;
            C3208mc mcVar = this.f8730e;
            for (C3258nc a2 : this.f8731f) {
                a2.mo15942a(mcVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo18069a(C3258nc ncVar) {
        this.f8731f.add(ncVar);
    }

    /* renamed from: b */
    public void mo18071b() {
        synchronized (this.f8732g) {
            this.f8727b.mo15641a((C1967E.C1971c) this);
            this.f8729d.mo18345a((C3598w.C3600b) this);
        }
    }

    /* renamed from: c */
    public synchronized void mo18072c() {
        m10473d();
    }

    /* renamed from: a */
    public synchronized void mo18070a(C3356pi piVar) {
        this.f8726a = piVar.mo17992w();
        this.f8730e = m10472a();
        this.f8728c.mo18329a(piVar, this.f8730e);
        C3208mc mcVar = this.f8730e;
        for (C3258nc a : this.f8731f) {
            a.mo15942a(mcVar);
        }
    }

    C3395qc(C1967E e, C3580vc vcVar, C3356pi.C3358b bVar, C3598w wVar) {
        this.f8731f = new HashSet();
        this.f8732g = new Object();
        this.f8727b = e;
        this.f8728c = vcVar;
        this.f8729d = wVar;
        this.f8726a = bVar.mo18044a().mo17992w();
    }

    /* renamed from: a */
    public synchronized void mo17481a(C3598w.C3599a aVar) {
        m10473d();
    }

    /* renamed from: a */
    public synchronized void mo15644a(C1967E.C1969b.C1970a aVar) {
        m10473d();
    }

    /* renamed from: a */
    private C3208mc m10472a() {
        C3598w.C3599a c = this.f8729d.mo18348c();
        C1967E.C1969b.C1970a b = this.f8727b.mo15642b();
        for (C3316oc next : this.f8726a) {
            if (next.f8510b.f5039a.contains(b) && next.f8510b.f5040b.contains(c)) {
                return next.f8509a;
            }
        }
        return null;
    }
}
