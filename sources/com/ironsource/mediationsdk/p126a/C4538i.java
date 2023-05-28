package com.ironsource.mediationsdk.p126a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C4642c;

/* renamed from: com.ironsource.mediationsdk.a.i */
public final class C4538i extends Thread {

    /* renamed from: b */
    private static C4538i f11134b;

    /* renamed from: a */
    private C4539a f11135a;

    /* renamed from: com.ironsource.mediationsdk.a.i$a */
    class C4539a extends HandlerThread {

        /* renamed from: a */
        Handler f11136a;

        C4539a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C4642c());
        }
    }

    private C4538i() {
        C4539a aVar = new C4539a(getClass().getSimpleName());
        this.f11135a = aVar;
        aVar.start();
        C4539a aVar2 = this.f11135a;
        aVar2.f11136a = new Handler(aVar2.getLooper());
    }

    /* renamed from: a */
    public static synchronized C4538i m13199a() {
        C4538i iVar;
        synchronized (C4538i.class) {
            if (f11134b == null) {
                f11134b = new C4538i();
            }
            iVar = f11134b;
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33674a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.i$a r0 = r1.f11135a     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            com.ironsource.mediationsdk.a.i$a r0 = r1.f11135a     // Catch:{ all -> 0x0012 }
            android.os.Handler r0 = r0.f11136a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r0.post(r2)     // Catch:{ all -> 0x0012 }
        L_0x0010:
            monitor-exit(r1)
            return
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p126a.C4538i.mo33674a(java.lang.Runnable):void");
    }
}
