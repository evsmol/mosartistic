package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.ul */
public class C3558ul implements C3009gl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2724Xk f9287a;

    /* renamed from: b */
    private final C2536Sk f9288b;

    /* renamed from: c */
    private final C2830b9 f9289c;

    /* renamed from: d */
    private final C3739zk f9290d;

    /* renamed from: e */
    private final C2285Lk f9291e;

    /* renamed from: f */
    private Activity f9292f;

    /* renamed from: g */
    private C2972fl f9293g;

    /* renamed from: com.yandex.metrica.impl.ob.ul$a */
    class C3559a implements C3240mm<Activity> {
        C3559a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C3558ul.this.f9287a.mo17067a((Activity) obj);
        }
    }

    public C3558ul(Context context, C2830b9 b9Var, C2003El el, ICommonExecutor iCommonExecutor, C2972fl flVar) {
        this(context, b9Var, el, iCommonExecutor, flVar, new C3739zk(flVar));
    }

    /* renamed from: b */
    public synchronized void mo18312b(Activity activity) {
        this.f9292f = activity;
        this.f9287a.mo17067a(activity);
    }

    private C3558ul(Context context, C2830b9 b9Var, C2003El el, ICommonExecutor iCommonExecutor, C2972fl flVar, C3739zk zkVar) {
        this(b9Var, el, flVar, zkVar, new C3133kk(1, b9Var), new C1902Bl(iCommonExecutor, new C3165lk(b9Var), zkVar), new C3039hk(context));
    }

    /* renamed from: a */
    public synchronized void mo18310a(Activity activity) {
        this.f9291e.mo16226a(activity);
        this.f9292f = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3558ul(com.yandex.metrica.impl.p082ob.C2830b9 r10, com.yandex.metrica.impl.p082ob.C2003El r11, com.yandex.metrica.impl.p082ob.C2972fl r12, com.yandex.metrica.impl.p082ob.C3739zk r13, com.yandex.metrica.impl.p082ob.C3133kk r14, com.yandex.metrica.impl.p082ob.C1902Bl r15, com.yandex.metrica.impl.p082ob.C3039hk r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Xk r6 = new com.yandex.metrica.impl.ob.Xk
            r0 = r6
            r1 = r12
            r2 = r14
            r3 = r10
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Sk r7 = new com.yandex.metrica.impl.ob.Sk
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.mk r8 = new com.yandex.metrica.impl.ob.mk
            r8.<init>()
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3558ul.<init>(com.yandex.metrica.impl.ob.b9, com.yandex.metrica.impl.ob.El, com.yandex.metrica.impl.ob.fl, com.yandex.metrica.impl.ob.zk, com.yandex.metrica.impl.ob.kk, com.yandex.metrica.impl.ob.Bl, com.yandex.metrica.impl.ob.hk):void");
    }

    C3558ul(C2830b9 b9Var, C2972fl flVar, C2003El el, C1902Bl bl, C3739zk zkVar, C2724Xk xk, C2536Sk sk, C3238mk mkVar) {
        this.f9289c = b9Var;
        this.f9293g = flVar;
        this.f9290d = zkVar;
        this.f9287a = xk;
        this.f9288b = sk;
        C2285Lk lk = new C2285Lk(new C3559a(), el);
        this.f9291e = lk;
        bl.mo15573a(mkVar, lk);
    }

    /* renamed from: a */
    public synchronized void mo18311a(C3166ll llVar, boolean z) {
        this.f9288b.mo16649a(this.f9292f, llVar, z);
        this.f9289c.mo17251c(true);
    }

    /* renamed from: a */
    public synchronized void mo17641a(C2972fl flVar) {
        if (!flVar.equals(this.f9293g)) {
            this.f9290d.mo18466a(flVar);
            this.f9288b.mo16650a(flVar);
            this.f9287a.mo17068a(flVar);
            this.f9293g = flVar;
            Activity activity = this.f9292f;
            if (activity != null) {
                this.f9287a.mo17069b(activity);
            }
        }
    }
}
