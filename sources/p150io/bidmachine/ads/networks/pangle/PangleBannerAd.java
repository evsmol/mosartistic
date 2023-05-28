package p150io.bidmachine.ads.networks.pangle;

import android.view.View;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import java.util.List;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedBannerAdCallback;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.pangle.PangleBannerAd */
class PangleBannerAd extends UnifiedBannerAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private InteractionListener interactionlistener;
    private LoadListener loadListener;
    private TTAdNative ttAdNative;
    private TTNativeExpressAd ttNativeExpressAd;

    PangleBannerAd() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        PangleParams pangleParams = new PangleParams(unifiedMediationParams);
        if (pangleParams.isValid(unifiedBannerAdCallback)) {
            AdSlot.Builder withBid = new AdSlot.Builder().setCodeId(pangleParams.slotId).withBid(pangleParams.bidPayload);
            int i = C52661.$SwitchMap$io$bidmachine$banner$BannerSize[unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize().ordinal()];
            if (i == 1) {
                withBid.setExpressViewAcceptedSize(728.0f, 90.0f);
            } else if (i != 2) {
                withBid.setExpressViewAcceptedSize(320.0f, 50.0f);
            } else {
                withBid.setExpressViewAcceptedSize(300.0f, 250.0f);
            }
            this.loadListener = new LoadListener(this, unifiedBannerAdCallback);
            TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(contextProvider.getApplicationContext());
            this.ttAdNative = createAdNative;
            createAdNative.loadBannerExpressAd(withBid.build(), this.loadListener);
        }
    }

    /* renamed from: io.bidmachine.ads.networks.pangle.PangleBannerAd$1 */
    static /* synthetic */ class C52661 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.bidmachine.banner.BannerSize[] r0 = p150io.bidmachine.banner.BannerSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$banner$BannerSize = r0
                io.bidmachine.banner.BannerSize r1 = p150io.bidmachine.banner.BannerSize.Size_728x90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$banner$BannerSize     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.banner.BannerSize r1 = p150io.bidmachine.banner.BannerSize.Size_300x250     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p150io.bidmachine.ads.networks.pangle.PangleBannerAd.C52661.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void prepareToShow(TTNativeExpressAd tTNativeExpressAd, UnifiedBannerAdCallback unifiedBannerAdCallback) {
        this.ttNativeExpressAd = tTNativeExpressAd;
        InteractionListener interactionListener = new InteractionListener(unifiedBannerAdCallback);
        this.interactionlistener = interactionListener;
        tTNativeExpressAd.setExpressInteractionListener((TTNativeExpressAd.ExpressAdInteractionListener) interactionListener);
        tTNativeExpressAd.render();
    }

    public void onDestroy() {
        this.ttAdNative = null;
        this.loadListener = null;
        this.interactionlistener = null;
        TTNativeExpressAd tTNativeExpressAd = this.ttNativeExpressAd;
        if (tTNativeExpressAd != null) {
            tTNativeExpressAd.setExpressInteractionListener((TTNativeExpressAd.ExpressAdInteractionListener) null);
            this.ttNativeExpressAd.destroy();
            this.ttNativeExpressAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.pangle.PangleBannerAd$LoadListener */
    private static final class LoadListener implements TTAdNative.NativeExpressAdListener {
        private final UnifiedBannerAdCallback callback;
        private final PangleBannerAd pangleBannerAd;

        public LoadListener(PangleBannerAd pangleBannerAd2, UnifiedBannerAdCallback unifiedBannerAdCallback) {
            this.pangleBannerAd = pangleBannerAd2;
            this.callback = unifiedBannerAdCallback;
        }

        public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
            if (list != null && list.size() != 0) {
                for (TTNativeExpressAd next : list) {
                    if (next != null) {
                        this.pangleBannerAd.prepareToShow(next, this.callback);
                        return;
                    }
                }
            }
        }

        public void onError(int i, String str) {
            this.callback.onAdLoadFailed(BMError.noFill());
        }
    }

    /* renamed from: io.bidmachine.ads.networks.pangle.PangleBannerAd$InteractionListener */
    private static final class InteractionListener implements TTNativeExpressAd.ExpressAdInteractionListener {
        private final UnifiedBannerAdCallback callback;

        public void onAdShow(View view, int i) {
        }

        public InteractionListener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
            this.callback = unifiedBannerAdCallback;
        }

        public void onRenderSuccess(View view, float f, float f2) {
            this.callback.onAdLoaded(view);
        }

        public void onRenderFail(View view, String str, int i) {
            this.callback.onAdLoadFailed(BMError.noFill());
        }

        public void onAdClicked(View view, int i) {
            this.callback.onAdClicked();
        }
    }
}
