package com.iab.omid.library.amazon.p101d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.d.a */
public final class C4168a {
    /* renamed from: a */
    public static String m11574a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m11575b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m11576c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m11577d() {
        JSONObject jSONObject = new JSONObject();
        C4169b.m11585a(jSONObject, "deviceType", m11574a());
        C4169b.m11585a(jSONObject, "osVersion", m11575b());
        C4169b.m11585a(jSONObject, "os", m11576c());
        return jSONObject;
    }
}
