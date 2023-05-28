package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4386c;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.C4412k;
import com.ironsource.p119d.C4370a;
import com.ironsource.sdk.utils.C4983a;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.b */
public class C4978b {

    /* renamed from: a */
    private static final String f12727a = C4978b.class.getSimpleName();

    /* renamed from: a */
    public static JSONObject m14475a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.m14507i(f12727a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m14476a(JSONObject jSONObject, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static JSONObject m14477b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            m14476a(jSONObject, "displaySizeWidth", String.valueOf(C4407h.m12565k()));
            m14476a(jSONObject, "displaySizeHeight", String.valueOf(C4407h.m12568l()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String a = C4370a.m12414a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), C4370a.m12419c(context));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C4407h.m12575p())));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), C4407h.m12585v(context));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), C4407h.m12586w(context));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            C4983a.m14513a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C4983a.m14515b(context));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), C4407h.m12551d());
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), C4407h.m12554e(context));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), C4407h.m12556f(context));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), C4407h.m12558g(context));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), C4407h.m12560h(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m14478c(Context context) {
        C4983a a = C4983a.m14513a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a.f12747a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f12748b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a.f12749c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a.f12750d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a.f12750d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a.f12751e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (a.f12752f != null && a.f12752f.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f12752f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C4407h.m12550d(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(C4407h.m12573o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(C4407h.m12564j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C4412k.m12593a(context));
            jSONObject.put("mcc", C4377a.C43781.m12462c(context));
            jSONObject.put("mnc", C4377a.C43781.m12465d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), C4377a.C43781.m12468f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C4377a.C43781.m12467e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C4386c.m12477b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C4386c.m12474a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C4386c.m12479c(context)));
            String d = C4386c.m12481d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(C4407h.m12538a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(C4407h.m12544b())));
            String j = C4407h.m12563j(context);
            if (!TextUtils.isEmpty(j)) {
                jSONObject.put("icc", j);
            }
            String c = C4407h.m12547c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("tz", SDKUtils.encodeString(c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
