package com.applovin.impl.mediation.debugger.p243ui.testmode;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.c */
public class C8237c {

    /* renamed from: a */
    private final C8490n f20223a;

    /* renamed from: b */
    private boolean f20224b;

    /* renamed from: c */
    private boolean f20225c;

    /* renamed from: d */
    private String f20226d;

    public C8237c(C8490n nVar) {
        this.f20223a = nVar;
        this.f20226d = (String) nVar.mo57378b(C8382d.f20989B, null);
        nVar.mo57382b(C8382d.f20989B);
        if (StringUtils.isValidString(this.f20226d)) {
            this.f20225c = true;
        }
        this.f20224b = ((Boolean) nVar.mo57378b(C8382d.f20990C, false)).booleanValue();
        nVar.mo57382b(C8382d.f20990C);
    }

    /* renamed from: a */
    public void mo56526a(String str) {
        this.f20226d = str;
    }

    /* renamed from: a */
    public void mo56527a(JSONObject jSONObject) {
        if (!this.f20224b) {
            this.f20224b = JsonUtils.containsCaseInsensitiveString(this.f20223a.mo57340Y().mo57636k().f21575b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f20223a.mo57340Y().mo57632g() || AppLovinSdkUtils.isEmulator();
        }
    }

    /* renamed from: a */
    public void mo56528a(boolean z) {
        this.f20225c = z;
    }

    /* renamed from: a */
    public boolean mo56529a() {
        return this.f20224b;
    }

    /* renamed from: b */
    public boolean mo56530b() {
        return this.f20225c;
    }

    /* renamed from: c */
    public String mo56531c() {
        return this.f20226d;
    }

    /* renamed from: d */
    public void mo56532d() {
        this.f20223a.mo57349a(C8382d.f20990C, true);
    }
}
