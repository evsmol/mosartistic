package p150io.bidmachine.models;

import p150io.bidmachine.MediaAssetType;
import p150io.bidmachine.models.INativeRequestBuilder;

/* renamed from: io.bidmachine.models.INativeRequestBuilder */
public interface INativeRequestBuilder<SelfType extends INativeRequestBuilder> {
    SelfType setMediaAssetTypes(MediaAssetType... mediaAssetTypeArr);
}
