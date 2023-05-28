package com.appodeal.ads.adapters.mraid.video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.mraid.video.a */
public final class C9084a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedVideoParams f22907a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedVideoCallback f22908b;

    /* renamed from: c */
    public final /* synthetic */ C9085b f22909c;

    public C9084a(C9085b bVar, UnifiedVideoParams unifiedVideoParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.f22909c = bVar;
        this.f22907a = unifiedVideoParams;
        this.f22908b = unifiedVideoCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22908b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22909c.loadMraid(context, this.f22907a, (UnifiedMraidNetworkParams) obj, this.f22908b);
    }
}
