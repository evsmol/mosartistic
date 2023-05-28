package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.p021e.C0453e;

/* renamed from: com.bytedance.sdk.openadsdk.utils.b */
/* compiled from: AutoTestUtils */
public class C0959b {
    /* renamed from: a */
    public static String m4465a(String str) {
        if (!C10638l.m31240c() || TextUtils.isEmpty(str)) {
            return str;
        }
        C0453e eVar = new C0453e(C0503h.m2281d().mo1613n());
        StringBuilder sb = new StringBuilder(str);
        for (String contains : eVar.mo1231b()) {
            if (sb.toString().contains(contains)) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(eVar.mo1230a());
                } else {
                    sb.append("?");
                    sb.append(eVar.mo1230a());
                }
            }
        }
        return sb.toString();
    }
}
