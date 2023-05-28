package p150io.bidmachine.banner;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: io.bidmachine.banner.BannerSize */
public enum BannerSize {
    Size_320x50(320, 50),
    Size_300x250(C5643c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
    Size_728x90(728, 90);
    
    public final int height;
    public final int width;

    private BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
