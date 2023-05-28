package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.google.protobuf.nano.p091ym.MessageNano;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p082ob.C2578U1;
import com.yandex.metrica.rtm.wrapper.C3781k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.T1 */
public class C2541T1 implements C2411P0 {

    /* renamed from: a */
    private final Context f6744a;

    /* renamed from: b */
    private C3298o1 f6745b;

    /* renamed from: c */
    private C3072j1 f6746c;

    /* renamed from: d */
    private final C2539T f6747d;

    /* renamed from: e */
    private C3102ji f6748e;

    /* renamed from: f */
    private final C2419P6 f6749f;

    /* renamed from: g */
    private final C3570v6 f6750g;

    /* renamed from: h */
    private final C2578U1 f6751h = new C2578U1(this);

    /* renamed from: com.yandex.metrica.impl.ob.T1$a */
    class C2542a implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ Map f6752a;

        /* renamed from: b */
        final /* synthetic */ C2445Q1 f6753b;

        C2542a(Map map, C2445Q1 q1) {
            this.f6752a = map;
            this.f6753b = q1;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            C2541T1 t1 = C2541T1.this;
            C2851c0 f = c0Var.mo15971f(C2572Tl.m8546g(this.f6752a));
            C2445Q1 q1 = this.f6753b;
            t1.getClass();
            if (C3716z0.m11117f(f.f7528e)) {
                f.mo17332c(q1.f6507c.mo18387a());
            }
            return f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$b */
    class C2543b implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ C3586vf f6755a;

        C2543b(C2541T1 t1, C3586vf vfVar) {
            this.f6755a = vfVar;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            return c0Var.mo15971f(new String(Base64.encode(MessageNano.toByteArray(this.f6755a), 0)));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$c */
    class C2544c implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ String f6756a;

        C2544c(C2541T1 t1, String str) {
            this.f6756a = str;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            return c0Var.mo15971f(this.f6756a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$d */
    class C2545d implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ C2675W1 f6757a;

        C2545d(C2541T1 t1, C2675W1 w1) {
            this.f6757a = w1;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            Pair<byte[], Integer> a = this.f6757a.mo16989a();
            C2851c0 f = c0Var.mo15971f(new String(Base64.encode((byte[]) a.first, 0)));
            f.f7531h = ((Integer) a.second).intValue();
            return f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$e */
    class C2546e implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ C2523Sg f6758a;

        C2546e(C2541T1 t1, C2523Sg sg) {
            this.f6758a = sg;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            kotlin.Pair<byte[], Integer> a = this.f6758a.mo16617a();
            C2851c0 f = c0Var.mo15971f(new String(Base64.encode(a.getFirst(), 0)));
            f.f7531h = a.getSecond().intValue();
            return f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$f */
    class C2547f implements C2578U1.C2583e {

        /* renamed from: a */
        final /* synthetic */ C2336Na f6759a;

        C2547f(C2541T1 t1, C2336Na na) {
            this.f6759a = na;
        }

        /* renamed from: a */
        public C2851c0 mo16695a(C2851c0 c0Var) {
            C2851c0 f = c0Var.mo15971f(C2254L0.m7687a(MessageNano.toByteArray((MessageNano) this.f6759a.f6259a)));
            f.f7531h = this.f6759a.f6260b.mo16355a();
            return f;
        }
    }

    C2541T1(C1850A3 a3, Context context, C3298o1 o1Var, C2419P6 p6, C3570v6 v6Var) {
        this.f6745b = o1Var;
        this.f6744a = context;
        this.f6747d = new C2539T(a3);
        this.f6749f = p6;
        this.f6750g = v6Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16673a(C3072j1 j1Var) {
        this.f6746c = j1Var;
    }

    /* renamed from: b */
    public void mo16686b(C2445Q1 q1) {
        C3060ie ieVar = q1.f6508d;
        String e = q1.mo16504e();
        C2875cm a = m8415a(q1);
        List<Integer> list = C3716z0.f9563i;
        JSONObject jSONObject = new JSONObject();
        if (ieVar != null) {
            ieVar.mo17713a(jSONObject);
        }
        mo16671a(new C2168J(jSONObject.toString(), "", C2788a1.EVENT_TYPE_ACTIVATION.mo17139b(), 0, a).mo15969d(e), q1);
    }

    /* renamed from: c */
    public void mo16690c(C2445Q1 q1) {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.mo17139b();
        m8416a(new C2578U1.C2584f(c0Var, q1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16691d() {
        this.f6745b.mo17900g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16692e() {
        this.f6745b.mo17899f();
    }

    /* renamed from: f */
    public void mo16693f() {
        this.f6745b.mo17893a();
    }

    /* renamed from: g */
    public void mo16694g() {
        this.f6745b.mo17896c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16674a(C3102ji jiVar) {
        this.f6748e = jiVar;
        this.f6747d.mo16501a(jiVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16676a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (C1848A2.m6809a((Object) bool)) {
            this.f6747d.mo18444b().mo64613b(bool.booleanValue());
        }
        if (C1848A2.m6809a((Object) bool2)) {
            this.f6747d.mo18444b().mo64615c(bool2.booleanValue());
        }
        if (C1848A2.m6809a((Object) bool3)) {
            this.f6747d.mo18444b().mo64610a(bool3.booleanValue());
        }
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.mo17139b();
        mo16671a(c0Var, (C2445Q1) this.f6747d);
    }

    /* renamed from: c */
    public C3298o1 mo16689c() {
        return this.f6745b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16678a(String str, C2445Q1 q1) {
        byte[] bArr;
        try {
            C2419P6 p6 = this.f6749f;
            if (str == null) {
                bArr = new byte[0];
            } else {
                bArr = str.getBytes("UTF-8");
            }
            mo16671a(C3716z0.m11113c(C2254L0.m7687a(MessageNano.toByteArray(p6.fromModel(new C2886d7(bArr, new C2859c7(C2987g7.USER, (String) null))))), m8415a(q1)), q1);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: a */
    public Future<Void> mo16665a(C2851c0 c0Var, C2445Q1 q1, Map<String, Object> map) {
        C2788a1 a1Var = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        this.f6745b.mo17899f();
        C2578U1.C2584f fVar = new C2578U1.C2584f(c0Var, q1);
        if (!C1848A2.m6815b((Map) map)) {
            fVar.mo16745a((C2578U1.C2583e) new C2542a(map, q1));
        }
        return m8416a(fVar);
    }

    /* renamed from: a */
    public Future<Void> mo16664a(C1850A3 a3) {
        return this.f6751h.queuePauseUserSession(a3);
    }

    /* renamed from: a */
    public void mo16681a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C2645V0(list, map, resultReceiver));
        C2788a1 a1Var = C2788a1.EVENT_TYPE_STARTUP;
        int i = C2642Ul.f7017e;
        C2875cm a = C2875cm.m9327a();
        List<Integer> list2 = C3716z0.f9563i;
        mo16671a(new C2168J("", "", a1Var.mo17139b(), 0, a).mo17331c(bundle), (C2445Q1) this.f6747d);
    }

    /* renamed from: a */
    public void mo16672a(C2925eg egVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", egVar);
        int i = C2642Ul.f7017e;
        C2875cm a = C2875cm.m9327a();
        List<Integer> list = C3716z0.f9563i;
        mo16671a(new C2168J("", "", C2788a1.EVENT_TYPE_REQUEST_REFERRER.mo17139b(), 0, a).mo17331c(bundle), (C2445Q1) this.f6747d);
    }

    /* renamed from: b */
    public Future<Void> mo16684b(C1850A3 a3) {
        return this.f6751h.queueResumeUserSession(a3);
    }

    /* renamed from: b */
    public void mo16687b(String str) {
        this.f6747d.mo18443a().mo15425b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16685b(C2085H6 h6, C2445Q1 q1) {
        this.f6745b.mo17899f();
        m8416a(this.f6750g.mo18322a(h6, q1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16688b(String str, C2445Q1 q1) {
        m8416a(new C2578U1.C2584f(C2168J.m7456a(str, m8415a(q1)), q1).mo16745a((C2578U1.C2583e) new C2544c(this, str)));
    }

    /* renamed from: b */
    public C3781k mo16683b() {
        return this.f6751h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16671a(C2851c0 c0Var, C2445Q1 q1) {
        if (C3716z0.m11117f(c0Var.f7528e)) {
            c0Var.mo17332c(q1.f6507c.mo18387a());
        }
        mo16665a(c0Var, q1, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void mo16680a(List<String> list) {
        this.f6747d.mo18443a().mo15421a(list);
    }

    /* renamed from: a */
    public void mo16682a(Map<String, String> map) {
        this.f6747d.mo18443a().mo15422a(map);
    }

    /* renamed from: a */
    public void mo16677a(String str) {
        this.f6747d.mo18443a().mo15420a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16667a(C2085H6 h6, C2445Q1 q1) {
        this.f6745b.mo17899f();
        C2578U1.C2584f a = this.f6750g.mo18322a(h6, q1);
        a.mo16744a().mo16501a(this.f6748e);
        this.f6751h.sendCrash(a);
    }

    /* renamed from: a */
    public void mo16679a(String str, String str2, C2445Q1 q1) {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.mo17139b();
        m8416a(new C2578U1.C2584f(c0Var.mo17326a(str, str2), q1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16675a(C3586vf vfVar, C2445Q1 q1) {
        C2851c0 c0Var = new C2851c0();
        c0Var.f7528e = C2788a1.EVENT_TYPE_SEND_USER_PROFILE.mo17139b();
        m8416a(new C2578U1.C2584f(c0Var, q1).mo16745a((C2578U1.C2583e) new C2543b(this, vfVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16669a(C2675W1 w1, C2445Q1 q1) {
        C2168J j = new C2168J(m8415a(q1));
        j.f7528e = C2788a1.EVENT_TYPE_SEND_REVENUE_EVENT.mo17139b();
        m8416a(new C2578U1.C2584f(j, q1).mo16745a((C2578U1.C2583e) new C2545d(this, w1)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16668a(C2523Sg sg, C2445Q1 q1) {
        C2168J j = new C2168J(m8415a(q1));
        j.f7528e = C2788a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT.mo17139b();
        m8416a(new C2578U1.C2584f(j, q1).mo16745a((C2578U1.C2583e) new C2546e(this, sg)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16670a(C2766Za za, C2445Q1 q1) {
        for (C2336Na<C3211mf, C2671Vm> fVar : za.toProto()) {
            C2168J j = new C2168J(m8415a(q1));
            j.f7528e = C2788a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.mo17139b();
            m8416a(new C2578U1.C2584f(j, q1).mo16745a((C2578U1.C2583e) new C2547f(this, fVar)));
        }
    }

    /* renamed from: a */
    public void mo16666a(IMetricaService iMetricaService, C2851c0 c0Var, C2445Q1 q1) throws RemoteException {
        iMetricaService.reportData(c0Var.mo17328b(q1.mo16502c()));
        C3072j1 j1Var = this.f6746c;
        if (j1Var == null || j1Var.f5063b.mo16505f()) {
            this.f6745b.mo17900g();
        }
    }

    /* renamed from: a */
    private Future<Void> m8416a(C2578U1.C2584f fVar) {
        fVar.mo16744a().mo16501a(this.f6748e);
        return this.f6751h.queueReport(fVar);
    }

    /* renamed from: a */
    public Context mo16663a() {
        return this.f6744a;
    }

    /* renamed from: a */
    private C2875cm m8415a(C2445Q1 q1) {
        return C2642Ul.m8746b(q1.mo18444b().mo64607a());
    }
}
