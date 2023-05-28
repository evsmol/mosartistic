package com.applovin.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.bc */
final class C6910bc {

    /* renamed from: a */
    private final WifiManager f15292a;

    /* renamed from: b */
    private WifiManager.WifiLock f15293b;

    /* renamed from: c */
    private boolean f15294c;

    /* renamed from: d */
    private boolean f15295d;

    public C6910bc(Context context) {
        this.f15292a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    private void m18404a() {
        WifiManager.WifiLock wifiLock = this.f15293b;
        if (wifiLock != null) {
            if (!this.f15294c || !this.f15295d) {
                this.f15293b.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo53114a(boolean z) {
        if (z && this.f15293b == null) {
            WifiManager wifiManager = this.f15292a;
            if (wifiManager == null) {
                C7755q.m22361c("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f15293b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f15294c = z;
        m18404a();
    }

    /* renamed from: b */
    public void mo53115b(boolean z) {
        this.f15295d = z;
        m18404a();
    }
}
