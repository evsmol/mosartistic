package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.c */
/* compiled from: DynamicCreative */
public class C10345c {

    /* renamed from: a */
    private HashMap<String, Object> f25584a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f25585b;

    public C10345c(JSONObject jSONObject) {
        this.f25585b = jSONObject;
    }

    /* renamed from: a */
    public Object mo63351a(String str) {
        if (this.f25584a.containsKey(str)) {
            return this.f25584a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo63353b(String str) {
        return this.f25584a.containsKey(str);
    }

    /* renamed from: a */
    public void mo63352a() {
        Iterator<String> keys = this.f25585b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.f25585b.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                Object opt2 = optJSONObject.opt(next2);
                                HashMap<String, Object> hashMap = this.f25584a;
                                hashMap.put(next + "." + i + "." + next2, opt2);
                            }
                        }
                        i++;
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if (!(opt3 instanceof JSONArray) || TextUtils.equals(next3, "short_phrase") || TextUtils.equals(next3, "long_phrase")) {
                                HashMap<String, Object> hashMap2 = this.f25584a;
                                hashMap2.put(next + "." + next3, opt3);
                            } else {
                                for (int i2 = 0; i2 < ((JSONArray) opt3).length(); i2++) {
                                    HashMap<String, Object> hashMap3 = this.f25584a;
                                    hashMap3.put(next + "." + next3 + "." + i2, ((JSONArray) opt3).opt(i2));
                                }
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.f25584a.put(next, opt);
                if (opt instanceof String) {
                    this.f25584a.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys4 = jSONObject2.keys();
                while (keys4.hasNext()) {
                    String next4 = keys4.next();
                    Object opt4 = jSONObject2.opt(next4);
                    HashMap<String, Object> hashMap4 = this.f25584a;
                    hashMap4.put(next + "." + next4, opt4);
                }
            }
        }
    }
}
