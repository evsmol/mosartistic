package com.apm.insight.p166b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6588e;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6689r;
import com.apm.insight.p178l.C6693v;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.d */
public class C6560d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f14033a = null;

    /* renamed from: b */
    private static long f14034b = -1;

    /* renamed from: c */
    private static boolean f14035c = false;

    /* renamed from: d */
    private static FileObserver f14036d;

    /* renamed from: e */
    private static ActivityManager.ProcessErrorStateInfo f14037e;

    /* renamed from: a */
    static String m16042a(Context context, int i) {
        if (C6689r.m16637a(256)) {
            f14035c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f14034b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a = C6662a.m16471a(context, i);
                if (a != null && Process.myPid() == a.pid) {
                    if (f14037e != null && C6554a.m16007a(f14037e, a)) {
                        return null;
                    }
                    f14037e = a;
                    f14033a = null;
                    f14034b = SystemClock.uptimeMillis();
                    f14035c = false;
                    return C6554a.m16006a(a);
                }
            } catch (Throwable unused) {
            }
            String str = f14033a;
            if (str == null) {
                return null;
            }
            f14035c = true;
            f14033a = null;
            f14034b = SystemClock.uptimeMillis();
            return str;
        }
    }

    /* renamed from: a */
    public static JSONObject m16044a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C6693v.m16661a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m16045a(final String str, final C6588e eVar) {
        FileObserver fileObserver = f14036d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        C65611 r0 = new FileObserver(136, str) {
            public void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String unused = C6560d.f14033a = eVar.mo52024a(str, str);
                    } catch (Throwable th) {
                        C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f14036d = r0;
        r0.startWatching();
    }

    /* renamed from: a */
    public static boolean m16046a() {
        return f14035c;
    }

    /* renamed from: b */
    public static void m16047b() {
        f14037e = null;
    }
}
