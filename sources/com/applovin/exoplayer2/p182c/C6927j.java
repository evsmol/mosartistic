package com.applovin.exoplayer2.p182c;

import com.applovin.exoplayer2.p182c.C6921f;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p182c.C6925i;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.ArrayDeque;

/* renamed from: com.applovin.exoplayer2.c.j */
public abstract class C6927j<I extends C6922g, O extends C6925i, E extends C6921f> implements C6919d<I, O, E> {

    /* renamed from: a */
    private final Thread f15347a;

    /* renamed from: b */
    private final Object f15348b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f15349c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f15350d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f15351e;

    /* renamed from: f */
    private final O[] f15352f;

    /* renamed from: g */
    private int f15353g;

    /* renamed from: h */
    private int f15354h;

    /* renamed from: i */
    private I f15355i;

    /* renamed from: j */
    private E f15356j;

    /* renamed from: k */
    private boolean f15357k;

    /* renamed from: l */
    private boolean f15358l;

    /* renamed from: m */
    private int f15359m;

    protected C6927j(I[] iArr, O[] oArr) {
        this.f15351e = iArr;
        this.f15353g = iArr.length;
        for (int i = 0; i < this.f15353g; i++) {
            this.f15351e[i] = mo53155g();
        }
        this.f15352f = oArr;
        this.f15354h = oArr.length;
        for (int i2 = 0; i2 < this.f15354h; i2++) {
            this.f15352f[i2] = mo53156h();
        }
        C69281 r4 = new Thread("ExoPlayer:SimpleDecoder") {
            public void run() {
                C6927j.this.m18462k();
            }
        };
        this.f15347a = r4;
        r4.start();
    }

    /* renamed from: b */
    private void m18458b(I i) {
        i.mo53121a();
        I[] iArr = this.f15351e;
        int i2 = this.f15353g;
        this.f15353g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private void m18459b(O o) {
        o.mo53121a();
        O[] oArr = this.f15352f;
        int i = this.f15354h;
        this.f15354h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: i */
    private void mo54711i() throws C6921f {
        E e = this.f15356j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: j */
    private void mo54712j() {
        if (m18464m()) {
            this.f15348b.notify();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m18462k() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m18463l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo53126c() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo53123b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo53124b() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo53123b(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = mo53148a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = mo53149a(r0);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m18463l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f15348b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f15358l     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m18464m()     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f15348b     // Catch:{ all -> 0x0089 }
            r1.wait()     // Catch:{ all -> 0x0089 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f15358l     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f15349c     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0089 }
            com.applovin.exoplayer2.c.g r1 = (com.applovin.exoplayer2.p182c.C6922g) r1     // Catch:{ all -> 0x0089 }
            O[] r3 = r6.f15352f     // Catch:{ all -> 0x0089 }
            int r4 = r6.f15354h     // Catch:{ all -> 0x0089 }
            r5 = 1
            int r4 = r4 - r5
            r6.f15354h = r4     // Catch:{ all -> 0x0089 }
            r3 = r3[r4]     // Catch:{ all -> 0x0089 }
            boolean r4 = r6.f15357k     // Catch:{ all -> 0x0089 }
            r6.f15357k = r2     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.mo53126c()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo53123b(r0)
            goto L_0x005f
        L_0x003c:
            boolean r0 = r1.mo53124b()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo53123b(r0)
        L_0x0047:
            com.applovin.exoplayer2.c.f r0 = r6.mo53148a(r1, r3, r4)     // Catch:{ RuntimeException -> 0x004e, OutOfMemoryError -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            com.applovin.exoplayer2.c.f r0 = r6.mo53149a((java.lang.Throwable) r0)
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r6.f15348b
            monitor-enter(r4)
            r6.f15356j = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            java.lang.Object r4 = r6.f15348b
            monitor-enter(r4)
            boolean r0 = r6.f15357k     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x006a
        L_0x0066:
            r3.mo53146f()     // Catch:{ all -> 0x0086 }
            goto L_0x0081
        L_0x006a:
            boolean r0 = r3.mo53124b()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0076
            int r0 = r6.f15359m     // Catch:{ all -> 0x0086 }
            int r0 = r0 + r5
            r6.f15359m = r0     // Catch:{ all -> 0x0086 }
            goto L_0x0066
        L_0x0076:
            int r0 = r6.f15359m     // Catch:{ all -> 0x0086 }
            r3.f15346b = r0     // Catch:{ all -> 0x0086 }
            r6.f15359m = r2     // Catch:{ all -> 0x0086 }
            java.util.ArrayDeque<O> r0 = r6.f15350d     // Catch:{ all -> 0x0086 }
            r0.addLast(r3)     // Catch:{ all -> 0x0086 }
        L_0x0081:
            r6.m18458b(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            return r5
        L_0x0086:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p182c.C6927j.m18463l():boolean");
    }

    /* renamed from: m */
    private boolean m18464m() {
        return !this.f15349c.isEmpty() && this.f15354h > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo53148a(I i, O o, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo53149a(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53150a(int i) {
        C7717a.m22121b(this.f15353g == this.f15351e.length);
        for (I f : this.f15351e) {
            f.mo53141f(i);
        }
    }

    /* renamed from: a */
    public final void mo53134a(I i) throws C6921f {
        synchronized (this.f15348b) {
            mo54711i();
            C7717a.m22118a(i == this.f15355i);
            this.f15349c.addLast(i);
            mo54712j();
            this.f15355i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53152a(O o) {
        synchronized (this.f15348b) {
            m18459b(o);
            mo54712j();
        }
    }

    /* renamed from: c */
    public final void mo53136c() {
        synchronized (this.f15348b) {
            this.f15357k = true;
            this.f15359m = 0;
            if (this.f15355i != null) {
                m18458b(this.f15355i);
                this.f15355i = null;
            }
            while (!this.f15349c.isEmpty()) {
                m18458b((C6922g) this.f15349c.removeFirst());
            }
            while (!this.f15350d.isEmpty()) {
                ((C6925i) this.f15350d.removeFirst()).mo53146f();
            }
        }
    }

    /* renamed from: d */
    public void mo53137d() {
        synchronized (this.f15348b) {
            this.f15358l = true;
            this.f15348b.notify();
        }
        try {
            this.f15347a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public final I mo53133a() throws C6921f {
        I i;
        synchronized (this.f15348b) {
            mo54711i();
            C7717a.m22121b(this.f15355i == null);
            if (this.f15353g == 0) {
                i = null;
            } else {
                I[] iArr = this.f15351e;
                int i2 = this.f15353g - 1;
                this.f15353g = i2;
                i = iArr[i2];
            }
            this.f15355i = i;
        }
        return i;
    }

    /* renamed from: f */
    public final O mo53135b() throws C6921f {
        synchronized (this.f15348b) {
            mo54711i();
            if (this.f15350d.isEmpty()) {
                return null;
            }
            O o = (C6925i) this.f15350d.removeFirst();
            return o;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract I mo53155g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract O mo53156h();
}
