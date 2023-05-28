package com.appodeal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.appodeal.ads.C9566t0;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.v0 */
public final class C9674v0 extends C9430r5<C9683w0, UnifiedBanner, UnifiedBannerParams, UnifiedBannerCallback> {
    @Deprecated

    /* renamed from: t */
    public int f24499t;

    /* renamed from: u */
    public int f24500u = -1;

    /* renamed from: com.appodeal.ads.v0$b */
    public static class C9676b implements UnifiedBannerParams {
        public final int getMaxHeight(Context context) {
            return ((C9566t0.f24258b || C9566t0.f24259c) && C9182f1.m27292m(C9148b.f22956b.f22957a.getApplicationContext()) > 720.0f) ? 90 : 50;
        }

        public final int getMaxWidth(Context context) {
            int round = Math.round(C9182f1.m27296p(C9148b.f22956b.f22957a.getApplicationContext()));
            if (C9566t0.f24258b) {
                return round;
            }
            return (!C9566t0.f24259c || round < 728) ? 320 : 728;
        }

        public final boolean needLeaderBoard(Context context) {
            return C9566t0.m28250a(context);
        }

        public final String obtainPlacementId() {
            return C9490g.m28075a(C9566t0.m28247a().f24294l);
        }

        public final String obtainSegmentId() {
            return C9566t0.m28247a().mo60856r().toString();
        }

        public final boolean useSmartBanners(Context context) {
            return C9566t0.f24258b;
        }
    }

    public C9674v0(C9683w0 w0Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(w0Var, adNetwork, d0Var);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createBanner();
    }

    /* renamed from: b */
    public final int mo60073b(Context context) {
        if (C9566t0.f24258b && this.f23268b.isSupportSmartBanners()) {
            return -1;
        }
        if (C9566t0.m28250a(context)) {
            HashMap hashMap = C9182f1.f23039a;
            return Math.round(TypedValue.applyDimension(1, 728.0f, context.getResources().getDisplayMetrics()));
        }
        HashMap hashMap2 = C9182f1.f23039a;
        return Math.round(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9675a();
    }

    /* renamed from: m */
    public final int mo61208m() {
        return this.f24499t;
    }

    /* renamed from: com.appodeal.ads.v0$a */
    public class C9675a extends UnifiedBannerCallback {
        public C9675a() {
        }

        public final void onAdClicked() {
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var = C9674v0.this;
            b.mo59837a((C9420r) (C9683w0) v0Var.f23267a, (C9258l) v0Var, (C9263l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdExpired() {
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var = C9674v0.this;
            b.m27166e((C9683w0) v0Var.f23267a, v0Var);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9674v0.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var = C9674v0.this;
            b.mo59838a((C9683w0) v0Var.f23267a, v0Var, loadingError);
        }

        public final void onAdLoaded(View view, int i, int i2) {
            C9674v0 v0Var = C9674v0.this;
            v0Var.f23945s = view;
            v0Var.f24499t = i2;
            v0Var.f24500u = view.getResources().getConfiguration().orientation;
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var2 = C9674v0.this;
            b.mo59858n((C9683w0) v0Var2.f23267a, v0Var2);
        }

        public final void onAdShowFailed() {
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var = C9674v0.this;
            b.mo59845b((C9683w0) v0Var.f23267a, v0Var, (C9263l2) null, LoadingError.ShowFailed);
        }

        public final void printError(String str, Object obj) {
            C9674v0 v0Var = C9674v0.this;
            ((C9683w0) v0Var.f23267a).mo60600a((C9258l) v0Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9566t0.C9569c b = C9566t0.m28251b();
            C9674v0 v0Var = C9674v0.this;
            b.mo59837a((C9420r) (C9683w0) v0Var.f23267a, (C9258l) v0Var, (C9263l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9676b();
    }

    /* renamed from: a */
    public final int mo60070a(Context context) {
        HashMap hashMap = C9182f1.f23039a;
        return Math.round(TypedValue.applyDimension(1, (float) this.f24499t, context.getResources().getDisplayMetrics()));
    }
}
