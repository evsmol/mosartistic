package com.applovin.exoplayer2.p186e.p187a;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7202d;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.a.a */
public final class C7189a implements C7262h {

    /* renamed from: a */
    public static final C7340l f15798a = $$Lambda$a$KDgqD9ThGuSDD_G_B5kq2FWtrM.INSTANCE;

    /* renamed from: b */
    private static final int[] f15799b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f15800c = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    private static final byte[] f15801d = C7728ai.m22250c("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f15802e = C7728ai.m22250c("#!AMR-WB\n");

    /* renamed from: f */
    private static final int f15803f = f15800c[8];

    /* renamed from: g */
    private final byte[] f15804g;

    /* renamed from: h */
    private final int f15805h;

    /* renamed from: i */
    private boolean f15806i;

    /* renamed from: j */
    private long f15807j;

    /* renamed from: k */
    private int f15808k;

    /* renamed from: l */
    private int f15809l;

    /* renamed from: m */
    private boolean f15810m;

    /* renamed from: n */
    private long f15811n;

    /* renamed from: o */
    private int f15812o;

    /* renamed from: p */
    private int f15813p;

    /* renamed from: q */
    private long f15814q;

    /* renamed from: r */
    private C7329j f15815r;

    /* renamed from: s */
    private C7357x f15816s;

    /* renamed from: t */
    private C7353v f15817t;

    /* renamed from: u */
    private boolean f15818u;

    public C7189a() {
        this(0);
    }

    public C7189a(int i) {
        this.f15805h = (i & 2) != 0 ? i | 1 : i;
        this.f15804g = new byte[1];
        this.f15812o = -1;
    }

    /* renamed from: a */
    private int m19322a(int i) throws C6809ai {
        if (m19329b(i)) {
            return this.f15806i ? f15800c[i] : f15799b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f15806i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C6809ai.m17540b(sb.toString(), (Throwable) null);
    }

    /* renamed from: a */
    private static int m19323a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    /* renamed from: a */
    private C7353v m19324a(long j, boolean z) {
        return new C7202d(j, this.f15811n, m19323a(this.f15812o, 20000), this.f15812o, z);
    }

    /* renamed from: a */
    private void m19325a() {
        if (!this.f15818u) {
            this.f15818u = true;
            this.f15816s.mo53953a(new C7864v.C7866a().mo55435f(this.f15806i ? "audio/amr-wb" : "audio/3gpp").mo55434f(f15803f).mo55440k(1).mo55441l(this.f15806i ? 16000 : 8000).mo55424a());
        }
    }

    /* renamed from: a */
    private void m19326a(long j, int i) {
        C7353v vVar;
        int i2;
        if (!this.f15810m) {
            if ((this.f15805h & 1) == 0 || j == -1 || !((i2 = this.f15812o) == -1 || i2 == this.f15808k)) {
                vVar = new C7353v.C7355b(-9223372036854775807L);
            } else if (this.f15813p >= 20 || i == -1) {
                vVar = m19324a(j, (this.f15805h & 2) != 0);
            } else {
                return;
            }
            this.f15817t = vVar;
            this.f15815r.mo53896a(vVar);
            this.f15810m = true;
        }
    }

    /* renamed from: a */
    private static boolean m19327a(C7279i iVar, byte[] bArr) throws IOException {
        iVar.mo53899a();
        byte[] bArr2 = new byte[bArr.length];
        iVar.mo53908d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: b */
    private void m19328b() {
        C7717a.m22115a(this.f15816s);
        C7728ai.m22198a(this.f15815r);
    }

    /* renamed from: b */
    private boolean m19329b(int i) {
        return i >= 0 && i <= 15 && (m19332c(i) || m19334d(i));
    }

    /* renamed from: b */
    private boolean m19330b(C7279i iVar) throws IOException {
        int length;
        if (m19327a(iVar, f15801d)) {
            this.f15806i = false;
            length = f15801d.length;
        } else if (!m19327a(iVar, f15802e)) {
            return false;
        } else {
            this.f15806i = true;
            length = f15802e.length;
        }
        iVar.mo53902b(length);
        return true;
    }

    /* renamed from: c */
    private int m19331c(C7279i iVar) throws IOException {
        if (this.f15809l == 0) {
            try {
                int d = m19333d(iVar);
                this.f15808k = d;
                this.f15809l = d;
                if (this.f15812o == -1) {
                    this.f15811n = iVar.mo53892c();
                    this.f15812o = this.f15808k;
                }
                if (this.f15812o == this.f15808k) {
                    this.f15813p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a = this.f15816s.mo53948a((C7668g) iVar, this.f15809l, true);
        if (a == -1) {
            return -1;
        }
        int i = this.f15809l - a;
        this.f15809l = i;
        if (i > 0) {
            return 0;
        }
        this.f15816s.mo53950a(this.f15814q + this.f15807j, 1, this.f15808k, 0, (C7357x.C7358a) null);
        this.f15807j += 20000;
        return 0;
    }

    /* renamed from: c */
    private boolean m19332c(int i) {
        return this.f15806i && (i < 10 || i > 13);
    }

    /* renamed from: d */
    private int m19333d(C7279i iVar) throws IOException {
        iVar.mo53899a();
        iVar.mo53908d(this.f15804g, 0, 1);
        byte b = this.f15804g[0];
        if ((b & 131) <= 0) {
            return m19322a((b >> 3) & 15);
        }
        throw C6809ai.m17540b("Invalid padding bits for frame header " + b, (Throwable) null);
    }

    /* renamed from: d */
    private boolean m19334d(int i) {
        return !this.f15806i && (i < 12 || i > 14);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C7262h[] m19335d() {
        return new C7262h[]{new C7189a()};
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        m19328b();
        if (iVar.mo53892c() != 0 || m19330b(iVar)) {
            m19325a();
            int c = m19331c(iVar);
            m19326a(iVar.mo53893d(), c);
            return c;
        }
        throw C6809ai.m17540b("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f15807j = 0;
        this.f15808k = 0;
        this.f15809l = 0;
        if (j != 0) {
            C7353v vVar = this.f15817t;
            if (vVar instanceof C7202d) {
                this.f15814q = ((C7202d) vVar).mo53889b(j);
                return;
            }
        }
        this.f15814q = 0;
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f15815r = jVar;
        this.f15816s = jVar.mo53894a(0, 1);
        jVar.mo53895a();
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        return m19330b(iVar);
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
