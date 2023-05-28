package com.appodeal.ads.segments;

import com.applovin.sdk.AppLovinEventParameters;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.p267a.C8894b;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.storage.C9531b;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.segments.g */
public final class C9490g {

    /* renamed from: h */
    public static final C9490g f24087h = new C9490g(-1, RewardedVideo.VIDEO_MODE_DEFAULT, new JSONObject());

    /* renamed from: i */
    public static long f24088i;

    /* renamed from: a */
    public final int f24089a;

    /* renamed from: b */
    public final String f24090b;

    /* renamed from: c */
    public final JSONObject f24091c;

    /* renamed from: d */
    public final C9494i[] f24092d;

    /* renamed from: e */
    public final int f24093e;

    /* renamed from: f */
    public long f24094f = 0;

    /* renamed from: g */
    public final C9562o f24095g = C9562o.f24251b;

    /* renamed from: com.appodeal.ads.segments.g$a */
    public static /* synthetic */ class C9491a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24096a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appodeal.ads.modules.common.internal.adtype.AdType[] r0 = com.appodeal.ads.modules.common.internal.adtype.AdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24096a = r0
                com.appodeal.ads.modules.common.internal.adtype.AdType r1 = com.appodeal.ads.modules.common.internal.adtype.AdType.Interstitial     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24096a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appodeal.ads.modules.common.internal.adtype.AdType r1 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.segments.C9490g.C9491a.<clinit>():void");
        }
    }

    public C9490g(int i, String str, JSONObject jSONObject) {
        this.f24089a = i;
        this.f24090b = str;
        JSONObject optJSONObject = jSONObject.optJSONObject(C8894b.f22527hW);
        this.f24091c = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f24092d = C9495j.m28103a(jSONObject);
        this.f24093e = C9484a.m28061a(jSONObject.optString("match_rule", ""));
    }

    /* renamed from: a */
    public static C9490g m28074a(JSONObject jSONObject) {
        try {
            return new C9490g(jSONObject.getInt("id"), jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject);
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m28076a(AdType adType) {
        return adType == AdType.Interstitial || adType == AdType.Video || adType == AdType.Rewarded;
    }

    /* renamed from: a */
    public final long mo60737a() {
        return this.f24094f;
    }

    /* renamed from: a */
    public final void mo60738a(long j) {
        this.f24094f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60739a(android.content.Context r16, com.appodeal.ads.modules.common.internal.adtype.AdType r17, double r18) {
        /*
            r15 = this;
            r1 = r15
            int r0 = r1.f24093e
            com.appodeal.ads.segments.i[] r2 = r1.f24092d
            r3 = r16
            boolean r0 = com.appodeal.ads.segments.C9495j.m28102a(r3, r0, r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - not matching custom rules"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x0021:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r4 = "disable"
            boolean r0 = r0.optBoolean(r4, r3)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - ad disabled"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x003d:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r4 = "disable_type"
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = com.appodeal.ads.segments.C9502m.m28129a(r17)
            r4[r3] = r5
            java.lang.String r5 = "\"%s\""
            java.lang.String r4 = java.lang.String.format(r5, r4)
            boolean r0 = r0.contains(r4)
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r4 = 2
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "Placement"
            java.lang.String r5 = "Can show"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r1.f24090b
            r4[r3] = r6
            java.lang.String r6 = r17.getDisplayName()
            r4[r2] = r6
            java.lang.String r2 = "'%s' - %s disabled"
            java.lang.String r2 = java.lang.String.format(r2, r4)
        L_0x0078:
            r4 = r5
            goto L_0x0300
        L_0x007b:
            boolean r0 = m28076a((com.appodeal.ads.modules.common.internal.adtype.AdType) r17)
            r5 = 0
            if (r0 == 0) goto L_0x00b1
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r7 = "impressions_per_session"
            int r0 = r0.optInt(r7, r3)
            if (r0 <= 0) goto L_0x00b1
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r7 = "impressions_per_session"
            int r0 = r0.optInt(r7, r3)
            long r7 = (long) r0
            java.util.HashMap r0 = com.appodeal.ads.utils.C9662x.f24470l
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.utils.C9662x.C9663a.m28439a()
            com.appodeal.ads.utils.w r9 = r0.f24479e
            if (r9 != 0) goto L_0x00a2
            r10 = r5
            goto L_0x00a6
        L_0x00a2:
            monitor-enter(r9)
            long r10 = r9.f24469k     // Catch:{ all -> 0x00ad }
            monitor-exit(r9)
        L_0x00a6:
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            r0 = 0
            goto L_0x00b2
        L_0x00ad:
            r0 = move-exception
            r2 = r0
            monitor-exit(r9)
            throw r2
        L_0x00b1:
            r0 = 1
        L_0x00b2:
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - impression count per ad session exceeded"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x00c6:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r7 = "impression_interval"
            org.json.JSONObject r0 = r0.optJSONObject(r7)
            r7 = -1
            if (r0 == 0) goto L_0x00da
            java.lang.String r8 = "fullscreen"
            int r0 = r0.optInt(r8, r7)
            int r0 = r0 * 1000
            goto L_0x00db
        L_0x00da:
            r0 = -1
        L_0x00db:
            boolean r8 = m28076a((com.appodeal.ads.modules.common.internal.adtype.AdType) r17)
            if (r8 == 0) goto L_0x00f8
            if (r0 <= 0) goto L_0x00f8
            long r8 = r1.f24094f
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f8
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r1.f24094f
            long r8 = r8 - r10
            long r10 = (long) r0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r0 = 0
            goto L_0x00f9
        L_0x00f8:
            r0 = 1
        L_0x00f9:
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - impression interval hasn't passed yet"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x010d:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r8 = "impression_interval_global"
            org.json.JSONObject r0 = r0.optJSONObject(r8)
            if (r0 == 0) goto L_0x011f
            java.lang.String r8 = "fullscreen"
            int r0 = r0.optInt(r8, r7)
            int r7 = r0 * 1000
        L_0x011f:
            boolean r0 = m28076a((com.appodeal.ads.modules.common.internal.adtype.AdType) r17)
            if (r0 == 0) goto L_0x013c
            if (r7 <= 0) goto L_0x013c
            long r8 = f24088i
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x013c
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = f24088i
            long r8 = r8 - r10
            long r10 = (long) r7
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r0 = 0
            goto L_0x013d
        L_0x013c:
            r0 = 1
        L_0x013d:
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - global impression interval hasn't passed yet"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x0151:
            boolean r0 = m28076a((com.appodeal.ads.modules.common.internal.adtype.AdType) r17)     // Catch:{ Exception -> 0x0195 }
            if (r0 != 0) goto L_0x0158
            goto L_0x0195
        L_0x0158:
            org.json.JSONObject r0 = r1.f24091c     // Catch:{ Exception -> 0x0195 }
            java.lang.String r7 = "impressions_per_period"
            org.json.JSONObject r0 = r0.optJSONObject(r7)     // Catch:{ Exception -> 0x0195 }
            if (r0 == 0) goto L_0x0195
            org.json.JSONArray r7 = r15.mo60743e()     // Catch:{ Exception -> 0x0195 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0195 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            java.lang.String r10 = "period"
            int r10 = r0.getInt(r10)     // Catch:{ Exception -> 0x0195 }
            long r10 = (long) r10     // Catch:{ Exception -> 0x0195 }
            long r8 = r8 - r10
            r10 = 0
            r11 = 0
        L_0x0177:
            int r12 = r7.length()     // Catch:{ Exception -> 0x0195 }
            if (r10 >= r12) goto L_0x018a
            long r12 = r7.getLong(r10)     // Catch:{ Exception -> 0x0195 }
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0187
            int r11 = r11 + 1
        L_0x0187:
            int r10 = r10 + 1
            goto L_0x0177
        L_0x018a:
            java.lang.String r7 = "amount"
            int r0 = r0.getInt(r7)     // Catch:{ Exception -> 0x0195 }
            if (r11 >= r0) goto L_0x0193
            goto L_0x0195
        L_0x0193:
            r0 = 0
            goto L_0x0196
        L_0x0195:
            r0 = 1
        L_0x0196:
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - impression count per period exceeded"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x01aa:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r7 = "price_floor"
            org.json.JSONObject r0 = r0.optJSONObject(r7)
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L_0x01be
            java.lang.String r9 = com.appodeal.ads.segments.C9502m.m28129a(r17)
            double r7 = r0.optDouble(r9, r7)
        L_0x01be:
            int r0 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x01c4
            r0 = 1
            goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            if (r0 != 0) goto L_0x01e6
            java.lang.String r0 = "Placement"
            java.lang.String r5 = "Can show"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r1.f24090b
            r6[r3] = r7
            java.lang.String r7 = r17.getDisplayName()
            r6[r2] = r7
            java.lang.Double r2 = java.lang.Double.valueOf(r18)
            r6[r4] = r2
            java.lang.String r2 = "'%s' - %s impression eCPM $%s lower than price floor"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            goto L_0x0078
        L_0x01e6:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r7 = "interstitial_type"
            java.lang.String r8 = ""
            java.lang.String r0 = r0.optString(r7, r8)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x020d
            int[] r7 = com.appodeal.ads.segments.C9490g.C9491a.f24096a
            int r8 = r17.ordinal()
            r7 = r7[r8]
            if (r7 == r2) goto L_0x0206
            if (r7 == r4) goto L_0x0203
            goto L_0x020d
        L_0x0203:
            java.lang.String r4 = "video"
            goto L_0x0208
        L_0x0206:
            java.lang.String r4 = "static"
        L_0x0208:
            boolean r0 = r0.equals(r4)
            goto L_0x020e
        L_0x020d:
            r0 = 1
        L_0x020e:
            if (r0 != 0) goto L_0x0222
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - interstitial type disabled"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x0222:
            java.util.HashMap r0 = com.appodeal.ads.utils.C9662x.f24470l
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.utils.C9662x.C9663a.m28439a()
            java.lang.Long r0 = r0.f24480f
            org.json.JSONObject r4 = r1.f24091c
            java.lang.String r7 = "disabled_until"
            org.json.JSONObject r4 = r4.optJSONObject(r7)
            if (r4 == 0) goto L_0x023b
            java.lang.String r7 = "time_since_first_launch"
            long r7 = r4.optLong(r7, r5)
            goto L_0x023c
        L_0x023b:
            r7 = r5
        L_0x023c:
            if (r0 == 0) goto L_0x0252
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0252
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r11 = r0.longValue()
            long r9 = r9 - r11
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r0 = 0
            goto L_0x0253
        L_0x0252:
            r0 = 1
        L_0x0253:
            if (r0 != 0) goto L_0x0267
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - time from first ad session launch not passed"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x0267:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r4 = "disabled_until"
            org.json.JSONObject r0 = r0.optJSONObject(r4)
            if (r0 == 0) goto L_0x0278
            java.lang.String r4 = "app_session_time"
            long r7 = r0.optLong(r4, r5)
            goto L_0x0279
        L_0x0278:
            r7 = r5
        L_0x0279:
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.utils.C9662x.C9663a.m28439a()
            long r9 = r0.mo61190i()
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0287
            r0 = 1
            goto L_0x0288
        L_0x0287:
            r0 = 0
        L_0x0288:
            if (r0 != 0) goto L_0x029b
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - time from ad session start not passed"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x029b:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r4 = "disabled_until"
            org.json.JSONObject r0 = r0.optJSONObject(r4)
            if (r0 == 0) goto L_0x02ac
            java.lang.String r4 = "app_session_count"
            long r7 = r0.optLong(r4, r5)
            goto L_0x02ad
        L_0x02ac:
            r7 = r5
        L_0x02ad:
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.utils.C9662x.C9663a.m28439a()
            long r9 = r0.mo61188g()
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x02bb
            r0 = 1
            goto L_0x02bc
        L_0x02bb:
            r0 = 0
        L_0x02bc:
            if (r0 != 0) goto L_0x02cf
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - ad sessions count not passed"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            goto L_0x0300
        L_0x02cf:
            org.json.JSONObject r0 = r1.f24091c
            java.lang.String r4 = "disabled_until"
            org.json.JSONObject r0 = r0.optJSONObject(r4)
            if (r0 == 0) goto L_0x02df
            java.lang.String r4 = "app_overall_time"
            long r5 = r0.optLong(r4, r5)
        L_0x02df:
            com.appodeal.ads.utils.x r0 = com.appodeal.ads.utils.C9662x.C9663a.m28439a()
            long r7 = r0.mo61187f()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x02ed
            r0 = 1
            goto L_0x02ee
        L_0x02ed:
            r0 = 0
        L_0x02ee:
            if (r0 != 0) goto L_0x0304
            java.lang.String r0 = "Placement"
            java.lang.String r4 = "Can show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r1.f24090b
            r2[r3] = r5
            java.lang.String r5 = "'%s' - ad session overall running time not passed"
            java.lang.String r2 = java.lang.String.format(r5, r2)
        L_0x0300:
            com.appodeal.ads.utils.Log.log((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r2)
            return r3
        L_0x0304:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.segments.C9490g.mo60739a(android.content.Context, com.appodeal.ads.modules.common.internal.adtype.AdType, double):boolean");
    }

    /* renamed from: b */
    public final String mo60740b() {
        return this.f24090b;
    }

    /* renamed from: c */
    public final double mo60741c() {
        JSONObject optJSONObject = this.f24091c.optJSONObject("reward");
        if (optJSONObject != null) {
            return optJSONObject.optDouble(AppLovinEventParameters.REVENUE_AMOUNT, 0.0d);
        }
        return 0.0d;
    }

    /* renamed from: d */
    public final String mo60742d() {
        JSONObject optJSONObject = this.f24091c.optJSONObject("reward");
        if (optJSONObject != null) {
            return optJSONObject.optString(AppLovinEventParameters.REVENUE_CURRENCY, "");
        }
        return null;
    }

    /* renamed from: e */
    public final JSONArray mo60743e() {
        String string = this.f24095g.f24252a.mo60778a(C9531b.C9532a.Placement).getString(String.valueOf(this.f24089a), "");
        return (string == null || string.isEmpty()) ? new JSONArray() : new JSONArray(string);
    }

    public final String toString() {
        return this.f24091c.toString();
    }

    /* renamed from: a */
    public static String m28075a(C9490g gVar) {
        if (gVar == null) {
            return "-1";
        }
        return String.valueOf(gVar.f24089a);
    }
}
