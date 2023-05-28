package com.criteo.publisher.p065g0;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.g0.a */
/* compiled from: LazyDependency.kt */
public final class C1134a<T> {

    /* renamed from: a */
    private final Lazy f3625a;

    /* renamed from: b */
    private final String f3626b;

    /* renamed from: b */
    private final T m5222b() {
        return this.f3625a.getValue();
    }

    public C1134a(String str, Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "supplier");
        this.f3626b = str;
        this.f3625a = LazyKt.lazy(function0);
    }

    /* renamed from: a */
    public final T mo3228a() {
        return m5222b();
    }

    public String toString() {
        String str = this.f3626b;
        if (str != null) {
            String str2 = "LazyDependency(" + str + ')';
            if (str2 != null) {
                return str2;
            }
        }
        return super.toString();
    }
}
