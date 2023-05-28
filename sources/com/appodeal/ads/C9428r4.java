package com.appodeal.ads;

import android.app.Application;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.consent.Consent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.SdkCore$initializeSdkCore$1", mo38569f = "SdkCore.kt", mo38570l = {873, 892}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.r4 */
public final class C9428r4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f23936a;

    /* renamed from: b */
    public final /* synthetic */ ApdInitializationCallback f23937b;

    /* renamed from: c */
    public final /* synthetic */ C9575t4 f23938c;

    /* renamed from: d */
    public final /* synthetic */ Application f23939d;

    /* renamed from: e */
    public final /* synthetic */ String f23940e;

    /* renamed from: f */
    public final /* synthetic */ Consent f23941f;

    /* renamed from: g */
    public final /* synthetic */ Boolean f23942g;

    /* renamed from: h */
    public final /* synthetic */ int f23943h;

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCore$initializeSdkCore$1$4", mo38569f = "SdkCore.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.r4$a */
    public static final class C9429a extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public /* synthetic */ boolean f23944a;

        public C9429a(Continuation<? super C9429a> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9429a aVar = new C9429a(continuation);
            aVar.f23944a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9429a) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.f23944a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9428r4(ApdInitializationCallback apdInitializationCallback, C9575t4 t4Var, Application application, String str, Consent consent, Boolean bool, int i, Continuation<? super C9428r4> continuation) {
        super(2, continuation);
        this.f23937b = apdInitializationCallback;
        this.f23938c = t4Var;
        this.f23939d = application;
        this.f23940e = str;
        this.f23941f = consent;
        this.f23942g = bool;
        this.f23943h = i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9428r4(this.f23937b, this.f23938c, this.f23939d, this.f23940e, this.f23941f, this.f23942g, this.f23943h, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9428r4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f23936a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x009e
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.m31669unboximpl()
            goto L_0x0057
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r12)
            com.appodeal.ads.initializing.ApdInitializationCallback r12 = r11.f23937b
            if (r12 != 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            java.util.LinkedHashSet r1 = com.appodeal.ads.C9409q4.f23850l
            boolean r12 = r1.add(r12)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
        L_0x0039:
            boolean r12 = com.appodeal.ads.C9409q4.f23841c
            if (r12 != 0) goto L_0x008c
            boolean r12 = com.appodeal.ads.C9409q4.f23840b
            if (r12 != 0) goto L_0x008c
            com.appodeal.ads.C9409q4.f23840b = r4
            com.appodeal.ads.t4 r5 = r11.f23938c
            android.app.Application r6 = r11.f23939d
            java.lang.String r7 = r11.f23940e
            com.appodeal.consent.Consent r8 = r11.f23941f
            java.lang.Boolean r9 = r11.f23942g
            r11.f23936a = r4
            r10 = r11
            java.lang.Object r12 = r5.mo60829a(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x0057
            return r0
        L_0x0057:
            boolean r1 = kotlin.Result.m31667isSuccessimpl(r12)
            if (r1 == 0) goto L_0x0067
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r5 = com.appodeal.ads.C9409q4.f23854p
            r5.addAll(r1)
        L_0x0067:
            java.lang.Throwable r12 = kotlin.Result.m31664exceptionOrNullimpl(r12)
            if (r12 != 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            boolean r1 = r12 instanceof com.appodeal.ads.initializing.ApdInitializationError
            if (r1 == 0) goto L_0x0079
            java.util.ArrayList r1 = com.appodeal.ads.C9409q4.f23854p
            r1.add(r12)
        L_0x0079:
            com.appodeal.ads.utils.Log.log(r12)
        L_0x007c:
            r12 = 0
            com.appodeal.ads.C9409q4.f23840b = r12
            com.appodeal.ads.C9409q4.f23841c = r4
            kotlinx.coroutines.flow.MutableStateFlow r12 = com.appodeal.ads.C9409q4.f23853o
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r12.setValue(r1)
        L_0x008c:
            kotlinx.coroutines.flow.MutableStateFlow r12 = com.appodeal.ads.C9409q4.f23853o
            com.appodeal.ads.r4$a r1 = new com.appodeal.ads.r4$a
            r1.<init>(r2)
            r11.f23936a = r3
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.first(r12, r1, r11)
            if (r12 != r0) goto L_0x009e
            return r0
        L_0x009e:
            com.appodeal.ads.q4 r12 = com.appodeal.ads.C9409q4.f23839a
            com.appodeal.ads.context.b r0 = com.appodeal.ads.C9409q4.m27810a((com.appodeal.ads.C9409q4) r12)
            android.content.Context r0 = r0.getApplicationContext()
            int r1 = r11.f23943h
            java.util.List r3 = com.appodeal.ads.C9409q4.m27859d()
            com.appodeal.ads.C9409q4.m27830a(r12, r0, r1, r3)
            java.util.LinkedHashSet r12 = com.appodeal.ads.C9409q4.f23850l
            java.util.Iterator r12 = r12.iterator()
        L_0x00b9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r12.next()
            com.appodeal.ads.initializing.ApdInitializationCallback r0 = (com.appodeal.ads.initializing.ApdInitializationCallback) r0
            java.util.ArrayList r1 = com.appodeal.ads.C9409q4.f23854p
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r1 = r2
        L_0x00d2:
            r0.onInitializationFinished(r1)
            goto L_0x00b9
        L_0x00d6:
            java.util.LinkedHashSet r12 = com.appodeal.ads.C9409q4.f23850l
            r12.clear()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9428r4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
