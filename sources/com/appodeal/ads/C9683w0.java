package com.appodeal.ads;

import com.appodeal.ads.C9566t0;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.w0 */
public final class C9683w0 extends C9737z5<C9674v0> {
    public C9683w0(C9566t0.C9570d dVar) {
        super(dVar);
    }

    /* renamed from: e */
    public final void mo60092e(C9258l lVar) {
        C9674v0 v0Var = (C9674v0) lVar;
        Intrinsics.checkNotNullParameter(v0Var, "adObject");
        C9566t0.C9567a c = C9566t0.m28252c();
        Intrinsics.checkNotNullExpressionValue(c, "obtainAdRenderer()");
        C8998a b = c.mo61233b();
        Intrinsics.checkNotNullExpressionValue(b, "adRenderer.currentDisplayPosition");
        String str = b.f22775a;
        Intrinsics.checkNotNullExpressionValue(str, "currentDisplayPosition.name");
        mo60601a((C9336b.C9337a.C9338a) new C9336b.C9337a.C9338a.C9339a(str, v0Var.f24499t == 50 ? 320 : 728, c.mo61229a(), C9566t0.f24258b));
    }

    /* renamed from: n */
    public final AdType mo60093n() {
        return AdType.Banner;
    }
}
