package com.applovin.exoplayer2.p181b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p181b.C6866h;
import com.applovin.exoplayer2.p181b.C6874j;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;
import com.appodeal.ads.modules.common.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.applovin.exoplayer2.b.n */
public final class C6879n implements C6866h {

    /* renamed from: a */
    public static boolean f15086a = false;

    /* renamed from: A */
    private long f15087A;

    /* renamed from: B */
    private long f15088B;

    /* renamed from: C */
    private long f15089C;

    /* renamed from: D */
    private long f15090D;

    /* renamed from: E */
    private int f15091E;

    /* renamed from: F */
    private boolean f15092F;

    /* renamed from: G */
    private boolean f15093G;

    /* renamed from: H */
    private long f15094H;

    /* renamed from: I */
    private float f15095I;

    /* renamed from: J */
    private C6861f[] f15096J;

    /* renamed from: K */
    private ByteBuffer[] f15097K;

    /* renamed from: L */
    private ByteBuffer f15098L;

    /* renamed from: M */
    private int f15099M;

    /* renamed from: N */
    private ByteBuffer f15100N;

    /* renamed from: O */
    private byte[] f15101O;

    /* renamed from: P */
    private int f15102P;

    /* renamed from: Q */
    private int f15103Q;

    /* renamed from: R */
    private boolean f15104R;

    /* renamed from: S */
    private boolean f15105S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f15106T;

    /* renamed from: U */
    private boolean f15107U;

    /* renamed from: V */
    private int f15108V;

    /* renamed from: W */
    private C6876k f15109W;

    /* renamed from: X */
    private boolean f15110X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public long f15111Y;

    /* renamed from: Z */
    private boolean f15112Z;

    /* renamed from: aa */
    private boolean f15113aa;

    /* renamed from: b */
    private final C6859e f15114b;

    /* renamed from: c */
    private final C6881a f15115c;

    /* renamed from: d */
    private final boolean f15116d;

    /* renamed from: e */
    private final C6878m f15117e;

    /* renamed from: f */
    private final C6902x f15118f;

    /* renamed from: g */
    private final C6861f[] f15119g;

    /* renamed from: h */
    private final C6861f[] f15120h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ConditionVariable f15121i;

    /* renamed from: j */
    private final C6874j f15122j;

    /* renamed from: k */
    private final ArrayDeque<C6885e> f15123k;

    /* renamed from: l */
    private final boolean f15124l;

    /* renamed from: m */
    private final int f15125m;

    /* renamed from: n */
    private C6888h f15126n;

    /* renamed from: o */
    private final C6886f<C6866h.C6868b> f15127o;

    /* renamed from: p */
    private final C6886f<C6866h.C6871e> f15128p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C6866h.C6869c f15129q;

    /* renamed from: r */
    private C6882b f15130r;

    /* renamed from: s */
    private C6882b f15131s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public AudioTrack f15132t;

    /* renamed from: u */
    private C6856d f15133u;

    /* renamed from: v */
    private C6885e f15134v;

    /* renamed from: w */
    private C6885e f15135w;

    /* renamed from: x */
    private C6813am f15136x;

    /* renamed from: y */
    private ByteBuffer f15137y;

    /* renamed from: z */
    private int f15138z;

    /* renamed from: com.applovin.exoplayer2.b.n$a */
    public interface C6881a {
        /* renamed from: a */
        long mo53016a(long j);

        /* renamed from: a */
        C6813am mo53017a(C6813am amVar);

        /* renamed from: a */
        boolean mo53018a(boolean z);

        /* renamed from: a */
        C6861f[] mo53019a();

        /* renamed from: b */
        long mo53020b();
    }

    /* renamed from: com.applovin.exoplayer2.b.n$b */
    private static final class C6882b {

        /* renamed from: a */
        public final C7864v f15141a;

        /* renamed from: b */
        public final int f15142b;

        /* renamed from: c */
        public final int f15143c;

        /* renamed from: d */
        public final int f15144d;

        /* renamed from: e */
        public final int f15145e;

        /* renamed from: f */
        public final int f15146f;

        /* renamed from: g */
        public final int f15147g;

        /* renamed from: h */
        public final int f15148h;

        /* renamed from: i */
        public final C6861f[] f15149i;

        public C6882b(C7864v vVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, C6861f[] fVarArr) {
            this.f15141a = vVar;
            this.f15142b = i;
            this.f15143c = i2;
            this.f15144d = i3;
            this.f15145e = i4;
            this.f15146f = i5;
            this.f15147g = i6;
            this.f15149i = fVarArr;
            this.f15148h = m18168a(i7, z);
        }

        /* renamed from: a */
        private int m18167a(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f15145e, this.f15146f, this.f15147g);
            C7717a.m22121b(minBufferSize != -2);
            int a = C7728ai.m22180a(minBufferSize * 4, ((int) mo53026c(250000)) * this.f15144d, Math.max(minBufferSize, ((int) mo53026c(750000)) * this.f15144d));
            return f != 1.0f ? Math.round(((float) a) * f) : a;
        }

        /* renamed from: a */
        private int m18168a(int i, boolean z) {
            long j;
            if (i != 0) {
                return i;
            }
            int i2 = this.f15143c;
            if (i2 != 0) {
                if (i2 == 1) {
                    j = 50000000;
                } else if (i2 == 2) {
                    j = 250000;
                } else {
                    throw new IllegalStateException();
                }
                return m18174d(j);
            }
            return m18167a(z ? 8.0f : 1.0f);
        }

        /* renamed from: a */
        private static AudioAttributes m18169a(C6856d dVar, boolean z) {
            return z ? m18171b() : dVar.mo52914a();
        }

        /* renamed from: a */
        private AudioTrack m18170a(C6856d dVar, int i) {
            int g = C7728ai.m22262g(dVar.f15003d);
            int i2 = this.f15145e;
            int i3 = this.f15146f;
            int i4 = this.f15147g;
            int i5 = this.f15148h;
            if (i == 0) {
                return r0;
            }
            AudioTrack audioTrack = new AudioTrack(g, i2, i3, i4, i5, 1, i);
            return audioTrack;
        }

        /* renamed from: b */
        private static AudioAttributes m18171b() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: b */
        private AudioTrack m18172b(boolean z, C6856d dVar, int i) {
            return C7728ai.f18249a >= 29 ? m18173c(z, dVar, i) : C7728ai.f18249a >= 21 ? m18175d(z, dVar, i) : m18170a(dVar, i);
        }

        /* renamed from: c */
        private AudioTrack m18173c(boolean z, C6856d dVar, int i) {
            AudioFormat a = C6879n.m18106b(this.f15145e, this.f15146f, this.f15147g);
            AudioAttributes a2 = m18169a(dVar, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(a2).setAudioFormat(a).setTransferMode(1).setBufferSizeInBytes(this.f15148h).setSessionId(i);
            if (this.f15143c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        }

        /* renamed from: d */
        private int m18174d(long j) {
            int b = C6879n.m18121f(this.f15147g);
            if (this.f15147g == 5) {
                b *= 2;
            }
            return (int) ((j * ((long) b)) / 1000000);
        }

        /* renamed from: d */
        private AudioTrack m18175d(boolean z, C6856d dVar, int i) {
            return new AudioTrack(m18169a(dVar, z), C6879n.m18106b(this.f15145e, this.f15146f, this.f15147g), this.f15148h, 1, i);
        }

        /* renamed from: a */
        public long mo53021a(long j) {
            return (j * 1000000) / ((long) this.f15141a.f18935z);
        }

        /* renamed from: a */
        public AudioTrack mo53022a(boolean z, C6856d dVar, int i) throws C6866h.C6868b {
            try {
                AudioTrack b = m18172b(z, dVar, i);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                throw new C6866h.C6868b(state, this.f15145e, this.f15146f, this.f15148h, this.f15141a, mo53023a(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new C6866h.C6868b(0, this.f15145e, this.f15146f, this.f15148h, this.f15141a, mo53023a(), e);
            }
        }

        /* renamed from: a */
        public boolean mo53023a() {
            return this.f15143c == 1;
        }

        /* renamed from: a */
        public boolean mo53024a(C6882b bVar) {
            return bVar.f15143c == this.f15143c && bVar.f15147g == this.f15147g && bVar.f15145e == this.f15145e && bVar.f15146f == this.f15146f && bVar.f15144d == this.f15144d;
        }

        /* renamed from: b */
        public long mo53025b(long j) {
            return (j * 1000000) / ((long) this.f15145e);
        }

        /* renamed from: c */
        public long mo53026c(long j) {
            return (j * ((long) this.f15145e)) / 1000000;
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$c */
    public static class C6883c implements C6881a {

        /* renamed from: a */
        private final C6861f[] f15150a;

        /* renamed from: b */
        private final C6899u f15151b;

        /* renamed from: c */
        private final C6901w f15152c;

        public C6883c(C6861f... fVarArr) {
            this(fVarArr, new C6899u(), new C6901w());
        }

        public C6883c(C6861f[] fVarArr, C6899u uVar, C6901w wVar) {
            C6861f[] fVarArr2 = new C6861f[(fVarArr.length + 2)];
            this.f15150a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f15151b = uVar;
            this.f15152c = wVar;
            C6861f[] fVarArr3 = this.f15150a;
            fVarArr3[fVarArr.length] = uVar;
            fVarArr3[fVarArr.length + 1] = wVar;
        }

        /* renamed from: a */
        public long mo53016a(long j) {
            return this.f15152c.mo53069a(j);
        }

        /* renamed from: a */
        public C6813am mo53017a(C6813am amVar) {
            this.f15152c.mo53070a(amVar.f14832b);
            this.f15152c.mo53071b(amVar.f14833c);
            return amVar;
        }

        /* renamed from: a */
        public boolean mo53018a(boolean z) {
            this.f15151b.mo53061a(z);
            return z;
        }

        /* renamed from: a */
        public C6861f[] mo53019a() {
            return this.f15150a;
        }

        /* renamed from: b */
        public long mo53020b() {
            return this.f15151b.mo53062k();
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$d */
    public static final class C6884d extends RuntimeException {
        private C6884d(String str) {
            super(str);
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$e */
    private static final class C6885e {

        /* renamed from: a */
        public final C6813am f15153a;

        /* renamed from: b */
        public final boolean f15154b;

        /* renamed from: c */
        public final long f15155c;

        /* renamed from: d */
        public final long f15156d;

        private C6885e(C6813am amVar, boolean z, long j, long j2) {
            this.f15153a = amVar;
            this.f15154b = z;
            this.f15155c = j;
            this.f15156d = j2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$f */
    private static final class C6886f<T extends Exception> {

        /* renamed from: a */
        private final long f15157a;

        /* renamed from: b */
        private T f15158b;

        /* renamed from: c */
        private long f15159c;

        public C6886f(long j) {
            this.f15157a = j;
        }

        /* renamed from: a */
        public void mo53027a() {
            this.f15158b = null;
        }

        /* renamed from: a */
        public void mo53028a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f15158b == null) {
                this.f15158b = t;
                this.f15159c = this.f15157a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f15159c) {
                T t2 = this.f15158b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f15158b;
                mo53027a();
                throw t3;
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$g */
    private final class C6887g implements C6874j.C6875a {
        private C6887g() {
        }

        /* renamed from: a */
        public void mo53000a(int i, long j) {
            if (C6879n.this.f15129q != null) {
                C6879n.this.f15129q.mo52971a(i, j, SystemClock.elapsedRealtime() - C6879n.this.f15111Y);
            }
        }

        /* renamed from: a */
        public void mo53001a(long j) {
            if (C6879n.this.f15129q != null) {
                C6879n.this.f15129q.mo52972a(j);
            }
        }

        /* renamed from: a */
        public void mo53002a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C6879n.this.m18136z() + ", " + C6879n.this.m18089A();
            if (!C6879n.f15086a) {
                C7755q.m22361c("DefaultAudioSink", str);
                return;
            }
            throw new C6884d(str);
        }

        /* renamed from: b */
        public void mo53003b(long j) {
            C7755q.m22361c("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        /* renamed from: b */
        public void mo53004b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C6879n.this.m18136z() + ", " + C6879n.this.m18089A();
            if (!C6879n.f15086a) {
                C7755q.m22361c("DefaultAudioSink", str);
                return;
            }
            throw new C6884d(str);
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.n$h */
    private final class C6888h {

        /* renamed from: b */
        private final Handler f15162b = new Handler();

        /* renamed from: c */
        private final AudioTrack.StreamEventCallback f15163c;

        public C6888h() {
            this.f15163c = new AudioTrack.StreamEventCallback(C6879n.this) {
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    C7717a.m22121b(audioTrack == C6879n.this.f15132t);
                    if (C6879n.this.f15129q != null && C6879n.this.f15106T) {
                        C6879n.this.f15129q.mo52975b();
                    }
                }

                public void onTearDown(AudioTrack audioTrack) {
                    C7717a.m22121b(audioTrack == C6879n.this.f15132t);
                    if (C6879n.this.f15129q != null && C6879n.this.f15106T) {
                        C6879n.this.f15129q.mo52975b();
                    }
                }
            };
        }

        /* renamed from: a */
        public void mo53029a(AudioTrack audioTrack) {
            Handler handler = this.f15162b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor(handler) {
                public final /* synthetic */ Handler f$0;

                {
                    this.f$0 = r1;
                }

                public final void execute(Runnable runnable) {
                    this.f$0.post(runnable);
                }
            }, this.f15163c);
        }

        /* renamed from: b */
        public void mo53030b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f15163c);
            this.f15162b.removeCallbacksAndMessages((Object) null);
        }
    }

    public C6879n(C6859e eVar, C6881a aVar, boolean z, boolean z2, int i) {
        this.f15114b = eVar;
        this.f15115c = (C6881a) C7717a.m22120b(aVar);
        this.f15116d = C7728ai.f18249a >= 21 && z;
        this.f15124l = C7728ai.f18249a >= 23 && z2;
        this.f15125m = C7728ai.f18249a < 29 ? 0 : i;
        this.f15121i = new ConditionVariable(true);
        this.f15122j = new C6874j(new C6887g());
        this.f15117e = new C6878m();
        this.f15118f = new C6902x();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C6877l[]{new C6898t(), this.f15117e, this.f15118f});
        Collections.addAll(arrayList, aVar.mo53019a());
        this.f15119g = (C6861f[]) arrayList.toArray(new C6861f[0]);
        this.f15120h = new C6861f[]{new C6891p()};
        this.f15095I = 1.0f;
        this.f15133u = C6856d.f14999a;
        this.f15108V = 0;
        this.f15109W = new C6876k(0, 0.0f);
        this.f15135w = new C6885e(C6813am.f14830a, false, 0, 0);
        this.f15136x = C6813am.f14830a;
        this.f15103Q = -1;
        this.f15096J = new C6861f[0];
        this.f15097K = new ByteBuffer[0];
        this.f15123k = new ArrayDeque<>();
        this.f15127o = new C6886f<>(100);
        this.f15128p = new C6886f<>(100);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public long m18089A() {
        return this.f15131s.f15143c == 0 ? this.f15089C / ((long) this.f15131s.f15144d) : this.f15090D;
    }

    /* renamed from: B */
    private void m18090B() {
        if (!this.f15105S) {
            this.f15105S = true;
            this.f15122j.mo52998e(m18089A());
            this.f15132t.stop();
            this.f15138z = 0;
        }
    }

    /* renamed from: a */
    private static int m18091a(int i, int i2) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C7728ai.m22259f(i3)).build(), build)) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static int m18092a(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C6850b.m17934a(byteBuffer);
            case 7:
            case 8:
                return C6890o.m18196a(byteBuffer);
            case 9:
                int b = C6895r.m18254b(C7728ai.m22184a(byteBuffer, byteBuffer.position()));
                if (b != -1) {
                    return b;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int b2 = C6850b.m17939b(byteBuffer);
                if (b2 == -1) {
                    return 0;
                }
                return C6850b.m17935a(byteBuffer, b2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C6853c.m17943a(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
        }
    }

    /* renamed from: a */
    private int m18093a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        if (C7728ai.f18249a >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (C7728ai.f18249a != 30 || !C7728ai.f18252d.startsWith("Pixel")) ? 1 : 2;
    }

    /* renamed from: a */
    private static int m18094a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: a */
    private int m18095a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (C7728ai.f18249a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f15137y == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f15137y = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f15137y.putInt(1431633921);
        }
        if (this.f15138z == 0) {
            this.f15137y.putInt(4, i);
            this.f15137y.putLong(8, j * 1000);
            this.f15137y.position(0);
            this.f15138z = i;
        }
        int remaining = this.f15137y.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f15137y, remaining, 1);
            if (write < 0) {
                this.f15138z = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a = m18094a(audioTrack, byteBuffer, i);
        if (a < 0) {
            this.f15138z = 0;
            return a;
        }
        this.f15138z -= a;
        return a;
    }

    /* renamed from: a */
    private void m18098a(long j) throws C6866h.C6871e {
        ByteBuffer byteBuffer;
        int length = this.f15096J.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f15097K[i - 1];
            } else {
                byteBuffer = this.f15098L;
                if (byteBuffer == null) {
                    byteBuffer = C6861f.f15015a;
                }
            }
            if (i == length) {
                m18102a(byteBuffer, j);
            } else {
                C6861f fVar = this.f15096J[i];
                if (i > this.f15103Q) {
                    fVar.mo52928a(byteBuffer);
                }
                ByteBuffer c = fVar.mo52931c();
                this.f15097K[i] = c;
                if (c.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m18099a(AudioTrack audioTrack) {
        if (this.f15126n == null) {
            this.f15126n = new C6888h();
        }
        this.f15126n.mo53029a(audioTrack);
    }

    /* renamed from: a */
    private static void m18100a(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: a */
    private void m18101a(C6813am amVar, boolean z) {
        C6885e w = m18133w();
        if (!amVar.equals(w.f15153a) || z != w.f15154b) {
            C6885e eVar = new C6885e(amVar, z, -9223372036854775807L, -9223372036854775807L);
            if (m18135y()) {
                this.f15134v = eVar;
            } else {
                this.f15135w = eVar;
            }
        }
    }

    /* renamed from: a */
    private void m18102a(ByteBuffer byteBuffer, long j) throws C6866h.C6871e {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f15100N;
            boolean z = true;
            if (byteBuffer2 != null) {
                C7717a.m22118a(byteBuffer2 == byteBuffer);
            } else {
                this.f15100N = byteBuffer;
                if (C7728ai.f18249a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f15101O;
                    if (bArr == null || bArr.length < remaining) {
                        this.f15101O = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f15101O, 0, remaining);
                    byteBuffer.position(position);
                    this.f15102P = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C7728ai.f18249a < 21) {
                int b = this.f15122j.mo52992b(this.f15089C);
                if (b > 0) {
                    i = this.f15132t.write(this.f15101O, this.f15102P, Math.min(remaining2, b));
                    if (i > 0) {
                        this.f15102P += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f15110X) {
                C7717a.m22121b(j != -9223372036854775807L);
                i = m18095a(this.f15132t, byteBuffer, remaining2, j);
            } else {
                i = m18094a(this.f15132t, byteBuffer, remaining2);
            }
            this.f15111Y = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean c = m18115c(i);
                if (c) {
                    m18128r();
                }
                C6866h.C6871e eVar = new C6866h.C6871e(i, this.f15131s.f15141a, c);
                C6866h.C6869c cVar = this.f15129q;
                if (cVar != null) {
                    cVar.mo52973a((Exception) eVar);
                }
                if (!eVar.f15030b) {
                    this.f15128p.mo53028a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f15128p.mo53027a();
            if (m18112b(this.f15132t)) {
                if (this.f15090D > 0) {
                    this.f15113aa = false;
                }
                if (this.f15106T && this.f15129q != null && i < remaining2 && !this.f15113aa) {
                    this.f15129q.mo52976b(this.f15122j.mo52994c(this.f15090D));
                }
            }
            if (this.f15131s.f15143c == 0) {
                this.f15089C += (long) i;
            }
            if (i == remaining2) {
                if (this.f15131s.f15143c != 0) {
                    if (byteBuffer != this.f15098L) {
                        z = false;
                    }
                    C7717a.m22121b(z);
                    this.f15090D += (long) (this.f15091E * this.f15099M);
                }
                this.f15100N = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m18103a(C7864v vVar, C6856d dVar) {
        int b;
        int f;
        int a;
        if (C7728ai.f18249a < 29 || this.f15125m == 0 || (b = C7759u.m22379b((String) C7717a.m22120b(vVar.f18921l), vVar.f18918i)) == 0 || (f = C7728ai.m22259f(vVar.f18934y)) == 0 || (a = m18093a(m18106b(vVar.f18935z, f, b), dVar.mo52914a())) == 0) {
            return false;
        }
        if (a == 1) {
            return !(vVar.f18905B != 0 || vVar.f18906C != 0) || !(this.f15125m == 1);
        } else if (a == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private static boolean m18104a(C7864v vVar, C6859e eVar) {
        return m18108b(vVar, eVar) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static AudioFormat m18106b(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m18108b(C7864v vVar, C6859e eVar) {
        if (eVar == null) {
            return null;
        }
        int b = C7759u.m22379b((String) C7717a.m22120b(vVar.f18921l), vVar.f18918i);
        int i = 6;
        if (!(b == 5 || b == 6 || b == 18 || b == 17 || b == 7 || b == 8 || b == 14)) {
            return null;
        }
        if (b == 18 && !eVar.mo52923a(18)) {
            b = 6;
        } else if (b == 8 && !eVar.mo52923a(8)) {
            b = 7;
        }
        if (!eVar.mo52923a(b)) {
            return null;
        }
        if (b != 18) {
            i = vVar.f18934y;
            if (i > eVar.mo52922a()) {
                return null;
            }
        } else if (C7728ai.f18249a >= 29 && (i = m18091a(18, vVar.f18935z)) == 0) {
            C7755q.m22361c("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int e = m18119e(i);
        if (e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b), Integer.valueOf(e));
    }

    /* renamed from: b */
    private void m18109b(long j) {
        C6813am a = m18134x() ? this.f15115c.mo53017a(m18132v()) : C6813am.f14830a;
        boolean a2 = m18134x() ? this.f15115c.mo53018a(mo53014m()) : false;
        this.f15123k.add(new C6885e(a, a2, Math.max(0, j), this.f15131s.mo53025b(m18089A())));
        m18124n();
        C6866h.C6869c cVar = this.f15129q;
        if (cVar != null) {
            cVar.mo52974a(a2);
        }
    }

    /* renamed from: b */
    private static void m18110b(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: b */
    private void m18111b(C6813am amVar) {
        if (m18135y()) {
            try {
                this.f15132t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(amVar.f14832b).setPitch(amVar.f14833c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C7755q.m22359b("DefaultAudioSink", "Failed to set playback params", e);
            }
            amVar = new C6813am(this.f15132t.getPlaybackParams().getSpeed(), this.f15132t.getPlaybackParams().getPitch());
            this.f15122j.mo52989a(amVar.f14832b);
        }
        this.f15136x = amVar;
    }

    /* renamed from: b */
    private static boolean m18112b(AudioTrack audioTrack) {
        return C7728ai.f18249a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: c */
    private long m18113c(long j) {
        while (!this.f15123k.isEmpty() && j >= this.f15123k.getFirst().f15156d) {
            this.f15135w = this.f15123k.remove();
        }
        long j2 = j - this.f15135w.f15156d;
        if (this.f15135w.f15153a.equals(C6813am.f14830a)) {
            return this.f15135w.f15155c + j2;
        }
        if (this.f15123k.isEmpty()) {
            return this.f15135w.f15155c + this.f15115c.mo53016a(j2);
        }
        C6885e first = this.f15123k.getFirst();
        return first.f15155c - C7728ai.m22191a(first.f15156d - j, this.f15135w.f15153a.f14832b);
    }

    /* renamed from: c */
    private static boolean m18115c(int i) {
        return (C7728ai.f18249a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: d */
    private long m18116d(long j) {
        return j + this.f15131s.mo53025b(this.f15115c.mo53020b());
    }

    /* renamed from: d */
    private boolean m18117d(int i) {
        return this.f15116d && C7728ai.m22257e(i);
    }

    /* renamed from: e */
    private static int m18119e(int i) {
        if (C7728ai.f18249a <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (C7728ai.f18249a <= 26 && "fugu".equals(C7728ai.f18250b) && i == 1) {
            i = 2;
        }
        return C7728ai.m22259f(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m18121f(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return Constants.MAX_FAILED_REQUEST_MS;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: n */
    private void m18124n() {
        C6861f[] fVarArr = this.f15131s.f15149i;
        ArrayList arrayList = new ArrayList();
        for (C6861f fVar : fVarArr) {
            if (fVar.mo52929a()) {
                arrayList.add(fVar);
            } else {
                fVar.mo52933e();
            }
        }
        int size = arrayList.size();
        this.f15096J = (C6861f[]) arrayList.toArray(new C6861f[size]);
        this.f15097K = new ByteBuffer[size];
        m18125o();
    }

    /* renamed from: o */
    private void m18125o() {
        int i = 0;
        while (true) {
            C6861f[] fVarArr = this.f15096J;
            if (i < fVarArr.length) {
                C6861f fVar = fVarArr[i];
                fVar.mo52933e();
                this.f15097K[i] = fVar.mo52931c();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m18126p() throws C6866h.C6868b {
        this.f15121i.block();
        AudioTrack q = m18127q();
        this.f15132t = q;
        if (m18112b(q)) {
            m18099a(this.f15132t);
            if (this.f15125m != 3) {
                this.f15132t.setOffloadDelayPadding(this.f15131s.f15141a.f18905B, this.f15131s.f15141a.f18906C);
            }
        }
        this.f15108V = this.f15132t.getAudioSessionId();
        this.f15122j.mo52990a(this.f15132t, this.f15131s.f15143c == 2, this.f15131s.f15147g, this.f15131s.f15144d, this.f15131s.f15148h);
        m18130t();
        if (this.f15109W.f15075a != 0) {
            this.f15132t.attachAuxEffect(this.f15109W.f15075a);
            this.f15132t.setAuxEffectSendLevel(this.f15109W.f15076b);
        }
        this.f15093G = true;
    }

    /* renamed from: q */
    private AudioTrack m18127q() throws C6866h.C6868b {
        try {
            return ((C6882b) C7717a.m22120b(this.f15131s)).mo53022a(this.f15110X, this.f15133u, this.f15108V);
        } catch (C6866h.C6868b e) {
            m18128r();
            C6866h.C6869c cVar = this.f15129q;
            if (cVar != null) {
                cVar.mo52973a((Exception) e);
            }
            throw e;
        }
    }

    /* renamed from: r */
    private void m18128r() {
        if (this.f15131s.mo53023a()) {
            this.f15112Z = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18129s() throws com.applovin.exoplayer2.p181b.C6866h.C6871e {
        /*
            r9 = this;
            int r0 = r9.f15103Q
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f15103Q = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f15103Q
            com.applovin.exoplayer2.b.f[] r5 = r9.f15096J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo52930b()
        L_0x001f:
            r9.m18098a((long) r7)
            boolean r0 = r4.mo52932d()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f15103Q
            int r0 = r0 + r2
            r9.f15103Q = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f15100N
            if (r0 == 0) goto L_0x003b
            r9.m18102a((java.nio.ByteBuffer) r0, (long) r7)
            java.nio.ByteBuffer r0 = r9.f15100N
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f15103Q = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6879n.m18129s():boolean");
    }

    /* renamed from: t */
    private void m18130t() {
        if (m18135y()) {
            if (C7728ai.f18249a >= 21) {
                m18100a(this.f15132t, this.f15095I);
            } else {
                m18110b(this.f15132t, this.f15095I);
            }
        }
    }

    /* renamed from: u */
    private void m18131u() {
        this.f15087A = 0;
        this.f15088B = 0;
        this.f15089C = 0;
        this.f15090D = 0;
        this.f15113aa = false;
        this.f15091E = 0;
        this.f15135w = new C6885e(m18132v(), mo53014m(), 0, 0);
        this.f15094H = 0;
        this.f15134v = null;
        this.f15123k.clear();
        this.f15098L = null;
        this.f15099M = 0;
        this.f15100N = null;
        this.f15105S = false;
        this.f15104R = false;
        this.f15103Q = -1;
        this.f15137y = null;
        this.f15138z = 0;
        this.f15118f.mo53073k();
        m18125o();
    }

    /* renamed from: v */
    private C6813am m18132v() {
        return m18133w().f15153a;
    }

    /* renamed from: w */
    private C6885e m18133w() {
        C6885e eVar = this.f15134v;
        return eVar != null ? eVar : !this.f15123k.isEmpty() ? this.f15123k.getLast() : this.f15135w;
    }

    /* renamed from: x */
    private boolean m18134x() {
        return !this.f15110X && "audio/raw".equals(this.f15131s.f15141a.f18921l) && !m18117d(this.f15131s.f15141a.f18904A);
    }

    /* renamed from: y */
    private boolean m18135y() {
        return this.f15132t != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public long m18136z() {
        return this.f15131s.f15143c == 0 ? this.f15087A / ((long) this.f15131s.f15142b) : this.f15088B;
    }

    /* renamed from: a */
    public long mo52946a(boolean z) {
        if (!m18135y() || this.f15093G) {
            return Long.MIN_VALUE;
        }
        return m18116d(m18113c(Math.min(this.f15122j.mo52987a(z), this.f15131s.mo53025b(m18089A()))));
    }

    /* renamed from: a */
    public void mo52947a() {
        this.f15106T = true;
        if (m18135y()) {
            this.f15122j.mo52988a();
            this.f15132t.play();
        }
    }

    /* renamed from: a */
    public void mo52948a(float f) {
        if (this.f15095I != f) {
            this.f15095I = f;
            m18130t();
        }
    }

    /* renamed from: a */
    public void mo52949a(int i) {
        if (this.f15108V != i) {
            this.f15108V = i;
            this.f15107U = i != 0;
            mo52967j();
        }
    }

    /* renamed from: a */
    public void mo52950a(C6813am amVar) {
        C6813am amVar2 = new C6813am(C7728ai.m22178a(amVar.f14832b, 0.1f, 8.0f), C7728ai.m22178a(amVar.f14833c, 0.1f, 8.0f));
        if (!this.f15124l || C7728ai.f18249a < 23) {
            m18101a(amVar2, mo53014m());
        } else {
            m18111b(amVar2);
        }
    }

    /* renamed from: a */
    public void mo52951a(C6856d dVar) {
        if (!this.f15133u.equals(dVar)) {
            this.f15133u = dVar;
            if (!this.f15110X) {
                mo52967j();
            }
        }
    }

    /* renamed from: a */
    public void mo52952a(C6866h.C6869c cVar) {
        this.f15129q = cVar;
    }

    /* renamed from: a */
    public void mo52953a(C6876k kVar) {
        if (!this.f15109W.equals(kVar)) {
            int i = kVar.f15075a;
            float f = kVar.f15076b;
            if (this.f15132t != null) {
                if (this.f15109W.f15075a != i) {
                    this.f15132t.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f15132t.setAuxEffectSendLevel(f);
                }
            }
            this.f15109W = kVar;
        }
    }

    /* renamed from: a */
    public void mo52954a(C7864v vVar, int i, int[] iArr) throws C6866h.C6867a {
        C6861f[] fVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr2;
        C7864v vVar2 = vVar;
        if ("audio/raw".equals(vVar2.f18921l)) {
            C7717a.m22118a(C7728ai.m22254d(vVar2.f18904A));
            i7 = C7728ai.m22244c(vVar2.f18904A, vVar2.f18934y);
            C6861f[] fVarArr2 = m18117d(vVar2.f18904A) ? this.f15120h : this.f15119g;
            this.f15118f.mo53072a(vVar2.f18905B, vVar2.f18906C);
            if (C7728ai.f18249a < 21 && vVar2.f18934y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f15117e.mo53013a(iArr2);
            C6861f.C6862a aVar = new C6861f.C6862a(vVar2.f18935z, vVar2.f18934y, vVar2.f18904A);
            int length = fVarArr2.length;
            int i9 = 0;
            while (i9 < length) {
                C6861f fVar = fVarArr2[i9];
                try {
                    C6861f.C6862a a = fVar.mo52927a(aVar);
                    if (fVar.mo52929a()) {
                        aVar = a;
                    }
                    i9++;
                } catch (C6861f.C6863b e) {
                    throw new C6866h.C6867a((Throwable) e, vVar);
                }
            }
            int i10 = aVar.f15019d;
            i4 = aVar.f15017b;
            i3 = C7728ai.m22259f(aVar.f15018c);
            fVarArr = fVarArr2;
            i2 = i10;
            i5 = C7728ai.m22244c(i10, aVar.f15018c);
            i6 = 0;
        } else {
            C6861f[] fVarArr3 = new C6861f[0];
            int i11 = vVar2.f18935z;
            if (m18103a(vVar, this.f15133u)) {
                fVarArr = fVarArr3;
                i2 = C7759u.m22379b((String) C7717a.m22120b(vVar2.f18921l), vVar2.f18918i);
                i3 = C7728ai.m22259f(vVar2.f18934y);
                i7 = -1;
                i5 = -1;
                i4 = i11;
                i6 = 1;
            } else {
                Pair<Integer, Integer> b = m18108b(vVar, this.f15114b);
                if (b != null) {
                    fVarArr = fVarArr3;
                    i2 = ((Integer) b.first).intValue();
                    i7 = -1;
                    i5 = -1;
                    i3 = ((Integer) b.second).intValue();
                    i4 = i11;
                    i6 = 2;
                } else {
                    throw new C6866h.C6867a("Unable to configure passthrough for: " + vVar, vVar);
                }
            }
        }
        if (i2 == 0) {
            throw new C6866h.C6867a("Invalid output encoding (mode=" + i6 + ") for: " + vVar, vVar);
        } else if (i3 != 0) {
            this.f15112Z = false;
            C6882b bVar = new C6882b(vVar, i7, i6, i5, i4, i3, i2, i, this.f15124l, fVarArr);
            if (m18135y()) {
                this.f15130r = bVar;
            } else {
                this.f15131s = bVar;
            }
        } else {
            throw new C6866h.C6867a("Invalid output channel config (mode=" + i6 + ") for: " + vVar, vVar);
        }
    }

    /* renamed from: a */
    public boolean mo52955a(C7864v vVar) {
        return mo52957b(vVar) != 0;
    }

    /* renamed from: a */
    public boolean mo52956a(ByteBuffer byteBuffer, long j, int i) throws C6866h.C6868b, C6866h.C6871e {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i2 = i;
        ByteBuffer byteBuffer3 = this.f15098L;
        C7717a.m22118a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f15130r != null) {
            if (!m18129s()) {
                return false;
            }
            if (!this.f15130r.mo53024a(this.f15131s)) {
                m18090B();
                if (mo52962e()) {
                    return false;
                }
                mo52967j();
            } else {
                this.f15131s = this.f15130r;
                this.f15130r = null;
                if (m18112b(this.f15132t) && this.f15125m != 3) {
                    this.f15132t.setOffloadEndOfStream();
                    this.f15132t.setOffloadDelayPadding(this.f15131s.f15141a.f18905B, this.f15131s.f15141a.f18906C);
                    this.f15113aa = true;
                }
            }
            m18109b(j2);
        }
        if (!m18135y()) {
            try {
                m18126p();
            } catch (C6866h.C6868b e) {
                C6866h.C6868b bVar = e;
                if (!bVar.f15025b) {
                    this.f15127o.mo53028a(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f15127o.mo53027a();
        if (this.f15093G) {
            this.f15094H = Math.max(0, j2);
            this.f15092F = false;
            this.f15093G = false;
            if (this.f15124l && C7728ai.f18249a >= 23) {
                m18111b(this.f15136x);
            }
            m18109b(j2);
            if (this.f15106T) {
                mo52947a();
            }
        }
        if (!this.f15122j.mo52991a(m18089A())) {
            return false;
        }
        if (this.f15098L == null) {
            C7717a.m22118a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f15131s.f15143c != 0 && this.f15091E == 0) {
                int a = m18092a(this.f15131s.f15147g, byteBuffer2);
                this.f15091E = a;
                if (a == 0) {
                    return true;
                }
            }
            if (this.f15134v != null) {
                if (!m18129s()) {
                    return false;
                }
                m18109b(j2);
                this.f15134v = null;
            }
            long a2 = this.f15094H + this.f15131s.mo53021a(m18136z() - this.f15118f.mo53074l());
            if (!this.f15092F && Math.abs(a2 - j2) > 200000) {
                this.f15129q.mo52973a((Exception) new C6866h.C6870d(j2, a2));
                this.f15092F = true;
            }
            if (this.f15092F) {
                if (!m18129s()) {
                    return false;
                }
                long j3 = j2 - a2;
                this.f15094H += j3;
                this.f15092F = false;
                m18109b(j2);
                C6866h.C6869c cVar = this.f15129q;
                if (!(cVar == null || j3 == 0)) {
                    cVar.mo52970a();
                }
            }
            if (this.f15131s.f15143c == 0) {
                this.f15087A += (long) byteBuffer.remaining();
            } else {
                this.f15088B += (long) (this.f15091E * i2);
            }
            this.f15098L = byteBuffer2;
            this.f15099M = i2;
        }
        m18098a(j2);
        if (!this.f15098L.hasRemaining()) {
            this.f15098L = null;
            this.f15099M = 0;
            return true;
        } else if (!this.f15122j.mo52997d(m18089A())) {
            return false;
        } else {
            C7755q.m22361c("DefaultAudioSink", "Resetting stalled audio track");
            mo52967j();
            return true;
        }
    }

    /* renamed from: b */
    public int mo52957b(C7864v vVar) {
        if (!"audio/raw".equals(vVar.f18921l)) {
            return ((this.f15112Z || !m18103a(vVar, this.f15133u)) && !m18104a(vVar, this.f15114b)) ? 0 : 2;
        }
        if (C7728ai.m22254d(vVar.f18904A)) {
            return (vVar.f18904A == 2 || (this.f15116d && vVar.f18904A == 4)) ? 2 : 1;
        }
        C7755q.m22361c("DefaultAudioSink", "Invalid PCM encoding: " + vVar.f18904A);
        return 0;
    }

    /* renamed from: b */
    public void mo52958b() {
        this.f15092F = true;
    }

    /* renamed from: b */
    public void mo52959b(boolean z) {
        m18101a(m18132v(), z);
    }

    /* renamed from: c */
    public void mo52960c() throws C6866h.C6871e {
        if (!this.f15104R && m18135y() && m18129s()) {
            m18090B();
            this.f15104R = true;
        }
    }

    /* renamed from: d */
    public boolean mo52961d() {
        return !m18135y() || (this.f15104R && !mo52962e());
    }

    /* renamed from: e */
    public boolean mo52962e() {
        return m18135y() && this.f15122j.mo52999f(m18089A());
    }

    /* renamed from: f */
    public C6813am mo52963f() {
        return this.f15124l ? this.f15136x : m18132v();
    }

    /* renamed from: g */
    public void mo52964g() {
        C7717a.m22121b(C7728ai.f18249a >= 21);
        C7717a.m22121b(this.f15107U);
        if (!this.f15110X) {
            this.f15110X = true;
            mo52967j();
        }
    }

    /* renamed from: h */
    public void mo52965h() {
        if (this.f15110X) {
            this.f15110X = false;
            mo52967j();
        }
    }

    /* renamed from: i */
    public void mo52966i() {
        this.f15106T = false;
        if (m18135y() && this.f15122j.mo52995c()) {
            this.f15132t.pause();
        }
    }

    /* renamed from: j */
    public void mo52967j() {
        if (m18135y()) {
            m18131u();
            if (this.f15122j.mo52993b()) {
                this.f15132t.pause();
            }
            if (m18112b(this.f15132t)) {
                ((C6888h) C7717a.m22120b(this.f15126n)).mo53030b(this.f15132t);
            }
            final AudioTrack audioTrack = this.f15132t;
            this.f15132t = null;
            if (C7728ai.f18249a < 21 && !this.f15107U) {
                this.f15108V = 0;
            }
            C6882b bVar = this.f15130r;
            if (bVar != null) {
                this.f15131s = bVar;
                this.f15130r = null;
            }
            this.f15122j.mo52996d();
            this.f15121i.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") {
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        C6879n.this.f15121i.open();
                    }
                }
            }.start();
        }
        this.f15128p.mo53027a();
        this.f15127o.mo53027a();
    }

    /* renamed from: k */
    public void mo52968k() {
        if (C7728ai.f18249a < 25) {
            mo52967j();
            return;
        }
        this.f15128p.mo53027a();
        this.f15127o.mo53027a();
        if (m18135y()) {
            m18131u();
            if (this.f15122j.mo52993b()) {
                this.f15132t.pause();
            }
            this.f15132t.flush();
            this.f15122j.mo52996d();
            this.f15122j.mo52990a(this.f15132t, this.f15131s.f15143c == 2, this.f15131s.f15147g, this.f15131s.f15144d, this.f15131s.f15148h);
            this.f15093G = true;
        }
    }

    /* renamed from: l */
    public void mo52969l() {
        mo52967j();
        for (C6861f f : this.f15119g) {
            f.mo52934f();
        }
        for (C6861f f2 : this.f15120h) {
            f2.mo52934f();
        }
        this.f15106T = false;
        this.f15112Z = false;
    }

    /* renamed from: m */
    public boolean mo53014m() {
        return m18133w().f15154b;
    }
}
