package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.adcolony.sdk.C6288e0;
import com.applovin.sdk.AppLovinEventTypes;
import com.appodeal.advertising.AdvertisingInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import p150io.bidmachine.ads.networks.adcolony.BuildConfig;

/* renamed from: com.adcolony.sdk.q */
class C6405q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6291f f13752a = new C6291f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6291f f13753b = new C6291f();

    /* renamed from: c */
    private String f13754c = "";

    /* renamed from: d */
    private boolean f13755d;

    /* renamed from: e */
    private String f13756e = "";

    /* renamed from: f */
    private C6294f1 f13757f = C6235c0.m15073b();

    /* renamed from: g */
    private String f13758g = "";

    /* renamed from: com.adcolony.sdk.q$a */
    class C6406a implements C6327j0 {

        /* renamed from: com.adcolony.sdk.q$a$a */
        class C6407a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13759a;

            /* renamed from: com.adcolony.sdk.q$a$a$a */
            class C6408a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C6294f1 f13760a;

                C6408a(C6294f1 f1Var) {
                    this.f13760a = f1Var;
                }

                public void run() {
                    C6407a.this.f13759a.mo50733a(this.f13760a).mo50736c();
                }
            }

            C6407a(C6406a aVar, C6312h0 h0Var) {
                this.f13759a = h0Var;
            }

            public void run() {
                C6509z0.m15953b((Runnable) new C6408a(C6185a.m14887b().mo50803n().mo50938c(2000)));
            }
        }

        C6406a(C6405q qVar) {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (!C6509z0.m15937a((Runnable) new C6407a(this, h0Var))) {
                new C6288e0.C6289a().mo50644a("Error retrieving device info, disabling AdColony.").mo50645a(C6288e0.f13498i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C6409b implements Callable<C6294f1> {

        /* renamed from: a */
        final /* synthetic */ long f13762a;

        C6409b(long j) {
            this.f13762a = j;
        }

        /* renamed from: b */
        public C6294f1 call() {
            if (!C6405q.this.mo50921N() && this.f13762a > 0) {
                C6405q.this.f13752a.mo50660a(this.f13762a);
            }
            return C6405q.this.mo50931b();
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C6410c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f13764a;

        /* renamed from: b */
        final /* synthetic */ C6493y f13765b;

        C6410c(Context context, C6493y yVar) {
            this.f13764a = context;
            this.f13765b = yVar;
        }

        public void run() {
            boolean z;
            String str;
            if (C6185a.f13244e) {
                str = AdvertisingInfo.defaultAdvertisingId;
                z = true;
            } else {
                str = null;
                z = false;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f13764a);
                    str = advertisingIdInfo.getId();
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (NoClassDefFoundError unused) {
                    new C6288e0.C6289a().mo50644a("Google Play Services Ads dependencies are missing.").mo50645a(C6288e0.f13495f);
                } catch (NoSuchMethodError unused2) {
                    new C6288e0.C6289a().mo50644a("Google Play Services is out of date, please update to GPS 4.0+.").mo50645a(C6288e0.f13495f);
                } catch (Exception e) {
                    new C6288e0.C6289a().mo50644a("Query Advertising ID failed with: ").mo50644a(Log.getStackTraceString(e)).mo50645a(C6288e0.f13496g);
                }
                if (str == null && Build.MANUFACTURER.equals("Amazon")) {
                    str = C6405q.this.mo50944g();
                    z = C6405q.this.mo50945h();
                }
            }
            if (str == null) {
                new C6288e0.C6289a().mo50644a("Advertising ID is not available. ").mo50644a("Collecting Android ID instead of Advertising ID.").mo50645a(C6288e0.f13495f);
                C6493y yVar = this.f13765b;
                if (yVar != null) {
                    yVar.mo50818a(new Throwable("Advertising ID is not available."));
                }
            } else {
                C6405q.this.mo50929a(str);
                C6424s0 a = C6185a.m14887b().mo50806q().mo50720a();
                if (a != null) {
                    a.f13807d.put("advertisingId", C6405q.this.mo50943f());
                }
                C6405q.this.mo50940c(z);
                C6493y yVar2 = this.f13765b;
                if (yVar2 != null) {
                    yVar2.mo50816a(C6405q.this.mo50943f());
                }
            }
            C6405q.this.mo50930a(true);
        }
    }

    /* renamed from: com.adcolony.sdk.q$d */
    class C6411d implements Callable<C6294f1> {

        /* renamed from: a */
        final /* synthetic */ long f13767a;

        C6411d(long j) {
            this.f13767a = j;
        }

        /* renamed from: b */
        public C6294f1 call() {
            if (!C6405q.this.mo50922O() && this.f13767a > 0) {
                C6405q.this.f13753b.mo50660a(this.f13767a);
            }
            return C6405q.this.mo50937c();
        }
    }

    /* renamed from: com.adcolony.sdk.q$e */
    class C6412e implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a */
        final /* synthetic */ C6493y f13769a;

        C6412e(C6493y yVar) {
            this.f13769a = yVar;
        }

        public void onComplete(Task<AppSetIdInfo> task) {
            Throwable th;
            if (task.isSuccessful()) {
                C6405q.this.mo50935b(task.getResult().getId());
                C6493y yVar = this.f13769a;
                if (yVar != null) {
                    yVar.mo50816a(C6405q.this.mo50948k());
                }
            } else {
                if (task.getException() != null) {
                    th = task.getException();
                } else {
                    th = new Throwable("Task failed with unknown exception.");
                }
                new C6288e0.C6289a().mo50644a("App Set ID is not available. Unexpected exception occurred: ").mo50644a(Log.getStackTraceString(th)).mo50645a(C6288e0.f13496g);
                C6493y yVar2 = this.f13769a;
                if (yVar2 != null) {
                    yVar2.mo50818a(th);
                }
            }
            C6405q.this.mo50936b(true);
        }
    }

    C6405q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo50908A() {
        return this.f13755d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo50909B() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo50910C() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo50911D() {
        ActivityManager activityManager;
        Context a = C6185a.m14880a();
        if (a == null || (activityManager = (ActivityManager) a.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public long mo50912E() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo50913F() {
        return Build.MODEL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo50914G() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return 2;
        }
        int i = a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo50915H() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public String mo50916I() {
        return BuildConfig.ADAPTER_SDK_VERSION_NAME;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public String mo50917J() {
        TelephonyManager telephonyManager;
        Context a = C6185a.m14880a();
        if (a == null || (telephonyManager = (TelephonyManager) a.getSystemService("phone")) == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo50918K() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public String mo50919L() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo50920M() {
        mo50930a(false);
        mo50936b(false);
        C6185a.m14886a("Device.get_info", (C6327j0) new C6406a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo50921N() {
        return this.f13752a.mo50662a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo50922O() {
        return this.f13753b.mo50662a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo50923P() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50940c(boolean z) {
        this.f13755d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6294f1 mo50941d() {
        C6294f1 b = C6235c0.m15073b();
        C6328k b2 = C6185a.m14887b();
        C6235c0.m15070a(b, "carrier_name", mo50950m());
        C6235c0.m15070a(b, "data_path", b2.mo50815z().mo51053b());
        C6235c0.m15077b(b, "device_api", mo50947j());
        Rect w = mo50960w();
        C6235c0.m15077b(b, "screen_width", w.width());
        C6235c0.m15077b(b, "screen_height", w.height());
        C6235c0.m15077b(b, "display_dpi", mo50959v());
        C6235c0.m15070a(b, "device_type", mo50958u());
        C6235c0.m15070a(b, "locale_language_code", mo50962y());
        C6235c0.m15070a(b, "ln", mo50962y());
        C6235c0.m15070a(b, "locale_country_code", mo50953p());
        C6235c0.m15070a(b, "locale", mo50953p());
        C6235c0.m15070a(b, "mac_address", mo50909B());
        C6235c0.m15070a(b, "manufacturer", mo50910C());
        C6235c0.m15070a(b, "device_brand", mo50910C());
        C6235c0.m15070a(b, "media_path", b2.mo50815z().mo51054c());
        C6235c0.m15070a(b, "temp_storage_path", b2.mo50815z().mo51055d());
        C6235c0.m15077b(b, "memory_class", mo50911D());
        C6235c0.m15078b(b, "memory_used_mb", mo50912E());
        C6235c0.m15070a(b, "model", mo50913F());
        C6235c0.m15070a(b, "device_model", mo50913F());
        C6235c0.m15070a(b, "sdk_type", "android_native");
        C6235c0.m15070a(b, "sdk_version", mo50916I());
        C6235c0.m15070a(b, "network_type", b2.mo50808s().mo50844e());
        C6235c0.m15070a(b, "os_version", mo50915H());
        C6235c0.m15070a(b, "os_name", "android");
        C6235c0.m15070a(b, "platform", "android");
        C6235c0.m15070a(b, "arch", mo50924a());
        C6235c0.m15070a(b, "user_id", C6235c0.m15087h(b2.mo50810u().mo50290b(), "user_id"));
        C6235c0.m15070a(b, "app_id", b2.mo50810u().mo50289a());
        C6235c0.m15070a(b, "app_bundle_name", C6509z0.m15946b());
        C6235c0.m15070a(b, "app_bundle_version", C6509z0.m15956c());
        C6235c0.m15067a(b, "battery_level", mo50949l());
        C6235c0.m15070a(b, "cell_service_country_code", mo50917J());
        C6235c0.m15070a(b, "timezone_ietf", mo50919L());
        C6235c0.m15077b(b, "timezone_gmt_m", mo50918K());
        C6235c0.m15077b(b, "timezone_dst_m", mo50954q());
        C6235c0.m15069a(b, "launch_metadata", mo50963z());
        C6235c0.m15070a(b, "controller_version", b2.mo50795f());
        C6235c0.m15077b(b, "current_orientation", mo50914G());
        C6235c0.m15079b(b, "cleartext_permitted", mo50951n());
        C6235c0.m15067a(b, "density", (double) mo50956s());
        C6235c0.m15079b(b, "dark_mode", mo50955r());
        C6235c0.m15070a(b, "adc_alt_id", mo50942e());
        C6290e1 a = C6235c0.m15059a();
        if (C6509z0.m15958c("com.android.vending")) {
            a.mo50652b("google");
        }
        if (C6509z0.m15958c("com.amazon.venezia")) {
            a.mo50652b(p150io.bidmachine.ads.networks.amazon.BuildConfig.ADAPTER_NAME);
        }
        if (C6509z0.m15958c("com.huawei.appmarket")) {
            a.mo50652b("huawei");
        }
        if (C6509z0.m15958c("com.sec.android.app.samsungapps")) {
            a.mo50652b("samsung");
        }
        C6235c0.m15068a(b, "available_stores", a);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo50942e() {
        return C6509z0.m15931a(C6185a.m14887b().mo50815z());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo50943f() {
        return this.f13754c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo50944g() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return null;
        }
        return Settings.Secure.getString(a.getContentResolver(), "advertising_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo50945h() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(a.getContentResolver(), "limit_ad_tracking") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo50946i() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return "";
        }
        return Settings.Secure.getString(a.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo50947j() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: k */
    public String mo50948k() {
        return this.f13756e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public double mo50949l() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return ((double) intExtra) / ((double) intExtra2);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo50950m() {
        Context a = C6185a.m14880a();
        String str = "";
        if (a == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo50951n() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo50952o() {
        return this.f13758g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo50953p() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo50954q() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo50955r() {
        int i;
        Context a = C6185a.m14880a();
        if (a == null || Build.VERSION.SDK_INT < 29 || (i = a.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo50956s() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return 0.0f;
        }
        return a.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C6294f1 mo50957t() {
        if (!mo50921N()) {
            try {
                return C6509z0.m15945b(C6235c0.m15064a(mo50941d(), mo50925a(2000).call()));
            } catch (Exception unused) {
            }
        }
        return C6509z0.m15945b(C6235c0.m15064a(mo50941d(), mo50931b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo50958u() {
        return mo50923P() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo50959v() {
        Context a = C6185a.m14880a();
        if (a == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return a.getResources().getConfiguration().densityDpi;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Rect mo50960w() {
        Rect rect = new Rect();
        Context a = C6185a.m14880a();
        if (a == null) {
            return rect;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return rect;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (RuntimeException unused) {
            return rect;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r2.getWindowInsets().getInsetsIgnoringVisibility((android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.displayCutout()) | android.view.WindowInsets.Type.statusBars());
        r1 = new android.graphics.Rect(0, 0, r2.getBounds().width() - (r1.right + r1.left), r2.getBounds().height() - (r1.top + r1.bottom));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d8 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect mo50961x() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.Context r1 = com.adcolony.sdk.C6185a.m14880a()
            if (r1 == 0) goto L_0x0111
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch:{ RuntimeException -> 0x0111 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x0111 }
            if (r2 == 0) goto L_0x0111
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 17
            r5 = 0
            if (r3 >= r4) goto L_0x0039
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C6509z0.m15965f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r1
            r2.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r2
            goto L_0x0111
        L_0x0039:
            r4 = 30
            if (r3 >= r4) goto L_0x008d
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            r2.getRealMetrics(r4)     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = com.adcolony.sdk.C6509z0.m15965f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C6509z0.m15942b((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x006d
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r2
            r1.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x006a:
            r0 = r1
            goto L_0x0111
        L_0x006d:
            if (r1 <= 0) goto L_0x0082
            if (r6 > r2) goto L_0x0074
            if (r1 <= r2) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1 + r2
            int r4 = r4 - r1
            r6.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r6
            goto L_0x0111
        L_0x0082:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 - r2
            r1.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x008d:
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.view.Display r1 = r1.getDisplay()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.getCurrentSizeRange(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r1 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.width()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r6 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r6 = r6.height()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r7 = 2
            if (r1 <= r6) goto L_0x00b7
            r1 = 2
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            if (r1 != r7) goto L_0x00c4
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r4, r3)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            goto L_0x00cd
        L_0x00c4:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
        L_0x00cd:
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r1.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>(r5, r5, r4, r1)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r0 = r3
            goto L_0x0111
        L_0x00d8:
            android.view.WindowInsets r1 = r2.getWindowInsets()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = android.view.WindowInsets.Type.navigationBars()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = android.view.WindowInsets.Type.displayCutout()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            int r4 = android.view.WindowInsets.Type.statusBars()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            android.graphics.Insets r1 = r1.getInsetsIgnoringVisibility(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r3 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.width()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.right     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r1.left     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r6
            int r3 = r3 - r4
            android.graphics.Rect r2 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = r2.height()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.top     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1.bottom     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r1
            int r2 = r2 - r4
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            r1.<init>(r5, r5, r3, r2)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6405q.mo50961x():android.graphics.Rect");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo50962y() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C6294f1 mo50963z() {
        return this.f13757f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50928a(C6294f1 f1Var) {
        this.f13757f = f1Var;
    }

    /* renamed from: b */
    public void mo50935b(String str) {
        this.f13756e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50939c(String str) {
        this.f13758g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50929a(String str) {
        this.f13754c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50936b(boolean z) {
        this.f13753b.mo50661a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50930a(boolean z) {
        this.f13752a.mo50661a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50931b() {
        C6294f1 b = C6235c0.m15073b();
        String f = mo50943f();
        C6235c0.m15070a(b, "advertiser_id", f);
        C6235c0.m15079b(b, "limit_tracking", mo50908A());
        if (f == null || f.isEmpty()) {
            C6235c0.m15070a(b, "android_id_sha1", C6509z0.m15950b(mo50946i()));
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6294f1 mo50938c(long j) {
        if (j <= 0) {
            return C6235c0.m15064a(mo50941d(), mo50931b(), mo50937c());
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(mo50941d()));
        C6413q0 q0Var = new C6413q0();
        if (mo50921N()) {
            arrayList.add(mo50931b());
        } else {
            q0Var.mo50973a(mo50925a(j));
        }
        if (mo50922O()) {
            arrayList.add(mo50937c());
        } else {
            q0Var.mo50973a(mo50932b(j));
        }
        if (!q0Var.mo50974b()) {
            arrayList.addAll(q0Var.mo50971a());
        }
        return C6235c0.m15064a((C6294f1[]) arrayList.toArray(new C6294f1[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo50924a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Callable<C6294f1> mo50925a(long j) {
        return new C6409b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50926a(Context context) {
        mo50927a(context, (C6493y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50927a(Context context, C6493y<String> yVar) {
        if (context != null) {
            if (mo50943f().isEmpty()) {
                mo50930a(false);
            }
            if (!C6509z0.m15937a((Runnable) new C6410c(context, yVar))) {
                new C6288e0.C6289a().mo50644a("Executing Query Advertising ID failed.").mo50645a(C6288e0.f13498i);
                if (yVar != null) {
                    yVar.mo50818a(new Throwable("Query Advertising ID failed on execute."));
                }
            } else {
                return;
            }
        } else if (yVar != null) {
            yVar.mo50818a(new Throwable("Context cannot be null."));
        }
        mo50930a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Callable<C6294f1> mo50932b(long j) {
        return new C6411d(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50933b(Context context) {
        mo50934b(context, (C6493y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50934b(android.content.Context r3, com.adcolony.sdk.C6493y<java.lang.String> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r0 = "Context cannot be null."
            r3.<init>(r0)
            r4.mo50818a((java.lang.Throwable) r3)
            goto L_0x0080
        L_0x000f:
            java.lang.String r0 = r2.mo50948k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r4 == 0) goto L_0x0080
            java.lang.String r3 = r2.mo50948k()
            r4.mo50816a(r3)
            goto L_0x0080
        L_0x0023:
            r0 = 0
            r2.mo50936b((boolean) r0)
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.appset.AppSetIdClient r3 = com.google.android.gms.appset.AppSet.getClient(r3)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.tasks.Task r3 = r3.getAppSetIdInfo()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.adcolony.sdk.q$e r0 = new com.adcolony.sdk.q$e     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r0.<init>(r4)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r3.addOnCompleteListener(r0)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            return
        L_0x003c:
            r3 = move-exception
            com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
            r0.<init>()
            java.lang.String r1 = "Query App Set ID failed with: "
            com.adcolony.sdk.e0$a r0 = r0.mo50644a((java.lang.String) r1)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.adcolony.sdk.e0$a r3 = r0.mo50644a((java.lang.String) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C6288e0.f13496g
            r3.mo50645a((com.adcolony.sdk.C6288e0) r0)
            goto L_0x0066
        L_0x0056:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "Google Play Services App Set dependency is missing."
            com.adcolony.sdk.e0$a r3 = r3.mo50644a((java.lang.String) r0)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C6288e0.f13495f
            r3.mo50645a((com.adcolony.sdk.C6288e0) r0)
        L_0x0066:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "App Set ID is not available."
            com.adcolony.sdk.e0$a r3 = r3.mo50644a((java.lang.String) r0)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C6288e0.f13495f
            r3.mo50645a((com.adcolony.sdk.C6288e0) r1)
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r0)
            r4.mo50818a((java.lang.Throwable) r3)
        L_0x0080:
            r3 = 1
            r2.mo50936b((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6405q.mo50934b(android.content.Context, com.adcolony.sdk.y):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6294f1 mo50937c() {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "app_set_id", mo50948k());
        return b;
    }
}
