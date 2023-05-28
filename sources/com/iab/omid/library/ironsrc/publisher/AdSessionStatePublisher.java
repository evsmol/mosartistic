package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.p111b.C4315d;
import com.iab.omid.library.ironsrc.p111b.C4316e;
import com.iab.omid.library.ironsrc.p113d.C4325a;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4329d;
import com.iab.omid.library.ironsrc.p114e.C4333b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4333b f10324a = new C4333b((WebView) null);

    /* renamed from: b */
    private AdEvents f10325b;

    /* renamed from: c */
    private MediaEvents f10326c;

    /* renamed from: d */
    private C4334a f10327d;

    /* renamed from: e */
    private long f10328e;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum C4334a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo33004i();
    }

    /* renamed from: a */
    public void mo32981a() {
    }

    /* renamed from: a */
    public void mo32982a(float f) {
        C4316e.m12234a().mo32955a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32983a(WebView webView) {
        this.f10324a = new C4333b(webView);
    }

    /* renamed from: a */
    public void mo32984a(AdEvents adEvents) {
        this.f10325b = adEvents;
    }

    /* renamed from: a */
    public void mo32985a(AdSessionConfiguration adSessionConfiguration) {
        C4316e.m12234a().mo32962a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo32986a(ErrorType errorType, String str) {
        C4316e.m12234a().mo32956a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo32987a(C4309a aVar, AdSessionContext adSessionContext) {
        mo32988a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32988a(C4309a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4326b.m12286a(jSONObject2, "environment", "app");
        C4326b.m12286a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4326b.m12286a(jSONObject2, "deviceInfo", C4325a.m12279d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4326b.m12286a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4326b.m12286a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4326b.m12286a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4326b.m12286a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4326b.m12286a(jSONObject4, "libraryVersion", "1.3.12-Ironsrc");
        C4326b.m12286a(jSONObject4, "appId", C4315d.m12231a().mo32953b().getApplicationContext().getPackageName());
        C4326b.m12286a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4326b.m12286a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4326b.m12286a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4326b.m12286a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4316e.m12234a().mo32959a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo32989a(MediaEvents mediaEvents) {
        this.f10326c = mediaEvents;
    }

    /* renamed from: a */
    public void mo32990a(String str) {
        C4316e.m12234a().mo32958a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo32991a(String str, long j) {
        if (j >= this.f10328e) {
            this.f10327d = C4334a.AD_STATE_VISIBLE;
            C4316e.m12234a().mo32966b(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo32992a(String str, JSONObject jSONObject) {
        C4316e.m12234a().mo32958a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo32993a(JSONObject jSONObject) {
        C4316e.m12234a().mo32967b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo32994a(boolean z) {
        if (mo32999e()) {
            C4316e.m12234a().mo32969c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo32995b() {
        this.f10324a.clear();
    }

    /* renamed from: b */
    public void mo32996b(String str, long j) {
        if (j >= this.f10328e && this.f10327d != C4334a.AD_STATE_NOTVISIBLE) {
            this.f10327d = C4334a.AD_STATE_NOTVISIBLE;
            C4316e.m12234a().mo32966b(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo32997c() {
        return this.f10325b;
    }

    /* renamed from: d */
    public MediaEvents mo32998d() {
        return this.f10326c;
    }

    /* renamed from: e */
    public boolean mo32999e() {
        return this.f10324a.get() != null;
    }

    /* renamed from: f */
    public void mo33000f() {
        C4316e.m12234a().mo32954a(getWebView());
    }

    /* renamed from: g */
    public void mo33001g() {
        C4316e.m12234a().mo32965b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10324a.get();
    }

    /* renamed from: h */
    public void mo33003h() {
        C4316e.m12234a().mo32968c(getWebView());
    }

    /* renamed from: i */
    public void mo33004i() {
        this.f10328e = C4329d.m12298a();
        this.f10327d = C4334a.AD_STATE_IDLE;
    }
}
