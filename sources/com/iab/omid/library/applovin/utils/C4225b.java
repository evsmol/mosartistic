package com.iab.omid.library.applovin.utils;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.utils.b */
public final class C4225b {
    /* renamed from: a */
    public static String m11848a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m11849b() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: c */
    public static String m11850c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: d */
    public static JSONObject m11851d() {
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, "deviceType", m11848a());
        C4226c.m11860a(jSONObject, "osVersion", m11850c());
        C4226c.m11860a(jSONObject, "os", m11849b());
        return jSONObject;
    }
}
