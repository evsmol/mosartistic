package com.apm.insight.p178l;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.l */
public final class C6678l {
    /* renamed from: a */
    public static int m16553a(JSONObject jSONObject, int i, String... strArr) {
        JSONObject c = m16563c(jSONObject, strArr);
        if (c == null) {
            return i;
        }
        int optInt = c.optInt(strArr[strArr.length - 1], i);
        C6688q.m16627a("JSONUtil", (Object) "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + optInt);
        return optInt;
    }

    /* renamed from: a */
    public static JSONArray m16554a(int i, int i2, JSONArray jSONArray) {
        int i3 = i2 + i;
        if (jSONArray.length() <= i3) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i4 = 0; i4 < i; i4++) {
            jSONArray2.put(jSONArray.opt(i4));
        }
        while (i < i3) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i3 - i)));
            i++;
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONArray m16555a(JSONObject jSONObject, String... strArr) {
        JSONObject c = m16563c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        JSONArray optJSONArray = c.optJSONArray(strArr[strArr.length - 1]);
        C6688q.m16627a("ApmConfig", (Object) "normal get configArray: " + strArr[strArr.length - 1] + " : " + optJSONArray);
        return optJSONArray;
    }

    /* renamed from: a */
    public static JSONArray m16556a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m16557a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m16558a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* renamed from: a */
    public static boolean m16559a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* renamed from: a */
    public static boolean m16560a(JSONObject jSONObject, String str) {
        return m16559a(jSONObject) || m16558a(jSONObject.optJSONArray(str));
    }

    /* renamed from: b */
    public static String m16561b(JSONObject jSONObject, String... strArr) {
        JSONObject c = m16563c(jSONObject, strArr);
        if (c == null) {
            return null;
        }
        String optString = c.optString(strArr[strArr.length - 1]);
        C6688q.m16627a("ApmConfig", (Object) "normal get configArray: " + strArr[strArr.length - 1] + " : " + optString);
        return optString;
    }

    /* renamed from: b */
    public static HashMap<String, Object> m16562b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: c */
    public static JSONObject m16563c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            C6688q.m16628a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                C6688q.m16627a("JSONUtil", (Object) "err get json: not found node:" + strArr[i]);
                return null;
            }
        }
        return jSONObject;
    }
}
