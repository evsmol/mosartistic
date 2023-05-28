package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.lifecycle.f */
public final class C4429f implements C4420c {

    /* renamed from: a */
    Runnable f10543a;

    /* renamed from: b */
    private String f10544b = "INTERNAL";

    /* renamed from: c */
    private Timer f10545c;

    /* renamed from: d */
    private boolean f10546d;

    /* renamed from: e */
    private Long f10547e;

    /* renamed from: f */
    private long f10548f;

    public C4429f(long j, Runnable runnable, boolean z) {
        this.f10548f = j;
        this.f10543a = runnable;
        this.f10546d = false;
        this.f10547e = null;
        if (0 == 0) {
            this.f10546d = true;
            C4421d.m12604a().mo33234a((C4420c) this);
            this.f10547e = Long.valueOf(System.currentTimeMillis() + this.f10548f);
            if (!C4421d.m12604a().mo33235b()) {
                m12613d();
            }
        }
    }

    /* renamed from: d */
    private void m12613d() {
        if (this.f10545c == null) {
            Timer timer = new Timer();
            this.f10545c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4429f.this.f10543a.run();
                }
            }, this.f10548f);
            Calendar.getInstance().setTimeInMillis(this.f10547e.longValue());
        }
    }

    /* renamed from: e */
    private void m12614e() {
        Timer timer = this.f10545c;
        if (timer != null) {
            timer.cancel();
            this.f10545c = null;
        }
    }

    /* renamed from: a */
    public final void mo33224a() {
        Long l;
        if (this.f10545c == null && (l = this.f10547e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f10548f = longValue;
            if (longValue <= 0) {
                mo33248c();
                this.f10543a.run();
                return;
            }
            m12613d();
        }
    }

    /* renamed from: b */
    public final void mo33225b() {
        if (this.f10545c != null) {
            m12614e();
        }
    }

    /* renamed from: c */
    public final void mo33248c() {
        m12614e();
        this.f10546d = false;
        this.f10547e = null;
        C4421d a = C4421d.m12604a();
        if (a.f10527g.contains(this)) {
            a.f10527g.remove(this);
        }
    }
}
