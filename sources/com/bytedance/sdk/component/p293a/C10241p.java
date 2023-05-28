package com.bytedance.sdk.component.p293a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.p */
/* compiled from: Java2JsMsg */
public final class C10241p {

    /* renamed from: a */
    private final Map<String, Object> f25282a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C10241p m29402a() {
        return new C10241p();
    }

    private C10241p() {
    }

    /* renamed from: a */
    public C10241p mo63060a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f25282a.put(str, obj);
        }
        return this;
    }

    /* renamed from: b */
    public String mo63061b() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.f25282a.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
