package com.appodeal.ads;

import com.appodeal.ads.Native;
import com.appodeal.ads.api.Stats;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.binders.C9336b;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.t2 */
public final class C9573t2 extends C9420r<C9478s2> {

    /* renamed from: J */
    public int f24266J;

    /* renamed from: K */
    public final LinkedHashSet f24267K = new LinkedHashSet();

    /* renamed from: L */
    public final LinkedHashSet f24268L = new LinkedHashSet();

    /* renamed from: M */
    public final LinkedHashSet f24269M = new LinkedHashSet();

    public C9573t2(Native.C8990c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo60596a(Stats.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setCapacity(this.f24266J);
    }

    /* renamed from: e */
    public final void mo60092e(C9258l lVar) {
        Intrinsics.checkNotNullParameter((C9478s2) lVar, "adObject");
        String str = Native.f22732b.name;
        Intrinsics.checkNotNullExpressionValue(str, "nativeAdType.name");
        mo60601a((C9336b.C9337a.C9338a) new C9336b.C9337a.C9338a.C9342d(str));
    }

    /* renamed from: n */
    public final AdType mo60093n() {
        return AdType.Native;
    }
}
