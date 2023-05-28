package com.appodeal.ads.adapters.vast.video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;

/* renamed from: com.appodeal.ads.adapters.vast.video.a */
public final class C9099a implements S2SAdTask.Callback<UnifiedVastNetworkParams> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedVideoParams f22917a;

    /* renamed from: b */
    public final /* synthetic */ UnifiedVideoCallback f22918b;

    /* renamed from: c */
    public final /* synthetic */ C9100b f22919c;

    public C9099a(C9100b bVar, UnifiedVideoParams unifiedVideoParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.f22919c = bVar;
        this.f22917a = unifiedVideoParams;
        this.f22918b = unifiedVideoCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22918b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f22919c.loadVast(context, this.f22917a, (UnifiedVastNetworkParams) obj, this.f22918b);
    }
}
