package com.apm.insight.runtime.p179a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.C6553b;
import com.apm.insight.runtime.C6761p;
import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: com.apm.insight.runtime.a.d */
class C6725d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f14462a;

    /* renamed from: com.apm.insight.runtime.a.d$a */
    private class C6727a extends BroadcastReceiver {
        private C6727a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    int unused = C6725d.this.f14462a = (int) ((((float) intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    C6725d(final Context context) {
        C6761p.m17019b().mo52327a((Runnable) new Runnable() {
            public void run() {
                try {
                    C6725d.this.m16885a(context);
                } catch (Throwable th) {
                    C6553b.m16004a().mo52019a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16885a(Context context) {
        context.registerReceiver(new C6727a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: a */
    public int mo52275a() {
        return this.f14462a;
    }
}
