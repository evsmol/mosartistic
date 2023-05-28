package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p181b.C6861f;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.p */
final class C6891p extends C6877l {

    /* renamed from: d */
    private static final int f15169d = Float.floatToIntBits(Float.NaN);

    C6891p() {
    }

    /* renamed from: a */
    private static void m18203a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f15169d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: a */
    public void mo52928a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f15077b.f15019d;
        if (i2 == 536870912) {
            byteBuffer2 = mo53007a((i / 3) * 4);
            while (position < limit) {
                m18203a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo53007a(i);
            while (position < limit) {
                m18203a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: b */
    public C6861f.C6862a mo53008b(C6861f.C6862a aVar) throws C6861f.C6863b {
        int i = aVar.f15019d;
        if (C7728ai.m22257e(i)) {
            return i != 4 ? new C6861f.C6862a(aVar.f15017b, aVar.f15018c, 4) : C6861f.C6862a.f15016a;
        }
        throw new C6861f.C6863b(aVar);
    }
}
