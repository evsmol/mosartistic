package com.iab.omid.library.adcolony.p093b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.p095d.C4121c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.b.e */
public class C4109e {

    /* renamed from: a */
    private static C4109e f9826a = new C4109e();

    private C4109e() {
    }

    /* renamed from: a */
    public static final C4109e m11301a() {
        return f9826a;
    }

    /* renamed from: a */
    public void mo32162a(WebView webView) {
        mo32168a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo32163a(WebView webView, float f) {
        mo32168a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo32164a(WebView webView, ErrorType errorType, String str) {
        mo32168a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo32165a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo32172a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo32166a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo32168a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo32168a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo32167a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo32168a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32168a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo32171a(sb, objArr);
            sb.append(")}");
            mo32169a(webView, sb);
            return;
        }
        C4121c.m11366a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32169a(final WebView webView, StringBuilder sb) {
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
    public void mo32170a(WebView webView, JSONObject jSONObject) {
        mo32168a(webView, Constants.INIT, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32171a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo32172a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo32173b(WebView webView) {
        mo32168a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo32174b(WebView webView, String str) {
        mo32168a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo32175b(WebView webView, JSONObject jSONObject) {
        mo32168a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo32176c(WebView webView) {
        mo32168a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo32177c(WebView webView, String str) {
        mo32168a(webView, "setState", str);
    }
}
