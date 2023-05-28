package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C6288e0;
import com.adcolony.sdk.C6319j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.adcolony.sdk.l */
public final class C6361l extends C6319j {

    /* renamed from: G */
    public static final C6367f f13653G = new C6367f((DefaultConstructorMarker) null);

    /* renamed from: H */
    public static boolean f13654H;

    /* renamed from: com.adcolony.sdk.l$a */
    private final class C6362a extends C6319j.C6320a {
        public C6362a() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6368g().mo50838a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$b */
    private final class C6363b extends C6319j.C6321b {
        public C6363b() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6368g().mo50838a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$c */
    private final class C6364c extends C6319j.C6322c {
        public C6364c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6368g().mo50838a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$d */
    private final class C6365d extends C6319j.C6323d {
        public C6365d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6368g().mo50838a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$e */
    private final class C6366e extends C6319j.C6324e {
        public C6366e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            new C6368g().mo50838a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.l$f */
    public static final class C6367f {
        private C6367f() {
        }

        public /* synthetic */ C6367f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6361l mo50837a(Context context, C6312h0 h0Var) {
            C6361l lVar = new C6361l(context, h0Var, (DefaultConstructorMarker) null);
            lVar.mo50494i();
            return lVar;
        }
    }

    /* renamed from: com.adcolony.sdk.l$g */
    private final class C6368g {
        public C6368g() {
        }

        /* renamed from: a */
        public final void mo50838a() {
            if (!C6361l.this.getModuleInitialized()) {
                C6290e1 e1Var = new C6290e1();
                for (AdColonyInterstitial adColonyInterstitial : C6185a.m14887b().mo50787c().mo50622g()) {
                    C6294f1 f1Var = new C6294f1();
                    C6235c0.m15070a(f1Var, "ad_session_id", adColonyInterstitial.mo50344b());
                    C6235c0.m15070a(f1Var, "ad_id", adColonyInterstitial.mo50335a());
                    C6235c0.m15070a(f1Var, "zone_id", adColonyInterstitial.getZoneID());
                    C6235c0.m15070a(f1Var, "ad_request_id", adColonyInterstitial.mo50356g());
                    e1Var.mo50646a(f1Var);
                }
                C6235c0.m15068a(C6361l.this.getInfo(), "ads_to_restore", e1Var);
            }
        }
    }

    private C6361l(Context context, C6312h0 h0Var) {
        super(context, 1, h0Var);
    }

    public /* synthetic */ C6361l(Context context, C6312h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, h0Var);
    }

    /* renamed from: b */
    public static final C6361l m15494b(Context context, C6312h0 h0Var) {
        return f13653G.mo50837a(context, h0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo50465a(C6294f1 f1Var, String str) {
        if (super.mo50465a(f1Var, str)) {
            return true;
        }
        new C6288e0.C6289a().mo50644a("Unable to communicate with controller, disabling AdColony.").mo50645a(C6288e0.f13497h);
        AdColony.disable();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo50568c(C6294f1 f1Var) {
        if (f13654H) {
            return "android_asset/ADCController.js";
        }
        return super.mo50568c(f1Var);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C6363b();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C6364c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C6365d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C6366e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C6362a();
    }
}
