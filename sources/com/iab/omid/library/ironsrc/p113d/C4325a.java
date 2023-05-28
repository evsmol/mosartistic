package com.iab.omid.library.ironsrc.p113d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.a */
public final class C4325a {
    /* renamed from: a */
    public static String m12276a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m12277b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m12278c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m12279d() {
        JSONObject jSONObject = new JSONObject();
        C4326b.m12286a(jSONObject, "deviceType", m12276a());
        C4326b.m12286a(jSONObject, "osVersion", m12277b());
        C4326b.m12286a(jSONObject, "os", m12278c());
        return jSONObject;
    }
}
