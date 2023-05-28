package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C3364q;
import com.yandex.metrica.impl.p082ob.C3424r;

/* renamed from: com.yandex.metrica.impl.ob.o2 */
public class C3302o2 {

    /* renamed from: a */
    private final C3364q f8492a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2286Ll<C3072j1> f8493b;

    /* renamed from: c */
    private final C3364q.C3366b f8494c;

    /* renamed from: d */
    private final C3364q.C3366b f8495d;

    /* renamed from: e */
    private final C3424r f8496e;

    /* renamed from: f */
    private final C3330p f8497f;

    /* renamed from: com.yandex.metrica.impl.ob.o2$a */
    class C3303a implements C3364q.C3366b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$a$a */
        class C3304a implements C1973E1<C3072j1> {

            /* renamed from: a */
            final /* synthetic */ Activity f8499a;

            C3304a(Activity activity) {
                this.f8499a = activity;
            }

            /* renamed from: b */
            public void mo15646b(Object obj) {
                C3302o2.m10213a(C3302o2.this, this.f8499a, (C3072j1) obj);
            }
        }

        C3303a() {
        }

        /* renamed from: a */
        public void mo17137a(Activity activity, C3364q.C3365a aVar) {
            C3302o2.this.f8493b.mo16231a(new C3304a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o2$b */
    class C3305b implements C3364q.C3366b {

        /* renamed from: com.yandex.metrica.impl.ob.o2$b$a */
        class C3306a implements C1973E1<C3072j1> {

            /* renamed from: a */
            final /* synthetic */ Activity f8502a;

            C3306a(Activity activity) {
                this.f8502a = activity;
            }

            /* renamed from: b */
            public void mo15646b(Object obj) {
                C3302o2.m10214b(C3302o2.this, this.f8502a, (C3072j1) obj);
            }
        }

        C3305b() {
        }

        /* renamed from: a */
        public void mo17137a(Activity activity, C3364q.C3365a aVar) {
            C3302o2.this.f8493b.mo16231a(new C3306a(activity));
        }
    }

    public C3302o2(C3364q qVar, ICommonExecutor iCommonExecutor, C3330p pVar) {
        this(qVar, pVar, new C2286Ll(iCommonExecutor), new C3424r());
    }

    /* renamed from: b */
    public void mo17907b(Activity activity, C2214K0 k0) {
        if (activity != null) {
            this.f8497f.mo17922a(activity);
        }
        if (this.f8496e.mo18141a(activity, C3424r.C3425a.RESUMED)) {
            k0.mo16054a(activity);
        }
    }

    C3302o2(C3364q qVar, C3330p pVar, C2286Ll<C3072j1> ll, C3424r rVar) {
        this.f8492a = qVar;
        this.f8497f = pVar;
        this.f8493b = ll;
        this.f8496e = rVar;
        this.f8494c = new C3303a();
        this.f8495d = new C3305b();
    }

    /* renamed from: a */
    public C3364q.C3367c mo17904a() {
        this.f8492a.mo18056a(this.f8494c, C3364q.C3365a.RESUMED);
        this.f8492a.mo18056a(this.f8495d, C3364q.C3365a.PAUSED);
        return this.f8492a.mo18053a();
    }

    /* renamed from: b */
    static void m10214b(C3302o2 o2Var, Activity activity, C2214K0 k0) {
        if (o2Var.f8496e.mo18141a(activity, C3424r.C3425a.PAUSED)) {
            ((C3072j1) k0).mo16060b(activity);
        }
    }

    /* renamed from: a */
    public void mo17905a(Activity activity, C2214K0 k0) {
        if (activity != null) {
            this.f8497f.mo17922a(activity);
        }
        if (this.f8496e.mo18141a(activity, C3424r.C3425a.PAUSED)) {
            k0.mo16060b(activity);
        }
    }

    /* renamed from: a */
    public void mo17906a(C3072j1 j1Var) {
        this.f8493b.mo16232a(j1Var);
    }

    /* renamed from: a */
    static void m10213a(C3302o2 o2Var, Activity activity, C2214K0 k0) {
        if (o2Var.f8496e.mo18141a(activity, C3424r.C3425a.RESUMED)) {
            ((C3072j1) k0).mo16054a(activity);
        }
    }
}
