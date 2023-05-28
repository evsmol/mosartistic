package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8538o;

/* renamed from: com.applovin.impl.sdk.e.f */
public class C8412f extends C8401a {

    /* renamed from: a */
    private final C8413a f21141a;

    /* renamed from: com.applovin.impl.sdk.e.f$a */
    public interface C8413a {
        /* renamed from: a */
        void mo57200a(C8538o.C8544a aVar);
    }

    public C8412f(C8490n nVar, C8413a aVar) {
        super("TaskCollectAdvertisingId", nVar, true);
        this.f21141a = aVar;
    }

    public void run() {
        this.f21141a.mo57200a(this.f21118b.mo57340Y().mo57636k());
    }
}
