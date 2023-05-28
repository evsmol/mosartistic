package com.yandex.metrica.impl.p082ob;

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p082ob.C3586vf;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.metrica.profile.UserProfileUpdate;
import com.yandex.metrica.rtm.wrapper.C3774d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.B */
public abstract class C1874B implements C2105I0 {

    /* renamed from: n */
    private static final Collection<Integer> f5060n = new HashSet(Arrays.asList(new Integer[]{14, 15}));

    /* renamed from: o */
    private static final C2252Kn<C3586vf> f5061o = new C1875a();

    /* renamed from: a */
    protected final Context f5062a;

    /* renamed from: b */
    protected final C2445Q1 f5063b;

    /* renamed from: c */
    protected final C2875cm f5064c;

    /* renamed from: d */
    protected final C2537Sl f5065d;

    /* renamed from: e */
    protected final C2706X6 f5066e;

    /* renamed from: f */
    protected final C2510S6 f5067f;

    /* renamed from: g */
    protected final C2300M6 f5068g;

    /* renamed from: h */
    private final C2232K6 f5069h;

    /* renamed from: i */
    protected final C2541T1 f5070i;

    /* renamed from: j */
    private C2817b1 f5071j;

    /* renamed from: k */
    private final C2848bm f5072k;

    /* renamed from: l */
    private final C1841A0 f5073l;

    /* renamed from: m */
    private final C3470s6 f5074m;

    /* renamed from: com.yandex.metrica.impl.ob.B$a */
    class C1875a implements C2252Kn<C3586vf> {
        C1875a() {
        }

        /* renamed from: a */
        public C2167In mo15517a(Object obj) {
            C3586vf.C3587a[] aVarArr = ((C3586vf) obj).f9338a;
            if (aVarArr == null || aVarArr.length == 0) {
                return C2167In.m7453a(this, "attributes list is empty");
            }
            return C2167In.m7452a(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.B$b */
    static final class C1876b {

        /* renamed from: a */
        private static final C2252Kn<Revenue> f5075a = new C2409On();

        /* renamed from: a */
        public static C2252Kn<Revenue> m6893a() {
            return f5075a;
        }
    }

    C1874B(Context context, C2541T1 t1, C2445Q1 q1, C1841A0 a0, C2848bm bmVar, C3774d dVar, C2745Yg yg, C2706X6 x6, C2510S6 s6, C2300M6 m6, C2232K6 k6, C3470s6 s6Var) {
        this.f5062a = context.getApplicationContext();
        this.f5070i = t1;
        this.f5063b = q1;
        this.f5073l = a0;
        this.f5066e = x6;
        this.f5067f = s6;
        this.f5068g = m6;
        this.f5069h = k6;
        this.f5074m = s6Var;
        C2875cm b = C2642Ul.m8746b(q1.mo18444b().mo64607a());
        this.f5064c = b;
        q1.mo16499a(new C2849bn(b, "Crash Environment"));
        C2537Sl a = C2642Ul.m8744a(q1.mo18444b().mo64607a());
        this.f5065d = a;
        if (C2814b.m9068a(q1.mo18444b().mo64630p())) {
            b.setEnabled();
            a.setEnabled();
        }
        this.f5072k = bmVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15479a(C2817b1 b1Var) {
        this.f5071j = b1Var;
    }

    /* renamed from: b */
    public void mo15488b(String str, String str2) {
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        this.f5070i.mo16671a((C2851c0) new C2168J(str2, str, C2788a1.EVENT_TYPE_STATBOX.mo17139b(), 0, cmVar), this.f5063b);
        if (this.f5064c.isEnabled()) {
            StringBuilder sb = new StringBuilder("Statbox event received ");
            sb.append(" with name: ");
            sb.append(mo15495f(str));
            sb.append(" with value: ");
            String f = mo15495f(str2);
            if (f.length() > 100) {
                sb.append(f.substring(0, 100));
                sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            } else {
                sb.append(f);
            }
            this.f5064c.mo15273i(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo15490c(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f5063b.f6507c.mo18388a(str, str2);
        } else if (this.f5064c.isEnabled()) {
            this.f5064c.mo15270fw("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
        }
    }

    /* renamed from: d */
    public void mo15492d(String str, String str2) {
        List<Integer> list = C3716z0.f9563i;
        this.f5070i.mo16671a(new C2851c0(str2, str, C2788a1.EVENT_TYPE_DIAGNOSTIC.mo17139b()), this.f5063b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15493e(String str) {
        this.f5070i.mo16692e();
        this.f5071j.mo17209b();
        C2541T1 t1 = this.f5070i;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J("", str, C2788a1.EVENT_TYPE_START.mo17139b(), cmVar), this.f5063b);
        this.f5063b.mo16507h();
    }

    /* renamed from: f */
    public void mo15496f() {
        this.f5070i.mo16686b(this.f5063b);
    }

    public IPluginReporter getPluginExtension() {
        return this;
    }

    public void pauseSession() {
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Pause session");
        }
        mo15491d((String) null);
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        this.f5070i.mo16668a(new C2523Sg(adRevenue, this.f5064c), this.f5063b);
        if (this.f5064c.isEnabled()) {
            C2875cm cmVar = this.f5064c;
            StringBuilder sb = new StringBuilder();
            sb.append("AdRevenue Received: AdRevenue{adRevenue=");
            sb.append(adRevenue.adRevenue);
            sb.append(", currency='");
            sb.append(mo15495f(adRevenue.currency.getCurrencyCode()));
            sb.append('\'');
            sb.append(", adType=");
            Object obj = adRevenue.adType;
            if (obj == null) {
                obj = "<null>";
            }
            sb.append(obj);
            sb.append(", adNetwork='");
            sb.append(mo15495f(adRevenue.adNetwork));
            sb.append('\'');
            sb.append(", adUnitId='");
            sb.append(mo15495f(adRevenue.adUnitId));
            sb.append('\'');
            sb.append(", adUnitName='");
            sb.append(mo15495f(adRevenue.adUnitName));
            sb.append('\'');
            sb.append(", adPlacementId='");
            sb.append(mo15495f(adRevenue.adPlacementId));
            sb.append('\'');
            sb.append(", adPlacementName='");
            sb.append(mo15495f(adRevenue.adPlacementName));
            sb.append('\'');
            sb.append(", precision='");
            sb.append(mo15495f(adRevenue.precision));
            sb.append('\'');
            sb.append(", payload=");
            sb.append(C2572Tl.m8546g(adRevenue.payload));
            sb.append('}');
            cmVar.mo15273i(sb.toString());
        }
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        if (this.f5064c.isEnabled()) {
            C2875cm cmVar = this.f5064c;
            cmVar.mo15273i("E-commerce event received: " + eCommerceEvent.getPublicDescription());
        }
        this.f5070i.mo16670a((C2766Za) eCommerceEvent, this.f5063b);
    }

    public void reportError(String str, Throwable th) {
        C1883B6 b6 = new C1883B6(str, m6870a(th));
        C2541T1 t1 = this.f5070i;
        byte[] byteArray = MessageNano.toByteArray(this.f5067f.fromModel(b6));
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J(byteArray, str, C2788a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo17139b(), cmVar), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Error received: %s", mo15495f(str));
        }
    }

    public void reportEvent(String str) {
        if (this.f5064c.isEnabled() && this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Event received: " + mo15495f(str));
        }
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        this.f5070i.mo16671a((C2851c0) new C2168J("", str, C2788a1.EVENT_TYPE_REGULAR.mo17139b(), 0, cmVar), this.f5063b);
    }

    public void reportRevenue(Revenue revenue) {
        C2167In a = C1876b.m6893a().mo15517a(revenue);
        if (a.mo15965b()) {
            this.f5070i.mo16669a(new C2675W1(revenue, this.f5064c), this.f5063b);
            if (this.f5064c.isEnabled()) {
                StringBuilder sb = new StringBuilder("Revenue received ");
                sb.append("for productID: ");
                sb.append(mo15495f(revenue.productID));
                sb.append(" of quantity: ");
                Integer num = revenue.quantity;
                if (num != null) {
                    sb.append(num);
                } else {
                    sb.append("<null>");
                }
                sb.append(" with price");
                if (revenue.priceMicros != null) {
                    sb.append(" (in micros): ");
                    sb.append(revenue.priceMicros);
                } else {
                    sb.append(": ");
                    sb.append(revenue.price);
                }
                sb.append(" ");
                sb.append(revenue.currency);
                this.f5064c.mo15273i(sb.toString());
            }
        } else if (this.f5064c.isEnabled()) {
            C2875cm cmVar = this.f5064c;
            cmVar.mo15283w("Passed revenue is not valid. Reason: " + a.mo15964a());
        }
    }

    public void reportUnhandledException(Throwable th) {
        C2085H6 a = C2111I6.m7361a(th, new C3607w6((C1979E6) null, (List<C1979E6>) null, ((C2726Xl) this.f5072k).mo17070b()), (List<StackTraceElement>) null, this.f5073l.mo15408a(), this.f5073l.mo15409b());
        this.f5070i.mo16685b(a, this.f5063b);
        mo15486b(a);
    }

    public void reportUserProfile(UserProfile userProfile) {
        C2804af afVar = new C2804af();
        for (UserProfileUpdate<? extends C2836bf> userProfileUpdatePatcher : userProfile.getUserProfileUpdates()) {
            C2521Se se = (C2521Se) userProfileUpdatePatcher.getUserProfileUpdatePatcher();
            se.mo16612a(this.f5064c);
            se.mo16360a(afVar);
        }
        C3586vf c = afVar.mo17191c();
        C2167In a = f5061o.mo15517a(c);
        if (a.mo15965b()) {
            this.f5070i.mo16675a(c, this.f5063b);
            if (this.f5064c.isEnabled()) {
                this.f5064c.mo15273i(new StringBuilder("User profile received").toString());
            }
        } else if (this.f5064c.isEnabled()) {
            C2875cm cmVar = this.f5064c;
            cmVar.mo15283w("UserInfo wasn't sent because " + a.mo15964a());
        }
    }

    public void resumeSession() {
        mo15493e((String) null);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Resume session");
        }
    }

    public void sendEventsBuffer() {
        C2541T1 t1 = this.f5070i;
        C2788a1 a1Var = C2788a1.EVENT_TYPE_PURGE_BUFFER;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J("", "", a1Var.mo17139b(), 0, cmVar), this.f5063b);
    }

    public void setStatisticsSending(boolean z) {
        this.f5063b.mo18444b().mo64615c(z);
    }

    public void setUserProfileID(String str) {
        this.f5070i.mo16688b(str, this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Set user profile ID: " + mo15495f(str));
        }
    }

    /* renamed from: a */
    public void mo15484a(Map<String, String> map) {
        if (!C1848A2.m6815b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                mo15490c((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo15495f(String str) {
        if (str == null) {
            return "<null>";
        }
        return str.isEmpty() ? "<empty>" : str;
    }

    /* renamed from: a */
    public void mo15483a(String str, byte[] bArr) {
        C2541T1 t1 = this.f5070i;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        C2168J j = new C2168J("", (String) null, C2788a1.EVENT_TYPE_SET_SESSION_EXTRA.mo17139b(), cmVar);
        if (bArr == null) {
            bArr = new byte[0];
        }
        j.mo17327a((Map<String, byte[]>) Collections.singletonMap(str, bArr));
        t1.mo16671a((C2851c0) j, this.f5063b);
    }

    /* renamed from: c */
    public void mo15489c(String str) {
        this.f5070i.mo16678a(str, this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Error received: native");
        }
    }

    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        String b;
        C2085H6 a = this.f5074m.mo18202a(pluginErrorDetails);
        C2541T1 t1 = this.f5070i;
        C2016F6 f6 = a.f5512a;
        String str = "";
        if (!(f6 == null || (b = f6.mo15779b()) == null)) {
            str = b;
        }
        byte[] byteArray = MessageNano.toByteArray(this.f5066e.fromModel(a));
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J(byteArray, str, C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.mo17139b(), cmVar), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Crash from plugin received: %s", mo15495f(pluginErrorDetails.getMessage()));
        }
    }

    public void reportEvent(String str, String str2) {
        if (this.f5064c.isEnabled()) {
            m6871e(str, str2);
        }
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        this.f5070i.mo16671a((C2851c0) new C2168J(str2, str, C2788a1.EVENT_TYPE_REGULAR.mo17139b(), 0, cmVar), this.f5063b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15491d(String str) {
        if (!this.f5063b.mo16505f()) {
            this.f5070i.mo16691d();
            this.f5071j.mo17208a();
            this.f5063b.mo16506g();
            C2541T1 t1 = this.f5070i;
            C2875cm cmVar = this.f5064c;
            List<Integer> list = C3716z0.f9563i;
            t1.mo16671a((C2851c0) new C2168J("", str, C2788a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.mo17139b(), 0, cmVar), this.f5063b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15486b(C2085H6 h6) {
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Unhandled exception received: " + h6.toString());
        }
    }

    /* renamed from: b */
    public void mo15485b() {
        Integer num;
        C2541T1 t1 = this.f5070i;
        Context context = this.f5062a;
        C2851c0 c0Var = new C2851c0();
        c0Var.f7524a = "";
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C1967E c = g.mo15741c();
        Intrinsics.checkNotNullExpressionValue(c, "GlobalServiceLocator.get…nce().batteryInfoProvider");
        Integer a = c.mo15640a();
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        if (C1848A2.m6808a(23)) {
            try {
                Object systemService = context.getSystemService("notification");
                if (systemService != null) {
                    num = Integer.valueOf(((NotificationManager) systemService).getCurrentInterruptionFilter());
                    JSONObject put = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
                    Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …tionFilter)\n            )");
                    c0Var.f7528e = C2788a1.EVENT_TYPE_IDENTITY_LIGHT.mo17139b();
                    c0Var.f7525b = put.toString();
                    t1.mo16671a(c0Var, this.f5063b);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } catch (Throwable unused) {
            }
        }
        num = null;
        JSONObject put2 = new JSONObject().put("dfid", new JSONObject().putOpt("battery", a).put("boot_time_seconds", elapsedRealtime).putOpt("notification_filter", num));
        Intrinsics.checkNotNullExpressionValue(put2, "JSONObject()\n           …tionFilter)\n            )");
        c0Var.f7528e = C2788a1.EVENT_TYPE_IDENTITY_LIGHT.mo17139b();
        c0Var.f7525b = put2.toString();
        t1.mo16671a(c0Var, this.f5063b);
    }

    /* renamed from: b */
    public void mo15487b(String str) {
        this.f5070i.mo16671a(C2851c0.m9223a(str), this.f5063b);
    }

    public void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.f5070i.mo16671a(C3716z0.m11107a(str2, MessageNano.toByteArray(this.f5068g.fromModel(new C3724z6(new C1883B6(str2, m6870a(th)), str))), this.f5064c), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Error received: id: %s, message: %s", mo15495f(str), mo15495f(str2));
        }
    }

    /* renamed from: e */
    private void m6871e(String str, String str2) {
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15273i("Event received: " + mo15495f(str) + ". With value: " + mo15495f(str2));
        }
    }

    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C3470s6 s6Var = this.f5074m;
        s6Var.getClass();
        this.f5070i.mo16671a(C3716z0.m11107a(str, MessageNano.toByteArray(this.f5067f.fromModel(new C1883B6(str, pluginErrorDetails != null ? s6Var.mo18202a(pluginErrorDetails) : null))), this.f5064c), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Error from plugin received: %s", mo15495f(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15494e() {
        boolean z = !this.f5063b.mo16505f();
        if (z) {
            C2875cm cmVar = this.f5064c;
            List<Integer> list = C3716z0.f9563i;
            this.f5070i.mo16671a((C2851c0) new C2168J("", "", C2788a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME.mo17139b(), 0, cmVar), this.f5063b);
        }
        return z;
    }

    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C3470s6 s6Var = this.f5074m;
        s6Var.getClass();
        this.f5070i.mo16671a(C3716z0.m11107a(str2, MessageNano.toByteArray(this.f5068g.fromModel(new C3724z6(new C1883B6(str2, pluginErrorDetails != null ? s6Var.mo18202a(pluginErrorDetails) : null), str))), this.f5064c), this.f5063b);
        if (this.f5064c.isEnabled()) {
            this.f5064c.mo15265fi("Error with identifier: %s from plugin received: %s", str, mo15495f(str2));
        }
    }

    /* renamed from: a */
    public void mo15477a(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
        HashMap hashMap;
        boolean z = true;
        if (f5060n.contains(Integer.valueOf(i)) || i < 1 || i > 99) {
            z = false;
        }
        if (!z) {
            if (map == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map);
            }
            C2875cm cmVar = this.f5064c;
            List<Integer> list = C3716z0.f9563i;
            C2851c0 c = new C2168J(str2, str, C2788a1.EVENT_TYPE_CUSTOM_EVENT.mo17139b(), i, cmVar).mo17332c(C2572Tl.m8546g(hashMap));
            if (map2 != null) {
                c.mo17327a(map2);
            }
            this.f5070i.mo16671a(c, this.f5063b);
        }
    }

    public void reportEvent(String str, Map<String, Object> map) {
        String str2 = null;
        HashMap hashMap = C1848A2.m6815b((Map) map) ? null : new HashMap(map);
        C2541T1 t1 = this.f5070i;
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16665a((C2851c0) new C2168J("", str, C2788a1.EVENT_TYPE_REGULAR.mo17139b(), 0, cmVar), this.f5063b, (Map<String, Object>) hashMap);
        if (this.f5064c.isEnabled()) {
            if (hashMap != null) {
                str2 = hashMap.toString();
            }
            m6871e(str, str2);
        }
    }

    /* renamed from: a */
    private C2085H6 m6870a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        Throwable th2;
        List list = null;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C3118k6) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        C3607w6 w6Var = new C3607w6((C1979E6) null, (List<C1979E6>) null, ((C2726Xl) this.f5072k).mo17070b());
        if (stackTraceElementArr != null) {
            list = Arrays.asList(stackTraceElementArr);
        }
        return C2111I6.m7361a(th2, w6Var, list, this.f5073l.mo15408a(), this.f5073l.mo15409b());
    }

    /* renamed from: a */
    public void mo15478a(C2085H6 h6) {
        this.f5070i.mo16667a(h6, this.f5063b);
        mo15486b(h6);
    }

    /* renamed from: a */
    public void mo15480a(C3607w6 w6Var) {
        C3645x6 x6Var = new C3645x6(w6Var, this.f5073l.mo15408a(), this.f5073l.mo15409b());
        C2541T1 t1 = this.f5070i;
        byte[] byteArray = MessageNano.toByteArray(this.f5069h.fromModel(x6Var));
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        t1.mo16671a((C2851c0) new C2168J(byteArray, "", C2788a1.EVENT_TYPE_ANR.mo17139b(), cmVar), this.f5063b);
    }

    /* renamed from: a */
    public void mo15482a(String str, JSONObject jSONObject) {
        C2541T1 t1 = this.f5070i;
        C2851c0 c0Var = new C2851c0();
        c0Var.f7524a = str;
        c0Var.f7528e = C2788a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.mo17139b();
        c0Var.f7525b = jSONObject.toString();
        t1.mo16671a(c0Var, this.f5063b);
    }

    /* renamed from: a */
    public void mo15481a(String str, String str2) {
        m6871e(str, str2);
        C2875cm cmVar = this.f5064c;
        List<Integer> list = C3716z0.f9563i;
        this.f5070i.mo16671a(new C2168J(str2, str, C2788a1.EVENT_TYPE_REGULAR.mo17139b(), 0, cmVar).mo17323a(C3679y0.JS), this.f5063b);
    }
}
