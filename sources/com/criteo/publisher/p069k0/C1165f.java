package com.criteo.publisher.p069k0;

import com.criteo.publisher.logging.C1193e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.k0.f */
/* compiled from: NetworkLogMessage.kt */
public final class C1165f {
    static {
        new C1165f();
    }

    private C1165f() {
    }

    /* renamed from: b */
    public static final C1193e m5312b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "requestPayload");
        return new C1193e(0, "CDB Request initiated: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5311a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "responsePayload");
        return new C1193e(0, "CDB Response received: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
