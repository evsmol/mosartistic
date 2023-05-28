package com.bytedance.sdk.openadsdk.core.widget.p036a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.utils.C0981i;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.c */
/* compiled from: TTWebChromeClient */
public class C0729c extends WebChromeClient {

    /* renamed from: a */
    private static final String f2813a = WebChromeClient.class.getSimpleName();

    /* renamed from: b */
    private final C0709w f2814b;

    /* renamed from: c */
    private C0150n f2815c;

    public C0729c(C0709w wVar, C0150n nVar) {
        this.f2814b = wVar;
        this.f2815c = nVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m3739a(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !m3739a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3739a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"bytedance".equals(parse.getScheme().toLowerCase())) {
                return false;
            }
            C0981i.m4547a(parse, this.f2814b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C0150n nVar = this.f2815c;
        if (nVar != null) {
            nVar.mo431a(webView, i);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
