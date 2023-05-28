package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C1715Ad ad);

    void onAdLoaded(C1715Ad ad);

    void onError(C1715Ad ad, AdError adError);

    void onLoggingImpression(C1715Ad ad);
}
