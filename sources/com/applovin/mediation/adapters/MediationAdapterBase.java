package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class MediationAdapterBase implements MaxAdapter, MaxAppOpenAdapter, MaxInterstitialAdViewAdapter, MaxNativeAdAdapter, MaxRewardedAdViewAdapter {
    private boolean alwaysRewardUser;
    private final C8626v mLogger;
    private final C8490n mSdk;
    private final String mTag = getClass().getSimpleName();
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C8490n nVar = appLovinSdk.coreSdk;
        this.mSdk = nVar;
        this.mLogger = nVar.mo57320D();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    /* access modifiers changed from: protected */
    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    /* access modifiers changed from: protected */
    public void checkExistence(Class<?>... clsArr) {
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls : clsArr) {
                log("Found: " + cls.getName());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt(AppLovinEventParameters.REVENUE_AMOUNT, 0, serverParameters);
        String string = BundleUtils.getString(AppLovinEventParameters.REVENUE_CURRENCY, "", serverParameters);
        log("Creating reward: " + i + " " + string);
        this.reward = MaxRewardImpl.create(i, string);
    }

    /* access modifiers changed from: protected */
    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() {
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo57873d(String str) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57818b(this.mTag, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo57874e(String str) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57822e(this.mTag, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo57875e(String str, Throwable th) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57819b(this.mTag, str, th);
        }
    }

    /* access modifiers changed from: protected */
    public Context getApplicationContext() {
        return this.mSdk.mo57332P();
    }

    /* access modifiers changed from: protected */
    public ExecutorService getCachingExecutorService() {
        return this.mSdk.mo57337V().mo57234c();
    }

    /* access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    /* access modifiers changed from: package-private */
    public String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    /* access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo57881i(String str) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57820c(this.mTag, str);
        }
    }

    public boolean isBeta() {
        return false;
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        mo57873d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        mo57873d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57820c(this.mTag, str);
        }
    }

    /* access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57819b(this.mTag, str, th);
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        mo57873d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        mo57873d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        mo57873d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* access modifiers changed from: protected */
    public void userError(String str) {
        userError(str, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public void userError(String str, Throwable th) {
        C8626v.m26254c(this.mTag, str, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo57887w(String str) {
        if (C8626v.m26252a()) {
            this.mLogger.mo57821d(this.mTag, str);
        }
    }
}
