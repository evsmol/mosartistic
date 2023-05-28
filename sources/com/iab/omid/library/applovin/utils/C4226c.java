package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.C4210e;
import com.iab.omid.library.applovin.walking.C4238a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.iab.omid.library.applovin.utils.c */
public class C4226c {

    /* renamed from: a */
    private static WindowManager f10102a;

    /* renamed from: b */
    private static String[] f10103b = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: c */
    static float f10104c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.applovin.utils.c$a */
    static /* synthetic */ class C4227a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10105a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f10105a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.iab.omid.library.applovin.utils.c$b */
    private static class C4228b {

        /* renamed from: a */
        final float f10106a;

        /* renamed from: b */
        final float f10107b;

        C4228b(float f, float f2) {
            this.f10106a = f;
            this.f10107b = f2;
        }
    }

    /* renamed from: a */
    static float m11852a(int i) {
        return ((float) i) / f10104c;
    }

    /* renamed from: a */
    private static C4228b m11853a(JSONObject jSONObject) {
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
                return new C4228b(f2, f);
            }
        } else if (f10102a != null) {
            Point point = new Point(0, 0);
            f10102a.getDefaultDisplay().getRealSize(point);
            f2 = m11852a(point.x);
            f = m11852a(point.y);
            return new C4228b(f2, f);
        }
        f = 0.0f;
        return new C4228b(f2, f);
    }

    /* renamed from: a */
    public static JSONObject m11854a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m11852a(i));
            jSONObject.put("y", (double) m11852a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) m11852a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) m11852a(i4));
        } catch (JSONException e) {
            C4229d.m11874a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m11855a(Context context) {
        if (context != null) {
            f10104c = context.getResources().getDisplayMetrics().density;
            f10102a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m11856a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m11862a(outputDeviceStatus));
        } catch (JSONException e) {
            C4229d.m11874a("Error with setting output device status", e);
        }
    }

    /* renamed from: a */
    public static void m11857a(JSONObject jSONObject, C4238a.C4239a aVar) {
        C4210e a = aVar.mo32648a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo32650b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo32566d());
            jSONObject.put("friendlyObstructionPurpose", a.mo32564b());
            jSONObject.put("friendlyObstructionReason", a.mo32563a());
        } catch (JSONException e) {
            C4229d.m11874a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m11858a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C4229d.m11874a("Error with setting has window focus", e);
        }
    }

    /* renamed from: a */
    public static void m11859a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4229d.m11874a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m11860a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C4229d.m11874a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m11861a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m11862a(OutputDeviceStatus outputDeviceStatus) {
        return C4227a.f10105a[outputDeviceStatus.ordinal()] == 1;
    }

    /* renamed from: a */
    private static boolean m11863a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    public static void m11864b(JSONObject jSONObject) {
        C4228b a = m11853a(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) a.f10106a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) a.f10107b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11865b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4229d.m11874a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    private static boolean m11866b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11863a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m11872h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m11867c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m11863a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m11868d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m11869e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* renamed from: f */
    private static boolean m11870f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10103b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m11871g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: h */
    public static boolean m11872h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m11870f(jSONObject, jSONObject2) && m11871g(jSONObject, jSONObject2) && m11869e(jSONObject, jSONObject2) && m11868d(jSONObject, jSONObject2) && m11867c(jSONObject, jSONObject2) && m11866b(jSONObject, jSONObject2);
    }
}
