package com.appodeal.ads.storage;

import com.appodeal.ads.storage.C9531b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$savePartOfAudienceAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.h */
public final class C9554h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24225a;

    /* renamed from: b */
    public final /* synthetic */ String f24226b;

    /* renamed from: c */
    public final /* synthetic */ int f24227c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9554h(C9531b bVar, String str, int i, Continuation<? super C9554h> continuation) {
        super(2, continuation);
        this.f24225a = bVar;
        this.f24226b = str;
        this.f24227c = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9554h(this.f24225a, this.f24226b, this.f24227c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9554h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24225a.mo60778a(C9531b.C9532a.Default).edit().putInt(this.f24226b, this.f24227c).apply();
        return Unit.INSTANCE;
    }
}
