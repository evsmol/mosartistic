package com.applovin.exoplayer2.p221l;

/* renamed from: com.applovin.exoplayer2.l.g */
public class C7735g {

    /* renamed from: a */
    private final C7732d f18272a;

    /* renamed from: b */
    private boolean f18273b;

    public C7735g() {
        this(C7732d.f18265a);
    }

    public C7735g(C7732d dVar) {
        this.f18272a = dVar;
    }

    /* renamed from: a */
    public synchronized boolean mo54992a() {
        if (this.f18273b) {
            return false;
        }
        this.f18273b = true;
        notifyAll();
        return true;
    }

    /* renamed from: b */
    public synchronized boolean mo54993b() {
        boolean z;
        z = this.f18273b;
        this.f18273b = false;
        return z;
    }

    /* renamed from: c */
    public synchronized void mo54994c() throws InterruptedException {
        while (!this.f18273b) {
            wait();
        }
    }

    /* renamed from: d */
    public synchronized void mo54995d() {
        boolean z = false;
        while (!this.f18273b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public synchronized boolean mo54996e() {
        return this.f18273b;
    }
}
