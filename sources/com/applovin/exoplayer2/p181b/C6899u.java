package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.u */
public final class C6899u extends C6877l {

    /* renamed from: d */
    private final long f15197d;

    /* renamed from: e */
    private final long f15198e;

    /* renamed from: f */
    private final short f15199f;

    /* renamed from: g */
    private int f15200g;

    /* renamed from: h */
    private boolean f15201h;

    /* renamed from: i */
    private byte[] f15202i;

    /* renamed from: j */
    private byte[] f15203j;

    /* renamed from: k */
    private int f15204k;

    /* renamed from: l */
    private int f15205l;

    /* renamed from: m */
    private int f15206m;

    /* renamed from: n */
    private boolean f15207n;

    /* renamed from: o */
    private long f15208o;

    public C6899u() {
        this(150000, 20000, 1024);
    }

    public C6899u(long j, long j2, short s) {
        C7717a.m22118a(j2 <= j);
        this.f15197d = j;
        this.f15198e = j2;
        this.f15199f = s;
        this.f15202i = C7728ai.f18254f;
        this.f15203j = C7728ai.f18254f;
    }

    /* renamed from: a */
    private int m18272a(long j) {
        return (int) ((j * ((long) this.f15077b.f15017b)) / 1000000);
    }

    /* renamed from: a */
    private void m18273a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f15206m);
        int i2 = this.f15206m - min;
        System.arraycopy(bArr, i - i2, this.f15203j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f15203j, i2, min);
    }

    /* renamed from: a */
    private void m18274a(byte[] bArr, int i) {
        mo53007a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f15207n = true;
        }
    }

    /* renamed from: b */
    private void m18275b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f15202i.length));
        int g = m18280g(byteBuffer);
        if (g == byteBuffer.position()) {
            this.f15204k = 1;
        } else {
            byteBuffer.limit(g);
            m18278e(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: c */
    private void m18276c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f = m18279f(byteBuffer);
        int position = f - byteBuffer.position();
        byte[] bArr = this.f15202i;
        int length = bArr.length;
        int i = this.f15205l;
        int i2 = length - i;
        if (f >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f15202i, this.f15205l, min);
            int i3 = this.f15205l + min;
            this.f15205l = i3;
            byte[] bArr2 = this.f15202i;
            if (i3 == bArr2.length) {
                if (this.f15207n) {
                    m18274a(bArr2, this.f15206m);
                    this.f15208o += (long) ((this.f15205l - (this.f15206m * 2)) / this.f15200g);
                } else {
                    this.f15208o += (long) ((i3 - this.f15206m) / this.f15200g);
                }
                m18273a(byteBuffer, this.f15202i, this.f15205l);
                this.f15205l = 0;
                this.f15204k = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m18274a(bArr, i);
        this.f15205l = 0;
        this.f15204k = 0;
    }

    /* renamed from: d */
    private void m18277d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f = m18279f(byteBuffer);
        byteBuffer.limit(f);
        this.f15208o += (long) (byteBuffer.remaining() / this.f15200g);
        m18273a(byteBuffer, this.f15203j, this.f15206m);
        if (f < limit) {
            m18274a(this.f15203j, this.f15206m);
            this.f15204k = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: e */
    private void m18278e(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo53007a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f15207n = true;
        }
    }

    /* renamed from: f */
    private int m18279f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f15199f) {
                int i = this.f15200g;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: g */
    private int m18280g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f15199f) {
                int i = this.f15200g;
                return ((limit / i) * i) + i;
            }
        }
    }

    /* renamed from: a */
    public void mo52928a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !mo53009g()) {
            int i = this.f15204k;
            if (i == 0) {
                m18275b(byteBuffer);
            } else if (i == 1) {
                m18276c(byteBuffer);
            } else if (i == 2) {
                m18277d(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    public void mo53061a(boolean z) {
        this.f15201h = z;
    }

    /* renamed from: a */
    public boolean mo52929a() {
        return this.f15201h;
    }

    /* renamed from: b */
    public C6861f.C6862a mo53008b(C6861f.C6862a aVar) throws C6861f.C6863b {
        if (aVar.f15019d == 2) {
            return this.f15201h ? aVar : C6861f.C6862a.f15016a;
        }
        throw new C6861f.C6863b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo53010h() {
        int i = this.f15205l;
        if (i > 0) {
            m18274a(this.f15202i, i);
        }
        if (!this.f15207n) {
            this.f15208o += (long) (this.f15206m / this.f15200g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53011i() {
        if (this.f15201h) {
            this.f15200g = this.f15077b.f15020e;
            int a = m18272a(this.f15197d) * this.f15200g;
            if (this.f15202i.length != a) {
                this.f15202i = new byte[a];
            }
            int a2 = m18272a(this.f15198e) * this.f15200g;
            this.f15206m = a2;
            if (this.f15203j.length != a2) {
                this.f15203j = new byte[a2];
            }
        }
        this.f15204k = 0;
        this.f15208o = 0;
        this.f15205l = 0;
        this.f15207n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo53012j() {
        this.f15201h = false;
        this.f15206m = 0;
        this.f15202i = C7728ai.f18254f;
        this.f15203j = C7728ai.f18254f;
    }

    /* renamed from: k */
    public long mo53062k() {
        return this.f15208o;
    }
}
