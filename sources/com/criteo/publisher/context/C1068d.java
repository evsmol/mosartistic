package com.criteo.publisher.context;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.context.d */
/* compiled from: UserDataHolder.kt */
public final class C1068d {

    /* renamed from: a */
    private final AtomicReference<UserData> f3483a = new AtomicReference<>(new UserData());

    /* renamed from: a */
    public final UserData mo3104a() {
        UserData userData = this.f3483a.get();
        Intrinsics.checkExpressionValueIsNotNull(userData, "valueRef.get()");
        return userData;
    }

    /* renamed from: a */
    public final void mo3105a(UserData userData) {
        Intrinsics.checkParameterIsNotNull(userData, "userData");
        this.f3483a.set(userData);
    }
}
