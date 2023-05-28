package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1798a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.c */
public class C2850c implements C3137l {

    /* renamed from: a */
    private boolean f7521a;

    /* renamed from: b */
    private final C3242n f7522b;

    /* renamed from: c */
    private final Map<String, C1798a> f7523c = new HashMap();

    public C2850c(C3242n nVar) {
        C2855c3 c3Var = (C2855c3) nVar;
        for (C1798a next : c3Var.mo17363a()) {
            this.f7523c.put(next.f4910b, next);
        }
        this.f7521a = c3Var.mo17365b();
        this.f7522b = c3Var;
    }

    /* renamed from: a */
    public void mo17317a(Map<String, C1798a> map) {
        for (C1798a next : map.values()) {
            this.f7523c.put(next.f4910b, next);
        }
        ((C2855c3) this.f7522b).mo17364a(new ArrayList(this.f7523c.values()), this.f7521a);
    }

    /* renamed from: b */
    public void mo17319b() {
        if (!this.f7521a) {
            this.f7521a = true;
            ((C2855c3) this.f7522b).mo17364a(new ArrayList(this.f7523c.values()), this.f7521a);
        }
    }

    /* renamed from: a */
    public C1798a mo17316a(String str) {
        return this.f7523c.get(str);
    }

    /* renamed from: a */
    public boolean mo17318a() {
        return this.f7521a;
    }
}
