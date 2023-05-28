package com.bytedance.sdk.component.p293a;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.a.z */
/* compiled from: WebViewBridge */
public class C10259z extends C10217a {

    /* renamed from: j */
    static final /* synthetic */ boolean f25338j = (!C10259z.class.desiredAssertionStatus());

    /* renamed from: h */
    protected String f25339h;

    /* renamed from: i */
    protected WebView f25340i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Context mo63013a(C10232j jVar) {
        if (jVar.f25270e != null) {
            return jVar.f25270e;
        }
        if (jVar.f25266a != null) {
            return jVar.f25266a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo63014a() {
        return this.f25340i.getUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63020b(C10232j jVar) {
        this.f25340i = jVar.f25266a;
        this.f25339h = jVar.f25268c;
        if (Build.VERSION.SDK_INT >= 17 && !jVar.f25279n) {
            mo2552c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2552c() {
        if (f25338j || this.f25340i != null) {
            this.f25340i.addJavascriptInterface(this, this.f25339h);
            return;
        }
        throw new AssertionError();
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63019b() {
        super.mo63019b();
        mo2553d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2553d() {
        this.f25340i.removeJavascriptInterface(this.f25339h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63018a(String str, C10242q qVar) {
        if (qVar == null || TextUtils.isEmpty(qVar.f25290h)) {
            super.mo63018a(str, qVar);
            return;
        }
        String str2 = qVar.f25290h;
        m29454a(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(String.format("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63017a(String str) {
        m29454a(str, "javascript:" + this.f25339h + "._handleMessageFromToutiao(" + str + ")");
    }

    /* renamed from: a */
    private void m29454a(String str, final String str2) {
        if (!this.f25233f && !TextUtils.isEmpty(str2)) {
            C102601 r3 = new Runnable() {
                public void run() {
                    if (!C10259z.this.f25233f) {
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                C10231i.m29376a("Invoking Jsb using evaluateJavascript: " + str2);
                                C10259z.this.f25340i.evaluateJavascript(str2, (ValueCallback) null);
                                return;
                            }
                            C10231i.m29376a("Invoking Jsb using loadUrl: " + str2);
                            C10259z.this.f25340i.loadUrl(str2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                C10231i.m29376a("Received call on sub-thread, posting to main thread: " + str2);
                this.f25231d.post(r3);
                return;
            }
            r3.run();
        }
    }
}
