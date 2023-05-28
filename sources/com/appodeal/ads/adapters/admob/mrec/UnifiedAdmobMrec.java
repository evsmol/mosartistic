package com.appodeal.ads.adapters.admob.mrec;

import android.content.Context;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;

public abstract class UnifiedAdmobMrec<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends UnifiedMrec<UnifiedAdmobRequestParams<AdRequestType>> {
    private AdViewType adView;

    /* renamed from: com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec$a */
    public static final class C9020a<AdViewType extends BaseAdView> extends AdListener {

        /* renamed from: a */
        public final AdViewType f22811a;

        /* renamed from: b */
        public final UnifiedMrecCallback f22812b;

        public C9020a(AdViewType adviewtype, UnifiedMrecCallback unifiedMrecCallback) {
            this.f22812b = unifiedMrecCallback;
            this.f22811a = adviewtype;
        }

        public final void onAdClicked() {
            super.onAdClicked();
            this.f22812b.onAdClicked();
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f22812b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f22812b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded() {
            super.onAdLoaded();
            this.f22812b.onAdLoaded(this.f22811a);
        }
    }

    public abstract AdViewType createAdView(Context context);

    public void load(ContextProvider contextProvider, UnifiedMrecParams unifiedMrecParams, UnifiedAdmobRequestParams<AdRequestType> unifiedAdmobRequestParams, UnifiedMrecCallback unifiedMrecCallback) {
        AdViewType createAdView = createAdView(contextProvider.getApplicationContext());
        this.adView = createAdView;
        createAdView.setAdUnitId(unifiedAdmobRequestParams.key);
        this.adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
        AdViewType adviewtype = this.adView;
        adviewtype.setAdListener(new C9020a(adviewtype, unifiedMrecCallback));
        this.adView.loadAd(unifiedAdmobRequestParams.request);
    }

    public void onDestroy() {
        AdViewType adviewtype = this.adView;
        if (adviewtype != null) {
            adviewtype.setAdListener((AdListener) null);
            this.adView.destroy();
            this.adView = null;
        }
    }
}
