package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.p144g.C4936d;

public class Logger {

    /* renamed from: a */
    private static boolean f12736a;

    /* renamed from: d */
    public static void m14503d(String str, String str2) {
        if (f12736a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m14504d(String str, String str2, Throwable th) {
        if (f12736a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m14505e(String str, String str2) {
        if (f12736a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m14506e(String str, String str2, Throwable th) {
        if (f12736a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f12736a = C4936d.C4940d.MODE_0.f12673d != i;
    }

    /* renamed from: i */
    public static void m14507i(String str, String str2) {
        if (f12736a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m14508i(String str, String str2, Throwable th) {
        if (f12736a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m14509v(String str, String str2) {
        if (f12736a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m14510v(String str, String str2, Throwable th) {
        if (f12736a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m14511w(String str, String str2) {
        if (f12736a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m14512w(String str, String str2, Throwable th) {
        if (f12736a) {
            Log.w(str, str2, th);
        }
    }
}
