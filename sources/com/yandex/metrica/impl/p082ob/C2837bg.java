package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.bg */
public class C2837bg implements C2869cg {

    /* renamed from: a */
    private final boolean f7472a;

    /* renamed from: b */
    private final C2541T1 f7473b;

    /* renamed from: c */
    private final C2830b9 f7474c;

    /* renamed from: d */
    private final C3296o0 f7475d;

    /* renamed from: e */
    private final C2215K1 f7476e;

    /* renamed from: f */
    private final Handler f7477f;

    public C2837bg(C2541T1 t1, C2830b9 b9Var, Handler handler) {
        this(t1, b9Var, handler, b9Var.mo17295w());
    }

    /* renamed from: a */
    public void mo17304a() {
        if (!this.f7472a) {
            this.f7473b.mo16672a(new C2925eg(this.f7477f, this));
        }
    }

    private C2837bg(C2541T1 t1, C2830b9 b9Var, Handler handler, boolean z) {
        this(t1, b9Var, handler, z, new C3296o0(z), new C2215K1());
    }

    /* renamed from: a */
    public void mo15775a(C2895dg dgVar) {
        String str = dgVar == null ? null : dgVar.f7645a;
        if (!this.f7472a) {
            synchronized (this) {
                this.f7475d.mo17892a(this.f7476e.mo16061a(str));
            }
        }
    }

    C2837bg(C2541T1 t1, C2830b9 b9Var, Handler handler, boolean z, C3296o0 o0Var, C2215K1 k1) {
        this.f7473b = t1;
        this.f7474c = b9Var;
        this.f7472a = z;
        this.f7475d = o0Var;
        this.f7476e = k1;
        this.f7477f = handler;
    }

    /* renamed from: a */
    public synchronized void mo17306a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f7475d.mo17891a(deferredDeeplinkParametersListener);
            this.f7474c.mo17297y();
        } catch (Throwable th) {
            this.f7474c.mo17297y();
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void mo17305a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f7475d.mo17890a(deferredDeeplinkListener);
            this.f7474c.mo17297y();
        } catch (Throwable th) {
            this.f7474c.mo17297y();
            throw th;
        }
    }
}
