package p150io.bidmachine.nativead;

import p150io.bidmachine.ImageData;

/* renamed from: io.bidmachine.nativead.NativePublicData */
public interface NativePublicData {
    String getCallToAction();

    String getDescription();

    ImageData getIcon();

    ImageData getMainImage();

    float getRating();

    String getTitle();

    boolean hasVideo();
}
