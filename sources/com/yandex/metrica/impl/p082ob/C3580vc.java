package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.p082ob.C3356pi;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.vc */
public class C3580vc {

    /* renamed from: n */
    private static volatile C3580vc f9317n;

    /* renamed from: o */
    public static final long f9318o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p */
    private static final Object f9319p = new Object();

    /* renamed from: q */
    public static final /* synthetic */ int f9320q = 0;

    /* renamed from: a */
    private final WeakHashMap<Object, Object> f9321a;

    /* renamed from: b */
    private boolean f9322b = false;

    /* renamed from: c */
    private C3208mc f9323c;

    /* renamed from: d */
    private C3356pi f9324d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2306Mc f9325e;

    /* renamed from: f */
    private C3583c f9326f;

    /* renamed from: g */
    private Runnable f9327g;

    /* renamed from: h */
    private final C2517Sb f9328h;

    /* renamed from: i */
    private final C2594U7 f9329i;

    /* renamed from: j */
    private final C2555T7 f9330j;

    /* renamed from: k */
    private final C1987Ed f9331k;

    /* renamed from: l */
    private boolean f9332l = false;

    /* renamed from: m */
    private final Object f9333m = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.vc$a */
    class C3581a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3356pi f9334a;

        C3581a(C3356pi piVar) {
            this.f9334a = piVar;
        }

        public void run() {
            if (C3580vc.this.f9325e != null) {
                C3580vc.this.f9325e.mo16276a(this.f9334a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$b */
    class C3582b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3208mc f9336a;

        C3582b(C3208mc mcVar) {
            this.f9336a = mcVar;
        }

        public void run() {
            if (C3580vc.this.f9325e != null) {
                C3580vc.this.f9325e.mo16275a(this.f9336a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$c */
    static class C3583c {
        C3583c() {
        }
    }

    C3580vc(Context context, C3617wc wcVar, C3583c cVar, C3356pi piVar) {
        this.f9328h = new C2517Sb(context, wcVar.mo18363a(), wcVar.mo18366d());
        this.f9329i = wcVar.mo18365c();
        this.f9330j = wcVar.mo18364b();
        this.f9331k = wcVar.mo18367e();
        this.f9321a = new WeakHashMap<>();
        this.f9326f = cVar;
        this.f9324d = piVar;
    }

    /* renamed from: b */
    public void mo18332b(Object obj) {
        synchronized (this.f9333m) {
            this.f9321a.remove(obj);
            m10885b();
        }
    }

    /* renamed from: a */
    public static C3580vc m10884a(Context context) {
        if (f9317n == null) {
            synchronized (f9319p) {
                if (f9317n == null) {
                    Context applicationContext = context.getApplicationContext();
                    f9317n = new C3580vc(applicationContext, new C3617wc(applicationContext), new C3583c(), new C3356pi.C3358b(applicationContext).mo18044a());
                }
            }
        }
        return f9317n;
    }

    /* renamed from: b */
    private void m10885b() {
        if (this.f9332l) {
            if (!this.f9322b || this.f9321a.isEmpty()) {
                this.f9328h.f6632b.execute(new C3476sc(this));
                Runnable runnable = this.f9327g;
                if (runnable != null) {
                    this.f9328h.f6632b.remove(runnable);
                }
                this.f9332l = false;
            }
        } else if (this.f9322b && !this.f9321a.isEmpty()) {
            if (this.f9325e == null) {
                C3583c cVar = this.f9326f;
                C2338Nc nc = new C2338Nc(this.f9328h, this.f9329i, this.f9330j, this.f9324d, this.f9323c);
                cVar.getClass();
                this.f9325e = new C2306Mc(nc);
            }
            this.f9328h.f6632b.execute(new C3506tc(this));
            if (this.f9327g == null) {
                C3540uc ucVar = new C3540uc(this);
                this.f9327g = ucVar;
                this.f9328h.f6632b.executeDelayed(ucVar, f9318o);
            }
            this.f9328h.f6632b.execute(new C3442rc(this));
            this.f9332l = true;
        }
    }

    /* renamed from: a */
    public void mo18330a(Object obj) {
        synchronized (this.f9333m) {
            this.f9321a.put(obj, (Object) null);
            m10885b();
        }
    }

    /* renamed from: a */
    public Location mo18327a() {
        C2306Mc mc = this.f9325e;
        if (mc == null) {
            return null;
        }
        return mc.mo16277b();
    }

    /* renamed from: a */
    public void mo18331a(boolean z) {
        synchronized (this.f9333m) {
            if (this.f9322b != z) {
                this.f9322b = z;
                this.f9331k.mo15685a(z);
                this.f9328h.f6633c.mo18423a(this.f9331k.mo15683a());
                m10885b();
            }
        }
    }

    /* renamed from: a */
    public void mo18329a(C3356pi piVar, C3208mc mcVar) {
        synchronized (this.f9333m) {
            this.f9324d = piVar;
            this.f9331k.mo15684a(piVar);
            this.f9328h.f6633c.mo18423a(this.f9331k.mo15683a());
            this.f9328h.f6632b.execute(new C3581a(piVar));
            if (!C1848A2.m6810a((Object) this.f9323c, (Object) mcVar)) {
                mo18328a(mcVar);
            }
        }
    }

    /* renamed from: a */
    public void mo18328a(C3208mc mcVar) {
        synchronized (this.f9333m) {
            this.f9323c = mcVar;
        }
        this.f9328h.f6632b.execute(new C3582b(mcVar));
    }

    /* renamed from: b */
    static void m10886b(C3580vc vcVar) {
        vcVar.f9328h.f6632b.executeDelayed(vcVar.f9327g, f9318o);
    }
}
