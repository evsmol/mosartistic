package com.appodeal.ads.storage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.storage.m */
public final class C9559m {

    /* renamed from: a */
    public static final Lazy f24247a = LazyKt.lazy(C9560a.f24248a);

    /* renamed from: com.appodeal.ads.storage.m$a */
    public static final class C9560a extends Lambda implements Function0<C9531b> {

        /* renamed from: a */
        public static final C9560a f24248a = new C9560a();

        public C9560a() {
            super(0);
        }

        public final Object invoke() {
            return new C9531b();
        }
    }

    /* renamed from: a */
    public static final C9531b m28214a() {
        return (C9531b) f24247a.getValue();
    }
}
