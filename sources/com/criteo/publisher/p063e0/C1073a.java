package com.criteo.publisher.p063e0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.e0.a */
/* compiled from: AsyncResources.kt */
public abstract class C1073a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3122a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3124b();

    /* renamed from: a */
    public final void mo3123a(Function1<? super C1074a, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "resourceHandler");
        C1074a aVar = new C1074a();
        try {
            function1.invoke(aVar);
        } catch (Throwable th) {
            aVar.mo3125a();
            throw th;
        }
    }

    /* renamed from: com.criteo.publisher.e0.a$a */
    /* compiled from: AsyncResources.kt */
    public final class C1074a {

        /* renamed from: a */
        private final AtomicBoolean f3500a = new AtomicBoolean(false);

        public C1074a() {
            C1073a.this.mo3122a();
        }

        /* renamed from: a */
        public final void mo3125a() {
            if (this.f3500a.compareAndSet(false, true)) {
                C1073a.this.mo3124b();
            }
        }
    }
}
