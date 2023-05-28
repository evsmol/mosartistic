package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.segments.C9495j;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.segments.f */
public final class C9489f implements C9495j.C9497b {

    /* renamed from: a */
    public final C9529a f24085a;

    /* renamed from: b */
    public final Lazy f24086b = LazyKt.lazy(new C9488e(this));

    public C9489f(C9562o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f24085a = oVar;
    }

    /* renamed from: a */
    public final Object mo60734a(Context context, C9495j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jVar, "ruleHelper");
        return Integer.valueOf(((Number) this.f24086b.getValue()).intValue());
    }
}
