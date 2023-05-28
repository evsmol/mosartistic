package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Ub */
public abstract class C2598Ub<T> implements C2455Qb<T> {

    /* renamed from: a */
    private ICommonExecutor f6877a;

    /* renamed from: b */
    private volatile Runnable f6878b;

    public C2598Ub(ICommonExecutor iCommonExecutor) {
        this.f6877a = iCommonExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16765a(Runnable runnable, long j) {
        this.f6877a.executeDelayed(runnable, j, TimeUnit.SECONDS);
        this.f6878b = runnable;
    }

    /* renamed from: a */
    public void mo15993a() {
        Runnable runnable = this.f6878b;
        if (runnable != null) {
            this.f6877a.remove(runnable);
            this.f6878b = null;
        }
    }
}
