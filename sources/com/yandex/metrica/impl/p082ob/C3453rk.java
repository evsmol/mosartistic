package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.rk */
public class C3453rk {

    /* renamed from: a */
    private final Map<Float, Integer> f9046a = new HashMap();

    public C3453rk(TreeSet<Float> treeSet) {
        int i = 0;
        for (Float put : treeSet.descendingSet()) {
            this.f9046a.put(put, Integer.valueOf(i));
            i++;
        }
    }

    /* renamed from: a */
    public void mo18178a(C2845bl blVar) {
        blVar.f7509s = this.f9046a.get(blVar.f7503m);
    }
}
