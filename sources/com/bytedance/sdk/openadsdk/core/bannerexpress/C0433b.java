package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.b */
/* compiled from: TTBannerExpressVideoAdImpl */
public class C0433b extends C0424a {
    public C0433b(Context context, C0477n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo1151a(Context context, C0477n nVar, AdSlot adSlot) {
        this.f1421a = new BannerExpressVideoView(context, nVar, adSlot);
        mo1152a(this.f1421a.getCurView(), this.f1423c);
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        if (this.f1421a != null) {
            this.f1421a.setVideoAdListener(expressVideoAdListener);
        }
    }

    public C0935a getVideoModel() {
        if (this.f1421a != null) {
            return ((BannerExpressVideoView) this.f1421a).getVideoModel();
        }
        return null;
    }
}
