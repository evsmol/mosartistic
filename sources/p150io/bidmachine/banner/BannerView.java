package p150io.bidmachine.banner;

import android.content.Context;
import android.util.AttributeSet;
import p150io.bidmachine.AdView;
import p150io.bidmachine.ViewAdObject;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* renamed from: io.bidmachine.banner.BannerView */
public class BannerView extends AdView<BannerView, BannerAd, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, BannerListener> {
    public BannerView(Context context) {
        super(context);
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public BannerAd createAd(Context context) {
        return new BannerAd(context);
    }
}
