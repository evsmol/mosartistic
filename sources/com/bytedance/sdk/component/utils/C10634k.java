package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.utils.k */
/* compiled from: LoadUrlUtils */
public class C10634k {

    /* renamed from: a */
    private static final C10636a f26519a;

    /* renamed from: com.bytedance.sdk.component.utils.k$a */
    /* compiled from: LoadUrlUtils */
    private static class C10636a {
        private C10636a() {
        }

        /* renamed from: a */
        public void mo64266a(WebView webView, String str) {
            if (webView != null) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.k$b */
    /* compiled from: LoadUrlUtils */
    private static class C10637b extends C10636a {
        private C10637b() {
            super();
        }

        /* renamed from: a */
        public void mo64266a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, (ValueCallback) null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        webView.loadUrl(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f26519a = new C10637b();
        } else {
            f26519a = new C10636a();
        }
    }

    /* renamed from: a */
    public static void m31223a(WebView webView, String str) {
        f26519a.mo64266a(webView, str);
    }
}
