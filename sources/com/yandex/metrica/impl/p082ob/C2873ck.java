package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ck */
class C2873ck implements C2406Ok {

    /* renamed from: a */
    private final C3241mn f7619a;

    C2873ck() {
        this(new C3241mn());
    }

    /* renamed from: a */
    public Bundle mo16427a(Activity activity) {
        ActivityInfo activityInfo;
        C3241mn mnVar = this.f7619a;
        ComponentName componentName = activity.getComponentName();
        mnVar.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    C2873ck(C3241mn mnVar) {
        this.f7619a = mnVar;
    }
}
