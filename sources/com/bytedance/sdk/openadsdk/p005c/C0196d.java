package com.bytedance.sdk.openadsdk.p005c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.openadsdk.utils.C0994s;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.c.d */
/* compiled from: NetHook */
public final class C0196d extends C0193a {

    /* renamed from: a */
    public static C0195c f676a;

    /* renamed from: a */
    public String mo519a() {
        return "net";
    }

    /* renamed from: a */
    public static String m815a(C10581c cVar, String str) {
        C0195c a;
        if (!C0994s.m4606c() || (a = C0194b.m813a("net")) == null) {
            return str;
        }
        Map map = (Map) a.mo518a(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                cVar.mo64179b(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
