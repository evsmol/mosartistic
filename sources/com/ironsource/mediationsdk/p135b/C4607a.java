package com.ironsource.mediationsdk.p135b;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.b.a */
public abstract class C4607a<T> {

    /* renamed from: a */
    protected T f11392a;

    /* renamed from: b */
    private Timer f11393b;

    /* renamed from: c */
    private long f11394c;

    public C4607a(long j) {
        this.f11394c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33870a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33871a(T t) {
        if (!(this.f11394c <= 0) && t != null) {
            this.f11392a = t;
            mo33872b();
            Timer timer = new Timer();
            this.f11393b = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4607a.this.mo33870a();
                }
            }, this.f11394c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33872b() {
        Timer timer = this.f11393b;
        if (timer != null) {
            timer.cancel();
            this.f11393b = null;
        }
    }

    /* renamed from: c */
    public final void mo33873c() {
        this.f11392a = null;
    }
}
