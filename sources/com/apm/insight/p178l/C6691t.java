package com.apm.insight.p178l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.apm.insight.l.t */
public class C6691t {

    /* renamed from: a */
    private static final CharSequence f14373a = "sony";

    /* renamed from: b */
    private static final CharSequence f14374b = "amigo";

    /* renamed from: c */
    private static final CharSequence f14375c = "funtouch";

    /* renamed from: a */
    public static String m16641a() {
        if (C6668d.m16500c()) {
            return m16651j();
        }
        if (C6668d.m16502d()) {
            return m16653l();
        }
        if (m16654m()) {
            return m16655n();
        }
        String k = m16652k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m16646e()) {
            return m16645d();
        }
        if (m16647f()) {
            return m16648g();
        }
        if (m16644c()) {
            return m16643b();
        }
        String h = m16649h();
        return !TextUtils.isEmpty(h) ? h : Build.DISPLAY;
    }

    /* renamed from: a */
    private static String m16642a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C6677k.m16550a((Closeable) bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C6677k.m16550a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C6677k.m16550a((Closeable) bufferedReader);
            return str2;
        }
    }

    /* renamed from: b */
    public static String m16643b() {
        return m16642a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: c */
    public static boolean m16644c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* renamed from: d */
    public static String m16645d() {
        return m16642a("ro.vivo.os.build.display.id") + "_" + m16642a("ro.vivo.product.version");
    }

    /* renamed from: e */
    public static boolean m16646e() {
        String a = m16642a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(a) && a.toLowerCase(Locale.getDefault()).contains(f14375c);
    }

    /* renamed from: f */
    public static boolean m16647f() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f14374b);
    }

    /* renamed from: g */
    public static String m16648g() {
        return Build.DISPLAY + "_" + m16642a("ro.gn.sv.version");
    }

    /* renamed from: h */
    public static String m16649h() {
        if (!m16650i()) {
            return "";
        }
        return "eui_" + m16642a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: i */
    public static boolean m16650i() {
        return !TextUtils.isEmpty(m16642a("ro.letv.release.version"));
    }

    /* renamed from: j */
    public static String m16651j() {
        if (!C6668d.m16500c()) {
            return "";
        }
        return "miui_" + m16642a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static String m16652k() {
        String a = C6668d.m16495a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return a + "_" + Build.DISPLAY;
    }

    /* renamed from: l */
    public static String m16653l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    /* renamed from: m */
    public static boolean m16654m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: n */
    public static String m16655n() {
        if (!m16654m()) {
            return "";
        }
        return "coloros_" + m16642a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
