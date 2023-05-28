package com.iab.omid.library.applovin;

import android.content.Context;

public final class Omid {
    private static C4198b INSTANCE = new C4198b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.mo32527a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.mo32526a();
    }

    public static boolean isActive() {
        return INSTANCE.mo32529b();
    }

    public static void updateLastActivity() {
        INSTANCE.mo32530c();
    }
}
