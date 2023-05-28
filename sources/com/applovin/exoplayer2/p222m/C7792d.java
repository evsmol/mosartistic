package com.applovin.exoplayer2.p222m;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7738j;
import com.applovin.exoplayer2.p221l.C7747n;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.m.d */
public final class C7792d extends Surface {

    /* renamed from: b */
    private static int f18420b;

    /* renamed from: c */
    private static boolean f18421c;

    /* renamed from: a */
    public final boolean f18422a;

    /* renamed from: d */
    private final C7794a f18423d;

    /* renamed from: e */
    private boolean f18424e;

    /* renamed from: com.applovin.exoplayer2.m.d$a */
    private static class C7794a extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        private C7738j f18425a;

        /* renamed from: b */
        private Handler f18426b;

        /* renamed from: c */
        private Error f18427c;

        /* renamed from: d */
        private RuntimeException f18428d;

        /* renamed from: e */
        private C7792d f18429e;

        public C7794a() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: b */
        private void m22553b() {
            C7717a.m22120b(this.f18425a);
            this.f18425a.mo55002a();
        }

        /* renamed from: b */
        private void m22554b(int i) {
            C7717a.m22120b(this.f18425a);
            this.f18425a.mo55003a(i);
            this.f18429e = new C7792d(this, this.f18425a.mo55004b(), i != 0);
        }

        /* renamed from: a */
        public C7792d mo55153a(int i) {
            boolean z;
            start();
            this.f18426b = new Handler(getLooper(), this);
            this.f18425a = new C7738j(this.f18426b);
            synchronized (this) {
                z = false;
                this.f18426b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f18429e == null && this.f18428d == null && this.f18427c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f18428d;
            if (runtimeException == null) {
                Error error = this.f18427c;
                if (error == null) {
                    return (C7792d) C7717a.m22120b(this.f18429e);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: a */
        public void mo55154a() {
            C7717a.m22120b(this.f18426b);
            this.f18426b.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m22554b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C7755q.m22362c("DummySurface", "Failed to initialize dummy surface", e);
                    this.f18428d = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C7755q.m22362c("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f18427c = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    m22553b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private C7792d(C7794a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f18423d = aVar;
        this.f18422a = z;
    }

    /* renamed from: a */
    public static C7792d m22550a(Context context, boolean z) {
        int i = 0;
        C7717a.m22121b(!z || m22551a(context));
        C7794a aVar = new C7794a();
        if (z) {
            i = f18420b;
        }
        return aVar.mo55153a(i);
    }

    /* renamed from: a */
    public static synchronized boolean m22551a(Context context) {
        boolean z;
        synchronized (C7792d.class) {
            z = true;
            if (!f18421c) {
                f18420b = m22552b(context);
                f18421c = true;
            }
            if (f18420b == 0) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static int m22552b(Context context) {
        if (C7747n.m22328a(context)) {
            return C7747n.m22327a() ? 1 : 2;
        }
        return 0;
    }

    public void release() {
        super.release();
        synchronized (this.f18423d) {
            if (!this.f18424e) {
                this.f18423d.mo55154a();
                this.f18424e = true;
            }
        }
    }
}
