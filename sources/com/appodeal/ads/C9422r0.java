package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.r0 */
public final class C9422r0 {

    /* renamed from: a */
    public static final C9422r0 f23912a = new C9422r0();

    /* renamed from: b */
    public static boolean f23913b;

    /* renamed from: c */
    public static boolean f23914c;

    /* renamed from: d */
    public static Log.LogLevel f23915d = Log.LogLevel.none;

    /* renamed from: e */
    public static boolean f23916e;

    /* renamed from: f */
    public static int f23917f = -1;

    /* renamed from: g */
    public static boolean f23918g = true;

    /* renamed from: h */
    public static int f23919h = -90;

    /* renamed from: i */
    public static int f23920i = 90;

    /* renamed from: j */
    public static String f23921j;

    /* renamed from: k */
    public static Boolean f23922k;

    /* renamed from: l */
    public static boolean f23923l;

    /* renamed from: m */
    public static boolean f23924m = true;

    /* renamed from: n */
    public static Set<String> f23925n = new HashSet();

    /* renamed from: o */
    public static final C9562o f23926o = C9562o.f24251b;

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealSettings", mo38569f = "AppodealSettings.kt", mo38570l = {146}, mo38571m = "getUrlList")
    /* renamed from: com.appodeal.ads.r0$a */
    public static final class C9423a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f23927a;

        /* renamed from: b */
        public final /* synthetic */ C9422r0 f23928b;

        /* renamed from: c */
        public int f23929c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9423a(C9422r0 r0Var, Continuation<? super C9423a> continuation) {
            super(continuation);
            this.f23928b = r0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23927a = obj;
            this.f23929c |= RecyclerView.UNDEFINED_DURATION;
            return this.f23928b.mo60636a((Continuation<? super Set<String>>) this);
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealSettings", mo38569f = "AppodealSettings.kt", mo38570l = {134}, mo38571m = "parseUrlList")
    /* renamed from: com.appodeal.ads.r0$b */
    public static final class C9424b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f23930a;

        /* renamed from: b */
        public final /* synthetic */ C9422r0 f23931b;

        /* renamed from: c */
        public int f23932c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9424b(C9422r0 r0Var, Continuation<? super C9424b> continuation) {
            super(continuation);
            this.f23931b = r0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23930a = obj;
            this.f23932c |= RecyclerView.UNDEFINED_DURATION;
            return this.f23931b.mo60637a((JSONObject) null, (Continuation<? super Unit>) this);
        }
    }

    /* renamed from: a */
    public static String m27929a() {
        return f23921j;
    }

    /* renamed from: a */
    public static void m27930a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        if (jSONObject.optBoolean("log")) {
            C9409q4.m27832a(Log.LogLevel.verbose);
        }
    }

    /* renamed from: a */
    public static final boolean m27931a(long j, int i) {
        return System.currentTimeMillis() - j > ((long) i);
    }

    /* renamed from: b */
    public static void m27932b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        if (jSONObject.has(Constants.POST_BID)) {
            f23914c = jSONObject.optBoolean(Constants.POST_BID, false);
        }
    }

    /* renamed from: b */
    public static boolean m27933b() {
        return f23914c;
    }

    /* renamed from: c */
    public static final void m27934c(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        try {
            if (jSONObject.has("randomize_offers")) {
                f23918g = jSONObject.getBoolean("randomize_offers");
            }
            m27930a(jSONObject);
            if (jSONObject.has("last_sdk_version") && f23921j == null) {
                String string = jSONObject.getString("last_sdk_version");
                f23921j = string;
                if (new Version(string).compareTo(new Version(Constants.SDK_VERSION)) == 1) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("your SDK version %s does not match latest SDK version %s!", Arrays.copyOf(new Object[]{Constants.SDK_VERSION, f23921j}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_WARNING, format);
                }
            }
            if (jSONObject.has("test")) {
                C9409q4.m27867f(jSONObject.getBoolean("test"));
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: c */
    public static final boolean m27935c() {
        Boolean bool = f23922k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean d = C9326n5.m27554d();
        f23922k = Boolean.valueOf(d);
        return d;
    }

    /* renamed from: d */
    public static final void m27936d() {
        C9378o1.m27718a().f24297o = 0;
        C9685w2.m28463a().f24297o = 0;
        C9384o4.m27742a().f24297o = 0;
        C9566t0.m28247a().f24297o = 0;
        C9205h2.m27336a().f24297o = 0;
        Native.m27078a().f24297o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60636a(kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.appodeal.ads.C9422r0.C9423a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.appodeal.ads.r0$a r0 = (com.appodeal.ads.C9422r0.C9423a) r0
            int r1 = r0.f23929c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23929c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.r0$a r0 = new com.appodeal.ads.r0$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f23927a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23929c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.Set<java.lang.String> r5 = f23925n
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x004b
            com.appodeal.ads.storage.o r5 = f23926o
            r0.f23929c = r3
            java.lang.Object r5 = r5.mo60808a((com.appodeal.ads.C9422r0.C9423a) r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.Set r5 = (java.util.Set) r5
            f23925n = r5
        L_0x004b:
            java.util.Set<java.lang.String> r5 = f23925n
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9422r0.mo60636a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60637a(org.json.JSONObject r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.appodeal.ads.C9422r0.C9424b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.appodeal.ads.r0$b r0 = (com.appodeal.ads.C9422r0.C9424b) r0
            int r1 = r0.f23932c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23932c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.r0$b r0 = new com.appodeal.ads.r0$b
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f23930a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23932c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0088
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.String r2 = "url_list"
            org.json.JSONArray r9 = r9.optJSONArray(r2)     // Catch:{ Exception -> 0x0084 }
            if (r9 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            int r2 = r9.length()     // Catch:{ Exception -> 0x0084 }
            if (r2 <= 0) goto L_0x006e
            int r2 = r9.length()     // Catch:{ Exception -> 0x0084 }
            r4 = 0
            r5 = 0
        L_0x004e:
            if (r5 >= r2) goto L_0x006e
            int r6 = r5 + 1
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x0084 }
            if (r5 == 0) goto L_0x0061
            boolean r7 = kotlin.text.StringsKt.isBlank(r5)     // Catch:{ Exception -> 0x0084 }
            if (r7 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r7 = 0
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch:{ Exception -> 0x0084 }
            r10.add(r5)     // Catch:{ Exception -> 0x0084 }
        L_0x006c:
            r5 = r6
            goto L_0x004e
        L_0x006e:
            f23925n = r10     // Catch:{ Exception -> 0x0084 }
            r0.f23932c = r3     // Catch:{ Exception -> 0x0084 }
            com.appodeal.ads.storage.o r9 = f23926o     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r9 = r9.mo60809a((java.util.LinkedHashSet) r10, (com.appodeal.ads.C9422r0.C9424b) r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ Exception -> 0x0084 }
            if (r9 != r10) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0084 }
        L_0x0081:
            if (r9 != r1) goto L_0x0088
            return r1
        L_0x0084:
            r9 = move-exception
            com.appodeal.ads.utils.Log.log(r9)
        L_0x0088:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9422r0.mo60637a(org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
