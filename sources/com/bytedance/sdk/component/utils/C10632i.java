package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.utils.i */
/* compiled from: LanguageUtils */
public class C10632i {

    /* renamed from: a */
    private static Context f26518a;

    /* renamed from: a */
    public static void m31219a(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration b = m31220b(context, str, str2);
            if (Build.VERSION.SDK_INT >= 17) {
                f26518a = context.createConfigurationContext(b);
            }
        } catch (Throwable th) {
            C10638l.m31234b(th.getMessage());
        }
        C10647t.m31277a(f26518a);
    }

    /* renamed from: b */
    private static Configuration m31220b(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(new Locale(str, str2));
        }
        return configuration;
    }
}
