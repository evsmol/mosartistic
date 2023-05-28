package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.p082ob.C2572Tl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ih */
public class C3063ih {
    /* renamed from: a */
    public List<C3034hh> mo17715a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new C2572Tl.C2573a(str).optJSONArray("sdk_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (!TextUtils.isEmpty(optString)) {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                try {
                                    String optString2 = optJSONArray2.getJSONObject(i2).optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                                    if (!TextUtils.isEmpty(optString2)) {
                                        arrayList2.add(optString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!C1848A2.m6814b((Collection) arrayList2)) {
                            arrayList.add(new C3034hh(optString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
