package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.services.b */
public final class C9513b {

    /* renamed from: a */
    public static final Lazy f24138a = LazyKt.lazy(C9514a.f24139a);

    /* renamed from: com.appodeal.ads.services.b$a */
    public static final class C9514a extends Lambda implements Function0<C9510a> {

        /* renamed from: a */
        public static final C9514a f24139a = new C9514a();

        public C9514a() {
            super(0);
        }

        public final Object invoke() {
            return new C9510a();
        }
    }

    /* renamed from: a */
    public static final ServicesRegistry m28142a() {
        return (ServicesRegistry) f24138a.getValue();
    }
}
