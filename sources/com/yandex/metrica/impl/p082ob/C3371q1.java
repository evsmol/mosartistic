package com.yandex.metrica.impl.p082ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.q1 */
public class C3371q1 implements C3334p1 {

    /* renamed from: a */
    private ICommonExecutor f8676a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3334p1 f8677b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2938f1 f8678c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f8679d;

    /* renamed from: com.yandex.metrica.impl.ob.q1$a */
    class C3372a extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Bundle f8680a;

        C3372a(Bundle bundle) {
            this.f8680a = bundle;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C3371q1.this.f8677b.mo17930b(this.f8680a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$b */
    class C3373b extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Bundle f8682a;

        C3373b(Bundle bundle) {
            this.f8682a = bundle;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C3371q1.this.f8677b.mo17927a(this.f8682a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$c */
    class C3374c extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Configuration f8684a;

        C3374c(Configuration configuration) {
            this.f8684a = configuration;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C3371q1.this.f8677b.onConfigurationChanged(this.f8684a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$d */
    class C3375d extends C2933em {
        C3375d() {
        }

        /* renamed from: a */
        public void mo15597a() {
            synchronized (C3371q1.this) {
                if (C3371q1.this.f8679d) {
                    C3371q1.this.f8678c.mo17567e();
                    C3371q1.this.f8677b.mo15525a();
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$e */
    class C3376e extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Intent f8687a;

        /* renamed from: b */
        final /* synthetic */ int f8688b;

        C3376e(Intent intent, int i) {
            this.f8687a = intent;
            this.f8688b = i;
        }

        /* renamed from: a */
        public void mo15597a() {
            C3371q1.this.f8677b.mo15526a(this.f8687a, this.f8688b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$f */
    class C3377f extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Intent f8690a;

        /* renamed from: b */
        final /* synthetic */ int f8691b;

        /* renamed from: c */
        final /* synthetic */ int f8692c;

        C3377f(Intent intent, int i, int i2) {
            this.f8690a = intent;
            this.f8691b = i;
            this.f8692c = i2;
        }

        /* renamed from: a */
        public void mo15597a() {
            C3371q1.this.f8677b.mo15527a(this.f8690a, this.f8691b, this.f8692c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$g */
    class C3378g extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Intent f8694a;

        C3378g(Intent intent) {
            this.f8694a = intent;
        }

        /* renamed from: a */
        public void mo15597a() {
            C3371q1.this.f8677b.mo15410a(this.f8694a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$h */
    class C3379h extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Intent f8696a;

        C3379h(Intent intent) {
            this.f8696a = intent;
        }

        /* renamed from: a */
        public void mo15597a() {
            C3371q1.this.f8677b.mo15414c(this.f8696a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$i */
    class C3380i extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Intent f8698a;

        C3380i(Intent intent) {
            this.f8698a = intent;
        }

        /* renamed from: a */
        public void mo15597a() {
            C3371q1.this.f8677b.mo15412b(this.f8698a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$j */
    class C3381j extends C2933em {

        /* renamed from: a */
        final /* synthetic */ String f8700a;

        /* renamed from: b */
        final /* synthetic */ int f8701b;

        /* renamed from: c */
        final /* synthetic */ String f8702c;

        /* renamed from: d */
        final /* synthetic */ Bundle f8703d;

        C3381j(String str, int i, String str2, Bundle bundle) {
            this.f8700a = str;
            this.f8701b = i;
            this.f8702c = str2;
            this.f8703d = bundle;
        }

        /* renamed from: a */
        public void mo15597a() throws RemoteException {
            C3371q1.this.f8677b.mo17929a(this.f8700a, this.f8701b, this.f8702c, this.f8703d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$k */
    class C3382k extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Bundle f8705a;

        C3382k(Bundle bundle) {
            this.f8705a = bundle;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C3371q1.this.f8677b.reportData(this.f8705a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$l */
    class C3383l extends C2933em {

        /* renamed from: a */
        final /* synthetic */ int f8707a;

        /* renamed from: b */
        final /* synthetic */ Bundle f8708b;

        C3383l(int i, Bundle bundle) {
            this.f8707a = i;
            this.f8708b = bundle;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C3371q1.this.f8677b.mo17926a(this.f8707a, this.f8708b);
        }
    }

    public C3371q1(C3334p1 p1Var) {
        this(C2007F0.m7154g().mo15754q().mo16490c(), p1Var, C2007F0.m7154g().mo15745h());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f8676a.execute(new C3374c(configuration));
    }

    public void reportData(Bundle bundle) {
        this.f8676a.execute(new C3382k(bundle));
    }

    /* renamed from: a */
    public synchronized void mo15525a() {
        this.f8679d = true;
        this.f8676a.execute(new C3375d());
    }

    /* renamed from: b */
    public void mo15412b(Intent intent) {
        this.f8676a.execute(new C3380i(intent));
    }

    /* renamed from: c */
    public void mo15414c(Intent intent) {
        this.f8676a.execute(new C3379h(intent));
    }

    /* renamed from: b */
    public void mo15528b() {
        this.f8676a.removeAll();
        synchronized (this) {
            this.f8678c.mo17568f();
            this.f8679d = false;
        }
        this.f8677b.mo15528b();
    }

    /* renamed from: a */
    public void mo15526a(Intent intent, int i) {
        this.f8676a.execute(new C3376e(intent, i));
    }

    C3371q1(ICommonExecutor iCommonExecutor, C3334p1 p1Var, C2938f1 f1Var) {
        this.f8679d = false;
        this.f8676a = iCommonExecutor;
        this.f8677b = p1Var;
        this.f8678c = f1Var;
    }

    /* renamed from: a */
    public void mo15527a(Intent intent, int i, int i2) {
        this.f8676a.execute(new C3377f(intent, i, i2));
    }

    /* renamed from: a */
    public void mo15410a(Intent intent) {
        this.f8676a.execute(new C3378g(intent));
    }

    /* renamed from: a */
    public void mo17929a(String str, int i, String str2, Bundle bundle) {
        this.f8676a.execute(new C3381j(str, i, str2, bundle));
    }

    /* renamed from: a */
    public void mo17926a(int i, Bundle bundle) {
        this.f8676a.execute(new C3383l(i, bundle));
    }

    /* renamed from: a */
    public void mo17927a(Bundle bundle) {
        this.f8676a.execute(new C3373b(bundle));
    }

    /* renamed from: a */
    public void mo17928a(MetricaService.C10691d dVar) {
        this.f8677b.mo17928a(dVar);
    }

    /* renamed from: b */
    public void mo17930b(Bundle bundle) {
        this.f8676a.execute(new C3372a(bundle));
    }
}
