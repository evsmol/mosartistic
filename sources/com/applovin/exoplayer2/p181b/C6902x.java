package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.x */
final class C6902x extends C6877l {

    /* renamed from: d */
    private int f15246d;

    /* renamed from: e */
    private int f15247e;

    /* renamed from: f */
    private boolean f15248f;

    /* renamed from: g */
    private int f15249g;

    /* renamed from: h */
    private byte[] f15250h = C7728ai.f18254f;

    /* renamed from: i */
    private int f15251i;

    /* renamed from: j */
    private long f15252j;

    /* renamed from: a */
    public void mo53072a(int i, int i2) {
        this.f15246d = i;
        this.f15247e = i2;
    }

    /* renamed from: a */
    public void mo52928a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f15249g);
            this.f15252j += (long) (min / this.f15077b.f15020e);
            this.f15249g -= min;
            byteBuffer.position(position + min);
            if (this.f15249g <= 0) {
                int i2 = i - min;
                int length = (this.f15251i + i2) - this.f15250h.length;
                ByteBuffer a = mo53007a(length);
                int a2 = C7728ai.m22180a(length, 0, this.f15251i);
                a.put(this.f15250h, 0, a2);
                int a3 = C7728ai.m22180a(length - a2, 0, i2);
                byteBuffer.limit(byteBuffer.position() + a3);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - a3;
                int i4 = this.f15251i - a2;
                this.f15251i = i4;
                byte[] bArr = this.f15250h;
                System.arraycopy(bArr, a2, bArr, 0, i4);
                byteBuffer.get(this.f15250h, this.f15251i, i3);
                this.f15251i += i3;
                a.flip();
            }
        }
    }

    /* renamed from: b */
    public C6861f.C6862a mo53008b(C6861f.C6862a aVar) throws C6861f.C6863b {
        if (aVar.f15019d == 2) {
            this.f15248f = true;
            return (this.f15246d == 0 && this.f15247e == 0) ? C6861f.C6862a.f15016a : aVar;
        }
        throw new C6861f.C6863b(aVar);
    }

    /* renamed from: c */
    public ByteBuffer mo52931c() {
        int i;
        if (super.mo52932d() && (i = this.f15251i) > 0) {
            mo53007a(i).put(this.f15250h, 0, this.f15251i).flip();
            this.f15251i = 0;
        }
        return super.mo52931c();
    }

    /* renamed from: d */
    public boolean mo52932d() {
        return super.mo52932d() && this.f15251i == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo53010h() {
        if (this.f15248f) {
            int i = this.f15251i;
            if (i > 0) {
                this.f15252j += (long) (i / this.f15077b.f15020e);
            }
            this.f15251i = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53011i() {
        if (this.f15248f) {
            this.f15248f = false;
            this.f15250h = new byte[(this.f15247e * this.f15077b.f15020e)];
            this.f15249g = this.f15246d * this.f15077b.f15020e;
        }
        this.f15251i = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo53012j() {
        this.f15250h = C7728ai.f18254f;
    }

    /* renamed from: k */
    public void mo53073k() {
        this.f15252j = 0;
    }

    /* renamed from: l */
    public long mo53074l() {
        return this.f15252j;
    }
}
