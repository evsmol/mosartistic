package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.appnext.C8663R;
import com.appnext.ads.AdsError;
import com.appnext.ads.C8668a;
import com.appnext.ads.C8670b;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8906e;
import com.appnext.core.C8917f;
import com.appnext.core.C8927k;
import com.appnext.core.C8936p;
import com.appnext.core.C8940q;
import com.appnext.core.result.C8960a;
import com.appnext.core.result.C8962c;
import com.appnext.core.result.C8963d;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.WebAppInterface;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class InterstitialActivity extends AppnextActivity {
    /* access modifiers changed from: private */

    /* renamed from: aE */
    public AppnextAd f22167aE;

    /* renamed from: aF */
    private C8670b f22168aF;
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public Boolean autoPlay;

    /* renamed from: bP */
    protected WebView f22169bP;

    /* renamed from: bQ */
    private boolean f22170bQ = false;
    /* access modifiers changed from: private */

    /* renamed from: bR */
    public Interstitial f22171bR;
    /* access modifiers changed from: private */

    /* renamed from: bS */
    public InterstitialAd f22172bS;

    /* renamed from: bT */
    private String f22173bT = "";

    /* renamed from: bU */
    private int f22174bU = 0;
    /* access modifiers changed from: private */

    /* renamed from: bV */
    public Handler f22175bV;

    /* renamed from: bW */
    private C8906e.C8915a f22176bW;

    /* renamed from: bX */
    private WebAppInterface f22177bX;

    /* renamed from: bY */
    private boolean f22178bY = false;

    /* renamed from: bZ */
    private boolean f22179bZ = false;
    /* access modifiers changed from: private */

    /* renamed from: ca */
    public String f22180ca;
    private Boolean canClose;
    /* access modifiers changed from: private */

    /* renamed from: cc */
    public String f22181cc = "";
    /* access modifiers changed from: private */

    /* renamed from: cd */
    public boolean f22182cd = false;
    /* access modifiers changed from: private */

    /* renamed from: ce */
    public Runnable f22183ce = new Runnable() {
        public final void run() {
            InterstitialActivity.m26470l(InterstitialActivity.this);
        }
    };
    private boolean closed = false;
    private Boolean mute;

    /* renamed from: a */
    protected static void m26453a(String str, String str2, String str3) {
    }

    /* renamed from: u */
    static /* synthetic */ int m26479u(InterstitialActivity interstitialActivity) {
        int i = interstitialActivity.f22174bU;
        interstitialActivity.f22174bU = i + 1;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(7);
        super.onCreate(bundle);
        if (Interstitial.currentAd == null) {
            finish();
            return;
        }
        this.f22171bR = new Interstitial(Interstitial.currentAd);
        if (getRequestedOrientation() == 6) {
            report(C8668a.f22009ai);
        } else {
            report(C8668a.f22010aj);
        }
        this.f22500gl = new RelativeLayout(this);
        setContentView(this.f22500gl);
        this.f22500gl.getLayoutParams().width = -1;
        this.f22500gl.getLayoutParams().height = -1;
        this.f22500gl.setBackgroundColor(-1);
        try {
            this.placementID = getIntent().getExtras().getString("id");
            if (getIntent().hasExtra("auto_play")) {
                Boolean valueOf = Boolean.valueOf(getIntent().getBooleanExtra("auto_play", true));
                this.autoPlay = valueOf;
                if (valueOf.booleanValue()) {
                    report(C8668a.f22005ae);
                } else {
                    report(C8668a.f22006af);
                }
            }
            if (getIntent().hasExtra("can_close")) {
                this.canClose = Boolean.valueOf(getIntent().getBooleanExtra("can_close", false));
            }
            if (getIntent().hasExtra("mute")) {
                Boolean valueOf2 = Boolean.valueOf(getIntent().getBooleanExtra("mute", true));
                this.mute = valueOf2;
                if (valueOf2.booleanValue()) {
                    report(C8668a.f22007ag);
                } else {
                    report(C8668a.f22008ah);
                }
            }
            if (getIntent().hasExtra("pview")) {
                this.f22498gj = getIntent().getStringExtra("pview");
                this.banner = getIntent().getStringExtra("banner");
                this.guid = getIntent().getStringExtra("guid");
            }
            if (getIntent().getSerializableExtra("ads") != null) {
                this.ads = (ArrayList) getIntent().getSerializableExtra("ads");
            }
            this.f22175bV = new Handler();
            AppnextWebView.m27061u(this).mo59087a(this.f22171bR.getPageUrl(), (AppnextWebView.C8967c) new AppnextWebView.C8967c() {
                /* renamed from: f */
                public final void mo58459f(String str) {
                    InterstitialActivity.m26451a(InterstitialActivity.this);
                }

                public final void error(String str) {
                    InterstitialActivity.m26451a(InterstitialActivity.this);
                }
            });
            this.f22176bW = new C8906e.C8915a() {
                public final void onMarket(String str) {
                    new StringBuilder("marketUrl ").append(str);
                    if (InterstitialActivity.this.handler != null) {
                        InterstitialActivity.this.handler.removeCallbacks((Runnable) null);
                    }
                    InterstitialActivity.this.mo58859ba();
                }

                public final void error(String str) {
                    if (InterstitialActivity.this.handler != null) {
                        InterstitialActivity.this.handler.removeCallbacks((Runnable) null);
                    }
                    InterstitialActivity.this.mo58859ba();
                    String unused = InterstitialActivity.this.placementID;
                    StringBuilder sb = new StringBuilder();
                    sb.append(new InterstitialAd(InterstitialActivity.this.f22167aE).getAppURL());
                    sb.append(" ");
                    sb.append(str);
                }
            };
            this.userAction = new C8940q(this, new C8940q.C8949a() {
                public final void report(String str) {
                }

                /* renamed from: e */
                public final C8874Ad mo58261e() {
                    return InterstitialActivity.this.f22171bR;
                }

                /* renamed from: f */
                public final AppnextAd mo58262f() {
                    return InterstitialActivity.this.f22167aE;
                }

                /* renamed from: g */
                public final C8936p mo58263g() {
                    return InterstitialActivity.this.getConfig();
                }
            });
            new Thread(new Runnable() {
                public final void run() {
                    InterstitialActivity interstitialActivity = InterstitialActivity.this;
                    String unused = interstitialActivity.f22181cc = C8917f.m26931b((Context) interstitialActivity, true);
                }
            }).start();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: v */
    private void m26481v() {
        try {
            AppnextWebView u = AppnextWebView.m27061u(this);
            this.f22169bP = u.mo59089ai(this.ads != null ? "fullscreen" : "interstitial");
            WebView a = u.mo59085a(this, this.f22171bR.getPageUrl(), mo58455w(), this.f22171bR.getFallback(), this.ads != null ? "fullscreen" : "interstitial");
            this.f22169bP = a;
            a.setWebViewClient(new WebViewClient() {
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (!str.startsWith("http")) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    webView.loadUrl(str);
                    return true;
                }

                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.f22175bV.removeCallbacksAndMessages((Object) null);
                    InterstitialActivity.m26470l(InterstitialActivity.this);
                }
            });
            this.f22169bP.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    new StringBuilder("console ").append(consoleMessage.message());
                    if (consoleMessage.message().contains("pause")) {
                        return true;
                    }
                    if (!consoleMessage.message().contains("TypeError") && !consoleMessage.message().contains("has no method") && !consoleMessage.message().contains("is not a function")) {
                        return true;
                    }
                    InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                    InterstitialActivity.this.finish();
                    return true;
                }
            });
        } catch (Throwable unused) {
            onError(AppnextError.INTERNAL_ERROR);
            finish();
        }
    }

    private void pageFinished() {
        Handler handler = this.f22175bV;
        if (handler != null) {
            handler.removeCallbacks(this.f22183ce);
        }
        this.f22170bQ = true;
        String string = getIntent().getExtras().getString("creative");
        this.f22173bT = string;
        if (string == null || string.equals(Interstitial.TYPE_MANAGED)) {
            this.f22173bT = m26459d("creative");
        }
        new Thread(new Runnable() {
            public final void run() {
                InterstitialActivity.this.mo58456x();
            }
        }).start();
        WebView webView = this.f22169bP;
        if (webView == null) {
            onError(AppnextError.INTERNAL_ERROR);
            finish();
            return;
        }
        if (webView.getParent() != null) {
            ((ViewGroup) this.f22169bP.getParent()).removeView(this.f22169bP);
        }
        this.f22500gl.addView(this.f22169bP);
        this.f22169bP.getLayoutParams().width = -1;
        this.f22169bP.getLayoutParams().height = -1;
    }

    /* access modifiers changed from: protected */
    public final C8936p getConfig() {
        return C8754c.m26528K();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Boolean bool;
        super.onResume();
        if (this.f22182cd) {
            onClose();
            finish();
            return;
        }
        if (this.f22170bQ && (bool = this.autoPlay) != null && bool.booleanValue()) {
            loadJS("Appnext.Layout.Video.play();");
        }
        try {
            this.f22169bP.loadUrl("javascript:(function() { try{Appnext.countToClose();}catch(e){}})()");
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        WebView webView;
        super.onPause();
        if (!this.closed && (webView = this.f22169bP) != null) {
            webView.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
        }
    }

    public void onBackPressed() {
        Boolean bool = this.canClose;
        if (bool != null) {
            if (!bool.booleanValue()) {
                return;
            }
        } else if (!Boolean.parseBoolean(m26459d("can_close"))) {
            return;
        }
        loadJS("Appnext.Layout.destroy('internal');");
        this.closed = true;
        onClose();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onError(final String str) {
        runOnUiThread(new Runnable() {
            public final void run() {
                if (InterstitialActivity.this.f22171bR != null && InterstitialActivity.this.f22171bR.getOnAdErrorCallback() != null) {
                    InterstitialActivity.this.f22171bR.getOnAdErrorCallback().adError(str);
                }
            }
        });
    }

    /* renamed from: e */
    private void m26463e(String str) {
        C8752a.m26507G();
        AppnextAd appnextAd = (AppnextAd) C8752a.parseAd(str);
        if (appnextAd != null) {
            this.f22167aE = new InterstitialAd(appnextAd);
            Interstitial interstitial = this.f22171bR;
            if (!(interstitial == null || interstitial.getOnAdClickedCallback() == null)) {
                this.f22171bR.getOnAdClickedCallback().adClicked();
            }
            mo58228b(this.f22167aE, this.f22176bW);
            report(C8668a.f21997V);
            String bannerID = this.f22167aE.getBannerID();
            InterstitialAd interstitialAd = this.f22172bS;
            if (bannerID.equals(interstitialAd != null ? interstitialAd.getBannerID() : "")) {
                if (!this.f22178bY) {
                    this.f22178bY = true;
                    report(C8668a.f22012al);
                }
            } else if (!this.f22179bZ) {
                this.f22179bZ = true;
                report(C8668a.f22011ak);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58228b(AppnextAd appnextAd, C8906e.C8915a aVar) {
        mo58856a((ViewGroup) this.f22500gl, getResources().getDrawable(C8663R.C8665drawable.apnxt_loader));
        super.mo58228b(appnextAd, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final WebAppInterface mo58455w() {
        if (this.f22177bX == null) {
            this.f22177bX = new WebInterface();
        }
        return this.f22177bX;
    }

    protected class WebInterface extends WebAppInterface {
        @JavascriptInterface
        public String filterAds(String str) {
            return str;
        }

        @JavascriptInterface
        public void gotoAppWall() {
        }

        @JavascriptInterface
        public String loadAds() {
            return "";
        }

        @JavascriptInterface
        public void videoPlayed() {
        }

        public WebInterface() {
            super(InterstitialActivity.this);
        }

        @JavascriptInterface
        public void destroy(String str) {
            if (str.equals("c_close")) {
                boolean unused = InterstitialActivity.this.f22182cd = true;
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        try {
                            JSONObject jSONObject = new JSONObject(InterstitialActivity.this.f22172bS.getAdJSON());
                            jSONObject.put("urlApp", jSONObject.getString("urlApp") + "&tem_id=156");
                            InterstitialActivity.m26456b(InterstitialActivity.this, jSONObject.toString());
                        } catch (JSONException unused) {
                            InterstitialActivity.m26456b(InterstitialActivity.this, InterstitialActivity.this.f22172bS.getAdJSON());
                        }
                    }
                });
            } else if (str.equals("close")) {
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        InterstitialActivity.this.onClose();
                        InterstitialActivity.this.finish();
                    }
                });
            } else {
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        InterstitialActivity.this.onError(AdsError.AD_NOT_READY);
                        InterstitialActivity.this.finish();
                    }
                });
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            if (InterstitialActivity.this.f22172bS != null) {
                InterstitialActivity.this.f22172bS.setImpressionURL(str);
                InterstitialActivity.this.handler.postDelayed(new C8750a(str), Long.parseLong(InterstitialActivity.this.getConfig().get("postpone_impression_sec")) * 1000);
            }
            if (InterstitialActivity.this.autoPlay != null && InterstitialActivity.this.autoPlay.booleanValue()) {
                play();
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            if (Boolean.parseBoolean(InterstitialActivity.this.ads != null ? "false" : InterstitialActivity.this.m26459d("pview"))) {
                InterstitialActivity.this.handler.postDelayed(new C8751b(str), Long.parseLong(InterstitialActivity.this.getConfig().get("postpone_vta_sec")) * 1000);
            }
        }

        @JavascriptInterface
        public void openStore(final String str) {
            InterstitialActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialActivity.m26456b(InterstitialActivity.this, str);
                }
            });
        }

        @JavascriptInterface
        public void play() {
            String unused = InterstitialActivity.this.placementID;
            InterstitialActivity.this.loadJS("Appnext.Layout.Video.play();");
        }

        @JavascriptInterface
        public void openLink(String str) {
            InterstitialActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            C8917f.m26924a((C8874Ad) InterstitialActivity.this.f22171bR, (AppnextAd) InterstitialActivity.this.f22172bS, str, str2, InterstitialActivity.this.getConfig());
        }

        @JavascriptInterface
        public void jsError(String str) {
            if (!TextUtils.isEmpty(str) || (!str.contains("is not a function") && !str.contains("has no method"))) {
                new StringBuilder("jsError ").append(str);
                InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                InterstitialActivity.this.finish();
            } else if (InterstitialActivity.m26479u(InterstitialActivity.this) < 5) {
                InterstitialActivity.this.f22175bV.postDelayed(InterstitialActivity.this.f22183ce, 500);
            } else {
                InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                InterstitialActivity.this.finish();
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            C8963d.m27050br().mo59083a(new C8962c() {
                /* renamed from: z */
                public final String mo58494z() {
                    return "160";
                }

                public final JSONObject getConfigParams() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vid", "2.5.1.472");
                    String str = "";
                    jSONObject.put("tid", InterstitialActivity.this.f22171bR == null ? str : InterstitialActivity.this.f22171bR.getTID());
                    if (InterstitialActivity.this.f22171bR != null) {
                        str = InterstitialActivity.this.f22171bR.getAUID();
                    }
                    jSONObject.put("auid", str);
                    jSONObject.put("osid", "100");
                    jSONObject.put("tem_id", "1601");
                    jSONObject.put("id", getPlacementId());
                    jSONObject.put("cat", InterstitialActivity.this.f22172bS.getCategories());
                    jSONObject.put("pview", InterstitialActivity.this.getConfig().get("pview"));
                    jSONObject.put("devn", C8917f.m26938be());
                    jSONObject.put("dosv", Build.VERSION.SDK_INT);
                    jSONObject.put("dds", BuildConfig.ADAPTER_VERSION);
                    jSONObject.put("ads_type", "banner");
                    jSONObject.put("country", InterstitialActivity.this.f22172bS.getCountry());
                    jSONObject.put("gdpr", C8927k.m26971a((AppnextAd) InterstitialActivity.this.f22172bS, InterstitialActivity.this.getConfig()));
                    return jSONObject;
                }

                public final AppnextAd getSelectedAd() {
                    return InterstitialActivity.this.f22172bS;
                }

                public final String getPlacementId() {
                    return InterstitialActivity.this.placementID;
                }

                /* renamed from: A */
                public final String mo58486A() {
                    return C8752a.m26507G().mo58994l((C8874Ad) InterstitialActivity.this.f22171bR);
                }

                /* renamed from: B */
                public final String mo58487B() {
                    return InterstitialActivity.this.f22180ca;
                }

                /* renamed from: C */
                public final C8936p mo58488C() {
                    return InterstitialActivity.this.getConfig();
                }

                /* renamed from: D */
                public final C8874Ad mo58489D() {
                    return InterstitialActivity.this.f22171bR;
                }

                /* renamed from: E */
                public final C8960a mo58490E() {
                    return new C8960a() {
                        /* renamed from: F */
                        public final Object mo58495F() {
                            return null;
                        }

                        public final String getFallbackScript() {
                            return null;
                        }

                        public final String getJSurl() {
                            return "https://cdn.appnext.com/tools/sdk/interstitial/v75/result.min.js";
                        }

                        public final WebViewClient getWebViewClient() {
                            return null;
                        }
                    };
                }
            });
            Intent intent = new Intent(InterstitialActivity.this, ResultPageActivity.class);
            intent.putExtra("shouldClose", false);
            intent.setFlags(65536);
            InterstitialActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$a */
    private class C8750a implements Runnable {

        /* renamed from: ch */
        AppnextAd f22206ch;

        C8750a(String str) {
            InterstitialAd interstitialAd = new InterstitialAd(InterstitialActivity.this.f22172bS);
            this.f22206ch = interstitialAd;
            interstitialAd.setImpressionURL(str);
        }

        public final void run() {
            try {
                if (InterstitialActivity.this.userAction != null) {
                    InterstitialActivity.this.userAction.mo59061e(this.f22206ch);
                    InterstitialActivity.this.report(C8668a.f21982G);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$b */
    private class C8751b implements Runnable {

        /* renamed from: ch */
        AppnextAd f22208ch;

        C8751b(String str) {
            try {
                C8752a.m26507G();
                this.f22208ch = (AppnextAd) C8752a.parseAd(str);
            } catch (Throwable unused) {
            }
        }

        public final void run() {
            InterstitialActivity.this.mo58227a(this.f22208ch, (C8906e.C8915a) null);
        }
    }

    private void play() {
        loadJS("Appnext.Layout.Video.play();");
    }

    private void stop() {
        WebView webView = this.f22169bP;
        if (webView != null) {
            webView.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
        }
    }

    /* access modifiers changed from: private */
    public void onClose() {
        Interstitial interstitial = this.f22171bR;
        if (interstitial != null && interstitial.getOnAdClosedCallback() != null) {
            this.f22171bR.getOnAdClosedCallback().onAdClosed();
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        Interstitial interstitial = this.f22171bR;
        if (interstitial != null) {
            String tid = interstitial.getTID();
            String vid = this.f22171bR.getVID();
            String auid = this.f22171bR.getAUID();
            String placementID = this.f22171bR.getPlacementID();
            String sessionId = this.f22171bR.getSessionId();
            InterstitialAd interstitialAd = this.f22172bS;
            String bannerID = interstitialAd != null ? interstitialAd.getBannerID() : "";
            InterstitialAd interstitialAd2 = this.f22172bS;
            C8917f.m26926a(tid, vid, auid, placementID, sessionId, str, "current_interstitial", bannerID, interstitialAd2 != null ? interstitialAd2.getCampaignID() : "");
        }
    }

    /* access modifiers changed from: private */
    public void loadJS(final String str) {
        runOnUiThread(new Runnable() {
            public final void run() {
                if (InterstitialActivity.this.f22169bP != null) {
                    WebView webView = InterstitialActivity.this.f22169bP;
                    webView.loadUrl("javascript:(function() { try { " + str + "} catch(err){ Appnext.jsError(err.message); }})()");
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ all -> 0x0142 }] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58456x() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C8752a.m26507G()     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.Interstitial r1 = r8.f22171bR     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = r8.f22173bT     // Catch:{ all -> 0x0142 }
            java.util.ArrayList r0 = r0.mo58522b(r8, r1, r2)     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x0019
            r8.finish()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0019:
            com.appnext.ads.interstitial.a r1 = com.appnext.ads.interstitial.C8752a.m26507G()     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r1.mo58520a(r0)     // Catch:{ all -> 0x0142 }
            if (r1 != 0) goto L_0x002d
            r8.finish()     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x002d:
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2028"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2029"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0142 }
            r8.f22180ca = r1     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.InterstitialAd r2 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x0142 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0142 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ all -> 0x0142 }
            r2.<init>(r4)     // Catch:{ all -> 0x0142 }
            r8.f22172bS = r2     // Catch:{ all -> 0x0142 }
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ all -> 0x0142 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ all -> 0x0142 }
            int r2 = r2.orientation     // Catch:{ all -> 0x0142 }
            org.json.JSONObject r2 = r8.mo58457y()     // Catch:{ all -> 0x0142 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0142 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ all -> 0x0142 }
            java.lang.String r5 = r4.getVideoUrl()     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0142 }
            r6 = 1
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrlHigh()     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrl30Sec()     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r4 = r4.getVideoUrlHigh30Sec()     // Catch:{ all -> 0x0142 }
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0142 }
            if (r4 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r4 = 0
            goto L_0x0096
        L_0x0095:
            r4 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x00b8
            java.lang.String r4 = "remote_auto_play"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r5.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.Boolean r7 = r8.autoPlay     // Catch:{ all -> 0x0142 }
            if (r7 == 0) goto L_0x00ac
            java.lang.Boolean r7 = r8.autoPlay     // Catch:{ all -> 0x0142 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0142 }
            if (r7 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            r5.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0142 }
            r2.put(r4, r5)     // Catch:{ all -> 0x0142 }
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = "remote_auto_play"
            java.lang.String r5 = "false"
            r2.put(r4, r5)     // Catch:{ all -> 0x0142 }
        L_0x00bf:
            com.appnext.ads.interstitial.InterstitialAd r4 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ all -> 0x0142 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0142 }
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0     // Catch:{ all -> 0x0142 }
            r4.<init>(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r4.getButtonText()     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r4.getAdPackage()     // Catch:{ all -> 0x0142 }
            boolean r0 = com.appnext.core.C8917f.m26946c(r8, r0)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "existing_button_text"
            java.lang.String r0 = r8.m26459d((java.lang.String) r0)     // Catch:{ all -> 0x0142 }
            goto L_0x00f2
        L_0x00e7:
            java.lang.String r0 = "new_button_text"
            java.lang.String r0 = r8.m26459d((java.lang.String) r0)     // Catch:{ all -> 0x0142 }
            goto L_0x00f2
        L_0x00ee:
            java.lang.String r0 = r4.getButtonText()     // Catch:{ all -> 0x0142 }
        L_0x00f2:
            java.lang.String r3 = "b_title"
            r2.put(r3, r0)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = "Appnext.setParams("
            r0.<init>(r3)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0142 }
            r0.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = ");"
            r0.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0142 }
            r8.loadJS(r0)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "Appnext.loadInterstitial("
            r0.<init>(r2)     // Catch:{ all -> 0x0142 }
            r0.append(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = ");"
            r0.append(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0142 }
            r8.loadJS(r0)     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C8752a.m26507G()     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.InterstitialAd r1 = r8.f22172bS     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r1.getBannerID()     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.Interstitial r2 = com.appnext.ads.interstitial.Interstitial.currentAd     // Catch:{ all -> 0x0142 }
            r0.mo58360a((java.lang.String) r1, (com.appnext.core.C8874Ad) r2)     // Catch:{ all -> 0x0142 }
            android.os.Handler r0 = r8.handler     // Catch:{ all -> 0x0142 }
            com.appnext.ads.interstitial.InterstitialActivity$3 r1 = new com.appnext.ads.interstitial.InterstitialActivity$3     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            r0.post(r1)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0142:
            r0 = move-exception
            r8.finish()     // Catch:{ all -> 0x0150 }
            java.lang.String r1 = "Internal error"
            r8.onError(r1)     // Catch:{ all -> 0x0150 }
            com.appnext.core.C8917f.m26933b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r8)
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.InterstitialActivity.mo58456x():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.put("icon_color", "");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x027d */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo58457y() throws org.json.JSONException {
        /*
            r11 = this;
            java.lang.String r0 = "icon_color"
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getButtonColor()
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = "button_color"
            java.lang.String r1 = r11.m26459d((java.lang.String) r1)
            goto L_0x001d
        L_0x0017:
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getButtonColor()
        L_0x001d:
            java.lang.String r3 = "#"
            boolean r3 = r1.startsWith(r3)
            r4 = 1
            if (r3 == 0) goto L_0x002a
            java.lang.String r1 = r1.substring(r4)
        L_0x002a:
            java.lang.Boolean r3 = r11.autoPlay
            java.lang.String r5 = "auto_play"
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = r11.m26459d((java.lang.String) r5)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r11.autoPlay = r3
        L_0x003e:
            java.lang.Boolean r3 = r11.mute
            java.lang.String r6 = "mute"
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = r11.m26459d((java.lang.String) r6)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r11.mute = r3
        L_0x0052:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r7 = r11.placementID
            java.lang.String r8 = "id"
            r3.put(r8, r7)
            com.appnext.ads.interstitial.Interstitial r7 = r11.f22171bR
            java.lang.String r7 = r7.getCategories()
            java.lang.String r8 = "cat"
            r3.put(r8, r7)
            com.appnext.ads.interstitial.Interstitial r7 = r11.f22171bR
            java.lang.String r7 = r7.getPostback()
            java.lang.String r8 = "pbk"
            r3.put(r8, r7)
            java.lang.String r7 = "b_color"
            r3.put(r7, r1)
            java.util.ArrayList<com.appnext.core.AppnextAd> r1 = r11.ads
            java.lang.String r7 = "show_desc"
            if (r1 != 0) goto L_0x010d
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getSkipText()
            boolean r1 = r1.equals(r2)
            java.lang.String r8 = "skip_title"
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = r11.m26459d((java.lang.String) r8)
            goto L_0x0098
        L_0x0092:
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getSkipText()
        L_0x0098:
            r3.put(r8, r1)
            java.util.ArrayList<com.appnext.core.AppnextAd> r1 = r11.ads
            java.lang.String r8 = "pview"
            if (r1 == 0) goto L_0x00a4
            java.lang.String r1 = "false"
            goto L_0x00a8
        L_0x00a4:
            java.lang.String r1 = r11.m26459d((java.lang.String) r8)
        L_0x00a8:
            r3.put(r8, r1)
            java.lang.String r1 = "video_length"
            java.lang.String r8 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r8)
            java.lang.String r1 = "min_internet_connection"
            java.lang.String r8 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r8)
            java.lang.String r1 = "min_internet_connection_video"
            java.lang.String r8 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Boolean r8 = r11.mute
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r3.put(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Boolean r6 = r11.autoPlay
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r3.put(r5, r1)
            java.lang.String r1 = "remove_poster_on_auto_play"
            java.lang.String r5 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r5)
            java.lang.String r1 = "show_rating"
            java.lang.String r5 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r5)
            java.lang.String r1 = r11.m26459d((java.lang.String) r7)
            r3.put(r7, r1)
            java.lang.String r1 = r11.f22173bT
            java.lang.String r5 = "creative"
            r3.put(r5, r1)
            java.lang.String r1 = "remote_auto_play"
            r3.put(r1, r4)
        L_0x010d:
            java.lang.String r1 = "stp_flag"
            java.lang.String r5 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r5)
            java.lang.String r1 = "ext"
            java.lang.String r5 = "t"
            r3.put(r1, r5)
            java.lang.String r1 = com.appnext.core.C8917f.m26953o((android.content.Context) r11)
            java.lang.String r5 = "dct"
            r3.put(r5, r1)
            java.lang.String r1 = r11.f22181cc
            java.lang.String r5 = "did"
            r3.put(r5, r1)
            java.lang.String r1 = com.appnext.core.C8917f.m26938be()
            java.lang.String r5 = "devn"
            r3.put(r5, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "dosv"
            r3.put(r5, r1)
            java.lang.String r1 = "dds"
            java.lang.String r5 = "0"
            r3.put(r1, r5)
            java.lang.String r1 = "urlApp_protection"
            java.lang.String r5 = r11.m26459d((java.lang.String) r1)
            r3.put(r1, r5)
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getVID()
            java.lang.String r5 = "vid"
            r3.put(r5, r1)
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getTID()
            java.lang.String r5 = "tid"
            r3.put(r5, r1)
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getAUID()
            java.lang.String r5 = "auid"
            r3.put(r5, r1)
            java.lang.String r1 = "osid"
            java.lang.String r5 = "100"
            r3.put(r1, r5)
            java.lang.String r1 = "ads_type"
            java.lang.String r5 = "interstitial"
            r3.put(r1, r5)
            com.appnext.ads.interstitial.InterstitialAd r1 = r11.f22172bS
            java.lang.String r1 = r1.getCountry()
            java.lang.String r5 = "country"
            r3.put(r5, r1)
            com.appnext.ads.interstitial.InterstitialAd r1 = r11.f22172bS
            com.appnext.ads.interstitial.c r5 = com.appnext.ads.interstitial.C8754c.m26528K()
            boolean r1 = com.appnext.core.C8927k.m26971a((com.appnext.core.AppnextAd) r1, (com.appnext.core.C8936p) r5)
            java.lang.String r5 = "gdpr"
            r3.put(r5, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            com.appnext.core.a.b r5 = com.appnext.core.p267a.C8894b.m26842bp()
            java.lang.String r5 = r5.mo58970bq()
            r1.<init>(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "lang_settings"
            r3.put(r5, r1)
            com.appnext.ads.interstitial.Interstitial r1 = r11.f22171bR
            java.lang.String r1 = r1.getLanguage()
            if (r1 == 0) goto L_0x01ba
            boolean r5 = r1.equals(r2)
            if (r5 == 0) goto L_0x01c6
        L_0x01ba:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            java.lang.String r1 = r1.toUpperCase()
        L_0x01c6:
            java.lang.String r5 = "lang"
            r3.put(r5, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            java.lang.String r5 = "S1"
            java.lang.String r5 = r11.m26459d((java.lang.String) r5)
            r1.<init>(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "tem"
            r3.put(r5, r1)
            java.lang.String r1 = "clickType_A"
            java.lang.String r1 = r11.m26459d((java.lang.String) r1)
            java.lang.String r5 = "click_x"
            r3.put(r5, r1)
            android.content.Intent r1 = r11.getIntent()
            if (r1 == 0) goto L_0x0205
            android.content.Intent r1 = r11.getIntent()
            boolean r1 = r1.hasExtra(r7)
            if (r1 == 0) goto L_0x0205
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r1 = r1.getStringExtra(r7)
            r3.put(r7, r1)
        L_0x0205:
            com.appnext.ads.interstitial.InterstitialAd r1 = r11.f22172bS     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = r1.getImageURL()     // Catch:{ all -> 0x0285 }
            android.graphics.Bitmap r1 = com.appnext.core.C8917f.m26913Y(r1)     // Catch:{ all -> 0x0285 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0285 }
            r5.<init>()     // Catch:{ all -> 0x0285 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0285 }
            r7 = 100
            r1.compress(r6, r7, r5)     // Catch:{ all -> 0x0285 }
            byte[] r5 = r5.toByteArray()     // Catch:{ all -> 0x0285 }
            r6 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)     // Catch:{ all -> 0x0285 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0285 }
            java.lang.String r8 = "data:image/"
            r7.<init>(r8)     // Catch:{ all -> 0x0285 }
            com.appnext.ads.interstitial.InterstitialAd r8 = r11.f22172bS     // Catch:{ all -> 0x0285 }
            java.lang.String r8 = r8.getImageURL()     // Catch:{ all -> 0x0285 }
            com.appnext.ads.interstitial.InterstitialAd r9 = r11.f22172bS     // Catch:{ all -> 0x0285 }
            java.lang.String r9 = r9.getImageURL()     // Catch:{ all -> 0x0285 }
            r10 = 46
            int r9 = r9.lastIndexOf(r10)     // Catch:{ all -> 0x0285 }
            int r9 = r9 + r4
            java.lang.String r8 = r8.substring(r9)     // Catch:{ all -> 0x0285 }
            r7.append(r8)     // Catch:{ all -> 0x0285 }
            java.lang.String r8 = ";base64,"
            r7.append(r8)     // Catch:{ all -> 0x0285 }
            r7.append(r5)     // Catch:{ all -> 0x0285 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0285 }
            androidx.palette.graphics.Palette$Builder r1 = androidx.palette.graphics.Palette.from(r1)     // Catch:{ all -> 0x027d }
            androidx.palette.graphics.Palette r1 = r1.generate()     // Catch:{ all -> 0x027d }
            androidx.palette.graphics.Palette$Swatch r1 = r1.getVibrantSwatch()     // Catch:{ all -> 0x027d }
            if (r1 == 0) goto L_0x0279
            int r1 = r1.getRgb()     // Catch:{ all -> 0x027d }
            java.lang.String r7 = "#%06X"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x027d }
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x027d }
            r4[r6] = r1     // Catch:{ all -> 0x027d }
            java.lang.String r1 = java.lang.String.format(r7, r4)     // Catch:{ all -> 0x027d }
            r3.put(r0, r1)     // Catch:{ all -> 0x027d }
            goto L_0x0280
        L_0x0279:
            r3.put(r0, r2)     // Catch:{ all -> 0x027d }
            goto L_0x0280
        L_0x027d:
            r3.put(r0, r2)     // Catch:{ all -> 0x0285 }
        L_0x0280:
            java.lang.String r0 = "icon_src"
            r3.put(r0, r5)     // Catch:{ all -> 0x0285 }
        L_0x0285:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.InterstitialActivity.mo58457y():org.json.JSONObject");
    }

    /* renamed from: a */
    private static String m26449a(int i) {
        return String.format("#%06X", new Object[]{Integer.valueOf(i & 16777215)});
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C8752a.m26507G().mo58524g(this.f22171bR);
            this.f22171bR.destroy();
            this.f22171bR = null;
            if (this.f22175bV != null) {
                this.f22175bV.removeCallbacksAndMessages((Object) null);
            }
            this.f22175bV = null;
            this.f22183ce = null;
            this.f22172bS = null;
            if (this.f22169bP != null) {
                this.f22169bP.stopLoading();
                if (this.f22169bP.getParent() != null) {
                    ((ViewGroup) this.f22169bP.getParent()).removeView(this.f22169bP);
                }
                this.f22169bP.setWebChromeClient((WebChromeClient) null);
                this.f22169bP.setWebViewClient((WebViewClient) null);
                this.f22169bP.destroy();
                this.f22169bP = null;
            }
            AppnextWebView.m27061u(this).mo59086a(mo58455w());
            this.f22177bX = null;
            this.f22176bW = null;
            if (this.f22168aF != null) {
                this.f22168aF.mo58213a((Context) this);
                this.f22168aF = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m26459d(String str) {
        String str2 = C8754c.m26528K().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: a */
    static /* synthetic */ void m26451a(InterstitialActivity interstitialActivity) {
        try {
            AppnextWebView u = AppnextWebView.m27061u(interstitialActivity);
            interstitialActivity.f22169bP = u.mo59089ai(interstitialActivity.ads != null ? "fullscreen" : "interstitial");
            WebView a = u.mo59085a(interstitialActivity, interstitialActivity.f22171bR.getPageUrl(), interstitialActivity.mo58455w(), interstitialActivity.f22171bR.getFallback(), interstitialActivity.ads != null ? "fullscreen" : "interstitial");
            interstitialActivity.f22169bP = a;
            a.setWebViewClient(new WebViewClient() {
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (!str.startsWith("http")) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    webView.loadUrl(str);
                    return true;
                }

                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.f22175bV.removeCallbacksAndMessages((Object) null);
                    InterstitialActivity.m26470l(InterstitialActivity.this);
                }
            });
            interstitialActivity.f22169bP.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    new StringBuilder("console ").append(consoleMessage.message());
                    if (consoleMessage.message().contains("pause")) {
                        return true;
                    }
                    if (!consoleMessage.message().contains("TypeError") && !consoleMessage.message().contains("has no method") && !consoleMessage.message().contains("is not a function")) {
                        return true;
                    }
                    InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                    InterstitialActivity.this.finish();
                    return true;
                }
            });
        } catch (Throwable unused) {
            interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
            interstitialActivity.finish();
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m26470l(InterstitialActivity interstitialActivity) {
        Handler handler = interstitialActivity.f22175bV;
        if (handler != null) {
            handler.removeCallbacks(interstitialActivity.f22183ce);
        }
        interstitialActivity.f22170bQ = true;
        String string = interstitialActivity.getIntent().getExtras().getString("creative");
        interstitialActivity.f22173bT = string;
        if (string == null || string.equals(Interstitial.TYPE_MANAGED)) {
            interstitialActivity.f22173bT = interstitialActivity.m26459d("creative");
        }
        new Thread(new Runnable() {
            public final void run() {
                InterstitialActivity.this.mo58456x();
            }
        }).start();
        WebView webView = interstitialActivity.f22169bP;
        if (webView == null) {
            interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
            interstitialActivity.finish();
            return;
        }
        if (webView.getParent() != null) {
            ((ViewGroup) interstitialActivity.f22169bP.getParent()).removeView(interstitialActivity.f22169bP);
        }
        interstitialActivity.f22500gl.addView(interstitialActivity.f22169bP);
        interstitialActivity.f22169bP.getLayoutParams().width = -1;
        interstitialActivity.f22169bP.getLayoutParams().height = -1;
    }

    /* renamed from: b */
    static /* synthetic */ void m26456b(InterstitialActivity interstitialActivity, String str) {
        C8752a.m26507G();
        AppnextAd appnextAd = (AppnextAd) C8752a.parseAd(str);
        if (appnextAd != null) {
            interstitialActivity.f22167aE = new InterstitialAd(appnextAd);
            Interstitial interstitial = interstitialActivity.f22171bR;
            if (!(interstitial == null || interstitial.getOnAdClickedCallback() == null)) {
                interstitialActivity.f22171bR.getOnAdClickedCallback().adClicked();
            }
            interstitialActivity.mo58228b(interstitialActivity.f22167aE, interstitialActivity.f22176bW);
            interstitialActivity.report(C8668a.f21997V);
            String bannerID = interstitialActivity.f22167aE.getBannerID();
            InterstitialAd interstitialAd = interstitialActivity.f22172bS;
            if (bannerID.equals(interstitialAd != null ? interstitialAd.getBannerID() : "")) {
                if (!interstitialActivity.f22178bY) {
                    interstitialActivity.f22178bY = true;
                    interstitialActivity.report(C8668a.f22012al);
                }
            } else if (!interstitialActivity.f22179bZ) {
                interstitialActivity.f22179bZ = true;
                interstitialActivity.report(C8668a.f22011ak);
            }
        }
    }
}
