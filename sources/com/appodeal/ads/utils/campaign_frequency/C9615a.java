package com.appodeal.ads.utils.campaign_frequency;

import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.utils.campaign_frequency.a */
public final class C9615a {

    /* renamed from: b */
    public static final C9562o f24362b = C9562o.f24251b;

    /* renamed from: c */
    public static final /* synthetic */ boolean f24363c = (!C9615a.class.desiredAssertionStatus());

    /* renamed from: a */
    public final String f24364a;

    public C9615a(String str) {
        this.f24364a = str;
    }

    /* renamed from: a */
    public static JSONObject m28366a() {
        Map<String, String> d = f24362b.f24252a.mo60793d();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : d.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), new JSONObject((String) next.getValue()));
            } catch (Exception e) {
                Log.log(e);
            }
        }
        return jSONObject;
    }
}
