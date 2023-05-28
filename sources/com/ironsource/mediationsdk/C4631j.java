package com.ironsource.mediationsdk;

import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.j */
public final class C4631j {

    /* renamed from: b */
    private static C4631j f11501b;

    /* renamed from: a */
    int f11502a;

    /* renamed from: c */
    private long f11503c = 0;

    /* renamed from: d */
    private boolean f11504d = false;

    private C4631j() {
    }

    /* renamed from: a */
    public static synchronized C4631j m13569a() {
        C4631j jVar;
        synchronized (C4631j.class) {
            if (f11501b == null) {
                f11501b = new C4631j();
            }
            jVar = f11501b;
        }
        return jVar;
    }

    /* renamed from: a */
    public final void mo33932a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError) {
        synchronized (this) {
            if (!this.f11504d) {
                long currentTimeMillis = System.currentTimeMillis() - this.f11503c;
                if (currentTimeMillis > ((long) (this.f11502a * 1000))) {
                    mo33933b(ironSourceBannerLayout, ironSourceError);
                    return;
                }
                this.f11504d = true;
                long j = ((long) (this.f11502a * 1000)) - currentTimeMillis;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("delaying callback by " + j);
                C4401c cVar = C4401c.f10496a;
                C4401c.m12518b(new Runnable() {
                    public final void run() {
                        C4631j.this.mo33933b(ironSourceBannerLayout, ironSourceError);
                    }
                }, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33933b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        if (ironSourceBannerLayout != null) {
            this.f11503c = System.currentTimeMillis();
            this.f11504d = false;
            ironSourceBannerLayout.mo33417a(ironSourceError);
        }
    }

    /* renamed from: b */
    public final boolean mo33934b() {
        boolean z;
        synchronized (this) {
            z = this.f11504d;
        }
        return z;
    }
}
