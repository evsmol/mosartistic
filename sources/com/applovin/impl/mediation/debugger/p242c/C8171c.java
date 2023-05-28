package com.applovin.impl.mediation.debugger.p242c;

import com.applovin.impl.mediation.p236c.C8133b;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8475k;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8538o;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8449u;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.c.c */
public class C8171c extends C8401a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8511b.C8515c<JSONObject> f19972a;

    public C8171c(C8511b.C8515c<JSONObject> cVar, C8490n nVar) {
        super("TaskFetchMediationDebuggerInfo", nVar, true);
        this.f19972a = cVar;
    }

    /* renamed from: b */
    private JSONObject m24520b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C8134c.m24356a(this.f21118b));
            Boolean a = C8475k.m25551a().mo57299a(mo57169f());
            if (((Boolean) this.f21118b.mo57342a(C8380b.f20862dG)).booleanValue() && !Boolean.TRUE.equals(a)) {
                C8538o.C8544a k = this.f21118b.mo57340Y().mo57636k();
                if (StringUtils.isValidString(k.f21575b)) {
                    jSONObject.put("idfa", k.f21575b);
                }
            }
        } catch (JSONException e) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Failed to construct JSON body", e);
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo56407a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f21118b.mo57342a(C8380b.f20908eA)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21118b.mo57319C());
        }
        Map<String, Object> h = this.f21118b.mo57340Y().mo57633h();
        map.put("package_name", String.valueOf(h.get("package_name")));
        map.put("app_version", String.valueOf(h.get("app_version")));
        Map<String, Object> b = this.f21118b.mo57340Y().mo57627b();
        map.put("platform", String.valueOf(b.get("platform")));
        map.put("os", String.valueOf(b.get("os")));
        return map;
    }

    public void run() {
        C81721 r1 = new C8449u<JSONObject>(C8516c.m25763a(this.f21118b).mo57534b("POST").mo57528a(C8133b.m24352c(this.f21118b)).mo57538c(C8133b.m24353d(this.f21118b)).mo57529a(mo56407a()).mo57527a(new JSONObject()).mo57533b(((Long) this.f21118b.mo57342a(C8379a.f20677g)).intValue()).mo57530a(m24520b()).mo57532a(), this.f21118b, mo57170g()) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                C8171c.this.f19972a.mo56275a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                C8171c.this.f19972a.mo56277a(jSONObject, i);
            }
        };
        r1.mo57253a(C8379a.f20673c);
        r1.mo57255b(C8379a.f20674d);
        this.f21118b.mo57337V().mo57227a((C8401a) r1);
    }
}
