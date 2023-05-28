package com.bytedance.sdk.openadsdk.core.p015a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C0547k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.c */
/* compiled from: FeedAdListenerAdapter */
public class C0385c implements TTAdNative.FeedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.FeedAdListener f1291a = null;

    public C0385c(TTAdNative.FeedAdListener feedAdListener) {
        this.f1291a = feedAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f1291a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1291a.onError(i, str);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0385c.this.f1291a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFeedAdLoad(final List<TTFeedAd> list) {
        if (this.f1291a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f1291a.onFeedAdLoad(list);
            } else {
                C0547k.m2622d().post(new Runnable() {
                    public void run() {
                        C0385c.this.f1291a.onFeedAdLoad(list);
                    }
                });
            }
        }
    }
}
