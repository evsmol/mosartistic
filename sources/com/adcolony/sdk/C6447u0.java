package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C6288e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.u0 */
class C6447u0 {

    /* renamed from: a */
    private final ScheduledExecutorService f13865a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f13866b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledFuture<?> f13867c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6431t0 f13868d;

    /* renamed from: com.adcolony.sdk.u0$a */
    class C6448a implements Runnable {
        C6448a() {
        }

        public void run() {
            ScheduledFuture unused = C6447u0.this.f13866b = null;
            C6447u0.this.m15780e();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$b */
    class C6449b implements Runnable {
        C6449b() {
        }

        public void run() {
            if (C6447u0.this.f13868d.mo51019g()) {
                C6185a.m14887b().mo50807r().mo50753i();
                ScheduledFuture unused = C6447u0.this.f13867c = null;
            }
        }
    }

    C6447u0(C6431t0 t0Var) {
        this.f13868d = t0Var;
    }

    /* renamed from: d */
    private void m15779d() {
        if (this.f13866b == null) {
            try {
                this.f13866b = this.f13865a.schedule(new C6448a(), this.f13868d.mo51005a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C6288e0.C6289a().mo50644a("RejectedExecutionException when scheduling session stop ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m15780e() {
        new C6288e0.C6289a().mo50644a("AdColony session ending, releasing Context.").mo50645a(C6288e0.f13493d);
        C6185a.m14887b().mo50788c(true);
        C6185a.m14882a((Context) null);
        this.f13868d.mo51016f(true);
        this.f13868d.mo51018g(true);
        this.f13868d.mo51020j();
        if (C6185a.m14887b().mo50807r().mo50751f()) {
            ScheduledFuture<?> scheduledFuture = this.f13867c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f13867c.cancel(false);
            }
            try {
                this.f13867c = this.f13865a.schedule(new C6449b(), 10, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                new C6288e0.C6289a().mo50644a("RejectedExecutionException when scheduling message pumping stop ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo51039c() {
        m15775a();
    }

    /* renamed from: a */
    private void m15775a() {
        ScheduledFuture<?> scheduledFuture = this.f13866b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f13866b.cancel(false);
            this.f13866b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51038b() {
        m15779d();
    }
}
