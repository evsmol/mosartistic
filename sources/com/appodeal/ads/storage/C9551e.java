package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9531b;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$getUrlList$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.e */
public final class C9551e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends String>>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24221a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9551e(C9531b bVar, Continuation<? super C9551e> continuation) {
        super(2, continuation);
        this.f24221a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9551e(this.f24221a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9551e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set<String> stringSet = this.f24221a.mo60778a(C9531b.C9532a.Default).getStringSet(Constants.CONFIG_URL_LIST, SetsKt.emptySet());
        return stringSet == null ? SetsKt.emptySet() : stringSet;
    }
}
