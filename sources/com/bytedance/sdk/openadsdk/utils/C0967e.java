package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10639m;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0621r;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.utils.e */
/* compiled from: DeviceUtils */
public class C0967e {

    /* renamed from: a */
    public static String f3294a = "";

    /* renamed from: b */
    private static volatile boolean f3295b = false;

    /* renamed from: c */
    private static volatile boolean f3296c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile boolean f3297d = false;

    /* renamed from: e */
    private static volatile boolean f3298e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f3299f = true;

    /* renamed from: g */
    private static long f3300g;

    /* renamed from: h */
    private static int f3301h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f3302i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static int f3303j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static int f3304k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static int f3305l;

    @JProtect
    /* renamed from: a */
    public static JSONObject m4484a(Context context, boolean z) {
        for (char c = 'l'; c > 11; c = 65534) {
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", m4503g(context));
            m4486a(jSONObject);
            jSONObject.put("type", m4498d(context));
            int i = 1;
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE + "");
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", C0996u.m4695p(context));
            jSONObject.put("screen_width", C1002v.m4740c(context));
            jSONObject.put("screen_height", C1002v.m4744d(context));
            if (C0558m.m2673h().mo1665C()) {
                jSONObject.put("sec_did", C0621r.m3009a().mo2022c());
            }
            C0516f h = C0558m.m2673h();
            if (h.mo1715p("boot")) {
                jSONObject.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            }
            jSONObject.put(Constants.UUID, C0517j.m2478c(context));
            jSONObject.put("rom_version", C0985m.m4554a());
            jSONObject.put("sys_compiling_time", C0517j.m2477b(context));
            jSONObject.put("timezone", C0996u.m4697q());
            jSONObject.put("language", C0517j.m2473a());
            jSONObject.put("carrier_name", C0988n.m4581a());
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(z ? C0996u.m4616a(context) : C0996u.m4633b(context)) * 1024));
            jSONObject.put("locale_language", m4495c());
            jSONObject.put("screen_bright", Math.ceil((double) (m4497d() * 10.0f)) / 10.0d);
            if (m4487a()) {
                i = 0;
            }
            jSONObject.put("is_screen_off", i);
            jSONObject.put("cpu_num", C0996u.m4640c(context));
            jSONObject.put("cpu_max_freq", C0996u.m4646d(context));
            jSONObject.put("cpu_min_freq", C0996u.m4652e(context));
            jSONObject.put("battery_remaining_pct", (int) C0972c.m4528b());
            jSONObject.put("is_charging", C0972c.m4527a());
            jSONObject.put("total_space", String.valueOf(C0996u.m4658f(context)));
            jSONObject.put("free_space_in", String.valueOf(C0996u.m4663g(context)));
            jSONObject.put("sdcard_size", String.valueOf(C0996u.m4668h(context)));
            jSONObject.put("rooted", C0996u.m4671i(context));
            jSONObject.put("enable_assisted_clicking", m4499e());
            jSONObject.put("force_language", C10647t.m31276a(context, "tt_choose_language"));
            jSONObject.put("airplane", m4506h(context));
            jSONObject.put("darkmode", m4514n(context));
            jSONObject.put("headset", m4515o(context));
            jSONObject.put("ringmute", m4516p(context));
            jSONObject.put("screenscale", (double) m4517q(context));
            jSONObject.put("volume", m4518r(context));
            jSONObject.put("low_power_mode", m4519s(context));
            if (h.mo1715p("mnc")) {
                jSONObject.put("mnc", C0988n.m4583c());
            }
            if (h.mo1715p("mcc")) {
                jSONObject.put("mcc", C0988n.m4582b());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: a */
    public static void m4485a(Context context) {
        if (!f3295b) {
            try {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    f3299f = powerManager.isScreenOn();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                C0974e eVar = new C0974e();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(eVar, intentFilter);
                f3295b = true;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m4486a(JSONObject jSONObject) throws JSONException {
        m4491b(jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        switch(r2) {
            case 52: goto L_0x0054;
            case 53: goto L_0x0043;
            case 54: goto L_0x0037;
            default: goto L_0x0042;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        switch(r3) {
            case 29: goto L_0x0037;
            case 30: goto L_0x0054;
            case 31: goto L_0x003f;
            default: goto L_0x0046;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r3 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0057 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4487a() {
        /*
            boolean r0 = f3299f
            if (r0 != 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = f3300g
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            f3300g = r0
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0057 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0057 }
            r2 = 20
            r3 = 55
            if (r1 < r2) goto L_0x0033
            boolean r0 = r0.isInteractive()     // Catch:{ all -> 0x0057 }
            r1 = 0
            goto L_0x0051
        L_0x0033:
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x0057 }
        L_0x0037:
            r1 = 73
            r2 = 16
        L_0x003b:
            switch(r1) {
                case 72: goto L_0x005b;
                case 73: goto L_0x0049;
                case 74: goto L_0x003f;
                default: goto L_0x003e;
            }     // Catch:{ all -> 0x0057 }
        L_0x003e:
            goto L_0x0054
        L_0x003f:
            switch(r2) {
                case 52: goto L_0x0054;
                case 53: goto L_0x0043;
                case 54: goto L_0x0037;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x0057 }
        L_0x0042:
            goto L_0x0050
        L_0x0043:
            switch(r3) {
                case 29: goto L_0x0037;
                case 30: goto L_0x0054;
                case 31: goto L_0x003f;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x0057 }
        L_0x0046:
            r3 = 30
            goto L_0x0043
        L_0x0049:
            r1 = 57
            if (r2 > r1) goto L_0x0050
            f3299f = r0     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0050:
            r1 = r2
        L_0x0051:
            f3299f = r0     // Catch:{ all -> 0x0057 }
            r2 = r1
        L_0x0054:
            r1 = 72
            goto L_0x003b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            boolean r0 = f3299f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0967e.m4487a():boolean");
    }

    /* renamed from: b */
    public static int m4489b() {
        return C0434c.m1779a(C0558m.m2663a()).mo1178b("limit_ad_track", -1);
    }

    /* renamed from: b */
    private static void m4491b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (C0558m.m2673h().mo1715p("gaid")) {
            jSONObject.put("gaid", C1010a.m4777a().mo2932b());
        }
    }

    /* renamed from: b */
    public static boolean m4492b(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m4495c() {
        if (Build.VERSION.SDK_INT < 21) {
            return Locale.getDefault().getLanguage();
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    /* renamed from: c */
    public static boolean m4496c(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static float m4497d() {
        int i = -1;
        try {
            Context a = C0558m.m2663a();
            if (a != null) {
                i = Settings.System.getInt(a.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            C10638l.m31242e("DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return ((float) Math.round((((float) i) / 255.0f) * 10.0f)) / 10.0f;
    }

    /* renamed from: d */
    public static int m4498d(Context context) {
        if (m4496c(context)) {
            return 3;
        }
        return m4492b(context) ? 2 : 1;
    }

    /* renamed from: e */
    public static int m4499e() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C0558m.m2663a().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    /* renamed from: e */
    public static JSONObject m4500e(Context context) {
        return m4484a(context, false);
    }

    @JProtect
    /* renamed from: f */
    public static void m4501f() {
        new C0975f().run();
        Context a = C0558m.m2663a();
        if (a != null) {
            C0434c.m1779a(a).mo1174a("cpu_count", C0996u.m4667h());
            C0434c.m1779a(a).mo1174a("cpu_max_frequency", C0996u.m4639c(C0996u.m4667h()));
            C0434c.m1779a(a).mo1174a("cpu_min_frequency", C0996u.m4645d(C0996u.m4667h()));
            String e = C0996u.m4655e(a, "MemTotal");
            if (e != null) {
                C0434c.m1779a(a).mo1176a("total_memory", e);
            }
            C0434c.m1779a(a).mo1175a("total_internal_storage", C0996u.m4672i());
            C0434c.m1779a(a).mo1175a("free_internal_storage", C10639m.m31243a());
            C0434c.m1779a(a).mo1175a("total_sdcard_storage", C0996u.m4675j());
            C0434c.m1779a(a).mo1174a("is_root", C0996u.m4681k() ? 1 : 0);
            if (TextUtils.isEmpty(m4508i(a))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    f3294a = "unity";
                } catch (ClassNotFoundException unused) {
                    f3294a = "native";
                }
                C0434c.m1779a(a).mo1176a("framework_name", f3294a);
            }
            m4504g();
            m4520t(a);
            f3305l = m4522v(a);
        }
    }

    /* renamed from: f */
    public static void m4502f(Context context) {
        if (!f3296c) {
            try {
                C0971b bVar = new C0971b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                context.registerReceiver(bVar, intentFilter);
                f3296c = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static int m4503g(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(Build.VERSION.SDK_INT >= 17 ? context.getContentResolver() : context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            C10638l.m31242e("DeviceUtils", th.getMessage());
            return -1;
        }
    }

    /* renamed from: g */
    public static void m4504g() {
        try {
            int ringerMode = ((AudioManager) C0558m.m2663a().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f3301h = 1;
            } else if (ringerMode == 1) {
                f3301h = 2;
            } else {
                f3301h = 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static int m4506h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public static String m4508i(Context context) {
        if (TextUtils.isEmpty(f3294a)) {
            f3294a = C0434c.m1779a(context).mo1180b("framework_name", "");
        }
        return f3294a;
    }

    /* renamed from: j */
    public static void m4509j(Context context) {
        if (context != null) {
            C0970a.m4526b(context.getApplicationContext());
        }
    }

    /* renamed from: k */
    public static void m4511k(Context context) {
        Context applicationContext;
        if (!f3298e && context != null && (applicationContext = context.getApplicationContext()) != null) {
            try {
                if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                    m4524x(applicationContext);
                } else {
                    C0973d.m4530b(applicationContext);
                }
                f3298e = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: n */
    private static int m4514n(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: o */
    private static int m4515o(Context context) {
        return f3304k;
    }

    /* renamed from: p */
    private static int m4516p(Context context) {
        return f3301h;
    }

    /* renamed from: q */
    private static float m4517q(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: r */
    private static int m4518r(Context context) {
        return f3303j;
    }

    /* renamed from: s */
    private static int m4519s(Context context) {
        return f3305l;
    }

    /* renamed from: t */
    private static void m4520t(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f3302i = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f3303j = streamVolume;
            f3303j = (int) ((((double) streamVolume) / ((double) f3302i)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m4521u(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C10615e.m31160a(new C10618g("DeviceUtils_get_low_power_mode") {
                public void run() {
                    int unused = C0967e.f3305l = C0967e.m4522v(applicationContext);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static int m4522v(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                    return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
                }
            }
            return m4523w(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L_0x001a;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m4523w(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r2 = r1
            goto L_0x0034
        L_0x001c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            r0 = 4
            if (r4 != r0) goto L_0x0019
            goto L_0x001a
        L_0x0034:
            return r2
        L_0x0035:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0967e.m4523w(android.content.Context):int");
    }

    /* renamed from: x */
    private static void m4524x(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver((Handler) null) {
                public void onChange(boolean z) {
                    super.onChange(z);
                    C0967e.m4521u(applicationContext);
                }
            });
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$e */
    /* compiled from: DeviceUtils */
    static class C0974e extends BroadcastReceiver {
        C0974e() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = C0967e.f3299f = true;
                C10638l.m31238c("DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = C0967e.f3299f = false;
                C10638l.m31238c("DeviceUtils", "screen_off");
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$f */
    /* compiled from: DeviceUtils */
    public static class C0975f implements Runnable {
        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C0558m.m2663a());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (C0558m.m2673h().mo1715p("gaid")) {
                        String id = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id)) {
                            C1010a.m4777a().mo2933b(id);
                            C1010a.m4778a(id);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    C0434c.m1779a(C0558m.m2663a()).mo1174a("limit_ad_track", i);
                }
            } catch (IOException e) {
                C10638l.m31239c("DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (GooglePlayServicesNotAvailableException e2) {
                C10638l.m31239c("DeviceUtils", "getLmtTask error : indicating that Google Play is not installed on this device.", e2);
            } catch (GooglePlayServicesRepairableException e3) {
                C10638l.m31239c("DeviceUtils", "getLmtTask error : indicating that there was a recoverable error connecting to Google Play Services.", e3);
            } catch (Throwable th) {
                C10638l.m31242e("DeviceUtils", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$c */
    /* compiled from: DeviceUtils */
    public static class C0972c {

        /* renamed from: a */
        static int f3308a = -1;

        /* renamed from: b */
        static float f3309b;

        /* renamed from: a */
        public static int m4527a() {
            return f3308a;
        }

        /* renamed from: b */
        public static float m4528b() {
            return f3309b;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$b */
    /* compiled from: DeviceUtils */
    static class C0971b extends BroadcastReceiver {
        C0971b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("status", -1);
                if (intExtra == -1) {
                    C0972c.f3308a = intExtra;
                }
                if (intExtra == 2) {
                    C0972c.f3308a = 1;
                } else {
                    C0972c.f3308a = 0;
                }
                C0972c.f3309b = ((float) (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100)) / ((float) intent.getIntExtra("scale", -1));
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$a */
    /* compiled from: DeviceUtils */
    static class C0970a extends BroadcastReceiver {
        C0970a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = C0967e.f3303j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (C0967e.f3302i != 0) {
                            int unused2 = C0967e.f3303j = (int) ((((double) C0967e.f3303j) / ((double) C0967e.f3302i)) * 100.0d);
                        }
                    }
                } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = C0967e.f3304k = intent.getIntExtra("state", 0);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m4526b(Context context) {
            if (!C0967e.f3297d && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new C0970a(), intentFilter);
                    boolean unused = C0967e.f3297d = true;
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$d */
    /* compiled from: DeviceUtils */
    private static class C0973d extends BroadcastReceiver {
        private C0973d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    C0967e.m4521u(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i = 1;
                    }
                    int unused = C0967e.f3305l = i;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m4530b(Context context) {
            if (Build.VERSION.SDK_INT >= 21 && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                context.registerReceiver(new C0973d(), intentFilter);
            }
        }
    }
}
