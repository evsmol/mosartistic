package com.appodeal.ads.modules.common.internal.service.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u0007\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "", "releaseAwaiter", "", "timeout", "launchAwaitingAsync", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "AwaitingState", "OutcomeState", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class ServiceInitializationAwaiterImpl implements ServiceInitializationAwaiter {

    /* renamed from: a */
    public Deferred<? extends OutcomeState> f23448a;

    /* renamed from: b */
    public final MutableStateFlow<AwaitingState> f23449b = StateFlowKt.MutableStateFlow(AwaitingState.NotLaunched);

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$AwaitingState;", "", "NotLaunched", "InProgress", "Completed", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum AwaitingState {
        NotLaunched,
        InProgress,
        Completed
    }

    @Metadata(mo38197bv = {}, mo38198d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, mo38199d2 = {"Lcom/appodeal/ads/modules/common/internal/service/impl/ServiceInitializationAwaiterImpl$OutcomeState;", "", "Completed", "TimedOut", "apd_internal"}, mo38200k = 1, mo38201mv = {1, 6, 0})
    public enum OutcomeState {
        Completed,
        TimedOut
    }

    @Metadata(mo38200k = 3, mo38201mv = {1, 6, 0}, mo38203xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OutcomeState.values().length];
            iArr[OutcomeState.Completed.ordinal()] = 1;
            iArr[OutcomeState.TimedOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl", mo38569f = "ServiceInitializationAwaiterImpl.kt", mo38570l = {37}, mo38571m = "await")
    /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a */
    public static final class C9284a extends ContinuationImpl {

        /* renamed from: a */
        public ServiceInitializationAwaiterImpl f23452a;

        /* renamed from: b */
        public /* synthetic */ Object f23453b;

        /* renamed from: c */
        public final /* synthetic */ ServiceInitializationAwaiterImpl f23454c;

        /* renamed from: d */
        public int f23455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9284a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation<? super C9284a> continuation) {
            super(continuation);
            this.f23454c = serviceInitializationAwaiterImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23453b = obj;
            this.f23455d |= RecyclerView.UNDEFINED_DURATION;
            return this.f23454c.await(this);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1", mo38569f = "ServiceInitializationAwaiterImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b */
    public static final class C9285b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f23456a;

        /* renamed from: b */
        public final /* synthetic */ ServiceInitializationAwaiterImpl f23457b;

        /* renamed from: c */
        public final /* synthetic */ long f23458c;

        @DebugMetadata(mo38568c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1", mo38569f = "ServiceInitializationAwaiterImpl.kt", mo38570l = {25}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b$a */
        public static final class C9286a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OutcomeState>, Object> {

            /* renamed from: a */
            public int f23459a;

            /* renamed from: b */
            public final /* synthetic */ ServiceInitializationAwaiterImpl f23460b;

            /* renamed from: c */
            public final /* synthetic */ long f23461c;

            @DebugMetadata(mo38568c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1$1", mo38569f = "ServiceInitializationAwaiterImpl.kt", mo38570l = {26}, mo38571m = "invokeSuspend")
            /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b$a$a */
            public static final class C9287a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OutcomeState>, Object> {

                /* renamed from: a */
                public int f23462a;

                /* renamed from: b */
                public final /* synthetic */ ServiceInitializationAwaiterImpl f23463b;

                @DebugMetadata(mo38568c = "com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$launchAwaitingAsync$1$1$1$1", mo38569f = "ServiceInitializationAwaiterImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
                /* renamed from: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$b$a$a$a */
                public static final class C9288a extends SuspendLambda implements Function2<AwaitingState, Continuation<? super Boolean>, Object> {

                    /* renamed from: a */
                    public /* synthetic */ Object f23464a;

                    public C9288a(Continuation<? super C9288a> continuation) {
                        super(2, continuation);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C9288a aVar = new C9288a(continuation);
                        aVar.f23464a = obj;
                        return aVar;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        return ((C9288a) create((AwaitingState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((AwaitingState) this.f23464a) == AwaitingState.Completed);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C9287a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, Continuation<? super C9287a> continuation) {
                    super(2, continuation);
                    this.f23463b = serviceInitializationAwaiterImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C9287a(this.f23463b, continuation);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C9287a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f23462a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableStateFlow access$getAwaiterFlow$p = this.f23463b.f23449b;
                        C9288a aVar = new C9288a((Continuation<? super C9288a>) null);
                        this.f23462a = 1;
                        if (FlowKt.first(access$getAwaiterFlow$p, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return OutcomeState.Completed;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9286a(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j, Continuation<? super C9286a> continuation) {
                super(2, continuation);
                this.f23460b = serviceInitializationAwaiterImpl;
                this.f23461c = j;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C9286a(this.f23460b, this.f23461c, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9286a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f23459a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f23460b.f23449b.setValue(AwaitingState.InProgress);
                    long j = this.f23461c;
                    C9287a aVar = new C9287a(this.f23460b, (Continuation<? super C9287a>) null);
                    this.f23459a = 1;
                    obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OutcomeState outcomeState = (OutcomeState) obj;
                return outcomeState == null ? OutcomeState.TimedOut : outcomeState;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9285b(ServiceInitializationAwaiterImpl serviceInitializationAwaiterImpl, long j, Continuation<? super C9285b> continuation) {
            super(2, continuation);
            this.f23457b = serviceInitializationAwaiterImpl;
            this.f23458c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9285b bVar = new C9285b(this.f23457b, this.f23458c, continuation);
            bVar.f23456a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9285b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f23457b.f23448a = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f23456a, Dispatchers.getDefault(), (CoroutineStart) null, new C9286a(this.f23457b, this.f23458c, (Continuation<? super C9286a>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object await(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.C9284a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a r0 = (com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.C9284a) r0
            int r1 = r0.f23455d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23455d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a r0 = new com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f23453b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23455d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl r0 = r0.f23452a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.MutableStateFlow<com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$AwaitingState> r6 = r5.f23449b
            java.lang.Object r6 = r6.getValue()
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$AwaitingState r2 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.AwaitingState.NotLaunched
            if (r6 != r2) goto L_0x0044
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0044:
            kotlinx.coroutines.Deferred<? extends com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$OutcomeState> r6 = r5.f23448a
            if (r6 != 0) goto L_0x004a
            r0 = r5
            goto L_0x0079
        L_0x004a:
            r0.f23452a = r5
            r0.f23455d = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
        L_0x0056:
            com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl$OutcomeState r6 = (com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.OutcomeState) r6
            if (r6 != 0) goto L_0x005b
            goto L_0x0079
        L_0x005b:
            int[] r1 = com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r1[r6]
            if (r6 == r4) goto L_0x0071
            r1 = 2
            if (r6 != r1) goto L_0x006b
            java.lang.String r6 = "Timed out"
            goto L_0x0073
        L_0x006b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0071:
            java.lang.String r6 = "Finished successfully"
        L_0x0073:
            r1 = 4
            java.lang.String r2 = "ServiceInitializationAwaiter"
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r2, r6, r3, r1, r3)
        L_0x0079:
            r0.f23448a = r3
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl.await(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void launchAwaitingAsync(long j) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new C9285b(this, j, (Continuation<? super C9285b>) null), 3, (Object) null);
    }

    public void releaseAwaiter() {
        this.f23449b.setValue(AwaitingState.Completed);
    }
}
