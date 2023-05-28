package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0547k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.f */
/* compiled from: NativeExpressAdListenerAdapter */
public class C0395f implements TTAdNative.NativeExpressAdListener {

    /* renamed from: a */
    TTAdNative.NativeExpressAdListener f1310a;

    public C0395f(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f1310a = nativeExpressAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1310a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1310a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0395f.this.f1310a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeExpressAdLoad(final List<TTNativeExpressAd> list) {
        if (this.f1310a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1310a.onNativeExpressAdLoad(list);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0395f.this.f1310a.onNativeExpressAdLoad(list);
                    }
                });
            }
        }
    }
}
