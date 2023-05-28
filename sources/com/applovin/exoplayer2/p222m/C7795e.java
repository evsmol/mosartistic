package com.applovin.exoplayer2.p222m;

import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.m.e */
final class C7795e {

    /* renamed from: a */
    private C7796a f18430a = new C7796a();

    /* renamed from: b */
    private C7796a f18431b = new C7796a();

    /* renamed from: c */
    private boolean f18432c;

    /* renamed from: d */
    private boolean f18433d;

    /* renamed from: e */
    private long f18434e = -9223372036854775807L;

    /* renamed from: f */
    private int f18435f;

    /* renamed from: com.applovin.exoplayer2.m.e$a */
    private static final class C7796a {

        /* renamed from: a */
        private long f18436a;

        /* renamed from: b */
        private long f18437b;

        /* renamed from: c */
        private long f18438c;

        /* renamed from: d */
        private long f18439d;

        /* renamed from: e */
        private long f18440e;

        /* renamed from: f */
        private long f18441f;

        /* renamed from: g */
        private final boolean[] f18442g = new boolean[15];

        /* renamed from: h */
        private int f18443h;

        /* renamed from: b */
        private static int m22564b(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public void mo55163a() {
            this.f18439d = 0;
            this.f18440e = 0;
            this.f18441f = 0;
            this.f18443h = 0;
            Arrays.fill(this.f18442g, false);
        }

        /* renamed from: a */
        public void mo55164a(long j) {
            int i;
            long j2 = this.f18439d;
            if (j2 == 0) {
                this.f18436a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f18436a;
                this.f18437b = j3;
                this.f18441f = j3;
                this.f18440e = 1;
            } else {
                long j4 = j - this.f18438c;
                int b = m22564b(j2);
                if (Math.abs(j4 - this.f18437b) <= 1000000) {
                    this.f18440e++;
                    this.f18441f += j4;
                    boolean[] zArr = this.f18442g;
                    if (zArr[b]) {
                        zArr[b] = false;
                        i = this.f18443h - 1;
                    }
                } else {
                    boolean[] zArr2 = this.f18442g;
                    if (!zArr2[b]) {
                        zArr2[b] = true;
                        i = this.f18443h + 1;
                    }
                }
                this.f18443h = i;
            }
            this.f18439d++;
            this.f18438c = j;
        }

        /* renamed from: b */
        public boolean mo55165b() {
            return this.f18439d > 15 && this.f18443h == 0;
        }

        /* renamed from: c */
        public boolean mo55166c() {
            long j = this.f18439d;
            if (j == 0) {
                return false;
            }
            return this.f18442g[m22564b(j - 1)];
        }

        /* renamed from: d */
        public long mo55167d() {
            return this.f18441f;
        }

        /* renamed from: e */
        public long mo55168e() {
            long j = this.f18440e;
            if (j == 0) {
                return 0;
            }
            return this.f18441f / j;
        }
    }

    /* renamed from: a */
    public void mo55156a() {
        this.f18430a.mo55163a();
        this.f18431b.mo55163a();
        this.f18432c = false;
        this.f18434e = -9223372036854775807L;
        this.f18435f = 0;
    }

    /* renamed from: a */
    public void mo55157a(long j) {
        this.f18430a.mo55164a(j);
        int i = 0;
        if (this.f18430a.mo55165b() && !this.f18433d) {
            this.f18432c = false;
        } else if (this.f18434e != -9223372036854775807L) {
            if (!this.f18432c || this.f18431b.mo55166c()) {
                this.f18431b.mo55163a();
                this.f18431b.mo55164a(this.f18434e);
            }
            this.f18432c = true;
            this.f18431b.mo55164a(j);
        }
        if (this.f18432c && this.f18431b.mo55165b()) {
            C7796a aVar = this.f18430a;
            this.f18430a = this.f18431b;
            this.f18431b = aVar;
            this.f18432c = false;
            this.f18433d = false;
        }
        this.f18434e = j;
        if (!this.f18430a.mo55165b()) {
            i = this.f18435f + 1;
        }
        this.f18435f = i;
    }

    /* renamed from: b */
    public boolean mo55158b() {
        return this.f18430a.mo55165b();
    }

    /* renamed from: c */
    public int mo55159c() {
        return this.f18435f;
    }

    /* renamed from: d */
    public long mo55160d() {
        if (mo55158b()) {
            return this.f18430a.mo55167d();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public long mo55161e() {
        if (mo55158b()) {
            return this.f18430a.mo55168e();
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public float mo55162f() {
        if (mo55158b()) {
            return (float) (1.0E9d / ((double) this.f18430a.mo55168e()));
        }
        return -1.0f;
    }
}
