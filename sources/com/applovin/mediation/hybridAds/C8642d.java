package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

/* renamed from: com.applovin.mediation.hybridAds.d */
public class C8642d {

    /* renamed from: a */
    private final C8490n f21841a;

    /* renamed from: com.applovin.mediation.hybridAds.d$a */
    private static class C8643a extends C8561a {

        /* renamed from: a */
        private final C8072c f21842a;

        /* renamed from: b */
        private final C8490n f21843b;

        /* renamed from: c */
        private final MaxAdapterListener f21844c;

        public C8643a(C8072c cVar, C8490n nVar, MaxAdapterListener maxAdapterListener) {
            this.f21842a = cVar;
            this.f21843b = nVar;
            this.f21844c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                C8072c cVar = this.f21842a;
                ((MaxHybridMRecAdActivity) activity).mo58002a(cVar, cVar.mo56095o(), this.f21843b, this.f21844c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && this.f21842a.mo56105x().get()) {
                this.f21843b.mo57368ai().mo56834b(this);
            }
        }
    }

    /* renamed from: com.applovin.mediation.hybridAds.d$b */
    private static class C8644b extends C8561a {

        /* renamed from: a */
        private final C8072c f21845a;

        /* renamed from: b */
        private final C8490n f21846b;

        /* renamed from: c */
        private final MaxAdapterListener f21847c;

        public C8644b(C8072c cVar, C8490n nVar, MaxAdapterListener maxAdapterListener) {
            this.f21845a = cVar;
            this.f21846b = nVar;
            this.f21847c = maxAdapterListener;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                C8072c cVar = this.f21845a;
                ((MaxHybridNativeAdActivity) activity).mo58004a(cVar, cVar.getNativeAd(), this.f21846b, this.f21847c);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && this.f21845a.mo56105x().get()) {
                this.f21846b.mo57368ai().mo56834b(this);
            }
        }
    }

    public C8642d(C8490n nVar) {
        this.f21841a = nVar;
    }

    /* renamed from: a */
    public void mo58017a(C8072c cVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        Intent intent;
        Utils.assertMainThread();
        if (activity == null) {
            activity = this.f21841a.mo57368ai().mo56831a();
        }
        if (cVar.getNativeAd() != null) {
            this.f21841a.mo57320D();
            if (C8626v.m26252a()) {
                this.f21841a.mo57320D().mo57818b("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f21841a.mo57368ai().mo56832a(new C8644b(cVar, this.f21841a, maxAdapterListener));
            intent = new Intent(activity, MaxHybridNativeAdActivity.class);
        } else if (cVar.mo56095o() != null) {
            this.f21841a.mo57320D();
            if (C8626v.m26252a()) {
                this.f21841a.mo57320D().mo57818b("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f21841a.mo57368ai().mo56832a(new C8643a(cVar, this.f21841a, maxAdapterListener));
            intent = new Intent(activity, MaxHybridMRecAdActivity.class);
        } else if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
            return;
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
            return;
        } else {
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
        activity.startActivity(intent);
    }
}
