package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.C4241b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.async.c */
public class C4244c implements C4241b.C4242a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10139a;

    /* renamed from: b */
    private final ThreadPoolExecutor f10140b;

    /* renamed from: c */
    private final ArrayDeque<C4241b> f10141c = new ArrayDeque<>();

    /* renamed from: d */
    private C4241b f10142d = null;

    public C4244c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f10139a = linkedBlockingQueue;
        this.f10140b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m11942a() {
        C4241b poll = this.f10141c.poll();
        this.f10142d = poll;
        if (poll != null) {
            poll.mo32653a(this.f10140b);
        }
    }

    /* renamed from: a */
    public void mo32655a(C4241b bVar) {
        this.f10142d = null;
        m11942a();
    }

    /* renamed from: b */
    public void mo32658b(C4241b bVar) {
        bVar.mo32651a((C4241b.C4242a) this);
        this.f10141c.add(bVar);
        if (this.f10142d == null) {
            m11942a();
        }
    }
}
