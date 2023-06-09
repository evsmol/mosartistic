package com.appodeal.ads.networking.usecases;

import androidx.recyclerview.widget.RecyclerView;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.C9237k0;
import com.appodeal.ads.modules.common.internal.ext.JsonExtKt;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.networking.C9328b;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.usecases.a */
public final class C9374a {

    /* renamed from: a */
    public final C9237k0 f23790a;

    @DebugMetadata(mo38568c = "com.appodeal.ads.networking.usecases.GetConfigUseCase", mo38569f = "GetConfigUseCase.kt", mo38570l = {16}, mo38571m = "invoke-IoAF18A")
    /* renamed from: com.appodeal.ads.networking.usecases.a$a */
    public static final class C9375a extends ContinuationImpl {

        /* renamed from: a */
        public C9374a f23791a;

        /* renamed from: b */
        public /* synthetic */ Object f23792b;

        /* renamed from: c */
        public final /* synthetic */ C9374a f23793c;

        /* renamed from: d */
        public int f23794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9375a(C9374a aVar, Continuation<? super C9375a> continuation) {
            super(continuation);
            this.f23793c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23792b = obj;
            this.f23794d |= RecyclerView.UNDEFINED_DURATION;
            Object a = this.f23793c.mo60576a((Continuation<? super Result<C9328b>>) this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m31661boximpl(a);
        }
    }

    public C9374a(C9237k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "appodealNetworkRequestApi");
        this.f23790a = k0Var;
    }

    /* renamed from: a */
    public static C9328b m27715a(JSONObject jSONObject) {
        C9328b.C9330b bVar;
        C9328b.C9329a aVar;
        C9328b.C9332d dVar;
        C9328b.C9334f fVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject optJSONObject = jSONObject2.optJSONObject("appsflyer");
        C9328b.C9333e eVar = null;
        if (optJSONObject == null) {
            bVar = null;
        } else {
            String optString = optJSONObject.optString("dev_key");
            Intrinsics.checkNotNullExpressionValue(optString, "appsflyerJson.optString(\"dev_key\")");
            String optString2 = optJSONObject.optString("app_id");
            Intrinsics.checkNotNullExpressionValue(optString2, "appsflyerJson.optString(\"app_id\")");
            String optString3 = optJSONObject.optString("ad_id");
            Intrinsics.checkNotNullExpressionValue(optString3, "appsflyerJson.optString(\"ad_id\")");
            bVar = new C9328b.C9330b(optString, optString2, optString3, JsonExtKt.asList(optJSONObject.optJSONArray("conversion_keys")), optJSONObject.optBoolean("event_tracking", false), optJSONObject.optBoolean("ad_revenue_tracking", false), optJSONObject.optLong("tmax", 15000), optJSONObject.optString("mode"));
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("adjust");
        if (optJSONObject2 == null) {
            aVar = null;
        } else {
            String optString4 = optJSONObject2.optString("app_token");
            Map map = JsonExtKt.toMap(optJSONObject2.optJSONObject("events"));
            String optString5 = optJSONObject2.optString("environment");
            boolean optBoolean = optJSONObject2.optBoolean("event_tracking", false);
            boolean optBoolean2 = optJSONObject2.optBoolean("ad_revenue_tracking", false);
            long optLong = optJSONObject2.optLong("tmax", 15000);
            String optString6 = optJSONObject2.optString("mode");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(\"app_token\")");
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(\"environment\")");
            aVar = new C9328b.C9329a(optString4, optString5, map, optBoolean, optBoolean2, optLong, optString6);
        }
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("facebook_analytics");
        C9328b.C9331c cVar = optJSONObject3 == null ? null : new C9328b.C9331c(optJSONObject3.optBoolean("event_tracking", false), optJSONObject3.optBoolean("ad_revenue_tracking", false), optJSONObject3.optLong("tmax", 15000));
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("firebase");
        if (optJSONObject4 == null) {
            dVar = null;
        } else {
            List asList = JsonExtKt.asList(optJSONObject4.optJSONArray("config_keys"));
            Long valueOf = Long.valueOf(optJSONObject4.optLong("expiration_duration"));
            Long l = (valueOf.longValue() > 0 ? 1 : (valueOf.longValue() == 0 ? 0 : -1)) != 0 ? valueOf : null;
            boolean optBoolean3 = optJSONObject4.optBoolean("event_tracking", false);
            boolean optBoolean4 = optJSONObject4.optBoolean("ad_revenue_tracking", false);
            String optString7 = optJSONObject4.optString("ad_revenue_key", ServiceOptions.Firebase.DefaultAdRevenueKey);
            Intrinsics.checkNotNullExpressionValue(optString7, "firebaseJson.optString(\"…ey\", DefaultAdRevenueKey)");
            dVar = new C9328b.C9332d(asList, l, optBoolean3, optBoolean4, optString7, optJSONObject4.optLong("tmax", 15000), optJSONObject4.optString("mode"));
        }
        JSONObject optJSONObject5 = jSONObject2.optJSONObject("stack_analytics");
        if (optJSONObject5 == null) {
            fVar = null;
        } else {
            String optString8 = optJSONObject5.optString("crash_log_level", C8850d.f22426ff);
            String optString9 = optJSONObject5.optString("report_url");
            long optLong2 = optJSONObject5.optLong("report_size");
            String optString10 = optJSONObject5.optString("report_log_level");
            boolean optBoolean5 = optJSONObject5.optBoolean("event_tracking", false);
            long optLong3 = optJSONObject5.optLong("report_interval");
            boolean optBoolean6 = optJSONObject5.optBoolean("is_native_reports_enabled", false);
            long optLong4 = optJSONObject5.optLong("tmax", 15000);
            Intrinsics.checkNotNullExpressionValue(optString9, "optString(\"report_url\")");
            Intrinsics.checkNotNullExpressionValue(optString8, "optString(\"crash_log_level\", \"off\")");
            Intrinsics.checkNotNullExpressionValue(optString10, "optString(\"report_log_level\")");
            fVar = new C9328b.C9334f(optString9, optLong2, optString8, optString10, optBoolean5, optLong3, optBoolean6, optLong4);
        }
        JSONObject optJSONObject6 = jSONObject2.optJSONObject("sentry_analytics");
        if (optJSONObject6 != null) {
            String optString11 = optJSONObject6.optString("sentry_dsn");
            Intrinsics.checkNotNullExpressionValue(optString11, "sentryAnalyticJson.optString(\"sentry_dsn\")");
            String optString12 = optJSONObject6.optString("sentry_environment", "production");
            Intrinsics.checkNotNullExpressionValue(optString12, "sentryAnalyticJson.optSt…vironment\", \"production\")");
            boolean optBoolean7 = optJSONObject6.optBoolean("sentry_collect_threads", false);
            boolean optBoolean8 = optJSONObject6.optBoolean("sentry_event_tracking", false);
            String optString13 = optJSONObject6.optString("mds_report_url");
            Intrinsics.checkNotNullExpressionValue(optString13, "sentryAnalyticJson.optString(\"mds_report_url\")");
            eVar = new C9328b.C9333e(optString11, optString12, optBoolean7, optBoolean8, optString13, optJSONObject6.optBoolean("mds_event_tracking", false), optJSONObject6.optLong("tmax", 15000));
        }
        return new C9328b(bVar, aVar, cVar, dVar, fVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[SYNTHETIC, Splitter:B:18:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60576a(kotlin.coroutines.Continuation<? super kotlin.Result<com.appodeal.ads.networking.C9328b>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.appodeal.ads.networking.usecases.C9374a.C9375a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.appodeal.ads.networking.usecases.a$a r0 = (com.appodeal.ads.networking.usecases.C9374a.C9375a) r0
            int r1 = r0.f23794d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23794d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.networking.usecases.a$a r0 = new com.appodeal.ads.networking.usecases.a$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f23792b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23794d
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            com.appodeal.ads.networking.usecases.a r0 = r0.f23791a
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.m31669unboximpl()
            goto L_0x004a
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r5)
            com.appodeal.ads.k0 r5 = r4.f23790a
            r0.f23791a = r4
            r0.f23794d = r3
            java.lang.Object r5 = r5.mo60087a((kotlin.coroutines.Continuation<? super kotlin.Result<? extends org.json.JSONObject>>) r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r0 = r4
        L_0x004a:
            boolean r1 = kotlin.Result.m31667isSuccessimpl(r5)
            if (r1 == 0) goto L_0x0087
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0080 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "Required value was null."
            if (r5 == 0) goto L_0x0076
            java.lang.String r2 = "services"
            org.json.JSONObject r5 = r5.optJSONObject(r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x006c
            r0.getClass()     // Catch:{ all -> 0x0080 }
            com.appodeal.ads.networking.b r5 = m27715a((org.json.JSONObject) r5)     // Catch:{ all -> 0x0080 }
            java.lang.Object r5 = kotlin.Result.m31662constructorimpl(r5)     // Catch:{ all -> 0x0080 }
            goto L_0x008b
        L_0x006c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0080 }
            r5.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x0076:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0080 }
            r5.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
        L_0x0087:
            java.lang.Object r5 = kotlin.Result.m31662constructorimpl(r5)
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.usecases.C9374a.mo60576a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
