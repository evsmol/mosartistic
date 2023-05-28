package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.yandex.metrica.impl.ob.mn */
public class C3241mn {
    /* renamed from: a */
    public ApplicationInfo mo17878a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public PackageInfo mo17880b(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo17879a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
