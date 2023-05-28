package com.appnext.base.p264b;

import android.text.TextUtils;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p260a.p263c.C8843d;
import com.appnext.base.p264b.C8850d;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.b */
public final class C8848b {
    /* renamed from: d */
    public static boolean m26671d(C8838c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            int i = C8856i.m26695aR().getInt(cVar.getKey() + C8856i.f22443fA, 0);
            try {
                if (i >= Integer.parseInt(cVar.mo58705an()) || i == 0) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: E */
    private static List<C8837b> m26664E(String str) {
        try {
            return C8831a.m26576X().mo58685aa().mo58734v(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static boolean m26665F(String str) {
        List<C8837b> E = m26664E(str);
        return E == null || E.size() == 0;
    }

    /* renamed from: a */
    public static JSONObject m26669a(String str, Date date, C8850d.C8851a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            String L = C8855h.m26688aO().mo58752L(str);
            if (TextUtils.isEmpty(L)) {
                return jSONObject;
            }
            jSONObject.put(C8849c.DATA, C8857j.m26705b(L, aVar));
            jSONObject.put("date", C8857j.m26698a(date));
            return jSONObject;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: G */
    public static void m26666G(String str) {
        if (str != null) {
            try {
                C8856i.m26695aR().putInt(str + C8856i.f22443fA, 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: H */
    public static void m26667H(String str) {
        try {
            C8856i.m26695aR().putLong(str + C8856i.f22448fy, System.currentTimeMillis());
            String str2 = str + C8856i.f22443fA;
            C8856i.m26695aR().putInt(str2, C8856i.m26695aR().getInt(str2, 0) + 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static JSONArray m26668a(List<C8837b> list, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (C8837b next : list) {
                String ai = next.mo58695ai();
                if (!ai.isEmpty()) {
                    String K = C8855h.m26688aO().mo58751K(ai);
                    if (!TextUtils.isEmpty(K)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C8843d.f22400ec, next.mo58694ah());
                        jSONObject.put(C8843d.COLUMN_TYPE, next.getType());
                        jSONObject.put(C8843d.f22401ed, K);
                        jSONObject.put(C8843d.f22403ef, next.getDataType());
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m26670a(String str, Map<String, String> map) {
        try {
            return C8857j.m26707b(str, map);
        } catch (Throwable unused) {
            return false;
        }
    }
}
