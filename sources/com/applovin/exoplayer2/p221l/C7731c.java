package com.applovin.exoplayer2.p221l;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.p183a.C7033s;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.l.c */
public final class C7731c {
    private C7731c() {
    }

    /* renamed from: a */
    public static <T extends C7397g> SparseArray<T> m22272a(C7397g.C7398a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), aVar.fromBundle(sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    /* renamed from: a */
    public static <T extends C7397g> C7033s<T> m22273a(C7397g.C7398a<T> aVar, List<Bundle> list) {
        C7033s.C7034a i = C7033s.m18804i();
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.mo53515a(aVar.fromBundle((Bundle) C7717a.m22120b(list.get(i2))));
        }
        return i.mo53531a();
    }

    /* renamed from: a */
    public static <T extends C7397g> T m22274a(C7397g.C7398a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.fromBundle(bundle);
    }

    /* renamed from: a */
    public static <T extends C7397g> List<T> m22275a(C7397g.C7398a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : m22273a(aVar, list);
    }

    /* renamed from: a */
    public static void m22276a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C7728ai.m22198a(C7731c.class.getClassLoader()));
        }
    }
}
