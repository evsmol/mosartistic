package com.appodeal.ads.regulator;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl$sendAction$1", mo38569f = "ConsentSdk.kt", mo38570l = {208}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.regulator.g */
public final class C9457g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f23994a;

    /* renamed from: b */
    public final /* synthetic */ C9448d f23995b;

    /* renamed from: c */
    public final /* synthetic */ C9431a f23996c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9457g(C9448d dVar, C9431a aVar, Continuation<? super C9457g> continuation) {
        super(2, continuation);
        this.f23995b = dVar;
        this.f23996c = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9457g(this.f23995b, this.f23996c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9457g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23994a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow a = this.f23995b.f23974e;
            C9431a aVar = this.f23996c;
            this.f23994a = 1;
            if (a.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
