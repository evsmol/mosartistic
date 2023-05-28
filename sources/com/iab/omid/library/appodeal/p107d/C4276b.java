package com.iab.omid.library.appodeal.p107d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.appodeal.p105b.C4264c;
import com.iab.omid.library.appodeal.walking.C4291a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.iab.omid.library.appodeal.d.b */
public class C4276b {

    /* renamed from: a */
    static float f10205a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10206b;

    /* renamed from: c */
    private static String[] f10207c = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: com.iab.omid.library.appodeal.d.b$a */
    private static class C4277a {

        /* renamed from: a */
        final float f10208a;

        /* renamed from: b */
        final float f10209b;

        C4277a(float f, float f2) {
            this.f10208a = f;
            this.f10209b = f2;
        }
    }

    /* renamed from: a */
    static float m12059a(int i) {
        return ((float) i) / f10205a;
    }

    /* renamed from: a */
    public static JSONObject m12060a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m12059a(i));
            jSONObject.put("y", (double) m12059a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) m12059a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) m12059a(i4));
        } catch (JSONException e) {
            C4278c.m12076a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m12061a(Context context) {
        if (context != null) {
            f10205a = context.getResources().getDisplayMetrics().density;
            f10206b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m12062a(JSONObject jSONObject) {
        C4277a b = m12068b(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) b.f10208a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) b.f10209b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m12063a(JSONObject jSONObject, C4291a.C4292a aVar) {
        C4264c a = aVar.mo32842a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo32844b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo32763b());
            jSONObject.put("friendlyObstructionPurpose", a.mo32764c());
            jSONObject.put("friendlyObstructionReason", a.mo32765d());
        } catch (JSONException e) {
            C4278c.m12076a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m12064a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4278c.m12076a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m12065a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4278c.m12076a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m12066a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m12067a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4277a m12068b(JSONObject jSONObject) {
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
                return new C4277a(f2, f);
            }
        } else if (f10206b != null) {
            Point point = new Point(0, 0);
            f10206b.getDefaultDisplay().getRealSize(point);
            f2 = m12059a(point.x);
            f = m12059a(point.y);
            return new C4277a(f2, f);
        }
        f = 0.0f;
        return new C4277a(f2, f);
    }

    /* renamed from: b */
    public static void m12069b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4278c.m12076a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m12070b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m12071c(jSONObject, jSONObject2) && m12072d(jSONObject, jSONObject2) && m12073e(jSONObject, jSONObject2) && m12074f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m12071c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10207c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m12072d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m12073e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m12067a(optJSONArray, optJSONArray2)) {
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
    private static boolean m12074f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m12067a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m12070b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
