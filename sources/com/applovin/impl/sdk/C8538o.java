package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p255d.C8395g;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8412f;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8566d;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8614n;
import com.applovin.impl.sdk.utils.C8618q;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.o */
public class C8538o {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final AtomicReference<C8544a> f21559h = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicReference<C8545b> f21560j = new AtomicReference<>();

    /* renamed from: a */
    private final C8490n f21561a;

    /* renamed from: b */
    private final C8626v f21562b;

    /* renamed from: c */
    private final Context f21563c;

    /* renamed from: d */
    private final Map<String, Object> f21564d;

    /* renamed from: e */
    private final Object f21565e = new Object();

    /* renamed from: f */
    private final Map<String, Object> f21566f;

    /* renamed from: g */
    private boolean f21567g;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<Integer> f21568i = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.o$a */
    public static class C8544a {

        /* renamed from: a */
        public boolean f21574a;

        /* renamed from: b */
        public String f21575b = "";

        /* renamed from: c */
        public C8547d f21576c = C8547d.NOT_SET;
    }

    /* renamed from: com.applovin.impl.sdk.o$b */
    public static class C8545b {

        /* renamed from: a */
        public final String f21577a;

        /* renamed from: b */
        public final int f21578b;

        public C8545b(String str, int i) {
            this.f21577a = str;
            this.f21578b = i;
        }
    }

    /* renamed from: com.applovin.impl.sdk.o$c */
    public static class C8546c {

        /* renamed from: a */
        public int f21579a = -1;

        /* renamed from: b */
        public int f21580b = -1;
    }

    /* renamed from: com.applovin.impl.sdk.o$d */
    public enum C8547d {
        NOT_SET("dnt_not_set"),
        ON("dnt_on"),
        OFF("dnt_off");
        

        /* renamed from: d */
        private final String f21585d;

        private C8547d(String str) {
            this.f21585d = str;
        }

        /* renamed from: a */
        public String mo57643a() {
            return this.f21585d;
        }
    }

    protected C8538o(C8490n nVar) {
        if (nVar != null) {
            this.f21561a = nVar;
            this.f21562b = nVar.mo57320D();
            this.f21563c = nVar.mo57332P();
            this.f21564d = m25962q();
            this.f21566f = m25964s();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public Integer m25941A() {
        AudioManager audioManager = (AudioManager) this.f21563c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Integer.valueOf((int) (((float) audioManager.getStreamVolume(3)) * ((Float) this.f21561a.mo57342a(C8380b.f20876dU)).floatValue()));
    }

    /* renamed from: B */
    private double m25942B() {
        return ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
    }

    /* renamed from: C */
    private boolean m25943C() {
        SensorManager sensorManager = (SensorManager) this.f21563c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    /* renamed from: D */
    private String m25944D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21563c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    /* renamed from: E */
    private String m25945E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21563c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C8626v.m26252a()) {
                return "";
            }
            this.f21562b.mo57819b("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    /* renamed from: F */
    private String m25946F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21563c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C8626v.m26252a()) {
                return "";
            }
            this.f21562b.mo57819b("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    /* renamed from: G */
    private String m25947G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f21563c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!C8626v.m26252a()) {
                return "";
            }
            this.f21562b.mo57819b("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    /* renamed from: H */
    private boolean m25948H() {
        try {
            return m25949I() || m25950J();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: I */
    private boolean m25949I() {
        String str = Build.TAGS;
        return str != null && str.contains(m25956b("lz}$blpz"));
    }

    /* renamed from: J */
    private boolean m25950J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m25956b(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c8 A[SYNTHETIC, Splitter:B:54:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> m25952a(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "lmt"
            java.lang.String r1 = "tm"
            java.lang.String r2 = "fm"
            java.lang.String r3 = "tds"
            java.lang.String r4 = "fs"
            java.lang.String r5 = "DataCollector"
            java.util.Map r10 = com.applovin.impl.sdk.utils.CollectionUtils.map(r10)
            android.content.Context r6 = r9.f21563c
            android.graphics.Point r6 = com.applovin.impl.sdk.utils.C8571h.m26081a(r6)
            int r7 = r6.x
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "dx"
            r10.put(r8, r7)
            int r6 = r6.y
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "dy"
            r10.put(r7, r6)
            if (r11 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$a> r6 = f21559h
            java.lang.Object r6 = r6.get()
            com.applovin.impl.sdk.o$a r6 = (com.applovin.impl.sdk.C8538o.C8544a) r6
            if (r6 == 0) goto L_0x003c
            r9.mo57638m()
            goto L_0x005c
        L_0x003c:
            boolean r6 = com.applovin.impl.sdk.utils.Utils.isMainThread()
            if (r6 == 0) goto L_0x0052
            com.applovin.impl.sdk.o$a r6 = new com.applovin.impl.sdk.o$a
            r6.<init>()
            r7 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "inc"
            r10.put(r8, r7)
            goto L_0x005c
        L_0x0052:
            com.applovin.impl.sdk.n r6 = r9.f21561a
            com.applovin.impl.sdk.o r6 = r6.mo57340Y()
            com.applovin.impl.sdk.o$a r6 = r6.mo57636k()
        L_0x005c:
            java.lang.String r7 = r6.f21575b
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L_0x0069
            java.lang.String r8 = "idfa"
            r10.put(r8, r7)
        L_0x0069:
            boolean r7 = r6.f21574a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "dnt"
            r10.put(r8, r7)
            com.applovin.impl.sdk.o$d r6 = r6.f21576c
            java.lang.String r6 = r6.mo57643a()
            java.lang.String r7 = "dnt_code"
            r10.put(r7, r6)
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$b> r6 = f21560j
            java.lang.Object r6 = r6.get()
            com.applovin.impl.sdk.o$b r6 = (com.applovin.impl.sdk.C8538o.C8545b) r6
            com.applovin.impl.sdk.n r7 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.p254c.C8380b.f20905dx
            java.lang.Object r7 = r7.mo57342a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00ab
            java.lang.String r7 = r6.f21577a
            java.lang.String r8 = "idfv"
            r10.put(r8, r7)
            int r6 = r6.f21578b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "idfv_scope"
            r10.put(r7, r6)
        L_0x00ab:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.C8475k.m25556b()
            android.content.Context r7 = r9.f21563c
            java.lang.Boolean r6 = r6.mo57299a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00bc
            java.lang.String r7 = "huc"
            r10.put(r7, r6)
        L_0x00bc:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.C8475k.m25551a()
            android.content.Context r7 = r9.f21563c
            java.lang.Boolean r6 = r6.mo57299a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00cd
            java.lang.String r7 = "aru"
            r10.put(r7, r6)
        L_0x00cd:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.C8475k.m25558c()
            android.content.Context r7 = r9.f21563c
            java.lang.Boolean r6 = r6.mo57299a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00de
            java.lang.String r7 = "dns"
            r10.put(r7, r6)
        L_0x00de:
            com.applovin.impl.sdk.n r6 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p254c.C8380b.f20865dJ
            java.lang.Object r6 = r6.mo57342a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0108
            com.applovin.impl.sdk.o$c r6 = r9.m25967v()
            int r7 = r6.f21579a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "act"
            r10.put(r8, r7)
            int r6 = r6.f21580b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "acm"
            r10.put(r7, r6)
        L_0x0108:
            com.applovin.impl.sdk.n r6 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p254c.C8380b.f20873dR
            java.lang.Object r6 = r6.mo57342a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x012b
            com.applovin.impl.sdk.n r6 = r9.f21561a
            com.applovin.impl.sdk.SessionTracker r6 = r6.mo57366ag()
            int r6 = r6.getLastTrimMemoryLevel()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "mtl"
            r10.put(r7, r6)
        L_0x012b:
            com.applovin.impl.sdk.n r6 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.p254c.C8380b.f20875dT
            java.lang.Object r6 = r6.mo57342a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0148
            boolean r6 = r9.m25948H()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r7 = "adr"
            r10.put(r7, r6)
        L_0x0148:
            if (r11 == 0) goto L_0x0153
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r11 = r9.f21568i
            java.lang.Object r11 = r11.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L_0x0157
        L_0x0153:
            java.lang.Integer r11 = r9.m25941A()
        L_0x0157:
            if (r11 == 0) goto L_0x015e
            java.lang.String r6 = "volume"
            r10.put(r6, r11)
        L_0x015e:
            android.content.Context r11 = r9.f21563c     // Catch:{ SettingNotFoundException -> 0x017d }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x017d }
            java.lang.String r6 = "screen_brightness"
            int r11 = android.provider.Settings.System.getInt(r11, r6)     // Catch:{ SettingNotFoundException -> 0x017d }
            float r11 = (float) r11     // Catch:{ SettingNotFoundException -> 0x017d }
            r6 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 / r6
            java.lang.String r6 = "sb"
            r7 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r7
            int r11 = (int) r11     // Catch:{ SettingNotFoundException -> 0x017d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SettingNotFoundException -> 0x017d }
            r10.put(r6, r11)     // Catch:{ SettingNotFoundException -> 0x017d }
            goto L_0x018b
        L_0x017d:
            r11 = move-exception
            boolean r6 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r6 == 0) goto L_0x018b
            com.applovin.impl.sdk.v r6 = r9.f21562b
            java.lang.String r7 = "Unable to collect screen brightness"
            r6.mo57819b(r5, r7, r11)
        L_0x018b:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r6 = com.applovin.impl.sdk.p254c.C8380b.f20878dW
            java.lang.Object r11 = r11.mo57342a(r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x01b7
            com.applovin.impl.sdk.n r11 = r9.f21561a
            boolean r11 = com.applovin.impl.sdk.utils.Utils.isUserAgentCollectionEnabled(r11)
            if (r11 == 0) goto L_0x01b7
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.C8342aa.m24985b(r11)
            java.lang.String r11 = com.applovin.impl.sdk.C8342aa.m24982a()
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r6 == 0) goto L_0x01b7
            java.lang.String r6 = "ua"
            r10.put(r6, r11)
        L_0x01b7:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r6 = com.applovin.impl.sdk.p254c.C8380b.f20867dL
            java.lang.Object r11 = r11.mo57342a(r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r6 = -1
            if (r11 == 0) goto L_0x0203
            java.io.File r11 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01e7 }
            long r7 = r11.getFreeSpace()     // Catch:{ all -> 0x01e7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01e7 }
            r10.put(r4, r11)     // Catch:{ all -> 0x01e7 }
            java.io.File r11 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01e7 }
            long r7 = r11.getTotalSpace()     // Catch:{ all -> 0x01e7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01e7 }
            r10.put(r3, r11)     // Catch:{ all -> 0x01e7 }
            goto L_0x0203
        L_0x01e7:
            r11 = move-exception
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.put(r4, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r10.put(r3, r4)
            boolean r3 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r3 == 0) goto L_0x0203
            com.applovin.impl.sdk.v r3 = r9.f21562b
            java.lang.String r4 = "Unable to collect total & free space."
            r3.mo57819b(r5, r4, r11)
        L_0x0203:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.p254c.C8380b.f20868dM
            java.lang.Object r11 = r11.mo57342a(r3)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0271
            android.content.Context r11 = r9.f21563c
            java.lang.String r3 = "activity"
            java.lang.Object r11 = r11.getSystemService(r3)
            android.app.ActivityManager r11 = (android.app.ActivityManager) r11
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo
            r3.<init>()
            if (r11 == 0) goto L_0x0271
            r11.getMemoryInfo(r3)     // Catch:{ all -> 0x024e }
            long r7 = r3.availMem     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r2, r11)     // Catch:{ all -> 0x024e }
            long r7 = r3.totalMem     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r1, r11)     // Catch:{ all -> 0x024e }
            long r7 = r3.threshold     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r0, r11)     // Catch:{ all -> 0x024e }
            java.lang.String r11 = "lm"
            boolean r3 = r3.lowMemory     // Catch:{ all -> 0x024e }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x024e }
            r10.put(r11, r3)     // Catch:{ all -> 0x024e }
            goto L_0x0271
        L_0x024e:
            r11 = move-exception
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r10.put(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r10.put(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r10.put(r0, r1)
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0271
            com.applovin.impl.sdk.v r0 = r9.f21562b
            java.lang.String r1 = "Unable to collect memory info."
            r0.mo57819b(r5, r1, r11)
        L_0x0271:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.p254c.C8380b.f20869dN
            java.lang.Object r11 = r11.mo57342a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02a8
            android.content.Context r11 = r9.f21563c
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r11 = com.applovin.impl.sdk.utils.C8571h.m26083a(r0, r11)
            if (r11 == 0) goto L_0x02a8
            boolean r11 = com.applovin.impl.sdk.utils.C8571h.m26088f()
            if (r11 == 0) goto L_0x02a8
            android.content.Context r11 = r9.f21563c
            java.lang.String r0 = "phone"
            java.lang.Object r11 = r11.getSystemService(r0)
            android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11
            int r11 = r11.getDataNetworkType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "rat"
            r10.put(r0, r11)
        L_0x02a8:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.p254c.C8380b.f20866dK
            java.lang.Object r11 = r11.mo57342a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02c7
            java.lang.String r11 = r9.m25970y()
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "so"
            r10.put(r0, r11)
        L_0x02c7:
            java.lang.String r11 = r9.m25963r()
            java.lang.String r0 = "orientation_lock"
            r10.put(r0, r11)
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.p254c.C8380b.f20870dO
            java.lang.Object r11 = r11.mo57342a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02ed
            boolean r11 = com.applovin.impl.sdk.utils.Utils.isVPNConnected()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "vs"
            r10.put(r0, r11)
        L_0x02ed:
            boolean r11 = com.applovin.impl.sdk.utils.C8571h.m26086d()
            if (r11 == 0) goto L_0x030c
            android.content.Context r11 = r9.f21563c
            java.lang.String r0 = "power"
            java.lang.Object r11 = r11.getSystemService(r0)
            android.os.PowerManager r11 = (android.os.PowerManager) r11
            if (r11 == 0) goto L_0x030c
            boolean r11 = r11.isPowerSaveMode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "lpm"
            r10.put(r0, r11)
        L_0x030c:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.p254c.C8380b.f20879dX
            java.lang.Object r11 = r11.mo57342a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0337
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.utils.o r11 = r11.mo57370ak()
            if (r11 == 0) goto L_0x0337
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.utils.o r11 = r11.mo57370ak()
            float r11 = r11.mo57776c()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r0 = "da"
            r10.put(r0, r11)
        L_0x0337:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.p254c.C8380b.f20880dY
            java.lang.Object r11 = r11.mo57342a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0362
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.utils.o r11 = r11.mo57370ak()
            if (r11 == 0) goto L_0x0362
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.utils.o r11 = r11.mo57370ak()
            float r11 = r11.mo57775b()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r0 = "dm"
            r10.put(r0, r11)
        L_0x0362:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.h r11 = r11.mo57371al()
            int r11 = r11.mo57274a()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "mute_switch"
            r10.put(r0, r11)
            com.applovin.impl.sdk.n r11 = r9.f21561a
            java.lang.String r11 = com.applovin.impl.sdk.utils.C8572i.m26110f(r11)
            java.lang.String r0 = "network"
            r10.put(r0, r11)
            java.lang.String r11 = r9.m25971z()
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = "kb"
            r10.put(r0, r11)
        L_0x038f:
            com.applovin.impl.sdk.n r11 = r9.f21561a
            com.applovin.impl.sdk.array.ArrayService r11 = r11.mo57376aq()
            boolean r0 = r11.isAppHubInstalled()
            if (r0 == 0) goto L_0x03c2
            long r0 = r11.getAppHubVersionCode()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "ah_sdk_version_code"
            r10.put(r1, r0)
            boolean r0 = r11.isDirectDownloadEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "ah_dd_enabled"
            r10.put(r1, r0)
            java.lang.String r11 = r11.getRandomUserToken()
            java.lang.String r11 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(r11)
            java.lang.String r0 = "ah_random_user_token"
            r10.put(r0, r11)
        L_0x03c2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8538o.m25952a(java.util.Map, boolean):java.util.Map");
    }

    /* renamed from: a */
    public static void m25953a(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                C8538o.f21559h.set(C8566d.m26066a(context));
            }
        }).start();
    }

    /* renamed from: a */
    private void m25954a(Map<String, Object> map) {
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20871dP)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(m25968w()));
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20872dQ)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(m25969x()));
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20878dW)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f21561a)) {
            C8342aa.m24985b(this.f21561a);
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20877dV)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20874dS)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(m25966u()));
        }
    }

    /* renamed from: a */
    private boolean m25955a(String str) {
        try {
            return Settings.Secure.getInt(this.f21563c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private String m25956b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static void m25958b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                C8538o.f21560j.set(new C8545b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        C8626v.m26255f("DataCollector", "Could not collect AppSet ID.");
                    }
                }
            }).start();
        } else {
            C8626v.m26255f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    /* renamed from: p */
    private Map<String, String> m25961p() {
        return Utils.stringifyObjectMap(mo57625a((Map<String, String>) null, true, false));
    }

    /* renamed from: q */
    private Map<String, Object> m25962q() {
        Map<String, Object> map = CollectionUtils.map(32);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(C8566d.m26067a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", mo57631f());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(m25942B()));
        map.put("gy", Boolean.valueOf(m25943C()));
        map.put("country_code", m25944D());
        map.put("mcc", m25945E());
        map.put("mnc", m25946F());
        map.put("carrier", m25947G());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f21563c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f21563c)));
        DisplayMetrics displayMetrics = this.f21563c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a = C8571h.m26081a(this.f21563c);
            map.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow((double) a.x, 2.0d) + Math.pow((double) a.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        m25954a(map);
        return map;
    }

    /* renamed from: r */
    private String m25963r() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f21563c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    /* renamed from: s */
    private Map<String, Object> m25964s() {
        PackageInfo packageInfo;
        Map<String, Object> map = CollectionUtils.map();
        PackageManager packageManager = this.f21563c.getPackageManager();
        ApplicationInfo applicationInfo = this.f21563c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f21563c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        Object obj = "";
        map.put("app_version", packageInfo != null ? packageInfo.versionName : obj);
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = obj;
        }
        map.put("installer_name", str);
        map.put("tg", C8618q.m26216a(this.f21561a));
        map.put(Constants.DEBUG_INTERSTITIAL, Boolean.valueOf(Utils.isPubInDebugMode(this.f21561a.mo57332P(), this.f21561a)));
        map.put("ia", Long.valueOf(lastModified));
        map.put("alts_ms", Long.valueOf(C8490n.m25591A()));
        map.put("j8", Boolean.valueOf(C8490n.m25592B()));
        Long l = (Long) this.f21561a.mo57343a(C8382d.f20996d);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f21561a.mo57349a(C8382d.f20996d, Long.valueOf(lastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f21561a.mo57374ao().mo56872c());
        map.put("api_did", this.f21561a.mo57342a(C8380b.f20725aa));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        map.put("first_install_v3_ms", obj);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()));
        return map;
    }

    /* renamed from: t */
    private Map<String, Object> m25965t() {
        Map<String, Object> map = CollectionUtils.map();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f21563c);
        String str = (String) this.f21561a.mo57379b(C8382d.f21006n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            map.put("IABTCF_TCString", str);
        }
        String a = C8382d.f21007o.mo57098a();
        if (defaultSharedPreferences.contains(a)) {
            String str2 = (String) C8383e.m25215a(a, "", String.class, defaultSharedPreferences);
            Integer num = (Integer) C8383e.m25215a(a, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
            Long l = (Long) C8383e.m25215a(a, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
            Boolean bool = (Boolean) C8383e.m25215a(a, false, Boolean.class, defaultSharedPreferences);
            if (StringUtils.isValidString(str2)) {
                map.put("IABTCF_gdprApplies", str2);
            } else if (num != null && num.intValue() != Integer.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", num);
            } else if (l == null || l.longValue() == Long.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", bool);
            } else {
                map.put("IABTCF_gdprApplies", l);
            }
        }
        return map;
    }

    /* renamed from: u */
    private boolean m25966u() {
        ConnectivityManager connectivityManager;
        if (C8571h.m26088f() && (connectivityManager = (ConnectivityManager) this.f21563c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f21561a.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21561a.mo57320D().mo57819b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    private C8546c m25967v() {
        C8546c cVar = new C8546c();
        Intent registerReceiver = this.f21563c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f21580b = -1;
        } else {
            cVar.f21580b = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
        }
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        cVar.f21579a = i;
        return cVar;
    }

    /* renamed from: w */
    private long m25968w() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f21563c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j = asList.contains("AccessibilityMenuService") ? 256 : 0;
        if (asList.contains("SelectToSpeakService")) {
            j |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j |= 4;
        }
        if ((this.f21563c.getResources().getConfiguration().uiMode & 48) == 32) {
            j |= 1024;
        }
        if (m25955a("accessibility_enabled")) {
            j |= 8;
        }
        if (m25955a("touch_exploration_enabled")) {
            j |= 16;
        }
        if (C8571h.m26086d()) {
            if (m25955a("accessibility_display_inversion_enabled")) {
                j |= 32;
            }
            if (m25955a("skip_first_use_hints")) {
                j |= 64;
            }
        }
        if (m25955a("lock_screen_allow_remote_input")) {
            j |= 2048;
        }
        if (m25955a("enabled_accessibility_audio_description_by_default")) {
            j |= 4096;
        }
        if (m25955a("accessibility_shortcut_on_lock_screen")) {
            j |= 8192;
        }
        if (m25955a("wear_talkback_enabled")) {
            j |= 16384;
        }
        if (m25955a("hush_gesture_used")) {
            j |= 32768;
        }
        if (m25955a("high_text_contrast_enabled")) {
            j |= 65536;
        }
        if (m25955a("accessibility_display_magnification_enabled")) {
            j |= 131072;
        }
        if (m25955a("accessibility_display_magnification_navbar_enabled")) {
            j |= 262144;
        }
        if (m25955a("accessibility_captioning_enabled")) {
            j |= 524288;
        }
        if (m25955a("accessibility_display_daltonizer_enabled")) {
            j |= C8850d.f22423fc;
        }
        if (m25955a("accessibility_autoclick_enabled")) {
            j |= 2097152;
        }
        if (m25955a("accessibility_large_pointer_icon")) {
            j |= 4194304;
        }
        if (m25955a("reduce_bright_colors_activated")) {
            j |= 8388608;
        }
        if (m25955a("reduce_bright_colors_persist_across_reboots")) {
            j |= 16777216;
        }
        if (m25955a("tty_mode_enabled")) {
            j |= 33554432;
        }
        return m25955a("rtt_calling_mode") ? j | 67108864 : j;
    }

    /* renamed from: x */
    private float m25969x() {
        try {
            return Settings.System.getFloat(this.f21563c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!C8626v.m26252a()) {
                return -1.0f;
            }
            this.f21562b.mo57819b("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    /* renamed from: y */
    private String m25970y() {
        AudioManager audioManager = (AudioManager) this.f21563c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (C8571h.m26087e()) {
            for (AudioDeviceInfo type : audioManager.getDevices(2)) {
                sb.append(type.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append(3);
                sb.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append(7);
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) && C8626v.m26252a()) {
            this.f21562b.mo57818b("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    /* renamed from: z */
    private String m25971z() {
        if (!C8571h.m26088f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f21563c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo57624a() {
        String encodeToString = Base64.encodeToString(new JSONObject(m25961p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f21561a.mo57342a(C8380b.f20909eB)).booleanValue()) {
            return encodeToString;
        }
        return C8614n.m26193a(encodeToString, this.f21561a.mo57319C(), Utils.getServerAdjustedUnixTimestampMillis(this.f21561a));
    }

    /* renamed from: a */
    public Map<String, Object> mo57625a(Map<String, String> map, boolean z, boolean z2) {
        Map<String, Object> map2 = CollectionUtils.map(64);
        Map<String, Object> a = mo57626a(z);
        Map<String, Object> h = mo57633h();
        Map<String, Object> j = mo57635j();
        Map<String, String> allData = this.f21561a.mo57402s().getAllData();
        if (z2) {
            map2.put("device_info", a);
            map2.put("app_info", h);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (j != null) {
                map2.put("location_info", j);
            }
            if (!allData.isEmpty()) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2.putAll(a);
            map2.putAll(h);
            if (map != null) {
                map2.putAll(map);
            }
            if (j != null) {
                map2.putAll(j);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.f21561a.mo57405u(), map2);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.f21561a.mo57342a(C8380b.f20864dI), map2);
        if (!((Boolean) this.f21561a.mo57342a(C8380b.f20908eA)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21561a.mo57319C());
        }
        map2.putAll(mo57634i());
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20942ei)).booleanValue()) {
            C8395g W = this.f21561a.mo57338W();
            map2.put("li", Long.valueOf(W.mo57154b(C8394f.f21083b)));
            map2.put("si", Long.valueOf(W.mo57154b(C8394f.f21086e)));
            map2.put("mad", Long.valueOf(W.mo57154b(C8394f.f21084c)));
            map2.put("msad", Long.valueOf(W.mo57154b(C8394f.f21087f)));
            map2.put("pf", Long.valueOf(W.mo57154b(C8394f.f21091j)));
            map2.put("mpf", Long.valueOf(W.mo57154b(C8394f.f21098q)));
            map2.put("gpf", Long.valueOf(W.mo57154b(C8394f.f21092k)));
            map2.put("asoac", Long.valueOf(W.mo57154b(C8394f.f21096o)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    /* renamed from: a */
    public Map<String, Object> mo57626a(boolean z) {
        Map<String, Object> map;
        synchronized (this.f21565e) {
            map = CollectionUtils.map(this.f21564d);
        }
        return m25952a(map, z);
    }

    /* renamed from: b */
    public Map<String, Object> mo57627b() {
        return CollectionUtils.map(this.f21564d);
    }

    /* renamed from: c */
    public Map<String, Object> mo57628c() {
        return CollectionUtils.map(this.f21566f);
    }

    /* renamed from: d */
    public Map<String, Object> mo57629d() {
        return mo57626a(false);
    }

    /* renamed from: e */
    public void mo57630e() {
        synchronized (this.f21565e) {
            m25954a(this.f21564d);
        }
    }

    /* renamed from: f */
    public String mo57631f() {
        return AppLovinSdkUtils.isFireOS(this.f21563c) ? "fireos" : "android";
    }

    /* renamed from: g */
    public boolean mo57632g() {
        return this.f21567g;
    }

    /* renamed from: h */
    public Map<String, Object> mo57633h() {
        Map<String, Object> map = CollectionUtils.map(this.f21566f);
        map.put("first_install", Boolean.valueOf(this.f21561a.mo57334S()));
        map.put("first_install_v2", Boolean.valueOf(!this.f21561a.mo57335T()));
        map.put("test_ads", Boolean.valueOf(this.f21567g));
        map.put("muted", Boolean.valueOf(this.f21561a.mo57400q().isMuted()));
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20906dy)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.f21561a.mo57397n(), map);
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20857dB)).booleanValue()) {
            map.put("compass_random_token", this.f21561a.mo57398o());
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20859dD)).booleanValue()) {
            map.put("applovin_random_token", this.f21561a.mo57399p());
        }
        String name = this.f21561a.mo57401r().getName();
        if (StringUtils.isValidString(name)) {
            map.put("user_segment_name", name);
        }
        map.putAll(m25965t());
        return map;
    }

    /* renamed from: i */
    public Map<String, Object> mo57634i() {
        Map<String, Object> map = CollectionUtils.map();
        map.put("sc", this.f21561a.mo57342a(C8380b.f20730af));
        map.put("sc2", this.f21561a.mo57342a(C8380b.f20731ag));
        map.put("sc3", this.f21561a.mo57342a(C8380b.f20732ah));
        map.put("server_installed_at", this.f21561a.mo57342a(C8380b.f20733ai));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.f21561a.mo57343a(C8382d.f21018z), map);
        return map;
    }

    /* renamed from: j */
    public Map<String, Object> mo57635j() {
        if (!this.f21561a.mo57400q().isLocationCollectionEnabled() || !((Boolean) this.f21561a.mo57342a(C8380b.f20939ef)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map();
        C8555u ap = this.f21561a.mo57375ap();
        boolean b = ap.mo57680b();
        map.put("loc_services_enabled", Boolean.valueOf(b));
        if (!b) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(ap.mo57679a()));
        if (ap.mo57681c()) {
            map.put("loc_lat", Utils.formatDoubleValue(ap.mo57682d(), ((Integer) this.f21561a.mo57342a(C8380b.f20941eh)).intValue()));
            map.put("loc_long", Utils.formatDoubleValue(ap.mo57683e(), ((Integer) this.f21561a.mo57342a(C8380b.f20941eh)).intValue()));
        }
        return map;
    }

    /* renamed from: k */
    public C8544a mo57636k() {
        List<String> testDeviceAdvertisingIds;
        C8544a a = C8566d.m26066a(this.f21563c);
        if (a == null) {
            return new C8544a();
        }
        if (((Boolean) this.f21561a.mo57342a(C8380b.f20904dw)).booleanValue()) {
            if (a.f21574a && !((Boolean) this.f21561a.mo57342a(C8380b.f20903dv)).booleanValue()) {
                a.f21575b = "";
            }
            f21559h.set(a);
        } else {
            a = new C8544a();
        }
        boolean z = false;
        if (StringUtils.isValidString(a.f21575b) && (testDeviceAdvertisingIds = this.f21561a.mo57400q().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(a.f21575b)) {
            z = true;
        }
        this.f21567g = z;
        return a;
    }

    /* renamed from: l */
    public C8545b mo57637l() {
        return f21560j.get();
    }

    /* renamed from: m */
    public void mo57638m() {
        this.f21561a.mo57337V().mo57228a((C8401a) new C8412f(this.f21561a, new C8412f.C8413a() {
            /* renamed from: a */
            public void mo57200a(C8544a aVar) {
                C8538o.f21559h.set(aVar);
            }
        }), C8432o.C8434a.ADVERTISING_INFO_COLLECTION);
        this.f21561a.mo57337V().mo57228a((C8401a) new C8458z(this.f21561a, true, new Runnable() {
            public void run() {
                C8538o.this.f21568i.set(C8538o.this.m25941A());
            }
        }), C8432o.C8434a.CACHING_OTHER);
    }
}
