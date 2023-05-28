package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.mediation.p234a.C8079h;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.g */
public class C8241g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f20246a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8490n f20247b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8626v f20248c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f20249d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8076f f20250e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f20251f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MaxAdapter f20252g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f20253h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8070a f20254i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f20255j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaxNativeAd f20256k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MaxNativeAdView f20257l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C8262a f20258m = new C8262a();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MaxAdapterResponseParameters f20259n;

    /* renamed from: o */
    private final AtomicBoolean f20260o = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f20261p = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f20262q = new AtomicBoolean(false);

    /* renamed from: r */
    private final boolean f20263r;

    /* renamed from: com.applovin.impl.mediation.g$a */
    private class C8262a implements MaxAdViewAdapterListener, MaxAppOpenAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public MediationServiceImpl.C8066a f20323b;

        private C8262a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24824a(MediationServiceImpl.C8066a aVar) {
            if (aVar != null) {
                this.f20323b = aVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* renamed from: a */
        private void m24827a(String str, final Bundle bundle) {
            if (C8241g.this.f20254i.mo56105x().get()) {
                C8626v unused = C8241g.this.f20248c;
                if (C8626v.m26252a()) {
                    C8626v a = C8241g.this.f20248c;
                    a.mo57822e("MediationAdapterWrapper", C8241g.this.f20251f + ": blocking ad loaded callback for " + C8241g.this.f20254i + " since onAdHidden() has been called");
                }
                C8241g.this.f20247b.mo57369aj().mo57296b(C8241g.this.f20254i, str);
                return;
            }
            C8241g.this.f20262q.set(true);
            m24828a(str, (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    if (C8241g.this.f20261p.compareAndSet(false, true)) {
                        C8262a.this.f20323b.mo56038a(C8241g.this.f20254i, bundle);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m24828a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C8241g.this.f20246a.post(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener = maxAdListener;
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        C8626v.m26254c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24829a(String str, final MaxError maxError) {
            if (C8241g.this.f20254i.mo56105x().get()) {
                C8626v unused = C8241g.this.f20248c;
                if (C8626v.m26252a()) {
                    C8626v a = C8241g.this.f20248c;
                    a.mo57822e("MediationAdapterWrapper", C8241g.this.f20251f + ": blocking ad load failed callback for " + C8241g.this.f20254i + " since onAdHidden() has been called");
                }
                C8241g.this.f20247b.mo57369aj().mo57296b(C8241g.this.f20254i, str);
                return;
            }
            m24828a(str, (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    if (C8241g.this.f20261p.compareAndSet(false, true)) {
                        C8262a.this.f20323b.onAdLoadFailed(C8241g.this.f20253h, maxError);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m24831b(String str, final Bundle bundle) {
            if (C8241g.this.f20254i.mo56105x().get()) {
                C8626v unused = C8241g.this.f20248c;
                if (C8626v.m26252a()) {
                    C8626v a = C8241g.this.f20248c;
                    a.mo57822e("MediationAdapterWrapper", C8241g.this.f20251f + ": blocking ad displayed callback for " + C8241g.this.f20254i + " since onAdHidden() has been called");
                }
                C8241g.this.f20247b.mo57369aj().mo57296b(C8241g.this.f20254i, str);
            } else if (C8241g.this.f20254i.mo56104w().compareAndSet(false, true)) {
                m24828a(str, (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                    public void run() {
                        C8262a.this.f20323b.mo56039b(C8241g.this.f20254i, bundle);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m24832b(String str, final MaxError maxError) {
            if (C8241g.this.f20254i.mo56105x().get()) {
                C8626v unused = C8241g.this.f20248c;
                if (C8626v.m26252a()) {
                    C8626v a = C8241g.this.f20248c;
                    a.mo57822e("MediationAdapterWrapper", C8241g.this.f20251f + ": blocking ad display failed callback for " + C8241g.this.f20254i + " since onAdHidden() has been called");
                }
                C8241g.this.f20247b.mo57369aj().mo57296b(C8241g.this.f20254i, str);
                return;
            }
            m24828a(str, (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onAdDisplayFailed(C8241g.this.f20254i, maxError);
                }
            });
        }

        /* renamed from: c */
        private void m24833c(String str, final Bundle bundle) {
            if (C8241g.this.f20254i.mo56105x().compareAndSet(false, true)) {
                m24828a(str, (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                    public void run() {
                        C8262a.this.f20323b.mo56040c(C8241g.this.f20254i, bundle);
                    }
                });
            }
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked((Bundle) null);
        }

        public void onAdViewAdClicked(final Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad clicked with extra info: " + bundle);
            }
            m24828a("onAdViewAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.mo56041d(C8241g.this.f20254i, bundle);
                }
            });
        }

        public void onAdViewAdCollapsed() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad collapsed");
            }
            m24828a("onAdViewAdCollapsed", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onAdCollapsed(C8241g.this.f20254i);
                }
            });
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m24832b("onAdViewAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed((Bundle) null);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad displayed with extra info: " + bundle);
            }
            m24831b("onAdViewAdDisplayed", bundle);
        }

        public void onAdViewAdExpanded() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad expanded");
            }
            m24828a("onAdViewAdExpanded", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onAdExpanded(C8241g.this.f20254i);
                }
            });
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden((Bundle) null);
        }

        public void onAdViewAdHidden(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad hidden with extra info: " + bundle);
            }
            m24833c("onAdViewAdHidden", bundle);
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m24829a("onAdViewAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, (Bundle) null);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": adview ad loaded with extra info: " + bundle);
            }
            View unused2 = C8241g.this.f20255j = view;
            m24827a("onAdViewAdLoaded", bundle);
        }

        public void onAppOpenAdClicked() {
            onAppOpenAdClicked((Bundle) null);
        }

        public void onAppOpenAdClicked(final Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad clicked with extra info: " + bundle);
            }
            m24828a("onAppOpenAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.mo56041d(C8241g.this.f20254i, bundle);
                }
            });
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad display failed with error: " + maxAdapterError);
            }
            m24832b("onAppOpenAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed((Bundle) null);
        }

        public void onAppOpenAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad displayed with extra info: " + bundle);
            }
            m24831b("onAppOpenAdDisplayed", bundle);
        }

        public void onAppOpenAdHidden() {
            onAppOpenAdHidden((Bundle) null);
        }

        public void onAppOpenAdHidden(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad hidden with extra info: " + bundle);
            }
            m24833c("onAppOpenAdHidden", bundle);
        }

        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            m24829a("onAppOpenAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded((Bundle) null);
        }

        public void onAppOpenAdLoaded(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": app open ad loaded with extra info: " + bundle);
            }
            m24827a("onAppOpenAdLoaded", bundle);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked((Bundle) null);
        }

        public void onInterstitialAdClicked(final Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m24828a("onInterstitialAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.mo56041d(C8241g.this.f20254i, bundle);
                }
            });
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m24832b("onInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed((Bundle) null);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m24831b("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden((Bundle) null);
        }

        public void onInterstitialAdHidden(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad hidden with extra info " + bundle);
            }
            m24833c("onInterstitialAdHidden", bundle);
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m24829a("onInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded((Bundle) null);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m24827a("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": native ad clicked");
            }
            m24828a("onNativeAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onAdClicked(C8241g.this.f20254i);
                }
            });
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": native ad displayed with extra info: " + bundle);
            }
            m24831b("onNativeAdDisplayed", bundle);
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m24829a("onNativeAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": native ad loaded with extra info: " + bundle);
            }
            MaxNativeAd unused2 = C8241g.this.f20256k = maxNativeAd;
            m24827a("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked((Bundle) null);
        }

        public void onRewardedAdClicked(final Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m24828a("onRewardedAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.mo56041d(C8241g.this.f20254i, bundle);
                }
            });
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m24832b("onRewardedAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed((Bundle) null);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m24831b("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden((Bundle) null);
        }

        public void onRewardedAdHidden(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m24833c("onRewardedAdHidden", bundle);
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m24829a("onRewardedAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded((Bundle) null);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m24827a("onRewardedAdLoaded", bundle);
        }

        public void onRewardedAdVideoCompleted() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded video completed");
            }
            m24828a("onRewardedAdVideoCompleted", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onRewardedVideoCompleted(C8241g.this.f20254i);
                }
            });
        }

        public void onRewardedAdVideoStarted() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded video started");
            }
            m24828a("onRewardedAdVideoStarted", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onRewardedVideoStarted(C8241g.this.f20254i);
                }
            });
        }

        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked((Bundle) null);
        }

        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            m24828a("onRewardedInterstitialAdClicked", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.mo56041d(C8241g.this.f20254i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            m24832b("onRewardedInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed((Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            m24831b("onRewardedInterstitialAdDisplayed", bundle);
        }

        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden((Bundle) null);
        }

        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            m24833c("onRewardedInterstitialAdHidden", bundle);
        }

        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57821d("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m24829a("onRewardedInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded((Bundle) null);
        }

        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            m24827a("onRewardedInterstitialAdLoaded", bundle);
        }

        public void onRewardedInterstitialAdVideoCompleted() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial completed");
            }
            m24828a("onRewardedInterstitialAdVideoCompleted", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onRewardedVideoCompleted(C8241g.this.f20254i);
                }
            });
        }

        public void onRewardedInterstitialAdVideoStarted() {
            C8626v unused = C8241g.this.f20248c;
            if (C8626v.m26252a()) {
                C8626v a = C8241g.this.f20248c;
                a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": rewarded interstitial started");
            }
            m24828a("onRewardedInterstitialAdVideoStarted", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                public void run() {
                    C8262a.this.f20323b.onRewardedVideoStarted(C8241g.this.f20254i);
                }
            });
        }

        public void onUserRewarded(final MaxReward maxReward) {
            if (C8241g.this.f20254i instanceof C8072c) {
                final C8072c cVar = (C8072c) C8241g.this.f20254i;
                if (cVar.mo56126M().compareAndSet(false, true)) {
                    C8626v unused = C8241g.this.f20248c;
                    if (C8626v.m26252a()) {
                        C8626v a = C8241g.this.f20248c;
                        a.mo57820c("MediationAdapterWrapper", C8241g.this.f20251f + ": user was rewarded: " + maxReward);
                    }
                    m24828a("onUserRewarded", (MaxAdListener) this.f20323b, (Runnable) new Runnable() {
                        public void run() {
                            C8262a.this.f20323b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$b */
    private static class C8282b implements MaxAdapter.OnCompletionListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8490n f20358a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C8076f f20359b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f20360c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Runnable f20361d;

        public C8282b(C8490n nVar, C8076f fVar, long j, Runnable runnable) {
            this.f20358a = nVar;
            this.f20359b = fVar;
            this.f20360c = j;
            this.f20361d = runnable;
        }

        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C8282b.this.f20358a.mo57323G().mo56534a(C8282b.this.f20359b, SystemClock.elapsedRealtime() - C8282b.this.f20360c, initializationStatus, str);
                    if (C8282b.this.f20361d != null) {
                        C8282b.this.f20361d.run();
                    }
                }
            }, this.f20359b.mo56172ae());
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$c */
    private static class C8284c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8079h f20365a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final MaxSignalCollectionListener f20366b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicBoolean f20367c = new AtomicBoolean();

        C8284c(C8079h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f20365a = hVar;
            this.f20366b = maxSignalCollectionListener;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$d */
    private class C8285d extends C8401a {
        private C8285d() {
            super("TaskTimeoutMediatedAd", C8241g.this.f20247b);
        }

        /* renamed from: a */
        private void m24841a(C8070a aVar) {
            if (aVar != null) {
                this.f21118b.mo57328L().mo56673a(aVar);
            }
        }

        public void run() {
            if (C8241g.this.f20261p.get()) {
                return;
            }
            if (C8241g.this.f20254i.mo56092l()) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str = this.f21119c;
                    vVar2.mo57818b(str, C8241g.this.f20251f + " is timing out, considering JS Tag ad loaded: " + C8241g.this.f20254i);
                }
                m24841a(C8241g.this.f20254i);
                return;
            }
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f21120d;
                String str2 = this.f21119c;
                vVar4.mo57822e(str2, C8241g.this.f20251f + " is timing out " + C8241g.this.f20254i + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m24841a(C8241g.this.f20254i);
            C8241g.this.f20258m.m24829a(this.f21119c, (MaxError) new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$e */
    private class C8286e extends C8401a {

        /* renamed from: e */
        private final C8284c f20370e;

        private C8286e(C8284c cVar) {
            super("TaskTimeoutSignalCollection", C8241g.this.f20247b);
            this.f20370e = cVar;
        }

        public void run() {
            if (!this.f20370e.f20367c.get()) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str = this.f21119c;
                    vVar2.mo57822e(str, C8241g.this.f20251f + " is timing out " + this.f20370e.f20365a + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C8241g gVar = C8241g.this;
                gVar.m24793b("The adapter (" + C8241g.this.f20251f + ") timed out", this.f20370e);
            }
        }
    }

    C8241g(C8076f fVar, MaxAdapter maxAdapter, boolean z, C8490n nVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (nVar != null) {
            this.f20249d = fVar.mo56152S();
            this.f20252g = maxAdapter;
            this.f20247b = nVar;
            this.f20248c = nVar.mo57320D();
            this.f20250e = fVar;
            this.f20251f = maxAdapter.getClass().getSimpleName();
            this.f20263r = z;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private void m24787a(final Runnable runnable, C8070a aVar) {
        m24790a("show_ad", (Runnable) new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad for " + C8241g.this.f20249d + " due to: " + th;
                    C8626v.m26258i("MediationAdapterWrapper", str);
                    C8241g.this.f20258m.m24832b("show_ad", (MaxError) new MaxErrorImpl(-1, str));
                    C8241g.this.m24788a("show_ad");
                    C8241g.this.f20247b.mo57322F().mo56545a(C8241g.this.f20250e.mo56151R(), "show_ad", C8241g.this.f20254i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24788a(String str) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f20248c;
            vVar.mo57820c("MediationAdapterWrapper", "Marking " + this.f20251f + " as disabled due to: " + str);
        }
        this.f20260o.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24789a(String str, C8284c cVar) {
        if (cVar.f20367c.compareAndSet(false, true) && cVar.f20366b != null) {
            cVar.f20366b.onSignalCollected(str);
        }
    }

    /* renamed from: a */
    private void m24790a(final String str, final Runnable runnable) {
        C824411 r0 = new Runnable() {
            public void run() {
                try {
                    C8626v unused = C8241g.this.f20248c;
                    if (C8626v.m26252a()) {
                        C8626v a = C8241g.this.f20248c;
                        a.mo57818b("MediationAdapterWrapper", C8241g.this.f20251f + ": running " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    runnable.run();
                    C8626v unused2 = C8241g.this.f20248c;
                    if (C8626v.m26252a()) {
                        C8626v a2 = C8241g.this.f20248c;
                        a2.mo57818b("MediationAdapterWrapper", C8241g.this.f20251f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    C8626v.m26254c("MediationAdapterWrapper", "Failed operation " + str + " for " + C8241g.this.f20249d, th);
                    C8241g gVar = C8241g.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fail_");
                    sb.append(str);
                    gVar.m24788a(sb.toString());
                    if (!str.equals("destroy")) {
                        C8241g.this.f20247b.mo57322F().mo56545a(C8241g.this.f20250e.mo56151R(), str, C8241g.this.f20254i);
                    }
                }
            }
        };
        if (this.f20250e.mo56159Z()) {
            this.f20246a.post(r0);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24793b(String str, C8284c cVar) {
        if (cVar.f20367c.compareAndSet(false, true) && cVar.f20366b != null) {
            cVar.f20366b.onSignalCollectionFailed(str);
        }
    }

    /* renamed from: b */
    private boolean m24794b(C8070a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.mo56072g() == null) {
                C8626v.m26258i("MediationAdapterWrapper", "Adapter has been garbage collected");
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.mo56072g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else if (activity == null && MaxAdFormat.APP_OPEN != aVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            } else if (!this.f20260o.get()) {
                String str = "Mediation adapter '" + this.f20251f + "' is disabled. Showing ads with this adapter is disabled.";
                C8626v.m26258i("MediationAdapterWrapper", str);
                maxErrorImpl = new MaxErrorImpl(-1, str);
            } else if (mo56565g()) {
                return true;
            } else {
                throw new IllegalStateException("Mediation adapter '" + this.f20251f + "' does not have an ad loaded. Please load an ad first");
            }
            this.f20258m.m24832b("ad_show", (MaxError) maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: a */
    public View mo56552a() {
        return this.f20255j;
    }

    /* renamed from: a */
    public void mo56553a(final C8070a aVar, final Activity activity) {
        Runnable runnable;
        if (m24794b(aVar, activity)) {
            if (aVar.mo56093m() != null) {
                runnable = new Runnable() {
                    public void run() {
                        C8241g.this.f20247b.mo57325I().mo58017a((C8072c) aVar, activity, C8241g.this.f20258m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C8241g.this.f20252g).showInterstitialAd(C8241g.this.f20259n, activity, C8241g.this.f20258m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAppOpenAdapter) C8241g.this.f20252g).showAppOpenAd(C8241g.this.f20259n, activity, C8241g.this.f20258m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C8241g.this.f20252g).showRewardedAd(C8241g.this.f20259n, activity, C8241g.this.f20258m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C8241g.this.f20252g).showRewardedInterstitialAd(C8241g.this.f20259n, activity, C8241g.this.f20258m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m24787a(runnable, aVar);
        }
    }

    /* renamed from: a */
    public void mo56554a(C8070a aVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (m24794b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) C8241g.this.f20252g).showInterstitialAd(C8241g.this.f20259n, viewGroup, lifecycle, activity, C8241g.this.f20258m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdViewAdapter) C8241g.this.f20252g).showRewardedAd(C8241g.this.f20259n, viewGroup, lifecycle, activity, C8241g.this.f20258m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m24787a(runnable, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56555a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        m24790a("initialize", (Runnable) new Runnable() {
            public void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C8626v unused = C8241g.this.f20248c;
                if (C8626v.m26252a()) {
                    C8626v a = C8241g.this.f20248c;
                    a.mo57818b("MediationAdapterWrapper", "Initializing " + C8241g.this.f20251f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + C8241g.this.f20250e.mo56159Z());
                }
                C8241g.this.f20252g.initialize(maxAdapterInitializationParameters, activity, new C8282b(C8241g.this.f20247b, C8241g.this.f20250e, elapsedRealtime, runnable));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56556a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, C8079h hVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.f20260o.get()) {
            C8626v.m26258i("MediationAdapterWrapper", "Mediation adapter '" + this.f20251f + "' is disabled. Signal collection ads with this adapter is disabled.");
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f20251f + ") is disabled");
        } else {
            final C8284c cVar = new C8284c(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f20252g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2 = maxAdapterSignalCollectionParameters;
                final Activity activity2 = activity;
                final C8079h hVar2 = hVar;
                m24790a("collect_signal", (Runnable) new Runnable() {
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters2, activity2, new MaxSignalCollectionListener() {
                                public void onSignalCollected(String str) {
                                    C8241g.this.m24789a(str, cVar);
                                }

                                public void onSignalCollectionFailed(String str) {
                                    C8241g.this.m24793b(str, cVar);
                                }
                            });
                        } catch (Throwable th) {
                            String str = "Failed signal collection for " + C8241g.this.f20249d + " due to: " + th;
                            C8626v.m26258i("MediationAdapterWrapper", str);
                            C8241g.this.m24793b(str, cVar);
                            C8241g.this.m24788a("collect_signal");
                            C8241g.this.f20247b.mo57322F().mo56545a(C8241g.this.f20250e.mo56151R(), "collect_signal", C8241g.this.f20254i);
                        }
                        if (cVar.f20367c.get()) {
                            return;
                        }
                        if (hVar2.mo56171ad() == 0) {
                            C8626v unused = C8241g.this.f20248c;
                            if (C8626v.m26252a()) {
                                C8241g.this.f20248c.mo57818b("MediationAdapterWrapper", "Failing signal collection " + hVar2 + " since it has 0 timeout");
                            }
                            C8241g.this.m24793b("The adapter (" + C8241g.this.f20251f + ") has 0 timeout", cVar);
                            return;
                        }
                        int i = (hVar2.mo56171ad() > 0 ? 1 : (hVar2.mo56171ad() == 0 ? 0 : -1));
                        C8626v unused2 = C8241g.this.f20248c;
                        boolean a = C8626v.m26252a();
                        if (i > 0) {
                            if (a) {
                                C8241g.this.f20248c.mo57818b("MediationAdapterWrapper", "Setting timeout " + hVar2.mo56171ad() + "ms. for " + hVar2);
                            }
                            C8241g.this.f20247b.mo57337V().mo57229a((C8401a) new C8286e(cVar), C8432o.C8434a.MEDIATION_TIMEOUT, hVar2.mo56171ad());
                        } else if (a) {
                            C8241g.this.f20248c.mo57818b("MediationAdapterWrapper", "Negative timeout set for " + hVar2 + ", not scheduling a timeout");
                        }
                    }
                });
                return;
            }
            m24793b("The adapter (" + this.f20251f + ") does not support signal collection", cVar);
        }
    }

    /* renamed from: a */
    public void mo56557a(MaxNativeAdView maxNativeAdView) {
        this.f20257l = maxNativeAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56558a(String str, C8070a aVar) {
        this.f20253h = str;
        this.f20254i = aVar;
    }

    /* renamed from: a */
    public void mo56559a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final C8070a aVar, final Activity activity, MediationServiceImpl.C8066a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.f20260o.get()) {
            String str2 = "Mediation adapter '" + this.f20251f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            C8626v.m26258i("MediationAdapterWrapper", str2);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
        } else {
            this.f20259n = maxAdapterResponseParameters;
            this.f20258m.m24824a(aVar2);
            final MaxAdFormat m = aVar.mo56093m() != null ? aVar.mo56093m() : aVar.getFormat();
            if (m == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C8241g.this.f20252g).loadInterstitialAd(maxAdapterResponseParameters, activity, C8241g.this.f20258m);
                    }
                };
            } else if (m == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAppOpenAdapter) C8241g.this.f20252g).loadAppOpenAd(maxAdapterResponseParameters, activity, C8241g.this.f20258m);
                    }
                };
            } else if (m == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C8241g.this.f20252g).loadRewardedAd(maxAdapterResponseParameters, activity, C8241g.this.f20258m);
                    }
                };
            } else if (m == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C8241g.this.f20252g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, C8241g.this.f20258m);
                    }
                };
            } else if (m == MaxAdFormat.NATIVE) {
                runnable = new Runnable() {
                    public void run() {
                        ((MediationAdapterBase) C8241g.this.f20252g).loadNativeAd(maxAdapterResponseParameters, activity, C8241g.this.f20258m);
                    }
                };
            } else if (m.isAdViewAd()) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAdViewAdapter) C8241g.this.f20252g).loadAdViewAd(maxAdapterResponseParameters, m, activity, C8241g.this.f20258m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " (" + aVar.mo56093m() + ") is not a supported ad format");
            }
            m24790a("load_ad", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        String str = "Failed to start loading ad for " + C8241g.this.f20249d + " due to: " + th;
                        C8626v.m26258i("MediationAdapterWrapper", str);
                        C8241g.this.f20258m.m24829a("load_ad", (MaxError) new MaxErrorImpl(-1, str));
                        C8241g.this.m24788a("load_ad");
                        C8241g.this.f20247b.mo57322F().mo56545a(C8241g.this.f20250e.mo56151R(), "load_ad", C8241g.this.f20254i);
                    }
                    if (!C8241g.this.f20261p.get()) {
                        long ad = C8241g.this.f20250e.mo56171ad();
                        if (ad > 0) {
                            C8626v unused = C8241g.this.f20248c;
                            if (C8626v.m26252a()) {
                                C8241g.this.f20248c.mo57818b("MediationAdapterWrapper", "Setting timeout " + ad + "ms. for " + aVar);
                            }
                            C8241g.this.f20247b.mo57337V().mo57229a((C8401a) new C8285d(), C8432o.C8434a.MEDIATION_TIMEOUT, ad);
                            return;
                        }
                        C8626v unused2 = C8241g.this.f20248c;
                        if (C8626v.m26252a()) {
                            C8241g.this.f20248c.mo57818b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public MaxNativeAd mo56560b() {
        return this.f20256k;
    }

    /* renamed from: c */
    public MaxNativeAdView mo56561c() {
        return this.f20257l;
    }

    /* renamed from: d */
    public String mo56562d() {
        return this.f20249d;
    }

    /* renamed from: e */
    public MediationServiceImpl.C8066a mo56563e() {
        return this.f20258m.f20323b;
    }

    /* renamed from: f */
    public boolean mo56564f() {
        return this.f20260o.get();
    }

    /* renamed from: g */
    public boolean mo56565g() {
        return this.f20261p.get() && this.f20262q.get();
    }

    /* renamed from: h */
    public String mo56566h() {
        MaxAdapter maxAdapter = this.f20252g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            C8626v.m26254c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f20249d, th);
            m24788a("sdk_version");
            this.f20247b.mo57322F().mo56545a(this.f20250e.mo56151R(), "sdk_version", this.f20254i);
            return null;
        }
    }

    /* renamed from: i */
    public String mo56567i() {
        MaxAdapter maxAdapter = this.f20252g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            C8626v.m26254c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f20249d, th);
            m24788a("adapter_version");
            this.f20247b.mo57322F().mo56545a(this.f20250e.mo56151R(), "adapter_version", this.f20254i);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo56568j() {
        if (!this.f20263r) {
            m24790a("destroy", (Runnable) new Runnable() {
                public void run() {
                    C8241g.this.m24788a("destroy");
                    C8241g.this.f20252g.onDestroy();
                    MaxAdapter unused = C8241g.this.f20252g = null;
                    View unused2 = C8241g.this.f20255j = null;
                    MaxNativeAd unused3 = C8241g.this.f20256k = null;
                    MaxNativeAdView unused4 = C8241g.this.f20257l = null;
                }
            });
        }
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f20251f + "'" + '}';
    }
}
