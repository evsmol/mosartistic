package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.rtm.wrapper.C3776f;

/* renamed from: com.yandex.metrica.impl.ob.M1 */
class C2292M1 {

    /* renamed from: a */
    private final C3334p1 f6131a;

    /* renamed from: b */
    private final C3776f f6132b;

    C2292M1(C3334p1 p1Var, Context context) {
        this(p1Var, new C2772Zg().mo17114b(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16237a(int i, Bundle bundle) {
        if (i == 1) {
            this.f6131a.reportData(bundle);
        } else if (i == 2) {
            this.f6132b.reportData(bundle);
        }
    }

    C2292M1(C3334p1 p1Var, C3776f fVar) {
        this.f6131a = p1Var;
        this.f6132b = fVar;
    }
}
