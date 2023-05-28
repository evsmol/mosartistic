package com.appodeal.ads.networking;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.C9131b3;
import com.appodeal.ads.C9203h0;
import com.appodeal.ads.C9223i5;
import com.appodeal.ads.C9235j5;
import com.appodeal.ads.C9255k4;
import com.appodeal.ads.C9466s1;
import com.appodeal.ads.C9698x0;
import com.appodeal.ads.modules.common.internal.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.HttpError;
import com.appodeal.ads.utils.Log;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.c */
public final class C9361c {

    @DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt", mo38569f = "JsonRequestExt.kt", mo38570l = {26}, mo38571m = "execute")
    /* renamed from: com.appodeal.ads.networking.c$a */
    public static final class C9362a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f23756a;

        /* renamed from: b */
        public int f23757b;

        public C9362a(Continuation<? super C9362a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(Object obj) {
            this.f23756a = obj;
            this.f23757b |= RecyclerView.UNDEFINED_DURATION;
            Object a = C9361c.m27706a((C9466s1) null, (Continuation<? super Result<? extends JSONObject>>) this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$2", mo38569f = "JsonRequestExt.kt", mo38570l = {27}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.networking.c$b */
    public static final class C9363b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a */
        public int f23758a;

        /* renamed from: b */
        public final /* synthetic */ int f23759b;

        /* renamed from: c */
        public final /* synthetic */ C9466s1 f23760c;

        /* renamed from: d */
        public final /* synthetic */ C9466s1 f23761d;

        /* renamed from: e */
        public final /* synthetic */ String f23762e;

        @DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$2$1", mo38569f = "JsonRequestExt.kt", mo38570l = {31, 47}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.ads.networking.c$b$a */
        public static final class C9364a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

            /* renamed from: a */
            public HttpClient.ZipBase64 f23763a;

            /* renamed from: b */
            public HttpClient.Method f23764b;

            /* renamed from: c */
            public int f23765c;

            /* renamed from: d */
            public final /* synthetic */ C9466s1 f23766d;

            /* renamed from: e */
            public final /* synthetic */ C9466s1 f23767e;

            /* renamed from: f */
            public final /* synthetic */ String f23768f;

            /* renamed from: com.appodeal.ads.networking.c$b$a$a */
            public static final class C9365a extends Lambda implements Function1<byte[], JSONObject> {

                /* renamed from: a */
                public static final C9365a f23769a = new C9365a();

                public C9365a() {
                    super(1);
                }

                public final Object invoke(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr == null) {
                        return null;
                    }
                    return new JSONObject(new String(bArr, Charsets.UTF_8));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9364a(C9466s1 s1Var, C9466s1 s1Var2, String str, Continuation<? super C9364a> continuation) {
                super(2, continuation);
                this.f23766d = s1Var;
                this.f23767e = s1Var2;
                this.f23768f = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C9364a(this.f23766d, this.f23767e, this.f23768f, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9364a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                HttpClient.ZipBase64 zipBase64;
                HttpClient.Method method;
                JSONObject a;
                JSONObject jSONObject;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f23765c;
                boolean z = true;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    zipBase64 = this.f23766d.mo60718e();
                    method = this.f23766d.mo60719f();
                    C9466s1 s1Var = this.f23766d;
                    this.f23763a = zipBase64;
                    this.f23764b = method;
                    this.f23765c = 1;
                    obj = s1Var.mo60717a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    method = this.f23764b;
                    zipBase64 = this.f23763a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    obj2 = ((Result) obj).m31669unboximpl();
                    return Result.m31661boximpl(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HttpClient.Method method2 = method;
                byte[] a2 = ((C9131b3) obj).mo59868a();
                C9466s1 s1Var2 = this.f23766d;
                StringBuilder a3 = C9203h0.m27334a("Request body size to ");
                a3.append(s1Var2.mo60720g());
                a3.append(": ");
                a3.append(a2.length);
                a3.append(" bytes.");
                Log.log("JsonRequest", a3.toString());
                obj2 = zipBase64.m31765enqueueyxL6bBk(method2, this.f23768f, a2, C9365a.f23769a, this.f23767e instanceof C9223i5);
                C9466s1 s1Var3 = this.f23767e;
                Result result = null;
                if (Result.m31667isSuccessimpl(obj2) && (jSONObject = (JSONObject) obj2) != null) {
                    C9698x0 x0Var = s1Var3 instanceof C9698x0 ? (C9698x0) s1Var3 : null;
                    if (x0Var != null) {
                        x0Var.mo60575a(jSONObject);
                    }
                }
                C9466s1 s1Var4 = this.f23767e;
                String str = this.f23768f;
                Throwable r6 = Result.m31664exceptionOrNullimpl(obj2);
                if (r6 != null) {
                    C9255k4 k4Var = s1Var4 instanceof C9255k4 ? (C9255k4) s1Var4 : null;
                    boolean b = k4Var == null ? false : k4Var.mo60094b();
                    C9235j5 j5Var = s1Var4 instanceof C9235j5 ? (C9235j5) s1Var4 : null;
                    if ((j5Var == null ? null : j5Var.mo60085c()) == null) {
                        z = false;
                    }
                    if (z || !b) {
                        InternalLogKt.logInternal("JsonRequestExt", Intrinsics.stringPlus("Request failed: ", str), r6);
                        C9698x0 x0Var2 = s1Var4 instanceof C9698x0 ? (C9698x0) s1Var4 : null;
                        if (!(x0Var2 == null || (a = x0Var2.mo60574a()) == null)) {
                            Result r11 = Result.m31661boximpl(ResultExtKt.asSuccess(a));
                            Object r0 = r11.m31669unboximpl();
                            if (Result.m31666isFailureimpl(r0)) {
                                r0 = null;
                            }
                            InternalLogKt.logInternal$default("JsonRequestExt", Intrinsics.stringPlus("Using cached result: ", r0), (Throwable) null, 4, (Object) null);
                            result = r11;
                        }
                        obj2 = result == null ? ResultExtKt.asFailure(r6) : result.m31669unboximpl();
                    } else {
                        InternalLogKt.logInternal("JsonRequestExt", "Applying retry logic (Failed at " + str + ')', r6);
                        this.f23763a = null;
                        this.f23764b = null;
                        this.f23765c = 2;
                        obj2 = C9361c.m27706a(s1Var4, (Continuation<? super Result<? extends JSONObject>>) this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Result.m31661boximpl(obj2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9363b(int i, C9466s1 s1Var, C9466s1 s1Var2, String str, Continuation<? super C9363b> continuation) {
            super(2, continuation);
            this.f23759b = i;
            this.f23760c = s1Var;
            this.f23761d = s1Var2;
            this.f23762e = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9363b(this.f23759b, this.f23760c, this.f23761d, this.f23762e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9363b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23758a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = (long) this.f23759b;
                C9364a aVar = new C9364a(this.f23760c, this.f23761d, this.f23762e, (Continuation<? super C9364a>) null);
                this.f23758a = 1;
                obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            return Result.m31661boximpl(result == null ? ResultExtKt.asFailure(HttpError.TimeoutError.INSTANCE) : result.m31669unboximpl());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m27706a(com.appodeal.ads.C9466s1 r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r11) {
        /*
            boolean r0 = r11 instanceof com.appodeal.ads.networking.C9361c.C9362a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.appodeal.ads.networking.c$a r0 = (com.appodeal.ads.networking.C9361c.C9362a) r0
            int r1 = r0.f23757b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23757b = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.networking.c$a r0 = new com.appodeal.ads.networking.c$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f23756a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23757b
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0099
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = r10 instanceof com.appodeal.ads.C9698x0
            r2 = 0
            if (r11 == 0) goto L_0x003e
            r11 = r10
            com.appodeal.ads.x0 r11 = (com.appodeal.ads.C9698x0) r11
            goto L_0x003f
        L_0x003e:
            r11 = r2
        L_0x003f:
            if (r11 != 0) goto L_0x0043
            r11 = r2
            goto L_0x0047
        L_0x0043:
            org.json.JSONObject r11 = r11.mo60574a()
        L_0x0047:
            if (r11 == 0) goto L_0x004e
            r11 = 10000(0x2710, float:1.4013E-41)
            r5 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0052
        L_0x004e:
            r11 = 20000(0x4e20, float:2.8026E-41)
            r5 = 20000(0x4e20, float:2.8026E-41)
        L_0x0052:
            boolean r11 = r10 instanceof com.appodeal.ads.C9235j5
            if (r11 == 0) goto L_0x005a
            r11 = r10
            com.appodeal.ads.j5 r11 = (com.appodeal.ads.C9235j5) r11
            goto L_0x005b
        L_0x005a:
            r11 = r2
        L_0x005b:
            if (r11 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            java.lang.String r2 = r11.mo60085c()
        L_0x0062:
            if (r2 != 0) goto L_0x006b
            r10.getClass()
            java.lang.String r2 = com.appodeal.ads.C9466s1.m27999d()
        L_0x006b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r2 = 47
            r11.append(r2)
            java.lang.String r2 = r10.mo60720g()
            r11.append(r2)
            java.lang.String r8 = r11.toString()
            kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.networking.c$b r2 = new com.appodeal.ads.networking.c$b
            r9 = 0
            r4 = r2
            r6 = r10
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f23757b = r3
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0)
            if (r11 != r1) goto L_0x0099
            return r1
        L_0x0099:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r10 = r11.m31669unboximpl()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.C9361c.m27706a(com.appodeal.ads.s1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m27707a(com.appodeal.ads.C9720y2.C9721a r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof com.appodeal.ads.networking.C9369d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.appodeal.ads.networking.d r0 = (com.appodeal.ads.networking.C9369d) r0
            int r1 = r0.f23777b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23777b = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.networking.d r0 = new com.appodeal.ads.networking.d
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f23776a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23777b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x006b
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            r11.getClass()
            java.lang.String r12 = com.appodeal.ads.C9720y2.m28549a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r12 = 47
            r2.append(r12)
            java.lang.String r12 = r11.mo61246d()
            r2.append(r12)
            java.lang.String r9 = r2.toString()
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()
            com.appodeal.ads.networking.e r2 = new com.appodeal.ads.networking.e
            r5 = 20000(0x4e20, double:9.8813E-320)
            r10 = 0
            r4 = r2
            r7 = r11
            r8 = r11
            r4.<init>(r5, r7, r8, r9, r10)
            r0.f23777b = r3
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r0)
            if (r12 != r1) goto L_0x006b
            return r1
        L_0x006b:
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r11 = r12.m31669unboximpl()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.C9361c.m27707a(com.appodeal.ads.y2$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
