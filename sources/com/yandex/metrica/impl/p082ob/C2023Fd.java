package com.yandex.metrica.impl.p082ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Fd */
public class C2023Fd implements C3618wd {

    /* renamed from: a */
    private Set<String> f5410a;

    public C2023Fd(List<C1892Bd> list) {
        if (list == null) {
            this.f5410a = new HashSet();
            return;
        }
        this.f5410a = new HashSet(list.size());
        for (C1892Bd next : list) {
            if (next.f5116b) {
                this.f5410a.add(next.f5115a);
            }
        }
    }

    /* renamed from: a */
    public boolean mo15785a(String str) {
        return this.f5410a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f5410a + '}';
    }
}
