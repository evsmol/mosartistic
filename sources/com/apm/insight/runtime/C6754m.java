package com.apm.insight.runtime;

import com.apm.insight.C6617h;
import com.apm.insight.MonitorCrash;

/* renamed from: com.apm.insight.runtime.m */
public class C6754m {

    /* renamed from: a */
    private static MonitorCrash f14508a = null;

    /* renamed from: b */
    private static int f14509b = -1;

    /* renamed from: c */
    private static int f14510c;

    /* renamed from: a */
    public static MonitorCrash m16967a() {
        if (f14508a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(C6617h.m16313g(), "239017", 1030820, "1.3.8.nourl-alpha.0", "com.apm.insight");
            f14508a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f14508a;
    }

    /* renamed from: a */
    public static void m16968a(Throwable th, String str) {
        if (C6617h.m16313g() != null && m16969b()) {
            m16967a().reportCustomErr(str, "INNER", th);
        }
    }

    /* renamed from: b */
    private static boolean m16969b() {
        if (f14509b == -1) {
            f14509b = 5;
        }
        int i = f14510c;
        if (i >= f14509b) {
            return false;
        }
        f14510c = i + 1;
        return true;
    }
}
