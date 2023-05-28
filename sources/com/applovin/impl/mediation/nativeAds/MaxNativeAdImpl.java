package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import com.applovin.impl.mediation.ads.C8107b;
import java.util.List;

public class MaxNativeAdImpl {
    private C8107b adViewTracker;
    private List<View> clickableViews;

    public C8107b getAdViewTracker() {
        return this.adViewTracker;
    }

    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(C8107b bVar) {
        this.adViewTracker = bVar;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
