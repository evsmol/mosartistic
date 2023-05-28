package com.yandex.metrica.impl.p082ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.Ze */
public class C2770Ze {

    /* renamed from: a */
    private static SparseArray<String> f7270a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f7270a = sparseArray;
        sparseArray.put(0, "String");
        f7270a.put(1, "Number");
        f7270a.put(2, "Counter");
    }

    /* renamed from: a */
    static String m8962a(int i) {
        return f7270a.get(i);
    }
}
