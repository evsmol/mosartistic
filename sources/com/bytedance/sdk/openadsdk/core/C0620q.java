package com.bytedance.sdk.openadsdk.core;

import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;

/* renamed from: com.bytedance.sdk.openadsdk.core.q */
/* compiled from: SSWebSettings */
public class C0620q {
    /* renamed from: a */
    public static void m3008a(WebView webView) {
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th) {
                C10638l.m31234b(th.toString());
            }
        }
    }
}
