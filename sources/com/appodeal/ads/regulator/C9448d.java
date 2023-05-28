package com.appodeal.ads.regulator;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.regulator.C9431a;
import com.appodeal.ads.regulator.C9438b;
import com.appodeal.ads.regulator.usecases.C9461a;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.appodeal.ads.regulator.d */
public final class C9448d {

    /* renamed from: a */
    public final Context f23970a;

    /* renamed from: b */
    public final C9461a f23971b;

    /* renamed from: c */
    public final CoroutineScope f23972c;

    /* renamed from: d */
    public final MutableStateFlow<C9438b> f23973d;

    /* renamed from: e */
    public final MutableSharedFlow<C9431a> f23974e;

    /* renamed from: f */
    public final Lazy f23975f = LazyKt.lazy(new C9451c(this));

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl$1", mo38569f = "ConsentSdk.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.regulator.d$a */
    public static final class C9449a extends SuspendLambda implements Function3<C9438b, C9431a, Continuation<? super C9438b>, Object> {

        /* renamed from: a */
        public /* synthetic */ C9431a f23976a;

        /* renamed from: b */
        public final /* synthetic */ C9448d f23977b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9449a(C9448d dVar, Continuation<? super C9449a> continuation) {
            super(3, continuation);
            this.f23977b = dVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C9438b bVar = (C9438b) obj;
            C9449a aVar = new C9449a(this.f23977b, (Continuation) obj3);
            aVar.f23976a = (C9431a) obj2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object aVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C9431a aVar2 = this.f23976a;
            if (aVar2 instanceof C9431a.C9437f) {
                C9431a.C9437f fVar = (C9431a.C9437f) aVar2;
                C9448d.m27960a(this.f23977b, fVar.mo60650a(), fVar.mo60651b(), fVar.mo60652c(), fVar.mo60653d());
                return C9438b.C9442d.f23967a;
            } else if (aVar2 instanceof C9431a.C9433b) {
                InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                C9431a.C9433b bVar = (C9431a.C9433b) aVar2;
                if (bVar.mo60643b()) {
                    C9448d.m27964e(this.f23977b);
                    return C9438b.C9443e.f23968a;
                }
                C9448d.m27959a(this.f23977b, new C9431a.C9434c(bVar.mo60642a()));
                return C9438b.C9439a.f23964a;
            } else if (aVar2 instanceof C9431a.C9436e) {
                ((C9431a.C9436e) aVar2).mo60648a().show();
                return C9438b.C9440b.f23965a;
            } else {
                if (aVar2 instanceof C9431a.C9434c) {
                    InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                    aVar = new C9438b.C9444f.C9446b(((C9431a.C9434c) aVar2).mo60645a());
                } else if (aVar2 instanceof C9431a.C9432a) {
                    InternalLogKt.logInternal$default("ConsentSdk", String.valueOf(aVar2), (Throwable) null, 4, (Object) null);
                    aVar = new C9438b.C9444f.C9446b(((C9431a.C9432a) aVar2).mo60640a());
                } else if (aVar2 instanceof C9431a.C9435d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar2);
                    sb.append('[');
                    C9431a.C9435d dVar = (C9431a.C9435d) aVar2;
                    sb.append(dVar.mo60647a());
                    sb.append(']');
                    InternalLogKt.logInternal$default("ConsentSdk", sb.toString(), (Throwable) null, 4, (Object) null);
                    aVar = new C9438b.C9444f.C9445a(dVar.mo60647a());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return aVar;
            }
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl$2", mo38569f = "ConsentSdk.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.regulator.d$b */
    public static final class C9450b extends SuspendLambda implements Function2<C9438b, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f23978a;

        /* renamed from: b */
        public final /* synthetic */ C9448d f23979b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9450b(C9448d dVar, Continuation<? super C9450b> continuation) {
            super(2, continuation);
            this.f23979b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9450b bVar = new C9450b(this.f23979b, continuation);
            bVar.f23978a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9450b) create((C9438b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C9438b bVar = (C9438b) this.f23978a;
            InternalLogKt.logInternal$default("ConsentSdk", Intrinsics.stringPlus("Consent state updated: ", bVar.getClass().getSimpleName()), (Throwable) null, 4, (Object) null);
            this.f23979b.f23973d.setValue(bVar);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.ads.regulator.d$c */
    public static final class C9451c extends Lambda implements Function0<C9455e> {

        /* renamed from: a */
        public final /* synthetic */ C9448d f23980a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9451c(C9448d dVar) {
            super(0);
            this.f23980a = dVar;
        }

        public final Object invoke() {
            return new C9455e(this.f23980a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl", mo38569f = "ConsentSdk.kt", mo38570l = {169}, mo38571m = "getRegulatorData")
    /* renamed from: com.appodeal.ads.regulator.d$d */
    public static final class C9452d extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f23981a;

        /* renamed from: b */
        public final /* synthetic */ C9448d f23982b;

        /* renamed from: c */
        public int f23983c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9452d(C9448d dVar, Continuation<? super C9452d> continuation) {
            super(continuation);
            this.f23982b = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23981a = obj;
            this.f23983c |= RecyclerView.UNDEFINED_DURATION;
            return this.f23982b.mo60658a((String) null, (Consent) null, (Consent.Status) null, (Consent.Zone) null, (Continuation<? super Consent>) this);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.regulator.ConsentSdkImpl$getRegulatorData$resultState$1", mo38569f = "ConsentSdk.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.regulator.d$e */
    public static final class C9453e extends SuspendLambda implements Function2<C9438b, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f23984a;

        public C9453e(Continuation<? super C9453e> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9453e eVar = new C9453e(continuation);
            eVar.f23984a = obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9453e) create((C9438b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((C9438b) this.f23984a) instanceof C9438b.C9444f);
        }
    }

    public C9448d(Context context, C9461a aVar, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, "loadConsent");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.f23970a = context;
        this.f23971b = aVar;
        this.f23972c = coroutineScope;
        MutableStateFlow<C9438b> MutableStateFlow = StateFlowKt.MutableStateFlow(C9438b.C9441c.f23966a);
        this.f23973d = MutableStateFlow;
        MutableSharedFlow<C9431a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f23974e = MutableSharedFlow$default;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.scan(MutableSharedFlow$default, MutableStateFlow.getValue(), new C9449a(this, (Continuation<? super C9449a>) null)), new C9450b(this, (Continuation<? super C9450b>) null)), coroutineScope);
    }

    /* renamed from: a */
    public static final void m27960a(C9448d dVar, String str, Consent consent, Consent.Status status, Consent.Zone zone) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f23972c, (CoroutineContext) null, (CoroutineStart) null, new C9456f(dVar, str, status, zone, consent, (Continuation<? super C9456f>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public static final void m27964e(C9448d dVar) {
        dVar.getClass();
        new ConsentForm(dVar.f23970a, (C9455e) dVar.f23975f.getValue()).load();
    }

    /* renamed from: a */
    public static final void m27959a(C9448d dVar, C9431a aVar) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(dVar.f23972c, (CoroutineContext) null, (CoroutineStart) null, new C9457g(dVar, aVar, (Continuation<? super C9457g>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60658a(java.lang.String r14, com.appodeal.consent.Consent r15, com.appodeal.consent.Consent.Status r16, com.appodeal.consent.Consent.Zone r17, kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent> r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof com.appodeal.ads.regulator.C9448d.C9452d
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.appodeal.ads.regulator.d$d r2 = (com.appodeal.ads.regulator.C9448d.C9452d) r2
            int r3 = r2.f23983c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f23983c = r3
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.regulator.d$d r2 = new com.appodeal.ads.regulator.d$d
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f23981a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f23983c
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r1)
            com.appodeal.ads.regulator.a$f r1 = new com.appodeal.ads.regulator.a$f
            r4 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r14, r15, r8, r9)
            kotlinx.coroutines.CoroutineScope r7 = r0.f23972c
            com.appodeal.ads.regulator.g r10 = new com.appodeal.ads.regulator.g
            r10.<init>(r13, r1, r6)
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.flow.MutableStateFlow<com.appodeal.ads.regulator.b> r1 = r0.f23973d
            com.appodeal.ads.regulator.d$e r4 = new com.appodeal.ads.regulator.d$e
            r4.<init>(r6)
            r2.f23983c = r5
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r4, r2)
            if (r1 != r3) goto L_0x0061
            return r3
        L_0x0061:
            com.appodeal.ads.regulator.b r1 = (com.appodeal.ads.regulator.C9438b) r1
            boolean r2 = r1 instanceof com.appodeal.ads.regulator.C9438b.C9444f.C9446b
            if (r2 == 0) goto L_0x006a
            com.appodeal.ads.regulator.b$f$b r1 = (com.appodeal.ads.regulator.C9438b.C9444f.C9446b) r1
            goto L_0x006b
        L_0x006a:
            r1 = r6
        L_0x006b:
            if (r1 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            com.appodeal.consent.Consent r6 = r1.mo60657a()
        L_0x0072:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.C9448d.mo60658a(java.lang.String, com.appodeal.consent.Consent, com.appodeal.consent.Consent$Status, com.appodeal.consent.Consent$Zone, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
