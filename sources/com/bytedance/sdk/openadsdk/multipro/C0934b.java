package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b */
/* compiled from: MultiGlobalInfo */
public class C0934b {

    /* renamed from: a */
    public static boolean f3244a;

    /* renamed from: b */
    public static boolean f3245b;

    /* renamed from: a */
    public static void m4332a() {
        C0947a.m4400a("sp_multi_info", "is_support_multi_process", (Boolean) true);
        f3244a = true;
        f3245b = true;
    }

    /* renamed from: b */
    public static void m4333b() {
        f3244a = false;
        f3245b = true;
    }

    /* renamed from: c */
    public static boolean m4334c() {
        if (!f3245b) {
            f3244a = C0947a.m4407a("sp_multi_info", "is_support_multi_process", false);
            f3245b = true;
        }
        return f3244a;
    }
}
