package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.Nm */
class C2352Nm implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f6288a;

    C2352Nm(C2408Om om, Handler handler) {
        this.f6288a = handler;
    }

    public void execute(Runnable runnable) {
        this.f6288a.post(runnable);
    }
}
