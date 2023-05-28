package com.bytedance.sdk.openadsdk.core.p025i;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.c */
/* compiled from: JsConfiglInfo */
public class C0511c {

    /* renamed from: a */
    public String f1865a = "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js";

    /* renamed from: b */
    public boolean f1866b = true;

    public C0511c(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            this.f1865a = optJSONObject.optString("url", "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js");
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
            this.f1866b = arrayList.contains("load_finish");
        } catch (Exception unused) {
        }
    }
}
