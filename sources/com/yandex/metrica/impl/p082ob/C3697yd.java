package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yd */
public class C3697yd {

    /* renamed from: a */
    private C3618wd f9514a;

    public C3697yd(C3618wd wdVar) {
        this.f9514a = wdVar;
    }

    /* renamed from: a */
    public void mo18423a(C3618wd wdVar) {
        this.f9514a = wdVar;
    }

    /* renamed from: b */
    public boolean mo18425b(Context context) {
        if (!this.f9514a.mo15785a("android.permission.READ_PHONE_STATE")) {
            return false;
        }
        return C3584vd.m10893a(context, "android.permission.READ_PHONE_STATE");
    }

    /* renamed from: c */
    public boolean mo18426c(Context context) {
        if (!this.f9514a.mo15785a("android.permission.ACCESS_WIFI_STATE")) {
            return false;
        }
        return C3584vd.m10893a(context, "android.permission.ACCESS_WIFI_STATE");
    }

    /* renamed from: a */
    public boolean mo18424a(Context context) {
        if (!this.f9514a.mo15785a("android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return C3584vd.m10893a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
