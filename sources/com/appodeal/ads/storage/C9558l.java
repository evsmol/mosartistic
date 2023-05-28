package com.appodeal.ads.storage;

import com.appodeal.ads.C9409q4;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9531b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveVersion$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.l */
public final class C9558l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24246a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9558l(C9531b bVar, Continuation<? super C9558l> continuation) {
        super(2, continuation);
        this.f24246a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9558l(this.f24246a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9558l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24246a.mo60778a(C9531b.C9532a.Default).edit().putString(Constants.APPODEAL_VERSION, C9409q4.m27878n()).apply();
        return Unit.INSTANCE;
    }
}
