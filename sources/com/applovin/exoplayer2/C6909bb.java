package com.applovin.exoplayer2;

import android.content.Context;
import android.os.PowerManager;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.bb */
final class C6909bb {

    /* renamed from: a */
    private final PowerManager f15288a;

    /* renamed from: b */
    private PowerManager.WakeLock f15289b;

    /* renamed from: c */
    private boolean f15290c;

    /* renamed from: d */
    private boolean f15291d;

    public C6909bb(Context context) {
        this.f15288a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    private void m18401a() {
        PowerManager.WakeLock wakeLock = this.f15289b;
        if (wakeLock != null) {
            if (!this.f15290c || !this.f15291d) {
                this.f15289b.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    /* renamed from: a */
    public void mo53112a(boolean z) {
        if (z && this.f15289b == null) {
            PowerManager powerManager = this.f15288a;
            if (powerManager == null) {
                C7755q.m22361c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f15289b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f15290c = z;
        m18401a();
    }

    /* renamed from: b */
    public void mo53113b(boolean z) {
        this.f15291d = z;
        m18401a();
    }
}
