package com.appsgeyser.sdk.ads.behavior.loaderBehaviors;

import com.appsgeyser.sdk.ads.AdsLoader;

public class LoaderRefreshTimeoutBehavior extends LoaderBehavior {
    private final float timeOut;

    public LoaderRefreshTimeoutBehavior(float f) {
        this.timeOut = f;
    }

    public void visit(AdsLoader adsLoader) {
        adsLoader.setRefreshTimeout(this.timeOut);
    }
}
