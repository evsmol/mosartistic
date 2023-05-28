package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.r */
public class C3424r {

    /* renamed from: a */
    private final WeakHashMap<Activity, C3425a> f8954a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.r$a */
    public enum C3425a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    /* renamed from: a */
    public boolean mo18141a(Activity activity, C3425a aVar) {
        if (activity != null && this.f8954a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f8954a.put(activity, aVar);
        return true;
    }
}
