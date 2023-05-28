package com.appodeal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import com.appodeal.ads.AppodealUnityBannerView;

/* renamed from: com.appodeal.ads.s0 */
public final class C9465s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f24031a;

    /* renamed from: b */
    public final /* synthetic */ int f24032b;

    /* renamed from: c */
    public final /* synthetic */ AppodealUnityBannerView f24033c;

    public C9465s0(AppodealUnityBannerView appodealUnityBannerView, Activity activity, int i) {
        this.f24033c = appodealUnityBannerView;
        this.f24031a = activity;
        this.f24032b = i;
    }

    public final void run() {
        if (this.f24033c.f22719a != null) {
            C9409q4.m27850b(this.f24031a, this.f24032b);
            AppodealUnityBannerView.C8986b bVar = this.f24033c.f22719a;
            if (bVar.getParent() != null && (bVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) bVar.getParent()).removeView(bVar);
            }
            this.f24033c.f22719a = null;
        }
    }
}
