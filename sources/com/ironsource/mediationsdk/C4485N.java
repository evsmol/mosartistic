package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p128b.C4562c;
import com.ironsource.mediationsdk.adunit.p128b.C4563d;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.N */
public final class C4485N<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<C4485N<Listener>, Listener> implements AdapterDebugInterface, AdapterAPSDataInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {

    /* renamed from: a */
    IronSource.AD_UNIT f10825a;

    /* renamed from: b */
    private AbstractAdapter f10826b;

    /* renamed from: c */
    private C4563d f10827c;

    /* renamed from: d */
    private NetworkInitializationListener f10828d;

    /* renamed from: e */
    private AdapterAdListener f10829e;

    public C4485N(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f10826b = abstractAdapter;
        this.f10825a = ad_unit;
        this.f10827c = new C4563d(ad_unit, C4563d.C4565b.PROVIDER, (C4562c) null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f10826b.addInterstitialListener(this);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f10826b.addRewardedVideoListener(this);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(m12877a("ad unit not supported - " + this.f10825a));
        }
    }

    /* renamed from: a */
    private String m12877a(String str) {
        String ad_unit = this.f10825a.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    /* renamed from: a */
    private boolean m12878a(IronSourceError ironSourceError) {
        if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
            return ironSourceError.getErrorCode() == 1158;
        }
        if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return ironSourceError.getErrorCode() == 1058;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error(m12877a("ad unit not supported - " + this.f10825a));
        return false;
    }

    public final String getAdapterVersion() {
        try {
            return this.f10826b.getVersion();
        } catch (Exception e) {
            String str = "Exception while calling adapter.getVersion() from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            this.f10827c.f11237e.mo33788l(str);
            return null;
        }
    }

    public final Map<String, Object> getBiddingData(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f10826b.getInterstitialBiddingData(jSONObject);
            }
            if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f10826b.getRewardedVideoBiddingData(jSONObject);
            }
            IronLog.INTERNAL.error(m12877a("ad unit not supported - " + this.f10825a));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            C4563d dVar = this.f10827c;
            if (dVar == null) {
                return null;
            }
            dVar.f11237e.mo33789m(str);
            return null;
        }
    }

    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        try {
            return this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO ? this.f10826b.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings()) : LoadWhileShowSupportState.NONE;
        } catch (Exception e) {
            IronLog.INTERNAL.error(m12877a("Exception while calling adapter.getLoadWhileShowSupportedState from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage()));
            return LoadWhileShowSupportState.NONE;
        }
    }

    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    public final String getNetworkSDKVersion() {
        try {
            return this.f10826b.getCoreSDKVersion();
        } catch (Exception e) {
            String str = "Exception while calling adapter.getCoreSDKVersion() from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            this.f10827c.f11237e.mo33788l(str);
            return null;
        }
    }

    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f10828d = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = C4455H.m12683a().f10654l;
            if (!TextUtils.isEmpty(str)) {
                this.f10826b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f10826b.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str2));
            C4563d dVar = this.f10827c;
            if (dVar != null) {
                dVar.f11237e.mo33789m(str2);
            }
        }
        JSONObject a = C4615b.m13489a(adData.getConfiguration());
        try {
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f10826b.initInterstitialForBidding("", string, a, this);
                } else {
                    this.f10826b.initInterstitial("", string, a, this);
                }
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f10826b.initRewardedVideoWithCallback("", string, a, this);
            } else {
                IronLog.INTERNAL.error("ad unit not supported - " + this.f10825a);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str3));
            C4563d dVar2 = this.f10827c;
            if (dVar2 != null) {
                dVar2.f11237e.mo33789m(str3);
            }
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, str3));
            }
        }
    }

    public final boolean isAdAvailable(AdData adData) {
        JSONObject a = C4615b.m13489a(adData.getConfiguration());
        try {
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f10826b.isInterstitialReady(a);
            }
            if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f10826b.isRewardedVideoAvailable(a);
            }
            IronLog.INTERNAL.error(m12877a("ad unit not supported - " + this.f10825a));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            C4563d dVar = this.f10827c;
            if (dVar == null) {
                return false;
            }
            dVar.f11237e.mo33789m(str);
            return false;
        }
    }

    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.f10829e = (AdapterAdInteractionListener) obj;
        JSONObject a = C4615b.m13489a(adData.getConfiguration());
        try {
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f10826b.loadInterstitialForBidding(a, this, adData.getServerData());
                } else {
                    this.f10826b.loadInterstitial(a, this);
                }
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                Integer num2 = adData.getInt("instanceType");
                if (num2 == null || num2.intValue() != 1) {
                    this.f10826b.loadRewardedVideoForBidding(a, this, adData.getServerData());
                } else {
                    this.f10826b.fetchRewardedVideoForAutomaticLoad(a, this);
                }
            } else {
                IronLog.INTERNAL.error(m12877a("ad unit not supported - " + this.f10825a));
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            C4563d dVar = this.f10827c;
            if (dVar != null) {
                dVar.f11237e.mo33789m(str);
            }
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdLoadFailed(new IronSourceError(510, str));
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoLoadFailed(new IronSourceError(510, str));
            }
        }
    }

    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadFailed(m12878a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowSuccess();
        }
    }

    public final void onInterstitialAdVisible() {
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f10828d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        NetworkInitializationListener networkInitializationListener = this.f10828d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdEnded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdListener).onAdRewarded();
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdStarted();
        }
    }

    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m12877a("available = " + z));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener == null) {
            return;
        }
        if (z) {
            adapterAdListener.onAdLoadSuccess();
            return;
        }
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(this.f10825a.name(), this.f10826b.getProviderName(), "availability changed to false");
        this.f10829e.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, buildLoadFailedError.getErrorCode(), buildLoadFailedError.getErrorMessage());
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f10828d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        NetworkInitializationListener networkInitializationListener = this.f10828d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(m12877a("error = " + ironSourceError));
        if (this.f10829e != null) {
            if (m12878a(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                boolean z = false;
                if (this.f10825a != IronSource.AD_UNIT.INTERSTITIAL) {
                    if (this.f10825a != IronSource.AD_UNIT.REWARDED_VIDEO) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.error(m12877a("ad unit not supported - " + this.f10825a));
                    } else if (ironSourceError.getErrorCode() == 1057) {
                        z = true;
                    }
                }
                adapterErrorType = z ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            this.f10829e.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(m12877a(""));
        AdapterAdListener adapterAdListener = this.f10829e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.f10826b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.releaseMemory(this.f10825a, new JSONObject());
                this.f10826b = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m12877a(str));
                this.f10827c.f11237e.mo33788l(str);
            }
        }
        this.f10828d = null;
        this.f10829e = null;
        C4563d dVar = this.f10827c;
        if (dVar != null) {
            dVar.mo33753a();
            this.f10827c = null;
        }
    }

    public final void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        AbstractAdapter abstractAdapter = this.f10826b;
        if (abstractAdapter != null && (abstractAdapter instanceof SetAPSInterface)) {
            ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
        }
    }

    public final void setAdapterDebug(boolean z) {
        AbstractAdapter abstractAdapter = this.f10826b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setAdapterDebug(Boolean.valueOf(z));
            } catch (Exception e) {
                String str = "Exception while calling adapter.setAdapterDebug(adapterDebug) from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m12877a(str));
                this.f10827c.f11237e.mo33788l(str);
            }
        }
    }

    public final void setConsent(boolean z) {
        AbstractAdapter abstractAdapter = this.f10826b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setConsent(z);
            } catch (Exception e) {
                String str = "Exception while calling adapter.setConsent(consent) from " + this.f10826b.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(m12877a(str));
                this.f10827c.f11237e.mo33788l(str);
            }
        }
    }

    public final void setMetaData(String str, List<String> list) {
        AbstractAdapter abstractAdapter = this.f10826b;
        if (abstractAdapter != null) {
            abstractAdapter.setMetaData(str, list);
        }
    }

    public final void showAd(AdData adData, Listener listener) {
        this.f10829e = listener;
        JSONObject a = C4615b.m13489a(adData.getConfiguration());
        try {
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f10826b.showInterstitial(a, this);
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f10826b.showRewardedVideo(a, this);
            } else {
                IronLog.INTERNAL.error(m12877a("ad unit not supported - " + this.f10825a));
            }
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m12877a(str));
            C4563d dVar = this.f10827c;
            if (dVar != null) {
                dVar.f11237e.mo33789m(str);
            }
            if (this.f10825a == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, str));
            } else if (this.f10825a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, str));
            }
        }
    }
}
