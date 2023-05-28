package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jn */
public class C2212Jn implements C2252Kn<List<C2167In>> {
    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C2167In in : (List) obj) {
            if (!in.mo15965b()) {
                linkedList.add(in.mo15964a());
                z = false;
            }
        }
        if (z) {
            return C2167In.m7452a(this);
        }
        return C2167In.m7453a(this, TextUtils.join(", ", linkedList));
    }
}
