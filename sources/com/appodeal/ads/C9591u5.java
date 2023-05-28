package com.appodeal.ads;

import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.u5 */
public final class C9591u5 implements C9618d0.C9621b {

    /* renamed from: a */
    public final /* synthetic */ C9577u f24330a;

    /* renamed from: b */
    public final /* synthetic */ C9737z5 f24331b;

    /* renamed from: c */
    public final /* synthetic */ C9430r5 f24332c;

    /* renamed from: d */
    public final /* synthetic */ C9710x5 f24333d;

    public C9591u5(C9710x5 x5Var, C9577u uVar, C9737z5 z5Var, C9430r5 r5Var) {
        this.f24333d = x5Var;
        this.f24330a = uVar;
        this.f24331b = z5Var;
        this.f24332c = r5Var;
    }

    /* renamed from: a */
    public final void mo60131a() {
        Log.debug(this.f24333d.f24583a, "VisibilityTracker", "onViewShown");
        this.f24330a.f24286d.mo59855j(this.f24331b, this.f24332c, (C9263l2) null);
    }

    /* renamed from: b */
    public final void mo60132b() {
        Log.debug(this.f24333d.f24583a, "VisibilityTracker", "onViewTrackingFinished");
        this.f24330a.f24286d.mo59853i(this.f24331b, this.f24332c, (C9263l2) null);
    }
}
