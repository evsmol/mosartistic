package com.iab.omid.library.ironsrc.p113d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.p111b.C4314c;
import com.iab.omid.library.ironsrc.walking.C4341a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.iab.omid.library.ironsrc.d.b */
public class C4326b {

    /* renamed from: a */
    static float f10319a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10320b;

    /* renamed from: c */
    private static String[] f10321c = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: com.iab.omid.library.ironsrc.d.b$a */
    static class C4327a {

        /* renamed from: a */
        final float f10322a;

        /* renamed from: b */
        final float f10323b;

        C4327a(float f, float f2) {
            this.f10322a = f;
            this.f10323b = f2;
        }
    }

    /* renamed from: a */
    static float m12280a(int i) {
        return ((float) i) / f10319a;
    }

    /* renamed from: a */
    public static JSONObject m12281a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m12280a(i));
            jSONObject.put("y", (double) m12280a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) m12280a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) m12280a(i4));
        } catch (JSONException e) {
            C4328c.m12297a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m12282a(Context context) {
        if (context != null) {
            f10319a = context.getResources().getDisplayMetrics().density;
            f10320b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m12283a(JSONObject jSONObject) {
        C4327a b = m12289b(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) b.f10322a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) b.f10323b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m12284a(JSONObject jSONObject, C4341a.C4342a aVar) {
        C4314c a = aVar.mo33028a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo33030b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo32949b());
            jSONObject.put("friendlyObstructionPurpose", a.mo32950c());
            jSONObject.put("friendlyObstructionReason", a.mo32951d());
        } catch (JSONException e) {
            C4328c.m12297a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m12285a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4328c.m12297a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m12286a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4328c.m12297a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m12287a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m12288a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4327a m12289b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble(IabUtils.KEY_WIDTH);
                        double optDouble4 = optJSONObject.optDouble(IabUtils.KEY_HEIGHT);
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C4327a(f2, f);
            }
        } else if (f10320b != null) {
            Point point = new Point(0, 0);
            f10320b.getDefaultDisplay().getRealSize(point);
            f2 = m12280a(point.x);
            f = m12280a(point.y);
            return new C4327a(f2, f);
        }
        f = 0.0f;
        return new C4327a(f2, f);
    }

    /* renamed from: b */
    public static void m12290b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4328c.m12297a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m12291b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m12292c(jSONObject, jSONObject2) && m12293d(jSONObject, jSONObject2) && m12294e(jSONObject, jSONObject2) && m12295f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m12292c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10321c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m12293d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m12294e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m12288a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m12295f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m12288a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m12291b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
