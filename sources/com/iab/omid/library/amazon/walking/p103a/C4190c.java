package com.iab.omid.library.amazon.walking.p103a;

import com.iab.omid.library.amazon.walking.p103a.C4187b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.amazon.walking.a.c */
public class C4190c implements C4187b.C4188a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10014a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10015b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10014a);

    /* renamed from: c */
    private final ArrayDeque<C4187b> f10016c = new ArrayDeque<>();

    /* renamed from: d */
    private C4187b f10017d = null;

    /* renamed from: a */
    private void m11689a() {
        C4187b poll = this.f10016c.poll();
        this.f10017d = poll;
        if (poll != null) {
            poll.mo32441a(this.f10015b);
        }
    }

    /* renamed from: a */
    public void mo32443a(C4187b bVar) {
        this.f10017d = null;
        m11689a();
    }

    /* renamed from: b */
    public void mo32446b(C4187b bVar) {
        bVar.mo32439a((C4187b.C4188a) this);
        this.f10016c.add(bVar);
        if (this.f10017d == null) {
            m11689a();
        }
    }
}
