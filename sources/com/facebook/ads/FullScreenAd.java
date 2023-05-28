package com.facebook.ads;

import com.facebook.ads.C1715Ad;

public interface FullScreenAd extends C1715Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C1715Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
