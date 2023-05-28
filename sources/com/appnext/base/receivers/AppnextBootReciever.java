package com.appnext.base.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appnext.base.operations.imp.scdle;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8854g;
import com.appnext.base.services.p266b.C8873a;

public class AppnextBootReciever extends BroadcastReceiver {
    public void onReceive(final Context context, Intent intent) {
        try {
            C8852e.init(context);
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                C8854g.m26679aN().mo58748b(new Runnable() {
                    public final void run() {
                        try {
                            String simpleName = scdle.class.getSimpleName();
                            C8838c cVar = new C8838c(C8850d.f22425fe, "", "", "1", C8850d.f22433fm, simpleName, simpleName + System.currentTimeMillis(), (String) null);
                            C8831a.m26576X().mo58686ab().mo58719a(cVar);
                            C8873a.m26797d(context).mo58814a(cVar, true);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }
}
