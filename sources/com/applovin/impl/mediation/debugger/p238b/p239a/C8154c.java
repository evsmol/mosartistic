package com.applovin.impl.mediation.debugger.p238b.p239a;

import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.c */
public class C8154c {

    /* renamed from: a */
    private final String f19892a;

    /* renamed from: b */
    private final boolean f19893b;

    /* renamed from: c */
    private final List<C8153b> f19894c;

    /* renamed from: d */
    private final List<C8153b> f19895d;

    /* renamed from: e */
    private boolean f19896e = false;

    C8154c(JSONObject jSONObject, Map<String, C8160b> map, MaxAdFormat maxAdFormat, C8490n nVar) {
        this.f19892a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f19893b = JsonUtils.getBoolean(jSONObject, RewardedVideo.VIDEO_MODE_DEFAULT, false).booleanValue();
        JSONObject jSONObject2 = jSONObject;
        Map<String, C8160b> map2 = map;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        C8490n nVar2 = nVar;
        this.f19894c = m24436a("bidders", jSONObject2, map2, maxAdFormat2, nVar2);
        this.f19895d = m24436a("waterfall", jSONObject2, map2, maxAdFormat2, nVar2);
    }

    /* renamed from: a */
    private List<C8153b> m24436a(String str, JSONObject jSONObject, Map<String, C8160b> map, MaxAdFormat maxAdFormat, C8490n nVar) {
        C8160b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (!(jSONObject2 == null || (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) == null)) {
                if (bVar.mo56360A()) {
                    this.f19896e = true;
                }
                arrayList.add(new C8153b(jSONObject2, maxAdFormat, bVar, nVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C8153b> mo56335a() {
        return this.f19894c;
    }

    /* renamed from: b */
    public List<C8153b> mo56336b() {
        return this.f19895d;
    }

    /* renamed from: c */
    public boolean mo56337c() {
        return this.f19893b;
    }

    /* renamed from: d */
    public boolean mo56338d() {
        return this.f19896e;
    }
}
