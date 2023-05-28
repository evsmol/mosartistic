package com.appodeal.ads.adapters.notsy.banner;

import android.content.Context;
import com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* renamed from: com.appodeal.ads.adapters.notsy.banner.a */
public final class C9090a extends UnifiedAdmobBanner<AdManagerAdView, AdManagerAdRequest> {
    public final BaseAdView createAdView(Context context) {
        return new AdManagerAdView(context);
    }
}
