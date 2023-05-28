package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10626e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.s */
/* compiled from: SecSdkHelperUtil */
public class C0624s {
    /* renamed from: a */
    public static void m3019a(String str) {
        if (!TextUtils.isEmpty(str) && C0558m.m2673h().mo1665C()) {
            C0621r.m3009a().mo2019a(str);
        }
    }

    /* renamed from: a */
    public static String m3017a() {
        if (C0558m.m2673h().mo1665C()) {
            return C0621r.m3009a().mo2020b();
        }
        return null;
    }

    /* renamed from: b */
    public static void m3021b() {
        if (C0558m.m2673h().mo1665C()) {
            C0621r.m3009a().mo2021b("AdShow");
        }
    }

    /* renamed from: a */
    public static Map<String, String> m3018a(String str, String str2) {
        if (!C0558m.m2673h().mo1665C()) {
            return new HashMap();
        }
        return C0621r.m3009a().mo2018a(str, str2 != null ? str2.getBytes() : new byte[0]);
    }

    /* renamed from: a */
    public static void m3020a(JSONObject jSONObject) {
        if (jSONObject != null && C0558m.m2673h().mo1665C()) {
            try {
                jSONObject.put("sec_did", C0621r.m3009a().mo2022c());
                String a = C10626e.m31201a(jSONObject.toString());
                Map<String, String> a2 = C0621r.m3009a().mo2018a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", a != null ? a.getBytes() : new byte[0]);
                if (a2 != null && a2.size() > 0) {
                    for (String next : a2.keySet()) {
                        jSONObject.put(next, a2.get(next));
                    }
                    jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                    jSONObject.put("pangle_m", a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
