package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.core.C0558m;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkTools {

    /* renamed from: a */
    private static int f3269a = 0;

    /* renamed from: b */
    private static long f3270b = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f3271c = new AtomicBoolean(false);

    /* renamed from: a */
    public static int m4451a(Context context, boolean z) {
        if (z || f3270b == -2147483648L) {
            m4458e(context);
            return f3269a;
        }
        if (System.currentTimeMillis() - f3270b >= 60000) {
            m4455c();
        }
        return f3269a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m4455c() {
        if (f3271c.compareAndSet(false, true)) {
            C0995t.m4607a(new C10618g("getNetworkType") {
                public void run() {
                    NetworkTools.m4458e(C0558m.m2663a());
                    NetworkTools.f3271c.set(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static int m4450a(Context context) {
        return m4451a(context, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m4458e(Context context) {
        f3269a = C10642o.m31260c(context);
        f3270b = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static int m4453b(Context context) {
        int a = m4450a(context);
        if (a == 1) {
            return 0;
        }
        if (a == 4) {
            return 1;
        }
        if (a == 5) {
            return 4;
        }
        if (a != 6) {
            return a;
        }
        return 5;
    }

    /* renamed from: c */
    public static void m4456c(Context context) {
        if (context == null) {
            try {
                context = C0558m.m2663a();
            } catch (Throwable unused) {
                return;
            }
        }
        context.registerReceiver(new NetworkReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static class NetworkReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkTools.m4455c();
            }
        }
    }
}
