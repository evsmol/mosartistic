package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p182c.C6916c;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p206h.C7529w;
import com.applovin.exoplayer2.p220k.C7653a;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.h.v */
class C7527v {

    /* renamed from: a */
    private final C7657b f17345a;

    /* renamed from: b */
    private final int f17346b;

    /* renamed from: c */
    private final C7772y f17347c = new C7772y(32);

    /* renamed from: d */
    private C7528a f17348d;

    /* renamed from: e */
    private C7528a f17349e;

    /* renamed from: f */
    private C7528a f17350f;

    /* renamed from: g */
    private long f17351g;

    /* renamed from: com.applovin.exoplayer2.h.v$a */
    private static final class C7528a {

        /* renamed from: a */
        public final long f17352a;

        /* renamed from: b */
        public final long f17353b;

        /* renamed from: c */
        public boolean f17354c;

        /* renamed from: d */
        public C7653a f17355d;

        /* renamed from: e */
        public C7528a f17356e;

        public C7528a(long j, int i) {
            this.f17352a = j;
            this.f17353b = j + ((long) i);
        }

        /* renamed from: a */
        public int mo54592a(long j) {
            return ((int) (j - this.f17352a)) + this.f17355d.f18016b;
        }

        /* renamed from: a */
        public C7528a mo54593a() {
            this.f17355d = null;
            C7528a aVar = this.f17356e;
            this.f17356e = null;
            return aVar;
        }

        /* renamed from: a */
        public void mo54594a(C7653a aVar, C7528a aVar2) {
            this.f17355d = aVar;
            this.f17356e = aVar2;
            this.f17354c = true;
        }
    }

    public C7527v(C7657b bVar) {
        this.f17345a = bVar;
        this.f17346b = bVar.mo54889c();
        C7528a aVar = new C7528a(0, this.f17346b);
        this.f17348d = aVar;
        this.f17349e = aVar;
        this.f17350f = aVar;
    }

    /* renamed from: a */
    private int m21145a(int i) {
        if (!this.f17350f.f17354c) {
            this.f17350f.mo54594a(this.f17345a.mo54885a(), new C7528a(this.f17350f.f17353b, this.f17346b));
        }
        return Math.min(i, (int) (this.f17350f.f17353b - this.f17351g));
    }

    /* renamed from: a */
    private static C7528a m21146a(C7528a aVar, long j) {
        while (j >= aVar.f17353b) {
            aVar = aVar.f17356e;
        }
        return aVar;
    }

    /* renamed from: a */
    private static C7528a m21147a(C7528a aVar, long j, ByteBuffer byteBuffer, int i) {
        C7528a a = m21146a(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (a.f17353b - j));
            byteBuffer.put(a.f17355d.f18015a, a.mo54592a(j), min);
            i -= min;
            j += (long) min;
            if (j == a.f17353b) {
                a = a.f17356e;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static C7528a m21148a(C7528a aVar, long j, byte[] bArr, int i) {
        C7528a a = m21146a(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (a.f17353b - j));
            System.arraycopy(a.f17355d.f18015a, a.mo54592a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == a.f17353b) {
                a = a.f17356e;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static C7528a m21149a(C7528a aVar, C6922g gVar, C7529w.C7531a aVar2, C7772y yVar) {
        ByteBuffer byteBuffer;
        long j;
        if (gVar.mo53142g()) {
            aVar = m21151b(aVar, gVar, aVar2, yVar);
        }
        if (gVar.mo53129e()) {
            yVar.mo55067a(4);
            C7528a a = m21148a(aVar, aVar2.f17392b, yVar.mo55077d(), 4);
            int w = yVar.mo55099w();
            aVar2.f17392b += 4;
            aVar2.f17391a -= 4;
            gVar.mo53141f(w);
            aVar = m21147a(a, aVar2.f17392b, gVar.f15332b, w);
            aVar2.f17392b += (long) w;
            aVar2.f17391a -= w;
            gVar.mo53140e(aVar2.f17391a);
            j = aVar2.f17392b;
            byteBuffer = gVar.f15335e;
        } else {
            gVar.mo53141f(aVar2.f17391a);
            j = aVar2.f17392b;
            byteBuffer = gVar.f15332b;
        }
        return m21147a(aVar, j, byteBuffer, aVar2.f17391a);
    }

    /* renamed from: a */
    private void m21150a(C7528a aVar) {
        if (aVar.f17354c) {
            int i = (this.f17350f.f17354c ? 1 : 0) + (((int) (this.f17350f.f17352a - aVar.f17352a)) / this.f17346b);
            C7653a[] aVarArr = new C7653a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f17355d;
                aVar = aVar.mo54593a();
            }
            this.f17345a.mo54887a(aVarArr);
        }
    }

    /* renamed from: b */
    private static C7528a m21151b(C7528a aVar, C6922g gVar, C7529w.C7531a aVar2, C7772y yVar) {
        int i;
        C7529w.C7531a aVar3 = aVar2;
        C7772y yVar2 = yVar;
        long j = aVar3.f17392b;
        yVar2.mo55067a(1);
        C7528a a = m21148a(aVar, j, yVar.mo55077d(), 1);
        long j2 = j + 1;
        byte b = yVar.mo55077d()[0];
        boolean z = (b & 128) != 0;
        byte b2 = b & Ascii.DEL;
        C6916c cVar = gVar.f15331a;
        if (cVar.f15308a == null) {
            cVar.f15308a = new byte[16];
        } else {
            Arrays.fill(cVar.f15308a, (byte) 0);
        }
        C7528a a2 = m21148a(a, j2, cVar.f15308a, (int) b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            yVar2.mo55067a(2);
            a2 = m21148a(a2, j3, yVar.mo55077d(), 2);
            j3 += 2;
            i = yVar.mo55085i();
        } else {
            i = 1;
        }
        int[] iArr = cVar.f15311d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f15312e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            yVar2.mo55067a(i2);
            a2 = m21148a(a2, j3, yVar.mo55077d(), i2);
            j3 += (long) i2;
            yVar2.mo55076d(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = yVar.mo55085i();
                iArr4[i3] = yVar.mo55099w();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar3.f17391a - ((int) (j3 - aVar3.f17392b));
        }
        C7357x.C7358a aVar4 = (C7357x.C7358a) C7728ai.m22198a(aVar3.f17393c);
        cVar.mo53132a(i, iArr2, iArr4, aVar4.f16783b, cVar.f15308a, aVar4.f16782a, aVar4.f16784c, aVar4.f16785d);
        int i4 = (int) (j3 - aVar3.f17392b);
        aVar3.f17392b += (long) i4;
        aVar3.f17391a -= i4;
        return a2;
    }

    /* renamed from: b */
    private void m21152b(int i) {
        long j = this.f17351g + ((long) i);
        this.f17351g = j;
        if (j == this.f17350f.f17353b) {
            this.f17350f = this.f17350f.f17356e;
        }
    }

    /* renamed from: a */
    public int mo54584a(C7668g gVar, int i, boolean z) throws IOException {
        int a = gVar.mo53898a(this.f17350f.f17355d.f18015a, this.f17350f.mo54592a(this.f17351g), m21145a(i));
        if (a != -1) {
            m21152b(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public void mo54585a() {
        m21150a(this.f17348d);
        C7528a aVar = new C7528a(0, this.f17346b);
        this.f17348d = aVar;
        this.f17349e = aVar;
        this.f17350f = aVar;
        this.f17351g = 0;
        this.f17345a.mo54888b();
    }

    /* renamed from: a */
    public void mo54586a(long j) {
        if (j != -1) {
            while (j >= this.f17348d.f17353b) {
                this.f17345a.mo54886a(this.f17348d.f17355d);
                this.f17348d = this.f17348d.mo54593a();
            }
            if (this.f17349e.f17352a < this.f17348d.f17352a) {
                this.f17349e = this.f17348d;
            }
        }
    }

    /* renamed from: a */
    public void mo54587a(C6922g gVar, C7529w.C7531a aVar) {
        this.f17349e = m21149a(this.f17349e, gVar, aVar, this.f17347c);
    }

    /* renamed from: a */
    public void mo54588a(C7772y yVar, int i) {
        while (i > 0) {
            int a = m21145a(i);
            yVar.mo55071a(this.f17350f.f17355d.f18015a, this.f17350f.mo54592a(this.f17351g), a);
            i -= a;
            m21152b(a);
        }
    }

    /* renamed from: b */
    public void mo54589b() {
        this.f17349e = this.f17348d;
    }

    /* renamed from: b */
    public void mo54590b(C6922g gVar, C7529w.C7531a aVar) {
        m21149a(this.f17349e, gVar, aVar, this.f17347c);
    }

    /* renamed from: c */
    public long mo54591c() {
        return this.f17351g;
    }
}
