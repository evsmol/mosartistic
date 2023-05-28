package com.yandex.metrica;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C2258L2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.p */
public final class C10728p {

    /* renamed from: a */
    private static final List<String> f26894a = Arrays.asList(new String[]{"yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url"});

    /* renamed from: com.yandex.metrica.p$Ucc */
    public interface Ucc {
        void onError(String str);

        void onResult(JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m31635a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        C2258L2.m7706a(context, iIdentifierCallback, new ArrayList(list));
    }

    @Deprecated
    public static YandexMetricaConfig cpcwh(YandexMetricaConfig yandexMetricaConfig, String str) {
        return C2258L2.m7700a(yandexMetricaConfig, str);
    }

    public static String gcni(Context context) {
        return C2258L2.m7703a(context);
    }

    public static String gdid(Context context) {
        return C2258L2.m7710b(context);
    }

    public static String gmsvn(int i) {
        return C2258L2.m7702a(i);
    }

    public static void guc(Ucc ucc, boolean z) {
        C2258L2.m7709a(ucc, z);
    }

    public static String guid(Context context) {
        return C2258L2.m7713d(context);
    }

    @Deprecated(since = "Use ModulesFacade.isActivatedForApp")
    public static boolean iifa() {
        return ModulesFacade.isActivatedForApp();
    }

    public static String mpn(Context context) {
        return C2258L2.m7712c(context);
    }

    public static String pgai() {
        try {
            return C2258L2.m7705a().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean plat() {
        try {
            return C2258L2.m7711b().get();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated(since = "Use ModulesFacade.reportEvent")
    public static void rce(int i, String str, String str2, Map<String, String> map) {
        ModulesFacade.reportEvent(i, str, str2, map);
    }

    public static void rlse(Context context, Map<String, Object> map) {
        C2258L2.m7707a(context, map);
    }

    @Deprecated(since = "Use ModulesFacade.sendEventsBuffer")
    public static void seb() {
        ModulesFacade.sendEventsBuffer();
    }

    @Deprecated(since = "Will be removed in next major release")
    public static void slte(Context context, boolean z) {
        C2258L2.m7708a(context, z);
    }

    /* renamed from: u */
    public static String m31637u(String str) {
        return C2258L2.m7704a(str);
    }

    /* renamed from: a */
    public static void m31636a(Context context, IIdentifierCallback iIdentifierCallback, String... strArr) {
        m31635a(context, iIdentifierCallback, (List<String>) Arrays.asList(strArr));
    }

    /* renamed from: a */
    public static void m31634a(Context context, IIdentifierCallback iIdentifierCallback) {
        m31635a(context, iIdentifierCallback, f26894a);
    }
}
