package com.yandex.metrica.impl.p082ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.Kl */
public class C2249Kl extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3135km<Context, Intent> f5979a;

    /* renamed from: b */
    private final ICommonExecutor f5980b;

    /* renamed from: com.yandex.metrica.impl.ob.Kl$a */
    class C2250a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f5981a;

        /* renamed from: b */
        final /* synthetic */ Intent f5982b;

        C2250a(Context context, Intent intent) {
            this.f5981a = context;
            this.f5982b = intent;
        }

        public void run() {
            C2249Kl.this.f5979a.mo15578a(this.f5981a, this.f5982b);
        }
    }

    public C2249Kl(C3135km<Context, Intent> kmVar, ICommonExecutor iCommonExecutor) {
        this.f5979a = kmVar;
        this.f5980b = iCommonExecutor;
    }

    public void onReceive(Context context, Intent intent) {
        this.f5980b.execute(new C2250a(context, intent));
    }
}
