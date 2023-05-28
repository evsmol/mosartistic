package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;

/* renamed from: com.yandex.metrica.impl.ob.pd */
public final class C3349pd implements HostRetryInfoProvider {

    /* renamed from: a */
    private final C2917e9 f8562a;

    /* renamed from: b */
    private final C3396qd f8563b;

    public C3349pd(C2917e9 e9Var, C3396qd qdVar) {
        this.f8562a = e9Var;
        this.f8563b = qdVar;
    }

    public long getLastAttemptTimeSeconds() {
        return this.f8562a.mo17505a(this.f8563b, 0);
    }

    public int getNextSendAttemptNumber() {
        return this.f8562a.mo17503a(this.f8563b, 1);
    }

    public void saveLastAttemptTimeSeconds(long j) {
        this.f8562a.mo17512b(this.f8563b, j);
    }

    public void saveNextSendAttemptNumber(int i) {
        this.f8562a.mo17511b(this.f8563b, i);
    }
}
