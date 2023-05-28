package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.Cn */
public class C1934Cn implements Comparator<C2010F2> {
    public int compare(Object obj, Object obj2) {
        C2010F2 f2 = (C2010F2) obj;
        C2010F2 f22 = (C2010F2) obj2;
        return (TextUtils.equals(f2.f5384a, f22.f5384a) && TextUtils.equals(f2.f5385b, f22.f5385b)) ? 0 : 10;
    }
}
