package com.criteo.publisher.p070l0;

import com.criteo.publisher.logging.C1193e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.criteo.publisher.l0.b */
/* compiled from: PrivacyLogMessage.kt */
public final class C1172b {
    static {
        new C1172b();
    }

    private C1172b() {
    }

    /* renamed from: a */
    public static final C1193e m5339a(String str) {
        return new C1193e(0, "MoPub consent set: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5340a(boolean z) {
        return new C1193e(0, "CCPA opt-out set: " + z, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
