package com.appodeal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.utils.C9634m;
import java.io.File;

/* renamed from: com.appodeal.ads.q2 */
public final class C9407q2 implements C9634m.C9636b {

    /* renamed from: a */
    public final /* synthetic */ C9263l2 f23836a;

    /* renamed from: b */
    public final /* synthetic */ C9478s2 f23837b;

    public C9407q2(C9478s2 s2Var, C9263l2 l2Var) {
        this.f23837b = s2Var;
        this.f23836a = l2Var;
    }

    /* renamed from: a */
    public final void mo59877a() {
        C9478s2 s2Var = this.f23837b;
        s2Var.f24069t--;
        s2Var.mo60721m();
    }

    /* renamed from: a */
    public final void mo59878a(Uri uri) {
        C9263l2 l2Var = this.f23836a;
        l2Var.f23302q = uri;
        if (TextUtils.isEmpty(l2Var.f23297l) && uri != null && new File(uri.getPath()).exists()) {
            this.f23836a.f23297l = C9326n5.m27529a(uri);
        }
        C9478s2 s2Var = this.f23837b;
        s2Var.f24069t--;
        s2Var.mo60721m();
    }
}
