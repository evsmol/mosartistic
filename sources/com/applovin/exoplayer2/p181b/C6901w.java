package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.applovin.exoplayer2.b.w */
public final class C6901w implements C6861f {

    /* renamed from: b */
    private int f15231b;

    /* renamed from: c */
    private float f15232c = 1.0f;

    /* renamed from: d */
    private float f15233d = 1.0f;

    /* renamed from: e */
    private C6861f.C6862a f15234e = C6861f.C6862a.f15016a;

    /* renamed from: f */
    private C6861f.C6862a f15235f = C6861f.C6862a.f15016a;

    /* renamed from: g */
    private C6861f.C6862a f15236g = C6861f.C6862a.f15016a;

    /* renamed from: h */
    private C6861f.C6862a f15237h = C6861f.C6862a.f15016a;

    /* renamed from: i */
    private boolean f15238i;

    /* renamed from: j */
    private C6900v f15239j;

    /* renamed from: k */
    private ByteBuffer f15240k;

    /* renamed from: l */
    private ShortBuffer f15241l;

    /* renamed from: m */
    private ByteBuffer f15242m;

    /* renamed from: n */
    private long f15243n;

    /* renamed from: o */
    private long f15244o;

    /* renamed from: p */
    private boolean f15245p;

    public C6901w() {
        ByteBuffer byteBuffer = f15015a;
        this.f15240k = byteBuffer;
        this.f15241l = byteBuffer.asShortBuffer();
        this.f15242m = f15015a;
        this.f15231b = -1;
    }

    /* renamed from: a */
    public long mo53069a(long j) {
        if (this.f15244o < 1024) {
            return (long) (((double) this.f15232c) * ((double) j));
        }
        long a = this.f15243n - ((long) ((C6900v) C7717a.m22120b(this.f15239j)).mo53063a());
        if (this.f15237h.f15017b == this.f15236g.f15017b) {
            return C7728ai.m22252d(j, a, this.f15244o);
        }
        return C7728ai.m22252d(j, a * ((long) this.f15237h.f15017b), this.f15244o * ((long) this.f15236g.f15017b));
    }

    /* renamed from: a */
    public C6861f.C6862a mo52927a(C6861f.C6862a aVar) throws C6861f.C6863b {
        if (aVar.f15019d == 2) {
            int i = this.f15231b;
            if (i == -1) {
                i = aVar.f15017b;
            }
            this.f15234e = aVar;
            C6861f.C6862a aVar2 = new C6861f.C6862a(i, aVar.f15018c, 2);
            this.f15235f = aVar2;
            this.f15238i = true;
            return aVar2;
        }
        throw new C6861f.C6863b(aVar);
    }

    /* renamed from: a */
    public void mo53070a(float f) {
        if (this.f15232c != f) {
            this.f15232c = f;
            this.f15238i = true;
        }
    }

    /* renamed from: a */
    public void mo52928a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15243n += (long) remaining;
            ((C6900v) C7717a.m22120b(this.f15239j)).mo53064a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: a */
    public boolean mo52929a() {
        return this.f15235f.f15017b != -1 && (Math.abs(this.f15232c - 1.0f) >= 1.0E-4f || Math.abs(this.f15233d - 1.0f) >= 1.0E-4f || this.f15235f.f15017b != this.f15234e.f15017b);
    }

    /* renamed from: b */
    public void mo52930b() {
        C6900v vVar = this.f15239j;
        if (vVar != null) {
            vVar.mo53065b();
        }
        this.f15245p = true;
    }

    /* renamed from: b */
    public void mo53071b(float f) {
        if (this.f15233d != f) {
            this.f15233d = f;
            this.f15238i = true;
        }
    }

    /* renamed from: c */
    public ByteBuffer mo52931c() {
        int d;
        C6900v vVar = this.f15239j;
        if (vVar != null && (d = vVar.mo53068d()) > 0) {
            if (this.f15240k.capacity() < d) {
                ByteBuffer order = ByteBuffer.allocateDirect(d).order(ByteOrder.nativeOrder());
                this.f15240k = order;
                this.f15241l = order.asShortBuffer();
            } else {
                this.f15240k.clear();
                this.f15241l.clear();
            }
            vVar.mo53066b(this.f15241l);
            this.f15244o += (long) d;
            this.f15240k.limit(d);
            this.f15242m = this.f15240k;
        }
        ByteBuffer byteBuffer = this.f15242m;
        this.f15242m = f15015a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f15239j;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52932d() {
        /*
            r1 = this;
            boolean r0 = r1.f15245p
            if (r0 == 0) goto L_0x0010
            com.applovin.exoplayer2.b.v r0 = r1.f15239j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.mo53068d()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6901w.mo52932d():boolean");
    }

    /* renamed from: e */
    public void mo52933e() {
        if (mo52929a()) {
            C6861f.C6862a aVar = this.f15234e;
            this.f15236g = aVar;
            this.f15237h = this.f15235f;
            if (this.f15238i) {
                this.f15239j = new C6900v(aVar.f15017b, this.f15236g.f15018c, this.f15232c, this.f15233d, this.f15237h.f15017b);
            } else {
                C6900v vVar = this.f15239j;
                if (vVar != null) {
                    vVar.mo53067c();
                }
            }
        }
        this.f15242m = f15015a;
        this.f15243n = 0;
        this.f15244o = 0;
        this.f15245p = false;
    }

    /* renamed from: f */
    public void mo52934f() {
        this.f15232c = 1.0f;
        this.f15233d = 1.0f;
        this.f15234e = C6861f.C6862a.f15016a;
        this.f15235f = C6861f.C6862a.f15016a;
        this.f15236g = C6861f.C6862a.f15016a;
        this.f15237h = C6861f.C6862a.f15016a;
        ByteBuffer byteBuffer = f15015a;
        this.f15240k = byteBuffer;
        this.f15241l = byteBuffer.asShortBuffer();
        this.f15242m = f15015a;
        this.f15231b = -1;
        this.f15238i = false;
        this.f15239j = null;
        this.f15243n = 0;
        this.f15244o = 0;
        this.f15245p = false;
    }
}
