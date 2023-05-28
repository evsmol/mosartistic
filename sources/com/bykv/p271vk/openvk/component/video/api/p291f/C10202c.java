package com.bykv.p271vk.openvk.component.video.api.p291f;

import android.util.Log;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.c */
/* compiled from: VLogger */
public class C10202c {

    /* renamed from: a */
    private static boolean f25215a = false;

    /* renamed from: b */
    private static int f25216b = 4;

    /* renamed from: a */
    public static void m29284a(int i) {
        f25216b = i;
    }

    /* renamed from: a */
    public static void m29283a() {
        f25215a = true;
        m29284a(3);
    }

    /* renamed from: b */
    public static boolean m29292b() {
        return f25215a;
    }

    /* renamed from: a */
    public static void m29286a(String str, String str2) {
        if (f25215a && str2 != null && f25216b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m29287a(String str, String str2, Throwable th) {
        if (f25215a) {
            if (!(str2 == null && th == null) && f25216b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m29288a(String str, Object... objArr) {
        if (f25215a && objArr != null && f25216b <= 3) {
            Log.v(str, m29282a(objArr));
        }
    }

    /* renamed from: a */
    public static void m29285a(String str) {
        if (f25215a) {
            m29289b("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m29289b(String str, String str2) {
        if (f25215a && str2 != null && f25216b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m29290b(String str, String str2, Throwable th) {
        if (f25215a) {
            if (!(str2 == null && th == null) && f25216b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m29291b(String str, Object... objArr) {
        if (f25215a && objArr != null && f25216b <= 4) {
            Log.v(str, m29282a(objArr));
        }
    }

    /* renamed from: c */
    public static void m29293c(String str, String str2) {
        if (f25215a && str2 != null && f25216b <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m29294c(String str, String str2, Throwable th) {
        if (f25215a) {
            if (!(str2 == null && th == null) && f25216b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    private static String m29282a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
