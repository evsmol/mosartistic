package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8565c;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.C8612l;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.adview.b */
public class C7965b implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private volatile AppLovinAdClickListener f19238A;

    /* renamed from: B */
    private volatile C7991g f19239B = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f19240a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewGroup f19241b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8490n f19242c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinAdServiceImpl f19243d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8626v f19244e;

    /* renamed from: f */
    private AppLovinCommunicator f19245f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AppLovinAdSize f19246g;

    /* renamed from: h */
    private String f19247h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8392d f19248i;

    /* renamed from: j */
    private C7987e f19249j;

    /* renamed from: k */
    private C7979c f19250k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7981d f19251l;

    /* renamed from: m */
    private Runnable f19252m;

    /* renamed from: n */
    private Runnable f19253n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C8350e f19254o = null;

    /* renamed from: p */
    private volatile AppLovinAd f19255p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C8000l f19256q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C8000l f19257r = null;

    /* renamed from: s */
    private final AtomicReference<AppLovinAd> f19258s = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicBoolean f19259t = new AtomicBoolean();

    /* renamed from: u */
    private volatile boolean f19260u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile boolean f19261v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile boolean f19262w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile AppLovinAdLoadListener f19263x;

    /* renamed from: y */
    private volatile AppLovinAdDisplayListener f19264y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public volatile AppLovinAdViewEventListener f19265z;

    /* renamed from: com.applovin.impl.adview.b$a */
    private class C7977a implements Runnable {
        private C7977a() {
        }

        public void run() {
            if (C7965b.this.f19251l != null) {
                C7965b.this.f19251l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b */
    private class C7978b implements Runnable {
        private C7978b() {
        }

        public void run() {
            if (C7965b.this.f19254o == null) {
                return;
            }
            if (C7965b.this.f19251l != null) {
                C7965b.this.m23679x();
                C8626v unused = C7965b.this.f19244e;
                if (C8626v.m26252a()) {
                    C8626v c = C7965b.this.f19244e;
                    c.mo57818b("AppLovinAdView", "Rendering advertisement ad for #" + C7965b.this.f19254o.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C7965b.m23658b((View) C7965b.this.f19251l, C7965b.this.f19254o.getSize());
                C7965b.this.f19251l.mo55706a(C7965b.this.f19254o);
                if (C7965b.this.f19254o.getSize() != AppLovinAdSize.INTERSTITIAL && !C7965b.this.f19261v) {
                    C7965b bVar = C7965b.this;
                    C8392d unused2 = bVar.f19248i = new C8392d(bVar.f19254o, C7965b.this.f19242c);
                    C7965b.this.f19248i.mo57129a();
                    C7965b.this.f19251l.setStatsManagerHelper(C7965b.this.f19248i);
                    C7965b.this.f19254o.setHasShown(true);
                }
                if (C7965b.this.f19251l.getStatsManagerHelper() != null) {
                    C7965b.this.f19251l.getStatsManagerHelper().mo57130a(C7965b.this.f19254o.mo56944A() ? 0 : 1);
                    return;
                }
                return;
            }
            C8626v.m26258i("AppLovinAdView", "Unable to render advertisement for ad #" + C7965b.this.f19254o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
            C8575k.m26123a(C7965b.this.f19265z, (AppLovinAd) C7965b.this.f19254o, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
        }
    }

    /* renamed from: com.applovin.impl.adview.b$c */
    static class C7979c implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C7965b f19284a;

        C7979c(C7965b bVar, C8490n nVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            } else if (nVar != null) {
                this.f19284a = bVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private C7965b m23714a() {
            return this.f19284a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            C7965b a = m23714a();
            if (a != null) {
                a.mo55669b(appLovinAd);
            } else {
                C8626v.m26258i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i) {
            C7965b a = m23714a();
            if (a != null) {
                a.mo55654a(i);
            }
        }
    }

    /* renamed from: a */
    private void m23654a(AppLovinAdView appLovinAdView, C8490n nVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (nVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (appLovinAdSize != null) {
            this.f19242c = nVar;
            this.f19243d = nVar.mo57406v();
            this.f19244e = nVar.mo57320D();
            this.f19245f = AppLovinCommunicator.getInstance(context);
            this.f19246g = appLovinAdSize;
            this.f19247h = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f19240a = context;
            this.f19241b = appLovinAdView;
            this.f19249j = new C7987e(this, nVar);
            this.f19253n = new C7977a();
            this.f19252m = new C7978b();
            this.f19250k = new C7979c(this, nVar);
            mo55667a(appLovinAdSize);
        } else {
            throw new IllegalArgumentException("No ad size specified");
        }
    }

    /* renamed from: a */
    private void m23655a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m23658b(View view, AppLovinAdSize appLovinAdSize) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i = -1;
            int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getWidth(), displayMetrics);
            if (!appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
                i = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getHeight(), displayMetrics);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = applyDimension;
            layoutParams.height = i;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    private void m23675t() {
        if (this.f19244e != null && C8626v.m26252a() && C8626v.m26252a()) {
            this.f19244e.mo57818b("AppLovinAdView", "Destroying...");
        }
        C7981d dVar = this.f19251l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f19251l);
            }
            this.f19251l.removeAllViews();
            this.f19251l.loadUrl("about:blank");
            this.f19251l.onPause();
            this.f19251l.destroyDrawingCache();
            this.f19251l.destroy();
            this.f19251l = null;
        }
        this.f19263x = null;
        this.f19264y = null;
        this.f19238A = null;
        this.f19265z = null;
        this.f19261v = true;
    }

    /* renamed from: u */
    private void m23676u() {
        m23655a((Runnable) new Runnable() {
            public void run() {
                if (C7965b.this.f19256q != null) {
                    C8626v unused = C7965b.this.f19244e;
                    if (C8626v.m26252a()) {
                        C8626v c = C7965b.this.f19244e;
                        c.mo57818b("AppLovinAdView", "Detaching expanded ad: " + C7965b.this.f19256q.mo55751a());
                    }
                    C7965b bVar = C7965b.this;
                    C8000l unused2 = bVar.f19257r = bVar.f19256q;
                    C8000l unused3 = C7965b.this.f19256q = null;
                    C7965b bVar2 = C7965b.this;
                    bVar2.mo55667a(bVar2.f19246g);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m23677v() {
        m23655a((Runnable) new Runnable() {
            public void run() {
                C8345a aVar;
                if (C7965b.this.f19257r != null || C7965b.this.f19256q != null) {
                    if (C7965b.this.f19257r != null) {
                        aVar = C7965b.this.f19257r.mo55751a();
                        C7965b.this.f19257r.dismiss();
                        C8000l unused = C7965b.this.f19257r = null;
                    } else {
                        aVar = C7965b.this.f19256q.mo55751a();
                        C7965b.this.f19256q.dismiss();
                        C8000l unused2 = C7965b.this.f19256q = null;
                    }
                    C8575k.m26153b(C7965b.this.f19265z, (AppLovinAd) aVar, (AppLovinAdView) C7965b.this.f19241b);
                }
            }
        });
    }

    /* renamed from: w */
    private void m23678w() {
        C8392d dVar = this.f19248i;
        if (dVar != null) {
            dVar.mo57133c();
            this.f19248i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m23679x() {
        C8350e eVar = this.f19254o;
        C8612l lVar = new C8612l();
        lVar.mo57741a().mo57745a(eVar).mo57743a(mo55685r());
        if (!Utils.isBML(eVar.getSize())) {
            lVar.mo57741a().mo57747a("Fullscreen Ad Properties").mo57750b(eVar);
        }
        lVar.mo57746a(this.f19242c);
        lVar.mo57741a();
        if (C8626v.m26252a()) {
            this.f19244e.mo57818b("AppLovinAdView", lVar.toString());
        }
    }

    /* renamed from: a */
    public void mo55653a() {
        if (this.f19242c == null || this.f19250k == null || this.f19240a == null || !this.f19260u) {
            C8626v.m26256g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f19243d.loadNextAd(this.f19247h, this.f19246g, this.f19250k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55654a(final int i) {
        if (!this.f19261v) {
            m23655a(this.f19253n);
        }
        m23655a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (C7965b.this.f19263x != null) {
                        C7965b.this.f19263x.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    C8626v.m26254c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo55655a(final PointF pointF) {
        m23655a((Runnable) new Runnable() {
            public void run() {
                if (C7965b.this.f19256q == null && (C7965b.this.f19254o instanceof C8345a) && C7965b.this.f19251l != null) {
                    C8345a aVar = (C8345a) C7965b.this.f19254o;
                    Activity retrieveParentActivity = C7965b.this.f19240a instanceof Activity ? (Activity) C7965b.this.f19240a : Utils.retrieveParentActivity(C7965b.this.f19251l, C7965b.this.f19242c);
                    if (retrieveParentActivity == null || retrieveParentActivity.isFinishing()) {
                        C8626v.m26258i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                        Uri j = aVar.mo55855j();
                        if (j != null) {
                            AppLovinAdServiceImpl l = C7965b.this.f19243d;
                            AppLovinAdView r = C7965b.this.mo55685r();
                            C7965b bVar = C7965b.this;
                            l.trackAndLaunchClick(aVar, r, bVar, j, pointF, bVar.f19262w);
                            if (C7965b.this.f19248i != null) {
                                C7965b.this.f19248i.mo57131b();
                            }
                        }
                        C7965b.this.f19251l.mo55707a("javascript:al_onFailedExpand();");
                        return;
                    }
                    if (C7965b.this.f19241b != null) {
                        C7965b.this.f19241b.removeView(C7965b.this.f19251l);
                    }
                    C8000l unused = C7965b.this.f19256q = new C8000l(aVar, C7965b.this.f19251l, retrieveParentActivity, C7965b.this.f19242c);
                    C7965b.this.f19256q.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        public void onDismiss(DialogInterface dialogInterface) {
                            C7965b.this.mo55678k();
                        }
                    });
                    C7965b.this.f19256q.show();
                    C8575k.m26122a(C7965b.this.f19265z, (AppLovinAd) C7965b.this.f19254o, (AppLovinAdView) C7965b.this.f19241b);
                    if (C7965b.this.f19248i != null) {
                        C7965b.this.f19248i.mo57135d();
                    }
                    if (C7965b.this.f19254o.isOpenMeasurementEnabled()) {
                        C7965b.this.f19254o.mo55860o().mo56847a((View) C7965b.this.f19256q.mo55752b());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo55656a(final WebView webView) {
        m23655a((Runnable) new Runnable() {
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f19254o != this.f19255p) {
                this.f19255p = this.f19254o;
                if (this.f19264y != null) {
                    this.f19242c.mo57373an().mo55453a((Object) this.f19254o);
                    C8575k.m26144a(this.f19264y, (AppLovinAd) this.f19254o);
                    this.f19251l.mo55707a("javascript:al_onAdViewRendered();");
                }
                if ((this.f19254o instanceof C8345a) && this.f19254o.isOpenMeasurementEnabled()) {
                    this.f19242c.mo57337V().mo57229a((C8401a) new C8458z(this.f19242c, new Runnable() {
                        public void run() {
                            C7965b.this.f19254o.mo55860o().mo56853b(webView);
                            C7965b.this.f19254o.mo55860o().mo56847a((View) webView);
                            C7965b.this.f19254o.mo55860o().mo56854c();
                            C7965b.this.f19254o.mo55860o().mo56855d();
                        }
                    }), C8432o.C8434a.MAIN, 500);
                }
            }
        } catch (Throwable th) {
            C8626v.m26254c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    /* renamed from: a */
    public void mo55657a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context == null) {
            C8626v.m26258i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        } else {
            if (appLovinAdSize == null && (appLovinAdSize = C8565c.m26061a(attributeSet)) == null) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            }
            AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
            if (appLovinSdk == null) {
                appLovinSdk = AppLovinSdk.getInstance(context);
            }
            if (appLovinSdk != null) {
                m23654a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
                if (C8565c.m26065b(attributeSet)) {
                    mo55653a();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo55658a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f19265z = appLovinAdViewEventListener;
    }

    /* renamed from: a */
    public void mo55659a(C7991g gVar) {
        this.f19239B = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55660a(C8350e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f19243d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.f19262w);
        } else if (C8626v.m26252a()) {
            this.f19244e.mo57822e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        C8575k.m26143a(this.f19238A, (AppLovinAd) eVar);
    }

    /* renamed from: a */
    public void mo55661a(C8392d dVar) {
        C7981d dVar2 = this.f19251l;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    /* renamed from: a */
    public void mo55662a(AppLovinAd appLovinAd) {
        mo55663a(appLovinAd, (String) null);
    }

    /* renamed from: a */
    public void mo55663a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            Utils.validateAdSdkKey(appLovinAd, this.f19242c);
            if (this.f19260u) {
                C8350e eVar = (C8350e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f19242c);
                if (eVar != null && eVar != this.f19254o) {
                    if (C8626v.m26252a()) {
                        C8626v vVar = this.f19244e;
                        vVar.mo57818b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
                    }
                    C8575k.m26157b(this.f19264y, (AppLovinAd) this.f19254o);
                    if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                        m23678w();
                    }
                    if (this.f19254o != null && this.f19254o.isOpenMeasurementEnabled()) {
                        this.f19254o.mo55860o().mo56856e();
                    }
                    this.f19258s.set((Object) null);
                    this.f19255p = null;
                    this.f19254o = eVar;
                    if (!this.f19261v && Utils.isBML(this.f19246g)) {
                        this.f19242c.mo57406v().trackImpression(eVar);
                    }
                    if (this.f19256q != null) {
                        m23676u();
                    }
                    m23655a(this.f19252m);
                } else if (eVar != null) {
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = this.f19244e;
                        vVar2.mo57821d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
                    }
                    if (((Boolean) this.f19242c.mo57342a(C8380b.f20837ch)).booleanValue()) {
                        throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                    }
                } else if (C8626v.m26252a()) {
                    this.f19244e.mo57821d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                }
            } else {
                C8626v.m26256g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            }
        } else {
            throw new IllegalArgumentException("No ad specified");
        }
    }

    /* renamed from: a */
    public void mo55664a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f19238A = appLovinAdClickListener;
    }

    /* renamed from: a */
    public void mo55665a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f19264y = appLovinAdDisplayListener;
    }

    /* renamed from: a */
    public void mo55666a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f19263x = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55667a(AppLovinAdSize appLovinAdSize) {
        try {
            C7981d dVar = new C7981d(this.f19249j, this.f19242c, this.f19240a);
            this.f19251l = dVar;
            dVar.setBackgroundColor(0);
            this.f19251l.setWillNotCacheDrawing(false);
            this.f19241b.setBackgroundColor(0);
            this.f19241b.addView(this.f19251l);
            m23658b((View) this.f19251l, appLovinAdSize);
            if (!this.f19260u) {
                m23655a(this.f19253n);
            }
            m23655a((Runnable) new Runnable() {
                public void run() {
                    C7965b.this.f19251l.loadDataWithBaseURL("/", "<html></html>", "text/html", (String) null, "");
                }
            });
            this.f19260u = true;
        } catch (Throwable th) {
            C8626v.m26254c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f19259t.set(true);
        }
    }

    /* renamed from: b */
    public AppLovinAdSize mo55668b() {
        return this.f19246g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55669b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f19261v) {
                mo55662a(appLovinAd);
            } else {
                this.f19258s.set(appLovinAd);
                if (C8626v.m26252a()) {
                    this.f19244e.mo57818b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            m23655a((Runnable) new Runnable() {
                public void run() {
                    if (C7965b.this.f19259t.compareAndSet(true, false)) {
                        C7965b bVar = C7965b.this;
                        bVar.mo55667a(bVar.f19246g);
                    }
                    try {
                        if (C7965b.this.f19263x != null) {
                            C7965b.this.f19263x.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        C8626v.m26258i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            });
            return;
        }
        if (C8626v.m26252a()) {
            this.f19244e.mo57822e("AppLovinAdView", "No provided when to the view controller");
        }
        mo55654a(-1);
    }

    /* renamed from: c */
    public String mo55670c() {
        return this.f19247h;
    }

    /* renamed from: d */
    public void mo55671d() {
        if (this.f19260u && !this.f19261v) {
            this.f19261v = true;
        }
    }

    /* renamed from: e */
    public void mo55672e() {
        if (this.f19260u) {
            AppLovinAd andSet = this.f19258s.getAndSet((Object) null);
            if (andSet != null) {
                mo55662a(andSet);
            }
            this.f19261v = false;
        }
    }

    /* renamed from: f */
    public void mo55673f() {
        if (!(this.f19251l == null || this.f19256q == null)) {
            mo55678k();
        }
        m23675t();
    }

    /* renamed from: g */
    public AppLovinAdViewEventListener mo55674g() {
        return this.f19265z;
    }

    public String getCommunicatorId() {
        return C7965b.class.getSimpleName();
    }

    /* renamed from: h */
    public C7991g mo55675h() {
        return this.f19239B;
    }

    /* renamed from: i */
    public void mo55676i() {
        if (C8565c.m26064a((View) this.f19251l)) {
            this.f19242c.mo57338W().mo57151a(C8394f.f21096o);
        }
    }

    /* renamed from: j */
    public void mo55677j() {
        if (this.f19260u) {
            C8575k.m26157b(this.f19264y, (AppLovinAd) this.f19254o);
            if (this.f19254o != null && this.f19254o.isOpenMeasurementEnabled() && Utils.isBML(this.f19254o.getSize())) {
                this.f19254o.mo55860o().mo56856e();
            }
            if (this.f19251l != null && this.f19256q != null) {
                if (C8626v.m26252a()) {
                    this.f19244e.mo57818b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                m23676u();
            } else if (C8626v.m26252a()) {
                this.f19244e.mo57818b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    /* renamed from: k */
    public void mo55678k() {
        m23655a((Runnable) new Runnable() {
            public void run() {
                C7965b.this.m23677v();
                if (C7965b.this.f19241b != null && C7965b.this.f19251l != null && C7965b.this.f19251l.getParent() == null) {
                    C7965b.this.f19241b.addView(C7965b.this.f19251l);
                    C7965b.m23658b((View) C7965b.this.f19251l, C7965b.this.f19254o.getSize());
                    if (C7965b.this.f19254o.isOpenMeasurementEnabled()) {
                        C7965b.this.f19254o.mo55860o().mo56847a((View) C7965b.this.f19251l);
                    }
                }
            }
        });
    }

    /* renamed from: l */
    public void mo55679l() {
        if (this.f19256q == null && this.f19257r == null) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19244e;
                vVar.mo57818b("AppLovinAdView", "Ad: " + this.f19254o + " closed.");
            }
            m23655a(this.f19253n);
            C8575k.m26157b(this.f19264y, (AppLovinAd) this.f19254o);
            this.f19254o = null;
            return;
        }
        mo55678k();
    }

    /* renamed from: m */
    public void mo55680m() {
        this.f19262w = true;
    }

    /* renamed from: n */
    public void mo55681n() {
        this.f19262w = false;
    }

    /* renamed from: o */
    public void mo55682o() {
        if ((this.f19240a instanceof C7999k) && this.f19254o != null) {
            if (this.f19254o.mo56949G() == C8350e.C8352a.DISMISS) {
                ((C7999k) this.f19240a).dismiss();
            }
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m23655a((Runnable) new Runnable() {
                public void run() {
                    C7965b.this.mo55686s().loadUrl("chrome://crash");
                }
            });
        }
    }

    /* renamed from: p */
    public C8350e mo55683p() {
        return this.f19254o;
    }

    /* renamed from: q */
    public C8490n mo55684q() {
        return this.f19242c;
    }

    /* renamed from: r */
    public AppLovinAdView mo55685r() {
        return (AppLovinAdView) this.f19241b;
    }

    /* renamed from: s */
    public C7981d mo55686s() {
        return this.f19251l;
    }
}
