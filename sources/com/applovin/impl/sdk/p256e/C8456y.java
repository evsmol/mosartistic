package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.network.C8511b;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.y */
public abstract class C8456y extends C8401a {
    protected C8456y(String str, C8490n nVar) {
        super(str, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo56284a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56285a(int i) {
        C8572i.m26098a(i, this.f21118b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56286a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57263a(JSONObject jSONObject, final C8511b.C8515c<JSONObject> cVar) {
        C84571 r0 = new C8449u<JSONObject>(C8516c.m25763a(this.f21118b).mo57528a(C8572i.m26095a(mo56284a(), this.f21118b)).mo57538c(C8572i.m26105b(mo56284a(), this.f21118b)).mo57529a(C8572i.m26108e(this.f21118b)).mo57534b("POST").mo57530a(jSONObject).mo57540d(((Boolean) this.f21118b.mo57342a(C8380b.f20919eL)).booleanValue()).mo57527a(new JSONObject()).mo57526a(mo57171h()).mo57532a(), this.f21118b) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                cVar.mo56275a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                cVar.mo56277a(jSONObject, i);
            }
        };
        r0.mo57253a(C8380b.f20780bc);
        r0.mo57255b(C8380b.f20781bd);
        this.f21118b.mo57337V().mo57227a((C8401a) r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo57171h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public JSONObject mo57264i() {
        JSONObject jSONObject = new JSONObject();
        String n = this.f21118b.mo57397n();
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20907dz)).booleanValue() && StringUtils.isValidString(n)) {
            JsonUtils.putString(jSONObject, "cuid", n);
        }
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20857dB)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f21118b.mo57398o());
        }
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20859dD)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f21118b.mo57399p());
        }
        mo56286a(jSONObject);
        return jSONObject;
    }
}
