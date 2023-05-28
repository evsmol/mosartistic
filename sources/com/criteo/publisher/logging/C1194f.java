package com.criteo.publisher.logging;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.logging.f */
/* compiled from: LogTag.kt */
public final class C1194f {
    static {
        new C1194f();
    }

    private C1194f() {
    }

    /* renamed from: a */
    public static final String m5402a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        return StringsKt.take("CriteoSdk" + str, 23);
    }
}
