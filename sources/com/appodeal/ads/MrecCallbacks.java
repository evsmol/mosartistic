package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(mo38198d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, mo38199d2 = {"Lcom/appodeal/ads/MrecCallbacks;", "", "onMrecClicked", "", "onMrecExpired", "onMrecFailedToLoad", "onMrecLoaded", "isPrecache", "", "onMrecShowFailed", "onMrecShown", "apd_public"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface MrecCallbacks {
    void onMrecClicked();

    void onMrecExpired();

    void onMrecFailedToLoad();

    void onMrecLoaded(boolean z);

    void onMrecShowFailed();

    void onMrecShown();
}
