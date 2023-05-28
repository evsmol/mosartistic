package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C0311d;
import com.bytedance.sdk.openadsdk.component.reward.C0322e;
import com.bytedance.sdk.openadsdk.component.reward.C0323f;
import com.bytedance.sdk.openadsdk.component.reward.C0336i;

public class TTC3Proxy {
    public static void verityPlayable(String str, int i, String str2, String str3, String str4) {
        C0322e.m1372a(str, i, str2, str3, str4);
    }

    public static void loadReward(Context context, AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        adSlot.setDurationSlotType(7);
        C0336i.m1401a(context).mo897a(adSlot, (TTAdNative.RewardVideoAdListener) new C0323f(rewardVideoAdListener));
    }

    public static void loadFull(Context context, AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        adSlot.setDurationSlotType(8);
        C0311d.m1344a(context).mo862a(adSlot, (TTAdNative.FullScreenVideoAdListener) new C0323f(fullScreenVideoAdListener));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31412a(android.content.Context r1) {
        /*
            com.bytedance.sdk.openadsdk.component.reward.i r0 = com.bytedance.sdk.openadsdk.component.reward.C0336i.m1401a((android.content.Context) r1)     // Catch:{ all -> 0x0007 }
            r0.mo900b()     // Catch:{ all -> 0x0007 }
        L_0x0007:
            com.bytedance.sdk.openadsdk.component.reward.d r1 = com.bytedance.sdk.openadsdk.component.reward.C0311d.m1344a((android.content.Context) r1)     // Catch:{ all -> 0x000e }
            r1.mo860a()     // Catch:{ all -> 0x000e }
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTC3Proxy.m31412a(android.content.Context):void");
    }
}
