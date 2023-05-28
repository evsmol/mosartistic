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

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveAppKey$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.g */
public final class C9553g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24223a;

    /* renamed from: b */
    public final /* synthetic */ String f24224b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9553g(C9531b bVar, String str, Continuation<? super C9553g> continuation) {
        super(2, continuation);
        this.f24223a = bVar;
        this.f24224b = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9553g(this.f24223a, this.f24224b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9553g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24223a.mo60778a(C9531b.C9532a.Default).edit().putString(Constants.APP_KEY, this.f24224b).apply();
        return Unit.INSTANCE;
    }
}
