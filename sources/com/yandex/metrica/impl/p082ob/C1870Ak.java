package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.yandex.metrica.impl.p082ob.C3454rl;

/* renamed from: com.yandex.metrica.impl.ob.Ak */
class C1870Ak {

    /* renamed from: a */
    private final C3066ik f5050a;

    /* renamed from: b */
    private final C3594vk f5051b;

    /* renamed from: c */
    private final int f5052c;

    C1870Ak(C3709yk<?> ykVar, int i) {
        this(ykVar, i, new C3066ik(ykVar.mo18435b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3454rl.C3456b mo15471a(String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C3454rl.C3456b> a = this.f5051b.mo18340a(this.f5052c, str);
        if (a != null) {
            return (C3454rl.C3456b) a.second;
        }
        C3454rl.C3456b a2 = this.f5050a.mo17716a(str);
        this.f5051b.mo18342a(this.f5052c, str, a2 != null, a2);
        return a2;
    }

    C1870Ak(C3709yk<?> ykVar, int i, C3066ik ikVar) {
        this.f5052c = i;
        this.f5050a = ikVar;
        this.f5051b = ykVar.mo18434a();
    }
}
