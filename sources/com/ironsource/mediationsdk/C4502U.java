package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.U */
public final class C4502U extends C4514Y implements InterstitialSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C4504a f10929a = C4504a.NO_INIT;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4501T f10930b;

    /* renamed from: j */
    private Timer f10931j;

    /* renamed from: k */
    private int f10932k;

    /* renamed from: l */
    private String f10933l;

    /* renamed from: m */
    private String f10934m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f10935n;

    /* renamed from: o */
    private final Object f10936o = new Object();

    /* renamed from: com.ironsource.mediationsdk.U$a */
    public enum C4504a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public C4502U(String str, String str2, NetworkSettings networkSettings, C4501T t, int i, AbstractAdapter abstractAdapter) {
        super(new C4646a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f10933l = str;
        this.f10934m = str2;
        this.f10930b = t;
        this.f10931j = null;
        this.f10932k = i;
        this.f11015c.addInterstitialListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13003a(C4504a aVar) {
        m13009d("current state=" + this.f10929a + ", new state=" + aVar);
        this.f10929a = aVar;
    }

    /* renamed from: c */
    private void m13008c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + mo33612k() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13009d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo33612k() + " : " + str, 0);
    }

    /* renamed from: e */
    private void m13010e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + mo33612k() + " : " + str, 3);
    }

    /* renamed from: q */
    private void m13011q() {
        try {
            String str = C4455H.m12683a().f10654l;
            if (!TextUtils.isEmpty(str)) {
                this.f11015c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f11015c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m13009d("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: r */
    private void m13012r() {
        synchronized (this.f10936o) {
            if (this.f10931j != null) {
                this.f10931j.cancel();
                this.f10931j = null;
            }
        }
    }

    /* renamed from: s */
    private void m13013s() {
        synchronized (this.f10936o) {
            m13009d("start timer");
            m13012r();
            Timer timer = new Timer();
            this.f10931j = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4502U u = C4502U.this;
                    u.m13009d("timed out state=" + C4502U.this.f10929a.name() + " isBidder=" + C4502U.this.mo33609h());
                    if (C4502U.this.f10929a != C4504a.INIT_IN_PROGRESS || !C4502U.this.mo33609h()) {
                        C4502U.this.m13003a(C4504a.LOAD_FAILED);
                        C4502U.this.f10930b.mo33561a(ErrorBuilder.buildLoadFailedError("timed out"), C4502U.this, new Date().getTime() - C4502U.this.f10935n);
                        return;
                    }
                    C4502U.this.m13003a(C4504a.NO_INIT);
                }
            }, (long) (this.f10932k * 1000));
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo33456a() {
        try {
            if (mo33609h()) {
                return this.f11015c.getInterstitialBiddingData(this.f11018f);
            }
            return null;
        } catch (Throwable th) {
            m13010e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo33575a(String str) {
        try {
            this.f10935n = new Date().getTime();
            m13009d("loadInterstitial");
            this.f11017e = false;
            if (mo33609h()) {
                m13013s();
                m13003a(C4504a.LOAD_IN_PROGRESS);
                this.f11015c.loadInterstitialForBidding(this.f11018f, this, str);
            } else if (this.f10929a == C4504a.NO_INIT) {
                m13013s();
                m13003a(C4504a.INIT_IN_PROGRESS);
                m13011q();
                this.f11015c.initInterstitial(this.f10933l, this.f10934m, this.f11018f, this);
            } else {
                m13013s();
                m13003a(C4504a.LOAD_IN_PROGRESS);
                this.f11015c.loadInterstitial(this.f11018f, this);
            }
        } catch (Throwable th) {
            m13010e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo33576b() {
        m13009d("initForBidding()");
        m13003a(C4504a.INIT_IN_PROGRESS);
        m13011q();
        try {
            this.f11015c.initInterstitialForBidding(this.f10933l, this.f10934m, this.f11018f, this);
        } catch (Throwable th) {
            m13010e(mo33612k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: c */
    public final void mo33577c() {
        try {
            this.f11015c.showInterstitial(this.f11018f, this);
        } catch (Throwable th) {
            m13010e(mo33612k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: f */
    public final void mo33578f() {
        this.f11015c.setMediationState(C4605b.C4606a.CAPPED_PER_SESSION, "interstitial");
    }

    /* renamed from: g */
    public final boolean mo33579g() {
        try {
            return this.f11015c.isInterstitialReady(this.f11018f);
        } catch (Throwable th) {
            m13010e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    public final void onInterstitialAdClicked() {
        m13008c("onInterstitialAdClicked");
        this.f10930b.mo33568d(this);
    }

    public final void onInterstitialAdClosed() {
        m13008c("onInterstitialAdClosed");
        this.f10930b.mo33564b(this);
    }

    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        m13008c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.f10929a.name());
        m13012r();
        if (this.f10929a == C4504a.LOAD_IN_PROGRESS) {
            m13003a(C4504a.LOAD_FAILED);
            this.f10930b.mo33561a(ironSourceError, this, new Date().getTime() - this.f10935n);
        }
    }

    public final void onInterstitialAdOpened() {
        m13008c("onInterstitialAdOpened");
        this.f10930b.mo33558a(this);
    }

    public final void onInterstitialAdReady() {
        m13008c("onInterstitialAdReady state=" + this.f10929a.name());
        m13012r();
        if (this.f10929a == C4504a.LOAD_IN_PROGRESS) {
            m13003a(C4504a.LOADED);
            this.f10930b.mo33559a(this, new Date().getTime() - this.f10935n);
        }
    }

    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        m13008c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f10930b.mo33560a(ironSourceError, this);
    }

    public final void onInterstitialAdShowSucceeded() {
        m13008c("onInterstitialAdShowSucceeded");
        this.f10930b.mo33566c(this);
    }

    public final void onInterstitialAdVisible() {
        m13008c("onInterstitialAdVisible");
        this.f10930b.mo33569e(this);
    }

    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        m13008c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.f10929a.name());
        if (this.f10929a == C4504a.INIT_IN_PROGRESS) {
            m13012r();
            m13003a(C4504a.NO_INIT);
            this.f10930b.mo33565b(ironSourceError, this);
            if (!mo33609h()) {
                this.f10930b.mo33561a(ironSourceError, this, new Date().getTime() - this.f10935n);
            }
        }
    }

    public final void onInterstitialInitSuccess() {
        m13008c("onInterstitialInitSuccess state=" + this.f10929a.name());
        if (this.f10929a == C4504a.INIT_IN_PROGRESS) {
            m13012r();
            if (mo33609h()) {
                m13003a(C4504a.INIT_SUCCESS);
            } else {
                m13003a(C4504a.LOAD_IN_PROGRESS);
                m13013s();
                try {
                    this.f11015c.loadInterstitial(this.f11018f, this);
                } catch (Throwable th) {
                    m13010e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                    th.printStackTrace();
                    onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
                }
            }
            this.f10930b.mo33571f(this);
        }
    }
}
