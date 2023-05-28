package com.applovin.impl.sdk.p251a;

import android.webkit.WebView;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.e */
public class C8325e extends C8315b {
    public C8325e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo56845a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            C8626v vVar = this.f20485c;
            if (C8626v.m26252a()) {
                this.f20485c.mo57819b(this.f20486d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo56846a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f20484b.mo57374ao().mo56873d(), this.f20484b.mo57374ao().mo56874e(), this.f20483a.getOpenMeasurementVerificationScriptResources(), this.f20483a.getOpenMeasurementContentUrl(), this.f20483a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            C8626v vVar = this.f20485c;
            if (C8626v.m26252a()) {
                this.f20485c.mo57819b(this.f20486d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
