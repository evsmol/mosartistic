package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayDeque;

/* renamed from: com.applovin.exoplayer2.f.c */
final class C7372c extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f16841a = new Object();

    /* renamed from: b */
    private final HandlerThread f16842b;

    /* renamed from: c */
    private Handler f16843c;

    /* renamed from: d */
    private final C7375f f16844d;

    /* renamed from: e */
    private final C7375f f16845e;

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f16846f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f16847g;

    /* renamed from: h */
    private MediaFormat f16848h;

    /* renamed from: i */
    private MediaFormat f16849i;

    /* renamed from: j */
    private MediaCodec.CodecException f16850j;

    /* renamed from: k */
    private long f16851k;

    /* renamed from: l */
    private boolean f16852l;

    /* renamed from: m */
    private IllegalStateException f16853m;

    C7372c(HandlerThread handlerThread) {
        this.f16842b = handlerThread;
        this.f16844d = new C7375f();
        this.f16845e = new C7375f();
        this.f16846f = new ArrayDeque<>();
        this.f16847g = new ArrayDeque<>();
    }

    /* renamed from: a */
    private void m20364a(MediaFormat mediaFormat) {
        this.f16845e.mo54155a(-2);
        this.f16847g.add(mediaFormat);
    }

    /* renamed from: a */
    private void m20365a(IllegalStateException illegalStateException) {
        synchronized (this.f16841a) {
            this.f16853m = illegalStateException;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m20369d(Runnable runnable) {
        synchronized (this.f16841a) {
            m20367c(runnable);
        }
    }

    /* renamed from: c */
    private void m20367c(Runnable runnable) {
        if (!this.f16852l) {
            long j = this.f16851k - 1;
            this.f16851k = j;
            if (j <= 0) {
                if (j < 0) {
                    m20365a(new IllegalStateException());
                    return;
                }
                m20368d();
                try {
                    runnable.run();
                } catch (IllegalStateException e) {
                    m20365a(e);
                } catch (Exception e2) {
                    m20365a(new IllegalStateException(e2));
                }
            }
        }
    }

    /* renamed from: d */
    private void m20368d() {
        if (!this.f16847g.isEmpty()) {
            this.f16849i = this.f16847g.getLast();
        }
        this.f16844d.mo54157c();
        this.f16845e.mo54157c();
        this.f16846f.clear();
        this.f16847g.clear();
        this.f16850j = null;
    }

    /* renamed from: e */
    private boolean m20370e() {
        return this.f16851k > 0 || this.f16852l;
    }

    /* renamed from: f */
    private void m20371f() {
        m20372g();
        m20373h();
    }

    /* renamed from: g */
    private void m20372g() {
        IllegalStateException illegalStateException = this.f16853m;
        if (illegalStateException != null) {
            this.f16853m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: h */
    private void m20373h() {
        MediaCodec.CodecException codecException = this.f16850j;
        if (codecException != null) {
            this.f16850j = null;
            throw codecException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo54135a(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f16841a
            monitor-enter(r0)
            boolean r1 = r9.m20370e()     // Catch:{ all -> 0x004a }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            r9.m20371f()     // Catch:{ all -> 0x004a }
            com.applovin.exoplayer2.f.f r1 = r9.f16845e     // Catch:{ all -> 0x004a }
            boolean r1 = r1.mo54156b()     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0019:
            com.applovin.exoplayer2.f.f r1 = r9.f16845e     // Catch:{ all -> 0x004a }
            int r1 = r1.mo54154a()     // Catch:{ all -> 0x004a }
            if (r1 < 0) goto L_0x003b
            android.media.MediaFormat r2 = r9.f16848h     // Catch:{ all -> 0x004a }
            com.applovin.exoplayer2.p221l.C7717a.m22115a(r2)     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f16846f     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004a }
            int r4 = r2.offset     // Catch:{ all -> 0x004a }
            int r5 = r2.size     // Catch:{ all -> 0x004a }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004a }
            int r8 = r2.flags     // Catch:{ all -> 0x004a }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x003b:
            r10 = -2
            if (r1 != r10) goto L_0x0048
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f16847g     // Catch:{ all -> 0x004a }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004a }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004a }
            r9.f16848h = r10     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x004a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7372c.mo54135a(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: a */
    public void mo54136a() {
        synchronized (this.f16841a) {
            this.f16852l = true;
            this.f16842b.quit();
            m20368d();
        }
    }

    /* renamed from: a */
    public void mo54137a(MediaCodec mediaCodec) {
        C7717a.m22121b(this.f16843c == null);
        this.f16842b.start();
        Handler handler = new Handler(this.f16842b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f16843c = handler;
    }

    /* renamed from: a */
    public void mo54138a(Runnable runnable) {
        synchronized (this.f16841a) {
            this.f16851k++;
            ((Handler) C7728ai.m22198a(this.f16843c)).post(new Runnable(runnable) {
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7372c.this.m20369d(this.f$1);
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo54139b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16841a
            monitor-enter(r0)
            boolean r1 = r3.m20370e()     // Catch:{ all -> 0x0020 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000c:
            r3.m20371f()     // Catch:{ all -> 0x0020 }
            com.applovin.exoplayer2.f.f r1 = r3.f16844d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo54156b()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            com.applovin.exoplayer2.f.f r1 = r3.f16844d     // Catch:{ all -> 0x0020 }
            int r2 = r1.mo54154a()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7372c.mo54139b():int");
    }

    /* renamed from: c */
    public MediaFormat mo54140c() {
        MediaFormat mediaFormat;
        synchronized (this.f16841a) {
            if (this.f16848h != null) {
                mediaFormat = this.f16848h;
            } else {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f16841a) {
            this.f16850j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f16841a) {
            this.f16844d.mo54155a(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f16841a) {
            if (this.f16849i != null) {
                m20364a(this.f16849i);
                this.f16849i = null;
            }
            this.f16845e.mo54155a(i);
            this.f16846f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f16841a) {
            m20364a(mediaFormat);
            this.f16849i = null;
        }
    }
}
