package com.applovin.exoplayer2.p185d;

import android.os.Handler;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.exoplayer2.d.g */
public interface C7154g {

    /* renamed from: com.applovin.exoplayer2.d.g$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C7154g gVar, int i, C7509p.C7510a aVar) {
        }

        public static void $default$a(C7154g gVar, int i, C7509p.C7510a aVar, int i2) {
        }

        public static void $default$a(C7154g gVar, int i, C7509p.C7510a aVar, Exception exc) {
        }

        public static void $default$b(C7154g gVar, int i, C7509p.C7510a aVar) {
        }

        public static void $default$c(C7154g gVar, int i, C7509p.C7510a aVar) {
        }

        public static void $default$d(C7154g gVar, int i, C7509p.C7510a aVar) {
        }

        @Deprecated
        public static void $default$e(C7154g gVar, int i, C7509p.C7510a aVar) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.d.g$a */
    public static class C7155a {

        /* renamed from: a */
        public final int f15732a;

        /* renamed from: b */
        public final C7509p.C7510a f15733b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C7156a> f15734c;

        /* renamed from: com.applovin.exoplayer2.d.g$a$a */
        private static final class C7156a {

            /* renamed from: a */
            public Handler f15735a;

            /* renamed from: b */
            public C7154g f15736b;

            public C7156a(Handler handler, C7154g gVar) {
                this.f15735a = handler;
                this.f15736b = gVar;
            }
        }

        public C7155a() {
            this(new CopyOnWriteArrayList(), 0, (C7509p.C7510a) null);
        }

        private C7155a(CopyOnWriteArrayList<C7156a> copyOnWriteArrayList, int i, C7509p.C7510a aVar) {
            this.f15734c = copyOnWriteArrayList;
            this.f15732a = i;
            this.f15733b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19132a(C7154g gVar, int i) {
            gVar.mo52523e(this.f15732a, this.f15733b);
            gVar.mo52462a(this.f15732a, this.f15733b, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19133a(C7154g gVar, Exception exc) {
            gVar.mo52466a(this.f15732a, this.f15733b, exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m19134b(C7154g gVar) {
            gVar.mo52518d(this.f15732a, this.f15733b);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m19135c(C7154g gVar) {
            gVar.mo52511c(this.f15732a, this.f15733b);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m19136d(C7154g gVar) {
            gVar.mo52499b(this.f15732a, this.f15733b);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m19137e(C7154g gVar) {
            gVar.mo52461a(this.f15732a, this.f15733b);
        }

        /* renamed from: a */
        public C7155a mo53817a(int i, C7509p.C7510a aVar) {
            return new C7155a(this.f15734c, i, aVar);
        }

        /* renamed from: a */
        public void mo53818a() {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b) {
                    public final /* synthetic */ C7154g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19137e(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo53819a(int i) {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b, i) {
                    public final /* synthetic */ C7154g f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19132a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo53820a(Handler handler, C7154g gVar) {
            C7717a.m22120b(handler);
            C7717a.m22120b(gVar);
            this.f15734c.add(new C7156a(handler, gVar));
        }

        /* renamed from: a */
        public void mo53821a(C7154g gVar) {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                if (next.f15736b == gVar) {
                    this.f15734c.remove(next);
                }
            }
        }

        /* renamed from: a */
        public void mo53822a(Exception exc) {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b, exc) {
                    public final /* synthetic */ C7154g f$1;
                    public final /* synthetic */ Exception f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19133a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo53823b() {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b) {
                    public final /* synthetic */ C7154g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19136d(this.f$1);
                    }
                });
            }
        }

        /* renamed from: c */
        public void mo53824c() {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b) {
                    public final /* synthetic */ C7154g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19135c(this.f$1);
                    }
                });
            }
        }

        /* renamed from: d */
        public void mo53825d() {
            Iterator<C7156a> it = this.f15734c.iterator();
            while (it.hasNext()) {
                C7156a next = it.next();
                C7728ai.m22215a(next.f15735a, (Runnable) new Runnable(next.f15736b) {
                    public final /* synthetic */ C7154g f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7154g.C7155a.this.m19134b(this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo52461a(int i, C7509p.C7510a aVar);

    /* renamed from: a */
    void mo52462a(int i, C7509p.C7510a aVar, int i2);

    /* renamed from: a */
    void mo52466a(int i, C7509p.C7510a aVar, Exception exc);

    /* renamed from: b */
    void mo52499b(int i, C7509p.C7510a aVar);

    /* renamed from: c */
    void mo52511c(int i, C7509p.C7510a aVar);

    /* renamed from: d */
    void mo52518d(int i, C7509p.C7510a aVar);

    @Deprecated
    /* renamed from: e */
    void mo52523e(int i, C7509p.C7510a aVar);
}
