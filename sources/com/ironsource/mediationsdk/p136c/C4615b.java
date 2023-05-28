package com.ironsource.mediationsdk.p136c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C4650e;
import com.ironsource.mediationsdk.utils.C4714c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c.b */
public class C4615b {

    /* renamed from: a */
    private String f11396a;

    /* renamed from: b */
    private String f11397b;

    /* renamed from: c */
    private C4650e f11398c;

    public C4615b(String str, String str2, C4650e eVar) {
        this.f11396a = str;
        this.f11397b = str2;
        this.f11398c = eVar;
    }

    /* renamed from: a */
    private static Object m13486a(Object obj) {
        return obj instanceof JSONObject ? m13488a((JSONObject) obj) : obj instanceof JSONArray ? m13487a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private static List<Object> m13487a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m13486a(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e.getMessage()}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m13488a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m13486a(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e.getMessage()}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m13489a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), m13491b(next.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", new Object[]{next.getKey(), next.getValue()}));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m13490a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static Object m13491b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(Arrays.asList(new Object[]{obj}));
            } else if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj instanceof Enum) {
                    return obj.toString();
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public String mo33879a() {
        return this.f11396a;
    }

    /* renamed from: b */
    public String mo33880b() {
        return this.f11397b;
    }

    /* renamed from: c */
    public boolean mo33881c() {
        return this.f11398c.f11608g.f11777e > 0;
    }

    /* renamed from: d */
    public long mo33882d() {
        return this.f11398c.f11608g.f11781i;
    }

    /* renamed from: e */
    public int mo33883e() {
        return this.f11398c.f11607f;
    }

    /* renamed from: f */
    public long mo33884f() {
        return this.f11398c.f11603b;
    }

    /* renamed from: g */
    public int mo33885g() {
        return this.f11398c.f11606e;
    }

    /* renamed from: h */
    public C4714c mo33886h() {
        return this.f11398c.f11608g;
    }
}
