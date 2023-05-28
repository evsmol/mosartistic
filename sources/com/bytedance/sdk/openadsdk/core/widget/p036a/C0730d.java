package com.bytedance.sdk.openadsdk.core.widget.p036a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.d */
/* compiled from: TTWebViewClient */
public class C0730d extends SSWebView.C10655a {

    /* renamed from: i */
    private static final HashSet<String> f2816i;

    /* renamed from: a */
    private boolean f2817a = false;

    /* renamed from: b */
    private AtomicBoolean f2818b = new AtomicBoolean(false);

    /* renamed from: c */
    protected final C0709w f2819c;

    /* renamed from: d */
    protected final Context f2820d;

    /* renamed from: e */
    protected final String f2821e;

    /* renamed from: f */
    protected C0150n f2822f;

    /* renamed from: g */
    protected boolean f2823g = true;

    /* renamed from: h */
    protected boolean f2824h = true;

    public C0730d(Context context, C0709w wVar, String str, C0150n nVar, boolean z) {
        this.f2820d = context;
        this.f2819c = wVar;
        this.f2821e = str;
        this.f2822f = nVar;
        this.f2817a = z;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C0150n nVar = this.f2822f;
        if (nVar != null) {
            nVar.mo433a(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C10638l.m31235b("WebChromeClient", "shouldOverrideUrlLoading " + str);
        try {
            Uri parse = Uri.parse(str);
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                C0981i.m4547a(parse, this.f2819c);
                return true;
            } else if (mo2476a(str)) {
                return true;
            } else {
                if (!C10642o.m31258a(str)) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.f2820d.startActivity(intent);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        } catch (Throwable th) {
            C10638l.m31236b("WebChromeClient", "shouldOverrideUrlLoading", th);
            C0709w wVar = this.f2819c;
            if (wVar != null && wVar.mo2381d()) {
                return true;
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (C10638l.m31232a()) {
            C10638l.m31229a("WebChromeClient", "onPageFinished " + str);
        }
        C0150n nVar = this.f2822f;
        if (nVar != null) {
            nVar.mo435a(webView, str, this.f2817a);
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C0150n nVar = this.f2822f;
        if (nVar != null) {
            nVar.mo434a(webView, str, bitmap);
        }
        if (this.f2824h) {
            C0728b.m3733a(this.f2820d).mo2470a(Build.VERSION.SDK_INT >= 19).mo2472b(webView.getSettings().getBuiltInZoomControls()).mo2471a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C0150n nVar = this.f2822f;
        if (nVar != null) {
            nVar.mo432a(webView, i, str, str2, m3740b(str2));
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f2822f != null && webResourceError != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f2822f.mo432a(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f2822f != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f2822f.mo432a(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f2822f != null) {
            int i = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i = sslError.getPrimaryError();
                    str = "SslError: " + String.valueOf(sslError);
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f2822f.mo432a(webView, i, str, str3, m3740b(str3));
        }
    }

    /* renamed from: a */
    public boolean mo2476a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.f2820d.startActivity(intent);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f2816i = hashSet;
        hashSet.add("png");
        f2816i.add("ico");
        f2816i.add("jpg");
        f2816i.add("gif");
        f2816i.add("svg");
        f2816i.add("jpeg");
    }

    /* renamed from: b */
    protected static String m3740b(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !f2816i.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/" + substring;
    }
}
