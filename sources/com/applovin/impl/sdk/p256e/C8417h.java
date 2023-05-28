package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p255d.C8395g;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.h */
public abstract class C8417h extends C8401a {

    /* renamed from: a */
    protected final C8349d f21148a;

    public C8417h(C8349d dVar, String str, C8490n nVar) {
        super(str, nVar);
        this.f21148a = dVar;
    }

    /* renamed from: a */
    private void m25369a(C8395g gVar) {
        long b = gVar.mo57154b(C8394f.f21085d);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f21118b.mo57342a(C8380b.f20899dr)).intValue())) {
            gVar.mo57156b(C8394f.f21085d, currentTimeMillis);
            gVar.mo57158c(C8394f.f21086e);
            gVar.mo57158c(C8394f.f21087f);
        }
    }

    /* renamed from: i */
    private Map<String, String> m25370i() {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("AppLovin-Zone-Id", this.f21148a.mo56936a());
        if (this.f21148a.mo56938c() != null) {
            map.put("AppLovin-Ad-Size", this.f21148a.mo56938c().getLabel());
        }
        if (this.f21148a.mo56939d() != null) {
            map.put("AppLovin-Ad-Type", this.f21148a.mo56939d().getLabel());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C8401a mo57204a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo57205a() {
        Map<String, String> map = CollectionUtils.map(4);
        map.put("zone_id", this.f21148a.mo56936a());
        if (this.f21148a.mo56938c() != null) {
            map.put("size", this.f21148a.mo56938c().getLabel());
        }
        if (this.f21148a.mo56939d() != null) {
            map.put("require", this.f21148a.mo56939d().getLabel());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57206a(int i) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "Unable to fetch " + this.f21148a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f21118b.mo57338W().mo57151a(C8394f.f21091j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo57207b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo57208b(JSONObject jSONObject) {
        C8572i.m26107d(jSONObject, this.f21118b);
        C8572i.m26106c(jSONObject, this.f21118b);
        C8572i.m26109e(jSONObject, this.f21118b);
        C8349d.m25018a(jSONObject);
        this.f21118b.mo57337V().mo57227a(mo57204a(jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo57209c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8346b mo57210h() {
        return this.f21148a.mo56940e() ? C8346b.APPLOVIN_PRIMARY_ZONE : C8346b.APPLOVIN_CUSTOM_ZONE;
    }

    public void run() {
        Map<String, String> map;
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Fetching next ad of zone: " + this.f21148a);
        }
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20870dO)).booleanValue() && Utils.isVPNConnected()) {
            C8626v vVar2 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "User is connected to a VPN");
            }
        }
        C8395g W = this.f21118b.mo57338W();
        W.mo57151a(C8394f.f21082a);
        if (W.mo57154b(C8394f.f21085d) == 0) {
            W.mo57156b(C8394f.f21085d, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f21118b.mo57406v().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f21118b.mo57342a(C8380b.f20893dl)).booleanValue()) {
                JSONObject jSONObject = new JSONObject(this.f21118b.mo57340Y().mo57625a(mo57205a(), false, true));
                map = CollectionUtils.map();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f21118b.mo57342a(C8380b.f20908eA)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21118b.mo57319C());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f21118b.mo57340Y().mo57625a(mo57205a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(mo57169f())) {
                map.putAll(this.f21118b.mo57406v().getAndResetCustomQueryParams());
            }
            m25369a(W);
            C8516c.C8517a<T> b = C8516c.m25763a(this.f21118b).mo57528a(mo57207b()).mo57538c(mo57209c()).mo57529a(map).mo57534b(str).mo57535b(m25370i()).mo57527a(new JSONObject()).mo57526a(((Integer) this.f21118b.mo57342a(C8380b.f20829cZ)).intValue()).mo57531a(((Boolean) this.f21118b.mo57342a(C8380b.f20882da)).booleanValue()).mo57536b(((Boolean) this.f21118b.mo57342a(C8380b.f20883db)).booleanValue()).mo57533b(((Integer) this.f21118b.mo57342a(C8380b.f20828cY)).intValue());
            if (andResetCustomPostBody != null) {
                b.mo57530a(andResetCustomPostBody);
                b.mo57540d(((Boolean) this.f21118b.mo57342a(C8380b.f20916eI)).booleanValue());
            }
            C84181 r1 = new C8449u<JSONObject>(b.mo57532a(), this.f21118b) {
                /* renamed from: a */
                public void mo56275a(int i, String str, JSONObject jSONObject) {
                    C8417h.this.mo57206a(i);
                }

                /* renamed from: a */
                public void mo56277a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21224f.mo57502a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21224f.mo57503b());
                        C8417h.this.mo57208b(jSONObject);
                        return;
                    }
                    C8417h.this.mo57206a(i);
                }
            };
            r1.mo57253a(C8380b.f20778ba);
            r1.mo57255b(C8380b.f20779bb);
            this.f21118b.mo57337V().mo57227a((C8401a) r1);
        } catch (Throwable th) {
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Unable to fetch ad " + this.f21148a, th);
            }
            mo57206a(0);
        }
    }
}
