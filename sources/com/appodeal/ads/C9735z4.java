package com.appodeal.ads;

import com.appodeal.ads.initializing.C9225b;
import com.appodeal.ads.networking.usecases.C9374a;
import com.appodeal.ads.services.C9525g;
import com.appodeal.ads.storage.C9561n;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.tracker.C9656b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.z4 */
public final class C9735z4 {

    /* renamed from: a */
    public static final Lazy f24681a = LazyKt.lazy(C9736a.f24682a);

    /* renamed from: com.appodeal.ads.z4$a */
    public static final class C9736a extends Lambda implements Function0<C9706x4> {

        /* renamed from: a */
        public static final C9736a f24682a = new C9736a();

        public C9736a() {
            super(0);
        }

        public final Object invoke() {
            return new C9706x4(new C9374a(C9237k0.f23201a), C9525g.m28154c(), new C9004a3(new C9261l1()), new C9225b(), new C9272m1(0), C9656b.f24453b, C9171d5.f23011b, C9137c.f22948b, C9562o.f24251b, C9561n.f24249b);
        }
    }

    /* renamed from: a */
    public static final C9575t4 m28557a() {
        return (C9575t4) f24681a.getValue();
    }
}
