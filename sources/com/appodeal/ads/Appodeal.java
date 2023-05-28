package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventParameters;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.C9205h2;
import com.appodeal.ads.C9566t0;
import com.appodeal.ads.C9710x5;
import com.appodeal.ads.Native;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.regulator.CCPAUserConsent;
import com.appodeal.ads.regulator.GDPRUserConsent;
import com.appodeal.ads.regulator.UserConsent;
import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.rewarded.Reward;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.utils.Log;
import com.appodeal.consent.Consent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {}, mo38198d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J*\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007J*\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\"\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0016H\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0012\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010!\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010#\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0007J\u0012\u0010%\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010$H\u0007J\u0012\u0010'\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020(H\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010*\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0007J\u001a\u0010,\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010,\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0004H\u0007J\u001a\u0010.\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u00100\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\fH\u0007J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007J\b\u00103\u001a\u00020\fH\u0007J\u0010\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\fH\u0007J\u0010\u00106\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u00107\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0010\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0006H\u0007J\u0010\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0007J\u0010\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\fH\u0007J\b\u0010@\u001a\u00020\fH\u0007J\u0010\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020\fH\u0007J\u0010\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\fH\u0007J\u0018\u0010F\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u0006H\u0007J\u0010\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020\fH\u0007J\u0010\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0006H\u0007J\u0010\u0010L\u001a\u00020K2\u0006\u0010;\u001a\u00020:H\u0007J\u0010\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020MH\u0007J \u0010S\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u0004H\u0007J\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040T2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010W\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010V\u001a\u00020\u0004H\u0007J\u0010\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0004H\u0007J \u0010W\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010Y\u001a\u00020\n2\u0006\u0010X\u001a\u00020\u0004H\u0007J\n\u0010Z\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010]\u001a\u00020\n2\u0006\u0010\\\u001a\u00020[H\u0007J\n\u0010^\u001a\u0004\u0018\u00010[H\u0007J\u0010\u0010`\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u0006H\u0007J\u0011\u0010a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\ba\u0010bJ\b\u0010c\u001a\u00020\u0004H\u0007J\n\u0010d\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010e\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010f\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010h\u001a\u00020gH\u0007J\b\u0010j\u001a\u00020iH\u0007J\u0010\u0010l\u001a\u00020\n2\u0006\u0010k\u001a\u00020\fH\u0007J\b\u0010n\u001a\u00020mH\u0007J\u0010\u0010p\u001a\u00020\n2\u0006\u0010o\u001a\u00020mH\u0007J\u0018\u0010s\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\fH\u0007J\u0018\u0010s\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0006H\u0007J\u0018\u0010s\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020PH\u0007J\u0018\u0010s\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0004H\u0007J\u001a\u0010s\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020t0T2\u0006\u0010+\u001a\u00020\u0006H\u0007J\b\u0010v\u001a\u00020\u0006H\u0007J\u001a\u0010w\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007J \u0010y\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0006\u0012\u0004\u0018\u00010\u00040x2\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007J\u0012\u0010{\u001a\u00020z2\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007J\u001c\u0010~\u001a\u00020\n2\b\u0010|\u001a\u0004\u0018\u00010\u00042\b\u0010}\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010~\u001a\u00020\n2\b\u0010|\u001a\u0004\u0018\u00010\u00042\b\u0010}\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\fH\u0007J\t\u0010\u0001\u001a\u00020\nH\u0007J\u0011\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001b\u0010\u0001\u001a\u00020\n2\b\u0010r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0005\b\u0001\u0010\u0013J\u0011\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0004H\u0007J\u001a\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0006H\u0007J\u001a\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020PH\u0007J\u001a\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\fH\u0007J\u001c\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0011\u0010\u0001\u001a\u00020P2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J,\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00042\u0018\u0010\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0001H\u0007J&\u0010\u0001\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\b\u0010\u0001\u001a\u00030\u00012\t\u0010\t\u001a\u0005\u0018\u00010\u0001H\u0007R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020\u00068\u0006XT¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0001\u0010 \u0001R!\u0010¤\u0001\u001a\u0004\u0018\u00010(8FX\u0004¢\u0006\u0010\u0012\u0006\b£\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¥\u0001"}, mo38199d2 = {"Lcom/appodeal/ads/Appodeal;", "", "Landroid/app/Activity;", "activity", "", "appKey", "", "adTypes", "Lcom/appodeal/ads/initializing/ApdInitializationCallback;", "callback", "", "initialize", "", "hasConsent", "Lcom/appodeal/consent/Consent;", "consent", "adType", "isInitialized", "updateConsent", "(Ljava/lang/Boolean;)V", "Lcom/appodeal/ads/regulator/GDPRUserConsent;", "updateGDPRUserConsent", "Lcom/appodeal/ads/regulator/CCPAUserConsent;", "updateCCPAUserConsent", "isAutoCacheEnabled", "Lcom/appodeal/ads/AppodealRequestCallbacks;", "callbacks", "setRequestCallbacks", "Lcom/appodeal/ads/revenue/AdRevenueCallbacks;", "setAdRevenueCallbacks", "Lcom/appodeal/ads/InterstitialCallbacks;", "setInterstitialCallbacks", "Lcom/appodeal/ads/RewardedVideoCallbacks;", "setRewardedVideoCallbacks", "Lcom/appodeal/ads/BannerCallbacks;", "setBannerCallbacks", "Lcom/appodeal/ads/MrecCallbacks;", "setMrecCallbacks", "Lcom/appodeal/ads/NativeCallbacks;", "setNativeCallbacks", "Lcom/appodeal/ads/Native$NativeAdType;", "setNativeAdType", "cache", "count", "show", "placementName", "hide", "autoCache", "setAutoCache", "triggerOnLoadedOnPrecache", "setTriggerOnLoadedOnPrecache", "isSharedAdsInstanceAcrossActivities", "sharedAdsInstanceAcrossActivities", "setSharedAdsInstanceAcrossActivities", "isLoaded", "isPrecache", "bannerViewId", "setBannerViewId", "Landroid/content/Context;", "context", "Lcom/appodeal/ads/BannerView;", "getBannerView", "enabled", "setSmartBanners", "isSmartBannersEnabled", "set728x90Banners", "animate", "setBannerAnimation", "leftBannerRotation", "rightBannerRotation", "setBannerRotation", "useSafeArea", "setUseSafeArea", "mrecViewId", "setMrecViewId", "Lcom/appodeal/ads/MrecView;", "getMrecView", "Lcom/appodeal/ads/Native$MediaAssetType;", "requiredMediaAssetType", "setRequiredNativeMediaAssetType", "", "amount", "currency", "trackInAppPurchase", "", "getNetworks", "network", "disableNetwork", "userId", "setUserId", "getUserId", "Lcom/appodeal/ads/UserSettings$Gender;", "gender", "setUserGender", "getUserGender", "age", "setUserAge", "getUserAge", "()Ljava/lang/Integer;", "getVersion", "getFrameworkName", "getPluginVersion", "getEngineVersion", "", "getSegmentId", "Ljava/util/Date;", "getBuildDate", "testMode", "setTesting", "Lcom/appodeal/ads/utils/Log$LogLevel;", "getLogLevel", "logLevel", "setLogLevel", "name", "value", "setCustomFilter", "Lcom/appodeal/ads/NativeAd;", "getNativeAds", "getAvailableNativeAdsCount", "canShow", "Landroid/util/Pair;", "getRewardParameters", "Lcom/appodeal/ads/rewarded/Reward;", "getReward", "frameworkName", "pluginVersion", "setFramework", "engineVersion", "muteVideosIfCallsMuted", "disableWebViewCacheClear", "startTestActivity", "setChildDirectedTreatment", "destroy", "key", "setExtraData", "getPredictedEcpm", "eventName", "", "params", "logEvent", "Lcom/appodeal/ads/inapp/InAppPurchase;", "purchase", "Lcom/appodeal/ads/inapp/InAppPurchaseValidateCallback;", "validateInAppPurchase", "NONE", "I", "INTERSTITIAL_INT", "SKIPPABLE_VIDEO", "INTERSTITIAL", "BANNER", "BANNER_BOTTOM", "BANNER_TOP", "BANNER_LEFT", "BANNER_RIGHT", "BANNER_VIEW", "REWARDED_VIDEO", "MREC", "NATIVE", "ALL", "getALL$annotations", "()V", "getNativeAdType", "()Lcom/appodeal/ads/Native$NativeAdType;", "getNativeAdType$annotations", "nativeAdType", "apd_core"}, mo38200k = 1, mo38201mv = {1, 6, 0})
public final class Appodeal {
    public static final int ALL = 4095;
    public static final int BANNER = 4;
    public static final int BANNER_BOTTOM = 8;
    public static final int BANNER_LEFT = 1024;
    public static final int BANNER_RIGHT = 2048;
    public static final int BANNER_TOP = 16;
    public static final int BANNER_VIEW = 64;
    public static final Appodeal INSTANCE = new Appodeal();
    public static final int INTERSTITIAL = 3;
    public static final int INTERSTITIAL_INT = 1;
    public static final int MREC = 256;
    public static final int NATIVE = 512;
    public static final int NONE = 0;
    public static final int REWARDED_VIDEO = 128;
    public static final int SKIPPABLE_VIDEO = 2;

    public static final void cache(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C9409q4.m27817a(activity, i, 1);
    }

    public static final void cache(Activity activity, int i, int i2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C9409q4.m27817a(activity, i, i2);
    }

    public static final boolean canShow(int i) {
        return canShow$default(i, (String) null, 2, (Object) null);
    }

    public static final boolean canShow(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        return C9409q4.m27841a(i, str);
    }

    public static /* synthetic */ boolean canShow$default(int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        return canShow(i, str);
    }

    public static final void destroy(int i) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23066K.mo59986a((String) null);
        if ((i & 3164) > 0) {
            try {
                C9566t0.C9567a c = C9566t0.m28252c();
                C9566t0.C9568b a = C9566t0.m28247a();
                c.getClass();
                a.mo60837a(LogConstants.EVENT_AD_DESTROY, (String) null);
                C9710x5.C9714d a2 = c.mo61224a((Activity) null);
                a2.f24599a = null;
                a2.f24600b = C9181f0.HIDDEN;
                if (c.f24585c != null) {
                    C9212h5.f23153a.post(new C9681v5(c, a));
                }
                C9710x5.m28529a((C9737z5) a.mo60846f(), (C9128b0) a.f24286d);
                C9710x5.m28529a((C9737z5) a.f24307y, (C9128b0) a.f24286d);
                a.f24307y = null;
                C9212h5.f23153a.post(new C9691w5(c));
            } catch (Exception e) {
                Log.log(e);
                return;
            }
        }
        if ((i & 256) > 0) {
            C9205h2.C9206a c2 = C9205h2.m27340c();
            C9205h2.C9207b a3 = C9205h2.m27336a();
            c2.getClass();
            a3.mo60837a(LogConstants.EVENT_AD_DESTROY, (String) null);
            C9710x5.C9714d a4 = c2.mo61224a((Activity) null);
            a4.f24599a = null;
            a4.f24600b = C9181f0.HIDDEN;
            if (c2.f24585c != null) {
                C9212h5.f23153a.post(new C9681v5(c2, a3));
            }
            C9710x5.m28529a((C9737z5) a3.mo60846f(), (C9128b0) a3.f24286d);
            C9710x5.m28529a((C9737z5) a3.f24307y, (C9128b0) a3.f24286d);
            a3.f24307y = null;
            C9212h5.f23153a.post(new C9691w5(c2));
        }
    }

    public static final void disableNetwork(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "network");
        C9409q4.m27836a(str, 4095);
    }

    public static final void disableNetwork(Context context, String str, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "network");
        C9409q4.m27836a(str, i);
    }

    public static final void disableNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "network");
        C9409q4.m27836a(str, 4095);
    }

    public static final void disableNetwork(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "network");
        C9409q4.m27836a(str, i);
    }

    public static final void disableWebViewCacheClear() {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23063H.mo59986a((String) null);
        C9422r0 r0Var = C9422r0.f23912a;
    }

    public static /* synthetic */ void getALL$annotations() {
    }

    public static final int getAvailableNativeAdsCount() {
        int size;
        C9409q4 q4Var = C9409q4.f23839a;
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, "available Native Ads count");
        C9323n2 c = Native.m27080c();
        synchronized (c.f23584d) {
            size = c.f23584d.size();
        }
        return size;
    }

    public static final BannerView getBannerView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C9409q4.m27809a(context);
    }

    public static final Date getBuildDate() {
        return C9409q4.m27866f();
    }

    public static final String getEngineVersion() {
        return C9409q4.f23847i;
    }

    public static final String getFrameworkName() {
        return C9409q4.f23845g;
    }

    public static final Log.LogLevel getLogLevel() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9422r0.f23915d;
    }

    public static final MrecView getMrecView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C9409q4.m27845b(context);
    }

    public static final Native.NativeAdType getNativeAdType() {
        C9409q4 q4Var = C9409q4.f23839a;
        return Native.f22732b;
    }

    public static /* synthetic */ void getNativeAdType$annotations() {
    }

    public static final List<NativeAd> getNativeAds(int i) {
        return new ArrayList(C9409q4.m27811a(i));
    }

    public static final List<String> getNetworks(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ArrayList(C9409q4.m27813a(context, i));
    }

    public static final String getPluginVersion() {
        return C9409q4.f23846h;
    }

    public static final double getPredictedEcpm(int i) {
        return C9409q4.m27844b(i);
    }

    public static final Reward getReward() {
        return getReward$default((String) null, 1, (Object) null);
    }

    public static final Reward getReward(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        return C9409q4.m27847b(str);
    }

    public static /* synthetic */ Reward getReward$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        return getReward(str);
    }

    public static final Pair<Double, String> getRewardParameters() {
        return getRewardParameters$default((String) null, 1, (Object) null);
    }

    public static final Pair<Double, String> getRewardParameters(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        return C9409q4.m27854c(str);
    }

    public static /* synthetic */ Pair getRewardParameters$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        return getRewardParameters(str);
    }

    public static final long getSegmentId() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9503n.m28137c().f24113a;
    }

    public static final Integer getUserAge() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9269l5.m27453a().f23317c;
    }

    public static final UserSettings.Gender getUserGender() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9269l5.m27453a().f23316b;
    }

    public static final String getUserId() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9269l5.m27453a().f23315a;
    }

    public static final String getVersion() {
        return C9409q4.m27878n();
    }

    public static final void hide(Activity activity, int i) {
        C9409q4.m27850b(activity, i);
    }

    public static final void initialize(Activity activity, String str, int i) {
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        C9409q4.m27818a(activity, str, i, C9700x2.m28510d(), C9700x2.m28508c(), (ApdInitializationCallback) null);
    }

    public static final void initialize(Activity activity, String str, int i, ApdInitializationCallback apdInitializationCallback) {
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        C9409q4.m27818a(activity, str, i, C9700x2.m28510d(), C9700x2.m28508c(), apdInitializationCallback);
    }

    public static final void initialize(Activity activity, String str, int i, Consent consent) {
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(consent, "consent");
        C9409q4.m27818a(activity, str, i, consent, (Boolean) null, (ApdInitializationCallback) null);
    }

    public static final void initialize(Activity activity, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        C9409q4.m27818a(activity, str, i, (Consent) null, Boolean.valueOf(z), (ApdInitializationCallback) null);
    }

    public static final boolean isAutoCacheEnabled(int i) {
        return C9409q4.m27858c(i);
    }

    public static final boolean isInitialized(int i) {
        return C9409q4.m27862d(i);
    }

    public static final boolean isLoaded(int i) {
        return C9409q4.m27865e(i);
    }

    public static final boolean isPrecache(int i) {
        return C9409q4.m27868f(i);
    }

    public static final boolean isSharedAdsInstanceAcrossActivities() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9422r0.f23923l;
    }

    public static final boolean isSmartBannersEnabled() {
        C9409q4 q4Var = C9409q4.f23839a;
        return C9566t0.f24258b;
    }

    public static final void logEvent(String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        C9409q4.m27839a(str, map);
    }

    public static final void muteVideosIfCallsMuted(boolean z) {
        C9409q4.m27840a(z);
    }

    public static final void set728x90Banners(boolean z) {
        C9409q4.m27852b(z);
    }

    public static final void setAdRevenueCallbacks(AdRevenueCallbacks adRevenueCallbacks) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23074d.mo59986a((String) null);
        C9409q4.f23844f = adRevenueCallbacks;
    }

    public static final void setAutoCache(int i, boolean z) {
        C9409q4.m27814a(i, z);
    }

    public static final void setBannerAnimation(boolean z) {
        C9409q4.m27857c(z);
    }

    public static final void setBannerCallbacks(BannerCallbacks bannerCallbacks) {
        C9409q4.m27821a(bannerCallbacks);
    }

    public static final void setBannerRotation(int i, int i2) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9218i1 i1Var = C9194g1.f23090t;
        i1Var.mo59986a("Banner rotations: left=" + i + ", right=" + i2);
        C9422r0.f23919h = i;
        C9422r0.f23920i = i2;
    }

    public static final void setBannerViewId(int i) {
        C9409q4.m27870g(i);
    }

    public static final void setChildDirectedTreatment(Boolean bool) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23065J.mo59986a(String.valueOf(bool));
        boolean a = C9217i0.m27371a();
        C9217i0.f23177g = bool;
        if (a != C9217i0.m27371a()) {
            C9422r0.m27936d();
        }
    }

    public static final void setCustomFilter(String str, double d) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        C9409q4.m27837a(str, (Object) Float.valueOf((float) d));
    }

    public static final void setCustomFilter(String str, int i) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        C9409q4.m27837a(str, (Object) Float.valueOf((float) i));
    }

    public static final void setCustomFilter(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        C9409q4.m27837a(str, obj);
    }

    public static final void setCustomFilter(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C9409q4.m27837a(str, (Object) str2);
    }

    public static final void setCustomFilter(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        C9409q4.m27837a(str, (Object) Boolean.valueOf(z));
    }

    public static final void setExtraData(String str, double d) {
        Intrinsics.checkNotNullParameter(str, "key");
        C9409q4.m27851b(str, (Object) Double.valueOf(d));
    }

    public static final void setExtraData(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        C9409q4.m27851b(str, (Object) Integer.valueOf(i));
    }

    public static final void setExtraData(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        C9409q4.m27851b(str, obj);
    }

    public static final void setExtraData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C9409q4.m27851b(str, (Object) str2);
    }

    public static final void setExtraData(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        C9409q4.m27851b(str, (Object) Boolean.valueOf(z));
    }

    public static final void setFramework(String str, String str2) {
        C9409q4.m27838a(str, str2, (String) null);
    }

    public static final void setFramework(String str, String str2, String str3) {
        C9409q4.m27838a(str, str2, str3);
    }

    public static final void setInterstitialCallbacks(InterstitialCallbacks interstitialCallbacks) {
        C9409q4.m27822a(interstitialCallbacks);
    }

    public static final void setLogLevel(Log.LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        C9409q4.m27832a(logLevel);
    }

    public static final void setMrecCallbacks(MrecCallbacks mrecCallbacks) {
        C9409q4.m27823a(mrecCallbacks);
    }

    public static final void setMrecViewId(int i) {
        C9409q4.m27872h(i);
    }

    public static final void setNativeAdType(Native.NativeAdType nativeAdType) {
        Intrinsics.checkNotNullParameter(nativeAdType, "adType");
        C9409q4.m27825a(nativeAdType);
    }

    public static final void setNativeCallbacks(NativeCallbacks nativeCallbacks) {
        C9409q4.m27826a(nativeCallbacks);
    }

    public static final void setRequestCallbacks(AppodealRequestCallbacks appodealRequestCallbacks) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23073c.mo59986a((String) null);
        C9409q4.m27875k().f23550d = appodealRequestCallbacks;
    }

    public static final void setRequiredNativeMediaAssetType(Native.MediaAssetType mediaAssetType) {
        Intrinsics.checkNotNullParameter(mediaAssetType, "requiredMediaAssetType");
        C9409q4.m27824a(mediaAssetType);
    }

    public static final void setRewardedVideoCallbacks(RewardedVideoCallbacks rewardedVideoCallbacks) {
        C9409q4.m27827a(rewardedVideoCallbacks);
    }

    public static final void setSharedAdsInstanceAcrossActivities(boolean z) {
        C9409q4.m27861d(z);
    }

    public static final void setSmartBanners(boolean z) {
        C9409q4.m27864e(z);
    }

    public static final void setTesting(boolean z) {
        C9409q4.m27867f(z);
    }

    public static final void setTriggerOnLoadedOnPrecache(int i, boolean z) {
        C9409q4.m27849b(i, z);
    }

    public static final void setUseSafeArea(boolean z) {
        C9422r0 r0Var = C9422r0.f23912a;
        C9422r0.f23924m = z;
    }

    public static final void setUserAge(int i) {
        C9409q4 q4Var = C9409q4.f23839a;
        C9194g1.f23056A.mo59986a((String) null);
        C9269l5.m27453a().setAge(i);
    }

    public static final void setUserGender(UserSettings.Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        C9409q4.m27828a(gender);
    }

    public static final void setUserId(String str) {
        Intrinsics.checkNotNullParameter(str, DataKeys.USER_ID);
        C9409q4.m27860d(str);
    }

    public static final boolean show(Activity activity, int i) {
        return C9409q4.m27842a(activity, i, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public static final boolean show(Activity activity, int i, String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        return C9409q4.m27842a(activity, i, str);
    }

    public static final void startTestActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C9409q4.m27815a(activity);
    }

    public static final void trackInAppPurchase(Context context, double d, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, AppLovinEventParameters.REVENUE_CURRENCY);
        C9409q4.m27819a(context, d, str);
    }

    public static final void updateCCPAUserConsent(CCPAUserConsent cCPAUserConsent) {
        Intrinsics.checkNotNullParameter(cCPAUserConsent, "consent");
        C9409q4.m27831a((UserConsent) cCPAUserConsent);
    }

    public static final void updateConsent(Consent consent) {
        C9409q4.m27833a(consent);
    }

    public static final void updateConsent(Boolean bool) {
        C9409q4.m27834a(bool);
    }

    public static final void updateGDPRUserConsent(GDPRUserConsent gDPRUserConsent) {
        Intrinsics.checkNotNullParameter(gDPRUserConsent, "consent");
        C9409q4.m27831a((UserConsent) gDPRUserConsent);
    }

    public static final void validateInAppPurchase(Context context, InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppPurchase, "purchase");
        C9409q4.m27820a(context, inAppPurchase, inAppPurchaseValidateCallback);
    }
}
