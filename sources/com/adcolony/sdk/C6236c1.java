package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C6204b1;
import com.adcolony.sdk.C6288e0;
import com.iab.omid.library.adcolony.ScriptInjector;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.adcolony.sdk.c1 */
public class C6236c1 extends C6204b1 implements C6360k0 {

    /* renamed from: A */
    private C6245i f13409A;

    /* renamed from: B */
    private boolean f13410B = true;

    /* renamed from: C */
    private C6294f1 f13411C = C6235c0.m15073b();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f13412D;

    /* renamed from: E */
    private boolean f13413E;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f13414v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f13415w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Object f13416x = new Object();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C6290e1 f13417y = C6235c0.m15059a();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public String f13418z = "";

    /* renamed from: com.adcolony.sdk.c1$a */
    private class C6237a {
        public C6237a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C6236c1.this.f13418z)) {
                C6236c1.this.m15102c(str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C6236c1.this.f13418z)) {
                C6236c1.this.f13414v = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            if (!Intrinsics.areEqual((Object) str, (Object) C6236c1.this.f13418z)) {
                return "[]";
            }
            String str2 = "[]";
            Object d = C6236c1.this.f13416x;
            C6236c1 c1Var = C6236c1.this;
            synchronized (d) {
                if (c1Var.f13417y.mo50650b() > 0) {
                    if (c1Var.getEnableMessages()) {
                        str2 = c1Var.f13417y.toString();
                    }
                    c1Var.f13417y = C6235c0.m15059a();
                }
                Unit unit = Unit.INSTANCE;
            }
            return str2;
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (Intrinsics.areEqual((Object) str2, (Object) C6236c1.this.f13418z)) {
                C6236c1.this.m15102c(str);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$b */
    private final class C6238b extends C6237a {
        public C6238b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (Intrinsics.areEqual((Object) str, (Object) C6236c1.this.f13418z)) {
                C6236c1.this.f13415w = true;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$c */
    protected class C6239c extends C6204b1.C6206b {
        public C6239c() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6248l().mo50599a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C6248l().mo50601b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C6248l().mo50600a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$d */
    protected class C6240d extends C6204b1.C6207c {
        public C6240d() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6248l().mo50599a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C6248l().mo50601b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C6248l().mo50600a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$e */
    protected class C6241e extends C6204b1.C6208d {
        public C6241e() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6246j().mo50597a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C6248l().mo50601b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new C6248l().mo50600a(str);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$f */
    protected class C6242f extends C6204b1.C6209e {
        public C6242f() {
            super(C6236c1.this);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6246j().mo50597a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C6248l().mo50601b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C6247k().mo50598a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$g */
    protected class C6243g extends C6204b1.C6210f {
        public C6243g() {
            super();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new C6246j().mo50597a(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new C6248l().mo50601b();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new C6247k().mo50598a(webResourceRequest);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$h */
    public static final class C6244h {
        private C6244h() {
        }

        public /* synthetic */ C6244h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.c1$i */
    private static final class C6245i {

        /* renamed from: a */
        private final WebMessagePort[] f13426a;

        public C6245i(WebMessagePort[] webMessagePortArr) {
            this.f13426a = webMessagePortArr;
        }

        /* renamed from: a */
        public final WebMessagePort mo50595a() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f13426a, 1);
        }

        /* renamed from: b */
        public final WebMessagePort mo50596b() {
            return (WebMessagePort) ArraysKt.getOrNull((T[]) this.f13426a, 0);
        }
    }

    /* renamed from: com.adcolony.sdk.c1$j */
    private final class C6246j {
        public C6246j() {
        }

        /* renamed from: a */
        public final void mo50597a(String str) {
            new C6248l().mo50599a();
            if (str != null) {
                C6236c1.this.m15105d(str);
            } else {
                new C6288e0.C6289a().mo50644a("ADCWebViewModule: initializeEventMessaging failed due to url = null").mo50645a(C6288e0.f13496g);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$k */
    private final class C6247k {
        public C6247k() {
        }

        /* renamed from: a */
        public final boolean mo50598a(WebResourceRequest webResourceRequest) {
            int i = 0;
            if (C6236c1.this.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    String a = C6236c1.this.getClickOverride();
                    Uri parse = a == null ? null : Uri.parse(a);
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        C6509z0.m15934a(new Intent("android.intent.action.VIEW", parse));
                        C6294f1 b = C6235c0.m15073b();
                        C6236c1 c1Var = C6236c1.this;
                        C6235c0.m15070a(b, "url", parse.toString());
                        C6235c0.m15070a(b, "ad_session_id", c1Var.getAdSessionId());
                        C6223c parentContainer = C6236c1.this.getParentContainer();
                        if (parentContainer != null) {
                            i = parentContainer.mo50551k();
                        }
                        new C6312h0("WebView.redirect_detected", i, b).mo50736c();
                        C6476x0 A = C6185a.m14887b().mo50761A();
                        C6236c1 c1Var2 = C6236c1.this;
                        A.mo51080a(c1Var2.getAdSessionId());
                        A.mo51082c(c1Var2.getAdSessionId());
                    } else {
                        new C6288e0.C6289a().mo50644a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C6236c1.this.mo50493h())).mo50645a(C6288e0.f13498i);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.adcolony.sdk.c1$m */
    public static final class C6249m extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ C6236c1 f13430a;

        C6249m(C6236c1 c1Var) {
            this.f13430a = c1Var;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data;
            if (webMessage != null && (data = webMessage.getData()) != null) {
                C6236c1 c1Var = this.f13430a;
                List<String> split = new Regex(":").split(data, 2);
                if (split.size() == 2 && Intrinsics.areEqual((Object) split.get(0), (Object) c1Var.f13418z)) {
                    c1Var.m15098b(split.get(1));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c1$n */
    static final class C6250n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6236c1 f13431a;

        C6250n(C6236c1 c1Var) {
            this.f13431a = c1Var;
        }

        public final void run() {
            this.f13431a.removeJavascriptInterface("NativeLayer");
        }
    }

    /* renamed from: com.adcolony.sdk.c1$o */
    static final class C6251o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6236c1 f13432a;

        /* renamed from: b */
        final /* synthetic */ String f13433b;

        C6251o(C6236c1 c1Var, String str) {
            this.f13432a = c1Var;
            this.f13433b = str;
        }

        public final void run() {
            if (this.f13432a.getEnableMessages()) {
                C6236c1 c1Var = this.f13432a;
                c1Var.mo50464a("NativeLayer.dispatch_messages(ADC3_update(" + this.f13433b + "), '" + this.f13432a.f13418z + "');");
            }
        }
    }

    static {
        new C6244h((DefaultConstructorMarker) null);
    }

    public C6236c1(Context context, int i, C6312h0 h0Var) {
        super(context, i, h0Var);
    }

    /* renamed from: e */
    private final void m15106e(C6294f1 f1Var) {
        WebMessagePort webMessagePort;
        if (this.f13410B) {
            C6245i iVar = this.f13409A;
            if (iVar == null || (webMessagePort = iVar.mo50596b()) == null) {
                webMessagePort = null;
            } else {
                C6290e1 a = C6235c0.m15059a();
                a.mo50646a(f1Var);
                webMessagePort.postMessage(new WebMessage(a.toString()));
            }
            if (webMessagePort == null) {
                new C6288e0.C6289a().mo50644a("Sending message before event messaging is initialized").mo50645a(C6288e0.f13496g);
            }
        }
    }

    /* access modifiers changed from: private */
    public final String getClickOverride() {
        AdColonyInterstitial interstitial = getInterstitial();
        String c = interstitial == null ? null : interstitial.mo50347c();
        if (c != null) {
            return c;
        }
        AdColonyAdView adView = getAdView();
        if (adView == null) {
            return null;
        }
        return adView.getClickOverride();
    }

    /* renamed from: m */
    private final C6237a m15107m() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C6238b();
        }
        return new C6237a();
    }

    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getEnableMessages() {
        return this.f13410B;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C6294f1 getIab() {
        return this.f13411C;
    }

    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ boolean getModuleInitialized() {
        return this.f13412D;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C6240d();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C6241e();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C6242f();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C6243g();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C6239c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public /* synthetic */ void mo50494i() {
        addJavascriptInterface(m15107m(), "NativeLayer");
        C6185a.m14887b().mo50807r().mo50741a((C6360k0) this);
        super.mo50494i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final /* synthetic */ boolean mo50577n() {
        return this.f13413E;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setEnableMessages(boolean z) {
        this.f13410B = z;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void setIab(C6294f1 f1Var) {
        this.f13411C = f1Var;
    }

    /* renamed from: o */
    private final void m15108o() {
        String str = "";
        synchronized (this.f13416x) {
            if (this.f13417y.mo50650b() > 0) {
                if (getEnableMessages()) {
                    str = this.f13417y.toString();
                }
                this.f13417y = C6235c0.m15059a();
            }
            Unit unit = Unit.INSTANCE;
        }
        C6509z0.m15953b((Runnable) new C6251o(this, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* synthetic */ String mo50570d(C6294f1 f1Var) {
        return Intrinsics.stringPlus("file:///", mo50568c(f1Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m15105d(String str) {
        if (this.f13409A == null) {
            C6245i iVar = new C6245i(createWebMessageChannel());
            WebMessagePort b = iVar.mo50596b();
            if (b != null) {
                b.setWebMessageCallback(new C6249m(this));
            }
            postWebMessage(new WebMessage("", new WebMessagePort[]{iVar.mo50595a()}), Uri.parse(str));
            Unit unit = Unit.INSTANCE;
            this.f13409A = iVar;
        }
    }

    /* renamed from: b */
    public void mo50566b() {
        if (C6185a.m14889c() && this.f13412D && !this.f13414v && !this.f13415w) {
            m15108o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* synthetic */ String mo50568c(C6294f1 f1Var) {
        return C6235c0.m15087h(f1Var, "filepath");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo50463a(C6312h0 h0Var, int i, C6223c cVar) {
        C6294f1 a = h0Var.mo50732a();
        this.f13410B = C6235c0.m15076b(a, "enable_messages");
        if (this.f13411C.mo50689b()) {
            this.f13411C = C6235c0.m15085f(a, "iab");
        }
        super.mo50463a(h0Var, i, cVar);
    }

    /* renamed from: c */
    public void mo50569c() {
        if (!getDestroyed()) {
            mo50497l();
            C6509z0.m15953b((Runnable) new C6250n(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15098b(String str) {
        m15097b(C6235c0.m15074b(str));
    }

    /* renamed from: com.adcolony.sdk.c1$l */
    private final class C6248l {
        public C6248l() {
        }

        /* renamed from: a */
        public final void mo50599a() {
            if (C6236c1.this.getEnableMessages() && !C6236c1.this.getModuleInitialized()) {
                C6236c1.this.f13418z = C6509z0.m15929a();
                C6294f1 a = C6235c0.m15064a(C6235c0.m15073b(), C6236c1.this.getInfo());
                C6235c0.m15070a(a, "message_key", C6236c1.this.f13418z);
                C6236c1 c1Var = C6236c1.this;
                c1Var.mo50464a("ADC3_init(" + C6236c1.this.getAdcModuleId() + ',' + a + ");");
                C6236c1.this.f13412D = true;
            }
        }

        /* renamed from: b */
        public final void mo50601b() {
            C6236c1.this.f13412D = false;
        }

        /* renamed from: a */
        public final boolean mo50600a(String str) {
            int i = 0;
            if (!C6236c1.this.getModuleInitialized()) {
                return false;
            }
            String a = C6236c1.this.getClickOverride();
            if (a != null) {
                str = a;
            }
            if (str != null) {
                C6509z0.m15934a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                C6294f1 b = C6235c0.m15073b();
                C6236c1 c1Var = C6236c1.this;
                C6235c0.m15070a(b, "url", str);
                C6235c0.m15070a(b, "ad_session_id", c1Var.getAdSessionId());
                C6223c parentContainer = C6236c1.this.getParentContainer();
                if (parentContainer != null) {
                    i = parentContainer.mo50551k();
                }
                new C6312h0("WebView.redirect_detected", i, b).mo50736c();
                C6476x0 A = C6185a.m14887b().mo50761A();
                C6236c1 c1Var2 = C6236c1.this;
                A.mo51080a(c1Var2.getAdSessionId());
                A.mo51082c(c1Var2.getAdSessionId());
                return true;
            }
            new C6288e0.C6289a().mo50644a(Intrinsics.stringPlus("shouldOverrideUrlLoading called with null request url, with ad id: ", C6236c1.this.mo50493h())).mo50645a(C6288e0.f13498i);
            return true;
        }
    }

    /* renamed from: b */
    private final void m15097b(C6294f1 f1Var) {
        C6185a.m14887b().mo50807r().mo50748c(f1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m15102c(String str) {
        for (C6294f1 b : C6235c0.m15061a(str).mo50654c()) {
            m15097b(b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* synthetic */ void mo50567b(Exception exc) {
        new C6288e0.C6289a().mo50644a(exc.getClass().toString()).mo50644a(" during metadata injection w/ metadata = ").mo50644a(C6235c0.m15087h(getInfo(), "metadata")).mo50645a(C6288e0.f13498i);
    }

    /* renamed from: a */
    public void mo50564a(C6294f1 f1Var) {
        synchronized (this.f13416x) {
            if (this.f13415w) {
                m15106e(f1Var);
                Unit unit = Unit.INSTANCE;
            } else {
                this.f13417y.mo50646a(f1Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo50565a() {
        return !this.f13414v && !this.f13415w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ String mo50563a(String str, String str2) {
        C6401p0 p0Var;
        if (!this.f13411C.mo50689b()) {
            AdColonyInterstitial interstitial = getInterstitial();
            C6401p0 p0Var2 = null;
            if (interstitial != null && !Intrinsics.areEqual((Object) C6235c0.m15087h(getIab(), "ad_type"), (Object) "video")) {
                interstitial.mo50340a(getIab());
                p0Var = interstitial.mo50353e();
            } else {
                p0Var = null;
            }
            if (p0Var == null) {
                AdColonyAdViewListener adColonyAdViewListener = C6185a.m14887b().mo50787c().mo50619e().get(getAdSessionId());
                if (adColonyAdViewListener != null) {
                    adColonyAdViewListener.mo50277a(new C6401p0(getIab(), getAdSessionId()));
                    p0Var2 = adColonyAdViewListener.f13180c;
                }
            } else {
                p0Var2 = p0Var;
            }
            if (p0Var2 != null && p0Var2.mo50904d() == 2) {
                boolean z = true;
                this.f13413E = true;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        return ScriptInjector.injectScriptContentIntoHtml(C6185a.m14887b().mo50805p().mo51060a(str2, false).toString(), str);
                    } catch (IOException e) {
                        mo50567b((Exception) e);
                    }
                }
            }
        }
        return str;
    }
}
