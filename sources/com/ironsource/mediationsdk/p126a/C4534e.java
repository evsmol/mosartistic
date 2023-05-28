package com.ironsource.mediationsdk.p126a;

import com.appnext.base.p264b.C8849c;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.e */
final class C4534e extends C4524a {

    /* renamed from: d */
    private final String f11126d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e */
    private final String f11127e = "super.dwh.mediation_events";

    /* renamed from: f */
    private final String f11128f = "table";

    /* renamed from: g */
    private final String f11129g = C8849c.DATA;

    C4534e(int i) {
        this.f11059b = i;
    }

    /* renamed from: a */
    public final String mo33632a(ArrayList<C4532c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f11058a = jSONObject;
        try {
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
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put(C8849c.DATA, mo33633a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo33634b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    /* renamed from: c */
    public final String mo33635c() {
        return "ironbeast";
    }
}
