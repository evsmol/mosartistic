package com.iab.omid.library.applovin.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.utils.C4229d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.internal.g */
public class C4212g {

    /* renamed from: a */
    private static C4212g f10073a = new C4212g();

    /* renamed from: com.iab.omid.library.applovin.internal.g$a */
    class C4213a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f10074a;

        /* renamed from: b */
        final /* synthetic */ String f10075b;

        C4213a(C4212g gVar, WebView webView, String str) {
            this.f10074a = webView;
            this.f10075b = str;
        }

        public void run() {
            this.f10074a.loadUrl(this.f10075b);
        }
    }

    private C4212g() {
    }

    /* renamed from: a */
    public static final C4212g m11779a() {
        return f10073a;
    }

    /* renamed from: a */
    public void mo32569a(WebView webView) {
        mo32576a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo32570a(WebView webView, float f) {
        mo32576a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo32571a(WebView webView, ErrorType errorType, String str) {
        mo32576a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo32572a(WebView webView, String str) {
        mo32576a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public void mo32573a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo32585c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo32574a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo32576a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo32576a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo32575a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo32576a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32576a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo32579a(sb, objArr);
            sb.append(")}");
            mo32577a(webView, sb);
            return;
        }
        C4229d.m11873a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32577a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new C4213a(this, webView, sb2));
        }
    }

    /* renamed from: a */
    public void mo32578a(WebView webView, JSONObject jSONObject) {
        mo32576a(webView, Constants.INIT, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32579a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    /* renamed from: b */
    public void mo32580b(WebView webView) {
        mo32576a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo32581b(WebView webView, String str) {
        mo32576a(webView, "setState", str);
    }

    /* renamed from: b */
    public void mo32582b(WebView webView, JSONObject jSONObject) {
        mo32576a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo32583c(WebView webView) {
        mo32576a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo32584c(WebView webView, JSONObject jSONObject) {
        mo32576a(webView, "setLastActivity", jSONObject);
    }

    /* renamed from: c */
    public boolean mo32585c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }
}
