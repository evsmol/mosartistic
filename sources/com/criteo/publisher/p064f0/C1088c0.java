package com.criteo.publisher.p064f0;

import com.criteo.publisher.logging.C1193e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.f0.c0 */
/* compiled from: SendingQueueLogMessage.kt */
public final class C1088c0 {
    static {
        new C1088c0();
    }

    private C1088c0() {
    }

    /* renamed from: a */
    public static final C1193e m5069a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
        return new C1193e(5, "Error while reading queue file. Recovering by recreating it or using in-memory queue", th, "onRecoveringFromStaleQueueFile");
    }

    /* renamed from: a */
    public static final C1193e m5068a(Exception exc) {
        Intrinsics.checkParameterIsNotNull(exc, "exception");
        return new C1193e(5, "Error when polling element from queue file", exc, "onErrorWhenPollingQueueFile");
    }
}
