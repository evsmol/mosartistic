package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

/* renamed from: com.iab.omid.library.applovin.utils.a */
public final class C4224a {

    /* renamed from: a */
    private static UiModeManager f10101a;

    /* renamed from: a */
    public static DeviceCategory m11846a() {
        int currentModeType = f10101a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    /* renamed from: a */
    public static void m11847a(Context context) {
        if (context != null) {
            f10101a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
