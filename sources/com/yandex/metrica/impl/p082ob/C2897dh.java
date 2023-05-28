package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.p082ob.C2806ah;
import com.yandex.metrica.impl.p082ob.C2947fa;

/* renamed from: com.yandex.metrica.impl.ob.dh */
public class C2897dh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2838bh f7654a;

    /* renamed from: b */
    private final ProtobufStateStorage<C2926eh> f7655b;

    /* renamed from: c */
    private final C3641x2 f7656c;

    /* renamed from: d */
    private final ICommonExecutor f7657d;

    /* renamed from: e */
    private final ActivationBarrier.IActivationBarrierCallback f7658e;

    /* renamed from: f */
    private final ActivationBarrier f7659f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2806ah f7660g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f7661h;

    /* renamed from: i */
    private C2871ci f7662i;

    /* renamed from: j */
    private boolean f7663j;

    /* renamed from: k */
    private long f7664k;

    /* renamed from: l */
    private long f7665l;

    /* renamed from: m */
    private long f7666m;

    /* renamed from: n */
    private boolean f7667n;

    /* renamed from: o */
    private boolean f7668o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f7669p;

    /* renamed from: q */
    private final Object f7670q;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    class C2898a implements C2806ah.C2807a {
        C2898a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    class C2899b implements ActivationBarrier.IActivationBarrierCallback {
        C2899b() {
        }

        public void onWaitFinished() {
            boolean unused = C2897dh.this.f7669p = true;
            C2897dh.this.f7654a.mo17307a(C2897dh.this.f7660g);
        }
    }

    public C2897dh(Context context, ICommonExecutor iCommonExecutor) {
        this(new C2838bh(context, (String) null, iCommonExecutor), C2947fa.C2949b.m9536a(C2926eh.class).mo17592a(context), new C3641x2(), iCommonExecutor, UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17462a() {
        if (!this.f7661h) {
            this.f7661h = true;
            if (!this.f7669p) {
                this.f7659f.subscribe(this.f7662i.f7617c, this.f7657d, this.f7658e);
            } else {
                this.f7654a.mo17307a(this.f7660g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17464b() {
        C2926eh ehVar = (C2926eh) this.f7655b.read();
        this.f7666m = ehVar.f7763c;
        this.f7667n = ehVar.f7764d;
        this.f7668o = ehVar.f7765e;
    }

    /* renamed from: b */
    public void mo17465b(C3356pi piVar) {
        C2871ci ciVar;
        C2871ci ciVar2;
        boolean z = true;
        if (piVar == null || ((this.f7663j || !piVar.mo17974f().f6666e) && (ciVar2 = this.f7662i) != null && ciVar2.equals(piVar.mo17957K()) && this.f7664k == piVar.mo17948B() && this.f7665l == piVar.mo17983o() && !this.f7654a.mo17309b(piVar))) {
            z = false;
        }
        synchronized (this.f7670q) {
            if (piVar != null) {
                this.f7663j = piVar.mo17974f().f6666e;
                this.f7662i = piVar.mo17957K();
                this.f7664k = piVar.mo17948B();
                this.f7665l = piVar.mo17983o();
            }
            this.f7654a.mo17308a(piVar);
        }
        if (z) {
            synchronized (this.f7670q) {
                if (this.f7663j && (ciVar = this.f7662i) != null) {
                    if (this.f7667n) {
                        if (this.f7668o) {
                            if (this.f7656c.mo18389a(this.f7666m, ciVar.f7618d, "should retry sdk collecting")) {
                                mo17462a();
                            }
                        } else if (this.f7656c.mo18389a(this.f7666m, ciVar.f7615a, "should collect sdk as usual")) {
                            mo17462a();
                        }
                    } else if (this.f7664k - this.f7665l >= ciVar.f7616b) {
                        mo17462a();
                    }
                }
            }
        }
    }

    C2897dh(C2838bh bhVar, ProtobufStateStorage<C2926eh> protobufStateStorage, C3641x2 x2Var, ICommonExecutor iCommonExecutor, ActivationBarrier activationBarrier) {
        this.f7669p = false;
        this.f7670q = new Object();
        this.f7654a = bhVar;
        this.f7655b = protobufStateStorage;
        this.f7660g = new C2806ah(protobufStateStorage, new C2898a());
        this.f7656c = x2Var;
        this.f7657d = iCommonExecutor;
        this.f7658e = new C2899b();
        this.f7659f = activationBarrier;
    }

    /* renamed from: a */
    public void mo17463a(C3356pi piVar) {
        C2926eh ehVar = (C2926eh) this.f7655b.read();
        this.f7666m = ehVar.f7763c;
        this.f7667n = ehVar.f7764d;
        this.f7668o = ehVar.f7765e;
        mo17465b(piVar);
    }
}
