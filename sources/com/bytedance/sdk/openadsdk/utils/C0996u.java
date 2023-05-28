package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bykv.p271vk.openvk.component.video.api.C10181a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bytedance.sdk.component.p312c.C10486a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C0379a;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0747y;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.utils.u */
/* compiled from: ToolUtils */
public class C0996u {

    /* renamed from: a */
    private static ExecutorService f3330a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private static C0994s f3331b = new C0994s();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile boolean f3332c = false;

    /* renamed from: d */
    private static String f3333d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile String f3334e = "";

    /* renamed from: f */
    private static String f3335f = null;

    /* renamed from: g */
    private static String f3336g = null;

    /* renamed from: h */
    private static String f3337h = null;

    /* renamed from: i */
    private static HashSet<String> f3338i = new HashSet<>(Arrays.asList(new String[]{"Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"}));

    /* renamed from: a */
    public static String m4615a(int i) {
        switch (i) {
            case 1:
                return "embeded_ad_landingpage";
            case 2:
                return "banner_ad_landingpage";
            case 3:
                return "interaction_landingpage";
            case 4:
                return "splash_ad_landingpage";
            case 5:
                return "fullscreen_interstitial_ad";
            case 6:
                return "draw_ad_landingpage";
            case 7:
                return "rewarded_video_landingpage";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m4622a(C0477n nVar, View view) {
    }

    /* renamed from: b */
    public static String m4632b(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? i != 9 ? "embeded_ad" : "draw_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    /* renamed from: e */
    public static boolean m4656e(int i) {
        return i == 4;
    }

    /* renamed from: f */
    public static boolean m4661f(int i) {
        return i == 5;
    }

    /* renamed from: g */
    public static boolean m4666g(int i) {
        return i == 6;
    }

    /* renamed from: a */
    public static Intent m4613a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public static boolean m4636b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4628a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m4643c(Context context, String str) {
        return C0503h.m2281d() != null && !C0503h.m2281d().mo1587a();
    }

    /* renamed from: d */
    public static boolean m4649d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                C10622b.m31190a(context, intent, (C10622b.C10623a) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m4617a(C0477n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return m4632b(m4653e(nVar));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4610a(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 1
            r2 = 7
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 6
            switch(r0) {
                case -1695837674: goto L_0x0055;
                case -1364000502: goto L_0x004b;
                case -1263194568: goto L_0x0041;
                case -764631662: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 564365438: goto L_0x0023;
                case 1844104722: goto L_0x0019;
                case 1912999166: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x005f
        L_0x000f:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 1
            goto L_0x0060
        L_0x0019:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 3
            goto L_0x0060
        L_0x0023:
            java.lang.String r0 = "cache_splash_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 5
            goto L_0x0060
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 0
            goto L_0x0060
        L_0x0037:
            java.lang.String r0 = "fullscreen_interstitial_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 6
            goto L_0x0060
        L_0x0041:
            java.lang.String r0 = "open_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 4
            goto L_0x0060
        L_0x004b:
            java.lang.String r0 = "rewarded_video"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 7
            goto L_0x0060
        L_0x0055:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 2
            goto L_0x0060
        L_0x005f:
            r8 = -1
        L_0x0060:
            switch(r8) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0068;
                case 3: goto L_0x0067;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x0065;
                case 7: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        L_0x0068:
            return r6
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0996u.m4610a(java.lang.String):int");
    }

    /* renamed from: b */
    public static JSONObject m4634b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m4637b(C0477n nVar) {
        return nVar != null && m4653e(nVar) == 9;
    }

    /* renamed from: c */
    public static boolean m4644c(C0477n nVar) {
        return nVar != null && m4653e(nVar) == 7;
    }

    /* renamed from: d */
    public static boolean m4650d(C0477n nVar) {
        return nVar != null && m4653e(nVar) == 8;
    }

    /* renamed from: e */
    public static int m4653e(C0477n nVar) {
        JSONObject aH;
        int aI = nVar.mo1378aI();
        if (aI != 0 || (aH = nVar.mo1377aH()) == null) {
            return aI;
        }
        int optInt = aH.optInt("ad_slot_type", 0);
        nVar.mo1323C(optInt);
        return optInt;
    }

    /* renamed from: f */
    public static int m4657f(C0477n nVar) {
        JSONObject aH = nVar.mo1377aH();
        if (aH != null) {
            return aH.optInt("rit", 0);
        }
        return 0;
    }

    /* renamed from: c */
    public static long m4641c(String str) {
        return m4612a(m4634b(str));
    }

    /* renamed from: a */
    private static long m4612a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m4647d(String str) {
        return m4630b(m4634b(str));
    }

    /* renamed from: b */
    private static int m4630b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    /* renamed from: e */
    public static double m4651e(String str) {
        return m4638c(m4634b(str));
    }

    /* renamed from: g */
    public static double m4662g(C0477n nVar) {
        return m4638c(nVar.mo1377aH());
    }

    /* renamed from: c */
    private static double m4638c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    /* renamed from: h */
    public static String m4669h(C0477n nVar) {
        JSONObject aH;
        String aJ = nVar.mo1379aJ();
        if (TextUtils.isEmpty(aJ) && (aH = nVar.mo1377aH()) != null) {
            aJ = aH.optString("req_id", "");
            nVar.mo1464q(aJ);
        }
        if (aJ == null) {
            return "";
        }
        return aJ;
    }

    /* renamed from: a */
    public static String m4618a(C0477n nVar, String str) {
        JSONObject aH = nVar.mo1377aH();
        return aH != null ? aH.optString("rit", str) : str;
    }

    /* renamed from: i */
    public static String m4673i(C0477n nVar) {
        if (nVar == null || nVar.mo1380aa() == null || TextUtils.isEmpty(nVar.mo1380aa().mo1213a())) {
            return null;
        }
        return nVar.mo1380aa().mo1213a();
    }

    /* renamed from: a */
    public static String m4614a() {
        String str;
        String str2 = "unKnow";
        try {
            if (C0934b.m4334c()) {
                str = C0947a.m4410b("sp_multi_ua_data", "android_system_ua", str2);
            } else {
                str = C0434c.m1779a(C0558m.m2663a()).mo1180b("android_system_ua", str2);
            }
            if (str != null && !str2.equals(str)) {
                return str;
            }
            FutureTask futureTask = new FutureTask(new C1000a(2));
            f3330a.execute(futureTask);
            str2 = (String) futureTask.get(500, TimeUnit.MILLISECONDS);
            C10638l.m31242e("getUA", " getAndroidSystemUA userAgent" + str2);
            return str2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static String m4631b() {
        if (!TextUtils.isEmpty(f3334e)) {
            return f3334e;
        }
        try {
            f3334e = C0503h.m2278a("sdk_local_web_ua", (long) Constants.MILLIS_IN_DAY);
            if (TextUtils.isEmpty(f3334e)) {
                if (Build.VERSION.SDK_INT < 17) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                try {
                                    if (TextUtils.isEmpty(C0996u.f3334e)) {
                                        SSWebView sSWebView = new SSWebView(C0558m.m2663a());
                                        sSWebView.setWebViewClient(new SSWebView.C10655a());
                                        String unused = C0996u.f3334e = sSWebView.getUserAgentString();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        });
                    } else if (TextUtils.isEmpty(f3334e)) {
                        SSWebView sSWebView = new SSWebView(C0558m.m2663a());
                        sSWebView.setWebViewClient(new SSWebView.C10655a());
                        f3334e = sSWebView.getUserAgentString();
                    }
                } else if (TextUtils.isEmpty(f3334e)) {
                    f3334e = WebSettings.getDefaultUserAgent(C0558m.m2663a());
                }
                C0503h.m2280a("sdk_local_web_ua", f3334e);
            }
        } catch (Exception unused) {
        }
        return f3334e;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static String m4701u() {
        try {
            WebView webView = new WebView(C0558m.m2663a());
            webView.setWebViewClient(new SSWebView.C10655a());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (C0934b.m4334c()) {
                    C0947a.m4404a("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    C0434c.m1779a(C0558m.m2663a()).mo1176a("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            C10638l.m31242e("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.u$a */
    /* compiled from: ToolUtils */
    public static class C1000a implements Callable<String> {

        /* renamed from: a */
        int f3341a = 1;

        C1000a(int i) {
            this.f3341a = i;
        }

        /* renamed from: a */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            if (this.f3341a == 1) {
                str = m4704c();
            }
            if (this.f3341a == 2) {
                str = m4703b();
            }
            return str;
        }

        /* renamed from: b */
        private String m4703b() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (C0934b.m4334c()) {
                                C0947a.m4404a("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                C0434c.m1779a(C0558m.m2663a()).mo1176a("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C10638l.m31242e("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                str = "unKnow";
                th = th4;
                C10638l.m31242e("getUA", "e:" + th.getMessage());
                return str;
            }
            return str;
        }

        /* renamed from: c */
        private synchronized String m4704c() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    strArr[0] = C0996u.m4701u();
                    C10638l.m31235b("getUA", "webview ua：" + strArr[0]);
                }
            });
            while ("unKnow".equals(strArr[0])) {
            }
            return strArr[0];
        }
    }

    /* renamed from: c */
    public static String m4642c() {
        return C0984l.m4553a();
    }

    /* renamed from: d */
    public static synchronized String m4648d() {
        String str;
        synchronized (C0996u.class) {
            if (TextUtils.isEmpty(f3335f) && C0558m.m2663a() != null) {
                try {
                    f3335f = C0558m.m2663a().getPackageName();
                } catch (Throwable th) {
                    C10638l.m31239c("ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
            str = f3335f;
        }
        return str;
    }

    /* renamed from: e */
    public static synchronized String m4654e() {
        String str;
        synchronized (C0996u.class) {
            if (TextUtils.isEmpty(f3336g) && C0558m.m2663a() != null) {
                try {
                    PackageInfo packageInfo = C0558m.m2663a().getPackageManager().getPackageInfo(m4648d(), 0);
                    f3336g = String.valueOf(packageInfo.versionCode);
                    f3337h = packageInfo.versionName;
                } catch (Throwable th) {
                    C10638l.m31239c("ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
            str = f3336g;
        }
        return str;
    }

    /* renamed from: f */
    public static synchronized String m4660f() {
        String str;
        synchronized (C0996u.class) {
            if (TextUtils.isEmpty(f3337h) && C0558m.m2663a() != null) {
                try {
                    PackageInfo packageInfo = C0558m.m2663a().getPackageManager().getPackageInfo(m4648d(), 0);
                    f3336g = String.valueOf(packageInfo.versionCode);
                    f3337h = packageInfo.versionName;
                } catch (Throwable th) {
                    C10638l.m31239c("ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
            str = f3337h;
        }
        return str;
    }

    /* renamed from: a */
    public static String m4616a(Context context) {
        String b = C0434c.m1779a(context).mo1180b("total_memory", (String) null);
        if (b == null || m4659f(b) <= 0) {
            b = m4655e(context, "MemTotal");
            if (m4659f(b) <= 0) {
                b = m4664g();
            }
            C0434c.m1779a(context).mo1176a("total_memory", b);
        }
        return b;
    }

    /* renamed from: f */
    public static long m4659f(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static String m4664g() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) C0558m.m2663a().getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m4633b(Context context) {
        return C0434c.m1779a(context).mo1180b("total_memory", BuildConfig.ADAPTER_VERSION);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileReader} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|22|23|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[SYNTHETIC, Splitter:B:11:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0060 A[SYNTHETIC, Splitter:B:38:0x0060] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4655e(android.content.Context r6, java.lang.String r7) {
        /*
            r6 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004e }
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r0, r2)     // Catch:{ all -> 0x004e }
        L_0x000f:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x001b
            boolean r3 = r2.contains(r7)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x000f
        L_0x001b:
            if (r2 != 0) goto L_0x0024
            r1.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r0.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            return r6
        L_0x0024:
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r2.split(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "ToolUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "getTotalMemory = "
            r3.append(r4)     // Catch:{ all -> 0x004c }
            r4 = 1
            r5 = r7[r4]     // Catch:{ all -> 0x004c }
            r3.append(r5)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004c }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x004c }
            r6 = r7[r4]     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            r0.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return r6
        L_0x004c:
            r7 = move-exception
            goto L_0x0054
        L_0x004e:
            r7 = move-exception
            r1 = r6
            goto L_0x0054
        L_0x0051:
            r7 = move-exception
            r0 = r6
            r1 = r0
        L_0x0054:
            r7.printStackTrace()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ Exception -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            return r6
        L_0x0064:
            r6 = move-exception
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0996u.m4655e(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public static int m4667h() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a */
                private Pattern f3339a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f3339a.matcher(str).matches();
                }
            })) == null) {
                return 0;
            }
            return Math.max(listFiles.length, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m4640c(Context context) {
        return C0434c.m1779a(context).mo1178b("cpu_count", 0);
    }

    /* renamed from: d */
    public static int m4646d(Context context) {
        return C0434c.m1779a(context).mo1178b("cpu_max_frequency", 0);
    }

    /* renamed from: e */
    public static int m4652e(Context context) {
        return C0434c.m1779a(context).mo1178b("cpu_min_frequency", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC, Splitter:B:27:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[Catch:{ Exception -> 0x0064 }, DONT_GENERATE] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4639c(int r7) {
        /*
            r0 = 0
            r1 = 0
            r1 = r0
            r2 = 0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0072
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            r4.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004d }
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0042 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x0039
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0042 }
            if (r1 <= r2) goto L_0x0039
            r2 = r1
        L_0x0039:
            r0.close()     // Catch:{ Exception -> 0x003f }
            r3.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0042:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0051
        L_0x0047:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0051:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0066 }
            com.bytedance.sdk.component.utils.C10638l.m31242e(r4, r1)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x005f
            r3.close()     // Catch:{ Exception -> 0x0064 }
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r1 = r3
            goto L_0x0004
        L_0x0066:
            r7 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ Exception -> 0x0071 }
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r7
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0996u.m4639c(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[SYNTHETIC, Splitter:B:28:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ Exception -> 0x0067 }, DONT_GENERATE] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4645d(int r7) {
        /*
            r0 = 0
            r1 = 0
            r1 = r0
            r2 = 0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0075
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r4.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            r4.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x004a }
            r0.<init>(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0045 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x003c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0045 }
            if (r1 >= r2) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            if (r2 != 0) goto L_0x003c
        L_0x003b:
            r2 = r1
        L_0x003c:
            r0.close()     // Catch:{ Exception -> 0x0042 }
            r3.close()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0045:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0054
        L_0x004a:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0054:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0069 }
            com.bytedance.sdk.component.utils.C10638l.m31242e(r4, r1)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = r3
            goto L_0x0004
        L_0x0069:
            r7 = move-exception
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ Exception -> 0x0074 }
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            throw r7
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0996u.m4645d(int):int");
    }

    /* renamed from: f */
    public static long m4658f(Context context) {
        return C0434c.m1779a(context).mo1179b("total_internal_storage", 0).longValue();
    }

    /* renamed from: i */
    public static long m4672i() {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getBlockCountLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getBlockCount();
            }
            return j2 * j;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static long m4663g(Context context) {
        return C0434c.m1779a(context).mo1179b("free_internal_storage", 0).longValue();
    }

    /* renamed from: h */
    public static long m4668h(Context context) {
        return C0434c.m1779a(context).mo1179b("total_sdcard_storage", 0).longValue();
    }

    /* renamed from: j */
    public static long m4675j() {
        try {
            if (!m4702v()) {
                return 0;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: v */
    private static boolean m4702v() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static int m4671i(Context context) {
        return C0434c.m1779a(context).mo1178b("is_root", -1);
    }

    /* renamed from: k */
    public static boolean m4681k() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static String m4665g(String str) {
        return m4619a(str, false);
    }

    /* renamed from: a */
    public static String m4619a(String str, boolean z) {
        String str2;
        String p = C0558m.m2673h().mo1714p();
        if (TextUtils.isEmpty(p)) {
            int o = m4691o();
            if (o == 1) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else if (o == 2) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://" + "pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return C0994s.m4605b(str2);
            }
            return m4696p(str2);
        }
        String str3 = "https://" + p + str;
        if (C0994s.m4603a() && !z) {
            str3 = C0994s.m4605b(str3);
        }
        return z ? m4696p(str3) : str3;
    }

    /* renamed from: p */
    private static String m4696p(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", m4654e()).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: h */
    public static String m4670h(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C0558m.m2673h().mo1716q();
        }
        if (TextUtils.isEmpty(str)) {
            return m4691o() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/";
        }
        if (str.startsWith("http")) {
            return str;
        }
        return "https://" + str;
    }

    /* renamed from: l */
    public static String m4682l() {
        return String.format("https://%s", new Object[]{"log.byteoversea.com/service/2/app_log_test/"});
    }

    /* renamed from: m */
    public static String m4685m() {
        int o = m4691o();
        return (o == 1 || o == 2) ? "https://sf-tb-sg.ibytedtos.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-muse-va.ibytedtos.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    /* renamed from: n */
    public static String m4689n() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            C10638l.m31242e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: o */
    public static int m4691o() {
        try {
            String id = TimeZone.getDefault().getID();
            if (f3338i.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/")) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            C10638l.m31242e("ToolUtils", th.toString());
            return 0;
        }
    }

    /* renamed from: j */
    public static String m4676j(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale.getLanguage();
            String country = locale.getCountry();
            return language + "_" + country;
        } catch (Exception e) {
            C10638l.m31242e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: k */
    public static String m4679k(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e) {
            C10638l.m31242e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: p */
    public static int m4694p() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: q */
    public static String m4697q() {
        int i = -m4694p();
        if (i >= 0) {
            return "Etc/GMT+" + i;
        }
        return "Etc/GMT" + i;
    }

    /* renamed from: a */
    public static Map<String, Object> m4621a(boolean z, C0477n nVar, long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.mo1345Y());
        hashMap.put("load_time", Long.valueOf(j));
        C10187b J = nVar.mo1330J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.mo62913e()));
            hashMap.put("video_resolution", J.mo62919g());
        }
        if (!z) {
            hashMap.put("error_code", Long.valueOf(j2));
            if (TextUtils.isEmpty(str)) {
                str = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
            hashMap.put("error_message", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m4620a(C0477n nVar, long j, C10181a aVar) {
        if (nVar == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.mo1345Y());
        hashMap.put("buffers_time", Long.valueOf(j));
        C10187b J = nVar.mo1330J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.mo62913e()));
            hashMap.put("video_resolution", J.mo62919g());
        }
        m4624a((Map<String, Object>) hashMap, aVar);
        return hashMap;
    }

    /* renamed from: a */
    private static void m4624a(Map<String, Object> map, C10181a aVar) {
        if (!map.containsKey("video_resolution") && aVar != null) {
            try {
                int j = aVar.mo62867j();
                int k = aVar.mo62868k();
                map.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", new Object[]{Integer.valueOf(j), Integer.valueOf(k)}));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public static boolean m4674i(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m4635b(C0477n nVar, String str) {
        if (nVar != null) {
            try {
                String O = nVar.mo1335O();
                if (TextUtils.isEmpty(O) && nVar.mo1381ab() != null && nVar.mo1381ab().mo1261c() == 1 && !TextUtils.isEmpty(nVar.mo1381ab().mo1259b())) {
                    O = nVar.mo1381ab().mo1259b();
                }
                String str2 = O;
                if (!TextUtils.isEmpty(str2)) {
                    C0747y.m3813a(C0558m.m2663a(), str2, nVar, m4610a(str), str, false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: j */
    public static boolean m4677j(C0477n nVar) {
        if (nVar == null) {
            return true;
        }
        int c = C0558m.m2673h().mo1680c(m4657f(nVar));
        int c2 = C10642o.m31260c(C0558m.m2663a());
        if (c == 1) {
            return m4656e(c2);
        }
        if (c != 2) {
            if (c == 3) {
                return false;
            }
            if (c == 5 && !m4656e(c2) && !m4666g(c2)) {
                return false;
            }
            return true;
        } else if (m4661f(c2) || m4656e(c2) || m4666g(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m4626a(JSONObject jSONObject, boolean z) {
        String a;
        if (C0994s.m4603a() && (a = C0994s.m4602a("testGps.txt")) != null) {
            try {
                String[] split = a.split(",");
                if (split.length >= 2 && m4678j(split[1]) && m4678j(split[0])) {
                    if (z) {
                        m4625a(jSONObject, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    m4625a(jSONObject2, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                    jSONObject.put("geo", jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m4625a(JSONObject jSONObject, Float f, Float f2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(C10486a.m30630a("w0yrwBEUr1ini9hm/p022A==", C0379a.m1622a()), f2);
                jSONObject.put(C10486a.m30630a("LeHrqxcsm457V3n1/LcJVw==", C0379a.m1622a()), f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static boolean m4678j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    /* renamed from: l */
    public static boolean m4684l(Context context) {
        if (context != null) {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30;
            StringBuilder sb = new StringBuilder();
            sb.append("can query all package = ");
            sb.append(!z);
            C10638l.m31238c("ToolUtils", sb.toString());
            return !z;
        }
        throw new IllegalArgumentException("params context is null");
    }

    /* renamed from: k */
    public static String m4680k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        if (str.contains("kllk")) {
            return str.replace("kllk", "oppo");
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m4627a(long j, long j2) {
        long j3 = j2 - j;
        return j3 < Constants.MILLIS_IN_DAY && j3 > -86400000 && m4611a(j) == m4611a(j2);
    }

    /* renamed from: a */
    public static long m4611a(long j) {
        return (j + ((long) TimeZone.getDefault().getOffset(j))) / Constants.MILLIS_IN_DAY;
    }

    /* renamed from: a */
    public static void m4623a(String str, String str2, Context context) {
        int i;
        if (!TextUtils.isEmpty(str2) && context != null && m4687m(context)) {
            int i2 = 3572;
            int length = str2.length();
            int i3 = 0;
            int i4 = 1;
            if (length % 3572 == 0) {
                i = length / 3572;
            } else {
                i = (length / 3572) + 1;
            }
            while (i4 <= i) {
                if (i2 < length) {
                    Log.d(str, i + "-" + i4 + ":" + str2.substring(i3, i2));
                    i4++;
                    i3 = i2;
                    i2 += 3572;
                } else {
                    Log.d(str, i + "-" + i4 + ":" + str2.substring(i3));
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public static boolean m4687m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static long m4688n(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            C10638l.m31231a("ToolUtils", "targetSdkVersion = ", Integer.valueOf(i));
        } catch (Throwable unused) {
        }
        return (long) i;
    }

    /* renamed from: o */
    public static long m4692o(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
                C10638l.m31231a("ToolUtils", "minSdkVersion = ", Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
        return (long) i;
    }

    /* renamed from: l */
    public static void m4683l(final String str) {
        C10615e.m31160a(new C10618g("reportMultiLog") {
            public void run() {
                if (!C0996u.f3332c && C0558m.m2673h().mo1668F()) {
                    try {
                        boolean unused = C0996u.f3332c = true;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error", str);
                        C0796b.m3985a().mo2608a("reportMultiLog", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* renamed from: m */
    public static void m4686m(String str) {
        if (!TTAdSdk.isInitSuccess()) {
            C10638l.m31234b("You must use method '" + str + "' after initialization, please check.");
        }
    }

    /* renamed from: n */
    public static void m4690n(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C10638l.m31234b("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
        }
    }

    /* renamed from: p */
    public static int m4695p(Context context) {
        int b = C10642o.m31259b(context);
        if (b == 6) {
            return 5;
        }
        return b;
    }
}
