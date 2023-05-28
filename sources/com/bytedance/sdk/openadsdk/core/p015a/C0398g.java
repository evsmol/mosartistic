package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.C0547k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.g */
/* compiled from: RewardVideoAdListenerAdapter */
public class C0398g implements TTAdNative.RewardVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.RewardVideoAdListener f1316a;

    public C0398g(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f1316a = rewardVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1316a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1316a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0398g.this.f1316a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f1316a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1316a.onRewardVideoAdLoad(tTRewardVideoAd);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0398g.this.f1316a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                });
            }
        }
    }

    public void onRewardVideoCached() {
        if (this.f1316a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1316a.onRewardVideoCached();
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0398g.this.f1316a.onRewardVideoCached();
                    }
                });
            }
        }
    }
}
