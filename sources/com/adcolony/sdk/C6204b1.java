package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.adcolony.sdk.C6288e0;
import com.appnext.base.p264b.C8849c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.b1 */
public class C6204b1 extends WebView {

    /* renamed from: u */
    public static final C6211g f13328u = new C6211g((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f13329a;

    /* renamed from: b */
    private final C6312h0 f13330b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f13331c;

    /* renamed from: d */
    private String f13332d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f13333e = "";

    /* renamed from: f */
    private String f13334f = "";

    /* renamed from: g */
    private String f13335g = "";

    /* renamed from: h */
    private String f13336h = "";

    /* renamed from: i */
    private String f13337i = "";

    /* renamed from: j */
    private C6294f1 f13338j = C6235c0.m15073b();

    /* renamed from: k */
    private boolean f13339k;

    /* renamed from: l */
    private C6223c f13340l;

    /* renamed from: m */
    private int f13341m;

    /* renamed from: n */
    private int f13342n;

    /* renamed from: o */
    private int f13343o;

    /* renamed from: p */
    private int f13344p;

    /* renamed from: q */
    private int f13345q;

    /* renamed from: r */
    private int f13346r;

    /* renamed from: s */
    private int f13347s;

    /* renamed from: t */
    private int f13348t;

    /* renamed from: com.adcolony.sdk.b1$a */
    private final class C6205a extends WebChromeClient {
        public C6205a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
            if (r3 != false) goto L_0x0064;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0056 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 != 0) goto L_0x0005
                r1 = r0
                goto L_0x0009
            L_0x0005:
                android.webkit.ConsoleMessage$MessageLevel r1 = r9.messageLevel()
            L_0x0009:
                if (r9 != 0) goto L_0x000d
                r9 = r0
                goto L_0x0011
            L_0x000d:
                java.lang.String r9 = r9.message()
            L_0x0011:
                r2 = 2
                r3 = 0
                r4 = 1
                if (r9 != 0) goto L_0x0017
                goto L_0x0021
            L_0x0017:
                java.lang.String r5 = "Viewport target-densitydpi is not supported."
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r5 != 0) goto L_0x0037
                if (r9 != 0) goto L_0x0027
                goto L_0x0031
            L_0x0027:
                java.lang.String r5 = "Viewport argument key \"shrink-to-fit\" not recognized and ignored"
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != r4) goto L_0x0031
                r5 = 1
                goto L_0x0032
            L_0x0031:
                r5 = 0
            L_0x0032:
                if (r5 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r5 = 0
                goto L_0x0038
            L_0x0037:
                r5 = 1
            L_0x0038:
                android.webkit.ConsoleMessage$MessageLevel r6 = android.webkit.ConsoleMessage.MessageLevel.ERROR
                if (r1 != r6) goto L_0x003e
                r6 = 1
                goto L_0x003f
            L_0x003e:
                r6 = 0
            L_0x003f:
                android.webkit.ConsoleMessage$MessageLevel r7 = android.webkit.ConsoleMessage.MessageLevel.WARNING
                if (r1 != r7) goto L_0x0045
                r1 = 1
                goto L_0x0046
            L_0x0045:
                r1 = 0
            L_0x0046:
                if (r9 != 0) goto L_0x0049
                goto L_0x0053
            L_0x0049:
                java.lang.String r7 = "ADC3_update is not defined"
                boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r7 != r4) goto L_0x0053
                r7 = 1
                goto L_0x0054
            L_0x0053:
                r7 = 0
            L_0x0054:
                if (r7 != 0) goto L_0x0064
                if (r9 != 0) goto L_0x0059
                goto L_0x0062
            L_0x0059:
                java.lang.String r7 = "NativeLayer.dispatch_messages is not a function"
                boolean r2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r9, (java.lang.CharSequence) r7, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r2 != r4) goto L_0x0062
                r3 = 1
            L_0x0062:
                if (r3 == 0) goto L_0x007d
            L_0x0064:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C6204b1.this
                com.adcolony.sdk.h0 r3 = r2.getMessage()
                if (r3 != 0) goto L_0x006d
                goto L_0x0071
            L_0x006d:
                com.adcolony.sdk.f1 r0 = r3.mo50732a()
            L_0x0071:
                if (r0 != 0) goto L_0x0078
                com.adcolony.sdk.f1 r0 = new com.adcolony.sdk.f1
                r0.<init>()
            L_0x0078:
                java.lang.String r3 = "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device."
                r2.mo50465a((com.adcolony.sdk.C6294f1) r0, (java.lang.String) r3)
            L_0x007d:
                if (r5 != 0) goto L_0x00c0
                if (r1 != 0) goto L_0x0083
                if (r6 == 0) goto L_0x00c0
            L_0x0083:
                com.adcolony.sdk.b1 r0 = com.adcolony.sdk.C6204b1.this
                com.adcolony.sdk.AdColonyInterstitial r0 = r0.getInterstitial()
                if (r0 != 0) goto L_0x008c
                goto L_0x0092
            L_0x008c:
                java.lang.String r0 = r0.mo50335a()
                if (r0 != 0) goto L_0x0094
            L_0x0092:
                java.lang.String r0 = "unknown"
            L_0x0094:
                com.adcolony.sdk.e0$a r1 = new com.adcolony.sdk.e0$a
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onConsoleMessage: "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r9 = " with ad id: "
                r2.append(r9)
                r2.append(r0)
                java.lang.String r9 = r2.toString()
                com.adcolony.sdk.e0$a r9 = r1.mo50644a((java.lang.String) r9)
                if (r6 == 0) goto L_0x00bb
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C6288e0.f13498i
                goto L_0x00bd
            L_0x00bb:
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C6288e0.f13496g
            L_0x00bd:
                r9.mo50645a((com.adcolony.sdk.C6288e0) r0)
            L_0x00c0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6204b1.C6205a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$b */
    protected class C6206b extends WebViewClient {
        public C6206b() {
        }

        public void onPageFinished(WebView webView, String str) {
            Unit unit;
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15077b(b, "id", C6204b1.this.f13331c);
            C6235c0.m15070a(b, "url", str);
            C6223c parentContainer = C6204b1.this.getParentContainer();
            if (parentContainer == null) {
                unit = null;
            } else {
                C6235c0.m15070a(b, "ad_session_id", C6204b1.this.getAdSessionId());
                C6235c0.m15077b(b, "container_id", parentContainer.mo50532c());
                new C6312h0("WebView.on_load", parentContainer.mo50551k(), b).mo50736c();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                new C6312h0("WebView.on_load", C6204b1.this.getWebViewModuleId(), b).mo50736c();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C6204b1.this.m14977a(i, str, str2);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z = true;
            if (str == null || !StringsKt.endsWith$default(str, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C6204b1.this.f13333e;
            Charset charset = C6311h.f13542a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$c */
    protected class C6207c extends C6206b {
        public C6207c() {
            super();
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            boolean z = true;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null || !StringsKt.endsWith$default(uri, "mraid.js", false, 2, (Object) null)) {
                z = false;
            }
            if (!z) {
                return null;
            }
            String a = C6204b1.this.f13333e;
            Charset charset = C6311h.f13542a;
            if (a != null) {
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(a.getBytes(charset)));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$d */
    protected class C6208d extends C6207c {
        public C6208d() {
            super();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r3 = r3.getUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedError(android.webkit.WebView r2, android.webkit.WebResourceRequest r3, android.webkit.WebResourceError r4) {
            /*
                r1 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.C6204b1.this
                int r0 = r4.getErrorCode()
                java.lang.CharSequence r4 = r4.getDescription()
                java.lang.String r4 = r4.toString()
                if (r3 != 0) goto L_0x0014
                goto L_0x001a
            L_0x0014:
                android.net.Uri r3 = r3.getUrl()
                if (r3 != 0) goto L_0x001c
            L_0x001a:
                r3 = 0
                goto L_0x0020
            L_0x001c:
                java.lang.String r3 = r3.toString()
            L_0x0020:
                r2.m14977a((int) r0, (java.lang.String) r4, (java.lang.String) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6204b1.C6208d.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }
    }

    /* renamed from: com.adcolony.sdk.b1$e */
    protected class C6209e extends C6208d {
        public C6209e(C6204b1 b1Var) {
            super();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$f */
    protected class C6210f extends C6209e {
        public C6210f() {
            super(C6204b1.this);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                C6204b1.this.mo50465a(C6235c0.m15073b(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$g */
    public static final class C6211g {
        private C6211g() {
        }

        public /* synthetic */ C6211g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6204b1 mo50514a(Context context, C6312h0 h0Var, int i, C6223c cVar) {
            C6204b1 b1Var;
            int e = C6185a.m14887b().mo50807r().mo50750e();
            C6294f1 a = h0Var.mo50732a();
            if (C6235c0.m15076b(a, "use_mraid_module")) {
                b1Var = new C6369l0(context, e, h0Var, C6185a.m14887b().mo50807r().mo50750e());
            } else if (C6235c0.m15076b(a, "enable_messages")) {
                b1Var = new C6236c1(context, e, h0Var);
            } else {
                b1Var = new C6204b1(context, e, h0Var);
            }
            b1Var.mo50463a(h0Var, i, cVar);
            b1Var.mo50494i();
            return b1Var;
        }
    }

    /* renamed from: com.adcolony.sdk.b1$h */
    public static final class C6212h implements C6327j0 {

        /* renamed from: a */
        final /* synthetic */ C6204b1 f13354a;

        /* renamed from: com.adcolony.sdk.b1$h$a */
        static final class C6213a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C6204b1 f13355a;

            /* renamed from: b */
            final /* synthetic */ C6312h0 f13356b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6213a(C6204b1 b1Var, C6312h0 h0Var) {
                super(0);
                this.f13355a = b1Var;
                this.f13356b = h0Var;
            }

            /* renamed from: a */
            public final void mo50515a() {
                this.f13355a.mo50464a(C6235c0.m15087h(this.f13356b.mo50732a(), "custom_js"));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo50515a();
                return Unit.INSTANCE;
            }
        }

        C6212h(C6204b1 b1Var) {
            this.f13354a = b1Var;
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6204b1 b1Var = this.f13354a;
            b1Var.m14981a(h0Var, (Function0<Unit>) new C6213a(b1Var, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$i */
    public static final class C6214i implements C6327j0 {

        /* renamed from: a */
        final /* synthetic */ C6204b1 f13357a;

        /* renamed from: com.adcolony.sdk.b1$i$a */
        static final class C6215a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C6204b1 f13358a;

            /* renamed from: b */
            final /* synthetic */ C6312h0 f13359b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6215a(C6204b1 b1Var, C6312h0 h0Var) {
                super(0);
                this.f13358a = b1Var;
                this.f13359b = h0Var;
            }

            /* renamed from: a */
            public final void mo50516a() {
                this.f13358a.setVisible(this.f13359b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo50516a();
                return Unit.INSTANCE;
            }
        }

        C6214i(C6204b1 b1Var) {
            this.f13357a = b1Var;
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6204b1 b1Var = this.f13357a;
            b1Var.m14981a(h0Var, (Function0<Unit>) new C6215a(b1Var, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$j */
    public static final class C6216j implements C6327j0 {

        /* renamed from: a */
        final /* synthetic */ C6204b1 f13360a;

        /* renamed from: com.adcolony.sdk.b1$j$a */
        static final class C6217a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C6204b1 f13361a;

            /* renamed from: b */
            final /* synthetic */ C6312h0 f13362b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6217a(C6204b1 b1Var, C6312h0 h0Var) {
                super(0);
                this.f13361a = b1Var;
                this.f13362b = h0Var;
            }

            /* renamed from: a */
            public final void mo50517a() {
                this.f13361a.setBounds(this.f13362b);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo50517a();
                return Unit.INSTANCE;
            }
        }

        C6216j(C6204b1 b1Var) {
            this.f13360a = b1Var;
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6204b1 b1Var = this.f13360a;
            b1Var.m14981a(h0Var, (Function0<Unit>) new C6217a(b1Var, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$k */
    public static final class C6218k implements C6327j0 {

        /* renamed from: a */
        final /* synthetic */ C6204b1 f13363a;

        /* renamed from: com.adcolony.sdk.b1$k$a */
        static final class C6219a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C6204b1 f13364a;

            /* renamed from: b */
            final /* synthetic */ C6312h0 f13365b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6219a(C6204b1 b1Var, C6312h0 h0Var) {
                super(0);
                this.f13364a = b1Var;
                this.f13365b = h0Var;
            }

            /* renamed from: a */
            public final void mo50518a() {
                this.f13364a.setTransparent(C6235c0.m15076b(this.f13365b.mo50732a(), "transparent"));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                mo50518a();
                return Unit.INSTANCE;
            }
        }

        C6218k(C6204b1 b1Var) {
            this.f13363a = b1Var;
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            C6204b1 b1Var = this.f13363a;
            b1Var.m14981a(h0Var, (Function0<Unit>) new C6219a(b1Var, h0Var));
        }
    }

    /* renamed from: com.adcolony.sdk.b1$l */
    static final class C6220l implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ Function0 f13366a;

        C6220l(Function0 function0) {
            this.f13366a = function0;
        }

        public final /* synthetic */ void run() {
            this.f13366a.invoke();
        }
    }

    /* renamed from: com.adcolony.sdk.b1$m */
    static final class C6221m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6204b1 f13367a;

        /* renamed from: com.adcolony.sdk.b1$m$a */
        public static final class C6222a extends WebViewClient {

            /* renamed from: a */
            final /* synthetic */ C6204b1 f13368a;

            C6222a(C6204b1 b1Var) {
                this.f13368a = b1Var;
            }

            public void onPageFinished(WebView webView, String str) {
                this.f13368a.destroy();
            }
        }

        C6221m(C6204b1 b1Var) {
            this.f13367a = b1Var;
        }

        public final void run() {
            this.f13367a.setWebChromeClient((WebChromeClient) null);
            this.f13367a.setWebViewClient(new C6222a(this.f13367a));
            this.f13367a.clearCache(true);
            this.f13367a.removeAllViews();
            this.f13367a.loadUrl("about:blank");
        }
    }

    protected C6204b1(Context context, int i, C6312h0 h0Var) {
        super(context);
        this.f13329a = i;
        this.f13330b = h0Var;
    }

    /* renamed from: a */
    public static final C6204b1 m14975a(Context context, C6312h0 h0Var, int i, C6223c cVar) {
        return f13328u.mo50514a(context, h0Var, i, cVar);
    }

    /* renamed from: d */
    private final void m14984d() {
        ArrayList<String> j;
        ArrayList<C6327j0> i;
        C6223c cVar = this.f13340l;
        if (!(cVar == null || (i = cVar.mo50547i()) == null)) {
            i.add(C6185a.m14881a("WebView.execute_js", (C6327j0) new C6212h(this), true));
            i.add(C6185a.m14881a("WebView.set_visible", (C6327j0) new C6214i(this), true));
            i.add(C6185a.m14881a("WebView.set_bounds", (C6327j0) new C6216j(this), true));
            i.add(C6185a.m14881a("WebView.set_transparent", (C6327j0) new C6218k(this), true));
        }
        C6223c cVar2 = this.f13340l;
        if (cVar2 != null && (j = cVar2.mo50549j()) != null) {
            j.add("WebView.execute_js");
            j.add("WebView.set_visible");
            j.add("WebView.set_bounds");
            j.add("WebView.set_transparent");
        }
    }

    /* renamed from: g */
    private final WebViewClient m14985g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return getWebViewClientApi26();
        }
        if (i >= 24) {
            return getWebViewClientApi24();
        }
        if (i >= 23) {
            return getWebViewClientApi23();
        }
        if (i >= 21) {
            return getWebViewClientApi21();
        }
        return getWebViewClientDefault();
    }

    /* access modifiers changed from: private */
    public final void setTransparent(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public /* synthetic */ void mo50467e() {
        m14984d();
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13343o, this.f13344p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        C6223c cVar = this.f13340l;
        if (cVar != null) {
            cVar.addView(this, layoutParams);
        }
    }

    /* renamed from: f */
    public final void mo50468f() {
        C6185a.m14887b().mo50787c().mo50608a(this, this.f13336h, this.f13340l);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getAdSessionId() {
        return this.f13336h;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyAdView getAdView() {
        return C6185a.m14887b().mo50787c().mo50618d().get(this.f13336h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getBaseUrl() {
        return this.f13335g;
    }

    public final int getCurrentHeight() {
        return this.f13344p;
    }

    public final int getCurrentWidth() {
        return this.f13343o;
    }

    public final int getCurrentX() {
        return this.f13341m;
    }

    public final int getCurrentY() {
        return this.f13342n;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getDestroyed() {
        return this.f13339k;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C6294f1 getInfo() {
        return this.f13338j;
    }

    public final int getInitialHeight() {
        return this.f13348t;
    }

    public final int getInitialWidth() {
        return this.f13347s;
    }

    public final int getInitialX() {
        return this.f13345q;
    }

    public final int getInitialY() {
        return this.f13346r;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ AdColonyInterstitial getInterstitial() {
        return C6185a.m14887b().mo50787c().mo50621f().get(this.f13336h);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMUrl() {
        return this.f13334f;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C6312h0 getMessage() {
        return this.f13330b;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ String getMraidFilepath() {
        return this.f13337i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C6223c getParentContainer() {
        return this.f13340l;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C6207c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C6208d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C6209e(this);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C6210f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C6206b();
    }

    public final int getWebViewModuleId() {
        return this.f13329a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ String mo50493h() {
        AdColonyInterstitial interstitial = getInterstitial();
        if (interstitial != null) {
            String str = interstitial.mo50335a() + " : " + interstitial.getZoneID();
            return str == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo50494i() {
        boolean z = true;
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        setWebChromeClient(new C6205a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        setWebViewClient(m14985g());
        mo50495j();
        if (!(this instanceof C6319j)) {
            mo50467e();
        }
        if (this.f13332d.length() <= 0) {
            z = false;
        }
        if (z) {
            mo50464a(this.f13332d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public /* synthetic */ void mo50495j() {
        if (!StringsKt.startsWith$default(this.f13334f, "http", false, 2, (Object) null) && !StringsKt.startsWith$default(this.f13334f, "file", false, 2, (Object) null)) {
            loadDataWithBaseURL(this.f13335g, this.f13334f, "text/html", (String) null, (String) null);
        } else if (StringsKt.contains$default((CharSequence) this.f13334f, (CharSequence) ".html", false, 2, (Object) null) || !StringsKt.startsWith$default(this.f13334f, "file", false, 2, (Object) null)) {
            loadUrl(this.f13334f);
        } else {
            String str = this.f13334f;
            loadDataWithBaseURL(str, "<html><script src=\"" + this.f13334f + "\"></script></html>", "text/html", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public /* synthetic */ void mo50496k() {
        if (this.f13337i.length() > 0) {
            try {
                this.f13333e = C6185a.m14887b().mo50805p().mo51060a(this.f13337i, false).toString();
                Regex regex = new Regex("bridge.os_name\\s*=\\s*\"\"\\s*;");
                this.f13333e = regex.replaceFirst(this.f13333e, "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f13338j + ";\n");
            } catch (IOException e) {
                m14982a((Exception) e);
            } catch (IllegalArgumentException e2) {
                m14982a((Exception) e2);
            } catch (IndexOutOfBoundsException e3) {
                m14982a((Exception) e3);
            }
        }
    }

    /* renamed from: l */
    public final void mo50497l() {
        if (!this.f13339k) {
            this.f13339k = true;
            C6509z0.m15953b((Runnable) new C6221m(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AdColonyAdView adView = getAdView();
            if (adView != null && !adView.mo50239c()) {
                C6294f1 b = C6235c0.m15073b();
                C6235c0.m15070a(b, "ad_session_id", getAdSessionId());
                new C6312h0("WebView.on_first_click", 1, b).mo50736c();
                adView.setUserInteraction(true);
            }
            AdColonyInterstitial interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.mo50346b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setAdSessionId(String str) {
        this.f13336h = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setBaseUrl(String str) {
        this.f13335g = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setBounds(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13341m = C6235c0.m15083d(a, "x");
        this.f13342n = C6235c0.m15083d(a, "y");
        this.f13343o = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13344p = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
            layoutParams2.width = getCurrentWidth();
            layoutParams2.height = getCurrentHeight();
            Unit unit = Unit.INSTANCE;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setInfo(C6294f1 f1Var) {
        this.f13338j = f1Var;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMUrl(String str) {
        this.f13334f = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f13337i = str;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void setVisible(C6312h0 h0Var) {
        setVisibility(C6235c0.m15076b(h0Var.mo50732a(), "visible") ? 0 : 4);
    }

    /* renamed from: b */
    public final void mo50466b(C6312h0 h0Var, int i, C6223c cVar) {
        mo50463a(h0Var, i, cVar);
        mo50467e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo50463a(C6312h0 h0Var, int i, C6223c cVar) {
        this.f13331c = i;
        this.f13340l = cVar;
        C6294f1 a = h0Var.mo50732a();
        String i2 = C6235c0.m15088i(a, "url");
        if (i2 == null) {
            i2 = C6235c0.m15087h(a, C8849c.DATA);
        }
        this.f13334f = i2;
        this.f13335g = C6235c0.m15087h(a, "base_url");
        this.f13332d = C6235c0.m15087h(a, "custom_js");
        this.f13336h = C6235c0.m15087h(a, "ad_session_id");
        this.f13338j = C6235c0.m15085f(a, "info");
        this.f13337i = C6235c0.m15087h(a, "mraid_filepath");
        this.f13343o = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13344p = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        this.f13341m = C6235c0.m15083d(a, "x");
        int d = C6235c0.m15083d(a, "y");
        this.f13342n = d;
        this.f13347s = this.f13343o;
        this.f13348t = this.f13344p;
        this.f13345q = this.f13341m;
        this.f13346r = d;
        mo50496k();
        mo50468f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo50464a(String str) {
        if (this.f13339k) {
            new C6288e0.C6289a().mo50644a("Ignoring call to execute_js as WebView has been destroyed.").mo50645a(C6288e0.f13492c);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C6288e0.C6289a().mo50644a("Device reporting incorrect OS version, evaluateJavascript ").mo50644a("is not available. Disabling AdColony.").mo50645a(C6288e0.f13497h);
                AdColony.disable();
            }
        } else {
            loadUrl(Intrinsics.stringPlus("javascript:", str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ boolean mo50465a(C6294f1 f1Var, String str) {
        Context a = C6185a.m14880a();
        C6201b bVar = a instanceof C6201b ? (C6201b) a : null;
        if (bVar == null) {
            return false;
        }
        C6185a.m14887b().mo50787c().mo50607a((Context) bVar, f1Var, str);
        return true;
    }

    /* renamed from: a */
    private final void m14982a(Exception exc) {
        new C6288e0.C6289a().mo50644a(exc.getClass().toString()).mo50644a(" during metadata injection w/ metadata = ").mo50644a(C6235c0.m15087h(this.f13338j, "metadata")).mo50645a(C6288e0.f13498i);
        C6223c cVar = this.f13340l;
        if (cVar != null) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15070a(b, "id", getAdSessionId());
            new C6312h0("AdSession.on_error", cVar.mo50551k(), b).mo50736c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14977a(int i, String str, String str2) {
        C6223c cVar = this.f13340l;
        if (cVar != null) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15077b(b, "id", this.f13331c);
            C6235c0.m15070a(b, "ad_session_id", getAdSessionId());
            C6235c0.m15077b(b, "container_id", cVar.mo50532c());
            C6235c0.m15077b(b, "code", i);
            C6235c0.m15070a(b, "error", str);
            C6235c0.m15070a(b, "url", str2);
            new C6312h0("WebView.on_error", cVar.mo50551k(), b).mo50736c();
        }
        C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        a.mo50644a(str).mo50645a(C6288e0.f13498i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14981a(C6312h0 h0Var, Function0<Unit> function0) {
        C6294f1 a = h0Var.mo50732a();
        if (C6235c0.m15083d(a, "id") == this.f13331c) {
            int d = C6235c0.m15083d(a, "container_id");
            C6223c cVar = this.f13340l;
            if (cVar != null && d == cVar.mo50532c()) {
                String h = C6235c0.m15087h(a, "ad_session_id");
                C6223c cVar2 = this.f13340l;
                if (Intrinsics.areEqual((Object) h, (Object) cVar2 == null ? null : cVar2.mo50523a())) {
                    C6509z0.m15953b((Runnable) new C6220l(function0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50462a(C6312h0 h0Var) {
        setBounds(h0Var);
    }
}
