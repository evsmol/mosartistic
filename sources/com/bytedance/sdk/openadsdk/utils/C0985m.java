package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10617f;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10648u;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.utils.m */
/* compiled from: RomUtils */
public class C0985m {

    /* renamed from: a */
    public static boolean f3312a = false;

    /* renamed from: b */
    public static boolean f3313b = false;

    /* renamed from: c */
    private static final CharSequence f3314c = "sony";

    /* renamed from: d */
    private static final CharSequence f3315d = "amigo";

    /* renamed from: e */
    private static final CharSequence f3316e = "funtouch";

    /* renamed from: f */
    private static String f3317f = null;

    /* renamed from: g */
    private static int f3318g = Integer.MAX_VALUE;

    /* renamed from: a */
    public static String m4554a() {
        if (!TextUtils.isEmpty(f3317f)) {
            return f3317f;
        }
        String a = C0503h.m2278a("sdk_local_rom_info", 604800000);
        f3317f = a;
        if (TextUtils.isEmpty(a)) {
            String u = m4578u();
            f3317f = u;
            C0503h.m2280a("sdk_local_rom_info", u);
        }
        return f3317f;
    }

    /* renamed from: u */
    private static String m4578u() {
        if (m4572o()) {
            return m4573p();
        }
        if (m4562e()) {
            return m4569l();
        }
        if (m4557b()) {
            return m4574q();
        }
        if (m4575r()) {
            return m4576s();
        }
        String m = m4570m();
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        if (m4564g()) {
            return m4563f();
        }
        if (m4565h()) {
            return m4566i();
        }
        if (m4561d()) {
            return m4558c();
        }
        String j = m4567j();
        if (!TextUtils.isEmpty(j)) {
            return j;
        }
        return Build.DISPLAY;
    }

    /* renamed from: b */
    public static boolean m4557b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* renamed from: c */
    public static String m4558c() {
        return m4560d("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: d */
    public static boolean m4561d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m4562e() {
        if (!f3313b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f3312a = true;
                    f3313b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f3313b = true;
        }
        return f3312a;
    }

    /* renamed from: f */
    public static String m4563f() {
        return m4560d("ro.vivo.os.build.display.id") + "_" + m4560d("ro.vivo.product.version");
    }

    /* renamed from: g */
    public static boolean m4564g() {
        String d = m4560d("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(d) && d.toLowerCase().contains(f3316e);
    }

    /* renamed from: h */
    public static boolean m4565h() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(f3315d);
    }

    /* renamed from: i */
    public static String m4566i() {
        return Build.DISPLAY + "_" + m4560d("ro.gn.sv.version");
    }

    /* renamed from: j */
    public static String m4567j() {
        if (!m4568k()) {
            return "";
        }
        return "eui_" + m4560d("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: k */
    public static boolean m4568k() {
        return !TextUtils.isEmpty(m4560d("ro.letv.release.version"));
    }

    /* renamed from: l */
    public static String m4569l() {
        if (!m4562e()) {
            return "";
        }
        return "miui_" + m4560d("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: m */
    public static String m4570m() {
        String n = m4571n();
        if (n == null || !n.toLowerCase().contains("emotionui")) {
            return "";
        }
        return n + "_" + Build.DISPLAY;
    }

    /* renamed from: n */
    public static String m4571n() {
        return m4560d("ro.build.version.emui");
    }

    /* renamed from: o */
    public static boolean m4572o() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: p */
    public static String m4573p() {
        if (m4572o()) {
            try {
                String d = m4560d("ro.smartisan.version");
                return "smartisan_" + d;
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    /* renamed from: q */
    public static String m4574q() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    /* renamed from: r */
    public static boolean m4575r() {
        if (f3318g == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String k = C0996u.m4680k("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(k)) {
                f3318g = 0;
            } else {
                f3318g = 1;
            }
        }
        if (f3318g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static String m4576s() {
        if (!m4575r()) {
            return "";
        }
        String k = C0996u.m4680k("ro.build.version.kllkrom");
        return "coloros_" + m4560d(k) + "_" + Build.DISPLAY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (android.os.Build.BRAND.toLowerCase().startsWith("huawei") == false) goto L_0x0017;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4577t() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002b
        L_0x0017:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x002c }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0985m.m4577t():boolean");
    }

    /* renamed from: a */
    public static boolean m4555a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m4571n();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || m4577t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r5 = null;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ExcHandler: all (r4v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC, Splitter:B:39:0x007b] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4559c(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.<init>()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r6 = "getprop "
            r5.append(r6)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.append(r8)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStream r7 = r4.getInputStream()     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.lang.String r2 = r5.readLine()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r4.exitValue()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x007e
        L_0x003b:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r0, r8)
            goto L_0x007e
        L_0x0040:
            r3 = move-exception
            goto L_0x0048
        L_0x0042:
            r5 = r3
        L_0x0043:
            r3 = r4
            goto L_0x0074
        L_0x0045:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "Unable to read sysprop "
            r4.append(r6)     // Catch:{ all -> 0x0067 }
            r4.append(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0067 }
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r8, r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r0, r8)
        L_0x0066:
            return r2
        L_0x0067:
            r8 = move-exception
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r0, r2)
        L_0x0072:
            throw r8
        L_0x0073:
            r5 = r3
        L_0x0074:
            r3.destroy()     // Catch:{ all -> 0x0078 }
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            if (r5 == 0) goto L_0x007e
            r5.close()     // Catch:{ IOException -> 0x003b }
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0985m.m4559c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static String m4560d(String str) {
        String str2;
        try {
            str2 = m4579v();
            try {
                if (TextUtils.isEmpty(str2)) {
                    final C10617f fVar = new C10617f(new C0987a(str), 5, 2);
                    C10615e.m31160a(new C10618g("_getSystemPropertyTask") {
                        public void run() {
                            fVar.run();
                        }
                    }, 5);
                    str2 = (String) fVar.get(1, TimeUnit.SECONDS);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = "";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.m$a */
    /* compiled from: RomUtils */
    public static class C0987a implements Callable<String> {

        /* renamed from: a */
        private String f3320a;

        public C0987a(String str) {
            this.f3320a = str;
        }

        /* renamed from: a */
        public String call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String b = C0985m.m4559c(this.f3320a);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C10638l.m31235b("RomUtils", "property:" + b + ",getSystemProperty use time :" + currentTimeMillis2);
            if (!TextUtils.isEmpty(b)) {
                try {
                    if (C0934b.m4334c()) {
                        C10638l.m31241d("RomUtils", "SPMultiHelper-getPropertyFromSPMultiHelper:" + b);
                        C0947a.m4404a("rom_info", "rom_property_info", b);
                    } else {
                        C10638l.m31241d("RomUtils", "SP-getPropertyFromSP:" + b);
                        C10648u.m31293a("rom_info", C0558m.m2663a()).mo64275a("rom_property_info", b);
                    }
                } catch (Throwable unused) {
                }
            }
            return b;
        }
    }

    /* renamed from: v */
    private static String m4579v() {
        try {
            if (C0934b.m4334c()) {
                String b = C0947a.m4410b("rom_info", "rom_property_info", "");
                C10638l.m31238c("RomUtils", "get Property From SPMultiHelper..." + b);
                return b;
            }
            String b2 = C10648u.m31293a("rom_info", C0558m.m2663a()).mo64282b("rom_property_info", "");
            C10638l.m31238c("RomUtils", "get Property From SP...=" + b2);
            return b2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
