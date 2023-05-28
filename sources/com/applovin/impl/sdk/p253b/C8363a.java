package com.applovin.impl.sdk.p253b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p252ad.C8356f;
import com.applovin.impl.sdk.p252ad.C8357g;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8402aa;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8451v;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.a */
public class C8363a {

    /* renamed from: a */
    protected final C8490n f20607a;

    /* renamed from: b */
    protected final AppLovinAdServiceImpl f20608b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAd f20609c;

    /* renamed from: d */
    private String f20610d;

    /* renamed from: e */
    private SoftReference<AppLovinAdLoadListener> f20611e;

    /* renamed from: f */
    private final Object f20612f = new Object();

    /* renamed from: g */
    private volatile String f20613g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f20614h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a */
    private class C8365a implements AppLovinAdLoadListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AppLovinAdLoadListener f20617b;

        C8365a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f20617b = appLovinAdLoadListener;
        }

        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinAd unused = C8363a.this.f20609c = appLovinAd;
            if (this.f20617b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C8365a.this.f20617b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            C8626v.m26254c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        public void failedToReceiveAd(final int i) {
            if (this.f20617b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C8365a.this.f20617b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            C8626v.m26254c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.b.a$b */
    private class C8368b implements C8357g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        private final AppLovinAdDisplayListener f20623b;

        /* renamed from: c */
        private final AppLovinAdClickListener f20624c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f20625d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f20626e;

        private C8368b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f20623b = appLovinAdDisplayListener;
            this.f20624c = appLovinAdClickListener;
            this.f20625d = appLovinAdVideoPlaybackListener;
            this.f20626e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private void m25171a(C8350e eVar) {
            String str;
            int i;
            String a = C8363a.this.m25163d();
            if (!StringUtils.isValidString(a) || !C8363a.this.f20614h) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C8363a.this.f20607a.mo57320D();
                    D.mo57822e("IncentivizedAdController", "Invalid reward state - result: " + a + " and wasFullyEngaged: " + C8363a.this.f20614h);
                }
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8363a.this.f20607a.mo57320D().mo57818b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.mo56979aF();
                if (C8363a.this.f20614h) {
                    C8363a.this.f20607a.mo57320D();
                    if (C8626v.m26252a()) {
                        C8363a.this.f20607a.mo57320D().mo57822e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    C8363a.this.f20607a.mo57320D();
                    if (C8626v.m26252a()) {
                        C8363a.this.f20607a.mo57320D().mo57822e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.mo56972a(C8377c.m25184a(str));
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8363a.this.f20607a.mo57320D().mo57818b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                C8575k.m26146a(this.f20626e, (AppLovinAd) eVar, i);
            }
            C8363a.this.m25153a((AppLovinAd) eVar);
            C8363a.this.f20607a.mo57320D();
            if (C8626v.m26252a()) {
                C8363a.this.f20607a.mo57320D().mo57818b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            C8575k.m26157b(this.f20623b, (AppLovinAd) eVar);
            if (!eVar.mo56992ag().getAndSet(true)) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8363a.this.f20607a.mo57320D().mo57818b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                C8363a.this.f20607a.mo57337V().mo57228a((C8401a) new C8451v(eVar, C8363a.this.f20607a), C8432o.C8434a.REWARD);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C8575k.m26143a(this.f20624c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            C8575k.m26144a(this.f20623b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof C8356f) {
                appLovinAd = ((C8356f) appLovinAd).mo57028a();
            }
            if (appLovinAd instanceof C8350e) {
                m25171a((C8350e) appLovinAd);
                return;
            }
            C8363a.this.f20607a.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = C8363a.this.f20607a.mo57320D();
                D.mo57822e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        public void onAdDisplayFailed(String str) {
            C8575k.m26145a(this.f20623b, str);
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            C8363a.this.m25156a("quota_exceeded");
            C8575k.m26158b(this.f20626e, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            C8363a.this.m25156a("rejected");
            C8575k.m26162c(this.f20626e, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            C8363a.this.m25156a("accepted");
            C8575k.m26147a(this.f20626e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C8363a.this.m25156a("network_timeout");
            C8575k.m26146a(this.f20626e, appLovinAd, i);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            C8575k.m26148a(this.f20625d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            C8575k.m26149a(this.f20625d, appLovinAd, d, z);
            boolean unused = C8363a.this.f20614h = z;
        }
    }

    public C8363a(String str, AppLovinSdk appLovinSdk) {
        this.f20607a = appLovinSdk.coreSdk;
        this.f20608b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f20610d = str;
    }

    /* renamed from: a */
    private void m25148a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f20607a);
            if (maybeRetrieveNonDummyAd == null) {
                m25155a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                return;
            }
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f20607a.mo57361ab(), context);
            C8368b bVar = new C8368b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            create.showAndRender(maybeRetrieveNonDummyAd);
            if (maybeRetrieveNonDummyAd instanceof C8350e) {
                m25150a((C8350e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        this.f20607a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f20607a.mo57320D();
            D.mo57822e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m25155a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    /* renamed from: a */
    private void m25149a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
        AppLovinAdDisplayListener appLovinAdDisplayListener2 = appLovinAdDisplayListener;
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f20607a);
            if (maybeRetrieveNonDummyAd == null) {
                m25155a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
                return;
            }
            Context context2 = context;
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f20607a.mo57361ab(), context);
            C8368b bVar = new C8368b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            ViewGroup viewGroup2 = viewGroup;
            Lifecycle lifecycle2 = lifecycle;
            create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, lifecycle);
            if (maybeRetrieveNonDummyAd instanceof C8350e) {
                m25150a((C8350e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        this.f20607a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f20607a.mo57320D();
            D.mo57822e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m25155a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
    }

    /* renamed from: a */
    private void m25150a(C8350e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f20607a.mo57337V().mo57228a((C8401a) new C8402aa(eVar, appLovinAdRewardListener, this.f20607a), C8432o.C8434a.REWARD);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25153a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f20609c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof C8356f) {
                if (appLovinAd != ((C8356f) appLovinAd2).mo57028a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f20609c = null;
        }
    }

    /* renamed from: a */
    private void m25154a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f20609c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            m25148a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        C8626v.m26258i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        m25162c();
    }

    /* renamed from: a */
    private void m25155a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f20607a.mo57338W().mo57151a(C8394f.f21093l);
        C8575k.m26149a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        C8575k.m26157b(appLovinAdDisplayListener, appLovinAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25156a(String str) {
        synchronized (this.f20612f) {
            this.f20613g = str;
        }
    }

    /* renamed from: b */
    private void m25159b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f20609c;
        }
        if (appLovinAdImpl != null) {
            m25149a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        C8626v.m26258i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        m25162c();
    }

    /* renamed from: b */
    private void m25160b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f20608b.loadNextIncentivizedAd(this.f20610d, appLovinAdLoadListener);
    }

    /* renamed from: c */
    private void m25162c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f20611e;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m25163d() {
        String str;
        synchronized (this.f20612f) {
            str = this.f20613g;
        }
        return str;
    }

    /* renamed from: e */
    private AppLovinAdRewardListener m25164e() {
        return new AppLovinAdRewardListener() {
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C8363a.this.f20607a.mo57320D();
                    D.mo57822e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C8363a.this.f20607a.mo57320D();
                    D.mo57822e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C8363a.this.f20607a.mo57320D();
                    D.mo57818b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                C8363a.this.f20607a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C8363a.this.f20607a.mo57320D();
                    D.mo57822e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo57055a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m25164e();
        }
        m25154a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo57056a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        m25159b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? m25164e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo57057a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f20607a.mo57320D();
        if (C8626v.m26252a()) {
            this.f20607a.mo57320D().mo57818b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f20611e = new SoftReference<>(appLovinAdLoadListener);
        if (mo57058a()) {
            C8626v.m26258i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f20609c);
                return;
            }
            return;
        }
        m25160b((AppLovinAdLoadListener) new C8365a(appLovinAdLoadListener));
    }

    /* renamed from: a */
    public boolean mo57058a() {
        return this.f20609c != null;
    }

    /* renamed from: b */
    public String mo57059b() {
        return this.f20610d;
    }
}
