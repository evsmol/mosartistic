package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.C6740d;
import com.apm.insight.runtime.C6748i;
import com.apm.insight.runtime.C6769t;
import com.apm.insight.runtime.ConfigManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.h */
public final class C6617h {

    /* renamed from: a */
    private static Context f14213a = null;

    /* renamed from: b */
    private static Application f14214b = null;

    /* renamed from: c */
    private static long f14215c = 0;

    /* renamed from: d */
    private static String f14216d = "default";

    /* renamed from: e */
    private static boolean f14217e = false;

    /* renamed from: f */
    private static C6740d f14218f;

    /* renamed from: g */
    private static ConfigManager f14219g = new ConfigManager();

    /* renamed from: h */
    private static C6548a f14220h = new C6548a();

    /* renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f14221i;

    /* renamed from: j */
    private static C6769t f14222j = null;

    /* renamed from: k */
    private static volatile String f14223k = null;

    /* renamed from: l */
    private static Object f14224l = new Object();

    /* renamed from: m */
    private static volatile int f14225m = 0;

    /* renamed from: n */
    private static volatile String f14226n;

    /* renamed from: o */
    private static int f14227o = 0;

    /* renamed from: a */
    public static C6740d m16297a() {
        if (f14218f == null) {
            f14218f = C6748i.m16955a(f14213a);
        }
        return f14218f;
    }

    /* renamed from: a */
    public static String m16298a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m16312f());
        sb.append('_');
        String str = "normal_";
        sb.append(z ? "oom_" : str);
        sb.append(m16316j());
        sb.append('_');
        if (z2) {
            str = "ignore_";
        }
        sb.append(str);
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m16299a(int i) {
        f14227o = i;
    }

    /* renamed from: a */
    static void m16300a(int i, String str) {
        if (f14221i == null) {
            synchronized (C6617h.class) {
                if (f14221i == null) {
                    f14221i = new ConcurrentHashMap<>();
                }
            }
        }
        f14221i.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m16301a(Application application) {
        if (application != null) {
            f14214b = application;
        }
    }

    /* renamed from: a */
    public static void m16302a(Application application, Context context) {
        if (f14214b == null) {
            f14215c = System.currentTimeMillis();
            f14213a = context;
            f14214b = application;
            f14223k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    /* renamed from: a */
    static void m16303a(Application application, Context context, ICommonParams iCommonParams) {
        m16302a(application, context);
        f14218f = new C6740d(f14213a, iCommonParams, m16297a());
    }

    /* renamed from: a */
    public static void m16304a(C6740d dVar) {
        f14218f = dVar;
    }

    /* renamed from: a */
    static void m16305a(String str) {
        f14216d = str;
    }

    /* renamed from: a */
    static void m16306a(boolean z) {
        f14217e = z;
    }

    /* renamed from: b */
    public static C6548a m16307b() {
        return f14220h;
    }

    /* renamed from: b */
    static void m16308b(int i, String str) {
        f14225m = i;
        f14226n = str;
    }

    /* renamed from: c */
    public static C6769t m16309c() {
        if (f14222j == null) {
            synchronized (C6617h.class) {
                f14222j = new C6769t(f14213a);
            }
        }
        return f14222j;
    }

    /* renamed from: d */
    public static boolean m16310d() {
        return m16315i().isDebugMode() && m16320n().contains("local_test");
    }

    /* renamed from: e */
    public static String m16311e() {
        return m16312f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    /* renamed from: f */
    public static String m16312f() {
        if (f14223k == null) {
            synchronized (f14224l) {
                if (f14223k == null) {
                    f14223k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f14223k;
    }

    /* renamed from: g */
    public static Context m16313g() {
        return f14213a;
    }

    /* renamed from: h */
    public static Application m16314h() {
        return f14214b;
    }

    /* renamed from: i */
    public static ConfigManager m16315i() {
        return f14219g;
    }

    /* renamed from: j */
    public static long m16316j() {
        return f14215c;
    }

    /* renamed from: k */
    public static String m16317k() {
        return f14216d;
    }

    /* renamed from: l */
    public static int m16318l() {
        return f14227o;
    }

    /* renamed from: m */
    public static boolean m16319m() {
        return f14217e;
    }

    /* renamed from: n */
    public static String m16320n() {
        Object obj = m16297a().mo52290a().get("channel");
        return obj == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : String.valueOf(obj);
    }

    /* renamed from: o */
    public static ConcurrentHashMap<Integer, String> m16321o() {
        return f14221i;
    }

    /* renamed from: p */
    public static int m16322p() {
        return f14225m;
    }

    /* renamed from: q */
    public static String m16323q() {
        return f14226n;
    }
}
