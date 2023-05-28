package com.ironsource.sdk.p144g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.g.f */
public class C4943f {

    /* renamed from: d */
    public JSONObject f12683d;

    public C4943f() {
        this.f12683d = new JSONObject();
    }

    public C4943f(String str) {
        try {
            this.f12683d = new JSONObject(str);
        } catch (Exception unused) {
            this.f12683d = new JSONObject();
        }
    }

    /* renamed from: a */
    private Object m14403a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m14404a((JSONObject) obj) : obj instanceof JSONArray ? mo34679a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private Map<String, Object> m14404a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m14403a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List mo34679a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m14403a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo34680a(String str, String str2) {
        try {
            this.f12683d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo34681a(String str, JSONObject jSONObject) {
        try {
            this.f12683d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo34682a(String str) {
        return this.f12683d.has(str);
    }

    /* renamed from: b */
    public final boolean mo34683b(String str) {
        return this.f12683d.isNull(str);
    }

    /* renamed from: c */
    public final Object mo34684c(String str) {
        try {
            return this.f12683d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo34685d(String str) {
        try {
            return this.f12683d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo34686e(String str) {
        try {
            return this.f12683d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f12683d;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
