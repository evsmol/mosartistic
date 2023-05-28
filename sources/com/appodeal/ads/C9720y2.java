package com.appodeal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.api.App;
import com.appodeal.ads.api.Request;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.y2 */
public abstract class C9720y2 {

    /* renamed from: a */
    public final HttpClient.Method f24614a;

    /* renamed from: b */
    public final HttpClient.Proto f24615b;

    /* renamed from: com.appodeal.ads.y2$a */
    public static final class C9721a extends C9720y2 {

        /* renamed from: c */
        public final Context f24616c;

        /* renamed from: d */
        public final RestrictedData f24617d;

        /* renamed from: e */
        public final C9577u<?, ?, ?> f24618e;

        /* renamed from: f */
        public final C9420r<?> f24619f;

        /* renamed from: g */
        public final C9258l<?, ?, ?, ?> f24620g;

        /* renamed from: h */
        public final List<ServiceData> f24621h;

        /* renamed from: i */
        public final C9529a f24622i;

        /* renamed from: j */
        public final String f24623j;

        @DebugMetadata(mo38568c = "com.appodeal.ads.ProtoRequest$Stats", mo38569f = "ProtoRequest.kt", mo38570l = {45}, mo38571m = "bodyBuilder")
        /* renamed from: com.appodeal.ads.y2$a$a */
        public static final class C9722a extends ContinuationImpl {

            /* renamed from: a */
            public C9721a f24624a;

            /* renamed from: b */
            public Request.Builder f24625b;

            /* renamed from: c */
            public Request.Builder f24626c;

            /* renamed from: d */
            public Request.Builder f24627d;

            /* renamed from: e */
            public /* synthetic */ Object f24628e;

            /* renamed from: f */
            public final /* synthetic */ C9721a f24629f;

            /* renamed from: g */
            public int f24630g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9722a(C9721a aVar, Continuation<? super C9722a> continuation) {
                super(continuation);
                this.f24629f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f24628e = obj;
                this.f24630g |= RecyclerView.UNDEFINED_DURATION;
                return this.f24629f.mo61243a(this);
            }
        }

        @DebugMetadata(mo38568c = "com.appodeal.ads.ProtoRequest$Stats", mo38569f = "ProtoRequest.kt", mo38570l = {79}, mo38571m = "createAppProto")
        /* renamed from: com.appodeal.ads.y2$a$b */
        public static final class C9723b extends ContinuationImpl {

            /* renamed from: a */
            public App.Builder f24631a;

            /* renamed from: b */
            public PackageInfo f24632b;

            /* renamed from: c */
            public /* synthetic */ Object f24633c;

            /* renamed from: d */
            public final /* synthetic */ C9721a f24634d;

            /* renamed from: e */
            public int f24635e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9723b(C9721a aVar, Continuation<? super C9723b> continuation) {
                super(continuation);
                this.f24634d = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f24633c = obj;
                this.f24635e |= RecyclerView.UNDEFINED_DURATION;
                return this.f24634d.mo61247a((Context) null, this);
            }
        }

        public /* synthetic */ C9721a(Context context, C9577u uVar, C9420r rVar, C9258l lVar, List list) {
            this(context, uVar, rVar, lVar, list, C9562o.f24251b);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9721a(Context context, C9577u uVar, C9420r rVar, C9258l lVar, List list, C9529a aVar) {
            super(0);
            C9234j4 j4Var = C9234j4.f23194a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(j4Var, "restrictedData");
            Intrinsics.checkNotNullParameter(uVar, "adController");
            Intrinsics.checkNotNullParameter(rVar, "adRequest");
            Intrinsics.checkNotNullParameter(list, "servicesDataList");
            Intrinsics.checkNotNullParameter(aVar, "keyValueStorage");
            this.f24616c = context;
            this.f24617d = j4Var;
            this.f24618e = uVar;
            this.f24619f = rVar;
            this.f24620g = lVar;
            this.f24621h = list;
            this.f24622i = aVar;
            C9422r0 r0Var = C9422r0.f23912a;
            this.f24623j = C9422r0.m27933b() ? Constants.POST_BID : Constants.STATS;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo61247a(android.content.Context r10, kotlin.coroutines.Continuation<? super com.appodeal.ads.api.App> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.appodeal.ads.C9720y2.C9721a.C9723b
                if (r0 == 0) goto L_0x0013
                r0 = r11
                com.appodeal.ads.y2$a$b r0 = (com.appodeal.ads.C9720y2.C9721a.C9723b) r0
                int r1 = r0.f24635e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f24635e = r1
                goto L_0x0018
            L_0x0013:
                com.appodeal.ads.y2$a$b r0 = new com.appodeal.ads.y2$a$b
                r0.<init>(r9, r11)
            L_0x0018:
                java.lang.Object r11 = r0.f24633c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f24635e
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                android.content.pm.PackageInfo r10 = r0.f24632b
                com.appodeal.ads.api.App$Builder r0 = r0.f24631a
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x007c
            L_0x002d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0035:
                kotlin.ResultKt.throwOnFailure(r11)
                com.appodeal.ads.api.App$Builder r11 = com.appodeal.ads.api.App.newBuilder()
                java.lang.String r2 = r10.getPackageName()
                if (r2 != 0) goto L_0x0043
                goto L_0x0046
            L_0x0043:
                r11.setBundle(r2)
            L_0x0046:
                android.content.pm.PackageManager r10 = r10.getPackageManager()
                r4 = 0
                android.content.pm.PackageInfo r4 = r10.getPackageInfo(r2, r4)
                java.lang.String r5 = r4.versionName
                if (r5 != 0) goto L_0x0054
                goto L_0x0057
            L_0x0054:
                r11.setVer(r5)
            L_0x0057:
                long r5 = r4.firstInstallTime
                r7 = 1000(0x3e8, float:1.401E-42)
                long r7 = (long) r7
                long r5 = r5 / r7
                r11.setInstallTime(r5)
                java.lang.String r10 = r10.getInstallerPackageName(r2)
                if (r10 != 0) goto L_0x0067
                goto L_0x006a
            L_0x0067:
                r11.setInstaller(r10)
            L_0x006a:
                com.appodeal.ads.storage.a r10 = r9.f24622i
                r0.f24631a = r11
                r0.f24632b = r4
                r0.f24635e = r3
                java.lang.Object r10 = r10.mo60768a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0)
                if (r10 != r1) goto L_0x0079
                return r1
            L_0x0079:
                r0 = r11
                r11 = r10
                r10 = r4
            L_0x007c:
                java.lang.String r11 = (java.lang.String) r11
                if (r11 != 0) goto L_0x0081
                goto L_0x0084
            L_0x0081:
                r0.setAppKey(r11)
            L_0x0084:
                java.lang.String r11 = com.appodeal.ads.modules.common.internal.Constants.SDK_VERSION
                r0.setSdk(r11)
                int r10 = r10.versionCode
                r0.setVersionCode(r10)
                com.appodeal.ads.utils.x r10 = com.appodeal.ads.C9409q4.m27877m()
                long r10 = r10.mo61186e()
                r0.setAppUptime(r10)
                com.appodeal.ads.utils.x r10 = com.appodeal.ads.C9409q4.m27877m()
                long r10 = r10.mo61187f()
                r0.setMonotonicAppUptime(r10)
                java.lang.String r10 = com.appodeal.ads.C9409q4.m27871h()
                if (r10 != 0) goto L_0x00ab
                goto L_0x00ae
            L_0x00ab:
                r0.setFramework(r10)
            L_0x00ae:
                java.lang.String r10 = com.appodeal.ads.C9409q4.m27869g()
                if (r10 != 0) goto L_0x00b5
                goto L_0x00b8
            L_0x00b5:
                r0.setFrameworkVersion(r10)
            L_0x00b8:
                java.lang.String r10 = com.appodeal.ads.C9409q4.m27874j()
                if (r10 != 0) goto L_0x00bf
                goto L_0x00c2
            L_0x00bf:
                r0.setPluginVersion(r10)
            L_0x00c2:
                com.appodeal.ads.api.App r10 = r0.build()
                java.lang.String r11 = "appBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9720y2.C9721a.mo61247a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:107:0x0423  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0430  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0458  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x045e  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0470  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x04b4 A[LOOP:0: B:122:0x04ae->B:124:0x04b4, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x04f6  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x060d  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0616  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x023f  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0271  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x02a2  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x02a4  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x02a7  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x02f6  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x030c  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x030e  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0311  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0322  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x037b  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0397  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x03a8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo61243a(kotlin.coroutines.Continuation<? super com.appodeal.ads.api.Request.Builder> r15) {
            /*
                r14 = this;
                boolean r0 = r15 instanceof com.appodeal.ads.C9720y2.C9721a.C9722a
                if (r0 == 0) goto L_0x0013
                r0 = r15
                com.appodeal.ads.y2$a$a r0 = (com.appodeal.ads.C9720y2.C9721a.C9722a) r0
                int r1 = r0.f24630g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f24630g = r1
                goto L_0x0018
            L_0x0013:
                com.appodeal.ads.y2$a$a r0 = new com.appodeal.ads.y2$a$a
                r0.<init>(r14, r15)
            L_0x0018:
                java.lang.Object r15 = r0.f24628e
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f24630g
                r3 = 1
                if (r2 == 0) goto L_0x0039
                if (r2 != r3) goto L_0x0031
                com.appodeal.ads.api.Request$Builder r1 = r0.f24627d
                com.appodeal.ads.api.Request$Builder r2 = r0.f24626c
                com.appodeal.ads.api.Request$Builder r4 = r0.f24625b
                com.appodeal.ads.y2$a r0 = r0.f24624a
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x0058
            L_0x0031:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r15)
                com.appodeal.ads.api.Request$Builder r15 = com.appodeal.ads.api.Request.newBuilder()
                android.content.Context r2 = r14.f24616c
                r0.f24624a = r14
                r0.f24625b = r15
                r0.f24626c = r15
                r0.f24627d = r15
                r0.f24630g = r3
                java.lang.Object r0 = r14.mo61247a(r2, r0)
                if (r0 != r1) goto L_0x0053
                return r1
            L_0x0053:
                r1 = r15
                r2 = r1
                r4 = r2
                r15 = r0
                r0 = r14
            L_0x0058:
                com.appodeal.ads.api.App r15 = (com.appodeal.ads.api.App) r15
                r1.setApp(r15)
                com.appodeal.ads.RestrictedData r15 = r0.f24617d
                com.appodeal.ads.r<?> r1 = r0.f24619f
                boolean r5 = com.appodeal.ads.C9422r0.f23913b
                org.json.JSONObject r6 = com.appodeal.ads.C9700x2.m28512f()
                r7 = 0
                if (r6 != 0) goto L_0x006c
                r6 = r7
                goto L_0x0070
            L_0x006c:
                java.lang.String r6 = r6.toString()
            L_0x0070:
                com.appodeal.ads.ExtraData r8 = com.appodeal.ads.ExtraData.INSTANCE
                org.json.JSONObject r8 = r8.asJson()
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "ExtraData.asJson().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
                com.appodeal.ads.utils.x r9 = com.appodeal.ads.C9409q4.m27877m()
                java.lang.String r10 = "restrictedData"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r10)
                java.lang.String r10 = "adRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
                java.lang.String r10 = "extraDataJsonString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
                java.lang.String r10 = "session"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
                com.appodeal.ads.api.Session$Builder r10 = com.appodeal.ads.api.Session.newBuilder()
                r10.setTest(r5)
                int r5 = r8.length()
                r11 = 0
                if (r5 <= 0) goto L_0x00a7
                r5 = 1
                goto L_0x00a8
            L_0x00a7:
                r5 = 0
            L_0x00a8:
                if (r5 == 0) goto L_0x00ad
                r10.setExt(r8)
            L_0x00ad:
                if (r6 != 0) goto L_0x00b0
                goto L_0x00b3
            L_0x00b0:
                r10.setToken(r6)
            L_0x00b3:
                long r5 = r9.mo61188g()
                r10.setSessionId(r5)
                java.lang.String r5 = r9.mo61191j()
                if (r5 != 0) goto L_0x00c1
                goto L_0x00c4
            L_0x00c1:
                r10.setSessionUuid(r5)
            L_0x00c4:
                long r5 = r9.mo61189h()
                r10.setSessionUptime(r5)
                long r5 = r9.mo61190i()
                r10.setMonotonicSessionUptime(r5)
                java.lang.Long r1 = r1.mo60622l()
                if (r1 != 0) goto L_0x00d9
                goto L_0x00e1
            L_0x00d9:
                long r5 = r1.longValue()
                int r1 = (int) r5
                r10.setSegmentId(r1)
            L_0x00e1:
                java.lang.String r1 = "ad_stats"
                boolean r15 = r15.isParameterBlocked(r1)
                if (r15 != 0) goto L_0x020e
                com.appodeal.ads.api.AdStats$Builder r15 = com.appodeal.ads.api.AdStats.newBuilder()
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.utils.EventsTracker$EventType r5 = com.appodeal.ads.utils.EventsTracker.EventType.Impression
                int r1 = r1.mo61023b(r5)
                r15.setShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.utils.EventsTracker$EventType r6 = com.appodeal.ads.utils.EventsTracker.EventType.Click
                int r1 = r1.mo61023b(r6)
                r15.setClick(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.utils.EventsTracker$EventType r8 = com.appodeal.ads.utils.EventsTracker.EventType.Finish
                int r1 = r1.mo61023b(r8)
                r15.setFinish(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Interstitial
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r5
                int r1 = r1.mo61019a(r12, r13)
                r15.setBannerShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Interstitial
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r6
                int r1 = r1.mo61019a(r12, r13)
                r15.setBannerClick(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r5
                int r1 = r1.mo61019a(r12, r13)
                r15.setVideoShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r6
                int r1 = r1.mo61019a(r12, r13)
                r15.setVideoClick(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r8
                int r1 = r1.mo61019a(r12, r13)
                r15.setVideoFinish(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r5
                int r1 = r1.mo61019a(r12, r13)
                r15.setRewardedVideoShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r6
                int r1 = r1.mo61019a(r12, r13)
                r15.setRewardedVideoClick(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r12 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded
                com.appodeal.ads.utils.EventsTracker$EventType[] r13 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r13[r11] = r8
                int r1 = r1.mo61019a(r12, r13)
                r15.setRewardedVideoFinish(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r8 = com.appodeal.ads.modules.common.internal.adtype.AdType.Banner
                com.appodeal.ads.utils.EventsTracker$EventType[] r12 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r12[r11] = r5
                int r1 = r1.mo61019a(r8, r12)
                r15.setBanner320Show(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r8 = com.appodeal.ads.modules.common.internal.adtype.AdType.Banner
                com.appodeal.ads.utils.EventsTracker$EventType[] r12 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r12[r11] = r6
                int r1 = r1.mo61019a(r8, r12)
                r15.setBanner320Click(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r8 = com.appodeal.ads.modules.common.internal.adtype.AdType.Mrec
                com.appodeal.ads.utils.EventsTracker$EventType[] r12 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r12[r11] = r5
                int r1 = r1.mo61019a(r8, r12)
                r15.setBannerMrecShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r8 = com.appodeal.ads.modules.common.internal.adtype.AdType.Mrec
                com.appodeal.ads.utils.EventsTracker$EventType[] r12 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r12[r11] = r6
                int r1 = r1.mo61019a(r8, r12)
                r15.setBannerMrecClick(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r8 = com.appodeal.ads.modules.common.internal.adtype.AdType.Native
                com.appodeal.ads.utils.EventsTracker$EventType[] r12 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r12[r11] = r5
                int r1 = r1.mo61019a(r8, r12)
                r15.setNativeShow(r1)
                com.appodeal.ads.utils.EventsTracker r1 = com.appodeal.ads.utils.EventsTracker.get()
                com.appodeal.ads.modules.common.internal.adtype.AdType r5 = com.appodeal.ads.modules.common.internal.adtype.AdType.Native
                com.appodeal.ads.utils.EventsTracker$EventType[] r8 = new com.appodeal.ads.utils.EventsTracker.EventType[r3]
                r8[r11] = r6
                int r1 = r1.mo61019a(r5, r8)
                r15.setNativeClick(r1)
                com.appodeal.ads.api.AdStats r15 = r15.build()
                java.lang.String r1 = "adStatsBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r10.setAdStats(r15)
            L_0x020e:
                long r5 = r9.mo61184c()
                r10.setAppSessionAverageLength(r5)
                long r5 = r9.mo61185d()
                r10.setMonotonicAppSessionAverageLength(r5)
                com.appodeal.ads.api.Session r15 = r10.build()
                java.lang.String r1 = "sessionBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setSession(r15)
                android.content.Context r15 = r0.f24616c
                com.appodeal.ads.RestrictedData r1 = r0.f24617d
                com.appodeal.ads.api.Device$Builder r5 = com.appodeal.ads.api.Device.newBuilder()
                java.lang.String r6 = r1.getHttpAgent(r15)
                if (r6 == 0) goto L_0x023f
                int r8 = r6.length()
                if (r8 != 0) goto L_0x023d
                goto L_0x023f
            L_0x023d:
                r8 = 0
                goto L_0x0240
            L_0x023f:
                r8 = 1
            L_0x0240:
                if (r8 != 0) goto L_0x0245
                r5.setUa(r6)
            L_0x0245:
                java.lang.String r6 = com.appodeal.ads.C9182f1.m27285i()
                r5.setOsv(r6)
                java.lang.String r6 = "Android"
                r5.setOs(r6)
                android.graphics.Point r6 = com.appodeal.ads.C9182f1.m27295o(r15)
                java.lang.String r8 = "getScreenSize(context)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
                int r8 = r6.x
                r5.setW(r8)
                int r6 = r6.y
                r5.setH(r6)
                float r6 = com.appodeal.ads.C9182f1.m27290l(r15)
                r5.setPxratio(r6)
                boolean r6 = com.appodeal.ads.C9182f1.m27298r(r15)
                if (r6 == 0) goto L_0x0274
                com.appodeal.ads.api.Device$DeviceType r6 = com.appodeal.ads.api.Device.DeviceType.TABLET
                goto L_0x0276
            L_0x0274:
                com.appodeal.ads.api.Device$DeviceType r6 = com.appodeal.ads.api.Device.DeviceType.PHONE
            L_0x0276:
                r5.setDevicetype(r6)
                java.lang.String r6 = com.appodeal.ads.C9182f1.m27271b()
                r5.setMake(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = com.appodeal.ads.C9182f1.m27271b()
                r6.append(r8)
                r8 = 32
                r6.append(r8)
                java.lang.String r8 = com.appodeal.ads.C9182f1.m27273c()
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                int r8 = r6.length()
                if (r8 <= 0) goto L_0x02a4
                r8 = 1
                goto L_0x02a5
            L_0x02a4:
                r8 = 0
            L_0x02a5:
                if (r8 == 0) goto L_0x02aa
                r5.setModel(r6)
            L_0x02aa:
                java.lang.String r6 = "connectivity"
                java.lang.Object r6 = r15.getSystemService(r6)
                if (r6 == 0) goto L_0x0616
                android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
                android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()
                if (r6 != 0) goto L_0x02bb
                goto L_0x02ce
            L_0x02bb:
                int r8 = r6.getType()
                if (r8 == 0) goto L_0x02d4
                if (r8 == r3) goto L_0x02d1
                r6 = 7
                if (r8 == r6) goto L_0x02ce
                r6 = 9
                if (r8 == r6) goto L_0x02cb
                goto L_0x02ce
            L_0x02cb:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.ETHERNET
                goto L_0x02ec
            L_0x02ce:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.CONNECTIONTYPE_UNKNOWN
                goto L_0x02ec
            L_0x02d1:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.WIFI
                goto L_0x02ec
            L_0x02d4:
                int r6 = r6.getSubtype()
                if (r6 == 0) goto L_0x02ea
                r8 = 4
                if (r6 == r8) goto L_0x02e7
                r8 = 16
                if (r6 == r8) goto L_0x02e4
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.MOBILE_4G
                goto L_0x02ec
            L_0x02e4:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.MOBILE_2G
                goto L_0x02ec
            L_0x02e7:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.MOBILE_3G
                goto L_0x02ec
            L_0x02ea:
                com.appodeal.ads.api.Device$ConnectionType r6 = com.appodeal.ads.api.Device.ConnectionType.MOBILE_UNKNOWN
            L_0x02ec:
                r5.setConnectiontype(r6)
                java.lang.String r6 = com.appodeal.ads.C9182f1.m27277e(r15)
                if (r6 != 0) goto L_0x02f6
                goto L_0x02f9
            L_0x02f6:
                r5.setMccmnc(r6)
            L_0x02f9:
                java.util.Locale r6 = java.util.Locale.getDefault()
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "getDefault().toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
                int r8 = r6.length()
                if (r8 <= 0) goto L_0x030e
                r8 = 1
                goto L_0x030f
            L_0x030e:
                r8 = 0
            L_0x030f:
                if (r8 == 0) goto L_0x0314
                r5.setLocale(r6)
            L_0x0314:
                boolean r6 = com.appodeal.ads.C9182f1.m27293m()
                r5.setRooted(r6)
                java.lang.String r6 = com.appodeal.ads.C9326n5.m27556f(r15)
                if (r6 != 0) goto L_0x0322
                goto L_0x0325
            L_0x0322:
                r5.setWebviewVersion(r6)
            L_0x0325:
                float r6 = com.appodeal.ads.C9182f1.m27270b((android.content.Context) r15)
                int r6 = (int) r6
                r5.setBattery(r6)
                java.lang.String r6 = r1.getIfa()
                r5.setIfa(r6)
                long r8 = com.appodeal.ads.C9182f1.m27283h()
                r5.setStorageUsed(r8)
                long r8 = com.appodeal.ads.C9182f1.m27278f()
                r5.setStorageFree(r8)
                long r8 = com.appodeal.ads.C9182f1.m27280g()
                r5.setStorageSize(r8)
                long r8 = com.appodeal.ads.C9182f1.m27276e()
                r5.setRamUsed(r8)
                long r8 = com.appodeal.ads.C9182f1.m27287j(r15)
                r5.setRamFree(r8)
                long r8 = com.appodeal.ads.C9182f1.m27288k(r15)
                r5.setRamSize(r8)
                float r6 = com.appodeal.ads.C9182f1.m27264a()
                r5.setCpuUsage(r6)
                boolean r1 = r1.isLimitAdTrackingEnabled()
                r1 = r1 ^ r3
                r5.setLmt(r1)
                boolean r1 = com.appodeal.ads.C9700x2.m28514h()
                r5.setAdidg(r1)
                java.lang.String r15 = com.appodeal.ads.C9182f1.m27268a((android.content.Context) r15)
                if (r15 != 0) goto L_0x037b
                goto L_0x037e
            L_0x037b:
                r5.setSecureAndroidId(r15)
            L_0x037e:
                com.appodeal.ads.api.Device r15 = r5.build()
                java.lang.String r1 = "deviceBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setDevice(r15)
                com.appodeal.ads.RestrictedData r15 = r0.f24617d
                com.appodeal.ads.api.User$Builder r1 = com.appodeal.ads.api.User.newBuilder()
                java.lang.String r15 = r15.getUserId()
                if (r15 != 0) goto L_0x0397
                goto L_0x039a
            L_0x0397:
                r1.setId(r15)
            L_0x039a:
                boolean r15 = com.appodeal.ads.C9700x2.m28516j()
                r1.setConsent(r15)
                com.appodeal.consent.Consent r15 = com.appodeal.ads.C9700x2.m28510d()
                if (r15 != 0) goto L_0x03a8
                goto L_0x03b3
            L_0x03a8:
                org.json.JSONObject r15 = r15.toJson()
                java.lang.String r15 = r15.toString()
                r1.setIabConsentData(r15)
            L_0x03b3:
                com.appodeal.ads.api.User r15 = r1.build()
                java.lang.String r1 = "userBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setUser(r15)
                com.appodeal.ads.api.Regs$Builder r15 = com.appodeal.ads.api.Regs.newBuilder()
                boolean r1 = com.appodeal.ads.C9217i0.m27371a()
                com.appodeal.ads.api.Regs$Builder r15 = r15.setCoppa(r1)
                com.appodeal.ads.api.Regs r15 = r15.build()
                java.lang.String r1 = "newBuilder().setCoppa(AppData.isForKids()).build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setRegs(r15)
                android.content.Context r15 = r0.f24616c
                com.appodeal.ads.RestrictedData r1 = r0.f24617d
                com.appodeal.ads.api.Geo$Builder r5 = com.appodeal.ads.api.Geo.newBuilder()
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                java.util.TimeZone r8 = java.util.TimeZone.getDefault()
                long r9 = java.lang.System.currentTimeMillis()
                int r8 = r8.getOffset(r9)
                long r8 = (long) r8
                long r8 = r6.toMinutes(r8)
                int r6 = (int) r8
                r5.setUtcoffset(r6)
                long r8 = java.lang.System.currentTimeMillis()
                r6 = 1000(0x3e8, float:1.401E-42)
                long r12 = (long) r6
                long r8 = r8 / r12
                r5.setLocalTime(r8)
                com.appodeal.ads.LocationData r15 = r1.getLocation(r15)
                java.lang.String r1 = "restrictedData.getLocation(context)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                java.lang.Integer r1 = r15.getDeviceLocationType()
                if (r1 == 0) goto L_0x041d
                int r1 = r1.intValue()
                com.appodeal.ads.api.Geo$LocationType r1 = com.appodeal.ads.api.Geo.LocationType.forNumber(r1)
                if (r1 == 0) goto L_0x041d
                r5.setLt(r1)
            L_0x041d:
                java.lang.Float r1 = r15.obtainLatitude()
                if (r1 == 0) goto L_0x042a
                float r1 = r1.floatValue()
                r5.setLat(r1)
            L_0x042a:
                java.lang.Float r15 = r15.obtainLongitude()
                if (r15 == 0) goto L_0x0437
                float r15 = r15.floatValue()
                r5.setLon(r15)
            L_0x0437:
                com.appodeal.ads.api.Geo r15 = r5.build()
                java.lang.String r1 = "geoBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setGeo(r15)
                android.content.Context r15 = r0.f24616c
                com.appodeal.ads.u<?, ?, ?> r1 = r0.f24618e
                com.appodeal.ads.l<?, ?, ?, ?> r5 = r0.f24620g
                com.appodeal.ads.api.Extra$Builder r6 = com.appodeal.ads.api.Extra.newBuilder()
                double r8 = r1.mo60848h()
                float r1 = (float) r8
                r6.setPriceFloor(r1)
                if (r5 != 0) goto L_0x0458
                goto L_0x045c
            L_0x0458:
                org.json.JSONObject r7 = r5.mo60102e()
            L_0x045c:
                if (r7 == 0) goto L_0x0469
                org.json.JSONObject r1 = r5.mo60102e()
                java.lang.String r1 = r1.toString()
                r6.setAdUnitStat(r1)
            L_0x0469:
                org.json.JSONArray r15 = com.appodeal.ads.utils.C9671z.m28447a(r15)
                if (r15 != 0) goto L_0x0470
                goto L_0x0483
            L_0x0470:
                java.lang.String r15 = r15.toString()
                java.lang.String r1 = "array.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                boolean r1 = kotlin.text.StringsKt.isBlank(r15)
                r1 = r1 ^ r3
                if (r1 == 0) goto L_0x0483
                r6.addSa(r15)
            L_0x0483:
                com.appodeal.ads.api.Extra r15 = r6.build()
                java.lang.String r1 = "extraBuilder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setExt(r15)
                android.content.Context r15 = r0.f24616c
                com.appodeal.ads.u<?, ?, ?> r1 = r0.f24618e
                com.appodeal.ads.r<?> r5 = r0.f24619f
                com.appodeal.ads.api.Stats$Builder r5 = r5.mo60632w()
                com.appodeal.ads.i r1 = r1.mo60847g()
                com.appodeal.ads.i r15 = r1.mo59981b((android.content.Context) r15)
                java.util.Collection r15 = r15.mo59982b()
                java.lang.String r1 = "adController.networkRegi…     .getLoadedNetworks()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                java.util.Iterator r15 = r15.iterator()
            L_0x04ae:
                boolean r1 = r15.hasNext()
                if (r1 == 0) goto L_0x04da
                java.lang.Object r1 = r15.next()
                com.appodeal.ads.AdNetwork r1 = (com.appodeal.ads.AdNetwork) r1
                com.appodeal.ads.api.Adapter$Builder r6 = com.appodeal.ads.api.Adapter.newBuilder()
                java.lang.String r7 = r1.getName()
                com.appodeal.ads.api.Adapter$Builder r6 = r6.setStatus(r7)
                java.lang.String r7 = r1.getAdapterVersion()
                com.appodeal.ads.api.Adapter$Builder r6 = r6.setVersion(r7)
                java.lang.String r1 = r1.getVersion()
                com.appodeal.ads.api.Adapter$Builder r1 = r6.setNetworkSdkVersion(r1)
                r5.addAdapter(r1)
                goto L_0x04ae
            L_0x04da:
                com.appodeal.ads.api.Stats r15 = r5.build()
                java.lang.String r1 = "builder.build()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setStats(r15)
                java.util.List<com.appodeal.ads.modules.common.internal.service.ServiceData> r15 = r0.f24621h
                com.appodeal.ads.api.Services$Builder r5 = com.appodeal.ads.api.Services.newBuilder()
                java.util.Iterator r15 = r15.iterator()
            L_0x04f0:
                boolean r6 = r15.hasNext()
                if (r6 == 0) goto L_0x05da
                java.lang.Object r6 = r15.next()
                com.appodeal.ads.modules.common.internal.service.ServiceData r6 = (com.appodeal.ads.modules.common.internal.service.ServiceData) r6
                boolean r7 = r6 instanceof com.appodeal.ads.modules.common.internal.service.ServiceData.AppsFlyer
                if (r7 == 0) goto L_0x0535
                com.appodeal.ads.api.Services$Appsflyer$Builder r7 = com.appodeal.ads.api.Services.Appsflyer.newBuilder()
                com.appodeal.ads.modules.common.internal.service.ServiceData$AppsFlyer r6 = (com.appodeal.ads.modules.common.internal.service.ServiceData.AppsFlyer) r6
                java.lang.String r8 = r6.getAttributionId()
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x0512
                r8 = 1
                goto L_0x0513
            L_0x0512:
                r8 = 0
            L_0x0513:
                if (r8 == 0) goto L_0x051c
                java.lang.String r8 = r6.getAttributionId()
                r7.setAttributionId(r8)
            L_0x051c:
                java.util.Map r6 = r6.getConversionData()
                org.json.JSONObject r6 = com.appodeal.ads.modules.common.internal.ext.MapExtKt.toJsonOrNull(r6)
                if (r6 != 0) goto L_0x0527
                goto L_0x052e
            L_0x0527:
                java.lang.String r6 = r6.toString()
                r7.setConversionData(r6)
            L_0x052e:
                r7.build()
                r5.setAppsflyer(r7)
                goto L_0x04f0
            L_0x0535:
                boolean r7 = r6 instanceof com.appodeal.ads.modules.common.internal.service.ServiceData.Adjust
                if (r7 == 0) goto L_0x056e
                com.appodeal.ads.api.Services$Adjust$Builder r7 = com.appodeal.ads.api.Services.Adjust.newBuilder()
                com.appodeal.ads.modules.common.internal.service.ServiceData$Adjust r6 = (com.appodeal.ads.modules.common.internal.service.ServiceData.Adjust) r6
                java.lang.String r8 = r6.getAttributionId()
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x054b
                r8 = 1
                goto L_0x054c
            L_0x054b:
                r8 = 0
            L_0x054c:
                if (r8 == 0) goto L_0x0555
                java.lang.String r8 = r6.getAttributionId()
                r7.setAttributionId(r8)
            L_0x0555:
                java.util.Map r6 = r6.getConversionData()
                org.json.JSONObject r6 = com.appodeal.ads.modules.common.internal.ext.MapExtKt.toJsonOrNull(r6)
                if (r6 != 0) goto L_0x0560
                goto L_0x0567
            L_0x0560:
                java.lang.String r6 = r6.toString()
                r7.setConversionData(r6)
            L_0x0567:
                r7.build()
                r5.setAdjust(r7)
                goto L_0x04f0
            L_0x056e:
                boolean r7 = r6 instanceof com.appodeal.ads.modules.common.internal.service.ServiceData.FacebookAnalytics
                if (r7 == 0) goto L_0x05a0
                com.appodeal.ads.api.Services$Facebook$Builder r7 = com.appodeal.ads.api.Services.Facebook.newBuilder()
                com.appodeal.ads.modules.common.internal.service.ServiceData$FacebookAnalytics r6 = (com.appodeal.ads.modules.common.internal.service.ServiceData.FacebookAnalytics) r6
                java.lang.String r8 = r6.getUserId()
                if (r8 == 0) goto L_0x0587
                int r8 = r8.length()
                if (r8 != 0) goto L_0x0585
                goto L_0x0587
            L_0x0585:
                r8 = 0
                goto L_0x0588
            L_0x0587:
                r8 = 1
            L_0x0588:
                if (r8 != 0) goto L_0x0591
                java.lang.String r8 = r6.getUserId()
                r7.setUserId(r8)
            L_0x0591:
                java.lang.String r6 = r6.getAppId()
                r7.setAppId(r6)
                r7.build()
                r5.setFacebook(r7)
                goto L_0x04f0
            L_0x05a0:
                boolean r7 = r6 instanceof com.appodeal.ads.modules.common.internal.service.ServiceData.Firebase
                if (r7 == 0) goto L_0x04f0
                com.appodeal.ads.api.Services$Firebase$Builder r7 = com.appodeal.ads.api.Services.Firebase.newBuilder()
                com.appodeal.ads.modules.common.internal.service.ServiceData$Firebase r6 = (com.appodeal.ads.modules.common.internal.service.ServiceData.Firebase) r6
                java.lang.String r8 = r6.getAppInstanceId()
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x05b6
                r8 = 1
                goto L_0x05b7
            L_0x05b6:
                r8 = 0
            L_0x05b7:
                if (r8 == 0) goto L_0x05c0
                java.lang.String r8 = r6.getAppInstanceId()
                r7.setAppInstanceId(r8)
            L_0x05c0:
                java.util.List r8 = r6.getKeywords()
                boolean r8 = r8.isEmpty()
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x05d2
                java.util.List r6 = r6.getKeywords()
                r7.addAllKeywords(r6)
            L_0x05d2:
                r7.build()
                r5.setFirebase(r7)
                goto L_0x04f0
            L_0x05da:
                com.appodeal.ads.api.Services r15 = r5.build()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                r2.setServicesData(r15)
                org.json.JSONObject r15 = new org.json.JSONObject
                java.util.HashMap r1 = com.appodeal.ads.segments.C9495j.m28099a()
                r15.<init>(r1)
                java.lang.String r15 = r15.toString()
                r2.setCustomState(r15)
                long r5 = java.lang.System.currentTimeMillis()
                r2.setTimestamp(r5)
                com.appodeal.ads.r<?> r15 = r0.f24619f
                java.lang.String r15 = r15.mo60617g()
                r2.setImpid(r15)
                com.appodeal.ads.r<?> r15 = r0.f24619f
                java.lang.String r15 = r15.mo60624o()
                if (r15 != 0) goto L_0x060d
                goto L_0x0610
            L_0x060d:
                r2.setMainId(r15)
            L_0x0610:
                java.lang.String r15 = "newBuilder().apply {\n   …          }\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)
                return r4
            L_0x0616:
                java.lang.NullPointerException r15 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
                r15.<init>(r0)
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9720y2.C9721a.mo61243a(kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* renamed from: d */
        public final String mo61246d() {
            return this.f24623j;
        }
    }

    public C9720y2() {
        this.f24614a = HttpClient.Method.POST;
        this.f24615b = HttpClient.Proto.INSTANCE;
    }

    public /* synthetic */ C9720y2(int i) {
        this();
    }

    /* renamed from: a */
    public static String m28549a() {
        return AppodealEndpoints.INSTANCE.getActiveEndpoint();
    }

    /* renamed from: a */
    public abstract Object mo61243a(Continuation<? super Request.Builder> continuation);

    /* renamed from: b */
    public final HttpClient.Proto mo61244b() {
        return this.f24615b;
    }

    /* renamed from: c */
    public final HttpClient.Method mo61245c() {
        return this.f24614a;
    }

    /* renamed from: d */
    public abstract String mo61246d();
}
