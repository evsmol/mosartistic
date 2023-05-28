package com.iab.omid.library.amazon;

import android.content.Context;

public final class Omid {
    private static C4153b INSTANCE = new C4153b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo32333a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo32332a();
    }

    public static boolean isActive() {
        return INSTANCE.mo32335b();
    }
}
