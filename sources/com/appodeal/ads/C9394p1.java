package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.C9378o1;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

/* renamed from: com.appodeal.ads.p1 */
public final class C9394p1 extends C9229j1<C9425r1, UnifiedInterstitial, UnifiedInterstitialParams, UnifiedInterstitialCallback> {

    /* renamed from: com.appodeal.ads.p1$b */
    public static final class C9396b implements UnifiedInterstitialParams {
        public final int getAfd() {
            return C9378o1.m27718a().f24299q;
        }

        public final String obtainPlacementId() {
            return C9490g.m28075a(C9378o1.m27718a().f24294l);
        }

        public final String obtainSegmentId() {
            return C9378o1.m27718a().mo60856r().toString();
        }
    }

    public C9394p1(C9425r1 r1Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(r1Var, adNetwork, d0Var);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createInterstitial();
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9395a();
    }

    /* renamed from: l */
    public final LoadingError mo60108l() {
        if (this.f23268b.isInterstitialShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    /* renamed from: com.appodeal.ads.p1$a */
    public final class C9395a extends UnifiedInterstitialCallback {
        public C9395a() {
        }

        public final void onAdClicked() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59837a((C9420r) (C9425r1) p1Var.f23267a, (C9258l) p1Var, (C9263l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59844b((C9420r) (C9425r1) p1Var.f23267a, (C9229j1) p1Var);
        }

        public final void onAdExpired() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.m27166e((C9425r1) p1Var.f23267a, p1Var);
        }

        public final void onAdFinished() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59853i((C9425r1) p1Var.f23267a, p1Var, (C9263l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9394p1.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59838a((C9425r1) p1Var.f23267a, p1Var, loadingError);
        }

        public final void onAdLoaded() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59858n((C9425r1) p1Var.f23267a, p1Var);
        }

        public final void onAdShowFailed() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59845b((C9425r1) p1Var.f23267a, p1Var, (C9263l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59855j((C9425r1) p1Var.f23267a, p1Var, (C9263l2) null);
        }

        public final void printError(String str, Object obj) {
            C9394p1 p1Var = C9394p1.this;
            ((C9425r1) p1Var.f23267a).mo60600a((C9258l) p1Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9378o1.C9380b b = C9378o1.m27720b();
            C9394p1 p1Var = C9394p1.this;
            b.mo59837a((C9420r) (C9425r1) p1Var.f23267a, (C9258l) p1Var, (C9263l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9396b();
    }
}
