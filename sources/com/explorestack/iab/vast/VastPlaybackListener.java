package com.explorestack.iab.vast;

import java.io.Serializable;

public interface VastPlaybackListener extends Serializable {
    void onVideoCompleted();

    void onVideoFirstQuartile();

    void onVideoMidpoint();

    void onVideoPaused();

    void onVideoResumed();

    void onVideoSkipped();

    void onVideoStarted(float f, float f2);

    void onVideoThirdQuartile();

    void onVideoVolumeChanged(float f);
}
