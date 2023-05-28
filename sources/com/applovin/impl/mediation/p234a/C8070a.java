package com.applovin.impl.mediation.p234a;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.C8241g;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.hybridAds.C8641c;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a */
public abstract class C8070a extends C8076f implements MaxAd {

    /* renamed from: a */
    protected C8241g f19599a;

    /* renamed from: c */
    private final AtomicBoolean f19600c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f19601d = new AtomicBoolean();

    /* renamed from: e */
    private final String f19602e;

    /* renamed from: f */
    private MaxAdWaterfallInfo f19603f;

    /* renamed from: g */
    private long f19604g;

    /* renamed from: h */
    private String f19605h;

    /* renamed from: i */
    private String f19606i;

    /* renamed from: j */
    private C8641c f19607j;

    protected C8070a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8241g gVar, C8490n nVar) {
        super(map, jSONObject, jSONObject2, nVar);
        this.f19599a = gVar;
        this.f19602e = gVar != null ? gVar.mo56567i() : null;
    }

    /* renamed from: a */
    public static C8070a m24028a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", (String) null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new C8071b(map, jSONObject, jSONObject2, nVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new C8073d(map, jSONObject, jSONObject2, nVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new C8072c(map, jSONObject, jSONObject2, nVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* renamed from: z */
    private long mo56113z() {
        return mo56176b("load_started_time_ms", 0);
    }

    /* renamed from: a */
    public abstract C8070a mo56059a(C8241g gVar);

    /* renamed from: a */
    public String mo56060a() {
        return this.f19605h;
    }

    /* renamed from: a */
    public void mo56061a(long j) {
        this.f19604g = j;
    }

    /* renamed from: a */
    public void mo56062a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("creative_id") && !mo56183c("creative_id")) {
                mo56182c("creative_id", BundleUtils.getString("creative_id", bundle));
            }
            if (bundle.containsKey("ad_width") && !mo56183c("ad_width") && bundle.containsKey("ad_height") && !mo56183c("ad_height")) {
                int i = BundleUtils.getInt("ad_width", bundle);
                int i2 = BundleUtils.getInt("ad_height", bundle);
                mo56180c("ad_width", i);
                mo56180c("ad_height", i2);
            }
        }
    }

    /* renamed from: a */
    public void mo56063a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f19603f = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void mo56064a(String str) {
        this.f19605h = str;
    }

    /* renamed from: a */
    public void mo56065a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            JSONObject b = mo56066b();
            JsonUtils.putAll(b, jSONObject);
            mo56167a(Utils.KEY_AD_VALUES, (Object) b);
        }
    }

    /* renamed from: b */
    public JSONObject mo56066b() {
        return mo56166a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    /* renamed from: b */
    public void mo56067b(String str) {
        this.f19606i = str;
    }

    /* renamed from: c */
    public JSONObject mo56068c() {
        return mo56166a("revenue_parameters", new JSONObject());
    }

    /* renamed from: d */
    public String mo56069d() {
        return JsonUtils.getString(mo56068c(), "revenue_event", "");
    }

    /* renamed from: e */
    public boolean mo56070e() {
        C8241g gVar = this.f19599a;
        return gVar != null && gVar.mo56564f() && this.f19599a.mo56565g();
    }

    /* renamed from: f */
    public String mo56071f() {
        return mo56164a("event_id", "");
    }

    /* renamed from: g */
    public C8241g mo56072g() {
        return this.f19599a;
    }

    public String getAdReviewCreativeId() {
        return this.f19606i;
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        JSONObject b = mo56066b();
        if (b.has(str)) {
            return JsonUtils.getString(b, str, str2);
        }
        Bundle ab = mo56169ab();
        return ab.containsKey(str) ? ab.getString(str) : mo56178b(str, str2);
    }

    public String getCreativeId() {
        return mo56178b("creative_id", (String) null);
    }

    public String getDspId() {
        return mo56178b("dsp_id", (String) null);
    }

    public String getDspName() {
        return mo56178b("dsp_name", (String) null);
    }

    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(mo56178b("ad_format", mo56164a("ad_format", (String) null)));
    }

    public MaxNativeAd getNativeAd() {
        C8241g gVar = this.f19599a;
        if (gVar != null) {
            return gVar.mo56560b();
        }
        return null;
    }

    public String getNetworkName() {
        return mo56178b("network_name", "");
    }

    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(mo56096p());
    }

    public long getRequestLatencyMillis() {
        return this.f19604g;
    }

    public double getRevenue() {
        if (!((Boolean) this.f19617b.mo57342a(C8379a.f20666U)).booleanValue() || !getFormat().isFullscreenAd() || mo56104w().get()) {
            return JsonUtils.getDouble(mo56166a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f19617b.mo57320D();
        if (!C8626v.m26252a()) {
            return 0.0d;
        }
        this.f19617b.mo57320D().mo57822e("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    public String getRevenuePrecision() {
        return JsonUtils.getString(mo56166a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public AppLovinSdkUtils.Size getSize() {
        int b = mo56175b("ad_width", -3);
        int b2 = mo56175b("ad_height", -3);
        return (b == -3 || b2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(b, b2);
    }

    public MaxAdWaterfallInfo getWaterfall() {
        return this.f19603f;
    }

    /* renamed from: h */
    public String mo56088h() {
        return this.f19602e;
    }

    /* renamed from: i */
    public Bundle mo56089i() {
        JSONObject jSONObject;
        if (mo56183c("credentials")) {
            jSONObject = mo56166a("credentials", new JSONObject());
        } else {
            jSONObject = mo56166a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObject, "placement_id", mo56096p());
        }
        return JsonUtils.toBundle(jSONObject);
    }

    /* renamed from: j */
    public String mo56090j() {
        return mo56178b("bid_response", (String) null);
    }

    /* renamed from: k */
    public long mo56091k() {
        return mo56176b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1, mo56169ab()));
    }

    /* renamed from: l */
    public boolean mo56092l() {
        return mo56177b("is_js_tag_ad", (Boolean) false).booleanValue();
    }

    /* renamed from: m */
    public MaxAdFormat mo56093m() {
        String b = mo56178b("haf", (String) null);
        if (StringUtils.isValidString(b)) {
            return MaxAdFormat.formatFromString(b);
        }
        return null;
    }

    /* renamed from: n */
    public C8641c mo56094n() {
        C8641c cVar = this.f19607j;
        if (cVar != null) {
            return cVar;
        }
        C8641c cVar2 = new C8641c(mo56166a("hybrid_ad_config", (JSONObject) null));
        this.f19607j = cVar2;
        return cVar2;
    }

    /* renamed from: o */
    public View mo56095o() {
        C8241g gVar;
        if (!mo56070e() || (gVar = this.f19599a) == null) {
            return null;
        }
        return gVar.mo56552a();
    }

    /* renamed from: p */
    public String mo56096p() {
        return mo56178b("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: q */
    public String mo56097q() {
        return mo56164a("waterfall_name", "");
    }

    /* renamed from: r */
    public String mo56098r() {
        return mo56164a("waterfall_test_name", "");
    }

    /* renamed from: s */
    public long mo56099s() {
        if (mo56113z() > 0) {
            return mo56102u() - mo56113z();
        }
        return -1;
    }

    /* renamed from: t */
    public void mo56100t() {
        mo56181c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + mo56096p() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    /* renamed from: u */
    public long mo56102u() {
        return mo56176b("load_completed_time_ms", 0);
    }

    /* renamed from: v */
    public void mo56103v() {
        mo56181c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: w */
    public AtomicBoolean mo56104w() {
        return this.f19600c;
    }

    /* renamed from: x */
    public AtomicBoolean mo56105x() {
        return this.f19601d;
    }

    /* renamed from: y */
    public void mo56106y() {
        this.f19599a = null;
        this.f19603f = null;
    }
}
