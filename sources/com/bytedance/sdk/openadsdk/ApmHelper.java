package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmHelper {

    /* renamed from: a */
    private static boolean f26614a = false;

    /* renamed from: b */
    private static String f26615b;

    /* renamed from: c */
    private static boolean f26616c;

    public static void initApm(Context context, TTAdConfig tTAdConfig) {
        if (!f26614a) {
            C0516f h = C0558m.m2673h();
            boolean B = h.mo1664B();
            f26616c = B;
            if (B && !TextUtils.isEmpty(h.mo1717r())) {
                f26615b = tTAdConfig.getAppId();
                String[] strArr = {"com.bytedance.sdk", "com.com.bytedance.overseas.sdk", "com.pgl.sys.ces", "com.bykv.vk"};
                String a = C0517j.m2474a(context);
                String r = h.mo1717r();
                try {
                    MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 4506, "4.5.0.6", strArr);
                    initSDK.config().setDeviceId(a);
                    initSDK.setReportUrl(r);
                    initSDK.addTags("host_appid", f26615b);
                    initSDK.addTags("sdk_version", "4.5.0.6");
                    f26614a = true;
                    m31390b(a, r);
                } catch (Throwable unused) {
                    C10638l.m31241d("ApmHelper", "init Apm fail or not include Apm module");
                    f26614a = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m31389a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C0558m.m2671f().mo1844a(m31388a(str), "https://" + str2 + "/monitor/collect/c/session?version_code=" + BuildConfig.VERSION_CODE + "&device_platform=android&aid=" + "10000001");
        }
    }

    /* renamed from: b */
    private static void m31390b(String str, String str2) {
        m31389a(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (f26616c) {
            m31389a(C0517j.m2474a(C0558m.m2663a()), C0558m.m2673h().mo1717r());
        }
    }

    /* renamed from: a */
    private static JSONObject m31388a(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", "4.5.0.6");
            jSONObject3.put("host_app_id", f26615b);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", APSAnalytics.OS_NAME);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", "release");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            C10638l.m31242e("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return f26614a;
    }
}
