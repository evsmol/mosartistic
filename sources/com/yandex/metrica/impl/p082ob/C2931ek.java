package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ek */
class C2931ek implements C2406Ok {

    /* renamed from: a */
    private final Bundle f7774a;

    C2931ek(Context context) {
        this(context, new C3241mn());
    }

    /* renamed from: a */
    public Bundle mo16427a(Activity activity) {
        return this.f7774a;
    }

    C2931ek(Context context, C3241mn mnVar) {
        ApplicationInfo a = mnVar.mo17878a(context, context.getPackageName(), 128);
        if (a != null) {
            this.f7774a = a.metaData;
        } else {
            this.f7774a = null;
        }
    }
}
