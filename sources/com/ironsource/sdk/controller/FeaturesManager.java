package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FeaturesManager {

    /* renamed from: a */
    private static volatile FeaturesManager f12138a;

    /* renamed from: b */
    private Map<String, ?> f12139b;

    /* renamed from: c */
    private ArrayList<String> f12140c = new ArrayList<String>() {
        {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
        }
    };

    private FeaturesManager() {
        if (f12138a == null) {
            this.f12139b = new HashMap();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static FeaturesManager getInstance() {
        if (f12138a == null) {
            synchronized (FeaturesManager.class) {
                if (f12138a == null) {
                    f12138a = new FeaturesManager();
                }
            }
        }
        return f12138a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList<String> mo34303a() {
        return new ArrayList<>(this.f12140c);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f12139b.containsKey("debugMode")) {
                num = (Integer) this.f12139b.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map != null) {
            this.f12139b = map;
        }
    }
}
