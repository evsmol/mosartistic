package com.appodeal.ads.adapters.nast.native_ad;

import android.content.Context;
import com.appodeal.ads.adapters.nast.native_ad.C9088b;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.tasks.S2SAdTask;

/* renamed from: com.appodeal.ads.adapters.nast.native_ad.a */
public final class C9087a implements S2SAdTask.Callback<String> {

    /* renamed from: a */
    public final /* synthetic */ UnifiedNativeCallback f22910a;

    public C9087a(UnifiedNativeCallback unifiedNativeCallback) {
        this.f22910a = unifiedNativeCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f22910a.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        C9088b.C9089a a = C9088b.C9089a.m27160a((String) obj);
        if (a == null) {
            this.f22910a.onAdLoadFailed(LoadingError.InternalError);
        } else {
            this.f22910a.onAdLoaded(a);
        }
    }
}
