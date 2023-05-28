package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Vk */
class C2669Vk {

    /* renamed from: a */
    private final C2406Ok f7061a;

    /* renamed from: b */
    private final C2749Yk f7062b;

    C2669Vk(C2406Ok ok, C2749Yk yk) {
        this.f7061a = ok;
        this.f7062b = yk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16981a(Activity activity, C3634wl wlVar) {
        String str;
        Bundle a = this.f7061a.mo16427a(activity);
        if (a == null) {
            str = null;
        } else {
            str = a.getString("yandex:ads:context");
        }
        return this.f7062b.mo15637a(str, wlVar);
    }
}
