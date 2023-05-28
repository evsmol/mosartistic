package com.appodeal.consent.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$show$1$1$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.consent.internal.e */
public final class C9767e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9757d f24774a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9767e(C9757d dVar, Continuation<? super C9767e> continuation) {
        super(2, continuation);
        this.f24774a = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9767e(this.f24774a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9767e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24774a.mo61334c().onOpened();
        return Unit.INSTANCE;
    }
}
