package com.applovin.exoplayer2.p186e.p191e;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p221l.C7717a;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.applovin.exoplayer2.e.e.a */
final class C7211a implements C7215c {

    /* renamed from: a */
    private final byte[] f15912a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C7213a> f15913b = new ArrayDeque<>();

    /* renamed from: c */
    private final C7222f f15914c = new C7222f();

    /* renamed from: d */
    private C7214b f15915d;

    /* renamed from: e */
    private int f15916e;

    /* renamed from: f */
    private int f15917f;

    /* renamed from: g */
    private long f15918g;

    /* renamed from: com.applovin.exoplayer2.e.e.a$a */
    private static final class C7213a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f15919a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f15920b;

        private C7213a(int i, long j) {
            this.f15919a = i;
            this.f15920b = j;
        }
    }

    /* renamed from: a */
    private long m19462a(C7279i iVar, int i) throws IOException {
        iVar.mo53903b(this.f15912a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f15912a[i2] & 255));
        }
        return j;
    }

    /* renamed from: b */
    private double m19463b(C7279i iVar, int i) throws IOException {
        long a = m19462a(iVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) a) : Double.longBitsToDouble(a);
    }

    /* renamed from: b */
    private long m19464b(C7279i iVar) throws IOException {
        iVar.mo53899a();
        while (true) {
            iVar.mo53908d(this.f15912a, 0, 4);
            int a = C7222f.m19547a(this.f15912a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) C7222f.m19548a(this.f15912a, a, false);
                if (this.f15915d.mo53918b(a2)) {
                    iVar.mo53902b(a);
                    return (long) a2;
                }
            }
            iVar.mo53902b(1);
        }
    }

    /* renamed from: c */
    private static String m19465c(C7279i iVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        iVar.mo53903b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public void mo53909a() {
        this.f15916e = 0;
        this.f15913b.clear();
        this.f15914c.mo53939a();
    }

    /* renamed from: a */
    public void mo53910a(C7214b bVar) {
        this.f15915d = bVar;
    }

    /* renamed from: a */
    public boolean mo53911a(C7279i iVar) throws IOException {
        C7717a.m22115a(this.f15915d);
        while (true) {
            C7213a peek = this.f15913b.peek();
            if (peek == null || iVar.mo53892c() < peek.f15920b) {
                if (this.f15916e == 0) {
                    long a = this.f15914c.mo53938a(iVar, true, false, 4);
                    if (a == -2) {
                        a = m19464b(iVar);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f15917f = (int) a;
                    this.f15916e = 1;
                }
                if (this.f15916e == 1) {
                    this.f15918g = this.f15914c.mo53938a(iVar, false, true, 8);
                    this.f15916e = 2;
                }
                int a2 = this.f15915d.mo53912a(this.f15917f);
                if (a2 == 0) {
                    iVar.mo53902b((int) this.f15918g);
                    this.f15916e = 0;
                } else if (a2 == 1) {
                    long c = iVar.mo53892c();
                    this.f15913b.push(new C7213a(this.f15917f, this.f15918g + c));
                    this.f15915d.mo53916a(this.f15917f, c, this.f15918g);
                    this.f15916e = 0;
                    return true;
                } else if (a2 == 2) {
                    long j = this.f15918g;
                    if (j <= 8) {
                        this.f15915d.mo53915a(this.f15917f, m19462a(iVar, (int) j));
                        this.f15916e = 0;
                        return true;
                    }
                    throw C6809ai.m17540b("Invalid integer size: " + this.f15918g, (Throwable) null);
                } else if (a2 == 3) {
                    long j2 = this.f15918g;
                    if (j2 <= 2147483647L) {
                        this.f15915d.mo53917a(this.f15917f, m19465c(iVar, (int) j2));
                        this.f15916e = 0;
                        return true;
                    }
                    throw C6809ai.m17540b("String element size: " + this.f15918g, (Throwable) null);
                } else if (a2 == 4) {
                    this.f15915d.mo53914a(this.f15917f, (int) this.f15918g, iVar);
                    this.f15916e = 0;
                    return true;
                } else if (a2 == 5) {
                    long j3 = this.f15918g;
                    if (j3 == 4 || j3 == 8) {
                        this.f15915d.mo53913a(this.f15917f, m19463b(iVar, (int) this.f15918g));
                        this.f15916e = 0;
                        return true;
                    }
                    throw C6809ai.m17540b("Invalid float size: " + this.f15918g, (Throwable) null);
                } else {
                    throw C6809ai.m17540b("Invalid element type " + a2, (Throwable) null);
                }
            } else {
                this.f15915d.mo53919c(this.f15913b.pop().f15919a);
                return true;
            }
        }
    }
}
