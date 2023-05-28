package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.C4742a;
import com.ironsource.sdk.p139c.C4759a;
import com.ironsource.sdk.p147j.C4958b;
import java.lang.ref.WeakReference;

class IronSourceBannerListener implements C4958b {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    public void onBannerClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdClicked();
    }

    public void onBannerInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerInitFailed(new IronSourceError(612, str));
    }

    public void onBannerInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerInitSuccess();
    }

    public void onBannerLoadFail(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        BannerSmashListener bannerSmashListener = this.mListener;
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    public void onBannerLoadSuccess(C4759a aVar) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        if (this.mAdapter.get() == null) {
            return;
        }
        if (aVar == null) {
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(((IronSourceAdapter) this.mAdapter.get()).getProviderName()));
            return;
        }
        ((IronSourceAdapter) this.mAdapter.get()).mBannerAdContainer = aVar;
        C4742a aVar2 = aVar.f12090a != null ? aVar.f12090a.f12100d : new C4742a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar2.f12025a, aVar2.f12026b);
        layoutParams.gravity = 17;
        this.mListener.onBannerAdLoaded(aVar, layoutParams);
    }

    public void onBannerShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " onBannerShowSuccess");
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
