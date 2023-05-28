package com.applovin.exoplayer2.p180a;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C6811ak;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7818o;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.common.p183a.C7039u;
import com.applovin.exoplayer2.common.p183a.C7048x;
import com.applovin.exoplayer2.p180a.C6783b;
import com.applovin.exoplayer2.p181b.C6864g;
import com.applovin.exoplayer2.p182c.C6920e;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7499j;
import com.applovin.exoplayer2.p206h.C7505m;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p220k.C7660d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7744m;
import com.applovin.exoplayer2.p221l.C7749o;
import com.applovin.exoplayer2.p221l.C7751p;
import com.applovin.exoplayer2.p222m.C7814n;
import com.applovin.exoplayer2.p222m.C7816o;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.a.a */
public class C6781a implements C6814an.C6820d, C6864g, C7154g, C7512q, C7660d.C7661a, C7814n {

    /* renamed from: a */
    private final C7732d f14584a;

    /* renamed from: b */
    private final C6904ba.C6906a f14585b = new C6904ba.C6906a();

    /* renamed from: c */
    private final C6904ba.C6908c f14586c = new C6904ba.C6908c();

    /* renamed from: d */
    private final C6782a f14587d = new C6782a(this.f14585b);

    /* renamed from: e */
    private final SparseArray<C6783b.C6784a> f14588e = new SparseArray<>();

    /* renamed from: f */
    private C7751p<C6783b> f14589f;

    /* renamed from: g */
    private C6814an f14590g;

    /* renamed from: h */
    private C7749o f14591h;

    /* renamed from: i */
    private boolean f14592i;

    /* renamed from: com.applovin.exoplayer2.a.a$a */
    private static final class C6782a {

        /* renamed from: a */
        private final C6904ba.C6906a f14593a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C7033s<C7509p.C7510a> f14594b = C7033s.m18803g();

        /* renamed from: c */
        private C7039u<C7509p.C7510a, C6904ba> f14595c = C7039u.m18834a();

        /* renamed from: d */
        private C7509p.C7510a f14596d;

        /* renamed from: e */
        private C7509p.C7510a f14597e;

        /* renamed from: f */
        private C7509p.C7510a f14598f;

        public C6782a(C6904ba.C6906a aVar) {
            this.f14593a = aVar;
        }

        /* renamed from: a */
        private static C7509p.C7510a m17240a(C6814an anVar, C7033s<C7509p.C7510a> sVar, C7509p.C7510a aVar, C6904ba.C6906a aVar2) {
            C6904ba S = anVar.mo52762S();
            int F = anVar.mo52749F();
            Object a = S.mo53081d() ? null : S.mo52443a(F);
            int b = (anVar.mo52754K() || S.mo53081d()) ? -1 : S.mo53078a(F, aVar2).mo53091b(C7476h.m20800b(anVar.mo52752I()) - aVar2.mo53094c());
            for (int i = 0; i < sVar.size(); i++) {
                C7509p.C7510a aVar3 = (C7509p.C7510a) sVar.get(i);
                if (m17243a(aVar3, a, anVar.mo52754K(), anVar.mo52755L(), anVar.mo52756M(), b)) {
                    return aVar3;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (m17243a(aVar, a, anVar.mo52754K(), anVar.mo52755L(), anVar.mo52756M(), b)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
            if (r3.f14594b.contains(r3.f14596d) == false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            if (com.applovin.exoplayer2.common.base.Objects.equal(r3.f14596d, r3.f14598f) == false) goto L_0x0056;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m17241a(com.applovin.exoplayer2.C6904ba r4) {
            /*
                r3 = this;
                com.applovin.exoplayer2.common.a.u$a r0 = com.applovin.exoplayer2.common.p183a.C7039u.m18837b()
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r1 = r3.f14594b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0035
                com.applovin.exoplayer2.h.p$a r1 = r3.f14597e
                r3.m17242a((com.applovin.exoplayer2.common.p183a.C7039u.C7040a<com.applovin.exoplayer2.p206h.C7509p.C7510a, com.applovin.exoplayer2.C6904ba>) r0, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r1, (com.applovin.exoplayer2.C6904ba) r4)
                com.applovin.exoplayer2.h.p$a r1 = r3.f14598f
                com.applovin.exoplayer2.h.p$a r2 = r3.f14597e
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x0020
                com.applovin.exoplayer2.h.p$a r1 = r3.f14598f
                r3.m17242a((com.applovin.exoplayer2.common.p183a.C7039u.C7040a<com.applovin.exoplayer2.p206h.C7509p.C7510a, com.applovin.exoplayer2.C6904ba>) r0, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r1, (com.applovin.exoplayer2.C6904ba) r4)
            L_0x0020:
                com.applovin.exoplayer2.h.p$a r1 = r3.f14596d
                com.applovin.exoplayer2.h.p$a r2 = r3.f14597e
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x005b
                com.applovin.exoplayer2.h.p$a r1 = r3.f14596d
                com.applovin.exoplayer2.h.p$a r2 = r3.f14598f
                boolean r1 = com.applovin.exoplayer2.common.base.Objects.equal(r1, r2)
                if (r1 != 0) goto L_0x005b
                goto L_0x0056
            L_0x0035:
                r1 = 0
            L_0x0036:
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r2 = r3.f14594b
                int r2 = r2.size()
                if (r1 >= r2) goto L_0x004c
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r2 = r3.f14594b
                java.lang.Object r2 = r2.get(r1)
                com.applovin.exoplayer2.h.p$a r2 = (com.applovin.exoplayer2.p206h.C7509p.C7510a) r2
                r3.m17242a((com.applovin.exoplayer2.common.p183a.C7039u.C7040a<com.applovin.exoplayer2.p206h.C7509p.C7510a, com.applovin.exoplayer2.C6904ba>) r0, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r2, (com.applovin.exoplayer2.C6904ba) r4)
                int r1 = r1 + 1
                goto L_0x0036
            L_0x004c:
                com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.h.p$a> r1 = r3.f14594b
                com.applovin.exoplayer2.h.p$a r2 = r3.f14596d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L_0x005b
            L_0x0056:
                com.applovin.exoplayer2.h.p$a r1 = r3.f14596d
                r3.m17242a((com.applovin.exoplayer2.common.p183a.C7039u.C7040a<com.applovin.exoplayer2.p206h.C7509p.C7510a, com.applovin.exoplayer2.C6904ba>) r0, (com.applovin.exoplayer2.p206h.C7509p.C7510a) r1, (com.applovin.exoplayer2.C6904ba) r4)
            L_0x005b:
                com.applovin.exoplayer2.common.a.u r4 = r0.mo53563a()
                r3.f14595c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p180a.C6781a.C6782a.m17241a(com.applovin.exoplayer2.ba):void");
        }

        /* renamed from: a */
        private void m17242a(C7039u.C7040a<C7509p.C7510a, C6904ba> aVar, C7509p.C7510a aVar2, C6904ba baVar) {
            if (aVar2 != null) {
                if (baVar.mo52448c(aVar2.f17251a) != -1 || (baVar = this.f14595c.get(aVar2)) != null) {
                    aVar.mo53561a(aVar2, baVar);
                }
            }
        }

        /* renamed from: a */
        private static boolean m17243a(C7509p.C7510a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f17251a.equals(obj)) {
                return false;
            }
            return (z && aVar.f17252b == i && aVar.f17253c == i2) || (!z && aVar.f17252b == -1 && aVar.f17255e == i3);
        }

        /* renamed from: a */
        public C6904ba mo52525a(C7509p.C7510a aVar) {
            return this.f14595c.get(aVar);
        }

        /* renamed from: a */
        public C7509p.C7510a mo52526a() {
            return this.f14596d;
        }

        /* renamed from: a */
        public void mo52527a(C6814an anVar) {
            this.f14596d = m17240a(anVar, this.f14594b, this.f14597e, this.f14593a);
        }

        /* renamed from: a */
        public void mo52528a(List<C7509p.C7510a> list, C7509p.C7510a aVar, C6814an anVar) {
            this.f14594b = C7033s.m18797a(list);
            if (!list.isEmpty()) {
                this.f14597e = list.get(0);
                this.f14598f = (C7509p.C7510a) C7717a.m22120b(aVar);
            }
            if (this.f14596d == null) {
                this.f14596d = m17240a(anVar, this.f14594b, this.f14597e, this.f14593a);
            }
            m17241a(anVar.mo52762S());
        }

        /* renamed from: b */
        public C7509p.C7510a mo52529b() {
            return this.f14597e;
        }

        /* renamed from: b */
        public void mo52530b(C6814an anVar) {
            this.f14596d = m17240a(anVar, this.f14594b, this.f14597e, this.f14593a);
            m17241a(anVar.mo52762S());
        }

        /* renamed from: c */
        public C7509p.C7510a mo52531c() {
            return this.f14598f;
        }

        /* renamed from: d */
        public C7509p.C7510a mo52532d() {
            if (this.f14594b.isEmpty()) {
                return null;
            }
            return (C7509p.C7510a) C7048x.m18905c(this.f14594b);
        }
    }

    public C6781a(C7732d dVar) {
        this.f14584a = (C7732d) C7717a.m22120b(dVar);
        this.f14589f = new C7751p<>(C7728ai.m22247c(), dVar, $$Lambda$a$JouN47HfkIX07cBffWHZb6J5e7Y.INSTANCE);
    }

    /* renamed from: a */
    private C6783b.C6784a m17107a(C7509p.C7510a aVar) {
        C7717a.m22120b(this.f14590g);
        C6904ba a = aVar == null ? null : this.f14587d.mo52525a(aVar);
        if (aVar != null && a != null) {
            return mo52455a(a, a.mo52441a(aVar.f17251a, this.f14585b).f15258c, aVar);
        }
        int G = this.f14590g.mo52750G();
        C6904ba S = this.f14590g.mo52762S();
        if (!(G < S.mo52823b())) {
            S = C6904ba.f15253a;
        }
        return mo52455a(S, G, (C7509p.C7510a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17112a(C6783b.C6784a aVar, int i, C6783b bVar) {
        bVar.mo52582c(aVar);
        bVar.mo52597f(aVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17113a(C6783b.C6784a aVar, int i, C6814an.C6821e eVar, C6814an.C6821e eVar2, C6783b bVar) {
        bVar.mo52589d(aVar, i);
        bVar.mo52550a(aVar, eVar, eVar2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17122a(C6783b.C6784a aVar, C6920e eVar, C6783b bVar) {
        bVar.mo52590d(aVar, eVar);
        bVar.mo52571b(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17128a(C6783b.C6784a aVar, C7816o oVar, C6783b bVar) {
        bVar.mo52557a(aVar, oVar);
        bVar.mo52537a(aVar, oVar.f18544b, oVar.f18545c, oVar.f18546d, oVar.f18547e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17129a(C6783b.C6784a aVar, C7864v vVar, C6924h hVar, C6783b bVar) {
        bVar.mo52574b(aVar, vVar);
        bVar.mo52575b(aVar, vVar, hVar);
        bVar.mo52541a(aVar, 2, vVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17132a(C6783b.C6784a aVar, String str, long j, long j2, C6783b bVar) {
        bVar.mo52578b(aVar, str, j);
        long j3 = j;
        bVar.mo52579b(aVar, str, j2, j3);
        bVar.mo52542a(aVar, 2, str, j3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m17136a(C6783b bVar, C7744m mVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17137a(C6814an anVar, C6783b bVar, C7744m mVar) {
        bVar.mo52567a(anVar, new C6783b.C6785b(mVar, this.f14588e));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m17141b(C6783b.C6784a aVar, C6920e eVar, C6783b bVar) {
        bVar.mo52584c(aVar, eVar);
        bVar.mo52540a(aVar, 2, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m17143b(C6783b.C6784a aVar, C7864v vVar, C6924h hVar, C6783b bVar) {
        bVar.mo52558a(aVar, vVar);
        bVar.mo52559a(aVar, vVar, hVar);
        bVar.mo52541a(aVar, 1, vVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m17145b(C6783b.C6784a aVar, String str, long j, long j2, C6783b bVar) {
        bVar.mo52563a(aVar, str, j);
        long j3 = j;
        bVar.mo52564a(aVar, str, j2, j3);
        bVar.mo52542a(aVar, 1, str, j3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m17151c(C6783b.C6784a aVar, C6920e eVar, C6783b bVar) {
        bVar.mo52572b(aVar, eVar);
        bVar.mo52571b(aVar, 1, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m17154c(C6783b.C6784a aVar, boolean z, C6783b bVar) {
        bVar.mo52592d(aVar, z);
        bVar.mo52587c(aVar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m17157d(C6783b.C6784a aVar, C6920e eVar, C6783b bVar) {
        bVar.mo52551a(aVar, eVar);
        bVar.mo52540a(aVar, 1, eVar);
    }

    /* renamed from: f */
    private C6783b.C6784a m17162f() {
        return m17107a(this.f14587d.mo52529b());
    }

    /* renamed from: f */
    private C6783b.C6784a m17163f(int i, C7509p.C7510a aVar) {
        C7717a.m22120b(this.f14590g);
        boolean z = true;
        if (aVar != null) {
            if (this.f14587d.mo52525a(aVar) == null) {
                z = false;
            }
            return z ? m17107a(aVar) : mo52455a(C6904ba.f15253a, i, aVar);
        }
        C6904ba S = this.f14590g.mo52762S();
        if (i >= S.mo52823b()) {
            z = false;
        }
        if (!z) {
            S = C6904ba.f15253a;
        }
        return mo52455a(S, i, (C7509p.C7510a) null);
    }

    /* renamed from: g */
    private C6783b.C6784a m17165g() {
        return m17107a(this.f14587d.mo52531c());
    }

    /* renamed from: h */
    private C6783b.C6784a m17167h() {
        return m17107a(this.f14587d.mo52532d());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m17168i() {
        this.f14589f.mo55024b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C6783b.C6784a mo52455a(C6904ba baVar, int i, C7509p.C7510a aVar) {
        long j;
        C6904ba baVar2 = baVar;
        int i2 = i;
        C7509p.C7510a aVar2 = baVar.mo53081d() ? null : aVar;
        long a = this.f14584a.mo54963a();
        boolean z = true;
        boolean z2 = baVar2.equals(this.f14590g.mo52762S()) && i2 == this.f14590g.mo52750G();
        long j2 = 0;
        if (aVar2 != null && aVar2.mo54546a()) {
            if (!(z2 && this.f14590g.mo52755L() == aVar2.f17252b && this.f14590g.mo52756M() == aVar2.f17253c)) {
                z = false;
            }
            if (z) {
                j2 = this.f14590g.mo52752I();
            }
        } else if (z2) {
            j = this.f14590g.mo52757N();
            return new C6783b.C6784a(a, baVar, i, aVar2, j, this.f14590g.mo52762S(), this.f14590g.mo52750G(), this.f14587d.mo52526a(), this.f14590g.mo52752I(), this.f14590g.mo52753J());
        } else if (!baVar.mo53081d()) {
            j2 = baVar2.mo53079a(i2, this.f14586c).mo53104a();
        }
        j = j2;
        return new C6783b.C6784a(a, baVar, i, aVar2, j, this.f14590g.mo52762S(), this.f14590g.mo52750G(), this.f14587d.mo52526a(), this.f14590g.mo52752I(), this.f14590g.mo52753J());
    }

    /* renamed from: a */
    public /* synthetic */ void mo52456a() {
        C6814an.C6820d.CC.$default$a(this);
    }

    /* renamed from: a */
    public final void mo52457a(float f) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1019, (C7751p.C7752a<C6783b>) new C7751p.C7752a(f) {
            public final /* synthetic */ float f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52534a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo52458a(int i, int i2) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i, i2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52536a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public final void mo52459a(int i, long j) {
        C6783b.C6784a f = m17162f();
        mo52470a(f, (int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i, j) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52538a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public final void mo52460a(int i, long j, long j2) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1012, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52570b(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public final void mo52461a(int i, C7509p.C7510a aVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52588d(C6783b.C6784a.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo52462a(int i, C7509p.C7510a aVar, int i2) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i2) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17112a(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public final void mo52463a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, 1000, (C7751p.C7752a<C6783b>) new C7751p.C7752a(jVar, mVar) {
            public final /* synthetic */ C7499j f$1;
            public final /* synthetic */ C7505m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52554a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public final void mo52464a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, 1003, (C7751p.C7752a<C6783b>) new C7751p.C7752a(jVar, mVar, iOException, z) {
            public final /* synthetic */ C7499j f$1;
            public final /* synthetic */ C7505m f$2;
            public final /* synthetic */ IOException f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52555a(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* renamed from: a */
    public final void mo52465a(int i, C7509p.C7510a aVar, C7505m mVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, 1004, (C7751p.C7752a<C6783b>) new C7751p.C7752a(mVar) {
            public final /* synthetic */ C7505m f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52556a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52466a(int i, C7509p.C7510a aVar, Exception exc) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, (C7751p.C7752a<C6783b>) new C7751p.C7752a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52591d(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo52467a(int i, boolean z) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, i, z);
    }

    /* renamed from: a */
    public final void mo52468a(long j) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND, (C7751p.C7752a<C6783b>) new C7751p.C7752a(j) {
            public final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52543a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52469a(long j, int i) {
        C6783b.C6784a f = m17162f();
        mo52470a(f, (int) IronSourceError.ERROR_RV_LOAD_DURING_LOAD, (C7751p.C7752a<C6783b>) new C7751p.C7752a(j, i) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52544a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52470a(C6783b.C6784a aVar, int i, C7751p.C7752a<C6783b> aVar2) {
        this.f14588e.put(i, aVar);
        this.f14589f.mo55025b(i, aVar2);
    }

    /* renamed from: a */
    public final void mo52471a(C6787ab abVar, int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 1, (C7751p.C7752a<C6783b>) new C7751p.C7752a(abVar, i) {
            public final /* synthetic */ C6787ab f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52545a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo52472a(C6797ac acVar) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 14, (C7751p.C7752a<C6783b>) new C7751p.C7752a(acVar) {
            public final /* synthetic */ C6797ac f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52546a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52473a(com.applovin.exoplayer2.C6811ak r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.applovin.exoplayer2.C7819p
            if (r0 == 0) goto L_0x0017
            r0 = r4
            com.applovin.exoplayer2.p r0 = (com.applovin.exoplayer2.C7819p) r0
            com.applovin.exoplayer2.h.o r1 = r0.f18570f
            if (r1 == 0) goto L_0x0017
            com.applovin.exoplayer2.h.p$a r1 = new com.applovin.exoplayer2.h.p$a
            com.applovin.exoplayer2.h.o r0 = r0.f18570f
            r1.<init>((com.applovin.exoplayer2.p206h.C7508o) r0)
            com.applovin.exoplayer2.a.b$a r0 = r3.m17107a((com.applovin.exoplayer2.p206h.C7509p.C7510a) r1)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            com.applovin.exoplayer2.a.b$a r0 = r3.mo52521e()
        L_0x001e:
            r1 = 10
            com.applovin.exoplayer2.a.-$$Lambda$a$lOvv8fOvfbZyoM2wm55XcT07wsc r2 = new com.applovin.exoplayer2.a.-$$Lambda$a$lOvv8fOvfbZyoM2wm55XcT07wsc
            r2.<init>(r4)
            r3.mo52470a((com.applovin.exoplayer2.p180a.C6783b.C6784a) r0, (int) r1, (com.applovin.exoplayer2.p221l.C7751p.C7752a<com.applovin.exoplayer2.p180a.C6783b>) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p180a.C6781a.mo52473a(com.applovin.exoplayer2.ak):void");
    }

    /* renamed from: a */
    public final void mo52474a(C6813am amVar) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 12, (C7751p.C7752a<C6783b>) new C7751p.C7752a(amVar) {
            public final /* synthetic */ C6813am f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52548a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo52475a(C6814an.C6816a aVar) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 13, (C7751p.C7752a<C6783b>) new C7751p.C7752a(aVar) {
            public final /* synthetic */ C6814an.C6816a f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52549a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
        if (i == 1) {
            this.f14592i = false;
        }
        this.f14587d.mo52527a((C6814an) C7717a.m22120b(this.f14590g));
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 11, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i, eVar, eVar2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ C6814an.C6821e f$2;
            public final /* synthetic */ C6814an.C6821e f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void invoke(Object obj) {
                C6781a.m17113a(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo52477a(C6814an anVar, Looper looper) {
        C7717a.m22121b(this.f14590g == null || this.f14587d.f14594b.isEmpty());
        this.f14590g = (C6814an) C7717a.m22120b(anVar);
        this.f14591h = this.f14584a.mo54964a(looper, (Handler.Callback) null);
        this.f14589f = this.f14589f.mo55020a(looper, new C7751p.C7753b(anVar) {
            public final /* synthetic */ C6814an f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj, C7744m mVar) {
                C6781a.this.m17137a(this.f$1, (C6783b) obj, mVar);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, anVar, cVar);
    }

    /* renamed from: a */
    public final void mo52479a(C6904ba baVar, int i) {
        this.f14587d.mo52530b((C6814an) C7717a.m22120b(this.f14590g));
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 0, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52583c(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52480a(C6920e eVar) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, (C7751p.C7752a<C6783b>) new C7751p.C7752a(eVar) {
            public final /* synthetic */ C6920e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17141b(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public final void mo52481a(C7399a aVar) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, (int) IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS, (C7751p.C7752a<C6783b>) new C7751p.C7752a(aVar) {
            public final /* synthetic */ C7399a f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52552a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52482a(C7483ad adVar, C7644h hVar) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 2, (C7751p.C7752a<C6783b>) new C7751p.C7752a(adVar, hVar) {
            public final /* synthetic */ C7483ad f$1;
            public final /* synthetic */ C7644h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52553a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public final void mo52483a(C7816o oVar) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, (C7751p.C7752a<C6783b>) new C7751p.C7752a(oVar) {
            public final /* synthetic */ C7816o f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17128a(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo52484a(C7818o oVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
    }

    @Deprecated
    /* renamed from: a */
    public /* synthetic */ void mo52485a(C7864v vVar) {
        C6864g.CC.$default$a((C6864g) this, vVar);
    }

    /* renamed from: a */
    public final void mo52486a(C7864v vVar, C6924h hVar) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, (C7751p.C7752a<C6783b>) new C7751p.C7752a(vVar, hVar) {
            public final /* synthetic */ C7864v f$1;
            public final /* synthetic */ C6924h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                C6781a.m17129a(C6783b.C6784a.this, this.f$1, this.f$2, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public final void mo52487a(Exception exc) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_SHOW_EXCEPTION, (C7751p.C7752a<C6783b>) new C7751p.C7752a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52586c(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52488a(Object obj, long j) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_LOAD_DURING_SHOW, (C7751p.C7752a<C6783b>) new C7751p.C7752a(obj, j) {
            public final /* synthetic */ Object f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52561a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public final void mo52489a(String str) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1024, (C7751p.C7752a<C6783b>) new C7751p.C7752a(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52577b(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public final void mo52490a(String str, long j, long j2) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, (C7751p.C7752a<C6783b>) new C7751p.C7752a(str, j2, j) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                C6781a.m17132a(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3, (C6783b) obj);
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo52491a(List<C7540a> list) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, (List) list);
    }

    /* renamed from: a */
    public final void mo52492a(List<C7509p.C7510a> list, C7509p.C7510a aVar) {
        this.f14587d.mo52528a(list, aVar, (C6814an) C7717a.m22120b(this.f14590g));
    }

    /* renamed from: a */
    public final void mo52493a(boolean z, int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, -1, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z, i) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52566a(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    @Deprecated
    /* renamed from: a_ */
    public /* synthetic */ void mo52494a_(C7864v vVar) {
        C7814n.CC.$default$a_(this, vVar);
    }

    /* renamed from: a_ */
    public final void mo52495a_(boolean z) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1017, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52595e(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public final void mo52496b() {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, -1, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52568b(C6783b.C6784a.this);
            }
        });
    }

    /* renamed from: b */
    public final void mo52497b(int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 4, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52535a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public final void mo52498b(int i, long j, long j2) {
        C6783b.C6784a h = m17167h();
        mo52470a(h, 1006, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i, j, j2) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52539a(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: b */
    public final void mo52499b(int i, C7509p.C7510a aVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52593e(C6783b.C6784a.this);
            }
        });
    }

    /* renamed from: b */
    public final void mo52500b(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, 1001, (C7751p.C7752a<C6783b>) new C7751p.C7752a(jVar, mVar) {
            public final /* synthetic */ C7499j f$1;
            public final /* synthetic */ C7505m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52573b(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ void mo52501b(C6811ak akVar) {
        C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, akVar);
    }

    /* renamed from: b */
    public final void mo52502b(C6920e eVar) {
        C6783b.C6784a f = m17162f();
        mo52470a(f, (int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, (C7751p.C7752a<C6783b>) new C7751p.C7752a(eVar) {
            public final /* synthetic */ C6920e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17122a(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: b */
    public final void mo52503b(C7864v vVar, C6924h hVar) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1010, (C7751p.C7752a<C6783b>) new C7751p.C7752a(vVar, hVar) {
            public final /* synthetic */ C7864v f$1;
            public final /* synthetic */ C6924h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                C6781a.m17143b(C6783b.C6784a.this, this.f$1, this.f$2, (C6783b) obj);
            }
        });
    }

    /* renamed from: b */
    public final void mo52504b(Exception exc) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1018, (C7751p.C7752a<C6783b>) new C7751p.C7752a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52560a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public final void mo52505b(String str) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1013, (C7751p.C7752a<C6783b>) new C7751p.C7752a(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52562a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public final void mo52506b(String str, long j, long j2) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, 1009, (C7751p.C7752a<C6783b>) new C7751p.C7752a(str, j2, j) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ long f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
            }

            public final void invoke(Object obj) {
                C6781a.m17145b(C6783b.C6784a.this, this.f$1, this.f$2, this.f$3, (C6783b) obj);
            }
        });
    }

    /* renamed from: b */
    public final void mo52507b(boolean z, int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 5, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z, i) {
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52581b(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b_ */
    public final void mo52508b_(boolean z) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 3, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17154c(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: c */
    public void mo52509c() {
        C6783b.C6784a e = mo52521e();
        this.f14588e.put(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, e);
        mo52470a(e, (int) IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52599h(C6783b.C6784a.this);
            }
        });
        ((C7749o) C7717a.m22115a(this.f14591h)).mo54974a((Runnable) new Runnable() {
            public final void run() {
                C6781a.this.m17168i();
            }
        });
    }

    /* renamed from: c */
    public final void mo52510c(int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 6, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52569b(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: c */
    public final void mo52511c(int i, C7509p.C7510a aVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52596f(C6783b.C6784a.this);
            }
        });
    }

    /* renamed from: c */
    public final void mo52512c(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, 1002, (C7751p.C7752a<C6783b>) new C7751p.C7752a(jVar, mVar) {
            public final /* synthetic */ C7499j f$1;
            public final /* synthetic */ C7505m f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52585c(C6783b.C6784a.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public final void mo52513c(C6920e eVar) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.AUCTION_ERROR_DECOMPRESSION, (C7751p.C7752a<C6783b>) new C7751p.C7752a(eVar) {
            public final /* synthetic */ C6920e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17157d(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: c */
    public final void mo52514c(Exception exc) {
        C6783b.C6784a g = m17165g();
        mo52470a(g, (int) IronSourceError.ERROR_IS_LOAD_DURING_SHOW, (C7751p.C7752a<C6783b>) new C7751p.C7752a(exc) {
            public final /* synthetic */ Exception f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52576b(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    @Deprecated
    /* renamed from: c */
    public /* synthetic */ void mo52515c(boolean z) {
        C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, z);
    }

    /* renamed from: d */
    public final void mo52516d() {
        if (!this.f14592i) {
            C6783b.C6784a e = mo52521e();
            this.f14592i = true;
            mo52470a(e, -1, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6783b) obj).mo52533a(C6783b.C6784a.this);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo52517d(int i) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 8, (C7751p.C7752a<C6783b>) new C7751p.C7752a(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52594e(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* renamed from: d */
    public final void mo52518d(int i, C7509p.C7510a aVar) {
        C6783b.C6784a f = m17163f(i, aVar);
        mo52470a(f, (int) IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, (C7751p.C7752a<C6783b>) new C7751p.C7752a() {
            public final void invoke(Object obj) {
                ((C6783b) obj).mo52598g(C6783b.C6784a.this);
            }
        });
    }

    /* renamed from: d */
    public final void mo52519d(C6920e eVar) {
        C6783b.C6784a f = m17162f();
        mo52470a(f, 1014, (C7751p.C7752a<C6783b>) new C7751p.C7752a(eVar) {
            public final /* synthetic */ C6920e f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                C6781a.m17151c(C6783b.C6784a.this, this.f$1, (C6783b) obj);
            }
        });
    }

    /* renamed from: d */
    public void mo52520d(boolean z) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 7, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52565a(C6783b.C6784a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C6783b.C6784a mo52521e() {
        return m17107a(this.f14587d.mo52526a());
    }

    @Deprecated
    /* renamed from: e */
    public /* synthetic */ void mo52522e(int i) {
        C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, i);
    }

    @Deprecated
    /* renamed from: e */
    public /* synthetic */ void mo52523e(int i, C7509p.C7510a aVar) {
        C7154g.CC.$default$e(this, i, aVar);
    }

    /* renamed from: e */
    public final void mo52524e(boolean z) {
        C6783b.C6784a e = mo52521e();
        mo52470a(e, 9, (C7751p.C7752a<C6783b>) new C7751p.C7752a(z) {
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                ((C6783b) obj).mo52580b(C6783b.C6784a.this, this.f$1);
            }
        });
    }
}
