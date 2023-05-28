package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.e */
public final class C7210e implements C7279i {

    /* renamed from: a */
    private final byte[] f15905a = new byte[4096];

    /* renamed from: b */
    private final C7668g f15906b;

    /* renamed from: c */
    private final long f15907c;

    /* renamed from: d */
    private long f15908d;

    /* renamed from: e */
    private byte[] f15909e = new byte[65536];

    /* renamed from: f */
    private int f15910f;

    /* renamed from: g */
    private int f15911g;

    public C7210e(C7668g gVar, long j, long j2) {
        this.f15906b = gVar;
        this.f15908d = j;
        this.f15907c = j2;
    }

    /* renamed from: a */
    private int m19440a(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int a = this.f15906b.mo53898a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: d */
    private void m19441d(int i) {
        int i2 = this.f15910f + i;
        byte[] bArr = this.f15909e;
        if (i2 > bArr.length) {
            this.f15909e = Arrays.copyOf(this.f15909e, C7728ai.m22180a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: e */
    private int m19442e(int i) {
        int min = Math.min(this.f15911g, i);
        m19444f(min);
        return min;
    }

    /* renamed from: e */
    private int m19443e(byte[] bArr, int i, int i2) {
        int i3 = this.f15911g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f15909e, 0, bArr, i, min);
        m19444f(min);
        return min;
    }

    /* renamed from: f */
    private void m19444f(int i) {
        int i2 = this.f15911g - i;
        this.f15911g = i2;
        this.f15910f = 0;
        byte[] bArr = this.f15909e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f15909e, i, bArr, 0, this.f15911g);
        this.f15909e = bArr;
    }

    /* renamed from: g */
    private void m19445g(int i) {
        if (i != -1) {
            this.f15908d += (long) i;
        }
    }

    /* renamed from: a */
    public int mo53897a(int i) throws IOException {
        int e = m19442e(i);
        if (e == 0) {
            byte[] bArr = this.f15905a;
            e = m19440a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m19445g(e);
        return e;
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws IOException {
        int e = m19443e(bArr, i, i2);
        if (e == 0) {
            e = m19440a(bArr, i, i2, 0, true);
        }
        m19445g(e);
        return e;
    }

    /* renamed from: a */
    public void mo53899a() {
        this.f15910f = 0;
    }

    /* renamed from: a */
    public boolean mo53900a(int i, boolean z) throws IOException {
        int e = m19442e(i);
        while (e < i && e != -1) {
            e = m19440a(this.f15905a, -e, Math.min(i, this.f15905a.length + e), e, z);
        }
        m19445g(e);
        return e != -1;
    }

    /* renamed from: a */
    public boolean mo53901a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int e = m19443e(bArr, i, i2);
        while (e < i2 && e != -1) {
            e = m19440a(bArr, i, i2, e, z);
        }
        m19445g(e);
        return e != -1;
    }

    /* renamed from: b */
    public long mo53891b() {
        return this.f15908d + ((long) this.f15910f);
    }

    /* renamed from: b */
    public void mo53902b(int i) throws IOException {
        mo53900a(i, false);
    }

    /* renamed from: b */
    public void mo53903b(byte[] bArr, int i, int i2) throws IOException {
        mo53901a(bArr, i, i2, false);
    }

    /* renamed from: b */
    public boolean mo53904b(int i, boolean z) throws IOException {
        m19441d(i);
        int i2 = this.f15911g - this.f15910f;
        while (i2 < i) {
            i2 = m19440a(this.f15909e, this.f15910f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f15911g = this.f15910f + i2;
        }
        this.f15910f += i;
        return true;
    }

    /* renamed from: b */
    public boolean mo53905b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo53904b(i2, z)) {
            return false;
        }
        System.arraycopy(this.f15909e, this.f15910f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public int mo53906c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m19441d(i2);
        int i4 = this.f15911g;
        int i5 = this.f15910f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m19440a(this.f15909e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f15911g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f15909e, this.f15910f, bArr, i, i3);
        this.f15910f += i3;
        return i3;
    }

    /* renamed from: c */
    public long mo53892c() {
        return this.f15908d;
    }

    /* renamed from: c */
    public void mo53907c(int i) throws IOException {
        mo53904b(i, false);
    }

    /* renamed from: d */
    public long mo53893d() {
        return this.f15907c;
    }

    /* renamed from: d */
    public void mo53908d(byte[] bArr, int i, int i2) throws IOException {
        mo53905b(bArr, i, i2, false);
    }
}
