package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.Q1 */
public class C2445Q1 extends C3719z3 {

    /* renamed from: c */
    protected C3639x0 f6507c;

    /* renamed from: d */
    protected C3060ie f6508d;

    /* renamed from: e */
    private boolean f6509e;

    /* renamed from: f */
    private final String f6510f;

    protected C2445Q1(C1850A3 a3, CounterConfiguration counterConfiguration) {
        this(a3, counterConfiguration, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16499a(C2849bn bnVar) {
        this.f6507c = new C3639x0(bnVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle mo16502c() {
        Bundle bundle = new Bundle();
        CounterConfiguration b = mo18444b();
        synchronized (b) {
            bundle.putParcelable("COUNTER_CFG_OBJ", b);
        }
        C1850A3 a = mo18443a();
        synchronized (a) {
            bundle.putParcelable("PROCESS_CFG_OBJ", a);
        }
        return bundle;
    }

    /* renamed from: d */
    public String mo16503d() {
        return this.f6507c.mo18387a();
    }

    /* renamed from: e */
    public String mo16504e() {
        return this.f6510f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo16505f() {
        return this.f6509e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16506g() {
        this.f6509e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo16507h() {
        this.f6509e = false;
    }

    protected C2445Q1(C1850A3 a3, CounterConfiguration counterConfiguration, String str) {
        super(a3, counterConfiguration);
        this.f6509e = true;
        this.f6510f = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16501a(C3102ji jiVar) {
        if (jiVar != null) {
            mo18444b().mo64617d(((C3035hi) jiVar).mo17679e());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16500a(C3060ie ieVar) {
        this.f6508d = ieVar;
    }
}
