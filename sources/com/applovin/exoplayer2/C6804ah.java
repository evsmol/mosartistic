package com.applovin.exoplayer2;

import android.os.Handler;
import com.applovin.exoplayer2.p180a.C6781a;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p206h.C7499j;
import com.applovin.exoplayer2.p206h.C7500k;
import com.applovin.exoplayer2.p206h.C7502l;
import com.applovin.exoplayer2.p206h.C7505m;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p206h.C7537z;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.exoplayer2.ah */
final class C6804ah {

    /* renamed from: a */
    private final List<C6807c> f14780a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<C7506n, C6807c> f14781b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, C6807c> f14782c = new HashMap();

    /* renamed from: d */
    private final C6808d f14783d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7512q.C7513a f14784e = new C7512q.C7513a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7154g.C7155a f14785f = new C7154g.C7155a();

    /* renamed from: g */
    private final HashMap<C6807c, C6806b> f14786g = new HashMap<>();

    /* renamed from: h */
    private final Set<C6807c> f14787h = new HashSet();

    /* renamed from: i */
    private C7537z f14788i = new C7537z.C7538a(0);

    /* renamed from: j */
    private boolean f14789j;

    /* renamed from: k */
    private C7654aa f14790k;

    /* renamed from: com.applovin.exoplayer2.ah$a */
    private final class C6805a implements C7154g, C7512q {

        /* renamed from: b */
        private final C6807c f14792b;

        /* renamed from: c */
        private C7512q.C7513a f14793c;

        /* renamed from: d */
        private C7154g.C7155a f14794d;

        public C6805a(C6807c cVar) {
            this.f14793c = C6804ah.this.f14784e;
            this.f14794d = C6804ah.this.f14785f;
            this.f14792b = cVar;
        }

        /* renamed from: f */
        private boolean m17521f(int i, C7509p.C7510a aVar) {
            C7509p.C7510a aVar2;
            if (aVar != null) {
                aVar2 = C6804ah.m17502b(this.f14792b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a = C6804ah.m17500b(this.f14792b, i);
            if (this.f14793c.f17256a != a || !C7728ai.m22218a((Object) this.f14793c.f17257b, (Object) aVar2)) {
                this.f14793c = C6804ah.this.f14784e.mo54550a(a, aVar2, 0);
            }
            if (this.f14794d.f15732a == a && C7728ai.m22218a((Object) this.f14794d.f15733b, (Object) aVar2)) {
                return true;
            }
            this.f14794d = C6804ah.this.f14785f.mo53817a(a, aVar2);
            return true;
        }

        /* renamed from: a */
        public void mo52461a(int i, C7509p.C7510a aVar) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53818a();
            }
        }

        /* renamed from: a */
        public void mo52462a(int i, C7509p.C7510a aVar, int i2) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53819a(i2);
            }
        }

        /* renamed from: a */
        public void mo52463a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m17521f(i, aVar)) {
                this.f14793c.mo54555a(jVar, mVar);
            }
        }

        /* renamed from: a */
        public void mo52464a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
            if (m17521f(i, aVar)) {
                this.f14793c.mo54556a(jVar, mVar, iOException, z);
            }
        }

        /* renamed from: a */
        public void mo52465a(int i, C7509p.C7510a aVar, C7505m mVar) {
            if (m17521f(i, aVar)) {
                this.f14793c.mo54557a(mVar);
            }
        }

        /* renamed from: a */
        public void mo52466a(int i, C7509p.C7510a aVar, Exception exc) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53822a(exc);
            }
        }

        /* renamed from: b */
        public void mo52499b(int i, C7509p.C7510a aVar) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53823b();
            }
        }

        /* renamed from: b */
        public void mo52500b(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m17521f(i, aVar)) {
                this.f14793c.mo54560b(jVar, mVar);
            }
        }

        /* renamed from: c */
        public void mo52511c(int i, C7509p.C7510a aVar) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53824c();
            }
        }

        /* renamed from: c */
        public void mo52512c(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m17521f(i, aVar)) {
                this.f14793c.mo54562c(jVar, mVar);
            }
        }

        /* renamed from: d */
        public void mo52518d(int i, C7509p.C7510a aVar) {
            if (m17521f(i, aVar)) {
                this.f14794d.mo53825d();
            }
        }

        @Deprecated
        /* renamed from: e */
        public /* synthetic */ void mo52523e(int i, C7509p.C7510a aVar) {
            C7154g.CC.$default$e(this, i, aVar);
        }
    }

    /* renamed from: com.applovin.exoplayer2.ah$b */
    private static final class C6806b {

        /* renamed from: a */
        public final C7509p f14795a;

        /* renamed from: b */
        public final C7509p.C7511b f14796b;

        /* renamed from: c */
        public final C6805a f14797c;

        public C6806b(C7509p pVar, C7509p.C7511b bVar, C6805a aVar) {
            this.f14795a = pVar;
            this.f14796b = bVar;
            this.f14797c = aVar;
        }
    }

    /* renamed from: com.applovin.exoplayer2.ah$c */
    static final class C6807c implements C6803ag {

        /* renamed from: a */
        public final C7502l f14798a;

        /* renamed from: b */
        public final Object f14799b = new Object();

        /* renamed from: c */
        public final List<C7509p.C7510a> f14800c = new ArrayList();

        /* renamed from: d */
        public int f14801d;

        /* renamed from: e */
        public boolean f14802e;

        public C6807c(C7509p pVar, boolean z) {
            this.f14798a = new C7502l(pVar, z);
        }

        /* renamed from: a */
        public Object mo52712a() {
            return this.f14799b;
        }

        /* renamed from: a */
        public void mo52726a(int i) {
            this.f14801d = i;
            this.f14802e = false;
            this.f14800c.clear();
        }

        /* renamed from: b */
        public C6904ba mo52713b() {
            return this.f14798a.mo54542f();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ah$d */
    public interface C6808d {
        /* renamed from: e */
        void mo52727e();
    }

    public C6804ah(C6808d dVar, C6781a aVar, Handler handler) {
        this.f14783d = dVar;
        if (aVar != null) {
            this.f14784e.mo54552a(handler, (C7512q) aVar);
            this.f14785f.mo53820a(handler, (C7154g) aVar);
        }
    }

    /* renamed from: a */
    private static Object m17495a(C6807c cVar, Object obj) {
        return C6825ap.m17088a(cVar.f14799b, obj);
    }

    /* renamed from: a */
    private static Object m17496a(Object obj) {
        return C6825ap.m17087a(obj);
    }

    /* renamed from: a */
    private void m17497a(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C6807c remove = this.f14780a.remove(i3);
            this.f14782c.remove(remove.f14799b);
            m17504b(i3, -remove.f14798a.mo54542f().mo52823b());
            remove.f14802e = true;
            if (this.f14789j) {
                m17507d(remove);
            }
        }
    }

    /* renamed from: a */
    private void m17498a(C6807c cVar) {
        this.f14787h.add(cVar);
        C6806b bVar = this.f14786g.get(cVar);
        if (bVar != null) {
            bVar.f14795a.mo54446a(bVar.f14796b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17499a(C7509p pVar, C6904ba baVar) {
        this.f14783d.mo52727e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17500b(C6807c cVar, int i) {
        return i + cVar.f14801d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C7509p.C7510a m17502b(C6807c cVar, C7509p.C7510a aVar) {
        for (int i = 0; i < cVar.f14800c.size(); i++) {
            if (cVar.f14800c.get(i).f17254d == aVar.f17254d) {
                return aVar.mo54545a(m17495a(cVar, aVar.f17251a));
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Object m17503b(Object obj) {
        return C6825ap.m17090b(obj);
    }

    /* renamed from: b */
    private void m17504b(int i, int i2) {
        while (i < this.f14780a.size()) {
            this.f14780a.get(i).f14801d += i2;
            i++;
        }
    }

    /* renamed from: b */
    private void m17505b(C6807c cVar) {
        C6806b bVar = this.f14786g.get(cVar);
        if (bVar != null) {
            bVar.f14795a.mo54452b(bVar.f14796b);
        }
    }

    /* renamed from: c */
    private void m17506c(C6807c cVar) {
        C7502l lVar = cVar.f14798a;
        $$Lambda$ah$unZuB8b_HPPhNiAYs794BihersY r1 = new C7509p.C7511b() {
            public final void onSourceInfoRefreshed(C7509p pVar, C6904ba baVar) {
                C6804ah.this.m17499a(pVar, baVar);
            }
        };
        C6805a aVar = new C6805a(cVar);
        this.f14786g.put(cVar, new C6806b(lVar, r1, aVar));
        lVar.mo54443a(C7728ai.m22234b(), (C7512q) aVar);
        lVar.mo54442a(C7728ai.m22234b(), (C7154g) aVar);
        lVar.mo54447a((C7509p.C7511b) r1, this.f14790k);
    }

    /* renamed from: d */
    private void m17507d(C6807c cVar) {
        if (cVar.f14802e && cVar.f14800c.isEmpty()) {
            C6806b bVar = (C6806b) C7717a.m22120b(this.f14786g.remove(cVar));
            bVar.f14795a.mo54454c(bVar.f14796b);
            bVar.f14795a.mo54448a((C7512q) bVar.f14797c);
            bVar.f14795a.mo54445a((C7154g) bVar.f14797c);
            this.f14787h.remove(cVar);
        }
    }

    /* renamed from: e */
    private void m17508e() {
        Iterator<C6807c> it = this.f14787h.iterator();
        while (it.hasNext()) {
            C6807c next = it.next();
            if (next.f14800c.isEmpty()) {
                m17505b(next);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public C6904ba mo52714a(int i, int i2, int i3, C7537z zVar) {
        C7717a.m22118a(i >= 0 && i <= i2 && i2 <= mo52723b() && i3 >= 0);
        this.f14788i = zVar;
        if (i == i2 || i == i3) {
            return mo52725d();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.f14780a.get(min).f14801d;
        C7728ai.m22211a(this.f14780a, i, i2, i3);
        while (min <= max) {
            C6807c cVar = this.f14780a.get(min);
            cVar.f14801d = i4;
            i4 += cVar.f14798a.mo54542f().mo52823b();
            min++;
        }
        return mo52725d();
    }

    /* renamed from: a */
    public C6904ba mo52715a(int i, int i2, C7537z zVar) {
        C7717a.m22118a(i >= 0 && i <= i2 && i2 <= mo52723b());
        this.f14788i = zVar;
        m17497a(i, i2);
        return mo52725d();
    }

    /* renamed from: a */
    public C6904ba mo52716a(int i, List<C6807c> list, C7537z zVar) {
        int i2;
        if (!list.isEmpty()) {
            this.f14788i = zVar;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                C6807c cVar = list.get(i3 - i);
                if (i3 > 0) {
                    C6807c cVar2 = this.f14780a.get(i3 - 1);
                    i2 = cVar2.f14801d + cVar2.f14798a.mo54542f().mo52823b();
                } else {
                    i2 = 0;
                }
                cVar.mo52726a(i2);
                m17504b(i3, cVar.f14798a.mo54542f().mo52823b());
                this.f14780a.add(i3, cVar);
                this.f14782c.put(cVar.f14799b, cVar);
                if (this.f14789j) {
                    m17506c(cVar);
                    if (this.f14781b.isEmpty()) {
                        this.f14787h.add(cVar);
                    } else {
                        m17505b(cVar);
                    }
                }
            }
        }
        return mo52725d();
    }

    /* renamed from: a */
    public C6904ba mo52717a(C7537z zVar) {
        int b = mo52723b();
        if (zVar.mo54616a() != b) {
            zVar = zVar.mo54623d().mo54618a(0, b);
        }
        this.f14788i = zVar;
        return mo52725d();
    }

    /* renamed from: a */
    public C6904ba mo52718a(List<C6807c> list, C7537z zVar) {
        m17497a(0, this.f14780a.size());
        return mo52716a(this.f14780a.size(), list, zVar);
    }

    /* renamed from: a */
    public C7506n mo52719a(C7509p.C7510a aVar, C7657b bVar, long j) {
        Object a = m17496a(aVar.f17251a);
        C7509p.C7510a b = aVar.mo54545a(m17503b(aVar.f17251a));
        C6807c cVar = (C6807c) C7717a.m22120b(this.f14782c.get(a));
        m17498a(cVar);
        cVar.f14800c.add(b);
        C7500k a2 = cVar.f14798a.mo54541b(b, bVar, j);
        this.f14781b.put(a2, cVar);
        m17508e();
        return a2;
    }

    /* renamed from: a */
    public void mo52720a(C7506n nVar) {
        C6807c cVar = (C6807c) C7717a.m22120b(this.f14781b.remove(nVar));
        cVar.f14798a.mo54539a(nVar);
        cVar.f14800c.remove(((C7500k) nVar).f17222a);
        if (!this.f14781b.isEmpty()) {
            m17508e();
        }
        m17507d(cVar);
    }

    /* renamed from: a */
    public void mo52721a(C7654aa aaVar) {
        C7717a.m22121b(!this.f14789j);
        this.f14790k = aaVar;
        for (int i = 0; i < this.f14780a.size(); i++) {
            C6807c cVar = this.f14780a.get(i);
            m17506c(cVar);
            this.f14787h.add(cVar);
        }
        this.f14789j = true;
    }

    /* renamed from: a */
    public boolean mo52722a() {
        return this.f14789j;
    }

    /* renamed from: b */
    public int mo52723b() {
        return this.f14780a.size();
    }

    /* renamed from: c */
    public void mo52724c() {
        for (C6806b next : this.f14786g.values()) {
            try {
                next.f14795a.mo54454c(next.f14796b);
            } catch (RuntimeException e) {
                C7755q.m22362c("MediaSourceList", "Failed to release child source.", e);
            }
            next.f14795a.mo54448a((C7512q) next.f14797c);
            next.f14795a.mo54445a((C7154g) next.f14797c);
        }
        this.f14786g.clear();
        this.f14787h.clear();
        this.f14789j = false;
    }

    /* renamed from: d */
    public C6904ba mo52725d() {
        if (this.f14780a.isEmpty()) {
            return C6904ba.f15253a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f14780a.size(); i2++) {
            C6807c cVar = this.f14780a.get(i2);
            cVar.f14801d = i;
            i += cVar.f14798a.mo54542f().mo52823b();
        }
        return new C6825ap(this.f14780a, this.f14788i);
    }
}
