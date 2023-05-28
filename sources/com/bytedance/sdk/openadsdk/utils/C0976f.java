package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10648u;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;

/* renamed from: com.bytedance.sdk.openadsdk.utils.f */
/* compiled from: ExternalSpUtils */
public class C0976f {
    /* renamed from: a */
    public static void m4532a(String str) {
        m4533a("any_door_id", str);
    }

    /* renamed from: a */
    public static String m4531a() {
        return m4534b("any_door_id", (String) null);
    }

    /* renamed from: a */
    private static void m4533a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C0934b.m4334c()) {
                    C0947a.m4399a(str, str2);
                } else {
                    C10648u.m31293a("", C0558m.m2663a()).mo64275a(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static String m4534b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (C0934b.m4334c()) {
                return C0947a.m4410b((String) null, str, str2);
            }
            return C10648u.m31293a("", C0558m.m2663a()).mo64282b(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
