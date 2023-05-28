package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.p182c.C6916c;
import com.applovin.exoplayer2.p197f.C7366a;
import com.applovin.exoplayer2.p197f.C7376g;
import com.applovin.exoplayer2.p221l.C7727ah;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: com.applovin.exoplayer2.f.a */
final class C7366a implements C7376g {

    /* renamed from: a */
    private final MediaCodec f16814a;

    /* renamed from: b */
    private final C7372c f16815b;

    /* renamed from: c */
    private final C7369b f16816c;

    /* renamed from: d */
    private final boolean f16817d;

    /* renamed from: e */
    private boolean f16818e;

    /* renamed from: f */
    private int f16819f;

    /* renamed from: g */
    private Surface f16820g;

    /* renamed from: com.applovin.exoplayer2.f.a$a */
    public static final class C7368a implements C7376g.C7378b {

        /* renamed from: b */
        private final Supplier<HandlerThread> f16821b;

        /* renamed from: c */
        private final Supplier<HandlerThread> f16822c;

        /* renamed from: d */
        private final boolean f16823d;

        /* renamed from: e */
        private final boolean f16824e;

        public C7368a(int i, boolean z, boolean z2) {
            this(new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return C7366a.C7368a.m20340b(this.f$0);
                }
            }, new Supplier(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return C7366a.C7368a.m20339a(this.f$0);
                }
            }, z, z2);
        }

        C7368a(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z, boolean z2) {
            this.f16821b = supplier;
            this.f16822c = supplier2;
            this.f16823d = z;
            this.f16824e = z2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ HandlerThread m20339a(int i) {
            return new HandlerThread(C7366a.m20322g(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ HandlerThread m20340b(int i) {
            return new HandlerThread(C7366a.m20320f(i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.p197f.C7366a mo54125b(com.applovin.exoplayer2.p197f.C7376g.C7377a r12) throws java.io.IOException {
            /*
                r11 = this;
                com.applovin.exoplayer2.f.i r0 = r12.f16865a
                java.lang.String r0 = r0.f16875a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
                r2.<init>()     // Catch:{ Exception -> 0x0052 }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x0052 }
                r2.append(r0)     // Catch:{ Exception -> 0x0052 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0052 }
                com.applovin.exoplayer2.p221l.C7727ah.m22175a(r2)     // Catch:{ Exception -> 0x0052 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0052 }
                com.applovin.exoplayer2.f.a r10 = new com.applovin.exoplayer2.f.a     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier<android.os.HandlerThread> r2 = r11.f16821b     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r5 = r2
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.common.base.Supplier<android.os.HandlerThread> r2 = r11.f16822c     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0050 }
                r6 = r2
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0050 }
                boolean r7 = r11.f16823d     // Catch:{ Exception -> 0x0050 }
                boolean r8 = r11.f16824e     // Catch:{ Exception -> 0x0050 }
                r9 = 0
                r3 = r10
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0050 }
                com.applovin.exoplayer2.p221l.C7727ah.m22174a()     // Catch:{ Exception -> 0x004d }
                android.media.MediaFormat r3 = r12.f16866b     // Catch:{ Exception -> 0x004d }
                android.view.Surface r4 = r12.f16868d     // Catch:{ Exception -> 0x004d }
                android.media.MediaCrypto r5 = r12.f16869e     // Catch:{ Exception -> 0x004d }
                int r6 = r12.f16870f     // Catch:{ Exception -> 0x004d }
                boolean r7 = r12.f16871g     // Catch:{ Exception -> 0x004d }
                r2 = r10
                r2.m20315a((android.media.MediaFormat) r3, (android.view.Surface) r4, (android.media.MediaCrypto) r5, (int) r6, (boolean) r7)     // Catch:{ Exception -> 0x004d }
                return r10
            L_0x004d:
                r12 = move-exception
                r1 = r10
                goto L_0x0054
            L_0x0050:
                r12 = move-exception
                goto L_0x0054
            L_0x0052:
                r12 = move-exception
                r0 = r1
            L_0x0054:
                if (r1 != 0) goto L_0x005c
                if (r0 == 0) goto L_0x005f
                r0.release()
                goto L_0x005f
            L_0x005c:
                r1.mo54123e()
            L_0x005f:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7366a.C7368a.mo54125b(com.applovin.exoplayer2.f.g$a):com.applovin.exoplayer2.f.a");
        }
    }

    private C7366a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f16814a = mediaCodec;
        this.f16815b = new C7372c(handlerThread);
        this.f16816c = new C7369b(mediaCodec, handlerThread2, z);
        this.f16817d = z2;
        this.f16819f = 0;
    }

    /* renamed from: a */
    private static String m20314a(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            str2 = "Audio";
        } else if (i == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20315a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f16815b.mo54137a(this.f16814a);
        C7727ah.m22175a("configureCodec");
        this.f16814a.configure(mediaFormat, surface, mediaCrypto, i);
        C7727ah.m22174a();
        if (z) {
            this.f16820g = this.f16814a.createInputSurface();
        }
        this.f16816c.mo54126a();
        C7727ah.m22175a("startCodec");
        this.f16814a.start();
        C7727ah.m22174a();
        this.f16819f = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20317a(C7376g.C7379c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo54158a(this, j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m20320f(int i) {
        return m20314a(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: f */
    private void m20321f() {
        if (this.f16817d) {
            try {
                this.f16816c.mo54132d();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static String m20322g(int i) {
        return m20314a(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: a */
    public int mo54108a(MediaCodec.BufferInfo bufferInfo) {
        return this.f16815b.mo54135a(bufferInfo);
    }

    /* renamed from: a */
    public ByteBuffer mo54109a(int i) {
        return this.f16814a.getInputBuffer(i);
    }

    /* renamed from: a */
    public void mo54110a(int i, int i2, int i3, long j, int i4) {
        this.f16816c.mo54127a(i, i2, i3, j, i4);
    }

    /* renamed from: a */
    public void mo54111a(int i, int i2, C6916c cVar, long j, int i3) {
        this.f16816c.mo54128a(i, i2, cVar, j, i3);
    }

    /* renamed from: a */
    public void mo54112a(int i, long j) {
        this.f16814a.releaseOutputBuffer(i, j);
    }

    /* renamed from: a */
    public void mo54113a(int i, boolean z) {
        this.f16814a.releaseOutputBuffer(i, z);
    }

    /* renamed from: a */
    public void mo54114a(Bundle bundle) {
        m20321f();
        this.f16814a.setParameters(bundle);
    }

    /* renamed from: a */
    public void mo54115a(Surface surface) {
        m20321f();
        this.f16814a.setOutputSurface(surface);
    }

    /* renamed from: a */
    public void mo54116a(C7376g.C7379c cVar, Handler handler) {
        m20321f();
        this.f16814a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(cVar) {
            public final /* synthetic */ C7376g.C7379c f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C7366a.this.m20317a(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* renamed from: a */
    public boolean mo54117a() {
        return false;
    }

    /* renamed from: b */
    public int mo54118b() {
        return this.f16815b.mo54139b();
    }

    /* renamed from: b */
    public ByteBuffer mo54119b(int i) {
        return this.f16814a.getOutputBuffer(i);
    }

    /* renamed from: c */
    public MediaFormat mo54120c() {
        return this.f16815b.mo54140c();
    }

    /* renamed from: c */
    public void mo54121c(int i) {
        m20321f();
        this.f16814a.setVideoScalingMode(i);
    }

    /* renamed from: d */
    public void mo54122d() {
        this.f16816c.mo54130b();
        this.f16814a.flush();
        C7372c cVar = this.f16815b;
        MediaCodec mediaCodec = this.f16814a;
        Objects.requireNonNull(mediaCodec);
        cVar.mo54138a((Runnable) new Runnable(mediaCodec) {
            public final /* synthetic */ MediaCodec f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.start();
            }
        });
    }

    /* renamed from: e */
    public void mo54123e() {
        try {
            if (this.f16819f == 1) {
                this.f16816c.mo54131c();
                this.f16815b.mo54136a();
            }
            this.f16819f = 2;
        } finally {
            Surface surface = this.f16820g;
            if (surface != null) {
                surface.release();
            }
            if (!this.f16818e) {
                this.f16814a.release();
                this.f16818e = true;
            }
        }
    }
}
