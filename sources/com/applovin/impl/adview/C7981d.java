package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8036d;
import com.applovin.impl.p233b.C8041i;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8536i;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.d */
public class C7981d extends C7992h {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WebView f19287c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8626v f19288a;

    /* renamed from: b */
    private final C8490n f19289b;

    /* renamed from: d */
    private C8392d f19290d;

    /* renamed from: e */
    private C8350e f19291e;

    /* renamed from: f */
    private boolean f19292f;

    public C7981d(C7987e eVar, C8490n nVar, Context context) {
        this(eVar, nVar, context, false);
    }

    C7981d(C7987e eVar, C8490n nVar, Context context, boolean z) {
        super(context);
        if (nVar != null) {
            this.f19289b = nVar;
            this.f19288a = nVar.mo57320D();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(eVar);
            setWebChromeClient(new C7980c(eVar != null ? eVar.mo55721a() : null, nVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (C8571h.m26091i() && ((Boolean) nVar.mo57342a(C8380b.f20929eV)).booleanValue()) {
                setWebViewRenderProcessClient(new C7989f(nVar).mo55732a());
            }
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    C8626v unused = C7981d.this.f19288a;
                    if (!C8626v.m26252a()) {
                        return true;
                    }
                    C7981d.this.f19288a.mo57818b("AdWebView", "Received a LongClick event.");
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    private String m23717a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m23719a(final C8536i iVar, final C8490n nVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                String a = C8536i.this.mo57505a();
                C7981d.m23723c();
                if (C7981d.f19287c == null) {
                    appLovinPostbackListener.onPostbackFailure(a, -1);
                    return;
                }
                if (C8536i.this.mo57510c() != null) {
                    a = StringUtils.appendQueryParameters(a, C8536i.this.mo57510c(), ((Boolean) nVar.mo57342a(C8380b.f20894dm)).booleanValue());
                }
                String str = "al_firePostback('" + a + "');";
                if (C8571h.m26085c()) {
                    C7981d.f19287c.evaluateJavascript(str, (ValueCallback) null);
                } else {
                    C7981d.f19287c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a);
            }
        });
    }

    /* renamed from: a */
    private void m23720a(String str, String str2, String str3, C8490n nVar, C8029a aVar) {
        String str4;
        C8626v vVar;
        StringBuilder sb;
        String a = m23717a(str3, str);
        if (StringUtils.isValidString(a)) {
            if (aVar.mo55842c() && aVar.isOpenMeasurementEnabled() && !aVar.mo57018q()) {
                a = nVar.mo57374ao().mo56869a(a);
            }
            str4 = a;
            if (C8626v.m26252a()) {
                vVar = this.f19288a;
                sb = new StringBuilder();
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
        }
        String a2 = m23717a((String) nVar.mo57342a(C8380b.f20949ep), str);
        if (StringUtils.isValidString(a2)) {
            if (aVar.mo55842c() && aVar.isOpenMeasurementEnabled()) {
                a2 = nVar.mo57374ao().mo56869a(a2);
            }
            str4 = a2;
            if (C8626v.m26252a()) {
                vVar = this.f19288a;
                sb = new StringBuilder();
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
        }
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f19288a;
            vVar2.mo57818b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
        return;
        sb.append("Rendering webview for VAST ad with resourceContents : ");
        sb.append(str4);
        vVar.mo57818b("AdWebView", sb.toString());
        loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
    }

    /* renamed from: b */
    private void m23722b(C8350e eVar) {
        Boolean n;
        Integer a;
        loadUrl("about:blank");
        int az = this.f19291e.mo57010az();
        if (az >= 0) {
            setLayerType(az, (Paint) null);
        }
        if (C8571h.m26084b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.mo57006av());
        }
        if (C8571h.m26085c() && eVar.mo57008ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        C8027v ay = eVar.mo57009ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = ay.mo55805b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean c = ay.mo55806c();
            if (c != null) {
                settings.setAllowFileAccess(c.booleanValue());
            }
            Boolean d = ay.mo55807d();
            if (d != null) {
                settings.setLoadWithOverviewMode(d.booleanValue());
            }
            Boolean e = ay.mo55808e();
            if (e != null) {
                settings.setUseWideViewPort(e.booleanValue());
            }
            Boolean f = ay.mo55809f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g = ay.mo55810g();
            if (g != null) {
                settings.setBuiltInZoomControls(g.booleanValue());
            }
            Boolean h = ay.mo55811h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean i = ay.mo55812i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = ay.mo55813j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = ay.mo55814k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = ay.mo55815l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = ay.mo55816m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (C8571h.m26086d() && (a = ay.mo55804a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (C8571h.m26087e() && (n = ay.mo55817n()) != null) {
                settings.setOffscreenPreRaster(n.booleanValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m23723c() {
        if (f19287c == null) {
            WebView tryToCreateWebView = Utils.tryToCreateWebView(C8490n.m25593Q(), "postbacks");
            f19287c = tryToCreateWebView;
            if (tryToCreateWebView != null) {
                tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
                f19287c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
                f19287c.setWebViewClient(new WebViewClient() {
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (webView != C7981d.f19287c) {
                            return true;
                        }
                        C7981d.f19287c.destroy();
                        WebView unused = C7981d.f19287c = null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                C7981d.m23723c();
                            }
                        });
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo55706a(C8350e eVar) {
        C8626v vVar;
        String str;
        C8626v vVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        C8490n nVar;
        if (!this.f19292f) {
            this.f19291e = eVar;
            try {
                m23722b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof C8345a) {
                    C8345a aVar = (C8345a) eVar;
                    String b = aVar.mo55841b();
                    if (!aVar.mo57018q() && aVar.isOpenMeasurementEnabled()) {
                        b = this.f19289b.mo57374ao().mo56869a(b);
                    }
                    loadDataWithBaseURL(eVar.mo57007aw(), b, "text/html", (String) null, "");
                    if (C8626v.m26252a()) {
                        vVar = this.f19288a;
                        str = "AppLovinAd rendered";
                    } else {
                        return;
                    }
                } else if (eVar instanceof C8029a) {
                    C8029a aVar2 = (C8029a) eVar;
                    C8036d aO = aVar2.mo55831aO();
                    if (aO != null) {
                        C8041i b2 = aO.mo55888b();
                        Uri b3 = b2.mo55918b();
                        String uri = b3 != null ? b3.toString() : "";
                        String c = b2.mo55919c();
                        String aS = aVar2.mo55835aS();
                        if (!StringUtils.isValidString(uri)) {
                            if (!StringUtils.isValidString(c)) {
                                if (C8626v.m26252a()) {
                                    vVar2 = this.f19288a;
                                    str2 = "Unable to load companion ad. No resources provided.";
                                    vVar2.mo57822e("AdWebView", str2);
                                    return;
                                }
                                return;
                            }
                        }
                        if (b2.mo55915a() == C8041i.C8042a.STATIC) {
                            if (C8626v.m26252a()) {
                                this.f19288a.mo57818b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a = m23717a((String) this.f19289b.mo57342a(C8380b.f20948eo), uri);
                            if (aVar2.mo55842c() && aVar2.isOpenMeasurementEnabled() && aVar2.mo55844e()) {
                                a = this.f19289b.mo57374ao().mo56869a(a);
                            }
                            str3 = a;
                            aw = eVar.mo57007aw();
                            str4 = "text/html";
                            str5 = null;
                            str6 = "";
                        } else {
                            if (b2.mo55915a() == C8041i.C8042a.HTML) {
                                if (StringUtils.isValidString(c)) {
                                    String a2 = m23717a(aS, c);
                                    if (StringUtils.isValidString(a2)) {
                                        c = a2;
                                    }
                                    if (aVar2.mo55842c() && aVar2.isOpenMeasurementEnabled() && !aVar2.mo57018q()) {
                                        c = this.f19289b.mo57374ao().mo56869a(c);
                                    }
                                    str3 = c;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar3 = this.f19288a;
                                        vVar3.mo57818b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                    }
                                    aw = eVar.mo57007aw();
                                    str4 = "text/html";
                                    str5 = null;
                                    str6 = "";
                                } else if (StringUtils.isValidString(uri)) {
                                    if (C8626v.m26252a()) {
                                        this.f19288a.mo57818b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                    }
                                    aw2 = eVar.mo57007aw();
                                    nVar = this.f19289b;
                                } else {
                                    return;
                                }
                            } else if (b2.mo55915a() == C8041i.C8042a.IFRAME) {
                                if (StringUtils.isValidString(uri)) {
                                    if (C8626v.m26252a()) {
                                        this.f19288a.mo57818b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                    }
                                    aw2 = eVar.mo57007aw();
                                    nVar = this.f19289b;
                                } else if (StringUtils.isValidString(c)) {
                                    String a3 = m23717a(aS, c);
                                    if (StringUtils.isValidString(a3)) {
                                        c = a3;
                                    }
                                    if (aVar2.mo55842c() && aVar2.isOpenMeasurementEnabled() && !aVar2.mo57018q()) {
                                        c = this.f19289b.mo57374ao().mo56869a(c);
                                    }
                                    str3 = c;
                                    if (C8626v.m26252a()) {
                                        C8626v vVar4 = this.f19288a;
                                        vVar4.mo57818b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    aw = eVar.mo57007aw();
                                    str4 = "text/html";
                                    str5 = null;
                                    str6 = "";
                                } else {
                                    return;
                                }
                            } else if (C8626v.m26252a()) {
                                vVar2 = this.f19288a;
                                str2 = "Failed to render VAST companion ad of invalid type";
                                vVar2.mo57822e("AdWebView", str2);
                                return;
                            } else {
                                return;
                            }
                            m23720a(uri, aw2, aS, nVar, aVar2);
                            return;
                        }
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (C8626v.m26252a()) {
                        vVar = this.f19288a;
                        str = "No companion ad provided.";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                vVar.mo57818b("AdWebView", str);
            } catch (Throwable th) {
                String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else {
            C8626v.m26258i("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    /* renamed from: a */
    public void mo55707a(String str) {
        mo55708a(str, (Runnable) null);
    }

    /* renamed from: a */
    public void mo55708a(String str, Runnable runnable) {
        try {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19288a;
                vVar.mo57818b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.f19288a.mo57819b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f19292f = true;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public C8350e getCurrentAd() {
        return this.f19291e;
    }

    public C8392d getStatsManagerHelper() {
        return this.f19290d;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setStatsManagerHelper(C8392d dVar) {
        this.f19290d = dVar;
    }
}
