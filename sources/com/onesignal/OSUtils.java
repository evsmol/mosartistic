package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import androidx.core.app.NotificationManagerCompat;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.appnext.base.p264b.C8849c;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.OneSignal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSUtils {
    public static int MAX_NETWORK_REQUEST_ATTEMPT_COUNT = 3;
    static final int[] NO_RETRY_NETWROK_REQUEST_STATUS_CODES = {TTAdConstant.MATE_IS_NULL_CODE, TTAdConstant.AD_ID_IS_NULL_CODE, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, TTAdConstant.DEEPLINK_FALLBACK_CODE, TTAdConstant.IMAGE_LIST_SIZE_CODE};

    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    OSUtils() {
    }

    public enum SchemaType {
        DATA(C8849c.DATA),
        HTTPS("https"),
        HTTP("http");
        
        private final String text;

        private SchemaType(String str) {
            this.text = str;
        }

        public static SchemaType fromString(String str) {
            for (SchemaType schemaType : values()) {
                if (schemaType.text.equalsIgnoreCase(str)) {
                    return schemaType;
                }
            }
            return null;
        }
    }

    public static boolean shouldRetryNetworkRequest(int i) {
        for (int i2 : NO_RETRY_NETWROK_REQUEST_STATUS_CODES) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int initializationChecker(Context context, String str) {
        Integer checkForGooglePushLibrary;
        int deviceType = getDeviceType();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i = 1;
            if (deviceType == 1 && (checkForGooglePushLibrary = checkForGooglePushLibrary()) != null) {
                i = checkForGooglePushLibrary.intValue();
            }
            Integer checkAndroidSupportLibrary = checkAndroidSupportLibrary(context);
            if (checkAndroidSupportLibrary != null) {
                return checkAndroidSupportLibrary.intValue();
            }
            return i;
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    static boolean hasFCMLibrary() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean hasGMSLocationLibrary() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean hasHMSAvailabilityLibrary() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean hasHMSPushKitLibrary() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean hasHMSAGConnectLibrary() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean hasHMSLocationLibrary() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean hasAllHMSLibrariesForPushKit() {
        return hasHMSAGConnectLibrary() && hasHMSPushKitLibrary();
    }

    /* access modifiers changed from: package-private */
    public Integer checkForGooglePushLibrary() {
        if (hasFCMLibrary()) {
            return null;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    private static boolean hasWakefulBroadcastReceiver() {
        Class<WakefulBroadcastReceiver> cls = WakefulBroadcastReceiver.class;
        return true;
    }

    private static boolean hasNotificationManagerCompat() {
        Class<NotificationManagerCompat> cls = NotificationManagerCompat.class;
        return true;
    }

    private static boolean hasJobIntentService() {
        Class<JobIntentService> cls = JobIntentService.class;
        return true;
    }

    private Integer checkAndroidSupportLibrary(Context context) {
        boolean hasWakefulBroadcastReceiver = hasWakefulBroadcastReceiver();
        boolean hasNotificationManagerCompat = hasNotificationManagerCompat();
        if (!hasWakefulBroadcastReceiver && !hasNotificationManagerCompat) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (!hasWakefulBroadcastReceiver || !hasNotificationManagerCompat) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else if (Build.VERSION.SDK_INT < 26 || getTargetSdkVersion(context) < 26 || hasJobIntentService()) {
            return null;
        } else {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    private static boolean packageInstalledAndEnabled(String str) {
        try {
            return OneSignal.appContext.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    static boolean isGMSInstalledAndEnabled() {
        return packageInstalledAndEnabled("com.google.android.gms");
    }

    private static boolean isHMSCoreInstalledAndEnabled() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(OneSignal.appContext) == 0;
    }

    private static boolean isHMSCoreInstalledAndEnabledFallback() {
        return packageInstalledAndEnabled("com.huawei.hwid");
    }

    private boolean supportsADM() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean supportsHMS() {
        if (!hasHMSAvailabilityLibrary() || !hasAllHMSLibrariesForPushKit()) {
            return false;
        }
        return isHMSCoreInstalledAndEnabled();
    }

    private boolean supportsGooglePush() {
        if (!hasFCMLibrary()) {
            return false;
        }
        return isGMSInstalledAndEnabled();
    }

    /* access modifiers changed from: package-private */
    public int getDeviceType() {
        if (supportsADM()) {
            return 2;
        }
        if (supportsGooglePush()) {
            return 1;
        }
        if (supportsHMS()) {
            return 13;
        }
        if (!isGMSInstalledAndEnabled() && isHMSCoreInstalledAndEnabledFallback()) {
            return 13;
        }
        return 1;
    }

    static boolean isAndroidDeviceType() {
        return new OSUtils().getDeviceType() == 1;
    }

    static boolean isFireOSDeviceType() {
        return new OSUtils().getDeviceType() == 2;
    }

    static boolean isHuaweiDeviceType() {
        return new OSUtils().getDeviceType() == 13;
    }

    /* access modifiers changed from: package-private */
    public Integer getNetType() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) OneSignal.appContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public String getCarrierName() {
        try {
            String networkOperatorName = ((TelephonyManager) OneSignal.appContext.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    static Bundle getManifestMetaBundle(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Manifest application info not found", e);
            return null;
        }
    }

    static boolean getManifestMetaBoolean(Context context, String str) {
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    static String getManifestMeta(Context context, String str) {
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    static String getResourceString(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    static boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    static boolean areNotificationsEnabled(Context context) {
        try {
            return NotificationManagerCompat.from(OneSignal.appContext).areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    static boolean isRunningOnMainThread() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    static void runOnMainUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static void runOnMainThreadDelayed(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long) i);
    }

    static int getTargetSdkVersion(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 15;
        }
    }

    static boolean isValidResourceName(String str) {
        return str != null && !str.matches("^[0-9]");
    }

    static Uri getSoundUri(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!isValidResourceName(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) {
            int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (identifier2 == 0) {
                return null;
            }
            return Uri.parse("android.resource://" + packageName + "/" + identifier2);
        }
        return Uri.parse("android.resource://" + packageName + "/" + identifier);
    }

    static long[] parseVibrationPattern(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    static void sleep(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void openURLInBrowser(String str) {
        openURLInBrowser(Uri.parse(str.trim()));
    }

    private static void openURLInBrowser(Uri uri) {
        OneSignal.appContext.startActivity(openURLInBrowserIntent(uri));
    }

    static Intent openURLInBrowserIntent(Uri uri) {
        Intent intent;
        SchemaType fromString = uri.getScheme() != null ? SchemaType.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = SchemaType.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (C50621.$SwitchMap$com$onesignal$OSUtils$SchemaType[fromString.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: com.onesignal.OSUtils$1 */
    static /* synthetic */ class C50621 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$OSUtils$SchemaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onesignal.OSUtils$SchemaType[] r0 = com.onesignal.OSUtils.SchemaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$onesignal$OSUtils$SchemaType = r0
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$onesignal$OSUtils$SchemaType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.HTTPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$onesignal$OSUtils$SchemaType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.OSUtils$SchemaType r1 = com.onesignal.OSUtils.SchemaType.HTTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSUtils.C50621.<clinit>():void");
        }
    }

    static <T> Set<T> newConcurrentSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static Set<String> newStringSetFromJSONArray(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    static boolean hasConfigChangeFlag(Activity activity, int i) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    static boolean shouldLogMissingAppIdError(String str) {
        if (str != null) {
            return false;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    static int getRandomDelay(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    static Throwable getRootCauseThrowable(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    static String getRootCauseMessage(Throwable th) {
        return getRootCauseThrowable(th).getMessage();
    }
}
