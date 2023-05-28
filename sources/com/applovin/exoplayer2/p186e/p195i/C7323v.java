package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.v */
final class C7323v {

    /* renamed from: a */
    private final C7726ag f16667a = new C7726ag(0);

    /* renamed from: b */
    private final C7772y f16668b = new C7772y();

    /* renamed from: c */
    private boolean f16669c;

    /* renamed from: d */
    private boolean f16670d;

    /* renamed from: e */
    private boolean f16671e;

    /* renamed from: f */
    private long f16672f = -9223372036854775807L;

    /* renamed from: g */
    private long f16673g = -9223372036854775807L;

    /* renamed from: h */
    private long f16674h = -9223372036854775807L;

    C7323v() {
    }

    /* renamed from: a */
    private int m20152a(C7279i iVar) {
        this.f16668b.mo55069a(C7728ai.f18254f);
        this.f16669c = true;
        iVar.mo53899a();
        return 0;
    }

    /* renamed from: a */
    private int m20153a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static long m20154a(C7772y yVar) {
        int c = yVar.mo55074c();
        if (yVar.mo55064a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.mo55071a(bArr, 0, 9);
        yVar.mo55076d(c);
        if (!m20155a(bArr)) {
            return -9223372036854775807L;
        }
        return m20158b(bArr);
    }

    /* renamed from: a */
    private static boolean m20155a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: b */
    private int m20156b(C7279i iVar, C7352u uVar) throws IOException {
        int min = (int) Math.min(20000, iVar.mo53893d());
        long j = (long) 0;
        if (iVar.mo53892c() != j) {
            uVar.f16774a = j;
            return 1;
        }
        this.f16668b.mo55067a(min);
        iVar.mo53899a();
        iVar.mo53908d(this.f16668b.mo55077d(), 0, min);
        this.f16672f = m20157b(this.f16668b);
        this.f16670d = true;
        return 0;
    }

    /* renamed from: b */
    private long m20157b(C7772y yVar) {
        int b = yVar.mo55072b();
        for (int c = yVar.mo55074c(); c < b - 3; c++) {
            if (m20153a(yVar.mo55077d(), c) == 442) {
                yVar.mo55076d(c + 4);
                long a = m20154a(yVar);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    private static long m20158b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: c */
    private int m20159c(C7279i iVar, C7352u uVar) throws IOException {
        long d = iVar.mo53893d();
        int min = (int) Math.min(20000, d);
        long j = d - ((long) min);
        if (iVar.mo53892c() != j) {
            uVar.f16774a = j;
            return 1;
        }
        this.f16668b.mo55067a(min);
        iVar.mo53899a();
        iVar.mo53908d(this.f16668b.mo55077d(), 0, min);
        this.f16673g = m20160c(this.f16668b);
        this.f16671e = true;
        return 0;
    }

    /* renamed from: c */
    private long m20160c(C7772y yVar) {
        int c = yVar.mo55074c();
        for (int b = yVar.mo55072b() - 4; b >= c; b--) {
            if (m20153a(yVar.mo55077d(), b) == 442) {
                yVar.mo55076d(b + 4);
                long a = m20154a(yVar);
                if (a != -9223372036854775807L) {
                    return a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public int mo54065a(C7279i iVar, C7352u uVar) throws IOException {
        if (!this.f16671e) {
            return m20159c(iVar, uVar);
        }
        if (this.f16673g == -9223372036854775807L) {
            return m20152a(iVar);
        }
        if (!this.f16670d) {
            return m20156b(iVar, uVar);
        }
        long j = this.f16672f;
        if (j == -9223372036854775807L) {
            return m20152a(iVar);
        }
        long b = this.f16667a.mo54989b(this.f16673g) - this.f16667a.mo54989b(j);
        this.f16674h = b;
        if (b < 0) {
            C7755q.m22361c("PsDurationReader", "Invalid duration: " + this.f16674h + ". Using TIME_UNSET instead.");
            this.f16674h = -9223372036854775807L;
        }
        return m20152a(iVar);
    }

    /* renamed from: a */
    public boolean mo54066a() {
        return this.f16669c;
    }

    /* renamed from: b */
    public C7726ag mo54067b() {
        return this.f16667a;
    }

    /* renamed from: c */
    public long mo54068c() {
        return this.f16674h;
    }
}
