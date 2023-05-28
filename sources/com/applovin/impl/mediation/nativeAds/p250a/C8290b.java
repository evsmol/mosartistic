package com.applovin.impl.mediation.nativeAds.p250a;

import android.content.Context;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.mediation.nativeAds.a.b */
public class C8290b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a */
    private final int f20377a;

    /* renamed from: b */
    private final MaxNativeAdLoader f20378b;

    /* renamed from: c */
    private final Queue<MaxAd> f20379c = new LinkedList();

    /* renamed from: d */
    private boolean f20380d = false;

    /* renamed from: e */
    private final Object f20381e = new Object();

    /* renamed from: f */
    private C8291a f20382f;

    /* renamed from: com.applovin.impl.mediation.nativeAds.a.b$a */
    public interface C8291a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public C8290b(String str, int i, Context context, C8291a aVar) {
        this.f20377a = i;
        this.f20382f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f20378b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        this.f20378b.setRevenueListener(this);
        this.f20378b.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, C8135d.C8137a.NATIVE_AD_PLACER);
    }

    /* renamed from: a */
    public void mo56697a() {
        this.f20382f = null;
        mo56703e();
        this.f20378b.destroy();
    }

    /* renamed from: a */
    public void mo56698a(MaxAd maxAd) {
        this.f20378b.destroy(maxAd);
    }

    /* renamed from: a */
    public boolean mo56699a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f20378b.render(maxNativeAdView, maxAd);
    }

    /* renamed from: b */
    public boolean mo56700b() {
        boolean z;
        synchronized (this.f20381e) {
            z = !this.f20379c.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public void mo56701c() {
        synchronized (this.f20381e) {
            if (!this.f20380d && this.f20379c.size() < this.f20377a) {
                this.f20380d = true;
                this.f20378b.loadAd();
            }
        }
    }

    /* renamed from: d */
    public MaxAd mo56702d() {
        MaxAd maxAd;
        synchronized (this.f20381e) {
            maxAd = null;
            while (!this.f20379c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = this.f20379c.remove();
            }
            mo56701c();
        }
        return maxAd;
    }

    /* renamed from: e */
    public void mo56703e() {
        synchronized (this.f20381e) {
            for (MaxAd a : this.f20379c) {
                mo56698a(a);
            }
            this.f20379c.clear();
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C8291a aVar = this.f20382f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        C8291a aVar = this.f20382f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        C8291a aVar = this.f20382f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f20381e) {
            this.f20379c.add(maxAd);
            this.f20380d = false;
            mo56701c();
        }
        C8291a aVar = this.f20382f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
