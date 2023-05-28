package com.yandex.metrica.impl.p082ob;

import android.util.SparseIntArray;

/* renamed from: com.yandex.metrica.impl.ob.sk */
public class C3485sk implements C2465Qk {

    /* renamed from: a */
    private final SparseIntArray f9115a = new SparseIntArray();

    /* renamed from: b */
    private final int f9116b;

    public C3485sk(int i) {
        this.f9116b = i;
    }

    /* renamed from: a */
    public void mo16529a(C3454rl rlVar) {
        SparseIntArray sparseIntArray = this.f9115a;
        int i = rlVar.f9050d;
        sparseIntArray.put(i, sparseIntArray.get(i) + 1);
    }

    /* renamed from: a */
    public int mo18219a(int i) {
        int i2 = this.f9116b;
        Integer valueOf = Integer.valueOf(this.f9115a.get(i));
        if (valueOf == null) {
            valueOf = 0;
        }
        return i2 - valueOf.intValue();
    }
}
