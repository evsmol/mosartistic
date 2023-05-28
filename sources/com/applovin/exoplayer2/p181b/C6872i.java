package com.applovin.exoplayer2.p181b;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.b.i */
final class C6872i {

    /* renamed from: a */
    private final C6873a f15032a;

    /* renamed from: b */
    private int f15033b;

    /* renamed from: c */
    private long f15034c;

    /* renamed from: d */
    private long f15035d;

    /* renamed from: e */
    private long f15036e;

    /* renamed from: f */
    private long f15037f;

    /* renamed from: com.applovin.exoplayer2.b.i$a */
    private static final class C6873a {

        /* renamed from: a */
        private final AudioTrack f15038a;

        /* renamed from: b */
        private final AudioTimestamp f15039b = new AudioTimestamp();

        /* renamed from: c */
        private long f15040c;

        /* renamed from: d */
        private long f15041d;

        /* renamed from: e */
        private long f15042e;

        public C6873a(AudioTrack audioTrack) {
            this.f15038a = audioTrack;
        }

        /* renamed from: a */
        public boolean mo52984a() {
            boolean timestamp = this.f15038a.getTimestamp(this.f15039b);
            if (timestamp) {
                long j = this.f15039b.framePosition;
                if (this.f15041d > j) {
                    this.f15040c++;
                }
                this.f15041d = j;
                this.f15042e = j + (this.f15040c << 32);
            }
            return timestamp;
        }

        /* renamed from: b */
        public long mo52985b() {
            return this.f15039b.nanoTime / 1000;
        }

        /* renamed from: c */
        public long mo52986c() {
            return this.f15042e;
        }
    }

    public C6872i(AudioTrack audioTrack) {
        if (C7728ai.f18249a >= 19) {
            this.f15032a = new C6873a(audioTrack);
            mo52981d();
            return;
        }
        this.f15032a = null;
        m18033a(3);
    }

    /* renamed from: a */
    private void m18033a(int i) {
        this.f15033b = i;
        long j = 10000;
        if (i == 0) {
            this.f15036e = 0;
            this.f15037f = -1;
            this.f15034c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else if (i == 4) {
                j = 500000;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f15035d = j;
    }

    /* renamed from: a */
    public void mo52977a() {
        m18033a(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52978a(long r8) {
        /*
            r7 = this;
            com.applovin.exoplayer2.b.i$a r0 = r7.f15032a
            r1 = 0
            if (r0 == 0) goto L_0x0071
            long r2 = r7.f15036e
            long r2 = r8 - r2
            long r4 = r7.f15035d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0010
            goto L_0x0071
        L_0x0010:
            r7.f15036e = r8
            boolean r0 = r0.mo52984a()
            int r2 = r7.f15033b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L_0x0049
            r8 = 2
            if (r2 == r4) goto L_0x0033
            if (r2 == r8) goto L_0x0030
            if (r2 == r3) goto L_0x002d
            r8 = 4
            if (r2 != r8) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x002d:
            if (r0 == 0) goto L_0x0070
            goto L_0x0045
        L_0x0030:
            if (r0 != 0) goto L_0x0070
            goto L_0x0045
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            com.applovin.exoplayer2.b.i$a r9 = r7.f15032a
            long r1 = r9.mo52986c()
            long r3 = r7.f15037f
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x0070
            r7.m18033a((int) r8)
            goto L_0x0070
        L_0x0045:
            r7.mo52981d()
            goto L_0x0070
        L_0x0049:
            if (r0 == 0) goto L_0x0063
            com.applovin.exoplayer2.b.i$a r8 = r7.f15032a
            long r8 = r8.mo52985b()
            long r2 = r7.f15034c
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            com.applovin.exoplayer2.b.i$a r8 = r7.f15032a
            long r8 = r8.mo52986c()
            r7.f15037f = r8
            r7.m18033a((int) r4)
            goto L_0x0070
        L_0x0063:
            long r1 = r7.f15034c
            long r8 = r8 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0070
            r7.m18033a((int) r3)
        L_0x0070:
            r1 = r0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6872i.mo52978a(long):boolean");
    }

    /* renamed from: b */
    public void mo52979b() {
        if (this.f15033b == 4) {
            mo52981d();
        }
    }

    /* renamed from: c */
    public boolean mo52980c() {
        return this.f15033b == 2;
    }

    /* renamed from: d */
    public void mo52981d() {
        if (this.f15032a != null) {
            m18033a(0);
        }
    }

    /* renamed from: e */
    public long mo52982e() {
        C6873a aVar = this.f15032a;
        if (aVar != null) {
            return aVar.mo52985b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public long mo52983f() {
        C6873a aVar = this.f15032a;
        if (aVar != null) {
            return aVar.mo52986c();
        }
        return -1;
    }
}
