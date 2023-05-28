package com.appodeal.ads.adapters.mraid.rewarded_video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.mraid.rewarded_video.a */
public final class C9082a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedRewardedParams f22904a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedRewardedCallback f22905b;

    /* renamed from: c */
    public final /* synthetic */ C9083b f22906c;

    public C9082a(C9083b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f22906c = bVar;
        this.f22904a = unifiedRewardedParams;
        this.f22905b = unifiedRewardedCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22905b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22906c.loadMraid(context, this.f22904a, (UnifiedMraidNetworkParams) obj, this.f22905b);
    }
}
