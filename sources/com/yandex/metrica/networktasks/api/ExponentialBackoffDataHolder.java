package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.impl.C3766g;
import com.yandex.metrica.networktasks.impl.C3767h;

public class ExponentialBackoffDataHolder {

    /* renamed from: a */
    private final C3766g f9654a;

    /* renamed from: b */
    private final C3767h f9655b;

    /* renamed from: c */
    private final HostRetryInfoProvider f9656c;

    /* renamed from: d */
    private long f9657d;

    /* renamed from: e */
    private int f9658e;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new C3767h(), new C3766g());
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, C3767h hVar, C3766g gVar) {
        this.f9656c = hostRetryInfoProvider;
        this.f9655b = hVar;
        this.f9654a = gVar;
        this.f9657d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f9658e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }

    public void reset() {
        this.f9658e = 1;
        this.f9657d = 0;
        this.f9656c.saveNextSendAttemptNumber(1);
        this.f9656c.saveLastAttemptTimeSeconds(this.f9657d);
    }

    public void updateLastAttemptInfo() {
        this.f9655b.getClass();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        this.f9657d = currentTimeMillis;
        this.f9658e++;
        this.f9656c.saveLastAttemptTimeSeconds(currentTimeMillis);
        this.f9656c.saveNextSendAttemptNumber(this.f9658e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f9657d;
            if (j != 0) {
                C3766g gVar = this.f9654a;
                int i = retryPolicyConfig.exponentialMultiplier * ((1 << (this.f9658e - 1)) - 1);
                int i2 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i2) {
                    i = i2;
                }
                return gVar.mo18599a(j, (long) i, "last send attempt");
            }
        }
        return true;
    }
}
