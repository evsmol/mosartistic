package com.appodeal.ads.storage;

import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.storage.C9531b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$init$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.f */
public final class C9552f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24222a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9552f(C9531b bVar, Continuation<? super C9552f> continuation) {
        super(2, continuation);
        this.f24222a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9552f(this.f24222a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9552f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C9531b.C9532a[] values = C9531b.C9532a.values();
        C9531b bVar = this.f24222a;
        int length = values.length;
        int i = 0;
        while (i < length) {
            C9531b.C9532a aVar = values[i];
            i++;
            bVar.f24174c.put(aVar, new C9564q(C9148b.f22956b, aVar.mo60807a()));
        }
        return Unit.INSTANCE;
    }
}
