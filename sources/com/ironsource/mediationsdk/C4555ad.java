package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.C4714c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.ad */
public final class C4555ad {

    /* renamed from: a */
    C4598ae f11178a;

    /* renamed from: b */
    private C4714c f11179b;

    /* renamed from: c */
    private Timer f11180c = null;

    public C4555ad(C4714c cVar, C4598ae aeVar) {
        this.f11179b = cVar;
        this.f11178a = aeVar;
    }

    /* renamed from: e */
    private void m13263e() {
        Timer timer = this.f11180c;
        if (timer != null) {
            timer.cancel();
            this.f11180c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo33712a() {
        if (this.f11179b.f11785m) {
            m13263e();
            Timer timer = new Timer();
            this.f11180c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4555ad.this.f11178a.mo33398d();
                }
            }, this.f11179b.f11783k);
        }
    }

    /* renamed from: b */
    public final synchronized void mo33713b() {
        if (!this.f11179b.f11785m) {
            m13263e();
            Timer timer = new Timer();
            this.f11180c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4555ad.this.f11178a.mo33398d();
                }
            }, this.f11179b.f11783k);
        }
    }

    /* renamed from: c */
    public final void mo33714c() {
        synchronized (this) {
            m13263e();
        }
        this.f11178a.mo33398d();
    }

    /* renamed from: d */
    public final synchronized void mo33715d() {
        m13263e();
        Timer timer = new Timer();
        this.f11180c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C4555ad.this.f11178a.mo33398d();
            }
        }, this.f11179b.f11782j);
    }
}
