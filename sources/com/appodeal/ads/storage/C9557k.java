package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9531b;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveUrlList$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.k */
public final class C9557k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24244a;

    /* renamed from: b */
    public final /* synthetic */ Set<String> f24245b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9557k(C9531b bVar, Set<String> set, Continuation<? super C9557k> continuation) {
        super(2, continuation);
        this.f24244a = bVar;
        this.f24245b = set;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9557k(this.f24244a, this.f24245b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9557k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24244a.mo60778a(C9531b.C9532a.Default).edit().putStringSet(Constants.CONFIG_URL_LIST, this.f24245b).apply();
        return Unit.INSTANCE;
    }
}
