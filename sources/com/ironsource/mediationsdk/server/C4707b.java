package com.ironsource.mediationsdk.server;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.p136c.C4615b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.server.b */
public class C4707b {

    /* renamed from: a */
    private String f11750a;

    /* renamed from: b */
    private String f11751b;

    /* renamed from: c */
    private String f11752c;

    /* renamed from: d */
    private List<String> f11753d;

    /* renamed from: e */
    private List<String> f11754e;

    /* renamed from: f */
    private List<String> f11755f;

    /* renamed from: g */
    private boolean f11756g;

    /* renamed from: h */
    private ImpressionData f11757h;

    public C4707b(String str) {
        this.f11750a = str;
        this.f11751b = "";
        this.f11752c = "";
        this.f11753d = new ArrayList();
        this.f11754e = new ArrayList();
        this.f11755f = new ArrayList();
        this.f11756g = true;
        this.f11757h = null;
    }

    public C4707b(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public C4707b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f11756g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f11750a = jSONObject.getString("instance");
            }
            this.f11751b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getString("serverData") : "";
            this.f11752c = jSONObject.has("price") ? jSONObject.getString("price") : BuildConfig.ADAPTER_VERSION;
            this.f11753d = new ArrayList();
            this.f11754e = new ArrayList();
            this.f11755f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f11753d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f11754e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f11755f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f11757h = new ImpressionData(C4615b.m13490a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f11756g = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public ImpressionData mo34156a(String str) {
        ImpressionData impressionData = this.f11757h;
        if (impressionData != null) {
            impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        }
        return this.f11757h;
    }

    /* renamed from: a */
    public String mo34157a() {
        return this.f11750a;
    }

    /* renamed from: b */
    public String mo34158b() {
        return this.f11751b;
    }

    /* renamed from: c */
    public String mo34159c() {
        return this.f11752c;
    }

    /* renamed from: d */
    public List<String> mo34160d() {
        return this.f11753d;
    }

    /* renamed from: e */
    public List<String> mo34161e() {
        return this.f11754e;
    }

    /* renamed from: f */
    public List<String> mo34162f() {
        return this.f11755f;
    }

    /* renamed from: g */
    public boolean mo34163g() {
        return this.f11756g;
    }
}
