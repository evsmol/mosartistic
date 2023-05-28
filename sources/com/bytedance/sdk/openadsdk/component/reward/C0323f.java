package com.bytedance.sdk.openadsdk.component.reward;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.f */
/* compiled from: RewardFullProxyListener */
public class C0323f implements TTAdNative.FullScreenVideoAdListener, TTAdNative.RewardVideoAdListener {

    /* renamed from: a */
    final TTAdNative.RewardVideoAdListener f1062a;

    /* renamed from: b */
    final TTAdNative.FullScreenVideoAdListener f1063b;

    public C0323f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f1062a = rewardVideoAdListener;
        this.f1063b = null;
    }

    public C0323f(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f1062a = null;
        this.f1063b = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1062a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1062a != null) {
                        C0323f.this.f1062a.onError(i, str);
                    }
                }
            });
        }
        if (this.f1063b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1063b != null) {
                        C0323f.this.f1063b.onError(i, str);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f1063b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1063b != null) {
                        C0323f.this.f1063b.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f1063b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1063b != null) {
                        C0323f.this.f1063b.onFullScreenVideoCached();
                    }
                }
            });
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f1062a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1062a != null) {
                        C0323f.this.f1062a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                }
            });
        }
    }

    public void onRewardVideoCached() {
        if (this.f1062a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0323f.this.f1062a != null) {
                        C0323f.this.f1062a.onRewardVideoCached();
                    }
                }
            });
        }
    }
}
