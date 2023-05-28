package com.applovin.impl.sdk.p256e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.C7965b;
import com.applovin.impl.adview.C7981d;
import com.applovin.impl.adview.C7987e;
import com.applovin.impl.mediation.C8287h;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.q */
public class C8439q extends C8401a implements C8287h.C8288a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8345a f21206a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinAdLoadListener f21207e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7981d f21208f;

    /* renamed from: com.applovin.impl.sdk.e.q$a */
    private class C8441a extends C7987e {
        private C8441a(C8490n nVar) {
            super((C7965b) null, nVar);
        }

        /* renamed from: a */
        private boolean m25439a(String str, C8380b<String> bVar) {
            for (String equalsIgnoreCase : C8439q.this.f21118b.mo57380b(bVar)) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo55722a(WebView webView, String str) {
            C8626v vVar = C8439q.this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = C8439q.this.f21120d;
                String str2 = C8439q.this.f21119c;
                vVar2.mo57820c(str2, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof C7981d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!m25439a(scheme, C8380b.f20838ci)) {
                return true;
            }
            if (m25439a(host, C8380b.f20839cj)) {
                C8626v vVar3 = C8439q.this.f21120d;
                if (C8626v.m26252a()) {
                    C8439q.this.f21120d.mo57818b(C8439q.this.f21119c, "Ad load succeeded");
                }
                if (C8439q.this.f21207e == null) {
                    return true;
                }
                C8439q.this.f21207e.adReceived(C8439q.this.f21206a);
            } else if (m25439a(host, C8380b.f20840ck)) {
                C8626v vVar4 = C8439q.this.f21120d;
                if (C8626v.m26252a()) {
                    C8439q.this.f21120d.mo57818b(C8439q.this.f21119c, "Ad load failed");
                }
                if (C8439q.this.f21207e == null) {
                    return true;
                }
                C8439q.this.f21207e.failedToReceiveAd(204);
            } else {
                C8626v vVar5 = C8439q.this.f21120d;
                if (!C8626v.m26252a()) {
                    return true;
                }
                C8439q.this.f21120d.mo57822e(C8439q.this.f21119c, "Unrecognized webview event");
                return true;
            }
            AppLovinAdLoadListener unused = C8439q.this.f21207e = null;
            return true;
        }
    }

    public C8439q(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskProcessJavaScriptTagAd", nVar);
        this.f21206a = new C8345a(jSONObject, jSONObject2, bVar, nVar);
        this.f21207e = appLovinAdLoadListener;
        nVar.mo57328L().mo56674a((C8287h.C8288a) this);
    }

    /* renamed from: a */
    public void mo56676a(C8070a aVar) {
        if (aVar.mo56071f().equalsIgnoreCase(this.f21206a.mo56956N())) {
            this.f21118b.mo57328L().mo56675b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f21207e;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f21206a);
                this.f21207e = null;
            }
        }
    }

    public void run() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Rendering AppLovin ad #" + this.f21206a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    C7981d unused = C8439q.this.f21208f = new C7981d(new C8441a(C8439q.this.f21118b), C8439q.this.f21118b, C8439q.this.mo57169f());
                    C8439q.this.f21208f.loadDataWithBaseURL(C8439q.this.f21206a.mo57007aw(), C8439q.this.f21206a.mo55841b(), "text/html", (String) null, "");
                } catch (Throwable th) {
                    C8439q.this.f21118b.mo57328L().mo56675b(C8439q.this);
                    C8626v vVar = C8439q.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8439q.this.f21120d.mo57819b(C8439q.this.f21119c, "Failed to initialize WebView", th);
                    }
                    if (C8439q.this.f21207e != null) {
                        C8439q.this.f21207e.failedToReceiveAd(-1);
                        AppLovinAdLoadListener unused2 = C8439q.this.f21207e = null;
                    }
                }
            }
        });
    }
}
