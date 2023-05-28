package com.appodeal.ads;

import android.os.Bundle;
import com.appodeal.ads.C9685w2;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;

/* renamed from: com.appodeal.ads.o5 */
public final class C9388o5 extends C9229j1<C9419q5, UnifiedVideo, UnifiedVideoParams, UnifiedVideoCallback> {

    /* renamed from: com.appodeal.ads.o5$b */
    public static final class C9390b implements UnifiedVideoParams {
        public final int getAfd() {
            return C9685w2.m28463a().f24299q;
        }

        public final String obtainPlacementId() {
            return C9490g.m28075a(C9685w2.m28463a().f24294l);
        }

        public final String obtainSegmentId() {
            return C9685w2.m28463a().mo60856r().toString();
        }
    }

    public C9388o5(C9419q5 q5Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(q5Var, adNetwork, d0Var);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createVideo();
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9389a();
    }

    /* renamed from: l */
    public final LoadingError mo60108l() {
        if (this.f23268b.isVideoShowing()) {
            return LoadingError.Canceled;
        }
        return null;
    }

    /* renamed from: com.appodeal.ads.o5$a */
    public final class C9389a extends UnifiedVideoCallback {
        public C9389a() {
        }

        public final void onAdClicked() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59837a((C9420r) (C9419q5) o5Var.f23267a, (C9258l) o5Var, (C9263l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClosed() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59844b((C9420r) (C9419q5) o5Var.f23267a, (C9229j1) o5Var);
        }

        public final void onAdExpired() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.m27166e((C9419q5) o5Var.f23267a, o5Var);
        }

        public final void onAdFinished() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59853i((C9419q5) o5Var.f23267a, o5Var, (C9263l2) null);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9388o5.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59838a((C9419q5) o5Var.f23267a, o5Var, loadingError);
        }

        public final void onAdLoaded() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59858n((C9419q5) o5Var.f23267a, o5Var);
        }

        public final void onAdShowFailed() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59845b((C9419q5) o5Var.f23267a, o5Var, (C9263l2) null, LoadingError.ShowFailed);
        }

        public final void onAdShown() {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59855j((C9419q5) o5Var.f23267a, o5Var, (C9263l2) null);
        }

        public final void printError(String str, Object obj) {
            C9388o5 o5Var = C9388o5.this;
            ((C9419q5) o5Var.f23267a).mo60600a((C9258l) o5Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9685w2.C9688c b = C9685w2.m28465b();
            C9388o5 o5Var = C9388o5.this;
            b.mo59837a((C9420r) (C9419q5) o5Var.f23267a, (C9258l) o5Var, (C9263l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9390b();
    }
}
