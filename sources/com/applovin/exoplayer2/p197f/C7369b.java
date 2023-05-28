package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p182c.C6916c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7735g;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.exoplayer2.f.b */
class C7369b {

    /* renamed from: a */
    private static final ArrayDeque<C7371a> f16825a = new ArrayDeque<>();

    /* renamed from: b */
    private static final Object f16826b = new Object();

    /* renamed from: c */
    private final MediaCodec f16827c;

    /* renamed from: d */
    private final HandlerThread f16828d;

    /* renamed from: e */
    private Handler f16829e;

    /* renamed from: f */
    private final AtomicReference<RuntimeException> f16830f;

    /* renamed from: g */
    private final C7735g f16831g;

    /* renamed from: h */
    private final boolean f16832h;

    /* renamed from: i */
    private boolean f16833i;

    /* renamed from: com.applovin.exoplayer2.f.b$a */
    private static class C7371a {

        /* renamed from: a */
        public int f16835a;

        /* renamed from: b */
        public int f16836b;

        /* renamed from: c */
        public int f16837c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f16838d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f16839e;

        /* renamed from: f */
        public int f16840f;

        C7371a() {
        }

        /* renamed from: a */
        public void mo54134a(int i, int i2, int i3, long j, int i4) {
            this.f16835a = i;
            this.f16836b = i2;
            this.f16837c = i3;
            this.f16839e = j;
            this.f16840f = i4;
        }
    }

    public C7369b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new C7735g());
    }

    C7369b(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, C7735g gVar) {
        this.f16827c = mediaCodec;
        this.f16828d = handlerThread;
        this.f16831g = gVar;
        this.f16830f = new AtomicReference<>();
        this.f16832h = z || m20355i();
    }

    /* renamed from: a */
    private void m20343a(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (this.f16832h) {
                synchronized (f16826b) {
                    this.f16827c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                }
                return;
            }
            this.f16827c.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
        } catch (RuntimeException e) {
            mo54129a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20344a(Message message) {
        C7371a aVar;
        int i = message.what;
        if (i == 0) {
            aVar = (C7371a) message.obj;
            m20350b(aVar.f16835a, aVar.f16836b, aVar.f16837c, aVar.f16839e, aVar.f16840f);
        } else if (i != 1) {
            if (i != 2) {
                mo54129a((RuntimeException) new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f16831g.mo54992a();
            }
            aVar = null;
        } else {
            aVar = (C7371a) message.obj;
            m20343a(aVar.f16835a, aVar.f16836b, aVar.f16838d, aVar.f16839e, aVar.f16840f);
        }
        if (aVar != null) {
            m20346a(aVar);
        }
    }

    /* renamed from: a */
    private static void m20345a(C6916c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f15313f;
        cryptoInfo.numBytesOfClearData = m20349a(cVar.f15311d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m20349a(cVar.f15312e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C7717a.m22120b(m20348a(cVar.f15309b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C7717a.m22120b(m20348a(cVar.f15308a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f15310c;
        if (C7728ai.f18249a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f15314g, cVar.f15315h));
        }
    }

    /* renamed from: a */
    private static void m20346a(C7371a aVar) {
        synchronized (f16825a) {
            f16825a.add(aVar);
        }
    }

    /* renamed from: a */
    private static byte[] m20348a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private static int[] m20349a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: b */
    private void m20350b(int i, int i2, int i3, long j, int i4) {
        try {
            this.f16827c.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            mo54129a(e);
        }
    }

    /* renamed from: e */
    private void m20351e() {
        RuntimeException andSet = this.f16830f.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: f */
    private void m20352f() throws InterruptedException {
        ((Handler) C7728ai.m22198a(this.f16829e)).removeCallbacksAndMessages((Object) null);
        m20353g();
        m20351e();
    }

    /* renamed from: g */
    private void m20353g() throws InterruptedException {
        this.f16831g.mo54993b();
        ((Handler) C7728ai.m22198a(this.f16829e)).obtainMessage(2).sendToTarget();
        this.f16831g.mo54994c();
    }

    /* renamed from: h */
    private static C7371a m20354h() {
        synchronized (f16825a) {
            if (f16825a.isEmpty()) {
                C7371a aVar = new C7371a();
                return aVar;
            }
            C7371a removeFirst = f16825a.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: i */
    private static boolean m20355i() {
        String lowerCase = Ascii.toLowerCase(C7728ai.f18251c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    /* renamed from: a */
    public void mo54126a() {
        if (!this.f16833i) {
            this.f16828d.start();
            this.f16829e = new Handler(this.f16828d.getLooper()) {
                public void handleMessage(Message message) {
                    C7369b.this.m20344a(message);
                }
            };
            this.f16833i = true;
        }
    }

    /* renamed from: a */
    public void mo54127a(int i, int i2, int i3, long j, int i4) {
        m20351e();
        C7371a h = m20354h();
        h.mo54134a(i, i2, i3, j, i4);
        ((Handler) C7728ai.m22198a(this.f16829e)).obtainMessage(0, h).sendToTarget();
    }

    /* renamed from: a */
    public void mo54128a(int i, int i2, C6916c cVar, long j, int i3) {
        m20351e();
        C7371a h = m20354h();
        h.mo54134a(i, i2, 0, j, i3);
        m20345a(cVar, h.f16838d);
        ((Handler) C7728ai.m22198a(this.f16829e)).obtainMessage(1, h).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54129a(RuntimeException runtimeException) {
        this.f16830f.set(runtimeException);
    }

    /* renamed from: b */
    public void mo54130b() {
        if (this.f16833i) {
            try {
                m20352f();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public void mo54131c() {
        if (this.f16833i) {
            mo54130b();
            this.f16828d.quit();
        }
        this.f16833i = false;
    }

    /* renamed from: d */
    public void mo54132d() throws InterruptedException {
        m20353g();
    }
}
