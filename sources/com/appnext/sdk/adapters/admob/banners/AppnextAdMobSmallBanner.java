package com.appnext.sdk.adapters.admob.banners;

import android.content.Context;
import com.appnext.banners.SmallBannerAd;
import com.appnext.core.C8874Ad;

public class AppnextAdMobSmallBanner extends SmallBannerAd {
    private static final String TID = "321";

    public String getTID() {
        return TID;
    }

    public AppnextAdMobSmallBanner(Context context, String str) {
        super(context, str);
    }

    protected AppnextAdMobSmallBanner(C8874Ad ad) {
        super(ad);
    }
}
