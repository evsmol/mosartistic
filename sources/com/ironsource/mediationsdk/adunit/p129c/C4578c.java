package com.ironsource.mediationsdk.adunit.p129c;

import com.ironsource.mediationsdk.C4598ae;
import com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.adunit.c.c */
public final class C4578c {

    /* renamed from: a */
    C4576a f11270a;

    /* renamed from: b */
    C4598ae f11271b;

    /* renamed from: c */
    private Timer f11272c;

    public C4578c(C4576a aVar, C4598ae aeVar) {
        this.f11270a = aVar;
        this.f11271b = aeVar;
    }

    /* renamed from: c */
    private void m13345c() {
        Timer timer = this.f11272c;
        if (timer != null) {
            timer.cancel();
            this.f11272c = null;
        }
    }

    /* renamed from: a */
    public final void mo33809a() {
        if (this.f11270a.f11262a != C4576a.C4577a.MANUAL) {
            mo33810a(this.f11270a.f11264c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33810a(long j) {
        m13345c();
        Timer timer = new Timer();
        this.f11272c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C4578c.this.f11271b.mo33398d();
            }
        }, j);
    }

    /* renamed from: b */
    public final void mo33811b() {
        if (this.f11270a.f11262a != C4576a.C4577a.MANUAL) {
            mo33810a(0);
        }
    }
}
