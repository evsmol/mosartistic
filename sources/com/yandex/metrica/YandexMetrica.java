package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p082ob.C2663Vf;
import com.yandex.metrica.impl.p082ob.C2676W2;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public final class YandexMetrica {
    private YandexMetrica() {
    }

    public static void activate(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C2663Vf.m8792a().mo16775a(context, yandexMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        C2663Vf.m8792a().mo16774a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(Application application) {
        C2663Vf.m8792a().mo16773a(application);
    }

    public static int getLibraryApiLevel() {
        return 106;
    }

    public static String getLibraryVersion() {
        return "5.3.0";
    }

    public static YandexMetricaPlugins getPluginExtension() {
        return C2676W2.m8800a();
    }

    public static IReporter getReporter(Context context, String str) {
        return C2663Vf.m8792a().mo16771a(context, str);
    }

    public static void initWebViewReporting(WebView webView) {
        C2663Vf.m8792a().mo16779a(webView);
    }

    public static void pauseSession(Activity activity) {
        C2663Vf.m8792a().mo16772a(activity);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        C2663Vf.m8792a().mo16788a(str, str2);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        C2663Vf.m8792a().mo16780a(adRevenue);
    }

    public static void reportAppOpen(Activity activity) {
        C2663Vf.m8792a().mo16794b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        C2663Vf.m8792a().mo16785a(eCommerceEvent);
    }

    public static void reportError(String str, Throwable th) {
        C2663Vf.m8792a().mo16790a(str, th);
    }

    public static void reportEvent(String str) {
        C2663Vf.m8792a().mo16796b(str);
    }

    @Deprecated
    public static void reportNativeCrash(String str) {
        C2663Vf.m8792a().mo16801d(str);
    }

    public static void reportReferralUrl(String str) {
        C2663Vf.m8792a().mo16802e(str);
    }

    public static void reportRevenue(Revenue revenue) {
        C2663Vf.m8792a().mo16784a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        C2663Vf.m8792a().mo16792a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        C2663Vf.m8792a().mo16786a(userProfile);
    }

    public static void requestAppMetricaDeviceID(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C2663Vf.m8792a().mo16781a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        C2663Vf.m8792a().mo16782a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C2663Vf.m8792a().mo16783a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(Activity activity) {
        C2663Vf.m8792a().mo16798c(activity);
    }

    public static void sendEventsBuffer() {
        C2663Vf.m8792a().mo16804i();
    }

    public static void setLocation(Location location) {
        C2663Vf.m8792a().mo16778a(location);
    }

    public static void setLocationTracking(boolean z) {
        C2663Vf.m8792a().mo16793a(z);
    }

    public static void setStatisticsSending(Context context, boolean z) {
        C2663Vf.m8792a().mo16795b(context, z);
    }

    public static void setUserProfileID(String str) {
        C2663Vf.m8792a().mo16803f(str);
    }

    public static void reportAppOpen(String str) {
        C2663Vf.m8792a().mo16787a(str);
    }

    public static void reportError(String str, String str2) {
        C2663Vf.m8792a().mo16789a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str, String str2) {
        C2663Vf.m8792a().mo16797b(str, str2);
    }

    public static void setLocationTracking(Context context, boolean z) {
        C2663Vf.m8792a().mo16776a(context, z);
    }

    public static void reportAppOpen(Intent intent) {
        C2663Vf.m8792a().mo16777a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        C2663Vf.m8792a().mo16789a(str, str2, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        C2663Vf.m8792a().mo16791a(str, map);
    }
}
