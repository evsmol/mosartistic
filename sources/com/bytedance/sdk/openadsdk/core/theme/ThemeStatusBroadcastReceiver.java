package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C10638l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C0626a> f2335a;

    public void onReceive(Context context, Intent intent) {
        C10638l.m31235b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C0626a> weakReference = this.f2335a;
            if (weakReference != null && weakReference.get() != null) {
                ((C0626a) this.f2335a.get()).mo2038a(intExtra);
            }
        }
    }
}
