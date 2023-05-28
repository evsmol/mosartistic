package com.iab.omid.library.adcolony.p095d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.adcolony.p093b.C4107c;
import com.iab.omid.library.adcolony.walking.C4134a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.iab.omid.library.adcolony.d.b */
public class C4119b {

    /* renamed from: a */
    static float f9847a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f9848b;

    /* renamed from: c */
    private static String[] f9849c = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: com.iab.omid.library.adcolony.d.b$a */
    private static class C4120a {

        /* renamed from: a */
        final float f9850a;

        /* renamed from: b */
        final float f9851b;

        C4120a(float f, float f2) {
            this.f9850a = f;
            this.f9851b = f2;
        }
    }

    /* renamed from: a */
    static float m11348a(int i) {
        return ((float) i) / f9847a;
    }

    /* renamed from: a */
    public static JSONObject m11349a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m11348a(i));
            jSONObject.put("y", (double) m11348a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) m11348a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) m11348a(i4));
        } catch (JSONException e) {
            C4121c.m11367a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m11350a(Context context) {
        if (context != null) {
            f9847a = context.getResources().getDisplayMetrics().density;
            f9848b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m11351a(JSONObject jSONObject) {
        C4120a b = m11358b(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) b.f9850a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) b.f9851b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11352a(JSONObject jSONObject, C4134a.C4135a aVar) {
        C4107c a = aVar.mo32237a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo32239b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo32157b());
            jSONObject.put("friendlyObstructionPurpose", a.mo32158c());
            jSONObject.put("friendlyObstructionReason", a.mo32159d());
        } catch (JSONException e) {
            C4121c.m11367a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m11353a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C4121c.m11367a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m11354a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4121c.m11367a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m11355a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C4121c.m11367a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m11356a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m11357a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4120a m11358b(JSONObject jSONObject) {
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
                return new C4120a(f2, f);
            }
        } else if (f9848b != null) {
            Point point = new Point(0, 0);
            f9848b.getDefaultDisplay().getRealSize(point);
            f2 = m11348a(point.x);
            f = m11348a(point.y);
            return new C4120a(f2, f);
        }
        f = 0.0f;
        return new C4120a(f2, f);
    }

    /* renamed from: b */
    public static void m11359b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4121c.m11367a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m11360b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m11361c(jSONObject, jSONObject2) && m11363e(jSONObject, jSONObject2) && m11362d(jSONObject, jSONObject2) && m11364f(jSONObject, jSONObject2) && m11365g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m11361c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f9849c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m11362d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m11363e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m11364f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11357a(optJSONArray, optJSONArray2)) {
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
    private static boolean m11365g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11357a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m11360b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
