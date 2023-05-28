package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6509z0;
import java.util.Date;

/* renamed from: com.adcolony.sdk.z */
class C6505z {

    /* renamed from: a */
    private boolean f13964a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Runnable f13965b = new C6506a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Runnable f13966c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6508c f13967d;

    /* renamed from: com.adcolony.sdk.z$a */
    class C6506a implements Runnable {
        C6506a() {
        }

        public void run() {
            new C6312h0("AdColony.heartbeat", 1).mo50736c();
            C6505z.this.m15916c();
        }
    }

    /* renamed from: com.adcolony.sdk.z$b */
    class C6507b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6509z0.C6512c f13969a;

        C6507b(C6509z0.C6512c cVar) {
            this.f13969a = cVar;
        }

        public void run() {
            Runnable unused = C6505z.this.f13966c = null;
            if (C6185a.m14890d()) {
                C6328k b = C6185a.m14887b();
                if (this.f13969a.mo51114a() && b.mo50769I()) {
                    b.mo50775a();
                    C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("Controller heartbeat timeout occurred. ");
                    C6288e0.C6289a a2 = a.mo50644a("Timeout set to: " + this.f13969a.mo51115b() + " ms. ");
                    a2.mo50644a("Interval set to: " + b.mo50797h() + " ms. ").mo50644a("Heartbeat last reply: ").mo50643a((Object) C6505z.this.f13967d).mo50645a(C6288e0.f13498i);
                    C6505z.this.m15913a();
                } else if (b.mo50766F()) {
                    C6505z.this.m15913a();
                } else {
                    C6509z0.m15938a(C6505z.this.f13965b, b.mo50797h());
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.z$c */
    private static class C6508c {

        /* renamed from: a */
        private final C6294f1 f13971a;

        /* synthetic */ C6508c(C6294f1 f1Var, C6506a aVar) {
            this(f1Var);
        }

        public String toString() {
            return this.f13971a.toString();
        }

        private C6508c(C6294f1 f1Var) {
            C6294f1 m = f1Var != null ? f1Var.mo50704m("payload") : C6235c0.m15073b();
            this.f13971a = m;
            C6235c0.m15070a(m, "heartbeatLastTimestamp", C6292f0.f13504e.format(new Date()));
        }
    }

    C6505z() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15916c() {
        if (C6185a.m14890d()) {
            C6509z0.C6512c cVar = new C6509z0.C6512c(C6185a.m14887b().mo50798i());
            C6507b bVar = new C6507b(cVar);
            this.f13966c = bVar;
            C6509z0.m15938a((Runnable) bVar, cVar.mo51117d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51108b() {
        m15913a();
        this.f13964a = false;
        C6509z0.m15938a(this.f13965b, C6185a.m14887b().mo50797h());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15913a() {
        this.f13964a = true;
        C6509z0.m15957c(this.f13965b);
        C6509z0.m15957c(this.f13966c);
        this.f13966c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51107a(C6312h0 h0Var) {
        if (C6185a.m14890d() && !this.f13964a) {
            this.f13967d = new C6508c(h0Var.mo50732a(), (C6506a) null);
            Runnable runnable = this.f13966c;
            if (runnable != null) {
                C6509z0.m15957c(runnable);
                C6509z0.m15953b(this.f13966c);
                return;
            }
            C6509z0.m15957c(this.f13965b);
            C6509z0.m15938a(this.f13965b, C6185a.m14887b().mo50797h());
        }
    }
}
