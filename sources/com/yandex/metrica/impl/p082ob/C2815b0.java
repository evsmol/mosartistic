package com.yandex.metrica.impl.p082ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.yandex.metrica.impl.ob.b0 */
public class C2815b0 {

    /* renamed from: a */
    private final BroadcastReceiver f7410a;

    /* renamed from: b */
    private boolean f7411b = false;

    /* renamed from: com.yandex.metrica.impl.ob.b0$a */
    public static class C2816a {
        /* renamed from: a */
        public C2815b0 mo17207a(BroadcastReceiver broadcastReceiver) {
            return new C2815b0(broadcastReceiver);
        }
    }

    public C2815b0(BroadcastReceiver broadcastReceiver) {
        this.f7410a = broadcastReceiver;
    }

    /* renamed from: a */
    public synchronized Intent mo17205a(Context context, IntentFilter intentFilter) {
        Intent intent;
        try {
            intent = context.registerReceiver(this.f7410a, intentFilter);
            try {
                this.f7411b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intent = null;
        }
        return intent;
    }

    /* renamed from: a */
    public synchronized void mo17206a(Context context) {
        if (this.f7411b) {
            try {
                context.unregisterReceiver(this.f7410a);
                this.f7411b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
