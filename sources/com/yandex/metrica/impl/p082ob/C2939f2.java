package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.p082ob.C3330p;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.f2 */
public class C2939f2 implements C3330p.C3332b {

    /* renamed from: g */
    private static volatile C2939f2 f7789g;

    /* renamed from: a */
    private final Context f7790a;

    /* renamed from: b */
    private C2854c2 f7791b;

    /* renamed from: c */
    private WeakReference<Activity> f7792c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private final C2830b9 f7793d;

    /* renamed from: e */
    private final C2881d2 f7794e;

    /* renamed from: f */
    private boolean f7795f;

    C2939f2(Context context, C2830b9 b9Var, C2881d2 d2Var) {
        this.f7790a = context;
        this.f7793d = b9Var;
        this.f7794e = d2Var;
        this.f7791b = b9Var.mo17290s();
        this.f7795f = b9Var.mo17296x();
        C2410P.m8089g().mo16428a().mo17923a((C3330p.C3332b) this);
    }

    /* renamed from: a */
    public static C2939f2 m9505a(Context context) {
        if (f7789g == null) {
            synchronized (C2939f2.class) {
                if (f7789g == null) {
                    f7789g = new C2939f2(context, new C2830b9(C3093ja.m9805a(context).mo17741c()), new C2881d2());
                }
            }
        }
        return f7789g;
    }

    /* renamed from: b */
    private void m9506b(Context context) {
        C2854c2 a;
        if (context != null && (a = this.f7794e.mo17429a(context)) != null && !a.equals(this.f7791b)) {
            this.f7791b = a;
            this.f7793d.mo17243a(a);
        }
    }

    /* renamed from: a */
    public synchronized C2854c2 mo17569a() {
        m9506b((Context) this.f7792c.get());
        if (this.f7791b == null) {
            if (!C1848A2.m6808a(30)) {
                m9506b(this.f7790a);
            } else if (!this.f7795f) {
                m9506b(this.f7790a);
                this.f7795f = true;
                this.f7793d.mo17298z();
            }
        }
        return this.f7791b;
    }

    /* renamed from: a */
    public synchronized void mo17570a(Activity activity) {
        this.f7792c = new WeakReference<>(activity);
        if (this.f7791b == null) {
            m9506b(activity);
        }
    }
}
