package com.iab.omid.library.ironsrc.walking.p115a;

import com.iab.omid.library.ironsrc.walking.p115a.C4344b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.c */
public class C4347c implements C4344b.C4345a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10366a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10367b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10366a);

    /* renamed from: c */
    private final ArrayDeque<C4344b> f10368c = new ArrayDeque<>();

    /* renamed from: d */
    private C4344b f10369d = null;

    /* renamed from: a */
    private void m12387a() {
        C4344b poll = this.f10368c.poll();
        this.f10369d = poll;
        if (poll != null) {
            poll.mo33033a(this.f10367b);
        }
    }

    /* renamed from: a */
    public void mo33035a(C4344b bVar) {
        this.f10369d = null;
        m12387a();
    }

    /* renamed from: b */
    public void mo33038b(C4344b bVar) {
        bVar.mo33031a((C4344b.C4345a) this);
        this.f10368c.add(bVar);
        if (this.f10369d == null) {
            m12387a();
        }
    }
}
