package p150io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.C1611Ad;
import java.util.List;
import java.util.Map;
import p150io.bidmachine.protobuf.AdExtension;

/* renamed from: io.bidmachine.protobuf.AdExtensionOrBuilder */
public interface AdExtensionOrBuilder extends MessageOrBuilder {
    boolean containsCustomParams(String str);

    AdCacheControl getAdCacheControl();

    int getAdCacheControlValue();

    int getAdCacheMaxAge();

    int getAdMarkupLoadingTimeout();

    AdExtension.ControlAsset getCloseButton();

    AdExtension.ControlAssetOrBuilder getCloseButtonOrBuilder();

    int getCompanionSkipoffset();

    AdExtension.ControlAsset getCountdown();

    AdExtension.ControlAssetOrBuilder getCountdownOrBuilder();

    CreativeLoadingMethod getCreativeLoadingMethod();

    int getCreativeLoadingMethodValue();

    @Deprecated
    Map<String, String> getCustomParams();

    int getCustomParamsCount();

    Map<String, String> getCustomParamsMap();

    String getCustomParamsOrDefault(String str, String str2);

    String getCustomParamsOrThrow(String str);

    C1611Ad.Event getEvent(int i);

    int getEventCount();

    List<C1611Ad.Event> getEventList();

    C1611Ad.EventOrBuilder getEventOrBuilder(int i);

    List<? extends C1611Ad.EventOrBuilder> getEventOrBuilderList();

    boolean getIgnoresSafeAreaLayoutGuide();

    @Deprecated
    int getLoadSkipoffset();

    float getPlaceholderTimeout();

    @Deprecated
    boolean getPreload();

    boolean getPreloadAd();

    AdExtension.ControlAsset getProgress();

    int getProgressDuration();

    AdExtension.ControlAssetOrBuilder getProgressOrBuilder();

    boolean getR1();

    int getR1Delay();

    boolean getR2();

    int getSkipoffset();

    String getStoreUrl();

    ByteString getStoreUrlBytes();

    boolean getUseEmbeddedBrowser();

    boolean getUseNativeClose();

    float getViewabilityDurationThreshold();

    boolean getViewabilityIgnoreWindowFocus();

    float getViewabilityPixelThreshold();

    int getViewabilityTimeThreshold();

    boolean hasCloseButton();

    boolean hasCountdown();

    boolean hasProgress();
}
