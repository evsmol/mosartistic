package com.bytedance.sdk.openadsdk.core.nativeexpress.p031a;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.a.a */
/* compiled from: TemplateUtils */
public class C0574a {

    /* renamed from: a */
    private static String f2175a = "";

    /* renamed from: a */
    public static boolean m2775a(C0477n nVar) {
        return true;
    }

    /* renamed from: a */
    public static boolean m2774a(C0477n.C0478a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.mo1485b()) || TextUtils.isEmpty(aVar.mo1491e())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static JSONObject m2772a(float f, float f2, boolean z, C0477n nVar) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!m2774a(nVar.mo1327G())) {
                f2175a = "";
            }
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_WIDTH, (double) f);
            jSONObject2.put(IabUtils.KEY_HEIGHT, (double) f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", m2773a(false, nVar));
            if (nVar.mo1327G() != null) {
                str2 = nVar.mo1327G().mo1491e();
                str = nVar.mo1327G().mo1493f();
            } else {
                str2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                f2175a = str2;
            } else if (!(nVar == null || nVar.mo1327G() == null || C10266a.m29497c(nVar.mo1327G().mo1485b()) == null)) {
                f2175a = C10266a.m29497c(nVar.mo1327G().mo1485b()).mo63150e();
            }
            jSONObject.put("template_Plugin", f2175a);
            jSONObject.put("diff_template_Plugin", str);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m2773a(boolean z, C0477n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nVar.mo1343W());
            if (nVar.mo1333M() != null) {
                if (nVar.mo1333M() != null) {
                    if (!TextUtils.isEmpty(nVar.mo1333M().mo1281a())) {
                        jSONObject.put("icon", nVar.mo1333M().mo1281a());
                    }
                }
                jSONObject.put("icon", "");
            }
            JSONArray jSONArray = new JSONArray();
            if (nVar.mo1336P() != null) {
                for (int i = 0; i < nVar.mo1336P().size(); i++) {
                    C0463k kVar = nVar.mo1336P().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IabUtils.KEY_HEIGHT, kVar.mo1288c());
                    jSONObject2.put(IabUtils.KEY_WIDTH, kVar.mo1285b());
                    jSONObject2.put("url", kVar.mo1281a());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nVar.mo1383ad());
            jSONObject.put("interaction_type", nVar.mo1332L());
            jSONObject.put("interaction_method", nVar.mo1431g());
            jSONObject.put("is_compliance_template", m2775a(nVar));
            jSONObject.put("title", nVar.mo1341U());
            jSONObject.put("description", nVar.mo1342V());
            jSONObject.put("source", nVar.mo1331K());
            if (nVar.mo1380aa() != null) {
                jSONObject.put("comment_num", nVar.mo1380aa().mo1223e());
                jSONObject.put("score", nVar.mo1380aa().mo1222d());
                jSONObject.put("app_size", nVar.mo1380aa().mo1224f());
                jSONObject.put("app", nVar.mo1380aa().mo1225g());
            }
            if (nVar.mo1330J() != null) {
                jSONObject.put("video", nVar.mo1330J().mo62931p());
            }
            if (nVar.mo1327G() != null) {
                jSONObject.put("dynamic_creative", nVar.mo1327G().mo1495g());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m2771a(C0477n nVar, String str) {
        List<C0463k> P;
        if (!(nVar == null || (P = nVar.mo1336P()) == null || P.size() <= 0)) {
            for (C0463k next : P) {
                if (next != null && TextUtils.equals(str, next.mo1281a())) {
                    return next.mo1292g();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m2776b(C0477n nVar) {
        HashMap hashMap = null;
        if (nVar == null) {
            return null;
        }
        List<C0463k> P = nVar.mo1336P();
        if (P != null && P.size() > 0) {
            hashMap = new HashMap();
            for (C0463k next : P) {
                if (next != null) {
                    hashMap.put(next.mo1281a(), next.mo1292g());
                }
            }
        }
        return hashMap;
    }
}
