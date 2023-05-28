package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10622b;

/* renamed from: com.bytedance.sdk.openadsdk.utils.k */
/* compiled from: OpenUtils */
public class C0983k {
    /* renamed from: a */
    public static void m4549a(Activity activity, String str) {
        if (m4552c(activity, str)) {
            C10622b.m31190a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)), (C10622b.C10623a) null);
        }
    }

    /* renamed from: b */
    public static boolean m4551b(Activity activity, String str) {
        if (!m4552c(activity, str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            activity.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m4552c(Activity activity, String str) {
        return m4550a(activity) && !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public static boolean m4550a(Activity activity) {
        return activity != null && !activity.isDestroyed() && !activity.isFinishing();
    }
}
