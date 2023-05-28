package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1802d;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.b3 */
public class C2819b3 implements C3170m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2507S3 f7415a;

    /* renamed from: b */
    private final ICommonExecutor f7416b;

    /* renamed from: com.yandex.metrica.impl.ob.b3$a */
    class C2820a extends C2933em {

        /* renamed from: a */
        final /* synthetic */ C1802d f7417a;

        C2820a(C1802d dVar) {
            this.f7417a = dVar;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C2507S3 a = C2819b3.this.f7415a;
            C2819b3 b3Var = C2819b3.this;
            C1802d dVar = this.f7417a;
            b3Var.getClass();
            a.mo16120a(C2851c0.m9214a().mo15967a(new C3017h3(dVar).mo17648a()));
        }
    }

    public C2819b3(C2507S3 s3, ICommonExecutor iCommonExecutor) {
        this.f7415a = s3;
        this.f7416b = iCommonExecutor;
    }

    /* renamed from: a */
    public void mo17210a(List<C1802d> list) {
        for (C1802d aVar : list) {
            this.f7416b.execute(new C2820a(aVar));
        }
    }
}
