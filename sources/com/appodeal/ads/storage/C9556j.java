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

@DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.storage.j */
public final class C9556j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C9531b f24235a;

    /* renamed from: b */
    public final /* synthetic */ String f24236b;

    /* renamed from: c */
    public final /* synthetic */ long f24237c;

    /* renamed from: d */
    public final /* synthetic */ long f24238d;

    /* renamed from: e */
    public final /* synthetic */ long f24239e;

    /* renamed from: f */
    public final /* synthetic */ long f24240f;

    /* renamed from: g */
    public final /* synthetic */ long f24241g;

    /* renamed from: h */
    public final /* synthetic */ long f24242h;

    /* renamed from: i */
    public final /* synthetic */ long f24243i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9556j(C9531b bVar, String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, Continuation<? super C9556j> continuation) {
        super(2, continuation);
        this.f24235a = bVar;
        this.f24236b = str;
        this.f24237c = j;
        this.f24238d = j2;
        this.f24239e = j3;
        this.f24240f = j4;
        this.f24241g = j5;
        this.f24242h = j6;
        this.f24243i = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Continuation<?> continuation2 = continuation;
        return new C9556j(this.f24235a, this.f24236b, this.f24237c, this.f24238d, this.f24239e, this.f24240f, this.f24241g, this.f24242h, this.f24243i, continuation2);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9556j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f24235a.mo60778a(C9531b.C9532a.Default).edit().putString("session_uuid", this.f24236b).putLong("session_id", this.f24237c).putLong("session_uptime", this.f24238d).putLong("session_uptime_m", this.f24239e).putLong("session_start_ts", this.f24240f).putLong("session_start_ts_m", this.f24241g).putLong("app_uptime", this.f24242h).putLong("app_uptime_m", this.f24243i).apply();
        return Unit.INSTANCE;
    }
}
