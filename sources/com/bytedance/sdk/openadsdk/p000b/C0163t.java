package com.bytedance.sdk.openadsdk.p000b;

import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.p000b.C0141h;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.t */
/* compiled from: StatsEventThread */
public class C0163t extends C0141h<C0818c.C0821a> {

    /* renamed from: l */
    private C0561n<C0106a> f616l = C0558m.m2671f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo414a() {
        return false;
    }

    public C0163t(String str, String str2, C0139f fVar, C0561n nVar, C0141h.C0144c cVar, C0141h.C0143b bVar) {
        super(str, str2, fVar, nVar, cVar, bVar);
    }

    /* renamed from: a */
    public C0145i mo413a(List<C0818c.C0821a> list) {
        if (this.f616l == null) {
            this.f616l = C0558m.m2671f();
        }
        if (list == null || list.size() == 0 || !C0515e.m2397a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C0818c.C0821a aVar : list) {
                jSONArray.put(aVar.f3026b);
            }
            jSONObject.put("stats_list", jSONArray);
        } catch (Exception unused) {
        }
        return this.f616l.mo1845b(jSONObject);
    }
}
