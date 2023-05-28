package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* renamed from: com.applovin.exoplayer2.t */
public final class C7833t {
    @Deprecated

    /* renamed from: a */
    public static final String f18680a = ("ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.15.1");

    /* renamed from: b */
    private static final HashSet<String> f18681b = new HashSet<>();

    /* renamed from: c */
    private static String f18682c = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m22961a() {
        String str;
        synchronized (C7833t.class) {
            str = f18682c;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m22962a(String str) {
        synchronized (C7833t.class) {
            if (f18681b.add(str)) {
                f18682c += ", " + str;
            }
        }
    }
}
