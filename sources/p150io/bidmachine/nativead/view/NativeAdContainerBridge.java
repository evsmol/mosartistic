package p150io.bidmachine.nativead.view;

import android.view.ViewGroup;

/* renamed from: io.bidmachine.nativead.view.NativeAdContainerBridge */
public class NativeAdContainerBridge {
    public static void configureContainer(NativeAdContainer nativeAdContainer, ViewGroup viewGroup) {
        nativeAdContainer.configureContainer(viewGroup);
    }

    public static void deConfigureContainer(NativeAdContainer nativeAdContainer) {
        nativeAdContainer.deConfigureContainer();
    }
}
