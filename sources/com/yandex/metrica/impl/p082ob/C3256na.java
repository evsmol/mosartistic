package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.na */
public class C3256na implements C3474sa<YandexMetricaConfig> {

    /* renamed from: a */
    private final C2848bm f8427a;

    /* renamed from: b */
    private final C3694ya f8428b;

    C3256na(C2848bm bmVar, C3694ya yaVar) {
        this.f8427a = bmVar;
        this.f8428b = yaVar;
    }

    /* renamed from: a */
    public JSONObject mo17884a(Object obj) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        YandexMetricaConfig yandexMetricaConfig = (YandexMetricaConfig) obj;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (yandexMetricaConfig != null) {
                JSONObject putOpt = jSONObject3.put("api_key", yandexMetricaConfig.apiKey).putOpt("app_version", yandexMetricaConfig.appVersion).putOpt("session_timeout", yandexMetricaConfig.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig.nativeCrashReporting).putOpt("location", m10135a(yandexMetricaConfig.location)).putOpt("location_tracking", yandexMetricaConfig.locationTracking).putOpt("logs", yandexMetricaConfig.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
                if (preloadInfo == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C2572Tl.m8545f((Map) preloadInfo.getAdditionalParams()));
                }
                putOpt.putOpt("preload_info", jSONObject).putOpt("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig.maxReportsInDatabaseCount).putOpt("error_environment", C2572Tl.m8545f((Map) yandexMetricaConfig.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
                if (yandexMetricaConfig instanceof C10725i) {
                    C10725i iVar = (C10725i) yandexMetricaConfig;
                    JSONObject putOpt2 = jSONObject3.putOpt("device_type", iVar.f26869a).putOpt("clids", C2572Tl.m8545f((Map) iVar.f26870b)).putOpt("distribution_referrer", iVar.f26871c);
                    List<String> list = iVar.f26872d;
                    if (list == null) {
                        jSONArray = null;
                    } else if (list.isEmpty()) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = C2572Tl.m8534b((List<?>) list);
                    }
                    JSONObject putOpt3 = putOpt2.putOpt("custom_hosts", jSONArray).putOpt("app_build_number", iVar.f26873e).putOpt("dispatch_period_seconds", iVar.f26874f).putOpt("max_reports_count", iVar.f26875g).putOpt("app_environment", C2572Tl.m8545f((Map) iVar.f26876h)).putOpt("preload_info_auto_tracking", iVar.f26877i).putOpt("permissions_collection", iVar.f26878j).putOpt("anr_monitoring", iVar.f26879k);
                    this.f8428b.getClass();
                    putOpt3.putOpt("pulse_config", (Object) null).putOpt("rtm_config", (Object) null).put("crash_transformer_set", iVar.f26880l != null);
                }
            }
            jSONObject2.putOpt(Constants.CONFIG, jSONObject3).putOpt("process_name", ((C2726Xl) this.f8427a).mo17070b());
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private JSONObject m10135a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt(IronSourceConstants.EVENTS_PROVIDER, location.getProvider()).put("timestamp", location.getTime()).put("precision", (double) location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put(C8856i.f22445fC, location.getLatitude()).put("direction", (double) location.getBearing()).put("speed", (double) location.getSpeed());
    }
}
