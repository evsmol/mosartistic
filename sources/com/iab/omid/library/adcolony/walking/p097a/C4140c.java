package com.iab.omid.library.adcolony.walking.p097a;

import com.iab.omid.library.adcolony.walking.p097a.C4137b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.adcolony.walking.a.c */
public class C4140c implements C4137b.C4138a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f9897a;

    /* renamed from: b */
    private final ThreadPoolExecutor f9898b;

    /* renamed from: c */
    private final ArrayDeque<C4137b> f9899c = new ArrayDeque<>();

    /* renamed from: d */
    private C4137b f9900d = null;

    public C4140c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f9897a = linkedBlockingQueue;
        this.f9898b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m11459a() {
        C4137b poll = this.f9899c.poll();
        this.f9900d = poll;
        if (poll != null) {
            poll.mo32242a(this.f9898b);
        }
    }

    /* renamed from: a */
    public void mo32244a(C4137b bVar) {
        this.f9900d = null;
        m11459a();
    }

    /* renamed from: b */
    public void mo32247b(C4137b bVar) {
        bVar.mo32240a((C4137b.C4138a) this);
        this.f9899c.add(bVar);
        if (this.f9900d == null) {
            m11459a();
        }
    }
}
