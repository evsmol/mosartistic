package com.bytedance.sdk.openadsdk.multipro.p055d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.b */
/* compiled from: SPMultiHelperImpl */
class C0948b {

    /* renamed from: a */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f3262a;

    /* renamed from: c */
    private static SharedPreferences m4429c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(m4419a(str), 0);
    }

    /* renamed from: a */
    private static String m4419a(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    /* renamed from: a */
    private static Object m4417a(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f3262a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = (Map) concurrentHashMap.get(m4419a(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* renamed from: a */
    private static void m4422a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f3262a;
        if (softReference == null || softReference.get() == null) {
            f3262a = new SoftReference<>(new ConcurrentHashMap());
        }
        String a = m4419a(str);
        ConcurrentHashMap concurrentHashMap = f3262a.get();
        if (concurrentHashMap.get(a) == null) {
            concurrentHashMap.put(a, new HashMap());
        }
        ((Map) concurrentHashMap.get(a)).put(str2, obj);
    }

    /* renamed from: b */
    private static void m4428b(String str) {
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f3262a;
        if (softReference != null && softReference.get() != null && (map = (Map) f3262a.get().get(m4419a(str))) != null) {
            map.clear();
        }
    }

    /* renamed from: a */
    static synchronized <T> void m4421a(Context context, String str, String str2, T t) {
        synchronized (C0948b.class) {
            SharedPreferences c = m4429c(context, str);
            if (c != null) {
                if (!t.equals(m4417a(str, str2))) {
                    SharedPreferences.Editor edit = c.edit();
                    if (t instanceof Boolean) {
                        edit.putBoolean(str2, ((Boolean) t).booleanValue());
                    }
                    if (t instanceof String) {
                        edit.putString(str2, (String) t);
                    }
                    if (t instanceof Integer) {
                        edit.putInt(str2, ((Integer) t).intValue());
                    }
                    if (t instanceof Long) {
                        edit.putLong(str2, ((Long) t).longValue());
                    }
                    if (t instanceof Float) {
                        edit.putFloat(str2, ((Float) t).floatValue());
                    }
                    edit.apply();
                    m4422a(str, str2, (Object) t);
                }
            }
        }
    }

    /* renamed from: a */
    static String m4418a(Context context, String str, String str2, String str3) {
        Object a = m4417a(str, str2);
        if (a != null) {
            return a + "";
        }
        Object b = m4425b(context, str, str2, str3);
        m4422a(str, str2, b);
        return b + "";
    }

    /* renamed from: b */
    private static Object m4425b(Context context, String str, String str2, String str3) {
        String a = m4419a(str);
        if (!m4423a(context, a, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return m4430c(context, a, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(m4424a(context, a, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(m4415a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(m4416a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(m4414a(context, a, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return m4430c(context, a, str2, (String) null);
        }
        return null;
    }

    /* renamed from: c */
    private static String m4430c(Context context, String str, String str2, String str3) {
        SharedPreferences c = m4429c(context, str);
        if (c == null) {
            return str3;
        }
        return c.getString(str2, str3);
    }

    /* renamed from: a */
    private static int m4415a(Context context, String str, String str2, int i) {
        SharedPreferences c = m4429c(context, str);
        if (c == null) {
            return i;
        }
        return c.getInt(str2, i);
    }

    /* renamed from: a */
    private static float m4414a(Context context, String str, String str2, float f) {
        SharedPreferences c = m4429c(context, str);
        if (c == null) {
            return f;
        }
        return c.getFloat(str2, f);
    }

    /* renamed from: a */
    private static boolean m4424a(Context context, String str, String str2, boolean z) {
        SharedPreferences c = m4429c(context, str);
        if (c == null) {
            return z;
        }
        return c.getBoolean(str2, z);
    }

    /* renamed from: a */
    private static long m4416a(Context context, String str, String str2, long j) {
        SharedPreferences c = m4429c(context, str);
        if (c == null) {
            return j;
        }
        return c.getLong(str2, j);
    }

    /* renamed from: a */
    static boolean m4423a(Context context, String str, String str2) {
        SharedPreferences c = m4429c(context, str);
        return c != null && c.contains(str2);
    }

    /* renamed from: b */
    static void m4427b(Context context, String str, String str2) {
        try {
            SharedPreferences c = m4429c(context, str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.remove(str2);
                edit.apply();
                if (f3262a != null && f3262a.get() != null) {
                    Map map = (Map) f3262a.get().get(m4419a(str));
                    if (map == null) {
                        return;
                    }
                    if (map.size() != 0) {
                        map.remove(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static void m4420a(Context context, String str) {
        SharedPreferences.Editor edit = m4429c(context, str).edit();
        edit.clear();
        edit.apply();
        m4428b(str);
    }

    /* renamed from: b */
    static Map<String, ?> m4426b(Context context, String str) {
        return m4429c(context, str).getAll();
    }
}
