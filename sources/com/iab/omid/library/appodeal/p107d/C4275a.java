package com.iab.omid.library.appodeal.p107d;

import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.d.a */
public final class C4275a {
    /* renamed from: a */
    public static String m12055a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m12056b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m12057c() {
        return APSAnalytics.OS_NAME;
    }

    /* renamed from: d */
    public static JSONObject m12058d() {
        JSONObject jSONObject = new JSONObject();
        C4276b.m12065a(jSONObject, "deviceType", m12055a());
        C4276b.m12065a(jSONObject, "osVersion", m12056b());
        C4276b.m12065a(jSONObject, "os", m12057c());
        return jSONObject;
    }
}
