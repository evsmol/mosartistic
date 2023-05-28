package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C2217K3;
import com.yandex.metrica.impl.p082ob.C2275Lg;
import com.yandex.metrica.impl.p082ob.C2823b6;
import com.yandex.metrica.impl.p082ob.C3460s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.L3 */
public class C2259L3 implements C2275Lg.C2279d, C2416P3, C2507S3, C3347pb {

    /* renamed from: a */
    private final Context f6011a;

    /* renamed from: b */
    private final C2108I3 f6012b;

    /* renamed from: c */
    private final C2861c9 f6013c;

    /* renamed from: d */
    private final C2917e9 f6014d;

    /* renamed from: e */
    private final C2798a9 f6015e;

    /* renamed from: f */
    private final C2503S1 f6016f;

    /* renamed from: g */
    private final C2265L7 f6017g;

    /* renamed from: h */
    private final C2261L4 f6018h;

    /* renamed from: i */
    private final C2109I4 f6019i;

    /* renamed from: j */
    private final C3460s f6020j;

    /* renamed from: k */
    private final C1880B3 f6021k;

    /* renamed from: l */
    private final C2823b6 f6022l;

    /* renamed from: m */
    private final C2757Z3 f6023m;

    /* renamed from: n */
    private final C2299M5 f6024n;

    /* renamed from: o */
    private final C2875cm f6025o;

    /* renamed from: p */
    private final C2537Sl f6026p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C2791a4 f6027q;

    /* renamed from: r */
    private final C2217K3.C2219b f6028r;

    /* renamed from: s */
    private final C3315ob f6029s;

    /* renamed from: t */
    private final C3154lb f6030t;

    /* renamed from: u */
    private final C3394qb f6031u;

    /* renamed from: v */
    private final C2070H f6032v;

    /* renamed from: w */
    private final C3641x2 f6033w;

    /* renamed from: x */
    private final C2106I1 f6034x = C2007F0.m7154g().mo15748k();

    /* renamed from: y */
    private final C2827b8 f6035y;

    /* renamed from: z */
    private final C3020h6 f6036z;

    /* renamed from: com.yandex.metrica.impl.ob.L3$a */
    class C2260a implements C2823b6.C2824a {
        C2260a() {
        }

        /* renamed from: a */
        public void mo16147a(C2851c0 c0Var, C2858c6 c6Var) {
            C2259L3.this.f6027q.mo17144a(c0Var, c6Var);
        }
    }

    C2259L3(Context context, C2108I3 i3, C1880B3 b3, C3641x2 x2Var, C2294M3 m3) {
        this.f6011a = context.getApplicationContext();
        this.f6012b = i3;
        this.f6021k = b3;
        this.f6033w = x2Var;
        C2827b8 e = m3.mo16255e();
        this.f6035y = e;
        C2757Z3 a = m3.mo16242a(this);
        this.f6023m = a;
        C2875cm b = m3.mo16251c().mo16257b();
        this.f6025o = b;
        C2537Sl a2 = m3.mo16251c().mo16256a();
        this.f6026p = a2;
        C2861c9 a3 = m3.mo16253d().mo16258a();
        this.f6013c = a3;
        this.f6015e = m3.mo16253d().mo16259b();
        this.f6014d = C2007F0.m7154g().mo15756s();
        C3460s a4 = b3.mo15531a(i3, b, a3);
        this.f6020j = a4;
        this.f6024n = m3.mo16241a();
        C2265L7 b2 = m3.mo16248b(this);
        this.f6017g = b2;
        C2503S1<C2259L3> e2 = m3.mo16254e(this);
        this.f6016f = e2;
        this.f6028r = m3.mo16252d(this);
        C3394qb a5 = m3.mo16247a(b2, a);
        this.f6031u = a5;
        C3154lb a6 = m3.mo16245a(b2);
        this.f6030t = a6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a5);
        arrayList.add(a6);
        this.f6029s = m3.mo16246a((List<C3207mb>) arrayList, (C3347pb) this);
        m7715z();
        C2823b6 a7 = m3.mo16244a(this, e, new C2260a());
        this.f6022l = a7;
        if (a2.isEnabled()) {
            a2.mo15265fi("Read app environment for component %s. Value: %s", i3.toString(), a4.mo18188a().f9083a);
        }
        C3020h6 b4 = m3.mo16249b();
        this.f6036z = b4;
        this.f6027q = m3.mo16243a(a3, e, a7, b2, a4, b4, e2);
        C2109I4 c = m3.mo16250c(this);
        this.f6019i = c;
        this.f6018h = m3.mo16240a(this, c);
        this.f6032v = m3.mo16239a(a3);
        b2.mo16163e();
    }

    /* renamed from: z */
    private void m7715z() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer j = this.f6013c.mo17399j();
        if (j == null) {
            j = Integer.valueOf(this.f6035y.mo17226c());
        }
        if (j.intValue() < libraryApiLevel) {
            this.f6028r.mo16064a(new C2118Id(new C2186Jd(this.f6011a, this.f6012b.mo15878a()))).mo16063a();
            this.f6035y.mo17224b(libraryApiLevel);
        }
    }

    /* renamed from: A */
    public boolean mo16112A() {
        C2275Lg m = mo16135m();
        return m.mo16201R() && m.mo15722x() && this.f6033w.mo18390b(this.f6027q.mo17142a(), m.mo16194K(), "need to check permissions");
    }

    /* renamed from: B */
    public boolean mo16113B() {
        return this.f6027q.mo17150d() && mo16135m().mo15722x();
    }

    /* renamed from: C */
    public boolean mo16114C() {
        return this.f6027q.mo17148c() && mo16135m().mo16198O() && mo16135m().mo15722x();
    }

    /* renamed from: D */
    public void mo16115D() {
        this.f6023m.mo15831e();
    }

    /* renamed from: E */
    public boolean mo16116E() {
        C2275Lg m = mo16135m();
        return m.mo16201R() && this.f6033w.mo18390b(this.f6027q.mo17142a(), m.mo16195L(), "should force send permissions");
    }

    /* renamed from: F */
    public boolean mo16117F() {
        return !(((C2923ee) this.f6034x.mo18144b()).f7754d && this.f6023m.mo15830d().mo17960N());
    }

    /* renamed from: G */
    public void mo16118G() {
    }

    /* renamed from: a */
    public synchronized void mo15770a(C3004gi giVar, C3356pi piVar) {
    }

    /* renamed from: b */
    public void mo16123b(C2851c0 c0Var) {
        boolean z;
        this.f6020j.mo18189a(c0Var.mo17329b());
        C3460s.C3461a a = this.f6020j.mo18188a();
        C1880B3 b3 = this.f6021k;
        C2861c9 c9Var = this.f6013c;
        synchronized (b3) {
            if (a.f9084b > c9Var.mo17391f().f9084b) {
                c9Var.mo17384a(a).mo17448d();
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.f6025o.isEnabled()) {
            this.f6025o.mo15265fi("Save new app environment for %s. Value: %s", this.f6012b, a.f9083a);
        }
    }

    /* renamed from: c */
    public synchronized void mo16125c() {
        this.f6016f.mo18354d();
    }

    /* renamed from: d */
    public C2070H mo16126d() {
        return this.f6032v;
    }

    /* renamed from: e */
    public C2108I3 mo16127e() {
        return this.f6012b;
    }

    /* renamed from: f */
    public C2861c9 mo16128f() {
        return this.f6013c;
    }

    /* renamed from: g */
    public Context mo16129g() {
        return this.f6011a;
    }

    /* renamed from: h */
    public String mo16130h() {
        return this.f6013c.mo17403n();
    }

    /* renamed from: i */
    public C2265L7 mo16131i() {
        return this.f6017g;
    }

    /* renamed from: j */
    public C2299M5 mo16132j() {
        return this.f6024n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C2109I4 mo16133k() {
        return this.f6019i;
    }

    /* renamed from: l */
    public C3315ob mo16134l() {
        return this.f6029s;
    }

    /* renamed from: m */
    public C2275Lg mo16135m() {
        return (C2275Lg) this.f6023m.mo15828b();
    }

    @Deprecated
    /* renamed from: n */
    public final C2186Jd mo16136n() {
        return new C2186Jd(this.f6011a, this.f6012b.mo15878a());
    }

    /* renamed from: o */
    public C2798a9 mo16137o() {
        return this.f6015e;
    }

    /* renamed from: p */
    public String mo16138p() {
        return this.f6013c.mo17402m();
    }

    /* renamed from: q */
    public C2875cm mo16139q() {
        return this.f6025o;
    }

    /* renamed from: r */
    public C2791a4 mo16140r() {
        return this.f6027q;
    }

    /* renamed from: s */
    public CounterConfiguration.C10685b mo15581s() {
        return CounterConfiguration.C10685b.MANUAL;
    }

    /* renamed from: t */
    public C2917e9 mo16141t() {
        return this.f6014d;
    }

    /* renamed from: u */
    public C3020h6 mo16142u() {
        return this.f6036z;
    }

    /* renamed from: v */
    public C2823b6 mo16143v() {
        return this.f6022l;
    }

    /* renamed from: w */
    public C3356pi mo16144w() {
        return this.f6023m.mo15830d();
    }

    /* renamed from: x */
    public C2827b8 mo16145x() {
        return this.f6035y;
    }

    /* renamed from: y */
    public void mo16146y() {
        this.f6027q.mo17145b();
    }

    /* renamed from: a */
    public void mo16120a(C2851c0 c0Var) {
        if (this.f6025o.isEnabled()) {
            C2875cm cmVar = this.f6025o;
            cmVar.getClass();
            if (C3716z0.m11114c(c0Var.mo17346o())) {
                StringBuilder sb = new StringBuilder("Event received on service");
                sb.append(": ");
                sb.append(c0Var.mo17338g());
                if (C3716z0.m11116e(c0Var.mo17346o()) && !TextUtils.isEmpty(c0Var.mo17348q())) {
                    sb.append(" with value ");
                    sb.append(c0Var.mo17348q());
                }
                cmVar.mo15273i(sb.toString());
            }
        }
        String a = this.f6012b.mo15878a();
        if (!TextUtils.isEmpty(a) && !"-1".equals(a)) {
            this.f6018h.mo16148a(c0Var);
        }
    }

    /* renamed from: b */
    public void mo16122b() {
        this.f6020j.mo18190b();
        C1880B3 b3 = this.f6021k;
        C3460s.C3461a a = this.f6020j.mo18188a();
        C2861c9 c9Var = this.f6013c;
        synchronized (b3) {
            c9Var.mo17384a(a).mo17448d();
        }
    }

    /* renamed from: b */
    public void mo16124b(String str) {
        this.f6013c.mo17397i(str).mo17448d();
    }

    /* renamed from: a */
    public synchronized void mo16119a(C1941D3.C1942a aVar) {
        C2757Z3 z3 = this.f6023m;
        synchronized (z3) {
            z3.mo15827a(aVar);
        }
        if (Boolean.TRUE.equals(aVar.f5212k)) {
            this.f6025o.setEnabled();
        } else {
            if (Boolean.FALSE.equals(aVar.f5212k)) {
                this.f6025o.setDisabled();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo15772a(C3356pi piVar) {
        this.f6023m.mo15826a(piVar);
        this.f6017g.mo16161b(piVar);
        this.f6029s.mo17915c();
    }

    /* renamed from: a */
    public void mo16121a(String str) {
        this.f6013c.mo17398j(str).mo17448d();
    }
}
