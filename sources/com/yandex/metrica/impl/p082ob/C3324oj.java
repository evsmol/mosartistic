package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oj */
public class C3324oj implements C2540T0 {
    /* renamed from: a */
    public C2291M0 mo16653a(C10720e eVar) {
        return new C3164lj();
    }

    /* renamed from: a */
    public String mo16654a() {
        return null;
    }

    /* renamed from: a */
    public void mo16696a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo16697a(Location location) {
    }

    /* renamed from: a */
    public void mo16655a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    /* renamed from: a */
    public void mo16656a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    /* renamed from: a */
    public void mo16657a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    /* renamed from: a */
    public void mo16659a(YandexMetricaConfig yandexMetricaConfig, C10725i iVar) {
    }

    /* renamed from: a */
    public void mo16698a(boolean z) {
    }

    /* renamed from: b */
    public C2325N0 mo16376b() {
        return new C3237mj();
    }

    /* renamed from: b */
    public void mo16699b(boolean z) {
    }

    /* renamed from: c */
    public String mo16660c() {
        return null;
    }

    /* renamed from: c */
    public void mo16661c(C10720e eVar) {
    }

    /* renamed from: c */
    public void mo16700c(String str, String str2) {
    }

    /* renamed from: d */
    public C3110k1 mo16662d() {
        return new C3110k1(new C3103jj());
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    /* renamed from: a */
    public void mo16658a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }
}
