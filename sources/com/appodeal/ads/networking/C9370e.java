package com.appodeal.ads.networking;

import com.appodeal.ads.C9203h0;
import com.appodeal.ads.C9223i5;
import com.appodeal.ads.C9720y2;
import com.appodeal.ads.api.Request;
import com.appodeal.ads.modules.common.internal.ext.ResultExtKt;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.HttpError;
import com.appodeal.ads.utils.Log;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;

@DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$4", mo38569f = "JsonRequestExt.kt", mo38570l = {65}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.ads.networking.e */
public final class C9370e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

    /* renamed from: a */
    public int f23778a;

    /* renamed from: b */
    public final /* synthetic */ long f23779b;

    /* renamed from: c */
    public final /* synthetic */ C9720y2 f23780c;

    /* renamed from: d */
    public final /* synthetic */ C9720y2 f23781d;

    /* renamed from: e */
    public final /* synthetic */ String f23782e;

    @DebugMetadata(mo38568c = "com.appodeal.ads.networking.JsonRequestExtKt$execute$4$1", mo38569f = "JsonRequestExt.kt", mo38570l = {69}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.networking.e$a */
    public static final class C9371a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a */
        public HttpClient.Proto f23783a;

        /* renamed from: b */
        public HttpClient.Method f23784b;

        /* renamed from: c */
        public int f23785c;

        /* renamed from: d */
        public final /* synthetic */ C9720y2 f23786d;

        /* renamed from: e */
        public final /* synthetic */ C9720y2 f23787e;

        /* renamed from: f */
        public final /* synthetic */ String f23788f;

        /* renamed from: com.appodeal.ads.networking.e$a$a */
        public static final class C9372a extends Lambda implements Function1<byte[], JSONObject> {

            /* renamed from: a */
            public static final C9372a f23789a = new C9372a();

            public C9372a() {
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
        public C9371a(C9720y2 y2Var, C9720y2 y2Var2, String str, Continuation<? super C9371a> continuation) {
            super(2, continuation);
            this.f23786d = y2Var;
            this.f23787e = y2Var2;
            this.f23788f = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9371a(this.f23786d, this.f23787e, this.f23788f, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9371a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            HttpClient.Method method;
            HttpClient.Proto proto;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23785c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpClient.Proto b = this.f23786d.mo61244b();
                HttpClient.Method c = this.f23786d.mo61245c();
                C9720y2 y2Var = this.f23786d;
                this.f23783a = b;
                this.f23784b = c;
                this.f23785c = 1;
                Object a = y2Var.mo61243a(this);
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                proto = b;
                method = c;
                obj = a;
            } else if (i == 1) {
                HttpClient.Method method2 = this.f23784b;
                HttpClient.Proto proto2 = this.f23783a;
                ResultKt.throwOnFailure(obj);
                HttpClient.Proto proto3 = proto2;
                method = method2;
                proto = proto3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] byteArray = ((Request.Builder) obj).build().toByteArray();
            C9720y2 y2Var2 = this.f23786d;
            StringBuilder a2 = C9203h0.m27334a("Request body size to ");
            a2.append(y2Var2.mo61246d());
            a2.append(": ");
            a2.append(byteArray.length);
            a2.append(" bytes.");
            Log.log("ProtoRequest", a2.toString());
            return Result.m31661boximpl(proto.m31765enqueueyxL6bBk(method, this.f23788f, byteArray, C9372a.f23789a, this.f23787e instanceof C9223i5));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9370e(long j, C9720y2 y2Var, C9720y2 y2Var2, String str, Continuation<? super C9370e> continuation) {
        super(2, continuation);
        this.f23779b = j;
        this.f23780c = y2Var;
        this.f23781d = y2Var2;
        this.f23782e = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9370e(this.f23779b, this.f23780c, this.f23781d, this.f23782e, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9370e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23778a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f23779b;
            C9371a aVar = new C9371a(this.f23780c, this.f23781d, this.f23782e, (Continuation<? super C9371a>) null);
            this.f23778a = 1;
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
