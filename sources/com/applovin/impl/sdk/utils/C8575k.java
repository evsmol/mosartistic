package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p252ad.C8357g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.k */
public class C8575k {
    /* renamed from: a */
    public static void m26122a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adOpenedFullscreen(C8575k.m26152b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26123a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adFailedToDisplay(C8575k.m26152b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26124a(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinNativeAdEventListener.this.onNativeAdClicked(appLovinNativeAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26125a(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final int i) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinNativeAdLoadListener.this.onNativeAdLoadFailed(i);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26126a(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26131a(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m26127a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        m26128a(maxAdListener, maxAd, maxError, false);
    }

    /* renamed from: a */
    public static void m26128a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdDisplayFailed(maxAd, maxError);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26129a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        m26130a(maxAdListener, maxAd, maxReward, false);
    }

    /* renamed from: a */
    public static void m26130a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onUserRewarded(maxAd, maxReward);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26131a(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdLoaded(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26132a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        m26133a(maxAdListener, str, maxError, false);
    }

    /* renamed from: a */
    public static void m26133a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, boolean z) {
        if (str != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdLoadFailed(str, maxError);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26134a(MaxAdRequestListener maxAdRequestListener, String str) {
        m26135a(maxAdRequestListener, str, false);
    }

    /* renamed from: a */
    public static void m26135a(final MaxAdRequestListener maxAdRequestListener, final String str, boolean z) {
        if (str != null && maxAdRequestListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdRequestListener.this.onAdRequestStarted(str);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify request listener about ad request starting", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26136a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        m26137a(maxAdRevenueListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m26137a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdRevenueListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdRevenueListener.this.onAdRevenuePaid(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad revenue being paid", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26138a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        m26139a(maxAdReviewListener, str, maxAd, false);
    }

    /* renamed from: a */
    public static void m26139a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdReviewListener.this.onCreativeIdGenerated(str, maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26140a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdClicked(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being clicked", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26141a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdLoaded(maxNativeAdView, maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being loaded", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26142a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, boolean z) {
        if (str != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdLoadFailed(str, maxError);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad failing to load", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26143a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdClickListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdClickListener.this.adClicked(C8575k.m26152b(appLovinAd));
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26144a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdDisplayListener.this.adDisplayed(C8575k.m26152b(appLovinAd));
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26145a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof C8357g) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    ((C8357g) AppLovinAdDisplayListener.this).onAdDisplayFailed(str);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26146a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.validationRequestFailed(C8575k.m26152b(appLovinAd), i);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26147a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userRewardVerified(C8575k.m26152b(appLovinAd), map);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26148a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdVideoPlaybackListener.this.videoPlaybackBegan(C8575k.m26152b(appLovinAd));
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26149a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
            final AppLovinAd appLovinAd2 = appLovinAd;
            final double d2 = d;
            final boolean z2 = z;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdVideoPlaybackListener.this.videoPlaybackEnded(C8575k.m26152b(appLovinAd2), d2, z2);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26150a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m26151a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static AppLovinAd m26152b(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    /* renamed from: b */
    public static void m26153b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adClosedFullscreen(C8575k.m26152b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m26154b(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26155b(maxAdListener, maxAd, false);
    }

    /* renamed from: b */
    public static void m26155b(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdDisplayed(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m26156b(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdExpired(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being expired", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m26157b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdDisplayListener.this.adHidden(C8575k.m26152b(appLovinAd));
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m26158b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userOverQuota(C8575k.m26152b(appLovinAd), map);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m26159c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adLeftApplication(C8575k.m26152b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m26160c(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26161c(maxAdListener, maxAd, false);
    }

    /* renamed from: c */
    public static void m26161c(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdHidden(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m26162c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userRewardRejected(C8575k.m26152b(appLovinAd), map);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public static void m26163d(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26164d(maxAdListener, maxAd, false);
    }

    /* renamed from: d */
    public static void m26164d(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdClicked(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public static void m26165e(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26166e(maxAdListener, maxAd, false);
    }

    /* renamed from: e */
    public static void m26166e(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoStarted(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public static void m26167f(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26168f(maxAdListener, maxAd, false);
    }

    /* renamed from: f */
    public static void m26168f(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoCompleted(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public static void m26169g(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26170g(maxAdListener, maxAd, false);
    }

    /* renamed from: g */
    public static void m26170g(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) MaxAdListener.this).onAdExpanded(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public static void m26171h(MaxAdListener maxAdListener, MaxAd maxAd) {
        m26172h(maxAdListener, maxAd, false);
    }

    /* renamed from: h */
    public static void m26172h(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) MaxAdListener.this).onAdCollapsed(maxAd);
                    } catch (Throwable th) {
                        C8626v.m26254c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                    }
                }
            });
        }
    }
}
