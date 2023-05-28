package com.applovin.impl.mediation.debugger.p238b.p239a;

import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.a */
public class C8152a implements Comparable<C8152a> {

    /* renamed from: a */
    private final String f19884a;

    /* renamed from: b */
    private final String f19885b;

    /* renamed from: c */
    private final MaxAdFormat f19886c;

    /* renamed from: d */
    private final C8154c f19887d;

    /* renamed from: e */
    private final List<C8154c> f19888e;

    public C8152a(JSONObject jSONObject, Map<String, C8160b> map, C8490n nVar) {
        this.f19884a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f19885b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f19886c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", (String) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f19888e = new ArrayList(jSONArray.length());
        C8154c cVar = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C8154c cVar2 = new C8154c(jSONObject2, map, this.f19886c, nVar);
                this.f19888e.add(cVar2);
                if (cVar == null && cVar2.mo56337c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f19887d = cVar;
    }

    /* renamed from: g */
    private C8154c m24424g() {
        if (!this.f19888e.isEmpty()) {
            return this.f19888e.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public int compareTo(C8152a aVar) {
        return this.f19885b.compareToIgnoreCase(aVar.f19885b);
    }

    /* renamed from: a */
    public String mo56324a() {
        return this.f19884a;
    }

    /* renamed from: b */
    public String mo56325b() {
        return this.f19885b;
    }

    /* renamed from: c */
    public String mo56326c() {
        MaxAdFormat maxAdFormat = this.f19886c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : LogConstants.KEY_UNKNOWN;
    }

    /* renamed from: d */
    public MaxAdFormat mo56328d() {
        return this.f19886c;
    }

    /* renamed from: e */
    public C8154c mo56329e() {
        C8154c cVar = this.f19887d;
        return cVar != null ? cVar : m24424g();
    }

    /* renamed from: f */
    public String mo56330f() {
        return "\n---------- " + this.f19885b + " ----------" + "\nIdentifier - " + this.f19884a + "\nFormat     - " + mo56326c();
    }
}
