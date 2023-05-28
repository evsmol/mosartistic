package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.webkit.WebView;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10722f;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p082ob.C3364q;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Uf */
public final class C2603Uf extends C2274Lf {

    /* renamed from: i */
    private final C2459Qf f6886i;

    /* renamed from: j */
    private final C2718Xf f6887j;

    /* renamed from: k */
    private final C2689Wf f6888k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C3302o2 f6889l;

    /* renamed from: com.yandex.metrica.impl.ob.Uf$A */
    class C2604A implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f6890a;

        C2604A(Activity activity) {
            this.f6890a = activity;
        }

        public void run() {
            C2603Uf.this.f6889l.mo17905a(this.f6890a, C2603Uf.m8614a(C2603Uf.this));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$B */
    class C2605B implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3364q.C3367c f6892a;

        C2605B(C3364q.C3367c cVar) {
            this.f6892a = cVar;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo16057a(this.f6892a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$C */
    class C2606C implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6894a;

        C2606C(String str) {
            this.f6894a = str;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportEvent(this.f6894a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$D */
    class C2607D implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6896a;

        /* renamed from: b */
        final /* synthetic */ String f6897b;

        C2607D(String str, String str2) {
            this.f6896a = str;
            this.f6897b = str2;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportEvent(this.f6896a, this.f6897b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$E */
    class C2608E implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6899a;

        /* renamed from: b */
        final /* synthetic */ List f6900b;

        C2608E(String str, List list) {
            this.f6899a = str;
            this.f6900b = list;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportEvent(this.f6899a, (Map<String, Object>) C1848A2.m6803a(this.f6900b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$F */
    class C2609F implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6902a;

        /* renamed from: b */
        final /* synthetic */ Throwable f6903b;

        C2609F(String str, Throwable th) {
            this.f6902a = str;
            this.f6903b = th;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportError(this.f6902a, this.f6903b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a */
    class C2610a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6905a;

        /* renamed from: b */
        final /* synthetic */ String f6906b;

        /* renamed from: c */
        final /* synthetic */ Throwable f6907c;

        C2610a(String str, String str2, Throwable th) {
            this.f6905a = str;
            this.f6906b = str2;
            this.f6907c = th;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportError(this.f6905a, this.f6906b, this.f6907c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b */
    class C2611b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f6909a;

        C2611b(Throwable th) {
            this.f6909a = th;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportUnhandledException(this.f6909a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$c */
    class C2612c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6911a;

        C2612c(String str) {
            this.f6911a = str;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo15489c(this.f6911a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$d */
    class C2613d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f6913a;

        C2613d(Intent intent) {
            this.f6913a = intent;
        }

        public void run() {
            C2603Uf.m8616c(C2603Uf.this).mo17771a().mo17719a(this.f6913a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$e */
    class C2614e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6915a;

        C2614e(String str) {
            this.f6915a = str;
        }

        public void run() {
            C2603Uf.m8616c(C2603Uf.this).mo17771a().mo17720a(this.f6915a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$f */
    class C2615f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f6917a;

        C2615f(Intent intent) {
            this.f6917a = intent;
        }

        public void run() {
            C2603Uf.m8616c(C2603Uf.this).mo17771a().mo17719a(this.f6917a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$g */
    class C2616g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6919a;

        C2616g(String str) {
            this.f6919a = str;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo16058a(this.f6919a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$h */
    class C2617h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Location f6921a;

        C2617h(Location location) {
            this.f6921a = location;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            Location location = this.f6921a;
            e.getClass();
            C2470R2.m8219a(location);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$i */
    class C2618i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f6923a;

        C2618i(boolean z) {
            this.f6923a = z;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            boolean z = this.f6923a;
            e.getClass();
            C2470R2.m8222a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$j */
    class C2619j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f6925a;

        C2619j(boolean z) {
            this.f6925a = z;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            boolean z = this.f6925a;
            e.getClass();
            C2470R2.m8222a(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$k */
    class C2620k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f6927a;

        /* renamed from: b */
        final /* synthetic */ YandexMetricaConfig f6928b;

        /* renamed from: c */
        final /* synthetic */ C10725i f6929c;

        C2620k(Context context, YandexMetricaConfig yandexMetricaConfig, C10725i iVar) {
            this.f6927a = context;
            this.f6928b = yandexMetricaConfig;
            this.f6929c = iVar;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            Context context = this.f6927a;
            e.getClass();
            C2470R2.m8217a(context).mo16541b(this.f6928b, C2603Uf.this.mo16179c().mo17790a(this.f6929c));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$l */
    class C2621l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f6931a;

        C2621l(boolean z) {
            this.f6931a = z;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            boolean z = this.f6931a;
            e.getClass();
            C2470R2.m8226c(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$m */
    class C2622m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6933a;

        C2622m(String str) {
            this.f6933a = str;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            String str = this.f6933a;
            e.getClass();
            C2470R2.m8220a(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$n */
    class C2623n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f6935a;

        C2623n(UserProfile userProfile) {
            this.f6935a = userProfile;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportUserProfile(this.f6935a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$o */
    class C2624o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f6937a;

        C2624o(Revenue revenue) {
            this.f6937a = revenue;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportRevenue(this.f6937a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$p */
    class C2625p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdRevenue f6939a;

        C2625p(AdRevenue adRevenue) {
            this.f6939a = adRevenue;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportAdRevenue(this.f6939a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$q */
    class C2626q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f6941a;

        C2626q(ECommerceEvent eCommerceEvent) {
            this.f6941a = eCommerceEvent;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).reportECommerce(this.f6941a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$r */
    class C2627r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkParametersListener f6943a;

        C2627r(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f6943a = deferredDeeplinkParametersListener;
        }

        public void run() {
            C2603Uf.this.mo16181e().getClass();
            C2470R2.m8232k().mo16537a(this.f6943a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$s */
    class C2628s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DeferredDeeplinkListener f6945a;

        C2628s(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f6945a = deferredDeeplinkListener;
        }

        public void run() {
            C2603Uf.this.mo16181e().getClass();
            C2470R2.m8232k().mo16536a(this.f6945a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$t */
    class C2629t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f6947a;

        C2629t(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f6947a = appMetricaDeviceIDListener;
        }

        public void run() {
            C2603Uf.this.mo16181e().getClass();
            C2470R2.m8232k().mo16540b(this.f6947a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$u */
    class C2630u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6949a;

        /* renamed from: b */
        final /* synthetic */ String f6950b;

        C2630u(String str, String str2) {
            this.f6949a = str;
            this.f6950b = str2;
        }

        public void run() {
            C2522Sf e = C2603Uf.this.mo16181e();
            String str = this.f6949a;
            String str2 = this.f6950b;
            e.getClass();
            C2470R2.m8221a(str, str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$v */
    class C2631v implements Runnable {
        C2631v() {
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$w */
    class C2632w implements Runnable {
        C2632w() {
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo16055a(C2603Uf.this.mo16184h());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$x */
    class C2633x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6954a;

        /* renamed from: b */
        final /* synthetic */ String f6955b;

        C2633x(String str, String str2) {
            this.f6954a = str;
            this.f6955b = str2;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo15481a(this.f6954a, this.f6955b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$y */
    class C2634y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6957a;

        C2634y(String str) {
            this.f6957a = str;
        }

        public void run() {
            C2603Uf.m8614a(C2603Uf.this).mo15487b(this.f6957a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$z */
    class C2635z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f6959a;

        C2635z(Activity activity) {
            this.f6959a = activity;
        }

        public void run() {
            C2603Uf.this.f6889l.mo17907b(this.f6959a, C2603Uf.m8614a(C2603Uf.this));
        }
    }

    public C2603Uf(ICommonExecutor iCommonExecutor) {
        this(new C2522Sf(), iCommonExecutor, new C2718Xf(), new C2689Wf(), new C1939D2());
    }

    /* renamed from: a */
    public void mo16775a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C10725i iVar;
        this.f6887j.mo17041a(context, yandexMetricaConfig);
        C2689Wf wf = this.f6888k;
        if (yandexMetricaConfig instanceof C10725i) {
            iVar = (C10725i) yandexMetricaConfig;
        } else {
            iVar = new C10725i(yandexMetricaConfig);
        }
        C10725i a = wf.mo16998a(iVar);
        mo16183g().mo64738a(context, (YandexMetricaConfig) a);
        mo16180d().execute(new C2620k(context, yandexMetricaConfig, a));
        mo16181e().getClass();
        C2470R2.m8231j();
    }

    /* renamed from: c */
    public void mo16798c(Activity activity) {
        mo16177a().mo15517a(null);
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2635z(activity));
    }

    /* renamed from: d */
    public void mo16801d(String str) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17051c(str);
        mo16183g().getClass();
        mo16180d().execute(new C2612c(str));
    }

    /* renamed from: e */
    public void mo16802e(String str) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17048a(str);
        mo16180d().execute(new C2616g(str));
    }

    /* renamed from: f */
    public void mo16803f(String str) {
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2622m(str));
    }

    /* renamed from: i */
    public void mo16804i() {
        mo16177a().mo15517a(null);
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2631v());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2603Uf(com.yandex.metrica.impl.p082ob.C2522Sf r14, com.yandex.metrica.core.api.executors.ICommonExecutor r15, com.yandex.metrica.impl.p082ob.C2718Xf r16, com.yandex.metrica.impl.p082ob.C2689Wf r17, com.yandex.metrica.impl.p082ob.C1939D2 r18) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.Kf r5 = new com.yandex.metrica.impl.ob.Kf
            r5.<init>(r14)
            com.yandex.metrica.impl.ob.Qf r6 = new com.yandex.metrica.impl.ob.Qf
            r6.<init>(r14)
            com.yandex.metrica.f r8 = new com.yandex.metrica.f
            r7 = r18
            r8.<init>(r14, r7)
            com.yandex.metrica.impl.ob.Pf r9 = com.yandex.metrica.impl.p082ob.C2431Pf.m8142a()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.p082ob.C2410P.m8089g()
            com.yandex.metrica.impl.ob.l0 r10 = r0.mo16433f()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.p082ob.C2410P.m8089g()
            com.yandex.metrica.impl.ob.o2 r11 = r0.mo16438l()
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.p082ob.C2410P.m8089g()
            com.yandex.metrica.impl.ob.a0 r12 = r0.mo16432e()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2603Uf.<init>(com.yandex.metrica.impl.ob.Sf, com.yandex.metrica.core.api.executors.ICommonExecutor, com.yandex.metrica.impl.ob.Xf, com.yandex.metrica.impl.ob.Wf, com.yandex.metrica.impl.ob.D2):void");
    }

    /* renamed from: b */
    public void mo16796b(String str) {
        mo16177a().mo15517a(null);
        this.f6887j.reportEvent(str);
        mo16183g().getClass();
        mo16180d().execute(new C2606C(str));
    }

    /* renamed from: b */
    public void mo16797b(String str, String str2) {
        mo16177a().mo15517a(null);
        this.f6887j.reportEvent(str, str2);
        mo16183g().getClass();
        mo16180d().execute(new C2607D(str, str2));
    }

    /* renamed from: c */
    public void mo16800c(String str, String str2) {
        mo16177a().mo15517a(null);
        if (!this.f6887j.mo17054f(str)) {
            Log.w("AppMetrica", "Impossible to report event because parameters are invalid.");
            return;
        }
        mo16183g().getClass();
        mo16180d().execute(new C2633x(str, str2));
    }

    /* renamed from: b */
    public void mo16794b(Activity activity) {
        Intent intent = null;
        mo16177a().mo15517a(null);
        this.f6887j.mo17050c(activity);
        mo16183g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        mo16180d().execute(new C2613d(intent));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2603Uf(C2522Sf sf, ICommonExecutor iCommonExecutor, C2718Xf xf, C2689Wf wf, C2243Kf kf, C2459Qf qf, C1939D2 d2, C10722f fVar, C2431Pf pf, C3138l0 l0Var, C3302o2 o2Var, C2786a0 a0Var) {
        super(sf, iCommonExecutor, kf, d2, fVar, pf, l0Var, a0Var);
        this.f6888k = wf;
        this.f6887j = xf;
        this.f6886i = qf;
        this.f6889l = o2Var;
    }

    /* renamed from: c */
    public void mo16799c(String str) {
        if (this.f6886i.mo16520a().mo15965b() && this.f6887j.mo17055g(str)) {
            mo16183g().getClass();
            mo16180d().execute(new C2634y(str));
        }
    }

    /* renamed from: b */
    public void mo16795b(Context context, boolean z) {
        this.f6887j.mo17049b(context);
        mo16183g().mo64741c(context);
        mo16180d().execute(new C2621l(z));
    }

    /* renamed from: c */
    static C3110k1 m8616c(C2603Uf uf) {
        uf.mo16181e().getClass();
        return C2470R2.m8232k().mo16545d();
    }

    /* renamed from: a */
    public void mo16772a(Activity activity) {
        mo16177a().mo15517a(null);
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2604A(activity));
    }

    /* renamed from: a */
    public void mo16773a(Application application) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17038a(application);
        mo16180d().execute(new C2605B(mo16183g().mo64736a(application)));
    }

    /* renamed from: a */
    public void mo16791a(String str, Map<String, Object> map) {
        mo16177a().mo15517a(null);
        this.f6887j.reportEvent(str, map);
        mo16183g().getClass();
        mo16180d().execute(new C2608E(str, C1848A2.m6801a(map)));
    }

    /* renamed from: a */
    public void mo16790a(String str, Throwable th) {
        mo16177a().mo15517a(null);
        this.f6887j.reportError(str, th);
        mo16183g().getClass();
        if (th == null) {
            th = new C3118k6();
            th.fillInStackTrace();
        }
        mo16180d().execute(new C2609F(str, th));
    }

    /* renamed from: a */
    public void mo16789a(String str, String str2, Throwable th) {
        mo16177a().mo15517a(null);
        this.f6887j.reportError(str, str2, th);
        mo16180d().execute(new C2610a(str, str2, th));
    }

    /* renamed from: a */
    public void mo16792a(Throwable th) {
        mo16177a().mo15517a(null);
        this.f6887j.reportUnhandledException(th);
        mo16183g().getClass();
        mo16180d().execute(new C2611b(th));
    }

    /* renamed from: a */
    public void mo16787a(String str) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17053e(str);
        mo16183g().getClass();
        mo16180d().execute(new C2614e(str));
    }

    /* renamed from: a */
    public void mo16777a(Intent intent) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17043a(intent);
        mo16183g().getClass();
        mo16180d().execute(new C2615f(intent));
    }

    /* renamed from: a */
    public void mo16778a(Location location) {
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2617h(location));
    }

    /* renamed from: a */
    public void mo16793a(boolean z) {
        this.f6887j.getClass();
        mo16183g().getClass();
        mo16180d().execute(new C2618i(z));
    }

    /* renamed from: a */
    public void mo16776a(Context context, boolean z) {
        this.f6887j.mo17039a(context);
        mo16183g().mo64740b(context);
        mo16180d().execute(new C2619j(z));
    }

    /* renamed from: a */
    public void mo16786a(UserProfile userProfile) {
        mo16177a().mo15517a(null);
        this.f6887j.reportUserProfile(userProfile);
        mo16183g().getClass();
        mo16180d().execute(new C2623n(userProfile));
    }

    /* renamed from: a */
    public void mo16784a(Revenue revenue) {
        mo16177a().mo15517a(null);
        this.f6887j.reportRevenue(revenue);
        mo16183g().getClass();
        mo16180d().execute(new C2624o(revenue));
    }

    /* renamed from: a */
    public void mo16780a(AdRevenue adRevenue) {
        mo16177a().mo15517a(null);
        this.f6887j.reportAdRevenue(adRevenue);
        mo16183g().getClass();
        mo16180d().execute(new C2625p(adRevenue));
    }

    /* renamed from: a */
    public void mo16785a(ECommerceEvent eCommerceEvent) {
        mo16177a().mo15517a(null);
        this.f6887j.reportECommerce(eCommerceEvent);
        mo16183g().getClass();
        mo16180d().execute(new C2626q(eCommerceEvent));
    }

    /* renamed from: a */
    public void mo16783a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17047a(deferredDeeplinkParametersListener);
        mo16183g().getClass();
        mo16180d().execute(new C2627r(deferredDeeplinkParametersListener));
    }

    /* renamed from: a */
    public void mo16782a(DeferredDeeplinkListener deferredDeeplinkListener) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17046a(deferredDeeplinkListener);
        mo16183g().getClass();
        mo16180d().execute(new C2628s(deferredDeeplinkListener));
    }

    /* renamed from: a */
    public void mo16781a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17045a(appMetricaDeviceIDListener);
        mo16183g().getClass();
        mo16180d().execute(new C2629t(appMetricaDeviceIDListener));
    }

    /* renamed from: a */
    public IReporter mo16771a(Context context, String str) {
        this.f6887j.mo17042a(context, str);
        mo16178b().mo17136a(context);
        return mo16182f().mo16473a(context, str);
    }

    /* renamed from: a */
    public void mo16774a(Context context, ReporterConfig reporterConfig) {
        this.f6887j.mo17040a(context, reporterConfig);
        C10720e a = C10720e.m31576a(reporterConfig);
        mo16183g().mo64737a(context);
        mo16182f().mo16472a(context, a);
    }

    /* renamed from: a */
    public void mo16788a(String str, String str2) {
        this.f6887j.mo17052d(str);
        mo16183g().getClass();
        mo16180d().execute(new C2630u(str, str2));
    }

    /* renamed from: a */
    public void mo16779a(WebView webView) {
        mo16177a().mo15517a(null);
        this.f6887j.mo17044a(webView);
        mo16183g().mo64739a(webView, this);
        mo16180d().execute(new C2632w());
    }

    /* renamed from: a */
    static C2214K0 m8614a(C2603Uf uf) {
        uf.mo16181e().getClass();
        return C2470R2.m8232k().mo16545d().mo17772b();
    }
}
