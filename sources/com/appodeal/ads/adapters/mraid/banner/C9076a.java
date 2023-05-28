package com.appodeal.ads.adapters.mraid.banner;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.mraid.banner.a */
public final class C9076a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedBannerParams f22895a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedBannerCallback f22896b;

    /* renamed from: c */
    public final /* synthetic */ C9077b f22897c;

    public C9076a(C9077b bVar, UnifiedBannerParams unifiedBannerParams, UnifiedBannerCallback unifiedBannerCallback) {
        this.f22897c = bVar;
        this.f22895a = unifiedBannerParams;
        this.f22896b = unifiedBannerCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22896b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22897c.loadMraid(context, this.f22895a, (UnifiedMraidNetworkParams) obj, this.f22896b);
    }
}
