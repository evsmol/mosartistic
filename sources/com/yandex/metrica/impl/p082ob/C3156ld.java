package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

/* renamed from: com.yandex.metrica.impl.ob.ld */
public final class C3156ld implements ExponentialBackoffPolicy {

    /* renamed from: a */
    private final ExponentialBackoffDataHolder f8246a;

    public C3156ld(ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f8246a = exponentialBackoffDataHolder;
    }

    public boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig) {
        return this.f8246a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    public void onAllHostsAttemptsFinished(boolean z) {
        if (z) {
            this.f8246a.reset();
        } else {
            this.f8246a.updateLastAttemptInfo();
        }
    }

    public void onHostAttemptFinished(boolean z) {
    }
}
