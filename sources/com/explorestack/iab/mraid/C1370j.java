package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.explorestack.iab.bridge.JsBridgeHandler;
import com.explorestack.iab.mraid.C1364i;
import com.explorestack.iab.utils.Logger;
import com.explorestack.iab.utils.Utils;
import java.util.Map;

/* renamed from: com.explorestack.iab.mraid.j */
public class C1370j {

    /* renamed from: g */
    public static final String f4210g;

    /* renamed from: h */
    public static final /* synthetic */ boolean f4211h;

    /* renamed from: a */
    public final C1372b f4212a;

    /* renamed from: b */
    public final C1364i f4213b;

    /* renamed from: c */
    public boolean f4214c;

    /* renamed from: d */
    public boolean f4215d;

    /* renamed from: e */
    public boolean f4216e = false;

    /* renamed from: f */
    public C1357c f4217f;

    /* renamed from: com.explorestack.iab.mraid.j$a */
    public class C1371a implements C1364i.C1369e {
        public C1371a() {
        }

        /* renamed from: a */
        public void mo3929a(boolean z) {
            if (C1370j.this.f4214c) {
                C1370j.this.mo3940a(z);
            }
            C1370j.this.f4212a.mo3864a(z);
        }
    }

    /* renamed from: com.explorestack.iab.mraid.j$b */
    public interface C1372b {
        /* renamed from: a */
        void mo3875a();

        /* renamed from: a */
        void mo3876a(int i);

        /* renamed from: a */
        void mo3877a(C1357c cVar);

        /* renamed from: a */
        void mo3878a(C1359e eVar);

        /* renamed from: a */
        void mo3879a(String str);

        /* renamed from: a */
        void mo3864a(boolean z);

        /* renamed from: b */
        void mo3880b();

        /* renamed from: b */
        void mo3881b(String str);

        /* renamed from: b */
        void mo3865b(boolean z);

        /* renamed from: c */
        void mo3882c(String str);

        /* renamed from: d */
        void mo3866d(String str);
    }

    /* renamed from: com.explorestack.iab.mraid.j$c */
    public class C1373c extends WebViewClient {
        private C1373c() {
        }

        public /* synthetic */ C1373c(C1370j jVar, C1371a aVar) {
            this();
        }

        /* renamed from: a */
        public final void mo3952a(String str, String str2, int i) {
            MraidLog.m5985d(C1370j.f4210g, String.format("onError: %s / %s / %d", new Object[]{str, str2, Integer.valueOf(i)}));
            if (str2 != null && str2.contains("ERR_INTERNET_DISCONNECTED")) {
                boolean unused = C1370j.this.f4216e = true;
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MraidLog.m5985d(C1370j.f4210g, "onPageFinished");
            if (!C1370j.this.f4214c) {
                boolean unused = C1370j.this.f4214c = true;
                C1370j.this.mo3943c().mo3912f();
                C1370j.this.f4212a.mo3866d(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            MraidLog.m5985d(C1370j.f4210g, "onPageStarted");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            mo3952a(str2, str, i);
            super.onReceivedError(webView, i, str, str2);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url = webResourceRequest.getUrl();
            mo3952a(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            MraidLog.m5985d(C1370j.f4210g, "onRenderProcessGone");
            C1370j.this.f4212a.mo3876a(1);
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("mraid://")) {
                C1370j.this.mo3937a(str);
                return true;
            } else if (JsBridgeHandler.m5943b(str)) {
                JsBridgeHandler.m5942a(C1370j.this.f4213b, str);
                return true;
            } else {
                C1370j.this.mo3947e(str);
                return true;
            }
        }
    }

    static {
        Class<C1370j> cls = C1370j.class;
        f4211h = !cls.desiredAssertionStatus();
        f4210g = cls.getSimpleName();
    }

    public C1370j(Context context, C1372b bVar) {
        this.f4212a = bVar;
        this.f4215d = false;
        C1364i iVar = new C1364i(context);
        this.f4213b = iVar;
        iVar.setWebViewClient(new C1373c(this, (C1371a) null));
        iVar.setListener(new C1371a());
    }

    /* renamed from: a */
    public void mo3930a() {
        C1364i c = mo3943c();
        Utils.removeFromParent(c);
        c.destroy();
    }

    /* renamed from: a */
    public void mo3931a(int i, int i2) {
        mo3942b(String.format("(function click(x, y) {var ev = new MouseEvent('click', {    'view': window,    'bubbles': true,    'cancelable': true,    'screenX': x,    'screenY': y});var el = document.elementFromPoint(x, y);if (el !== null) {      el.dispatchEvent(ev); }})(%s, %s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    public void mo3932a(C1356b bVar) {
        mo3942b("mraid.setSupports(mraid.SUPPORTED_FEATURES.CALENDAR, " + bVar.mo3883a() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.INLINEVIDEO, " + bVar.mo3884b() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.SMS, " + bVar.mo3885c() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.STOREPICTURE, " + bVar.mo3886d() + ");mraid.setSupports(mraid.SUPPORTED_FEATURES.TEL, " + bVar.mo3887e() + ");");
    }

    /* renamed from: a */
    public void mo3933a(C1358d dVar) {
        mo3942b("mraid.setPlacementType('" + dVar.mo3891a() + "');");
    }

    /* renamed from: a */
    public void mo3934a(C1360f fVar) {
        Rect e = fVar.mo3903e();
        Rect d = fVar.mo3902d();
        mo3942b("mraid.setScreenSize(" + e.width() + "," + e.height() + ");mraid.setMaxSize(" + d.width() + "," + d.height() + ");mraid.setCurrentPosition(" + Utils.stringifyRect(fVar.mo3893a()) + ");mraid.setDefaultPosition(" + Utils.stringifyRect(fVar.mo3900c()) + ");mraid.fireSizeChangeEvent(" + Utils.stringifySize(fVar.mo3893a()) + ");");
    }

    /* renamed from: a */
    public void mo3935a(C1363h hVar) {
        mo3942b("mraid.fireStateChangeEvent('" + hVar.mo3904a() + "');");
    }

    /* renamed from: a */
    public void mo3936a(Logger.LogLevel logLevel) {
        String str;
        if (logLevel == Logger.LogLevel.debug) {
            str = "mraid.logLevel = mraid.LogLevelEnum.DEBUG;";
        } else if (logLevel == Logger.LogLevel.info) {
            str = "mraid.logLevel = mraid.LogLevelEnum.INFO;";
        } else if (logLevel == Logger.LogLevel.warning) {
            str = "mraid.logLevel = mraid.LogLevelEnum.WARNING;";
        } else if (logLevel == Logger.LogLevel.error) {
            str = "mraid.logLevel = mraid.LogLevelEnum.ERROR;";
        } else if (logLevel == Logger.LogLevel.none) {
            str = "mraid.logLevel = mraid.LogLevelEnum.NONE;";
        } else {
            return;
        }
        mo3942b(str);
    }

    /* renamed from: a */
    public final void mo3937a(String str) {
        String str2 = f4210g;
        MraidLog.m5985d(str2, "handleJsCommand " + str);
        try {
            Map<String, String> c = C1361g.m6123c(str);
            if (c != null) {
                String str3 = c.get("command");
                if (str3 == null) {
                    MraidLog.m5984b(str2, "handleJsCommand: not found");
                    return;
                }
                mo3939a(str3, c);
                mo3950g();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo3938a(String str, String str2, String str3, String str4) {
        this.f4214c = false;
        mo3943c().loadDataWithBaseURL(str, str2, str3, str4, (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3939a(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 0
            java.lang.String r2 = "useCustomClose"
            switch(r0) {
                case -1886160473: goto L_0x0068;
                case -1289167206: goto L_0x005d;
                case -1097519099: goto L_0x0052;
                case -1041060124: goto L_0x0047;
                case -934437708: goto L_0x003c;
                case 3417674: goto L_0x0031;
                case 94756344: goto L_0x0026;
                case 133423073: goto L_0x001b;
                case 1614272768: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0073
        L_0x000f:
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0017
            goto L_0x0073
        L_0x0017:
            r4 = 8
            goto L_0x0074
        L_0x001b:
            java.lang.String r0 = "setOrientationProperties"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0024
            goto L_0x0073
        L_0x0024:
            r4 = 7
            goto L_0x0074
        L_0x0026:
            java.lang.String r0 = "close"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002f
            goto L_0x0073
        L_0x002f:
            r4 = 6
            goto L_0x0074
        L_0x0031:
            java.lang.String r0 = "open"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003a
            goto L_0x0073
        L_0x003a:
            r4 = 5
            goto L_0x0074
        L_0x003c:
            java.lang.String r0 = "resize"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0045
            goto L_0x0073
        L_0x0045:
            r4 = 4
            goto L_0x0074
        L_0x0047:
            java.lang.String r0 = "noFill"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0050
            goto L_0x0073
        L_0x0050:
            r4 = 3
            goto L_0x0074
        L_0x0052:
            java.lang.String r0 = "loaded"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005b
            goto L_0x0073
        L_0x005b:
            r4 = 2
            goto L_0x0074
        L_0x005d:
            java.lang.String r0 = "expand"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            r4 = 1
            goto L_0x0074
        L_0x0068:
            java.lang.String r0 = "playVideo"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r4 = 0
            goto L_0x0074
        L_0x0073:
            r4 = -1
        L_0x0074:
            java.lang.String r0 = "url"
            switch(r4) {
                case 0: goto L_0x015d;
                case 1: goto L_0x0151;
                case 2: goto L_0x014b;
                case 3: goto L_0x0145;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00b8;
                case 7: goto L_0x0092;
                case 8: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0168
        L_0x007b:
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            boolean r5 = r3.f4215d
            if (r5 == r4) goto L_0x0168
            r3.f4215d = r4
            com.explorestack.iab.mraid.j$b r5 = r3.f4212a
            r5.mo3865b((boolean) r4)
            goto L_0x0168
        L_0x0092:
            java.lang.String r4 = "allowOrientationChange"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r0 = "forceOrientation"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.explorestack.iab.mraid.C1357c.m6092a((java.lang.String) r5)
            com.explorestack.iab.mraid.c r0 = new com.explorestack.iab.mraid.c
            r0.<init>(r4, r5)
            r3.f4217f = r0
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            r4.mo3877a((com.explorestack.iab.mraid.C1357c) r0)
            goto L_0x0168
        L_0x00b8:
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            r4.mo3880b()
            goto L_0x0168
        L_0x00bf:
            java.lang.Object r4 = r5.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00d4
            java.lang.String r4 = f4210g
            java.lang.String r5 = "url is null or empty"
            com.explorestack.iab.mraid.MraidLog.m5982a((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0168
        L_0x00d4:
            boolean r5 = f4211h
            if (r5 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x00e1:
            r3.mo3947e(r4)
            goto L_0x0168
        L_0x00e6:
            com.explorestack.iab.mraid.e r4 = new com.explorestack.iab.mraid.e
            r4.<init>()
            java.lang.String r0 = "width"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.mo3945d(r0)
            r4.f4172a = r0
            java.lang.String r0 = "height"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.mo3945d(r0)
            r4.f4173b = r0
            java.lang.String r0 = "offsetX"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.mo3945d(r0)
            r4.f4174c = r0
            java.lang.String r0 = "offsetY"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r3.mo3945d(r0)
            r4.f4175d = r0
            java.lang.String r0 = "allowOffscreen"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r4.f4177f = r0
            java.lang.String r0 = "customClosePosition"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            com.explorestack.iab.mraid.l r5 = com.explorestack.iab.mraid.C1378l.m6194a(r5)
            r4.f4176e = r5
            com.explorestack.iab.mraid.j$b r5 = r3.f4212a
            r5.mo3878a((com.explorestack.iab.mraid.C1359e) r4)
            goto L_0x0168
        L_0x0145:
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            r4.mo3876a((int) r1)
            goto L_0x0168
        L_0x014b:
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            r4.mo3875a()
            goto L_0x0168
        L_0x0151:
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.mo3881b((java.lang.String) r5)
            goto L_0x0168
        L_0x015d:
            com.explorestack.iab.mraid.j$b r4 = r3.f4212a
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.mo3882c(r5)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.C1370j.mo3939a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: a */
    public void mo3940a(boolean z) {
        mo3942b("mraid.fireViewableChangeEvent(" + z + ");");
    }

    /* renamed from: b */
    public C1357c mo3941b() {
        return this.f4217f;
    }

    /* renamed from: b */
    public void mo3942b(String str) {
        this.f4213b.mo3905a(str);
    }

    /* renamed from: c */
    public C1364i mo3943c() {
        return this.f4213b;
    }

    /* renamed from: c */
    public void mo3944c(String str) {
        this.f4214c = false;
        mo3943c().loadUrl(str);
    }

    /* renamed from: d */
    public final int mo3945d(String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str, 10);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo3946d() {
        return this.f4216e;
    }

    /* renamed from: e */
    public final void mo3947e(String str) {
        if (this.f4213b.mo3916j()) {
            this.f4212a.mo3879a(str);
            this.f4213b.mo3914h();
            return;
        }
        MraidLog.m5985d(f4210g, "Can't open url because webView wasn't clicked");
    }

    /* renamed from: e */
    public boolean mo3948e() {
        return this.f4215d;
    }

    /* renamed from: f */
    public boolean mo3949f() {
        return this.f4213b.mo3911e();
    }

    /* renamed from: g */
    public final void mo3950g() {
        mo3942b("mraid.nativeCallComplete();");
    }

    /* renamed from: h */
    public void mo3951h() {
        mo3942b("mraid.fireReadyEvent();");
    }
}
