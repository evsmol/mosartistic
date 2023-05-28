package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C0246c;
import com.bytedance.sdk.openadsdk.component.p011f.C0260a;

public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        adSlot.setDurationSlotType(3);
        C0246c.m958a(context).mo621a(adSlot, appOpenAdListener, i);
    }

    /* renamed from: a */
    public static void m31411a(Context context) {
        C0260a.m1015a(context);
    }
}
