package com.appodeal.ads.regulator;

import android.content.Context;
import com.appodeal.ads.regulator.C9431a;
import com.appodeal.ads.regulator.data.C9454a;
import com.appodeal.ads.regulator.usecases.C9461a;
import com.appodeal.consent.Consent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl$loadCurrentConsent$1", mo38569f = "ConsentSdk.kt", mo38570l = {187}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.regulator.f */
public final class C9456f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f23988a;

    /* renamed from: b */
    public final /* synthetic */ C9448d f23989b;

    /* renamed from: c */
    public final /* synthetic */ String f23990c;

    /* renamed from: d */
    public final /* synthetic */ Consent.Status f23991d;

    /* renamed from: e */
    public final /* synthetic */ Consent.Zone f23992e;

    /* renamed from: f */
    public final /* synthetic */ Consent f23993f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9456f(C9448d dVar, String str, Consent.Status status, Consent.Zone zone, Consent consent, Continuation<? super C9456f> continuation) {
        super(2, continuation);
        this.f23989b = dVar;
        this.f23990c = str;
        this.f23991d = status;
        this.f23992e = zone;
        this.f23993f = consent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9456f(this.f23989b, this.f23990c, this.f23991d, this.f23992e, this.f23993f, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9456f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23988a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C9461a c = this.f23989b.f23971b;
            Context b = this.f23989b.f23970a;
            String str = this.f23990c;
            Consent.Status status = this.f23991d;
            Consent.Zone zone = this.f23992e;
            Consent consent = this.f23993f;
            this.f23988a = 1;
            obj2 = c.mo60677a(b, str, status, zone, consent, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).m31669unboximpl();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C9448d dVar = this.f23989b;
        if (Result.m31667isSuccessimpl(obj2)) {
            C9454a aVar = (C9454a) obj2;
            C9448d.m27959a(dVar, new C9431a.C9433b(aVar.mo60659a(), aVar.mo60660b()));
        }
        C9448d dVar2 = this.f23989b;
        Throwable r11 = Result.m31664exceptionOrNullimpl(obj2);
        if (r11 != null) {
            C9448d.m27959a(dVar2, new C9431a.C9435d(r11));
        }
        return Unit.INSTANCE;
    }
}
