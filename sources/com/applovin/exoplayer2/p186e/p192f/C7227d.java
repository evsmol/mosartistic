package com.applovin.exoplayer2.p186e.p192f;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6895r;
import com.applovin.exoplayer2.p186e.C7232g;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7349r;
import com.applovin.exoplayer2.p186e.C7350s;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p203e.C7435g;
import com.applovin.exoplayer2.p198g.p203e.C7441j;
import com.applovin.exoplayer2.p198g.p203e.C7445l;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.f.d */
public final class C7227d implements C7262h {

    /* renamed from: a */
    public static final C7340l f16066a = $$Lambda$d$M00HXtLQ4mGUqsI0jBaBwLQNDFI.INSTANCE;

    /* renamed from: b */
    private static final C7435g.C7436a f16067b = $$Lambda$d$PsVn2vj1IEaDQ66FqrWGI__HiT8.INSTANCE;

    /* renamed from: c */
    private final int f16068c;

    /* renamed from: d */
    private final long f16069d;

    /* renamed from: e */
    private final C7772y f16070e;

    /* renamed from: f */
    private final C6895r.C6896a f16071f;

    /* renamed from: g */
    private final C7349r f16072g;

    /* renamed from: h */
    private final C7350s f16073h;

    /* renamed from: i */
    private final C7357x f16074i;

    /* renamed from: j */
    private C7329j f16075j;

    /* renamed from: k */
    private C7357x f16076k;

    /* renamed from: l */
    private C7357x f16077l;

    /* renamed from: m */
    private int f16078m;

    /* renamed from: n */
    private C7399a f16079n;

    /* renamed from: o */
    private long f16080o;

    /* renamed from: p */
    private long f16081p;

    /* renamed from: q */
    private long f16082q;

    /* renamed from: r */
    private int f16083r;

    /* renamed from: s */
    private C7228e f16084s;

    /* renamed from: t */
    private boolean f16085t;

    /* renamed from: u */
    private boolean f16086u;

    /* renamed from: v */
    private long f16087v;

    public C7227d() {
        this(0);
    }

    public C7227d(int i) {
        this(i, -9223372036854775807L);
    }

    public C7227d(int i, long j) {
        this.f16068c = (i & 2) != 0 ? i | 1 : i;
        this.f16069d = j;
        this.f16070e = new C7772y(10);
        this.f16071f = new C6895r.C6896a();
        this.f16072g = new C7349r();
        this.f16080o = -9223372036854775807L;
        this.f16073h = new C7350s();
        C7232g gVar = new C7232g();
        this.f16074i = gVar;
        this.f16077l = gVar;
    }

    /* renamed from: a */
    private static int m19572a(C7772y yVar, int i) {
        if (yVar.mo55072b() >= i + 4) {
            yVar.mo55076d(i);
            int q = yVar.mo55093q();
            if (q == 1483304551 || q == 1231971951) {
                return q;
            }
        }
        if (yVar.mo55072b() < 40) {
            return 0;
        }
        yVar.mo55076d(36);
        return yVar.mo55093q() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: a */
    private long m19573a(long j) {
        return this.f16080o + ((j * 1000000) / ((long) this.f16071f.f15193d));
    }

    /* renamed from: a */
    private static long m19574a(C7399a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int a = aVar.mo54200a();
        for (int i = 0; i < a; i++) {
            C7399a.C7401a a2 = aVar.mo54201a(i);
            if (a2 instanceof C7445l) {
                C7445l lVar = (C7445l) a2;
                if (lVar.f17043f.equals("TLEN")) {
                    return C7476h.m20800b(Long.parseLong(lVar.f17055b));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static C7226c m19575a(C7399a aVar, long j) {
        if (aVar == null) {
            return null;
        }
        int a = aVar.mo54200a();
        for (int i = 0; i < a; i++) {
            C7399a.C7401a a2 = aVar.mo54201a(i);
            if (a2 instanceof C7441j) {
                return C7226c.m19566a(j, (C7441j) a2, m19574a(aVar));
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m19576a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: a */
    private static boolean m19577a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    private boolean m19578a(C7279i iVar, boolean z) throws IOException {
        int i;
        int i2;
        int a;
        int i3 = z ? 32768 : 131072;
        iVar.mo53899a();
        if (iVar.mo53892c() == 0) {
            C7399a a2 = this.f16073h.mo54087a(iVar, (this.f16068c & 8) == 0 ? null : f16067b);
            this.f16079n = a2;
            if (a2 != null) {
                this.f16072g.mo54086a(a2);
            }
            i = (int) iVar.mo53891b();
            if (!z) {
                iVar.mo53902b(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m19583d(iVar)) {
                this.f16070e.mo55076d(0);
                int q = this.f16070e.mo55093q();
                if ((i2 == 0 || m19577a(q, (long) i2)) && (a = C6895r.m18251a(q)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f16071f.mo53060a(q);
                        i2 = q;
                    }
                    iVar.mo53907c(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            iVar.mo53899a();
                            iVar.mo53907c(i + i6);
                        } else {
                            iVar.mo53902b(1);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C6809ai.m17540b("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            iVar.mo53902b(i + i5);
        } else {
            iVar.mo53899a();
        }
        this.f16078m = i2;
        return true;
    }

    /* renamed from: b */
    private int m19579b(C7279i iVar) throws IOException {
        if (this.f16078m == 0) {
            try {
                m19578a(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f16084s == null) {
            C7228e e = m19585e(iVar);
            this.f16084s = e;
            this.f16075j.mo53896a(e);
            this.f16077l.mo53953a(new C7864v.C7866a().mo55435f(this.f16071f.f15191b).mo55434f(4096).mo55440k(this.f16071f.f15194e).mo55441l(this.f16071f.f15193d).mo55443n(this.f16072g.f16767a).mo55444o(this.f16072g.f16768b).mo55419a((this.f16068c & 8) != 0 ? null : this.f16079n).mo55424a());
            this.f16082q = iVar.mo53892c();
        } else if (this.f16082q != 0) {
            long c = iVar.mo53892c();
            long j = this.f16082q;
            if (c < j) {
                iVar.mo53902b((int) (j - c));
            }
        }
        return m19582c(iVar);
    }

    /* renamed from: b */
    private C7228e m19580b(C7279i iVar, boolean z) throws IOException {
        iVar.mo53908d(this.f16070e.mo55077d(), 0, 4);
        this.f16070e.mo55076d(0);
        this.f16071f.mo53060a(this.f16070e.mo55093q());
        return new C7224a(iVar.mo53893d(), iVar.mo53892c(), this.f16071f, z);
    }

    /* renamed from: b */
    private void m19581b() {
        C7717a.m22115a(this.f16076k);
        C7728ai.m22198a(this.f16075j);
    }

    /* renamed from: c */
    private int m19582c(C7279i iVar) throws IOException {
        if (this.f16083r == 0) {
            iVar.mo53899a();
            if (m19583d(iVar)) {
                return -1;
            }
            this.f16070e.mo55076d(0);
            int q = this.f16070e.mo55093q();
            if (!m19577a(q, (long) this.f16078m) || C6895r.m18251a(q) == -1) {
                iVar.mo53902b(1);
                this.f16078m = 0;
                return 0;
            }
            this.f16071f.mo53060a(q);
            if (this.f16080o == -9223372036854775807L) {
                this.f16080o = this.f16084s.mo53943c(iVar.mo53892c());
                if (this.f16069d != -9223372036854775807L) {
                    this.f16080o += this.f16069d - this.f16084s.mo53943c(0);
                }
            }
            this.f16083r = this.f16071f.f15192c;
            C7228e eVar = this.f16084s;
            if (eVar instanceof C7225b) {
                C7225b bVar = (C7225b) eVar;
                bVar.mo53944a(m19573a(this.f16081p + ((long) this.f16071f.f15196g)), iVar.mo53892c() + ((long) this.f16071f.f15192c));
                if (this.f16086u && bVar.mo53945b(this.f16087v)) {
                    this.f16086u = false;
                    this.f16077l = this.f16076k;
                }
            }
        }
        int a = this.f16077l.mo53948a((C7668g) iVar, this.f16083r, true);
        if (a == -1) {
            return -1;
        }
        int i = this.f16083r - a;
        this.f16083r = i;
        if (i > 0) {
            return 0;
        }
        this.f16077l.mo53950a(m19573a(this.f16081p), 1, this.f16071f.f15192c, 0, (C7357x.C7358a) null);
        this.f16081p += (long) this.f16071f.f15196g;
        this.f16083r = 0;
        return 0;
    }

    /* renamed from: d */
    private boolean m19583d(C7279i iVar) throws IOException {
        C7228e eVar = this.f16084s;
        if (eVar != null) {
            long c = eVar.mo53942c();
            if (c != -1 && iVar.mo53891b() > c - 4) {
                return true;
            }
        }
        try {
            return !iVar.mo53905b(this.f16070e.mo55077d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C7262h[] m19584d() {
        return new C7262h[]{new C7227d()};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.applovin.exoplayer2.e.f.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.applovin.exoplayer2.e.f.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.applovin.exoplayer2.e.f.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.p186e.p192f.C7228e m19585e(com.applovin.exoplayer2.p186e.C7279i r12) throws java.io.IOException {
        /*
            r11 = this;
            com.applovin.exoplayer2.e.f.e r0 = r11.m19586f(r12)
            com.applovin.exoplayer2.g.a r1 = r11.f16079n
            long r2 = r12.mo53892c()
            com.applovin.exoplayer2.e.f.c r1 = m19575a((com.applovin.exoplayer2.p198g.C7399a) r1, (long) r2)
            boolean r2 = r11.f16085t
            if (r2 == 0) goto L_0x0018
            com.applovin.exoplayer2.e.f.e$a r12 = new com.applovin.exoplayer2.e.f.e$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f16068c
            r3 = r3 & 4
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.mo53871b()
            long r0 = r1.mo53942c()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.mo53871b()
            long r0 = r0.mo53942c()
            goto L_0x002b
        L_0x0039:
            com.applovin.exoplayer2.g.a r0 = r11.f16079n
            long r0 = m19574a((com.applovin.exoplayer2.p198g.C7399a) r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            com.applovin.exoplayer2.e.f.b r0 = new com.applovin.exoplayer2.e.f.b
            long r7 = r12.mo53892c()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            r1 = 1
            if (r0 == 0) goto L_0x0062
            boolean r2 = r0.mo53870a()
            if (r2 != 0) goto L_0x006e
            int r2 = r11.f16068c
            r2 = r2 & r1
            if (r2 == 0) goto L_0x006e
        L_0x0062:
            int r0 = r11.f16068c
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            com.applovin.exoplayer2.e.f.e r0 = r11.m19580b(r12, r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p192f.C7227d.m19585e(com.applovin.exoplayer2.e.i):com.applovin.exoplayer2.e.f.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.p186e.p192f.C7228e m19586f(com.applovin.exoplayer2.p186e.C7279i r11) throws java.io.IOException {
        /*
            r10 = this;
            com.applovin.exoplayer2.l.y r5 = new com.applovin.exoplayer2.l.y
            com.applovin.exoplayer2.b.r$a r0 = r10.f16071f
            int r0 = r0.f15192c
            r5.<init>((int) r0)
            byte[] r0 = r5.mo55077d()
            com.applovin.exoplayer2.b.r$a r1 = r10.f16071f
            int r1 = r1.f15192c
            r6 = 0
            r11.mo53908d(r0, r6, r1)
            com.applovin.exoplayer2.b.r$a r0 = r10.f16071f
            int r0 = r0.f15190a
            r1 = 1
            r0 = r0 & r1
            r2 = 21
            if (r0 == 0) goto L_0x002a
            com.applovin.exoplayer2.b.r$a r0 = r10.f16071f
            int r0 = r0.f15194e
            if (r0 == r1) goto L_0x0030
            r2 = 36
            r7 = 36
            goto L_0x0037
        L_0x002a:
            com.applovin.exoplayer2.b.r$a r0 = r10.f16071f
            int r0 = r0.f15194e
            if (r0 == r1) goto L_0x0033
        L_0x0030:
            r7 = 21
            goto L_0x0037
        L_0x0033:
            r2 = 13
            r7 = 13
        L_0x0037:
            int r8 = m19572a((com.applovin.exoplayer2.p221l.C7772y) r5, (int) r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0066
            if (r8 != r9) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x0061
            long r0 = r11.mo53893d()
            long r2 = r11.mo53892c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f16071f
            com.applovin.exoplayer2.e.f.f r0 = com.applovin.exoplayer2.p186e.p192f.C7230f.m19597a(r0, r2, r4, r5)
            com.applovin.exoplayer2.b.r$a r1 = r10.f16071f
            int r1 = r1.f15192c
            r11.mo53902b(r1)
            goto L_0x00b6
        L_0x0061:
            r0 = 0
            r11.mo53899a()
            goto L_0x00b6
        L_0x0066:
            long r0 = r11.mo53893d()
            long r2 = r11.mo53892c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f16071f
            com.applovin.exoplayer2.e.f.g r0 = com.applovin.exoplayer2.p186e.p192f.C7231g.m19604a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x00a0
            com.applovin.exoplayer2.e.r r1 = r10.f16072g
            boolean r1 = r1.mo54084a()
            if (r1 != 0) goto L_0x00a0
            r11.mo53899a()
            int r7 = r7 + 141
            r11.mo53907c(r7)
            com.applovin.exoplayer2.l.y r1 = r10.f16070e
            byte[] r1 = r1.mo55077d()
            r2 = 3
            r11.mo53908d(r1, r6, r2)
            com.applovin.exoplayer2.l.y r1 = r10.f16070e
            r1.mo55076d(r6)
            com.applovin.exoplayer2.e.r r1 = r10.f16072g
            com.applovin.exoplayer2.l.y r2 = r10.f16070e
            int r2 = r2.mo55089m()
            r1.mo54085a((int) r2)
        L_0x00a0:
            com.applovin.exoplayer2.b.r$a r1 = r10.f16071f
            int r1 = r1.f15192c
            r11.mo53902b(r1)
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r0.mo53870a()
            if (r1 != 0) goto L_0x00b6
            if (r8 != r9) goto L_0x00b6
            com.applovin.exoplayer2.e.f.e r11 = r10.m19580b(r11, r6)
            return r11
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p192f.C7227d.m19586f(com.applovin.exoplayer2.e.i):com.applovin.exoplayer2.e.f.e");
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        m19581b();
        int b = m19579b(iVar);
        if (b == -1 && (this.f16084s instanceof C7225b)) {
            long a = m19573a(this.f16081p);
            if (this.f16084s.mo53871b() != a) {
                ((C7225b) this.f16084s).mo53946d(a);
                this.f16075j.mo53896a(this.f16084s);
            }
        }
        return b;
    }

    /* renamed from: a */
    public void mo53947a() {
        this.f16085t = true;
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f16078m = 0;
        this.f16080o = -9223372036854775807L;
        this.f16081p = 0;
        this.f16083r = 0;
        this.f16087v = j2;
        C7228e eVar = this.f16084s;
        if ((eVar instanceof C7225b) && !((C7225b) eVar).mo53945b(j2)) {
            this.f16086u = true;
            this.f16077l = this.f16074i;
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16075j = jVar;
        C7357x a = jVar.mo53894a(0, 1);
        this.f16076k = a;
        this.f16077l = a;
        this.f16075j.mo53895a();
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        return m19578a(iVar, true);
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
