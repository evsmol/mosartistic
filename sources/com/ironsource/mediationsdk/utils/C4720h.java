package com.ironsource.mediationsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ironsource.mediationsdk.utils.h */
public final class C4720h implements Runnable {

    /* renamed from: A */
    private final String f11805A = "mnc";

    /* renamed from: B */
    private final String f11806B = "icc";

    /* renamed from: C */
    private final String f11807C = "tz";

    /* renamed from: D */
    private final String f11808D = "auid";

    /* renamed from: E */
    private Context f11809E;

    /* renamed from: a */
    private final String f11810a = getClass().getSimpleName();

    /* renamed from: b */
    private final String f11811b = "bundleId";

    /* renamed from: c */
    private final String f11812c = "advertisingId";

    /* renamed from: d */
    private final String f11813d = "isLimitAdTrackingEnabled";

    /* renamed from: e */
    private final String f11814e = Constants.APP_KEY;

    /* renamed from: f */
    private final String f11815f = "deviceOS";

    /* renamed from: g */
    private final String f11816g = "osVersion";

    /* renamed from: h */
    private final String f11817h = "connectionType";

    /* renamed from: i */
    private final String f11818i = "language";

    /* renamed from: j */
    private final String f11819j = "deviceOEM";

    /* renamed from: k */
    private final String f11820k = "deviceModel";

    /* renamed from: l */
    private final String f11821l = "mobileCarrier";

    /* renamed from: m */
    private final String f11822m = "externalFreeMemory";

    /* renamed from: n */
    private final String f11823n = "internalFreeMemory";

    /* renamed from: o */
    private final String f11824o = "battery";

    /* renamed from: p */
    private final String f11825p = "gmtMinutesOffset";

    /* renamed from: q */
    private final String f11826q = "appVersion";

    /* renamed from: r */
    private final String f11827r = "sessionId";

    /* renamed from: s */
    private final String f11828s = "pluginType";

    /* renamed from: t */
    private final String f11829t = "pluginVersion";

    /* renamed from: u */
    private final String f11830u = "plugin_fw_v";

    /* renamed from: v */
    private final String f11831v = "jb";

    /* renamed from: w */
    private final String f11832w = "advertisingIdType";

    /* renamed from: x */
    private final String f11833x = "mt";

    /* renamed from: y */
    private final String f11834y = "firstSession";

    /* renamed from: z */
    private final String f11835z = "mcc";

    private C4720h() {
    }

    public C4720h(Context context) {
        this.f11809E = context.getApplicationContext();
    }

    /* renamed from: a */
    private static String m13806a() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* renamed from: b */
    private static String m13807b() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    /* renamed from: c */
    private static String m13808c() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* renamed from: d */
    private String m13809d() {
        try {
            return this.f11809E.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    private static String m13810e() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private static String m13811f() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static String m13812g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    private static String m13813h() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    private String m13814i() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f11809E.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f11810a + ":getMobileCarrier()", e);
            return "";
        }
    }

    /* renamed from: j */
    private static boolean m13815j() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    private static long m13816k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / C8850d.f22423fc;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private int m13817l() {
        try {
            Intent registerReceiver = this.f11809E.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f11810a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    /* renamed from: m */
    private int m13818m() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round((float) (((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15)) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f11810a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015b A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015c A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0190 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b4 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c9 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01da A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0209 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0218 A[Catch:{ Exception -> 0x0245 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0245 }
            r0.<init>()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = r9.m13809d()     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = "bundleId"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
            android.content.Context r2 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = com.ironsource.environment.C4386c.m12480c(r2, r1)     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = "appVersion"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x002e:
            java.lang.String r1 = "appKey"
            com.ironsource.mediationsdk.H r2 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r2 = r2.f10652j     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0245 }
            android.content.Context r1 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String[] r1 = com.ironsource.environment.C4407h.m12535C(r1)     // Catch:{ Exception -> 0x0245 }
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L_0x0060
            int r5 = r1.length     // Catch:{ Exception -> 0x0245 }
            r6 = 2
            if (r5 != r6) goto L_0x0060
            r5 = r1[r4]     // Catch:{ Exception -> 0x0245 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0245 }
            if (r5 != 0) goto L_0x0054
            r5 = r1[r4]     // Catch:{ Exception -> 0x0245 }
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r1 = r1[r2]     // Catch:{ Exception -> 0x0245 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0245 }
            goto L_0x0062
        L_0x0060:
            r5 = r3
            r1 = 0
        L_0x0062:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0245 }
            if (r6 != 0) goto L_0x006b
            java.lang.String r3 = "GAID"
            goto L_0x0079
        L_0x006b:
            android.content.Context r5 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = com.ironsource.environment.C4407h.m12587x(r5)     // Catch:{ Exception -> 0x0245 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0245 }
            if (r6 != 0) goto L_0x0079
            java.lang.String r3 = "UUID"
        L_0x0079:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0245 }
            if (r6 != 0) goto L_0x0092
            java.lang.String r6 = "advertisingId"
            r0.put(r6, r5)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r5 = "advertisingIdType"
            r0.put(r5, r3)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "isLimitAdTrackingEnabled"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0092:
            java.lang.String r1 = "deviceOS"
            java.lang.String r3 = "Android"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = m13810e()     // Catch:{ Exception -> 0x0245 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r1 != 0) goto L_0x00ac
            java.lang.String r1 = "osVersion"
            java.lang.String r3 = m13810e()     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0245 }
        L_0x00ac:
            android.content.Context r1 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getConnectionType(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = "connectionType"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x00bd:
            java.lang.String r1 = "sdkVersion"
            java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = m13811f()     // Catch:{ Exception -> 0x0245 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r3 != 0) goto L_0x00d5
            java.lang.String r3 = "language"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x00d5:
            java.lang.String r1 = m13812g()     // Catch:{ Exception -> 0x0245 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = "deviceOEM"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x00e4:
            java.lang.String r1 = m13813h()     // Catch:{ Exception -> 0x0245 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r3 != 0) goto L_0x00f3
            java.lang.String r3 = "deviceModel"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x00f3:
            java.lang.String r1 = r9.m13814i()     // Catch:{ Exception -> 0x0245 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r3 != 0) goto L_0x0102
            java.lang.String r3 = "mobileCarrier"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0102:
            long r5 = m13816k()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = "internalFreeMemory"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0245 }
            boolean r1 = m13815j()     // Catch:{ Exception -> 0x0245 }
            if (r1 == 0) goto L_0x0133
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0245 }
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0245 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0245 }
            int r1 = r3.getBlockSize()     // Catch:{ Exception -> 0x0245 }
            long r5 = (long) r1     // Catch:{ Exception -> 0x0245 }
            int r1 = r3.getAvailableBlocks()     // Catch:{ Exception -> 0x0245 }
            long r7 = (long) r1     // Catch:{ Exception -> 0x0245 }
            long r7 = r7 * r5
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r7 / r5
            goto L_0x0135
        L_0x0133:
            r7 = -1
        L_0x0135:
            java.lang.String r1 = "externalFreeMemory"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x0245 }
            int r1 = r9.m13817l()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "battery"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x0245 }
            int r1 = r9.m13818m()     // Catch:{ Exception -> 0x0245 }
            r3 = 840(0x348, float:1.177E-42)
            if (r1 > r3) goto L_0x015c
            r3 = -720(0xfffffffffffffd30, float:NaN)
            if (r1 < r3) goto L_0x015c
            int r3 = r1 % 15
            if (r3 != 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r2 = 0
        L_0x015d:
            if (r2 == 0) goto L_0x0168
            java.lang.String r2 = "gmtMinutesOffset"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0168:
            java.lang.String r1 = m13806a()     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x0177
            java.lang.String r2 = "pluginType"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0177:
            java.lang.String r1 = m13807b()     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x0186
            java.lang.String r2 = "pluginVersion"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0186:
            java.lang.String r1 = m13808c()     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x0195
            java.lang.String r2 = "plugin_fw_v"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x0195:
            boolean r1 = com.ironsource.environment.C4407h.m12564j()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x01a8
            java.lang.String r2 = "jb"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x01a8:
            com.ironsource.mediationsdk.H r1 = com.ironsource.mediationsdk.C4455H.m12683a()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = r1.f10657o     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x01b9
            java.lang.String r2 = "mt"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x01b9:
            android.content.Context r1 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r1)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x01ce
            java.lang.String r2 = "firstSession"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x01ce:
            android.content.Context r1 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = com.ironsource.environment.C4407h.m12588y(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x01df
            java.lang.String r2 = "auid"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x01df:
            java.lang.String r1 = "mcc"
            android.content.Context r2 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            int r2 = com.ironsource.environment.C4377a.C43781.m12462c((android.content.Context) r2)     // Catch:{ Exception -> 0x0245 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = "mnc"
            android.content.Context r2 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            int r2 = com.ironsource.environment.C4377a.C43781.m12465d(r2)     // Catch:{ Exception -> 0x0245 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0245 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0245 }
            android.content.Context r1 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = com.ironsource.environment.C4407h.m12563j(r1)     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x020e
            java.lang.String r2 = "icc"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x020e:
            java.lang.String r1 = com.ironsource.environment.C4407h.m12547c()     // Catch:{ Exception -> 0x0245 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0245 }
            if (r2 != 0) goto L_0x021d
            java.lang.String r2 = "tz"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0245 }
        L_0x021d:
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x0245 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "collecting data for events: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0245 }
            r2.append(r0)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0245 }
            r1.verbose(r2)     // Catch:{ Exception -> 0x0245 }
            com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C4675e.m13718a()     // Catch:{ Exception -> 0x0245 }
            r1.mo34129a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ Exception -> 0x0245 }
            android.content.Context r0 = r9.f11809E     // Catch:{ Exception -> 0x0245 }
            com.ironsource.mediationsdk.sdk.e r1 = com.ironsource.mediationsdk.sdk.C4675e.m13718a()     // Catch:{ Exception -> 0x0245 }
            org.json.JSONObject r1 = r1.mo34130b()     // Catch:{ Exception -> 0x0245 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveGeneralProperties(r0, r1)     // Catch:{ Exception -> 0x0245 }
            return
        L_0x0245:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Thread name = "
            r3.<init>(r4)
            java.lang.Class r4 = r9.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.logException(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4720h.run():void");
    }
}
