package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.j */
/* compiled from: IdUtils */
public class C0517j {

    /* renamed from: a */
    private static String f1945a;

    /* renamed from: b */
    private static String f1946b;

    /* renamed from: c */
    private static String f1947c;

    /* renamed from: d */
    private static String f1948d;

    /* renamed from: e */
    private static boolean f1949e;

    /* renamed from: d */
    private static Context m2479d(Context context) {
        return context == null ? C0558m.m2663a() : context;
    }

    /* renamed from: a */
    public static String m2474a(Context context) {
        if (TextUtils.isEmpty(f1945a) && !f1949e) {
            synchronized (C0517j.class) {
                if (!f1949e) {
                    m2480e(context);
                }
            }
        }
        try {
            if (TextUtils.isEmpty(f1945a) && C0934b.m4334c()) {
                f1945a = C0434c.m1779a(m2479d(context)).mo1180b("did", (String) null);
            }
        } catch (Exception unused) {
        }
        return f1945a;
    }

    /* renamed from: b */
    public static String m2477b(Context context) {
        if (f1947c == null && !f1949e) {
            synchronized (C0517j.class) {
                if (!f1949e) {
                    m2480e(context);
                }
            }
        }
        return f1947c;
    }

    /* renamed from: c */
    public static String m2478c(Context context) {
        if (TextUtils.isEmpty(f1948d) && !f1949e) {
            synchronized (C0517j.class) {
                if (!f1949e) {
                    m2480e(context);
                }
            }
        }
        return f1948d;
    }

    /* renamed from: a */
    public static void m2475a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f1945a)) {
            C0434c.m1779a(context).mo1176a("did", str);
            f1945a = str;
        }
        if (!TextUtils.isEmpty(f1945a)) {
            C0624s.m3019a(f1945a);
        }
    }

    /* renamed from: e */
    private static void m2480e(Context context) {
        Context d;
        if (!f1949e && (d = m2479d(context)) != null) {
            f1945a = C0434c.m1779a(d).mo1180b("did", (String) null);
            f1946b = m2476b();
            f1947c = String.valueOf(Build.TIME);
            f1948d = C0434c.m1779a(d).mo1180b(Constants.UUID, (String) null);
            f1949e = true;
        }
    }

    /* renamed from: b */
    private static String m2476b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (C0985m.m4562e()) {
                sb.append("MIUI-");
            } else if (C0985m.m4557b()) {
                sb.append("FLYME-");
            } else {
                String n = C0985m.m4571n();
                if (C0985m.m4555a(n)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2473a() {
        Locale locale;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            if (locale != null) {
                str = locale.getLanguage();
            } else {
                str = "";
            }
            if (locale == null || !"zh".equals(str)) {
                return str;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
