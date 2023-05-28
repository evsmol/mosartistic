package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lj */
class C3164lj implements C2291M0 {

    /* renamed from: a */
    private final C3132kj f8256a = new C3132kj();

    C3164lj() {
    }

    /* renamed from: a */
    public void mo15478a(C2085H6 h6) {
    }

    /* renamed from: a */
    public void mo15480a(C3607w6 w6Var) {
    }

    /* renamed from: a */
    public void mo15482a(String str, JSONObject jSONObject) {
    }

    /* renamed from: b */
    public void mo15485b() {
    }

    /* renamed from: b */
    public void mo15488b(String str, String str2) {
    }

    /* renamed from: d */
    public void mo15492d(String str, String str2) {
    }

    public IPluginReporter getPluginExtension() {
        return this.f8256a;
    }

    public void pauseSession() {
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    public void reportError(String str, String str2) {
    }

    public void reportError(String str, String str2, Throwable th) {
    }

    public void reportError(String str, Throwable th) {
    }

    public void reportEvent(String str) {
    }

    public void reportEvent(String str, String str2) {
    }

    public void reportEvent(String str, Map<String, Object> map) {
    }

    public void reportRevenue(Revenue revenue) {
    }

    public void reportUnhandledException(Throwable th) {
    }

    public void reportUserProfile(UserProfile userProfile) {
    }

    public void resumeSession() {
    }

    public void sendEventsBuffer() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }
}
