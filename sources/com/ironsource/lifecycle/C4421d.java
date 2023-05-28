package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.lifecycle.C4418b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.d */
public final class C4421d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    static AtomicBoolean f10520a = new AtomicBoolean(false);

    /* renamed from: j */
    private static C4421d f10521j = new C4421d();

    /* renamed from: b */
    int f10522b = 0;

    /* renamed from: c */
    int f10523c = 0;

    /* renamed from: d */
    boolean f10524d = true;

    /* renamed from: e */
    boolean f10525e = true;

    /* renamed from: f */
    int f10526f = C4428e.f10537a;
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public List<C4420c> f10527g = new CopyOnWriteArrayList();

    /* renamed from: h */
    Runnable f10528h = new Runnable() {
        public final void run() {
            C4421d.m12605a(C4421d.this);
            C4421d.this.m12608c();
        }
    };

    /* renamed from: i */
    private String f10529i = "IronsourceLifecycleManager";

    /* renamed from: k */
    private C4418b.C4419a f10530k = new C4418b.C4419a() {
        /* renamed from: a */
        public final void mo33232a(Activity activity) {
            C4421d dVar = C4421d.this;
            dVar.f10522b++;
            if (dVar.f10522b == 1 && dVar.f10525e) {
                C4401c.f10496a.mo33211c(new Runnable() {
                    public final void run() {
                        for (C4420c a : C4421d.this.f10527g) {
                            a.mo33224a();
                        }
                    }
                });
                dVar.f10525e = false;
                dVar.f10526f = C4428e.f10538b;
            }
        }

        /* renamed from: b */
        public final void mo33233b(Activity activity) {
            C4421d dVar = C4421d.this;
            dVar.f10523c++;
            if (dVar.f10523c != 1) {
                return;
            }
            if (dVar.f10524d) {
                C4401c.f10496a.mo33211c(new Runnable() {
                    public final void run() {
                        Iterator it = C4421d.this.f10527g.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                });
                dVar.f10524d = false;
                dVar.f10526f = C4428e.f10539c;
                return;
            }
            C4401c cVar = C4401c.f10496a;
            C4401c.m12517b(dVar.f10528h);
        }
    };

    /* renamed from: a */
    public static C4421d m12604a() {
        return f10521j;
    }

    /* renamed from: a */
    static /* synthetic */ void m12605a(C4421d dVar) {
        if (dVar.f10523c == 0) {
            dVar.f10524d = true;
            C4401c.f10496a.mo33211c(new Runnable() {
                public final void run() {
                    Iterator it = C4421d.this.f10527g.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            dVar.f10526f = C4428e.f10540d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12608c() {
        if (this.f10522b == 0 && this.f10524d) {
            C4401c.f10496a.mo33211c(new Runnable() {
                public final void run() {
                    for (C4420c b : C4421d.this.f10527g) {
                        b.mo33225b();
                    }
                }
            });
            this.f10525e = true;
            this.f10526f = C4428e.f10541e;
        }
    }

    /* renamed from: a */
    public final void mo33234a(C4420c cVar) {
        if (IronsourceLifecycleProvider.m12595a() && !this.f10527g.contains(cVar)) {
            this.f10527g.add(cVar);
        }
    }

    /* renamed from: b */
    public final boolean mo33235b() {
        return this.f10526f == C4428e.f10541e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4418b.m12599b(activity);
        C4418b a = C4418b.m12598a(activity);
        if (a != null) {
            a.f10519a = this.f10530k;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.f10523c - 1;
        this.f10523c = i;
        if (i == 0) {
            C4401c cVar = C4401c.f10496a;
            C4401c.m12515a(this.f10528h, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f10522b--;
        m12608c();
    }
}
