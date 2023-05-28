package com.iab.omid.library.amazon.p101d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.amazon.p099b.C4157c;
import com.iab.omid.library.amazon.walking.C4184a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.iab.omid.library.amazon.d.b */
public class C4169b {

    /* renamed from: a */
    static float f9964a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f9965b;

    /* renamed from: c */
    private static String[] f9966c = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: com.iab.omid.library.amazon.d.b$a */
    private static class C4170a {

        /* renamed from: a */
        final float f9967a;

        /* renamed from: b */
        final float f9968b;

        C4170a(float f, float f2) {
            this.f9967a = f;
            this.f9968b = f2;
        }
    }

    /* renamed from: a */
    static float m11578a(int i) {
        return ((float) i) / f9964a;
    }

    /* renamed from: a */
    public static JSONObject m11579a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m11578a(i));
            jSONObject.put("y", (double) m11578a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) m11578a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) m11578a(i4));
        } catch (JSONException e) {
            C4171c.m11597a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m11580a(Context context) {
        if (context != null) {
            f9964a = context.getResources().getDisplayMetrics().density;
            f9965b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m11581a(JSONObject jSONObject) {
        C4170a b = m11588b(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) b.f9967a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) b.f9968b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11582a(JSONObject jSONObject, C4184a.C4185a aVar) {
        C4157c a = aVar.mo32436a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo32438b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo32356b());
            jSONObject.put("friendlyObstructionPurpose", a.mo32357c());
            jSONObject.put("friendlyObstructionReason", a.mo32358d());
        } catch (JSONException e) {
            C4171c.m11597a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m11583a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C4171c.m11597a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m11584a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4171c.m11597a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m11585a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C4171c.m11597a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m11586a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m11587a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4170a m11588b(JSONObject jSONObject) {
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
                return new C4170a(f2, f);
            }
        } else if (f9965b != null) {
            Point point = new Point(0, 0);
            f9965b.getDefaultDisplay().getRealSize(point);
            f2 = m11578a(point.x);
            f = m11578a(point.y);
            return new C4170a(f2, f);
        }
        f = 0.0f;
        return new C4170a(f2, f);
    }

    /* renamed from: b */
    public static void m11589b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4171c.m11597a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m11590b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m11591c(jSONObject, jSONObject2) && m11593e(jSONObject, jSONObject2) && m11592d(jSONObject, jSONObject2) && m11594f(jSONObject, jSONObject2) && m11595g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m11591c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f9966c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m11592d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"));
    }

    /* renamed from: e */
    private static boolean m11593e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m11594f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11587a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m11595g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11587a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m11590b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
