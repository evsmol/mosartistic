package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.C4211f;
import com.iab.omid.library.applovin.internal.C4212g;
import com.iab.omid.library.applovin.utils.C4224a;
import com.iab.omid.library.applovin.utils.C4225b;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4232f;
import com.iab.omid.library.applovin.weakreference.C4251b;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private C4251b f10086a = new C4251b((WebView) null);

    /* renamed from: b */
    private AdEvents f10087b;

    /* renamed from: c */
    private MediaEvents f10088c;

    /* renamed from: d */
    private C4220a f10089d;

    /* renamed from: e */
    private long f10090e;

    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    enum C4220a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        mo32597a();
    }

    /* renamed from: a */
    public void mo32597a() {
        this.f10090e = C4232f.m11878b();
        this.f10089d = C4220a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void mo32598a(float f) {
        C4212g.m11779a().mo32570a(getWebView(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32599a(WebView webView) {
        this.f10086a = new C4251b(webView);
    }

    /* renamed from: a */
    public void mo32600a(AdEvents adEvents) {
        this.f10087b = adEvents;
    }

    /* renamed from: a */
    public void mo32601a(AdSessionConfiguration adSessionConfiguration) {
        C4212g.m11779a().mo32578a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void mo32602a(ErrorType errorType, String str) {
        C4212g.m11779a().mo32571a(getWebView(), errorType, str);
    }

    /* renamed from: a */
    public void mo32603a(C4197a aVar, AdSessionContext adSessionContext) {
        mo32604a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32604a(C4197a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C4226c.m11860a(jSONObject2, "environment", "app");
        C4226c.m11860a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C4226c.m11860a(jSONObject2, "deviceInfo", C4225b.m11851d());
        C4226c.m11860a(jSONObject2, "deviceCategory", C4224a.m11846a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C4226c.m11860a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C4226c.m11860a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        C4226c.m11860a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        C4226c.m11860a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C4226c.m11860a(jSONObject4, "libraryVersion", "1.4.1-Applovin");
        C4226c.m11860a(jSONObject4, "appId", C4211f.m11776b().mo32567a().getApplicationContext().getPackageName());
        C4226c.m11860a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C4226c.m11860a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C4226c.m11860a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            C4226c.m11860a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        C4212g.m11779a().mo32575a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void mo32605a(MediaEvents mediaEvents) {
        this.f10088c = mediaEvents;
    }

    /* renamed from: a */
    public void mo32606a(String str) {
        C4212g.m11779a().mo32574a(getWebView(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo32607a(String str, long j) {
        C4220a aVar;
        if (j >= this.f10090e && this.f10089d != (aVar = C4220a.AD_STATE_NOTVISIBLE)) {
            this.f10089d = aVar;
            C4212g.m11779a().mo32572a(getWebView(), str);
        }
    }

    /* renamed from: a */
    public void mo32608a(String str, JSONObject jSONObject) {
        C4212g.m11779a().mo32574a(getWebView(), str, jSONObject);
    }

    /* renamed from: a */
    public void mo32609a(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            C4226c.m11860a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            C4212g.m11779a().mo32584c(getWebView(), jSONObject);
        }
    }

    /* renamed from: a */
    public void mo32610a(JSONObject jSONObject) {
        C4212g.m11779a().mo32582b(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void mo32611a(boolean z) {
        if (mo32616e()) {
            C4212g.m11779a().mo32581b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo32612b() {
        this.f10086a.clear();
    }

    /* renamed from: b */
    public void mo32613b(String str, long j) {
        if (j >= this.f10090e) {
            this.f10089d = C4220a.AD_STATE_VISIBLE;
            C4212g.m11779a().mo32572a(getWebView(), str);
        }
    }

    /* renamed from: c */
    public AdEvents mo32614c() {
        return this.f10087b;
    }

    /* renamed from: d */
    public MediaEvents mo32615d() {
        return this.f10088c;
    }

    /* renamed from: e */
    public boolean mo32616e() {
        return this.f10086a.get() != null;
    }

    /* renamed from: f */
    public void mo32617f() {
        C4212g.m11779a().mo32569a(getWebView());
    }

    /* renamed from: g */
    public void mo32618g() {
        C4212g.m11779a().mo32580b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f10086a.get();
    }

    /* renamed from: h */
    public void mo32620h() {
        C4212g.m11779a().mo32583c(getWebView());
    }

    /* renamed from: i */
    public void mo32621i() {
    }
}
