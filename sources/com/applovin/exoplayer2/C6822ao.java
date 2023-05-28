package com.applovin.exoplayer2;

import android.os.Looper;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7732d;
import java.util.concurrent.TimeoutException;

/* renamed from: com.applovin.exoplayer2.ao */
public final class C6822ao {

    /* renamed from: a */
    private final C6824b f14851a;

    /* renamed from: b */
    private final C6823a f14852b;

    /* renamed from: c */
    private final C7732d f14853c;

    /* renamed from: d */
    private final C6904ba f14854d;

    /* renamed from: e */
    private int f14855e;

    /* renamed from: f */
    private Object f14856f;

    /* renamed from: g */
    private Looper f14857g;

    /* renamed from: h */
    private int f14858h;

    /* renamed from: i */
    private long f14859i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f14860j = true;

    /* renamed from: k */
    private boolean f14861k;

    /* renamed from: l */
    private boolean f14862l;

    /* renamed from: m */
    private boolean f14863m;

    /* renamed from: n */
    private boolean f14864n;

    /* renamed from: com.applovin.exoplayer2.ao$a */
    public interface C6823a {
        /* renamed from: a */
        void mo52820a(C6822ao aoVar);
    }

    /* renamed from: com.applovin.exoplayer2.ao$b */
    public interface C6824b {
        /* renamed from: a */
        void mo52821a(int i, Object obj) throws C7819p;
    }

    public C6822ao(C6823a aVar, C6824b bVar, C6904ba baVar, int i, C7732d dVar, Looper looper) {
        this.f14852b = aVar;
        this.f14851a = bVar;
        this.f14854d = baVar;
        this.f14857g = looper;
        this.f14853c = dVar;
        this.f14858h = i;
    }

    /* renamed from: a */
    public C6822ao mo52806a(int i) {
        C7717a.m22121b(!this.f14861k);
        this.f14855e = i;
        return this;
    }

    /* renamed from: a */
    public C6822ao mo52807a(Object obj) {
        C7717a.m22121b(!this.f14861k);
        this.f14856f = obj;
        return this;
    }

    /* renamed from: a */
    public C6904ba mo52808a() {
        return this.f14854d;
    }

    /* renamed from: a */
    public synchronized void mo52809a(boolean z) {
        this.f14862l = z | this.f14862l;
        this.f14863m = true;
        notifyAll();
    }

    /* renamed from: a */
    public synchronized boolean mo52810a(long j) throws InterruptedException, TimeoutException {
        C7717a.m22121b(this.f14861k);
        C7717a.m22121b(this.f14857g.getThread() != Thread.currentThread());
        long a = this.f14853c.mo54963a() + j;
        while (!this.f14863m && j > 0) {
            this.f14853c.mo54966c();
            wait(j);
            j = a - this.f14853c.mo54963a();
        }
        if (!this.f14863m) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f14862l;
    }

    /* renamed from: b */
    public C6824b mo52811b() {
        return this.f14851a;
    }

    /* renamed from: c */
    public int mo52812c() {
        return this.f14855e;
    }

    /* renamed from: d */
    public Object mo52813d() {
        return this.f14856f;
    }

    /* renamed from: e */
    public Looper mo52814e() {
        return this.f14857g;
    }

    /* renamed from: f */
    public long mo52815f() {
        return this.f14859i;
    }

    /* renamed from: g */
    public int mo52816g() {
        return this.f14858h;
    }

    /* renamed from: h */
    public boolean mo52817h() {
        return this.f14860j;
    }

    /* renamed from: i */
    public C6822ao mo52818i() {
        C7717a.m22121b(!this.f14861k);
        if (this.f14859i == -9223372036854775807L) {
            C7717a.m22118a(this.f14860j);
        }
        this.f14861k = true;
        this.f14852b.mo52820a(this);
        return this;
    }

    /* renamed from: j */
    public synchronized boolean mo52819j() {
        return this.f14864n;
    }
}
