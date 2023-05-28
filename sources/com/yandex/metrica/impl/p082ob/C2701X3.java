package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C2416P3;
import com.yandex.metrica.impl.p082ob.C2507S3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X3 */
public class C2701X3<COMPONENT extends C2507S3 & C2416P3> implements C2472R3, C3131ki {

    /* renamed from: a */
    private final Context f7112a;

    /* renamed from: b */
    private final C2108I3 f7113b;

    /* renamed from: c */
    private final C3308o4<COMPONENT> f7114c;

    /* renamed from: d */
    private final C3450ri f7115d;

    /* renamed from: e */
    private final C2856c4 f7116e;

    /* renamed from: f */
    private COMPONENT f7117f;

    /* renamed from: g */
    private C2447Q3 f7118g;

    /* renamed from: h */
    private List<C3131ki> f7119h = new ArrayList();

    /* renamed from: i */
    private final C2176J3<C3116k4> f7120i;

    public C2701X3(Context context, C2108I3 i3, C1941D3 d3, C2856c4 c4Var, C3308o4<COMPONENT> o4Var, C2176J3<C3116k4> j3, C2927ei eiVar) {
        this.f7112a = context;
        this.f7113b = i3;
        this.f7116e = c4Var;
        this.f7114c = o4Var;
        this.f7120i = j3;
        this.f7115d = eiVar.mo17555a(context, i3, d3.f5199a);
        eiVar.mo17556a(i3, (C3131ki) this);
    }

    /* renamed from: a */
    public void mo17009a(C2851c0 c0Var, C1941D3 d3) {
        COMPONENT component;
        ((C3720z4) m8827a()).mo18446a();
        if (C3716z0.m11108a(c0Var.mo17346o())) {
            component = m8827a();
        } else {
            if (this.f7117f == null) {
                synchronized (this) {
                    COMPONENT a = this.f7114c.mo17649a(this.f7112a, this.f7113b, this.f7116e.mo17366a(), this.f7115d);
                    this.f7117f = a;
                    this.f7119h.add(a);
                }
            }
            component = this.f7117f;
        }
        if (!C3716z0.m11111b(c0Var.mo17346o())) {
            C1941D3.C1942a aVar = d3.f5200b;
            synchronized (this) {
                this.f7116e.mo17367a(aVar);
                C2447Q3 q3 = this.f7118g;
                if (q3 != null) {
                    ((C3720z4) q3).mo16119a(aVar);
                }
                COMPONENT component2 = this.f7117f;
                if (component2 != null) {
                    component2.mo16119a(aVar);
                }
            }
        }
        component.mo16120a(c0Var);
    }

    /* renamed from: b */
    public synchronized void mo17011b(C3116k4 k4Var) {
        this.f7120i.mo15978b(k4Var);
    }

    /* renamed from: a */
    public synchronized void mo17010a(C3116k4 k4Var) {
        this.f7120i.mo15977a(k4Var);
    }

    /* renamed from: a */
    private C2447Q3 m8827a() {
        if (this.f7118g == null) {
            synchronized (this) {
                C2447Q3 b = this.f7114c.mo17650b(this.f7112a, this.f7113b, this.f7116e.mo17366a(), this.f7115d);
                this.f7118g = b;
                this.f7119h.add(b);
            }
        }
        return this.f7118g;
    }

    /* renamed from: a */
    public synchronized void mo15772a(C3356pi piVar) {
        for (C3131ki a : this.f7119h) {
            a.mo15772a(piVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo15770a(C3004gi giVar, C3356pi piVar) {
        for (C3131ki a : this.f7119h) {
            a.mo15770a(giVar, piVar);
        }
    }

    /* renamed from: a */
    public void mo15767a(C1941D3 d3) {
        this.f7115d.mo18169a(d3.f5199a);
        C1941D3.C1942a aVar = d3.f5200b;
        synchronized (this) {
            this.f7116e.mo17367a(aVar);
            C2447Q3 q3 = this.f7118g;
            if (q3 != null) {
                ((C3720z4) q3).mo16119a(aVar);
            }
            COMPONENT component = this.f7117f;
            if (component != null) {
                component.mo16119a(aVar);
            }
        }
    }
}
