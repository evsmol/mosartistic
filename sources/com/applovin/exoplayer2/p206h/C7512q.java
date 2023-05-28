package com.applovin.exoplayer2.p206h;

import android.os.Handler;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7512q;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.exoplayer2.h.q */
public interface C7512q {

    /* renamed from: com.applovin.exoplayer2.h.q$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C7512q qVar, int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        }

        public static void $default$a(C7512q qVar, int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
        }

        public static void $default$a(C7512q qVar, int i, C7509p.C7510a aVar, C7505m mVar) {
        }

        public static void $default$b(C7512q qVar, int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        }

        public static void $default$c(C7512q qVar, int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.q$a */
    public static class C7513a {

        /* renamed from: a */
        public final int f17256a;

        /* renamed from: b */
        public final C7509p.C7510a f17257b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C7514a> f17258c;

        /* renamed from: d */
        private final long f17259d;

        /* renamed from: com.applovin.exoplayer2.h.q$a$a */
        private static final class C7514a {

            /* renamed from: a */
            public Handler f17260a;

            /* renamed from: b */
            public C7512q f17261b;

            public C7514a(Handler handler, C7512q qVar) {
                this.f17260a = handler;
                this.f17261b = qVar;
            }
        }

        public C7513a() {
            this(new CopyOnWriteArrayList(), 0, (C7509p.C7510a) null, 0);
        }

        private C7513a(CopyOnWriteArrayList<C7514a> copyOnWriteArrayList, int i, C7509p.C7510a aVar, long j) {
            this.f17258c = copyOnWriteArrayList;
            this.f17256a = i;
            this.f17257b = aVar;
            this.f17259d = j;
        }

        /* renamed from: a */
        private long m21034a(long j) {
            long a = C7476h.m20797a(j);
            if (a == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f17259d + a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m21035a(C7512q qVar, C7499j jVar, C7505m mVar) {
            qVar.mo52512c(this.f17256a, this.f17257b, jVar, mVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m21036a(C7512q qVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
            qVar.mo52464a(this.f17256a, this.f17257b, jVar, mVar, iOException, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m21037a(C7512q qVar, C7505m mVar) {
            qVar.mo52465a(this.f17256a, this.f17257b, mVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m21038b(C7512q qVar, C7499j jVar, C7505m mVar) {
            qVar.mo52500b(this.f17256a, this.f17257b, jVar, mVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m21039c(C7512q qVar, C7499j jVar, C7505m mVar) {
            qVar.mo52463a(this.f17256a, this.f17257b, jVar, mVar);
        }

        /* renamed from: a */
        public C7513a mo54550a(int i, C7509p.C7510a aVar, long j) {
            return new C7513a(this.f17258c, i, aVar, j);
        }

        /* renamed from: a */
        public void mo54551a(int i, C7864v vVar, int i2, Object obj, long j) {
            mo54557a(new C7505m(1, i, vVar, i2, obj, m21034a(j), -9223372036854775807L));
        }

        /* renamed from: a */
        public void mo54552a(Handler handler, C7512q qVar) {
            C7717a.m22120b(handler);
            C7717a.m22120b(qVar);
            this.f17258c.add(new C7514a(handler, qVar));
        }

        /* renamed from: a */
        public void mo54553a(C7499j jVar, int i, int i2, C7864v vVar, int i3, Object obj, long j, long j2) {
            C7499j jVar2 = jVar;
            mo54555a(jVar, new C7505m(i, i2, vVar, i3, obj, m21034a(j), m21034a(j2)));
        }

        /* renamed from: a */
        public void mo54554a(C7499j jVar, int i, int i2, C7864v vVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            C7499j jVar2 = jVar;
            mo54556a(jVar, new C7505m(i, i2, vVar, i3, obj, m21034a(j), m21034a(j2)), iOException, z);
        }

        /* renamed from: a */
        public void mo54555a(C7499j jVar, C7505m mVar) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                C7728ai.m22215a(next.f17260a, (Runnable) new Runnable(next.f17261b, jVar, mVar) {
                    public final /* synthetic */ C7512q f$1;
                    public final /* synthetic */ C7499j f$2;
                    public final /* synthetic */ C7505m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C7512q.C7513a.this.m21039c(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo54556a(C7499j jVar, C7505m mVar, IOException iOException, boolean z) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                C7728ai.m22215a(next.f17260a, (Runnable) new Runnable(next.f17261b, jVar, mVar, iOException, z) {
                    public final /* synthetic */ C7512q f$1;
                    public final /* synthetic */ C7499j f$2;
                    public final /* synthetic */ C7505m f$3;
                    public final /* synthetic */ IOException f$4;
                    public final /* synthetic */ boolean f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    public final void run() {
                        C7512q.C7513a.this.m21036a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo54557a(C7505m mVar) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                C7728ai.m22215a(next.f17260a, (Runnable) new Runnable(next.f17261b, mVar) {
                    public final /* synthetic */ C7512q f$1;
                    public final /* synthetic */ C7505m f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7512q.C7513a.this.m21037a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo54558a(C7512q qVar) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                if (next.f17261b == qVar) {
                    this.f17258c.remove(next);
                }
            }
        }

        /* renamed from: b */
        public void mo54559b(C7499j jVar, int i, int i2, C7864v vVar, int i3, Object obj, long j, long j2) {
            C7499j jVar2 = jVar;
            mo54560b(jVar, new C7505m(i, i2, vVar, i3, obj, m21034a(j), m21034a(j2)));
        }

        /* renamed from: b */
        public void mo54560b(C7499j jVar, C7505m mVar) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                C7728ai.m22215a(next.f17260a, (Runnable) new Runnable(next.f17261b, jVar, mVar) {
                    public final /* synthetic */ C7512q f$1;
                    public final /* synthetic */ C7499j f$2;
                    public final /* synthetic */ C7505m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C7512q.C7513a.this.m21038b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: c */
        public void mo54561c(C7499j jVar, int i, int i2, C7864v vVar, int i3, Object obj, long j, long j2) {
            C7499j jVar2 = jVar;
            mo54562c(jVar, new C7505m(i, i2, vVar, i3, obj, m21034a(j), m21034a(j2)));
        }

        /* renamed from: c */
        public void mo54562c(C7499j jVar, C7505m mVar) {
            Iterator<C7514a> it = this.f17258c.iterator();
            while (it.hasNext()) {
                C7514a next = it.next();
                C7728ai.m22215a(next.f17260a, (Runnable) new Runnable(next.f17261b, jVar, mVar) {
                    public final /* synthetic */ C7512q f$1;
                    public final /* synthetic */ C7499j f$2;
                    public final /* synthetic */ C7505m f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C7512q.C7513a.this.m21035a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo52463a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar);

    /* renamed from: a */
    void mo52464a(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar, IOException iOException, boolean z);

    /* renamed from: a */
    void mo52465a(int i, C7509p.C7510a aVar, C7505m mVar);

    /* renamed from: b */
    void mo52500b(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar);

    /* renamed from: c */
    void mo52512c(int i, C7509p.C7510a aVar, C7499j jVar, C7505m mVar);
}
