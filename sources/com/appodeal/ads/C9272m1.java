package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.m1 */
public final class C9272m1 {

    /* renamed from: a */
    public final C9237k0 f23329a;

    /* renamed from: b */
    public final ContextProvider f23330b;

    @DebugMetadata(mo38568c = "com.appodeal.ads.InitRequestUseCase", mo38569f = "InitRequestUseCase.kt", mo38570l = {13, 16}, mo38571m = "invoke-IoAF18A")
    /* renamed from: com.appodeal.ads.m1$a */
    public static final class C9273a extends ContinuationImpl {

        /* renamed from: a */
        public C9272m1 f23331a;

        /* renamed from: b */
        public JSONObject f23332b;

        /* renamed from: c */
        public /* synthetic */ Object f23333c;

        /* renamed from: d */
        public final /* synthetic */ C9272m1 f23334d;

        /* renamed from: e */
        public int f23335e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9273a(C9272m1 m1Var, Continuation<? super C9273a> continuation) {
            super(continuation);
            this.f23334d = m1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23333c = obj;
            this.f23335e |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f23334d.mo60129a(this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.InitRequestUseCase", mo38569f = "InitRequestUseCase.kt", mo38570l = {24}, mo38571m = "parseResponse")
    /* renamed from: com.appodeal.ads.m1$b */
    public static final class C9274b extends ContinuationImpl {

        /* renamed from: a */
        public C9272m1 f23336a;

        /* renamed from: b */
        public JSONObject f23337b;

        /* renamed from: c */
        public /* synthetic */ Object f23338c;

        /* renamed from: d */
        public final /* synthetic */ C9272m1 f23339d;

        /* renamed from: e */
        public int f23340e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9274b(C9272m1 m1Var, Continuation<? super C9274b> continuation) {
            super(continuation);
            this.f23339d = m1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23338c = obj;
            this.f23340e |= RecyclerView.UNDEFINED_DURATION;
            return this.f23339d.mo60130a((JSONObject) null, this);
        }
    }

    public /* synthetic */ C9272m1(int i) {
        this(C9237k0.f23201a, C9148b.f22956b);
    }

    public C9272m1(C9237k0 k0Var, ContextProvider contextProvider) {
        Intrinsics.checkNotNullParameter(k0Var, "appodealNetworkRequestApi");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f23329a = k0Var;
        this.f23330b = contextProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60129a(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.C9272m1.C9273a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.m1$a r0 = (com.appodeal.ads.C9272m1.C9273a) r0
            int r1 = r0.f23335e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23335e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.m1$a r0 = new com.appodeal.ads.m1$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f23333c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23335e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            org.json.JSONObject r1 = r0.f23332b
            com.appodeal.ads.m1 r0 = r0.f23331a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0071
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            com.appodeal.ads.m1 r2 = r0.f23331a
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m31669unboximpl()
            goto L_0x0055
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.k0 r6 = r5.f23329a
            r0.f23331a = r5
            r0.f23335e = r4
            java.lang.Object r6 = r6.mo60088b(r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            boolean r4 = kotlin.Result.m31667isSuccessimpl(r6)
            if (r4 == 0) goto L_0x0089
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            if (r6 != 0) goto L_0x0062
            goto L_0x0087
        L_0x0062:
            r0.f23331a = r2
            r0.f23332b = r6
            r0.f23335e = r3
            java.lang.Object r0 = r2.mo60130a(r6, r0)
            if (r0 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r1 = r6
            r0 = r2
        L_0x0071:
            r0.getClass()
            java.lang.String r6 = "init"
            org.json.JSONArray r6 = r1.optJSONArray(r6)
            com.appodeal.ads.ApdServiceRegistry r1 = com.appodeal.ads.ApdServiceRegistry.getInstance()
            com.appodeal.ads.modules.common.internal.context.ContextProvider r0 = r0.f23330b
            android.content.Context r0 = r0.getApplicationContext()
            r1.initialize(r0, r6)
        L_0x0087:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x0089:
            java.lang.Object r6 = kotlin.Result.m31662constructorimpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9272m1.mo60129a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60130a(org.json.JSONObject r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.C9272m1.C9274b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.m1$b r0 = (com.appodeal.ads.C9272m1.C9274b) r0
            int r1 = r0.f23340e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23340e = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.m1$b r0 = new com.appodeal.ads.m1$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f23338c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23340e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            org.json.JSONObject r5 = r0.f23337b
            com.appodeal.ads.m1 r0 = r0.f23336a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            com.appodeal.ads.r0 r6 = com.appodeal.ads.C9422r0.f23912a
            com.appodeal.ads.C9422r0.m27930a((org.json.JSONObject) r5)
            r0.f23336a = r4
            r0.f23337b = r5
            r0.f23340e = r3
            java.lang.Object r6 = r6.mo60637a((org.json.JSONObject) r5, (kotlin.coroutines.Continuation<? super kotlin.Unit>) r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r0 = r4
        L_0x004b:
            com.appodeal.ads.r0 r6 = com.appodeal.ads.C9422r0.f23912a
            com.appodeal.ads.C9422r0.m27932b(r5)
            com.appodeal.ads.C9217i0.m27370a(r5)
            com.appodeal.ads.C9700x2.m28503a((org.json.JSONObject) r5)
            com.appodeal.ads.utils.x r6 = com.appodeal.ads.C9409q4.m27877m()
            com.appodeal.ads.modules.common.internal.context.ContextProvider r0 = r0.f23330b
            android.content.Context r0 = r0.getApplicationContext()
            r6.mo61182a((android.content.Context) r0, (org.json.JSONObject) r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9272m1.mo60130a(org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
