package com.iab.omid.library.adcolony.p095d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
public final class C4118a {
    /* renamed from: a */
    public static String m11344a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m11345b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m11346c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m11347d() {
        JSONObject jSONObject = new JSONObject();
        C4119b.m11355a(jSONObject, "deviceType", m11344a());
        C4119b.m11355a(jSONObject, "osVersion", m11345b());
        C4119b.m11355a(jSONObject, "os", m11346c());
        return jSONObject;
    }
}
