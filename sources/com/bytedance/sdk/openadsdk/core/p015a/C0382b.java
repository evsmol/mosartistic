package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.core.C0547k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.b */
/* compiled from: AppOpenAdListenerAdapter */
public class C0382b implements TTAdNative.AppOpenAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TTAdNative.AppOpenAdListener f1285a;

    public C0382b(TTAdNative.AppOpenAdListener appOpenAdListener) {
        this.f1285a = appOpenAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1285a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1285a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0382b.this.f1285a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onAppOpenAdLoaded(final TTAppOpenAd tTAppOpenAd) {
        if (this.f1285a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1285a.onAppOpenAdLoaded(tTAppOpenAd);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0382b.this.f1285a.onAppOpenAdLoaded(tTAppOpenAd);
                    }
                });
            }
        }
    }
}
