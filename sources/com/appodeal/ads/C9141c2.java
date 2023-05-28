package com.appodeal.ads;

import android.net.Uri;
import com.appodeal.ads.utils.C9634m;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.c2 */
public final class C9141c2 implements C9634m.C9636b {

    /* renamed from: a */
    public final /* synthetic */ C9195g2 f22951a;

    public C9141c2(C9195g2 g2Var) {
        this.f22951a = g2Var;
    }

    /* renamed from: a */
    public final void mo59878a(Uri uri) {
        Log.log(C9195g2.f23097x, "Video", "has been loaded");
        C9195g2 g2Var = this.f22951a;
        g2Var.f23099a.f23302q = uri;
        g2Var.mo59956e();
    }

    /* renamed from: a */
    public final void mo59877a() {
        Log.log(C9195g2.f23097x, "Video", "hasn't been loaded");
        C9195g2 g2Var = this.f22951a;
        g2Var.f23121w = 1;
        g2Var.mo59959h();
        this.f22951a.f23115q = false;
    }
}
