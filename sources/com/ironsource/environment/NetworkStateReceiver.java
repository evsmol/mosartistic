package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.ironsource.environment.p124e.C4401c;

public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private ConnectivityManager f10438a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4411j f10439b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f10440c = false;

    public NetworkStateReceiver(Context context, C4411j jVar) {
        this.f10439b = jVar;
        this.f10438a = (ConnectivityManager) context.getSystemService("connectivity");
        m12446a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12446a() {
        /*
            r4 = this;
            boolean r0 = r4.f10440c
            android.net.ConnectivityManager r1 = r4.f10438a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.isConnectedOrConnecting()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r4.f10440c = r1     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r4.f10440c = r3
        L_0x001c:
            boolean r1 = r4.f10440c
            if (r0 == r1) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.m12446a():boolean");
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null && m12446a()) {
            C4401c.m12518b(new Runnable() {
                public final void run() {
                    if (NetworkStateReceiver.this.f10439b != null) {
                        NetworkStateReceiver.this.f10439b.mo33217a(NetworkStateReceiver.this.f10440c);
                    }
                }
            }, 0);
        }
    }
}
