package com.criteo.publisher.context;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.context.c */
/* compiled from: ContextUtil.kt */
public final class C1067c {
    static {
        new C1067c();
    }

    private C1067c() {
    }

    /* renamed from: a */
    public static final Map<String, Object> m4979a(AbstractContextData<?> abstractContextData) {
        Intrinsics.checkParameterIsNotNull(abstractContextData, "contextData");
        Map<String, Object> data = abstractContextData.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "contextData.getData()");
        return data;
    }
}
