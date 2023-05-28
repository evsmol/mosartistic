package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.p093b.C4108d;
import com.iab.omid.library.adcolony.p093b.C4109e;
import com.iab.omid.library.adcolony.p095d.C4118a;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4122d;
import com.iab.omid.library.adcolony.p096e.C4126b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4126b f9852a = new C4126b((WebView) null);

    /* renamed from: b */
    private AdEvents f9853b;

    /* renamed from: c */
    private MediaEvents f9854c;

    /* renamed from: d */
    private C4127a f9855d;

    /* renamed from: e */
    private long f9856e;

    /* renamed from: com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher$a */
    enum C4127a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo32212i();
    }

    /* renamed from: a */
    public void mo32189a() {
    }

    /* renamed from: a */
    public void mo32190a(float f) {
        C4109e.m11301a().mo32163a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32191a(WebView webView) {
        this.f9852a = new C4126b(webView);
    }

    /* renamed from: a */
    public void mo32192a(AdEvents adEvents) {
        this.f9853b = adEvents;
    }

    /* renamed from: a */
    public void mo32193a(AdSessionConfiguration adSessionConfiguration) {
        C4109e.m11301a().mo32170a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo32194a(ErrorType errorType, String str) {
        C4109e.m11301a().mo32164a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo32195a(C4102a aVar, AdSessionContext adSessionContext) {
        mo32196a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32196a(C4102a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4119b.m11355a(jSONObject2, "environment", "app");
        C4119b.m11355a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4119b.m11355a(jSONObject2, "deviceInfo", C4118a.m11347d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4119b.m11355a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4119b.m11355a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4119b.m11355a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4119b.m11355a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4119b.m11355a(jSONObject4, "libraryVersion", "1.3.30-Adcolony");
        C4119b.m11355a(jSONObject4, "appId", C4108d.m11298a().mo32161b().getApplicationContext().getPackageName());
        C4119b.m11355a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4119b.m11355a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4119b.m11355a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4119b.m11355a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4109e.m11301a().mo32167a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo32197a(MediaEvents mediaEvents) {
        this.f9854c = mediaEvents;
    }

    /* renamed from: a */
    public void mo32198a(String str) {
        C4109e.m11301a().mo32166a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo32199a(String str, long j) {
        if (j >= this.f9856e) {
            this.f9855d = C4127a.AD_STATE_VISIBLE;
            C4109e.m11301a().mo32174b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo32200a(String str, JSONObject jSONObject) {
        C4109e.m11301a().mo32166a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo32201a(JSONObject jSONObject) {
        C4109e.m11301a().mo32175b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo32202a(boolean z) {
        if (mo32207e()) {
            C4109e.m11301a().mo32177c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo32203b() {
        this.f9852a.clear();
    }

    /* renamed from: b */
    public void mo32204b(String str, long j) {
        C4127a aVar;
        if (j >= this.f9856e && this.f9855d != (aVar = C4127a.AD_STATE_NOTVISIBLE)) {
            this.f9855d = aVar;
            C4109e.m11301a().mo32174b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo32205c() {
        return this.f9853b;
    }

    /* renamed from: d */
    public MediaEvents mo32206d() {
        return this.f9854c;
    }

    /* renamed from: e */
    public boolean mo32207e() {
        return this.f9852a.get() != null;
    }

    /* renamed from: f */
    public void mo32208f() {
        C4109e.m11301a().mo32162a(getWebView());
    }

    /* renamed from: g */
    public void mo32209g() {
        C4109e.m11301a().mo32173b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f9852a.get();
    }

    /* renamed from: h */
    public void mo32211h() {
        C4109e.m11301a().mo32176c(getWebView());
    }

    /* renamed from: i */
    public void mo32212i() {
        this.f9856e = C4122d.m11368a();
        this.f9855d = C4127a.AD_STATE_IDLE;
    }
}
