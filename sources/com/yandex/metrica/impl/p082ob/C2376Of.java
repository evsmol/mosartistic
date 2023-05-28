package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10722f;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Of */
public class C2376Of implements C2291M0 {

    /* renamed from: a */
    private final C2522Sf f6315a;

    /* renamed from: b */
    private final C2805ag f6316b;

    /* renamed from: c */
    private final ICommonExecutor f6317c;

    /* renamed from: d */
    private final Context f6318d;

    /* renamed from: e */
    private final C2689Wf f6319e;

    /* renamed from: f */
    private final C10720e f6320f;

    /* renamed from: g */
    private final C10722f f6321g;

    /* renamed from: h */
    private final C2341Nf f6322h;

    /* renamed from: com.yandex.metrica.impl.ob.Of$a */
    class C2377a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6323a;

        /* renamed from: b */
        final /* synthetic */ String f6324b;

        C2377a(String str, String str2) {
            this.f6323a = str;
            this.f6324b = str2;
        }

        public void run() {
            C2376Of.this.mo16396a().mo15488b(this.f6323a, this.f6324b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$b */
    class C2378b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6326a;

        /* renamed from: b */
        final /* synthetic */ String f6327b;

        C2378b(String str, String str2) {
            this.f6326a = str;
            this.f6327b = str2;
        }

        public void run() {
            C2376Of.this.mo16396a().mo15492d(this.f6326a, this.f6327b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$c */
    class C2379c implements C3422qm<C2291M0> {

        /* renamed from: a */
        final /* synthetic */ C2522Sf f6329a;

        /* renamed from: b */
        final /* synthetic */ Context f6330b;

        /* renamed from: c */
        final /* synthetic */ C10720e f6331c;

        C2379c(C2522Sf sf, Context context, C10720e eVar) {
            this.f6329a = sf;
            this.f6330b = context;
            this.f6331c = eVar;
        }

        /* renamed from: a */
        public Object mo16401a() {
            C2522Sf sf = this.f6329a;
            Context context = this.f6330b;
            C10720e eVar = this.f6331c;
            sf.getClass();
            return C2470R2.m8217a(context).mo16534a(eVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$d */
    class C2380d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6332a;

        C2380d(String str) {
            this.f6332a = str;
        }

        public void run() {
            C2376Of.this.mo16396a().reportEvent(this.f6332a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$e */
    class C2381e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6334a;

        /* renamed from: b */
        final /* synthetic */ String f6335b;

        C2381e(String str, String str2) {
            this.f6334a = str;
            this.f6335b = str2;
        }

        public void run() {
            C2376Of.this.mo16396a().reportEvent(this.f6334a, this.f6335b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$f */
    class C2382f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6337a;

        /* renamed from: b */
        final /* synthetic */ List f6338b;

        C2382f(String str, List list) {
            this.f6337a = str;
            this.f6338b = list;
        }

        public void run() {
            C2376Of.this.mo16396a().reportEvent(this.f6337a, (Map<String, Object>) C1848A2.m6803a(this.f6338b));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$g */
    class C2383g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6340a;

        /* renamed from: b */
        final /* synthetic */ Throwable f6341b;

        C2383g(String str, Throwable th) {
            this.f6340a = str;
            this.f6341b = th;
        }

        public void run() {
            C2376Of.this.mo16396a().reportError(this.f6340a, this.f6341b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$h */
    class C2384h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6343a;

        /* renamed from: b */
        final /* synthetic */ String f6344b;

        /* renamed from: c */
        final /* synthetic */ Throwable f6345c;

        C2384h(String str, String str2, Throwable th) {
            this.f6343a = str;
            this.f6344b = str2;
            this.f6345c = th;
        }

        public void run() {
            C2376Of.this.mo16396a().reportError(this.f6343a, this.f6344b, this.f6345c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$i */
    class C2385i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f6347a;

        C2385i(Throwable th) {
            this.f6347a = th;
        }

        public void run() {
            C2376Of.this.mo16396a().reportUnhandledException(this.f6347a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$j */
    class C2386j implements Runnable {
        C2386j() {
        }

        public void run() {
            C2376Of.this.mo16396a().resumeSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$k */
    class C2387k implements Runnable {
        C2387k() {
        }

        public void run() {
            C2376Of.this.mo16396a().pauseSession();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$l */
    class C2388l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6351a;

        C2388l(String str) {
            this.f6351a = str;
        }

        public void run() {
            C2376Of.this.mo16396a().setUserProfileID(this.f6351a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$m */
    class C2389m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2085H6 f6353a;

        C2389m(C2085H6 h6) {
            this.f6353a = h6;
        }

        public void run() {
            C2376Of.this.mo16396a().mo15478a(this.f6353a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$n */
    class C2390n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserProfile f6355a;

        C2390n(UserProfile userProfile) {
            this.f6355a = userProfile;
        }

        public void run() {
            C2376Of.this.mo16396a().reportUserProfile(this.f6355a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$o */
    class C2391o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Revenue f6357a;

        C2391o(Revenue revenue) {
            this.f6357a = revenue;
        }

        public void run() {
            C2376Of.this.mo16396a().reportRevenue(this.f6357a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$p */
    class C2392p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdRevenue f6359a;

        C2392p(AdRevenue adRevenue) {
            this.f6359a = adRevenue;
        }

        public void run() {
            C2376Of.this.mo16396a().reportAdRevenue(this.f6359a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$q */
    class C2393q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ECommerceEvent f6361a;

        C2393q(ECommerceEvent eCommerceEvent) {
            this.f6361a = eCommerceEvent;
        }

        public void run() {
            C2376Of.this.mo16396a().reportECommerce(this.f6361a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$r */
    class C2394r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f6363a;

        C2394r(boolean z) {
            this.f6363a = z;
        }

        public void run() {
            C2376Of.this.mo16396a().setStatisticsSending(this.f6363a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$s */
    class C2395s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10720e f6365a;

        C2395s(C10720e eVar) {
            this.f6365a = eVar;
        }

        public void run() {
            C2376Of.m8071a(C2376Of.this, this.f6365a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$t */
    class C2396t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10720e f6367a;

        C2396t(C10720e eVar) {
            this.f6367a = eVar;
        }

        public void run() {
            C2376Of.m8071a(C2376Of.this, this.f6367a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$u */
    class C2397u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3607w6 f6369a;

        C2397u(C3607w6 w6Var) {
            this.f6369a = w6Var;
        }

        public void run() {
            C2376Of.this.mo16396a().mo15480a(this.f6369a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$v */
    class C2398v implements Runnable {
        C2398v() {
        }

        public void run() {
            C2376Of.this.mo16396a().mo15485b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$w */
    class C2399w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6372a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f6373b;

        C2399w(String str, JSONObject jSONObject) {
            this.f6372a = str;
            this.f6373b = jSONObject;
        }

        public void run() {
            C2376Of.this.mo16396a().mo15482a(this.f6372a, this.f6373b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Of$x */
    class C2400x implements Runnable {
        C2400x() {
        }

        public void run() {
            C2376Of.this.mo16396a().sendEventsBuffer();
        }
    }

    public C2376Of(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(iCommonExecutor, context.getApplicationContext(), str, new C2522Sf());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2291M0 mo16396a() {
        C2522Sf sf = this.f6315a;
        Context context = this.f6318d;
        C10720e eVar = this.f6320f;
        sf.getClass();
        return C2470R2.m8217a(context).mo16534a(eVar);
    }

    /* renamed from: b */
    public void mo15485b() {
        this.f6321g.getClass();
        this.f6317c.execute(new C2398v());
    }

    /* renamed from: d */
    public void mo16398d(String str) {
        C10720e a = new C10720e.C10721a(str).mo64735a();
        this.f6321g.getClass();
        this.f6317c.execute(new C2395s(a));
    }

    public IPluginReporter getPluginExtension() {
        return this.f6322h;
    }

    public void pauseSession() {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2387k());
    }

    public void reportAdRevenue(AdRevenue adRevenue) {
        this.f6316b.reportAdRevenue(adRevenue);
        this.f6321g.getClass();
        this.f6317c.execute(new C2392p(adRevenue));
    }

    public void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f6316b.reportECommerce(eCommerceEvent);
        this.f6321g.getClass();
        this.f6317c.execute(new C2393q(eCommerceEvent));
    }

    public void reportError(String str, Throwable th) {
        this.f6316b.reportError(str, th);
        this.f6321g.getClass();
        if (th == null) {
            th = new C3118k6();
            th.fillInStackTrace();
        }
        this.f6317c.execute(new C2383g(str, th));
    }

    public void reportEvent(String str) {
        this.f6316b.reportEvent(str);
        this.f6321g.getClass();
        this.f6317c.execute(new C2380d(str));
    }

    public void reportRevenue(Revenue revenue) {
        this.f6316b.reportRevenue(revenue);
        this.f6321g.getClass();
        this.f6317c.execute(new C2391o(revenue));
    }

    public void reportUnhandledException(Throwable th) {
        this.f6316b.reportUnhandledException(th);
        this.f6321g.getClass();
        this.f6317c.execute(new C2385i(th));
    }

    public void reportUserProfile(UserProfile userProfile) {
        this.f6316b.reportUserProfile(userProfile);
        this.f6321g.getClass();
        this.f6317c.execute(new C2390n(userProfile));
    }

    public void resumeSession() {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2386j());
    }

    public void sendEventsBuffer() {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2400x());
    }

    public void setStatisticsSending(boolean z) {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2394r(z));
    }

    public void setUserProfileID(String str) {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2388l(str));
    }

    private C2376Of(ICommonExecutor iCommonExecutor, Context context, String str, C2522Sf sf) {
        this(iCommonExecutor, context, new C2805ag(), sf, new C2689Wf(), new C10722f(sf, new C1939D2()), C10720e.m31575a(str).mo64735a());
    }

    /* renamed from: b */
    public void mo15488b(String str, String str2) {
        this.f6316b.getClass();
        this.f6321g.getClass();
        this.f6317c.execute(new C2377a(str, str2));
    }

    public void reportEvent(String str, String str2) {
        this.f6316b.reportEvent(str, str2);
        this.f6321g.getClass();
        this.f6317c.execute(new C2381e(str, str2));
    }

    /* renamed from: d */
    public void mo15492d(String str, String str2) {
        this.f6316b.mo15492d(str, str2);
        this.f6321g.getClass();
        this.f6317c.execute(new C2378b(str, str2));
    }

    public void reportEvent(String str, Map<String, Object> map) {
        this.f6316b.reportEvent(str, map);
        this.f6321g.getClass();
        this.f6317c.execute(new C2382f(str, C1848A2.m6801a(map)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2376Of(com.yandex.metrica.core.api.executors.ICommonExecutor r10, android.content.Context r11, com.yandex.metrica.impl.p082ob.C2805ag r12, com.yandex.metrica.impl.p082ob.C2522Sf r13, com.yandex.metrica.impl.p082ob.C2689Wf r14, com.yandex.metrica.C10722f r15, com.yandex.metrica.C10720e r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Nf r8 = new com.yandex.metrica.impl.ob.Nf
            com.yandex.metrica.impl.ob.Yf r0 = r12.mo17111a()
            com.yandex.metrica.impl.ob.Of$c r1 = new com.yandex.metrica.impl.ob.Of$c
            r2 = r11
            r4 = r13
            r7 = r16
            r1.<init>(r13, r11, r7)
            r3 = r10
            r6 = r15
            r8.<init>(r0, r15, r10, r1)
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2376Of.<init>(com.yandex.metrica.core.api.executors.ICommonExecutor, android.content.Context, com.yandex.metrica.impl.ob.ag, com.yandex.metrica.impl.ob.Sf, com.yandex.metrica.impl.ob.Wf, com.yandex.metrica.f, com.yandex.metrica.e):void");
    }

    C2376Of(ICommonExecutor iCommonExecutor, Context context, C2805ag agVar, C2522Sf sf, C2689Wf wf, C10722f fVar, C10720e eVar, C2341Nf nf) {
        this.f6317c = iCommonExecutor;
        this.f6318d = context;
        this.f6316b = agVar;
        this.f6315a = sf;
        this.f6319e = wf;
        this.f6321g = fVar;
        this.f6320f = eVar;
        this.f6322h = nf;
    }

    /* renamed from: a */
    public void mo15478a(C2085H6 h6) {
        this.f6321g.getClass();
        this.f6317c.execute(new C2389m(h6));
    }

    /* renamed from: a */
    public void mo15480a(C3607w6 w6Var) {
        this.f6321g.getClass();
        this.f6317c.execute(new C2397u(w6Var));
    }

    /* renamed from: a */
    public void mo15482a(String str, JSONObject jSONObject) {
        this.f6321g.getClass();
        this.f6317c.execute(new C2399w(str, jSONObject));
    }

    /* renamed from: a */
    public void mo16397a(C10720e eVar) {
        C10720e a = this.f6319e.mo16997a(eVar);
        this.f6321g.getClass();
        this.f6317c.execute(new C2396t(a));
    }

    /* renamed from: a */
    static void m8071a(C2376Of of, C10720e eVar) {
        C2522Sf sf = of.f6315a;
        Context context = of.f6318d;
        sf.getClass();
        C2470R2.m8217a(context).mo16544c(eVar);
    }

    public void reportError(String str, String str2) {
        this.f6316b.reportError(str, str2, (Throwable) null);
        this.f6317c.execute(new C2384h(str, str2, (Throwable) null));
    }

    public void reportError(String str, String str2, Throwable th) {
        this.f6316b.reportError(str, str2, th);
        this.f6317c.execute(new C2384h(str, str2, th));
    }
}
