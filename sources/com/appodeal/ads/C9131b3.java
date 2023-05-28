package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9359c;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.b3 */
public final class C9131b3 {

    /* renamed from: a */
    public final C9197g4 f22932a;

    /* renamed from: b */
    public final Lazy f22933b;

    /* renamed from: c */
    public C9420r<?> f22934c;

    /* renamed from: d */
    public C9464s<?> f22935d;

    /* renamed from: e */
    public C9577u<?, ?, ?> f22936e;

    @DebugMetadata(mo38568c = "com.appodeal.ads.RequestBodyBuilder", mo38569f = "RequestBodyBuilder.kt", mo38570l = {36}, mo38571m = "bind")
    /* renamed from: com.appodeal.ads.b3$a */
    public static final class C9132a extends ContinuationImpl {

        /* renamed from: a */
        public C9131b3 f22937a;

        /* renamed from: b */
        public C9359c[] f22938b;

        /* renamed from: c */
        public C9359c f22939c;

        /* renamed from: d */
        public int f22940d;

        /* renamed from: e */
        public int f22941e;

        /* renamed from: f */
        public /* synthetic */ Object f22942f;

        /* renamed from: g */
        public final /* synthetic */ C9131b3 f22943g;

        /* renamed from: h */
        public int f22944h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9132a(C9131b3 b3Var, Continuation<? super C9132a> continuation) {
            super(continuation);
            this.f22943g = b3Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f22942f = obj;
            this.f22944h |= RecyclerView.UNDEFINED_DURATION;
            return this.f22943g.mo59867a((C9359c[]) null, (Continuation<? super C9131b3>) this);
        }
    }

    /* renamed from: com.appodeal.ads.b3$b */
    public static final class C9133b extends Lambda implements Function0<JSONObject> {

        /* renamed from: a */
        public static final C9133b f22945a = new C9133b();

        public C9133b() {
            super(0);
        }

        public final Object invoke() {
            return JsonObjectBuilderKt.jsonObject(C9142c3.f22952a);
        }
    }

    public C9131b3() {
        this(0);
    }

    public /* synthetic */ C9131b3(int i) {
        this(C9221i4.m27381a());
    }

    public C9131b3(C9197g4 g4Var) {
        Intrinsics.checkNotNullParameter(g4Var, IronSourceConstants.EVENTS_PROVIDER);
        this.f22932a = g4Var;
        this.f22933b = LazyKt.lazy(C9133b.f22945a);
    }

    /* renamed from: a */
    public final C9131b3 mo59863a(C9420r<?> rVar) {
        Intrinsics.checkNotNullParameter(rVar, "adRequest");
        this.f22934c = rVar;
        return this;
    }

    /* renamed from: a */
    public final C9131b3 mo59864a(C9464s<?> sVar) {
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        this.f22935d = sVar;
        return this;
    }

    /* renamed from: a */
    public final C9131b3 mo59865a(C9577u<?, ?, ?> uVar) {
        Intrinsics.checkNotNullParameter(uVar, "adTypeController");
        this.f22936e = uVar;
        return this;
    }

    /* renamed from: a */
    public final byte[] mo59868a() {
        byte[] bArr;
        if (((JSONObject) this.f22933b.getValue()).length() != 0) {
            String jSONObject = ((JSONObject) this.f22933b.getValue()).toString();
            if (jSONObject == null) {
                bArr = null;
            } else {
                bArr = jSONObject.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
            }
            if (bArr != null) {
                return bArr;
            }
        }
        return new byte[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo59867a(com.appodeal.ads.networking.binders.C9359c[] r14, kotlin.coroutines.Continuation<? super com.appodeal.ads.C9131b3> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.appodeal.ads.C9131b3.C9132a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.appodeal.ads.b3$a r0 = (com.appodeal.ads.C9131b3.C9132a) r0
            int r1 = r0.f22944h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22944h = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.b3$a r0 = new com.appodeal.ads.b3$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f22942f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f22944h
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            int r14 = r0.f22941e
            int r2 = r0.f22940d
            com.appodeal.ads.networking.binders.c r4 = r0.f22939c
            com.appodeal.ads.networking.binders.c[] r5 = r0.f22938b
            com.appodeal.ads.b3 r6 = r0.f22937a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0073
        L_0x0033:
            r15 = move-exception
            goto L_0x007f
        L_0x0035:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = 0
            int r2 = r14.length
            r10 = r13
            r15 = r14
            r14 = r2
            r2 = r1
            r1 = r0
            r0 = 0
        L_0x0048:
            if (r0 >= r14) goto L_0x00a0
            r11 = r15[r0]
            int r0 = r0 + 1
            com.appodeal.ads.g4 r4 = r10.f22932a     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.r<?> r6 = r10.f22934c     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.s<?> r7 = r10.f22935d     // Catch:{ Exception -> 0x0076 }
            com.appodeal.ads.u<?, ?, ?> r8 = r10.f22936e     // Catch:{ Exception -> 0x0076 }
            r1.f22937a = r10     // Catch:{ Exception -> 0x0076 }
            r1.f22938b = r15     // Catch:{ Exception -> 0x0076 }
            r1.f22939c = r11     // Catch:{ Exception -> 0x0076 }
            r1.f22940d = r0     // Catch:{ Exception -> 0x0076 }
            r1.f22941e = r14     // Catch:{ Exception -> 0x0076 }
            r1.f22944h = r3     // Catch:{ Exception -> 0x0076 }
            r5 = r11
            r9 = r1
            java.lang.Object r4 = r4.mo59972a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0076 }
            if (r4 != r2) goto L_0x006b
            return r2
        L_0x006b:
            r5 = r15
            r15 = r4
            r6 = r10
            r4 = r11
            r12 = r2
            r2 = r0
            r0 = r1
            r1 = r12
        L_0x0073:
            com.appodeal.ads.networking.binders.b r15 = (com.appodeal.ads.networking.binders.C9336b) r15     // Catch:{ Exception -> 0x0033 }
            goto L_0x008b
        L_0x0076:
            r4 = move-exception
            r5 = r15
            r15 = r4
            r6 = r10
            r4 = r11
            r12 = r2
            r2 = r0
            r0 = r1
            r1 = r12
        L_0x007f:
            java.lang.String r7 = "Error while binding data for "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r4)
            java.lang.String r7 = "RequestBodyBuilder"
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal(r7, r4, r15)
            r15 = 0
        L_0x008b:
            r10 = r6
            r12 = r1
            r1 = r0
            r0 = r2
            r2 = r12
            if (r15 != 0) goto L_0x0093
            goto L_0x009e
        L_0x0093:
            kotlin.Lazy r4 = r10.f22933b
            java.lang.Object r4 = r4.getValue()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            com.appodeal.ads.C9190f4.m27300a(r4, r15)
        L_0x009e:
            r15 = r5
            goto L_0x0048
        L_0x00a0:
            kotlin.Lazy r14 = r10.f22933b
            java.lang.Object r14 = r14.getValue()
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            com.appodeal.ads.j4 r15 = com.appodeal.ads.C9234j4.f23194a
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            com.appodeal.ads.C9700x2.m28507b(r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9131b3.mo59867a(com.appodeal.ads.networking.binders.c[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: a */
    public final C9131b3 mo59866a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        ((JSONObject) this.f22933b.getValue()).put(str, obj);
        return this;
    }
}
