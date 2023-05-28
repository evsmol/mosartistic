package p150io.bidmachine.banner;

import android.content.Context;
import p150io.bidmachine.AdListener;
import p150io.bidmachine.AdProcessCallback;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.ViewAd;
import p150io.bidmachine.ViewAdObject;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* renamed from: io.bidmachine.banner.BannerAd */
final class BannerAd extends ViewAd<BannerAd, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, UnifiedBannerAdRequestParams, AdListener<BannerAd>> {
    BannerAd(Context context) {
        super(context, AdsType.Banner);
    }

    /* access modifiers changed from: protected */
    public ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams> createAdObject(ContextProvider contextProvider, BannerRequest bannerRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedBannerAd createBanner = networkAdapter.createBanner();
        if (createBanner == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, bannerRequest, adObjectParams, createBanner);
        BannerSize size = bannerRequest.getSize();
        viewAdObject.setWidth(size.width);
        viewAdObject.setHeight(size.height);
        return viewAdObject;
    }
}
