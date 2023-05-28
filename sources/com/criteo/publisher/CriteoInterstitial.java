package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1221a0;
import com.criteo.publisher.model.InterstitialAdUnit;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p068j0.C1155b;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p072m0.C1217d;

public class CriteoInterstitial {
    private final Criteo criteo;
    private CriteoInterstitialAdListener criteoInterstitialAdListener;
    private C1286n criteoInterstitialEventController;
    final InterstitialAdUnit interstitialAdUnit;
    private final C1195g logger;

    public CriteoInterstitial() {
        this((InterstitialAdUnit) null, (Criteo) null);
    }

    public CriteoInterstitial(InterstitialAdUnit interstitialAdUnit2) {
        this(interstitialAdUnit2, (Criteo) null);
    }

    CriteoInterstitial(InterstitialAdUnit interstitialAdUnit2, Criteo criteo2) {
        C1195g b = C1197h.m5407b(getClass());
        this.logger = b;
        this.interstitialAdUnit = interstitialAdUnit2;
        this.criteo = criteo2;
        b.mo3337a(C1155b.m5293a(interstitialAdUnit2));
    }

    public void setCriteoInterstitialAdListener(CriteoInterstitialAdListener criteoInterstitialAdListener2) {
        this.criteoInterstitialAdListener = criteoInterstitialAdListener2;
    }

    public void loadAd() {
        loadAd(new ContextData());
    }

    public void loadAd(ContextData contextData) {
        if (!C1321s.m5824c().mo3697d()) {
            this.logger.mo3337a(C1155b.m5289a());
            return;
        }
        try {
            doLoadAd(contextData);
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
        }
    }

    private void doLoadAd(ContextData contextData) {
        this.logger.mo3337a(C1155b.m5295c(this));
        getIntegrationRegistry().mo3246a(C1147a.STANDALONE);
        getOrCreateController().mo3608a(this.interstitialAdUnit, contextData);
    }

    public void loadAd(Bid bid) {
        if (!C1321s.m5824c().mo3697d()) {
            this.logger.mo3337a(C1155b.m5289a());
            return;
        }
        try {
            doLoadAd(bid);
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
        }
    }

    public void loadAdWithDisplayData(String str) {
        if (!C1321s.m5824c().mo3697d()) {
            this.logger.mo3337a(C1155b.m5289a());
        } else {
            getOrCreateController().mo3609a(str);
        }
    }

    private void doLoadAd(Bid bid) {
        this.logger.mo3337a(C1155b.m5291a(this, bid));
        getIntegrationRegistry().mo3246a(C1147a.IN_HOUSE);
        getOrCreateController().mo3607a(bid);
    }

    public boolean isAdLoaded() {
        try {
            boolean a = getOrCreateController().mo3610a();
            this.logger.mo3337a(C1155b.m5292a(this, a));
            return a;
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
            return false;
        }
    }

    public void show() {
        if (!C1321s.m5824c().mo3697d()) {
            this.logger.mo3337a(C1155b.m5289a());
            return;
        }
        try {
            doShow();
        } catch (Throwable th) {
            this.logger.mo3337a(C1328v.m5922b(th));
        }
    }

    private void doShow() {
        this.logger.mo3337a(C1155b.m5296d(this));
        getOrCreateController().mo3612c();
    }

    /* access modifiers changed from: package-private */
    public C1286n getOrCreateController() {
        if (this.criteoInterstitialEventController == null) {
            Criteo criteo2 = getCriteo();
            this.criteoInterstitialEventController = new C1286n(new C1221a0(criteo2.getConfig(), getPubSdkApi()), criteo2.getInterstitialActivityHelper(), criteo2, new C1217d(this, this.criteoInterstitialAdListener, getRunOnUiThreadExecutor()));
        }
        return this.criteoInterstitialEventController;
    }

    private Criteo getCriteo() {
        Criteo criteo2 = this.criteo;
        return criteo2 == null ? Criteo.getInstance() : criteo2;
    }

    private C1150c getIntegrationRegistry() {
        return C1321s.m5824c().mo3668F0();
    }

    private C1166g getPubSdkApi() {
        return C1321s.m5824c().mo3681S0();
    }

    private C1076c getRunOnUiThreadExecutor() {
        return C1321s.m5824c().mo3696c1();
    }
}
