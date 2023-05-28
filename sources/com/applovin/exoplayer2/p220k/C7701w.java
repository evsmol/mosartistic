package com.applovin.exoplayer2.p220k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.applovin.exoplayer2.k.w */
public final class C7701w {

    /* renamed from: a */
    public static final C7704b f18175a = m22054a(false, -9223372036854775807L);

    /* renamed from: b */
    public static final C7704b f18176b = m22054a(true, -9223372036854775807L);

    /* renamed from: c */
    public static final C7704b f18177c = new C7704b(2, -9223372036854775807L);

    /* renamed from: d */
    public static final C7704b f18178d = new C7704b(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f18179e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7705c<? extends C7706d> f18180f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IOException f18181g;

    /* renamed from: com.applovin.exoplayer2.k.w$a */
    public interface C7703a<T extends C7706d> {
        /* renamed from: a */
        C7704b mo54566a(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo54569a(T t, long j, long j2);

        /* renamed from: a */
        void mo54570a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.applovin.exoplayer2.k.w$b */
    public static final class C7704b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f18182a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f18183b;

        private C7704b(int i, long j) {
            this.f18182a = i;
            this.f18183b = j;
        }

        /* renamed from: a */
        public boolean mo54940a() {
            int i = this.f18182a;
            return i == 0 || i == 1;
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.w$c */
    private final class C7705c<T extends C7706d> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f18184a;

        /* renamed from: c */
        private final T f18186c;

        /* renamed from: d */
        private final long f18187d;

        /* renamed from: e */
        private C7703a<T> f18188e;

        /* renamed from: f */
        private IOException f18189f;

        /* renamed from: g */
        private int f18190g;

        /* renamed from: h */
        private Thread f18191h;

        /* renamed from: i */
        private boolean f18192i;

        /* renamed from: j */
        private volatile boolean f18193j;

        public C7705c(Looper looper, T t, C7703a<T> aVar, int i, long j) {
            super(looper);
            this.f18186c = t;
            this.f18188e = aVar;
            this.f18184a = i;
            this.f18187d = j;
        }

        /* renamed from: a */
        private void m22072a() {
            this.f18189f = null;
            C7701w.this.f18179e.execute((Runnable) C7717a.m22120b(C7701w.this.f18180f));
        }

        /* renamed from: b */
        private void m22073b() {
            C7705c unused = C7701w.this.f18180f = null;
        }

        /* renamed from: c */
        private long m22074c() {
            return (long) Math.min((this.f18190g - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void mo54941a(int i) throws IOException {
            IOException iOException = this.f18189f;
            if (iOException != null && this.f18190g > i) {
                throw iOException;
            }
        }

        /* renamed from: a */
        public void mo54942a(long j) {
            C7717a.m22121b(C7701w.this.f18180f == null);
            C7705c unused = C7701w.this.f18180f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m22072a();
            }
        }

        /* renamed from: a */
        public void mo54943a(boolean z) {
            this.f18193j = z;
            this.f18189f = null;
            if (hasMessages(0)) {
                this.f18192i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f18192i = true;
                    this.f18186c.mo54578a();
                    Thread thread = this.f18191h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m22073b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((C7703a) C7717a.m22120b(this.f18188e)).mo54570a(this.f18186c, elapsedRealtime, elapsedRealtime - this.f18187d, true);
                this.f18188e = null;
            }
        }

        public void handleMessage(Message message) {
            if (!this.f18193j) {
                if (message.what == 0) {
                    m22072a();
                } else if (message.what != 3) {
                    m22073b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f18187d;
                    C7703a aVar = (C7703a) C7717a.m22120b(this.f18188e);
                    if (this.f18192i) {
                        aVar.mo54570a(this.f18186c, elapsedRealtime, j, false);
                        return;
                    }
                    int i = message.what;
                    if (i == 1) {
                        try {
                            aVar.mo54569a(this.f18186c, elapsedRealtime, j);
                        } catch (RuntimeException e) {
                            C7755q.m22362c("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = C7701w.this.f18181g = new C7709g(e);
                        }
                    } else if (i == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f18189f = iOException;
                        int i2 = this.f18190g + 1;
                        this.f18190g = i2;
                        C7704b a = aVar.mo54566a(this.f18186c, elapsedRealtime, j, iOException, i2);
                        if (a.f18182a == 3) {
                            IOException unused2 = C7701w.this.f18181g = this.f18189f;
                        } else if (a.f18182a != 2) {
                            if (a.f18182a == 1) {
                                this.f18190g = 1;
                            }
                            mo54942a(a.f18183b != -9223372036854775807L ? a.f18183b : m22074c());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            r0.sendToTarget();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                r0 = 2
                monitor-enter(r4)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                boolean r1 = r4.f18192i     // Catch:{ all -> 0x0052 }
                r2 = 1
                if (r1 != 0) goto L_0x0009
                r1 = 1
                goto L_0x000a
            L_0x0009:
                r1 = 0
            L_0x000a:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0052 }
                r4.f18191h = r3     // Catch:{ all -> 0x0052 }
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                if (r1 == 0) goto L_0x003f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1.<init>()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r3 = "load:"
                r1.append(r3)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                T r3 = r4.f18186c     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.Class r3 = r3.getClass()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1.append(r3)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                com.applovin.exoplayer2.p221l.C7727ah.m22175a(r1)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                T r1 = r4.f18186c     // Catch:{ all -> 0x003a }
                r1.mo54579b()     // Catch:{ all -> 0x003a }
                com.applovin.exoplayer2.p221l.C7727ah.m22174a()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                goto L_0x003f
            L_0x003a:
                r1 = move-exception
                com.applovin.exoplayer2.p221l.C7727ah.m22174a()     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x003f:
                monitor-enter(r4)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                r1 = 0
                r4.f18191h = r1     // Catch:{ all -> 0x004f }
                java.lang.Thread.interrupted()     // Catch:{ all -> 0x004f }
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                boolean r1 = r4.f18193j     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                if (r1 != 0) goto L_0x009f
                r4.sendEmptyMessage(r2)     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
                goto L_0x009f
            L_0x004f:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x0052:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0052 }
                throw r1     // Catch:{ IOException -> 0x0095, Exception -> 0x0083, OutOfMemoryError -> 0x006a, Error -> 0x0055 }
            L_0x0055:
                r0 = move-exception
                boolean r1 = r4.f18193j
                if (r1 != 0) goto L_0x0069
                java.lang.String r1 = "LoadTask"
                java.lang.String r2 = "Unexpected error loading stream"
                com.applovin.exoplayer2.p221l.C7755q.m22362c(r1, r2, r0)
                r1 = 3
                android.os.Message r1 = r4.obtainMessage(r1, r0)
                r1.sendToTarget()
            L_0x0069:
                throw r0
            L_0x006a:
                r1 = move-exception
                boolean r2 = r4.f18193j
                if (r2 != 0) goto L_0x009f
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "OutOfMemory error loading stream"
                com.applovin.exoplayer2.p221l.C7755q.m22362c(r2, r3, r1)
                com.applovin.exoplayer2.k.w$g r2 = new com.applovin.exoplayer2.k.w$g
                r2.<init>(r1)
            L_0x007b:
                android.os.Message r0 = r4.obtainMessage(r0, r2)
            L_0x007f:
                r0.sendToTarget()
                goto L_0x009f
            L_0x0083:
                r1 = move-exception
                boolean r2 = r4.f18193j
                if (r2 != 0) goto L_0x009f
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "Unexpected exception loading stream"
                com.applovin.exoplayer2.p221l.C7755q.m22362c(r2, r3, r1)
                com.applovin.exoplayer2.k.w$g r2 = new com.applovin.exoplayer2.k.w$g
                r2.<init>(r1)
                goto L_0x007b
            L_0x0095:
                r1 = move-exception
                boolean r2 = r4.f18193j
                if (r2 != 0) goto L_0x009f
                android.os.Message r0 = r4.obtainMessage(r0, r1)
                goto L_0x007f
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p220k.C7701w.C7705c.run():void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.w$d */
    public interface C7706d {
        /* renamed from: a */
        void mo54578a();

        /* renamed from: b */
        void mo54579b() throws IOException;
    }

    /* renamed from: com.applovin.exoplayer2.k.w$e */
    public interface C7707e {
        /* renamed from: h */
        void mo54575h();
    }

    /* renamed from: com.applovin.exoplayer2.k.w$f */
    private static final class C7708f implements Runnable {

        /* renamed from: a */
        private final C7707e f18194a;

        public C7708f(C7707e eVar) {
            this.f18194a = eVar;
        }

        public void run() {
            this.f18194a.mo54575h();
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.w$g */
    public static final class C7709g extends IOException {
        public C7709g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C7701w(String str) {
        this.f18179e = C7728ai.m22206a("ExoPlayer:Loader:" + str);
    }

    /* renamed from: a */
    public static C7704b m22054a(boolean z, long j) {
        return new C7704b(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public <T extends C7706d> long mo54933a(T t, C7703a<T> aVar, int i) {
        this.f18181g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C7705c((Looper) C7717a.m22115a(Looper.myLooper()), t, aVar, i, elapsedRealtime).mo54942a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public void mo54934a(int i) throws IOException {
        IOException iOException = this.f18181g;
        if (iOException == null) {
            C7705c<? extends C7706d> cVar = this.f18180f;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.f18184a;
                }
                cVar.mo54941a(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public void mo54935a(C7707e eVar) {
        C7705c<? extends C7706d> cVar = this.f18180f;
        if (cVar != null) {
            cVar.mo54943a(true);
        }
        if (eVar != null) {
            this.f18179e.execute(new C7708f(eVar));
        }
        this.f18179e.shutdown();
    }

    /* renamed from: a */
    public boolean mo54936a() {
        return this.f18181g != null;
    }

    /* renamed from: b */
    public void mo54937b() {
        this.f18181g = null;
    }

    /* renamed from: c */
    public boolean mo54938c() {
        return this.f18180f != null;
    }

    /* renamed from: d */
    public void mo54939d() {
        ((C7705c) C7717a.m22115a(this.f18180f)).mo54943a(false);
    }
}
