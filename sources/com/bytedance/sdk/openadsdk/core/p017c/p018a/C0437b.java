package com.bytedance.sdk.openadsdk.core.p017c.p018a;

import com.bytedance.sdk.component.p323e.p327d.C10601c;
import com.bytedance.sdk.openadsdk.common.C0204a;
import com.bytedance.sdk.openadsdk.core.C0558m;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.b */
/* compiled from: DynamicAppInfo */
public class C0437b {
    /* renamed from: b */
    private List<String> m1792b() {
        return Arrays.asList(new String[]{C10601c.c1657027613239dc("aqrJjci"), C10601c.c1657027613239dc("aeKmbj"), C10601c.c1657027613239dc("gdvWahvki}oBbka")});
    }

    /* renamed from: a */
    public JSONObject mo1183a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String put : m1792b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put(C10601c.c1657027613239dc("aqrMehc"), C0204a.m837a());
            jSONObject.put(C10601c.c1657027613239dc("iolfvDvwFhgn"), C0204a.m842e());
            jSONObject.put(C10601c.c1657027613239dc("ahf"), C0204a.m839b());
            jSONObject.put(C10601c.c1657027613239dc("seiF`lrngg"), C0204a.m840c());
            jSONObject.put(C10601c.c1657027613239dc("aqrUawungg"), C0204a.m841d());
            jSONObject.put(C10601c.c1657027613239dc("ndvW}uc"), C0204a.m843f());
            jSONObject.put(C10601c.c1657027613239dc("strskwrKaz~"), jSONArray);
            jSONObject.put(C10601c.c1657027613239dc("ddtjg`Oc"), C0204a.m838a(C0558m.m2663a()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
