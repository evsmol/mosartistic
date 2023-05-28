package com.appodeal.ads;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.unified.UnifiedViewAd;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;

/* renamed from: com.appodeal.ads.r5 */
public abstract class C9430r5<AdRequestType extends C9420r, UnifiedAdType extends UnifiedViewAd, UnifiedAdParamsType extends UnifiedViewAdParams, UnifiedAdCallbackType extends UnifiedViewAdCallback> extends C9258l<AdRequestType, UnifiedAdType, UnifiedAdParamsType, UnifiedAdCallbackType> {

    /* renamed from: s */
    public View f23945s;

    public C9430r5(C9420r rVar, AdNetwork adNetwork, C9162d0 d0Var) {
        super(rVar, adNetwork, d0Var, 5000);
    }

    /* renamed from: a */
    public abstract int mo60070a(Context context);

    /* renamed from: b */
    public abstract int mo60073b(Context context);

    /* renamed from: i */
    public final void mo60105i() {
        super.m27416g();
        this.f23945s = null;
    }
}
