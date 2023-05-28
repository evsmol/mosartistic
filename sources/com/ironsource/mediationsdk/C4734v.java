package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C4736w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C4674d;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v */
public final class C4734v extends C4736w implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4674d f11997i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f11998j;

    C4734v(String str, String str2, NetworkSettings networkSettings, C4674d dVar, int i, AbstractAdapter abstractAdapter) {
        super(new C4646a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f12001b = new C4646a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f12002c = this.f12001b.f11592b;
        this.f12000a = abstractAdapter;
        this.f11997i = dVar;
        this.f12003d = i;
        this.f12000a.initRewardedVideoForDemandOnly(str, str2, this.f12002c, this);
    }

    /* renamed from: c */
    private void m13884c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f12001b.f11591a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13885d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f12001b.f11591a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo34209a() {
        m13885d("showRewardedVideo state=" + mo34223g());
        if (mo34218a(C4736w.C4737a.LOADED, C4736w.C4737a.SHOW_IN_PROGRESS)) {
            this.f12000a.showRewardedVideo(this.f12002c, this);
            return;
        }
        this.f11997i.mo34119a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo34210a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m13885d("loadRewardedVideo state=" + mo34223g());
        C4736w.C4737a a = mo34213a(new C4736w.C4737a[]{C4736w.C4737a.NOT_LOADED, C4736w.C4737a.LOADED}, C4736w.C4737a.LOAD_IN_PROGRESS);
        if (a == C4736w.C4737a.NOT_LOADED || a == C4736w.C4737a.LOADED) {
            this.f11998j = new Date().getTime();
            m13885d("start timer");
            mo34216a((TimerTask) new TimerTask() {
                public final void run() {
                    C4734v vVar = C4734v.this;
                    vVar.m13885d("load timed out state=" + C4734v.this.mo34223g());
                    if (C4734v.this.mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
                        C4734v.this.f11997i.mo34120a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C4734v.this, new Date().getTime() - C4734v.this.f11998j);
                    }
                }
            });
            if (mo34225i()) {
                this.f12004e = str2;
                this.f12005f = jSONObject;
                this.f12006g = list;
                this.f12000a.loadRewardedVideoForDemandOnlyForBidding(this.f12002c, this, str);
                return;
            }
            this.f12000a.loadRewardedVideoForDemandOnly(this.f12002c, this);
        } else if (a == C4736w.C4737a.LOAD_IN_PROGRESS) {
            this.f11997i.mo34120a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f11997i.mo34120a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo34211b() {
        return this.f12000a.isRewardedVideoAvailable(this.f12002c);
    }

    public final void onRewardedVideoAdClicked() {
        m13884c("onRewardedVideoAdClicked");
        this.f11997i.mo34124c(this);
    }

    public final void onRewardedVideoAdClosed() {
        mo34214a(C4736w.C4737a.NOT_LOADED);
        m13884c("onRewardedVideoAdClosed");
        this.f11997i.mo34123b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        m13884c("onRewardedVideoAdOpened");
        this.f11997i.mo34121a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        m13884c("onRewardedVideoAdRewarded");
        this.f11997i.mo34126e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo34214a(C4736w.C4737a.NOT_LOADED);
        m13884c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.f11997i.mo34119a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        m13884c("onRewardedVideoAdVisible");
        this.f11997i.mo34125d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        m13884c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo34223g());
        mo34224h();
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
            this.f11997i.mo34120a(ironSourceError, this, new Date().getTime() - this.f11998j);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        m13884c("onRewardedVideoLoadSuccess state=" + mo34223g());
        mo34224h();
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.LOADED)) {
            this.f11997i.mo34122a(this, new Date().getTime() - this.f11998j);
        }
    }
}
