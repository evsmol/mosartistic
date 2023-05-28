package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import com.appodeal.ads.networking.C9328b;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.ads.RegisterServicesUseCase$invoke$2", mo38569f = "RegisterServicesUseCase.kt", mo38570l = {64, 66}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.z2 */
public final class C9730z2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Pair<? extends ServiceVariant, ? extends Result<? extends Service<?>>>>>, Object> {

    /* renamed from: a */
    public Iterator f24657a;

    /* renamed from: b */
    public ServiceVariant f24658b;

    /* renamed from: c */
    public Object f24659c;

    /* renamed from: d */
    public Service f24660d;

    /* renamed from: e */
    public int f24661e;

    /* renamed from: f */
    public /* synthetic */ Object f24662f;

    /* renamed from: g */
    public final /* synthetic */ C9004a3 f24663g;

    /* renamed from: h */
    public final /* synthetic */ Context f24664h;

    /* renamed from: i */
    public final /* synthetic */ C9328b f24665i;

    /* renamed from: j */
    public final /* synthetic */ boolean f24666j;

    /* renamed from: k */
    public final /* synthetic */ String f24667k;

    /* renamed from: l */
    public final /* synthetic */ ApplicationData f24668l;

    /* renamed from: m */
    public final /* synthetic */ DeviceData f24669m;

    /* renamed from: n */
    public final /* synthetic */ UserPersonalData f24670n;

    /* renamed from: o */
    public final /* synthetic */ ServicesRegistry f24671o;

    @DebugMetadata(mo38568c = "com.appodeal.ads.RegisterServicesUseCase$invoke$2$deferredInitServices$1$1$1", mo38569f = "RegisterServicesUseCase.kt", mo38570l = {57}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.z2$a */
    public static final class C9731a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Service<?>>>, Object> {

        /* renamed from: a */
        public int f24672a;

        /* renamed from: b */
        public final /* synthetic */ ServiceVariant f24673b;

        /* renamed from: c */
        public final /* synthetic */ C9328b f24674c;

        /* renamed from: d */
        public final /* synthetic */ ServicesRegistry f24675d;

        /* renamed from: e */
        public final /* synthetic */ ServiceOptions f24676e;

        @DebugMetadata(mo38568c = "com.appodeal.ads.RegisterServicesUseCase$invoke$2$deferredInitServices$1$1$1$1", mo38569f = "RegisterServicesUseCase.kt", mo38570l = {58}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.z2$a$a */
        public static final class C9732a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Service<? extends ServiceOptions>>>, Object> {

            /* renamed from: a */
            public int f24677a;

            /* renamed from: b */
            public final /* synthetic */ ServicesRegistry f24678b;

            /* renamed from: c */
            public final /* synthetic */ ServiceOptions f24679c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9732a(ServicesRegistry servicesRegistry, ServiceOptions serviceOptions, Continuation<? super C9732a> continuation) {
                super(2, continuation);
                this.f24678b = servicesRegistry;
                this.f24679c = serviceOptions;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C9732a(this.f24678b, this.f24679c, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9732a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f24677a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ServicesRegistry servicesRegistry = this.f24678b;
                    ServiceOptions serviceOptions = this.f24679c;
                    this.f24677a = 1;
                    obj2 = servicesRegistry.m31760initializegIAlus(serviceOptions, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).m31669unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return Result.m31661boximpl(obj2);
            }
        }

        /* renamed from: com.appodeal.ads.z2$a$b */
        public /* synthetic */ class C9733b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ServiceVariant.values().length];
                iArr[ServiceVariant.Appsflyer.ordinal()] = 1;
                iArr[ServiceVariant.Adjust.ordinal()] = 2;
                iArr[ServiceVariant.FacebookAnalytics.ordinal()] = 3;
                iArr[ServiceVariant.Firebase.ordinal()] = 4;
                iArr[ServiceVariant.StackAnalytics.ordinal()] = 5;
                iArr[ServiceVariant.SentryAnalytics.ordinal()] = 6;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9731a(ServiceVariant serviceVariant, C9328b bVar, ServicesRegistry servicesRegistry, ServiceOptions serviceOptions, Continuation<? super C9731a> continuation) {
            super(2, continuation);
            this.f24673b = serviceVariant;
            this.f24674c = bVar;
            this.f24675d = servicesRegistry;
            this.f24676e = serviceOptions;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9731a(this.f24673b, this.f24674c, this.f24675d, this.f24676e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9731a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
            if (r8 != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
            r3 = 15000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
            r3 = r8.longValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
            r8 = new com.appodeal.ads.C9730z2.C9731a.C9732a(r7.f24675d, r7.f24676e, (kotlin.coroutines.Continuation<? super com.appodeal.ads.C9730z2.C9731a.C9732a>) null);
            r7.f24672a = 1;
            r8 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r3, r8, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
            if (r8 != r0) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f24672a
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x00a2
            L_0x0010:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0018:
                kotlin.ResultKt.throwOnFailure(r8)
                com.appodeal.ads.modules.common.internal.service.ServiceVariant r8 = r7.f24673b
                int[] r1 = com.appodeal.ads.C9730z2.C9731a.C9733b.$EnumSwitchMapping$0
                int r8 = r8.ordinal()
                r8 = r1[r8]
                r1 = 0
                switch(r8) {
                    case 1: goto L_0x0075;
                    case 2: goto L_0x0067;
                    case 3: goto L_0x0059;
                    case 4: goto L_0x004b;
                    case 5: goto L_0x003d;
                    case 6: goto L_0x002f;
                    default: goto L_0x0029;
                }
            L_0x0029:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L_0x002f:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$e r8 = r8.mo60368e()
                if (r8 != 0) goto L_0x0038
                goto L_0x007d
            L_0x0038:
                long r3 = r8.mo60409a()
                goto L_0x0083
            L_0x003d:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$f r8 = r8.mo60370f()
                if (r8 != 0) goto L_0x0046
                goto L_0x007d
            L_0x0046:
                long r3 = r8.mo60420b()
                goto L_0x0083
            L_0x004b:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$d r8 = r8.mo60367d()
                if (r8 != 0) goto L_0x0054
                goto L_0x007d
            L_0x0054:
                long r3 = r8.mo60402d()
                goto L_0x0083
            L_0x0059:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$c r8 = r8.mo60366c()
                if (r8 != 0) goto L_0x0062
                goto L_0x007d
            L_0x0062:
                long r3 = r8.mo60393a()
                goto L_0x0083
            L_0x0067:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$a r8 = r8.mo60364a()
                if (r8 != 0) goto L_0x0070
                goto L_0x007d
            L_0x0070:
                long r3 = r8.mo60376d()
                goto L_0x0083
            L_0x0075:
                com.appodeal.ads.networking.b r8 = r7.f24674c
                com.appodeal.ads.networking.b$b r8 = r8.mo60365b()
                if (r8 != 0) goto L_0x007f
            L_0x007d:
                r8 = r1
                goto L_0x0087
            L_0x007f:
                long r3 = r8.mo60386d()
            L_0x0083:
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            L_0x0087:
                if (r8 != 0) goto L_0x008c
                r3 = 15000(0x3a98, double:7.411E-320)
                goto L_0x0090
            L_0x008c:
                long r3 = r8.longValue()
            L_0x0090:
                com.appodeal.ads.z2$a$a r8 = new com.appodeal.ads.z2$a$a
                com.appodeal.ads.modules.common.internal.service.ServicesRegistry r5 = r7.f24675d
                com.appodeal.ads.modules.common.internal.service.ServiceOptions r6 = r7.f24676e
                r8.<init>(r5, r6, r1)
                r7.f24672a = r2
                java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r3, r8, r7)
                if (r8 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                kotlin.Result r8 = (kotlin.Result) r8
                if (r8 != 0) goto L_0x00b3
                kotlin.Result$Companion r8 = kotlin.Result.Companion
                com.appodeal.ads.service.ServiceError$InitializationTimeout r8 = com.appodeal.ads.service.ServiceError.InitializationTimeout.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
                java.lang.Object r8 = kotlin.Result.m31662constructorimpl(r8)
                goto L_0x00b7
            L_0x00b3:
                java.lang.Object r8 = r8.m31669unboximpl()
            L_0x00b7:
                kotlin.Result r8 = kotlin.Result.m31661boximpl(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9730z2.C9731a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9730z2(C9004a3 a3Var, Context context, C9328b bVar, boolean z, String str, ApplicationData applicationData, DeviceData deviceData, UserPersonalData userPersonalData, ServicesRegistry servicesRegistry, Continuation<? super C9730z2> continuation) {
        super(2, continuation);
        this.f24663g = a3Var;
        this.f24664h = context;
        this.f24665i = bVar;
        this.f24666j = z;
        this.f24667k = str;
        this.f24668l = applicationData;
        this.f24669m = deviceData;
        this.f24670n = userPersonalData;
        this.f24671o = servicesRegistry;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C9730z2 z2Var = new C9730z2(this.f24663g, this.f24664h, this.f24665i, this.f24666j, this.f24667k, this.f24668l, this.f24669m, this.f24670n, this.f24671o, continuation);
        z2Var.f24662f = obj;
        return z2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9730z2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24661e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            com.appodeal.ads.modules.common.internal.service.Service r2 = r0.f24660d
            java.lang.Object r6 = r0.f24659c
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r7 = r0.f24658b
            java.util.Iterator r8 = r0.f24657a
            java.lang.Object r9 = r0.f24662f
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r29)
            r3 = r0
            r0 = r6
            r4 = r7
            r6 = 0
            r7 = 1
            r10 = 2
            goto L_0x014d
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r2 = r0.f24658b
            java.util.Iterator r6 = r0.f24657a
            java.lang.Object r7 = r0.f24662f
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.throwOnFailure(r29)
            r4 = r29
            r3 = r0
            r8 = r6
            r9 = r7
            r6 = 0
            r7 = 1
            goto L_0x0118
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r29)
            java.lang.Object r2 = r0.f24662f
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            com.appodeal.ads.b5 r15 = new com.appodeal.ads.b5
            r15.<init>()
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            com.appodeal.ads.modules.common.internal.service.ServiceVariant[] r14 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.values()
            com.appodeal.ads.a3 r13 = r0.f24663g
            android.content.Context r12 = r0.f24664h
            com.appodeal.ads.networking.b r11 = r0.f24665i
            boolean r10 = r0.f24666j
            java.lang.String r9 = r0.f24667k
            com.appodeal.ads.modules.common.internal.data.ApplicationData r8 = r0.f24668l
            com.appodeal.ads.modules.common.internal.data.DeviceData r7 = r0.f24669m
            com.appodeal.ads.modules.common.internal.data.UserPersonalData r6 = r0.f24670n
            com.appodeal.ads.modules.common.internal.service.ServicesRegistry r3 = r0.f24671o
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r17 = 0
            int r5 = r14.length
            r0 = 0
        L_0x0073:
            r17 = r1
            if (r0 >= r5) goto L_0x00e0
            r1 = r14[r0]
            int r0 = r0 + 1
            com.appodeal.ads.l1 r18 = r13.f22785a
            r18.getClass()
            r18 = r6
            r6 = r12
            r19 = r7
            r7 = r1
            r20 = r8
            r8 = r11
            r21 = r9
            r9 = r10
            r22 = r10
            r10 = r15
            r23 = r11
            r11 = r21
            r24 = r12
            r12 = r20
            r25 = r13
            r13 = r19
            r26 = r14
            r14 = r18
            com.appodeal.ads.modules.common.internal.service.ServiceOptions r10 = com.appodeal.ads.C9261l1.m27435a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r10 != 0) goto L_0x00a9
            r1 = 0
            goto L_0x00c5
        L_0x00a9:
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getDefault()
            com.appodeal.ads.z2$a r13 = new com.appodeal.ads.z2$a
            r11 = 0
            r6 = r13
            r7 = r1
            r8 = r23
            r9 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r8 = 0
            r10 = 2
            r6 = r2
            r7 = r12
            r9 = r13
            kotlinx.coroutines.Deferred r6 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(r6, r7, r8, r9, r10, r11)
            kotlin.Pair r1 = kotlin.TuplesKt.m14544to(r1, r6)
        L_0x00c5:
            if (r1 != 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            r4.add(r1)
        L_0x00cb:
            r1 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            goto L_0x0073
        L_0x00e0:
            java.util.Iterator r0 = r4.iterator()
            r3 = r28
            r2 = r16
        L_0x00e8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01af
            java.lang.Object r4 = r0.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r5 = (com.appodeal.ads.modules.common.internal.service.ServiceVariant) r5
            java.lang.Object r4 = r4.component2()
            kotlinx.coroutines.Deferred r4 = (kotlinx.coroutines.Deferred) r4
            r3.f24662f = r2
            r3.f24657a = r0
            r3.f24658b = r5
            r6 = 0
            r3.f24659c = r6
            r3.f24660d = r6
            r7 = 1
            r3.f24661e = r7
            java.lang.Object r4 = r4.await(r3)
            if (r4 != r1) goto L_0x0115
            return r1
        L_0x0115:
            r8 = r0
            r9 = r2
            r2 = r5
        L_0x0118:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r0 = r4.m31669unboximpl()
            boolean r4 = kotlin.Result.m31667isSuccessimpl(r0)
            if (r4 == 0) goto L_0x0193
            r4 = r0
            com.appodeal.ads.modules.common.internal.service.Service r4 = (com.appodeal.ads.modules.common.internal.service.Service) r4
            boolean r5 = r4 instanceof com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
            if (r5 == 0) goto L_0x012f
            r5 = r4
            com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter r5 = (com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter) r5
            goto L_0x0130
        L_0x012f:
            r5 = r6
        L_0x0130:
            if (r5 != 0) goto L_0x0134
            r10 = 2
            goto L_0x0148
        L_0x0134:
            r3.f24662f = r9
            r3.f24657a = r8
            r3.f24658b = r2
            r3.f24659c = r0
            r3.f24660d = r4
            r10 = 2
            r3.f24661e = r10
            java.lang.Object r5 = r5.await(r3)
            if (r5 != r1) goto L_0x0148
            return r1
        L_0x0148:
            r27 = r4
            r4 = r2
            r2 = r27
        L_0x014d:
            java.lang.Object r5 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asSuccess(r2)
            kotlin.Result r5 = kotlin.Result.m31661boximpl(r5)
            kotlin.Pair r5 = kotlin.TuplesKt.m14544to(r4, r5)
            r9.add(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.appodeal.ads.modules.common.internal.service.ServiceInfo r11 = r2.getInfo()
            java.lang.String r11 = r11.getName()
            java.lang.String r11 = com.appodeal.ads.C9326n5.m27531a((java.lang.String) r11)
            r5.append(r11)
            java.lang.String r11 = " - ver. "
            r5.append(r11)
            com.appodeal.ads.modules.common.internal.service.ServiceInfo r2 = r2.getInfo()
            java.lang.String r2 = r2.getSdkVersion()
            r5.append(r2)
            java.lang.String r2 = " initialized"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.appodeal.ads.utils.Log$LogLevel r5 = com.appodeal.ads.utils.Log.LogLevel.verbose
            java.lang.String r11 = "Service"
            java.lang.String r12 = "Info"
            com.appodeal.ads.utils.Log.log(r11, r12, r2, r5)
            goto L_0x0195
        L_0x0193:
            r10 = 2
            r4 = r2
        L_0x0195:
            r2 = r9
            java.lang.Throwable r0 = kotlin.Result.m31664exceptionOrNullimpl(r0)
            if (r0 != 0) goto L_0x019d
            goto L_0x01ac
        L_0x019d:
            java.lang.Object r0 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asFailure(r0)
            kotlin.Result r0 = kotlin.Result.m31661boximpl(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.m14544to(r4, r0)
            r2.add(r0)
        L_0x01ac:
            r0 = r8
            goto L_0x00e8
        L_0x01af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9730z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
