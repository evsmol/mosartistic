package com.applovin.impl.mediation.debugger.p243ui.testmode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p237a.C8143a;
import com.applovin.impl.mediation.debugger.p238b.p241c.C8160b;
import com.applovin.impl.mediation.debugger.p243ui.C8173a;
import com.applovin.impl.mediation.debugger.p243ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
public class C8229a extends C8173a implements C8143a.C8144a, AdControlButton.C8227a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C8160b f20185a;

    /* renamed from: b */
    private C8490n f20186b;

    /* renamed from: c */
    private MaxAdView f20187c;

    /* renamed from: d */
    private MaxAdView f20188d;

    /* renamed from: e */
    private MaxInterstitialAd f20189e;

    /* renamed from: f */
    private MaxAppOpenAd f20190f;

    /* renamed from: g */
    private MaxRewardedInterstitialAd f20191g;

    /* renamed from: h */
    private MaxRewardedAd f20192h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MaxAd f20193i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MaxNativeAdLoader f20194j;

    /* renamed from: k */
    private String f20195k;

    /* renamed from: l */
    private AdControlButton f20196l;

    /* renamed from: m */
    private AdControlButton f20197m;

    /* renamed from: n */
    private AdControlButton f20198n;

    /* renamed from: o */
    private AdControlButton f20199o;

    /* renamed from: p */
    private AdControlButton f20200p;

    /* renamed from: q */
    private AdControlButton f20201q;

    /* renamed from: r */
    private AdControlButton f20202r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Button f20203s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Button f20204t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public FrameLayout f20205u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public FrameLayout f20206v;

    /* renamed from: w */
    private Map<MaxAdFormat, C8143a> f20207w;

    /* renamed from: a */
    private AdControlButton m24727a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f20196l;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f20197m;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f20198n;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f20199o;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f20200p;
        }
        if (str.equals(this.f20195k)) {
            return this.f20201q;
        }
        if (str.equals("test_mode_native")) {
            return this.f20202r;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    /* renamed from: a */
    private void m24729a() {
        String str;
        MaxAdFormat maxAdFormat;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C8656R.C8660id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C8656R.C8660id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f20185a.mo56380p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f20186b.mo57361ab(), this);
            this.f20187c = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
            this.f20187c.setListener(this);
            frameLayout.addView(this.f20187c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(C8656R.C8660id.banner_control_button);
            this.f20196l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20196l.setFormat(maxAdFormat);
            return;
        }
        findViewById(C8656R.C8660id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    /* renamed from: a */
    private void m24730a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f20186b.mo57330N().mo56526a(getTestModeNetwork(maxAdFormat));
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f20187c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f20188d;
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f20189e.loadAd();
            return;
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f20190f.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f20191g.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f20192h.loadAd();
            return;
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f20194j.loadAd();
            return;
        } else {
            return;
        }
        maxAdView.loadAd();
    }

    /* renamed from: b */
    private void m24732b() {
        this.f20205u = (FrameLayout) findViewById(C8656R.C8660id.mrec_ad_view_container);
        if (this.f20185a.mo56380p().contains(MaxAdFormat.MREC)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.f20186b.mo57361ab(), this);
            this.f20188d = maxAdView;
            maxAdView.setListener(this);
            this.f20205u.addView(this.f20188d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(C8656R.C8660id.mrec_control_button);
            this.f20197m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20197m.setFormat(MaxAdFormat.MREC);
            return;
        }
        findViewById(C8656R.C8660id.mrec_control_view).setVisibility(8);
        this.f20205u.setVisibility(8);
    }

    /* renamed from: b */
    private void m24733b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f20189e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f20190f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f20191g.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f20192h.showAd();
        }
    }

    /* renamed from: c */
    private void m24735c() {
        if (this.f20185a.mo56380p().contains(MaxAdFormat.INTERSTITIAL)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f20186b.mo57361ab(), this);
            this.f20189e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C8656R.C8660id.interstitial_control_button);
            this.f20198n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20198n.setFormat(MaxAdFormat.INTERSTITIAL);
            return;
        }
        findViewById(C8656R.C8660id.interstitial_control_view).setVisibility(8);
    }

    /* renamed from: d */
    private void m24737d() {
        if (this.f20185a.mo56380p().contains(MaxAdFormat.REWARDED)) {
            String str = "test_mode_rewarded_" + this.f20185a.mo56372h();
            this.f20195k = str;
            MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.f20186b.mo57361ab(), this);
            this.f20192h = instance;
            instance.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C8656R.C8660id.rewarded_control_button);
            this.f20201q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20201q.setFormat(MaxAdFormat.REWARDED);
            return;
        }
        findViewById(C8656R.C8660id.rewarded_control_view).setVisibility(8);
    }

    /* renamed from: e */
    private void m24739e() {
        this.f20206v = (FrameLayout) findViewById(C8656R.C8660id.native_ad_view_container);
        if (this.f20185a.mo56381q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f20186b.mo57361ab(), this);
            this.f20194j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C8229a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C8229a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (C8229a.this.f20193i != null) {
                        C8229a.this.f20194j.destroy(C8229a.this.f20193i);
                    }
                    MaxAd unused = C8229a.this.f20193i = maxAd;
                    C8229a.this.f20206v.removeAllViews();
                    C8229a.this.f20206v.addView(maxNativeAdView);
                    C8229a.this.onAdLoaded(maxAd);
                }
            });
            this.f20194j.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C8656R.C8660id.native_control_button);
            this.f20202r = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f20202r.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(C8656R.C8660id.native_control_view).setVisibility(8);
        this.f20206v.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public C8490n getSdk() {
        return this.f20186b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f20185a.mo56387v() == null || !this.f20185a.mo56387v().containsKey(maxAdFormat)) ? this.f20185a.mo56372h() : this.f20185a.mo56387v().get(maxAdFormat);
    }

    public void initialize(C8160b bVar) {
        this.f20185a = bVar;
        this.f20186b = bVar.mo56390y();
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m24727a(maxAd.getAdUnitId()).setControlState(AdControlButton.C8228b.LOAD);
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
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f20187c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f20188d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f20189e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f20190f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f20191g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f20192h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f20194j.setLocalExtraParameter("amazon_ad_error", adError);
            }
            m24730a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        m24730a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a = m24727a(str);
        a.setControlState(AdControlButton.C8228b.LOAD);
        Utils.showAlert(maxError, a.getFormat().getLabel(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        m24727a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.C8228b.LOAD : AdControlButton.C8228b.SHOW);
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f20187c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f20188d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f20189e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f20190f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f20191g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f20192h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f20194j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            m24730a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        m24730a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        if (AdControlButton.C8228b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C8228b.LOADING);
            Map<MaxAdFormat, C8143a> map = this.f20207w;
            if (map == null || map.get(format) == null) {
                m24730a(format);
            } else {
                this.f20207w.get(format).mo56307a();
            }
        } else if (AdControlButton.C8228b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C8228b.LOAD);
            m24733b(format);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f20185a == null) {
            C8626v.m26258i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C8656R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f20185a.mo56373i() + " Test Ads");
        m24729a();
        m24732b();
        m24735c();
        m24737d();
        m24739e();
        findViewById(C8656R.C8660id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(C8656R.C8660id.app_open_ad_control_view).setVisibility(8);
        this.f20203s = (Button) findViewById(C8656R.C8660id.show_mrec_button);
        this.f20204t = (Button) findViewById(C8656R.C8660id.show_native_button);
        if (!this.f20185a.mo56381q() || !this.f20185a.mo56380p().contains(MaxAdFormat.MREC)) {
            this.f20203s.setVisibility(8);
            this.f20204t.setVisibility(8);
        } else {
            this.f20206v.setVisibility(8);
            this.f20203s.setBackgroundColor(-1);
            this.f20204t.setBackgroundColor(-3355444);
            this.f20203s.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C8229a.this.f20205u.setVisibility(0);
                    C8229a.this.f20206v.setVisibility(8);
                    C8229a.this.f20203s.setBackgroundColor(-1);
                    C8229a.this.f20204t.setBackgroundColor(-3355444);
                }
            });
            this.f20204t.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C8229a.this.f20206v.setVisibility(0);
                    C8229a.this.f20205u.setVisibility(8);
                    C8229a.this.f20204t.setBackgroundColor(-1);
                    C8229a.this.f20203s.setBackgroundColor(-3355444);
                }
            });
        }
        if (StringUtils.isValidString(this.f20185a.mo56361B()) && this.f20185a.mo56362C() != null && this.f20185a.mo56362C().size() > 0) {
            AdRegistration.getInstance(this.f20185a.mo56361B(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            Map<MaxAdFormat, C8143a> map = CollectionUtils.map(this.f20185a.mo56362C().size());
            for (MaxAdFormat next : this.f20185a.mo56362C().keySet()) {
                map.put(next, new C8143a(this.f20185a.mo56362C().get(next), next, (C8143a.C8144a) this));
            }
            this.f20207w = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C8626v.m26254c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f20186b.mo57330N().mo56526a((String) null);
        MaxAdView maxAdView = this.f20187c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f20188d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f20189e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f20192h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f20194j;
        if (maxNativeAdLoader != null && (maxAd = this.f20193i) != null) {
            maxNativeAdLoader.destroy(maxAd);
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
