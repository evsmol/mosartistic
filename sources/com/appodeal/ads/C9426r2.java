package com.appodeal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.utils.C9637n;
import com.explorestack.iab.vast.VastRequest;
import java.io.File;

/* renamed from: com.appodeal.ads.r2 */
public final class C9426r2 implements C9637n.C9639b {

    /* renamed from: a */
    public final /* synthetic */ C9263l2 f23933a;

    /* renamed from: b */
    public final /* synthetic */ C9478s2 f23934b;

    public C9426r2(C9478s2 s2Var, C9263l2 l2Var) {
        this.f23934b = s2Var;
        this.f23933a = l2Var;
    }

    /* renamed from: a */
    public final void mo59902a() {
        C9478s2 s2Var = this.f23934b;
        s2Var.f24069t--;
        s2Var.mo60721m();
    }

    /* renamed from: a */
    public final void mo59903a(Uri uri, VastRequest vastRequest) {
        C9263l2 l2Var = this.f23933a;
        l2Var.f23303r = vastRequest;
        l2Var.f23302q = uri;
        if (TextUtils.isEmpty(l2Var.f23297l) && uri != null && new File(uri.getPath()).exists()) {
            this.f23933a.f23297l = C9326n5.m27529a(uri);
        }
        C9478s2 s2Var = this.f23934b;
        s2Var.f24069t--;
        s2Var.mo60721m();
    }
}
