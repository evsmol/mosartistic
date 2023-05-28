package com.appodeal.ads.initializing;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.initializing.b */
public final class C9225b implements C9224a {

    /* renamed from: a */
    public final ArrayList f23185a = new ArrayList();

    /* renamed from: a */
    public final ArrayList mo60046a() {
        return this.f23185a;
    }

    /* renamed from: a */
    public final void mo60047a(ApdInitializationError apdInitializationError) {
        Intrinsics.checkNotNullParameter(apdInitializationError, "error");
        this.f23185a.add(apdInitializationError);
    }

    public final void clear() {
        this.f23185a.clear();
    }
}
