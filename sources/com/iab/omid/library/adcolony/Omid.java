package com.iab.omid.library.adcolony;

import android.content.Context;

public final class Omid {
    private static C4103b INSTANCE = new C4103b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo32134a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo32133a();
    }

    public static boolean isActive() {
        return INSTANCE.mo32136b();
    }
}
