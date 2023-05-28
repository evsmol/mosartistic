package com.applovin.exoplayer2.p181b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.lang.reflect.Method;

/* renamed from: com.applovin.exoplayer2.b.j */
final class C6874j {

    /* renamed from: A */
    private long f15043A;

    /* renamed from: B */
    private long f15044B;

    /* renamed from: C */
    private long f15045C;

    /* renamed from: D */
    private boolean f15046D;

    /* renamed from: E */
    private long f15047E;

    /* renamed from: F */
    private long f15048F;

    /* renamed from: a */
    private final C6875a f15049a;

    /* renamed from: b */
    private final long[] f15050b;

    /* renamed from: c */
    private AudioTrack f15051c;

    /* renamed from: d */
    private int f15052d;

    /* renamed from: e */
    private int f15053e;

    /* renamed from: f */
    private C6872i f15054f;

    /* renamed from: g */
    private int f15055g;

    /* renamed from: h */
    private boolean f15056h;

    /* renamed from: i */
    private long f15057i;

    /* renamed from: j */
    private float f15058j;

    /* renamed from: k */
    private boolean f15059k;

    /* renamed from: l */
    private long f15060l;

    /* renamed from: m */
    private long f15061m;

    /* renamed from: n */
    private Method f15062n;

    /* renamed from: o */
    private long f15063o;

    /* renamed from: p */
    private boolean f15064p;

    /* renamed from: q */
    private boolean f15065q;

    /* renamed from: r */
    private long f15066r;

    /* renamed from: s */
    private long f15067s;

    /* renamed from: t */
    private long f15068t;

    /* renamed from: u */
    private long f15069u;

    /* renamed from: v */
    private int f15070v;

    /* renamed from: w */
    private int f15071w;

    /* renamed from: x */
    private long f15072x;

    /* renamed from: y */
    private long f15073y;

    /* renamed from: z */
    private long f15074z;

    /* renamed from: com.applovin.exoplayer2.b.j$a */
    public interface C6875a {
        /* renamed from: a */
        void mo53000a(int i, long j);

        /* renamed from: a */
        void mo53001a(long j);

        /* renamed from: a */
        void mo53002a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo53003b(long j);

        /* renamed from: b */
        void mo53004b(long j, long j2, long j3, long j4);
    }

    public C6874j(C6875a aVar) {
        this.f15049a = (C6875a) C7717a.m22120b(aVar);
        if (C7728ai.f18249a >= 18) {
            try {
                this.f15062n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f15050b = new long[10];
    }

    /* renamed from: a */
    private void m18044a(long j, long j2) {
        C6872i iVar = (C6872i) C7717a.m22120b(this.f15054f);
        if (iVar.mo52978a(j)) {
            long e = iVar.mo52982e();
            long f = iVar.mo52983f();
            if (Math.abs(e - j) > 5000000) {
                this.f15049a.mo53004b(f, e, j, j2);
            } else if (Math.abs(m18051h(f) - j2) > 5000000) {
                this.f15049a.mo53002a(f, e, j, j2);
            } else {
                iVar.mo52979b();
                return;
            }
            iVar.mo52977a();
        }
    }

    /* renamed from: a */
    private static boolean m18045a(int i) {
        return C7728ai.f18249a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: e */
    private void m18046e() {
        long h = m18050h();
        if (h != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f15061m >= 30000) {
                long[] jArr = this.f15050b;
                int i = this.f15070v;
                jArr[i] = h - nanoTime;
                this.f15070v = (i + 1) % 10;
                int i2 = this.f15071w;
                if (i2 < 10) {
                    this.f15071w = i2 + 1;
                }
                this.f15061m = nanoTime;
                this.f15060l = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f15071w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f15060l += this.f15050b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f15056h) {
                m18044a(nanoTime, h);
                m18048g(nanoTime);
            }
        }
    }

    /* renamed from: f */
    private void m18047f() {
        this.f15060l = 0;
        this.f15071w = 0;
        this.f15070v = 0;
        this.f15061m = 0;
        this.f15045C = 0;
        this.f15048F = 0;
        this.f15059k = false;
    }

    /* renamed from: g */
    private void m18048g(long j) {
        Method method;
        if (this.f15065q && (method = this.f15062n) != null && j - this.f15066r >= 500000) {
            try {
                long intValue = (((long) ((Integer) C7728ai.m22198a((Integer) method.invoke(C7717a.m22120b(this.f15051c), new Object[0]))).intValue()) * 1000) - this.f15057i;
                this.f15063o = intValue;
                long max = Math.max(intValue, 0);
                this.f15063o = max;
                if (max > 5000000) {
                    this.f15049a.mo53003b(max);
                    this.f15063o = 0;
                }
            } catch (Exception unused) {
                this.f15062n = null;
            }
            this.f15066r = j;
        }
    }

    /* renamed from: g */
    private boolean m18049g() {
        return this.f15056h && ((AudioTrack) C7717a.m22120b(this.f15051c)).getPlayState() == 2 && m18052i() == 0;
    }

    /* renamed from: h */
    private long m18050h() {
        return m18051h(m18052i());
    }

    /* renamed from: h */
    private long m18051h(long j) {
        return (j * 1000000) / ((long) this.f15055g);
    }

    /* renamed from: i */
    private long m18052i() {
        AudioTrack audioTrack = (AudioTrack) C7717a.m22120b(this.f15051c);
        if (this.f15072x != -9223372036854775807L) {
            return Math.min(this.f15043A, this.f15074z + ((((SystemClock.elapsedRealtime() * 1000) - this.f15072x) * ((long) this.f15055g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f15056h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f15069u = this.f15067s;
            }
            playbackHeadPosition += this.f15069u;
        }
        if (C7728ai.f18249a <= 29) {
            if (playbackHeadPosition == 0 && this.f15067s > 0 && playState == 3) {
                if (this.f15073y == -9223372036854775807L) {
                    this.f15073y = SystemClock.elapsedRealtime();
                }
                return this.f15067s;
            }
            this.f15073y = -9223372036854775807L;
        }
        if (this.f15067s > playbackHeadPosition) {
            this.f15068t++;
        }
        this.f15067s = playbackHeadPosition;
        return playbackHeadPosition + (this.f15068t << 32);
    }

    /* renamed from: a */
    public long mo52987a(boolean z) {
        long j;
        if (((AudioTrack) C7717a.m22120b(this.f15051c)).getPlayState() == 3) {
            m18046e();
        }
        long nanoTime = System.nanoTime() / 1000;
        C6872i iVar = (C6872i) C7717a.m22120b(this.f15054f);
        boolean c = iVar.mo52980c();
        if (c) {
            j = m18051h(iVar.mo52983f()) + C7728ai.m22191a(nanoTime - iVar.mo52982e(), this.f15058j);
        } else {
            j = this.f15071w == 0 ? m18050h() : this.f15060l + nanoTime;
            if (!z) {
                j = Math.max(0, j - this.f15063o);
            }
        }
        if (this.f15046D != c) {
            this.f15048F = this.f15045C;
            this.f15047E = this.f15044B;
        }
        long j2 = nanoTime - this.f15048F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f15047E + C7728ai.m22191a(j2, this.f15058j)))) / 1000;
        }
        if (!this.f15059k) {
            long j4 = this.f15044B;
            if (j > j4) {
                this.f15059k = true;
                this.f15049a.mo53001a(System.currentTimeMillis() - C7476h.m20797a(C7728ai.m22232b(C7476h.m20797a(j - j4), this.f15058j)));
            }
        }
        this.f15045C = nanoTime;
        this.f15044B = j;
        this.f15046D = c;
        return j;
    }

    /* renamed from: a */
    public void mo52988a() {
        ((C6872i) C7717a.m22120b(this.f15054f)).mo52981d();
    }

    /* renamed from: a */
    public void mo52989a(float f) {
        this.f15058j = f;
        C6872i iVar = this.f15054f;
        if (iVar != null) {
            iVar.mo52981d();
        }
    }

    /* renamed from: a */
    public void mo52990a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f15051c = audioTrack;
        this.f15052d = i2;
        this.f15053e = i3;
        this.f15054f = new C6872i(audioTrack);
        this.f15055g = audioTrack.getSampleRate();
        this.f15056h = z && m18045a(i);
        boolean d = C7728ai.m22254d(i);
        this.f15065q = d;
        this.f15057i = d ? m18051h((long) (i3 / i2)) : -9223372036854775807L;
        this.f15067s = 0;
        this.f15068t = 0;
        this.f15069u = 0;
        this.f15064p = false;
        this.f15072x = -9223372036854775807L;
        this.f15073y = -9223372036854775807L;
        this.f15066r = 0;
        this.f15063o = 0;
        this.f15058j = 1.0f;
    }

    /* renamed from: a */
    public boolean mo52991a(long j) {
        int playState = ((AudioTrack) C7717a.m22120b(this.f15051c)).getPlayState();
        if (this.f15056h) {
            if (playState == 2) {
                this.f15064p = false;
                return false;
            } else if (playState == 1 && m18052i() == 0) {
                return false;
            }
        }
        boolean z = this.f15064p;
        boolean f = mo52999f(j);
        this.f15064p = f;
        if (z && !f && playState != 1) {
            this.f15049a.mo53000a(this.f15053e, C7476h.m20797a(this.f15057i));
        }
        return true;
    }

    /* renamed from: b */
    public int mo52992b(long j) {
        return this.f15053e - ((int) (j - (m18052i() * ((long) this.f15052d))));
    }

    /* renamed from: b */
    public boolean mo52993b() {
        return ((AudioTrack) C7717a.m22120b(this.f15051c)).getPlayState() == 3;
    }

    /* renamed from: c */
    public long mo52994c(long j) {
        return C7476h.m20797a(m18051h(j - m18052i()));
    }

    /* renamed from: c */
    public boolean mo52995c() {
        m18047f();
        if (this.f15072x != -9223372036854775807L) {
            return false;
        }
        ((C6872i) C7717a.m22120b(this.f15054f)).mo52981d();
        return true;
    }

    /* renamed from: d */
    public void mo52996d() {
        m18047f();
        this.f15051c = null;
        this.f15054f = null;
    }

    /* renamed from: d */
    public boolean mo52997d(long j) {
        return this.f15073y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f15073y >= 200;
    }

    /* renamed from: e */
    public void mo52998e(long j) {
        this.f15074z = m18052i();
        this.f15072x = SystemClock.elapsedRealtime() * 1000;
        this.f15043A = j;
    }

    /* renamed from: f */
    public boolean mo52999f(long j) {
        return j > m18052i() || m18049g();
    }
}
