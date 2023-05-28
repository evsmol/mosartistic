package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.media.MediaEvents;
import com.iab.omid.library.amazon.p099b.C4158d;
import com.iab.omid.library.amazon.p099b.C4159e;
import com.iab.omid.library.amazon.p101d.C4168a;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4172d;
import com.iab.omid.library.amazon.p102e.C4176b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4176b f9969a = new C4176b((WebView) null);

    /* renamed from: b */
    private AdEvents f9970b;

    /* renamed from: c */
    private MediaEvents f9971c;

    /* renamed from: d */
    private C4177a f9972d;

    /* renamed from: e */
    private long f9973e;

    /* renamed from: com.iab.omid.library.amazon.publisher.AdSessionStatePublisher$a */
    enum C4177a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo32411i();
    }

    /* renamed from: a */
    public void mo32388a() {
    }

    /* renamed from: a */
    public void mo32389a(float f) {
        C4159e.m11531a().mo32362a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32390a(WebView webView) {
        this.f9969a = new C4176b(webView);
    }

    /* renamed from: a */
    public void mo32391a(AdEvents adEvents) {
        this.f9970b = adEvents;
    }

    /* renamed from: a */
    public void mo32392a(AdSessionConfiguration adSessionConfiguration) {
        C4159e.m11531a().mo32369a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo32393a(ErrorType errorType, String str) {
        C4159e.m11531a().mo32363a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo32394a(C4152a aVar, AdSessionContext adSessionContext) {
        mo32395a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32395a(C4152a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4169b.m11585a(jSONObject2, "environment", "app");
        C4169b.m11585a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4169b.m11585a(jSONObject2, "deviceInfo", C4168a.m11577d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4169b.m11585a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4169b.m11585a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4169b.m11585a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4169b.m11585a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4169b.m11585a(jSONObject4, "libraryVersion", "1.3.28-Amazon");
        C4169b.m11585a(jSONObject4, "appId", C4158d.m11528a().mo32360b().getApplicationContext().getPackageName());
        C4169b.m11585a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4169b.m11585a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4169b.m11585a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4169b.m11585a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4159e.m11531a().mo32366a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo32396a(MediaEvents mediaEvents) {
        this.f9971c = mediaEvents;
    }

    /* renamed from: a */
    public void mo32397a(String str) {
        C4159e.m11531a().mo32365a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo32398a(String str, long j) {
        if (j >= this.f9973e) {
            this.f9972d = C4177a.AD_STATE_VISIBLE;
            C4159e.m11531a().mo32373b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo32399a(String str, JSONObject jSONObject) {
        C4159e.m11531a().mo32365a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo32400a(JSONObject jSONObject) {
        C4159e.m11531a().mo32374b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo32401a(boolean z) {
        if (mo32406e()) {
            C4159e.m11531a().mo32376c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo32402b() {
        this.f9969a.clear();
    }

    /* renamed from: b */
    public void mo32403b(String str, long j) {
        if (j >= this.f9973e && this.f9972d != C4177a.AD_STATE_NOTVISIBLE) {
            this.f9972d = C4177a.AD_STATE_NOTVISIBLE;
            C4159e.m11531a().mo32373b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo32404c() {
        return this.f9970b;
    }

    /* renamed from: d */
    public MediaEvents mo32405d() {
        return this.f9971c;
    }

    /* renamed from: e */
    public boolean mo32406e() {
        return this.f9969a.get() != null;
    }

    /* renamed from: f */
    public void mo32407f() {
        C4159e.m11531a().mo32361a(getWebView());
    }

    /* renamed from: g */
    public void mo32408g() {
        C4159e.m11531a().mo32372b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f9969a.get();
    }

    /* renamed from: h */
    public void mo32410h() {
        C4159e.m11531a().mo32375c(getWebView());
    }

    /* renamed from: i */
    public void mo32411i() {
        this.f9973e = C4172d.m11598a();
        this.f9972d = C4177a.AD_STATE_IDLE;
    }
}
