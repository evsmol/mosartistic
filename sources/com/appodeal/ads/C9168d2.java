package com.appodeal.ads;

import android.net.Uri;
import com.appodeal.ads.utils.C9637n;
import com.explorestack.iab.vast.VastRequest;

/* renamed from: com.appodeal.ads.d2 */
public final class C9168d2 implements C9637n.C9639b {

    /* renamed from: a */
    public final /* synthetic */ C9195g2 f23008a;

    public C9168d2(C9195g2 g2Var) {
        this.f23008a = g2Var;
    }

    /* renamed from: a */
    public final void mo59903a(Uri uri, VastRequest vastRequest) {
        C9195g2 g2Var = this.f23008a;
        g2Var.f23118t = vastRequest;
        C9263l2 l2Var = g2Var.f23099a;
        l2Var.f23303r = vastRequest;
        l2Var.f23302q = uri;
        g2Var.mo59956e();
    }

    /* renamed from: a */
    public final void mo59902a() {
        C9195g2 g2Var = this.f23008a;
        g2Var.f23121w = 1;
        g2Var.mo59959h();
        this.f23008a.f23115q = false;
    }
}
