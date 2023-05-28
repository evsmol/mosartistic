package com.appnext.base.p264b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.appnext.base.b.g */
public class C8854g {

    /* renamed from: fs */
    private static C8854g f22438fs;
    private static Context mContext;

    /* renamed from: ft */
    private Handler f22439ft;

    /* renamed from: fu */
    private Handler f22440fu;

    /* renamed from: fv */
    private HandlerThread f22441fv;

    public C8854g() {
        try {
            this.f22439ft = new Handler(Looper.getMainLooper());
            HandlerThread handlerThread = new HandlerThread("ExecutesManagerWorkerThread");
            this.f22441fv = handlerThread;
            handlerThread.start();
            this.f22440fu = new Handler(this.f22441fv.getLooper());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aN */
    public static C8854g m26679aN() {
        if (f22438fs == null) {
            synchronized (C8854g.class) {
                if (f22438fs == null) {
                    f22438fs = new C8854g();
                }
            }
        }
        return f22438fs;
    }

    /* renamed from: a */
    public final void mo58746a(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f22439ft.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo58747a(Runnable runnable, long j) {
        if (runnable != null) {
            try {
                this.f22439ft.postDelayed(runnable, j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo58748b(Runnable runnable) {
        try {
            this.f22440fu.post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo58749b(Runnable runnable, long j) {
        if (runnable != null) {
            try {
                this.f22440fu.postDelayed(runnable, j);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            this.f22440fu.removeCallbacks((Runnable) null);
            this.f22441fv.quit();
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
