package com.applovin.impl.sdk.p251a;

import android.webkit.WebView;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.c */
public class C8323c extends C8315b {
    public C8323c(C8345a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo56845a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
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
            return AdSessionContext.createHtmlAdSessionContext(this.f20484b.mo57374ao().mo56873d(), webView, this.f20483a.getOpenMeasurementContentUrl(), this.f20483a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            C8626v vVar = this.f20485c;
            if (C8626v.m26252a()) {
                this.f20485c.mo57819b(this.f20486d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
