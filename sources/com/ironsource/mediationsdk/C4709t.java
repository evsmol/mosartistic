package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C4736w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C4673c;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.t */
public final class C4709t extends C4736w implements InterstitialSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4673c f11761i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f11762j;

    public C4709t(String str, String str2, NetworkSettings networkSettings, C4673c cVar, int i, AbstractAdapter abstractAdapter) {
        super(new C4646a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f11761i = cVar;
        this.f12003d = i;
        this.f12000a.initInterstitial(str, str2, this.f12002c, this);
    }

    /* renamed from: c */
    private void m13764c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.f12001b.f11591a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13765d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.f12001b.f11591a.getProviderName() + " : " + str, 0);
    }

    /* renamed from: a */
    public final void mo34165a() {
        m13765d("showInterstitial state=" + mo34223g());
        if (mo34218a(C4736w.C4737a.LOADED, C4736w.C4737a.SHOW_IN_PROGRESS)) {
            this.f12000a.showInterstitial(this.f12002c, this);
            return;
        }
        this.f11761i.mo34073a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    /* renamed from: a */
    public final void mo34166a(String str, String str2, JSONObject jSONObject, List<String> list) {
        m13765d("loadInterstitial state=" + mo34223g());
        C4736w.C4737a a = mo34213a(new C4736w.C4737a[]{C4736w.C4737a.NOT_LOADED, C4736w.C4737a.LOADED}, C4736w.C4737a.LOAD_IN_PROGRESS);
        if (a == C4736w.C4737a.NOT_LOADED || a == C4736w.C4737a.LOADED) {
            this.f11762j = new Date().getTime();
            m13765d("start timer");
            mo34216a((TimerTask) new TimerTask() {
                public final void run() {
                    C4709t tVar = C4709t.this;
                    tVar.m13765d("load timed out state=" + C4709t.this.mo34223g());
                    if (C4709t.this.mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
                        C4709t.this.f11761i.mo34074a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C4709t.this, new Date().getTime() - C4709t.this.f11762j);
                    }
                }
            });
            if (mo34225i()) {
                this.f12004e = str2;
                this.f12005f = jSONObject;
                this.f12006g = list;
                this.f12000a.loadInterstitialForBidding(this.f12002c, this, str);
                return;
            }
            this.f12000a.loadInterstitial(this.f12002c, this);
        } else if (a == C4736w.C4737a.LOAD_IN_PROGRESS) {
            this.f11761i.mo34074a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.f11761i.mo34074a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo34167b() {
        return this.f12000a.isInterstitialReady(this.f12002c);
    }

    public final void onInterstitialAdClicked() {
        m13764c("onInterstitialAdClicked");
        this.f11761i.mo34079c(this);
    }

    public final void onInterstitialAdClosed() {
        mo34214a(C4736w.C4737a.NOT_LOADED);
        m13764c("onInterstitialAdClosed");
        this.f11761i.mo34078b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m13764c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + mo34223g());
        mo34224h();
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
            this.f11761i.mo34074a(ironSourceError, this, new Date().getTime() - this.f11762j);
        }
    }

    public final void onInterstitialAdOpened() {
        m13764c("onInterstitialAdOpened");
        this.f11761i.mo34075a(this);
    }

    public final void onInterstitialAdReady() {
        m13764c("onInterstitialAdReady state=" + mo34223g());
        mo34224h();
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.LOADED)) {
            this.f11761i.mo34076a(this, new Date().getTime() - this.f11762j);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        mo34214a(C4736w.C4737a.NOT_LOADED);
        m13764c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f11761i.mo34073a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
    }

    public final void onInterstitialAdVisible() {
        m13764c("onInterstitialAdVisible");
        this.f11761i.mo34080d(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    public final void onInterstitialInitSuccess() {
    }
}
