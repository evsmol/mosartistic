package com.google.android.datatransport.runtime.logging;

import android.util.Log;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class Logging {
    private static String getTag(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: d */
    public static void m6662d(String str, String str2, Object obj) {
        Log.d(getTag(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: d */
    public static void m6663d(String str, String str2, Object... objArr) {
        Log.d(getTag(str), String.format(str2, objArr));
    }

    /* renamed from: i */
    public static void m6665i(String str, String str2) {
        Log.i(getTag(str), str2);
    }

    /* renamed from: e */
    public static void m6664e(String str, String str2, Throwable th) {
        Log.e(getTag(str), str2, th);
    }

    /* renamed from: w */
    public static void m6666w(String str, String str2, Object obj) {
        Log.w(getTag(str), String.format(str2, new Object[]{obj}));
    }
}
