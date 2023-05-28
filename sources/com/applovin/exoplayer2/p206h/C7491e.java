package com.applovin.exoplayer2.p206h;

import android.os.Handler;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.applovin.exoplayer2.h.e */
public abstract class C7491e<T> extends C7477a {

    /* renamed from: a */
    private final HashMap<T, C7493b<T>> f17190a = new HashMap<>();

    /* renamed from: b */
    private Handler f17191b;

    /* renamed from: c */
    private C7654aa f17192c;

    /* renamed from: com.applovin.exoplayer2.h.e$a */
    private final class C7492a implements C7154g, C7512q {

        /* renamed from: b */
        private final T f17194b;

        /* renamed from: c */
        private C7512q.C7513a f17195c;

        /* renamed from: d */
        private C7154g.C7155a f17196d;

        public C7492a(T t) {
            this.f17195c = C7491e.this.mo54440a((C7509p.C7510a) null);
            this.f17196d = C7491e.this.mo54450b((C7509p.C7510a) null);
            this.f17194b = t;
        }

        /* renamed from: a */
        private C7505m m20905a(C7505m mVar) {
            long a = C7491e.this.mo54517a(this.f17194b, mVar.f17249f);
            long a2 = C7491e.this.mo54517a(this.f17194b, mVar.f17250g);
            return (a == mVar.f17249f && a2 == mVar.f17250g) ? mVar : new C7505m(mVar.f17244a, mVar.f17245b, mVar.f17246c, mVar.f17247d, mVar.f17248e, a, a2);
        }

        /* renamed from: f */
        private boolean m20906f(int i, C7509p.C7510a aVar) {
            C7509p.C7510a aVar2;
            if (aVar != null) {
                aVar2 = C7491e.this.mo54518a(this.f17194b, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a = C7491e.this.mo54516a(this.f17194b, i);
            if (this.f17195c.f17256a != a || !C7728ai.m22218a((Object) this.f17195c.f17257b, (Object) aVar2)) {
                this.f17195c = C7491e.this.mo54439a(a, aVar2, 0);
            }
            if (this.f17196d.f15732a == a && C7728ai.m22218a((Object) this.f17196d.f15733b, (Object) aVar2)) {
                return true;
            }
            this.f17196d = C7491e.this.mo54438a(a, aVar2);
            return true;
        }

        /* renamed from: a */
        public void mo52461a(int i, C7509p.C7510a aVar) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53818a();
            }
        }

        /* renamed from: a */
        public void mo52462a(int i, C7509p.C7510a aVar, int i2) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53819a(i2);
            }
        }

        /* renamed from: a */
        public void mo52463a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m20906f(i, aVar)) {
                this.f17195c.mo54555a(jVar, m20905a(mVar));
            }
        }

        /* renamed from: a */
        public void mo52464a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
            if (m20906f(i, aVar)) {
                this.f17195c.mo54556a(jVar, m20905a(mVar), iOException, z);
            }
        }

        /* renamed from: a */
        public void mo52465a(int i, C7509p.C7510a aVar, C7505m mVar) {
            if (m20906f(i, aVar)) {
                this.f17195c.mo54557a(m20905a(mVar));
            }
        }

        /* renamed from: a */
        public void mo52466a(int i, C7509p.C7510a aVar, Exception exc) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53822a(exc);
            }
        }

        /* renamed from: b */
        public void mo52499b(int i, C7509p.C7510a aVar) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53823b();
            }
        }

        /* renamed from: b */
        public void mo52500b(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m20906f(i, aVar)) {
                this.f17195c.mo54560b(jVar, m20905a(mVar));
            }
        }

        /* renamed from: c */
        public void mo52511c(int i, C7509p.C7510a aVar) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53824c();
            }
        }

        /* renamed from: c */
        public void mo52512c(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
            if (m20906f(i, aVar)) {
                this.f17195c.mo54562c(jVar, m20905a(mVar));
            }
        }

        /* renamed from: d */
        public void mo52518d(int i, C7509p.C7510a aVar) {
            if (m20906f(i, aVar)) {
                this.f17196d.mo53825d();
            }
        }

        @Deprecated
        /* renamed from: e */
        public /* synthetic */ void mo52523e(int i, C7509p.C7510a aVar) {
            C7154g.CC.$default$e(this, i, aVar);
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.e$b */
    private static final class C7493b<T> {

        /* renamed from: a */
        public final C7509p f17197a;

        /* renamed from: b */
        public final C7509p.C7511b f17198b;

        /* renamed from: c */
        public final C7491e<T>.a f17199c;

        public C7493b(C7509p pVar, C7509p.C7511b bVar, C7491e<T>.a aVar) {
            this.f17197a = pVar;
            this.f17198b = bVar;
            this.f17199c = aVar;
        }
    }

    protected C7491e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo54516a(T t, int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo54517a(T t, long j) {
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7509p.C7510a mo54518a(T t, C7509p.C7510a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54441a() {
        for (C7493b next : this.f17190a.values()) {
            next.f17197a.mo54446a(next.f17198b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54449a(C7654aa aaVar) {
        this.f17192c = aaVar;
        this.f17191b = C7728ai.m22194a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54519a(T t, C7509p pVar) {
        C7717a.m22118a(!this.f17190a.containsKey(t));
        $$Lambda$e$OZCo_CmHiftu8XvuuLxkv425S0 r0 = new C7509p.C7511b(t) {
            public final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void onSourceInfoRefreshed(C7509p pVar, C6904ba baVar) {
                C7491e.this.m20894b(this.f$1, pVar, baVar);
            }
        };
        C7492a aVar = new C7492a(t);
        this.f17190a.put(t, new C7493b(pVar, r0, aVar));
        pVar.mo54443a((Handler) C7717a.m22120b(this.f17191b), (C7512q) aVar);
        pVar.mo54442a((Handler) C7717a.m22120b(this.f17191b), (C7154g) aVar);
        pVar.mo54447a((C7509p.C7511b) r0, this.f17192c);
        if (!mo54455d()) {
            pVar.mo54452b(r0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void m20894b(T t, C7509p pVar, C6904ba baVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo54451b() {
        for (C7493b next : this.f17190a.values()) {
            next.f17197a.mo54452b(next.f17198b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54453c() {
        for (C7493b next : this.f17190a.values()) {
            next.f17197a.mo54454c(next.f17198b);
            next.f17197a.mo54448a((C7512q) next.f17199c);
            next.f17197a.mo54445a((C7154g) next.f17199c);
        }
        this.f17190a.clear();
    }

    /* renamed from: e */
    public void mo54521e() throws IOException {
        for (C7493b<T> bVar : this.f17190a.values()) {
            bVar.f17197a.mo54521e();
        }
    }
}
