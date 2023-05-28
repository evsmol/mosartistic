package com.appodeal.ads.regulator.usecases;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.ext.ResultExtKt;
import com.appodeal.ads.regulator.data.C9454a;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentInfoUpdateListener;
import com.appodeal.consent.ConsentManager;
import com.appodeal.consent.ConsentManagerError;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.appodeal.ads.regulator.usecases.a */
public final class C9461a {

    /* renamed from: a */
    public final ConsentManager f24008a;

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.usecases.LoadConsentUseCase", mo38569f = "LoadConsentUseCase.kt", mo38570l = {48}, mo38571m = "invoke-hUnOzRk")
    /* renamed from: com.appodeal.ads.regulator.usecases.a$a */
    public static final class C9462a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f24009a;

        /* renamed from: b */
        public final /* synthetic */ C9461a f24010b;

        /* renamed from: c */
        public int f24011c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9462a(C9461a aVar, Continuation<? super C9462a> continuation) {
            super(continuation);
            this.f24010b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24009a = obj;
            this.f24011c |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f24010b.mo60677a((Context) null, (String) null, (Consent.Status) null, (Consent.Zone) null, (Consent) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    /* renamed from: com.appodeal.ads.regulator.usecases.a$b */
    public static final class C9463b extends ConsentInfoUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation<Result<C9454a>> f24012a;

        /* renamed from: b */
        public final /* synthetic */ C9461a f24013b;

        public C9463b(CancellableContinuationImpl cancellableContinuationImpl, C9461a aVar) {
            this.f24012a = cancellableContinuationImpl;
            this.f24013b = aVar;
        }

        public final void onConsentInfoUpdated(Consent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            CancellableContinuation<Result<C9454a>> cancellableContinuation = this.f24012a;
            Result.Companion companion = Result.Companion;
            this.f24013b.f24008a;
            cancellableContinuation.resumeWith(Result.m31662constructorimpl(Result.m31661boximpl(ResultExtKt.asSuccess(new C9454a(consent, ConsentManager.getShouldShow())))));
        }

        public final void onFailedToUpdateConsentInfo(ConsentManagerError consentManagerError) {
            Intrinsics.checkNotNullParameter(consentManagerError, "error");
            CancellableContinuation<Result<C9454a>> cancellableContinuation = this.f24012a;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m31662constructorimpl(Result.m31661boximpl(ResultExtKt.asFailure(new Throwable(consentManagerError.toString())))));
        }
    }

    public C9461a(ConsentManager consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f24008a = consentManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60677a(android.content.Context r13, java.lang.String r14, com.appodeal.consent.Consent.Status r15, com.appodeal.consent.Consent.Zone r16, com.appodeal.consent.Consent r17, kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.regulator.data.C9454a>> r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            boolean r2 = r1 instanceof com.appodeal.ads.regulator.usecases.C9461a.C9462a
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.appodeal.ads.regulator.usecases.a$a r2 = (com.appodeal.ads.regulator.usecases.C9461a.C9462a) r2
            int r3 = r2.f24011c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f24011c = r3
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.regulator.usecases.a$a r2 = new com.appodeal.ads.regulator.usecases.a$a
            r2.<init>(r12, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f24009a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f24011c
            r5 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r5) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0076
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.getClass()
            r2.getClass()
            r2.getClass()
            r2.getClass()
            r2.getClass()
            r2.getClass()
            r2.f24011c = r5
            kotlinx.coroutines.CancellableContinuationImpl r1 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r1.<init>(r4, r5)
            r1.initCancellability()
            com.appodeal.ads.regulator.usecases.a$b r8 = new com.appodeal.ads.regulator.usecases.a$b
            r8.<init>(r1, r12)
            r6 = r13
            r7 = r14
            r9 = r17
            r10 = r15
            r11 = r16
            com.appodeal.consent.ConsentManager.requestConsentInfoUpdate(r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r1.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r4) goto L_0x0073
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r2)
        L_0x0073:
            if (r1 != r3) goto L_0x0076
            return r3
        L_0x0076:
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.m31669unboximpl()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.usecases.C9461a.mo60677a(android.content.Context, java.lang.String, com.appodeal.consent.Consent$Status, com.appodeal.consent.Consent$Zone, com.appodeal.consent.Consent, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
