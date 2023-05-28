package com.applovin.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p180a.C6781a;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p219j.C7647j;
import com.applovin.exoplayer2.p219j.C7649k;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.af */
final class C6802af {

    /* renamed from: a */
    private final C6904ba.C6906a f14767a = new C6904ba.C6906a();

    /* renamed from: b */
    private final C6904ba.C6908c f14768b = new C6904ba.C6908c();

    /* renamed from: c */
    private final C6781a f14769c;

    /* renamed from: d */
    private final Handler f14770d;

    /* renamed from: e */
    private long f14771e;

    /* renamed from: f */
    private int f14772f;

    /* renamed from: g */
    private boolean f14773g;

    /* renamed from: h */
    private C6800ad f14774h;

    /* renamed from: i */
    private C6800ad f14775i;

    /* renamed from: j */
    private C6800ad f14776j;

    /* renamed from: k */
    private int f14777k;

    /* renamed from: l */
    private Object f14778l;

    /* renamed from: m */
    private long f14779m;

    public C6802af(C6781a aVar, Handler handler) {
        this.f14769c = aVar;
        this.f14770d = handler;
    }

    /* renamed from: a */
    private long m17457a(C6904ba baVar, Object obj) {
        C6800ad adVar;
        int c;
        int i = baVar.mo52441a(obj, this.f14767a).f15258c;
        Object obj2 = this.f14778l;
        if (obj2 != null && (c = baVar.mo52448c(obj2)) != -1 && baVar.mo53078a(c, this.f14767a).f15258c == i) {
            return this.f14779m;
        }
        C6800ad adVar2 = this.f14774h;
        while (true) {
            if (adVar == null) {
                adVar = this.f14774h;
                while (adVar != null) {
                    int c2 = baVar.mo52448c(adVar.f14744b);
                    if (c2 == -1 || baVar.mo53078a(c2, this.f14767a).f15258c != i) {
                        adVar = adVar.mo52687g();
                    }
                }
                long j = this.f14771e;
                this.f14771e = 1 + j;
                if (this.f14774h == null) {
                    this.f14778l = obj;
                    this.f14779m = j;
                }
                return j;
            } else if (adVar.f14744b.equals(obj)) {
                break;
            } else {
                adVar2 = adVar.mo52687g();
            }
        }
        return adVar.f14748f.f14758a.f17254d;
    }

    /* renamed from: a */
    private long m17458a(C6904ba baVar, Object obj, int i) {
        baVar.mo52441a(obj, this.f14767a);
        long a = this.f14767a.mo53087a(i);
        return a == Long.MIN_VALUE ? this.f14767a.f15259d : a + this.f14767a.mo53102f(i);
    }

    /* renamed from: a */
    private C6801ae m17459a(C6812al alVar) {
        return m17461a(alVar.f14811a, alVar.f14812b, alVar.f14813c, alVar.f14829s);
    }

    /* renamed from: a */
    private C6801ae m17460a(C6904ba baVar, C6800ad adVar, long j) {
        long j2;
        C6904ba baVar2 = baVar;
        C6801ae aeVar = adVar.f14748f;
        long a = (adVar.mo52671a() + aeVar.f14762e) - j;
        if (aeVar.f14764g) {
            long j3 = 0;
            int a2 = baVar.mo53075a(baVar2.mo52448c(aeVar.f14758a.f17251a), this.f14767a, this.f14768b, this.f14772f, this.f14773g);
            if (a2 == -1) {
                return null;
            }
            int i = baVar2.mo52440a(a2, this.f14767a, true).f15258c;
            Object obj = this.f14767a.f15257b;
            long j4 = aeVar.f14758a.f17254d;
            if (baVar2.mo53079a(i, this.f14768b).f15285p == a2) {
                Pair<Object, Long> a3 = baVar.mo53077a(this.f14768b, this.f14767a, i, -9223372036854775807L, Math.max(0, a));
                if (a3 == null) {
                    return null;
                }
                obj = a3.first;
                long longValue = ((Long) a3.second).longValue();
                C6800ad g = adVar.mo52687g();
                if (g == null || !g.f14744b.equals(obj)) {
                    j4 = this.f14771e;
                    this.f14771e = 1 + j4;
                } else {
                    j4 = g.f14748f.f14758a.f17254d;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return m17461a(baVar, m17464a(baVar, obj, j2, j4, this.f14767a), j3, j2);
        }
        C7509p.C7510a aVar = aeVar.f14758a;
        baVar2.mo52441a(aVar.f17251a, this.f14767a);
        if (aVar.mo54546a()) {
            int i2 = aVar.f17252b;
            int d = this.f14767a.mo53097d(i2);
            if (d == -1) {
                return null;
            }
            int a4 = this.f14767a.mo53084a(i2, aVar.f17253c);
            if (a4 < d) {
                return m17462a(baVar, aVar.f17251a, i2, a4, aeVar.f14760c, aVar.f17254d);
            }
            long j5 = aeVar.f14760c;
            if (j5 == -9223372036854775807L) {
                C6904ba.C6908c cVar = this.f14768b;
                C6904ba.C6906a aVar2 = this.f14767a;
                Pair<Object, Long> a5 = baVar.mo53077a(cVar, aVar2, aVar2.f15258c, -9223372036854775807L, Math.max(0, a));
                if (a5 == null) {
                    return null;
                }
                j5 = ((Long) a5.second).longValue();
            }
            return m17463a(baVar, aVar.f17251a, Math.max(m17458a(baVar2, aVar.f17251a, aVar.f17252b), j5), aeVar.f14760c, aVar.f17254d);
        }
        int b = this.f14767a.mo53090b(aVar.f17255e);
        if (b == this.f14767a.mo53097d(aVar.f17255e)) {
            return m17463a(baVar, aVar.f17251a, m17458a(baVar2, aVar.f17251a, aVar.f17255e), aeVar.f14762e, aVar.f17254d);
        }
        return m17462a(baVar, aVar.f17251a, aVar.f17255e, b, aeVar.f14762e, aVar.f17254d);
    }

    /* renamed from: a */
    private C6801ae m17461a(C6904ba baVar, C7509p.C7510a aVar, long j, long j2) {
        C7509p.C7510a aVar2 = aVar;
        C6904ba baVar2 = baVar;
        baVar.mo52441a(aVar2.f17251a, this.f14767a);
        boolean a = aVar.mo54546a();
        Object obj = aVar2.f17251a;
        if (a) {
            return m17462a(baVar, obj, aVar2.f17252b, aVar2.f17253c, j, aVar2.f17254d);
        }
        return m17463a(baVar, obj, j2, j, aVar2.f17254d);
    }

    /* renamed from: a */
    private C6801ae m17462a(C6904ba baVar, Object obj, int i, int i2, long j, long j2) {
        int i3 = i2;
        C7509p.C7510a aVar = new C7509p.C7510a(obj, i, i3, j2);
        long b = baVar.mo52441a(aVar.f17251a, this.f14767a).mo53093b(aVar.f17252b, aVar.f17253c);
        long f = i3 == this.f14767a.mo53090b(i) ? this.f14767a.mo53101f() : 0;
        return new C6801ae(aVar, (b == -9223372036854775807L || f < b) ? f : Math.max(0, b - 1), j, -9223372036854775807L, b, this.f14767a.mo53099e(aVar.f17252b), false, false, false);
    }

    /* renamed from: a */
    private C6801ae m17463a(C6904ba baVar, Object obj, long j, long j2, long j3) {
        C6904ba baVar2 = baVar;
        Object obj2 = obj;
        long j4 = j;
        baVar2.mo52441a(obj2, this.f14767a);
        int b = this.f14767a.mo53091b(j4);
        C7509p.C7510a aVar = new C7509p.C7510a(obj2, j3, b);
        boolean a = m17471a(aVar);
        boolean a2 = m17469a(baVar2, aVar);
        boolean a3 = m17470a(baVar2, aVar, a);
        boolean z = b != -1 && this.f14767a.mo53099e(b);
        long a4 = b != -1 ? this.f14767a.mo53087a(b) : -9223372036854775807L;
        long j5 = (a4 == -9223372036854775807L || a4 == Long.MIN_VALUE) ? this.f14767a.f15259d : a4;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0, j5 - 1);
        }
        return new C6801ae(aVar, j4, j2, a4, j5, z, a, a2, a3);
    }

    /* renamed from: a */
    private static C7509p.C7510a m17464a(C6904ba baVar, Object obj, long j, long j2, C6904ba.C6906a aVar) {
        baVar.mo52441a(obj, aVar);
        int a = aVar.mo53085a(j);
        if (a == -1) {
            return new C7509p.C7510a(obj, j2, aVar.mo53091b(j));
        }
        return new C7509p.C7510a(obj, a, aVar.mo53090b(a), j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17465a(C7033s.C7034a aVar, C7509p.C7510a aVar2) {
        this.f14769c.mo52492a((List<C7509p.C7510a>) aVar.mo53531a(), aVar2);
    }

    /* renamed from: a */
    private boolean m17466a(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: a */
    private boolean m17467a(C6801ae aeVar, C6801ae aeVar2) {
        return aeVar.f14759b == aeVar2.f14759b && aeVar.f14758a.equals(aeVar2.f14758a);
    }

    /* renamed from: a */
    private boolean m17468a(C6904ba baVar) {
        C6800ad adVar = this.f14774h;
        if (adVar == null) {
            return true;
        }
        int c = baVar.mo52448c(adVar.f14744b);
        while (true) {
            c = baVar.mo53075a(c, this.f14767a, this.f14768b, this.f14772f, this.f14773g);
            while (adVar.mo52687g() != null && !adVar.f14748f.f14764g) {
                adVar = adVar.mo52687g();
            }
            C6800ad g = adVar.mo52687g();
            if (c == -1 || g == null || baVar.mo52448c(g.f14744b) != c) {
                boolean a = mo52701a(adVar);
                adVar.f14748f = mo52697a(baVar, adVar.f14748f);
            } else {
                adVar = g;
            }
        }
        boolean a2 = mo52701a(adVar);
        adVar.f14748f = mo52697a(baVar, adVar.f14748f);
        return !a2;
    }

    /* renamed from: a */
    private boolean m17469a(C6904ba baVar, C7509p.C7510a aVar) {
        if (!m17471a(aVar)) {
            return false;
        }
        return baVar.mo53079a(baVar.mo52441a(aVar.f17251a, this.f14767a).f15258c, this.f14768b).f15286q == baVar.mo52448c(aVar.f17251a);
    }

    /* renamed from: a */
    private boolean m17470a(C6904ba baVar, C7509p.C7510a aVar, boolean z) {
        int c = baVar.mo52448c(aVar.f17251a);
        if (!baVar.mo53079a(baVar.mo53078a(c, this.f14767a).f15258c, this.f14768b).f15279j) {
            return baVar.mo53080b(c, this.f14767a, this.f14768b, this.f14772f, this.f14773g) && z;
        }
    }

    /* renamed from: a */
    private boolean m17471a(C7509p.C7510a aVar) {
        return !aVar.mo54546a() && aVar.f17255e == -1;
    }

    /* renamed from: h */
    private void m17472h() {
        if (this.f14769c != null) {
            C7033s.C7034a i = C7033s.m18804i();
            for (C6800ad adVar = this.f14774h; adVar != null; adVar = adVar.mo52687g()) {
                i.mo53515a(adVar.f14748f.f14758a);
            }
            C6800ad adVar2 = this.f14775i;
            this.f14770d.post(new Runnable(i, adVar2 == null ? null : adVar2.f14748f.f14758a) {
                public final /* synthetic */ C7033s.C7034a f$1;
                public final /* synthetic */ C7509p.C7510a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C6802af.this.m17465a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public C6800ad mo52695a(C6829as[] asVarArr, C7647j jVar, C7657b bVar, C6804ah ahVar, C6801ae aeVar, C7649k kVar) {
        C6801ae aeVar2 = aeVar;
        C6800ad adVar = this.f14776j;
        C6800ad adVar2 = new C6800ad(asVarArr, adVar == null ? (!aeVar2.f14758a.mo54546a() || aeVar2.f14760c == -9223372036854775807L) ? 0 : aeVar2.f14760c : (adVar.mo52671a() + this.f14776j.f14748f.f14762e) - aeVar2.f14759b, jVar, bVar, ahVar, aeVar, kVar);
        C6800ad adVar3 = this.f14776j;
        if (adVar3 != null) {
            adVar3.mo52676a(adVar2);
        } else {
            this.f14774h = adVar2;
            this.f14775i = adVar2;
        }
        this.f14778l = null;
        this.f14776j = adVar2;
        this.f14777k++;
        m17472h();
        return adVar2;
    }

    /* renamed from: a */
    public C6801ae mo52696a(long j, C6812al alVar) {
        return this.f14776j == null ? m17459a(alVar) : m17460a(alVar.f14811a, this.f14776j, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.C6801ae mo52697a(com.applovin.exoplayer2.C6904ba r19, com.applovin.exoplayer2.C6801ae r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.exoplayer2.h.p$a r3 = r2.f14758a
            boolean r12 = r0.m17471a((com.applovin.exoplayer2.p206h.C7509p.C7510a) r3)
            boolean r13 = r0.m17469a((com.applovin.exoplayer2.C6904ba) r1, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r3)
            boolean r14 = r0.m17470a((com.applovin.exoplayer2.C6904ba) r1, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r3, (boolean) r12)
            com.applovin.exoplayer2.h.p$a r4 = r2.f14758a
            java.lang.Object r4 = r4.f17251a
            com.applovin.exoplayer2.ba$a r5 = r0.f14767a
            r1.mo52441a((java.lang.Object) r4, (com.applovin.exoplayer2.C6904ba.C6906a) r5)
            boolean r1 = r3.mo54546a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.f17255e
            if (r1 != r4) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            com.applovin.exoplayer2.ba$a r1 = r0.f14767a
            int r7 = r3.f17255e
            long r7 = r1.mo53087a((int) r7)
            goto L_0x0038
        L_0x0037:
            r7 = r5
        L_0x0038:
            boolean r1 = r3.mo54546a()
            if (r1 == 0) goto L_0x004a
            com.applovin.exoplayer2.ba$a r1 = r0.f14767a
            int r5 = r3.f17252b
            int r6 = r3.f17253c
            long r5 = r1.mo53093b(r5, r6)
        L_0x0048:
            r9 = r5
            goto L_0x005e
        L_0x004a:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0057
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r9 = r7
            goto L_0x005e
        L_0x0057:
            com.applovin.exoplayer2.ba$a r1 = r0.f14767a
            long r5 = r1.mo53086a()
            goto L_0x0048
        L_0x005e:
            boolean r1 = r3.mo54546a()
            if (r1 == 0) goto L_0x006e
            com.applovin.exoplayer2.ba$a r1 = r0.f14767a
            int r4 = r3.f17252b
            boolean r1 = r1.mo53099e(r4)
            r11 = r1
            goto L_0x0081
        L_0x006e:
            int r1 = r3.f17255e
            if (r1 == r4) goto L_0x007f
            com.applovin.exoplayer2.ba$a r1 = r0.f14767a
            int r4 = r3.f17255e
            boolean r1 = r1.mo53099e(r4)
            if (r1 == 0) goto L_0x007f
            r1 = 1
            r11 = 1
            goto L_0x0081
        L_0x007f:
            r1 = 0
            r11 = 0
        L_0x0081:
            com.applovin.exoplayer2.ae r15 = new com.applovin.exoplayer2.ae
            long r4 = r2.f14759b
            long r1 = r2.f14760c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C6802af.mo52697a(com.applovin.exoplayer2.ba, com.applovin.exoplayer2.ae):com.applovin.exoplayer2.ae");
    }

    /* renamed from: a */
    public C7509p.C7510a mo52698a(C6904ba baVar, Object obj, long j) {
        return m17464a(baVar, obj, j, m17457a(baVar, obj), this.f14767a);
    }

    /* renamed from: a */
    public void mo52699a(long j) {
        C6800ad adVar = this.f14776j;
        if (adVar != null) {
            adVar.mo52683d(j);
        }
    }

    /* renamed from: a */
    public boolean mo52700a() {
        C6800ad adVar = this.f14776j;
        return adVar == null || (!adVar.f14748f.f14766i && this.f14776j.mo52681c() && this.f14776j.f14748f.f14762e != -9223372036854775807L && this.f14777k < 100);
    }

    /* renamed from: a */
    public boolean mo52701a(C6800ad adVar) {
        boolean z = false;
        C7717a.m22121b(adVar != null);
        if (adVar.equals(this.f14776j)) {
            return false;
        }
        this.f14776j = adVar;
        while (adVar.mo52687g() != null) {
            adVar = adVar.mo52687g();
            if (adVar == this.f14775i) {
                this.f14775i = this.f14774h;
                z = true;
            }
            adVar.mo52686f();
            this.f14777k--;
        }
        this.f14776j.mo52676a((C6800ad) null);
        m17472h();
        return z;
    }

    /* renamed from: a */
    public boolean mo52702a(C6904ba baVar, int i) {
        this.f14772f = i;
        return m17468a(baVar);
    }

    /* renamed from: a */
    public boolean mo52703a(C6904ba baVar, long j, long j2) {
        C6801ae aeVar;
        C6800ad adVar = this.f14774h;
        C6800ad adVar2 = null;
        while (adVar != null) {
            C6801ae aeVar2 = adVar.f14748f;
            if (adVar2 == null) {
                aeVar = mo52697a(baVar, aeVar2);
            } else {
                C6801ae a = m17460a(baVar, adVar2, j);
                if (a == null) {
                    return !mo52701a(adVar2);
                }
                if (!m17467a(aeVar2, a)) {
                    return !mo52701a(adVar2);
                }
                aeVar = a;
            }
            adVar.f14748f = aeVar.mo52692b(aeVar2.f14760c);
            if (!m17466a(aeVar2.f14762e, aeVar.f14762e)) {
                adVar.mo52690j();
                return !mo52701a(adVar) && !(adVar == this.f14775i && !adVar.f14748f.f14763f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((aeVar.f14762e > -9223372036854775807L ? 1 : (aeVar.f14762e == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.mo52672a(aeVar.f14762e)) ? 1 : (j2 == ((aeVar.f14762e > -9223372036854775807L ? 1 : (aeVar.f14762e == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.mo52672a(aeVar.f14762e)) ? 0 : -1)) >= 0));
            }
            adVar2 = adVar;
            adVar = adVar.mo52687g();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo52704a(C6904ba baVar, boolean z) {
        this.f14773g = z;
        return m17468a(baVar);
    }

    /* renamed from: a */
    public boolean mo52705a(C7506n nVar) {
        C6800ad adVar = this.f14776j;
        return adVar != null && adVar.f14743a == nVar;
    }

    /* renamed from: b */
    public C6800ad mo52706b() {
        return this.f14776j;
    }

    /* renamed from: c */
    public C6800ad mo52707c() {
        return this.f14774h;
    }

    /* renamed from: d */
    public C6800ad mo52708d() {
        return this.f14775i;
    }

    /* renamed from: e */
    public C6800ad mo52709e() {
        C6800ad adVar = this.f14775i;
        C7717a.m22121b((adVar == null || adVar.mo52687g() == null) ? false : true);
        this.f14775i = this.f14775i.mo52687g();
        m17472h();
        return this.f14775i;
    }

    /* renamed from: f */
    public C6800ad mo52710f() {
        C6800ad adVar = this.f14774h;
        if (adVar == null) {
            return null;
        }
        if (adVar == this.f14775i) {
            this.f14775i = adVar.mo52687g();
        }
        this.f14774h.mo52686f();
        int i = this.f14777k - 1;
        this.f14777k = i;
        if (i == 0) {
            this.f14776j = null;
            this.f14778l = this.f14774h.f14744b;
            this.f14779m = this.f14774h.f14748f.f14758a.f17254d;
        }
        this.f14774h = this.f14774h.mo52687g();
        m17472h();
        return this.f14774h;
    }

    /* renamed from: g */
    public void mo52711g() {
        if (this.f14777k != 0) {
            C6800ad adVar = (C6800ad) C7717a.m22115a(this.f14774h);
            this.f14778l = adVar.f14744b;
            this.f14779m = adVar.f14748f.f14758a.f17254d;
            while (adVar != null) {
                adVar.mo52686f();
                adVar = adVar.mo52687g();
            }
            this.f14774h = null;
            this.f14776j = null;
            this.f14775i = null;
            this.f14777k = 0;
            m17472h();
        }
    }
}
