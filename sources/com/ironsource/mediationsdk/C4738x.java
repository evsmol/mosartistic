package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C4429f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.x */
public final class C4738x {

    /* renamed from: a */
    C4613c f12017a;

    /* renamed from: b */
    private Runnable f12018b;

    /* renamed from: c */
    private int f12019c = 0;

    /* renamed from: d */
    private C4429f f12020d;

    public C4738x(int i, C4613c cVar) {
        this.f12017a = cVar;
        this.f12019c = i;
        this.f12018b = new Runnable() {
            public final void run() {
                IronLog.INTERNAL.verbose("loaded ads are expired");
                if (C4738x.this.f12017a != null) {
                    C4738x.this.f12017a.mo33397c_();
                }
            }
        };
    }

    /* renamed from: b */
    private boolean m13903b() {
        return this.f12019c > 0;
    }

    /* renamed from: a */
    public final void mo34226a() {
        if (m13903b() && this.f12020d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.f12020d.mo33248c();
            this.f12020d = null;
        }
    }

    /* renamed from: a */
    public final void mo34227a(long j) {
        if (m13903b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f12019c) - Math.max(j, 0);
            if (millis > 0) {
                mo34226a();
                this.f12020d = new C4429f(millis, this.f12018b, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.f12017a.mo33397c_();
        }
    }
}
