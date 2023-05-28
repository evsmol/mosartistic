package com.ironsource.mediationsdk;

import com.appnext.core.AppnextError;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.C4678h;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.F */
public final class C4451F extends C4605b implements InterstitialSmashListener {

    /* renamed from: r */
    JSONObject f10593r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C4678h f10594s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public long f10595t;

    /* renamed from: u */
    private int f10596u;

    C4451F(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f10593r = interstitialSettings;
        this.f11367k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f11368l = this.f10593r.optInt("maxAdsPerSession", 99);
        this.f11369m = this.f10593r.optInt("maxAdsPerDay", 99);
        this.f11361e = networkSettings.isMultipleInstances();
        this.f11362f = networkSettings.getSubProviderId();
        this.f10596u = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33321g() {
        this.f11364h = 0;
        mo33859a(C4605b.C4606a.INITIATED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33322h() {
        try {
            mo33865e();
            this.f11365i = new Timer();
            this.f11365i.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C4451F.this.f11357a == C4605b.C4606a.INIT_PENDING && C4451F.this.f10594s != null) {
                        C4451F.this.mo33859a(C4605b.C4606a.INIT_FAILED);
                        C4451F.this.f10594s.mo33304a(ErrorBuilder.buildInitFailedError(AppnextError.TIMEOUT, "Interstitial"), C4451F.this);
                    }
                }
            }, (long) (this.f10596u * 1000));
        } catch (Exception e) {
            mo33860a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33323i() {
        try {
            mo33866f();
            this.f11366j = new Timer();
            this.f11366j.schedule(new TimerTask() {
                public final void run() {
                    cancel();
                    if (C4451F.this.f11357a == C4605b.C4606a.LOAD_PENDING && C4451F.this.f10594s != null) {
                        C4451F.this.mo33859a(C4605b.C4606a.NOT_AVAILABLE);
                        C4451F.this.f10594s.mo33305a(ErrorBuilder.buildLoadFailedError(AppnextError.TIMEOUT), C4451F.this, new Date().getTime() - C4451F.this.f10595t);
                    }
                }
            }, (long) (this.f10596u * 1000));
        } catch (Exception e) {
            mo33860a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo33324k() {
        return "interstitial";
    }

    public final void onInterstitialAdClicked() {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33316e(this);
        }
    }

    public final void onInterstitialAdClosed() {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33313c(this);
        }
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        mo33866f();
        if (this.f11357a == C4605b.C4606a.LOAD_PENDING && this.f10594s != null) {
            this.f10594s.mo33305a(ironSourceError, this, new Date().getTime() - this.f10595t);
        }
    }

    public final void onInterstitialAdOpened() {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33310b(this);
        }
    }

    public final void onInterstitialAdReady() {
        mo33866f();
        if (this.f11357a == C4605b.C4606a.LOAD_PENDING && this.f10594s != null) {
            this.f10594s.mo33303a(this, new Date().getTime() - this.f10595t);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33311b(ironSourceError, this);
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33315d(this);
        }
    }

    public final void onInterstitialAdVisible() {
        C4678h hVar = this.f10594s;
        if (hVar != null) {
            hVar.mo33319f(this);
        }
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        mo33865e();
        if (this.f11357a == C4605b.C4606a.INIT_PENDING) {
            mo33859a(C4605b.C4606a.INIT_FAILED);
            C4678h hVar = this.f10594s;
            if (hVar != null) {
                hVar.mo33304a(ironSourceError, this);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        mo33865e();
        if (this.f11357a == C4605b.C4606a.INIT_PENDING) {
            mo33859a(C4605b.C4606a.INITIATED);
            C4678h hVar = this.f10594s;
            if (hVar != null) {
                hVar.mo33302a(this);
            }
        }
    }
}
