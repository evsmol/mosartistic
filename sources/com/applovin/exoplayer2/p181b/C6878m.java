package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p221l.C7717a;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.m */
final class C6878m extends C6877l {

    /* renamed from: d */
    private int[] f15084d;

    /* renamed from: e */
    private int[] f15085e;

    C6878m() {
    }

    /* renamed from: a */
    public void mo52928a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C7717a.m22120b(this.f15085e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = mo53007a(((limit - position) / this.f15077b.f15020e) * this.f15078c.f15020e);
        while (position < limit) {
            for (int i : iArr) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f15077b.f15020e;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    /* renamed from: a */
    public void mo53013a(int[] iArr) {
        this.f15084d = iArr;
    }

    /* renamed from: b */
    public C6861f.C6862a mo53008b(C6861f.C6862a aVar) throws C6861f.C6863b {
        int[] iArr = this.f15084d;
        if (iArr == null) {
            return C6861f.C6862a.f15016a;
        }
        if (aVar.f15019d == 2) {
            boolean z = aVar.f15018c != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f15018c) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C6861f.C6863b(aVar);
                }
            }
            return z ? new C6861f.C6862a(aVar.f15017b, iArr.length, 2) : C6861f.C6862a.f15016a;
        }
        throw new C6861f.C6863b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo53011i() {
        this.f15085e = this.f15084d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo53012j() {
        this.f15085e = null;
        this.f15084d = null;
    }
}
