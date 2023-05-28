package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.appodeal.ads.e5 */
public final class C9178e5 implements C9144c5 {

    /* renamed from: a */
    public final CoroutineScope f23030a;

    /* renamed from: b */
    public final ContextProvider f23031b;

    @DebugMetadata(mo38568c = "com.appodeal.ads.SessionTimeTrackerImpl$init$1", mo38569f = "SessionTimeTracker.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.e5$a */
    public static final class C9179a extends SuspendLambda implements Function2<Activity, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f23032a;

        public C9179a(Continuation<? super C9179a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9179a aVar = new C9179a(continuation);
            aVar.f23032a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9179a) create((Activity) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (((Activity) this.f23032a) != null) {
                C9409q4.m27877m().mo61193l();
            } else {
                C9409q4.m27877m().mo61192k();
            }
            return Unit.INSTANCE;
        }
    }

    public C9178e5(CoroutineScope coroutineScope, C9148b bVar) {
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Intrinsics.checkNotNullParameter(bVar, "contextProvider");
        this.f23030a = coroutineScope;
        this.f23031b = bVar;
    }

    /* renamed from: a */
    public final void mo59879a() {
        FlowKt.launchIn(FlowKt.onEach(this.f23031b.getTopActivityFlow(), new C9179a((Continuation<? super C9179a>) null)), this.f23030a);
    }
}
