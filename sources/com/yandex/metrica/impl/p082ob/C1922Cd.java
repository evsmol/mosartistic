package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Build;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Cd */
public class C1922Cd {
    /* renamed from: a */
    public List<C1892Bd> mo15587a(Context context, List<C1892Bd> list) {
        C1863Ad ad;
        if (Build.VERSION.SDK_INT >= 16) {
            ad = new C1954Dd(context, new C3241mn());
        } else {
            ad = new C2059Gd(context, context.getPackageName(), new C3241mn());
        }
        List<C1892Bd> a = ad.mo15459a();
        if (C2814b.m9069a((Collection<?>) a, (Collection<?>) list)) {
            return null;
        }
        return a;
    }
}
