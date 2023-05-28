package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.C0558m;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.e */
/* compiled from: TTPathConst */
public class C0950e {

    /* renamed from: a */
    public static String f3264a = "com.bytedance.openadsdk";

    /* renamed from: b */
    public static String f3265b = ("content://" + f3264a + ".TTMultiProvider");

    static {
        m4439a();
    }

    /* renamed from: a */
    public static void m4439a() {
        if (C0558m.m2663a() != null) {
            f3264a = C0558m.m2663a().getPackageName();
            f3265b = "content://" + f3264a + ".TTMultiProvider";
        }
    }
}
