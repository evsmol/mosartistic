package com.applovin.impl.sdk.p256e;

import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8538o;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.b */
class C8405b extends C8401a {
    C8405b(C8490n nVar) {
        super("TaskApiSubmitData", nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25318a(JSONObject jSONObject) {
        try {
            JSONObject a = C8572i.m26097a(jSONObject);
            this.f21118b.mo57331O().mo57091a((C8380b<?>) C8380b.f20725aa, (Object) a.getString("device_id"));
            this.f21118b.mo57331O().mo57091a((C8380b<?>) C8380b.f20727ac, (Object) a.getString("device_token"));
            this.f21118b.mo57331O().mo57091a((C8380b<?>) C8380b.f20728ad, (Object) Long.valueOf(a.getLong("publisher_id")));
            C8572i.m26107d(a, this.f21118b);
            C8572i.m26109e(a, this.f21118b);
            String string = JsonUtils.getString(a, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string)) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(a, "sdk_update_message")) {
                    str = JsonUtils.getString(a, "sdk_update_message", str);
                }
                C8626v.m26257h("AppLovinSdk", str);
            }
            this.f21118b.mo57338W().mo57155b();
        } catch (Throwable th) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Unable to parse API response", th);
            }
        }
    }

    /* renamed from: b */
    private void m25319b(JSONObject jSONObject) throws JSONException {
        C8538o Y = this.f21118b.mo57340Y();
        Map<String, Object> d = Y.mo57629d();
        Utils.renameKeyInObjectMap("platform", "type", d);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d);
        jSONObject.put("device_info", new JSONObject(d));
        Map<String, Object> h = Y.mo57633h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h);
        Utils.renameKeyInObjectMap("ia", "installed_at", h);
        jSONObject.put("app_info", new JSONObject(h));
    }

    /* renamed from: c */
    private void m25320c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20942ei)).booleanValue()) {
            jSONObject.put(Constants.STATS, this.f21118b.mo57338W().mo57157c());
        }
    }

    /* renamed from: d */
    private void m25321d(JSONObject jSONObject) {
        C84061 r0 = new C8449u<JSONObject>(C8516c.m25763a(this.f21118b).mo57528a(C8572i.m26095a("2.0/device", this.f21118b)).mo57538c(C8572i.m26105b("2.0/device", this.f21118b)).mo57529a(C8572i.m26108e(this.f21118b)).mo57534b("POST").mo57530a(jSONObject).mo57540d(((Boolean) this.f21118b.mo57342a(C8380b.f20915eH)).booleanValue()).mo57527a(new JSONObject()).mo57526a(((Integer) this.f21118b.mo57342a(C8380b.f20884dc)).intValue()).mo57532a(), this.f21118b) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                C8572i.m26098a(i, this.f21118b);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                C8405b.this.m25318a(jSONObject);
            }
        };
        r0.mo57253a(C8380b.f20780bc);
        r0.mo57255b(C8380b.f20781bd);
        this.f21118b.mo57337V().mo57227a((C8401a) r0);
    }

    public void run() {
        try {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57820c(this.f21119c, "Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            m25319b(jSONObject);
            m25320c(jSONObject);
            m25321d(jSONObject);
        } catch (JSONException e) {
            C8626v vVar2 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Unable to build JSON message with collected data", e);
            }
        }
    }
}
