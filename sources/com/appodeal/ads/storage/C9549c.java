package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9531b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$getAndSetTrackFirstInstall$2", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.c */
public final class C9549c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24219a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9549c(C9531b bVar, Continuation<? super C9549c> continuation) {
        super(2, continuation);
        this.f24219a = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9549c(this.f24219a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9549c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C9531b bVar = this.f24219a;
        C9531b.C9532a aVar = C9531b.C9532a.Default;
        boolean z = bVar.mo60778a(aVar).getBoolean(Constants.APPODEAL_FIRST_INSTALL, false);
        if (!z) {
            this.f24219a.mo60778a(aVar).edit().putBoolean(Constants.APPODEAL_FIRST_INSTALL, true).apply();
        }
        return Boxing.boxBoolean(z);
    }
}
