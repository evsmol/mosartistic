package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@DebugMetadata(mo38568c = "com.appodeal.ads.AdLifecycleTrackerImpl$onActivityPaused$1", mo38569f = "AdLifecycleTracker.kt", mo38570l = {70}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.e */
public final class C9172e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f23013a;

    /* renamed from: b */
    public final /* synthetic */ C9160d f23014b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9172e(C9160d dVar, Continuation<? super C9172e> continuation) {
        super(2, continuation);
        this.f23014b = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9172e(this.f23014b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9172e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23013a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f23014b.f22980c = System.currentTimeMillis();
            this.f23013a = 1;
            if (DelayKt.delay(1000, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f23014b.f22981d < this.f23014b.f22980c) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_PAUSE);
            this.f23014b.f22982e.set(true);
            C9160d.m27248g(this.f23014b);
        }
        return Unit.INSTANCE;
    }
}
