package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.mediation.p234a.C8075e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.C8630y;
import com.applovin.impl.sdk.C8631z;

/* renamed from: com.applovin.impl.mediation.ads.b */
public class C8107b implements C8631z.C8634a {

    /* renamed from: a */
    private final C8490n f19734a;

    /* renamed from: b */
    private final C8073d f19735b;

    /* renamed from: c */
    private final C8631z f19736c;

    /* renamed from: d */
    private final C8630y f19737d;

    /* renamed from: e */
    private final C8105a.C8106a f19738e;

    public C8107b(C8073d dVar, ViewGroup viewGroup, C8105a.C8106a aVar, C8490n nVar) {
        this.f19734a = nVar;
        this.f19735b = dVar;
        this.f19738e = aVar;
        this.f19737d = new C8630y(viewGroup, nVar);
        C8631z zVar = new C8631z(viewGroup, nVar, this);
        this.f19736c = zVar;
        zVar.mo57833a((C8075e) this.f19735b);
        nVar.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = nVar.mo57320D();
            D.mo57818b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m24245a(long j) {
        if (this.f19735b.mo56135F().compareAndSet(false, true)) {
            this.f19734a.mo57320D();
            if (C8626v.m26252a()) {
                this.f19734a.mo57320D().mo57818b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f19734a.mo57324H().processViewabilityAdImpressionPostback(this.f19735b, j, this.f19738e);
        }
    }

    /* renamed from: a */
    public void mo56258a() {
        this.f19736c.mo57832a();
    }

    /* renamed from: b */
    public void mo56259b() {
        this.f19734a.mo57320D();
        if (C8626v.m26252a()) {
            this.f19734a.mo57320D().mo57818b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f19735b.mo56134E().compareAndSet(false, true)) {
            this.f19734a.mo57320D();
            if (C8626v.m26252a()) {
                this.f19734a.mo57320D().mo57818b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f19735b.getNativeAd().isExpired()) {
                C8626v.m26258i("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f19735b.mo56136G();
            }
            this.f19734a.mo57324H().processRawAdImpressionPostback(this.f19735b, this.f19738e);
        }
    }

    /* renamed from: c */
    public C8073d mo56260c() {
        return this.f19735b;
    }

    public void onLogVisibilityImpression() {
        m24245a(this.f19737d.mo57831a(this.f19735b));
    }
}
