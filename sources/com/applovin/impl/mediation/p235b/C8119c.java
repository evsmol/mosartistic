package com.applovin.impl.mediation.p235b;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p236c.C8133b;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8459f;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p255d.C8395g;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8449u;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.c */
public class C8119c extends C8401a {

    /* renamed from: a */
    private final String f19769a;

    /* renamed from: e */
    private final MaxAdFormat f19770e;

    /* renamed from: f */
    private final Map<String, Object> f19771f;

    /* renamed from: g */
    private final Map<String, Object> f19772g;

    /* renamed from: h */
    private final Map<String, Object> f19773h;

    /* renamed from: i */
    private final JSONArray f19774i;

    /* renamed from: j */
    private final Context f19775j;

    /* renamed from: k */
    private final C8105a.C8106a f19776k;

    public C8119c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, JSONArray jSONArray, Context context, C8490n nVar, C8105a.C8106a aVar) {
        super("TaskFetchMediatedAd " + str, nVar);
        this.f19769a = str;
        this.f19770e = maxAdFormat;
        this.f19771f = map;
        this.f19772g = map2;
        this.f19773h = map3;
        this.f19774i = jSONArray;
        this.f19775j = context;
        this.f19776k = aVar;
    }

    /* renamed from: a */
    private String m24282a() {
        return C8133b.m24348a(this.f21118b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24283a(int i, String str) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str2 = this.f21119c;
            vVar2.mo57822e(str2, "Unable to fetch " + this.f19769a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f21118b.mo57338W().mo57151a(C8394f.f21098q);
        }
        C8575k.m26132a((MaxAdListener) this.f19776k, this.f19769a, (MaxError) i == -1009 ? new MaxErrorImpl(-1009, str) : i == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1));
    }

    /* renamed from: a */
    private void m24286a(C8395g gVar) {
        long b = gVar.mo57154b(C8394f.f21085d);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f21118b.mo57342a(C8380b.f20899dr)).intValue())) {
            gVar.mo57156b(C8394f.f21085d, currentTimeMillis);
            gVar.mo57158c(C8394f.f21086e);
            gVar.mo57158c(C8394f.f21087f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24287a(JSONObject jSONObject) {
        try {
            C8572i.m26107d(jSONObject, this.f21118b);
            C8572i.m26106c(jSONObject, this.f21118b);
            C8572i.m26109e(jSONObject, this.f21118b);
            C8572i.m26111f(jSONObject, this.f21118b);
            C8133b.m24349a(jSONObject, this.f21118b);
            C8133b.m24351b(jSONObject, this.f21118b);
            C8459f.m25498a(this.f21118b);
            if (this.f19770e != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", (String) null))) {
                C8626v.m26258i(this.f21119c, "Ad format requested does not match ad unit id's format.");
            }
            this.f21118b.mo57337V().mo57227a((C8401a) m24288b(jSONObject));
        } catch (Throwable th) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: b */
    private C8122e m24288b(JSONObject jSONObject) {
        return new C8122e(this.f19769a, this.f19770e, this.f19771f, jSONObject, this.f19775j, this.f21118b, this.f19776k);
    }

    /* renamed from: b */
    private String m24289b() {
        return C8133b.m24350b(this.f21118b);
    }

    /* renamed from: c */
    private Map<String, String> m24290c() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("AppLovin-Ad-Unit-Id", this.f19769a);
        map.put("AppLovin-Ad-Format", this.f19770e.getLabel());
        return map;
    }

    /* renamed from: c */
    private void m24291c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(LogConstants.MSG_AD_TYPE_DISABLED, new JSONArray(this.f21118b.mo57322F().mo56547c()));
            jSONObject2.put("installed", C8134c.m24356a(this.f21118b));
            jSONObject2.put("initialized", this.f21118b.mo57323G().mo56541c());
            jSONObject2.put("initialized_classnames", new JSONArray(this.f21118b.mo57323G().mo56540b().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f21118b.mo57322F().mo56544a()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f21118b.mo57322F().mo56546b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* renamed from: d */
    private void m24292d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f19774i;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: e */
    private void m24293e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f19769a);
        jSONObject2.put("ad_format", this.f19770e.getLabel());
        Map<String, Object> map = CollectionUtils.map(this.f19772g);
        C8070a a = this.f21118b.mo57326J().mo57823a(this.f19769a);
        if (a != null) {
            map.put("previous_winning_network", a.mo56152S());
            map.put("previous_winning_network_name", a.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m24294f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f21118b.mo57324H().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && Utils.isDspDemoApp(this.f21118b.mo57332P())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    /* renamed from: g */
    private void m24295g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f21118b.mo57400q().getExtraParameters()));
    }

    /* renamed from: h */
    private JSONObject m24296h() throws JSONException {
        Map<String, Object> a = this.f21118b.mo57340Y().mo57625a((Map<String, String>) null, false, true);
        a.putAll(this.f19773h);
        JSONObject jSONObject = new JSONObject(a);
        m24293e(jSONObject);
        m24292d(jSONObject);
        m24291c(jSONObject);
        m24294f(jSONObject);
        m24295g(jSONObject);
        return jSONObject;
    }

    public void run() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Fetching next ad for ad unit id: " + this.f19769a + " and format: " + this.f19770e);
        }
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20870dO)).booleanValue() && Utils.isVPNConnected()) {
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "User is connected to a VPN");
            }
        }
        C8395g W = this.f21118b.mo57338W();
        W.mo57151a(C8394f.f21097p);
        if (W.mo57154b(C8394f.f21085d) == 0) {
            W.mo57156b(C8394f.f21085d, System.currentTimeMillis());
        }
        try {
            JSONObject h = m24296h();
            Map map = CollectionUtils.map();
            map.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f21118b.mo57342a(C8380b.f20908eA)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21118b.mo57319C());
            }
            if (this.f21118b.mo57330N().mo56529a()) {
                map.put("test_mode", "1");
            }
            String c = this.f21118b.mo57330N().mo56531c();
            if (StringUtils.isValidString(c)) {
                map.put("filter_ad_network", c);
                if (!this.f21118b.mo57330N().mo56529a()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f21118b.mo57330N().mo56530b()) {
                    map.put("force_ad_network", c);
                }
            }
            m24286a(W);
            C81201 r1 = new C8449u<JSONObject>(C8516c.m25763a(this.f21118b).mo57534b("POST").mo57535b(m24290c()).mo57528a(m24282a()).mo57538c(m24289b()).mo57529a((Map<String, String>) map).mo57530a(h).mo57540d(((Boolean) this.f21118b.mo57342a(C8379a.f20669X)).booleanValue()).mo57527a(new JSONObject()).mo57533b(((Long) this.f21118b.mo57342a(C8379a.f20676f)).intValue()).mo57526a(((Integer) this.f21118b.mo57342a(C8380b.f20829cZ)).intValue()).mo57537c(((Long) this.f21118b.mo57342a(C8379a.f20675e)).intValue()).mo57532a(), this.f21118b) {
                /* renamed from: a */
                public void mo56275a(int i, String str, JSONObject jSONObject) {
                    C8119c.this.m24283a(i, str);
                }

                /* renamed from: a */
                public void mo56277a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21224f.mo57502a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21224f.mo57503b());
                        C8119c.this.m24287a(jSONObject);
                        return;
                    }
                    C8119c.this.m24283a(i, (String) null);
                }
            };
            r1.mo57253a(C8379a.f20673c);
            r1.mo57255b(C8379a.f20674d);
            this.f21118b.mo57337V().mo57227a((C8401a) r1);
        } catch (Throwable th) {
            C8626v vVar4 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar5 = this.f21120d;
                String str2 = this.f21119c;
                vVar5.mo57819b(str2, "Unable to fetch ad " + this.f19769a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
