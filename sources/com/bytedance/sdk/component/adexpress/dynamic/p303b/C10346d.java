package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d */
/* compiled from: DynamicDiffPlugin */
public class C10346d {

    /* renamed from: a */
    public List<C10347a> f25586a;

    /* renamed from: b */
    public String f25587b;

    /* renamed from: c */
    public String f25588c;

    /* renamed from: d */
    public String f25589d;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d$a */
    /* compiled from: DynamicDiffPlugin */
    public static class C10347a {

        /* renamed from: a */
        public int f25590a;

        /* renamed from: b */
        public JSONObject f25591b;
    }

    /* renamed from: a */
    public static C10346d m29889a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C10346d dVar = new C10346d();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C10347a aVar = new C10347a();
                    aVar.f25590a = optJSONObject.optInt("id");
                    aVar.f25591b = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(aVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dVar.f25586a = arrayList;
        dVar.f25587b = jSONObject.optString("diff_data");
        dVar.f25588c = jSONObject.optString("style_diff");
        dVar.f25589d = jSONObject.optString("tag_diff");
        return dVar;
    }
}
