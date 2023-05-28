package p150io.bidmachine.nativead;

import com.explorestack.protobuf.adcom.Placement;
import java.util.List;
import p150io.bidmachine.AdRequestParameters;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.MediaAssetType;
import p150io.bidmachine.utils.ProtoUtils;

/* renamed from: io.bidmachine.nativead.NativeAdRequestParameters */
public class NativeAdRequestParameters extends AdRequestParameters {
    private final List<MediaAssetType> mediaAssetTypes;
    private boolean validateAssets = true;

    public NativeAdRequestParameters(List<MediaAssetType> list) {
        super(AdsType.Native);
        this.mediaAssetTypes = list;
    }

    public List<MediaAssetType> getMediaAssetTypes() {
        return this.mediaAssetTypes;
    }

    public boolean containsAssetType(MediaAssetType mediaAssetType) {
        return this.mediaAssetTypes.isEmpty() || this.mediaAssetTypes.contains(mediaAssetType) || this.mediaAssetTypes.contains(MediaAssetType.All);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isNativePlacement(placement);
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof NativeAdRequestParameters) && isParametersMatchedInternal((NativeAdRequestParameters) adRequestParameters);
    }

    public boolean isValidateAssets() {
        return this.validateAssets;
    }

    /* access modifiers changed from: package-private */
    public void setValidateAssets(boolean z) {
        this.validateAssets = z;
    }

    private boolean isParametersMatchedInternal(NativeAdRequestParameters nativeAdRequestParameters) {
        return MediaAssetType.isAll(nativeAdRequestParameters.mediaAssetTypes) || nativeAdRequestParameters.mediaAssetTypes.containsAll(this.mediaAssetTypes);
    }
}
