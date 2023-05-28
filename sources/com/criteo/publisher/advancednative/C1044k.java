package com.criteo.publisher.advancednative;

import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.advancednative.CriteoNativeAdListener;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.Reference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.advancednative.k */
/* compiled from: LoggingCriteoNativeAdListener.kt */
public final class C1044k implements CriteoNativeAdListener {

    /* renamed from: a */
    private final C1195g f3440a;

    /* renamed from: b */
    private final CriteoNativeAdListener f3441b;

    /* renamed from: c */
    private final Reference<CriteoNativeLoader> f3442c;

    public /* synthetic */ void onAdClosed() {
        CriteoNativeAdListener.CC.$default$onAdClosed(this);
    }

    public /* synthetic */ void onAdLeftApplication() {
        CriteoNativeAdListener.CC.$default$onAdLeftApplication(this);
    }

    public C1044k(CriteoNativeAdListener criteoNativeAdListener, Reference<CriteoNativeLoader> reference) {
        Intrinsics.checkParameterIsNotNull(criteoNativeAdListener, "delegate");
        Intrinsics.checkParameterIsNotNull(reference, "nativeLoaderRef");
        this.f3441b = criteoNativeAdListener;
        this.f3442c = reference;
        C1195g b = C1197h.m5407b(getClass());
        Intrinsics.checkExpressionValueIsNotNull(b, "LoggerFactory.getLogger(javaClass)");
        this.f3440a = b;
    }

    public void onAdReceived(CriteoNativeAd criteoNativeAd) {
        Intrinsics.checkParameterIsNotNull(criteoNativeAd, "nativeAd");
        this.f3440a.mo3337a(C1046m.m4912d(this.f3442c.get()));
        this.f3441b.onAdReceived(criteoNativeAd);
    }

    public void onAdFailedToReceive(CriteoErrorCode criteoErrorCode) {
        Intrinsics.checkParameterIsNotNull(criteoErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f3440a.mo3337a(C1046m.m4908b(this.f3442c.get()));
        this.f3441b.onAdFailedToReceive(criteoErrorCode);
    }

    public void onAdImpression() {
        this.f3440a.mo3337a(C1046m.m4910c(this.f3442c.get()));
        this.f3441b.onAdImpression();
    }

    public void onAdClicked() {
        this.f3440a.mo3337a(C1046m.m4905a(this.f3442c.get()));
        this.f3441b.onAdClicked();
    }
}
