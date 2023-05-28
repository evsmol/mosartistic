package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.C9466s1;
import com.appodeal.ads.C9720y2;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.networking.C9361c;
import com.appodeal.ads.networking.C9373f;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.services.C9525g;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.Log;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.k0 */
public final class C9237k0 {

    /* renamed from: a */
    public static final C9237k0 f23201a = new C9237k0();

    /* renamed from: b */
    public static final Lazy f23202b = LazyKt.lazy(C9247j.f23244a);

    /* renamed from: c */
    public static final Lazy f23203c = LazyKt.lazy(C9239b.f23209a);

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$clickRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {155}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$a */
    public static final class C9238a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23204a;

        /* renamed from: b */
        public final /* synthetic */ C9466s1.C9467a.C9468a f23205b;

        /* renamed from: c */
        public final /* synthetic */ C9587u1 f23206c;

        /* renamed from: d */
        public final /* synthetic */ C9719y1 f23207d;

        /* renamed from: e */
        public final /* synthetic */ C9699x1 f23208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9238a(C9466s1.C9467a.C9468a aVar, C9587u1 u1Var, C9719y1 y1Var, C9699x1 x1Var, Continuation<? super C9238a> continuation) {
            super(2, continuation);
            this.f23205b = aVar;
            this.f23206c = u1Var;
            this.f23207d = y1Var;
            this.f23208e = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9238a(this.f23205b, this.f23206c, this.f23207d, this.f23208e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9238a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23204a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9466s1.C9467a.C9468a aVar = this.f23205b;
                this.f23204a = 1;
                obj2 = C9361c.m27706a((C9466s1) aVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9587u1 u1Var = this.f23206c;
            C9719y1 y1Var = this.f23207d;
            C9699x1 x1Var = this.f23208e;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                u1Var.mo60864a(jSONObject);
                y1Var.getClass();
                C9719y1.m28548a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
            }
            C9587u1 u1Var2 = this.f23206c;
            C9719y1 y1Var2 = this.f23207d;
            C9699x1 x1Var2 = this.f23208e;
            Throwable r5 = Result.m31664exceptionOrNullimpl(obj2);
            if (r5 != null) {
                C9373f.m27714a(r5);
                u1Var2.mo60863a();
                C9373f.m27714a(r5);
                y1Var2.getClass();
                C9373f.m27714a(r5);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.ads.k0$b */
    public static final class C9239b extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a */
        public static final C9239b f23209a = new C9239b();

        public C9239b() {
            super(0);
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(C9237k0.m27395a());
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {27}, mo38571m = "configRequest-IoAF18A")
    /* renamed from: com.appodeal.ads.k0$c */
    public static final class C9240c extends ContinuationImpl {

        /* renamed from: a */
        public C9571t1 f23210a;

        /* renamed from: b */
        public C9699x1 f23211b;

        /* renamed from: c */
        public /* synthetic */ Object f23212c;

        /* renamed from: d */
        public final /* synthetic */ C9237k0 f23213d;

        /* renamed from: e */
        public int f23214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9240c(C9237k0 k0Var, Continuation<? super C9240c> continuation) {
            super(continuation);
            this.f23213d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23212c = obj;
            this.f23214e |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f23213d.mo60087a((Continuation<? super Result<? extends JSONObject>>) this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$finishRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {213}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$d */
    public static final class C9241d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23215a;

        /* renamed from: b */
        public final /* synthetic */ C9466s1.C9467a.C9469b f23216b;

        /* renamed from: c */
        public final /* synthetic */ C9719y1 f23217c;

        /* renamed from: d */
        public final /* synthetic */ C9699x1 f23218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9241d(C9466s1.C9467a.C9469b bVar, C9719y1 y1Var, C9699x1 x1Var, Continuation<? super C9241d> continuation) {
            super(2, continuation);
            this.f23216b = bVar;
            this.f23217c = y1Var;
            this.f23218d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9241d(this.f23216b, this.f23217c, this.f23218d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9241d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23215a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9466s1.C9467a.C9469b bVar = this.f23216b;
                this.f23215a = 1;
                obj2 = C9361c.m27706a((C9466s1) bVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9719y1 y1Var = this.f23217c;
            C9699x1 x1Var = this.f23218d;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                y1Var.getClass();
                C9719y1.m28548a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
            }
            C9719y1 y1Var2 = this.f23217c;
            C9699x1 x1Var2 = this.f23218d;
            Throwable r4 = Result.m31664exceptionOrNullimpl(obj2);
            if (r4 != null) {
                C9373f.m27714a(r4);
                y1Var2.getClass();
                C9373f.m27714a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$getRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {123}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$e */
    public static final class C9242e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public C9571t1 f23219a;

        /* renamed from: b */
        public C9699x1 f23220b;

        /* renamed from: c */
        public int f23221c;

        /* renamed from: d */
        public final /* synthetic */ C9420r<?> f23222d;

        /* renamed from: e */
        public final /* synthetic */ C9464s<?> f23223e;

        /* renamed from: f */
        public final /* synthetic */ C9577u<?, ?, ?> f23224f;

        /* renamed from: g */
        public final /* synthetic */ Context f23225g;

        /* renamed from: h */
        public final /* synthetic */ C9577u<?, ?, ?>.e f23226h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9242e(C9420r<?> rVar, C9464s<?> sVar, C9577u<?, ?, ?> uVar, Context context, C9577u<?, ?, ?>.e eVar, Continuation<? super C9242e> continuation) {
            super(2, continuation);
            this.f23222d = rVar;
            this.f23223e = sVar;
            this.f23224f = uVar;
            this.f23225g = context;
            this.f23226h = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9242e(this.f23222d, this.f23223e, this.f23224f, this.f23225g, this.f23226h, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9242e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C9571t1 t1Var;
            C9699x1 x1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23221c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9466s1.C9473c cVar = new C9466s1.C9473c(this.f23222d, this.f23223e, this.f23224f);
                t1Var = new C9571t1(this.f23225g);
                C9699x1 x1Var2 = new C9699x1();
                this.f23219a = t1Var;
                this.f23220b = x1Var2;
                this.f23221c = 1;
                obj2 = C9361c.m27706a((C9466s1) cVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x1Var = x1Var2;
            } else if (i == 1) {
                x1Var = this.f23220b;
                t1Var = this.f23219a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9577u<?, ?, ?>.e eVar = this.f23226h;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                t1Var.mo60828a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
                eVar.mo60860a(jSONObject);
            }
            C9577u<?, ?, ?>.e eVar2 = this.f23226h;
            Throwable r6 = Result.m31664exceptionOrNullimpl(obj2);
            if (r6 != null) {
                C9373f.m27714a(r6);
                t1Var.getClass();
                C9373f.m27714a(r6);
                x1Var.getClass();
                eVar2.mo60859a(C9373f.m27714a(r6));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$iapRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {79}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$f */
    public static final class C9243f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public C9677v1 f23227a;

        /* renamed from: b */
        public C9699x1 f23228b;

        /* renamed from: c */
        public int f23229c;

        /* renamed from: d */
        public final /* synthetic */ Context f23230d;

        /* renamed from: e */
        public final /* synthetic */ C9466s1.C9474d f23231e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9243f(Context context, C9466s1.C9474d dVar, Continuation<? super C9243f> continuation) {
            super(2, continuation);
            this.f23230d = context;
            this.f23231e = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9243f(this.f23230d, this.f23231e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9243f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C9677v1 v1Var;
            C9699x1 x1Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23229c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                v1Var = new C9677v1(this.f23230d);
                C9699x1 x1Var2 = new C9699x1();
                C9466s1.C9474d dVar = this.f23231e;
                this.f23227a = v1Var;
                this.f23228b = x1Var2;
                this.f23229c = 1;
                Object a = C9361c.m27706a((C9466s1) dVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x1Var = x1Var2;
                obj2 = a;
            } else if (i == 1) {
                x1Var = this.f23228b;
                v1Var = this.f23227a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                v1Var.mo61209a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
            }
            Throwable r5 = Result.m31664exceptionOrNullimpl(obj2);
            if (r5 != null) {
                C9373f.m27714a(r5);
                v1Var.getClass();
                C9373f.m27714a(r5);
                x1Var.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {42}, mo38571m = "initRequest-IoAF18A")
    /* renamed from: com.appodeal.ads.k0$g */
    public static final class C9244g extends ContinuationImpl {

        /* renamed from: a */
        public C9571t1 f23232a;

        /* renamed from: b */
        public C9699x1 f23233b;

        /* renamed from: c */
        public /* synthetic */ Object f23234c;

        /* renamed from: d */
        public final /* synthetic */ C9237k0 f23235d;

        /* renamed from: e */
        public int f23236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9244g(C9237k0 k0Var, Continuation<? super C9244g> continuation) {
            super(continuation);
            this.f23235d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23234c = obj;
            this.f23236e |= RecyclerView.UNDEFINED_DURATION;
            Object b = this.f23235d.mo60088b(this);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Result.m31661boximpl(b);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {63}, mo38571m = "installRequest")
    /* renamed from: com.appodeal.ads.k0$h */
    public static final class C9245h extends ContinuationImpl {

        /* renamed from: a */
        public C9571t1 f23237a;

        /* renamed from: b */
        public C9699x1 f23238b;

        /* renamed from: c */
        public /* synthetic */ Object f23239c;

        /* renamed from: d */
        public final /* synthetic */ C9237k0 f23240d;

        /* renamed from: e */
        public int f23241e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9245h(C9237k0 k0Var, Continuation<? super C9245h> continuation) {
            super(continuation);
            this.f23240d = k0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23239c = obj;
            this.f23241e |= RecyclerView.UNDEFINED_DURATION;
            return this.f23240d.mo60086a((String) null, this);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$installRequestAsync$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {54}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$i */
    public static final class C9246i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23242a;

        /* renamed from: b */
        public final /* synthetic */ String f23243b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9246i(String str, Continuation<? super C9246i> continuation) {
            super(2, continuation);
            this.f23243b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9246i(this.f23243b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9246i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23242a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9237k0 k0Var = C9237k0.f23201a;
                String str = this.f23243b;
                this.f23242a = 1;
                if (k0Var.mo60086a(str, this) == coroutine_suspended) {
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

    /* renamed from: com.appodeal.ads.k0$j */
    public static final class C9247j extends Lambda implements Function0<ExecutorCoroutineDispatcher> {

        /* renamed from: a */
        public static final C9247j f23244a = new C9247j();

        public C9247j() {
            super(0);
        }

        public final Object invoke() {
            return ThreadPoolDispatcherKt.newSingleThreadContext("networking");
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$sessionsRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {96}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$k */
    public static final class C9248k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23245a;

        /* renamed from: b */
        public final /* synthetic */ C9466s1.C9477g f23246b;

        /* renamed from: c */
        public final /* synthetic */ C9684w1 f23247c;

        /* renamed from: d */
        public final /* synthetic */ C9699x1 f23248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9248k(C9466s1.C9477g gVar, C9684w1 w1Var, C9699x1 x1Var, Continuation<? super C9248k> continuation) {
            super(2, continuation);
            this.f23246b = gVar;
            this.f23247c = w1Var;
            this.f23248d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9248k(this.f23246b, this.f23247c, this.f23248d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9248k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23245a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9466s1.C9477g gVar = this.f23246b;
                this.f23245a = 1;
                obj2 = C9361c.m27706a((C9466s1) gVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9684w1 w1Var = this.f23247c;
            C9699x1 x1Var = this.f23248d;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                w1Var.getClass();
                C9684w1.m28462a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
            }
            C9684w1 w1Var2 = this.f23247c;
            C9699x1 x1Var2 = this.f23248d;
            Throwable r4 = Result.m31664exceptionOrNullimpl(obj2);
            if (r4 != null) {
                C9373f.m27714a(r4);
                w1Var2.getClass();
                C9373f.m27714a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$showRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {185}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$l */
    public static final class C9249l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23249a;

        /* renamed from: b */
        public final /* synthetic */ C9466s1.C9467a.C9470c f23250b;

        /* renamed from: c */
        public final /* synthetic */ C9719y1 f23251c;

        /* renamed from: d */
        public final /* synthetic */ C9699x1 f23252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9249l(C9466s1.C9467a.C9470c cVar, C9719y1 y1Var, C9699x1 x1Var, Continuation<? super C9249l> continuation) {
            super(2, continuation);
            this.f23250b = cVar;
            this.f23251c = y1Var;
            this.f23252d = x1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9249l(this.f23250b, this.f23251c, this.f23252d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9249l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23249a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9466s1.C9467a.C9470c cVar = this.f23250b;
                this.f23249a = 1;
                obj2 = C9361c.m27706a((C9466s1) cVar, (Continuation<? super Result<? extends JSONObject>>) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9719y1 y1Var = this.f23251c;
            C9699x1 x1Var = this.f23252d;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                y1Var.getClass();
                C9719y1.m28548a(jSONObject);
                x1Var.getClass();
                C9699x1.m28498a(jSONObject);
            }
            C9719y1 y1Var2 = this.f23251c;
            C9699x1 x1Var2 = this.f23252d;
            Throwable r4 = Result.m31664exceptionOrNullimpl(obj2);
            if (r4 != null) {
                C9373f.m27714a(r4);
                y1Var2.getClass();
                C9373f.m27714a(r4);
                x1Var2.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealNetworkRequestApi$statsRequest$1", mo38569f = "AppodealNetworkRequestApi.kt", mo38570l = {242}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.k0$m */
    public static final class C9250m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23253a;

        /* renamed from: b */
        public final /* synthetic */ C9720y2.C9721a f23254b;

        /* renamed from: c */
        public final /* synthetic */ C9577u<AdObjectType, AdRequestType, ?> f23255c;

        /* renamed from: d */
        public final /* synthetic */ AdRequestType f23256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9250m(C9720y2.C9721a aVar, C9577u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype, Continuation<? super C9250m> continuation) {
            super(2, continuation);
            this.f23254b = aVar;
            this.f23255c = uVar;
            this.f23256d = adrequesttype;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9250m(this.f23254b, this.f23255c, this.f23256d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9250m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23253a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9720y2.C9721a aVar = this.f23254b;
                this.f23253a = 1;
                obj2 = C9361c.m27707a(aVar, (Continuation) this);
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m31669unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9577u<AdObjectType, AdRequestType, ?> uVar = this.f23255c;
            AdRequestType adrequesttype = this.f23256d;
            if (Result.m31667isSuccessimpl(obj2)) {
                JSONObject jSONObject = (JSONObject) obj2;
                Log.log("PostBid", "ApiNetworkRequest: onSuccess");
                Log.logObject(LogConstants.KEY_SDK, LogConstants.EVENT_RESPONSE, jSONObject, Log.LogLevel.verbose);
                uVar.mo60833a(adrequesttype, jSONObject);
            }
            C9577u<AdObjectType, AdRequestType, ?> uVar2 = this.f23255c;
            AdRequestType adrequesttype2 = this.f23256d;
            if (Result.m31664exceptionOrNullimpl(obj2) != null) {
                Log.log("PostBid", "ApiNetworkRequest: onFail");
                uVar2.mo60833a(adrequesttype2, (JSONObject) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final ExecutorCoroutineDispatcher m27395a() {
        return (ExecutorCoroutineDispatcher) f23202b.getValue();
    }

    /* renamed from: a */
    public static final void m27396a(Context context, double d, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9243f(context, new C9466s1.C9474d(d, str), (Continuation<? super C9243f>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m27397a(Context context, C9577u<?, ?, ?> uVar, C9420r<?> rVar, C9464s<?> sVar, C9577u<?, ?, ?>.e eVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uVar, "adTypeController");
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        Intrinsics.checkNotNullParameter(eVar, "callback");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9242e(rVar, sVar, uVar, context, eVar, (Continuation<? super C9242e>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m27398a(C9420r<?> rVar, C9258l<?, ?, ?, ?> lVar, Integer num, Double d) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9241d(new C9466s1.C9467a.C9469b(rVar, id, lVar.getEcpm(), num, d), new C9719y1(), new C9699x1(), (Continuation<? super C9241d>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m27399a(C9420r<?> rVar, C9258l<?, ?, ?, ?> lVar, Integer num, Double d, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        C9258l<?, ?, ?, ?> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        C9466s1.C9467a.C9468a aVar = new C9466s1.C9467a.C9468a(rVar, id, lVar.getEcpm(), num, d);
        C9719y1 y1Var = new C9719y1();
        C9699x1 x1Var = new C9699x1();
        C9587u1 u1Var = new C9587u1(unifiedAdCallbackClickTrackListener);
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9238a(aVar, u1Var, y1Var, x1Var, (Continuation<? super C9238a>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final <AdObjectType extends C9258l<?, ?, ?, ?>, AdRequestType extends C9420r<AdObjectType>> void m27400a(C9577u<AdObjectType, AdRequestType, ?> uVar, AdRequestType adrequesttype, AdObjectType adobjecttype) {
        C9577u<AdObjectType, AdRequestType, ?> uVar2 = uVar;
        AdRequestType adrequesttype2 = adrequesttype;
        Intrinsics.checkNotNullParameter(uVar, "adController");
        Intrinsics.checkNotNullParameter(adrequesttype2, "adRequest");
        C9515c b = C9525g.m28153b();
        Context applicationContext = C9148b.f22956b.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(C9234j4.f23194a, "instance");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9250m(new C9720y2.C9721a(applicationContext, uVar, adrequesttype, adobjecttype, b.getServicesData()), uVar, adrequesttype2, (Continuation<? super C9250m>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static void m27401a(String str) {
        Intrinsics.checkNotNullParameter(str, "packageName");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9246i(str, (Continuation<? super C9246i>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public static CoroutineScope m27402b() {
        return (CoroutineScope) f23203c.getValue();
    }

    /* renamed from: b */
    public static final void m27403b(C9420r<?> rVar, C9258l<?, ?, ?, ?> lVar, Integer num, Double d) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        Intrinsics.checkNotNullParameter(lVar, "adObject");
        String id = lVar.getId();
        Intrinsics.checkNotNullExpressionValue(id, "adObject.id");
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9249l(new C9466s1.C9467a.C9470c(rVar, id, lVar.getEcpm(), num, d), new C9719y1(), new C9699x1(), (Continuation<? super C9249l>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public static final void m27404c() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(m27402b(), (CoroutineContext) null, (CoroutineStart) null, new C9248k(new C9466s1.C9477g(), new C9684w1(), new C9699x1(), (Continuation<? super C9248k>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60086a(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.ads.C9237k0.C9245h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.appodeal.ads.k0$h r0 = (com.appodeal.ads.C9237k0.C9245h) r0
            int r1 = r0.f23241e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23241e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$h r0 = new com.appodeal.ads.k0$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f23239c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23241e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r6 = r0.f23238b
            com.appodeal.ads.t1 r0 = r0.f23237a
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.m31669unboximpl()
            goto L_0x0064
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.ads.context.b r7 = com.appodeal.ads.context.C9148b.f22956b
            android.content.Context r7 = r7.getApplicationContext()
            com.appodeal.ads.s1$f r2 = new com.appodeal.ads.s1$f
            r2.<init>(r6)
            com.appodeal.ads.t1 r6 = new com.appodeal.ads.t1
            r6.<init>(r7)
            com.appodeal.ads.x1 r7 = new com.appodeal.ads.x1
            r7.<init>()
            r0.f23237a = r6
            r0.f23238b = r7
            r0.f23241e = r3
            java.lang.Object r0 = com.appodeal.ads.networking.C9361c.m27706a((com.appodeal.ads.C9466s1) r2, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r4 = r0
            r0 = r6
            r6 = r7
            r7 = r4
        L_0x0064:
            boolean r1 = kotlin.Result.m31667isSuccessimpl(r7)
            if (r1 == 0) goto L_0x0076
            r1 = r7
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r0.mo60828a(r1)
            r6.getClass()
            com.appodeal.ads.C9699x1.m28498a(r1)
        L_0x0076:
            java.lang.Throwable r7 = kotlin.Result.m31664exceptionOrNullimpl(r7)
            if (r7 != 0) goto L_0x007d
            goto L_0x0089
        L_0x007d:
            com.appodeal.ads.networking.C9373f.m27714a(r7)
            r0.getClass()
            com.appodeal.ads.networking.C9373f.m27714a(r7)
            r6.getClass()
        L_0x0089:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9237k0.mo60086a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60087a(kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.C9237k0.C9240c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.k0$c r0 = (com.appodeal.ads.C9237k0.C9240c) r0
            int r1 = r0.f23214e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23214e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$c r0 = new com.appodeal.ads.k0$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f23212c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23214e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r1 = r0.f23211b
            com.appodeal.ads.t1 r0 = r0.f23210a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m31669unboximpl()
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.s1$b r6 = new com.appodeal.ads.s1$b
            r6.<init>()
            com.appodeal.ads.context.b r2 = com.appodeal.ads.context.C9148b.f22956b
            android.content.Context r2 = r2.getApplicationContext()
            com.appodeal.ads.t1 r4 = new com.appodeal.ads.t1
            r4.<init>(r2)
            com.appodeal.ads.x1 r2 = new com.appodeal.ads.x1
            r2.<init>()
            r0.f23210a = r4
            r0.f23211b = r2
            r0.f23214e = r3
            java.lang.Object r6 = com.appodeal.ads.networking.C9361c.m27706a((com.appodeal.ads.C9466s1) r6, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r2
            r0 = r4
        L_0x0062:
            boolean r2 = kotlin.Result.m31667isSuccessimpl(r6)
            if (r2 == 0) goto L_0x0074
            r2 = r6
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r0.mo60828a(r2)
            r1.getClass()
            com.appodeal.ads.C9699x1.m28498a(r2)
        L_0x0074:
            java.lang.Throwable r2 = kotlin.Result.m31664exceptionOrNullimpl(r6)
            if (r2 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            com.appodeal.ads.networking.C9373f.m27714a(r2)
            r0.getClass()
            com.appodeal.ads.networking.C9373f.m27714a(r2)
            r1.getClass()
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9237k0.mo60087a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60088b(kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.C9237k0.C9244g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.k0$g r0 = (com.appodeal.ads.C9237k0.C9244g) r0
            int r1 = r0.f23236e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23236e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.k0$g r0 = new com.appodeal.ads.k0$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f23234c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23236e
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            com.appodeal.ads.x1 r1 = r0.f23233b
            com.appodeal.ads.t1 r0 = r0.f23232a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m31669unboximpl()
            goto L_0x0062
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.s1$e r6 = new com.appodeal.ads.s1$e
            r6.<init>()
            com.appodeal.ads.context.b r2 = com.appodeal.ads.context.C9148b.f22956b
            android.content.Context r2 = r2.getApplicationContext()
            com.appodeal.ads.t1 r4 = new com.appodeal.ads.t1
            r4.<init>(r2)
            com.appodeal.ads.x1 r2 = new com.appodeal.ads.x1
            r2.<init>()
            r0.f23232a = r4
            r0.f23233b = r2
            r0.f23236e = r3
            java.lang.Object r6 = com.appodeal.ads.networking.C9361c.m27706a((com.appodeal.ads.C9466s1) r6, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r2
            r0 = r4
        L_0x0062:
            boolean r2 = kotlin.Result.m31667isSuccessimpl(r6)
            if (r2 == 0) goto L_0x0074
            r2 = r6
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r0.mo60828a(r2)
            r1.getClass()
            com.appodeal.ads.C9699x1.m28498a(r2)
        L_0x0074:
            java.lang.Throwable r2 = kotlin.Result.m31664exceptionOrNullimpl(r6)
            if (r2 != 0) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            com.appodeal.ads.networking.C9373f.m27714a(r2)
            r0.getClass()
            com.appodeal.ads.networking.C9373f.m27714a(r2)
            r1.getClass()
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9237k0.mo60088b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
