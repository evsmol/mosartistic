package com.appodeal.ads;

import com.appodeal.ads.networking.LoadingError;

/* renamed from: com.appodeal.ads.w */
public final class C9682w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9420r f24510a;

    /* renamed from: b */
    public final /* synthetic */ C9258l f24511b;

    /* renamed from: c */
    public final /* synthetic */ C9128b0 f24512c;

    public C9682w(C9128b0 b0Var, C9420r rVar, C9258l lVar, LoadingError loadingError) {
        this.f24512c = b0Var;
        this.f24510a = rVar;
        this.f24511b = lVar;
    }

    public final void run() {
        this.f24512c.f22930b.mo59949d(this.f24510a, this.f24511b);
    }
}
