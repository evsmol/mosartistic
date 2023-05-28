package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.N1 */
class C2326N1 implements Runnable {

    /* renamed from: a */
    private final Context f6236a;

    /* renamed from: b */
    private final C2851c0 f6237b;

    /* renamed from: c */
    private final Bundle f6238c;

    /* renamed from: d */
    private final C3079j4 f6239d;

    C2326N1(Context context, C2851c0 c0Var, Bundle bundle, C3079j4 j4Var) {
        this.f6236a = context;
        this.f6237b = c0Var;
        this.f6238c = bundle;
        this.f6239d = j4Var;
    }

    public void run() {
        C3719z3 z3Var = new C3719z3(this.f6238c);
        if (!C3719z3.m11119a(z3Var, this.f6236a)) {
            C3049i4 a = C3049i4.m9730a(z3Var);
            C1941D3 d3 = new C1941D3(z3Var);
            this.f6239d.mo17728a(a, d3).mo17622a(this.f6237b, d3);
        }
    }
}
