package com.appodeal.ads;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.utils.C9617d;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.appodeal.ads.e1 */
public final class C9174e1 implements DeviceData {

    /* renamed from: a */
    public static final C9174e1 f23026a = new C9174e1();

    public final String getAndroidId(Context context) {
        return C9182f1.m27268a(context);
    }

    public final long getAppRamSize(Context context) {
        return C9182f1.m27288k(context);
    }

    public final float getBatteryLevel(Context context) {
        return C9182f1.m27270b(context);
    }

    public final Float getBatteryTemperature(Context context) {
        int intExtra;
        try {
            HashMap hashMap = C9182f1.f23039a;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null || (intExtra = registerReceiver.getIntExtra("temperature", -1)) == -1) {
                return null;
            }
            return Float.valueOf(((float) intExtra) / 10.0f);
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final long getBootTime() {
        HashMap hashMap = C9182f1.f23039a;
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final String getBrandName() {
        return Build.MANUFACTURER;
    }

    public final Boolean getChargingStatus(Context context) {
        try {
            HashMap hashMap = C9182f1.f23039a;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final ConnectionData getConnectionData(Context context) {
        return C9182f1.m27272c(context);
    }

    public final String getConnectionType(Context context) {
        return C9182f1.m27272c(context).getType();
    }

    public final String getDeviceLanguage() {
        HashMap hashMap = C9182f1.f23039a;
        return Locale.getDefault().getLanguage();
    }

    public final String getDeviceName(Context context) {
        return C9182f1.m27281g(context);
    }

    public final float getDisplayDpi(Context context) {
        return (float) C9182f1.m27282h(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getKernelVersion() {
        /*
            r5 = this;
            java.util.HashMap r0 = com.appodeal.ads.C9182f1.f23039a
            r0 = 0
            java.lang.String r1 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x002f }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "/proc/version"
            r2.<init>(r3)     // Catch:{ all -> 0x002d }
            boolean r3 = r2.canRead()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0017
            goto L_0x0038
        L_0x0017:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x002d }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x002d }
            r4.<init>(r2)     // Catch:{ all -> 0x002d }
            r3.<init>(r4)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0029 }
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r3)
            goto L_0x0038
        L_0x0029:
            r0 = move-exception
            r2 = r0
            r0 = r3
            goto L_0x0032
        L_0x002d:
            r2 = move-exception
            goto L_0x0032
        L_0x002f:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0032:
            com.appodeal.ads.utils.Log.log(r2)     // Catch:{ all -> 0x0039 }
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
        L_0x0038:
            return r1
        L_0x0039:
            r1 = move-exception
            com.appodeal.ads.C9326n5.m27536a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9174e1.getKernelVersion():java.lang.String");
    }

    public final boolean getLowRamMemoryStatus(Context context) {
        return C9182f1.m27299s(context);
    }

    public final String getModelId() {
        return Build.ID;
    }

    public final String getModelName() {
        return Build.MODEL;
    }

    public final String getOsBuildVersion() {
        return Build.DISPLAY;
    }

    public final String getPlatformName() {
        return C9617d.f24377a;
    }

    public final float getScreenDensity(Context context) {
        return C9182f1.m27290l(context);
    }

    public final float getScreenHeight(Context context) {
        return (float) C9182f1.m27295o(context).y;
    }

    public final int getScreenOrientation(Context context) {
        return C9182f1.m27294n(context);
    }

    public final float getScreenWidth(Context context) {
        return (float) C9182f1.m27295o(context).x;
    }

    public final long getStorageFree() {
        return C9182f1.m27278f();
    }

    public final long getStorageSize() {
        return C9182f1.m27280g();
    }

    public final String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public final long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public final String getTimeZone() {
        HashMap hashMap = C9182f1.f23039a;
        return TimeZone.getDefault().getID();
    }

    public final long getTotalFreeRam(Context context) {
        ActivityManager activityManager;
        try {
            WeakReference<ActivityManager> weakReference = C9182f1.f23045g;
            if (weakReference == null || weakReference.get() == null) {
                activityManager = (ActivityManager) context.getSystemService("activity");
                C9182f1.f23045g = new WeakReference<>(activityManager);
            } else {
                activityManager = C9182f1.f23045g.get();
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Throwable th) {
            Log.log(th);
            return 0;
        }
    }

    public final boolean isConnected() {
        return C9182f1.m27289k();
    }

    public final boolean isDeviceEmulator() {
        return C9182f1.m27291l();
    }

    public final boolean isDeviceRooted() {
        return C9182f1.m27293m();
    }
}
