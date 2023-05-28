package com.bytedance.sdk.component.utils;

import android.util.Log;
import com.bytedance.sdk.component.C10216a;

/* renamed from: com.bytedance.sdk.component.utils.l */
/* compiled from: Logger */
public class C10638l {

    /* renamed from: a */
    private static boolean f26520a = false;

    /* renamed from: b */
    private static int f26521b = 4;

    /* renamed from: c */
    private static C10216a f26522c;

    /* renamed from: a */
    public static void m31227a(int i) {
        f26521b = i;
    }

    /* renamed from: a */
    public static boolean m31232a() {
        return f26521b <= 3;
    }

    /* renamed from: b */
    public static void m31233b() {
        f26520a = true;
        m31227a(3);
    }

    /* renamed from: c */
    public static boolean m31240c() {
        return f26520a;
    }

    /* renamed from: a */
    public static void m31229a(String str, String str2) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63006a(str, str2);
        }
        if (f26520a && str2 != null && f26521b <= 2) {
            Log.v(str, str2);
        }
    }

    /* renamed from: a */
    public static void m31228a(String str) {
        if (f26520a) {
            m31235b("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m31235b(String str, String str2) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63008b(str, str2);
        }
        if (f26520a && str2 != null && f26521b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m31230a(String str, String str2, Throwable th) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63008b(str, str2 + Log.getStackTraceString(th));
        }
        if (f26520a) {
            if (!(str2 == null && th == null) && f26521b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: c */
    public static void m31238c(String str, String str2) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63010c(str, str2);
        }
        if (f26520a && str2 != null && f26521b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m31231a(String str, Object... objArr) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63010c(str, m31226a(objArr));
        }
        if (f26520a && objArr != null && f26521b <= 4) {
            Log.v(str, m31226a(objArr));
        }
    }

    /* renamed from: d */
    public static void m31241d(String str, String str2) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63011d(str, str2);
        }
        if (f26520a && str2 != null && f26521b <= 5) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static void m31236b(String str, String str2, Throwable th) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63007a(str, str2, th);
        }
        if (f26520a) {
            if (!(str2 == null && th == null) && f26521b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m31237b(String str, Object... objArr) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63011d(str, m31226a(objArr));
        }
        if (f26520a && objArr != null && f26521b <= 5) {
            Log.v(str, m31226a(objArr));
        }
    }

    /* renamed from: b */
    public static void m31234b(String str) {
        if (f26520a) {
            m31242e("Logger", str);
        }
    }

    /* renamed from: e */
    public static void m31242e(String str, String str2) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63012e(str, str2);
        }
        if (f26520a && str2 != null && f26521b <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m31239c(String str, String str2, Throwable th) {
        C10216a aVar = f26522c;
        if (aVar != null) {
            aVar.mo63009b(str, str2, th);
        }
        if (f26520a) {
            if (!(str2 == null && th == null) && f26521b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    private static String m31226a(Object... objArr) {
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
