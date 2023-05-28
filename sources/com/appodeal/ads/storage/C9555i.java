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

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveRequestData$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.i */
public final class C9555i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24228a;

    /* renamed from: b */
    public final /* synthetic */ String f24229b;

    /* renamed from: c */
    public final /* synthetic */ String f24230c;

    /* renamed from: d */
    public final /* synthetic */ String f24231d;

    /* renamed from: e */
    public final /* synthetic */ long f24232e;

    /* renamed from: f */
    public final /* synthetic */ String f24233f;

    /* renamed from: g */
    public final /* synthetic */ int f24234g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9555i(C9531b bVar, String str, String str2, String str3, long j, String str4, int i, Continuation<? super C9555i> continuation) {
        super(2, continuation);
        this.f24228a = bVar;
        this.f24229b = str;
        this.f24230c = str2;
        this.f24231d = str3;
        this.f24232e = j;
        this.f24233f = str4;
        this.f24234g = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9555i(this.f24228a, this.f24229b, this.f24230c, this.f24231d, this.f24232e, this.f24233f, this.f24234g, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9555i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24228a.mo60778a(C9531b.C9532a.Default).edit().putString(this.f24229b, this.f24230c).putLong(this.f24231d, this.f24232e).putInt(this.f24233f, this.f24234g).apply();
        return Unit.INSTANCE;
    }
}
