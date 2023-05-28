package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.yandex.metrica.impl.p082ob.C3454rl;

/* renamed from: com.yandex.metrica.impl.ob.vk */
class C3594vk {

    /* renamed from: a */
    private final C3362pm<C3633wk, Pair<Boolean, C3454rl.C3456b>> f9352a;

    /* renamed from: b */
    private final int f9353b;

    C3594vk(int i, int i2) {
        this.f9352a = new C3672xk(i);
        this.f9353b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18342a(int i, String str, boolean z, C3454rl.C3456b bVar) {
        if (str.length() <= this.f9353b) {
            this.f9352a.mo18049a(new C3633wk(i, str), new Pair(Boolean.valueOf(z), bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<Boolean, C3454rl.C3456b> mo18340a(int i, String str) {
        if (str.length() > this.f9353b) {
            return null;
        }
        return this.f9352a.mo18048a(new C3633wk(i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18341a() {
        this.f9352a.mo18050a();
    }
}
