package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.p207a.C7478a;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.h.l */
public final class C7502l extends C7491e<Void> {

    /* renamed from: a */
    private final C7509p f17231a;

    /* renamed from: b */
    private final boolean f17232b;

    /* renamed from: c */
    private final C6904ba.C6908c f17233c;

    /* renamed from: d */
    private final C6904ba.C6906a f17234d;

    /* renamed from: e */
    private C7503a f17235e;

    /* renamed from: f */
    private C7500k f17236f;

    /* renamed from: g */
    private boolean f17237g;

    /* renamed from: h */
    private boolean f17238h;

    /* renamed from: i */
    private boolean f17239i;

    /* renamed from: com.applovin.exoplayer2.h.l$a */
    private static final class C7503a extends C7496h {

        /* renamed from: d */
        public static final Object f17240d = new Object();

        /* renamed from: e */
        private final Object f17241e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Object f17242f;

        private C7503a(C6904ba baVar, Object obj, Object obj2) {
            super(baVar);
            this.f17241e = obj;
            this.f17242f = obj2;
        }

        /* renamed from: a */
        public static C7503a m20983a(C6787ab abVar) {
            return new C7503a(new C7504b(abVar), C6904ba.C6908c.f15267a, f17240d);
        }

        /* renamed from: a */
        public static C7503a m20984a(C6904ba baVar, Object obj, Object obj2) {
            return new C7503a(baVar, obj, obj2);
        }

        /* renamed from: a */
        public C6904ba.C6906a mo52440a(int i, C6904ba.C6906a aVar, boolean z) {
            this.f17208c.mo52440a(i, aVar, z);
            if (C7728ai.m22218a(aVar.f15257b, this.f17242f) && z) {
                aVar.f15257b = f17240d;
            }
            return aVar;
        }

        /* renamed from: a */
        public C6904ba.C6908c mo52442a(int i, C6904ba.C6908c cVar, long j) {
            this.f17208c.mo52442a(i, cVar, j);
            if (C7728ai.m22218a(cVar.f15271b, this.f17241e)) {
                cVar.f15271b = C6904ba.C6908c.f15267a;
            }
            return cVar;
        }

        /* renamed from: a */
        public C7503a mo54544a(C6904ba baVar) {
            return new C7503a(baVar, this.f17241e, this.f17242f);
        }

        /* renamed from: a */
        public Object mo52443a(int i) {
            Object a = this.f17208c.mo52443a(i);
            return C7728ai.m22218a(a, this.f17242f) ? f17240d : a;
        }

        /* renamed from: c */
        public int mo52448c(Object obj) {
            Object obj2;
            C6904ba baVar = this.f17208c;
            if (f17240d.equals(obj) && (obj2 = this.f17242f) != null) {
                obj = obj2;
            }
            return baVar.mo52448c(obj);
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.l$b */
    public static final class C7504b extends C6904ba {

        /* renamed from: c */
        private final C6787ab f17243c;

        public C7504b(C6787ab abVar) {
            this.f17243c = abVar;
        }

        /* renamed from: a */
        public C6904ba.C6906a mo52440a(int i, C6904ba.C6906a aVar, boolean z) {
            Object obj = null;
            Integer num = z ? 0 : null;
            if (z) {
                obj = C7503a.f17240d;
            }
            aVar.mo53089a(num, obj, 0, -9223372036854775807L, 0, C7478a.f17133a, true);
            return aVar;
        }

        /* renamed from: a */
        public C6904ba.C6908c mo52442a(int i, C6904ba.C6908c cVar, long j) {
            C6904ba.C6908c cVar2 = cVar;
            cVar.mo53105a(C6904ba.C6908c.f15267a, this.f17243c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (C6787ab.C6794e) null, 0, -9223372036854775807L, 0, 0, 0);
            C6904ba.C6908c cVar3 = cVar;
            cVar3.f15282m = true;
            return cVar3;
        }

        /* renamed from: a */
        public Object mo52443a(int i) {
            return C7503a.f17240d;
        }

        /* renamed from: b */
        public int mo52823b() {
            return 1;
        }

        /* renamed from: c */
        public int mo52824c() {
            return 1;
        }

        /* renamed from: c */
        public int mo52448c(Object obj) {
            return obj == C7503a.f17240d ? 0 : -1;
        }
    }

    public C7502l(C7509p pVar, boolean z) {
        this.f17231a = pVar;
        this.f17232b = z && pVar.mo54457i();
        this.f17233c = new C6904ba.C6908c();
        this.f17234d = new C6904ba.C6906a();
        C6904ba h = pVar.mo54456h();
        if (h != null) {
            this.f17235e = C7503a.m20984a(h, (Object) null, (Object) null);
            this.f17239i = true;
            return;
        }
        this.f17235e = C7503a.m20983a(pVar.mo54543g());
    }

    /* renamed from: a */
    private Object m20968a(Object obj) {
        return (this.f17235e.f17242f == null || !obj.equals(C7503a.f17240d)) ? obj : this.f17235e.f17242f;
    }

    /* renamed from: a */
    private void m20969a(long j) {
        C7500k kVar = this.f17236f;
        int c = this.f17235e.mo52448c(kVar.f17222a.f17251a);
        if (c != -1) {
            long j2 = this.f17235e.mo53078a(c, this.f17234d).f15259d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            kVar.mo54531d(j);
        }
    }

    /* renamed from: b */
    private Object m20970b(Object obj) {
        return (this.f17235e.f17242f == null || !this.f17235e.f17242f.equals(obj)) ? obj : C7503a.f17240d;
    }

    /* renamed from: a */
    public C7500k mo54541b(C7509p.C7510a aVar, C7657b bVar, long j) {
        C7500k kVar = new C7500k(aVar, bVar, j);
        kVar.mo54529a(this.f17231a);
        if (this.f17238h) {
            kVar.mo54528a(aVar.mo54545a(m20968a(aVar.f17251a)));
        } else {
            this.f17236f = kVar;
            if (!this.f17237g) {
                this.f17237g = true;
                mo54519a(null, this.f17231a);
            }
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7509p.C7510a mo54518a(Void voidR, C7509p.C7510a aVar) {
        return aVar.mo54545a(m20970b(aVar.f17251a));
    }

    /* renamed from: a */
    public void mo54539a(C7506n nVar) {
        ((C7500k) nVar).mo54534i();
        if (nVar == this.f17236f) {
            this.f17236f = null;
        }
    }

    /* renamed from: a */
    public void mo54449a(C7654aa aaVar) {
        super.mo54449a(aaVar);
        if (!this.f17232b) {
            this.f17237g = true;
            mo54519a(null, this.f17231a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54520a(java.lang.Void r13, com.applovin.exoplayer2.p206h.C7509p r14, com.applovin.exoplayer2.C6904ba r15) {
        /*
            r12 = this;
            boolean r13 = r12.f17238h
            if (r13 == 0) goto L_0x0019
            com.applovin.exoplayer2.h.l$a r13 = r12.f17235e
            com.applovin.exoplayer2.h.l$a r13 = r13.mo54544a((com.applovin.exoplayer2.C6904ba) r15)
            r12.f17235e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f17236f
            if (r13 == 0) goto L_0x00b0
            long r13 = r13.mo54533h()
            r12.m20969a((long) r13)
            goto L_0x00b0
        L_0x0019:
            boolean r13 = r15.mo53081d()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f17239i
            if (r13 == 0) goto L_0x002a
            com.applovin.exoplayer2.h.l$a r13 = r12.f17235e
            com.applovin.exoplayer2.h.l$a r13 = r13.mo54544a((com.applovin.exoplayer2.C6904ba) r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = com.applovin.exoplayer2.C6904ba.C6908c.f15267a
            java.lang.Object r14 = com.applovin.exoplayer2.p206h.C7502l.C7503a.f17240d
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.p206h.C7502l.C7503a.m20984a((com.applovin.exoplayer2.C6904ba) r15, (java.lang.Object) r13, (java.lang.Object) r14)
        L_0x0032:
            r12.f17235e = r13
            goto L_0x00b0
        L_0x0036:
            com.applovin.exoplayer2.ba$c r13 = r12.f17233c
            r14 = 0
            r15.mo53079a((int) r14, (com.applovin.exoplayer2.C6904ba.C6908c) r13)
            com.applovin.exoplayer2.ba$c r13 = r12.f17233c
            long r0 = r13.mo53106b()
            com.applovin.exoplayer2.ba$c r13 = r12.f17233c
            java.lang.Object r13 = r13.f15271b
            com.applovin.exoplayer2.h.k r2 = r12.f17236f
            if (r2 == 0) goto L_0x0074
            long r2 = r2.mo54532g()
            com.applovin.exoplayer2.h.l$a r4 = r12.f17235e
            com.applovin.exoplayer2.h.k r5 = r12.f17236f
            com.applovin.exoplayer2.h.p$a r5 = r5.f17222a
            java.lang.Object r5 = r5.f17251a
            com.applovin.exoplayer2.ba$a r6 = r12.f17234d
            r4.mo52441a((java.lang.Object) r5, (com.applovin.exoplayer2.C6904ba.C6906a) r6)
            com.applovin.exoplayer2.ba$a r4 = r12.f17234d
            long r4 = r4.mo53094c()
            long r4 = r4 + r2
            com.applovin.exoplayer2.h.l$a r2 = r12.f17235e
            com.applovin.exoplayer2.ba$c r3 = r12.f17233c
            com.applovin.exoplayer2.ba$c r14 = r2.mo53079a((int) r14, (com.applovin.exoplayer2.C6904ba.C6908c) r3)
            long r2 = r14.mo53106b()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            com.applovin.exoplayer2.ba$c r7 = r12.f17233c
            com.applovin.exoplayer2.ba$a r8 = r12.f17234d
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.mo53076a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f17239i
            if (r14 == 0) goto L_0x0094
            com.applovin.exoplayer2.h.l$a r13 = r12.f17235e
            com.applovin.exoplayer2.h.l$a r13 = r13.mo54544a((com.applovin.exoplayer2.C6904ba) r15)
            goto L_0x0098
        L_0x0094:
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.p206h.C7502l.C7503a.m20984a((com.applovin.exoplayer2.C6904ba) r15, (java.lang.Object) r13, (java.lang.Object) r0)
        L_0x0098:
            r12.f17235e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f17236f
            if (r13 == 0) goto L_0x00b0
            r12.m20969a((long) r1)
            com.applovin.exoplayer2.h.p$a r14 = r13.f17222a
            com.applovin.exoplayer2.h.p$a r13 = r13.f17222a
            java.lang.Object r13 = r13.f17251a
            java.lang.Object r13 = r12.m20968a((java.lang.Object) r13)
            com.applovin.exoplayer2.h.p$a r13 = r14.mo54545a(r13)
            goto L_0x00b1
        L_0x00b0:
            r13 = 0
        L_0x00b1:
            r14 = 1
            r12.f17239i = r14
            r12.f17238h = r14
            com.applovin.exoplayer2.h.l$a r14 = r12.f17235e
            r12.mo54444a((com.applovin.exoplayer2.C6904ba) r14)
            if (r13 == 0) goto L_0x00c8
            com.applovin.exoplayer2.h.k r14 = r12.f17236f
            java.lang.Object r14 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r14)
            com.applovin.exoplayer2.h.k r14 = (com.applovin.exoplayer2.p206h.C7500k) r14
            r14.mo54528a((com.applovin.exoplayer2.p206h.C7509p.C7510a) r13)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7502l.mo54520a(java.lang.Void, com.applovin.exoplayer2.h.p, com.applovin.exoplayer2.ba):void");
    }

    /* renamed from: c */
    public void mo54453c() {
        this.f17238h = false;
        this.f17237g = false;
        super.mo54453c();
    }

    /* renamed from: e */
    public void mo54521e() {
    }

    /* renamed from: f */
    public C6904ba mo54542f() {
        return this.f17235e;
    }

    /* renamed from: g */
    public C6787ab mo54543g() {
        return this.f17231a.mo54543g();
    }
}
