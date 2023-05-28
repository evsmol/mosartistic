package com.bytedance.sdk.openadsdk.core.p021e;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.e */
/* compiled from: AutoTestModel */
public class C0453e {

    /* renamed from: a */
    private String f1500a = "";

    /* renamed from: b */
    private List<String> f1501b = new ArrayList();

    public C0453e(String str) {
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : m1864a(str);
        try {
            this.f1500a = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.f1501b = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f1501b.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo1230a() {
        return this.f1500a;
    }

    /* renamed from: b */
    public List<String> mo1231b() {
        return this.f1501b;
    }

    /* renamed from: a */
    private static final HashMap<String, Object> m1864a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
