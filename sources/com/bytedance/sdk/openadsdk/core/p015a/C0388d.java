package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.core.C0547k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.d */
/* compiled from: FullScreenVideoAdListenerAdapter */
public class C0388d implements TTAdNative.FullScreenVideoAdListener {

    /* renamed from: a */
    TTAdNative.FullScreenVideoAdListener f1297a;

    public C0388d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f1297a = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1297a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1297a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0388d.this.f1297a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f1297a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1297a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0388d.this.f1297a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f1297a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1297a.onFullScreenVideoCached();
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0388d.this.f1297a.onFullScreenVideoCached();
                    }
                });
            }
        }
    }
}
