package com.appodeal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.appodeal.ads.C9205h2;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.j2 */
public final class C9230j2 extends C9430r5<C9253k2, UnifiedMrec, UnifiedMrecParams, UnifiedMrecCallback> {

    /* renamed from: com.appodeal.ads.j2$b */
    public static final class C9232b implements UnifiedMrecParams {
        public final String obtainPlacementId() {
            return C9490g.m28075a(C9205h2.m27336a().f24294l);
        }

        public final String obtainSegmentId() {
            return C9205h2.m27336a().mo60856r().toString();
        }
    }

    public C9230j2(C9253k2 k2Var, AdNetwork adNetwork, C9162d0 d0Var) {
        super(k2Var, adNetwork, d0Var);
    }

    /* renamed from: a */
    public final UnifiedAd mo60071a(AdNetwork adNetwork) {
        return adNetwork.createMrec();
    }

    /* renamed from: b */
    public final int mo60073b(Context context) {
        HashMap hashMap = C9182f1.f23039a;
        return Math.round(TypedValue.applyDimension(1, 300.0f, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: c */
    public final UnifiedAdCallback mo60074c() {
        return new C9231a();
    }

    /* renamed from: com.appodeal.ads.j2$a */
    public final class C9231a extends UnifiedMrecCallback {
        public C9231a() {
        }

        public final void onAdClicked() {
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.mo59837a((C9420r) (C9253k2) j2Var.f23267a, (C9258l) j2Var, (C9263l2) null, (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdExpired() {
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.m27166e((C9253k2) j2Var.f23267a, j2Var);
        }

        public final void onAdInfoRequested(Bundle bundle) {
            C9230j2.this.mo60095a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.mo59838a((C9253k2) j2Var.f23267a, j2Var, loadingError);
        }

        public final void onAdLoaded(View view) {
            C9230j2.this.f23945s = view;
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.mo59858n((C9253k2) j2Var.f23267a, j2Var);
        }

        public final void onAdShowFailed() {
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.mo59845b((C9253k2) j2Var.f23267a, j2Var, (C9263l2) null, LoadingError.ShowFailed);
        }

        public final void printError(String str, Object obj) {
            C9230j2 j2Var = C9230j2.this;
            ((C9253k2) j2Var.f23267a).mo60600a((C9258l) j2Var, str, obj);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            C9205h2.C9208c b = C9205h2.m27339b();
            C9230j2 j2Var = C9230j2.this;
            b.mo59837a((C9420r) (C9253k2) j2Var.f23267a, (C9258l) j2Var, (C9263l2) null, unifiedAdCallbackClickTrackListener);
        }
    }

    /* renamed from: a */
    public final UnifiedAdParams mo60072a(int i) {
        return new C9232b();
    }

    /* renamed from: a */
    public final int mo60070a(Context context) {
        HashMap hashMap = C9182f1.f23039a;
        return Math.round(TypedValue.applyDimension(1, 250.0f, context.getResources().getDisplayMetrics()));
    }
}
