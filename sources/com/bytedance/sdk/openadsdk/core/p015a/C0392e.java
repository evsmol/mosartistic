package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C0547k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.e */
/* compiled from: NativeAdListenerAdapter */
public class C0392e implements TTAdNative.NativeAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.NativeAdListener f1304a;

    public C0392e(TTAdNative.NativeAdListener nativeAdListener) {
        this.f1304a = nativeAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1304a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1304a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0392e.this.f1304a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeAdLoad(final List<TTNativeAd> list) {
        if (this.f1304a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1304a.onNativeAdLoad(list);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0392e.this.f1304a.onNativeAdLoad(list);
                    }
                });
            }
        }
    }
}
