package com.bytedance.sdk.openadsdk.p048j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.j.b */
/* compiled from: CrashMonitor */
public class C0837b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScheduledExecutorService f3052a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0871g f3053b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f3054c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0839a f3055d;

    /* renamed from: com.bytedance.sdk.openadsdk.j.b$a */
    /* compiled from: CrashMonitor */
    public interface C0839a {
        /* renamed from: a */
        void mo2671a();
    }

    public C0837b(C0871g gVar) {
        this.f3053b = gVar;
    }

    /* renamed from: a */
    public void mo2669a(long j) {
        this.f3054c = j;
    }

    /* renamed from: a */
    public void mo2668a(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f3052a = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                if (System.currentTimeMillis() - C0837b.this.f3054c > 2000) {
                    C0837b.this.f3052a.shutdown();
                    if (C0837b.this.f3053b != null) {
                        C0837b.this.f3053b.mo2725t();
                    }
                    if (C0837b.this.f3055d != null) {
                        C0837b.this.f3055d.mo2671a();
                    }
                }
            }
        }, 0, (long) i, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo2667a() {
        ScheduledExecutorService scheduledExecutorService = this.f3052a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
