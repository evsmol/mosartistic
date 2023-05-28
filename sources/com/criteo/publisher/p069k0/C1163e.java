package com.criteo.publisher.p069k0;

import com.appodeal.ads.modules.common.internal.Constants;
import com.criteo.publisher.C1146i;
import com.criteo.publisher.C1329w;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1269p;
import com.criteo.publisher.model.C1276t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.k0.e */
/* compiled from: LiveBidRequestSender.kt */
public class C1163e {

    /* renamed from: a */
    private final C1166g f3694a;

    /* renamed from: b */
    private final C1269p f3695b;

    /* renamed from: c */
    private final C1146i f3696c;

    /* renamed from: d */
    private final Executor f3697d;

    /* renamed from: e */
    private final ScheduledExecutorService f3698e;

    /* renamed from: f */
    private final C1276t f3699f;

    public C1163e(C1166g gVar, C1269p pVar, C1146i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C1276t tVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "pubSdkApi");
        Intrinsics.checkParameterIsNotNull(pVar, "cdbRequestFactory");
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        Intrinsics.checkParameterIsNotNull(scheduledExecutorService, "scheduledExecutorService");
        Intrinsics.checkParameterIsNotNull(tVar, Constants.CONFIG);
        this.f3694a = gVar;
        this.f3695b = pVar;
        this.f3696c = iVar;
        this.f3697d = executor;
        this.f3698e = scheduledExecutorService;
        this.f3699f = tVar;
    }

    /* renamed from: a */
    public void mo3260a(C1267n nVar, ContextData contextData, C1329w wVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "cacheAdUnit");
        Intrinsics.checkParameterIsNotNull(contextData, "contextData");
        Intrinsics.checkParameterIsNotNull(wVar, "liveCdbCallListener");
        mo3261a(wVar);
        this.f3697d.execute(new C1161c(this.f3694a, this.f3695b, this.f3696c, CollectionsKt.listOf(nVar), contextData, wVar));
    }

    /* renamed from: com.criteo.publisher.k0.e$a */
    /* compiled from: LiveBidRequestSender.kt */
    static final class C1164a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1329w f3700a;

        C1164a(C1329w wVar) {
            this.f3700a = wVar;
        }

        public final void run() {
            this.f3700a.mo3731a();
        }
    }

    /* renamed from: a */
    public void mo3261a(C1329w wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "liveCdbCallListener");
        this.f3698e.schedule(new C1164a(wVar), (long) this.f3699f.mo3596e(), TimeUnit.MILLISECONDS);
    }
}
