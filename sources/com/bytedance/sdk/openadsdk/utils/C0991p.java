package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;

/* renamed from: com.bytedance.sdk.openadsdk.utils.p */
/* compiled from: SpAdUtile */
public class C0991p {
    /* renamed from: f */
    private static String m4595f() {
        return "sp_last_ad_show_cache_show_ad";
    }

    /* renamed from: e */
    private static Context m4594e() {
        return C0558m.m2663a();
    }

    /* renamed from: a */
    private static SharedPreferences m4588a(String str) {
        try {
            if (m4594e() != null) {
                return m4594e().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m4589a() {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4410b(m4595f(), "material_data", (String) null);
            }
            SharedPreferences a = m4588a(m4595f());
            if (a != null) {
                return a.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m4591b() {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4410b(m4595f(), "show_ad_tag", (String) null);
            }
            SharedPreferences a = m4588a(m4595f());
            if (a != null) {
                return a.getString("show_ad_tag", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static long m4592c() {
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4396a(m4595f(), "show_time", 0);
            }
            SharedPreferences a = m4588a(m4595f());
            if (a != null) {
                return a.getLong("show_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m4590a(String str, String str2) {
        try {
            if (C0934b.m4334c()) {
                C0947a.m4403a(m4595f(), "show_time", Long.valueOf(System.currentTimeMillis()));
                C0947a.m4404a(m4595f(), "material_data", str);
                C0947a.m4404a(m4595f(), "show_ad_tag", str2);
                return;
            }
            SharedPreferences a = m4588a(m4595f());
            if (a != null) {
                a.edit().putLong("show_time", System.currentTimeMillis()).putString("material_data", str).putString("show_ad_tag", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static void m4593d() {
        try {
            if (C0934b.m4334c()) {
                C0947a.m4398a(m4595f());
                return;
            }
            SharedPreferences a = m4588a(m4595f());
            if (a != null) {
                a.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }
}
