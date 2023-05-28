package com.yandex.metrica.impl.p082ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.a */
public class C2782a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long f7292f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final C2784b f7293a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f7294b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Thread f7295c = new C2785c();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicBoolean f7296d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f7297e = new C2783a();

    /* renamed from: com.yandex.metrica.impl.ob.a$a */
    class C2783a implements Runnable {
        C2783a() {
        }

        public void run() {
            C2782a.this.f7296d.set(true);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$b */
    public interface C2784b {
        /* renamed from: a */
        void mo17134a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.a$c */
    private class C2785c extends Thread {
        public C2785c() {
        }

        public void run() {
            boolean z = false;
            int i = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C2782a.this.f7296d.set(false);
                    C2782a.this.f7294b.post(C2782a.this.f7297e);
                    i = 0;
                }
                try {
                    Thread.sleep(C2782a.f7292f);
                    if (!C2782a.this.f7296d.get()) {
                        i++;
                        if (i == 4 && !Debug.isDebuggerConnected()) {
                            C2782a.this.mo17131b();
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C2782a(C2784b bVar) {
        this.f7293a = bVar;
    }

    /* renamed from: b */
    public void mo17131b() {
        this.f7293a.mo17134a();
    }

    /* renamed from: c */
    public void mo17132c() {
        try {
            this.f7295c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f7295c.start();
    }
}
