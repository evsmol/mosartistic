package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;

/* renamed from: com.applovin.impl.adview.c */
class C7980c extends WebChromeClient {

    /* renamed from: a */
    private final C8626v f19285a;

    /* renamed from: b */
    private final C7965b f19286b;

    public C7980c(C7965b bVar, C8490n nVar) {
        this.f19285a = nVar.mo57320D();
        this.f19286b = bVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19285a;
            vVar.mo57821d("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (!C8626v.m26252a()) {
            return true;
        }
        this.f19285a.mo57818b("AdWebView", str);
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C8626v.m26252a()) {
            return true;
        }
        C8626v vVar = this.f19285a;
        vVar.mo57821d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C8626v.m26252a()) {
            return true;
        }
        C8626v vVar = this.f19285a;
        vVar.mo57821d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!C8626v.m26252a()) {
            return true;
        }
        C8626v vVar = this.f19285a;
        vVar.mo57821d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        C7965b bVar;
        if (i == 100 && (bVar = this.f19286b) != null) {
            bVar.mo55656a(webView);
        }
    }
}
