package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.Xf */
public class C2718Xf extends C2805ag {

    /* renamed from: j */
    private static final C2252Kn<YandexMetricaConfig> f7180j = new C2103Hn(new C2069Gn("Config"));

    /* renamed from: k */
    private static final C2252Kn<String> f7181k = new C2103Hn(new C2035Fn("Native crash"));

    /* renamed from: l */
    private static final C2252Kn<Activity> f7182l = new C2103Hn(new C2069Gn("Activity"));

    /* renamed from: m */
    private static final C2252Kn<Intent> f7183m = new C2103Hn(new C2069Gn("Intent"));

    /* renamed from: n */
    private static final C2252Kn<Application> f7184n = new C2103Hn(new C2069Gn("Application"));

    /* renamed from: o */
    private static final C2252Kn<Context> f7185o = new C2103Hn(new C2069Gn("Context"));

    /* renamed from: p */
    private static final C2252Kn<Object> f7186p = new C2103Hn(new C2069Gn("Deeplink listener"));

    /* renamed from: q */
    private static final C2252Kn<AppMetricaDeviceIDListener> f7187q = new C2103Hn(new C2069Gn("DeviceID listener"));

    /* renamed from: r */
    private static final C2252Kn<ReporterConfig> f7188r = new C2103Hn(new C2069Gn("Reporter Config"));

    /* renamed from: s */
    private static final C2252Kn<String> f7189s = new C2103Hn(new C2035Fn("Deeplink"));

    /* renamed from: t */
    private static final C2252Kn<String> f7190t = new C2103Hn(new C2035Fn("Referral url"));

    /* renamed from: u */
    private static final C2252Kn<String> f7191u = new C2103Hn(new C2289Ln());

    /* renamed from: v */
    private static final C2252Kn<String> f7192v = new C2103Hn(new C2069Gn("Key"));

    /* renamed from: w */
    private static final C2252Kn<WebView> f7193w = new C2103Hn(new C2069Gn("WebView"));

    /* renamed from: x */
    private static final C2252Kn<String> f7194x = new C2035Fn(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    /* renamed from: y */
    private static final C2252Kn<String> f7195y = new C2035Fn(AppMeasurementSdk.ConditionalUserProperty.NAME);

    /* renamed from: a */
    public void mo17038a(Application application) {
        ((C2103Hn) f7184n).mo15517a(application);
    }

    /* renamed from: b */
    public void mo17049b(Context context) {
        ((C2103Hn) f7185o).mo15517a(context);
    }

    /* renamed from: c */
    public void mo17051c(String str) {
        ((C2103Hn) f7181k).mo15517a(str);
    }

    /* renamed from: d */
    public void mo17052d(String str) {
        ((C2103Hn) f7192v).mo15517a(str);
    }

    /* renamed from: e */
    public void mo17053e(String str) {
        ((C2103Hn) f7189s).mo15517a(str);
    }

    /* renamed from: f */
    public boolean mo17054f(String str) {
        return ((C2035Fn) f7195y).mo15517a(str).mo15965b();
    }

    /* renamed from: g */
    public boolean mo17055g(String str) {
        return ((C2035Fn) f7194x).mo15517a(str).mo15965b();
    }

    /* renamed from: a */
    public void mo17043a(Intent intent) {
        ((C2103Hn) f7183m).mo15517a(intent);
    }

    /* renamed from: c */
    public void mo17050c(Activity activity) {
        ((C2103Hn) f7182l).mo15517a(activity);
    }

    /* renamed from: a */
    public void mo17048a(String str) {
        ((C2103Hn) f7190t).mo15517a(str);
    }

    /* renamed from: a */
    public void mo17039a(Context context) {
        ((C2103Hn) f7185o).mo15517a(context);
    }

    /* renamed from: a */
    public void mo17047a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((C2103Hn) f7186p).mo15517a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo17046a(DeferredDeeplinkListener deferredDeeplinkListener) {
        ((C2103Hn) f7186p).mo15517a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void mo17045a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((C2103Hn) f7187q).mo15517a(appMetricaDeviceIDListener);
    }

    /* renamed from: a */
    public void mo17042a(Context context, String str) {
        ((C2103Hn) f7185o).mo15517a(context);
        ((C2103Hn) f7191u).mo15517a(str);
    }

    /* renamed from: a */
    public void mo17040a(Context context, ReporterConfig reporterConfig) {
        ((C2103Hn) f7185o).mo15517a(context);
        ((C2103Hn) f7188r).mo15517a(reporterConfig);
    }

    /* renamed from: a */
    public void mo17041a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        ((C2103Hn) f7185o).mo15517a(context);
        ((C2103Hn) f7180j).mo15517a(yandexMetricaConfig);
    }

    /* renamed from: a */
    public void mo17044a(WebView webView) {
        ((C2103Hn) f7193w).mo15517a(webView);
    }
}
