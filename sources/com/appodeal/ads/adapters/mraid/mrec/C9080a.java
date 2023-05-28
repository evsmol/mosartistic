package com.appodeal.ads.adapters.mraid.mrec;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.mraid.mrec.a */
public final class C9080a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedMrecParams f22901a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedMrecCallback f22902b;

    /* renamed from: c */
    public final /* synthetic */ C9081b f22903c;

    public C9080a(C9081b bVar, UnifiedMrecParams unifiedMrecParams, UnifiedMrecCallback unifiedMrecCallback) {
        this.f22903c = bVar;
        this.f22901a = unifiedMrecParams;
        this.f22902b = unifiedMrecCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22902b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22903c.loadMraid(context, this.f22901a, (UnifiedMraidNetworkParams) obj, this.f22902b);
    }
}
