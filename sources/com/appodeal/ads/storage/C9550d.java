package com.appodeal.ads.storage;

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

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$getAppKey$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.d */
public final class C9550d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24220a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9550d(C9531b bVar, Continuation<? super C9550d> continuation) {
        super(2, continuation);
        this.f24220a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9550d(this.f24220a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9550d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.f24220a.mo60778a(C9531b.C9532a.Default).getString(Constants.APP_KEY, (String) null);
    }
}
