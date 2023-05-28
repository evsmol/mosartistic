package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.d1 */
public final class C2879d1 implements ConfigProvider<C2275Lg> {

    /* renamed from: a */
    private final Lazy f7625a = LazyKt.lazy(new C2880a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2259L3 f7626b;

    /* renamed from: com.yandex.metrica.impl.ob.d1$a */
    static final class C2880a extends Lambda implements Function0<C2275Lg> {

        /* renamed from: a */
        final /* synthetic */ C2879d1 f7627a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2880a(C2879d1 d1Var) {
            super(0);
            this.f7627a = d1Var;
        }

        public Object invoke() {
            return this.f7627a.f7626b.mo16135m();
        }
    }

    public C2879d1(C2259L3 l3) {
        this.f7626b = l3;
    }

    /* renamed from: a */
    public C2275Lg mo17428a() {
        C2275Lg lg = (C2275Lg) this.f7625a.getValue();
        Intrinsics.checkNotNullExpressionValue(lg, "cachedConfig");
        return lg;
    }

    public Object getConfig() {
        C2275Lg lg = (C2275Lg) this.f7625a.getValue();
        Intrinsics.checkNotNullExpressionValue(lg, "cachedConfig");
        return lg;
    }
}
