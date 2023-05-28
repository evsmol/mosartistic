package com.applovin.exoplayer2.p206h;

import android.net.Uri;
import android.os.Handler;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C6832av;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p185d.C7157h;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p202d.C7418b;
import com.applovin.exoplayer2.p206h.C7497i;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p206h.C7529w;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7674l;
import com.applovin.exoplayer2.p220k.C7699v;
import com.applovin.exoplayer2.p220k.C7701w;
import com.applovin.exoplayer2.p220k.C7715z;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7735g;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.h.t */
final class C7518t implements C7329j, C7506n, C7529w.C7533c, C7701w.C7703a<C7519a>, C7701w.C7707e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<String, String> f17262b = m21083t();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C7864v f17263c = new C7864v.C7866a().mo55421a("icy").mo55435f("application/x-icy").mo55424a();

    /* renamed from: A */
    private C7523e f17264A;

    /* renamed from: B */
    private C7353v f17265B;

    /* renamed from: C */
    private long f17266C;

    /* renamed from: D */
    private boolean f17267D;

    /* renamed from: E */
    private int f17268E;

    /* renamed from: F */
    private boolean f17269F;

    /* renamed from: G */
    private boolean f17270G;

    /* renamed from: H */
    private int f17271H;

    /* renamed from: I */
    private long f17272I;

    /* renamed from: J */
    private long f17273J;

    /* renamed from: K */
    private long f17274K;

    /* renamed from: L */
    private boolean f17275L;

    /* renamed from: M */
    private int f17276M;

    /* renamed from: N */
    private boolean f17277N;

    /* renamed from: O */
    private boolean f17278O;

    /* renamed from: d */
    private final Uri f17279d;

    /* renamed from: e */
    private final C7670i f17280e;

    /* renamed from: f */
    private final C7157h f17281f;

    /* renamed from: g */
    private final C7699v f17282g;

    /* renamed from: h */
    private final C7512q.C7513a f17283h;

    /* renamed from: i */
    private final C7154g.C7155a f17284i;

    /* renamed from: j */
    private final C7520b f17285j;

    /* renamed from: k */
    private final C7657b f17286k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final String f17287l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f17288m;

    /* renamed from: n */
    private final C7701w f17289n = new C7701w("ProgressiveMediaPeriod");

    /* renamed from: o */
    private final C7516s f17290o;

    /* renamed from: p */
    private final C7735g f17291p;

    /* renamed from: q */
    private final Runnable f17292q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f17293r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Handler f17294s;

    /* renamed from: t */
    private C7506n.C7507a f17295t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C7418b f17296u;

    /* renamed from: v */
    private C7529w[] f17297v;

    /* renamed from: w */
    private C7522d[] f17298w;

    /* renamed from: x */
    private boolean f17299x;

    /* renamed from: y */
    private boolean f17300y;

    /* renamed from: z */
    private boolean f17301z;

    /* renamed from: com.applovin.exoplayer2.h.t$a */
    final class C7519a implements C7497i.C7498a, C7701w.C7706d {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f17303b = C7499j.m20942a();

        /* renamed from: c */
        private final Uri f17304c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C7715z f17305d;

        /* renamed from: e */
        private final C7516s f17306e;

        /* renamed from: f */
        private final C7329j f17307f;

        /* renamed from: g */
        private final C7735g f17308g;

        /* renamed from: h */
        private final C7352u f17309h = new C7352u();

        /* renamed from: i */
        private volatile boolean f17310i;

        /* renamed from: j */
        private boolean f17311j = true;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f17312k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C7674l f17313l = m21116a(0);
        /* access modifiers changed from: private */

        /* renamed from: m */
        public long f17314m = -1;

        /* renamed from: n */
        private C7357x f17315n;

        /* renamed from: o */
        private boolean f17316o;

        public C7519a(Uri uri, C7670i iVar, C7516s sVar, C7329j jVar, C7735g gVar) {
            this.f17304c = uri;
            this.f17305d = new C7715z(iVar);
            this.f17306e = sVar;
            this.f17307f = jVar;
            this.f17308g = gVar;
        }

        /* renamed from: a */
        private C7674l m21116a(long j) {
            return new C7674l.C7676a().mo54912a(this.f17304c).mo54911a(j).mo54918b(C7518t.this.f17287l).mo54917b(6).mo54914a((Map<String, String>) C7518t.f17262b).mo54916a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m21118a(long j, long j2) {
            this.f17309h.f16774a = j;
            this.f17312k = j2;
            this.f17311j = true;
            this.f17316o = false;
        }

        /* renamed from: a */
        public void mo54578a() {
            this.f17310i = true;
        }

        /* renamed from: a */
        public void mo54527a(C7772y yVar) {
            long max = !this.f17316o ? this.f17312k : Math.max(C7518t.this.m21080q(), this.f17312k);
            int a = yVar.mo55064a();
            C7357x xVar = (C7357x) C7717a.m22120b(this.f17315n);
            xVar.mo53951a(yVar, a);
            xVar.mo53950a(max, 1, a, 0, (C7357x.C7358a) null);
            this.f17316o = true;
        }

        /* renamed from: b */
        public void mo54579b() throws IOException {
            int i = 0;
            while (i == 0 && !this.f17310i) {
                try {
                    long j = this.f17309h.f16774a;
                    C7674l a = m21116a(j);
                    this.f17313l = a;
                    long a2 = this.f17305d.mo54522a(a);
                    this.f17314m = a2;
                    if (a2 != -1) {
                        this.f17314m = a2 + j;
                    }
                    C7418b unused = C7518t.this.f17296u = C7418b.m20657a(this.f17305d.mo54525b());
                    C7668g gVar = this.f17305d;
                    if (!(C7518t.this.f17296u == null || C7518t.this.f17296u.f17011f == -1)) {
                        gVar = new C7497i(this.f17305d, C7518t.this.f17296u.f17011f, this);
                        C7357x j2 = C7518t.this.mo54577j();
                        this.f17315n = j2;
                        j2.mo53953a(C7518t.f17263c);
                    }
                    C7516s sVar = this.f17306e;
                    Uri uri = this.f17304c;
                    Map<String, List<String>> b = this.f17305d.mo54525b();
                    long j3 = this.f17314m;
                    long j4 = j;
                    sVar.mo54490a(gVar, uri, b, j, j3, this.f17307f);
                    if (C7518t.this.f17296u != null) {
                        this.f17306e.mo54491b();
                    }
                    if (this.f17311j) {
                        this.f17306e.mo54489a(j4, this.f17312k);
                        this.f17311j = false;
                    }
                    while (true) {
                        long j5 = j4;
                        while (i == 0 && !this.f17310i) {
                            this.f17308g.mo54994c();
                            i = this.f17306e.mo54487a(this.f17309h);
                            j4 = this.f17306e.mo54492c();
                            if (j4 > C7518t.this.f17288m + j5) {
                                this.f17308g.mo54993b();
                                C7518t.this.f17294s.post(C7518t.this.f17293r);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f17306e.mo54492c() != -1) {
                        this.f17309h.f16774a = this.f17306e.mo54492c();
                    }
                    C7728ai.m22209a((C7670i) this.f17305d);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i == 1 || this.f17306e.mo54492c() == -1)) {
                        this.f17309h.f16774a = this.f17306e.mo54492c();
                    }
                    C7728ai.m22209a((C7670i) this.f17305d);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.t$b */
    interface C7520b {
        /* renamed from: a */
        void mo54580a(long j, boolean z, boolean z2);
    }

    /* renamed from: com.applovin.exoplayer2.h.t$c */
    private final class C7521c implements C7534x {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f17318b;

        public C7521c(int i) {
            this.f17318b = i;
        }

        /* renamed from: a */
        public int mo54511a(long j) {
            return C7518t.this.mo54563a(this.f17318b, j);
        }

        /* renamed from: a */
        public int mo54512a(C7867w wVar, C6922g gVar, int i) {
            return C7518t.this.mo54564a(this.f17318b, wVar, gVar, i);
        }

        /* renamed from: b */
        public boolean mo54514b() {
            return C7518t.this.mo54572a(this.f17318b);
        }

        /* renamed from: c */
        public void mo54515c() throws IOException {
            C7518t.this.mo54573b(this.f17318b);
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.t$d */
    private static final class C7522d {

        /* renamed from: a */
        public final int f17319a;

        /* renamed from: b */
        public final boolean f17320b;

        public C7522d(int i, boolean z) {
            this.f17319a = i;
            this.f17320b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7522d dVar = (C7522d) obj;
            return this.f17319a == dVar.f17319a && this.f17320b == dVar.f17320b;
        }

        public int hashCode() {
            return (this.f17319a * 31) + (this.f17320b ? 1 : 0);
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.t$e */
    private static final class C7523e {

        /* renamed from: a */
        public final C7483ad f17321a;

        /* renamed from: b */
        public final boolean[] f17322b;

        /* renamed from: c */
        public final boolean[] f17323c;

        /* renamed from: d */
        public final boolean[] f17324d;

        public C7523e(C7483ad adVar, boolean[] zArr) {
            this.f17321a = adVar;
            this.f17322b = zArr;
            this.f17323c = new boolean[adVar.f17174b];
            this.f17324d = new boolean[adVar.f17174b];
        }
    }

    public C7518t(Uri uri, C7670i iVar, C7516s sVar, C7157h hVar, C7154g.C7155a aVar, C7699v vVar, C7512q.C7513a aVar2, C7520b bVar, C7657b bVar2, String str, int i) {
        this.f17279d = uri;
        this.f17280e = iVar;
        this.f17281f = hVar;
        this.f17284i = aVar;
        this.f17282g = vVar;
        this.f17283h = aVar2;
        this.f17285j = bVar;
        this.f17286k = bVar2;
        this.f17287l = str;
        this.f17288m = (long) i;
        this.f17290o = sVar;
        this.f17291p = new C7735g();
        this.f17292q = new Runnable() {
            public final void run() {
                C7518t.this.m21077n();
            }
        };
        this.f17293r = new Runnable() {
            public final void run() {
                C7518t.this.m21084u();
            }
        };
        this.f17294s = C7728ai.m22194a();
        this.f17298w = new C7522d[0];
        this.f17297v = new C7529w[0];
        this.f17274K = -9223372036854775807L;
        this.f17272I = -1;
        this.f17266C = -9223372036854775807L;
        this.f17268E = 1;
    }

    /* renamed from: a */
    private C7357x m21059a(C7522d dVar) {
        int length = this.f17297v.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f17298w[i])) {
                return this.f17297v[i];
            }
        }
        C7529w a = C7529w.m21166a(this.f17286k, this.f17294s.getLooper(), this.f17281f, this.f17284i);
        a.mo54600a((C7529w.C7533c) this);
        int i2 = length + 1;
        C7522d[] dVarArr = (C7522d[]) Arrays.copyOf(this.f17298w, i2);
        dVarArr[length] = dVar;
        this.f17298w = (C7522d[]) C7728ai.m22220a((T[]) dVarArr);
        C7529w[] wVarArr = (C7529w[]) Arrays.copyOf(this.f17297v, i2);
        wVarArr[length] = a;
        this.f17297v = (C7529w[]) C7728ai.m22220a((T[]) wVarArr);
        return a;
    }

    /* renamed from: a */
    private void m21062a(C7519a aVar) {
        if (this.f17272I == -1) {
            this.f17272I = aVar.f17314m;
        }
    }

    /* renamed from: a */
    private boolean m21063a(C7519a aVar, int i) {
        C7353v vVar;
        if (this.f17272I == -1 && ((vVar = this.f17265B) == null || vVar.mo53871b() == -9223372036854775807L)) {
            if (!this.f17300y || m21076m()) {
                this.f17270G = this.f17300y;
                this.f17273J = 0;
                this.f17276M = 0;
                for (C7529w b : this.f17297v) {
                    b.mo54605b();
                }
                aVar.m21118a(0, 0);
                return true;
            }
            this.f17275L = true;
            return false;
        }
        this.f17276M = i;
        return true;
    }

    /* renamed from: a */
    private boolean m21064a(boolean[] zArr, long j) {
        int length = this.f17297v.length;
        for (int i = 0; i < length; i++) {
            if (!this.f17297v[i].mo54602a(j, false) && (zArr[i] || !this.f17301z)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m21069c(C7353v vVar) {
        this.f17265B = this.f17296u == null ? vVar : new C7353v.C7355b(-9223372036854775807L);
        this.f17266C = vVar.mo53871b();
        int i = 1;
        boolean z = this.f17272I == -1 && vVar.mo53871b() == -9223372036854775807L;
        this.f17267D = z;
        if (z) {
            i = 7;
        }
        this.f17268E = i;
        this.f17285j.mo54580a(this.f17266C, vVar.mo53870a(), this.f17267D);
        if (!this.f17300y) {
            m21077n();
        }
    }

    /* renamed from: c */
    private void m21068c(int i) {
        m21082s();
        boolean[] zArr = this.f17264A.f17324d;
        if (!zArr[i]) {
            C7864v a = this.f17264A.f17321a.mo54483a(i).mo54479a(0);
            this.f17283h.mo54551a(C7759u.m22383e(a.f18921l), a, 0, (Object) null, this.f17273J);
            zArr[i] = true;
        }
    }

    /* renamed from: d */
    private void m21071d(int i) {
        m21082s();
        boolean[] zArr = this.f17264A.f17322b;
        if (this.f17275L && zArr[i]) {
            if (!this.f17297v[i].mo54606b(false)) {
                this.f17274K = 0;
                this.f17275L = false;
                this.f17270G = true;
                this.f17273J = 0;
                this.f17276M = 0;
                for (C7529w b : this.f17297v) {
                    b.mo54605b();
                }
                ((C7506n.C7507a) C7717a.m22120b(this.f17295t)).mo54500a(this);
            }
        }
    }

    /* renamed from: m */
    private boolean m21076m() {
        return this.f17270G || m21081r();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m21077n() {
        if (!this.f17278O && !this.f17300y && this.f17299x && this.f17265B != null) {
            C7529w[] wVarArr = this.f17297v;
            int length = wVarArr.length;
            int i = 0;
            while (i < length) {
                if (wVarArr[i].mo54611g() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f17291p.mo54993b();
            int length2 = this.f17297v.length;
            C7482ac[] acVarArr = new C7482ac[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C7864v vVar = (C7864v) C7717a.m22120b(this.f17297v[i2].mo54611g());
                String str = vVar.f18921l;
                boolean a = C7759u.m22377a(str);
                boolean z = a || C7759u.m22380b(str);
                zArr[i2] = z;
                this.f17301z = z | this.f17301z;
                C7418b bVar = this.f17296u;
                if (bVar != null) {
                    if (a || this.f17298w[i2].f17320b) {
                        C7399a aVar = vVar.f18919j;
                        vVar = vVar.mo55408a().mo55419a(aVar == null ? new C7399a(bVar) : aVar.mo54203a(bVar)).mo55424a();
                    }
                    if (a && vVar.f18915f == -1 && vVar.f18916g == -1 && bVar.f17006a != -1) {
                        vVar = vVar.mo55408a().mo55430d(bVar.f17006a).mo55424a();
                    }
                }
                acVarArr[i2] = new C7482ac(vVar.mo55409a(this.f17281f.mo53779a(vVar)));
            }
            this.f17264A = new C7523e(new C7483ad(acVarArr), zArr);
            this.f17300y = true;
            ((C7506n.C7507a) C7717a.m22120b(this.f17295t)).mo54499a(this);
        }
    }

    /* renamed from: o */
    private void m21078o() {
        C7519a aVar = new C7519a(this.f17279d, this.f17280e, this.f17290o, this, this.f17291p);
        if (this.f17300y) {
            C7717a.m22121b(m21081r());
            long j = this.f17266C;
            if (j == -9223372036854775807L || this.f17274K <= j) {
                aVar.m21118a(((C7353v) C7717a.m22120b(this.f17265B)).mo53869a(this.f17274K).f16775a.f16781c, this.f17274K);
                for (C7529w a : this.f17297v) {
                    a.mo54598a(this.f17274K);
                }
                this.f17274K = -9223372036854775807L;
            } else {
                this.f17277N = true;
                this.f17274K = -9223372036854775807L;
                return;
            }
        }
        this.f17276M = m21079p();
        this.f17283h.mo54553a(new C7499j(aVar.f17303b, aVar.f17313l, this.f17289n.mo54933a(aVar, this, this.f17282g.mo54929a(this.f17268E))), 1, -1, (C7864v) null, 0, (Object) null, aVar.f17312k, this.f17266C);
    }

    /* renamed from: p */
    private int m21079p() {
        int i = 0;
        for (C7529w c : this.f17297v) {
            i += c.mo54607c();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public long m21080q() {
        long j = Long.MIN_VALUE;
        for (C7529w h : this.f17297v) {
            j = Math.max(j, h.mo54612h());
        }
        return j;
    }

    /* renamed from: r */
    private boolean m21081r() {
        return this.f17274K != -9223372036854775807L;
    }

    /* renamed from: s */
    private void m21082s() {
        C7717a.m22121b(this.f17300y);
        C7717a.m22120b(this.f17264A);
        C7717a.m22120b(this.f17265B);
    }

    /* renamed from: t */
    private static Map<String, String> m21083t() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m21084u() {
        if (!this.f17278O) {
            ((C7506n.C7507a) C7717a.m22120b(this.f17295t)).mo54500a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo54563a(int i, long j) {
        if (m21076m()) {
            return 0;
        }
        m21068c(i);
        C7529w wVar = this.f17297v[i];
        int b = wVar.mo54603b(j, this.f17277N);
        wVar.mo54597a(b);
        if (b == 0) {
            m21071d(i);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo54564a(int i, C7867w wVar, C6922g gVar, int i2) {
        if (m21076m()) {
            return -3;
        }
        m21068c(i);
        int a = this.f17297v[i].mo54595a(wVar, gVar, i2, this.f17277N);
        if (a == -3) {
            m21071d(i);
        }
        return a;
    }

    /* renamed from: a */
    public long mo54493a(long j, C6832av avVar) {
        m21082s();
        if (!this.f17265B.mo53870a()) {
            return 0;
        }
        C7353v.C7354a a = this.f17265B.mo53869a(j);
        return avVar.mo52857a(j, a.f16775a.f16780b, a.f16776b.f16780b);
    }

    /* renamed from: a */
    public long mo54494a(C7637d[] dVarArr, boolean[] zArr, C7534x[] xVarArr, boolean[] zArr2, long j) {
        m21082s();
        C7483ad adVar = this.f17264A.f17321a;
        boolean[] zArr3 = this.f17264A.f17323c;
        int i = this.f17271H;
        int i2 = 0;
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            if (xVarArr[i3] != null && (dVarArr[i3] == null || !zArr[i3])) {
                int a = xVarArr[i3].f17318b;
                C7717a.m22121b(zArr3[a]);
                this.f17271H--;
                zArr3[a] = false;
                xVarArr[i3] = null;
            }
        }
        boolean z = !this.f17269F ? j != 0 : i == 0;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (xVarArr[i4] == null && dVarArr[i4] != null) {
                C7637d dVar = dVarArr[i4];
                C7717a.m22121b(dVar.mo54810e() == 1);
                C7717a.m22121b(dVar.mo54808b(0) == 0);
                int a2 = adVar.mo54482a(dVar.mo54809d());
                C7717a.m22121b(!zArr3[a2]);
                this.f17271H++;
                zArr3[a2] = true;
                xVarArr[i4] = new C7521c(a2);
                zArr2[i4] = true;
                if (!z) {
                    C7529w wVar = this.f17297v[a2];
                    z = !wVar.mo54602a(j, true) && wVar.mo54610f() != 0;
                }
            }
        }
        if (this.f17271H == 0) {
            this.f17275L = false;
            this.f17270G = false;
            if (this.f17289n.mo54938c()) {
                C7529w[] wVarArr = this.f17297v;
                int length = wVarArr.length;
                while (i2 < length) {
                    wVarArr[i2].mo54615k();
                    i2++;
                }
                this.f17289n.mo54939d();
            } else {
                C7529w[] wVarArr2 = this.f17297v;
                int length2 = wVarArr2.length;
                while (i2 < length2) {
                    wVarArr2[i2].mo54605b();
                    i2++;
                }
            }
        } else if (z) {
            j = mo54501b(j);
            while (i2 < xVarArr.length) {
                if (xVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f17269F = true;
        return j;
    }

    /* renamed from: a */
    public C7357x mo53894a(int i, int i2) {
        return m21059a(new C7522d(i, false));
    }

    /* renamed from: a */
    public C7701w.C7704b mo54566a(C7519a aVar, long j, long j2, IOException iOException, int i) {
        C7701w.C7704b bVar;
        C7519a aVar2;
        boolean z;
        m21062a(aVar);
        C7715z a = aVar.f17305d;
        C7499j jVar = new C7499j(aVar.f17303b, aVar.f17313l, a.mo54951e(), a.mo54952f(), j, j2, a.mo54950d());
        long a2 = this.f17282g.mo54930a(new C7699v.C7700a(jVar, new C7505m(1, -1, (C7864v) null, 0, (Object) null, C7476h.m20797a(aVar.f17312k), C7476h.m20797a(this.f17266C)), iOException, i));
        if (a2 == -9223372036854775807L) {
            bVar = C7701w.f18178d;
            C7519a aVar3 = aVar;
        } else {
            int p = m21079p();
            if (p > this.f17276M) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            bVar = m21063a(aVar2, p) ? C7701w.m22054a(z, a2) : C7701w.f18177c;
        }
        boolean z2 = !bVar.mo54940a();
        this.f17283h.mo54554a(jVar, 1, -1, (C7864v) null, 0, (Object) null, aVar.f17312k, this.f17266C, iOException, z2);
        if (z2) {
            this.f17282g.mo54931a(aVar.f17303b);
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo53895a() {
        this.f17299x = true;
        this.f17294s.post(this.f17292q);
    }

    /* renamed from: a */
    public void mo54495a(long j) {
    }

    /* renamed from: a */
    public void mo54497a(long j, boolean z) {
        m21082s();
        if (!m21081r()) {
            boolean[] zArr = this.f17264A.f17323c;
            int length = this.f17297v.length;
            for (int i = 0; i < length; i++) {
                this.f17297v[i].mo54599a(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: a */
    public void mo53896a(C7353v vVar) {
        this.f17294s.post(new Runnable(vVar) {
            public final /* synthetic */ C7353v f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7518t.this.m21069c(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo54498a(C7506n.C7507a aVar, long j) {
        this.f17295t = aVar;
        this.f17291p.mo54992a();
        m21078o();
    }

    /* renamed from: a */
    public void mo54569a(C7519a aVar, long j, long j2) {
        C7353v vVar;
        if (this.f17266C == -9223372036854775807L && (vVar = this.f17265B) != null) {
            boolean a = vVar.mo53870a();
            long q = m21080q();
            long j3 = q == Long.MIN_VALUE ? 0 : q + 10000;
            this.f17266C = j3;
            this.f17285j.mo54580a(j3, a, this.f17267D);
        }
        C7715z a2 = aVar.f17305d;
        C7499j jVar = new C7499j(aVar.f17303b, aVar.f17313l, a2.mo54951e(), a2.mo54952f(), j, j2, a2.mo54950d());
        this.f17282g.mo54931a(aVar.f17303b);
        this.f17283h.mo54559b(jVar, 1, -1, (C7864v) null, 0, (Object) null, aVar.f17312k, this.f17266C);
        m21062a(aVar);
        this.f17277N = true;
        ((C7506n.C7507a) C7717a.m22120b(this.f17295t)).mo54500a(this);
    }

    /* renamed from: a */
    public void mo54570a(C7519a aVar, long j, long j2, boolean z) {
        C7715z a = aVar.f17305d;
        C7499j jVar = new C7499j(aVar.f17303b, aVar.f17313l, a.mo54951e(), a.mo54952f(), j, j2, a.mo54950d());
        this.f17282g.mo54931a(aVar.f17303b);
        this.f17283h.mo54561c(jVar, 1, -1, (C7864v) null, 0, (Object) null, aVar.f17312k, this.f17266C);
        if (!z) {
            m21062a(aVar);
            for (C7529w b : this.f17297v) {
                b.mo54605b();
            }
            if (this.f17271H > 0) {
                ((C7506n.C7507a) C7717a.m22120b(this.f17295t)).mo54500a(this);
            }
        }
    }

    /* renamed from: a */
    public void mo54571a(C7864v vVar) {
        this.f17294s.post(this.f17292q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo54572a(int i) {
        return !m21076m() && this.f17297v[i].mo54606b(this.f17277N);
    }

    /* renamed from: b */
    public long mo54501b(long j) {
        m21082s();
        boolean[] zArr = this.f17264A.f17322b;
        if (!this.f17265B.mo53870a()) {
            j = 0;
        }
        int i = 0;
        this.f17270G = false;
        this.f17273J = j;
        if (m21081r()) {
            this.f17274K = j;
            return j;
        } else if (this.f17268E != 7 && m21064a(zArr, j)) {
            return j;
        } else {
            this.f17275L = false;
            this.f17274K = j;
            this.f17277N = false;
            if (this.f17289n.mo54938c()) {
                C7529w[] wVarArr = this.f17297v;
                int length = wVarArr.length;
                while (i < length) {
                    wVarArr[i].mo54615k();
                    i++;
                }
                this.f17289n.mo54939d();
            } else {
                this.f17289n.mo54937b();
                C7529w[] wVarArr2 = this.f17297v;
                int length2 = wVarArr2.length;
                while (i < length2) {
                    wVarArr2[i].mo54605b();
                    i++;
                }
            }
            return j;
        }
    }

    /* renamed from: b */
    public C7483ad mo54502b() {
        m21082s();
        return this.f17264A.f17321a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo54573b(int i) throws IOException {
        this.f17297v[i].mo54609e();
        mo54576i();
    }

    /* renamed from: c */
    public long mo54504c() {
        if (!this.f17270G) {
            return -9223372036854775807L;
        }
        if (!this.f17277N && m21079p() <= this.f17276M) {
            return -9223372036854775807L;
        }
        this.f17270G = false;
        return this.f17273J;
    }

    /* renamed from: c */
    public boolean mo54505c(long j) {
        if (this.f17277N || this.f17289n.mo54936a() || this.f17275L) {
            return false;
        }
        if (this.f17300y && this.f17271H == 0) {
            return false;
        }
        boolean a = this.f17291p.mo54992a();
        if (this.f17289n.mo54938c()) {
            return a;
        }
        m21078o();
        return true;
    }

    /* renamed from: d */
    public long mo54506d() {
        long j;
        m21082s();
        boolean[] zArr = this.f17264A.f17322b;
        if (this.f17277N) {
            return Long.MIN_VALUE;
        }
        if (m21081r()) {
            return this.f17274K;
        }
        if (this.f17301z) {
            int length = this.f17297v.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f17297v[i].mo54614j()) {
                    j = Math.min(j, this.f17297v[i].mo54612h());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m21080q();
        }
        return j == Long.MIN_VALUE ? this.f17273J : j;
    }

    /* renamed from: e */
    public long mo54507e() {
        if (this.f17271H == 0) {
            return Long.MIN_VALUE;
        }
        return mo54506d();
    }

    /* renamed from: e_ */
    public void mo54508e_() throws IOException {
        mo54576i();
        if (this.f17277N && !this.f17300y) {
            throw C6809ai.m17540b("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: f */
    public boolean mo54509f() {
        return this.f17289n.mo54938c() && this.f17291p.mo54996e();
    }

    /* renamed from: g */
    public void mo54574g() {
        if (this.f17300y) {
            for (C7529w d : this.f17297v) {
                d.mo54608d();
            }
        }
        this.f17289n.mo54935a((C7701w.C7707e) this);
        this.f17294s.removeCallbacksAndMessages((Object) null);
        this.f17295t = null;
        this.f17278O = true;
    }

    /* renamed from: h */
    public void mo54575h() {
        for (C7529w a : this.f17297v) {
            a.mo54596a();
        }
        this.f17290o.mo54488a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo54576i() throws IOException {
        this.f17289n.mo54934a(this.f17282g.mo54929a(this.f17268E));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7357x mo54577j() {
        return m21059a(new C7522d(0, true));
    }
}
