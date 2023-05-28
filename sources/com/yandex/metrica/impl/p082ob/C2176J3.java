package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3116k4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.J3 */
public class C2176J3<CU extends C3116k4> {

    /* renamed from: a */
    private final List<CU> f5830a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo15977a(CU cu) {
        this.f5830a.add(cu);
    }

    /* renamed from: b */
    public void mo15978b(CU cu) {
        this.f5830a.remove(cu);
    }

    /* renamed from: a */
    public List<CU> mo15976a() {
        return this.f5830a;
    }
}
