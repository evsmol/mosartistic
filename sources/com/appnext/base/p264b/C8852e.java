package com.appnext.base.p264b;

import android.content.Context;

/* renamed from: com.appnext.base.b.e */
public final class C8852e {

    /* renamed from: fr */
    private static Context f22437fr;

    private C8852e() {
    }

    public static void init(Context context) {
        if (context != null) {
            f22437fr = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("context shouldn't be null");
    }

    public static Context getContext() {
        return f22437fr;
    }

    public static String getPackageName() {
        return f22437fr.getPackageName();
    }
}
