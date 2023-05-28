package com.yandex.metrica.networktasks.impl;

import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import com.yandex.metrica.networktasks.api.NetworkTask;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.networktasks.impl.f */
public final class C3765f implements Runnable {

    /* renamed from: a */
    private final NetworkTask f9711a;

    /* renamed from: b */
    private final C3762c f9712b;

    /* renamed from: c */
    private final C3763d f9713c;

    public C3765f(NetworkTask networkTask, C3762c cVar, C3763d dVar) {
        Intrinsics.checkNotNullParameter(networkTask, "networkTask");
        Intrinsics.checkNotNullParameter(cVar, "rootThreadStateSource");
        Intrinsics.checkNotNullParameter(dVar, "taskPerformingStrategy");
        this.f9711a = networkTask;
        this.f9712b = cVar;
        this.f9713c = dVar;
    }

    public void run() {
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f9711a.getExponentialBackoffPolicy();
        Intrinsics.checkNotNullExpressionValue(exponentialBackoffPolicy, "networkTask.exponentialBackoffPolicy");
        IExecutionPolicy connectionExecutionPolicy = this.f9711a.getConnectionExecutionPolicy();
        Intrinsics.checkNotNullExpressionValue(connectionExecutionPolicy, "networkTask.connectionExecutionPolicy");
        boolean z = true;
        if (!this.f9712b.isRunning() || !connectionExecutionPolicy.canBeExecuted() || !exponentialBackoffPolicy.canBeExecuted(this.f9711a.getRetryPolicyConfig())) {
            z = false;
        } else {
            boolean onCreateNetworkTask = this.f9711a.onCreateNetworkTask();
            Boolean bool = null;
            while (this.f9712b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f9711a.getRetryPolicyConfig())) {
                bool = Boolean.valueOf(this.f9713c.mo18596a(this.f9711a));
                onCreateNetworkTask = !bool.booleanValue() && this.f9711a.shouldTryNextHost();
                exponentialBackoffPolicy.onHostAttemptFinished(bool.booleanValue());
            }
            if (bool != null) {
                exponentialBackoffPolicy.onAllHostsAttemptsFinished(bool.booleanValue());
            }
        }
        if (!z) {
            this.f9711a.onShouldNotExecute();
        }
    }
}
