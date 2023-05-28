package com.iab.omid.library.appodeal.walking.p109a;

import com.iab.omid.library.appodeal.walking.p109a.C4294b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.appodeal.walking.a.c */
public class C4297c implements C4294b.C4295a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f10252a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f10253b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f10252a);

    /* renamed from: c */
    private final ArrayDeque<C4294b> f10254c = new ArrayDeque<>();

    /* renamed from: d */
    private C4294b f10255d = null;

    /* renamed from: a */
    private void m12166a() {
        C4294b poll = this.f10254c.poll();
        this.f10255d = poll;
        if (poll != null) {
            poll.mo32847a(this.f10253b);
        }
    }

    /* renamed from: a */
    public void mo32849a(C4294b bVar) {
        this.f10255d = null;
        m12166a();
    }

    /* renamed from: b */
    public void mo32852b(C4294b bVar) {
        bVar.mo32845a((C4294b.C4295a) this);
        this.f10254c.add(bVar);
        if (this.f10255d == null) {
            m12166a();
        }
    }
}
