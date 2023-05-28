package com.bytedance.sdk.component.p293a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.y */
/* compiled from: SerializeHelper */
class C10258y {

    /* renamed from: a */
    private static boolean f25337a;

    /* renamed from: a */
    static String m29450a() {
        return "";
    }

    /* renamed from: a */
    static String m29452a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":");
        sb.append(th instanceof C10246s ? ((C10246s) th).f25305a : 0);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static String m29451a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f25337a ? str.substring(1, str.length() - 1) : "";
        String str2 = "{\"code\":1,\"__data\":" + str;
        if (!substring.isEmpty()) {
            return str2 + "," + substring + "}";
        }
        return str2 + "}";
    }

    /* renamed from: a */
    static void m29453a(boolean z) {
        f25337a = z;
    }
}
