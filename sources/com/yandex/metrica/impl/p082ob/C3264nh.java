package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nh */
public class C3264nh implements C2291M0, IPluginReporter {

    /* renamed from: a */
    private final List<C3101jh> f8432a = new ArrayList();

    /* renamed from: b */
    private volatile C2291M0 f8433b;

    /* renamed from: com.yandex.metrica.impl.ob.nh$a */
    class C3265a implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8434a;

        /* renamed from: b */
        final /* synthetic */ String f8435b;

        C3265a(C3264nh nhVar, String str, String str2) {
            this.f8434a = str;
            this.f8435b = str2;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15492d(this.f8434a, this.f8435b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$b */
    class C3266b implements C3101jh {
        C3266b(C3264nh nhVar) {
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$c */
    class C3267c implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ C2085H6 f8436a;

        C3267c(C3264nh nhVar, C2085H6 h6) {
            this.f8436a = h6;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15478a(this.f8436a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$d */
    class C3268d implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8437a;

        C3268d(C3264nh nhVar, String str) {
            this.f8437a = str;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportEvent(this.f8437a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$e */
    class C3269e implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8438a;

        /* renamed from: b */
        final /* synthetic */ String f8439b;

        C3269e(C3264nh nhVar, String str, String str2) {
            this.f8438a = str;
            this.f8439b = str2;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportEvent(this.f8438a, this.f8439b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$f */
    class C3270f implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8440a;

        /* renamed from: b */
        final /* synthetic */ Map f8441b;

        C3270f(C3264nh nhVar, String str, Map map) {
            this.f8440a = str;
            this.f8441b = map;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportEvent(this.f8440a, (Map<String, Object>) this.f8441b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$g */
    class C3271g implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8442a;

        /* renamed from: b */
        final /* synthetic */ Throwable f8443b;

        C3271g(C3264nh nhVar, String str, Throwable th) {
            this.f8442a = str;
            this.f8443b = th;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportError(this.f8442a, this.f8443b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$h */
    class C3272h implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8444a;

        /* renamed from: b */
        final /* synthetic */ String f8445b;

        /* renamed from: c */
        final /* synthetic */ Throwable f8446c;

        C3272h(C3264nh nhVar, String str, String str2, Throwable th) {
            this.f8444a = str;
            this.f8445b = str2;
            this.f8446c = th;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportError(this.f8444a, this.f8445b, this.f8446c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$i */
    class C3273i implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ Throwable f8447a;

        C3273i(C3264nh nhVar, Throwable th) {
            this.f8447a = th;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportUnhandledException(this.f8447a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$j */
    class C3274j implements C3101jh {
        C3274j(C3264nh nhVar) {
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$k */
    class C3275k implements C3101jh {
        C3275k(C3264nh nhVar) {
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$l */
    class C3276l implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8448a;

        C3276l(C3264nh nhVar, String str) {
            this.f8448a = str;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.setUserProfileID(this.f8448a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$m */
    class C3277m implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ UserProfile f8449a;

        C3277m(C3264nh nhVar, UserProfile userProfile) {
            this.f8449a = userProfile;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportUserProfile(this.f8449a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$n */
    class C3278n implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ C3607w6 f8450a;

        C3278n(C3264nh nhVar, C3607w6 w6Var) {
            this.f8450a = w6Var;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15480a(this.f8450a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$o */
    class C3279o implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ Revenue f8451a;

        C3279o(C3264nh nhVar, Revenue revenue) {
            this.f8451a = revenue;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportRevenue(this.f8451a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$p */
    class C3280p implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f8452a;

        C3280p(C3264nh nhVar, ECommerceEvent eCommerceEvent) {
            this.f8452a = eCommerceEvent;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportECommerce(this.f8452a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$q */
    class C3281q implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ boolean f8453a;

        C3281q(C3264nh nhVar, boolean z) {
            this.f8453a = z;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.setStatisticsSending(this.f8453a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$r */
    class C3282r implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ AdRevenue f8454a;

        C3282r(C3264nh nhVar, AdRevenue adRevenue) {
            this.f8454a = adRevenue;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.reportAdRevenue(this.f8454a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$s */
    class C3283s implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f8455a;

        C3283s(C3264nh nhVar, PluginErrorDetails pluginErrorDetails) {
            this.f8455a = pluginErrorDetails;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.getPluginExtension().reportUnhandledException(this.f8455a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$t */
    class C3284t implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ PluginErrorDetails f8456a;

        /* renamed from: b */
        final /* synthetic */ String f8457b;

        C3284t(C3264nh nhVar, PluginErrorDetails pluginErrorDetails, String str) {
            this.f8456a = pluginErrorDetails;
            this.f8457b = str;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.getPluginExtension().reportError(this.f8456a, this.f8457b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$u */
    class C3285u implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8458a;

        /* renamed from: b */
        final /* synthetic */ String f8459b;

        /* renamed from: c */
        final /* synthetic */ PluginErrorDetails f8460c;

        C3285u(C3264nh nhVar, String str, String str2, PluginErrorDetails pluginErrorDetails) {
            this.f8458a = str;
            this.f8459b = str2;
            this.f8460c = pluginErrorDetails;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.getPluginExtension().reportError(this.f8458a, this.f8459b, this.f8460c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$v */
    class C3286v implements C3101jh {
        C3286v(C3264nh nhVar) {
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15485b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$w */
    class C3287w implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8461a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f8462b;

        C3287w(C3264nh nhVar, String str, JSONObject jSONObject) {
            this.f8461a = str;
            this.f8462b = jSONObject;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15482a(this.f8461a, this.f8462b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.nh$x */
    class C3288x implements C3101jh {

        /* renamed from: a */
        final /* synthetic */ String f8463a;

        /* renamed from: b */
        final /* synthetic */ String f8464b;

        C3288x(C3264nh nhVar, String str, String str2) {
            this.f8463a = str;
            this.f8464b = str2;
        }

        /* renamed from: a */
        public void mo17768a(C2291M0 m0) {
            m0.mo15488b(this.f8463a, this.f8464b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo17889a(Context context) {
        this.f8433b = C2431Pf.m8142a().mo16473a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
        for (C3101jh a : this.f8432a) {
            a.mo17768a(this.f8433b);
        }
        this.f8432a.clear();
    }

    /* renamed from: b */
    public void mo15485b() {
        m10145a((C3101jh) new C3286v(this));
    }

    /* renamed from: d */
    public void mo15492d(String str, String str2) {
        m10145a((C3101jh) new C3265a(this, str, str2));
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        m10145a((C3101jh) new C3275k(this));
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        m10145a((C3101jh) new C3282r(this, adRevenue));
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        m10145a((C3101jh) new C3280p(this, eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        m10145a((C3101jh) new C3271g(this, str, th));
    }

    public void reportEvent(String str) {
        m10145a((C3101jh) new C3268d(this, str));
    }

    public void reportRevenue(Revenue revenue) {
        m10145a((C3101jh) new C3279o(this, revenue));
    }

    public void reportUnhandledException(Throwable th) {
        m10145a((C3101jh) new C3273i(this, th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        m10145a((C3101jh) new C3277m(this, userProfile));
    }

    public void resumeSession() {
        m10145a((C3101jh) new C3274j(this));
    }

    public void sendEventsBuffer() {
        m10145a((C3101jh) new C3266b(this));
    }

    public void setStatisticsSending(boolean z) {
        m10145a((C3101jh) new C3281q(this, z));
    }

    public void setUserProfileID(String str) {
        m10145a((C3101jh) new C3276l(this, str));
    }

    /* renamed from: b */
    public void mo15488b(String str, String str2) {
        m10145a((C3101jh) new C3288x(this, str, str2));
    }

    public void reportError(String str, String str2) {
        m10145a((C3101jh) new C3272h(this, str, str2, (Throwable) null));
    }

    public void reportEvent(String str, String str2) {
        m10145a((C3101jh) new C3269e(this, str, str2));
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        m10145a((C3101jh) new C3283s(this, pluginErrorDetails));
    }

    public void reportError(String str, String str2, Throwable th) {
        m10145a((C3101jh) new C3272h(this, str, str2, th));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        m10145a((C3101jh) new C3270f(this, str, map));
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        m10145a((C3101jh) new C3284t(this, pluginErrorDetails, str));
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        m10145a((C3101jh) new C3285u(this, str, str2, pluginErrorDetails));
    }

    /* renamed from: a */
    public void mo15478a(C2085H6 h6) {
        m10145a((C3101jh) new C3267c(this, h6));
    }

    /* renamed from: a */
    public void mo15480a(C3607w6 w6Var) {
        m10145a((C3101jh) new C3278n(this, w6Var));
    }

    /* renamed from: a */
    public void mo15482a(String str, JSONObject jSONObject) {
        m10145a((C3101jh) new C3287w(this, str, jSONObject));
    }

    /* renamed from: a */
    private synchronized void m10145a(C3101jh jhVar) {
        if (this.f8433b == null) {
            this.f8432a.add(jhVar);
        } else {
            jhVar.mo17768a(this.f8433b);
        }
    }
}
