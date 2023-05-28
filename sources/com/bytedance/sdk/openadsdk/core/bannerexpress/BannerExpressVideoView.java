package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, C0477n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1132a() {
        this.f1409b = new NativeExpressVideoView(this.f1408a, this.f1411d, this.f1412e, this.f1417j);
        addView(this.f1409b, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo1133a(C0477n nVar, AdSlot adSlot) {
        this.f1410c = new NativeExpressVideoView(this.f1408a, nVar, adSlot, this.f1417j);
        this.f1410c.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressVideoView.this.f1413f != null) {
                    BannerExpressVideoView.this.f1413f.onAdClicked(BannerExpressVideoView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressVideoView.this.mo1135a(f, f2);
                BannerExpressVideoView.this.mo1139e();
            }
        });
        C1002v.m4716a((View) this.f1410c, 8);
        addView(this.f1410c, new ViewGroup.LayoutParams(-1, -1));
    }

    public C0935a getVideoModel() {
        if (this.f1409b != null) {
            return ((NativeExpressVideoView) this.f1409b).getVideoModel();
        }
        return null;
    }
}
