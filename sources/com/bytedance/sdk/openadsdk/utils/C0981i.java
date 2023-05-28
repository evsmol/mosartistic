package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0709w;

/* renamed from: com.bytedance.sdk.openadsdk.utils.i */
/* compiled from: JsBridgeUtils */
public class C0981i {
    /* renamed from: a */
    public static void m4547a(Uri uri, C0709w wVar) {
        if (wVar != null && wVar.mo2361a(uri)) {
            try {
                wVar.mo2369b(uri);
            } catch (Exception e) {
                C10638l.m31241d("WebView", "TTAndroidObj handleUri exception: " + e);
            }
        }
    }

    /* renamed from: a */
    public static String m4546a(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news" + " open_news_u_s/" + i;
    }
}
