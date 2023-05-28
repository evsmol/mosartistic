package com.applovin.exoplayer2.p221l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.p221l.C7744m;
import com.applovin.exoplayer2.p221l.C7751p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.applovin.exoplayer2.l.p */
public final class C7751p<T> {

    /* renamed from: a */
    private final C7732d f18290a;

    /* renamed from: b */
    private final C7749o f18291b;

    /* renamed from: c */
    private final C7753b<T> f18292c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<C7754c<T>> f18293d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f18294e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f18295f;

    /* renamed from: g */
    private boolean f18296g;

    /* renamed from: com.applovin.exoplayer2.l.p$a */
    public interface C7752a<T> {
        void invoke(T t);
    }

    /* renamed from: com.applovin.exoplayer2.l.p$b */
    public interface C7753b<T> {
        void invoke(T t, C7744m mVar);
    }

    /* renamed from: com.applovin.exoplayer2.l.p$c */
    private static final class C7754c<T> {

        /* renamed from: a */
        public final T f18297a;

        /* renamed from: b */
        private C7744m.C7746a f18298b = new C7744m.C7746a();

        /* renamed from: c */
        private boolean f18299c;

        /* renamed from: d */
        private boolean f18300d;

        public C7754c(T t) {
            this.f18297a = t;
        }

        /* renamed from: a */
        public void mo55027a(int i, C7752a<T> aVar) {
            if (!this.f18300d) {
                if (i != -1) {
                    this.f18298b.mo55015a(i);
                }
                this.f18299c = true;
                aVar.invoke(this.f18297a);
            }
        }

        /* renamed from: a */
        public void mo55028a(C7753b<T> bVar) {
            this.f18300d = true;
            if (this.f18299c) {
                bVar.invoke(this.f18297a, this.f18298b.mo55019a());
            }
        }

        /* renamed from: b */
        public void mo55029b(C7753b<T> bVar) {
            if (!this.f18300d && this.f18299c) {
                C7744m a = this.f18298b.mo55019a();
                this.f18298b = new C7744m.C7746a();
                this.f18299c = false;
                bVar.invoke(this.f18297a, a);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f18297a.equals(((C7754c) obj).f18297a);
        }

        public int hashCode() {
            return this.f18297a.hashCode();
        }
    }

    public C7751p(Looper looper, C7732d dVar, C7753b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private C7751p(CopyOnWriteArraySet<C7754c<T>> copyOnWriteArraySet, Looper looper, C7732d dVar, C7753b<T> bVar) {
        this.f18290a = dVar;
        this.f18293d = copyOnWriteArraySet;
        this.f18292c = bVar;
        this.f18294e = new ArrayDeque<>();
        this.f18295f = new ArrayDeque<>();
        this.f18291b = dVar.mo54964a(looper, new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                return C7751p.this.m22343a(message);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22342a(CopyOnWriteArraySet copyOnWriteArraySet, int i, C7752a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C7754c) it.next()).mo55027a(i, aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m22343a(Message message) {
        Iterator<C7754c<T>> it = this.f18293d.iterator();
        while (it.hasNext()) {
            it.next().mo55029b(this.f18292c);
            if (this.f18291b.mo54971a(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C7751p<T> mo55020a(Looper looper, C7753b<T> bVar) {
        return new C7751p<>(this.f18293d, looper, this.f18290a, bVar);
    }

    /* renamed from: a */
    public void mo55021a() {
        if (!this.f18295f.isEmpty()) {
            if (!this.f18291b.mo54971a(0)) {
                C7749o oVar = this.f18291b;
                oVar.mo54973a(oVar.mo54975b(0));
            }
            boolean z = !this.f18294e.isEmpty();
            this.f18294e.addAll(this.f18295f);
            this.f18295f.clear();
            if (!z) {
                while (!this.f18294e.isEmpty()) {
                    this.f18294e.peekFirst().run();
                    this.f18294e.removeFirst();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo55022a(int i, C7752a<T> aVar) {
        this.f18295f.add(new Runnable(new CopyOnWriteArraySet(this.f18293d), i, aVar) {
            public final /* synthetic */ CopyOnWriteArraySet f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ C7751p.C7752a f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7751p.m22342a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo55023a(T t) {
        if (!this.f18296g) {
            C7717a.m22120b(t);
            this.f18293d.add(new C7754c(t));
        }
    }

    /* renamed from: b */
    public void mo55024b() {
        Iterator<C7754c<T>> it = this.f18293d.iterator();
        while (it.hasNext()) {
            it.next().mo55028a(this.f18292c);
        }
        this.f18293d.clear();
        this.f18296g = true;
    }

    /* renamed from: b */
    public void mo55025b(int i, C7752a<T> aVar) {
        mo55022a(i, aVar);
        mo55021a();
    }

    /* renamed from: b */
    public void mo55026b(T t) {
        Iterator<C7754c<T>> it = this.f18293d.iterator();
        while (it.hasNext()) {
            C7754c next = it.next();
            if (next.f18297a.equals(t)) {
                next.mo55028a(this.f18292c);
                this.f18293d.remove(next);
            }
        }
    }
}
