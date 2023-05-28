package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C6236c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.adcolony.sdk.j */
public class C6319j extends C6236c1 {

    /* renamed from: F */
    public static final C6325f f13563F = new C6325f((DefaultConstructorMarker) null);

    /* renamed from: com.adcolony.sdk.j$a */
    protected class C6320a extends C6236c1.C6239c {
        public C6320a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6326g().mo50760a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$b */
    protected class C6321b extends C6236c1.C6240d {
        public C6321b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6326g().mo50760a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$c */
    protected class C6322c extends C6236c1.C6241e {
        public C6322c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6326g().mo50760a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$d */
    protected class C6323d extends C6236c1.C6242f {
        public C6323d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6326g().mo50760a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$e */
    protected class C6324e extends C6236c1.C6243g {
        public C6324e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6326g().mo50760a();
        }
    }

    /* renamed from: com.adcolony.sdk.j$f */
    public static final class C6325f {
        private C6325f() {
        }

        public /* synthetic */ C6325f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6319j mo50759a(Context context, C6312h0 h0Var) {
            C6319j jVar;
            int e = C6185a.m14887b().mo50807r().mo50750e();
            if (Intrinsics.areEqual((Object) C6235c0.m15087h(h0Var.mo50732a(), "type"), (Object) "aurora")) {
                jVar = new C6286e(context, e, h0Var);
            } else {
                jVar = new C6319j(context, e, h0Var);
            }
            jVar.mo50494i();
            return jVar;
        }
    }

    /* renamed from: com.adcolony.sdk.j$g */
    private final class C6326g {
        public C6326g() {
        }

        /* renamed from: a */
        public final void mo50760a() {
            C6312h0 a;
            if (!(C6319j.this instanceof C6361l)) {
                C6294f1 b = C6235c0.m15073b();
                C6319j jVar = C6319j.this;
                C6235c0.m15079b(b, "success", true);
                C6235c0.m15077b(b, "id", jVar.getAdc3ModuleId());
                C6312h0 message = C6319j.this.getMessage();
                if (message != null && (a = message.mo50733a(b)) != null) {
                    a.mo50736c();
                }
            }
        }
    }

    protected C6319j(Context context, int i, C6312h0 h0Var) {
        super(context, i, h0Var);
    }

    /* renamed from: a */
    public static final C6319j m15352a(Context context, C6312h0 h0Var) {
        return f13563F.mo50759a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C6321b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C6322c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C6323d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C6324e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C6320a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo50494i() {
        C6312h0 message = getMessage();
        C6294f1 a = message == null ? null : message.mo50732a();
        if (a == null) {
            a = C6235c0.m15073b();
        }
        setMraidFilepath(C6235c0.m15087h(a, "mraid_filepath"));
        setBaseUrl(C6235c0.m15087h(a, "base_url"));
        setIab(C6235c0.m15085f(a, "iab"));
        setInfo(C6235c0.m15085f(a, "info"));
        setAdSessionId(C6235c0.m15087h(a, "ad_session_id"));
        setMUrl(mo50570d(a));
        super.mo50494i();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C6312h0 h0Var) {
        super.setBounds(h0Var);
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15079b(b, "success", true);
        C6235c0.m15077b(b, "id", getAdc3ModuleId());
        h0Var.mo50733a(b).mo50736c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C6312h0 h0Var) {
        super.setVisible(h0Var);
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15079b(b, "success", true);
        C6235c0.m15077b(b, "id", getAdc3ModuleId());
        h0Var.mo50733a(b).mo50736c();
    }
}
