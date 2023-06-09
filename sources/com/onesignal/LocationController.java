package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class LocationController {
    static Context classContext;
    static Thread fallbackFailThread;
    static Location lastLocation;
    private static boolean locationCoarse;
    private static LocationHandlerThread locationHandlerThread;
    private static ConcurrentHashMap<PermissionType, LocationHandler> locationHandlers = new ConcurrentHashMap<>();
    private static final List<LocationPromptCompletionHandler> promptHandlers = new ArrayList();
    static String requestPermission;
    static final Object syncLock = new Object() {
    };

    interface LocationHandler {
        PermissionType getType();

        void onComplete(LocationPoint locationPoint);
    }

    enum PermissionType {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    LocationController() {
    }

    static LocationHandlerThread getLocationHandlerThread() {
        if (locationHandlerThread == null) {
            synchronized (syncLock) {
                if (locationHandlerThread == null) {
                    locationHandlerThread = new LocationHandlerThread();
                }
            }
        }
        return locationHandlerThread;
    }

    static class LocationPoint {
        Float accuracy;

        /* renamed from: bg */
        Boolean f12765bg;
        Double lat;
        Double log;
        Long timeStamp;
        Integer type;

        LocationPoint() {
        }

        public String toString() {
            return "LocationPoint{lat=" + this.lat + ", log=" + this.log + ", accuracy=" + this.accuracy + ", type=" + this.type + ", bg=" + this.f12765bg + ", timeStamp=" + this.timeStamp + '}';
        }
    }

    static abstract class LocationPromptCompletionHandler implements LocationHandler {
        /* access modifiers changed from: package-private */
        public void onAnswered(OneSignal.PromptActionResult promptActionResult) {
        }

        LocationPromptCompletionHandler() {
        }
    }

    static boolean scheduleUpdate(Context context) {
        if (!hasLocationPermission(context)) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        } else if (!OneSignal.isLocationShared()) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        } else {
            long currentTimeMillis = OneSignal.getTime().getCurrentTimeMillis() - getLastLocationTime();
            long j = (OneSignal.isInForeground() ? 300 : 600) * 1000;
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level, "LocationController scheduleUpdate lastTime: " + currentTimeMillis + " minTime: " + j);
            OSSyncService.getInstance().scheduleLocationUpdateTask(context, j - currentTimeMillis);
            return true;
        }
    }

    private static void setLastLocationTime(long j) {
        OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_LOCATION_TIME", j);
    }

    private static long getLastLocationTime() {
        return OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_LOCATION_TIME", -600000);
    }

    private static boolean hasLocationPermission(Context context) {
        return AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private static void addPromptHandlerIfAvailable(LocationHandler locationHandler) {
        if (locationHandler instanceof LocationPromptCompletionHandler) {
            synchronized (promptHandlers) {
                promptHandlers.add((LocationPromptCompletionHandler) locationHandler);
            }
        }
    }

    static void sendAndClearPromptHandlers(boolean z, OneSignal.PromptActionResult promptActionResult) {
        if (!z) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        synchronized (promptHandlers) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
            for (LocationPromptCompletionHandler onAnswered : promptHandlers) {
                onAnswered.onAnswered(promptActionResult);
            }
            promptHandlers.clear();
        }
    }

    static void getLocation(Context context, boolean z, boolean z2, LocationHandler locationHandler) {
        int i;
        addPromptHandlerIfAvailable(locationHandler);
        classContext = context;
        locationHandlers.put(locationHandler.getType(), locationHandler);
        if (!OneSignal.isLocationShared()) {
            sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.ERROR);
            fireFailedComplete();
            return;
        }
        int checkSelfPermission = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        int i2 = -1;
        if (checkSelfPermission == -1) {
            i = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            locationCoarse = true;
        } else {
            i = -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (checkSelfPermission == 0 || i == 0) {
                sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                startGetLocation();
                return;
            }
            sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST);
            locationHandler.onComplete((LocationPoint) null);
        } else if (checkSelfPermission != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                OneSignal.PromptActionResult promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    requestPermission = "android.permission.ACCESS_FINE_LOCATION";
                } else if (!asList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
                    promptActionResult = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                } else if (i != 0) {
                    requestPermission = "android.permission.ACCESS_COARSE_LOCATION";
                } else if (Build.VERSION.SDK_INT >= 29 && asList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
                }
                if (requestPermission != null && z) {
                    LocationPermissionController.INSTANCE.prompt(z2, requestPermission);
                } else if (i == 0) {
                    sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                    startGetLocation();
                } else {
                    sendAndClearPromptHandlers(z, promptActionResult);
                    fireFailedComplete();
                }
            } catch (PackageManager.NameNotFoundException e) {
                sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.ERROR);
                e.printStackTrace();
            }
        } else if (Build.VERSION.SDK_INT < 29 || i2 == 0) {
            sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            startGetLocation();
        } else {
            backgroundLocationPermissionLogic(context, z, z2);
        }
    }

    private static void backgroundLocationPermissionLogic(Context context, boolean z, boolean z2) {
        try {
            if (Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (requestPermission == null || !z) {
                sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                startGetLocation();
                return;
            }
            LocationPermissionController.INSTANCE.prompt(z2, requestPermission);
        } catch (PackageManager.NameNotFoundException e) {
            sendAndClearPromptHandlers(z, OneSignal.PromptActionResult.ERROR);
            e.printStackTrace();
        }
    }

    static void startGetLocation() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "LocationController startGetLocation with lastLocation: " + lastLocation);
        try {
            if (isGooglePlayServicesAvailable()) {
                GMSLocationController.startGetLocation();
            } else if (isHMSAvailable()) {
                HMSLocationController.startGetLocation();
            } else {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "LocationController startGetLocation not possible, no location dependency found");
                fireFailedComplete();
            }
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", th);
            fireFailedComplete();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void onFocusChange() {
        /*
            java.lang.Object r0 = syncLock
            monitor-enter(r0)
            boolean r1 = isGooglePlayServicesAvailable()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            com.onesignal.GMSLocationController.onFocusChange()     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x000e:
            boolean r1 = isHMSAvailable()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            com.onesignal.HMSLocationController.onFocusChange()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.LocationController.onFocusChange():void");
    }

    static boolean isGooglePlayServicesAvailable() {
        return OSUtils.isAndroidDeviceType() && OSUtils.hasGMSLocationLibrary();
    }

    static boolean isHMSAvailable() {
        return OSUtils.isHuaweiDeviceType() && OSUtils.hasHMSLocationLibrary();
    }

    static void fireFailedComplete() {
        synchronized (syncLock) {
            if (isGooglePlayServicesAvailable()) {
                GMSLocationController.fireFailedComplete();
            } else if (isHMSAvailable()) {
                HMSLocationController.fireFailedComplete();
            }
        }
        fireComplete((LocationPoint) null);
    }

    private static void fireComplete(LocationPoint locationPoint) {
        Thread thread;
        Class<LocationController> cls = LocationController.class;
        HashMap hashMap = new HashMap();
        synchronized (cls) {
            hashMap.putAll(locationHandlers);
            locationHandlers.clear();
            thread = fallbackFailThread;
        }
        for (PermissionType permissionType : hashMap.keySet()) {
            ((LocationHandler) hashMap.get(permissionType)).onComplete(locationPoint);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == fallbackFailThread) {
            synchronized (cls) {
                if (thread == fallbackFailThread) {
                    fallbackFailThread = null;
                }
            }
        }
        setLastLocationTime(OneSignal.getTime().getCurrentTimeMillis());
    }

    protected static void fireCompleteForLocation(Location location) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "LocationController fireCompleteForLocation with location: " + location);
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.accuracy = Float.valueOf(location.getAccuracy());
        locationPoint.f12765bg = Boolean.valueOf(OneSignal.isInForeground() ^ true);
        locationPoint.type = Integer.valueOf(locationCoarse ^ true ? 1 : 0);
        locationPoint.timeStamp = Long.valueOf(location.getTime());
        if (locationCoarse) {
            locationPoint.lat = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            locationPoint.log = Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
        } else {
            locationPoint.lat = Double.valueOf(location.getLatitude());
            locationPoint.log = Double.valueOf(location.getLongitude());
        }
        fireComplete(locationPoint);
        scheduleUpdate(classContext);
    }

    protected static class LocationHandlerThread extends HandlerThread {
        Handler mHandler = new Handler(getLooper());

        LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }
}
