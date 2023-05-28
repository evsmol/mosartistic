package com.appodeal.ads;

import android.app.Activity;
import android.os.Handler;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.utils.C9640o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.appodeal.ads.d */
public final class C9160d implements C9127b {

    /* renamed from: a */
    public final CoroutineScope f22978a;

    /* renamed from: b */
    public final ContextProvider f22979b;

    /* renamed from: c */
    public long f22980c;

    /* renamed from: d */
    public long f22981d;

    /* renamed from: e */
    public final AtomicBoolean f22982e = new AtomicBoolean(false);

    /* renamed from: f */
    public Job f22983f;

    @DebugMetadata(mo38568c = "com.appodeal.ads.AdLifecycleTrackerImpl$init$1", mo38569f = "AdLifecycleTracker.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.d$a */
    public static final class C9161a extends SuspendLambda implements Function2<Activity, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f22984a;

        /* renamed from: b */
        public final /* synthetic */ C9160d f22985b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9161a(C9160d dVar, Continuation<? super C9161a> continuation) {
            super(2, continuation);
            this.f22985b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9161a aVar = new C9161a(this.f22985b, continuation);
            aVar.f22984a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9161a) create((Activity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (((Activity) this.f22984a) != null) {
                C9160d.m27247f(this.f22985b);
            } else {
                C9160d.m27246e(this.f22985b);
            }
            return Unit.INSTANCE;
        }
    }

    public C9160d(CoroutineScope coroutineScope, C9148b bVar) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f22978a = coroutineScope;
        this.f22979b = bVar;
    }

    /* renamed from: b */
    public static List m27243b() {
        List<C9577u> listOf = CollectionsKt.listOf(C9566t0.m28247a(), C9205h2.m27336a(), C9378o1.m27718a(), C9685w2.m28463a(), C9384o4.m27742a());
        ArrayList arrayList = new ArrayList();
        for (C9577u f : listOf) {
            C9420r f2 = f.mo60846f();
            C9258l lVar = null;
            if (f2 != null) {
                if (!(!f2.mo60627r())) {
                    f2 = null;
                }
                if (f2 != null) {
                    lVar = f2.mo60618h();
                }
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        HashSet a = Native.m27080c().mo60333a();
        Intrinsics.checkNotNullExpressionValue(a, "getNativeAdBox().adObjects");
        return CollectionsKt.plus(arrayList, a);
    }

    /* renamed from: e */
    public static final void m27246e(C9160d dVar) {
        Job job = dVar.f22983f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        dVar.f22983f = BuildersKt__Builders_commonKt.launch$default(dVar.f22978a, Dispatchers.getDefault(), (CoroutineStart) null, new C9172e(dVar, (Continuation<? super C9172e>) null), 2, (Object) null);
    }

    /* renamed from: f */
    public static final void m27247f(C9160d dVar) {
        dVar.getClass();
        dVar.f22981d = System.currentTimeMillis();
        if (dVar.f22982e.getAndSet(false)) {
            for (C9258l a : m27243b()) {
                C9640o.m28396a(a);
            }
            C9409q4.f23839a.getClass();
            for (C9577u j : C9409q4.m27859d()) {
                j.mo60849j();
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f22978a, (CoroutineContext) null, (CoroutineStart) null, new C9180f(dVar, (Continuation<? super C9180f>) null), 3, (Object) null);
        }
    }

    /* renamed from: g */
    public static final void m27248g(C9160d dVar) {
        dVar.getClass();
        for (C9258l lVar : m27243b()) {
            if (lVar != null) {
                Runnable runnable = (Runnable) C9640o.f24431b.get(lVar);
                if (runnable != null) {
                    C9640o.f24430a.removeCallbacks(runnable);
                }
            } else {
                Handler handler = C9640o.f24430a;
            }
        }
    }

    /* renamed from: a */
    public final void mo59833a() {
        FlowKt.launchIn(FlowKt.onEach(this.f22979b.getTopActivityFlow(), new C9161a(this, (Continuation<? super C9161a>) null)), this.f22978a);
    }
}
