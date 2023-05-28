package com.ironsource.mediationsdk.p126a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.f */
final class C4535f extends C4524a {

    /* renamed from: d */
    private final String f11130d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    C4535f(int i) {
        this.f11059b = i;
    }

    /* renamed from: a */
    public final String mo33632a(ArrayList<C4532c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f11058a = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4532c> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject a = m13121a(it.next());
                if (a != null) {
                    jSONArray.put(a);
                }
            }
        }
        return mo33633a(jSONArray);
    }

    /* renamed from: b */
    public final String mo33634b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    /* renamed from: c */
    public final String mo33635c() {
        return "outcome";
    }
}
