package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2991gb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.hb */
public final class C3025hb {

    /* renamed from: a */
    private final C2991gb.C2993b f7959a = new C2991gb.C2993b(false, 1);

    /* renamed from: a */
    public final C2991gb mo17656a(C2637Uh uh) {
        C2991gb.C2993b bVar = this.f7959a;
        Random.Default defaultR = Random.Default;
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C2442Pm q = g.mo15754q();
        Intrinsics.checkNotNullExpressionValue(q, "GlobalServiceLocator.get…).serviceExecutorProvider");
        ICommonExecutor g2 = q.mo16494g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.get…rovider.supportIOExecutor");
        C2291M0 a = C3322oh.m10248a();
        Intrinsics.checkNotNullExpressionValue(a, "YandexMetricaSelfReportFacade.getReporter()");
        return new C2991gb(uh, bVar, defaultR, g2, new C3123kb(new C3094jb(uh, a), uh));
    }
}
