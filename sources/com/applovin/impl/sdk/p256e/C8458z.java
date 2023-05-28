package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;

/* renamed from: com.applovin.impl.sdk.e.z */
public class C8458z extends C8401a {

    /* renamed from: a */
    private final Runnable f21237a;

    public C8458z(C8490n nVar, Runnable runnable) {
        this(nVar, false, runnable);
    }

    public C8458z(C8490n nVar, boolean z, Runnable runnable) {
        super("TaskRunnable", nVar, z);
        this.f21237a = runnable;
    }

    public void run() {
        this.f21237a.run();
    }
}
