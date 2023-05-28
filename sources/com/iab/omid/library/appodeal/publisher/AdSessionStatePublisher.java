package com.iab.omid.library.appodeal.publisher;

import android.webkit.WebView;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.iab.omid.library.appodeal.p105b.C4265d;
import com.iab.omid.library.appodeal.p105b.C4266e;
import com.iab.omid.library.appodeal.p107d.C4275a;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4279d;
import com.iab.omid.library.appodeal.p108e.C4283b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4283b f10210a = new C4283b((WebView) null);

    /* renamed from: b */
    private AdEvents f10211b;

    /* renamed from: c */
    private MediaEvents f10212c;

    /* renamed from: d */
    private C4284a f10213d;

    /* renamed from: e */
    private long f10214e;

    /* renamed from: com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher$a */
    enum C4284a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo32818i();
    }

    /* renamed from: a */
    public void mo32795a() {
    }

    /* renamed from: a */
    public void mo32796a(float f) {
        C4266e.m12012a().mo32769a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32797a(WebView webView) {
        this.f10210a = new C4283b(webView);
    }

    /* renamed from: a */
    public void mo32798a(AdEvents adEvents) {
        this.f10211b = adEvents;
    }

    /* renamed from: a */
    public void mo32799a(AdSessionConfiguration adSessionConfiguration) {
        C4266e.m12012a().mo32776a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo32800a(ErrorType errorType, String str) {
        C4266e.m12012a().mo32770a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo32801a(C4259a aVar, AdSessionContext adSessionContext) {
        mo32802a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32802a(C4259a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4276b.m12065a(jSONObject2, "environment", "app");
        C4276b.m12065a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4276b.m12065a(jSONObject2, "deviceInfo", C4275a.m12058d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4276b.m12065a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4276b.m12065a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4276b.m12065a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4276b.m12065a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4276b.m12065a(jSONObject4, "libraryVersion", "1.3.15-Appodeal");
        C4276b.m12065a(jSONObject4, "appId", C4265d.m12009a().mo32767b().getApplicationContext().getPackageName());
        C4276b.m12065a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4276b.m12065a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4276b.m12065a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4276b.m12065a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4266e.m12012a().mo32773a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo32803a(MediaEvents mediaEvents) {
        this.f10212c = mediaEvents;
    }

    /* renamed from: a */
    public void mo32804a(String str) {
        C4266e.m12012a().mo32772a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo32805a(String str, long j) {
        if (j >= this.f10214e) {
            this.f10213d = C4284a.AD_STATE_VISIBLE;
            C4266e.m12012a().mo32780b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo32806a(String str, JSONObject jSONObject) {
        C4266e.m12012a().mo32772a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo32807a(JSONObject jSONObject) {
        C4266e.m12012a().mo32781b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo32808a(boolean z) {
        if (mo32813e()) {
            C4266e.m12012a().mo32783c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo32809b() {
        this.f10210a.clear();
    }

    /* renamed from: b */
    public void mo32810b(String str, long j) {
        if (j >= this.f10214e && this.f10213d != C4284a.AD_STATE_NOTVISIBLE) {
            this.f10213d = C4284a.AD_STATE_NOTVISIBLE;
            C4266e.m12012a().mo32780b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo32811c() {
        return this.f10211b;
    }

    /* renamed from: d */
    public MediaEvents mo32812d() {
        return this.f10212c;
    }

    /* renamed from: e */
    public boolean mo32813e() {
        return this.f10210a.get() != null;
    }

    /* renamed from: f */
    public void mo32814f() {
        C4266e.m12012a().mo32768a(getWebView());
    }

    /* renamed from: g */
    public void mo32815g() {
        C4266e.m12012a().mo32779b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10210a.get();
    }

    /* renamed from: h */
    public void mo32817h() {
        C4266e.m12012a().mo32782c(getWebView());
    }

    /* renamed from: i */
    public void mo32818i() {
        this.f10214e = C4279d.m12077a();
        this.f10213d = C4284a.AD_STATE_IDLE;
    }
}
