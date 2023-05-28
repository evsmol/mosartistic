package com.iab.omid.library.ironsrc;

import android.content.Context;

public final class Omid {
    private static C4310b INSTANCE = new C4310b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo32934a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo32933a();
    }

    public static boolean isActive() {
        return INSTANCE.mo32936b();
    }
}
