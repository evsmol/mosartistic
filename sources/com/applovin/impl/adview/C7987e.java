package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8036d;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8533h;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8389b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;

/* renamed from: com.applovin.impl.adview.e */
public class C7987e extends WebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f19299a;

    /* renamed from: b */
    private final C8626v f19300b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7965b f19301c;

    public C7987e(C7965b bVar, C8490n nVar) {
        this.f19299a = nVar;
        this.f19300b = nVar.mo57320D();
        this.f19301c = bVar;
    }

    /* renamed from: a */
    private void m23728a(PointF pointF) {
        this.f19301c.mo55655a(pointF);
    }

    /* renamed from: a */
    private void m23729a(Uri uri, C7981d dVar) {
        String str;
        C8626v vVar;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f19300b;
                    vVar2.mo57818b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f19299a);
                C8575k.m26159c(this.f19301c.mo55674g(), (AppLovinAd) this.f19301c.mo55683p(), this.f19301c.mo55685r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.f19300b;
                    vVar3.mo57818b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (C8626v.m26252a()) {
                    C8626v vVar4 = this.f19300b;
                    vVar4.mo57818b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f19299a.mo57368ai().mo56832a(new C8561a() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, (AppLovinWebViewActivity.EventListener) null);
                            C8575k.m26122a(C7987e.this.f19301c.mo55674g(), (AppLovinAd) C7987e.this.f19301c.mo55683p(), C7987e.this.f19301c.mo55685r());
                        }
                    }

                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            C8575k.m26153b(C7987e.this.f19301c.mo55674g(), (AppLovinAd) C7987e.this.f19301c.mo55683p(), C7987e.this.f19301c.mo55685r());
                            C7987e.this.f19299a.mo57368ai().mo56834b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f19299a.mo57332P(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f19299a.mo57319C());
                intent.setFlags(268435456);
                this.f19299a.mo57332P().startActivity(intent);
                return;
            } else if (C8626v.m26252a()) {
                vVar = this.f19300b;
                str = "Could not find load type in original uri";
            } else {
                return;
            }
        } else if (C8626v.m26252a()) {
            vVar = this.f19300b;
            str = "Could not find url to load from query in original uri";
        } else {
            return;
        }
        vVar.mo57822e("AdWebView", str);
    }

    /* renamed from: a */
    private void m23730a(Uri uri, C8350e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.f19299a.mo57339X().mo57568a(C8533h.m25871o().mo57602c(appendQueryParameter).mo57597a(false).mo57604c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).mo57598a());
        } else if (C8626v.m26252a()) {
            C8626v vVar = this.f19300b;
            vVar.mo57822e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* renamed from: a */
    private void m23731a(C7981d dVar, Uri uri) {
        C8350e currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.f19301c.mo55685r();
        if (r != null && currentAd != null) {
            C8392d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.mo57131b();
            }
            if (currentAd instanceof C8029a) {
                ((C8029a) currentAd).mo55860o().mo56887o();
            }
            this.f19301c.mo55660a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
        } else if (C8626v.m26252a()) {
            C8626v vVar = this.f19300b;
            vVar.mo57822e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    /* renamed from: a */
    private void m23732a(C8029a aVar, C7981d dVar) {
        C8036d aO = aVar.mo55831aO();
        if (aO != null) {
            C8046m.m23960a(aO.mo55889c(), this.f19301c.mo55684q());
            m23731a(dVar, aO.mo55887a());
        }
    }

    /* renamed from: b */
    private void m23734b() {
        this.f19301c.mo55679l();
    }

    /* renamed from: c */
    private void m23735c() {
        this.f19301c.mo55678k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7965b mo55721a() {
        return this.f19301c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        if (r6.mo55834aR() != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0167, code lost:
        if (r6.mo55834aR() != false) goto L_0x026b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo55722a(android.webkit.WebView r11, java.lang.String r12) {
        /*
            r10 = this;
            com.applovin.impl.adview.b r0 = r10.f19301c
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            java.lang.String r2 = "AdWebView"
            if (r0 == 0) goto L_0x0029
            com.applovin.impl.sdk.v r0 = r10.f19300b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Processing click on ad URL \""
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo57820c(r2, r3)
        L_0x0029:
            if (r12 == 0) goto L_0x0272
            boolean r0 = r11 instanceof com.applovin.impl.adview.C7981d
            if (r0 == 0) goto L_0x0272
            android.net.Uri r0 = android.net.Uri.parse(r12)
            com.applovin.impl.adview.d r11 = (com.applovin.impl.adview.C7981d) r11
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = r0.getHost()
            java.lang.String r5 = r0.getPath()
            com.applovin.impl.adview.b r6 = r10.f19301c
            com.applovin.impl.sdk.ad.e r6 = r6.mo55683p()
            if (r6 != 0) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "Unable to process click, ad not found!"
            r11.mo57822e(r2, r12)
        L_0x0056:
            return r1
        L_0x0057:
            android.graphics.PointF r7 = r11.getLastClickLocation()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r1
            boolean r8 = r6.mo56953K()
            if (r8 == 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            r8 = 0
            goto L_0x0070
        L_0x006f:
            r8 = 1
        L_0x0070:
            java.lang.String r9 = "applovin"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x022e
            java.lang.String r9 = "com.applovin.sdk"
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x022e
            java.lang.String r3 = "/adservice/close_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00b0
            com.applovin.impl.sdk.n r11 = r10.f19299a
            com.applovin.sdk.AppLovinSdkSettings r11 = r11.mo57400q()
            java.util.Map r11 = r11.getExtraParameters()
            java.lang.String r0 = "enable_close_URL_ad_value"
            java.lang.Object r11 = r11.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r0 == 0) goto L_0x00ab
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            if (r11 == 0) goto L_0x00ab
            java.lang.String r11 = "close_url"
            r6.setMaxAdValue(r11, r12)
        L_0x00ab:
            r10.m23734b()
            goto L_0x0272
        L_0x00b0:
            java.lang.String r3 = "/adservice/expand_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d7
            boolean r12 = r6.mo56952J()
            if (r12 == 0) goto L_0x00ce
            if (r7 != 0) goto L_0x00ce
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x00cd
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "Skipping expand command without user interaction"
            r11.mo57822e(r2, r12)
        L_0x00cd:
            return r1
        L_0x00ce:
            android.graphics.PointF r11 = r11.getAndClearLastClickLocation()
            r10.m23728a((android.graphics.PointF) r11)
            goto L_0x0272
        L_0x00d7:
            java.lang.String r3 = "/adservice/contract_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00e4
            r10.m23735c()
            goto L_0x0272
        L_0x00e4:
            java.lang.String r3 = "/adservice/no_op"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00ed
            return r1
        L_0x00ed:
            java.lang.String r3 = "/adservice/load_url"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0110
            boolean r12 = r6.mo56952J()
            if (r12 == 0) goto L_0x010b
            if (r7 != 0) goto L_0x010b
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x010a
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "Skipping URL load command without user interaction"
            r11.mo57822e(r2, r12)
        L_0x010a:
            return r1
        L_0x010b:
            r10.m23729a((android.net.Uri) r0, (com.applovin.impl.adview.C7981d) r11)
            goto L_0x0272
        L_0x0110:
            java.lang.String r3 = "/adservice/track_click_now"
            boolean r4 = r3.equals(r5)
            if (r4 == 0) goto L_0x013f
            boolean r12 = r6.mo56952J()
            if (r12 == 0) goto L_0x012e
            if (r7 != 0) goto L_0x012e
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x012d
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "Skipping click tracking command without user interaction"
            r11.mo57822e(r2, r12)
        L_0x012d:
            return r1
        L_0x012e:
            boolean r12 = r6 instanceof com.applovin.impl.p233b.C8029a
            if (r12 == 0) goto L_0x0136
            com.applovin.impl.b.a r6 = (com.applovin.impl.p233b.C8029a) r6
            goto L_0x026b
        L_0x0136:
            android.net.Uri r12 = android.net.Uri.parse(r3)
            r10.m23731a((com.applovin.impl.adview.C7981d) r11, (android.net.Uri) r12)
            goto L_0x0272
        L_0x013f:
            java.lang.String r3 = "/adservice/deeplink"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x016b
            boolean r12 = r6.mo56952J()
            if (r12 == 0) goto L_0x015d
            if (r7 != 0) goto L_0x015d
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x015c
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "Skipping deep link plus command without user interaction"
            r11.mo57822e(r2, r12)
        L_0x015c:
            return r1
        L_0x015d:
            boolean r12 = r6 instanceof com.applovin.impl.p233b.C8029a
            if (r12 == 0) goto L_0x026f
            com.applovin.impl.b.a r6 = (com.applovin.impl.p233b.C8029a) r6
            boolean r12 = r6.mo55834aR()
            if (r12 == 0) goto L_0x026f
            goto L_0x026b
        L_0x016b:
            java.lang.String r11 = "/adservice/postback"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0178
            r10.m23730a((android.net.Uri) r0, (com.applovin.impl.sdk.p252ad.C8350e) r6)
            goto L_0x0272
        L_0x0178:
            com.applovin.impl.adview.b r11 = r10.f19301c
            com.applovin.impl.adview.g r11 = r11.mo55675h()
            if (r11 == 0) goto L_0x01f5
            java.lang.String r11 = "/video_began"
            boolean r11 = r11.equals(r5)
            r2 = 0
            if (r11 == 0) goto L_0x019f
            java.lang.String r11 = "duration"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r2)
            com.applovin.impl.adview.b r0 = r10.f19301c
            com.applovin.impl.adview.g r0 = r0.mo55675h()
            r0.mo55641a(r11)
            goto L_0x0272
        L_0x019f:
            java.lang.String r11 = "/video_completed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01b2
            com.applovin.impl.adview.b r11 = r10.f19301c
            com.applovin.impl.adview.g r11 = r11.mo55675h()
            r11.mo55643g_()
            goto L_0x0272
        L_0x01b2:
            java.lang.String r11 = "/video_progress"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01cf
            java.lang.String r11 = "percent_viewed"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r2)
            com.applovin.impl.adview.b r0 = r10.f19301c
            com.applovin.impl.adview.g r0 = r0.mo55675h()
            r0.mo55642b(r11)
            goto L_0x0272
        L_0x01cf:
            java.lang.String r11 = "/video_waiting"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01e2
            com.applovin.impl.adview.b r11 = r10.f19301c
            com.applovin.impl.adview.g r11 = r11.mo55675h()
            r11.mo55644h_()
            goto L_0x0272
        L_0x01e2:
            java.lang.String r11 = "/video_resumed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.adview.b r11 = r10.f19301c
            com.applovin.impl.adview.g r11 = r11.mo55675h()
            r11.mo55591c()
            goto L_0x0272
        L_0x01f5:
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x0211
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unknown URL: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.mo57821d(r2, r12)
        L_0x0211:
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Path: "
            r12.append(r0)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.mo57821d(r2, r12)
            goto L_0x0272
        L_0x022e:
            if (r8 == 0) goto L_0x0272
            java.util.List r12 = r6.mo56974aA()
            java.util.List r5 = r6.mo56975aB()
            boolean r7 = r12.isEmpty()
            if (r7 != 0) goto L_0x0244
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x0251
        L_0x0244:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x025f
            boolean r12 = r5.contains(r4)
            if (r12 == 0) goto L_0x0251
            goto L_0x025f
        L_0x0251:
            boolean r11 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.sdk.v r11 = r10.f19300b
            java.lang.String r12 = "URL is not whitelisted - bypassing click"
            r11.mo57822e(r2, r12)
            goto L_0x0272
        L_0x025f:
            boolean r12 = r6 instanceof com.applovin.impl.p233b.C8029a
            if (r12 == 0) goto L_0x026f
            com.applovin.impl.b.a r6 = (com.applovin.impl.p233b.C8029a) r6
            boolean r12 = r6.mo55834aR()
            if (r12 == 0) goto L_0x026f
        L_0x026b:
            r10.m23732a((com.applovin.impl.p233b.C8029a) r6, (com.applovin.impl.adview.C7981d) r11)
            goto L_0x0272
        L_0x026f:
            r10.m23731a((com.applovin.impl.adview.C7981d) r11, (android.net.Uri) r0)
        L_0x0272:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C7987e.mo55722a(android.webkit.WebView, java.lang.String):boolean");
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19300b;
            vVar.mo57820c("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C7965b bVar = this.f19301c;
        if (bVar != null) {
            bVar.mo55656a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C7965b bVar = this.f19301c;
        if (bVar != null) {
            C8350e p = bVar.mo55683p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (p != null) {
                this.f19299a.mo57365af().mo57125a(p).mo57127a(C8389b.f21065y, str3).mo57128a();
            }
            if (C8626v.m26252a()) {
                this.f19300b.mo57822e("AdWebView", str3 + " for ad: " + p);
            }
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C7965b bVar = this.f19301c;
        if (bVar != null) {
            C8350e p = bVar.mo55683p();
            this.f19299a.mo57365af().mo57125a(p).mo57126a(C8389b.f21066z).mo57128a();
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19300b;
                vVar.mo57822e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
            }
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C7965b bVar = this.f19301c;
        if (bVar != null) {
            C8350e p = bVar.mo55683p();
            String str = "Received SSL error: " + sslError;
            this.f19299a.mo57365af().mo57125a(p).mo57127a(C8389b.f21038B, str).mo57128a();
            if (C8626v.m26252a()) {
                this.f19300b.mo57822e("AdWebView", str + " for ad: " + p);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.getInstance(webView.getContext()).sendBroadcast(new Intent("com.applovin.render_process_gone"), (Map<String, Object>) null);
        if (this.f19301c == null) {
            return true;
        }
        C8626v.m26258i("AdWebView", "Render process gone for ad: " + this.f19301c.mo55683p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        C8350e p = this.f19301c.mo55683p();
        if (p != null) {
            this.f19299a.mo57365af().mo57125a(p).mo57126a(C8389b.f21037A).mo57128a();
        }
        if (((Boolean) this.f19299a.mo57342a(C8380b.f20924eQ)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f19299a.mo57342a(C8380b.f20926eS)).booleanValue()) {
                String valueOf = p != null ? String.valueOf(p.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView != null && webView.equals(this.f19301c.mo55686s())) {
                this.f19301c.mo55673f();
                AppLovinAdSize b = this.f19301c.mo55668b();
                if (Utils.isBML(b)) {
                    this.f19301c.mo55667a(b);
                    this.f19301c.mo55672e();
                }
            }
        }
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return mo55722a(webView, url.toString());
        }
        if (!C8626v.m26252a()) {
            return false;
        }
        this.f19300b.mo57822e("AdWebView", "No url found for request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return mo55722a(webView, str);
    }
}
