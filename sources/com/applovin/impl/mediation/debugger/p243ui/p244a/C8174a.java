package com.applovin.impl.mediation.debugger.p243ui.p244a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p237a.C8143a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8152a;
import com.applovin.impl.mediation.debugger.p238b.p239a.C8153b;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.p244a.C8180b;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8212a;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8214c;
import com.applovin.impl.mediation.debugger.p243ui.p248d.C8218d;
import com.applovin.impl.mediation.debugger.p243ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.a */
public class C8174a extends C8173a implements C8143a.C8144a, AdControlButton.C8227a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8490n f19974a;

    /* renamed from: b */
    private C8152a f19975b;

    /* renamed from: c */
    private C8180b f19976c;

    /* renamed from: d */
    private C8153b f19977d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MaxAdView f19978e;

    /* renamed from: f */
    private MaxInterstitialAd f19979f;

    /* renamed from: g */
    private MaxAppOpenAd f19980g;

    /* renamed from: h */
    private MaxRewardedInterstitialAd f19981h;

    /* renamed from: i */
    private MaxRewardedAd f19982i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MaxNativeAdView f19983j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaxNativeAdLoader f19984k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C8187d f19985l;

    /* renamed from: m */
    private ListView f19986m;

    /* renamed from: n */
    private View f19987n;

    /* renamed from: o */
    private AdControlButton f19988o;

    /* renamed from: p */
    private TextView f19989p;

    /* renamed from: q */
    private C8143a f19990q;

    /* renamed from: a */
    private void m24529a() {
        String a = this.f19975b.mo56324a();
        if (this.f19975b.mo56328d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a, this.f19975b.mo56328d(), this.f19974a.mo57361ab(), this);
            this.f19978e = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
            this.f19978e.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f19975b.mo56328d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a, this.f19974a.mo57361ab(), this);
            this.f19979f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.APP_OPEN == this.f19975b.mo56328d()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(a, this.f19974a.mo57361ab());
            this.f19980g = maxAppOpenAd;
            maxAppOpenAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f19975b.mo56328d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a, this.f19974a.mo57361ab(), this);
            this.f19981h = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f19975b.mo56328d()) {
            MaxRewardedAd instance = MaxRewardedAd.getInstance(a, this.f19974a.mo57361ab(), this);
            this.f19982i = instance;
            instance.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f19975b.mo56328d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a, this.f19974a.mo57361ab(), this);
            this.f19984k = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C8174a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C8174a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (maxNativeAdView != null) {
                        MaxNativeAdView unused = C8174a.this.f19983j = maxNativeAdView;
                    } else {
                        MaxNativeAdView unused2 = C8174a.this.f19983j = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, C8174a.this.f19974a.mo57332P());
                        C8174a.this.f19984k.render(C8174a.this.f19983j, maxAd);
                    }
                    C8174a.this.onAdLoaded(maxAd);
                }
            });
            this.f19984k.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    private void m24530a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f19985l == null) {
            C8187d dVar = new C8187d(viewGroup, size, this);
            this.f19985l = dVar;
            dVar.setOnShowListener(onShowListener);
            this.f19985l.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    ViewGroup viewGroup = viewGroup;
                    if (viewGroup instanceof MaxAdView) {
                        ((MaxAdView) viewGroup).stopAutoRefresh();
                    }
                    C8187d unused = C8174a.this.f19985l = null;
                }
            });
            this.f19985l.show();
        }
    }

    /* renamed from: a */
    private void m24531a(MaxAdFormat maxAdFormat) {
        if (this.f19977d != null) {
            this.f19974a.mo57330N().mo56526a(this.f19977d.mo56331a().mo56340a());
            this.f19974a.mo57330N().mo56528a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f19978e.setPlacement("[Mediation Debugger Live Ad]");
            this.f19978e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f19975b.mo56328d()) {
            this.f19979f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == this.f19975b.mo56328d()) {
            this.f19980g.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f19975b.mo56328d()) {
            this.f19981h.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f19975b.mo56328d()) {
            this.f19982i.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f19975b.mo56328d()) {
            this.f19984k.setPlacement("[Mediation Debugger Live Ad]");
            this.f19984k.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    /* renamed from: b */
    private void m24533b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            m24530a(this.f19978e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    C8174a.this.f19978e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f19975b.mo56328d()) {
            this.f19979f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.APP_OPEN == this.f19975b.mo56328d()) {
            this.f19980g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f19975b.mo56328d()) {
            this.f19981h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f19975b.mo56328d()) {
            this.f19982i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f19975b.mo56328d()) {
            m24530a(this.f19983j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        return this.f19974a;
    }

    public void initialize(final C8152a aVar, C8153b bVar, final C8490n nVar) {
        List<?> a;
        this.f19974a = nVar;
        this.f19975b = aVar;
        this.f19977d = bVar;
        C8180b bVar2 = new C8180b(aVar, bVar, this);
        this.f19976c = bVar2;
        bVar2.mo56498a((C8218d.C8220a) new C8218d.C8220a() {
            /* renamed from: a */
            public void mo55474a(C8212a aVar, final C8214c cVar) {
                if (cVar instanceof C8180b.C8181a) {
                    C8562b.m26056a(C8174a.this, MaxDebuggerAdUnitDetailActivity.class, nVar.mo57368ai(), new C8562b.C8564a<MaxDebuggerAdUnitDetailActivity>() {
                        /* renamed from: a */
                        public void mo55475a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((C8180b.C8181a) cVar).mo56423d(), nVar);
                        }
                    });
                }
            }
        });
        m24529a();
        if (!aVar.mo56329e().mo56338d()) {
            return;
        }
        if ((bVar == null || bVar.mo56331a().mo56342c().mo56360A()) && (a = nVar.mo57327K().mo56311a(aVar.mo56324a())) != null && !a.isEmpty()) {
            this.f19990q = new C8143a(a, aVar.mo56328d(), (C8143a.C8144a) this);
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f19988o.setControlState(AdControlButton.C8228b.LOAD);
        this.f19989p.setText("");
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), (Context) this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f19978e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f19979f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f19980g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f19981h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f19982i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f19984k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m24531a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f19988o.setControlState(AdControlButton.C8228b.LOAD);
        this.f19989p.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", (Context) this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f19989p;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f19988o.setControlState(AdControlButton.C8228b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m24530a(this.f19978e, maxAd.getFormat().getSize(), (DialogInterface.OnShowListener) null);
        } else if (MaxAdFormat.NATIVE == this.f19975b.mo56328d()) {
            m24530a(this.f19983j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f19978e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f19979f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f19980g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f19981h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f19982i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f19984k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m24531a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.f19974a.mo57330N().mo56529a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", (Context) this);
            return;
        }
        MaxAdFormat d = this.f19975b.mo56328d();
        if (AdControlButton.C8228b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C8228b.LOADING);
            C8143a aVar = this.f19990q;
            if (aVar != null) {
                aVar.mo56307a();
            } else {
                m24531a(d);
            }
        } else if (AdControlButton.C8228b.SHOW == adControlButton.getControlState()) {
            if (!d.isAdViewAd() && d != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(AdControlButton.C8228b.LOAD);
            }
            m24533b(d);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8656R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f19976c.mo56422a());
        this.f19986m = (ListView) findViewById(C8656R.C8660id.listView);
        this.f19987n = findViewById(C8656R.C8660id.ad_presenter_view);
        this.f19988o = (AdControlButton) findViewById(C8656R.C8660id.ad_control_button);
        this.f19989p = (TextView) findViewById(C8656R.C8660id.status_textview);
        this.f19986m.setAdapter(this.f19976c);
        this.f19989p.setText(this.f19974a.mo57330N().mo56529a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.f19989p.setTypeface(Typeface.DEFAULT_BOLD);
        this.f19988o.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer((float) 10, 0.0f, (float) -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f19987n.setBackground(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f19977d != null) {
            this.f19974a.mo57330N().mo56526a((String) null);
            this.f19974a.mo57330N().mo56528a(false);
        }
        MaxAdView maxAdView = this.f19978e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f19979f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f19980g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f19981h;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f19982i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
