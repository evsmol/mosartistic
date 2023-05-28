package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.i */
public final class C4679i implements InterstitialListener, RewardedVideoListener, SegmentListener, C4676f {

    /* renamed from: a */
    public RewardedVideoListener f11703a;

    /* renamed from: b */
    public InterstitialListener f11704b;

    /* renamed from: c */
    public OfferwallListener f11705c;

    /* renamed from: d */
    public SegmentListener f11706d;

    /* renamed from: e */
    public InterstitialPlacement f11707e = null;

    /* renamed from: f */
    public String f11708f = null;

    /* renamed from: g */
    private C4701a f11709g;

    /* renamed from: h */
    private long f11710h;

    /* renamed from: com.ironsource.mediationsdk.sdk.i$a */
    class C4701a extends Thread {

        /* renamed from: a */
        Handler f11742a;

        private C4701a() {
        }

        /* synthetic */ C4701a(C4679i iVar, byte b) {
            this();
        }

        public final void run() {
            Looper.prepare();
            this.f11742a = new Handler();
            Looper.loop();
        }
    }

    public C4679i() {
        C4701a aVar = new C4701a(this, (byte) 0);
        this.f11709g = aVar;
        aVar.start();
        this.f11710h = new Date().getTime();
    }

    /* renamed from: a */
    private void m13735a(Runnable runnable) {
        Handler handler;
        C4701a aVar = this.f11709g;
        if (aVar != null && (handler = aVar.f11742a) != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    private boolean m13736a(Object obj) {
        return (obj == null || this.f11709g == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo34131a(final IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f11708f)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f11708f);
            }
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdShowFailed(ironSourceError);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo33514a(final boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.OFFERWALL_AVAILABLE, mediationAdditionalData));
        if (m13736a((Object) this.f11705c)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11705c.onOfferwallAvailable(z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34132a(final boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.f11710h;
        this.f11710h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, time);
            if (map != null) {
                for (String next : map.keySet()) {
                    mediationAdditionalData.put(next, map.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4537h.m13193e().mo33649b(new C4532c(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAvailabilityChanged(z);
                }
            });
        }
    }

    public final void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (m13736a((Object) this.f11705c)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11705c.onGetOfferwallCreditsFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdClicked();
                }
            });
        }
    }

    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdClosed();
                }
            });
        }
    }

    public final void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdLoadFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdOpened();
                }
            });
        }
    }

    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdReady();
                }
            });
        }
    }

    public final void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (this.f11707e != null && !TextUtils.isEmpty(this.f11707e.getPlacementName())) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f11707e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4533d.m13173e().mo33649b(new C4532c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (m13736a((Object) this.f11704b)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11704b.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.f11705c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    public final void onOfferwallAvailable(boolean z) {
        mo33514a(z, (IronSourceError) null);
    }

    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (m13736a((Object) this.f11705c)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11705c.onOfferwallClosed();
                }
            });
        }
    }

    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (m13736a((Object) this.f11705c)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11705c.onOfferwallOpened();
                }
            });
        }
    }

    public final void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (m13736a((Object) this.f11705c)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11705c.onOfferwallShowFailed(ironSourceError);
                }
            });
        }
    }

    public final void onRewardedVideoAdClicked(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdClicked(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdClosed();
                }
            });
        }
    }

    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdEnded();
                }
            });
        }
    }

    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdOpened();
                }
            });
        }
    }

    public final void onRewardedVideoAdRewarded(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdRewarded(placement);
                }
            });
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        mo34131a(ironSourceError, (Map<String, Object>) null);
    }

    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (m13736a((Object) this.f11703a)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    C4679i.this.f11703a.onRewardedVideoAdStarted();
                }
            });
        }
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        mo34132a(z, (Map<String, Object>) null);
    }

    public final void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (m13736a((Object) this.f11706d)) {
            m13735a((Runnable) new Runnable() {
                public final void run() {
                    if (!TextUtils.isEmpty(str)) {
                        C4679i.this.f11706d.onSegmentReceived(str);
                    }
                }
            });
        }
    }
}
