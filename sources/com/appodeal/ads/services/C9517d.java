package com.appodeal.ads.services;

import com.appodeal.ads.C9326n5;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.appodeal.ads.services.d */
public final class C9517d implements C9515c, C9515c.C9516a {

    /* renamed from: a */
    public final MutableStateFlow<Set<Service<? extends ServiceOptions>>> f24140a = StateFlowKt.MutableStateFlow(SetsKt.emptySet());

    @DebugMetadata(mo38568c = "com.appodeal.ads.services.ServicesSolutionImpl$logEvent$2", mo38569f = "ServicesSolutionImpl.kt", mo38570l = {29}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.services.d$a */
    public static final class C9518a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f24141a;

        /* renamed from: b */
        public final /* synthetic */ C9517d f24142b;

        /* renamed from: c */
        public final /* synthetic */ String f24143c;

        /* renamed from: d */
        public final /* synthetic */ Map<String, Object> f24144d;

        @DebugMetadata(mo38568c = "com.appodeal.ads.services.ServicesSolutionImpl$logEvent$2$1", mo38569f = "ServicesSolutionImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.services.d$a$a */
        public static final class C9519a extends SuspendLambda implements Function2<Set<? extends Service<? extends ServiceOptions>>, Continuation<? super Boolean>, Object> {

            /* renamed from: a */
            public /* synthetic */ Object f24145a;

            public C9519a(Continuation<? super C9519a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C9519a aVar = new C9519a(continuation);
                aVar.f24145a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9519a) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!((Set) this.f24145a).isEmpty());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9518a(C9517d dVar, String str, Map<String, ? extends Object> map, Continuation<? super C9518a> continuation) {
            super(2, continuation);
            this.f24142b = dVar;
            this.f24143c = str;
            this.f24144d = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9518a(this.f24142b, this.f24143c, this.f24144d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9518a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24141a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow a = this.f24142b.f24140a;
                C9519a aVar = new C9519a((Continuation<? super C9519a>) null);
                this.f24141a = 1;
                obj = FlowKt.first(a, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = this.f24143c;
            Map<String, Object> map = this.f24144d;
            for (Service service : (Iterable) obj) {
                service.logEvent(str, map);
                String a2 = C9326n5.m27531a(service.getInfo().getName());
                Intrinsics.checkNotNullExpressionValue(a2, "capitalize((service as Service<*>).info.name)");
                Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INFO, a2 + ' ' + ("logEvent - " + str + " with params: " + map));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.services.ServicesSolutionImpl$trackRevenue$2", mo38569f = "ServicesSolutionImpl.kt", mo38570l = {108}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.services.d$b */
    public static final class C9520b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f24146a;

        /* renamed from: b */
        public final /* synthetic */ C9517d f24147b;

        /* renamed from: c */
        public final /* synthetic */ RevenueInfo f24148c;

        @DebugMetadata(mo38568c = "com.appodeal.ads.services.ServicesSolutionImpl$trackRevenue$2$services$1", mo38569f = "ServicesSolutionImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.services.d$b$a */
        public static final class C9521a extends SuspendLambda implements Function2<Set<? extends Service<? extends ServiceOptions>>, Continuation<? super Boolean>, Object> {

            /* renamed from: a */
            public /* synthetic */ Object f24149a;

            public C9521a(Continuation<? super C9521a> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C9521a aVar = new C9521a(continuation);
                aVar.f24149a = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9521a) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!((Set) this.f24149a).isEmpty());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9520b(C9517d dVar, RevenueInfo revenueInfo, Continuation<? super C9520b> continuation) {
            super(2, continuation);
            this.f24147b = dVar;
            this.f24148c = revenueInfo;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9520b(this.f24147b, this.f24148c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9520b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24146a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow a = this.f24147b.f24140a;
                C9521a aVar = new C9521a((Continuation<? super C9521a>) null);
                this.f24146a = 1;
                obj = FlowKt.first(a, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<R> filterIsInstance = CollectionsKt.filterIsInstance((Iterable) obj, RevenueTracker.class);
            RevenueInfo revenueInfo = this.f24148c;
            for (R trackRevenue : filterIsInstance) {
                trackRevenue.trackRevenue(revenueInfo);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60760a(com.appodeal.ads.inapp.InAppPurchase r11, com.appodeal.ads.inapp.InAppPurchaseValidateCallback r12, com.appodeal.ads.C9409q4.C9417h.C9418a r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.appodeal.ads.services.C9522e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.appodeal.ads.services.e r0 = (com.appodeal.ads.services.C9522e) r0
            int r1 = r0.f24154e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24154e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.services.e r0 = new com.appodeal.ads.services.e
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f24152c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24154e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.appodeal.ads.inapp.InAppPurchaseValidateCallback r12 = r0.f24151b
            com.appodeal.ads.inapp.InAppPurchase r11 = r0.f24150a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r14)
            com.appodeal.ads.services.f r14 = new com.appodeal.ads.services.f
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r12
            r7 = r11
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f24150a = r11
            r0.f24151b = r12
            r0.f24154e = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r14 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r2, r14, r0)
            if (r14 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.Unit r14 = (kotlin.Unit) r14
            if (r14 != 0) goto L_0x0062
            if (r12 != 0) goto L_0x0059
            goto L_0x0062
        L_0x0059:
            com.appodeal.ads.service.ServiceError$IAPValidationTimeout r13 = com.appodeal.ads.service.ServiceError.IAPValidationTimeout.INSTANCE
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r13)
            r12.onInAppPurchaseValidateFail(r11, r13)
        L_0x0062:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.C9517d.mo60760a(com.appodeal.ads.inapp.InAppPurchase, com.appodeal.ads.inapp.InAppPurchaseValidateCallback, com.appodeal.ads.q4$h$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo60761a(RevenueInfo revenueInfo, Continuation<? super Unit> continuation) {
        return TimeoutKt.withTimeoutOrNull(10000, new C9520b(this, revenueInfo, (Continuation<? super C9520b>) null), continuation);
    }

    /* renamed from: a */
    public final Object mo60762a(String str, Map<String, ? extends Object> map, Continuation<? super Unit> continuation) {
        return TimeoutKt.withTimeoutOrNull(10000, new C9518a(this, str, map, (Continuation<? super C9518a>) null), continuation);
    }

    /* renamed from: a */
    public final Object mo60764a(List<? extends Service<? extends ServiceOptions>> list, Continuation<? super Unit> continuation) {
        Object emit = this.f24140a.emit(CollectionsKt.toSet(list), continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final ArrayList getServicesData() {
        List<R> filterIsInstance = CollectionsKt.filterIsInstance(this.f24140a.getValue(), ServiceDataProvider.class);
        ArrayList arrayList = new ArrayList();
        for (R serviceData : filterIsInstance) {
            ServiceData serviceData2 = serviceData.getServiceData();
            if (serviceData2 != null) {
                arrayList.add(serviceData2);
            }
        }
        return arrayList;
    }
}
