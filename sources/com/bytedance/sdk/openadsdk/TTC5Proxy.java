package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.p007b.C0241a;

public class TTC5Proxy {
    public static void loadFeed(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        adSlot.setDurationSlotType(5);
        C0241a.m938a().mo602a(context, adSlot, feedAdListener);
    }
}
