package com.appodeal.ads.context;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.context.c */
public final class C9149c {

    /* renamed from: a */
    public static final Lazy f22958a = LazyKt.lazy(C9150a.f22959a);

    /* renamed from: com.appodeal.ads.context.c$a */
    public static final class C9150a extends Lambda implements Function0<C9153f> {

        /* renamed from: a */
        public static final C9150a f22959a = new C9150a();

        public C9150a() {
            super(0);
        }

        public final Object invoke() {
            return new C9153f();
        }
    }

    /* renamed from: a */
    public static final C9153f m27236a() {
        return (C9153f) f22958a.getValue();
    }
}
