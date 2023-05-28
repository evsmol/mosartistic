package com.appodeal.ads;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.initializing.C9224a;
import com.appodeal.ads.initializing.C9225b;
import com.appodeal.ads.networking.usecases.C9374a;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9561n;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.tracker.C9655a;
import com.appodeal.ads.utils.tracker.C9656b;
import com.appodeal.consent.Consent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.appodeal.ads.x4 */
public final class C9706x4 implements C9575t4 {

    /* renamed from: a */
    public final C9374a f24550a;

    /* renamed from: b */
    public final C9515c.C9516a f24551b;

    /* renamed from: c */
    public final C9004a3 f24552c;

    /* renamed from: d */
    public final C9224a f24553d;

    /* renamed from: e */
    public final C9272m1 f24554e;

    /* renamed from: f */
    public final C9655a f24555f;

    /* renamed from: g */
    public final C9144c5 f24556g;

    /* renamed from: h */
    public final C9127b f24557h;

    /* renamed from: i */
    public final C9529a f24558i;

    /* renamed from: j */
    public final C9529a.C9530a f24559j;

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl", mo38569f = "SdkCoreInitializer.kt", mo38570l = {84, 85}, mo38571m = "invoke-yxL6bBk")
    /* renamed from: com.appodeal.ads.x4$a */
    public static final class C9707a extends ContinuationImpl {

        /* renamed from: a */
        public C9706x4 f24560a;

        /* renamed from: b */
        public Application f24561b;

        /* renamed from: c */
        public String f24562c;

        /* renamed from: d */
        public Consent f24563d;

        /* renamed from: e */
        public Boolean f24564e;

        /* renamed from: f */
        public Context f24565f;

        /* renamed from: g */
        public /* synthetic */ Object f24566g;

        /* renamed from: h */
        public final /* synthetic */ C9706x4 f24567h;

        /* renamed from: i */
        public int f24568i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9707a(C9706x4 x4Var, Continuation<? super C9707a> continuation) {
            super(continuation);
            this.f24567h = x4Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24566g = obj;
            this.f24568i |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f24567h.mo60829a((Application) null, (String) null, (Consent) null, (Boolean) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl$invoke$2", mo38569f = "SdkCoreInitializer.kt", mo38570l = {86, 90, 96, 97, 101, 105}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.x4$b */
    public static final class C9708b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* renamed from: a */
        public Object f24569a;

        /* renamed from: b */
        public C9706x4 f24570b;

        /* renamed from: c */
        public int f24571c;

        /* renamed from: d */
        public /* synthetic */ Object f24572d;

        /* renamed from: e */
        public final /* synthetic */ C9706x4 f24573e;

        /* renamed from: f */
        public final /* synthetic */ Application f24574f;

        /* renamed from: g */
        public final /* synthetic */ String f24575g;

        /* renamed from: h */
        public final /* synthetic */ Context f24576h;

        /* renamed from: i */
        public final /* synthetic */ Consent f24577i;

        /* renamed from: j */
        public final /* synthetic */ Boolean f24578j;

        @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCoreInitializerImpl$invoke$2$3", mo38569f = "SdkCoreInitializer.kt", mo38570l = {108}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.x4$b$a */
        public static final class C9709a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f24579a;

            /* renamed from: b */
            public final /* synthetic */ C9706x4 f24580b;

            /* renamed from: c */
            public final /* synthetic */ Context f24581c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9709a(C9706x4 x4Var, Context context, Continuation<? super C9709a> continuation) {
                super(2, continuation);
                this.f24580b = x4Var;
                this.f24581c = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C9709a(this.f24580b, this.f24581c, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9709a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f24579a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C9706x4 x4Var = this.f24580b;
                    Context context = this.f24581c;
                    Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
                    this.f24579a = 1;
                    if (C9706x4.m28522a(x4Var, context, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9708b(C9706x4 x4Var, Application application, String str, Context context, Consent consent, Boolean bool, Continuation<? super C9708b> continuation) {
            super(2, continuation);
            this.f24573e = x4Var;
            this.f24574f = application;
            this.f24575g = str;
            this.f24576h = context;
            this.f24577i = consent;
            this.f24578j = bool;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C9708b bVar = new C9708b(this.f24573e, this.f24574f, this.f24575g, this.f24576h, this.f24577i, this.f24578j, continuation);
            bVar.f24572d = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9708b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
            r4 = r12.f24573e;
            r5 = r12.f24576h;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "applicationContext");
            r6 = r12.f24577i;
            r7 = r12.f24578j;
            r8 = r12.f24575g;
            r12.f24572d = r1;
            r12.f24571c = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
            if (com.appodeal.ads.C9706x4.m28521a(r4, r5, r6, r7, r8, r12) != r0) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
            r13 = com.appodeal.ads.C9706x4.m28523b(r12.f24573e);
            r12.f24572d = r1;
            r12.f24571c = 3;
            r13 = r13.mo60576a((kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.networking.C9328b>>) r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
            if (r13 != r0) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
            r13 = r12.f24573e;
            r5 = r12.f24576h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
            if (kotlin.Result.m31667isSuccessimpl(r1) == false) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "applicationContext");
            r12.f24572d = r4;
            r12.f24569a = r1;
            r12.f24570b = r13;
            r12.f24571c = 4;
            r2 = com.appodeal.ads.C9706x4.m28520a(r13, r5, (com.appodeal.ads.networking.C9328b) r1, (kotlin.coroutines.Continuation) r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
            if (r2 != r0) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
            r11 = r1;
            r1 = r13;
            r13 = r2;
            r2 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c6, code lost:
            r1 = com.appodeal.ads.C9706x4.m28525d(r1);
            r12.f24572d = r4;
            r12.f24569a = r2;
            r12.f24570b = null;
            r12.f24571c = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d9, code lost:
            if (r1.mo60764a((java.util.List) r13, r12) != r0) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
            r13 = r12.f24573e;
            r1 = kotlin.Result.m31664exceptionOrNullimpl(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
            if (r1 != null) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
            com.appodeal.ads.C9706x4.m28518a(r13).mo60047a(new com.appodeal.ads.initializing.ApdInitializationError.InternalError.SdkConfigurationError(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f2, code lost:
            r13 = com.appodeal.ads.C9706x4.m28524c(r12.f24573e);
            r12.f24572d = r4;
            r12.f24569a = null;
            r12.f24571c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
            if (r13.mo60129a(r12) != r0) goto L_0x0106;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
            r5 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
            return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r5, kotlinx.coroutines.Dispatchers.getDefault(), (kotlinx.coroutines.CoroutineStart) null, new com.appodeal.ads.C9706x4.C9708b.C9709a(r12.f24573e, r12.f24576h, (kotlin.coroutines.Continuation<? super com.appodeal.ads.C9706x4.C9708b.C9709a>) null), 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
            r4 = r1;
            r1 = r13;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f24571c
                java.lang.String r2 = "applicationContext"
                r3 = 0
                switch(r1) {
                    case 0: goto L_0x005c;
                    case 1: goto L_0x0054;
                    case 2: goto L_0x004c;
                    case 3: goto L_0x003c;
                    case 4: goto L_0x002f;
                    case 5: goto L_0x0023;
                    case 6: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0014:
                java.lang.Object r0 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                kotlin.ResultKt.throwOnFailure(r13)
                kotlin.Result r13 = (kotlin.Result) r13
                r13.m31669unboximpl()
                r5 = r0
                goto L_0x0107
            L_0x0023:
                java.lang.Object r1 = r12.f24569a
                java.lang.Object r2 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlin.ResultKt.throwOnFailure(r13)
                r4 = r2
                goto L_0x00dd
            L_0x002f:
                com.appodeal.ads.x4 r1 = r12.f24570b
                java.lang.Object r2 = r12.f24569a
                java.lang.Object r4 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00c6
            L_0x003c:
                java.lang.Object r1 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                kotlin.Result r13 = (kotlin.Result) r13
                java.lang.Object r13 = r13.m31669unboximpl()
            L_0x0049:
                r4 = r1
                r1 = r13
                goto L_0x00a2
            L_0x004c:
                java.lang.Object r1 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0090
            L_0x0054:
                java.lang.Object r1 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0076
            L_0x005c:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f24572d
                kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
                com.appodeal.ads.x4 r1 = r12.f24573e
                android.app.Application r4 = r12.f24574f
                java.lang.String r5 = r12.f24575g
                r12.f24572d = r13
                r6 = 1
                r12.f24571c = r6
                java.lang.Object r1 = com.appodeal.ads.C9706x4.m28519a((com.appodeal.ads.C9706x4) r1, (android.app.Application) r4, (java.lang.String) r5, (kotlin.coroutines.Continuation) r12)
                if (r1 != r0) goto L_0x0075
                return r0
            L_0x0075:
                r1 = r13
            L_0x0076:
                com.appodeal.ads.x4 r4 = r12.f24573e
                android.content.Context r5 = r12.f24576h
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                com.appodeal.consent.Consent r6 = r12.f24577i
                java.lang.Boolean r7 = r12.f24578j
                java.lang.String r8 = r12.f24575g
                r12.f24572d = r1
                r13 = 2
                r12.f24571c = r13
                r9 = r12
                java.lang.Object r13 = com.appodeal.ads.C9706x4.m28521a(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L_0x0090
                return r0
            L_0x0090:
                com.appodeal.ads.x4 r13 = r12.f24573e
                com.appodeal.ads.networking.usecases.a r13 = r13.f24550a
                r12.f24572d = r1
                r4 = 3
                r12.f24571c = r4
                java.lang.Object r13 = r13.mo60576a((kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.networking.C9328b>>) r12)
                if (r13 != r0) goto L_0x0049
                return r0
            L_0x00a2:
                com.appodeal.ads.x4 r13 = r12.f24573e
                android.content.Context r5 = r12.f24576h
                boolean r6 = kotlin.Result.m31667isSuccessimpl(r1)
                if (r6 == 0) goto L_0x00dd
                r6 = r1
                com.appodeal.ads.networking.b r6 = (com.appodeal.ads.networking.C9328b) r6
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
                r12.f24572d = r4
                r12.f24569a = r1
                r12.f24570b = r13
                r2 = 4
                r12.f24571c = r2
                java.lang.Object r2 = com.appodeal.ads.C9706x4.m28520a((com.appodeal.ads.C9706x4) r13, (android.content.Context) r5, (com.appodeal.ads.networking.C9328b) r6, (kotlin.coroutines.Continuation) r12)
                if (r2 != r0) goto L_0x00c2
                return r0
            L_0x00c2:
                r11 = r1
                r1 = r13
                r13 = r2
                r2 = r11
            L_0x00c6:
                java.util.List r13 = (java.util.List) r13
                com.appodeal.ads.services.c$a r1 = r1.f24551b
                r12.f24572d = r4
                r12.f24569a = r2
                r12.f24570b = r3
                r5 = 5
                r12.f24571c = r5
                java.lang.Object r13 = r1.mo60764a(r13, r12)
                if (r13 != r0) goto L_0x00dc
                return r0
            L_0x00dc:
                r1 = r2
            L_0x00dd:
                com.appodeal.ads.x4 r13 = r12.f24573e
                java.lang.Throwable r1 = kotlin.Result.m31664exceptionOrNullimpl(r1)
                if (r1 != 0) goto L_0x00e6
                goto L_0x00f2
            L_0x00e6:
                com.appodeal.ads.initializing.a r13 = r13.f24553d
                com.appodeal.ads.initializing.ApdInitializationError$InternalError$SdkConfigurationError r2 = new com.appodeal.ads.initializing.ApdInitializationError$InternalError$SdkConfigurationError
                r2.<init>(r1)
                r13.mo60047a(r2)
            L_0x00f2:
                com.appodeal.ads.x4 r13 = r12.f24573e
                com.appodeal.ads.m1 r13 = r13.f24554e
                r12.f24572d = r4
                r12.f24569a = r3
                r1 = 6
                r12.f24571c = r1
                java.lang.Object r13 = r13.mo60129a(r12)
                if (r13 != r0) goto L_0x0106
                return r0
            L_0x0106:
                r5 = r4
            L_0x0107:
                kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getDefault()
                com.appodeal.ads.x4$b$a r8 = new com.appodeal.ads.x4$b$a
                com.appodeal.ads.x4 r13 = r12.f24573e
                android.content.Context r0 = r12.f24576h
                r8.<init>(r13, r0, r3)
                r7 = 0
                r9 = 2
                r10 = 0
                kotlinx.coroutines.Job r13 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r5, r6, r7, r8, r9, r10)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.C9708b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C9706x4(C9374a aVar, C9515c.C9516a aVar2, C9004a3 a3Var, C9225b bVar, C9272m1 m1Var, C9656b bVar2, C9171d5 d5Var, C9137c cVar, C9562o oVar, C9561n nVar) {
        Intrinsics.checkNotNullParameter(aVar, "getConfig");
        Intrinsics.checkNotNullParameter(aVar2, "servicesSolutionInitializer");
        Intrinsics.checkNotNullParameter(a3Var, "registerServices");
        Intrinsics.checkNotNullParameter(bVar, "errorContainer");
        Intrinsics.checkNotNullParameter(m1Var, "initRequest");
        Intrinsics.checkNotNullParameter(bVar2, "memoryTracker");
        Intrinsics.checkNotNullParameter(d5Var, "sessionTimeTracker");
        Intrinsics.checkNotNullParameter(cVar, "adLifecycleTracker");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        Intrinsics.checkNotNullParameter(nVar, "keyValueStorageInitializer");
        this.f24550a = aVar;
        this.f24551b = aVar2;
        this.f24552c = a3Var;
        this.f24553d = bVar;
        this.f24554e = m1Var;
        this.f24555f = bVar2;
        this.f24556g = d5Var;
        this.f24557h = cVar;
        this.f24558i = oVar;
        this.f24559j = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m28521a(com.appodeal.ads.C9706x4 r5, android.content.Context r6, com.appodeal.consent.Consent r7, java.lang.Boolean r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r5.getClass()
            boolean r0 = r10 instanceof com.appodeal.ads.C9590u4
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.appodeal.ads.u4 r0 = (com.appodeal.ads.C9590u4) r0
            int r1 = r0.f24329g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f24329g = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.u4 r0 = new com.appodeal.ads.u4
            r0.<init>(r5, r10)
        L_0x001b:
            java.lang.Object r5 = r0.f24327e
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f24329g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r3) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0083
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            java.lang.String r9 = r0.f24326d
            java.lang.Boolean r8 = r0.f24325c
            com.appodeal.consent.Consent r7 = r0.f24324b
            android.content.Context r6 = r0.f24323a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0059
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r5)
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            r0.f24323a = r6
            r0.f24324b = r7
            r0.f24325c = r8
            r0.f24326d = r9
            r0.f24329g = r3
            java.lang.Object r5 = r5.getAdvertisingProfile(r6, r0)
            if (r5 != r10) goto L_0x0059
            goto L_0x0085
        L_0x0059:
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r5
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "AdvertisingProfile"
            java.lang.String r4 = "Extract"
            com.appodeal.ads.utils.Log.log((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r1)
            com.appodeal.ads.C9700x2.m28502a((java.lang.Boolean) r8)
            com.appodeal.ads.x2 r8 = com.appodeal.ads.C9700x2.f24534a
            r8.getClass()
            com.appodeal.ads.C9700x2.m28501a((com.appodeal.consent.Consent) r7)
            r7 = 0
            r0.f24323a = r7
            r0.f24324b = r7
            r0.f24325c = r7
            r0.f24326d = r7
            r0.f24329g = r2
            java.lang.Object r5 = r8.mo61222a(r9, r6, r5, r0)
            if (r5 != r10) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x0085:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.m28521a(com.appodeal.ads.x4, android.content.Context, com.appodeal.consent.Consent, java.lang.Boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.appodeal.ads.service.ServiceError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r7 == r1) goto L_0x0103;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4 A[EDGE_INSN: B:55:0x00d4->B:44:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m28520a(com.appodeal.ads.C9706x4 r4, android.content.Context r5, com.appodeal.ads.networking.C9328b r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.appodeal.ads.C9680v4
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.appodeal.ads.v4 r0 = (com.appodeal.ads.C9680v4) r0
            int r1 = r0.f24507d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f24507d = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.v4 r0 = new com.appodeal.ads.v4
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f24505b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24507d
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            com.appodeal.ads.x4 r4 = r0.f24504a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0047
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.a3 r7 = r4.f24552c
            r0.f24504a = r4
            r0.f24507d = r3
            java.lang.Object r7 = com.appodeal.ads.C9004a3.m27120a(r7, r5, r6, r0)
            if (r7 != r1) goto L_0x0047
            goto L_0x0103
        L_0x0047:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r5 = r7.iterator()
        L_0x004d:
            boolean r6 = r5.hasNext()
            r0 = 0
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r5.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r1 = r6.component1()
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r1 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r1
            java.lang.Object r6 = r6.component2()
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m31669unboximpl()
            boolean r2 = kotlin.Result.m31666isFailureimpl(r6)
            if (r2 == 0) goto L_0x004d
            java.lang.Throwable r6 = kotlin.Result.m31664exceptionOrNullimpl(r6)
            if (r6 == 0) goto L_0x004d
            boolean r2 = r6 instanceof com.appodeal.ads.service.ServiceError
            if (r2 == 0) goto L_0x007d
            r0 = r6
            com.appodeal.ads.service.ServiceError r0 = (com.appodeal.ads.service.ServiceError) r0
        L_0x007d:
            com.appodeal.ads.service.ServiceError$Adjust$NoAppToken r2 = com.appodeal.ads.service.ServiceError.Adjust.NoAppToken.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0088
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AdjustNotInitialized.NoAppToken.INSTANCE
            goto L_0x00cd
        L_0x0088:
            com.appodeal.ads.service.ServiceError$Adjust$NoEnvironment r2 = com.appodeal.ads.service.ServiceError.Adjust.NoEnvironment.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0093
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AdjustNotInitialized.NoEnvironment.INSTANCE
            goto L_0x00cd
        L_0x0093:
            com.appodeal.ads.service.ServiceError$Appsflyer$NoAppIdProvided r2 = com.appodeal.ads.service.ServiceError.Appsflyer.NoAppIdProvided.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x009e
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoAppIdProvided.INSTANCE
            goto L_0x00cd
        L_0x009e:
            com.appodeal.ads.service.ServiceError$Appsflyer$NoDevKeyProvided r2 = com.appodeal.ads.service.ServiceError.Appsflyer.NoDevKeyProvided.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00a9
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.AppsflyerNotInitialized.NoDevKeyProvided.INSTANCE
            goto L_0x00cd
        L_0x00a9:
            com.appodeal.ads.service.ServiceError$FacebookAnalytics$AppIdIsNotOverridden r2 = com.appodeal.ads.service.ServiceError.FacebookAnalytics.AppIdIsNotOverridden.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00b4
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.AppIdIsNotOverridden.INSTANCE
            goto L_0x00cd
        L_0x00b4:
            com.appodeal.ads.service.ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden r2 = com.appodeal.ads.service.ServiceError.FacebookAnalytics.ClientTokenIsNotOverridden.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00bf
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden r6 = com.appodeal.ads.initializing.ApdInitializationError.NonCritical.FacebookAnalyticsNotInitialized.ClientTokenIsNotOverridden.INSTANCE
            goto L_0x00cd
        L_0x00bf:
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical$OtherError r0 = new com.appodeal.ads.initializing.ApdInitializationError$NonCritical$OtherError
            java.lang.String r1 = r1.getServiceName()
            java.lang.String r6 = r6.getMessage()
            r0.<init>(r1, r6)
            r6 = r0
        L_0x00cd:
            com.appodeal.ads.initializing.a r0 = r4.f24553d
            r0.mo60047a(r6)
            goto L_0x004d
        L_0x00d4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
        L_0x00dd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r4.next()
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r5 = r5.getSecond()
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.m31669unboximpl()
            boolean r6 = kotlin.Result.m31666isFailureimpl(r5)
            if (r6 == 0) goto L_0x00fa
            r5 = r0
        L_0x00fa:
            com.appodeal.ads.modules.common.internal.service.Service r5 = (com.appodeal.ads.modules.common.internal.service.Service) r5
            if (r5 != 0) goto L_0x00ff
            goto L_0x00dd
        L_0x00ff:
            r1.add(r5)
            goto L_0x00dd
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.m28520a(com.appodeal.ads.x4, android.content.Context, com.appodeal.ads.networking.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m28522a(com.appodeal.ads.C9706x4 r5, android.content.Context r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.appodeal.ads.C9690w4
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.appodeal.ads.w4 r0 = (com.appodeal.ads.C9690w4) r0
            int r1 = r0.f24520d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f24520d = r1
            goto L_0x001b
        L_0x0016:
            com.appodeal.ads.w4 r0 = new com.appodeal.ads.w4
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f24518b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24520d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            android.content.Context r6 = r0.f24517a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004d
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.storage.a r5 = r5.f24558i
            r0.f24517a = r6
            r0.f24520d = r4
            java.lang.Object r7 = r5.mo60765a((com.appodeal.ads.C9690w4) r0)
            if (r7 != r1) goto L_0x004d
            goto L_0x006e
        L_0x004d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L_0x006c
            com.appodeal.ads.k0 r5 = com.appodeal.ads.C9237k0.f23201a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "applicationContext.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r7 = 0
            r0.f24517a = r7
            r0.f24520d = r3
            java.lang.Object r5 = r5.mo60086a(r6, r0)
            if (r5 != r1) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.m28522a(com.appodeal.ads.x4, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0115 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133 A[Catch:{ Exception -> 0x022f }, LOOP:0: B:38:0x0131->B:39:0x0133, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017c A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017e A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0191 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ae A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01b1 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d0 A[SYNTHETIC, Splitter:B:62:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f3 A[Catch:{ Exception -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m28519a(com.appodeal.ads.C9706x4 r17, android.app.Application r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Initialize"
            java.lang.String r5 = "SDK-Public"
            r17.getClass()
            boolean r6 = r3 instanceof com.appodeal.ads.C9725y4
            if (r6 == 0) goto L_0x0022
            r6 = r3
            com.appodeal.ads.y4 r6 = (com.appodeal.ads.C9725y4) r6
            int r7 = r6.f24645i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x0022
            int r7 = r7 - r8
            r6.f24645i = r7
            goto L_0x0027
        L_0x0022:
            com.appodeal.ads.y4 r6 = new com.appodeal.ads.y4
            r6.<init>(r0, r3)
        L_0x0027:
            java.lang.Object r3 = r6.f24643g
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r8 = r6.f24645i
            java.lang.String r9 = "context"
            r10 = 0
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r8 == 0) goto L_0x008e
            if (r8 == r13) goto L_0x0075
            if (r8 == r12) goto L_0x0057
            if (r8 != r11) goto L_0x004f
            java.lang.Object r0 = r6.f24639c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.f24638b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.f24637a
            android.app.Application r2 = (android.app.Application) r2
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            goto L_0x0119
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            java.lang.String r0 = r6.f24642f
            com.appodeal.ads.modules.libs.network.AppodealEndpoints r1 = r6.f24641e
            android.content.Context r2 = r6.f24640d
            java.lang.Object r8 = r6.f24639c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r6.f24638b
            android.app.Application r12 = (android.app.Application) r12
            java.lang.Object r13 = r6.f24637a
            com.appodeal.ads.x4 r13 = (com.appodeal.ads.C9706x4) r13
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            r16 = r13
            r13 = r0
            r0 = r2
            r2 = r8
            r8 = r16
            goto L_0x00ed
        L_0x0075:
            android.content.Context r0 = r6.f24640d
            java.lang.Object r1 = r6.f24639c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.f24638b
            android.app.Application r2 = (android.app.Application) r2
            java.lang.Object r8 = r6.f24637a
            com.appodeal.ads.x4 r8 = (com.appodeal.ads.C9706x4) r8
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ Exception -> 0x022f }
            r3 = r0
            r0 = r8
            r16 = r2
            r2 = r1
            r1 = r16
            goto L_0x00b8
        L_0x008e:
            kotlin.ResultKt.throwOnFailure(r3)
            com.appodeal.ads.utils.tracker.a r3 = r0.f24555f     // Catch:{ Exception -> 0x022f }
            r3.mo61169a(r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.c5 r3 = r0.f24556g     // Catch:{ Exception -> 0x022f }
            r3.mo59879a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.b r3 = r0.f24557h     // Catch:{ Exception -> 0x022f }
            r3.mo59833a()     // Catch:{ Exception -> 0x022f }
            android.content.Context r3 = r18.getApplicationContext()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.storage.a r8 = r0.f24558i     // Catch:{ Exception -> 0x022f }
            r6.f24637a = r0     // Catch:{ Exception -> 0x022f }
            r6.f24638b = r1     // Catch:{ Exception -> 0x022f }
            r6.f24639c = r2     // Catch:{ Exception -> 0x022f }
            r6.f24640d = r3     // Catch:{ Exception -> 0x022f }
            r6.f24645i = r13     // Catch:{ Exception -> 0x022f }
            java.lang.Object r8 = r8.mo60767a(r2, r6)     // Catch:{ Exception -> 0x022f }
            if (r8 != r7) goto L_0x00b8
            goto L_0x0241
        L_0x00b8:
            com.appodeal.ads.modules.libs.network.NetworkStatus r8 = com.appodeal.ads.modules.libs.network.NetworkStatus.INSTANCE     // Catch:{ Exception -> 0x022f }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)     // Catch:{ Exception -> 0x022f }
            r8.init(r3)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.modules.libs.network.AppodealEndpoints r8 = com.appodeal.ads.modules.libs.network.AppodealEndpoints.INSTANCE     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.r0 r13 = com.appodeal.ads.C9422r0.f23912a     // Catch:{ Exception -> 0x022f }
            java.lang.String r13 = com.appodeal.ads.C9139c1.m27227a()     // Catch:{ Exception -> 0x022f }
            java.lang.String r15 = "AppodealSettings.actualHost ?: Debug.getHost()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r15)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.r0 r15 = com.appodeal.ads.C9422r0.f23912a     // Catch:{ Exception -> 0x022f }
            r6.f24637a = r0     // Catch:{ Exception -> 0x022f }
            r6.f24638b = r1     // Catch:{ Exception -> 0x022f }
            r6.f24639c = r2     // Catch:{ Exception -> 0x022f }
            r6.f24640d = r3     // Catch:{ Exception -> 0x022f }
            r6.f24641e = r8     // Catch:{ Exception -> 0x022f }
            r6.f24642f = r13     // Catch:{ Exception -> 0x022f }
            r6.f24645i = r12     // Catch:{ Exception -> 0x022f }
            java.lang.Object r12 = r15.mo60636a((kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>>) r6)     // Catch:{ Exception -> 0x022f }
            if (r12 != r7) goto L_0x00e5
            goto L_0x0241
        L_0x00e5:
            r16 = r8
            r8 = r0
            r0 = r3
            r3 = r12
            r12 = r1
            r1 = r16
        L_0x00ed:
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ Exception -> 0x022f }
            r1.init(r13, r3)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.C9006a5.m27121a(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.x r1 = com.appodeal.ads.C9409q4.m27877m()     // Catch:{ Exception -> 0x022f }
            r1.mo61195n()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.C9139c1.m27231a(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.storage.a r1 = r8.f24558i     // Catch:{ Exception -> 0x022f }
            r6.f24637a = r12     // Catch:{ Exception -> 0x022f }
            r6.f24638b = r2     // Catch:{ Exception -> 0x022f }
            r6.f24639c = r0     // Catch:{ Exception -> 0x022f }
            r6.f24640d = r14     // Catch:{ Exception -> 0x022f }
            r6.f24641e = r14     // Catch:{ Exception -> 0x022f }
            r6.f24642f = r14     // Catch:{ Exception -> 0x022f }
            r6.f24645i = r11     // Catch:{ Exception -> 0x022f }
            java.lang.Object r1 = r1.mo60766a((com.appodeal.ads.C9725y4) r6)     // Catch:{ Exception -> 0x022f }
            if (r1 != r7) goto L_0x0117
            goto L_0x0241
        L_0x0117:
            r1 = r2
            r2 = r12
        L_0x0119:
            com.appodeal.ads.utils.C9609c.m28359c(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.C9609c.m28356a((android.content.Context) r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.C9609c.m28358b(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.C9624f.m28382a((android.content.Context) r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.campaign_frequency.C9616b.m28369a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.segments.C9492h.m28085a()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.app.b[] r3 = com.appodeal.ads.utils.app.C9606b.values()     // Catch:{ Exception -> 0x022f }
            int r6 = r3.length     // Catch:{ Exception -> 0x022f }
            r7 = 0
        L_0x0131:
            if (r7 >= r6) goto L_0x013e
            r8 = r3[r7]     // Catch:{ Exception -> 0x022f }
            int r7 = r7 + 1
            r2.registerActivityLifecycleCallbacks(r8)     // Catch:{ Exception -> 0x022f }
            r2.registerComponentCallbacks(r8)     // Catch:{ Exception -> 0x022f }
            goto L_0x0131
        L_0x013e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r2.<init>()     // Catch:{ Exception -> 0x022f }
            r3 = 118(0x76, float:1.65E-43)
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.modules.common.internal.Constants.SDK_VERSION     // Catch:{ Exception -> 0x022f }
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            r3 = 47
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = "ddMMyy"
            java.util.Date r6 = com.appodeal.ads.modules.common.internal.Constants.BUILD_DATE     // Catch:{ Exception -> 0x022f }
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r6)     // Catch:{ Exception -> 0x022f }
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = " initialized, appKey: "
            r2.append(r3)     // Catch:{ Exception -> 0x022f }
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", package name: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x022f }
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", consent: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.Boolean r1 = com.appodeal.ads.C9700x2.m28508c()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x017e
            r1 = r14
            goto L_0x0182
        L_0x017e:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022f }
        L_0x0182:
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = ", manager consent: "
            r2.append(r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.consent.Consent r1 = com.appodeal.ads.C9700x2.m28510d()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x0191
            goto L_0x019c
        L_0x0191:
            com.appodeal.consent.Consent$Status r1 = r1.getStatus()     // Catch:{ Exception -> 0x022f }
            if (r1 != 0) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            java.lang.String r14 = r1.name()     // Catch:{ Exception -> 0x022f }
        L_0x019c:
            r2.append(r14)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = "Current device is: "
            boolean r2 = com.appodeal.ads.C9182f1.m27291l()     // Catch:{ Exception -> 0x022f }
            if (r2 == 0) goto L_0x01b1
            java.lang.String r2 = "Emulator"
            goto L_0x01b3
        L_0x01b1:
            java.lang.String r2 = "Real Device"
        L_0x01b3:
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = com.appodeal.ads.C9409q4.m27871h()     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x0213
            java.lang.String r1 = com.appodeal.ads.C9409q4.m27874j()     // Catch:{ Exception -> 0x022f }
            if (r1 == 0) goto L_0x0213
            java.lang.String r1 = com.appodeal.ads.C9409q4.m27869g()     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = " v"
            java.lang.String r3 = "For "
            if (r1 == 0) goto L_0x01f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.C9409q4.m27871h()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.C9409q4.m27874j()     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = " ev"
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.C9409q4.m27869g()     // Catch:{ Exception -> 0x022f }
            goto L_0x0209
        L_0x01f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            java.lang.String r3 = com.appodeal.ads.C9409q4.m27871h()     // Catch:{ Exception -> 0x022f }
            r1.append(r3)     // Catch:{ Exception -> 0x022f }
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r2 = com.appodeal.ads.C9409q4.m27874j()     // Catch:{ Exception -> 0x022f }
        L_0x0209:
            r1.append(r2)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
        L_0x0213:
            java.lang.String r1 = "Google play services version: "
            java.lang.String r2 = com.appodeal.ads.C9326n5.m27555e(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.utils.Log.log((java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r1)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.AppodealPackageAddedReceiver r1 = new com.appodeal.ads.AppodealPackageAddedReceiver     // Catch:{ Exception -> 0x022f }
            r1.<init>()     // Catch:{ Exception -> 0x022f }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x022f }
            r1.register(r0)     // Catch:{ Exception -> 0x022f }
            com.appodeal.ads.C9213i.m27355d(r0)     // Catch:{ Exception -> 0x022f }
            goto L_0x023f
        L_0x022f:
            r0 = move-exception
            com.appodeal.ads.i1 r1 = com.appodeal.ads.C9194g1.f23071a
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x023a
            java.lang.String r0 = ""
        L_0x023a:
            r1.mo59987b(r0)
            com.appodeal.ads.C9409q4.f23840b = r10
        L_0x023f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L_0x0241:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.m28519a(com.appodeal.ads.x4, android.app.Application, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60829a(android.app.Application r17, java.lang.String r18, com.appodeal.consent.Consent r19, java.lang.Boolean r20, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends com.appodeal.ads.initializing.ApdInitializationError>>> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof com.appodeal.ads.C9706x4.C9707a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.appodeal.ads.x4$a r2 = (com.appodeal.ads.C9706x4.C9707a) r2
            int r3 = r2.f24568i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f24568i = r3
            goto L_0x001c
        L_0x0017:
            com.appodeal.ads.x4$a r2 = new com.appodeal.ads.x4$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f24566g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f24568i
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r6) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            com.appodeal.ads.x4 r2 = r2.f24560a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a6
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            android.content.Context r4 = r2.f24565f
            java.lang.Boolean r6 = r2.f24564e
            com.appodeal.consent.Consent r7 = r2.f24563d
            java.lang.String r8 = r2.f24562c
            android.app.Application r9 = r2.f24561b
            com.appodeal.ads.x4 r10 = r2.f24560a
            kotlin.ResultKt.throwOnFailure(r1)
            r12 = r6
            r11 = r7
            r1 = r10
            r10 = r4
            r15 = r9
            r9 = r8
            r8 = r15
            goto L_0x0083
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r1)
            android.content.Context r4 = r17.getApplicationContext()
            com.appodeal.ads.i1 r1 = com.appodeal.ads.C9194g1.f23071a
            r1.mo59985a()
            com.appodeal.ads.storage.a$a r1 = r0.f24559j
            r2.f24560a = r0
            r7 = r17
            r2.f24561b = r7
            r8 = r18
            r2.f24562c = r8
            r9 = r19
            r2.f24563d = r9
            r10 = r20
            r2.f24564e = r10
            r2.f24565f = r4
            r2.f24568i = r6
            java.lang.Object r1 = r1.mo60777a(r2)
            if (r1 != r3) goto L_0x007d
            return r3
        L_0x007d:
            r1 = r0
            r11 = r9
            r12 = r10
            r10 = r4
            r9 = r8
            r8 = r7
        L_0x0083:
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.x4$b r14 = new com.appodeal.ads.x4$b
            r13 = 0
            r6 = r14
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.f24560a = r1
            r6 = 0
            r2.f24561b = r6
            r2.f24562c = r6
            r2.f24563d = r6
            r2.f24564e = r6
            r2.f24565f = r6
            r2.f24568i = r5
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r4, r14, r2)
            if (r2 != r3) goto L_0x00a5
            return r3
        L_0x00a5:
            r2 = r1
        L_0x00a6:
            com.appodeal.ads.initializing.a r1 = r2.f24553d
            java.util.ArrayList r1 = r1.mo60046a()
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            com.appodeal.ads.initializing.a r3 = r2.f24553d
            java.util.ArrayList r3 = r3.mo60046a()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ba:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x010c
            java.lang.Object r4 = r3.next()
            com.appodeal.ads.initializing.ApdInitializationError r4 = (com.appodeal.ads.initializing.ApdInitializationError) r4
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.Critical
            if (r5 == 0) goto L_0x00d1
            com.appodeal.ads.initializing.ApdInitializationError$Critical r4 = (com.appodeal.ads.initializing.ApdInitializationError.Critical) r4
            java.lang.String r4 = r4.getDescription()
            goto L_0x00fc
        L_0x00d1:
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.NonCritical
            if (r5 == 0) goto L_0x00f4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.appodeal.ads.initializing.ApdInitializationError$NonCritical r4 = (com.appodeal.ads.initializing.ApdInitializationError.NonCritical) r4
            java.lang.String r6 = r4.getComponentName()
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            java.lang.String r4 = r4.getDescription()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x00fc
        L_0x00f4:
            boolean r5 = r4 instanceof com.appodeal.ads.initializing.ApdInitializationError.InternalError
            if (r5 == 0) goto L_0x0106
            java.lang.String r4 = r4.getMessage()
        L_0x00fc:
            com.appodeal.ads.i1 r5 = com.appodeal.ads.C9194g1.f23071a
            if (r4 != 0) goto L_0x0102
            java.lang.String r4 = ""
        L_0x0102:
            r5.mo59987b(r4)
            goto L_0x00ba
        L_0x0106:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x010c:
            com.appodeal.ads.initializing.a r2 = r2.f24553d
            r2.clear()
            java.lang.Object r1 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asSuccess(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9706x4.mo60829a(android.app.Application, java.lang.String, com.appodeal.consent.Consent, java.lang.Boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
