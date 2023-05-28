package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.R2 */
public class C2470R2 implements C2361O0 {

    /* renamed from: f */
    private static volatile C2470R2 f6543f = null;

    /* renamed from: g */
    private static volatile boolean f6544g = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6545a;

    /* renamed from: b */
    private final C2446Q2 f6546b;

    /* renamed from: c */
    private final FutureTask<C2540T0> f6547c;

    /* renamed from: d */
    private final C2502S0 f6548d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2166Im f6549e;

    /* renamed from: com.yandex.metrica.impl.ob.R2$a */
    class C2471a implements Callable<C2540T0> {
        C2471a() {
        }

        public Object call() throws Exception {
            return C2470R2.m8218a(C2470R2.this);
        }
    }

    private C2470R2(Context context, C2446Q2 q2, C2166Im im) {
        this(context, q2, q2.mo16508a(context, im), im);
    }

    /* renamed from: a */
    public static C2470R2 m8217a(Context context) {
        if (f6543f == null) {
            synchronized (C2470R2.class) {
                if (f6543f == null) {
                    f6543f = new C2470R2(context.getApplicationContext(), new C2446Q2(), C2410P.m8089g().mo16431d());
                    C2470R2 r2 = f6543f;
                    r2.f6549e.mo15961b().execute(new C2505S2(r2));
                }
            }
        }
        return f6543f;
    }

    /* renamed from: f */
    private static C3244n1 m8227f() {
        if (m8230i()) {
            return f6543f.m8228g();
        }
        return C2410P.m8089g().mo16433f();
    }

    /* renamed from: g */
    private C2540T0 m8228g() {
        try {
            return this.f6547c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static synchronized boolean m8229h() {
        boolean z;
        synchronized (C2470R2.class) {
            z = f6544g;
        }
        return z;
    }

    /* renamed from: i */
    public static synchronized boolean m8230i() {
        boolean z;
        synchronized (C2470R2.class) {
            z = (f6543f == null || !f6543f.f6547c.isDone() || f6543f.m8228g().mo16662d() == null) ? false : true;
        }
        return z;
    }

    /* renamed from: j */
    public static synchronized void m8231j() {
        synchronized (C2470R2.class) {
            f6544g = true;
        }
    }

    /* renamed from: k */
    public static C2470R2 m8232k() {
        return f6543f;
    }

    /* renamed from: d */
    public C3110k1 mo16545d() {
        return m8228g().mo16662d();
    }

    /* renamed from: e */
    public C1984Eb mo16546e() {
        return this.f6548d.mo16445d();
    }

    /* renamed from: b */
    public static void m8224b(boolean z) {
        m8227f().mo16698a(z);
    }

    /* renamed from: c */
    public static void m8226c(boolean z) {
        m8227f().setStatisticsSending(z);
    }

    C2470R2(Context context, C2446Q2 q2, C2502S0 s0, C2166Im im) {
        this.f6545a = context;
        this.f6546b = q2;
        this.f6548d = s0;
        this.f6549e = im;
        FutureTask<C2540T0> futureTask = new FutureTask<>(new C2471a());
        this.f6547c = futureTask;
        im.mo15961b().execute(futureTask);
    }

    /* renamed from: b */
    public void mo16542b(C10725i iVar) {
        this.f6548d.mo16441a(iVar, this);
    }

    /* renamed from: c */
    public void mo16544c(C10720e eVar) {
        m8228g().mo16661c(eVar);
    }

    /* renamed from: b */
    public void mo16541b(YandexMetricaConfig yandexMetricaConfig, C10725i iVar) {
        m8228g().mo16659a(yandexMetricaConfig, iVar);
    }

    /* renamed from: c */
    public String mo16543c() {
        return m8228g().mo16660c();
    }

    /* renamed from: b */
    public void mo16540b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m8228g().mo16655a(appMetricaDeviceIDListener);
    }

    /* renamed from: b */
    public C2325N0 mo16376b() {
        return m8228g().mo16376b();
    }

    /* renamed from: a */
    public static void m8219a(Location location) {
        m8227f().mo16697a(location);
    }

    /* renamed from: a */
    public static void m8222a(boolean z) {
        m8227f().mo16699b(z);
    }

    /* renamed from: a */
    public static void m8221a(String str, String str2) {
        m8227f().mo16700c(str, str2);
    }

    /* renamed from: a */
    public static void m8220a(String str) {
        m8227f().setUserProfileID(str);
    }

    /* renamed from: a */
    public void mo16537a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m8228g().mo16657a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo16536a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m8228g().mo16656a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public C2291M0 mo16534a(C10720e eVar) {
        return m8228g().mo16653a(eVar);
    }

    /* renamed from: a */
    public String mo16535a() {
        return m8228g().mo16654a();
    }

    /* renamed from: a */
    public void mo16538a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        m8228g().mo16658a(iIdentifierCallback, list);
    }

    /* renamed from: a */
    public void mo16539a(Map<String, Object> map) {
        this.f6548d.mo16442a(map);
    }

    /* renamed from: a */
    static C2540T0 m8218a(C2470R2 r2) {
        return r2.f6546b.mo16509a(r2.f6545a, r2.f6548d);
    }
}
