package com.appodeal.ads.adapters.mraid.interstitial;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.mraid.interstitial.a */
public final class C9078a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedInterstitialParams f22898a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedInterstitialCallback f22899b;

    /* renamed from: c */
    public final /* synthetic */ C9079b f22900c;

    public C9078a(C9079b bVar, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f22900c = bVar;
        this.f22898a = unifiedInterstitialParams;
        this.f22899b = unifiedInterstitialCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22899b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22900c.loadMraid(context, this.f22898a, (UnifiedMraidNetworkParams) obj, this.f22899b);
    }
}
