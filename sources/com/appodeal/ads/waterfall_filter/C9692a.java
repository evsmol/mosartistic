package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.C9326n5;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.waterfall_filter.a */
public final class C9692a extends C9695d {

    /* renamed from: d */
    public final ArrayList f24522d;

    /* renamed from: e */
    public C9695d f24523e = mo61219a();

    /* renamed from: f */
    public final AdType f24524f;

    public C9692a(JSONObject jSONObject, AdType adType) {
        ArrayList arrayList = new ArrayList();
        this.f24522d = arrayList;
        mo61220a(jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        this.f24524f = adType;
        arrayList.add(new C9694c(adType));
        arrayList.add(new C9693b(optJSONArray));
    }

    /* renamed from: a */
    public final void mo61214a(C9420r rVar) {
        this.f24523e = mo61219a();
        Iterator it = this.f24522d.iterator();
        while (it.hasNext()) {
            ((C9696e) it.next()).mo61217a(this.f24523e.f24532c, rVar);
        }
        C9695d dVar = this.f24523e;
        dVar.f24530a.clear();
        dVar.f24531b.clear();
        Iterator it2 = dVar.f24532c.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject = (JSONObject) it2.next();
            (jSONObject.optBoolean("is_precache") ? dVar.f24530a : dVar.f24531b).add(jSONObject);
        }
        C9326n5.m27535a(this.f24524f, this);
    }

    /* renamed from: b */
    public final ArrayList mo61215b() {
        return this.f24523e.f24530a;
    }

    /* renamed from: c */
    public final ArrayList mo61216c() {
        return this.f24523e.f24531b;
    }
}
