package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C10638l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C10409a> f25872a;

    public void onReceive(Context context, Intent intent) {
        C10638l.m31235b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C10409a> weakReference = this.f25872a;
            if (weakReference != null && weakReference.get() != null) {
                ((C10409a) this.f25872a.get()).mo1995b(intExtra);
            }
        }
    }

    /* renamed from: a */
    public void mo63708a(C10409a aVar) {
        this.f25872a = new WeakReference<>(aVar);
    }
}
