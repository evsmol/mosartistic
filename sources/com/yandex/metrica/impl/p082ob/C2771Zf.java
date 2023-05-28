package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Zf */
public class C2771Zf implements IReporter {

    /* renamed from: b */
    static final C2252Kn<String> f7271b = new C2103Hn(new C2035Fn("Event name"));

    /* renamed from: c */
    static final C2252Kn<String> f7272c = new C2103Hn(new C2035Fn("Error message"));

    /* renamed from: d */
    static final C2252Kn<String> f7273d = new C2103Hn(new C2035Fn("Error identifier"));

    /* renamed from: e */
    static final C2252Kn<Throwable> f7274e = new C2103Hn(new C2069Gn("Unhandled exception"));

    /* renamed from: f */
    static final C2252Kn<UserProfile> f7275f = new C2103Hn(new C2069Gn("User profile"));

    /* renamed from: g */
    static final C2252Kn<Revenue> f7276g = new C2103Hn(new C2069Gn("Revenue"));

    /* renamed from: h */
    static final C2252Kn<AdRevenue> f7277h = new C2103Hn(new C2069Gn("AdRevenue"));

    /* renamed from: i */
    static final C2252Kn<ECommerceEvent> f7278i = new C2103Hn(new C2069Gn("ECommerceEvent"));

    /* renamed from: a */
    private final C2744Yf f7279a;

    public C2771Zf() {
        this(new C2744Yf());
    }

    /* renamed from: a */
    public C2744Yf mo17111a() {
        return this.f7279a;
    }

    public IPluginReporter getPluginExtension() {
        return this.f7279a;
    }

    public void pauseSession() {
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        ((C2103Hn) f7277h).mo15517a(adRevenue);
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        ((C2103Hn) f7278i).mo15517a(eCommerceEvent);
    }

    public void reportError(String str, Throwable th) throws ValidationException {
        ((C2103Hn) f7272c).mo15517a(str);
    }

    public void reportEvent(String str) throws ValidationException {
        ((C2103Hn) f7271b).mo15517a(str);
    }

    public void reportRevenue(Revenue revenue) throws ValidationException {
        ((C2103Hn) f7276g).mo15517a(revenue);
    }

    public void reportUnhandledException(Throwable th) throws ValidationException {
        ((C2103Hn) f7274e).mo15517a(th);
    }

    public void reportUserProfile(UserProfile userProfile) throws ValidationException {
        ((C2103Hn) f7275f).mo15517a(userProfile);
    }

    public void resumeSession() {
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    C2771Zf(C2744Yf yf) {
        this.f7279a = yf;
    }

    public void reportError(String str, String str2) {
        ((C2103Hn) f7273d).mo15517a(str);
    }

    public void reportEvent(String str, String str2) throws ValidationException {
        ((C2103Hn) f7271b).mo15517a(str);
    }

    public void reportError(String str, String str2, Throwable th) {
        ((C2103Hn) f7273d).mo15517a(str);
    }

    public void reportEvent(String str, Map<String, Object> map) throws ValidationException {
        ((C2103Hn) f7271b).mo15517a(str);
    }
}
