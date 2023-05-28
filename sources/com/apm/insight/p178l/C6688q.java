package com.apm.insight.p178l;

import android.util.Log;
import com.apm.insight.C6617h;

/* renamed from: com.apm.insight.l.q */
public final class C6688q {
    /* renamed from: a */
    public static void m16625a(Object obj) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m16626a(String str) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    /* renamed from: a */
    public static void m16627a(String str, Object obj) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* renamed from: a */
    public static void m16628a(String str, Object obj, Throwable th) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }

    /* renamed from: a */
    public static void m16629a(String str, Throwable th) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.e("npth", str + " NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static void m16630a(Throwable th) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: b */
    public static void m16631b(Object obj) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m16632b(Throwable th) {
        if (C6617h.m16315i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }
}
