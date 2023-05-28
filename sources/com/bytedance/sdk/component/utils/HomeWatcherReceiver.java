package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class HomeWatcherReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C10620a f26507a;

    /* renamed from: com.bytedance.sdk.component.utils.HomeWatcherReceiver$a */
    public interface C10620a {
        /* renamed from: a */
        void mo695a();

        /* renamed from: b */
        void mo696b();
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: " + action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra(IronSourceConstants.EVENTS_ERROR_REASON);
                Log.i("HomeReceiver", "reason: " + stringExtra);
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    C10620a aVar = this.f26507a;
                    if (aVar != null) {
                        aVar.mo695a();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    C10620a aVar2 = this.f26507a;
                    if (aVar2 != null) {
                        aVar2.mo696b();
                    }
                } else if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        }
    }

    /* renamed from: a */
    public void mo64259a(C10620a aVar) {
        this.f26507a = aVar;
    }
}
