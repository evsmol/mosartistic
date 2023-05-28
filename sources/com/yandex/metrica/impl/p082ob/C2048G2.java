package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.G2 */
class C2048G2 implements C3167lm<Context, Intent, Void> {

    /* renamed from: a */
    final /* synthetic */ C2644V f5440a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f5441b;

    /* renamed from: c */
    final /* synthetic */ C2081H2 f5442c;

    C2048G2(C2081H2 h2, C2644V v, CountDownLatch countDownLatch) {
        this.f5442c = h2;
        this.f5440a = v;
        this.f5441b = countDownLatch;
    }

    /* renamed from: a */
    public Object mo15813a(Object obj, Object obj2) {
        Context context = (Context) obj;
        Intent intent = (Intent) obj2;
        this.f5440a.mo16934a(this.f5442c.m7298c());
        this.f5441b.countDown();
        this.f5442c.f5509k.mo15975b(this);
        return null;
    }
}
