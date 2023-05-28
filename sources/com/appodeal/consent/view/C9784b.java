package com.appodeal.consent.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appodeal.consent.Consent;
import com.appodeal.consent.Vendor;
import com.appodeal.consent.internal.C9757d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.view.b */
public final class C9784b extends WebView {

    /* renamed from: a */
    public final C9788c f24819a;

    /* renamed from: b */
    public final String f24820b;

    /* renamed from: c */
    public final Consent f24821c;

    /* renamed from: d */
    public final Map<String, Vendor> f24822d;

    /* renamed from: e */
    public final CoroutineScope f24823e = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: f */
    public AtomicBoolean f24824f = new AtomicBoolean(false);

    /* renamed from: g */
    public AtomicBoolean f24825g = new AtomicBoolean(false);

    /* renamed from: h */
    public final C9783a f24826h;

    /* renamed from: com.appodeal.consent.view.b$a */
    public final class C9785a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C9784b f24827a;

        public C9785a(C9784b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            this.f24827a = bVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(str, "url");
            super.onPageFinished(webView, str);
            boolean z = false;
            if (!(str == null || str.length() == 0) && StringsKt.startsWith$default(str, this.f24827a.f24820b, false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                C9784b bVar = this.f24827a;
                C9784b.m28620a(bVar, bVar.getConsentJs());
                if (!this.f24827a.f24824f.getAndSet(true)) {
                    this.f24827a.f24819a.mo61330a();
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C9788c cVar = this.f24827a.f24819a;
            cVar.mo61331a("WebResourceError: " + str2 + " [" + i + "] " + str);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(webResourceRequest, "request");
            Intrinsics.checkNotNullParameter(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f24827a.f24819a.mo61331a(webResourceError.toString());
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(str, "url");
            if (!(str == null || str.length() == 0) && StringsKt.startsWith$default(str, this.f24827a.f24820b, false, 2, (Object) null)) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f24827a.getContext().startActivity(intent);
            } catch (Throwable unused) {
                this.f24827a.f24819a.mo61331a("No Activity found to handle browser intent.");
            }
            return true;
        }
    }

    /* renamed from: com.appodeal.consent.view.b$b */
    public final class C9786b {

        /* renamed from: a */
        public final /* synthetic */ C9784b f24828a;

        @DebugMetadata(mo38568c = "com.appodeal.consent.view.ConsentWebView$ConsentJSInterface$closeWebView$1", mo38569f = "ConsentWebView.kt", mo38570l = {}, mo38571m = "invokeSuspend")
        /* renamed from: com.appodeal.consent.view.b$b$a */
        public static final class C9787a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public final /* synthetic */ C9784b f24829a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9787a(C9784b bVar, Continuation<? super C9787a> continuation) {
                super(2, continuation);
                this.f24829a = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C9787a(this.f24829a, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C9787a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f24829a.loadUrl("about:blank");
                return Unit.INSTANCE;
            }
        }

        public C9786b(C9784b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            this.f24828a = bVar;
        }

        @JavascriptInterface
        public final void closeWebView() {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24828a.f24823e, (CoroutineContext) null, (CoroutineStart) null, new C9787a(this.f24828a, (Continuation<? super C9787a>) null), 3, (Object) null);
        }

        @JavascriptInterface
        public final void send(String str) {
            Intrinsics.checkNotNullParameter(str, "consentString");
            if (!this.f24828a.f24825g.getAndSet(true)) {
                this.f24828a.f24819a.mo61332a(C9790d.m28636b(str));
            }
        }
    }

    /* renamed from: com.appodeal.consent.view.b$c */
    public interface C9788c {
        /* renamed from: a */
        void mo61330a();

        /* renamed from: a */
        void mo61331a(String str);

        /* renamed from: a */
        void mo61332a(JSONObject jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9784b(Context context, C9757d dVar, String str, Consent consent, Map map) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Intrinsics.checkNotNullParameter(str, "consentDialogUrl");
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(map, "customVendors");
        this.f24819a = dVar;
        this.f24820b = str;
        this.f24821c = consent;
        this.f24822d = map;
        addJavascriptInterface(new C9786b(this), "ConsentManager");
        setWebViewClient(new C9785a(this));
        getSettings().setJavaScriptEnabled(true);
        this.f24826h = C9790d.m28631a(this, new C9789c(this));
    }

    /* renamed from: a */
    public static final void m28620a(C9784b bVar, String str) {
        bVar.getClass();
        bVar.loadUrl(Intrinsics.stringPlus("javascript: ", str));
    }

    /* access modifiers changed from: private */
    public final String getCloseJs() {
        return "closeConsentDialog()";
    }

    /* access modifiers changed from: private */
    public final String getConsentJs() {
        String jSONObject = this.f24821c.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "consent.toJson().toString()");
        String replace = new Regex("\"").replace(jSONObject, "\\\\\"");
        Map<String, Vendor> map = this.f24822d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Vendor> value : map.entrySet()) {
            arrayList.add(((Vendor) value.getValue()).toJson$apd_consent());
        }
        String str = "showConsentDialog(" + "\"" + replace + "\"," + "\"" + C9790d.m28635b(this) + "\"," + "\"" + C9790d.m28632a(this) + "\"," + new JSONArray(arrayList) + ")";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* renamed from: a */
    public final void mo61350a() {
        this.f24824f.set(false);
        this.f24825g.set(false);
        clearCache(true);
    }

    public final C9783a getCloseButton() {
        return this.f24826h;
    }
}
