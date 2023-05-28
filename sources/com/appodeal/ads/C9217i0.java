package com.appodeal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.appodeal.ads.i0 */
public final class C9217i0 {

    /* renamed from: a */
    public static String f23171a = null;

    /* renamed from: b */
    public static String f23172b = null;

    /* renamed from: c */
    public static boolean f23173c = false;

    /* renamed from: d */
    public static JSONObject f23174d = null;

    /* renamed from: e */
    public static int f23175e = 0;

    /* renamed from: f */
    public static boolean f23176f = true;

    /* renamed from: g */
    public static Boolean f23177g;

    /* renamed from: h */
    public static Boolean f23178h;

    /* renamed from: a */
    public static void m27369a(Context context, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!(context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("app_data")) == null)) {
            if (optJSONObject.has(IabUtils.KEY_STORE_URL)) {
                f23172b = optJSONObject.optString(IabUtils.KEY_STORE_URL, f23172b);
            } else {
                StringBuilder a = C9203h0.m27334a("https://play.google.com/store/apps/details?id=");
                a.append(context.getPackageName());
                f23172b = a.toString();
            }
            String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            f23171a = optString;
            if (TextUtils.isEmpty(optString)) {
                try {
                    f23171a = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
                } catch (Exception e) {
                    Log.log(e);
                }
            }
            if (optJSONObject.has("paid")) {
                optJSONObject.optInt("paid");
            }
            optJSONObject.optString("publisher", "");
            if (optJSONObject.has("id")) {
                String.valueOf(optJSONObject.optInt("id"));
            }
            f23174d = optJSONObject.optJSONObject("ext");
            f23175e = optJSONObject.optInt("ad_box_size");
            f23176f = optJSONObject.optBoolean("hr", true);
        }
        m27370a(jSONObject);
        if (jSONObject != null) {
            f23173c = jSONObject.optBoolean("corona");
        }
    }

    /* renamed from: a */
    public static void m27370a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(Constants.FOR_KIDS)) {
            boolean a = m27371a();
            f23178h = Boolean.valueOf(jSONObject.optBoolean(Constants.FOR_KIDS, false));
            if (a != m27371a()) {
                C9422r0.m27936d();
            }
        }
    }

    /* renamed from: a */
    public static boolean m27371a() {
        Boolean bool = f23177g;
        if (bool == null && (bool = f23178h) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
