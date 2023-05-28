package com.iab.omid.library.appodeal;

import android.content.Context;

public final class Omid {
    private static C4260b INSTANCE = new C4260b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo32740a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo32739a();
    }

    public static boolean isActive() {
        return INSTANCE.mo32742b();
    }
}
