package com.appnext.sdk.adapters.admob.banners;

import android.content.Context;
import com.appnext.banners.MediumRectangleAd;
import com.appnext.core.C8874Ad;

public class AppnextAdMobMediumBanner extends MediumRectangleAd {
    private static final String TID = "321";

    public String getTID() {
        return TID;
    }

    public AppnextAdMobMediumBanner(Context context, String str) {
        super(context, str);
    }

    protected AppnextAdMobMediumBanner(C8874Ad ad) {
        super(ad);
    }
}
