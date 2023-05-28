package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p299c.C10306c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.nativeexpress.p031a.C0574a;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import java.io.InputStream;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.g */
/* compiled from: ExpressClient */
public class C0592g extends C0730d {

    /* renamed from: a */
    private C0477n f2228a;

    public C0592g(Context context, C0709w wVar, C0477n nVar, C0150n nVar2) {
        super(context, wVar, nVar.mo1345Y(), nVar2, false);
        this.f2228a = nVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            C10638l.m31239c("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            WebResourceResponse a = m2858a(webView, str);
            m2860a(currentTimeMillis, System.currentTimeMillis(), str, a != null ? 1 : 2);
            if (a != null) {
                return a;
            }
        } catch (Throwable th) {
            C10638l.m31239c("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f2823g = false;
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f2824h = false;
        super.onPageStarted(webView, str, bitmap);
    }

    /* renamed from: a */
    private WebResourceResponse m2858a(WebView webView, String str) {
        C0463k kVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C10306c.C10307a a = C10306c.m29755a(str);
        if (a != C10306c.C10307a.IMAGE) {
            Iterator<C0463k> it = this.f2228a.mo1336P().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0463k next = it.next();
                if (!TextUtils.isEmpty(next.mo1281a()) && !TextUtils.isEmpty(str)) {
                    String a2 = next.mo1281a();
                    if (a2.startsWith("https")) {
                        a2 = a2.replaceFirst("https", "http");
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(a2)) {
                        kVar = next;
                        break;
                    }
                }
            }
        }
        if (a == C10306c.C10307a.IMAGE || kVar != null) {
            return m2859a(str, C0574a.m2771a(this.f2228a, str));
        }
        return C10266a.m29489a(str, a, "");
    }

    /* renamed from: a */
    private WebResourceResponse m2859a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream a = C0750a.m3823a(str, str2);
            if (a != null) {
                return new WebResourceResponse(C10306c.C10307a.IMAGE.mo63236a(), "utf-8", a);
            }
            return null;
        } catch (Throwable th) {
            C10638l.m31239c("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    /* renamed from: a */
    private void m2860a(long j, long j2, String str, int i) {
        if (this.f2822f != null && this.f2822f.mo439b() != null) {
            C10306c.C10307a a = C10306c.m29755a(str);
            if (a == C10306c.C10307a.HTML) {
                this.f2822f.mo439b().mo464a(str, j, j2, i);
            } else if (a == C10306c.C10307a.JS) {
                this.f2822f.mo439b().mo471b(str, j, j2, i);
            }
        }
    }
}
