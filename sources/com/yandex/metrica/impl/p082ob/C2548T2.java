package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.T2 */
public class C2548T2 implements C2540T0 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f6760n;

    /* renamed from: a */
    private final Context f6761a;

    /* renamed from: b */
    private final C2830b9 f6762b;

    /* renamed from: c */
    private final C3035hi f6763c;

    /* renamed from: d */
    private final C2837bg f6764d;

    /* renamed from: e */
    private final C1850A3 f6765e;

    /* renamed from: f */
    private final C2469R1 f6766f;

    /* renamed from: g */
    private final C2541T1 f6767g;

    /* renamed from: h */
    private final C3138l0 f6768h;

    /* renamed from: i */
    private final C3533ua f6769i;

    /* renamed from: j */
    private final C3520u f6770j;

    /* renamed from: k */
    private final C3302o2 f6771k;

    /* renamed from: l */
    private volatile C3110k1 f6772l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public IIdentifierCallback f6773m;

    /* renamed from: com.yandex.metrica.impl.ob.T2$a */
    class C2549a implements IIdentifierCallback {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f6774a;

        C2549a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f6774a = appMetricaDeviceIDListener;
        }

        public void onReceive(Map<String, String> map) {
            IIdentifierCallback unused = C2548T2.this.f6773m = null;
            this.f6774a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
            IIdentifierCallback unused = C2548T2.this.f6773m = null;
            this.f6774a.onError((AppMetricaDeviceIDListener.Reason) C2548T2.f6760n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        f6760n = enumMap;
        enumMap.put(IIdentifierCallback.Reason.UNKNOWN, AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put(IIdentifierCallback.Reason.INVALID_RESPONSE, AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put(IIdentifierCallback.Reason.NETWORK, AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    C2548T2(Context context, C2502S0 s0) {
        this(context.getApplicationContext(), s0, new C2830b9(C3093ja.m9805a(context.getApplicationContext()).mo17741c()));
    }

    /* renamed from: b */
    public C2325N0 mo16376b() {
        return this.f6766f;
    }

    /* renamed from: c */
    public void mo16661c(C10720e eVar) {
        this.f6766f.mo16533c(eVar);
    }

    /* renamed from: d */
    public C3110k1 mo16662d() {
        return this.f6772l;
    }

    public void setStatisticsSending(boolean z) {
        this.f6772l.mo17772b().setStatisticsSending(z);
    }

    public void setUserProfileID(String str) {
        this.f6772l.mo17772b().setUserProfileID(str);
    }

    /* renamed from: a */
    public void mo16659a(YandexMetricaConfig yandexMetricaConfig, C10725i iVar) {
        this.f6769i.mo18253a(this.f6761a, this.f6763c).mo18230a(yandexMetricaConfig, this.f6763c.mo17677c());
        C2875cm b = C2642Ul.m8746b(iVar.apiKey);
        C2537Sl a = C2642Ul.m8744a(iVar.apiKey);
        this.f6768h.getClass();
        if (this.f6772l == null) {
            this.f6764d.mo17304a();
            this.f6763c.mo17670a(b);
            this.f6763c.mo17673a(iVar.f26872d);
            this.f6763c.mo17674a(iVar.f26870b);
            this.f6763c.mo17672a(iVar.f26871c);
            if (C1848A2.m6809a((Object) iVar.f26871c)) {
                this.f6763c.mo17676b("api");
            }
            this.f6765e.mo15424b(iVar);
            this.f6767g.mo16676a(iVar.locationTracking, iVar.statisticsSending, (Boolean) null);
            C3072j1 a2 = this.f6766f.mo16532a(iVar, false, this.f6762b);
            this.f6772l = new C3110k1(a2, new C3071j0(a2));
            this.f6770j.mo18245a(this.f6772l.mo17771a());
            this.f6771k.mo17906a(a2);
            this.f6763c.mo17680g();
            Log.i("AppMetrica", "Activate AppMetrica with APIKey " + C1848A2.m6797a(iVar.apiKey));
            if (Boolean.TRUE.equals(iVar.logs)) {
                b.setEnabled();
                a.setEnabled();
                C2875cm.m9327a().setEnabled();
                C2537Sl.m8401a().setEnabled();
                return;
            }
            b.setDisabled();
            a.setDisabled();
            C2875cm.m9327a().setDisabled();
            C2537Sl.m8401a().setDisabled();
        } else if (b.isEnabled()) {
            b.mo15283w("Appmetrica already has been activated!");
        }
    }

    /* renamed from: b */
    public void mo16699b(boolean z) {
        this.f6772l.mo17772b().mo16699b(z);
    }

    /* renamed from: c */
    public String mo16660c() {
        return this.f6763c.mo17675b();
    }

    /* renamed from: c */
    public void mo16700c(String str, String str2) {
        this.f6772l.mo17772b().mo16700c(str, str2);
    }

    private C2548T2(Context context, C2502S0 s0, C2830b9 b9Var) {
        this(context, s0, b9Var, new C2354O(context), new C2587U2(), C2410P.m8089g(), new C3533ua());
    }

    C2548T2(Context context, C2502S0 s0, C2830b9 b9Var, C2354O o, C2587U2 u2, C2410P p, C3533ua uaVar) {
        this.f6761a = context;
        this.f6762b = b9Var;
        Handler c = s0.mo16444c();
        C1850A3 a = u2.mo16753a(context, u2.mo16757a(c, this));
        this.f6765e = a;
        C3138l0 f = p.mo16433f();
        this.f6768h = f;
        C2541T1 a2 = u2.mo16755a(a, context, s0.mo16443b());
        this.f6767g = a2;
        f.mo17791a(a2);
        o.mo15600a(context);
        C3035hi a3 = u2.mo16758a(context, a2, b9Var, c);
        this.f6763c = a3;
        this.f6770j = s0.mo16440a();
        this.f6769i = uaVar;
        a2.mo16674a((C3102ji) a3);
        this.f6764d = u2.mo16756a(a2, b9Var, c);
        this.f6766f = u2.mo16754a(context, a, a2, c, a3);
        this.f6771k = p.mo16438l();
    }

    /* renamed from: a */
    public void mo16696a(int i, Bundle bundle) {
        this.f6763c.mo17668a(bundle, (C2746Yh) null);
    }

    /* renamed from: a */
    public void mo16657a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f6764d.mo17306a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo16656a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f6764d.mo17305a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void mo16655a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C2549a aVar = new C2549a(appMetricaDeviceIDListener);
        this.f6773m = aVar;
        this.f6763c.mo17669a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f6765e.mo15419a());
    }

    /* renamed from: a */
    public C2291M0 mo16653a(C10720e eVar) {
        return this.f6766f.mo16329b(eVar);
    }

    /* renamed from: a */
    public String mo16654a() {
        return this.f6763c.mo17679e();
    }

    /* renamed from: a */
    public void mo16658a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f6763c.mo17669a(iIdentifierCallback, list, this.f6765e.mo15419a());
    }

    /* renamed from: a */
    public void mo16697a(Location location) {
        this.f6772l.mo17772b().mo16697a(location);
    }

    /* renamed from: a */
    public void mo16698a(boolean z) {
        this.f6772l.mo17772b().mo16698a(z);
    }
}
