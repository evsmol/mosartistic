package com.iab.omid.library.amazon.p099b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.p101d.C4171c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.b.e */
public class C4159e {

    /* renamed from: a */
    private static C4159e f9943a = new C4159e();

    private C4159e() {
    }

    /* renamed from: a */
    public static final C4159e m11531a() {
        return f9943a;
    }

    /* renamed from: a */
    public void mo32361a(WebView webView) {
        mo32367a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo32362a(WebView webView, float f) {
        mo32367a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo32363a(WebView webView, ErrorType errorType, String str) {
        mo32367a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo32364a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo32371a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo32365a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo32367a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo32367a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo32366a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo32367a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32367a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo32370a(sb, objArr);
            sb.append(")}");
            mo32368a(webView, sb);
            return;
        }
        C4171c.m11596a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32368a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() {
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo32369a(WebView webView, JSONObject jSONObject) {
        mo32367a(webView, Constants.INIT, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32370a(StringBuilder sb, Object[] objArr) {
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

    /* renamed from: a */
    public boolean mo32371a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo32372b(WebView webView) {
        mo32367a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo32373b(WebView webView, String str) {
        mo32367a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo32374b(WebView webView, JSONObject jSONObject) {
        mo32367a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo32375c(WebView webView) {
        mo32367a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo32376c(WebView webView, String str) {
        mo32367a(webView, "setState", str);
    }
}
