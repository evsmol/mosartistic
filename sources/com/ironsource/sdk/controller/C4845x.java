package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.base.p264b.C8849c;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4386c;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.C4412k;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p119d.C4370a;
import com.ironsource.sdk.controller.C4785f;
import com.ironsource.sdk.controller.C4813k;
import com.ironsource.sdk.controller.C4815l;
import com.ironsource.sdk.controller.C4835r;
import com.ironsource.sdk.controller.C4842v;
import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4744b;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p139c.C4759a;
import com.ironsource.sdk.p139c.C4766d;
import com.ironsource.sdk.p139c.C4768e;
import com.ironsource.sdk.p143f.C4929a;
import com.ironsource.sdk.p144g.C4932a;
import com.ironsource.sdk.p144g.C4933b;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p144g.C4942e;
import com.ironsource.sdk.p144g.C4943f;
import com.ironsource.sdk.p145h.C4944a;
import com.ironsource.sdk.p145h.C4945b;
import com.ironsource.sdk.p145h.C4948c;
import com.ironsource.sdk.p147j.C4961e;
import com.ironsource.sdk.p147j.C4963g;
import com.ironsource.sdk.p147j.p148a.C4954a;
import com.ironsource.sdk.p147j.p148a.C4955b;
import com.ironsource.sdk.p147j.p148a.C4956c;
import com.ironsource.sdk.p147j.p148a.C4957d;
import com.ironsource.sdk.p149k.C4965b;
import com.ironsource.sdk.p149k.C4969c;
import com.ironsource.sdk.service.C4977a;
import com.ironsource.sdk.service.C4979c;
import com.ironsource.sdk.service.Connectivity.C4972b;
import com.ironsource.sdk.utils.C4983a;
import com.ironsource.sdk.utils.C4984b;
import com.ironsource.sdk.utils.C4987d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.BidMachineFetcher;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.ironsource.sdk.controller.x */
public class C4845x extends WebView implements DownloadListener, C4817m, C4969c {
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public static String f12354ab = "success";
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public static String f12355ac = "fail";

    /* renamed from: b */
    public static String f12356b = "is_store";

    /* renamed from: c */
    public static String f12357c = "external_url";

    /* renamed from: d */
    public static String f12358d = "secondary_web_view";

    /* renamed from: y */
    private static int f12359y;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public String f12360A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f12361B;

    /* renamed from: C */
    private Map<String, String> f12362C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C4965b f12363D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f12364E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f12365F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public CountDownTimer f12366G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f12367H = 50;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f12368I = 50;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f12369J = "top-right";
    /* access modifiers changed from: private */

    /* renamed from: K */
    public FrameLayout f12370K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public WebChromeClient.CustomViewCallback f12371L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C4957d f12372M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C4956c f12373N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C4961e f12374O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C4955b f12375P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Boolean f12376Q = null;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f12377R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C4785f f12378S;

    /* renamed from: T */
    private Object f12379T = new Object();
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f12380U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C4812j f12381V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C4784e f12382W;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public String f12383a = C4845x.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C4972b f12384aa;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public C4866b f12385e;

    /* renamed from: f */
    public CountDownTimer f12386f;

    /* renamed from: g */
    C4865a f12387g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public View f12388h;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public FrameLayout f12389i;
    /* access modifiers changed from: package-private */

    /* renamed from: j */
    public C4901g f12390j;

    /* renamed from: k */
    String f12391k;
    /* access modifiers changed from: package-private */

    /* renamed from: l */
    public C4844w f12392l;
    /* access modifiers changed from: package-private */

    /* renamed from: m */
    public C4933b f12393m;
    /* access modifiers changed from: package-private */

    /* renamed from: n */
    public C4833q f12394n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C4835r f12395o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public C4842v f12396p;
    /* access modifiers changed from: package-private */

    /* renamed from: q */
    public C4813k f12397q;
    /* access modifiers changed from: package-private */

    /* renamed from: r */
    public C4778a f12398r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C4815l f12399s;

    /* renamed from: t */
    C4905y f12400t;

    /* renamed from: u */
    C4782c f12401u;
    /* access modifiers changed from: package-private */

    /* renamed from: v */
    public C4963g f12402v;

    /* renamed from: w */
    private final C4399a f12403w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f12404x = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: z */
    private final String f12405z = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: com.ironsource.sdk.controller.x$a */
    class C4865a extends WebChromeClient {
        private C4865a() {
        }

        /* synthetic */ C4865a(C4845x xVar, byte b) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C4845x.this.f12401u.mo34326a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m14507i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new C4867c(C4845x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m14507i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.m14507i("Test", "onHideCustomView");
            if (C4845x.this.f12388h != null) {
                C4845x.this.f12388h.setVisibility(8);
                C4845x.this.f12370K.removeView(C4845x.this.f12388h);
                View unused = C4845x.this.f12388h = null;
                C4845x.this.f12370K.setVisibility(8);
                C4845x.this.f12371L.onCustomViewHidden();
                C4845x.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m14507i("Test", "onShowCustomView");
            C4845x.this.setVisibility(8);
            if (C4845x.this.f12388h != null) {
                Logger.m14507i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m14507i("Test", "mCustomView == null");
            C4845x.this.f12370K.addView(view);
            View unused = C4845x.this.f12388h = view;
            WebChromeClient.CustomViewCallback unused2 = C4845x.this.f12371L = customViewCallback;
            C4845x.this.f12370K.setVisibility(0);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$b */
    static class C4866b {

        /* renamed from: a */
        C4936d.C4941e f12441a;

        /* renamed from: b */
        String f12442b;

        public C4866b(C4936d.C4941e eVar, String str) {
            this.f12441a = eVar;
            this.f12442b = str;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$c */
    class C4867c extends WebViewClient {
        private C4867c() {
        }

        /* synthetic */ C4867c(C4845x xVar, byte b) {
            this();
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C4845x.this.f12383a;
            Logger.m14505e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = C4845x.this.f12401u.mo34326a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(C4845x.f12357c, str);
            intent.putExtra(C4845x.f12358d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$d */
    public class C4868d {

        /* renamed from: com.ironsource.sdk.controller.x$d$a */
        public class C4898a {
            public C4898a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo34576a(boolean z, String str, C4943f fVar) {
                fVar.mo34680a(z ? C4845x.f12354ab : C4845x.f12355ac, str);
                C4845x.m14171a(C4845x.this, fVar.toString(), z, (String) null, (String) null);
            }

            /* renamed from: a */
            public final void mo34577a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = C4845x.f12354ab;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                } else {
                    str2 = C4845x.f12355ac;
                }
                jSONObject.put(str2, str);
                C4845x.m14171a(C4845x.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        public C4868d() {
        }

        /* renamed from: a */
        private void m14280a(String str, boolean z) {
            C4935c a = C4845x.this.f12381V.mo34390a(C4936d.C4941e.Interstitial, str);
            if (a != null) {
                a.f12642f = z;
            }
        }

        /* renamed from: a */
        private void m14281a(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.mo34303a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.mo34303a()));
                }
            } catch (Exception e) {
                C4747d.m13921a(C4749f.f12049m, (Map<String, Object>) new C4743a().mo34234a("callfailreason", e.getMessage()).f12028a);
                Logger.m14503d(C4845x.this.f12383a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: a */
        private void m14282a(JSONObject jSONObject, String str) {
            if (m14283a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.m14503d(C4845x.this.f12383a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: a */
        private static boolean m14283a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        private void m14284b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C4845x.this.f12378S.mo34340f());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "adClicked(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                final C4936d.C4941e e = C4845x.m14205h(d);
                final C4954a a = C4845x.this.m14180b(e);
                if (e != null && a != null) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            a.mo34617b(e, fetchDemandSourceId);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            final String str2;
            final boolean z;
            final boolean z2;
            C4935c a;
            Log.d(C4845x.this.f12404x, "adCredited(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d("credits");
            boolean z3 = false;
            final int parseInt = d != null ? Integer.parseInt(d) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d2 = fVar.mo34685d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(C4845x.this.f12404x, "adCredited | product type is missing");
            }
            if (!C4936d.C4941e.Interstitial.toString().equalsIgnoreCase(d2)) {
                String d3 = fVar.mo34685d("total");
                final int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
                if (!C4936d.C4941e.OfferWall.toString().equalsIgnoreCase(d2)) {
                    str2 = null;
                    z2 = false;
                    z = false;
                } else if (fVar.mo34683b("signature") || fVar.mo34683b("timestamp") || fVar.mo34683b("totalCreditsFlag")) {
                    C4845x.m14171a(C4845x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.mo34685d("signature").equalsIgnoreCase(SDKUtils.getMD5(d3 + C4845x.this.f12360A + C4845x.this.f12361B))) {
                        z3 = true;
                    } else {
                        C4845x.m14171a(C4845x.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e = fVar.mo34686e("totalCreditsFlag");
                    str2 = fVar.mo34685d("timestamp");
                    z = e;
                    z2 = z3;
                }
                if (C4845x.this.mo34439a(d2)) {
                    final String str3 = str;
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            if (d2.equalsIgnoreCase(C4936d.C4941e.RewardedVideo.toString())) {
                                C4845x.this.f12372M.mo34604a(fetchDemandSourceId, parseInt);
                            } else if (d2.equalsIgnoreCase(C4936d.C4941e.OfferWall.toString()) && z2 && C4845x.this.f12374O.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str2)) {
                                if (C4984b.m14516a().mo34732a(str2, C4845x.this.f12360A, C4845x.this.f12361B)) {
                                    C4845x.m14171a(C4845x.this, str3, true, (String) null, (String) null);
                                } else {
                                    C4845x.m14171a(C4845x.this, str3, false, "Time Stamp could not be stored", (String) null);
                                }
                            }
                        }
                    });
                }
            } else if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString()) && (a = C4845x.this.f12381V.mo34390a(C4936d.C4941e.Interstitial, fetchDemandSourceId)) != null) {
                if (a.f12640d != null && a.f12640d.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a.f12640d.get("rewarded"));
                }
                if (z3) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            C4845x.this.f12373N.mo34619b(fetchDemandSourceId, parseInt);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4943f(str));
            final C4932a aVar = new C4932a(str);
            if (!aVar.f12618c) {
                C4845x.m14171a(C4845x.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            String str2 = aVar.f12616a;
            if (C4936d.C4941e.RewardedVideo.toString().equalsIgnoreCase(str2) && C4845x.this.mo34439a(str2)) {
                final int parseInt = Integer.parseInt(aVar.f12617b);
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        if (parseInt > 0) {
                            Log.d(C4845x.this.f12383a, "onRVInitSuccess()");
                            C4845x.this.f12372M.mo34600a(C4936d.C4941e.RewardedVideo, fetchDemandSourceId, aVar);
                            return;
                        }
                        C4845x.this.f12372M.mo34618b(fetchDemandSourceId);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "adViewAPI(" + str + ")");
                C4845x.this.f12398r.mo34322a(new C4943f(str).toString(), new C4898a());
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C4845x.this.f12383a;
                Logger.m14507i(b2, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m14505e(C4845x.this.f12383a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C4936d.C4941e e;
            Map<String, C4935c> a;
            C4935c remove;
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "cleanAdInstance(" + str + ")");
                C4943f fVar = new C4943f(str);
                String d = fVar.mo34685d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (e = C4845x.m14205h(d)) != null) {
                    C4812j y = C4845x.this.f12381V;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (a = y.mo34392a(e)) != null && (remove = a.remove(fetchDemandSourceId)) != null) {
                        remove.f12643g = null;
                        if (remove.f12640d != null) {
                            remove.f12640d.clear();
                        }
                        remove.f12640d = null;
                    }
                }
            } catch (Exception e2) {
                C4845x.m14171a(C4845x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                C4984b a = C4984b.m14516a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a.f12754a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a.f12754a.edit();
                for (String str2 : strArr) {
                    if (C4984b.m14518b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                C4943f fVar = new C4943f(str);
                if (!arrayList.isEmpty()) {
                    fVar.mo34680a("removedAdsLastUpdateTime", arrayList.toString());
                }
                C4845x.m14171a(C4845x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                C4845x.m14171a(C4845x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "deleteFile(" + str + ")");
                C4943f fVar = new C4943f(str);
                String d = fVar.mo34685d("file");
                String d2 = fVar.mo34685d("path");
                if (d2 != null) {
                    if (!TextUtils.isEmpty(d)) {
                        C4948c cVar = new C4948c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C4845x.this.f12377R, d2), d);
                        if (!cVar.exists()) {
                            C4845x.m14171a(C4845x.this, str, false, "File not exist", "1");
                            return;
                        }
                        C4845x.m14171a(C4845x.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                C4845x.m14171a(C4845x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e) {
                C4845x.m14171a(C4845x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "deleteFolder(" + str + ")");
                String d = new C4943f(str).mo34685d("path");
                if (d == null) {
                    C4845x.m14171a(C4845x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C4948c cVar = new C4948c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C4845x.this.f12377R, d));
                if (!cVar.exists()) {
                    C4845x.m14171a(C4845x.this, str, false, "Folder not exist", "1");
                    return;
                }
                C4845x.m14171a(C4845x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                C4845x.m14171a(C4845x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "deviceDataAPI(" + str + ")");
                C4943f fVar = new C4943f(str);
                C4813k I = C4845x.this.f12397q;
                String fVar2 = fVar.toString();
                C4898a aVar = new C4898a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C4813k.C4814a aVar2 = new C4813k.C4814a((byte) 0);
                aVar2.f12271a = jSONObject.optString("deviceDataFunction");
                aVar2.f12272b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f12273c = jSONObject.optString("success");
                aVar2.f12274d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f12271a)) {
                    String str2 = aVar2.f12273c;
                    C4943f fVar3 = new C4943f();
                    fVar3.mo34680a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(C4407h.m12551d())));
                    fVar3.mo34680a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C4407h.m12550d(I.f12270a))));
                    fVar3.mo34680a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(C4407h.m12554e(I.f12270a))));
                    fVar3.mo34680a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(C4407h.m12556f(I.f12270a))));
                    fVar3.mo34680a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(C4407h.m12558g(I.f12270a))));
                    fVar3.mo34680a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(C4407h.m12560h(I.f12270a))));
                    aVar.mo34576a(true, str2, fVar3);
                    return;
                }
                String str3 = C4813k.f12269b;
                Logger.m14507i(str3, "unhandled API request " + fVar2);
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C4845x.this.f12383a;
                Logger.m14507i(b2, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "displayWebView(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4943f fVar = new C4943f(str);
            boolean booleanValue = ((Boolean) fVar.mo34684c(BidMachineFetcher.AD_TYPE_DISPLAY)).booleanValue();
            String d = fVar.mo34685d("productType");
            boolean e = fVar.mo34686e("standaloneView");
            String d2 = fVar.mo34685d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.mo34686e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = C4845x.this.f12380U = fVar.mo34686e("immersive");
                boolean e3 = fVar.mo34686e("activityThemeTranslucent");
                if (C4845x.this.f12390j != C4901g.Display) {
                    C4845x.this.f12390j = C4901g.Display;
                    String b2 = C4845x.this.f12383a;
                    Logger.m14507i(b2, "State: " + C4845x.this.f12390j);
                    Activity a = C4845x.this.f12401u.mo34326a();
                    String str2 = C4845x.this.f12391k;
                    int k = C4407h.m12566k(a);
                    if (e) {
                        C4809i iVar = new C4809i(a);
                        iVar.addView(C4845x.this.f12389i);
                        iVar.f12263b = C4845x.this;
                        iVar.f12263b.f12402v = iVar;
                        iVar.f12263b.requestFocus();
                        iVar.f12262a = iVar.f12263b.f12401u.mo34326a();
                        if (((((Activity) iVar.f12262a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.mo34384a()) <= 0) {
                            i = 0;
                        }
                        int b3 = iVar.mo34385b();
                        try {
                            if (iVar.f12262a != null) {
                                int o = C4407h.m12574o(iVar.f12262a);
                                if (o == 1) {
                                    iVar.setPadding(0, i, 0, b3);
                                } else if (o == 2) {
                                    iVar.setPadding(0, i, b3, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f12262a).runOnUiThread(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.controller.i.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.i.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        return;
                    }
                    Intent intent = e3 ? new Intent(a, InterstitialActivity.class) : new Intent(a, ControllerActivity.class);
                    if (C4936d.C4941e.RewardedVideo.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C4407h.m12570m(a));
                        }
                        intent.putExtra("productType", C4936d.C4941e.RewardedVideo.toString());
                        C4845x.this.f12393m.f12626e = C4936d.C4941e.RewardedVideo.ordinal();
                        C4845x.this.f12393m.f12624c = fetchDemandSourceId;
                        if (C4845x.this.mo34439a(C4936d.C4941e.RewardedVideo.toString())) {
                            C4845x.this.f12372M.mo34623c(C4936d.C4941e.RewardedVideo, fetchDemandSourceId);
                        }
                    } else if (C4936d.C4941e.OfferWall.toString().equalsIgnoreCase(d)) {
                        intent.putExtra("productType", C4936d.C4941e.OfferWall.toString());
                        C4845x.this.f12393m.f12626e = C4936d.C4941e.OfferWall.ordinal();
                    } else if (C4936d.C4941e.Interstitial.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C4407h.m12570m(a));
                        }
                        intent.putExtra("productType", C4936d.C4941e.Interstitial.toString());
                    }
                    if (d2 != null) {
                        intent.putExtra("adViewId", d2);
                    }
                    intent.putExtra("ctrWVPauseResume", e2);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", C4845x.this.f12380U);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", k);
                    C4845x xVar = C4845x.this;
                    C4866b unused3 = xVar.f12385e = new C4866b(C4845x.m14205h(d), fetchDemandSourceId);
                    a.startActivity(intent);
                    return;
                }
                String b4 = C4845x.this.f12383a;
                Logger.m14507i(b4, "State: " + C4845x.this.f12390j);
                return;
            }
            C4845x.this.f12390j = C4901g.Gone;
            C4845x.this.mo34447j();
        }

        @JavascriptInterface
        public void fileSystemAPI(final String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "fileSystemAPI(" + str + ")");
            C4845x.this.mo34440b((Runnable) new Runnable() {
                public final void run() {
                    JSONObject a;
                    try {
                        C4815l r = C4845x.this.f12399s;
                        JSONObject jSONObject = new JSONObject(str);
                        C4898a aVar = new C4898a();
                        C4818n nVar = new C4818n(jSONObject);
                        C4819o oVar = new C4819o(aVar);
                        try {
                            String str = nVar.f12280a;
                            JSONObject jSONObject2 = nVar.f12281b;
                            char c = 65535;
                            boolean z = false;
                            switch (str.hashCode()) {
                                case -2073025383:
                                    if (str.equals("saveFile")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -1137024519:
                                    if (str.equals("deleteFolder")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -318115535:
                                    if (str.equals("getTotalSizeOfFiles")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 537556755:
                                    if (str.equals("updateAttributesOfFile")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 1764172231:
                                    if (str.equals("deleteFile")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1953259713:
                                    if (str.equals("getFiles")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    C4948c a2 = C4815l.m14070a(jSONObject2, r.f12275a);
                                    C4945b bVar = r.f12276b;
                                    if (a2.exists()) {
                                        if (a2.delete()) {
                                            bVar.f12688d.mo34692a(a2.getName());
                                        } else {
                                            throw new Exception("Failed to delete file");
                                        }
                                    }
                                    a = C4815l.m14073a(nVar, a2.mo34689a());
                                } else if (c == 2) {
                                    C4948c b = C4815l.m14074b(jSONObject2, r.f12275a);
                                    C4945b bVar2 = r.f12276b;
                                    if (b.exists()) {
                                        ArrayList<C4948c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b);
                                        if (IronSourceStorageUtils.deleteFolderContentRecursive(b) && b.delete()) {
                                            z = true;
                                        }
                                        if (z) {
                                            bVar2.f12688d.mo34694a(filesInFolderRecursive);
                                        } else {
                                            throw new Exception("Failed to delete folder");
                                        }
                                    }
                                    a = C4815l.m14073a(nVar, b.mo34689a());
                                } else if (c == 3) {
                                    C4948c b2 = C4815l.m14074b(jSONObject2, r.f12275a);
                                    C4945b bVar3 = r.f12276b;
                                    if (b2.exists()) {
                                        a = C4815l.m14073a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b2, bVar3.f12688d.mo34691a()));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 4) {
                                    C4948c b3 = C4815l.m14074b(jSONObject2, r.f12275a);
                                    if (b3.exists()) {
                                        a = C4815l.m14071a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b3));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c == 5) {
                                    C4948c a3 = C4815l.m14070a(jSONObject2, r.f12275a);
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                                    C4945b bVar4 = r.f12276b;
                                    if (optJSONObject == null) {
                                        throw new Exception("Missing attributes to update");
                                    } else if (!a3.exists()) {
                                        throw new Exception("File does not exist");
                                    } else if (bVar4.f12688d.mo34695b(a3.getName(), optJSONObject)) {
                                        oVar.mo34398a(nVar, C4815l.m14073a(nVar, a3.mo34689a()));
                                        return;
                                    } else {
                                        throw new Exception("Failed to update attribute");
                                    }
                                } else {
                                    return;
                                }
                                oVar.mo34398a(nVar, a);
                                return;
                            }
                            C4948c a4 = C4815l.m14070a(jSONObject2, r.f12275a);
                            String optString = jSONObject2.optString("fileUrl");
                            C4815l.C48161 r5 = new C4969c(oVar, nVar) {

                                /* renamed from: a */
                                private /* synthetic */ C4819o f12277a;

                                /* renamed from: b */
                                private /* synthetic */ C4818n f12278b;

                                /* renamed from: a */
                                public final void mo34395a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/

                                /* renamed from: a */
                                public final void mo34396a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            };
                            C4945b bVar5 = r.f12276b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            } else if (C4407h.m12540a(bVar5.f12686b.f12698b) <= 0) {
                                throw new Exception("no_disk_space");
                            } else if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            } else if (C4377a.C43781.m12460b(bVar5.f12685a)) {
                                C4944a aVar2 = bVar5.f12687c;
                                String path = a4.getPath();
                                C4945b.C49461 r8 = new C4969c(r5) {

                                    /* renamed from: a */
                                    private /* synthetic */ C4969c f12689a;

                                    /* renamed from: a */
                                    public final void mo34395a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/

                                    /* renamed from: a */
                                    public final void mo34396a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/
                                };
                                if (path != null) {
                                    aVar2.f12684a.put(path, r8);
                                }
                                if (a4.exists()) {
                                    Message message = new Message();
                                    message.obj = a4;
                                    message.what = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                                    bVar5.f12687c.sendMessage(message);
                                    return;
                                }
                                bVar5.f12686b.mo34700a(a4, optString, bVar5.f12687c);
                            } else {
                                throw new Exception("no_network_connection");
                            }
                        } catch (Exception e) {
                            oVar.mo34399b(nVar, C4815l.m14072a(nVar, e.getMessage()));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String b4 = C4845x.this.f12383a;
                        Logger.m14507i(b4, "fileSystemAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r0 = r0.f12383a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r0 = new com.ironsource.sdk.p144g.C4943f(r5).mo34685d(com.ironsource.sdk.controller.C4845x.f12354ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r1 = new com.ironsource.sdk.p144g.C4943f(r5).mo34685d(com.ironsource.sdk.controller.C4845x.f12355ac)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.mo34685d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p144g.C4943f) r2)
                com.ironsource.sdk.controller.x r3 = com.ironsource.sdk.controller.C4845x.this
                java.lang.Object[] r5 = r3.m14194c((java.lang.String) r5, (java.lang.String) r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C4845x.m14166a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                r0.mo34441b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4845x.C4868d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            C4845x xVar;
            String str2;
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "getCachedFilesMap(" + str + ")");
            String b2 = new C4943f(str).mo34685d(C4845x.f12354ab);
            if (!TextUtils.isEmpty(b2)) {
                C4943f fVar = new C4943f(str);
                if (!fVar.mo34682a("path")) {
                    xVar = C4845x.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.mo34684c("path");
                    if (!IronSourceStorageUtils.isPathExist(C4845x.this.f12377R, str3)) {
                        xVar = C4845x.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        C4845x.this.mo34441b(C4845x.m14166a(b2, IronSourceStorageUtils.getCachedFilesMap(C4845x.this.f12377R, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                C4845x.m14171a(xVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "getConnectivityInfo(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d(C4845x.f12354ab);
            String d2 = fVar.mo34685d(C4845x.f12355ac);
            JSONObject jSONObject = new JSONObject();
            if (C4845x.this.f12384aa != null) {
                C4972b m = C4845x.this.f12384aa;
                jSONObject = m.f12718a.mo34709c(C4845x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = C4845x.m14183b(d, jSONObject.toString());
            } else {
                str2 = C4845x.m14183b(d2, C4845x.m14167a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            C4845x.this.mo34441b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "getControllerConfig(" + str + ")");
            String d = new C4943f(str).mo34685d(C4845x.f12354ab);
            if (!TextUtils.isEmpty(d)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                m14281a(controllerConfigAsJSONObject);
                m14282a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                m14284b(controllerConfigAsJSONObject);
                C4845x.this.mo34441b(C4845x.m14183b(d, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r0 = r0.f12383a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.mo34685d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p144g.C4943f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.mo34685d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.x r7 = com.ironsource.sdk.controller.C4845x.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.f12381V     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.mo34390a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f12639c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p144g.C4943f(r9).mo34685d(com.ironsource.sdk.controller.C4845x.f12354ab)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f12639c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p144g.C4943f(r9).mo34685d(com.ironsource.sdk.controller.C4845x.f12355ac)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.C4845x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.C4845x.m14183b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C4845x.this     // Catch:{ Exception -> 0x008c }
                r1.mo34441b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.C4845x.m14171a((com.ironsource.sdk.controller.C4845x) r1, (java.lang.String) r9, (boolean) r5, (java.lang.String) r2, (java.lang.String) r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4845x.C4868d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r0 = r0.f12383a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14507i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r0 = new com.ironsource.sdk.p144g.C4943f(r5).mo34685d(com.ironsource.sdk.controller.C4845x.f12354ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r5 = new com.ironsource.sdk.p144g.C4943f(r5).mo34685d(com.ironsource.sdk.controller.C4845x.f12355ac)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.C4845x.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.m14193c((android.content.Context) r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.C4845x.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C4845x.m14166a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.C4845x.this
                r0.mo34441b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4845x.C4868d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "getDeviceVolume(" + str + ")");
            try {
                C4983a.m14513a(C4845x.this.f12401u.mo34326a());
                float b2 = C4983a.m14515b(C4845x.this.f12401u.mo34326a());
                C4943f fVar = new C4943f(str);
                fVar.mo34680a("deviceVolume", String.valueOf(b2));
                C4845x.m14171a(C4845x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a = C4845x.this.f12401u.mo34326a();
            if (a != null) {
                String b = new C4943f(str).mo34685d(C4845x.f12354ab);
                String jSONObject = SDKUtils.getOrientation(a).toString();
                if (!TextUtils.isEmpty(b)) {
                    C4845x.this.mo34441b(C4845x.m14166a(b, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "getUserData(" + str2 + ")");
            C4943f fVar = new C4943f(str2);
            if (!fVar.mo34682a("key")) {
                C4845x.m14171a(C4845x.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String b2 = new C4943f(str2).mo34685d(C4845x.f12354ab);
            String d = fVar.mo34685d("key");
            String string = C4984b.m14516a().f12754a.getString(d, (String) null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            C4845x.this.mo34441b(C4845x.m14183b(b2, C4845x.m14167a(d, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "iabTokenAPI(" + str + ")");
                C4943f fVar = new C4943f(str);
                C4842v q = C4845x.this.f12396p;
                String fVar2 = fVar.toString();
                C4898a aVar = new C4898a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C4842v.C4843a aVar2 = new C4842v.C4843a((byte) 0);
                aVar2.f12350a = jSONObject.optString("functionName");
                aVar2.f12351b = jSONObject.optJSONObject("functionParams");
                aVar2.f12352c = jSONObject.optString("success");
                aVar2.f12353d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f12350a)) {
                    JSONObject jSONObject2 = aVar2.f12351b;
                    C4943f fVar3 = new C4943f();
                    try {
                        C4979c cVar = q.f12346c;
                        C4559a.m13271a("ctgp", jSONObject2);
                        q.f12345b.mo34723a(jSONObject2);
                        aVar.mo34576a(true, aVar2.f12352c, fVar3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str2 = C4842v.f12344a;
                        Logger.m14507i(str2, "updateToken exception " + e.getMessage());
                        aVar.mo34576a(false, aVar2.f12353d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f12350a)) {
                    try {
                        aVar.mo34577a(true, aVar2.f12352c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? q.mo34431a() : q.f12345b.mo34724b(q.f12347d));
                    } catch (Exception e2) {
                        String str3 = aVar2.f12353d;
                        String message = e2.getMessage();
                        C4943f fVar4 = new C4943f();
                        fVar4.mo34680a(C4845x.f12355ac, str3);
                        fVar4.mo34680a(C8849c.DATA, message);
                        C4845x.m14171a(C4845x.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = C4842v.f12344a;
                    Logger.m14507i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C4845x.this.f12383a;
                Logger.m14507i(b2, "iabTokenAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "initController(" + str + ")");
            C4943f fVar = new C4943f(str);
            if (C4845x.this.f12386f != null) {
                C4845x.this.f12386f.cancel();
                C4845x.this.f12386f = null;
            }
            if (fVar.mo34682a("stage")) {
                String d = fVar.mo34685d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    boolean unused = C4845x.this.f12364E = true;
                    C4845x.this.f12382W.mo34332b();
                } else if ("loaded".equalsIgnoreCase(d)) {
                    C4845x.this.f12382W.mo34330a();
                } else if ("failed".equalsIgnoreCase(d)) {
                    String d2 = fVar.mo34685d("errMsg");
                    C4784e h = C4845x.this.f12382W;
                    h.mo34331a("controller js failed to initialize : " + d2);
                } else {
                    Logger.m14507i(C4845x.this.f12383a, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        String b = C4845x.this.f12383a;
                        Logger.m14507i(b, "omidAPI(" + str + ")");
                        C4845x.this.f12394n.mo34412a(new C4943f(str).toString(), new C4898a());
                    } catch (Exception e) {
                        e.printStackTrace();
                        String b2 = C4845x.this.f12383a;
                        Logger.m14507i(b2, "omidAPI failed with exception " + e.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onAdWindowsClosed(" + str + ")");
            C4845x.this.f12393m.f12626e = -1;
            C4845x.this.f12393m.f12624c = null;
            C4866b unused = C4845x.this.f12385e = null;
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C4936d.C4941e e = C4845x.m14205h(d);
            String z = C4845x.this.f12404x;
            Log.d(z, "onAdClosed() with type " + e);
            if (C4845x.this.mo34439a(d)) {
                C4845x.this.mo34435a(e, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetApplicationInfoFail(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetApplicationInfoSuccess(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetCachedFilesMapFail(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetCachedFilesMapSuccess(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetDeviceStatusFail(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetDeviceStatusSuccess(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onGetUserCreditsFail(" + str + ")");
            final String d = new C4943f(str).mo34685d("errMsg");
            if (C4845x.this.mo34439a(C4936d.C4941e.OfferWall.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C4845x.this.f12374O.onGetOWCreditsFailed(str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onInitBannerFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14507i(C4845x.this.f12383a, "onInitBannerFail failed with no demand source");
                return;
            }
            C4935c a = C4845x.this.f12381V.mo34390a(C4936d.C4941e.Banner, fetchDemandSourceId);
            if (a != null) {
                a.mo34665a(3);
            }
            if (C4845x.this.mo34439a(C4936d.C4941e.Banner.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C4845x.this.f12383a;
                        Log.d(b, "onBannerInitFail(message:" + str + ")");
                        C4845x.this.f12375P.mo34601a(C4936d.C4941e.Banner, fetchDemandSourceId, str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m14507i(C4845x.this.f12383a, "onInitBannerSuccess()");
            C4845x.m14191c(C4845x.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4943f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14507i(C4845x.this.f12383a, "onInitBannerSuccess failed with no demand source");
            } else if (C4845x.this.mo34439a(C4936d.C4941e.Banner.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C4845x.this.f12383a, "onBannerInitSuccess()");
                        C4845x.this.f12375P.mo34600a(C4936d.C4941e.Banner, fetchDemandSourceId, (C4932a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onInitInterstitialFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14507i(C4845x.this.f12383a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C4935c a = C4845x.this.f12381V.mo34390a(C4936d.C4941e.Interstitial, fetchDemandSourceId);
            if (a != null) {
                a.mo34665a(3);
            }
            if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C4845x.this.f12383a;
                        Log.d(b, "onInterstitialInitFail(message:" + str + ")");
                        C4845x.this.f12373N.mo34601a(C4936d.C4941e.Interstitial, fetchDemandSourceId, str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m14507i(C4845x.this.f12383a, "onInitInterstitialSuccess()");
            C4845x.m14191c(C4845x.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4943f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14507i(C4845x.this.f12383a, "onInitInterstitialSuccess failed with no demand source");
            } else if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C4845x.this.f12383a, "onInterstitialInitSuccess()");
                        C4845x.this.f12373N.mo34600a(C4936d.C4941e.Interstitial, fetchDemandSourceId, (C4932a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onInitOfferWallFail(" + str + ")");
            C4845x.this.f12393m.f12630i = false;
            final String d = new C4943f(str).mo34685d("errMsg");
            if (C4845x.this.f12393m.f12629h) {
                C4845x.this.f12393m.f12629h = false;
                if (C4845x.this.mo34439a(C4936d.C4941e.OfferWall.toString())) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            String b = C4845x.this.f12383a;
                            Log.d(b, "onOfferWallInitFail(message:" + str + ")");
                            C4845x.this.f12374O.onOfferwallInitFail(str);
                        }
                    });
                }
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            C4845x.m14191c(C4845x.this, "onInitOfferWallSuccess", "true");
            C4845x.this.f12393m.f12630i = true;
            if (C4845x.this.f12393m.f12629h) {
                C4845x.this.f12393m.f12629h = false;
                if (C4845x.this.mo34439a(C4936d.C4941e.OfferWall.toString())) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C4845x.this.f12383a, "onOfferWallInitSuccess()");
                            C4845x.this.f12374O.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onInitRewardedVideoFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C4935c a = C4845x.this.f12381V.mo34390a(C4936d.C4941e.RewardedVideo, fetchDemandSourceId);
            if (a != null) {
                a.mo34665a(3);
            }
            if (C4845x.this.mo34439a(C4936d.C4941e.RewardedVideo.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C4845x.this.f12383a;
                        Log.d(b, "onRVInitFail(message:" + str + ")");
                        C4845x.this.f12372M.mo34601a(C4936d.C4941e.RewardedVideo, fetchDemandSourceId, str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m14507i(C4845x.this.f12383a, "onLoadBannerFail()");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && C4845x.this.mo34439a(C4936d.C4941e.Banner.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C4845x.this.f12383a, "onLoadBannerFail()");
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C4845x.this.f12375P.mo34629d(fetchDemandSourceId, str);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m14507i(C4845x.this.f12383a, "onLoadBannerSuccess()");
            C4943f fVar = new C4943f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.mo34685d("adViewId");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4768e a = C4766d.m13973a().mo34275a(d);
            if (a == null) {
                C4955b E = C4845x.this.f12375P;
                E.mo34629d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (a instanceof C4759a) {
                final C4759a aVar = (C4759a) a;
                if (C4845x.this.mo34439a(C4936d.C4941e.Banner.toString())) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C4845x.this.f12383a, "onBannerLoadSuccess()");
                            C4845x.this.f12375P.mo34605a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onLoadInterstitialFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m14280a(fetchDemandSourceId, false);
                if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C4845x.this.f12373N.mo34620b(fetchDemandSourceId, str);
                        }
                    });
                }
                C4845x.m14191c(C4845x.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4943f(str));
            m14280a(fetchDemandSourceId, true);
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        C4845x.this.f12373N.mo34624c(fetchDemandSourceId);
                    }
                });
            }
            C4845x.m14191c(C4845x.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowInterstitialFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m14280a(fetchDemandSourceId, false);
                if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C4845x.this.f12373N.mo34625c(fetchDemandSourceId, str);
                        }
                    });
                }
                C4845x.m14191c(C4845x.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowInterstitialSuccess(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C4943f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14507i(C4845x.this.f12383a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C4845x.this.f12393m.f12626e = C4936d.C4941e.Interstitial.ordinal();
            C4845x.this.f12393m.f12624c = fetchDemandSourceId;
            if (C4845x.this.mo34439a(C4936d.C4941e.Interstitial.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        C4845x.this.f12373N.mo34623c(C4936d.C4941e.Interstitial, fetchDemandSourceId);
                        C4845x.this.f12373N.mo34628d(fetchDemandSourceId);
                    }
                });
                C4845x.m14191c(C4845x.this, "onShowInterstitialSuccess", str);
            }
            m14280a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowOfferWallFail(" + str + ")");
            final String d = new C4943f(str).mo34685d("errMsg");
            if (C4845x.this.mo34439a(C4936d.C4941e.OfferWall.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C4845x.this.f12374O.onOWShowFail(str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowOfferWallSuccess(" + str + ")");
            C4845x.this.f12393m.f12626e = C4936d.C4941e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (C4845x.this.mo34439a(C4936d.C4941e.OfferWall.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        C4845x.this.f12374O.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowRewardedVideoFail(" + str + ")");
            C4943f fVar = new C4943f(str);
            final String d = fVar.mo34685d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (C4845x.this.mo34439a(C4936d.C4941e.RewardedVideo.toString())) {
                C4845x.this.mo34442c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C4845x.this.f12383a;
                        Log.d(b, "onRVShowFail(message:" + d + ")");
                        C4845x.this.f12372M.mo34606a(fetchDemandSourceId, str);
                    }
                });
            }
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onShowRewardedVideoSuccess(" + str + ")");
            C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
            C4845x.m14191c(C4845x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String b = C4845x.this.f12383a;
            Log.d(b, "onVideoStatusChanged(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d("productType");
            if (C4845x.this.f12392l != null && !TextUtils.isEmpty(d)) {
                String d2 = fVar.mo34685d("status");
                if ("started".equalsIgnoreCase(d2)) {
                    C4845x.this.f12392l.onVideoStarted();
                } else if ("paused".equalsIgnoreCase(d2)) {
                    C4845x.this.f12392l.onVideoPaused();
                } else if ("playing".equalsIgnoreCase(d2)) {
                    C4845x.this.f12392l.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d2)) {
                    C4845x.this.f12392l.onVideoEnded();
                } else if ("stopped".equalsIgnoreCase(d2)) {
                    C4845x.this.f12392l.onVideoStopped();
                } else {
                    String b2 = C4845x.this.f12383a;
                    Logger.m14507i(b2, "onVideoStatusChanged: unknown status: " + d2);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "openUrl(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d("url");
            String d2 = fVar.mo34685d("method");
            String d3 = fVar.mo34685d("package_name");
            Activity a = C4845x.this.f12401u.mo34326a();
            try {
                String lowerCase = d2.toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c = 0;
                }
                if (c == 0) {
                    C4377a.C43781.m12456a(a, d, d3);
                } else if (c == 1) {
                    Intent intent = new Intent(a, OpenUrlActivity.class);
                    intent.putExtra(C4845x.f12357c, d);
                    intent.putExtra(C4845x.f12358d, true);
                    intent.putExtra("immersive", C4845x.this.f12380U);
                    a.startActivity(intent);
                } else if (c == 2) {
                    Intent intent2 = new Intent(a, OpenUrlActivity.class);
                    intent2.putExtra(C4845x.f12357c, d);
                    intent2.putExtra(C4845x.f12356b, true);
                    intent2.putExtra(C4845x.f12358d, true);
                    a.startActivity(intent2);
                }
            } catch (Exception e) {
                C4845x.m14171a(C4845x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    C4845x.this.mo34448k();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            C4943f fVar;
            String str2;
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "permissionsAPI(" + str + ")");
                C4943f fVar2 = new C4943f(str);
                C4835r H = C4845x.this.f12395o;
                String fVar3 = fVar2.toString();
                C4898a aVar = new C4898a();
                JSONObject jSONObject = new JSONObject(fVar3);
                C4835r.C4836a aVar2 = new C4835r.C4836a((byte) 0);
                aVar2.f12328a = jSONObject.optString("functionName");
                aVar2.f12329b = jSONObject.optJSONObject("functionParams");
                aVar2.f12330c = jSONObject.optString("success");
                aVar2.f12331d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f12328a)) {
                    JSONObject jSONObject2 = aVar2.f12329b;
                    fVar = new C4943f();
                    try {
                        fVar.mo34681a("permissions", C4386c.m12475a(H.f12327a, jSONObject2.getJSONArray("permissions")));
                        aVar.mo34576a(true, aVar2.f12330c, fVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = C4835r.f12326b;
                        Logger.m14507i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.mo34680a("errMsg", e.getMessage());
                        str2 = aVar2.f12331d;
                        aVar.mo34576a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f12328a)) {
                    JSONObject jSONObject3 = aVar2.f12329b;
                    fVar = new C4943f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.mo34680a("permission", string);
                        if (C4386c.m12476a(H.f12327a, string)) {
                            fVar.mo34680a("status", String.valueOf(C4386c.m12478b(H.f12327a, string)));
                            aVar.mo34576a(true, aVar2.f12330c, fVar);
                            return;
                        }
                        fVar.mo34680a("status", "unhandledPermission");
                        aVar.mo34576a(false, aVar2.f12331d, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.mo34680a("errMsg", e2.getMessage());
                        str2 = aVar2.f12331d;
                        aVar.mo34576a(false, str2, fVar);
                    }
                } else {
                    String str4 = C4835r.f12326b;
                    Logger.m14507i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C4845x.this.f12383a;
                Logger.m14507i(b2, "permissionsAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "postAdEventNotification(" + str2 + ")");
                C4943f fVar = new C4943f(str2);
                final String d = fVar.mo34685d("eventName");
                if (TextUtils.isEmpty(d)) {
                    C4845x.m14171a(C4845x.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.mo34685d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.mo34684c("extData");
                String d3 = fVar.mo34685d("productType");
                C4936d.C4941e e = C4845x.m14205h(d3);
                if (C4845x.this.mo34439a(d3)) {
                    String b2 = new C4943f(str2).mo34685d(C4845x.f12354ab);
                    if (!TextUtils.isEmpty(b2)) {
                        C4845x.this.mo34441b(C4845x.m14166a(b2, C4845x.m14167a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    final C4936d.C4941e eVar = e;
                    final String str4 = str3;
                    final JSONObject jSONObject2 = jSONObject;
                    C4845x.this.mo34442c((Runnable) new Runnable() {
                        public final void run() {
                            if (eVar == C4936d.C4941e.Interstitial || eVar == C4936d.C4941e.RewardedVideo || eVar == C4936d.C4941e.Banner) {
                                C4954a a = C4845x.this.m14180b(eVar);
                                if (a != null) {
                                    a.mo34602a(eVar, str4, d, jSONObject2);
                                }
                            } else if (eVar == C4936d.C4941e.OfferWall) {
                                C4845x.this.f12374O.onOfferwallEventNotificationReceived(d, jSONObject2);
                            }
                        }
                    });
                    return;
                }
                C4845x.m14171a(C4845x.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "removeCloseEventHandler(" + str + ")");
            if (C4845x.this.f12366G != null) {
                C4845x.this.f12366G.cancel();
            }
            boolean unused = C4845x.this.f12365F = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    C4845x.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    C4845x.this.mo34449l();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String b = C4845x.this.f12383a;
                Logger.m14507i(b, "saveFile(" + str + ")");
                C4943f fVar = new C4943f(str);
                String d = fVar.mo34685d("path");
                String d2 = fVar.mo34685d("file");
                if (TextUtils.isEmpty(d2)) {
                    C4845x.m14171a(C4845x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C4948c cVar = new C4948c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C4845x.this.f12377R, d), SDKUtils.getFileName(d2));
                if (C4407h.m12540a(C4845x.this.f12377R) <= 0) {
                    C4845x.m14171a(C4845x.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    C4845x.m14171a(C4845x.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    C4845x.m14171a(C4845x.this, str, false, "file_already_exist", (String) null);
                } else if (!C4377a.C43781.m12460b(C4845x.this.getContext())) {
                    C4845x.m14171a(C4845x.this, str, false, "no_network_connection", (String) null);
                } else {
                    C4845x.m14171a(C4845x.this, str, true, (String) null, (String) null);
                    C4965b o = C4845x.this.f12363D;
                    o.mo34700a(cVar, d2, o.f12697a);
                }
            } catch (Exception e) {
                C4845x.m14171a(C4845x.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setBackButtonState(" + str + ")");
            String d = new C4943f(str).mo34685d("state");
            SharedPreferences.Editor edit = C4984b.m14516a().f12754a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setForceClose(" + str + ")");
            C4943f fVar = new C4943f(str);
            String d = fVar.mo34685d(IabUtils.KEY_WIDTH);
            String d2 = fVar.mo34685d(IabUtils.KEY_HEIGHT);
            int unused = C4845x.this.f12367H = Integer.parseInt(d);
            int unused2 = C4845x.this.f12368I = Integer.parseInt(d2);
            String unused3 = C4845x.this.f12369J = fVar.mo34685d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setMixedContentAlwaysAllow(" + str + ")");
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        C4845x.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setOrientation(" + str + ")");
            String d = new C4943f(str).mo34685d("orientation");
            C4845x.this.f12391k = d;
            if (C4845x.this.f12402v != null) {
                C4845x.this.f12402v.onOrientationChanged(d, C4407h.m12566k(C4845x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = C4984b.m14516a().f12754a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "removeCloseEventHandler(" + str + ")");
            C4845x.this.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    C4845x.this.setOnTouchListener(new C4902h(C4845x.this, (byte) 0));
                }
            });
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setUserData(" + str2 + ")");
            C4943f fVar = new C4943f(str2);
            if (!fVar.mo34682a("key")) {
                C4845x.m14171a(C4845x.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.mo34682a(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                C4845x.m14171a(C4845x.this, str2, false, "value does not exist", (String) null);
            } else {
                String d = fVar.mo34685d("key");
                String d2 = fVar.mo34685d(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                SharedPreferences.Editor edit = C4984b.m14516a().f12754a.edit();
                edit.putString(d, d2);
                if (edit.commit()) {
                    C4845x.this.mo34441b(C4845x.m14183b(new C4943f(str2).mo34685d(C4845x.f12354ab), C4845x.m14167a(d, d2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    return;
                }
                C4845x.m14171a(C4845x.this, str2, false, "SetUserData failed writing to shared preferences", (String) null);
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String b = C4845x.this.f12383a;
            Logger.m14507i(b, "setWebviewBackgroundColor(" + str + ")");
            C4845x.m14202g(C4845x.this, str);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$e */
    interface C4899e {
        /* renamed from: a */
        void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.x$f */
    static class C4900f {

        /* renamed from: a */
        String f12521a;

        /* renamed from: b */
        String f12522b;

        C4900f() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$g */
    public enum C4901g {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.x$h */
    class C4902h implements View.OnTouchListener {
        private C4902h() {
        }

        /* synthetic */ C4902h(C4845x xVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String b = C4845x.this.f12383a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.m14507i(b, sb.toString());
                int m = C4407h.m12569m();
                int n = C4407h.m12571n();
                String b2 = C4845x.this.f12383a;
                Logger.m14507i(b2, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) C4845x.this.f12367H);
                int dpToPx2 = SDKUtils.dpToPx((long) C4845x.this.f12368I);
                if ("top-right".equalsIgnoreCase(C4845x.this.f12369J)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(C4845x.this.f12369J)) {
                    if ("bottom-right".equalsIgnoreCase(C4845x.this.f12369J)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(C4845x.this.f12369J)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = C4845x.this.f12365F = false;
                    if (C4845x.this.f12366G != null) {
                        C4845x.this.f12366G.cancel();
                    }
                    CountDownTimer unused2 = C4845x.this.f12366G = new CountDownTimer(2000, 500) {
                        public final void onFinish() {
                            Logger.m14507i(C4845x.this.f12383a, "Close Event Timer Finish");
                            if (C4845x.this.f12365F) {
                                boolean unused = C4845x.this.f12365F = false;
                            } else {
                                C4845x.this.mo34444e("forceClose");
                            }
                        }

                        public final void onTick(long j) {
                            String b = C4845x.this.f12383a;
                            Logger.m14507i(b, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$i */
    class C4904i extends WebViewClient {
        private C4904i() {
        }

        /* synthetic */ C4904i(C4845x xVar, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.m14507i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                C4845x.this.mo34441b(C4845x.m14201g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m14507i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m14507i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && C4845x.this.f12382W != null) {
                C4784e h = C4845x.this.f12382W;
                h.mo34331a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C4845x.this.f12383a;
            Log.e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C4845x.this.f12382W != null) {
                C4845x.this.f12382W.mo34333b(str);
            }
            C4845x xVar = C4845x.this;
            if (xVar.f12385e == null) {
                return true;
            }
            xVar.mo34447j();
            C4936d.C4941e eVar = xVar.f12385e.f12441a;
            String str2 = xVar.f12385e.f12442b;
            if (!xVar.mo34439a(eVar.toString())) {
                return true;
            }
            xVar.mo34435a(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.m14507i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = "file://" + C4845x.this.f12377R + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m14507i("shouldOverrideUrlLoading", str);
            try {
                if (C4845x.this.mo34445f(str)) {
                    C4845x.this.mo34446i();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C4845x(Context context, C4812j jVar, C4782c cVar, C4784e eVar, C4399a aVar) {
        super(context);
        Logger.m14507i(this.f12383a, "C'tor");
        this.f12401u = cVar;
        this.f12382W = eVar;
        this.f12403w = aVar;
        this.f12377R = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.f12381V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f12389i = new FrameLayout(context);
        this.f12370K = new FrameLayout(context);
        this.f12370K.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12370K.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f12389i.addView(this.f12370K, layoutParams);
        this.f12389i.addView(frameLayout);
        this.f12393m = new C4933b();
        C4965b a = mo34432a();
        this.f12363D = a;
        a.f12697a.f12695a = this;
        this.f12378S = new C4785f(SDKUtils.getNetworkConfiguration(), this.f12377R, SDKUtils.getControllerUrl(), this.f12363D);
        this.f12387g = new C4865a(this, (byte) 0);
        setWebViewClient(new C4904i(this, (byte) 0));
        setWebChromeClient(this.f12387g);
        C4987d.m14534a(this);
        C4838t tVar = new C4838t(UUID.randomUUID().toString());
        addJavascriptInterface(new C4808h(new C4783d(new C4868d()), tVar), APSAnalytics.OS_NAME);
        addJavascriptInterface(new C4837s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.f12384aa = new C4972b(SDKUtils.getControllerConfigAsJSONObject(), context) {
            /* renamed from: a */
            public final void mo34453a() {
                if (C4845x.this.f12364E) {
                    C4845x.this.mo34443d("none");
                }
            }

            /* renamed from: a */
            public final void mo34454a(String str) {
                if (C4845x.this.f12364E) {
                    C4845x.this.mo34443d(str);
                }
            }

            /* renamed from: a */
            public final void mo34455a(String str, JSONObject jSONObject) {
                if (jSONObject != null && C4845x.this.f12364E) {
                    try {
                        jSONObject.put("connectionType", str);
                        C4845x xVar = C4845x.this;
                        String str2 = xVar.f12383a;
                        Logger.m14507i(str2, "device connection info changed: " + jSONObject.toString());
                        xVar.mo34441b(C4845x.m14183b("connectionInfoChanged", C4845x.m14167a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mo34341a(context);
        f12359y = FeaturesManager.getInstance().getDebugMode();
    }

    /* renamed from: a */
    private String m14165a(C4936d.C4941e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C4935c a = this.f12381V.mo34390a(eVar, fetchDemandSourceId);
        if (a != null) {
            if (a.f12640d != null) {
                hashMap.putAll(a.f12640d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a2 = m14168a(eVar);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        C4929a.C4930a a3 = C4929a.C4930a.m14384a(eVar);
        return m14166a(a3.f12606a, flatMapToJsonAsString, a3.f12607b, a3.f12608c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m14166a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    /* renamed from: a */
    public static String m14167a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private Map<String, String> m14168a(C4936d.C4941e eVar) {
        if (eVar == C4936d.C4941e.OfferWall) {
            return this.f12362C;
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m14170a(C4845x xVar, final String str, final C4936d.C4941e eVar, final C4935c cVar) {
        if (xVar.mo34439a(eVar.toString())) {
            xVar.mo34442c((Runnable) new Runnable() {
                public final void run() {
                    if (C4936d.C4941e.RewardedVideo == eVar || C4936d.C4941e.Interstitial == eVar || C4936d.C4941e.Banner == eVar) {
                        C4935c cVar = cVar;
                        if (cVar != null && !TextUtils.isEmpty(cVar.f12638b)) {
                            C4954a a = C4845x.this.m14180b(eVar);
                            String b = C4845x.this.f12383a;
                            Log.d(b, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                            if (a != null) {
                                a.mo34601a(eVar, cVar.f12638b, str);
                            }
                        }
                    } else if (C4936d.C4941e.OfferWall == eVar) {
                        C4845x.this.f12374O.onOfferwallInitFail(str);
                    } else if (C4936d.C4941e.OfferWallCredits == eVar) {
                        C4845x.this.f12374O.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m14171a(com.ironsource.sdk.controller.C4845x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = f12354ab
            java.lang.String r1 = r0.mo34685d(r1)
            java.lang.String r2 = f12355ac
            java.lang.String r0 = r0.mo34685d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005c
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0040
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0055
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            java.lang.String r4 = m14183b((java.lang.String) r1, (java.lang.String) r4)
            r3.mo34441b((java.lang.String) r4)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4845x.m14171a(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m14172a(C4845x xVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview") && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: a */
    private void m14173a(String str, String str2, C4936d.C4941e eVar, C4935c cVar, C4899e eVar2) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.mo34462a("User id or Application key are missing", eVar, cVar);
            return;
        }
        C4900f fVar = new C4900f();
        if (eVar == C4936d.C4941e.RewardedVideo || eVar == C4936d.C4941e.Interstitial || eVar == C4936d.C4941e.OfferWall || eVar == C4936d.C4941e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f12360A);
            hashMap.put("applicationUserId", this.f12361B);
            if (cVar != null) {
                if (cVar.f12640d != null) {
                    hashMap.putAll(cVar.f12640d);
                    C4977a aVar = C4977a.f12725a;
                    hashMap.put("loadStartTime", String.valueOf(C4977a.m14471a(cVar.f12638b)));
                }
                hashMap.put("demandSourceName", cVar.f12637a);
                hashMap.put("demandSourceId", cVar.f12638b);
            }
            Map<String, String> a = m14168a(eVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            C4929a.C4930a aVar2 = new C4929a.C4930a();
            if (eVar == C4936d.C4941e.RewardedVideo) {
                aVar2.f12606a = "initRewardedVideo";
                aVar2.f12607b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == C4936d.C4941e.Interstitial) {
                aVar2.f12606a = "initInterstitial";
                aVar2.f12607b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == C4936d.C4941e.OfferWall) {
                aVar2.f12606a = "initOfferWall";
                aVar2.f12607b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == C4936d.C4941e.Banner) {
                    aVar2.f12606a = "initBanner";
                    aVar2.f12607b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = m14166a(aVar2.f12606a, flatMapToJsonAsString, aVar2.f12607b, aVar2.f12608c);
                str3 = aVar2.f12606a;
            }
            aVar2.f12608c = str5;
            str4 = m14166a(aVar2.f12606a, flatMapToJsonAsString, aVar2.f12607b, aVar2.f12608c);
            str3 = aVar2.f12606a;
        } else {
            if (eVar == C4936d.C4941e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = m14166a(str3, m14167a("productType", "OfferWall", "applicationKey", this.f12360A, "applicationUserId", this.f12361B, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            mo34441b(fVar.f12522b);
        }
        fVar.f12521a = str3;
        fVar.f12522b = str4;
        mo34441b(fVar.f12522b);
    }

    /* renamed from: a */
    private void m14174a(String str, String str2, String str3) {
        try {
            mo34441b(m14183b("assetCachedFailed", m14167a("file", str, "path", m14208i(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static int m14178b() {
        return f12359y;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C4954a m14180b(C4936d.C4941e eVar) {
        if (eVar == C4936d.C4941e.Interstitial) {
            return this.f12373N;
        }
        if (eVar == C4936d.C4941e.RewardedVideo) {
            return this.f12372M;
        }
        if (eVar == C4936d.C4941e.Banner) {
            return this.f12375P;
        }
        return null;
    }

    /* renamed from: b */
    public static String m14183b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* renamed from: b */
    private String m14184b(JSONObject jSONObject) {
        C4983a a = C4983a.m14513a(getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append("&");
        }
        String str = a.f12749c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(f12359y);
        }
        return sb.toString();
    }

    /* renamed from: b */
    static /* synthetic */ void m14185b(C4845x xVar, Context context) {
        try {
            if (xVar.f12384aa != null) {
                xVar.f12384aa.f12718a.mo34707a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m14190c(C4845x xVar, Context context) {
        try {
            if (xVar.f12384aa != null) {
                xVar.f12384aa.f12718a.mo34708b(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m14191c(C4845x xVar, final String str, String str2) {
        final String d = new C4943f(str2).mo34685d("errMsg");
        if (!TextUtils.isEmpty(d)) {
            xVar.mo34436a((Runnable) new Runnable() {
                public final void run() {
                    if (C4845x.m14178b() == C4936d.C4940d.MODE_3.f12673d) {
                        Activity a = C4845x.this.f12401u.mo34326a();
                        Toast.makeText(a, str + " : " + d, 1).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m14193c(Context context) {
        boolean z;
        C4983a a = C4983a.m14513a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(C4407h.m12574o(context)));
            String str = a.f12747a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f12748b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m14507i(this.f12383a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a.f12749c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z = true;
                }
                String str4 = a.f12750d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String str5 = a.f12750d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a.f12751e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (a.f12752f != null && a.f12752f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f12752f));
                }
                String a2 = C4370a.m12414a(context);
                if (!a2.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), C4370a.m12419c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C4407h.m12540a(this.f12377R))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(C4407h.m12569m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(IabUtils.KEY_WIDTH) + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z = true;
                }
                String valueOf4 = String.valueOf(C4407h.m12571n());
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(IabUtils.KEY_HEIGHT) + "]", SDKUtils.encodeString(valueOf4));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf5 = String.valueOf(C4407h.m12573o());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
                }
                String valueOf6 = String.valueOf(C4407h.m12564j());
                if (!TextUtils.isEmpty(valueOf6)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
                }
                C4983a.m14513a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C4983a.m14515b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), C4407h.m12585v(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C4377a.C43781.m12462c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C4377a.C43781.m12465d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), C4377a.C43781.m12468f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C4377a.C43781.m12467e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C4386c.m12477b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C4386c.m12474a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C4386c.m12479c(context)));
                String d = C4386c.m12481d(context);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), C4412k.m12593a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), C4407h.m12589z(context));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e2) {
            e = e2;
            z = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m14194c(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            C4936d.C4941e h = m14205h(str);
            if (h == C4936d.C4941e.OfferWall) {
                map = this.f12362C;
            } else {
                C4935c a = this.f12381V.mo34390a(h, str2);
                if (a != null) {
                    Map<String, String> map2 = a.f12640d;
                    map2.put("demandSourceName", a.f12637a);
                    map2.put("demandSourceId", a.f12638b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f12361B)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f12361B));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f12360A)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f12360A));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase(BuildConfig.ADAPTER_VERSION)) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* renamed from: g */
    static String m14201g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* renamed from: g */
    static /* synthetic */ void m14202g(C4845x xVar, String str) {
        C4943f fVar = new C4943f(str);
        String d = fVar.mo34685d("color");
        String d2 = fVar.mo34685d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d) ? Color.parseColor(d) : 0;
        if (d2 != null) {
            WebView b = C4766d.m13973a().mo34275a(d2).mo34261b();
            if (b != null) {
                b.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        xVar.setBackgroundColor(parseColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C4936d.C4941e m14205h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(C4936d.C4941e.Interstitial.toString())) {
            return C4936d.C4941e.Interstitial;
        }
        if (str.equalsIgnoreCase(C4936d.C4941e.RewardedVideo.toString())) {
            return C4936d.C4941e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(C4936d.C4941e.OfferWall.toString())) {
            return C4936d.C4941e.OfferWall;
        }
        if (str.equalsIgnoreCase(C4936d.C4941e.Banner.toString())) {
            return C4936d.C4941e.Banner;
        }
        return null;
    }

    /* renamed from: h */
    static /* synthetic */ void m14206h(C4845x xVar, String str) {
        try {
            String str2 = xVar.f12383a;
            Logger.m14507i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.f12383a;
            Logger.m14505e(str3, "WebViewController::load: " + th);
        }
    }

    /* renamed from: i */
    private String m14208i(String str) {
        String str2 = this.f12377R + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4965b mo34432a() {
        return C4965b.m14441a(this.f12377R, this.f12403w);
    }

    /* renamed from: a */
    public final void mo34433a(int i) {
        if (this.f12378S.mo34335a()) {
            final JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            String b = m14184b(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                b = String.format("%s&sessionid=%s", new Object[]{b, initSDKParams.get("sessionid")});
            }
            final String str = this.f12378S.mo34338d().toURI().toString() + "?" + b;
            this.f12403w.mo33205a(new Runnable() {
                public final void run() {
                    C4845x.m14172a(C4845x.this, controllerConfigAsJSONObject);
                    C4845x.m14206h(C4845x.this, "about:blank");
                    C4845x.m14206h(C4845x.this, str);
                }
            });
            this.f12386f = new CountDownTimer(50000, 1000, i) {

                /* renamed from: b */
                private /* synthetic */ int f12415b;

                {
                    this.f12415b = r6;
                }

                public final void onFinish() {
                    Logger.m14507i(C4845x.this.f12383a, "Loading Controller Timer Finish");
                    int i = this.f12415b;
                    if (i == 3) {
                        C4845x.this.mo34442c((Runnable) new Runnable() {
                            public final void run() {
                                C4845x.this.f12382W.mo34331a("controller html - failed to load into web-view");
                            }
                        });
                    } else {
                        C4845x.this.mo34433a(i + 1);
                    }
                }

                public final void onTick(long j) {
                    String b = C4845x.this.f12383a;
                    Logger.m14507i(b, "Loading Controller Timer Tick " + j);
                }
            }.start();
            return;
        }
        Logger.m14507i(this.f12383a, "load(): Mobile Controller HTML Does not exist");
    }

    /* renamed from: a */
    public final void mo34341a(final Context context) {
        mo34440b((Runnable) new Runnable() {
            public final void run() {
                C4845x.m14185b(C4845x.this, context);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34434a(com.ironsource.sdk.p144g.C4933b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f12379T
            monitor-enter(r0)
            boolean r1 = r11.f12625d     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = r10.f12364E     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0144 }
            r2.append(r11)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f12626e     // Catch:{ all -> 0x0144 }
            r2 = -1
            if (r1 == r2) goto L_0x0089
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p144g.C4936d.C4941e.RewardedVideo     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onRVAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p144g.C4936d.C4941e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f12624c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m14180b((com.ironsource.sdk.p144g.C4936d.C4941e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
        L_0x0047:
            r4.mo34599a(r1, r3)     // Catch:{ all -> 0x0144 }
            goto L_0x0083
        L_0x004b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p144g.C4936d.C4941e.Interstitial     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x006b
            java.lang.String r1 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p144g.C4936d.C4941e.Interstitial     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f12624c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m14180b((com.ironsource.sdk.p144g.C4936d.C4941e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
            goto L_0x0047
        L_0x006b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p144g.C4936d.C4941e.OfferWall     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x0083
            java.lang.String r1 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.e r1 = r10.f12374O     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0083
            com.ironsource.sdk.j.e r1 = r10.f12374O     // Catch:{ all -> 0x0144 }
            r1.onOWAdClosed()     // Catch:{ all -> 0x0144 }
        L_0x0083:
            r11.f12626e = r2     // Catch:{ all -> 0x0144 }
            r1 = 0
            r11.f12624c = r1     // Catch:{ all -> 0x0144 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r1 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
        L_0x0090:
            java.lang.String r1 = r11.f12627f     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f12628g     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f12381V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p144g.C4936d.C4941e.Interstitial     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo34394b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00a0:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p144g.C4935c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f12641e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00a0
            java.lang.String r5 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r4.f12637a     // Catch:{ all -> 0x0144 }
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.c r5 = r10.f12373N     // Catch:{ all -> 0x0144 }
            r10.mo34347a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p144g.C4935c) r4, (com.ironsource.sdk.p147j.p148a.C4956c) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x00a0
        L_0x00e1:
            java.lang.String r1 = r11.f12622a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f12623b     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f12381V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p144g.C4936d.C4941e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo34394b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p144g.C4935c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f12641e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00f1
            java.lang.String r6 = r4.f12637a     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r7 = r10.f12372M     // Catch:{ all -> 0x0144 }
            r7.mo34618b(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f12383a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r6 = r10.f12372M     // Catch:{ all -> 0x0144 }
            r10.mo34348a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p144g.C4935c) r4, (com.ironsource.sdk.p147j.p148a.C4957d) r6)     // Catch:{ all -> 0x0144 }
            goto L_0x00f1
        L_0x013d:
            r1 = 0
            r11.f12625d = r1     // Catch:{ all -> 0x0144 }
        L_0x0140:
            r10.f12393m = r11     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C4845x.mo34434a(com.ironsource.sdk.g.b):void");
    }

    /* renamed from: a */
    public final void mo34342a(C4935c cVar, Map<String, String> map, C4955b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo34664a()});
        if (map != null) {
            mo34441b(m14166a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    /* renamed from: a */
    public final void mo34343a(C4935c cVar, Map<String, String> map, C4956c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo34664a()});
        this.f12393m.mo34658a(cVar.f12638b, true);
        mo34441b(m14166a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34435a(final C4936d.C4941e eVar, final String str) {
        mo34442c((Runnable) new Runnable() {
            public final void run() {
                if (eVar == C4936d.C4941e.RewardedVideo || eVar == C4936d.C4941e.Interstitial) {
                    C4954a a = C4845x.this.m14180b(eVar);
                    if (a != null) {
                        a.mo34599a(eVar, str);
                    }
                } else if (eVar == C4936d.C4941e.OfferWall) {
                    C4845x.this.f12374O.onOWAdClosed();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo34395a(C4948c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C4785f fVar = this.f12378S;
            C48594 r0 = new Runnable() {
                public final void run() {
                    C4845x.this.mo34433a(1);
                }
            };
            if (!fVar.mo34335a()) {
                if (fVar.f12175c == C4785f.C4788a.f12183b) {
                    fVar.mo34337c();
                }
                fVar.f12176d = C4785f.C4789b.CONTROLLER_FROM_SERVER;
                fVar.mo34334a(fVar.f12176d);
                r0.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            mo34441b(m14183b("assetCached", m14167a("file", name, "path", m14208i(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e) {
            m14174a(name, parent, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo34396a(C4948c cVar, final C4942e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C4785f fVar = this.f12378S;
            C48605 r0 = new Runnable() {
                public final void run() {
                    C4845x.this.mo34433a(1);
                }
            };
            C48616 r1 = new Runnable() {
                public final void run() {
                    C4784e h = C4845x.this.f12382W;
                    h.mo34331a("controller html - failed to download - " + eVar.f12681a);
                }
            };
            if (fVar.mo34335a()) {
                return;
            }
            if (fVar.f12175c != C4785f.C4788a.f12183b || !fVar.mo34339e()) {
                C4743a a = new C4743a().mo34234a("generalmessage", Integer.valueOf(fVar.f12174b));
                if (fVar.f12173a > 0) {
                    a.mo34234a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f12173a));
                }
                C4747d.m13921a(C4749f.f12056t, (Map<String, Object>) a.f12028a);
                r1.run();
                return;
            }
            fVar.f12176d = C4785f.C4789b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.mo34334a(fVar.f12176d);
            r0.run();
            return;
        }
        m14174a(cVar.getName(), cVar.getParent(), eVar.f12681a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34436a(Runnable runnable) {
        C4399a aVar = this.f12403w;
        if (aVar != null) {
            aVar.mo33205a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo34345a(String str, C4956c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f12393m.mo34658a(str, true);
        mo34441b(m14166a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo34437a(String str, String str2) {
        mo34441b(m14183b("onNativeLifeCycleEvent", m14167a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: a */
    public final void mo34346a(String str, String str2, C4935c cVar, C4955b bVar) {
        this.f12360A = str;
        this.f12361B = str2;
        this.f12375P = bVar;
        m14173a(str, str2, C4936d.C4941e.Banner, cVar, (C4899e) new C4899e() {
            /* renamed from: a */
            public final void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar) {
                C4845x.m14170a(C4845x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34347a(String str, String str2, C4935c cVar, C4956c cVar2) {
        this.f12360A = str;
        this.f12361B = str2;
        this.f12373N = cVar2;
        this.f12393m.f12627f = str;
        this.f12393m.f12628g = this.f12361B;
        m14173a(this.f12360A, this.f12361B, C4936d.C4941e.Interstitial, cVar, (C4899e) new C4899e() {
            /* renamed from: a */
            public final void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar) {
                C4845x.m14170a(C4845x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34348a(String str, String str2, C4935c cVar, C4957d dVar) {
        this.f12360A = str;
        this.f12361B = str2;
        this.f12372M = dVar;
        this.f12393m.f12622a = str;
        this.f12393m.f12623b = str2;
        m14173a(str, str2, C4936d.C4941e.RewardedVideo, cVar, (C4899e) new C4899e() {
            /* renamed from: a */
            public final void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar) {
                C4845x.m14170a(C4845x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34349a(String str, String str2, C4961e eVar) {
        this.f12360A = str;
        this.f12361B = str2;
        this.f12374O = eVar;
        m14173a(str, str2, C4936d.C4941e.OfferWallCredits, (C4935c) null, (C4899e) new C4899e() {
            /* renamed from: a */
            public final void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar) {
                C4845x.m14170a(C4845x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34350a(String str, String str2, Map<String, String> map, C4961e eVar) {
        this.f12360A = str;
        this.f12361B = str2;
        this.f12362C = map;
        this.f12374O = eVar;
        this.f12393m.f12631j = map;
        this.f12393m.f12629h = true;
        m14173a(this.f12360A, this.f12361B, C4936d.C4941e.OfferWall, (C4935c) null, (C4899e) new C4899e() {
            /* renamed from: a */
            public final void mo34462a(String str, C4936d.C4941e eVar, C4935c cVar) {
                C4845x.m14170a(C4845x.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34351a(Map<String, String> map, C4961e eVar) {
        this.f12362C = map;
        mo34441b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    /* renamed from: a */
    public final void mo34352a(JSONObject jSONObject) {
        mo34441b(m14183b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public final void mo34353a(JSONObject jSONObject, C4956c cVar) {
        mo34441b(m14165a(C4936d.C4941e.Interstitial, jSONObject));
    }

    /* renamed from: a */
    public final void mo34354a(JSONObject jSONObject, C4957d dVar) {
        mo34441b(m14165a(C4936d.C4941e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public final void mo34438a(boolean z, String str) {
        mo34441b(m14183b("viewableChange", m14167a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34439a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m14503d(this.f12383a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C4936d.C4941e.Interstitial.toString()) ? !str.equalsIgnoreCase(C4936d.C4941e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C4936d.C4941e.Banner.toString()) ? (str.equalsIgnoreCase(C4936d.C4941e.OfferWall.toString()) || str.equalsIgnoreCase(C4936d.C4941e.OfferWallCredits.toString())) && this.f12374O != null : this.f12375P != null : this.f12372M != null : this.f12373N != null) {
            z = true;
        }
        if (!z) {
            String str2 = this.f12383a;
            Logger.m14503d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo34355b(final Context context) {
        mo34440b((Runnable) new Runnable() {
            public final void run() {
                C4845x.m14190c(C4845x.this, context);
            }
        });
    }

    /* renamed from: b */
    public final void mo34356b(C4935c cVar, Map<String, String> map, C4956c cVar2) {
        mo34441b(m14165a(C4936d.C4941e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo34664a()}))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34440b(Runnable runnable) {
        C4399a aVar = this.f12403w;
        if (aVar != null) {
            aVar.mo33206b(runnable);
        }
    }

    /* renamed from: b */
    public void mo34441b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (f12359y != C4936d.C4940d.MODE_0.f12673d && (f12359y < C4936d.C4940d.MODE_1.f12673d || f12359y > C4936d.C4940d.MODE_3.f12673d)) {
                str2 = "empty";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            final String str3 = "javascript:" + sb.toString();
            Logger.m14507i(this.f12383a, str3);
            mo34436a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        if (C4845x.this.f12376Q != null) {
                            if (C4845x.this.f12376Q.booleanValue()) {
                                C4845x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            } else {
                                C4845x.this.loadUrl(str3);
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            C4845x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            Boolean unused = C4845x.this.f12376Q = Boolean.TRUE;
                        } else {
                            C4845x.this.loadUrl(str3);
                            Boolean unused2 = C4845x.this.f12376Q = Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        String b = C4845x.this.f12383a;
                        Logger.m14505e(b, "injectJavascript: " + th.toString());
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final C4936d.C4939c mo34357c() {
        return C4936d.C4939c.Web;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34442c(Runnable runnable) {
        C4399a aVar = this.f12403w;
        if (aVar != null) {
            aVar.mo33207c(runnable);
        }
    }

    /* renamed from: c */
    public final boolean mo34358c(String str) {
        C4935c a = this.f12381V.mo34390a(C4936d.C4941e.Interstitial, str);
        return a != null && a.f12642f;
    }

    /* renamed from: d */
    public final void mo34359d() {
        mo34441b(m14166a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    /* renamed from: d */
    public final void mo34443d(String str) {
        String str2 = this.f12383a;
        Logger.m14507i(str2, "device status changed, connection type " + str);
        C4744b.m13915a(str);
        mo34441b(m14183b("deviceStatusChanged", m14167a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        C4965b bVar = this.f12363D;
        if (bVar != null) {
            bVar.mo34698a();
        }
        C4972b bVar2 = this.f12384aa;
        if (bVar2 != null) {
            bVar2.f12718a.mo34706a();
        }
        CountDownTimer countDownTimer = this.f12386f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: e */
    public final void mo34361e() {
        mo34441b(m14201g("enterForeground"));
    }

    /* renamed from: e */
    public final void mo34444e(String str) {
        if (str.equals("forceClose")) {
            mo34447j();
        }
        mo34441b(m14183b("engageEnd", m14167a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: f */
    public final void mo34362f() {
        mo34441b(m14201g("enterBackground"));
    }

    /* renamed from: f */
    public final boolean mo34445f(String str) {
        List<String> b = C4984b.m14516a().mo34733b();
        try {
            if (b.isEmpty()) {
                return false;
            }
            for (String contains : b) {
                if (str.contains(contains)) {
                    C4377a.C43781.m12456a(this.f12401u.mo34326a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final void mo34363g() {
        mo34434a(this.f12393m);
    }

    /* renamed from: h */
    public final void mo34364h() {
        C4743a aVar = new C4743a();
        C4785f fVar = this.f12378S;
        aVar.mo34234a("generalmessage", Integer.valueOf(fVar.f12174b));
        C4747d.m13921a(C4749f.f12054r, (Map<String, Object>) aVar.f12028a);
        fVar.f12173a = System.currentTimeMillis();
        if (this.f12378S.mo34336b()) {
            mo34433a(1);
        }
    }

    /* renamed from: i */
    public final void mo34446i() {
        mo34441b(m14201g("interceptedUrlToStore"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo34447j() {
        C4963g gVar = this.f12402v;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    /* renamed from: k */
    public final void mo34448k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f12383a;
            Logger.m14507i(str, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: l */
    public final void mo34449l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f12383a;
            Logger.m14507i(str, "WebViewController: onResume() - " + th);
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.f12383a;
        Logger.m14507i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C4963g gVar;
        if (i != 4 || (gVar = this.f12402v) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
