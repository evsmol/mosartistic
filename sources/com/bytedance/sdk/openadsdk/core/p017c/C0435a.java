package com.bytedance.sdk.openadsdk.core.p017c;

import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p017c.p018a.C0436a;
import com.bytedance.sdk.openadsdk.core.p017c.p018a.C0437b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a */
/* compiled from: DynamicUtils */
public class C0435a {
    /* renamed from: a */
    public static String m1788a(C10296l lVar, C0477n nVar) {
        return m1789a(lVar.mo63175a(), lVar.mo63179e(), lVar.mo63180f(), lVar.mo63181g(), lVar.mo63182h(), lVar.mo63183i(), nVar);
    }

    /* renamed from: a */
    public static String m1789a(JSONObject jSONObject, String str, String str2, String str3, boolean z, int i, C0477n nVar) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject.put("setting", m1790a(str3, z, i, nVar));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("templateInfo", jSONObject);
        jSONObject2.put("adInfo", new C0436a(str, str3, str2).mo1182a());
        jSONObject2.put("appInfo", new C0437b().mo1183a());
        return jSONObject2.toString();
    }

    /* renamed from: a */
    private static JSONObject m1790a(String str, boolean z, int i, C0477n nVar) {
        JSONObject jSONObject = new JSONObject();
        if (C0558m.m2673h() != null) {
            try {
                int f = C0996u.m4657f(nVar);
                int f2 = C0558m.m2673h().mo1690f(String.valueOf(f));
                boolean c = C0558m.m2673h().mo1682c(String.valueOf(f));
                jSONObject.put("voice_control", C0558m.m2673h().mo1678b(f));
                jSONObject.put("rv_skip_time", f2);
                jSONObject.put("fv_skip_show", c);
                jSONObject.put("show_dislike", z);
                jSONObject.put("video_adaptation", i);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
