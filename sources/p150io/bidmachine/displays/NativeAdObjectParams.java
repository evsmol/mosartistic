package p150io.bidmachine.displays;

import com.explorestack.protobuf.adcom.C1611Ad;
import java.util.HashMap;
import java.util.Map;
import p150io.bidmachine.TrackEventType;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: io.bidmachine.displays.NativeAdObjectParams */
final class NativeAdObjectParams extends AdObjectParams implements UnifiedMediationParams.MappedUnifiedMediationParams.DataProvider {
    private final UnifiedMediationParams mediationParams = new UnifiedMediationParams.MappedUnifiedMediationParams(this);
    private HashMap<String, Object> params;

    public boolean isValid() {
        return true;
    }

    NativeAdObjectParams(C1611Ad ad) {
        super(ad);
        prepareEvents(ad.getDisplay().getEventList());
        C1611Ad.Display.Native nativeR = ad.getDisplay().getNative();
        C1611Ad.Display.Native.LinkAsset link = nativeR.getLink();
        if (!(link == null || link == C1611Ad.Display.Native.LinkAsset.getDefaultInstance())) {
            getData().put(IabUtils.KEY_CLICK_URL, link.getUrl());
            for (int i = 0; i < link.getTrkrCount(); i++) {
                addEvent(TrackEventType.Click, link.getTrkr(i));
            }
        }
        for (C1611Ad.Display.Native.Asset next : nativeR.getAssetList()) {
            int id = next.getId();
            if (id == 4) {
                C1611Ad.Display.Native.Asset.VideoAsset defaultInstance = C1611Ad.Display.Native.Asset.VideoAsset.getDefaultInstance();
                if (!next.getVideo().getCurl().equals(defaultInstance.getCurl())) {
                    getData().put(IabUtils.KEY_VIDEO_URL, next.getVideo().getCurl());
                }
                if (!next.getVideo().getAdm().equals(defaultInstance.getAdm())) {
                    getData().put(IabUtils.KEY_VIDEO_ADM, next.getVideo().getAdm());
                }
            } else if (id == 7) {
                try {
                    getData().put(IabUtils.KEY_RATING, Float.valueOf(next.getData().getValue()));
                } catch (NumberFormatException unused) {
                }
            } else if (id == 8) {
                getData().put(IabUtils.KEY_CTA, next.getData().getValue());
            } else if (id == 123) {
                getData().put("title", next.getTitle().getText());
            } else if (id == 124) {
                getData().put(IabUtils.KEY_ICON_URL, next.getImage().getUrl());
            } else if (id == 127) {
                getData().put("description", next.getData().getValue());
            } else if (id == 128) {
                getData().put(IabUtils.KEY_IMAGE_URL, next.getImage().getUrl());
            }
        }
    }

    public Map<String, Object> getData() {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        return this.params;
    }

    public UnifiedMediationParams toMediationParams() {
        return this.mediationParams;
    }
}
