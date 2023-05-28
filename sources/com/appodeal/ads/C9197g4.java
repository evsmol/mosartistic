package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import com.appodeal.ads.networking.binders.C9359c;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.g4 */
public final class C9197g4 {

    /* renamed from: a */
    public final Context f23123a;

    /* renamed from: b */
    public final C9529a f23124b;

    /* renamed from: c */
    public final C9515c f23125c;

    /* renamed from: d */
    public final ServicesRegistry f23126d;

    /* renamed from: com.appodeal.ads.g4$a */
    public /* synthetic */ class C9198a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C9359c.values().length];
            Set<C9359c> set = C9359c.f23747a;
            iArr[0] = 1;
            Set<C9359c> set2 = C9359c.f23747a;
            iArr[1] = 2;
            Set<C9359c> set3 = C9359c.f23747a;
            iArr[2] = 3;
            Set<C9359c> set4 = C9359c.f23747a;
            iArr[3] = 4;
            Set<C9359c> set5 = C9359c.f23747a;
            iArr[4] = 5;
            Set<C9359c> set6 = C9359c.f23747a;
            iArr[5] = 6;
            Set<C9359c> set7 = C9359c.f23747a;
            iArr[6] = 7;
            Set<C9359c> set8 = C9359c.f23747a;
            iArr[7] = 8;
            Set<C9359c> set9 = C9359c.f23747a;
            iArr[8] = 9;
            Set<C9359c> set10 = C9359c.f23747a;
            iArr[9] = 10;
            Set<C9359c> set11 = C9359c.f23747a;
            iArr[10] = 11;
            Set<C9359c> set12 = C9359c.f23747a;
            iArr[11] = 12;
            Set<C9359c> set13 = C9359c.f23747a;
            iArr[12] = 13;
            Set<C9359c> set14 = C9359c.f23747a;
            iArr[13] = 14;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdType.values().length];
            iArr2[AdType.Banner.ordinal()] = 1;
            iArr2[AdType.Mrec.ordinal()] = 2;
            iArr2[AdType.Interstitial.ordinal()] = 3;
            iArr2[AdType.Video.ordinal()] = 4;
            iArr2[AdType.Rewarded.ordinal()] = 5;
            iArr2[AdType.Native.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.RequestDataProvider", mo38569f = "RequestDataProvider.kt", mo38570l = {130}, mo38571m = "getBase")
    /* renamed from: com.appodeal.ads.g4$b */
    public static final class C9199b extends ContinuationImpl {

        /* renamed from: a */
        public Context f23127a;

        /* renamed from: b */
        public /* synthetic */ Object f23128b;

        /* renamed from: c */
        public final /* synthetic */ C9197g4 f23129c;

        /* renamed from: d */
        public int f23130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9199b(C9197g4 g4Var, Continuation<? super C9199b> continuation) {
            super(continuation);
            this.f23129c = g4Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23128b = obj;
            this.f23130d |= RecyclerView.UNDEFINED_DURATION;
            return this.f23129c.mo59971a((Context) null, this);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.RequestDataProvider", mo38569f = "RequestDataProvider.kt", mo38570l = {123}, mo38571m = "getBinderData")
    /* renamed from: com.appodeal.ads.g4$c */
    public static final class C9200c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f23131a;

        /* renamed from: b */
        public final /* synthetic */ C9197g4 f23132b;

        /* renamed from: c */
        public int f23133c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9200c(C9197g4 g4Var, Continuation<? super C9200c> continuation) {
            super(continuation);
            this.f23132b = g4Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23131a = obj;
            this.f23133c |= RecyclerView.UNDEFINED_DURATION;
            return this.f23132b.mo59972a((C9359c) null, (C9420r<?>) null, (C9464s<?>) null, (C9577u<?, ?, ?>) null, this);
        }
    }

    public C9197g4(Context context, C9562o oVar, C9515c cVar, ServicesRegistry servicesRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        Intrinsics.checkNotNullParameter(cVar, "servicesSolution");
        Intrinsics.checkNotNullParameter(servicesRegistry, "servicesRegistry");
        this.f23123a = context;
        this.f23124b = oVar;
        this.f23125c = cVar;
        this.f23126d = servicesRegistry;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo59971a(android.content.Context r51, kotlin.coroutines.Continuation<? super com.appodeal.ads.networking.binders.C9336b.C9349e> r52) {
        /*
            r50 = this;
            r0 = r50
            r1 = r52
            boolean r2 = r1 instanceof com.appodeal.ads.C9197g4.C9199b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.appodeal.ads.g4$b r2 = (com.appodeal.ads.C9197g4.C9199b) r2
            int r3 = r2.f23130d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f23130d = r3
            goto L_0x001c
        L_0x0017:
            com.appodeal.ads.g4$b r2 = new com.appodeal.ads.g4$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f23128b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f23130d
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            android.content.Context r2 = r2.f23127a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r1)
            com.appodeal.ads.storage.a r1 = r0.f23124b
            r4 = r51
            r2.f23127a = r4
            r2.f23130d = r5
            java.lang.Object r1 = r1.mo60768a((kotlin.coroutines.jvm.internal.ContinuationImpl) r2)
            if (r1 != r3) goto L_0x0049
            return r3
        L_0x0049:
            r2 = r4
        L_0x004a:
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0171
            java.lang.String r12 = r2.getPackageName()
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r12, r3)
            android.graphics.Point r5 = com.appodeal.ads.C9182f1.m27295o(r2)
            java.lang.String r6 = "getScreenSize(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = com.appodeal.ads.modules.common.internal.Constants.SDK_VERSION
            java.lang.String r7 = com.appodeal.ads.C9182f1.m27285i()
            java.lang.String r8 = "getVersionRelease()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r9 = com.appodeal.ads.C9182f1.m27285i()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            java.lang.String r10 = com.appodeal.ads.utils.C9617d.f24377a
            java.lang.String r11 = "PLATFORM_VALUE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            java.lang.String r11 = com.appodeal.ads.C9182f1.m27285i()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
            int r13 = com.appodeal.ads.C9182f1.m27286j()
            java.lang.String r14 = com.appodeal.ads.C9182f1.m27268a((android.content.Context) r2)
            java.lang.String r8 = "packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)
            java.lang.String r15 = r3.versionName
            r51 = r14
            r16 = r15
            long r14 = r3.firstInstallTime
            r3 = 1000(0x3e8, float:1.401E-42)
            r52 = r10
            r17 = r11
            long r10 = (long) r3
            long r14 = r14 / r10
            java.lang.Long r14 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r14)
            java.lang.String r1 = r1.getInstallerPackageName(r12)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = "unknown"
        L_0x00ae:
            r15 = r1
            java.lang.String r1 = com.appodeal.ads.C9409q4.m27871h()
            java.lang.String r18 = com.appodeal.ads.C9409q4.m27869g()
            java.lang.String r19 = com.appodeal.ads.C9409q4.m27874j()
            float r3 = com.appodeal.ads.C9182f1.m27290l(r2)
            double r10 = (double) r3
            boolean r3 = com.appodeal.ads.C9182f1.m27298r(r2)
            if (r3 == 0) goto L_0x00c9
            java.lang.String r3 = "tablet"
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r3 = "phone"
        L_0x00cb:
            r21 = r3
            boolean r22 = com.appodeal.ads.C9422r0.m27935c()
            java.lang.String r8 = com.appodeal.ads.C9182f1.m27271b()
            java.lang.String r3 = "getManufacturer()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = com.appodeal.ads.C9182f1.m27271b()
            r3.append(r0)
            r0 = 32
            r3.append(r0)
            java.lang.String r0 = com.appodeal.ads.C9182f1.m27273c()
            r3.append(r0)
            java.lang.String r24 = r3.toString()
            boolean r25 = com.appodeal.ads.C9182f1.m27293m()
            java.lang.String r26 = com.appodeal.ads.C9326n5.m27556f(r2)
            int r0 = r5.x
            int r5 = r5.y
            java.lang.String r29 = com.appodeal.ads.C9182f1.m27277e(r2)
            float r3 = com.appodeal.ads.C9182f1.m27270b((android.content.Context) r2)
            r27 = r0
            r20 = r1
            double r0 = (double) r3
            long r32 = com.appodeal.ads.C9182f1.m27280g()
            long r34 = com.appodeal.ads.C9182f1.m27278f()
            long r36 = com.appodeal.ads.C9182f1.m27283h()
            long r38 = com.appodeal.ads.C9182f1.m27288k(r2)
            long r40 = com.appodeal.ads.C9182f1.m27287j(r2)
            long r42 = com.appodeal.ads.C9182f1.m27276e()
            float r2 = com.appodeal.ads.C9182f1.m27264a()
            double r2 = (double) r2
            boolean r46 = com.appodeal.ads.C9217i0.m27371a()
            boolean r23 = com.appodeal.ads.C9422r0.f23913b
            java.lang.Boolean r47 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r23)
            r47.booleanValue()
            com.appodeal.ads.ExtraData r23 = com.appodeal.ads.ExtraData.INSTANCE
            boolean r28 = r23.isNotEmpty()
            if (r28 == 0) goto L_0x0146
            org.json.JSONObject r23 = r23.asJson()
            goto L_0x0148
        L_0x0146:
            r23 = 0
        L_0x0148:
            r48 = r23
            com.appodeal.ads.networking.binders.b$e r49 = new com.appodeal.ads.networking.binders.b$e
            r44 = r2
            r3 = r49
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r23 = r8
            r8 = r52
            r9 = r17
            r30 = r10
            r10 = r13
            r11 = r51
            r13 = r16
            r16 = r20
            r17 = r18
            r18 = r19
            r19 = r30
            r28 = r2
            r30 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r40, r42, r44, r46, r47, r48)
            return r49
        L_0x0171:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "App key not found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9197g4.mo59971a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r2v79 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r2v80 */
    /* JADX WARNING: type inference failed for: r2v81 */
    /* JADX WARNING: type inference failed for: r10v3, types: [com.appodeal.ads.networking.binders.b$n] */
    /* JADX WARNING: type inference failed for: r2v82 */
    /* JADX WARNING: type inference failed for: r8v4, types: [com.appodeal.ads.networking.binders.b$l] */
    /* JADX WARNING: type inference failed for: r2v83 */
    /* JADX WARNING: type inference failed for: r2v84 */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo59972a(com.appodeal.ads.networking.binders.C9359c r29, com.appodeal.ads.C9420r<?> r30, com.appodeal.ads.C9464s<?> r31, com.appodeal.ads.C9577u<?, ?, ?> r32, kotlin.coroutines.Continuation<? super com.appodeal.ads.networking.binders.C9336b> r33) {
        /*
            r28 = this;
            r1 = r28
            r0 = r33
            boolean r2 = r0 instanceof com.appodeal.ads.C9197g4.C9200c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.appodeal.ads.g4$c r2 = (com.appodeal.ads.C9197g4.C9200c) r2
            int r3 = r2.f23133c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f23133c = r3
            goto L_0x001c
        L_0x0017:
            com.appodeal.ads.g4$c r2 = new com.appodeal.ads.g4$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f23131a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f23133c
            r5 = 1
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r0)
            int r0 = r29.ordinal()
            r4 = 1000(0x3e8, float:1.401E-42)
            r6 = 0
            r8 = 0
            r9 = 0
            switch(r0) {
                case 0: goto L_0x0359;
                case 1: goto L_0x034b;
                case 2: goto L_0x026d;
                case 3: goto L_0x0246;
                case 4: goto L_0x022a;
                case 5: goto L_0x0203;
                case 6: goto L_0x01a0;
                case 7: goto L_0x017d;
                case 8: goto L_0x0170;
                case 9: goto L_0x011d;
                case 10: goto L_0x010c;
                case 11: goto L_0x007f;
                case 12: goto L_0x005a;
                case 13: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x004b:
            android.content.Context r0 = r1.f23123a
            r2.f23133c = r5
            java.lang.Object r0 = r1.mo59971a(r0, r2)
            if (r0 != r3) goto L_0x0056
            return r3
        L_0x0056:
            com.appodeal.ads.networking.binders.b r0 = (com.appodeal.ads.networking.binders.C9336b) r0
            goto L_0x040f
        L_0x005a:
            if (r31 != 0) goto L_0x005d
            return r9
        L_0x005d:
            boolean r0 = r31.mo60714b()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r0.booleanValue()
            android.content.Context r2 = r1.f23123a
            org.json.JSONArray r2 = com.appodeal.ads.utils.C9671z.m28447a(r2)
            com.appodeal.ads.r0 r3 = com.appodeal.ads.C9422r0.f23912a
            java.lang.String r3 = com.appodeal.ads.C9422r0.m27929a()
            com.appodeal.ads.networking.binders.b$g r4 = new com.appodeal.ads.networking.binders.b$g
            if (r3 == 0) goto L_0x007a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
        L_0x007a:
            r4.<init>(r0, r2, r9)
            goto L_0x026a
        L_0x007f:
            if (r30 != 0) goto L_0x0082
            return r9
        L_0x0082:
            com.appodeal.ads.modules.common.internal.adtype.AdType r0 = r30.mo60093n()
            java.lang.String r2 = "adRequest.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r30.mo60093n()
            com.appodeal.ads.utils.EventsTracker$EventType[] r4 = new com.appodeal.ads.utils.EventsTracker.EventType[r5]
            com.appodeal.ads.utils.EventsTracker$EventType r6 = com.appodeal.ads.utils.EventsTracker.EventType.Impression
            r4[r8] = r6
            int r12 = r2.mo61019a(r3, r4)
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            int r13 = r2.mo61023b(r6)
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r30.mo60093n()
            com.appodeal.ads.utils.EventsTracker$EventType[] r4 = new com.appodeal.ads.utils.EventsTracker.EventType[r5]
            com.appodeal.ads.utils.EventsTracker$EventType r6 = com.appodeal.ads.utils.EventsTracker.EventType.Click
            r4[r8] = r6
            int r14 = r2.mo61019a(r3, r4)
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            int r15 = r2.mo61023b(r6)
            r2 = 2
            com.appodeal.ads.modules.common.internal.adtype.AdType[] r2 = new com.appodeal.ads.modules.common.internal.adtype.AdType[r2]
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video
            r2[r8] = r3
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded
            r2[r5] = r3
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r30.mo60093n()
            java.lang.String r4 = "adRequest.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r2 = kotlin.collections.ArraysKt.contains((T[]) r2, r3)
            if (r2 == 0) goto L_0x00ef
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = r30.mo60093n()
            com.appodeal.ads.utils.EventsTracker$EventType[] r4 = new com.appodeal.ads.utils.EventsTracker.EventType[r5]
            com.appodeal.ads.utils.EventsTracker$EventType r5 = com.appodeal.ads.utils.EventsTracker.EventType.Finish
            r4[r8] = r5
            int r2 = r2.mo61019a(r3, r4)
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
        L_0x00ef:
            r16 = r9
            com.appodeal.ads.utils.EventsTracker r2 = com.appodeal.ads.utils.EventsTracker.get()
            com.appodeal.ads.utils.EventsTracker$EventType r3 = com.appodeal.ads.utils.EventsTracker.EventType.Finish
            int r17 = r2.mo61023b(r3)
            com.appodeal.ads.networking.binders.b$b r2 = new com.appodeal.ads.networking.binders.b$b
            com.appodeal.ads.networking.binders.b$b$a r3 = new com.appodeal.ads.networking.binders.b$b$a
            java.lang.String r11 = r0.getServerCodeName()
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r2.<init>(r3)
            goto L_0x0356
        L_0x010c:
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.C9409q4.m27877m()
            android.content.Context r2 = r1.f23123a
            org.json.JSONArray r0 = r0.mo61180a((android.content.Context) r2)
            com.appodeal.ads.networking.binders.b$m r2 = new com.appodeal.ads.networking.binders.b$m
            r2.<init>(r0)
            goto L_0x0356
        L_0x011d:
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.C9409q4.m27877m()
            r0.mo61194m()
            com.appodeal.ads.networking.binders.b$l r2 = new com.appodeal.ads.networking.binders.b$l
            long r9 = r0.mo61188g()
            java.lang.String r11 = r0.mo61191j()
            long r12 = r0.mo61189h()
            long r14 = r0.mo61190i()
            com.appodeal.ads.utils.w r3 = r0.f24479e
            if (r3 != 0) goto L_0x013d
            r16 = r6
            goto L_0x0147
        L_0x013d:
            monitor-enter(r3)
            long r4 = r3.f24461c     // Catch:{ all -> 0x016d }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r16
            monitor-exit(r3)
            r16 = r4
        L_0x0147:
            com.appodeal.ads.utils.w r3 = r0.f24479e
            if (r3 != 0) goto L_0x014e
        L_0x014b:
            r18 = r6
            goto L_0x0153
        L_0x014e:
            monitor-enter(r3)
            long r6 = r3.f24462d     // Catch:{ all -> 0x0169 }
            monitor-exit(r3)
            goto L_0x014b
        L_0x0153:
            long r20 = r0.mo61186e()
            long r22 = r0.mo61187f()
            long r24 = r0.mo61184c()
            long r26 = r0.mo61185d()
            r8 = r2
            r8.<init>(r9, r11, r12, r14, r16, r18, r20, r22, r24, r26)
            goto L_0x0356
        L_0x0169:
            r0 = move-exception
            r2 = r0
            monitor-exit(r3)
            throw r2
        L_0x016d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0170:
            com.appodeal.ads.services.c r0 = r1.f23125c
            java.util.ArrayList r0 = r0.getServicesData()
            com.appodeal.ads.networking.binders.b$k r2 = new com.appodeal.ads.networking.binders.b$k
            r2.<init>(r0)
            goto L_0x0356
        L_0x017d:
            java.util.HashMap r0 = com.appodeal.ads.segments.C9495j.m28099a()
            java.lang.String r2 = "getCustomRuleValues()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.appodeal.ads.l5 r2 = com.appodeal.ads.C9269l5.m27453a()
            java.lang.String r3 = "get()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.appodeal.ads.networking.binders.b$i r3 = new com.appodeal.ads.networking.binders.b$i
            com.appodeal.ads.h4 r4 = new com.appodeal.ads.h4
            r4.<init>(r0, r2)
            org.json.JSONObject r0 = com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt.jsonObject(r4)
            r3.<init>(r0)
            r0 = r3
            goto L_0x040f
        L_0x01a0:
            android.content.Context r0 = r1.f23123a
            com.appodeal.ads.j4 r2 = com.appodeal.ads.C9234j4.f23194a
            java.lang.String r3 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r12 = r3.toString()
            java.lang.String r3 = "getDefault().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            boolean r13 = com.appodeal.ads.C9700x2.m28516j()
            com.appodeal.consent.Consent r3 = com.appodeal.ads.C9700x2.m28510d()
            if (r3 != 0) goto L_0x01c1
            goto L_0x01c5
        L_0x01c1:
            org.json.JSONObject r9 = r3.toJson()
        L_0x01c5:
            r14 = r9
            org.json.JSONObject r15 = com.appodeal.ads.C9700x2.m28512f()
            java.lang.String r11 = r2.getUserId()
            java.lang.String r16 = r2.getHttpAgent(r0)
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r2)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r5 = "Z"
            r3.<init>(r5, r2)
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r3.format(r0)
            java.lang.String r2 = "run {\n                va…  localTime\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = (long) r4
            long r18 = r2 / r4
            com.appodeal.ads.networking.binders.b$n r2 = new com.appodeal.ads.networking.binders.b$n
            r10 = r2
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0356
        L_0x0203:
            com.appodeal.ads.j4 r0 = com.appodeal.ads.C9234j4.f23194a
            java.lang.String r2 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.content.Context r2 = r1.f23123a
            com.appodeal.ads.LocationData r0 = r0.getLocation(r2)
            java.lang.String r2 = "restrictedData.getLocation(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.appodeal.ads.networking.binders.b$h r2 = new com.appodeal.ads.networking.binders.b$h
            com.appodeal.ads.z1 r0 = (com.appodeal.ads.C9729z1) r0
            java.lang.Integer r3 = r0.getDeviceLocationType()
            java.lang.Float r4 = r0.obtainLatitude()
            java.lang.Float r0 = r0.obtainLongitude()
            r2.<init>(r3, r4, r0)
            goto L_0x0356
        L_0x022a:
            com.appodeal.ads.j4 r0 = com.appodeal.ads.C9234j4.f23194a
            java.lang.String r2 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            android.content.Context r2 = r1.f23123a
            com.appodeal.ads.modules.common.internal.data.ConnectionData r0 = r0.getConnectionData(r2)
            com.appodeal.ads.networking.binders.b$f r2 = new com.appodeal.ads.networking.binders.b$f
            java.lang.String r3 = r0.getType()
            java.lang.String r0 = r0.getSubType()
            r2.<init>(r3, r0)
            goto L_0x0356
        L_0x0246:
            com.appodeal.ads.j4 r0 = com.appodeal.ads.C9234j4.f23194a
            java.lang.String r2 = "instance"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r2 = com.appodeal.ads.C9700x2.m28514h()
            java.lang.String r3 = r0.getIfa()
            boolean r0 = r0.isLimitAdTrackingEnabled()
            if (r0 == 0) goto L_0x025e
            java.lang.String r0 = "0"
            goto L_0x0260
        L_0x025e:
            java.lang.String r0 = "1"
        L_0x0260:
            com.appodeal.ads.networking.binders.b$d r4 = new com.appodeal.ads.networking.binders.b$d
            java.lang.String r5 = "ifa"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r4.<init>(r3, r0, r2)
        L_0x026a:
            r0 = r4
            goto L_0x040f
        L_0x026d:
            if (r32 != 0) goto L_0x0270
            goto L_0x0274
        L_0x0270:
            java.util.List r9 = kotlin.collections.CollectionsKt.listOf(r32)
        L_0x0274:
            if (r9 != 0) goto L_0x027f
            com.appodeal.ads.q4 r0 = com.appodeal.ads.C9409q4.f23839a
            r0.getClass()
            java.util.List r9 = com.appodeal.ads.C9409q4.m27859d()
        L_0x027f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x0288:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02ab
            java.lang.Object r3 = r2.next()
            com.appodeal.ads.u r3 = (com.appodeal.ads.C9577u) r3
            com.appodeal.ads.i r3 = r3.mo60847g()
            android.content.Context r4 = r1.f23123a
            com.appodeal.ads.i r3 = r3.mo59981b((android.content.Context) r4)
            java.util.Collection r3 = r3.mo59982b()
            java.lang.String r4 = "adController.networkRegi…     .getLoadedNetworks()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.collections.CollectionsKt.addAll(r0, r3)
            goto L_0x0288
        L_0x02ab:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x02b9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02d4
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.appodeal.ads.AdNetwork r5 = (com.appodeal.ads.AdNetwork) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L_0x02b9
            r3.add(r4)
            goto L_0x02b9
        L_0x02d4:
            r0 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r0)
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r4 = 16
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast((int) r2, (int) r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x02ed:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0323
            java.lang.Object r5 = r2.next()
            com.appodeal.ads.AdNetwork r5 = (com.appodeal.ads.AdNetwork) r5
            java.lang.String r6 = r5.getName()
            com.appodeal.ads.networking.binders.a r7 = new com.appodeal.ads.networking.binders.a
            java.lang.String r8 = r5.getAdapterVersion()
            java.lang.String r9 = "network.adapterVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.String r5 = r5.getVersion()
            if (r5 != 0) goto L_0x0310
            java.lang.String r5 = ""
        L_0x0310:
            r7.<init>(r8, r5)
            kotlin.Pair r5 = kotlin.TuplesKt.m14544to(r6, r7)
            java.lang.Object r6 = r5.getFirst()
            java.lang.Object r5 = r5.getSecond()
            r4.put(r6, r5)
            goto L_0x02ed
        L_0x0323:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x0330:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0344
            java.lang.Object r3 = r0.next()
            com.appodeal.ads.AdNetwork r3 = (com.appodeal.ads.AdNetwork) r3
            java.lang.String r3 = r3.getName()
            r2.add(r3)
            goto L_0x0330
        L_0x0344:
            com.appodeal.ads.networking.binders.b$c r0 = new com.appodeal.ads.networking.binders.b$c
            r0.<init>(r2, r4)
            goto L_0x040f
        L_0x034b:
            com.appodeal.ads.modules.common.internal.service.ServicesRegistry r0 = r1.f23126d
            java.util.List r0 = r0.getAvailableServicesInfo()
            com.appodeal.ads.networking.binders.b$j r2 = new com.appodeal.ads.networking.binders.b$j
            r2.<init>(r0)
        L_0x0356:
            r0 = r2
            goto L_0x040f
        L_0x0359:
            if (r30 != 0) goto L_0x035c
            return r9
        L_0x035c:
            android.content.Context r0 = r1.f23123a
            boolean r0 = com.appodeal.ads.C9566t0.m28250a((android.content.Context) r0)
            com.appodeal.ads.modules.common.internal.adtype.AdType r2 = r30.mo60093n()
            int[] r3 = com.appodeal.ads.C9197g4.C9198a.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L_0x0383;
                case 2: goto L_0x0380;
                case 3: goto L_0x037d;
                case 4: goto L_0x037a;
                case 5: goto L_0x037a;
                case 6: goto L_0x0377;
                default: goto L_0x0371;
            }
        L_0x0371:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0377:
            java.lang.String r2 = "native"
            goto L_0x0385
        L_0x037a:
            java.lang.String r2 = "video"
            goto L_0x0385
        L_0x037d:
            java.lang.String r2 = "banner"
            goto L_0x0385
        L_0x0380:
            java.lang.String r2 = "banner_mrec"
            goto L_0x0385
        L_0x0383:
            java.lang.String r2 = "banner_320"
        L_0x0385:
            r11 = r2
            com.appodeal.ads.modules.common.internal.adtype.AdType r2 = r30.mo60093n()
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded
            if (r2 != r3) goto L_0x0390
            r2 = 1
            goto L_0x0391
        L_0x0390:
            r2 = 0
        L_0x0391:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            r12.booleanValue()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r13.booleanValue()
            java.lang.String r14 = r30.mo60624o()
            java.lang.Long r0 = r30.mo60633x()
            java.lang.String r2 = "adRequest.obtainSegmentId()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            long r15 = r0.longValue()
            long r2 = r30.mo60623m()
            long r8 = (long) r4
            long r2 = r2 / r8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x03c4
            r2 = 1
            goto L_0x03c5
        L_0x03c4:
            r2 = 0
        L_0x03c5:
            if (r2 == 0) goto L_0x03ca
            r17 = r0
            goto L_0x03cc
        L_0x03ca:
            r17 = 0
        L_0x03cc:
            long r2 = r30.mo60615e()
            long r2 = r2 / r8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x03df
            r2 = 1
            goto L_0x03e0
        L_0x03df:
            r2 = 0
        L_0x03e0:
            if (r2 == 0) goto L_0x03e5
            r18 = r0
            goto L_0x03e7
        L_0x03e5:
            r18 = 0
        L_0x03e7:
            long r2 = r30.mo60616f()
            long r2 = r2 / r8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            long r2 = r0.longValue()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x03f9
            goto L_0x03fa
        L_0x03f9:
            r5 = 0
        L_0x03fa:
            if (r5 == 0) goto L_0x03ff
            r19 = r0
            goto L_0x0401
        L_0x03ff:
            r19 = 0
        L_0x0401:
            java.lang.String r20 = r30.mo60617g()
            com.appodeal.ads.networking.binders.b$a$a r21 = r30.mo60613d()
            com.appodeal.ads.networking.binders.b$a r0 = new com.appodeal.ads.networking.binders.b$a
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19, r20, r21)
        L_0x040f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9197g4.mo59972a(com.appodeal.ads.networking.binders.c, com.appodeal.ads.r, com.appodeal.ads.s, com.appodeal.ads.u, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
