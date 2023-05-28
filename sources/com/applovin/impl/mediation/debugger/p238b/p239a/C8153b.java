package com.applovin.impl.mediation.debugger.p238b.p239a;

import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.b */
public class C8153b {

    /* renamed from: a */
    private final C8155d f19889a;

    /* renamed from: b */
    private final C8156e f19890b;

    /* renamed from: c */
    private final List<C8156e> f19891c;

    public C8153b(JSONObject jSONObject, MaxAdFormat maxAdFormat, C8160b bVar, C8490n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f19890b = new C8156e(jSONObject2, nVar);
        } else {
            this.f19890b = null;
        }
        this.f19889a = new C8155d(JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f19891c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f19891c.add(new C8156e(jSONObject3, nVar));
            }
        }
    }

    /* renamed from: a */
    public C8155d mo56331a() {
        return this.f19889a;
    }

    /* renamed from: b */
    public C8156e mo56332b() {
        return this.f19890b;
    }

    /* renamed from: c */
    public boolean mo56333c() {
        return this.f19890b != null;
    }

    /* renamed from: d */
    public List<C8156e> mo56334d() {
        return this.f19891c;
    }
}
