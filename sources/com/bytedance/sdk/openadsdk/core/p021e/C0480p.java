package com.bytedance.sdk.openadsdk.core.p021e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.p */
/* compiled from: PlayableModel */
public class C0480p {

    /* renamed from: a */
    private boolean f1735a;

    /* renamed from: b */
    private int f1736b;

    /* renamed from: c */
    private String f1737c;

    /* renamed from: d */
    private String f1738d;

    /* renamed from: e */
    private int f1739e;

    /* renamed from: e */
    public static boolean m2194e(C0477n nVar) {
        return false;
    }

    public C0480p(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("playable");
            if (optJSONObject != null) {
                this.f1738d = optJSONObject.optString("playable_url", "");
                this.f1739e = optJSONObject.optInt("playable_orientation", 0);
            }
            this.f1735a = jSONObject.optBoolean("is_playable");
            this.f1736b = jSONObject.optInt("playable_type", 0);
            this.f1737c = jSONObject.optString("playable_style");
        }
    }

    /* renamed from: a */
    public void mo1497a(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f1735a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f1738d)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f1738d);
                jSONObject2.put("playable_orientation", this.f1739e);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject.put("playable_type", this.f1736b);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("playable_style", this.f1737c);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: k */
    private static C0480p m2200k(C0477n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.mo1424e();
    }

    /* renamed from: a */
    public static boolean m2190a(C0477n nVar) {
        C0480p k = m2200k(nVar);
        if (k != null && k.f1735a && !TextUtils.isEmpty(m2193d(nVar))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static int m2201l(C0477n nVar) {
        C0480p k = m2200k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f1736b;
    }

    /* renamed from: b */
    public static String m2191b(C0477n nVar) {
        C0480p k = m2200k(nVar);
        if (k == null) {
            return null;
        }
        return k.f1737c;
    }

    /* renamed from: c */
    public static String m2192c(C0477n nVar) {
        C0480p k = m2200k(nVar);
        if (k == null) {
            return null;
        }
        return k.f1738d;
    }

    /* renamed from: d */
    public static String m2193d(C0477n nVar) {
        if (nVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(m2192c(nVar))) {
            return m2192c(nVar);
        }
        if (nVar.mo1330J() != null) {
            return nVar.mo1330J().mo62925j();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m2195f(C0477n nVar) {
        if (((nVar == null || nVar.mo1330J() == null) ? 0 : nVar.mo1330J().mo62933r()) != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m2196g(C0477n nVar) {
        if (nVar == null || nVar.mo1330J() == null || nVar.mo1330J().mo62933r() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m2197h(C0477n nVar) {
        C0480p k = m2200k(nVar);
        if (k == null) {
            return 0;
        }
        return k.f1739e;
    }

    /* renamed from: i */
    public static boolean m2198i(C0477n nVar) {
        return m2190a(nVar) && m2201l(nVar) == 1;
    }

    /* renamed from: j */
    public static boolean m2199j(C0477n nVar) {
        return m2190a(nVar) && m2201l(nVar) == 0;
    }
}
