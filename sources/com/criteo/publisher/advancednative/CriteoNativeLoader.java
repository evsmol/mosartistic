package com.criteo.publisher.advancednative;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.criteo.publisher.Bid;
import com.criteo.publisher.C1069d;
import com.criteo.publisher.C1071e;
import com.criteo.publisher.C1321s;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.NativeAdUnit;
import com.criteo.publisher.model.p073b0.C1243n;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p074n0.C1311o;
import java.lang.ref.WeakReference;

public class CriteoNativeLoader {
    final NativeAdUnit adUnit;
    private final CriteoNativeAdListener listener;
    private final C1195g logger;
    private final CriteoNativeRenderer publisherRenderer;
    private CriteoNativeRenderer renderer;

    public CriteoNativeLoader(CriteoNativeAdListener criteoNativeAdListener, CriteoNativeRenderer criteoNativeRenderer) {
        this((NativeAdUnit) null, criteoNativeAdListener, criteoNativeRenderer);
    }

    public CriteoNativeLoader(NativeAdUnit nativeAdUnit, CriteoNativeAdListener criteoNativeAdListener, CriteoNativeRenderer criteoNativeRenderer) {
        this.logger = C1197h.m5407b(getClass());
        this.adUnit = nativeAdUnit;
        this.listener = new C1044k(criteoNativeAdListener, new WeakReference(this));
        this.publisherRenderer = criteoNativeRenderer;
        this.logger.mo3337a(C1046m.m4911c(nativeAdUnit));
    }

    public static void setImageLoader(ImageLoader imageLoader) {
        getImageLoaderHolder().mo3058a(imageLoader);
    }

    public View createEmptyNativeView(Context context, ViewGroup viewGroup) {
        return getRenderer().createNativeView(context, viewGroup);
    }

    public void loadAd() {
        loadAd(new ContextData());
    }

    public void loadAd(ContextData contextData) {
        try {
            doLoad(contextData);
        } catch (Throwable th) {
            C1311o.m5779a(th);
        }
    }

    private void doLoad(ContextData contextData) {
        this.logger.mo3337a(C1046m.m4913e(this));
        getIntegrationRegistry().mo3246a(C1147a.STANDALONE);
        getBidManager().mo3113a(this.adUnit, contextData, new C1021a());
    }

    /* renamed from: com.criteo.publisher.advancednative.CriteoNativeLoader$a */
    class C1021a implements C1069d {
        C1021a() {
        }

        /* renamed from: a */
        public void mo3034a(C1272s sVar) {
            CriteoNativeLoader.this.handleNativeAssets(sVar.mo3576g());
        }

        /* renamed from: a */
        public void mo3033a() {
            CriteoNativeLoader.this.handleNativeAssets((C1243n) null);
        }
    }

    public void loadAd(Bid bid) {
        try {
            doLoad(bid);
        } catch (Throwable th) {
            C1311o.m5779a(th);
        }
    }

    private void doLoad(Bid bid) {
        C1243n nVar;
        this.logger.mo3337a(C1046m.m4906a(this, bid));
        getIntegrationRegistry().mo3246a(C1147a.IN_HOUSE);
        if (bid == null) {
            nVar = null;
        } else {
            nVar = bid.mo2938a();
        }
        handleNativeAssets(nVar);
    }

    /* access modifiers changed from: private */
    public void handleNativeAssets(C1243n nVar) {
        if (nVar == null) {
            notifyForFailureAsync();
        } else {
            notifyForAdAsync(getNativeAdMapper().mo3062a(nVar, new WeakReference(this.listener), getRenderer()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4867a(CriteoNativeAd criteoNativeAd) {
        this.listener.onAdReceived(criteoNativeAd);
    }

    private void notifyForAdAsync(CriteoNativeAd criteoNativeAd) {
        getUiThreadExecutor().mo3126a(new Runnable(criteoNativeAd) {
            public final /* synthetic */ CriteoNativeAd f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CriteoNativeLoader.this.m4867a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4866a() {
        this.listener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
    }

    private void notifyForFailureAsync() {
        getUiThreadExecutor().mo3126a(new Runnable() {
            public final void run() {
                CriteoNativeLoader.this.m4866a();
            }
        });
    }

    private CriteoNativeRenderer getRenderer() {
        if (this.renderer == null) {
            this.renderer = new AdChoiceOverlayNativeRenderer(this.publisherRenderer, getAdChoiceOverlay());
        }
        return this.renderer;
    }

    private C1045l getNativeAdMapper() {
        return C1321s.m5824c().mo3679Q0();
    }

    private C1076c getUiThreadExecutor() {
        return C1321s.m5824c().mo3696c1();
    }

    private C1071e getBidManager() {
        return C1321s.m5824c().mo3712k0();
    }

    private C1026b getAdChoiceOverlay() {
        return C1321s.m5824c().mo3693b0();
    }

    private static C1039h getImageLoaderHolder() {
        return C1321s.m5824c().mo3666D0();
    }

    private C1150c getIntegrationRegistry() {
        return C1321s.m5824c().mo3668F0();
    }
}
