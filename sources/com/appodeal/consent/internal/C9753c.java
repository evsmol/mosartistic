package com.appodeal.consent.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.modules.libs.network.Networking;
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
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.internal.c */
public final class C9753c {

    /* renamed from: a */
    public static final C9753c f24749a = new C9753c();

    /* renamed from: b */
    public static final HttpClient.Method f24750b = HttpClient.Method.POST;

    /* renamed from: c */
    public static final HttpClient.Zip f24751c = HttpClient.Zip.INSTANCE;

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.ConsentRequest", mo38569f = "ConsentRequest.kt", mo38570l = {20}, mo38571m = "execute-0E7RQCE$apd_consent")
    /* renamed from: com.appodeal.consent.internal.c$a */
    public static final class C9754a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f24752a;

        /* renamed from: b */
        public final /* synthetic */ C9753c f24753b;

        /* renamed from: c */
        public int f24754c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9754a(C9753c cVar, Continuation<? super C9754a> continuation) {
            super(continuation);
            this.f24753b = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24752a = obj;
            this.f24754c |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f24753b.mo61329a((C9749a) null, (String) null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.ConsentRequest$execute$2", mo38569f = "ConsentRequest.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.c$b */
    public static final class C9755b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends JSONObject>>, Object> {

        /* renamed from: a */
        public final /* synthetic */ String f24755a;

        /* renamed from: b */
        public final /* synthetic */ C9749a f24756b;

        /* renamed from: com.appodeal.consent.internal.c$b$a */
        public static final class C9756a extends Lambda implements Function1<byte[], JSONObject> {

            /* renamed from: a */
            public static final C9756a f24757a = new C9756a();

            public C9756a() {
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
        public C9755b(C9749a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f24755a = str;
            this.f24756b = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9755b(this.f24756b, this.f24755a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9755b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            HttpClient.Zip a = C9753c.f24751c;
            HttpClient.Method b = C9753c.f24750b;
            String str = this.f24755a;
            String jSONObject = C9778j.m28608a(this.f24756b).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "RequestDataBinder.bind(d…              .toString()");
            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return Result.m31661boximpl(Networking.DefaultImpls.m31766enqueueyxL6bBk$default(a, b, str, bytes, C9756a.f24757a, false, 16, (Object) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61329a(com.appodeal.consent.internal.C9749a r5, java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.appodeal.consent.internal.C9753c.C9754a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.appodeal.consent.internal.c$a r0 = (com.appodeal.consent.internal.C9753c.C9754a) r0
            int r1 = r0.f24754c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24754c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.consent.internal.c$a r0 = new com.appodeal.consent.internal.c$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f24752a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24754c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            com.appodeal.consent.internal.c$b r7 = new com.appodeal.consent.internal.c$b
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.f24754c = r3
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r5, r7, r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.Result r7 = (kotlin.Result) r7
            if (r7 != 0) goto L_0x0050
            com.appodeal.ads.modules.libs.network.HttpError$TimeoutError r5 = com.appodeal.ads.modules.libs.network.HttpError.TimeoutError.INSTANCE
            java.lang.Object r5 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asFailure(r5)
            goto L_0x0054
        L_0x0050:
            java.lang.Object r5 = r7.m31669unboximpl()
        L_0x0054:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.C9753c.mo61329a(com.appodeal.consent.internal.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
