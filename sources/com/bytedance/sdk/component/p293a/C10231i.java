package com.bytedance.sdk.component.p293a;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.a.i */
/* compiled from: DebugUtil */
class C10231i {

    /* renamed from: a */
    private static boolean f25265a;

    /* renamed from: a */
    static void m29378a(boolean z) {
        f25265a = z;
    }

    /* renamed from: a */
    static void m29376a(String str) {
        if (f25265a) {
            Log.i("JsBridge2", str);
        }
    }

    /* renamed from: b */
    static void m29379b(String str) {
        if (f25265a) {
            Log.w("JsBridge2", str);
        }
    }

    /* renamed from: a */
    static void m29377a(String str, Throwable th) {
        if (f25265a) {
            Log.w("JsBridge2", str, th);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    static void m29380b(String str, Throwable th) {
        if (f25265a) {
            Log.e("JsBridge2", str, th);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    static void m29375a(RuntimeException runtimeException) {
        if (f25265a) {
            throw runtimeException;
        }
    }
}
