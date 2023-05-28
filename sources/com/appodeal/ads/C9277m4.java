package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.C9384o4;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

/* renamed from: com.appodeal.ads.m4 */
public final class C9277m4 extends C9229j1<C9325n4, UnifiedRewarded, UnifiedRewardedParams, UnifiedRewardedCallback> {

    /* renamed from: com.appodeal.ads.m4$b */
    public static class C9279b implements UnifiedRewardedParams {
        public final int getAfd() {
            return C9384o4.m27742a().f24299q;
        }

        public final int getMaxDuration() {
            return C9384o4.f23806b;
        }

        public final String obtainPlacementId() {
            return C9490g.m28075a(C9384o4.m27742a().f24294l);
        }

        public final String obtainSegmentId() {
            return C9384o4.m27742a().mo60856r().toString();
        }
    }

    public C9277m4(C9325n4 n4Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(n4Var, adNetwork, d0Var);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createRewarded();
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9278a();
    }

    /* renamed from: l */
    public final LoadingError mo60108l() {
        if (this.f23268b.isRewardedShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    /* renamed from: com.appodeal.ads.m4$a */
    public final class C9278a extends UnifiedRewardedCallback {
        public C9278a() {
        }

        public final void onAdClicked() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59837a((C9420r) (C9325n4) m4Var.f23267a, (C9258l) m4Var, (C9263l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59844b((C9420r) (C9325n4) m4Var.f23267a, (C9229j1) m4Var);
        }

        public final void onAdExpired() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.m27166e((C9325n4) m4Var.f23267a, m4Var);
        }

        public final void onAdFinished() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59853i((C9325n4) m4Var.f23267a, m4Var, (C9263l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9277m4.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59838a((C9325n4) m4Var.f23267a, m4Var, loadingError);
        }

        public final void onAdLoaded() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59858n((C9325n4) m4Var.f23267a, m4Var);
        }

        public final void onAdShowFailed() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59845b((C9325n4) m4Var.f23267a, m4Var, (C9263l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59855j((C9325n4) m4Var.f23267a, m4Var, (C9263l2) null);
        }

        public final void printError(String str, Object obj) {
            C9277m4 m4Var = C9277m4.this;
            ((C9325n4) m4Var.f23267a).mo60600a((C9258l) m4Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9384o4.C9387c b = C9384o4.m27744b();
            C9277m4 m4Var = C9277m4.this;
            b.mo59837a((C9420r) (C9325n4) m4Var.f23267a, (C9258l) m4Var, (C9263l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9279b();
    }
}
