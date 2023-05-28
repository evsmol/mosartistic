package com.appodeal.ads;

import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.services.C9513b;
import com.appodeal.ads.services.C9525g;
import com.appodeal.ads.storage.C9562o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.i4 */
public final class C9221i4 {

    /* renamed from: a */
    public static final Lazy f23183a = LazyKt.lazy(C9222a.f23184a);

    /* renamed from: com.appodeal.ads.i4$a */
    public static final class C9222a extends Lambda implements Function0<C9197g4> {

        /* renamed from: a */
        public static final C9222a f23184a = new C9222a();

        public C9222a() {
            super(0);
        }

        public final Object invoke() {
            return new C9197g4(C9148b.f22956b.f22957a.getApplicationContext(), C9562o.f24251b, C9525g.m28153b(), C9513b.m28142a());
        }
    }

    /* renamed from: a */
    public static final C9197g4 m27381a() {
        return (C9197g4) f23183a.getValue();
    }
}
