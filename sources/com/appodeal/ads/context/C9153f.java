package com.appodeal.ads.context;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.context.C9145a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.appodeal.ads.context.f */
public final class C9153f implements ContextProvider, ContextProvider.Synchronizer {

    /* renamed from: a */
    public Context f22962a;

    /* renamed from: b */
    public final Lazy f22963b = LazyKt.lazy(new C9154a(this));

    /* renamed from: c */
    public final MutableStateFlow<C9145a> f22964c;

    /* renamed from: d */
    public Activity f22965d;

    /* renamed from: e */
    public final C9155b f22966e;

    /* renamed from: f */
    public final MutableStateFlow<Activity> f22967f;

    /* renamed from: com.appodeal.ads.context.f$a */
    public static final class C9154a extends Lambda implements Function0<C9159h> {

        /* renamed from: a */
        public final /* synthetic */ C9153f f22968a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9154a(C9153f fVar) {
            super(0);
            this.f22968a = fVar;
        }

        public final Object invoke() {
            return new C9159h(new C9151d(this.f22968a), new C9152e(this.f22968a));
        }
    }

    /* renamed from: com.appodeal.ads.context.f$b */
    public static final class C9155b implements Flow<Activity> {

        /* renamed from: a */
        public final /* synthetic */ Flow f22969a;

        /* renamed from: com.appodeal.ads.context.f$b$a */
        public static final class C9156a<T> implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ FlowCollector f22970a;

            @DebugMetadata(mo38568c = "com.appodeal.ads.context.ContextProviderImpl$special$$inlined$map$1$2", mo38569f = "ContextProviderImpl.kt", mo38570l = {224}, mo38571m = "emit")
            /* renamed from: com.appodeal.ads.context.f$b$a$a */
            public static final class C9157a extends ContinuationImpl {

                /* renamed from: a */
                public /* synthetic */ Object f22971a;

                /* renamed from: b */
                public int f22972b;

                /* renamed from: c */
                public final /* synthetic */ C9156a f22973c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C9157a(C9156a aVar, Continuation continuation) {
                    super(continuation);
                    this.f22973c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f22971a = obj;
                    this.f22972b |= RecyclerView.UNDEFINED_DURATION;
                    return this.f22973c.emit((Object) null, this);
                }
            }

            public C9156a(FlowCollector flowCollector) {
                this.f22970a = flowCollector;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.appodeal.ads.context.C9153f.C9155b.C9156a.C9157a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.appodeal.ads.context.f$b$a$a r0 = (com.appodeal.ads.context.C9153f.C9155b.C9156a.C9157a) r0
                    int r1 = r0.f22972b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f22972b = r1
                    goto L_0x0018
                L_0x0013:
                    com.appodeal.ads.context.f$b$a$a r0 = new com.appodeal.ads.context.f$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f22971a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f22972b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f22970a
                    com.appodeal.ads.context.a r5 = (com.appodeal.ads.context.C9145a) r5
                    android.app.Activity r5 = r5.getActivity()
                    r0.f22972b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.context.C9153f.C9155b.C9156a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C9155b(MutableStateFlow mutableStateFlow) {
            this.f22969a = mutableStateFlow;
        }

        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.f22969a.collect(new C9156a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public C9153f() {
        MutableStateFlow<C9145a> MutableStateFlow = StateFlowKt.MutableStateFlow(mo59886a());
        this.f22964c = MutableStateFlow;
        this.f22966e = new C9155b(MutableStateFlow);
        this.f22967f = StateFlowKt.MutableStateFlow(this.f22965d);
    }

    /* renamed from: a */
    public static final void m27237a(C9153f fVar, Activity activity) {
        MutableStateFlow<C9145a> mutableStateFlow;
        Object aVar;
        InternalLogKt.logInternal$default("ContextProvider", Reflection.getOrCreateKotlinClass(fVar.f22964c.getValue().getClass()).getSimpleName() + ". Activity is destroyed: " + activity, (Throwable) null, 4, (Object) null);
        if (Intrinsics.areEqual((Object) fVar.f22965d, (Object) activity)) {
            fVar.f22965d = null;
        }
        Activity activity2 = fVar.f22965d;
        boolean z = true;
        if (activity2 == null || !activity2.isDestroyed()) {
            z = false;
        }
        if (z) {
            fVar.f22965d = null;
        }
        if (Intrinsics.areEqual((Object) fVar.f22964c.getValue().getActivity(), (Object) activity)) {
            C9145a value = fVar.f22964c.getValue();
            if (value instanceof C9145a.C9147b) {
                mutableStateFlow = fVar.f22964c;
                aVar = new C9145a.C9147b((Activity) null);
            } else if (value instanceof C9145a.C9146a) {
                mutableStateFlow = fVar.f22964c;
                aVar = new C9145a.C9146a((Activity) null);
            } else {
                return;
            }
            mutableStateFlow.setValue(aVar);
        }
    }

    /* renamed from: b */
    public static final void m27238b(C9153f fVar, Activity activity) {
        InternalLogKt.logInternal$default("ContextProvider", Reflection.getOrCreateKotlinClass(fVar.f22964c.getValue().getClass()).getSimpleName() + " Resumed Activity updated: " + activity, (Throwable) null, 4, (Object) null);
        fVar.f22965d = activity;
        fVar.f22967f.tryEmit(activity);
        C9145a value = fVar.f22964c.getValue();
        if (value instanceof C9145a.C9147b) {
            fVar.f22964c.setValue(new C9145a.C9147b(activity));
        } else {
            boolean z = value instanceof C9145a.C9146a;
        }
    }

    /* renamed from: a */
    public final C9145a.C9146a mo59886a() {
        return new C9145a.C9146a(this.f22965d);
    }

    public final Activity getActivity() {
        return this.f22964c.getValue().getActivity();
    }

    public final Flow<Activity> getActivityFlow() {
        return this.f22966e;
    }

    public final Context getApplicationContext() {
        Context context = this.f22962a;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Context not provided".toString());
    }

    public final Context getApplicationContextOrNull() {
        return this.f22962a;
    }

    public final StateFlow getTopActivityFlow() {
        return this.f22967f;
    }

    public final void setActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C9145a value = this.f22964c.getValue();
        if (!(value instanceof C9145a.C9147b) && (value instanceof C9145a.C9146a) && !Intrinsics.areEqual((Object) value.getActivity(), (Object) activity)) {
            this.f22964c.setValue(new C9145a.C9146a(activity));
        }
    }

    public final void setApplicationContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        if (this.f22962a == null) {
            this.f22962a = context;
            Context applicationContext = getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks((C9159h) this.f22963b.getValue());
            }
        }
    }

    public final void setAutomaticActivityObserving(boolean z) {
        MutableStateFlow<C9145a> mutableStateFlow;
        Object obj;
        C9145a value = this.f22964c.getValue();
        if (z) {
            if (!(value instanceof C9145a.C9147b)) {
                mutableStateFlow = this.f22964c;
                obj = new C9145a.C9147b(this.f22965d);
            } else {
                return;
            }
        } else if (!(value instanceof C9145a.C9146a)) {
            mutableStateFlow = this.f22964c;
            obj = new C9145a.C9146a(this.f22965d);
        } else {
            return;
        }
        mutableStateFlow.setValue(obj);
    }
}
