package com.bytedance.sdk.openadsdk.multipro.p055d;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.C0950e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0909g;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.a */
/* compiled from: SPMultiHelper */
public class C0947a {

    /* renamed from: a */
    private static Context f3261a;

    /* renamed from: a */
    public static boolean m4406a() {
        if (f3261a != null && C0558m.m2663a() != null) {
            return true;
        }
        C10638l.m31234b("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    /* renamed from: b */
    private static IListenerManager m4408b() {
        try {
            if (!m4406a()) {
                return null;
            }
            if (!C0934b.m4334c()) {
                return C0909g.m4316a();
            }
            return C0895a.m4283a(C0558m.m2663a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m4397a(Context context) {
        f3261a = context == null ? C0558m.m2663a() : context.getApplicationContext();
    }

    /* renamed from: c */
    private static String m4413c() {
        return C0950e.f3265b + "/" + "t_sp" + "/";
    }

    /* renamed from: b */
    private static String m4409b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    /* renamed from: a */
    public static synchronized void m4400a(String str, String str2, Boolean bool) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "boolean" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4399a(String str, String str2) {
        synchronized (C0947a.class) {
            m4404a((String) null, str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m4404a(String str, String str2, String str3) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "string" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4402a(String str, String str2, Integer num) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "int" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4403a(String str, String str2, Long l) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "long" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4401a(String str, String str2, Float f) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "float" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4405a(String str, String str2, Set<String> set) {
        synchronized (C0947a.class) {
            if (m4406a()) {
                try {
                    IListenerManager b = m4408b();
                    if (b != null) {
                        Uri parse = Uri.parse(m4413c() + "string_set" + "/" + str2 + m4409b(str));
                        ContentValues contentValues = new ContentValues();
                        HashSet hashSet = new HashSet();
                        for (String replace : set) {
                            hashSet.add(replace.replace(",", "__COMMA__"));
                        }
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, hashSet.toString());
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static String m4410b(String str, String str2, String str3) {
        if (!m4406a()) {
            return str3;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "string" + "/" + str2 + m4409b(str)));
                return (type == null || type.equals("null")) ? str3 : type;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static int m4395a(String str, String str2, int i) {
        if (!m4406a()) {
            return i;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "int" + "/" + str2 + m4409b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Integer.parseInt(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: a */
    public static float m4394a(String str, String str2, float f) {
        if (!m4406a()) {
            return f;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "float" + "/" + str2 + m4409b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Float.parseFloat(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return f;
    }

    /* renamed from: a */
    public static boolean m4407a(String str, String str2, boolean z) {
        if (!m4406a()) {
            return z;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "boolean" + "/" + str2 + m4409b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Boolean.parseBoolean(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* renamed from: a */
    public static long m4396a(String str, String str2, long j) {
        if (!m4406a()) {
            return j;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "long" + "/" + str2 + m4409b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Long.parseLong(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    /* renamed from: b */
    public static Set<String> m4411b(String str, String str2, Set<String> set) {
        if (!m4406a()) {
            return set;
        }
        try {
            IListenerManager b = m4408b();
            if (b != null) {
                String type = b.getType(Uri.parse(m4413c() + "string_set" + "/" + str2 + m4409b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        if (!type.matches("\\[.*\\]")) {
                            return set;
                        }
                        String[] split = type.substring(1, type.length() - 1).split(", ");
                        HashSet hashSet = new HashSet();
                        for (String replace : split) {
                            hashSet.add(replace.replace("__COMMA__", ", "));
                        }
                        return hashSet;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return set;
    }

    /* renamed from: b */
    public static void m4412b(String str, String str2) {
        if (m4406a()) {
            try {
                IListenerManager b = m4408b();
                if (b != null) {
                    b.delete(Uri.parse(m4413c() + "long" + "/" + str2 + m4409b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4398a(String str) {
        if (m4406a()) {
            try {
                IListenerManager b = m4408b();
                if (b != null) {
                    b.delete(Uri.parse(m4413c() + "clean" + m4409b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
