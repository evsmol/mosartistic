package com.iab.omid.library.appodeal.p105b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.p107d.C4278c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.b.e */
public class C4266e {

    /* renamed from: a */
    private static C4266e f10184a = new C4266e();

    private C4266e() {
    }

    /* renamed from: a */
    public static final C4266e m12012a() {
        return f10184a;
    }

    /* renamed from: a */
    public void mo32768a(WebView webView) {
        mo32774a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void mo32769a(WebView webView, float f) {
        mo32774a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo32770a(WebView webView, ErrorType errorType, String str) {
        mo32774a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void mo32771a(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            mo32778a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void mo32772a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            mo32774a(webView, "publishMediaEvent", str, jSONObject);
            return;
        }
        mo32774a(webView, "publishMediaEvent", str);
    }

    /* renamed from: a */
    public void mo32773a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo32774a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32774a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            mo32777a(sb, objArr);
            sb.append(")}");
            mo32775a(webView, sb);
            return;
        }
        C4278c.m12075a("The WebView is null for " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32775a(final WebView webView, StringBuilder sb) {
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
    public void mo32776a(WebView webView, JSONObject jSONObject) {
        mo32774a(webView, Constants.INIT, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32777a(StringBuilder sb, Object[] objArr) {
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
    public boolean mo32778a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void mo32779b(WebView webView) {
        mo32774a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void mo32780b(WebView webView, String str) {
        mo32774a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void mo32781b(WebView webView, JSONObject jSONObject) {
        mo32774a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void mo32782c(WebView webView) {
        mo32774a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void mo32783c(WebView webView, String str) {
        mo32774a(webView, "setState", str);
    }
}
