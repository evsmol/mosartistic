package com.appnext.core.p267a;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.a.a */
public final class C8893a {

    /* renamed from: hT */
    private HashMap<String, String> f22524hT;

    /* renamed from: hU */
    private HashMap<String, HashMap<String, String>> f22525hU = new HashMap<>();

    public C8893a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f22524hT = m26837d(jSONObject.getJSONObject(C8894b.f22527hW));
            this.f22525hU.put(C8894b.f22528hX, m26837d(jSONObject.getJSONObject(C8894b.f22528hX)));
            this.f22525hU.put(C8894b.f22529hY, m26837d(jSONObject.getJSONObject(C8894b.f22529hY)));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: t */
    public final String mo58968t(String str, String str2) {
        if (this.f22525hU.containsKey(str)) {
            return (String) this.f22525hU.get(str).get(str2);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo58967d(String str) {
        return this.f22524hT.get(str);
    }

    /* renamed from: d */
    private static HashMap<String, String> m26837d(JSONObject jSONObject) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }
}
