package com.bytedance.sdk.component.adexpress.p300d;

import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10264c;
import com.bytedance.sdk.component.p293a.C10259z;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.d.e */
/* compiled from: WebViewPool */
public class C10313e {

    /* renamed from: d */
    private static final byte[] f25506d = new byte[0];

    /* renamed from: e */
    private static int f25507e = 10;

    /* renamed from: g */
    private static volatile C10313e f25508g;

    /* renamed from: a */
    private List<SSWebView> f25509a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, C10311c> f25510b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C10312d> f25511c = new HashMap();

    /* renamed from: f */
    private final AtomicBoolean f25512f = new AtomicBoolean(false);

    private C10313e() {
        C10264c c = C10262a.m29464a().mo63095c();
        if (c != null) {
            f25507e = c.mo1827j();
        }
    }

    /* renamed from: a */
    public static C10313e m29785a() {
        if (f25508g == null) {
            synchronized (C10313e.class) {
                if (f25508g == null) {
                    f25508g = new C10313e();
                }
            }
        }
        return f25508g;
    }

    /* renamed from: b */
    public SSWebView mo63264b() {
        SSWebView remove;
        if (mo63268d() <= 0 || (remove = this.f25509a.remove(0)) == null) {
            return null;
        }
        C10638l.m31235b("WebViewPool", "get WebView from pool; current available count: " + mo63268d());
        return remove;
    }

    /* renamed from: a */
    public void mo63262a(SSWebView sSWebView) {
        if (sSWebView != null) {
            m29786e(sSWebView);
            sSWebView.mo64303b("SDK_INJECT_GLOBAL");
            mo63269d(sSWebView);
            mo63265b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo63265b(SSWebView sSWebView) {
        if (sSWebView != null) {
            if (this.f25509a.size() >= f25507e) {
                C10638l.m31235b("WebViewPool", "WebView pool is full，destroy webview");
                sSWebView.mo64324l();
            } else if (!this.f25509a.contains(sSWebView)) {
                this.f25509a.add(sSWebView);
                C10638l.m31235b("WebViewPool", "recycle WebView，current available count: " + mo63268d());
            }
        }
    }

    /* renamed from: c */
    public boolean mo63267c(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        C10638l.m31235b("WebViewPool", "WebView render fail and abandon");
        sSWebView.mo64324l();
        return true;
    }

    /* renamed from: c */
    public void mo63266c() {
        for (SSWebView next : this.f25509a) {
            if (next != null) {
                next.mo64324l();
            }
        }
        this.f25509a.clear();
    }

    /* renamed from: d */
    public int mo63268d() {
        return this.f25509a.size();
    }

    /* renamed from: e */
    public int mo63270e() {
        return this.f25509a.size();
    }

    /* renamed from: e */
    private void m29786e(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.mo64304c();
        sSWebView.setWebChromeClient((WebChromeClient) null);
        sSWebView.setWebViewClient((WebViewClient) null);
        sSWebView.setDownloadListener((DownloadListener) null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setUserAgentString("android_client");
        sSWebView.setDefaultTextEncodingName("UTF-8");
        sSWebView.setDefaultFontSize(16);
    }

    /* renamed from: a */
    public void mo63263a(SSWebView sSWebView, C10310b bVar) {
        if (sSWebView != null && bVar != null) {
            C10311c cVar = this.f25510b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo63244a(bVar);
            } else {
                cVar = new C10311c(bVar);
                this.f25510b.put(Integer.valueOf(sSWebView.hashCode()), cVar);
            }
            sSWebView.mo64296a((Object) cVar, "SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: d */
    public void mo63269d(SSWebView sSWebView) {
        if (sSWebView != null) {
            C10311c cVar = this.f25510b.get(Integer.valueOf(sSWebView.hashCode()));
            if (cVar != null) {
                cVar.mo63244a((C10310b) null);
            }
            sSWebView.mo64303b("SDK_INJECT_GLOBAL");
        }
    }

    /* renamed from: a */
    public void mo63260a(WebView webView, C10259z zVar, String str) {
        if (webView != null && zVar != null && !TextUtils.isEmpty(str)) {
            C10312d dVar = this.f25511c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo63258a(zVar);
            } else {
                dVar = new C10312d(zVar);
                this.f25511c.put(Integer.valueOf(webView.hashCode()), dVar);
            }
            webView.addJavascriptInterface(dVar, str);
        }
    }

    /* renamed from: a */
    public void mo63261a(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            C10312d dVar = this.f25511c.get(Integer.valueOf(webView.hashCode()));
            if (dVar != null) {
                dVar.mo63258a((C10259z) null);
            }
            webView.removeJavascriptInterface(str);
        }
    }
}
