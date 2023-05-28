package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.waterfall_filter.d */
public class C9695d {

    /* renamed from: a */
    public final ArrayList f24530a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f24531b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f24532c = new ArrayList();

    /* renamed from: a */
    public final C9695d mo61219a() {
        C9695d dVar = new C9695d();
        ArrayList arrayList = this.f24530a;
        ArrayList arrayList2 = dVar.f24530a;
        if (arrayList != null) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = this.f24531b;
        ArrayList arrayList4 = dVar.f24531b;
        if (arrayList3 != null) {
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
        }
        ArrayList arrayList5 = dVar.f24532c;
        ArrayList arrayList6 = this.f24532c;
        if (arrayList6 != null) {
            arrayList5.clear();
            arrayList5.addAll(arrayList6);
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo61220a(JSONObject jSONObject) {
        ArrayList arrayList = this.f24530a;
        arrayList.clear();
        JSONArray optJSONArray = jSONObject.optJSONArray("precache");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getJSONObject(i));
                } catch (Exception e) {
                    Log.log(e);
                }
            }
        }
        ArrayList arrayList2 = this.f24531b;
        arrayList2.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("ads");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    arrayList2.add(optJSONArray2.getJSONObject(i2));
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
        }
        this.f24532c.clear();
        Iterator it = this.f24530a.iterator();
        while (it.hasNext()) {
            try {
                ((JSONObject) it.next()).put("is_precache", true);
            } catch (JSONException e3) {
                Log.log(e3);
            }
        }
        this.f24532c.addAll(this.f24530a);
        this.f24532c.addAll(this.f24531b);
    }
}
