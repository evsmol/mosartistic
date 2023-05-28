package com.appodeal.ads.adapters.vast.rewarded_video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;

/* renamed from: com.appodeal.ads.adapters.vast.rewarded_video.a */
public final class C9097a implements S2SAdTask.Callback<UnifiedVastNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedRewardedParams f22914a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedRewardedCallback f22915b;

    /* renamed from: c */
    public final /* synthetic */ C9098b f22916c;

    public C9097a(C9098b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f22916c = bVar;
        this.f22914a = unifiedRewardedParams;
        this.f22915b = unifiedRewardedCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22915b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22916c.loadVast(context, this.f22914a, (UnifiedVastNetworkParams) obj, this.f22915b);
    }
}
