package com.bytedance.sdk.openadsdk.multipro;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c */
/* compiled from: ParamEncode */
public class C0937c {
    /* renamed from: a */
    public static String m4345a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }

    /* renamed from: b */
    public static String m4346b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }
}
