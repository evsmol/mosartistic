package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.metrica.C10720e;
import com.yandex.metrica.C10725i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.R1 */
public class C2469R1 implements C2325N0 {

    /* renamed from: a */
    private Context f6535a;

    /* renamed from: b */
    private C1850A3 f6536b;

    /* renamed from: c */
    private C2541T1 f6537c;

    /* renamed from: d */
    private Handler f6538d;

    /* renamed from: e */
    private C3035hi f6539e;

    /* renamed from: f */
    private Map<String, C2291M0> f6540f;

    /* renamed from: g */
    private final C2252Kn<String> f6541g;

    /* renamed from: h */
    private final List<String> f6542h = Arrays.asList(new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});

    public C2469R1(Context context, C1850A3 a3, C2541T1 t1, Handler handler, C3035hi hiVar) {
        HashMap hashMap = new HashMap();
        this.f6540f = hashMap;
        this.f6541g = new C2103Hn(new C2323Mn(hashMap));
        this.f6535a = context;
        this.f6536b = a3;
        this.f6537c = t1;
        this.f6538d = handler;
        this.f6539e = hiVar;
    }

    /* renamed from: a */
    public C3072j1 mo16532a(C10725i iVar, boolean z, C2830b9 b9Var) {
        C10725i iVar2 = iVar;
        this.f6541g.mo15517a(iVar2.apiKey);
        Context context = this.f6535a;
        C1850A3 a3 = this.f6536b;
        C10725i iVar3 = iVar;
        C3072j1 j1Var = new C3072j1(context, a3, iVar3, this.f6537c, new C3083j7(context, a3), this.f6539e, new C3681y2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3681y2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), b9Var, C2410P.m8089g(), new C1841A0(context));
        m8211a((C1874B) j1Var);
        if (z) {
            j1Var.f5070i.mo16690c(j1Var.f5063b);
        }
        Map<String, String> map = iVar2.f26876h;
        if (!C1848A2.m6815b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!TextUtils.isEmpty(str)) {
                    j1Var.f5070i.mo16679a(str, str2, j1Var.f5063b);
                } else if (j1Var.f5064c.isEnabled()) {
                    j1Var.f5064c.mo15270fw("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
                }
            }
        }
        j1Var.mo15484a(iVar2.errorEnvironment);
        j1Var.mo15496f();
        this.f6537c.mo16673a(j1Var);
        this.f6540f.put(iVar2.apiKey, j1Var);
        return j1Var;
    }

    /* renamed from: b */
    public synchronized C2291M0 mo16329b(C10720e eVar) {
        C3139l1 l1Var;
        C2291M0 m0 = this.f6540f.get(eVar.apiKey);
        l1Var = m0;
        if (m0 == null) {
            if (!this.f6542h.contains(eVar.apiKey)) {
                this.f6539e.mo17680g();
            }
            C3139l1 l1Var2 = new C3139l1(this.f6535a, this.f6536b, eVar, this.f6537c);
            m8211a((C1874B) l1Var2);
            l1Var2.mo15496f();
            this.f6540f.put(eVar.apiKey, l1Var2);
            l1Var = l1Var2;
        }
        return l1Var;
    }

    /* renamed from: b */
    public C2325N0 mo16376b() {
        return this;
    }

    /* renamed from: c */
    public synchronized void mo16533c(C10720e eVar) {
        if (this.f6540f.containsKey(eVar.apiKey)) {
            C2875cm b = C2642Ul.m8746b(eVar.apiKey);
            if (b.isEnabled()) {
                b.mo15270fw("Reporter with apiKey=%s already exists.", eVar.apiKey);
            }
        } else {
            mo16329b(eVar);
            Log.i("AppMetrica", "Activate reporter with APIKey " + C1848A2.m6797a(eVar.apiKey));
        }
    }

    /* renamed from: a */
    public synchronized C2468R0 mo16328a(C10725i iVar) {
        C2878d0 d0Var;
        C2291M0 m0 = this.f6540f.get(iVar.apiKey);
        d0Var = m0;
        if (m0 == null) {
            C2878d0 d0Var2 = new C2878d0(this.f6535a, this.f6536b, iVar, this.f6537c);
            m8211a((C1874B) d0Var2);
            d0Var2.mo15484a(iVar.errorEnvironment);
            d0Var2.mo15496f();
            d0Var = d0Var2;
        }
        return d0Var;
    }

    /* renamed from: a */
    private void m8211a(C1874B b) {
        b.mo15479a(new C2817b1(this.f6538d, b));
        b.f5063b.mo16501a((C3102ji) this.f6539e);
    }
}
