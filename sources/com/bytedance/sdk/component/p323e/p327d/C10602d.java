package com.bytedance.sdk.component.p323e.p327d;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.e.d.d */
/* compiled from: NLogger */
public class C10602d {

    /* renamed from: a */
    private static boolean f26458a = false;

    /* renamed from: b */
    private static int f26459b = 4;

    /* renamed from: a */
    public static void m31126a(String str) {
        m31127a("NetLog", str);
    }

    /* renamed from: a */
    public static void m31127a(String str, String str2) {
        if (f26458a && str2 != null && f26459b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: b */
    public static void m31128b(String str, String str2) {
        if (f26458a && str2 != null && f26459b <= 4) {
            Log.i(str, str2);
        }
    }
}
